package edu.kit.ipd.sdq.kamp4aps.core.scenarios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import edu.kit.ipd.sdq.kamp.architecture.ArchitectureModelLookup;
import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps.core.changepropagation.Change;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyComponent;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyInterface;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyMicroSwitchModule;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyPhysicalConnection;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyStructure;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSModificationmarksFactory;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.MicroswitchModule;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.TurningTable;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Interface;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.PhysicalConnection;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Structure;

public class SwitchChanges extends Change {

	public SwitchChanges(APSArchitectureVersion v) {
		super(v);
	}

	public Collection<MicroswitchModule> getInitialMarkedMicroswitchModules() {
		return ArchitectureModelLookup.lookUpMarkedObjectsOfAType(version, MicroswitchModule.class);
	}

	public ModifyMicroSwitchModule generateModifyMicroswitchModule(
			MicroswitchModule microswitchModule, ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange) {
		
		List<Interface> interfaces = microswitchModule.getInterfaces();
		Collection<MicroswitchModule> initialMarkedMicroswitches = getInitialMarkedMicroswitchModules();
		
		ModifyMicroSwitchModule modifyMicroSwitchModule = KAMP4aPSModificationmarksFactory.eINSTANCE
				.createModifyMicroSwitchModule();
		modifyMicroSwitchModule.setToolderived(true);
		modifyMicroSwitchModule.setAffectedElement(microswitchModule);
		modifyMicroSwitchModule.getCausingElements().addAll(initialMarkedMicroswitches);
		modifyMicroSwitchModule.setIsReplaced(true);
		
		for(Component component : version.getAPSPlant().getComponentRepository().getAllComponentsInPlant()){
			if(component instanceof TurningTable){
				TurningTable tt = (TurningTable)component;
				if(microswitchModule == tt.getMicroswitchModule()){
					ModifyComponent<Component> mtt = KAMP4aPSModificationmarksFactory.eINSTANCE.createModifyComponent();
					mtt.setToolderived(true);
					mtt.setAffectedElement(tt);
					mtt.getCausingElements().addAll(initialMarkedMicroswitches);
					
					ModifyStructure<Structure> mcrane = KAMP4aPSModificationmarksFactory.eINSTANCE.createModifyStructure();
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
			ModifyInterface<Interface> modifyInterface = KAMP4aPSModificationmarksFactory.eINSTANCE.createModifyInterface();
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
