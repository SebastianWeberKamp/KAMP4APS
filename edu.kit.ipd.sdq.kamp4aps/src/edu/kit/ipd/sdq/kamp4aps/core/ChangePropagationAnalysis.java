package edu.kit.ipd.sdq.kamp4aps.core;

import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ChangePropagationDueToHardwareChange;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.modificationmarksFactory;

/**
 * The change propagation analysis of KAPS
 * 1. determines a seed population of affected components (resp. provided roles)
 * 2. calculates in iterations:
 *    a) inter-component propagation
 *    b) intra-component propagation
 * 3. generates internal modification marks for affected elements
 * 
 * - elements which were already part of a seed population are not further investigated
 * 
 * 
 * @author stammel
 *
 */
public class ChangePropagationAnalysis  extends AbstractKAPSChangePropagationAnalysis<ArchitectureVersion, ChangePropagationDueToHardwareChange> {
	
	@Override
	public void runChangePropagationAnalysis(ArchitectureVersion version) {
		long timeBefore = System.currentTimeMillis();
		// Setup
		setChangePropagationDueToHardwareChange(modificationmarksFactory.eINSTANCE.createChangePropagationDueToHardwareChange());
		
		// Calculate
		calculateAndMarkFromSensorPropagration(version);
		calculateAndMarkReplacementOfMicroSwitch(version);
		calculateAndMarkBusBoxChange(version);
		calculateAndMarkSignalInterfaceChangen(version);
		
			
		// Update
		addAllChangePropagations(version);
		System.out.println("Time: " + (System.currentTimeMillis() - timeBefore));
		
	}


}
