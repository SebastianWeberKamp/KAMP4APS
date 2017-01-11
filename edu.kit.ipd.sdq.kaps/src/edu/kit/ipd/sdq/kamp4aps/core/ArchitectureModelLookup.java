package edu.kit.ipd.sdq.kamp4aps.core;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import edu.kit.ipd.sdq.amp.util.MapUtil;
import xPPU.BusComponents.BusBox;
import xPPU.BusComponents.BusCable;
import xPPU.BusComponents.BusMaster;
import xPPU.BusComponents.BusSlave;
import xPPU.ComponentRepository.Component;
import xPPU.ComponentRepository.PowerSupply;
import xPPU.ComponentRepository.Sensor;
import xPPU.InterfaceRepository.Interface;
import xPPU.InterfaceRepository.SignalInterface;

public class ArchitectureModelLookup {
	
	/**
	 * Finds PowerSupplys of BusBoxes
	 */
	public static Map<PowerSupply, Set<BusBox>> lookUpBusBoxesWithSupplys(ArchitectureVersion version,
			Collection<BusBox> initialMarkedBusBoxes) {
		Map<PowerSupply, Set<BusBox>> results = new HashMap<>();

		Set<BusBox> matchingBoxes = new HashSet<BusBox>(initialMarkedBusBoxes);
		for (BusBox bb : initialMarkedBusBoxes) {
			matchingBoxes.add(bb);
			MapUtil.putOrAddToMap(results, bb.getPowersupply(), matchingBoxes);
		}
		return results;
	}

	public static Map<Interface, Set<Sensor>> lookUpSensorsWithPhysicalConnections(ArchitectureVersion version,
			Collection<Sensor> seedSensors) {
		Map<Interface, Set<Sensor>> results = new HashMap<Interface, Set<Sensor>>();

		Set<Sensor> sensors = new HashSet<Sensor>();
		for(Sensor s : seedSensors){
			sensors.add(s);
			results.put((Interface)s.getPhysicalconnection(), sensors);
		}
		return results;
	}
	
	public static BusComponentsParams lookUpBusCablesBasedOnBusBoxChanges(ArchitectureVersion version,
			Collection<BusBox> initialMarkedBusBoxes){
		EList<Component> allComponents = version.getXPPUPlant().getComponentRepository().getAllComponentsInPlant();
		
		// Getting all Interfaces from the BusBoxes
		EList<Interface> interfacesOfBusBox = new BasicEList<Interface>();
		for(BusBox bb : initialMarkedBusBoxes){
			interfacesOfBusBox.add(bb.getPowersupply());
			interfacesOfBusBox.add(bb.getSignalinterface_box());
			interfacesOfBusBox.add(bb.getSignalinterface_master());
			for(SignalInterface si : bb.getSignalinterfaces())
				interfacesOfBusBox.add(si);
		}
		
		// Getting all BusCables in the System
		EList<BusCable> busCables = new BasicEList<BusCable>();
		for(Component component : allComponents){
			if(component instanceof BusCable)
				busCables.add((BusCable)component);
		}
		
		// remove BusCables that are not connected to the BusBoxes
		EList<BusCable> cablesToRemove = new BasicEList<BusCable>();
		for(BusCable bc : busCables){
			if(interfacesOfBusBox.contains(bc.getSignalPlug1()) ||
					interfacesOfBusBox.contains(bc.getSignalPlug2()))
				cablesToRemove.add(bc);
		}
		for(BusCable bc : cablesToRemove){
			busCables.remove(bc);
		}
		
		// Getting all Interfaces from the BusCables
		EList<Interface> interfacesOfBusCables = new BasicEList<Interface>();
		for(BusCable bc : busCables){
			interfacesOfBusCables.add(bc.getSignalPlug1());
			interfacesOfBusCables.add(bc.getSignalPlug2());
		}
		
		// Getting all Interfaces that are connect BusBox with BusCable
		EList<Interface> doubleInterfaces = new BasicEList<Interface>();
		for(Interface busBoxInterface : interfacesOfBusBox){
			for(Interface busCableInterface : interfacesOfBusCables){
				if(busBoxInterface == busCableInterface)
					doubleInterfaces.add(busBoxInterface);
			}
		}
		
		// Remove connection between BusBox and BusCable
		// to get the remaining Interfaces which are connected
		// to BusMasters and BusSlaves
		for(Interface ifce : doubleInterfaces){
			interfacesOfBusCables.remove(ifce);
		}
		
		// Getting all BusMasters in the System
		EList<BusMaster> busMasters = new BasicEList<BusMaster>();
		for(Component component : allComponents){
			if(component instanceof BusMaster)
				busMasters.add((BusMaster)component);
		}
		
		// Get all BusMasters that are connected to the BusBoxes
		EList<BusMaster> mastersToRemove = new BasicEList<BusMaster>();
		for(BusMaster bm : busMasters){
			for(Interface si : bm.getSignalinterfaces()){
				if(!(interfacesOfBusCables.contains(si) || 
					interfacesOfBusCables.contains(bm.getSignalinterface_controller()))){
					mastersToRemove.add(bm);
				}
			}
		}
		for(BusMaster bm : mastersToRemove){
			busMasters.remove(bm);
		}
		
		// Getting all BusSlaves in the System
		EList<BusSlave> busSlaves = new BasicEList<BusSlave>();
		for(Component component : allComponents){
			if(component instanceof BusSlave)
				busSlaves.add((BusSlave)component);
		}
		
		// Get all BusSlaves that are connected to the BusBoxes
		EList<BusSlave> slavesToRemove = new BasicEList<BusSlave>();
		for(BusSlave bs : busSlaves){
			if(!(interfacesOfBusCables.contains(bs.getSignalinterface_master()) || 
				interfacesOfBusCables.contains(bs.getSignalinterface_slave()))){
				slavesToRemove.add(bs);
			}
		}
		for(BusSlave bs : slavesToRemove){
			busSlaves.remove(bs);
		}
	
		BusComponentsParams bcParams = new BusComponentsParams();
		bcParams.busBoxes = initialMarkedBusBoxes;
		bcParams.busMasters = busMasters;
		bcParams.busSlaves = busSlaves;
		bcParams.busCables = busCables;
		
		return bcParams;
	}
	public static class BusComponentsParams{
		public Collection<BusBox> busBoxes;
		public Collection<BusMaster> busMasters;
		public Collection<BusSlave> busSlaves;
		public Collection<BusCable> busCables;
	}
	
}
