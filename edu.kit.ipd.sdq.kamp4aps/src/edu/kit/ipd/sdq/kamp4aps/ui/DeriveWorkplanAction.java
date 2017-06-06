package edu.kit.ipd.sdq.kamp4aps.ui;

import edu.kit.ipd.sdq.kamp.ui.AbstractDeriveWorkplanAction;
import edu.kit.ipd.sdq.kamp4aps.core.ArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps.core.ArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp4aps.core.derivation.DifferenceCalculation;
import edu.kit.ipd.sdq.kamp4aps.core.derivation.EnrichedWorkplanDerivation;

public class DeriveWorkplanAction extends AbstractDeriveWorkplanAction<ArchitectureVersion> {

	public DeriveWorkplanAction() {
		this.setWorkplanDerivation(new DifferenceCalculation());
		this.setEnrichedWorkplanDerivation(new EnrichedWorkplanDerivation());
		this.setArchitectureVersionPersistency(new ArchitectureVersionPersistency());
	}

}
