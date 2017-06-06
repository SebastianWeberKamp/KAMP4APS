package edu.kit.ipd.sdq.kamp4aps.core.derivation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import edu.kit.ipd.sdq.kamp.architecture.ArchitectureModelLookup;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification;
import edu.kit.ipd.sdq.kamp.workplan.AbstractActivityElementType;
import edu.kit.ipd.sdq.kamp.workplan.Activity;
import edu.kit.ipd.sdq.kamp.workplan.BasicActivity;
import edu.kit.ipd.sdq.kamp4aps.core.ActivityElementType;
import edu.kit.ipd.sdq.kamp4aps.core.ActivityType;
import edu.kit.ipd.sdq.kamp4aps.core.ArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyComponent;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyInterface;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyModule;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyStructure;
import xPPU.ComponentRepository.Component;
import xPPU.InterfaceRepository.Interface;
import xPPU.ModuleRepository.Module;
import xPPU.StructureRepository.Structure;

public class InternalModificationDerivation {

	public static List<String> getCausingElementsNames(AbstractModification<?, ?> modification) {
		List<String> causingElementNames = new LinkedList<String>();
		for (Object causingElement : modification.getCausingElements()) {
			if (causingElement instanceof Component) {
				Component causingCompoenent = (Component) causingElement;
				causingElementNames.add(causingCompoenent.eClass().
						getName() + " \"" + causingCompoenent.getId() + "\"");
			} else if (causingElement instanceof Module) {
				Module causingModule = (Module) causingElement;
				causingElementNames.add(causingModule.eClass().
						getName() + " \"" + causingModule.getId() + "\"");
			} else if (causingElement instanceof Interface) {
				Interface causingInterface = (Interface) causingElement;
				causingElementNames.add(causingInterface.eClass().
						getName() + " \"" + causingInterface.getId() + "\"");
			} else if (causingElement instanceof Structure) {
				Structure causingStructure = (Structure) causingElement;
				causingElementNames.add(causingStructure.eClass().
						getName() + " \"" + causingStructure.getId() + "\"");
			}
		}
		return causingElementNames;
	}

	public static Activity createModificationActivity(AbstractModification<?, ?> modification,
			List<String> causingElementNames, AbstractActivityElementType activityElementType) {
		if (modification instanceof ModifyComponent<?>){
			Component component = ((ModifyComponent<?>) modification).getAffectedElement();
			return new Activity(ActivityType.INTERNALMODIFICATIONMARK, activityElementType, component,
					component.getId(), causingElementNames, BasicActivity.MODIFY, "Modify " + component.eClass().getName() + ".");
		}
		if (modification instanceof ModifyInterface<?>){
			Interface interfaceElement = ((ModifyInterface<?>) modification).getAffectedElement();
			return new Activity(ActivityType.INTERNALMODIFICATIONMARK, activityElementType, interfaceElement,
					interfaceElement.getId(), causingElementNames, BasicActivity.MODIFY, "Modify " + interfaceElement.eClass().getName() + ".");
		}
		if (modification instanceof ModifyStructure<?>){
			Structure structure = ((ModifyStructure<?>) modification).getAffectedElement();
			return new Activity(ActivityType.INTERNALMODIFICATIONMARK, activityElementType, structure,
					structure.getId(), causingElementNames, BasicActivity.MODIFY, "Modify " + structure.eClass().getName() + ".");
		}
		if (modification instanceof ModifyModule<?>){
			Module module = ((ModifyModule<?>) modification).getAffectedElement();
			return new Activity(ActivityType.INTERNALMODIFICATIONMARK, activityElementType, module,
					module.getId(), causingElementNames, BasicActivity.MODIFY, "Modify " + module.eClass().getName() + ".");
		} else {
			return null;
		}
	}

	public static Activity createModificationActivity(AbstractModification<?, ?> modification,
			AbstractActivityElementType activityElementType) {
		List<String> causingElementNames = getCausingElementsNames(modification);
		return createModificationActivity(modification, causingElementNames, activityElementType);
	}

	public static Activity addModificationSubActivity(AbstractModification<?, ?> modification,
			AbstractActivityElementType activityType, Activity superActivity) {
		Activity result = createModificationActivity(modification, activityType);
		superActivity.addSubActivity(result);
		return result;
	}

	public List<Activity> deriveInternalModifications(ArchitectureVersion targetVersion) {
		List<Activity> activityList = new ArrayList<Activity>();

		this.deriveComponentModifications(targetVersion, activityList);
		this.deriveInterfaceModifications(targetVersion, activityList);
		this.deriveModuleModifications(targetVersion, activityList);
		this.deriveStructureModifications(targetVersion, activityList);

		return activityList;
	}

	private void deriveComponentModifications(ArchitectureVersion targetVersion, List<Activity> activityList) {
		Collection<ModifyComponent> modifyComponents = ArchitectureModelLookup
				.lookUpAllCalculatedMarksOfAType(targetVersion, ModifyComponent.class);
		for (ModifyComponent<?> modifyComponent : modifyComponents) {
			Activity componentActivity = createModificationActivity(modifyComponent, ActivityElementType.COMPONENT);
			activityList.add(componentActivity);
//			this.deriveSubActivities(modifyComponent, componentActivity);
		}
	}

	private void deriveInterfaceModifications(ArchitectureVersion targetVersion, List<Activity> activityList) {
		Collection<ModifyInterface> modifyInterfaces = ArchitectureModelLookup
				.lookUpAllCalculatedMarksOfAType(targetVersion, ModifyInterface.class);
		for (ModifyInterface<?> modifyInterface : modifyInterfaces) {
			Activity interfaceActivity = createModificationActivity(modifyInterface, ActivityElementType.INTERFACE);
			activityList.add(interfaceActivity);
		}
	}

	private void deriveModuleModifications(ArchitectureVersion targetVersion, List<Activity> activityList) {
		Collection<ModifyModule> modifyModules = ArchitectureModelLookup
				.lookUpAllCalculatedMarksOfAType(targetVersion, ModifyModule.class);
		for (ModifyModule<?> modifyInterface : modifyModules) {
			Activity interfaceActivity = createModificationActivity(modifyInterface, ActivityElementType.MODULE);
			activityList.add(interfaceActivity);
		}
	}
	
	private void deriveStructureModifications(ArchitectureVersion targetVersion, List<Activity> activityList) {
		Collection<ModifyStructure> modifyStructure = ArchitectureModelLookup
				.lookUpAllCalculatedMarksOfAType(targetVersion, ModifyStructure.class);
		for (ModifyStructure<?> modifyInterface : modifyStructure) {
			Activity interfaceActivity = createModificationActivity(modifyInterface, ActivityElementType.STRUCTURE);
			activityList.add(interfaceActivity);
		}
	}
	
//	private void deriveSubActivities(ModifyComponent modifyComponent, Activity componentActivity) {
//		for (ModifyProvidedRole modifyProvidedRole : modifyComponent.getProvidedRoleModifications()) {
//			Activity providedRoleActivity = addModificationSubActivity(modifyProvidedRole,
//					ActivityElementType.PROVIDEDROLE, componentActivity);
//			for (ModifySignature modifySignature : modifyProvidedRole.getSignatureModifications()) {
//				addModificationSubActivity(modifySignature, ActivityElementType.PROVIDEDOPERATION,
//						providedRoleActivity);
//			}
//		}
//		for (ModifyRequiredRole modifyRequiredRole : modifyComponent.getRequiredRoleModifications()) {
//			Activity requiredRoleActivity = addModificationSubActivity(modifyRequiredRole,
//					ActivityElementType.REQUIREDROLE, componentActivity);
//			for (ModifySignature modifySignature : modifyRequiredRole.getSignatureModifications()) {
//				addModificationSubActivity(modifySignature, ActivityElementType.REQUIREDOPERATION,
//						requiredRoleActivity);
//			}
//		}
//	}
}
