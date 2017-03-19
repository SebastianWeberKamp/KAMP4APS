package edu.kit.ipd.sdq.kamp4aps.core.scenarios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import edu.kit.ipd.sdq.amp.architecture.AMPArchitectureModelLookup;
import edu.kit.ipd.sdq.kamp4aps.core.ArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ChangePropagationDueToHardwareChange;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyBusMaster;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyInterface;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyMicroSwitchModule;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyPhysicalConnection;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.modificationmarksFactory;
import xPPU.Plant;
import xPPU.BusComponents.BusMaster;
import xPPU.ComponentRepository.Component;
import xPPU.ComponentRepository.MicroswitchModule;
import xPPU.InterfaceRepository.Interface;
import xPPU.InterfaceRepository.PhysicalConnection;
import xPPU.InterfaceRepository.SignalInterface;

public class SwitchChanges {

	private ArchitectureVersion version;

	public SwitchChanges(ArchitectureVersion v) {
		version = v;
	}

	public Collection<MicroswitchModule> getInitialMarkedMicroswitchModules() {
		return AMPArchitectureModelLookup.lookUpMarkedObjectsOfAType(version, MicroswitchModule.class);
	}

	public ModifyMicroSwitchModule generateModifyMicroswitchModule(
			MicroswitchModule microswitchModule, ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange) {
		
		PhysicalConnection physicalConnectionSwitch = microswitchModule.getPhysicalconnection();
		List<Interface> interfaces = microswitchModule.getConnectedInterfaces();
		Collection<MicroswitchModule> initialMarkedMicroswitches = getInitialMarkedMicroswitchModules();
		
		ModifyMicroSwitchModule modifyMicroSwitchModule = modificationmarksFactory.eINSTANCE
				.createModifyMicroSwitchModule();
		modifyMicroSwitchModule.setToolderived(true);
		modifyMicroSwitchModule.setAffectedElement(microswitchModule);
		modifyMicroSwitchModule.getCausingElements().addAll(initialMarkedMicroswitches);
		modifyMicroSwitchModule.setIsReplaced(true);
		
		ModifyPhysicalConnection modifyPhysicalConnection = modificationmarksFactory.eINSTANCE.createModifyPhysicalConnection();
		modifyPhysicalConnection.setToolderived(true);
		modifyPhysicalConnection.setAffectedElement(physicalConnectionSwitch);
		modifyPhysicalConnection.getCausingElements().add(modifyMicroSwitchModule);
		
		List<ModifyInterface<Interface>> modifyInterfaces = new ArrayList<ModifyInterface<Interface>>();
		for(Interface i : interfaces){
			ModifyInterface<Interface> modifyInterface = modificationmarksFactory.eINSTANCE.createModifyInterface();
			modifyInterface.setToolderived(true);
			modifyInterface.setAffectedElement(i);
			modifyInterface.getCausingElements().add(modifyMicroSwitchModule);
			modifyInterfaces.add(modifyInterface);
		}
		
		changePropagationDueToHardwareChange.getMicroSwitchModuleModifications().add(modifyMicroSwitchModule);
		changePropagationDueToHardwareChange.getPhysicalConnectionModifications().add(modifyPhysicalConnection);
		for(ModifyInterface<Interface> mInterface : modifyInterfaces){
			changePropagationDueToHardwareChange.getInterfaceModifications().add(mInterface);
		}
		return modifyMicroSwitchModule;
	}
	
	public void addMicroswitchModificationToChangePropagation(MicroswitchModule microswitchModule, ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange) {
		changePropagationDueToHardwareChange.getMicroSwitchModuleModifications().add(generateModifyMicroswitchModule(
				microswitchModule, changePropagationDueToHardwareChange));
	}
}
