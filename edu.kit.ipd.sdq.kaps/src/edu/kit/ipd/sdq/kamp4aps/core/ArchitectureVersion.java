package edu.kit.ipd.sdq.kamp4aps.core;

//import de.uka.ipd.sdq.componentInternalDependencies.ComponentInternalDependenciesFactory;
//import de.uka.ipd.sdq.componentInternalDependencies.ComponentInternalDependencyRepository;

import edu.kit.ipd.sdq.amp.architecture.AbstractArchitectureVersion;
import fieldofactivityannotations.FieldOfActivityAnnotationRepository;
import fieldofactivityannotations.FieldofactivityannotationsFactory;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.AbstractKAPSModificationRepository;
import xPPU.Plant;

public class ArchitectureVersion extends AbstractArchitectureVersion<AbstractKAPSModificationRepository<?>> {
	private FieldOfActivityAnnotationRepository _fieldOfActivityRepository;
//	private ComponentInternalDependencyRepository _componentInternalDependencyRepository;
	private Plant _xppuPlant;
	
	public static class ArchitectureVersionParams{
		public String name;
		public FieldOfActivityAnnotationRepository fieldOfActivityRepository;
		public AbstractKAPSModificationRepository<?> modificationMarkRepository;
//		public ComponentInternalDependencyRepository componentInternalDependencyRepository;
		public Plant xPPUPlant;
	}
	
	public ArchitectureVersion(ArchitectureVersionParams params) {
		super(params.name, params.modificationMarkRepository);
		// Some of the files describing the architecture might not exist; prevent NullPointer
		// in propagation algorithm by setting newly created objects (whose EReferences are
		// instantiated with empty collections, so the algorithm can handle them)
		
		if (params.fieldOfActivityRepository == null) {
			params.fieldOfActivityRepository = FieldofactivityannotationsFactory.eINSTANCE.
					createFieldOfActivityAnnotationRepository();
		}
		this._fieldOfActivityRepository = params.fieldOfActivityRepository;
//		if (_componentInternalDependencyRepository == null) {
//			_componentInternalDependencyRepository = ComponentInternalDependenciesFactory.eINSTANCE.
//					createComponentInternalDependencyRepository();
//		}
//		this._componentInternalDependencyRepository = params.componentInternalDependencyRepository;
		
		this._xppuPlant = params.xPPUPlant;
	}

	public FieldOfActivityAnnotationRepository getFieldOfActivityRepository() {
		return _fieldOfActivityRepository;
	}

	public void setFieldOfActivityRepository(
			FieldOfActivityAnnotationRepository fieldOfActivityRepository) {
		this._fieldOfActivityRepository = fieldOfActivityRepository;
	}

//	public ComponentInternalDependencyRepository getComponentInternalDependencyRepository() {
//		return _componentInternalDependencyRepository;
//	}
//
//	public void setComponentInternalDependencyRepository(
//			ComponentInternalDependencyRepository componentInternalDependencyRepository) {
//		this._componentInternalDependencyRepository = componentInternalDependencyRepository;
//	}
	
	public Plant getXPPUPlant(){
		return _xppuPlant;
	}

	public void setXPPUPlant(Plant plant) {
		this._xppuPlant = plant;
	}

}
