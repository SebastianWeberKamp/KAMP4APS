package edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.editor;

import edu.kit.ipd.sdq.amp.model.modificationmarks.editor.AbstractArchitectureBasedWorkplanDerivationAction;
import edu.kit.ipd.sdq.kamp4aps.core.ArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps.core.ArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp4aps.core.derivation.DifferenceCalculation;
import edu.kit.ipd.sdq.kamp4aps.core.derivation.EnrichedWorkplanDerivation;

public class ArchitectureBasedWorkplanDerivationAction extends AbstractArchitectureBasedWorkplanDerivationAction<ArchitectureVersion> {
	
	public ArchitectureBasedWorkplanDerivationAction() {
		this.setWorkplanDerivation(new DifferenceCalculation());
		this.setEnrichedWorkplanDerivation(new EnrichedWorkplanDerivation());
		this.setArchitectureVersionPersistency(new ArchitectureVersionPersistency());
	}

}

