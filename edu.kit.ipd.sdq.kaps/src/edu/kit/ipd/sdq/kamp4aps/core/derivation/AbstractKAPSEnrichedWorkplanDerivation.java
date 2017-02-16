package edu.kit.ipd.sdq.kamp4aps.core.derivation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import edu.kit.ipd.sdq.amp.workplan.AbstractEnrichedWorkplanDerivation;
import edu.kit.ipd.sdq.amp.workplan.Activity;
import edu.kit.ipd.sdq.amp.workplan.BasicActivity;
import edu.kit.ipd.sdq.kamp4aps.core.ActivityElementType;
import edu.kit.ipd.sdq.kamp4aps.core.ActivityType;
import edu.kit.ipd.sdq.kamp4aps.core.ArchitectureAnnotationLookup;
import edu.kit.ipd.sdq.kamp4aps.core.ArchitectureVersion;
import fieldofactivityannotations.ComponentDrawing;
import fieldofactivityannotations.ComponentStockList;
import fieldofactivityannotations.DocumentationFiles;
import fieldofactivityannotations.InterfaceDrawing;
import fieldofactivityannotations.InterfaceStockList;
import fieldofactivityannotations.ModuleDrawing;
import fieldofactivityannotations.ModuleStockList;
import fieldofactivityannotations.StructureDrawing;
import fieldofactivityannotations.StructureStockList;
import xPPU.ComponentRepository.Component;
import xPPU.InterfaceRepository.Interface;
import xPPU.ModuleRepository.Module;
import xPPU.StructureRepository.Structure;

public abstract class AbstractKAPSEnrichedWorkplanDerivation<T extends ArchitectureVersion>
		implements AbstractEnrichedWorkplanDerivation<T> {

	@Override
	public List<Activity> deriveEnrichedWorkplan(T baseArchitectureVersion, T subVersion,
			List<Activity> baseActivityList) {
		List<Activity> result = new ArrayList<Activity>(baseActivityList);

		deriveCADDrawingActivities(baseArchitectureVersion, subVersion, result);
		deriveDocumentationActivities(baseArchitectureVersion, subVersion, result);
		derivePurchaseActivities(baseArchitectureVersion, subVersion, result);
		deriveTestExecutionActivities(baseArchitectureVersion, subVersion, result);

		return result;
	}

		private void deriveCADDrawingActivities(ArchitectureVersion baseVersion, ArchitectureVersion targetVersion,
				List<Activity> baseActivityList) {
			for (Activity activity : baseActivityList) {
				Map<ActivityElementType, Integer> numberOfFiles = determineNumberOfCADFiles(
						determineRelevantArchitectureVersion(activity, baseVersion, targetVersion), activity);
				deriveComponentDrawing(activity, numberOfFiles);
				deriveModuleDrawing(activity, numberOfFiles);
				deriveInterfaceDrawing(activity, numberOfFiles);
				deriveStructureDrawing(activity, numberOfFiles);
			}
		}
		
			private Map<ActivityElementType, Integer> determineNumberOfCADFiles(ArchitectureVersion version,
					Activity activity) {
				Map<ActivityElementType, Integer> numberOfDrawings = new HashMap<ActivityElementType, Integer>();
				numberOfDrawings.put(ActivityElementType.COMPONENT, 0);
				numberOfDrawings.put(ActivityElementType.MODULE, 0);
				numberOfDrawings.put(ActivityElementType.INTERFACE, 0);
				numberOfDrawings.put(ActivityElementType.STRUCTURE, 0);
				
				if (activity.getElement() instanceof Component) {
					Component component = (Component) activity.getElement();
					List<ComponentDrawing> drawings = ArchitectureAnnotationLookup.lookUpDrawingsForComponent(version,
							component);
					numberOfDrawings.put(ActivityElementType.COMPONENT,
							numberOfDrawings.get(ActivityElementType.COMPONENT) + drawings.size());
				} else if (activity.getElement() instanceof Module) {
					Module module = (Module) activity.getElement();
					List<ModuleDrawing> drawings = ArchitectureAnnotationLookup.lookUpDrawingsForModules(version, module);
					numberOfDrawings.put(ActivityElementType.MODULE,
							numberOfDrawings.get(ActivityElementType.MODULE) + drawings.size());
				} else if (activity.getElement() instanceof Interface) {
					Interface interfacemodule = (Interface) activity.getElement();
					List<InterfaceDrawing> drawings = ArchitectureAnnotationLookup.lookUpDrawingsForInterfaces(version,
							interfacemodule);
					numberOfDrawings.put(ActivityElementType.INTERFACE,
							numberOfDrawings.get(ActivityElementType.INTERFACE) + drawings.size());
				} else if (activity.getElement() instanceof Structure) {
					Structure structure = (Structure) activity.getElement();
					List<StructureDrawing> drawings = ArchitectureAnnotationLookup.lookUpDrawingsForStructures(version,
							structure);
					numberOfDrawings.put(ActivityElementType.STRUCTURE,
							numberOfDrawings.get(ActivityElementType.STRUCTURE) + drawings.size());
				}
				return numberOfDrawings;
			}
	
			private void deriveComponentDrawing(Activity activity, Map<ActivityElementType, Integer> numberOfFiles) {
				ActivityElementType componentType = ActivityElementType.COMPONENT;
				if (activity.getElementType() == componentType && numberOfFiles.get(componentType) > 0) {
					activity.addFollowupActivity(new Activity(ActivityType.UPDATE_CAD, ActivityElementType.DRAWING,
							activity.getElement(), numberOfFiles + " drawings", null, activity.getBasicActivity(),
							"ECAD: " + activity.getBasicActivity().getName() + " drawings (" + numberOfFiles
									+ " files) of component " + activity.getElementName() + "."));
				}
			}
	
			private void deriveModuleDrawing(Activity activity, Map<ActivityElementType, Integer> numberOfFiles) {
				ActivityElementType moduleType = ActivityElementType.MODULE;
				if (activity.getElementType() == moduleType && numberOfFiles.get(moduleType) > 0) {
					activity.addFollowupActivity(new Activity(ActivityType.UPDATE_CAD, ActivityElementType.DRAWING,
							activity.getElement(), numberOfFiles + " drawings", null, activity.getBasicActivity(),
							"ECAD: " + activity.getBasicActivity().getName() + " drawings (" + numberOfFiles
									+ " files) of module " + activity.getElementName() + "."));
				}
			}
	
			private void deriveInterfaceDrawing(Activity activity, Map<ActivityElementType, Integer> numberOfFiles) {
				ActivityElementType interfaceType = ActivityElementType.INTERFACE;
				if (activity.getElementType() == interfaceType && numberOfFiles.get(interfaceType) > 0) {
					activity.addFollowupActivity(new Activity(ActivityType.UPDATE_CAD, ActivityElementType.DRAWING,
							activity.getElement(), numberOfFiles + " drawings", null, activity.getBasicActivity(),
							"ECAD: " + activity.getBasicActivity().getName() + " drawings (" + numberOfFiles
									+ " files) of interface " + activity.getElementName() + "."));
				}
			}
	
			private void deriveStructureDrawing(Activity activity, Map<ActivityElementType, Integer> numberOfFiles) {
				ActivityElementType structureType = ActivityElementType.STRUCTURE;
				if (activity.getElementType() == structureType && numberOfFiles.get(structureType) > 0) {
					activity.addFollowupActivity(new Activity(ActivityType.UPDATE_CAD, ActivityElementType.DRAWING,
							activity.getElement(), numberOfFiles + " drawings", null, activity.getBasicActivity(),
							"ECAD: " + activity.getBasicActivity().getName() + " drawings (" + numberOfFiles
									+ " files) of interface " + activity.getElementName() + "."));
				}
			}



		private void deriveDocumentationActivities(ArchitectureVersion baseVersion, ArchitectureVersion targetVersion,
				List<Activity> baseActivityList) {
			for (Activity activity : baseActivityList) {
				Map<ActivityElementType, Integer> numberOfFiles = determineNumberOfDocumentationFiles(
						determineRelevantArchitectureVersion(activity, baseVersion, targetVersion), activity);
				deriveDocumentationForOneActivity(activity, numberOfFiles);
			}
		}
		
			private Map<ActivityElementType, Integer> determineNumberOfDocumentationFiles(ArchitectureVersion version,
					Activity activity) {
				Map<ActivityElementType, Integer> numberOfFiles = new HashMap<ActivityElementType, Integer>();
				numberOfFiles.put(ActivityElementType.MAINTENEANCE_DOCUMENTATION, 0);
				numberOfFiles.put(ActivityElementType.OPERATOR_INSTRUCTIONS, 0);
				numberOfFiles.put(ActivityElementType.TRAINING_DOCUMENTATION_INTERNAL, 0);
				numberOfFiles.put(ActivityElementType.TRAINING_DOCUMENTATION_EXTERNAL, 0);
				
				EObject activityElement = activity.getElement();
				if (activityElement instanceof Component) {
					Component component = (Component) activityElement;
					List<? extends DocumentationFiles> compDocFiles = ArchitectureAnnotationLookup
							.lookUpDocumentationForComponents(version, component);
					numberOfFiles = calcNumberOfDocumentationFiles(numberOfFiles, compDocFiles);
				} else if (activityElement instanceof Module) {
					Module module = (Module) activityElement;
					List<? extends DocumentationFiles> modDocFiles = ArchitectureAnnotationLookup
							.lookUpDocumentationForModules(version, module);
					numberOfFiles = calcNumberOfDocumentationFiles(numberOfFiles, modDocFiles);
				} else if (activityElement instanceof Interface) {
					Interface interfaceElement = (Interface) activityElement;
					List<? extends DocumentationFiles> intDocFiles = ArchitectureAnnotationLookup
							.lookUpDocumentationForInterfaces(version, interfaceElement);
					numberOfFiles = calcNumberOfDocumentationFiles(numberOfFiles, intDocFiles);
				} else if (activityElement instanceof Structure) {
					Structure structure = (Structure) activityElement;
					List<? extends DocumentationFiles> structDocFiles = ArchitectureAnnotationLookup
							.lookUpDocumentationForStructures(version, structure);
					numberOfFiles = calcNumberOfDocumentationFiles(numberOfFiles, structDocFiles);
				}
				return numberOfFiles;
			}
			
				private Map<ActivityElementType, Integer> calcNumberOfDocumentationFiles(
						Map<ActivityElementType, Integer> numberOfFiles, List<? extends DocumentationFiles> docFiles) {
					if (!docFiles.isEmpty()) {
						for (DocumentationFiles doc : docFiles) {
							numberOfFiles.put(ActivityElementType.MAINTENEANCE_DOCUMENTATION,
									numberOfFiles.get(ActivityElementType.MAINTENEANCE_DOCUMENTATION)
											+ doc.getMainteneance().size());
							numberOfFiles.put(ActivityElementType.OPERATOR_INSTRUCTIONS,
									numberOfFiles.get(ActivityElementType.OPERATOR_INSTRUCTIONS) + doc.getInstructions().size());
							numberOfFiles.put(ActivityElementType.TRAINING_DOCUMENTATION_INTERNAL,
									numberOfFiles.get(ActivityElementType.TRAINING_DOCUMENTATION_INTERNAL)
											+ doc.getTrainingIntern().size());
							numberOfFiles.put(ActivityElementType.TRAINING_DOCUMENTATION_EXTERNAL,
									numberOfFiles.get(ActivityElementType.TRAINING_DOCUMENTATION_EXTERNAL)
											+ doc.getTrainingExternal().size());
						}
					}
					return numberOfFiles;
				}

			private void deriveDocumentationForOneActivity(Activity activity, Map<ActivityElementType, Integer> numberOfFiles) {
				switch ((ActivityElementType) activity.getElementType()) {
				case COMPONENT:
					addDocumentation(activity, numberOfFiles, "component");
					break;
				case INTERFACE:
					addDocumentation(activity, numberOfFiles, "interface");
					break;
				case MODULE:
					addDocumentation(activity, numberOfFiles, "module");
					break;
				case STRUCTURE:
					addDocumentation(activity, numberOfFiles, "structure");
					break;
				default:
					break;
		
				}
			}

				private void addDocumentation(Activity activity, Map<ActivityElementType, Integer> numberOfFiles, String type) {
					if (numberOfFiles.get(ActivityElementType.MAINTENEANCE_DOCUMENTATION) > 0) {
						activity.addFollowupActivity(new Activity(ActivityType.UPDATE_DOCUMENTATION,
								ActivityElementType.MAINTENEANCE_DOCUMENTATION, activity.getElement(),
								numberOfFiles.get(ActivityElementType.MAINTENEANCE_DOCUMENTATION) + " mainteneance documentation",
								null, activity.getBasicActivity(),
								"Documentation: " + activity.getBasicActivity().getName() + " mainteneance ("
										+ numberOfFiles.get(ActivityElementType.MAINTENEANCE_DOCUMENTATION) + " files) of " + type
										+ " " + activity.getElementName() + "."));
					}
					if (numberOfFiles.get(ActivityElementType.OPERATOR_INSTRUCTIONS) > 0) {
						activity.addFollowupActivity(new Activity(ActivityType.UPDATE_DOCUMENTATION,
								ActivityElementType.OPERATOR_INSTRUCTIONS, activity.getElement(),
								numberOfFiles.get(ActivityElementType.OPERATOR_INSTRUCTIONS) + " operator instructions", null,
								activity.getBasicActivity(),
								"Documentation: " + activity.getBasicActivity().getName() + " instructions ("
										+ numberOfFiles.get(ActivityElementType.OPERATOR_INSTRUCTIONS) + " files) of " + type + " "
										+ activity.getElementName() + "."));
					}
					if (numberOfFiles.get(ActivityElementType.TRAINING_DOCUMENTATION_INTERNAL) > 0) {
						activity.addFollowupActivity(new Activity(ActivityType.UPDATE_DOCUMENTATION,
								ActivityElementType.TRAINING_DOCUMENTATION_INTERNAL, activity.getElement(),
								numberOfFiles.get(ActivityElementType.TRAINING_DOCUMENTATION_INTERNAL)
										+ " training documentation (internal) ",
								null, activity.getBasicActivity(),
								"Documentation: " + activity.getBasicActivity().getName() + " training ("
										+ numberOfFiles.get(ActivityElementType.TRAINING_DOCUMENTATION_INTERNAL) + " files) of "
										+ type + " " + activity.getElementName() + "."));
					}
					if (numberOfFiles.get(ActivityElementType.TRAINING_DOCUMENTATION_EXTERNAL) > 0) {
						activity.addFollowupActivity(new Activity(ActivityType.UPDATE_DOCUMENTATION,
								ActivityElementType.TRAINING_DOCUMENTATION_EXTERNAL, activity.getElement(),
								numberOfFiles.get(ActivityElementType.TRAINING_DOCUMENTATION_EXTERNAL)
										+ " training documentation (external) ",
								null, activity.getBasicActivity(),
								"Documentation: " + activity.getBasicActivity().getName() + " training ("
										+ numberOfFiles.get(ActivityElementType.TRAINING_DOCUMENTATION_EXTERNAL) + " files) of  "
										+ type + " " + activity.getElementName() + "."));
					}
				}
				

		private void derivePurchaseActivities(ArchitectureVersion baseVersion, ArchitectureVersion targetVersion,
				List<Activity> baseActivityList) {
			Map<ActivityElementType, Integer> numberOfFiles = new HashMap<ActivityElementType, Integer>();
			numberOfFiles.put(ActivityElementType.COMPONENT_STOCKLIST, 0);
			numberOfFiles.put(ActivityElementType.INTERFACE_STOCKLIST, 0);
			numberOfFiles.put(ActivityElementType.STRUCTURE_STOCKLIST, 0);
			numberOfFiles.put(ActivityElementType.MODULE_STOCKLIST, 0);
	
			for (Activity activity : baseActivityList) {
				numberOfFiles = determineNumberOfStockLists(
						determineRelevantArchitectureVersion(activity, baseVersion, targetVersion), activity);
				if (numberOfFiles.get(ActivityElementType.COMPONENT_STOCKLIST) > 0) {
					activity.addFollowupActivity(new Activity(ActivityType.UPDATE_STOCKLIST,
							ActivityElementType.COMPONENT_STOCKLIST, activity.getElement(),
							numberOfFiles.get(ActivityElementType.COMPONENT_STOCKLIST) + " component stocklist ", null,
							activity.getBasicActivity(),
							"StockList: " + activity.getBasicActivity().getName() + " stocklist ("
									+ numberOfFiles.get(ActivityElementType.COMPONENT_STOCKLIST) + " files) of component "
									+ activity.getElementName() + "."));
				}
				if (numberOfFiles.get(ActivityElementType.MODULE_STOCKLIST) > 0) {
					activity.addFollowupActivity(new Activity(ActivityType.UPDATE_STOCKLIST,
							ActivityElementType.MODULE_STOCKLIST, activity.getElement(),
							numberOfFiles.get(ActivityElementType.MODULE_STOCKLIST) + " module stocklist ", null,
							activity.getBasicActivity(),
							"StockList: " + activity.getBasicActivity().getName() + " stocklist ("
									+ numberOfFiles.get(ActivityElementType.MODULE_STOCKLIST)
									+ " files) of module " + activity.getElementName() + "."));
				}
				if (numberOfFiles.get(ActivityElementType.INTERFACE_STOCKLIST) > 0) {
					activity.addFollowupActivity(new Activity(ActivityType.UPDATE_STOCKLIST,
							ActivityElementType.INTERFACE_STOCKLIST, activity.getElement(),
							numberOfFiles.get(ActivityElementType.INTERFACE_STOCKLIST) + " interface stocklist ", null,
							activity.getBasicActivity(),
							"StockList: " + activity.getBasicActivity().getName() + " stocklist ("
									+ numberOfFiles.get(ActivityElementType.INTERFACE_STOCKLIST)
									+ " files) of interface " + activity.getElementName() + "."));
				}
				if (numberOfFiles.get(ActivityElementType.STRUCTURE_STOCKLIST) > 0) {
					activity.addFollowupActivity(new Activity(ActivityType.UPDATE_STOCKLIST,
							ActivityElementType.STRUCTURE_STOCKLIST, activity.getElement(),
							numberOfFiles.get(ActivityElementType.STRUCTURE_STOCKLIST) + " structure stocklist ", null,
							activity.getBasicActivity(),
							"StockList: " + activity.getBasicActivity().getName() + " stocklist ("
									+ numberOfFiles.get(ActivityElementType.STRUCTURE_STOCKLIST)
									+ " files) of structure " + activity.getElementName() + "."));
				}
			}
	
		}

			private Map<ActivityElementType, Integer> determineNumberOfStockLists(ArchitectureVersion version,
					Activity activity) {
				Map<ActivityElementType, Integer> numberOfFiles = new HashMap<ActivityElementType, Integer>();
				numberOfFiles.put(ActivityElementType.COMPONENT_STOCKLIST, 0);
				numberOfFiles.put(ActivityElementType.INTERFACE_STOCKLIST, 0);
				numberOfFiles.put(ActivityElementType.STRUCTURE_STOCKLIST, 0);
				numberOfFiles.put(ActivityElementType.MODULE_STOCKLIST, 0);
		
				EObject activityElementType = activity.getElement();
				if (activityElementType instanceof Component) {
					List<ComponentStockList> componentStockList = ArchitectureAnnotationLookup
							.lookUpStockListForComponent(version, (Component) activityElementType);
					numberOfFiles.put(ActivityElementType.COMPONENT_STOCKLIST,
							numberOfFiles.get(ActivityElementType.COMPONENT_STOCKLIST) + componentStockList.size());
				} else if (activityElementType instanceof Module) {
					List<ModuleStockList> moduleStockList = ArchitectureAnnotationLookup.lookUpStockListForModule(version,
							(Module) activityElementType);
					numberOfFiles.put(ActivityElementType.MODULE_STOCKLIST,
							numberOfFiles.get(ActivityElementType.MODULE_STOCKLIST) + moduleStockList.size());
				} else if (activityElementType instanceof Structure) {
					List<StructureStockList> structureStockList = ArchitectureAnnotationLookup
							.lookUpStockListForStructure(version, (Structure) activityElementType);
					numberOfFiles.put(ActivityElementType.STRUCTURE_STOCKLIST,
							numberOfFiles.get(ActivityElementType.STRUCTURE_STOCKLIST) + structureStockList.size());
				} else if (activityElementType instanceof Interface) {
					List<InterfaceStockList> interfaceStockList = ArchitectureAnnotationLookup
							.lookUpStockListForInterface(version, (Interface) activityElementType);
					numberOfFiles.put(ActivityElementType.INTERFACE_STOCKLIST,
							numberOfFiles.get(ActivityElementType.INTERFACE_STOCKLIST) + interfaceStockList.size());
				}
		
				return numberOfFiles;
			}

	
		private void deriveTestExecutionActivities(ArchitectureVersion baseVersion, ArchitectureVersion targetVersion,
				List<Activity> baseActivityList) {
			for (Activity activity : baseActivityList) {
				int numberOfFiles = ArchitectureAnnotationLookup.
						lookUpNumberOfTests(determineRelevantArchitectureVersion(activity, baseVersion, targetVersion), 
						activity);
				if(numberOfFiles > 0){
					activity.addFollowupActivity(new Activity(ActivityType.TEST_EXECUTION,
							ActivityElementType.TESTCASE, activity.getElement(),
							numberOfFiles + " test ", null,
							activity.getBasicActivity(),
							"Test: " + activity.getBasicActivity().getName() + " test ("
									+ numberOfFiles
									+ " testcases) of  " + activity.getElementName() + "."));
				}
			}			
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

	private static <T extends ArchitectureVersion> T determineRelevantArchitectureVersion(Activity activity,
			T baseVersion, T targetVersion) {
		if (activity.getBasicActivity() == BasicActivity.REMOVE) {
			return baseVersion;
		} else {
			return targetVersion;
		}
	}

}
