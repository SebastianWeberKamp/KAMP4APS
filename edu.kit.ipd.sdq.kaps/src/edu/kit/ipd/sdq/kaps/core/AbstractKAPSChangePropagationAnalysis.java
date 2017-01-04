package edu.kit.ipd.sdq.kaps.core;

import java.util.ArrayList;
import java.util.Collection;
import edu.kit.ipd.sdq.amp.propagation.AbstractChangePropagationAnalysis;
import edu.kit.ipd.sdq.kaps.core.scenarios.ScenarioOne;
import edu.kit.ipd.sdq.kaps.core.scenarios.ScenarioTwo;
import edu.kit.ipd.sdq.kaps.core.scenarios.ScenarioZero;
import edu.kit.ipd.sdq.kaps.model.modificationmarks.ChangePropagationDueToHardwareChange;
import edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifyBusBox;
import edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifyBusMaster;
import edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifyBusSlave;
import xPPU.BusComponents.BusBox;
import xPPU.BusComponents.BusMaster;
import xPPU.BusComponents.BusSlave;
import xPPU.ComponentRepository.MicroswitchModule;
import xPPU.ComponentRepository.Sensor;
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
	private ScenarioZero scenarioZero;
	private ScenarioOne scenarioOne;
	private ScenarioTwo scenarioTwo;

	/**
	 * Scenario 0
	 * Sensor Change
	 */
	protected void calculateAndMarkFromSensorPropagration(S version) {
		Collection<SignalInterface> signalInterfaceToChange = new ArrayList<SignalInterface>();
		Collection<PhysicalConnection> physicalConnectionToChange = new ArrayList<PhysicalConnection>();
		addSensorModifications(signalInterfaceToChange, physicalConnectionToChange);
	}

		private void addSensorModifications(Collection<SignalInterface> signalInterfaceToChange,
				Collection<PhysicalConnection> physicalConnectionToChange) {
			for (Sensor sensor : scenarioZero.getInitialMarkedSensors()) {
				scenarioZero.addScenarioModificationToChangePropagation(sensor, 
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
		scenarioOne = new ScenarioOne(version);
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
		scenarioTwo = new ScenarioTwo(version);
		addBusBoxModifications();
		addBusMasterModifications();
		addBusSlaveModifications();
	}
	
		private void addBusBoxModifications() {
			for(BusBox busBox : scenarioTwo.getInitialMarkedBusBox()){
				ModifyBusBox<BusBox> modifyBusBox = scenarioTwo.createNewModifyBusBox(busBox);
				changePropagationDueToHardwareChange.getBusBoxModifications().add(modifyBusBox);
				scenarioTwo.markChangesBasedOnBusBox(busBox, changePropagationDueToHardwareChange);
			}
		}
		
		private void addBusMasterModifications() {
			for(BusMaster busMaster : scenarioTwo.getInitialMarkedBusMaster()){
				ModifyBusMaster<BusMaster> modifyBusMaster = scenarioTwo.createNewModifyBusMaster(busMaster);
				changePropagationDueToHardwareChange.getBusMasterModifications().add(modifyBusMaster);
				scenarioTwo.markChangesBasedOnBusMaster(busMaster, changePropagationDueToHardwareChange);
			}
		}

		private void addBusSlaveModifications() {
			for(BusSlave busSlave : scenarioTwo.getInitialMarkedBusSlave()){
				ModifyBusSlave<BusSlave> modifyBusSlave = scenarioTwo.createNewModifyBusSlave(busSlave);
				changePropagationDueToHardwareChange.getBusSlaveModifications().add(modifyBusSlave);
				scenarioTwo.markChangesBasedOnBusSlave(busSlave, changePropagationDueToHardwareChange);
			}
		}
		
	protected void addAllChangePropagations(S version){
		version.getModificationMarkRepository().getChangePropagationSteps().add(changePropagationDueToHardwareChange);
	}
		
	protected void setChangePropagationDueToHardwareChange(T changePropagationDueToDataDependencies) {
		this.changePropagationDueToHardwareChange = changePropagationDueToDataDependencies;
	}
	
}
