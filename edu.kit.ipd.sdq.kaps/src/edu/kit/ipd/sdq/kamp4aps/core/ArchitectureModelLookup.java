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
	
	public static BusComponentsParams lookUpChangesBasedOnBusModification(ArchitectureVersion version,
			Collection<BusBox> initialMarkedBusBoxes){
		EList<Component> allComponents = version.getXPPUPlant().getComponentRepository().getAllComponentsInPlant();
		BusComponentsParams bcParams = initBusComponentParams(initialMarkedBusBoxes);
		setAllBusComponentsInParams(allComponents, bcParams);
		
		EList<Interface> interfacesOfBusBoxes = getAllInterfacesOfMarkedBusBoxes(bcParams.busBoxesToChange);
		EList<Interface> interfacesOfBusMasters = getAllInterfacesOfMarkedBusMasters(bcParams.busMastersToChange);
		EList<Interface> interfacesOfBusSlaves = getAllInterfacesOfMarkedBusSlaves(bcParams.busSlavesToChange);
		EList<Interface> interfacesOfBusCables = getAllInterfacesOfMarkedBusCables(bcParams.busCablesToChange);
		
		removeAllBusCablesThatAreNotConnectedToBusComponent(bcParams, interfacesOfBusBoxes);
		removeAllBusCablesThatAreNotConnectedToBusComponent(bcParams, interfacesOfBusMasters);
		removeAllBusCablesThatAreNotConnectedToBusComponent(bcParams, interfacesOfBusSlaves);
		
		
		addAllBusMastersThatAreConnectedToTheBusCables(bcParams, interfacesOfBusCables);
		
		addAllBusSlavessThatAreConnectedToTheBusCables(bcParams, interfacesOfBusCables);
		return bcParams;
	}

	private static void addAllBusSlavessThatAreConnectedToTheBusCables(BusComponentsParams bcParams,
			EList<Interface> interfacesOfBusCables) {
		EList<BusSlave> slavesToAdd = new BasicEList<BusSlave>();
		for(BusSlave bs : bcParams.allBusSlaves){
			if(!(interfacesOfBusCables.contains(bs.getSignalinterface_master()) || 
				interfacesOfBusCables.contains(bs.getSignalinterface_slave()))){
				slavesToAdd.add(bs);
			}
		}
		for(BusSlave bs : slavesToAdd){
			bcParams.busSlavesToChange.add(bs);
		}
	}

	private static void addAllBusMastersThatAreConnectedToTheBusCables(BusComponentsParams bcParams,
			EList<Interface> interfacesOfBusCables) {
		EList<BusMaster> mastersToAdd = new BasicEList<BusMaster>();
		for(BusMaster bm : bcParams.allBusMasters){
			for(Interface si : bm.getSignalinterfaces()){
				if(!(interfacesOfBusCables.contains(si) || 
					interfacesOfBusCables.contains(bm.getSignalinterface_controller()))){
					mastersToAdd.add(bm);
				}
			}
		}
		for(BusMaster bm : mastersToAdd){
			bcParams.busMastersToChange.add(bm);
		}
	}

	private static void setAllBusComponentsInParams(EList<Component> allComponents, BusComponentsParams bcParams) {
		getAllBusBoxesInTheSystem(allComponents, bcParams);			
		getAllBusMastersInTheSystem(allComponents, bcParams);
		getAllBusSlavesInTheSystem(allComponents, bcParams);
		getAllBusCablesInTheSystem(allComponents, bcParams);
	}

		private static BusComponentsParams initBusComponentParams(Collection<BusBox> initialMarkedBusBoxes) {
			BusComponentsParams bcParams = new BusComponentsParams();
			bcParams.busBoxesToChange = new HashSet<BusBox>(initialMarkedBusBoxes);
			bcParams.busMastersToChange = new HashSet<BusMaster>();
			bcParams.busSlavesToChange = new HashSet<BusSlave>();
			bcParams.busCablesToChange = new HashSet<BusCable>();
			bcParams.allBusBoxes = new HashSet<BusBox>();
			bcParams.allBusMasters = new HashSet<BusMaster>();
			bcParams.allBusSlaves = new HashSet<BusSlave>();
			bcParams.allBusCables = new HashSet<BusCable>();
			return bcParams;
		}
		
		private static void removeAllBusCablesThatAreNotConnectedToBusComponent(BusComponentsParams bcParams,
				EList<Interface> interfacesOfBusComponent) {
			EList<BusCable> cablesToAdd = new BasicEList<BusCable>();
			for(BusCable bc : bcParams.allBusCables){
				if(!(interfacesOfBusComponent.contains(bc.getSignalPlug1()) ||
						interfacesOfBusComponent.contains(bc.getSignalPlug2())))
					cablesToAdd.add(bc);
			}
			for(BusCable bc : cablesToAdd){
				bcParams.busCablesToChange.add(bc);
			}
		}
	
		private static void getAllBusBoxesInTheSystem(EList<Component> allComponents, BusComponentsParams bcParams) {
			for(Component component : allComponents){
				if(component instanceof BusBox)
					bcParams.allBusBoxes.add((BusBox)component);
			}
		}
		
		private static void getAllBusMastersInTheSystem(EList<Component> allComponents, BusComponentsParams bcParams) {
			for(Component component : allComponents){
				if(component instanceof BusMaster)
					bcParams.allBusMasters.add((BusMaster)component);
			}
		}
		
		private static void getAllBusSlavesInTheSystem(EList<Component> allComponents, BusComponentsParams bcParams) {
			for(Component component : allComponents){
				if(component instanceof BusSlave)
					bcParams.allBusSlaves.add((BusSlave)component);
			}
		}
		
		private static void getAllBusCablesInTheSystem(EList<Component> allComponents, BusComponentsParams bcParams) {
			for(Component component : allComponents){
				if(component instanceof BusCable)
					bcParams.allBusCables.add((BusCable)component);
			}
		}

		private static EList<Interface> getAllInterfacesOfMarkedBusBoxes(Collection<BusBox> markedBusBoxes) {
			EList<Interface> interfacesOfBusBox = new BasicEList<Interface>();
			for(BusBox bb : markedBusBoxes){
				interfacesOfBusBox.add(bb.getPowersupply());
				interfacesOfBusBox.add(bb.getSignalinterface_box());
				interfacesOfBusBox.add(bb.getSignalinterface_master());
				for(SignalInterface si : bb.getSignalinterfaces())
					interfacesOfBusBox.add(si);
			}
			return interfacesOfBusBox;
		}
		
		private static EList<Interface> getAllInterfacesOfMarkedBusMasters(Collection<BusMaster> markedBusMasters) {
			EList<Interface> interfacesOfBusMasters = new BasicEList<Interface>();
			for(BusMaster bm : markedBusMasters){
				interfacesOfBusMasters.add(bm.getSignalinterface_controller());
				for(SignalInterface si : bm.getSignalinterfaces())
					interfacesOfBusMasters.add(si);
			}
			return interfacesOfBusMasters;
		}
		
		private static EList<Interface> getAllInterfacesOfMarkedBusSlaves(Collection<BusSlave> markedBusSlaves) {
			EList<Interface> interfacesOfBusSlaves = new BasicEList<Interface>();
			for(BusSlave bs : markedBusSlaves){
				interfacesOfBusSlaves.add(bs.getSignalinterface_master());
				interfacesOfBusSlaves.add(bs.getSignalinterface_slave());
			}
			return interfacesOfBusSlaves;
		}
		
		private static EList<Interface> getAllInterfacesOfMarkedBusCables(Collection<BusCable> markedBusCables) {
			EList<Interface> interfacesOfBusCables = new BasicEList<Interface>();
			for(BusCable bc : markedBusCables){
				interfacesOfBusCables.add(bc.getSignalPlug1());
				interfacesOfBusCables.add(bc.getSignalPlug2());
			}
			return interfacesOfBusCables;
		}
	
	public static class BusComponentsParams{
		public Set<BusBox> busBoxesToChange;
		public Set<BusMaster> busMastersToChange;
		public Set<BusSlave> busSlavesToChange;
		public Set<BusCable> busCablesToChange;
		public Set<BusBox> allBusBoxes;
		public Set<BusMaster> allBusMasters;
		public Set<BusSlave> allBusSlaves;
		public Set<BusCable> allBusCables;
	}
	
}
