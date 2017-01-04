package edu.kit.ipd.sdq.kaps.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import edu.kit.ipd.sdq.amp.architecture.AMPArchitectureModelLookup;
import edu.kit.ipd.sdq.amp.propagation.AbstractChangePropagationAnalysis;
import edu.kit.ipd.sdq.kaps.model.modificationmarks.ChangePropagationDueToHardwareChange;
import edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifyBusBox;
import edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifyBusCable;
import edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifyBusMaster;
import edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifyBusSlave;
import edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifyMicroSwitchModule;
import edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifyPhysicalConnection;
import edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifySensor;
import edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifySignalinterface;
import edu.kit.ipd.sdq.kaps.model.modificationmarks.modificationmarksFactory;
import xPPU.BusComponents.BusBox;
import xPPU.BusComponents.BusCable;
import xPPU.BusComponents.BusComponentsFactory;
import xPPU.BusComponents.BusMaster;
import xPPU.BusComponents.BusSlave;
import xPPU.BusComponents.impl.BusMasterImpl;
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

	/**
	 * Scenario 0
	 * Sensor Change
	 */
	protected void calculateAndMarkFromSensorPropagration(S version) {
		Collection<Sensor> initialMarkedSensors = AMPArchitectureModelLookup.lookUpMarkedObjectsOfAType(version,
				Sensor.class);
		Collection<SignalInterface> signalInterfaceToChange = new ArrayList<SignalInterface>();
		Collection<PhysicalConnection> physicalConnectionToChange = new ArrayList<PhysicalConnection>();

		for (Sensor sensor : initialMarkedSensors) {
			signalInterfaceToChange.add(sensor.getSignalinterface());
			physicalConnectionToChange.add(sensor.getPhysicalconnection());
			ModifySensor<Sensor> modifySensor = modificationmarksFactory.eINSTANCE.createModifySensor();
			modifySensor.setToolderived(true);
			modifySensor.setAffectedElement(sensor);
			modifySensor.getCausingElements().addAll(initialMarkedSensors);
		
			for(SignalInterface signalInterface : signalInterfaceToChange){
				if(signalInterface != null){
					ModifySignalinterface<SignalInterface> msi = modificationmarksFactory.eINSTANCE.createModifySignalinterface();
					msi.setToolderived(true);
					msi.setAffectedElement(signalInterface);
					msi.getCausingElements().add(sensor);
					modifySensor.getModifySignalInterfaces().add(signalInterface);
				}
			}
			
			for(PhysicalConnection physicalConnection : physicalConnectionToChange){
				if(physicalConnection != null){
					ModifyPhysicalConnection<PhysicalConnection> mpc = modificationmarksFactory.eINSTANCE.createModifyPhysicalConnection();
					mpc.setToolderived(true);
					mpc.setAffectedElement(physicalConnection);
					mpc.getCausingElements().add(sensor);
					modifySensor.getModifyPhysicalConnections().add(physicalConnection);
				}
			}
			
			changePropagationDueToHardwareChange.getSensorModifications().add(modifySensor);			
		}
	}
	
	/**
	 * Scenario 1
	 * Replace MicroSwitches with Potentiometers
	 */
	protected void calculateAndMarkReplacementOfMicroSwitch(S version) {
		Collection<MicroswitchModule> initialMarkedMicroswitches = AMPArchitectureModelLookup.lookUpMarkedObjectsOfAType(version,
				MicroswitchModule.class);

		for (MicroswitchModule microswitchModule : initialMarkedMicroswitches) {
			ModifyMicroSwitchModule<MicroswitchModule> modifyMicroSwitchModule = modificationmarksFactory.eINSTANCE.createModifyMicroSwitchModule();
			modifyMicroSwitchModule.setToolderived(true);
			modifyMicroSwitchModule.setAffectedElement(microswitchModule);
			modifyMicroSwitchModule.getCausingElements().addAll(initialMarkedMicroswitches);
			modifyMicroSwitchModule.setIsReplaced(true);

			changePropagationDueToHardwareChange.getMicroSwitchModuleModifications().add(modifyMicroSwitchModule);			
		}
	}
	
	/**
	 * Scenario 2
	 * 
	 */
	protected void calculateAndMarkBusBoxChange(S version){
		Collection<BusBox> initialMarkedBusBoxes = AMPArchitectureModelLookup.lookUpMarkedObjectsOfAType(version, 
				BusBox.class);
		Collection<BusMaster> initialMarkedBusMasters = AMPArchitectureModelLookup.lookUpMarkedObjectsOfAType(version, 
				BusMaster.class);
		Collection<BusSlave> initialMarkedBusSlaves = AMPArchitectureModelLookup.lookUpMarkedObjectsOfAType(version, 
				BusSlave.class);
		
		for(BusBox busBox : initialMarkedBusBoxes){
			ModifyBusBox<BusBox> modifyBusBox = createNewModifyBusBox(initialMarkedBusBoxes, busBox);
			changePropagationDueToHardwareChange.getBusBoxModifications().add(modifyBusBox);
			
			markChangesBasedOnBusBox(busBox, initialMarkedBusBoxes);
		}
		
		for(BusMaster busMaster : initialMarkedBusMasters){
			ModifyBusMaster<BusMaster> modifyBusMaster = createNewModifyBusMaster(initialMarkedBusMasters, busMaster);
			changePropagationDueToHardwareChange.getBusMasterModifications().add(modifyBusMaster);
			
			markChangesBasedOnBusMaster(busMaster, initialMarkedBusMasters);
		}
		
		for(BusSlave busSlave : initialMarkedBusSlaves){
			ModifyBusSlave<BusSlave> modifyBusSlave = createNewModifyBusSlave(initialMarkedBusSlaves, busSlave);
			changePropagationDueToHardwareChange.getBusSlaveModifications().add(modifyBusSlave);
			
			markChangesBasedOnBusSlave(busSlave, initialMarkedBusMasters);
		}
	}

		private ModifyBusBox<BusBox> createNewModifyBusBox(Collection<BusBox> initialMarkedBusBoxes, BusBox busBox) {
			ModifyBusBox<BusBox> modifyBusBox = modificationmarksFactory.eINSTANCE.createModifyBusBox();
			modifyBusBox.setToolderived(true);
			modifyBusBox.setAffectedElement(busBox);
			modifyBusBox.getCausingElements().addAll(initialMarkedBusBoxes);
			return modifyBusBox;
		}
	
		private void markChangesBasedOnBusBox(BusBox busBox, Collection<? extends EObject> initialMarks){
			SignalInterface siMaster = busBox.getSignalinterface_master();
			if(siMaster != null){
				EList<EObject> objectsOfBusComponents = BusComponentsFactory.eINSTANCE.eContents();
				for(EObject object : objectsOfBusComponents){
					if(object instanceof BusMaster){
						EList<SignalInterface> sis = ((BusMaster)object).getSignalinterfaces();
						for(SignalInterface si : sis){
							if(si == siMaster){
								BusMaster bm = (BusMaster) object;
								ModifyBusMaster<BusMaster> modifyBusMaster = modificationmarksFactory.eINSTANCE.createModifyBusMaster();
								modifyBusMaster.setToolderived(true);
								modifyBusMaster.setAffectedElement(bm);
								modifyBusMaster.getCausingElements().addAll(initialMarks);
								changePropagationDueToHardwareChange.getBusMasterModifications().add(modifyBusMaster);
							}
						}
					}
				}
			}
			
			EList<SignalInterface> siSlaves = busBox.getSignalinterfaces();
			if(siSlaves != null){
				EList<EObject> objectsOfBusComponents = BusComponentsFactory.eINSTANCE.eContents();
				for(EObject object : objectsOfBusComponents){
					if(object instanceof BusSlave){
						SignalInterface slaveSignalInterface = ((BusSlave)object).getSignalinterface_slave();
						for(SignalInterface si : siSlaves){
							if(si == slaveSignalInterface){
								BusSlave bs = (BusSlave) object;
								ModifyBusSlave<BusSlave> modifyBusSlave = modificationmarksFactory.eINSTANCE.createModifyBusSlave();
								modifyBusSlave.setToolderived(true);
								modifyBusSlave.setAffectedElement(bs);
								modifyBusSlave.getCausingElements().addAll(initialMarks);
								changePropagationDueToHardwareChange.getBusSlaveModifications().add(modifyBusSlave);
							}
						}
					} else if (object instanceof BusCable){
						BusCable busCable = ((BusCable)object);
						ModifyBusCable<BusCable> modifyBusCable = modificationmarksFactory.eINSTANCE.createModifyBusCable();
						modifyBusCable.setToolderived(true);
						modifyBusCable.setAffectedElement(busCable);
						modifyBusCable.getCausingElements().addAll(initialMarks);
						changePropagationDueToHardwareChange.getBusCableModifications().add(modifyBusCable);
					}
				}
			}
		}
		
		private ModifyBusMaster<BusMaster> createNewModifyBusMaster(Collection<BusMaster> initialMarkedBusMasters, BusMaster busMaster) {
			ModifyBusMaster<BusMaster> modifyBusMaster = modificationmarksFactory.eINSTANCE.createModifyBusMaster();
			modifyBusMaster.setToolderived(true);
			modifyBusMaster.setAffectedElement(busMaster);
			modifyBusMaster.getCausingElements().addAll(initialMarkedBusMasters);
			return modifyBusMaster;
		}
		
		private void markChangesBasedOnBusMaster(BusMaster busMaster, Collection<? extends EObject> initialMarks){
			SignalInterface siController = busMaster.getSignalinterface_controller();
			if(siController != null){
				EList<EObject> objectsOfBusComponents = BusComponentsFactory.eINSTANCE.eContents();
				for(EObject object : objectsOfBusComponents){
					if(object instanceof BusMaster){
						EList<SignalInterface> sis = ((BusMaster)object).getSignalinterfaces();
						for(SignalInterface si : sis){
							if(si == siController){
								BusMaster bm = (BusMaster) object;
								ModifyBusMaster<BusMaster> modifyBusMaster = modificationmarksFactory.eINSTANCE.createModifyBusMaster();
								modifyBusMaster.setToolderived(true);
								modifyBusMaster.setAffectedElement(bm);
								modifyBusMaster.getCausingElements().addAll(initialMarks);
								changePropagationDueToHardwareChange.getBusMasterModifications().add(modifyBusMaster);
							}
						}
					}
				}
			}
			
			EList<SignalInterface> siSlaves = busMaster.getSignalinterfaces();
			if(siSlaves != null){
				EList<EObject> objectsOfBusComponents = BusComponentsFactory.eINSTANCE.eContents();
				for(EObject object : objectsOfBusComponents){
					if(object instanceof BusSlave){
						SignalInterface slaveSignalInterface = ((BusSlave)object).getSignalinterface_slave();
						for(SignalInterface si : siSlaves){
							if(si == slaveSignalInterface){
								BusSlave bs = (BusSlave) object;
								ModifyBusSlave<BusSlave> modifyBusSlave = modificationmarksFactory.eINSTANCE.createModifyBusSlave();
								modifyBusSlave.setToolderived(true);
								modifyBusSlave.setAffectedElement(bs);
								modifyBusSlave.getCausingElements().addAll(initialMarks);
								changePropagationDueToHardwareChange.getBusSlaveModifications().add(modifyBusSlave);
							}
						}
					} else if (object instanceof BusCable){
						BusCable busCable = ((BusCable)object);
						ModifyBusCable<BusCable> modifyBusCable = modificationmarksFactory.eINSTANCE.createModifyBusCable();
						modifyBusCable.setToolderived(true);
						modifyBusCable.setAffectedElement(busCable);
						modifyBusCable.getCausingElements().addAll(initialMarks);
						changePropagationDueToHardwareChange.getBusCableModifications().add(modifyBusCable);
					}
				}
			}
		}
	
		private ModifyBusSlave<BusSlave> createNewModifyBusSlave(Collection<BusSlave> initialMarkedBusSlaves, BusSlave busSlave) {
			ModifyBusSlave<BusSlave> modifyBusSlave = modificationmarksFactory.eINSTANCE.createModifyBusSlave();
			modifyBusSlave.setToolderived(true);
			modifyBusSlave.setAffectedElement(busSlave);
			modifyBusSlave.getCausingElements().addAll(initialMarkedBusSlaves);
			return modifyBusSlave;
		}
		
		private void markChangesBasedOnBusSlave(BusSlave busSlave, Collection<? extends EObject> initialMarks){
			SignalInterface siMaster = busSlave.getSignalinterface_master();
			if(siMaster != null){
				EList<EObject> objectsOfBusComponents = BusComponentsFactory.eINSTANCE.eContents();
				for(EObject object : objectsOfBusComponents){
					if(object instanceof BusMaster){
						EList<SignalInterface> sis = ((BusMaster)object).getSignalinterfaces();
						for(SignalInterface si : sis){
							if(si == siMaster){
								BusMaster bm = (BusMaster) object;
								ModifyBusMaster<BusMaster> modifyBusMaster = modificationmarksFactory.eINSTANCE.createModifyBusMaster();
								modifyBusMaster.setToolderived(true);
								modifyBusMaster.setAffectedElement(bm);
								modifyBusMaster.getCausingElements().addAll(initialMarks);
								changePropagationDueToHardwareChange.getBusMasterModifications().add(modifyBusMaster);
							}
						}
					}
				}
			}
			
            SignalInterface siSlave = busSlave.getSignalinterface_slave();
            if(siSlave != null){
                EList<EObject> objectsOfBusComponents = BusComponentsFactory.eINSTANCE.eContents();
                for(EObject object : objectsOfBusComponents){
                    if(object instanceof BusSlave){
                        if(object == siSlave){
                            BusSlave bs = (BusSlave) object;
                            ModifyBusSlave<BusSlave> modifyBusSlave = modificationmarksFactory.eINSTANCE.createModifyBusSlave();
                            modifyBusSlave.setToolderived(true);
                            modifyBusSlave.setAffectedElement(bs);
                            modifyBusSlave.getCausingElements().addAll(initialMarks);
                            changePropagationDueToHardwareChange.getBusSlaveModifications().add(modifyBusSlave);
                        }
                    }
                }
            }
			
		}
		
	protected void addAllChangePropagations(S version){
		version.getModificationMarkRepository().getChangePropagationSteps().add(changePropagationDueToHardwareChange);
	}
		
	protected void setChangePropagationDueToHardwareChange(T changePropagationDueToDataDependencies) {
		this.changePropagationDueToHardwareChange = changePropagationDueToDataDependencies;
	}
	
}
