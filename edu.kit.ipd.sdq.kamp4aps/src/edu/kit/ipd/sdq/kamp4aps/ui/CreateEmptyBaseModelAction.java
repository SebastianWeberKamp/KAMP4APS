package edu.kit.ipd.sdq.kamp4aps.ui;

import edu.kit.ipd.sdq.kamp.ui.AbstractCreateEmptyBaseModelAction;
import edu.kit.ipd.sdq.kamp4aps.core.ArchitectureModelFactoryFacade;
import edu.kit.ipd.sdq.kamp4aps.core.ArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps.core.ArchitectureVersionPersistency;

public class CreateEmptyBaseModelAction  extends AbstractCreateEmptyBaseModelAction<ArchitectureVersion> {
	
	public CreateEmptyBaseModelAction() {
		this.setArchitectureVersionPersistency(new ArchitectureVersionPersistency());
	}
	
	@Override
	protected ArchitectureVersion createArchitectureVersion() {
		return ArchitectureModelFactoryFacade.createEmptyModel("architecturemodel");
	}

}

