package edu.kit.ipd.sdq.kamp4aps.core;

import de.uka.ipd.sdq.componentInternalDependencies.ComponentInternalDependenciesFactory;
import de.uka.ipd.sdq.componentInternalDependencies.ComponentInternalDependencyRepository;

import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryFactory;
import org.palladiosimulator.pcm.system.System;
import org.palladiosimulator.pcm.system.SystemFactory;

import edu.kit.ipd.sdq.amp.architecture.AbstractArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.FieldOfActivityAnnotationRepository;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.FieldofactivityannotationsFactory;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.AbstractKAPSModificationRepository;
import xPPU.ComponentRepository.Component;

public class ArchitectureVersion extends AbstractArchitectureVersion<AbstractKAPSModificationRepository<?>> {
	private Repository repository;
	private org.palladiosimulator.pcm.system.System system;
	private FieldOfActivityAnnotationRepository fieldOfActivityRepository;
	private ComponentInternalDependencyRepository componentInternalDependencyRepository;
	private Component components;
	
	public ArchitectureVersion(String name, /*Components components,*/ Repository repository, System system,
			FieldOfActivityAnnotationRepository fieldOfActivityRepository,
			AbstractKAPSModificationRepository<?> modificationMarkRepository,
			ComponentInternalDependencyRepository componentInternalDependencyRepository) {
		super(name, modificationMarkRepository);
		// Some of the files describing the architecture might not exist; prevent NullPointer
		// in propagation algorithm by setting newly created objects (whose EReferences are
		// instantiated with empty collections, so the algorithm can handle them)
		
//		if(components == null){
//			components = 
//		}
		
		if (repository == null) {
			repository = RepositoryFactory.eINSTANCE.createRepository();
		}
		this.repository = repository;
		if (system == null) {
			system = SystemFactory.eINSTANCE.createSystem();
		}
		this.system = system;
		if (fieldOfActivityRepository == null) {
			fieldOfActivityRepository = FieldofactivityannotationsFactory.eINSTANCE.
					createFieldOfActivityAnnotationRepository();
		}
		this.fieldOfActivityRepository = fieldOfActivityRepository;
		if (componentInternalDependencyRepository == null) {
			componentInternalDependencyRepository = ComponentInternalDependenciesFactory.eINSTANCE.
					createComponentInternalDependencyRepository();
		}
		this.componentInternalDependencyRepository = componentInternalDependencyRepository;
	}

	public Repository getRepository() {
		return repository;
	}

	public void setRepository(Repository repository) {
		this.repository = repository;
	}

	public org.palladiosimulator.pcm.system.System getSystem() {
		return system;
	}

	public void setSystem(org.palladiosimulator.pcm.system.System system) {
		this.system = system;
	}

	public FieldOfActivityAnnotationRepository getFieldOfActivityRepository() {
		return fieldOfActivityRepository;
	}

	public void setFieldOfActivityRepository(
			FieldOfActivityAnnotationRepository fieldOfActivityRepository) {
		this.fieldOfActivityRepository = fieldOfActivityRepository;
	}

	public ComponentInternalDependencyRepository getComponentInternalDependencyRepository() {
		return componentInternalDependencyRepository;
	}

	public void setComponentInternalDependencyRepository(
			ComponentInternalDependencyRepository componentInternalDependencyRepository) {
		this.componentInternalDependencyRepository = componentInternalDependencyRepository;
	}

}
