package edu.kit.ipd.sdq.kamp4aps.core.scenarios;

import java.util.List;

import edu.kit.ipd.sdq.kamp4aps.core.ArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.modificationmarksFactory;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ChangePropagationDueToHardwareChange;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyComponent;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyInterface;
import xPPU.ComponentRepository.Component;
import xPPU.InterfaceRepository.Interface;

public class SignalInterfacePropagation {
	private ArchitectureVersion v;

	public SignalInterfacePropagation(ArchitectureVersion version) {
		v = version;
	}

	public void markChangesBasedOnSignalInterfaces(Component component, ChangePropagationDueToHardwareChange cp, boolean hasChanged) {
		List<Interface> interfaces = component.getConnectedInterfaces();
		for(Interface i : interfaces){
			ModifyInterface<Interface> mf = modificationmarksFactory.eINSTANCE.createModifyInterface();
			mf.setToolderived(true);
			mf.setAffectedElement(i);
			mf.getCausingElements().add(component);
			
			boolean isNewInterface = true;
			for(ModifyInterface<Interface> modInterface : cp.getInterfaceModifications()){
				if(modInterface.getAffectedElement() == i){
					isNewInterface = false;
				}
			}
			if(isNewInterface){
				cp.getInterfaceModifications().add(mf);
				hasChanged = true;
			}
		}
		
		boolean isNewComponent = true;
		for(ModifyComponent<Component> modComponent : cp.getComponentModifications()){
			if(modComponent.getAffectedElement() == component)
				isNewComponent = false;
		}
		if(isNewComponent){
			ModifyComponent<Component> modComponent = modificationmarksFactory.eINSTANCE.createModifyComponent();
			modComponent.setAffectedElement(component);
			modComponent.getCausingElements().addAll(interfaces);
			modComponent.setToolderived(true);
			cp.getComponentModifications().add(modComponent);
		}
	}
}
