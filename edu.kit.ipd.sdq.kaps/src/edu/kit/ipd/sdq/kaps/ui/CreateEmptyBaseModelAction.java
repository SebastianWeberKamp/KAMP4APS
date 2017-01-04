package edu.kit.ipd.sdq.kaps.ui;

import edu.kit.ipd.sdq.amp.ui.AbstractCreateEmptyBaseModelAction;
import edu.kit.ipd.sdq.kaps.core.ArchitectureModelFactoryFacade;
import edu.kit.ipd.sdq.kaps.core.ArchitectureVersion;
import edu.kit.ipd.sdq.kaps.core.ArchitectureVersionPersistency;

public class CreateEmptyBaseModelAction  extends AbstractCreateEmptyBaseModelAction<ArchitectureVersion> {
	
	public CreateEmptyBaseModelAction() {
		this.setArchitectureVersionPersistency(new ArchitectureVersionPersistency());
	}
	
	@Override
	protected ArchitectureVersion createArchitectureVersion() {
		return ArchitectureModelFactoryFacade.createEmptyModel("architecturemodel");
	}

}

