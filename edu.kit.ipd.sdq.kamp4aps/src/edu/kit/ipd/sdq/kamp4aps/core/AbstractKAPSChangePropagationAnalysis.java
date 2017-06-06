package edu.kit.ipd.sdq.kamp4aps.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

import edu.kit.ipd.sdq.kamp.propagation.AbstractChangePropagationAnalysis;
import edu.kit.ipd.sdq.kamp4aps.core.scenarios.SwitchChanges;
import edu.kit.ipd.sdq.kamp4aps.core.ArchitectureModelLookup.BusComponentsParams;
import edu.kit.ipd.sdq.kamp4aps.core.scenarios.BusChanges;
import edu.kit.ipd.sdq.kamp4aps.core.scenarios.SensorChanges;
import edu.kit.ipd.sdq.kamp4aps.core.scenarios.SignalInterfacePropagation;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ChangePropagationDueToHardwareChange;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyBusBox;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyBusCable;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyBusMaster;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyBusSlave;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyInterface;
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

/**
 * Abstract super class, parameterized to enable covariant attributes for
 * different kinds of propagation algorithms. Its also defines some sub-routines
 * of the propagation algorithm, but not the algorithm itself.
 * 
 * @param S
 *            The type of the architecture version.
 * @param T
 *            The type of the ChangePropagationDueToDataDependencies object.
 */
public abstract class AbstractKAPSChangePropagationAnalysis<S extends ArchitectureVersion, T extends ChangePropagationDueToHardwareChange>
		implements AbstractChangePropagationAnalysis<S> {

	private T changePropagationDueToHardwareChange;
	private SensorChanges scenarioZero;
	private SwitchChanges scenarioOne;
	private BusChanges scenarioTwo;
	private SignalInterfacePropagation siPropagation;

	/**
	 * Scenario 0
	 * Sensor Change
	 */
	protected void calculateAndMarkFromSensorPropagration(S version) {
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
	protected void calculateAndMarkReplacementOfMicroSwitch(S version) {
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
	protected void calculateAndMarkBusBoxChange(S version){
		scenarioTwo = new BusChanges(version);
		addBusBoxModifications(version);
	}

		private void addBusBoxModifications(S version) {
			BusComponentsParams params = ArchitectureModelLookup.lookUpChangesBasedOnBusModification(version, scenarioTwo.getInitialMarkedBusBoxes());
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
		
	protected void calculateAndMarkSignalInterfaceChangen(ArchitectureVersion version) {
		boolean hasChanged = false;
		do{
			siPropagation = new SignalInterfacePropagation(version);
			Collection<ModifyInterface<Interface>> markedInterfaceChanges = changePropagationDueToHardwareChange.getInterfaceModifications();
			Map<Component, Set<ModifyInterface<Interface>>> changes = ArchitectureModelLookup.lookUpChangesBasedOnSignalInterfaces(version, markedInterfaceChanges);
			for(Component key : changes.keySet()){
				siPropagation.markChangesBasedOnSignalInterfaces(key, changePropagationDueToHardwareChange, hasChanged);
			}
		}while(hasChanged);
	}
			
	protected void addAllChangePropagations(S version){
		version.getModificationMarkRepository().getChangePropagationSteps().add(changePropagationDueToHardwareChange);
	}
		
	protected void setChangePropagationDueToHardwareChange(T changePropagationDueToDataDependencies) {
		this.changePropagationDueToHardwareChange = changePropagationDueToDataDependencies;
	}
}