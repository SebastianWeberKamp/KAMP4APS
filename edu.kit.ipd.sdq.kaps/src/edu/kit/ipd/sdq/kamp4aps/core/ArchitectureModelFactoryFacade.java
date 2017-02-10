package edu.kit.ipd.sdq.kamp4aps.core;

import de.uka.ipd.sdq.componentInternalDependencies.ComponentInternalDependenciesFactory;
import de.uka.ipd.sdq.componentInternalDependencies.ComponentInternalDependencyRepository;

import edu.kit.ipd.sdq.kamp4aps.core.ArchitectureVersion.ArchitectureVersionParams;
import fieldofactivityannotations.CalibrationSpecification;
import fieldofactivityannotations.ComponentSpecification;
import fieldofactivityannotations.DevelopmentSpecification;
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

public class ArchitectureModelFactoryFacade {
	
	private static ArchitectureVersionParams archParams = new ArchitectureVersionParams();
	
	public static ArchitectureVersion createEmptyModel(String name) {
		archParams.name = name;
		archParams.fieldOfActivityRepository = ArchitectureModelFactoryFacade.createFieldOfActivityAnnotationsRepository();
		archParams.modificationMarkRepository = ArchitectureModelFactoryFacade.createKAPSModificationMarkRepository();
		return new ArchitectureVersion(archParams);
	}
	
	public static KAPSModificationRepository createKAPSModificationMarkRepository() {
		KAPSModificationRepository repository = modificationmarksFactory.eINSTANCE.createKAPSModificationRepository();

		KAPSSeedModifications seedModifications = modificationmarksFactory.eINSTANCE.createKAPSSeedModifications();
		repository.setSeedModifications(seedModifications);
		
		return repository;
	}

	public static ComponentInternalDependencyRepository createComponentInternalDependencyRepository() {
		return ComponentInternalDependenciesFactory.eINSTANCE.createComponentInternalDependencyRepository();
	}

	public static FieldOfActivityAnnotationRepository createFieldOfActivityAnnotationsRepository() {
		FieldOfActivityAnnotationRepository repository =  FieldofactivityannotationsFactory.eINSTANCE.createFieldOfActivityAnnotationRepository();
		
		TestSpecification testSpec = FieldofactivityannotationsFactory.eINSTANCE.createTestSpecification();
		repository.setTestSpecification(testSpec);
		
		StockSpecification stockSpec = FieldofactivityannotationsFactory.eINSTANCE.createStockSpecification();
		repository.setPurchaseSpecification(stockSpec);
		
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
		
		DevelopmentSpecification devSpec = FieldofactivityannotationsFactory.eINSTANCE.createDevelopmentSpecification();
		repository.setDevelopmentSpecification(devSpec);
		
		ComponentSpecification comSpec = FieldofactivityannotationsFactory.eINSTANCE.createComponentSpecification();
		repository.setComponentSpecification(comSpec);
		
		return repository;
	}

}
