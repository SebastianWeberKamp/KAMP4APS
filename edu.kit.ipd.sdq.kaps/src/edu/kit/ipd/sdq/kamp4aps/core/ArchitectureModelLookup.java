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

	private static BusComponentsParams bcParams;
	
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
		bcParams = initBusComponentParams(initialMarkedBusBoxes);
		setAllBusComponentsInParams(allComponents);
		
		while(bcParams.hasChanged){
			bcParams.hasChanged = false;
			
			EList<Interface> interfacesOfBusBoxes = getAllInterfacesOfMarkedBusBoxes();
			EList<Interface> interfacesOfBusMasters = getAllInterfacesOfMarkedBusMasters();
			EList<Interface> interfacesOfBusSlaves = getAllInterfacesOfMarkedBusSlaves();
			EList<Interface> interfacesOfBusCables = getAllInterfacesOfMarkedBusCables();
			
			addAllBusMastersThatAreConnectedToTheBusCables(interfacesOfBusCables);
			addAllBusSlavessThatAreConnectedToTheBusCables(interfacesOfBusCables);
			
			removeAllBusCablesThatAreNotConnectedToBusComponent(interfacesOfBusBoxes);
			removeAllBusCablesThatAreNotConnectedToBusComponent(interfacesOfBusMasters);
			removeAllBusCablesThatAreNotConnectedToBusComponent(interfacesOfBusSlaves);
			
			addAllBusMastersThatAreConnectedToTheBusCables(interfacesOfBusCables);
			addAllBusSlavessThatAreConnectedToTheBusCables(interfacesOfBusCables);
		}
		return bcParams;
	}

	private static void addAllBusSlavessThatAreConnectedToTheBusCables(EList<Interface> interfacesOfBusCables) {
		EList<BusSlave> slavesToAdd = new BasicEList<BusSlave>();
		for(BusSlave bs : bcParams.allBusSlaves){
			for(Interface bcInterface : interfacesOfBusCables){
				if(bs.getSignalinterface_master() != null){
					if(bcInterface.getId() == bs.getSignalinterface_master().getId()){
						slavesToAdd.add(bs);

					}
				} 
				if (bs.getSignalinterface_slave() != null){
					if(bcInterface.getId() == bs.getSignalinterface_slave().getId()){
						slavesToAdd.add(bs);
					}
				}
					
			}
		}
		for(BusSlave bs : slavesToAdd){
			if(!bcParams.busSlavesToChange.contains(bs)){
				bcParams.busSlavesToChange.add(bs);
				bcParams.hasChanged = true;
			}
		}
	}

	private static void addAllBusMastersThatAreConnectedToTheBusCables(EList<Interface> interfacesOfBusCables) {
		EList<BusMaster> mastersToAdd = new BasicEList<BusMaster>();
		for(BusMaster bm : bcParams.allBusMasters){
			for(Interface bcInterface : interfacesOfBusCables){
				for(Interface si : bm.getSignalinterfaces()){
					if(bcInterface.getId().equals(si.getId())){
						mastersToAdd.add(bm);
					}
				}
				if(bm.getSignalinterface_controller().getId() == bcInterface.getId()){
					mastersToAdd.add(bm);
				}
			}
			
		}
		for(BusMaster bm : mastersToAdd){
			if(!bcParams.busMastersToChange.contains(bm)){
				bcParams.busMastersToChange.add(bm);
				bcParams.hasChanged = true;
			}
		}
	}

	private static void setAllBusComponentsInParams(EList<Component> allComponents) {
		getAllBusBoxesInTheSystem(allComponents);			
		getAllBusMastersInTheSystem(allComponents);
		getAllBusSlavesInTheSystem(allComponents);
		getAllBusCablesInTheSystem(allComponents);
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
			bcParams.hasChanged = true;
			return bcParams;
		}
		
		private static void removeAllBusCablesThatAreNotConnectedToBusComponent(EList<Interface> interfacesOfBusComponent) {
			EList<BusCable> cablesToAdd = new BasicEList<BusCable>();
			for(BusCable bc : bcParams.allBusCables){
				for(Interface si : interfacesOfBusComponent){
					if(si != null){
						if(si.getId() == bc.getSignalPlug1().getId() ||
						   si.getId() == bc.getSignalPlug2().getId()){
							cablesToAdd.add(bc);
						}
					}
				}
			}
			for(BusCable bc : cablesToAdd){
				if(!bcParams.busCablesToChange.contains(bc)){
					bcParams.busCablesToChange.add(bc);
					bcParams.hasChanged = true;
				}				
			}
		}
	
		private static void getAllBusBoxesInTheSystem(EList<Component> allComponents) {
			for(Component component : allComponents){
				if(component instanceof BusBox)
					bcParams.allBusBoxes.add((BusBox)component);
			}
		}
		
		private static void getAllBusMastersInTheSystem(EList<Component> allComponents) {
			for(Component component : allComponents){
				if(component instanceof BusMaster)
					bcParams.allBusMasters.add((BusMaster)component);
			}
		}
		
		private static void getAllBusSlavesInTheSystem(EList<Component> allComponents) {
			for(Component component : allComponents){
				if(component instanceof BusSlave)
					bcParams.allBusSlaves.add((BusSlave)component);
			}
		}
		
		private static void getAllBusCablesInTheSystem(EList<Component> allComponents) {
			for(Component component : allComponents){
				if(component instanceof BusCable)
					bcParams.allBusCables.add((BusCable)component);
			}
		}

		private static EList<Interface> getAllInterfacesOfMarkedBusBoxes() {
			EList<Interface> interfacesOfBusBox = new BasicEList<Interface>();
			for(BusBox bb : bcParams.busBoxesToChange){
				interfacesOfBusBox.add(bb.getPowersupply());
				interfacesOfBusBox.add(bb.getSignalinterface_box());
				interfacesOfBusBox.add(bb.getSignalinterface_master());
				for(SignalInterface si : bb.getSignalinterfaces())
					interfacesOfBusBox.add(si);
			}
			return interfacesOfBusBox;
		}
		
		private static EList<Interface> getAllInterfacesOfMarkedBusMasters() {
			EList<Interface> interfacesOfBusMasters = new BasicEList<Interface>();
			for(BusMaster bm : bcParams.busMastersToChange){
				interfacesOfBusMasters.add(bm.getSignalinterface_controller());
				for(SignalInterface si : bm.getSignalinterfaces())
					interfacesOfBusMasters.add(si);
			}
			return interfacesOfBusMasters;
		}
		
		private static EList<Interface> getAllInterfacesOfMarkedBusSlaves() {
			EList<Interface> interfacesOfBusSlaves = new BasicEList<Interface>();
			for(BusSlave bs : bcParams.busSlavesToChange){
				interfacesOfBusSlaves.add(bs.getSignalinterface_master());
				interfacesOfBusSlaves.add(bs.getSignalinterface_slave());
			}
			return interfacesOfBusSlaves;
		}
		
		private static EList<Interface> getAllInterfacesOfMarkedBusCables() {
			EList<Interface> interfacesOfBusCables = new BasicEList<Interface>();
			for(BusCable bc : bcParams.busCablesToChange){
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
		public boolean hasChanged;
	}
	
}
