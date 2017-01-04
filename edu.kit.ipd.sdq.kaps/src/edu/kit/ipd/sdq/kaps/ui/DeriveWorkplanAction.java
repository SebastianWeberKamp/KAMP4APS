package edu.kit.ipd.sdq.kaps.ui;

import edu.kit.ipd.sdq.amp.ui.AbstractDeriveWorkplanAction;
import edu.kit.ipd.sdq.kaps.core.ArchitectureVersion;
import edu.kit.ipd.sdq.kaps.core.ArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kaps.core.derivation.DifferenceCalculation;
import edu.kit.ipd.sdq.kaps.core.derivation.EnrichedWorkplanDerivation;

public class DeriveWorkplanAction extends AbstractDeriveWorkplanAction<ArchitectureVersion> {

	public DeriveWorkplanAction() {
		this.setWorkplanDerivation(new DifferenceCalculation());
		this.setEnrichedWorkplanDerivation(new EnrichedWorkplanDerivation());
		this.setArchitectureVersionPersistency(new ArchitectureVersionPersistency());
	}

}
