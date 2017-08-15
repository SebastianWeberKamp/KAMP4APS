package edu.kit.ipd.sdq.kamp4aps.core;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import edu.kit.ipd.sdq.kamp.util.MapUtil;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyInterface;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyModule;
import xPPU.BusComponents.BusBox;
import xPPU.BusComponents.BusCable;
import xPPU.BusComponents.BusMaster;
import xPPU.BusComponents.BusSlave;
import xPPU.ComponentRepository.Component;
import xPPU.ComponentRepository.PowerSupply;
import xPPU.ComponentRepository.Sensor;
import xPPU.Identifier.Identifier;
import xPPU.InterfaceRepository.Interface;
import xPPU.InterfaceRepository.SignalInterface;
import xPPU.ModuleRepository.Module;

/**
 * This class represents a part of the change rules implementation
 * that where extracted of the scenarios described in the link below.
 * These rules are searching for the affected structural elements
 * which were defined in the \texttt{xPPU} metamodel.
 * Each look up method is the manifestation of a single element of the mentioned
 * metamodel.
 * 
 * The internal public class \texttt{BusComponentsParams} serves as data exchange
 * class to avoid large parameter lists.
 * 
 * @author Sandro Koch
 * @see <a href="https://sdqweb.ipd.kit.edu/publications/pdfs/koch2017a.pdf">koch2017a<\a>
 *
 */

public class ArchitectureModelLookup {

	private static BusComponentsParams bcParams;
	
//	public static Map<PowerSupply, Set<BusBox>> lookUpBusBoxesWithSupplys(ArchitectureVersion version,
//			Collection<BusBox> initialMarkedBusBoxes) {
//		Map<PowerSupply, Set<BusBox>> results = new HashMap<>();
//
//		Set<BusBox> matchingBoxes = new HashSet<BusBox>(initialMarkedBusBoxes);
//		for (BusBox bb : initialMarkedBusBoxes) {
//			matchingBoxes.add(bb);
//			MapUtil.putOrAddToMap(results, bb.getPowersupply(), matchingBoxes);
//		}
//		return results;
//	}

//	public static Map<Interface, Set<Sensor>> lookUpSensorsWithPhysicalConnections(ArchitectureVersion version,
//			Collection<Sensor> seedSensors) {
//		Map<Interface, Set<Sensor>> results = new HashMap<Interface, Set<Sensor>>();
//
//		Set<Sensor> sensors = new HashSet<Sensor>();
//		for(Sensor s : seedSensors){
//			sensors.add(s);
//			results.put((Interface)s.getPhysicalconnection(), sensors);
//		}
//		return results;
//	}
	
//	public static Map<Component, Set<ModifyInterface<Interface>>> lookUpChangesBasedOnSignalInterfaces(ArchitectureVersion version,
//			Collection<ModifyInterface<Interface>> initialMarkedInterfaces){
//		Map<Component, Set<ModifyInterface<Interface>>> results = new HashMap<Component, Set<ModifyInterface<Interface>>>();
//		for(ModifyInterface<Interface> modifyInterface : initialMarkedInterfaces){
//			for(Component component : version.getXPPUPlant().getComponentRepository().getAllComponentsInPlant()){
//				if(modifyInterface.getAffectedElement() instanceof Interface){
//					for(Interface componentInterface : component.getConnectedInterfaces()){
//						if(componentInterface.getId() == modifyInterface.getAffectedElement().getId()){
//							if(results.get(component) == null)
//								results.put(component, new HashSet<ModifyInterface<Interface>>());
//							results.get(component).add(modifyInterface);
//						}
//					}
//				}
//			}
//		}
//		return results;
//	}
	
	public static void lookUpChangesBasedOnModuleModification(ArchitectureVersion version,
			Collection<ModifyModule<Module>> initialMarkedModules){
		Map<Module, Set<ModifyModule<Module>>> results = new HashMap<Module, Set<ModifyModule<Module>>>();
		for(ModifyModule<Module> modifyModule : initialMarkedModules){
			
		}
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
		
		updateBusCableCausingsByBusMasters();
		updateBusCableCausingsByBusSlaves();
		updateBusCableCausingsByBusBoxes();
		
		return bcParams;
	}

	private static void updateBusCableCausingsByBusBoxes() {
		for(BusBox key : bcParams.causingElementsOfBusBox.keySet()){
			for(BusCable cable : bcParams.busCablesToChange){
				if(bcParams.causingElementsOfBusCable.get(cable) == null){
					bcParams.causingElementsOfBusCable.put(cable, new HashSet<Identifier>());
				}
				if(bcParams.causingElementsOfBusBox.get(key).contains(cable.getSignalPlug1())){
					Set<Identifier> causingElement = bcParams.causingElementsOfBusCable.get(cable);
					causingElement.add((Identifier)cable.getSignalPlug1());
					bcParams.causingElementsOfBusCable.put(cable, causingElement);
				} else if(bcParams.causingElementsOfBusBox.get(key).contains(cable.getSignalPlug2())){
					Set<Identifier> causingElement = bcParams.causingElementsOfBusCable.get(cable);
					causingElement.add((Identifier)cable.getSignalPlug2());
					bcParams.causingElementsOfBusCable.put(cable, causingElement);
				}
			}
		}
	}

	private static void updateBusCableCausingsByBusSlaves() {
		for(BusSlave key : bcParams.causingElementsOfBusSlave.keySet()){
			for(BusCable cable : bcParams.busCablesToChange){
				if(bcParams.causingElementsOfBusCable.get(cable) == null){
					bcParams.causingElementsOfBusCable.put(cable, new HashSet<Identifier>());
				}
				if(bcParams.causingElementsOfBusSlave.get(key).contains(cable.getSignalPlug1())){
					Set<Identifier> causingElement = bcParams.causingElementsOfBusCable.get(cable);
					causingElement.add((Identifier)cable.getSignalPlug1());
					bcParams.causingElementsOfBusCable.put(cable, causingElement);
				} else if(bcParams.causingElementsOfBusSlave.get(key).contains(cable.getSignalPlug2())){
					Set<Identifier> causingElement = bcParams.causingElementsOfBusCable.get(cable);
					causingElement.add((Identifier)cable.getSignalPlug2());
					bcParams.causingElementsOfBusCable.put(cable, causingElement);
				}
			}
		}
	}

	private static void updateBusCableCausingsByBusMasters() {
		for(BusMaster key : bcParams.causingElementsOfBusMaster.keySet()){
			for(BusCable cable : bcParams.busCablesToChange){
				if(bcParams.causingElementsOfBusCable.get(cable) == null){
					bcParams.causingElementsOfBusCable.put(cable, new HashSet<Identifier>());
				}
				if(bcParams.causingElementsOfBusMaster.get(key).contains(cable.getSignalPlug1())){
					Set<Identifier> causingElement = bcParams.causingElementsOfBusCable.get(cable);
					causingElement.add((Identifier)cable.getSignalPlug1());
					bcParams.causingElementsOfBusCable.put(cable, causingElement);
				} else if(bcParams.causingElementsOfBusMaster.get(key).contains(cable.getSignalPlug2())){
					Set<Identifier> causingElement = bcParams.causingElementsOfBusCable.get(cable);
					causingElement.add((Identifier)cable.getSignalPlug2());
					bcParams.causingElementsOfBusCable.put(cable, causingElement);
				}
			}
		}
	}

	private static void addAllBusSlavessThatAreConnectedToTheBusCables(EList<Interface> interfacesOfBusCables) {
		EList<BusSlave> slavesToAdd = new BasicEList<BusSlave>();
		for(BusSlave bs : bcParams.allBusSlaves){
			for(Interface bcInterface : interfacesOfBusCables){
				if(bs.getSignalinterface_master() != null){
					if(bcInterface.getId() == bs.getSignalinterface_master().getId()){
						updateSlavesToAdd(slavesToAdd, bs, bcInterface);
					}
				} 
				if (bs.getSignalinterface_slave() != null){
					if(bcInterface.getId() == bs.getSignalinterface_slave().getId()){
						updateSlavesToAdd(slavesToAdd, bs, bcInterface);
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
	
	private static void updateSlavesToAdd(EList<BusSlave> slavesToAdd, BusSlave bs, Interface bcInterface) {
		slavesToAdd.add(bs);
		if(bcParams.causingElementsOfBusSlave.get(bs) == null)
			bcParams.causingElementsOfBusSlave.put(bs, new HashSet<Identifier>());
		Set<Identifier> causingElements = bcParams.causingElementsOfBusSlave.get(bs);
		causingElements.add((Identifier)bcInterface);
	}
	private static void addAllBusMastersThatAreConnectedToTheBusCables(EList<Interface> interfacesOfBusCables) {
		EList<BusMaster> mastersToAdd = new BasicEList<BusMaster>();
		for(BusMaster bm : bcParams.allBusMasters){
			for(Interface bcInterface : interfacesOfBusCables){
				for(Interface si : bm.getSignalinterfaces()){
					if(bcInterface.getId().equals(si.getId())){
						updateMastersToAdd(mastersToAdd, bm, bcInterface);
					}
				}
				if(bm.getSignalinterface_controller().getId() == bcInterface.getId()){
					updateMastersToAdd(mastersToAdd, bm, bcInterface);
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

	private static void updateMastersToAdd(EList<BusMaster> mastersToAdd, BusMaster bm, Interface bcInterface) {
		mastersToAdd.add(bm);
		if(bcParams.causingElementsOfBusMaster.get(bm) == null)
			bcParams.causingElementsOfBusMaster.put(bm, new HashSet<Identifier>());
		Set<Identifier> causingElements = bcParams.causingElementsOfBusMaster.get(bm);
		causingElements.add((Identifier)bcInterface);
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
			bcParams.causingElementsOfBusBox = new HashMap<BusBox, Set<Identifier>>();
			bcParams.causingElementsOfBusMaster = new HashMap<BusMaster, Set<Identifier>>();
			bcParams.causingElementsOfBusSlave = new HashMap<BusSlave, Set<Identifier>>();
			bcParams.causingElementsOfBusCable = new HashMap<BusCable, Set<Identifier>>();
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
				interfacesOfBusSlaves.addAll(bs.getConnectedInterfaces());
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
	
	/**
	 * 
	 * This class is a data exchange class to avoid large
	 * parameter lists. It stores all bus components of the system
	 * as well as the identified bus components which are affected
	 * by a change. Also the causing entities are stored in this class
	 * The look up methods of the parent class 
	 * \texttt{ArchitectureModelLookup} fill the parameters of the class.
	 * 
	 * @author Sandro Koch
	 *
	 */
	public static class BusComponentsParams{
		public Set<BusBox> busBoxesToChange;
		public Set<BusMaster> busMastersToChange;
		public Set<BusSlave> busSlavesToChange;
		public Set<BusCable> busCablesToChange;
		public Set<BusBox> allBusBoxes;
		public Set<BusMaster> allBusMasters;
		public Set<BusSlave> allBusSlaves;
		public Set<BusCable> allBusCables;
		public Map<BusBox, Set<Identifier>> causingElementsOfBusBox;
		public Map<BusMaster, Set<Identifier>> causingElementsOfBusMaster;
		public Map<BusSlave, Set<Identifier>> causingElementsOfBusSlave;
		public Map<BusCable, Set<Identifier>> causingElementsOfBusCable;
		public boolean hasChanged;
	}
	
}
