package edu.kit.ipd.sdq.kamp4aps.core;

import DeploymentContext.DeploymentContextFactory;
import DeploymentContext.DeploymentContextRepository;
import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersion;
import fieldofactivityannotations.FieldOfActivityAnnotationRepository;
import fieldofactivityannotations.FieldofactivityannotationsFactory;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.AbstractKAPSModificationRepository;
import xPPU.Plant;

public class ArchitectureVersion extends AbstractArchitectureVersion<AbstractKAPSModificationRepository<?>> {
	private FieldOfActivityAnnotationRepository _fieldOfActivityRepository;
	private Plant _xppuPlant;
	private DeploymentContextRepository _deploymentContextRepository;
	
	public static class ArchitectureVersionParams{
		public String name;
		public FieldOfActivityAnnotationRepository fieldOfActivityRepository;
		public AbstractKAPSModificationRepository<?> modificationMarkRepository;
		public DeploymentContextRepository deploymentContextRepository;
		public Plant xPPUPlant;
	}
	
	public ArchitectureVersion(ArchitectureVersionParams params) {
		super(params.name, params.modificationMarkRepository);
		// Some of the files describing the architecture might not exist; prevent NullPointer
		// in propagation algorithm by setting newly created objects (whose EReferences are
		// instantiated with empty collections, so the algorithm can handle them)
		
		if (params.fieldOfActivityRepository == null)
			params.fieldOfActivityRepository = FieldofactivityannotationsFactory.eINSTANCE.
					createFieldOfActivityAnnotationRepository();

		_fieldOfActivityRepository = params.fieldOfActivityRepository;
		_xppuPlant = params.xPPUPlant;
		
		if(params.deploymentContextRepository == null)
			params.deploymentContextRepository = DeploymentContextFactory.eINSTANCE.createDeploymentContextRepository();
		_deploymentContextRepository = params.deploymentContextRepository;
	}

	public FieldOfActivityAnnotationRepository getFieldOfActivityRepository() {
		return _fieldOfActivityRepository;
	}

	public void setFieldOfActivityRepository(
			FieldOfActivityAnnotationRepository fieldOfActivityRepository) {
		this._fieldOfActivityRepository = fieldOfActivityRepository;
	}

	public Plant getXPPUPlant(){
		return _xppuPlant;
	}

	public void setXPPUPlant(Plant plant) {
		this._xppuPlant = plant;
	}

	public DeploymentContextRepository getDeploymentContextRepository(){
		return _deploymentContextRepository;
	}
}
