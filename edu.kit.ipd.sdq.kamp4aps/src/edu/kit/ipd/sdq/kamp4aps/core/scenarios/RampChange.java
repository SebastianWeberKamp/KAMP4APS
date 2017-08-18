package edu.kit.ipd.sdq.kamp4aps.core.scenarios;

import java.util.Collection;

import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup;
import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps.core.changepropagation.Change;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.RegularRamp;
public class RampChange extends Change {

	private Collection<RegularRamp> initialMarkedRamps;
	
	public RampChange(APSArchitectureVersion v) {
		super(v);
		initialMarkedRamps = APSArchitectureModelLookup.lookUpMarkedObjectsOfAType(version, RegularRamp.class);
	}

	public void addInitialMarkedRampsToList(
			ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange) {
		for(RegularRamp ramp : initialMarkedRamps){
			
		}
	}
}
