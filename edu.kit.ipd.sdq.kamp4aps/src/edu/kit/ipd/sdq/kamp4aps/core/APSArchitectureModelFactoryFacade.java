package edu.kit.ipd.sdq.kamp4aps.core;

import edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.DeploymentContextFactory;
import edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.DeploymentContextRepository;

import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureVersion.ArchitectureVersionParams;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.CalibrationSpecification;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.DocumentationSpecification;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ECADSpecification;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.FieldOfActivityAnnotationRepository;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.FieldofactivityannotationsFactory;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.HMISpecification;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StaffSpecification;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StockSpecification;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TestSpecification;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSModificationRepository;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSSeedModifications;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSModificationmarksFactory;

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

public class APSArchitectureModelFactoryFacade {
	
	private static ArchitectureVersionParams archParams = new ArchitectureVersionParams();
	
	public static APSArchitectureVersion createEmptyModel(String name) {
		archParams.name = name;
		archParams.fieldOfActivityRepository = APSArchitectureModelFactoryFacade.createFieldOfActivityAnnotationsRepository();
		archParams.modificationMarkRepository = APSArchitectureModelFactoryFacade.createKAMP4aPSModificationMarkRepository();
		archParams.deploymentContextRepository = APSArchitectureModelFactoryFacade.createDeploymentContextRepository();
		return new APSArchitectureVersion(archParams);
	}
	
	public static KAMP4aPSModificationRepository createKAMP4aPSModificationMarkRepository() {
		KAMP4aPSModificationRepository repository = KAMP4aPSModificationmarksFactory.eINSTANCE.createKAMP4aPSModificationRepository();

		KAMP4aPSSeedModifications seedModifications = KAMP4aPSModificationmarksFactory.eINSTANCE.createKAMP4aPSSeedModifications();
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
