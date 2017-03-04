package edu.kit.ipd.sdq.kamp4aps.core.scenarios;

import java.util.Collection;
import java.util.List;

import edu.kit.ipd.sdq.amp.architecture.AMPArchitectureModelLookup;
import modificationmarks.ModificationmarksFactory;
import edu.kit.ipd.sdq.kamp4aps.core.ArchitectureVersion;
import modificationmarks.ChangePropagationDueToHardwareChange;
import modificationmarks.ModifyComponent;
import xPPU.ComponentRepository.Component;
import xPPU.InterfaceRepository.Interface;
import xPPU.InterfaceRepository.SignalInterface;

public class SignalInterfacePropagation {
	private ArchitectureVersion v;
	
	public SignalInterfacePropagation(ArchitectureVersion version){
		v = version;
	}
	
	public Collection<SignalInterface> getMarkedSignalInterfaces(){
		return AMPArchitectureModelLookup.lookUpMarkedObjectsOfAType(v, SignalInterface.class);
	}
	
	public void markChangesBasedOnSignalInterfaces(Component component, ChangePropagationDueToHardwareChange cp){
		List<Interface> interfaces = component.getInterfaces();
		for(Interface i : interfaces){
			if(i instanceof SignalInterface){
				SignalInterface si = (SignalInterface)i;
				for(Component c : v.getXPPUPlant().getComponentRepository().getAllComponentsInPlant()){
					if(c != component && c.getInterfaces().contains(si)){
						ModifyComponent<Component> modifyComponent = ModificationmarksFactory.eINSTANCE.createModifyComponent();
						modifyComponent.setToolderived(true);
						modifyComponent.setAffectedElement(component);
					}
				}
			}
		}
	}
}
