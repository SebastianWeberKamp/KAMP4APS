package edu.kit.ipd.sdq.kamp4aps.core.derivation;

import edu.kit.ipd.sdq.kamp.workplan.AbstractActivityElementType;
import edu.kit.ipd.sdq.kamp.workplan.Activity;
import edu.kit.ipd.sdq.kamp.workplan.BasicActivity;
import edu.kit.ipd.sdq.kamp4aps.core.ActivityElementType;
import edu.kit.ipd.sdq.kamp4aps.core.ActivityType;
import edu.kit.ipd.sdq.kamp4aps.core.ArchitectureVersion;
import xPPU.ComponentRepository.Component;
import xPPU.ComponentRepository.MicroswitchModule;
import xPPU.ComponentRepository.TurningTable;
import xPPU.Identifier.Identifier;
import xPPU.InterfaceRepository.Interface;
import xPPU.ModuleRepository.Module;
import xPPU.StructureRepository.Structure;

public class SubactivityDerivation {

	public static Activity addSubActivity(Module entity, AbstractActivityElementType activityElementType,
			Module parentElement, Activity parentActivity) {
		Activity result = new Activity(ActivityType.ARCHITECTUREMODELDIFF, activityElementType, entity, entity.getId(),
				null, parentActivity.getBasicActivity(),
				generateDescription(parentElement, entity, parentActivity.getBasicActivity()));
		parentActivity.addSubActivity(result);
		return result;
	}

	public void deriveSubactivities(Identifier plantElement, Activity parentActivity, ArchitectureVersion version) {
		if (plantElement instanceof Component) {
			deriveSubactivity((Component) plantElement, parentActivity, version);
		} else if (plantElement instanceof Interface) {
			deriveSubactivity((Interface) plantElement, parentActivity, version);
		} else if (plantElement instanceof Module) {
			deriveSubactivity((Module) plantElement, parentActivity, version);
		} else if (plantElement instanceof Structure) {
			deriveSubactivity((Structure) plantElement, parentActivity, version);
		}
	}

	private void deriveSubactivity(Component plantElement, Activity parentActivity, ArchitectureVersion version) {
		if (plantElement instanceof MicroswitchModule) {
			for (Component c : version.getXPPUPlant().getComponentRepository().getAllComponentsInPlant()) {
				if (c instanceof TurningTable) {
					TurningTable tt = (TurningTable) c;
					for(MicroswitchModule mm : tt.getMicroswitchModule()){
						if (plantElement.getId() == mm.getId()) {
							addSubActivity((Component) tt, ActivityElementType.COMPONENT, c,
									parentActivity);
							addSubActivity((Structure) tt.getParent(), ActivityElementType.STRUCTURE, c,
									parentActivity);
						}
					}
				}
			}
		}
	}

	private Activity addSubActivity(Component component, ActivityElementType elementType, Component parentElement, Activity parentActivity) {
		Activity result = new Activity(ActivityType.ARCHITECTUREMODELDIFF, elementType, component, component.getId(), null, parentActivity.getBasicActivity(), 
				generateDescription(parentElement, component, parentActivity.getBasicActivity()));
		parentActivity.addSubActivity(result);
		return parentActivity;
	}

	private Activity addSubActivity(Structure structure, ActivityElementType elementType, Component parentElement, Activity parentActivity) {
		Activity result = new Activity(ActivityType.ARCHITECTUREMODELDIFF, elementType, structure, structure.getId(), null, parentActivity.getBasicActivity(), 
				generateDescription(parentElement, structure, parentActivity.getBasicActivity()));
		parentActivity.addSubActivity(result);
		return parentActivity;
	}

	private void deriveSubactivity(Interface plantElement, Activity parentActivity, ArchitectureVersion version) {
		// TODO Auto-generated method stub

	}

	private void deriveSubactivity(Module plantElement, Activity parentActivity, ArchitectureVersion version) {
		// TODO Auto-generated method stub

	}

	private void deriveSubactivity(Structure plantElement, Activity parentActivity, ArchitectureVersion version) {
		// TODO Auto-generated method stub

	}

	public static String generateDescription(Identifier superElement, Identifier subElement, BasicActivity action) {
		String result = "";
		if (action.equals(BasicActivity.ADD)) {
			result += "Add ";
		} else if (action.equals(BasicActivity.REMOVE)) {
			result += "Remove ";
		} else if (action.equals(BasicActivity.MODIFY)) {
			result += "Modify ";
		}
		result += subElement.eClass().getName() + " " + subElement.getId();
		if (action.equals(BasicActivity.ADD)) {
			result += " to ";
		} else if (action.equals(BasicActivity.REMOVE)) {
			result += " from ";
		} else if (action.equals(BasicActivity.MODIFY)) {
			result += " of ";
		}
		result += superElement.eClass().getName() + " " + superElement.getId() + ".";
		return result;
	}

}
