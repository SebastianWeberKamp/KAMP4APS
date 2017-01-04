package edu.kit.ipd.sdq.kaps.core.scenarios;

import java.util.Collection;

import edu.kit.ipd.sdq.amp.architecture.AMPArchitectureModelLookup;
import edu.kit.ipd.sdq.kaps.core.ArchitectureVersion;
import edu.kit.ipd.sdq.kaps.model.modificationmarks.ChangePropagationDueToHardwareChange;
import edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifyPhysicalConnection;
import edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifySensor;
import edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifySignalinterface;
import edu.kit.ipd.sdq.kaps.model.modificationmarks.modificationmarksFactory;
import xPPU.ComponentRepository.Sensor;
import xPPU.InterfaceRepository.PhysicalConnection;
import xPPU.InterfaceRepository.SignalInterface;

public class ScenarioZero {
	
	private ArchitectureVersion version;
	
	public ScenarioZero(ArchitectureVersion v) {
		version = v;
	}
	
	public Collection<Sensor> getInitialMarkedSensors(){
		return AMPArchitectureModelLookup.lookUpMarkedObjectsOfAType(version, Sensor.class);
	}

	public void addScenarioModificationToChangePropagation(Sensor sensor, 
			ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange,
			Collection<SignalInterface> signalInterfaceToChange,
			Collection<PhysicalConnection> physicalConnectionToChange) {
		signalInterfaceToChange.add(sensor.getSignalinterface());
		physicalConnectionToChange.add(sensor.getPhysicalconnection());
		ModifySensor<Sensor> modifySensor = modificationmarksFactory.eINSTANCE.createModifySensor();
		modifySensor.setToolderived(true);
		modifySensor.setAffectedElement(sensor);
		modifySensor.getCausingElements().addAll(getInitialMarkedSensors());
	
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
