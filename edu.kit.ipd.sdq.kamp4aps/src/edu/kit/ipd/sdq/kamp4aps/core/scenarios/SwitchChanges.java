package edu.kit.ipd.sdq.kamp4aps.core.scenarios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import edu.kit.ipd.sdq.kamp.architecture.ArchitectureModelLookup;
import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ChangePropagationDueToHardwareChange;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyComponent;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyInterface;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyMicroSwitchModule;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyPhysicalConnection;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyStructure;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModificationmarksFactory;
import xPPU.ComponentRepository.Component;
import xPPU.ComponentRepository.MicroswitchModule;
import xPPU.ComponentRepository.TurningTable;
import xPPU.InterfaceRepository.Interface;
import xPPU.InterfaceRepository.PhysicalConnection;
import xPPU.StructureRepository.Structure;

public class SwitchChanges {

	private APSArchitectureVersion version;

	public SwitchChanges(APSArchitectureVersion v) {
		version = v;
	}

	public Collection<MicroswitchModule> getInitialMarkedMicroswitchModules() {
		return ArchitectureModelLookup.lookUpMarkedObjectsOfAType(version, MicroswitchModule.class);
	}

	public ModifyMicroSwitchModule generateModifyMicroswitchModule(
			MicroswitchModule microswitchModule, ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange) {
		
		List<Interface> interfaces = microswitchModule.getInterfaces();
		Collection<MicroswitchModule> initialMarkedMicroswitches = getInitialMarkedMicroswitchModules();
		
		ModifyMicroSwitchModule modifyMicroSwitchModule = ModificationmarksFactory.eINSTANCE
				.createModifyMicroSwitchModule();
		modifyMicroSwitchModule.setToolderived(true);
		modifyMicroSwitchModule.setAffectedElement(microswitchModule);
		modifyMicroSwitchModule.getCausingElements().addAll(initialMarkedMicroswitches);
		modifyMicroSwitchModule.setIsReplaced(true);
		
		for(Component component : version.getXPPUPlant().getComponentRepository().getAllComponentsInPlant()){
			if(component instanceof TurningTable){
				TurningTable tt = (TurningTable)component;
				if(microswitchModule == tt.getMicroswitchModule()){
					ModifyComponent<Component> mtt = ModificationmarksFactory.eINSTANCE.createModifyComponent();
					mtt.setToolderived(true);
					mtt.setAffectedElement(tt);
					mtt.getCausingElements().addAll(initialMarkedMicroswitches);
					
					ModifyStructure<Structure> mcrane = ModificationmarksFactory.eINSTANCE.createModifyStructure();
					mcrane.setToolderived(true);
					mcrane.setAffectedElement(tt.getParent());
					mcrane.getCausingElements().addAll(initialMarkedMicroswitches);
					mcrane.getCausingElements().add(tt);
					
					if(!changePropagationDueToHardwareChange.getComponentModifications().contains(mtt))
						changePropagationDueToHardwareChange.getComponentModifications().add(mtt);
					
					if(!changePropagationDueToHardwareChange.getStructureModifications().contains(mcrane))
						changePropagationDueToHardwareChange.getStructureModifications().add(mcrane);
				}
			}
		}
		List<ModifyInterface<Interface>> modifyInterfaces = new ArrayList<ModifyInterface<Interface>>();
		for(Interface i : interfaces){
			ModifyInterface<Interface> modifyInterface = ModificationmarksFactory.eINSTANCE.createModifyInterface();
			modifyInterface.setToolderived(true);
			modifyInterface.setAffectedElement(i);
			modifyInterface.getCausingElements().add(modifyMicroSwitchModule);
			modifyInterfaces.add(modifyInterface);
		}
		
		changePropagationDueToHardwareChange.getMicroSwitchModuleModifications().add(modifyMicroSwitchModule);
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
