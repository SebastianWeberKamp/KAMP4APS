package edu.kit.ipd.sdq.kamp4aps.core.scenarios;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import edu.kit.ipd.sdq.amp.architecture.AMPArchitectureModelLookup;
import edu.kit.ipd.sdq.kamp4aps.core.ArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ChangePropagationDueToHardwareChange;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyBusBox;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyBusCable;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyBusMaster;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyBusSlave;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.modificationmarksFactory;
import xPPU.BusComponents.BusBox;
import xPPU.BusComponents.BusCable;
import xPPU.BusComponents.BusComponentsFactory;
import xPPU.BusComponents.BusMaster;
import xPPU.BusComponents.BusSlave;
import xPPU.InterfaceRepository.SignalInterface;

public class ScenarioTwo {

	private ArchitectureVersion version;

	public ScenarioTwo(ArchitectureVersion v) {
		version = v;
	}

	public Collection<BusBox> getInitialMarkedBusBox() {
		return AMPArchitectureModelLookup.lookUpMarkedObjectsOfAType(version, BusBox.class);
	}
	public Collection<BusMaster> getInitialMarkedBusMaster() {
		return AMPArchitectureModelLookup.lookUpMarkedObjectsOfAType(version, BusMaster.class);
	}
	public Collection<BusSlave> getInitialMarkedBusSlave() {
		return AMPArchitectureModelLookup.lookUpMarkedObjectsOfAType(version, BusSlave.class);
	}
	
	public Collection<BusCable> getInitialMarkedBusCable() {
		return AMPArchitectureModelLookup.lookUpMarkedObjectsOfAType(version, BusCable.class);
	}

	public ModifyBusBox<BusBox> createNewModifyBusBox(BusBox busBox) {
		Collection<BusBox> initialMarkedBusBoxes = getInitialMarkedBusBox();
		ModifyBusBox<BusBox> modifyBusBox = modificationmarksFactory.eINSTANCE.createModifyBusBox();
		modifyBusBox.setToolderived(true);
		modifyBusBox.setAffectedElement(busBox);
		modifyBusBox.getCausingElements().addAll(initialMarkedBusBoxes);
		return modifyBusBox;
	}
	
	public ModifyBusMaster<BusMaster> createNewModifyBusMaster(BusMaster busMaster) {
		ModifyBusMaster<BusMaster> modifyBusMaster = modificationmarksFactory.eINSTANCE.createModifyBusMaster();
		modifyBusMaster.setToolderived(true);
		modifyBusMaster.setAffectedElement(busMaster);
		modifyBusMaster.getCausingElements().addAll(getInitialMarkedBusMaster());
		return modifyBusMaster;
	}
	
	public ModifyBusSlave<BusSlave> createNewModifyBusSlave(BusSlave busSlave) {
		ModifyBusSlave<BusSlave> modifyBusSlave = modificationmarksFactory.eINSTANCE.createModifyBusSlave();
		modifyBusSlave.setToolderived(true);
		modifyBusSlave.setAffectedElement(busSlave);
		modifyBusSlave.getCausingElements().addAll(getInitialMarkedBusMaster());
		return modifyBusSlave;
	}
	
	public void markChangesBasedOnBusBox(BusBox busBox, ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange){
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
							modifyBusMaster.getCausingElements().addAll(getInitialMarkedBusBox());
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
							modifyBusSlave.getCausingElements().addAll(getInitialMarkedBusBox());
							changePropagationDueToHardwareChange.getBusSlaveModifications().add(modifyBusSlave);
						}
					}
				} else if (object instanceof BusCable){
					BusCable busCable = ((BusCable)object);
					ModifyBusCable<BusCable> modifyBusCable = modificationmarksFactory.eINSTANCE.createModifyBusCable();
					modifyBusCable.setToolderived(true);
					modifyBusCable.setAffectedElement(busCable);
					modifyBusCable.getCausingElements().addAll(getInitialMarkedBusBox());
					changePropagationDueToHardwareChange.getBusCableModifications().add(modifyBusCable);
				}
			}
		}
	}
	
	public void markChangesBasedOnBusMaster(BusMaster busMaster, ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange){
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
							modifyBusMaster.getCausingElements().addAll(getInitialMarkedBusMaster());
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
							modifyBusSlave.getCausingElements().addAll(getInitialMarkedBusSlave());
							changePropagationDueToHardwareChange.getBusSlaveModifications().add(modifyBusSlave);
						}
					}
				} else if (object instanceof BusCable){
					BusCable busCable = ((BusCable)object);
					ModifyBusCable<BusCable> modifyBusCable = modificationmarksFactory.eINSTANCE.createModifyBusCable();
					modifyBusCable.setToolderived(true);
					modifyBusCable.setAffectedElement(busCable);
					modifyBusCable.getCausingElements().addAll(getInitialMarkedBusCable());
					changePropagationDueToHardwareChange.getBusCableModifications().add(modifyBusCable);
				}
			}
		}
	}
	
	public void markChangesBasedOnBusSlave(BusSlave busSlave, ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange){
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
							modifyBusMaster.getCausingElements().addAll(getInitialMarkedBusMaster());
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
                        modifyBusSlave.getCausingElements().addAll(getInitialMarkedBusSlave());
                        changePropagationDueToHardwareChange.getBusSlaveModifications().add(modifyBusSlave);
                    }
                }
            }
        }
	}


}
