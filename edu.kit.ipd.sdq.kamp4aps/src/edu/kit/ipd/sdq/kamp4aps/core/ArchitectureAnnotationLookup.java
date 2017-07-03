package edu.kit.ipd.sdq.kamp4aps.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import DeploymentContext.ComponentCorrelation;
import DeploymentContext.VariableMapping;
import edu.kit.ipd.sdq.kamp.workplan.Activity;
import fieldofactivityannotations.CalibrationConfiguration;
import fieldofactivityannotations.ComponentDocumentationFiles;
import fieldofactivityannotations.ComponentDrawing;
import fieldofactivityannotations.ComponentStockList;
import fieldofactivityannotations.DocumentationFiles;
import fieldofactivityannotations.Drawing;
import fieldofactivityannotations.HMIConfiguration;
import fieldofactivityannotations.InterfaceDocumentationFiles;
import fieldofactivityannotations.InterfaceDrawing;
import fieldofactivityannotations.InterfaceStockList;
import fieldofactivityannotations.ModuleDocumentationFiles;
import fieldofactivityannotations.ModuleDrawing;
import fieldofactivityannotations.ModuleStockList;
import fieldofactivityannotations.StructureDocumentationFiles;
import fieldofactivityannotations.StructureDrawing;
import fieldofactivityannotations.StructureStockList;
import fieldofactivityannotations.SystemTest;
import edu.kit.ipd.sdq.kamp4aps.iec.IECModel.Program;
import edu.kit.ipd.sdq.kamp4aps.iec.IECModel.GlobalVariable;
import xPPU.Plant;
import xPPU.ComponentRepository.Component;
import xPPU.InterfaceRepository.Interface;
import xPPU.ModuleRepository.Module;
import xPPU.StructureRepository.Structure;

public class ArchitectureAnnotationLookup {

	public static List<?> lookUpSystemTestsForPlant(ArchitectureVersion version, Plant plant) {
		List<SystemTest> systemTests = new ArrayList<SystemTest>();

		if (version.getFieldOfActivityRepository().getTestSpecification() != null) {
			for (SystemTest sysTest : version.getFieldOfActivityRepository().getTestSpecification().getSystemTests()) {
				if (sysTest.getSystemUnderTest() == plant) {
					systemTests.add(sysTest);
				}
			}
		}
		return systemTests;
	}

	public static List<ComponentDrawing> lookUpDrawingsForComponent(ArchitectureVersion version, Component component) {
		List<ComponentDrawing> drawings = new ArrayList<ComponentDrawing>();

		if (version.getFieldOfActivityRepository().getEcadSpecification() != null) {
			for (Drawing drawing : version.getFieldOfActivityRepository().getEcadSpecification().getDrawings()) {
				if (drawing instanceof ComponentDrawing) {
					ComponentDrawing comDrawing = (ComponentDrawing) drawing;
					if (comDrawing.getDrawn_component() == component) {
						drawings.add(comDrawing);
					}
				}
			}
		}
		return drawings;
	}

	public static List<ModuleDrawing> lookUpDrawingsForModules(ArchitectureVersion version, Module module) {
		List<ModuleDrawing> drawings = new ArrayList<ModuleDrawing>();

		if (version.getFieldOfActivityRepository().getEcadSpecification() != null) {
			for (Drawing drawing : version.getFieldOfActivityRepository().getEcadSpecification().getDrawings()) {
				if (drawing instanceof ModuleDrawing) {
					ModuleDrawing modDrawing = (ModuleDrawing) drawing;
					if (modDrawing.getDrawn_module() == module) {
						drawings.add(modDrawing);
					}
				}
			}
		}
		return drawings;
	}

	public static List<InterfaceDrawing> lookUpDrawingsForInterfaces(ArchitectureVersion version,
			Interface interfacemodule) {
		List<InterfaceDrawing> drawings = new ArrayList<InterfaceDrawing>();

		if (version.getFieldOfActivityRepository().getEcadSpecification() != null) {
			for (Drawing drawing : version.getFieldOfActivityRepository().getEcadSpecification().getDrawings()) {
				if (drawing instanceof InterfaceDrawing) {
					InterfaceDrawing interfaceDrawing = (InterfaceDrawing) drawing;
					if (interfaceDrawing.getDrawn_interface() == interfacemodule) {
						drawings.add(interfaceDrawing);
					}
				}
			}
		}

		return drawings;
	}

	public static List<StructureDrawing> lookUpDrawingsForStructures(ArchitectureVersion version, Structure structure) {
		List<StructureDrawing> drawings = new ArrayList<StructureDrawing>();

		if (version.getFieldOfActivityRepository().getEcadSpecification() != null) {
			for (Drawing drawing : version.getFieldOfActivityRepository().getEcadSpecification().getDrawings()) {
				if (drawing instanceof StructureDrawing) {
					StructureDrawing structureDrawing = (StructureDrawing) drawing;
					if (structureDrawing.getDrawn_structure() == structure) {
						drawings.add(structureDrawing);
					}
				}
			}
		}
		return drawings;
	}

	public static List<ComponentDocumentationFiles> lookUpDocumentationForComponents(ArchitectureVersion version,
			Component component) {
		List<ComponentDocumentationFiles> doc = new ArrayList<ComponentDocumentationFiles>();
		if (version.getFieldOfActivityRepository().getDocumentationSpecification() != null) {
			for (ComponentDocumentationFiles cdf : version.getFieldOfActivityRepository()
					.getDocumentationSpecification().getComponentDocumentation()) {
				if (cdf.getDocumentedComponent() == component)
					doc.add(cdf);
			}
		}
		return doc;
	}

	public static List<ModuleDocumentationFiles> lookUpDocumentationForModules(ArchitectureVersion version,
			Module module) {
		List<ModuleDocumentationFiles> doc = new ArrayList<ModuleDocumentationFiles>();
		if (version.getFieldOfActivityRepository().getDocumentationSpecification() != null) {
			for (ModuleDocumentationFiles mdf : version.getFieldOfActivityRepository().getDocumentationSpecification()
					.getModuleDocumentation()) {
				if (mdf.getDocumentedModule() == module)
					doc.add(mdf);
			}
		}
		return doc;
	}

	public static List<? extends DocumentationFiles> lookUpDocumentationForInterfaces(ArchitectureVersion version,
			Interface interfaceElement) {
		List<InterfaceDocumentationFiles> doc = new ArrayList<InterfaceDocumentationFiles>();
		if (version.getFieldOfActivityRepository().getDocumentationSpecification() != null) {
			for (InterfaceDocumentationFiles idf : version.getFieldOfActivityRepository()
					.getDocumentationSpecification().getInterfaceDocumentation()) {
				if (idf.getDocumentedInterface() == interfaceElement)
					doc.add(idf);
			}
		}
		return doc;
	}

	public static List<? extends DocumentationFiles> lookUpDocumentationForStructures(ArchitectureVersion version,
			Structure structure) {
		List<StructureDocumentationFiles> doc = new ArrayList<StructureDocumentationFiles>();
		if (version.getFieldOfActivityRepository().getDocumentationSpecification() != null) {
			for (StructureDocumentationFiles sdf : version.getFieldOfActivityRepository()
					.getDocumentationSpecification().getStructureDocumentation()) {
				if (sdf.getDocumentedStructure() == structure)
					doc.add(sdf);
			}
		}
		return doc;
	}

	public static List<ComponentStockList> lookUpStockListForComponent(ArchitectureVersion version,
			Component component) {
		List<ComponentStockList> componentStockList = new ArrayList<ComponentStockList>();
		if (version.getFieldOfActivityRepository().getStockSpecification() != null) {
			for (ComponentStockList stock : version.getFieldOfActivityRepository().getStockSpecification()
					.getComponentStockList()) {
				if (stock.getComponents().contains(component))
					componentStockList.add(stock);
			}
		}
		return componentStockList;
	}

	public static List<ModuleStockList> lookUpStockListForModule(ArchitectureVersion version, Module module) {
		List<ModuleStockList> moduleStockList = new ArrayList<ModuleStockList>();
		for (ModuleStockList stock : version.getFieldOfActivityRepository().getStockSpecification()
				.getModuleStockList()) {
			if (stock.getModules().contains(module))
				moduleStockList.add(stock);
		}
		return moduleStockList;
	}

	public static List<StructureStockList> lookUpStockListForStructure(ArchitectureVersion version,
			Structure structure) {
		List<StructureStockList> structureStockList = new ArrayList<StructureStockList>();
		if (version.getFieldOfActivityRepository().getStockSpecification() != null) {
			for (StructureStockList stock : version.getFieldOfActivityRepository().getStockSpecification()
					.getStructureStockList()) {
				if (stock.getStructures().contains(structure))
					structureStockList.add(stock);
			}
		}
		return structureStockList;
	}

	public static List<InterfaceStockList> lookUpStockListForInterface(ArchitectureVersion version,
			Interface interfaceElement) {
		List<InterfaceStockList> interfaceStockList = new ArrayList<InterfaceStockList>();
		if (version.getFieldOfActivityRepository().getStockSpecification() != null) {
			for (InterfaceStockList stock : version.getFieldOfActivityRepository().getStockSpecification()
					.getInterfaceStockList()) {
				if (stock.getInterfaces().contains(interfaceElement))
					interfaceStockList.add(stock);
			}
		}
		return interfaceStockList;
	}

	public static void lookUpNumberOfTests(ArchitectureVersion version, Activity activity, List<Plant> plantsToTest) {
		if (version.getFieldOfActivityRepository().getTestSpecification() != null) {
			List<SystemTest> tests = version.getFieldOfActivityRepository().getTestSpecification().getSystemTests();
			for (SystemTest test : tests) {
				if (!plantsToTest.contains(test.getSystemUnderTest()))
					plantsToTest.add(test.getSystemUnderTest());
			}
		}
	}

	public static void lookUpNumberOfHmiChanges(ArchitectureVersion version, Activity activity,
			Map<ActivityElementType, List<? extends EObject>> hmiAffectingParts) {
		if (version.getFieldOfActivityRepository().getHmiSpecification() != null) {
			List<HMIConfiguration> hmiConfigs = version.getFieldOfActivityRepository().getHmiSpecification()
					.getHmiConfig();
			for (HMIConfiguration hmiConfig : hmiConfigs) {
				if (activity.getElement() instanceof Component) {
					if (!hmiConfig.getComponents().isEmpty()
							&& !hmiAffectingParts.containsValue(hmiConfig.getComponents())
							&& hmiConfig.getComponents().contains((Component) activity.getElement()))
						hmiAffectingParts.put(ActivityElementType.COMPONENT, hmiConfig.getComponents());
				}
				if (activity.getElement() instanceof Interface) {
					if (!hmiConfig.getInterfaces().isEmpty()
							&& !hmiAffectingParts.containsValue(hmiConfig.getInterfaces())
							&& hmiConfig.getInterfaces().contains((Interface) activity.getElement()))
						hmiAffectingParts.put(ActivityElementType.INTERFACE, hmiConfig.getInterfaces());
				}
				if (activity.getElement() instanceof Structure) {
					if (!hmiConfig.getStructures().isEmpty()
							&& !hmiAffectingParts.containsValue(hmiConfig.getStructures())
							&& hmiConfig.getStructures().contains((Structure) activity.getElement()))
						hmiAffectingParts.put(ActivityElementType.STRUCTURE, hmiConfig.getStructures());
				}
				if (activity.getElement() instanceof Module) {
					if (!hmiConfig.getModules().isEmpty() 
							&& !hmiAffectingParts.containsValue(hmiConfig.getModules())
							&& hmiConfig.getModules().contains((Module) activity.getElement()))
						hmiAffectingParts.put(ActivityElementType.MODULE, hmiConfig.getModules());
				}
			}
		}
	}

	public static void lookUpNumberOfCalibrationChanges(ArchitectureVersion version,
			Activity activity, Map<ActivityElementType, List<? extends EObject>> calibrationAffectingParts) {
		if (version.getFieldOfActivityRepository().getHmiSpecification() != null) {
			List<CalibrationConfiguration> calibrationConfigs = version.getFieldOfActivityRepository().getCalibrationSpecification()
					.getCalibrationConfig();
			for (CalibrationConfiguration calibrationConfig : calibrationConfigs) {
				if (activity.getElement() instanceof Component) {
					if (!calibrationConfig.getComponents().isEmpty()
							&& !calibrationAffectingParts.containsValue(calibrationConfig.getComponents())
							&& calibrationConfig.getComponents().contains((Component) activity.getElement()))
						calibrationAffectingParts.put(ActivityElementType.COMPONENT, calibrationConfig.getComponents());
				}
				if (activity.getElement() instanceof Interface) {
					if (!calibrationConfig.getInterfaces().isEmpty()
							&& !calibrationAffectingParts.containsValue(calibrationConfig.getInterfaces())
							&& calibrationConfig.getInterfaces().contains((Interface) activity.getElement()))
						calibrationAffectingParts.put(ActivityElementType.INTERFACE, calibrationConfig.getInterfaces());
				}
				if (activity.getElement() instanceof Structure) {
					if (!calibrationConfig.getStructures().isEmpty()
							&& !calibrationAffectingParts.containsValue(calibrationConfig.getStructures())
							&& calibrationConfig.getStructures().contains((Structure) activity.getElement()))
						calibrationAffectingParts.put(ActivityElementType.STRUCTURE, calibrationConfig.getStructures());
				}
				if (activity.getElement() instanceof Module) {
					if (!calibrationConfig.getModules().isEmpty() 
							&& !calibrationAffectingParts.containsValue(calibrationConfig.getModules())
							&& calibrationConfig.getModules().contains((Module) activity.getElement()))
						calibrationAffectingParts.put(ActivityElementType.MODULE, calibrationConfig.getModules());
				}
			}
		}
	}

	public static Map<Component, Program> lookUpToChangeSoftware(ArchitectureVersion version,
			Activity activity) {
		Map<Component, Program> softwareChangeAffectedParts = new HashMap<Component, Program>();
		if(activity.getElement() instanceof Component){
			Component component = (Component)activity.getElement();
			for(ComponentCorrelation cc : version.getDeploymentContextRepository().getComponentCorrelation()){
				if(cc.getComponent() == component)
					softwareChangeAffectedParts.put(component, cc.getProgram());
			}
		} else if (activity.getElement() instanceof Interface){
			Interface interfaze = (Interface)activity.getElement();
			for(ComponentCorrelation cc : version.getDeploymentContextRepository().getComponentCorrelation()){
				if(cc.getComponent().getConnectedInterfaces().contains(interfaze)){
					softwareChangeAffectedParts.put(cc.getComponent(), cc.getProgram());
				}
			}
		}
		return softwareChangeAffectedParts;
	}

	public static Map<Interface, GlobalVariable> lookUpInterfacesOfSoftwareChanges(ArchitectureVersion version,
			Activity activity) {
		Map<Interface, GlobalVariable> variableChanges = new HashMap<Interface, GlobalVariable>();
		if(activity.getElement() instanceof Component){
			Component component = (Component)activity.getElement();
			for(ComponentCorrelation cc : version.getDeploymentContextRepository().getComponentCorrelation()){
				if(cc.getComponent() == component){
					List<VariableMapping> mappings = cc.getVariableMapping();
					for(VariableMapping mapping : mappings){
						variableChanges.put(mapping.getInterfaceDeclaration(), mapping.getProgramVariable());
					}
				}
			}
		} else if (activity.getElement() instanceof Interface){
			Interface interfaze = (Interface)activity.getElement();
			for(ComponentCorrelation cc : version.getDeploymentContextRepository().getComponentCorrelation()){
				if(cc.getComponent().getConnectedInterfaces().contains(interfaze)){
					List<VariableMapping> mappings = cc.getVariableMapping();
					for(VariableMapping mapping : mappings){
						variableChanges.put(mapping.getInterfaceDeclaration(), mapping.getProgramVariable());
					}
				}
			}
		}
		return variableChanges;
	}
}