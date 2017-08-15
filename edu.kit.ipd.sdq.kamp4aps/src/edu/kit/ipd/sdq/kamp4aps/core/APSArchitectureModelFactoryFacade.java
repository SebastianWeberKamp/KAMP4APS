package edu.kit.ipd.sdq.kamp4aps.core;

import DeploymentContext.DeploymentContextFactory;
import DeploymentContext.DeploymentContextRepository;

import edu.kit.ipd.sdq.kamp4aps.core.ArchitectureVersion.ArchitectureVersionParams;
import fieldofactivityannotations.CalibrationSpecification;
import fieldofactivityannotations.DocumentationSpecification;
import fieldofactivityannotations.ECADSpecification;
import fieldofactivityannotations.FieldOfActivityAnnotationRepository;
import fieldofactivityannotations.FieldofactivityannotationsFactory;
import fieldofactivityannotations.HMISpecification;
import fieldofactivityannotations.StaffSpecification;
import fieldofactivityannotations.StockSpecification;
import fieldofactivityannotations.TestSpecification;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.KAPSModificationRepository;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.KAPSSeedModifications;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.modificationmarksFactory;

/**
 * This class loads the structural and non-structural models
 * as well as the aPS specific correspondence model.
 * More information to the correspondence model can be found
 * in the link below.
 * 
 * @author Sandro Koch
 * @see <a href="https://sdqweb.ipd.kit.edu/publications/pdfs/koch2017a.pdf">koch2017a<\a>
 * 
 */

public class ArchitectureModelFactoryFacade {
	
	private static ArchitectureVersionParams archParams = new ArchitectureVersionParams();
	
	public static ArchitectureVersion createEmptyModel(String name) {
		archParams.name = name;
		archParams.fieldOfActivityRepository = ArchitectureModelFactoryFacade.createFieldOfActivityAnnotationsRepository();
		archParams.modificationMarkRepository = ArchitectureModelFactoryFacade.createKAPSModificationMarkRepository();
		archParams.deploymentContextRepository = ArchitectureModelFactoryFacade.createDeploymentContextRepository();
		return new ArchitectureVersion(archParams);
	}
	
	public static KAPSModificationRepository createKAPSModificationMarkRepository() {
		KAPSModificationRepository repository = modificationmarksFactory.eINSTANCE.createKAPSModificationRepository();

		KAPSSeedModifications seedModifications = modificationmarksFactory.eINSTANCE.createKAPSSeedModifications();
		repository.setSeedModifications(seedModifications);
		
		return repository;
	}
	
	public static DeploymentContextRepository createDeploymentContextRepository() {
		DeploymentContextRepository repository = DeploymentContextFactory.eINSTANCE.createDeploymentContextRepository();
		return repository;
	}

	public static FieldOfActivityAnnotationRepository createFieldOfActivityAnnotationsRepository() {
		FieldOfActivityAnnotationRepository repository =  FieldofactivityannotationsFactory.eINSTANCE.createFieldOfActivityAnnotationRepository();
		
		TestSpecification testSpec = FieldofactivityannotationsFactory.eINSTANCE.createTestSpecification();
		repository.setTestSpecification(testSpec);
		
		StockSpecification stockSpec = FieldofactivityannotationsFactory.eINSTANCE.createStockSpecification();
		repository.setStockSpecification(stockSpec);
		
		HMISpecification hmiSpec = FieldofactivityannotationsFactory.eINSTANCE.createHMISpecification();
		repository.setHmiSpecification(hmiSpec);
		
		ECADSpecification ecadSpec = FieldofactivityannotationsFactory.eINSTANCE.createECADSpecification();
		repository.setEcadSpecification(ecadSpec);
		
		DocumentationSpecification docSpec = FieldofactivityannotationsFactory.eINSTANCE.createDocumentationSpecification();
		repository.setDocumentationSpecification(docSpec);

		StaffSpecification staffSpec = FieldofactivityannotationsFactory.eINSTANCE.createStaffSpecification();
		repository.setStaffSpecification(staffSpec);
		staffSpec.setPersonList(FieldofactivityannotationsFactory.eINSTANCE.createPersonList());
		staffSpec.setRoleList(FieldofactivityannotationsFactory.eINSTANCE.createRoleList());
		
		CalibrationSpecification calSpec = FieldofactivityannotationsFactory.eINSTANCE.createCalibrationSpecification();
		repository.setCalibrationSpecification(calSpec);
		
		return repository;
	}

}
