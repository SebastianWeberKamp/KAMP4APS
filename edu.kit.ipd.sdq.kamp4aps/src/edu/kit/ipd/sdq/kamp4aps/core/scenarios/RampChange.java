package edu.kit.ipd.sdq.kamp4aps.core.scenarios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup;
import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps.core.changepropagation.Change;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSModificationmarksFactory;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.RegularRamp;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Interface;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyComponent;

public class RampChange extends Change {

	private Collection<RegularRamp> initialMarkedRamps;
	
	public RampChange(APSArchitectureVersion v) {
		super(v);
		initialMarkedRamps = APSArchitectureModelLookup.lookUpMarkedObjectsOfAType(version, RegularRamp.class);
	}

	// hier werden erstmal alle vom nutzer markierten rampen herausgesucht
	// und entsprechend als modifikation angelegt.
	public void addInitialMarkedRampsToList(
			ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange) {
		for(RegularRamp ramp : initialMarkedRamps){
			ModifyComponent<RegularRamp> modifyRamp = KAMP4aPSModificationmarksFactory.eINSTANCE.createModifyComponent();
			modifyRamp.setAffectedElement(ramp);
			modifyRamp.setToolderived(true);
			modifyRamp.setId("Modify " + ramp.getId());
		}
	}
	
	// hol alle schnittstellen die mit ner rampe verbunden sind
	// und füge sie der liste der beeinflussten schnittstellen hinzu
	public List<Interface> calculateAffectedInterfacesByRampChange(){
		List<Interface> affectedInterfaces = new ArrayList<Interface>();
		for(RegularRamp ramp : initialMarkedRamps){
			for(Interface i : ramp.getConnectedInterfaces()){
				affectedInterfaces.add(i);
			}
		}
		return affectedInterfaces;
	}
	
	//TODO: was ist denn noch so von einer rampe beeinflusst?
	// na neben der rampe auch noch das ding woran die rampe festgemacht ist
	// in unserem fall kann das nur ein FRAME objekt sein.
	// das wars dann auch schon. sehr ernüchternd!!! :(
	// gut für mich, weniger zu tun :D
}
