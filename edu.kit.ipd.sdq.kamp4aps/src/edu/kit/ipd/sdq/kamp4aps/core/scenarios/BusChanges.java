package edu.kit.ipd.sdq.kamp4aps.core.scenarios;

import java.util.Collection;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import edu.kit.ipd.sdq.kamp.architecture.ArchitectureModelLookup;
import edu.kit.ipd.sdq.kamp4aps.core.ArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ChangePropagationDueToHardwareChange;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyBusBox;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyBusCable;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyBusMaster;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyBusSlave;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.modificationmarksFactory;
import xPPU.Plant;
import xPPU.BusComponents.BusBox;
import xPPU.BusComponents.BusCable;
import xPPU.BusComponents.BusMaster;
import xPPU.BusComponents.BusSlave;
import xPPU.ComponentRepository.Component;
import xPPU.Identifier.Identifier;
import xPPU.InterfaceRepository.SignalInterface;

public class BusChanges {

	private ArchitectureVersion version;

	public BusChanges(ArchitectureVersion v) {
		version = v;
	}

	public Collection<BusBox> getInitialMarkedBusBoxes() {
		return ArchitectureModelLookup.lookUpMarkedObjectsOfAType(version, BusBox.class);
	}
	public Collection<BusMaster> getInitialMarkedBusMaster() {
		return ArchitectureModelLookup.lookUpMarkedObjectsOfAType(version, BusMaster.class);
	}
	public Collection<BusSlave> getInitialMarkedBusSlave() {
		return ArchitectureModelLookup.lookUpMarkedObjectsOfAType(version, BusSlave.class);
	}
	
	public Collection<BusCable> getInitialMarkedBusCable() {
		return ArchitectureModelLookup.lookUpMarkedObjectsOfAType(version, BusCable.class);
	}

	public ModifyBusBox createNewModifyBusBox(BusBox busBox) {
		Collection<BusBox> initialMarkedBusBoxes = getInitialMarkedBusBoxes();
		ModifyBusBox modifyBusBox = modificationmarksFactory.eINSTANCE.createModifyBusBox();
		modifyBusBox.setToolderived(true);
		modifyBusBox.setAffectedElement(busBox);
		modifyBusBox.getCausingElements().addAll(initialMarkedBusBoxes);
		return modifyBusBox;
	}
	
	public ModifyBusMaster createNewModifyBusMaster(BusMaster busMaster, Set<Identifier> causingElements) {
		ModifyBusMaster modifyBusMaster = modificationmarksFactory.eINSTANCE.createModifyBusMaster();
		modifyBusMaster.setToolderived(true);
		modifyBusMaster.setAffectedElement(busMaster);
		modifyBusMaster.getCausingElements().addAll(getInitialMarkedBusMaster());
		modifyBusMaster.getCausingElements().addAll(causingElements);
		return modifyBusMaster;
	}
	
	public ModifyBusSlave createNewModifyBusSlave(BusSlave busSlave, Set<Identifier> causingElements) {
		ModifyBusSlave modifyBusSlave = modificationmarksFactory.eINSTANCE.createModifyBusSlave();
		modifyBusSlave.setToolderived(true);
		modifyBusSlave.setAffectedElement(busSlave);
		modifyBusSlave.getCausingElements().addAll(getInitialMarkedBusSlave());
		modifyBusSlave.getCausingElements().addAll(causingElements);
		return modifyBusSlave;
	}
	
	public ModifyBusCable createNewModifyBusCable(BusCable busCable, Set<Identifier> causingElements) {
		ModifyBusCable modifyBusCable = modificationmarksFactory.eINSTANCE.createModifyBusCable();
		modifyBusCable.setToolderived(true);
		modifyBusCable.setAffectedElement(busCable);
		modifyBusCable.getCausingElements().addAll(getInitialMarkedBusCable());
		modifyBusCable.getCausingElements().addAll(causingElements);
		return modifyBusCable;
	}
	
	public void markChangesBasedOnBusBox(BusBox busBox, ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange){
		SignalInterface siMaster = busBox.getSignalinterface_master();

		Plant xPPUPlant = version.getXPPUPlant();
		EList<Component> xppuComponents = xPPUPlant.getComponentRepository().getAllComponentsInPlant();
		if(siMaster != null){
			for(Component component : xppuComponents){
				if(component instanceof BusMaster){
					EList<SignalInterface> sis = ((BusMaster)component).getSignalinterfaces();
					for(SignalInterface si : sis){
						if(si == siMaster){
							BusMaster bm = (BusMaster) component;
							ModifyBusMaster modifyBusMaster = modificationmarksFactory.eINSTANCE.createModifyBusMaster();
							modifyBusMaster.setToolderived(true);
							modifyBusMaster.setAffectedElement(bm);
							modifyBusMaster.getCausingElements().addAll(getInitialMarkedBusBoxes());
							changePropagationDueToHardwareChange.getBusMasterModifications().add(modifyBusMaster);
						}
					}
				}
			}
		}
		
		EList<SignalInterface> siSlaves = busBox.getSignalinterfaces();
		if(siSlaves != null){
			for(Component component : xppuComponents){
				if(component instanceof BusSlave){
					SignalInterface slaveSignalInterface = ((BusSlave)component).getSignalinterface_slave();
					for(SignalInterface si : siSlaves){
						if(si == slaveSignalInterface){
							BusSlave bs = (BusSlave) component;
							ModifyBusSlave modifyBusSlave = modificationmarksFactory.eINSTANCE.createModifyBusSlave();
							modifyBusSlave.setToolderived(true);
							modifyBusSlave.setAffectedElement(bs);
							modifyBusSlave.getCausingElements().addAll(getInitialMarkedBusBoxes());
							changePropagationDueToHardwareChange.getBusSlaveModifications().add(modifyBusSlave);
						}
					}
				} else if (component instanceof BusCable){
					BusCable busCable = ((BusCable)component);
					ModifyBusCable modifyBusCable = modificationmarksFactory.eINSTANCE.createModifyBusCable();
					modifyBusCable.setToolderived(true);
					modifyBusCable.setAffectedElement(busCable);
					modifyBusCable.getCausingElements().addAll(getInitialMarkedBusBoxes());
					changePropagationDueToHardwareChange.getBusCableModifications().add(modifyBusCable);
				}
			}
		}
	}
	
	public void markChangesBasedOnBusMaster(BusMaster busMaster, ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange){
		SignalInterface siController = busMaster.getSignalinterface_controller();
		
		Plant xPPUPlant = version.getXPPUPlant();
		EList<Component> xppuComponents = xPPUPlant.getComponentRepository().getAllComponentsInPlant();
		
		if(siController != null){
			for(Component component : xppuComponents){
				if(component instanceof BusMaster){
					EList<SignalInterface> sis = ((BusMaster)component).getSignalinterfaces();
					for(SignalInterface si : sis){
						if(si == siController){
							BusMaster bm = (BusMaster) component;
							ModifyBusMaster modifyBusMaster = modificationmarksFactory.eINSTANCE.createModifyBusMaster();
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
			for(Component component : xppuComponents){
				if(component instanceof BusSlave){
					SignalInterface slaveSignalInterface = ((BusSlave)component).getSignalinterface_slave();
					for(SignalInterface si : siSlaves){
						if(si == slaveSignalInterface){
							BusSlave bs = (BusSlave) component;
							ModifyBusSlave modifyBusSlave = modificationmarksFactory.eINSTANCE.createModifyBusSlave();
							modifyBusSlave.setToolderived(true);
							modifyBusSlave.setAffectedElement(bs);
							modifyBusSlave.getCausingElements().addAll(getInitialMarkedBusSlave());
							changePropagationDueToHardwareChange.getBusSlaveModifications().add(modifyBusSlave);
						}
					}
				} else if (component instanceof BusCable){
					BusCable busCable = ((BusCable)component);
					ModifyBusCable modifyBusCable = modificationmarksFactory.eINSTANCE.createModifyBusCable();
					modifyBusCable.setToolderived(true);
					modifyBusCable.setAffectedElement(busCable);
					modifyBusCable.getCausingElements().addAll(getInitialMarkedBusCable());
					changePropagationDueToHardwareChange.getBusCableModifications().add(modifyBusCable);
				}
			}
		}
	}
	
	public void markChangesBasedOnBusSlave(BusSlave busSlave, ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange){
		Plant xPPUPlant = version.getXPPUPlant();
		EList<Component> xppuComponents = xPPUPlant.getComponentRepository().getAllComponentsInPlant();
		
		SignalInterface siMaster = busSlave.getSignalinterface_master();
		if(siMaster != null){
			for(Component component : xppuComponents){
				if(component instanceof BusMaster){
					EList<SignalInterface> sis = ((BusMaster)component).getSignalinterfaces();
					for(SignalInterface si : sis){
						if(si == siMaster){
							BusMaster bm = (BusMaster) component;
							ModifyBusMaster modifyBusMaster = modificationmarksFactory.eINSTANCE.createModifyBusMaster();
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
        	for(Component component : xppuComponents){
        		if(component instanceof BusSlave){
                    if(component == siSlave){
                        BusSlave bs = (BusSlave) component;
                        ModifyBusSlave modifyBusSlave = modificationmarksFactory.eINSTANCE.createModifyBusSlave();
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
