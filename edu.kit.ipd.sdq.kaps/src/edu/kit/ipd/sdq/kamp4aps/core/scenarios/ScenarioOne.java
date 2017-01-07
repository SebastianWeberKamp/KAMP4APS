package edu.kit.ipd.sdq.kamp4aps.core.scenarios;

import java.util.Collection;

import edu.kit.ipd.sdq.amp.architecture.AMPArchitectureModelLookup;
import edu.kit.ipd.sdq.kamp4aps.core.ArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ChangePropagationDueToHardwareChange;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyMicroSwitchModule;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.modificationmarksFactory;
import xPPU.ComponentRepository.MicroswitchModule;

public class ScenarioOne {

	private ArchitectureVersion version;

	public ScenarioOne(ArchitectureVersion v) {
		version = v;
	}

	public Collection<MicroswitchModule> getInitialMarkedMicroswitchModules() {
		return AMPArchitectureModelLookup.lookUpMarkedObjectsOfAType(version, MicroswitchModule.class);
	}

	public ModifyMicroSwitchModule<MicroswitchModule> generateModifyMicroswitchModule(
			Collection<MicroswitchModule> initialMarkedMicroswitches, MicroswitchModule microswitchModule) {
		ModifyMicroSwitchModule<MicroswitchModule> modifyMicroSwitchModule = modificationmarksFactory.eINSTANCE
				.createModifyMicroSwitchModule();
		modifyMicroSwitchModule.setToolderived(true);
		modifyMicroSwitchModule.setAffectedElement(microswitchModule);
		modifyMicroSwitchModule.getCausingElements().addAll(initialMarkedMicroswitches);
		modifyMicroSwitchModule.setIsReplaced(true);
		return modifyMicroSwitchModule;
	}
	
	public void addMicroswitchModificationToChangePropagation(MicroswitchModule microswitchModule, ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange) {
		Collection<MicroswitchModule> initialMarkedMicroswitches = getInitialMarkedMicroswitchModules();
		changePropagationDueToHardwareChange.getMicroSwitchModuleModifications().add(generateModifyMicroswitchModule(
				initialMarkedMicroswitches, microswitchModule));
	}
}
