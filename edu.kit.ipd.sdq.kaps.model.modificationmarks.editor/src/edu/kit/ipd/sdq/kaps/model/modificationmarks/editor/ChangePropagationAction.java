package edu.kit.ipd.sdq.kaps.model.modificationmarks.editor;


import edu.kit.ipd.sdq.amp.architecture.AbstractArchitectureVersionPersistency;
import edu.kit.ipd.sdq.amp.model.modificationmarks.editor.AbstractChangePropagationAction;
import edu.kit.ipd.sdq.amp.propagation.AbstractChangePropagationAnalysis;
import edu.kit.ipd.sdq.kaps.core.ArchitectureVersion;
import edu.kit.ipd.sdq.kaps.core.ArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kaps.core.ChangePropagationAnalysis;

public class ChangePropagationAction extends AbstractChangePropagationAction<ArchitectureVersion> {

	@Override
	protected AbstractChangePropagationAnalysis<ArchitectureVersion> createChangePropagationAnalysis() {
		return new ChangePropagationAnalysis();
	}

	@Override
	protected AbstractArchitectureVersionPersistency<ArchitectureVersion> createArchitectureVersionPersistency() {
		return new ArchitectureVersionPersistency();
	}

}
