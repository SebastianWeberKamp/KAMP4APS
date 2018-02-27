package edu.kit.ipd.sdq.kamp4aps.core;

import edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.DeploymentContextFactory;
import edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.DeploymentContextRepository;
import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.FieldOfActivityAnnotationRepository;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.KAMP4aPSFieldofactivityannotationsFactory;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsFactory;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsRepository;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.Configuration;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelFactory;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.AbstractKAMP4IECModificationRepository;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModificationRepository;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModificationmarksFactory;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryFactory;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.AbstractKAMP4aPSModificationRepository;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSModificationRepository;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.Plant;

/**
 * This class creates the structural and non-structural
 * in memory representations.
 * 
 * @author Sandro Koch
 *
 */

public class APSArchitectureVersion extends AbstractArchitectureVersion<AbstractKAMP4aPSModificationRepository<?>> {
	private FieldOfActivityAnnotationRepository _fieldOfActivityRepository;
	private Plant _aPSPlant;
	private DeploymentContextRepository _deploymentContextRepository;
	private Repository _IECRepository;
	private Configuration _configuration;
	private IECFieldOfActivityAnnotationsRepository _iecFieldOfActivityRepository;
	public AbstractKAMP4IECModificationRepository _iecModificationMarkRepository;
	
	public static class ArchitectureVersionParams{
		public String name;
		public FieldOfActivityAnnotationRepository fieldOfActivityRepository;
		public KAMP4aPSModificationRepository modificationMarkRepository;
		public DeploymentContextRepository deploymentContextRepository;
		public Plant aPSPlant;

		public AbstractKAMP4IECModificationRepository iecModificationMarkRepository;
		public Repository iecRepository;
		public Configuration configuration;
		public IECFieldOfActivityAnnotationsRepository iecFieldOfActivityRepository;
	}
	
	public APSArchitectureVersion(ArchitectureVersionParams params) {
		super(params.name, params.modificationMarkRepository);
		// Some of the files describing the architecture might not exist; prevent NullPointer
		// in propagation algorithm by setting newly created objects (whose EReferences are
		// instantiated with empty collections, so the algorithm can handle them)
		
		if (params.fieldOfActivityRepository == null)
			params.fieldOfActivityRepository = KAMP4aPSFieldofactivityannotationsFactory.eINSTANCE.
					createFieldOfActivityAnnotationRepository();

		_fieldOfActivityRepository = params.fieldOfActivityRepository;
		_aPSPlant = params.aPSPlant;
		
		if(params.deploymentContextRepository == null)
			params.deploymentContextRepository = DeploymentContextFactory.eINSTANCE.createDeploymentContextRepository();
		_deploymentContextRepository = params.deploymentContextRepository;
		
		if (params.iecRepository == null) {
			_IECRepository = IECRepositoryFactory.eINSTANCE.
					createRepository();
		}
		this._IECRepository = params.iecRepository;
		if (params.configuration == null) {
			_configuration = IECModelFactory.eINSTANCE.
					createConfiguration();
		}
		this._configuration = params.configuration;
		if (params.fieldOfActivityRepository == null) {
			_iecFieldOfActivityRepository = IECFieldOfActivityAnnotationsFactory.eINSTANCE.
					createIECFieldOfActivityAnnotationsRepository();
		}
		this._iecModificationMarkRepository = params.iecModificationMarkRepository;
		if (params.iecModificationMarkRepository == null) {
			_iecModificationMarkRepository = IECModificationmarksFactory.eINSTANCE.
					createIECModificationRepository();
		}
	}

	public FieldOfActivityAnnotationRepository getFieldOfActivityRepository() {
		return _fieldOfActivityRepository;
	}

	public void setFieldOfActivityRepository(
			FieldOfActivityAnnotationRepository fieldOfActivityRepository) {
		this._fieldOfActivityRepository = fieldOfActivityRepository;
	}

	public Plant getAPSPlant(){
		return _aPSPlant;
	}

	public void setAPSPlant(Plant plant) {
		this._aPSPlant = plant;
	}

	public DeploymentContextRepository getDeploymentContextRepository(){
		return _deploymentContextRepository;
	}

	public Repository getIECRepository() {
		return _IECRepository;
	}

	public void setIECRepository(Repository iecRepository) {
		this._IECRepository = iecRepository;
	}

	public Configuration getConfiguration() {
		return _configuration;
	}

	public void setKonfiguration(Configuration configuration) {
		this._configuration = configuration;
	}

	public IECFieldOfActivityAnnotationsRepository getIECFieldOfActivityRepository() {
		return _iecFieldOfActivityRepository;
	}

	public void setIECFieldOfActivityRepository(IECFieldOfActivityAnnotationsRepository fieldOfActivityRepository) {
		this._iecFieldOfActivityRepository = fieldOfActivityRepository;
	}

	public AbstractKAMP4IECModificationRepository getIECModificationMarkRepository() {
		return _iecModificationMarkRepository;
	}

	public void setIECModificationMarkRepository(AbstractKAMP4IECModificationRepository _iecModificationMarkRepository) {
		this._iecModificationMarkRepository = _iecModificationMarkRepository;
	}
}
