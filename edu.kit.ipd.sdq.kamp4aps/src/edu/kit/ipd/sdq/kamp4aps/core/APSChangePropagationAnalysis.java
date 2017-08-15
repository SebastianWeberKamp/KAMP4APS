package edu.kit.ipd.sdq.kamp4aps.core;

import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup.BusComponentsParams;
import edu.kit.ipd.sdq.kamp4aps.core.changepropagation.ComponentChanges;
import edu.kit.ipd.sdq.kamp4aps.core.changepropagation.InterfaceChanges;
import edu.kit.ipd.sdq.kamp4aps.core.changepropagation.ModuleChanges;
import edu.kit.ipd.sdq.kamp4aps.core.changepropagation.StructureChanges;
import edu.kit.ipd.sdq.kamp4aps.core.scenarios.BusChanges;
import edu.kit.ipd.sdq.kamp4aps.core.scenarios.SensorChanges;
import edu.kit.ipd.sdq.kamp4aps.core.scenarios.SignalInterfacePropagation;
import edu.kit.ipd.sdq.kamp4aps.core.scenarios.SwitchChanges;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ChangePropagationDueToHardwareChange;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyBusBox;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyBusCable;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyBusMaster;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyBusSlave;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyComponent;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyInterface;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyModule;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyStructure;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModificationmarksFactory;
import xPPU.Plant;
import xPPU.BusComponents.BusBox;
import xPPU.BusComponents.BusCable;
import xPPU.BusComponents.BusMaster;
import xPPU.BusComponents.BusSlave;
import xPPU.ComponentRepository.Component;
import xPPU.ComponentRepository.MicroswitchModule;
import xPPU.ComponentRepository.Sensor;
import xPPU.InterfaceRepository.Interface;
import xPPU.InterfaceRepository.PhysicalConnection;
import xPPU.InterfaceRepository.SignalInterface;
import xPPU.ModuleRepository.Module;
import xPPU.StructureRepository.Structure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import edu.kit.ipd.sdq.kamp.propagation.AbstractChangePropagationAnalysis;
/**
 * The change propagation analysis of KAMP4APS
 * 1. determines a seed population of affected components (resp. provided roles)
 * 2. calculates in iterations:
 *    a) inter-component propagation
 *    b) intra-component propagation
 * 3. generates internal modification marks for affected elements
 * 
 * - elements which were already part of a seed population are not further investigated
 * 
 * 
 * @author Sandro Koch
 *
 */
public class APSChangePropagationAnalysis implements AbstractChangePropagationAnalysis<APSArchitectureVersion> {
	
	private ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange;
	private SensorChanges scenarioZero;
	private SwitchChanges scenarioOne;
	private BusChanges scenarioTwo;
	private SignalInterfacePropagation siPropagation;
	
	@Override
	public void runChangePropagationAnalysis(APSArchitectureVersion version) {
		// Setup
		setChangePropagationDueToHardwareChange(ModificationmarksFactory.eINSTANCE.createChangePropagationDueToHardwareChange());
		
		// Calculate
		do {
			changePropagationDueToHardwareChange.setChanged(false);
			calculateAndMarkFromStructurePropagation(version);
			System.out.println(changePropagationDueToHardwareChange.isChanged());
			calculateAndMarkFromModulePropagation(version);
			System.out.println(changePropagationDueToHardwareChange.isChanged());
			calculateAndMarkFromComponentPropagation(version);
			System.out.println(changePropagationDueToHardwareChange.isChanged());
			calculateAndMarkFromInterfacePropagation(version);
			System.out.println(changePropagationDueToHardwareChange.isChanged());
		} while(changePropagationDueToHardwareChange.isChanged());
		
			
		// Update
		addAllChangePropagations(version);
	}

	private void calculateAndMarkFromStructurePropagation(APSArchitectureVersion version) {
		StructureChanges sc = new StructureChanges(version);
		sc.addInitialMarkedStructuresToList(changePropagationDueToHardwareChange);
		sc.calculateAndMarkToModulePropagation(changePropagationDueToHardwareChange);
		sc.calculateAndMarkToComponentPropagation(changePropagationDueToHardwareChange);
	}
	
	private void calculateAndMarkFromModulePropagation(APSArchitectureVersion version){
		ModuleChanges mc = new ModuleChanges(version);
		mc.addInitialMarkedModulesToList(changePropagationDueToHardwareChange);
		mc.calculateAndMarkToModulePropagation(changePropagationDueToHardwareChange);
		mc.calculateAndMarkToComponentPropagation(changePropagationDueToHardwareChange);
		mc.calculateAndMarkToInterfacePropagation(changePropagationDueToHardwareChange);
	}
	
	private void calculateAndMarkFromComponentPropagation(APSArchitectureVersion version){
		ComponentChanges cc = new ComponentChanges(version);
		cc.addInitialMarkedModulesToList(changePropagationDueToHardwareChange);
		cc.calculateAndMarkToInterfacePropagation(changePropagationDueToHardwareChange);
	}
	
	private void calculateAndMarkFromInterfacePropagation(APSArchitectureVersion version){
		InterfaceChanges ic = new InterfaceChanges(version);
		ic.addInitialMarkedInterfacesToList(changePropagationDueToHardwareChange);
		ic.calculateAndMarkToModulePropagation(changePropagationDueToHardwareChange);
		ic.calculateAndMarkToComponentPropagation(changePropagationDueToHardwareChange);
		ic.flattenAllModifyInterfaces(changePropagationDueToHardwareChange);
	}

	/**
	 * Scenario 0
	 * Sensor Change
	 */
	protected void calculateAndMarkFromSensorPropagration(APSArchitectureVersion version) {
		scenarioZero = new SensorChanges(version);
		Collection<SignalInterface> signalInterfaceToChange = new ArrayList<SignalInterface>();
		Collection<PhysicalConnection> physicalConnectionToChange = new ArrayList<PhysicalConnection>();
		addSensorModifications(signalInterfaceToChange, physicalConnectionToChange);
	}

		private void addSensorModifications(Collection<SignalInterface> signalInterfaceToChange,
				Collection<PhysicalConnection> physicalConnectionToChange) {
			for (Sensor sensor : scenarioZero.getInitialMarkedSensors()) {
				scenarioZero.addSensorModificationToChangePropagation(sensor, 
						changePropagationDueToHardwareChange,
						signalInterfaceToChange,
						physicalConnectionToChange);
			}
		}
	
	/**
	 * Scenario 1
	 * Replace MicroSwitches with Potentiometers
	 */
	protected void calculateAndMarkReplacementOfMicroSwitch(APSArchitectureVersion version) {
		scenarioOne = new SwitchChanges(version);
		addMicroSwitchModifications();
	}

		private void addMicroSwitchModifications() {
			for (MicroswitchModule microswitchModule : scenarioOne.getInitialMarkedMicroswitchModules()) {
				scenarioOne.addMicroswitchModificationToChangePropagation(microswitchModule, 
						changePropagationDueToHardwareChange);			
			}
		}

	/**
	 * Scenario 2
	 * BusChange
	 */
	protected void calculateAndMarkBusBoxChange(APSArchitectureVersion version){
		scenarioTwo = new BusChanges(version);
		addBusBoxModifications(version);
	}

		private void addBusBoxModifications(APSArchitectureVersion version) {
			BusComponentsParams params = APSArchitectureModelLookup.lookUpChangesBasedOnBusModification(version, scenarioTwo.getInitialMarkedBusBoxes());
			for(BusBox busBox : params.busBoxesToChange){
				ModifyBusBox modifyBusBox = scenarioTwo.createNewModifyBusBox(busBox);
				changePropagationDueToHardwareChange.getBusBoxModifications().add(modifyBusBox);
			}
			for(BusMaster busMaster : params.busMastersToChange){
				ModifyBusMaster modifyBusMaster = scenarioTwo.createNewModifyBusMaster(busMaster, params.causingElementsOfBusMaster.get(busMaster));
				changePropagationDueToHardwareChange.getBusMasterModifications().add(modifyBusMaster);
			}
			for(BusSlave busSlave : params.busSlavesToChange){
				ModifyBusSlave modifyBusSlave = scenarioTwo.createNewModifyBusSlave(busSlave, params.causingElementsOfBusSlave.get(busSlave));
				changePropagationDueToHardwareChange.getBusSlaveModifications().add(modifyBusSlave);
			}
			for(BusCable busCable : params.busCablesToChange){
				ModifyBusCable modifyBusCable = scenarioTwo.createNewModifyBusCable(busCable, params.causingElementsOfBusCable.get(busCable));
				changePropagationDueToHardwareChange.getBusCableModifications().add(modifyBusCable);
			}
		}
		
	protected void calculateAndMarkSignalInterfaceChangen(APSArchitectureVersion version) {
		boolean hasChanged = false;
		do{
			siPropagation = new SignalInterfacePropagation(version);
			Collection<ModifyInterface<Interface>> markedInterfaceChanges = changePropagationDueToHardwareChange.getInterfaceModifications();
			Map<Component, Set<ModifyInterface<Interface>>> changes = APSArchitectureModelLookup.lookUpChangesBasedOnSignalInterfaces(version, markedInterfaceChanges);
			for(Component key : changes.keySet()){
				siPropagation.markChangesBasedOnSignalInterfaces(key, changePropagationDueToHardwareChange, hasChanged);
			}
		}while(hasChanged);
	}
			
	protected void addAllChangePropagations(APSArchitectureVersion version){
		version.getModificationMarkRepository().getChangePropagationSteps().add(changePropagationDueToHardwareChange);
	}
		
	protected void setChangePropagationDueToHardwareChange(ChangePropagationDueToHardwareChange changePropagationDueToDataDependencies) {
		this.changePropagationDueToHardwareChange = changePropagationDueToDataDependencies;
	}


}
