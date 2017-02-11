package edu.kit.ipd.sdq.kamp4aps.core;

import java.util.ArrayList;
import java.util.Collection;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import edu.kit.ipd.sdq.amp.propagation.AbstractChangePropagationAnalysis;
import edu.kit.ipd.sdq.kamp4aps.core.scenarios.SwitchChanges;
import edu.kit.ipd.sdq.kamp4aps.core.ArchitectureModelLookup.BusComponentsParams;
import edu.kit.ipd.sdq.kamp4aps.core.scenarios.BusChanges;
import edu.kit.ipd.sdq.kamp4aps.core.scenarios.SensorChanges;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ChangePropagationDueToHardwareChange;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyBusBox;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyBusCable;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyBusMaster;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyBusSlave;
import xPPU.BusComponents.BusBox;
import xPPU.BusComponents.BusCable;
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
	private SensorChanges scenarioZero;
	private SwitchChanges scenarioOne;
	private BusChanges scenarioTwo;

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
//				scenarioTwo.markChangesBasedOnBusBox(busBox, changePropagationDueToHardwareChange);
			}
			for(BusMaster busMaster : params.busMastersToChange){
				ModifyBusMaster modifyBusMaster = scenarioTwo.createNewModifyBusMaster(busMaster);
				changePropagationDueToHardwareChange.getBusMasterModifications().add(modifyBusMaster);
//				scenarioTwo.markChangesBasedOnBusMaster(busMaster, changePropagationDueToHardwareChange);
			}
			for(BusSlave busSlave : params.busSlavesToChange){
				ModifyBusSlave modifyBusSlave = scenarioTwo.createNewModifyBusSlave(busSlave);
				changePropagationDueToHardwareChange.getBusSlaveModifications().add(modifyBusSlave);
//				scenarioTwo.markChangesBasedOnBusSlave(busSlave, changePropagationDueToHardwareChange);
			}
			for(BusCable busCable : params.busCablesToChange){
				ModifyBusCable modifyBusCable = scenarioTwo.createNewModifyBusCable(busCable);
				changePropagationDueToHardwareChange.getBusCableModifications().add(modifyBusCable);
//				scenarioTwo.markChangesBasedOnBusCable(busCable, changePropagationDueToHardwareChange);
			}
		}
		
		private void addBusMasterModifications() {
			for(BusMaster busMaster : scenarioTwo.getInitialMarkedBusMaster()){
				ModifyBusMaster modifyBusMaster = scenarioTwo.createNewModifyBusMaster(busMaster);
				changePropagationDueToHardwareChange.getBusMasterModifications().add(modifyBusMaster);
				scenarioTwo.markChangesBasedOnBusMaster(busMaster, changePropagationDueToHardwareChange);
			}
		}

		private void addBusSlaveModifications() {
			for(BusSlave busSlave : scenarioTwo.getInitialMarkedBusSlave()){
				ModifyBusSlave modifyBusSlave = scenarioTwo.createNewModifyBusSlave(busSlave);
				changePropagationDueToHardwareChange.getBusSlaveModifications().add(modifyBusSlave);
				scenarioTwo.markChangesBasedOnBusSlave(busSlave, changePropagationDueToHardwareChange);
			}
		}
		
		private void removeDuplicates() {
			removeModifyBusBoxDuplicates();
			removeModifyBusMasterDuplicates();
			removeModifyBusSlaveDuplicates();
			removeModifyBusCableDuplicates();
		}

			private void removeModifyBusBoxDuplicates() {
				EList<ModifyBusBox> tmpMods = new BasicEList<ModifyBusBox>();
				for(ModifyBusBox mod : changePropagationDueToHardwareChange.getBusBoxModifications()){
					boolean isDuplicate = false;
					for(ModifyBusBox tmpMod : tmpMods){
						if(mod.getId() == tmpMod.getId()){
							isDuplicate = true;
						}						
					}
					if(!isDuplicate)
						tmpMods.add(mod);
				}
				System.out.println(changePropagationDueToHardwareChange.getBusBoxModifications().size());
				changePropagationDueToHardwareChange.getBusBoxModifications().clear();
				System.out.println(changePropagationDueToHardwareChange.getBusBoxModifications().size());
				for(ModifyBusBox mod : tmpMods){
					changePropagationDueToHardwareChange.getBusBoxModifications().add(mod);
				}
			}
			
			private void removeModifyBusMasterDuplicates() {
				EList<ModifyBusMaster> tmpMods = new BasicEList<ModifyBusMaster>();
				for(ModifyBusMaster mod : changePropagationDueToHardwareChange.getBusMasterModifications()){
					boolean isDuplicate = false;
					for(ModifyBusMaster tmpMod : tmpMods){
						if(mod.getId() == tmpMod.getId()){
							isDuplicate = true;
						}						
					}
					if(!isDuplicate)
						tmpMods.add(mod);
				}
				System.out.println(changePropagationDueToHardwareChange.getBusMasterModifications().size());
				changePropagationDueToHardwareChange.getBusMasterModifications().clear();
				System.out.println(changePropagationDueToHardwareChange.getBusMasterModifications().size());
				for(ModifyBusMaster mod : tmpMods){
					changePropagationDueToHardwareChange.getBusMasterModifications().add(mod);
				}
			}
			
			private void removeModifyBusSlaveDuplicates() {
				EList<ModifyBusSlave> tmpMods = new BasicEList<ModifyBusSlave>();
				for(ModifyBusSlave mod : changePropagationDueToHardwareChange.getBusSlaveModifications()){
					boolean isDuplicate = false;
					for(ModifyBusSlave tmpMod : tmpMods){
						if(mod.getId() == tmpMod.getId()){
							isDuplicate = true;
						}						
					}
					if(!isDuplicate)
						tmpMods.add(mod);
				}
				System.out.println(changePropagationDueToHardwareChange.getBusSlaveModifications().size());
				changePropagationDueToHardwareChange.getBusSlaveModifications().clear();
				System.out.println(changePropagationDueToHardwareChange.getBusSlaveModifications().size());
				for(ModifyBusSlave mod : tmpMods){
					changePropagationDueToHardwareChange.getBusSlaveModifications().add(mod);
				}
			}
			
			private void removeModifyBusCableDuplicates() {
				EList<ModifyBusCable> tmpMods = new BasicEList<ModifyBusCable>();
				for(ModifyBusCable mod : changePropagationDueToHardwareChange.getBusCableModifications()){
					boolean isDuplicate = false;
					for(ModifyBusCable tmpMod : tmpMods){
						if(mod.getId() == tmpMod.getId()){
							isDuplicate = true;
						}						
					}
					if(!isDuplicate)
						tmpMods.add(mod);
				}
				System.out.println(changePropagationDueToHardwareChange.getBusCableModifications().size());
				changePropagationDueToHardwareChange.getBusCableModifications().clear();
				System.out.println(changePropagationDueToHardwareChange.getBusCableModifications().size());
				for(ModifyBusCable mod : tmpMods){
					changePropagationDueToHardwareChange.getBusCableModifications().add(mod);
				}
			}

			
	protected void addAllChangePropagations(S version){
		version.getModificationMarkRepository().getChangePropagationSteps().add(changePropagationDueToHardwareChange);
	}
		
	protected void setChangePropagationDueToHardwareChange(T changePropagationDueToDataDependencies) {
		this.changePropagationDueToHardwareChange = changePropagationDueToDataDependencies;
	}
	
}
