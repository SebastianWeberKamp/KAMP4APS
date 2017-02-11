package edu.kit.ipd.sdq.kamp4aps.core.derivation;

import java.util.ArrayList;
import java.util.List;

import org.palladiosimulator.pcm.core.entity.InterfaceRequiringEntity;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.RequiredRole;

import edu.kit.ipd.sdq.amp.workplan.AbstractEnrichedWorkplanDerivation;
import edu.kit.ipd.sdq.amp.workplan.Activity;
import edu.kit.ipd.sdq.amp.workplan.BasicActivity;
import edu.kit.ipd.sdq.kamp4aps.core.ActivityElementType;
import edu.kit.ipd.sdq.kamp4aps.core.ActivityType;
import edu.kit.ipd.sdq.kamp4aps.core.ArchitectureAnnotationLookup;
import edu.kit.ipd.sdq.kamp4aps.core.ArchitectureVersion;

public abstract class AbstractKAPSEnrichedWorkplanDerivation<T extends ArchitectureVersion> 
		implements AbstractEnrichedWorkplanDerivation<T> {
	
	@Override
	public List<Activity> deriveEnrichedWorkplan(T baseArchitectureVersion, T subVersion, 
			List<Activity> baseActivityList) {
		List<Activity> result = new ArrayList<Activity>(baseActivityList);
		
		deriveCodingActivities(baseArchitectureVersion, subVersion, result);
		deriveMetadataActivities(baseArchitectureVersion, subVersion, result);
		deriveBuildConfigurationActivities(baseArchitectureVersion, subVersion, result);
		deriveBuildExecutionActivities(subVersion, result);		
		deriveTestDevelopmentActivities(baseArchitectureVersion, subVersion, result);
		deriveTestExecutionActivities(subVersion, result);
		deriveReleaseExecutionActivities(subVersion, result);		
		deriveDeploymentExecutionActivities(subVersion, result);		

		return result;
	}

	public static List<Activity> calculateFlattenendActivityList(List<Activity> activityList) {
		List<Activity> flatActivityList = new ArrayList<Activity>();
		
		for (Activity activity : activityList) {
			flatActivityList.add(activity);
			if (!activity.getSubActivities().isEmpty()) {
				flatActivityList.addAll(calculateFlattenendActivityList(activity.getSubActivities()));
			}
			if (!activity.getFollowupActivities().isEmpty()) {
				flatActivityList.addAll(calculateFlattenendActivityList(activity.getFollowupActivities()));
			}
		}
		
		return flatActivityList;
	}
	
	private static <T extends ArchitectureVersion> T determineRelevantArchitectureVersion(
			Activity activity, T baseVersion, T targetVersion) {
		if (activity.getBasicActivity() == BasicActivity.REMOVE) {
			return baseVersion;
		} else {
			return targetVersion;
		}
	}

	private static void deriveCodingActivities(ArchitectureVersion baseVersion, 
			ArchitectureVersion targetVersion, List<Activity> baseActivityList) {
		for (Activity activity : baseActivityList) {
			int numberOfFiles = determineNumberOfSourceFiles(determineRelevantArchitectureVersion(
					activity, baseVersion, targetVersion), activity);
			if (activity.getElementType() == ActivityElementType.COMPONENT && numberOfFiles > 0) {
				activity.addFollowupActivity(new Activity(ActivityType.IMPLEMENTATION_SOURCECODE, 
						ActivityElementType.SOURCECODEFILES, activity.getElement(),
						numberOfFiles + " source file(s)", null, activity.getBasicActivity(),
						"Source code implementation: " + activity.getBasicActivity().getName() + 
						" source file(s) (" + numberOfFiles + " files) of component " + 
						activity.getElementName() + "."));
			} 
			deriveCodingActivities(baseVersion, targetVersion, activity.getSubActivities());
		}
	}

	private static int determineNumberOfSourceFiles(ArchitectureVersion version, 
			Activity activity) {
		int numberOfSourceFiles = 0;
		if (activity.getElement() instanceof RepositoryComponent) {
			RepositoryComponent component = (RepositoryComponent)activity.getElement();
			List<SourceFile> sourceFiles = ArchitectureAnnotationLookup.
					lookUpSourceFilesForComponent(version, component);
			numberOfSourceFiles += sourceFiles.size();
			SourceFileAggregation sourceFileAggregation = ArchitectureAnnotationLookup.
					lookUpSourceFileAggregationForComponent(version, component);
			if (sourceFileAggregation != null)
				numberOfSourceFiles += sourceFileAggregation.getNumberOfFiles(); 
		}
		return numberOfSourceFiles;
	}

	private static void deriveMetadataActivities(ArchitectureVersion baseVersion, 
			ArchitectureVersion targetVersion, List<Activity> baseActivityList) {
		for (Activity activity : baseActivityList) {
			int numberOfFiles = determineNumberOfMetadataFiles(determineRelevantArchitectureVersion(
					activity, baseVersion, targetVersion), activity);
			if (activity.getElementType() == ActivityElementType.COMPONENT && numberOfFiles > 0) {
				activity.addFollowupActivity(new Activity(ActivityType.IMPLEMENTATION_METADATA, 
						ActivityElementType.METADATAFILES, activity.getElement(),
						numberOfFiles + " meta data file(s)", null, activity.getBasicActivity(), 
						"Meta data implementation: " + activity.getBasicActivity().getName() + 
						" meta data file(s) (" + numberOfFiles + " files) of component " + 
						activity.getElementName() + "."));
			} 
			deriveMetadataActivities(baseVersion, targetVersion, activity.getSubActivities());
		}
	}

	private static int determineNumberOfMetadataFiles(ArchitectureVersion version, 
			Activity activity) {
		int numberOfMetadataFiles = 0;
		if (activity.getElement() instanceof RepositoryComponent) {
			RepositoryComponent component = (RepositoryComponent)activity.getElement();
			List<MetadataFile> metadataFiles = ArchitectureAnnotationLookup.
					lookUpMetadataFilesForComponent(version, component);
			numberOfMetadataFiles += metadataFiles.size();
			MetadataFileAggregation metadataFileAggregation = ArchitectureAnnotationLookup.
					lookUpMetadataFileAggregationForComponent(version, component);
			if (metadataFileAggregation!=null)
				numberOfMetadataFiles += metadataFileAggregation.getNumberOfFiles(); 
		}
		return numberOfMetadataFiles;
	}
	
	private static void deriveBuildConfigurationActivities(ArchitectureVersion baseVersion, 
			ArchitectureVersion targetVersion, List<Activity> activityList) {
		// TODO: update build annotations
		for (Activity activity : activityList) {
			deriveBuildConfigurationActivitiesForComponent(activity, determineRelevantArchitectureVersion(
					activity, baseVersion, targetVersion), activityList);
			deriveBuildConfigurationActivitiesForRequiredRole(activity, determineRelevantArchitectureVersion(
					activity, baseVersion, targetVersion), activityList);
			deriveBuildConfigurationActivities(baseVersion, targetVersion, activity.getSubActivities());
		}	
	}
	
	private static void deriveBuildConfigurationActivitiesForComponent(
			Activity activity, ArchitectureVersion version, List<Activity> activityList) {
		if (activity.getElementType() == ActivityElementType.COMPONENT && 
				componentIsNotThirdPartyOrLibrary(version, (RepositoryComponent)activity.getElement()) 
				&& (activity.getBasicActivity() == BasicActivity.ADD || 
				activity.getBasicActivity() == BasicActivity.REMOVE)) {
			BuildConfiguration buildConfiguration = ArchitectureAnnotationLookup.
					lookUpBuildConfigurationForComponent(version, (RepositoryComponent)activity.getElement());
			String description = "";
			if (activity.getBasicActivity()==BasicActivity.ADD) {			
				description = "Register component " + activity.getElementName() + 
						" in build configuration.";
			} else if (activity.getBasicActivity()==BasicActivity.REMOVE) {
				description = "Remove component" + activity.getElementName() + 
						" from build configuration.";
			}
			activity.addFollowupActivity(new Activity(ActivityType.BUILDCONFIGURATION, 
					ActivityElementType.BUILDCONFIGURATION, activity.getElement(),
					(buildConfiguration != null) ? buildConfiguration.getFilename() : "",
					null, BasicActivity.MODIFY, "Build configuration: " + description));
		}
	}
	
	private static boolean componentIsNotThirdPartyOrLibrary(ArchitectureVersion version, 
			RepositoryComponent component) {
		return ArchitectureAnnotationLookup.lookUpThirdPartyOrLibraryAnnotationForComponent(
				version, component) == null;
	}
	
	private static void deriveBuildConfigurationActivitiesForRequiredRole(
			Activity activity, ArchitectureVersion version, List<Activity> activityList) {
		if (activity.getElementType() == ActivityElementType.REQUIREDROLE && 
				(activity.getBasicActivity() == BasicActivity.ADD || 
				activity.getBasicActivity() == BasicActivity.REMOVE)) {
			RepositoryComponent component = null;
			component = getComponentOfRequiredRole(activity);
			if (component != null && componentIsNotThirdPartyOrLibrary(version, component)) {
				BuildConfiguration buildConfiguration = ArchitectureAnnotationLookup.
						lookUpBuildConfigurationForComponent(version, component);
				String description = "";
				if (activity.getBasicActivity()==BasicActivity.ADD) {			
					description = "Added dependency for RequiredRole " + activity.getElementName() + 
					" added to build configuration.";
				} else if (activity.getBasicActivity()==BasicActivity.REMOVE) {
					description = "Removed dependency for RequiredRole " + activity.getElementName() + 
					" removed from build configuration.";
				}
				activity.addFollowupActivity(new Activity(ActivityType.BUILDCONFIGURATION, 
						ActivityElementType.BUILDCONFIGURATION, activity.getElement(),
						(buildConfiguration != null) ? buildConfiguration.getFilename() : "",
						null, BasicActivity.MODIFY, "Build configuration: " + description));
				
			}
		}
	}
	
	private static RepositoryComponent getComponentOfRequiredRole(Activity activity) {
		RepositoryComponent component = null;
		if (activity.getElement() != null) {
			InterfaceRequiringEntity entity = ((RequiredRole)(activity.getElement())).
					getRequiringEntity_RequiredRole();
			if (entity instanceof RepositoryComponent) {
				component = (RepositoryComponent) entity;
			}
		}
		return component;
	}

	private static void deriveBuildExecutionActivities(ArchitectureVersion target, 
			List<Activity> activityList) {	
		for (Activity activity : activityList) {
			if (activity.getElementType() == ActivityElementType.COMPONENT && 
					((activity.getBasicActivity()==BasicActivity.ADD) || 
					(activity.getBasicActivity()==BasicActivity.MODIFY))) {
				if (componentIsNotThirdPartyOrLibrary(target, (RepositoryComponent)activity.getElement())) {
					// Source code and meta data not relevant
					// TODO: build configuration defines the unit
					// TODO: for each build configuration only one execution
					BuildConfiguration buildConfig = ArchitectureAnnotationLookup.
							lookUpBuildConfigurationForComponent(target, 
									(RepositoryComponent)activity.getElement());
					activity.addFollowupActivity(new Activity(ActivityType.BUILDEXECUTION, 
							ActivityElementType.BUILDCONFIGURATION, activity.getElement(),
							(buildConfig != null) ? buildConfig.getFilename() : "" , 
							null, BasicActivity.EXECUTE, 
							"Build execution: Build component " + activity.getElementName()));
				}
			}
			deriveBuildExecutionActivities(target, activity.getSubActivities());
		}
	}
	
	private static void deriveTestDevelopmentActivities(ArchitectureVersion baseVersion, 
			ArchitectureVersion targetVersion, List<Activity> baseActivityList) {	
		for (Activity activity : baseActivityList) {
			if (activity.getElementType() == ActivityElementType.PROVIDEDROLE && 
					activity.getBasicActivity() == BasicActivity.ADD) {
				activity.addFollowupActivity(new Activity(ActivityType.TESTDEVELOPMENT, 
						ActivityElementType.TESTCASE, activity.getElement(),
						"", null, BasicActivity.ADD, 
						"Test development: Develop unit tests for ProvidedRole."));
			} else if (activity.getElementType() == ActivityElementType.PROVIDEDROLE && 
					activity.getBasicActivity() == BasicActivity.REMOVE) {
				int numberOfUnitTests = numberOfAvailableUnitTests(baseVersion, activity);
				if (numberOfUnitTests > 0) {
					activity.addFollowupActivity(new Activity(ActivityType.TESTDEVELOPMENT, 
							ActivityElementType.TESTCASE, activity.getElement(),
							numberOfUnitTests + " test(s)", null, BasicActivity.REMOVE, 
							"Test development: Remove unit tests for ProvidedRole."));
				}
			} else if (activity.getElementType() == ActivityElementType.PROVIDEDROLE && 
					activity.getBasicActivity() == BasicActivity.MODIFY) {
				int numberOfUnitTests = numberOfAvailableUnitTests(targetVersion, activity);
				if (numberOfUnitTests > 0) {
					activity.addFollowupActivity(new Activity(ActivityType.TESTUPDATE, 
							ActivityElementType.TESTCASE, activity.getElement(),
							numberOfUnitTests + " test(s)", null, BasicActivity.CHECKANDUPDATE, 
							"Test development: Check and update unit tests for ProvidedRole."));
				}
			}
			deriveTestDevelopmentActivities(baseVersion, targetVersion, activity.getSubActivities());
		}
	}

	private static int numberOfAvailableUnitTests(ArchitectureVersion version,
			Activity activity) {
		int numberOfTests = 0;
		if (activity.getElement() instanceof ProvidedRole) {
			UnitTestCaseAggregation testAggregation = ArchitectureAnnotationLookup.
					lookUpUnitTestAggregationForProvidedRole(version, (ProvidedRole)activity.getElement());
			List<UnitTestCase> testCases = ArchitectureAnnotationLookup.
					lookUpUnitTestCasesForProvidedRole(version, (ProvidedRole)activity.getElement());
			if (testAggregation!=null)
				numberOfTests += testAggregation.getNumberOfTestcases();
			numberOfTests += testCases.size();
		}
		return numberOfTests;
	}
	
	private static void deriveTestExecutionActivities(ArchitectureVersion target,
			List<Activity> baseActivityList) {
		
		for (Activity activity : baseActivityList) {
			if (activity.getElementType() == ActivityElementType.PROVIDEDROLE && 
					activity.getBasicActivity()==BasicActivity.ADD) {
				activity.addFollowupActivity(new Activity(ActivityType.TESTEXECUTION, 
						ActivityElementType.TESTCASE, activity.getElement(),
						"New test cases", null, BasicActivity.EXECUTE, 
						"Test execution (unit tests): Execute test cases."));
			} else if (activity.getElementType() == ActivityElementType.PROVIDEDROLE && 
					activity.getBasicActivity()==BasicActivity.MODIFY) {
				int numberOfUnitTests = numberOfAvailableUnitTests(target, activity);
				if (numberOfUnitTests>0) {
					activity.addFollowupActivity(new Activity(ActivityType.TESTEXECUTION, 
							ActivityElementType.TESTCASE, activity.getElement(),
							numberOfUnitTests + " test(s)", null, BasicActivity.EXECUTE,
							"Test execution (unit tests): Execute test cases."));
				}
			}
			deriveTestExecutionActivities(target, activity.getSubActivities());
		}
	}

//	private static void deriveReleaseConfigurationActivities(
//			List<Activity> baseActivityList) {
//		
//		for (Activity activity : baseActivityList) {
//			if (activity.getElementType() == ActivityElementType.BUILDCONFIGURATION && 
//					activity.getBasicActivity()==BasicActivity.MODIFY) {
//				Activity newActivity = new Activity(ActivityType.RELEASECONFIGURATION, 
//						ActivityElementType.RELEASECONFIGURATION, "release configuration", 
//						BasicActivity.MODIFY, "Release configuration: Modify release configuration.");
//				activity.addFollowupactivity(newActivity);
//			} 
//		}
//	}

	private static void deriveReleaseExecutionActivities(ArchitectureVersion target,
			List<Activity> baseActivityList) {
		for (Activity activity : baseActivityList) {
			if (activity.getElementType() == ActivityElementType.BUILDCONFIGURATION && 
					activity.getBasicActivity() == BasicActivity.EXECUTE) {
				activity.addFollowupActivity(new Activity(ActivityType.RELEASEEXECUTION, 
						ActivityElementType.RELEASECONFIGURATION, activity.getElement(),
						"release exection", null, BasicActivity.EXECUTE, 
						"Release execution: Perform release."));
			} 
			deriveReleaseExecutionActivities(target, activity.getFollowupActivities());
		}
	}
	
//	private static void deriveDeploymentConfigurationActivities(
//			List<Activity> baseActivityList) {
//		for (Activity activity : baseActivityList) {
//			if (activity.getType()==ActivityType.RELEASEEXECUTION && 
//					activity.getBasicActivity()==BasicActivity.EXECUTE) {
//				Activity newActivity = new Activity(ActivityType.DEPLOYMENTCONFIGURATION, 
//						ActivityElementType.DEPLOYMENTCONFIGURATION, 
//						"deployment configuration", BasicActivity.MODIFY, 
//						"Deployment configuration: Modify deployment configuration.");
//				activity.addFollowupactivity(newActivity);
//			} 
//		}
//	}

	private static void deriveDeploymentExecutionActivities(
			ArchitectureVersion target, List<Activity> baseActivityList) {
		//TODO consider runtime instances
		for (Activity activity : baseActivityList) {
			if (activity.getType() == ActivityType.RELEASEEXECUTION && 
					activity.getBasicActivity() == BasicActivity.EXECUTE) {
				activity.addFollowupActivity(new Activity(ActivityType.DEPLOYMENTEXECUTION, 
						ActivityElementType.DEPLOYMENTCONFIGURATION, activity.getElement(),
						"one run-time instance", null, BasicActivity.EXECUTE, 
						"Deployment execution: Perform deployment."));
			} 
			deriveDeploymentExecutionActivities(target, activity.getFollowupActivities());
		}
	}
}
