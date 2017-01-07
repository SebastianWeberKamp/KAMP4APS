package edu.kit.ipd.sdq.kamp4aps.core;

import java.util.ArrayList;
import java.util.List;

import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.RepositoryComponent;

import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.AcceptanceTestCase;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.AcceptanceTestCaseAggregation;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.BuildConfiguration;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.IntegrationTestCase;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.IntegrationTestCaseAggregation;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.MetadataFile;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.MetadataFileAggregation;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ReleaseConfiguration;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.RuntimeInstance;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.RuntimeInstanceAggregation;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.SourceFile;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.SourceFileAggregation;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ThirdPartyComponentOrLibrary;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.UnitTestCase;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.UnitTestCaseAggregation;

public class ArchitectureAnnotationLookup {

	public static List<SourceFile> lookUpSourceFilesForComponent(ArchitectureVersion version, 
			RepositoryComponent component) {
		List<SourceFile> sourceFiles = new ArrayList<SourceFile>();
		
		if (version.getFieldOfActivityRepository().getDevelopmentArtefactSpecification() != null) {
			for (SourceFile sourceFile : version.getFieldOfActivityRepository().
					getDevelopmentArtefactSpecification().getSourceFiles()) {
				if (sourceFile.getComponent()==component) {
					sourceFiles.add(sourceFile);
				}
			}
		}
		
		return sourceFiles;
	}

	public static SourceFileAggregation lookUpSourceFileAggregationForComponent(ArchitectureVersion version, 
			RepositoryComponent component) {
		if (version.getFieldOfActivityRepository().getDevelopmentArtefactSpecification() != null) {
			for (SourceFileAggregation sourceFileAggregation : version.getFieldOfActivityRepository().
					getDevelopmentArtefactSpecification().getSourceFileAggregations()) {
				if (sourceFileAggregation.getComponent()==component) {
					return sourceFileAggregation;
				}
			}
		}
		
		return null;
	}
	
	public static List<MetadataFile> lookUpMetadataFilesForComponent(ArchitectureVersion version, 
			RepositoryComponent component) {
		List<MetadataFile> metadataFiles = new ArrayList<MetadataFile>();
		
		if (version.getFieldOfActivityRepository().getDevelopmentArtefactSpecification() != null) {
			for (MetadataFile metadataFile : version.getFieldOfActivityRepository().
					getDevelopmentArtefactSpecification().getMetadataFiles()) {
				if (metadataFile.getComponent()==component) {
					metadataFiles.add(metadataFile);
				}
			}
		}
		
		return metadataFiles;
	}

	public static MetadataFileAggregation lookUpMetadataFileAggregationForComponent(ArchitectureVersion version, 
			RepositoryComponent component) {
		if (version.getFieldOfActivityRepository().getDevelopmentArtefactSpecification() != null) {
			for (MetadataFileAggregation metadataFileAggregation : version.getFieldOfActivityRepository().
					getDevelopmentArtefactSpecification().getMetadataFileAggregations()) {
				if (metadataFileAggregation.getComponent()==component) {
					return metadataFileAggregation;
				}
			}
		}
		
		return null;
	}

	public static UnitTestCaseAggregation lookUpUnitTestAggregationForProvidedRole(
			ArchitectureVersion version, ProvidedRole providedRole) {
		if (version.getFieldOfActivityRepository().getTestSpecification() != null) {
			for (UnitTestCaseAggregation testAggregation : version.getFieldOfActivityRepository().
					getTestSpecification().getUnitTestCaseAggregations()) {
				if (testAggregation.getProvidedrole()==providedRole) {
					return testAggregation;
				}
			}
		}
		
		return null;
	}

	public static List<UnitTestCase> lookUpUnitTestCasesForProvidedRole(
			ArchitectureVersion version,ProvidedRole providedRole) {
		List<UnitTestCase> testCases = new ArrayList<UnitTestCase>();
		
		if (version.getFieldOfActivityRepository().getTestSpecification() != null) {
			for (UnitTestCase testcase : version.getFieldOfActivityRepository().
					getTestSpecification().getUnitTestCases()) {
				if (testcase.getProvidedrole()==providedRole) {
					testCases.add(testcase);
				}
			}
		}
		
		return testCases;
	}

	public static IntegrationTestCaseAggregation lookUpIntegrationTestAggregationForAssemblyConnector(
			ArchitectureVersion version, AssemblyConnector assemblyConnector) {
		if (version.getFieldOfActivityRepository().getTestSpecification() != null) {
			for (IntegrationTestCaseAggregation testAggregation : version.getFieldOfActivityRepository().
					getTestSpecification().getIntegrationTestCaseAggregations()) {
				if (testAggregation.getAssemblyConnector()==assemblyConnector) {
					return testAggregation;
				}
			}
		}
		
		return null;
	}

	public static List<IntegrationTestCase> lookUpIntegrationTestCasesForAssemblyConnector(
			ArchitectureVersion version, AssemblyConnector assemblyConnector) {
		List<IntegrationTestCase> testCases = new ArrayList<IntegrationTestCase>();
		
		if (version.getFieldOfActivityRepository().getTestSpecification() != null) {
			for (IntegrationTestCase testcase : version.getFieldOfActivityRepository().
					getTestSpecification().getIntegrationTestCases()) {
				if (testcase.getAssemblyConnector()==assemblyConnector) {
					testCases.add(testcase);
				}
			}
		}
		
		return testCases;
	}

	public static AcceptanceTestCaseAggregation lookUpAcceptanceTestAggregationForProvidedRole(
			ArchitectureVersion version, ProvidedRole providedRole) {
		if (version.getFieldOfActivityRepository().getTestSpecification() != null) {
			for (AcceptanceTestCaseAggregation testAggregation : version.getFieldOfActivityRepository().
					getTestSpecification().getAcceptanceTestCaseAggregations()) {
				if (testAggregation.getProvidedrole()==providedRole) {
					return testAggregation;
				}
			}
		}
		
		return null;
	}

	public static List<AcceptanceTestCase> lookUpAcceptanceTestCasesForProvidedRole(
			ArchitectureVersion version, ProvidedRole providedRole) {
		List<AcceptanceTestCase> testCases = new ArrayList<AcceptanceTestCase>();
		
		if (version.getFieldOfActivityRepository().getTestSpecification() != null) {
			for (AcceptanceTestCase testcase : version.getFieldOfActivityRepository().
					getTestSpecification().getAcceptanceTestCases()) {
				if (testcase.getProvidedrole()==providedRole) {
					testCases.add(testcase);
				}
			}
		}
		return testCases;
	}

	public static ThirdPartyComponentOrLibrary lookUpThirdPartyOrLibraryAnnotationForComponent(
			ArchitectureVersion version, RepositoryComponent component) {
		if (version.getFieldOfActivityRepository().getBuildSpecification() != null) {
			for (ThirdPartyComponentOrLibrary annotation : version.getFieldOfActivityRepository().
					getBuildSpecification().getThirdPartyComponentOrLibraries()) {
				if (annotation.getComponent() == component) {
					return annotation;
				}
			}
		}
		
		return null;
	}

	public static BuildConfiguration lookUpBuildConfigurationForComponent(
			ArchitectureVersion version, RepositoryComponent component) {
		if (version.getFieldOfActivityRepository().getBuildSpecification() != null) {
			for (BuildConfiguration annotation : version.getFieldOfActivityRepository().
					getBuildSpecification().getBuildConfigurations()) {
				if (annotation.getComponent().contains(component)) {
					return annotation;
				}
			}
		}
		
		return null;
	}

	public static ReleaseConfiguration lookUpReleaseConfigurationForComponent(
			ArchitectureVersion version, RepositoryComponent component) {
		if (version.getFieldOfActivityRepository().getReleaseSpecification() != null) {
			for (ReleaseConfiguration annotation : version.getFieldOfActivityRepository().
					getReleaseSpecification().getReleaseConfigurations()) {
				if (annotation.getComponents().contains(component)) {
					return annotation;
				}
			}
		}
		
		return null;
	}

	public static RuntimeInstanceAggregation lookUpRuntimeInstanceAggregation(
			ArchitectureVersion version, RepositoryComponent component) {
		if (version.getFieldOfActivityRepository().getDeploymentSpecification() != null) {
			for (RuntimeInstanceAggregation annotation : version.getFieldOfActivityRepository().
					getDeploymentSpecification().getRuntimeInstanceAggregations()) {
				if (annotation.getComponents().contains(component)) {
					return annotation;
				}
			}
		}
		return null;
	}

	public static List<RuntimeInstance> lookUpRuntimeInstances(
			ArchitectureVersion version, RepositoryComponent component) {
		List<RuntimeInstance> instances = new ArrayList<RuntimeInstance>();
		
		if (version.getFieldOfActivityRepository().getDeploymentSpecification() != null) {
			for (RuntimeInstance instance : version.getFieldOfActivityRepository().getDeploymentSpecification().
					getRuntimeInstances()) {
				if (instance.getComponents().contains(component)) {
					instances.add(instance);
				}
			}
		}
		
		return instances;
	}

}
