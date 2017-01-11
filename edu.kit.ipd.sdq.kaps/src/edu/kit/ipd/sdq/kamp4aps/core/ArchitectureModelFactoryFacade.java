package edu.kit.ipd.sdq.kamp4aps.core;

import de.uka.ipd.sdq.componentInternalDependencies.ComponentInternalDependenciesFactory;
import de.uka.ipd.sdq.componentInternalDependencies.ComponentInternalDependencyRepository;

import edu.kit.ipd.sdq.kamp4aps.core.ArchitectureVersion.ArchitectureVersionParams;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.BuildSpecification;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.DeploymentSpecification;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.DevelopmentArtefactSpecification;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.FieldOfActivityAnnotationRepository;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.FieldofactivityannotationsFactory;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ReleaseSpecification;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StaffSpecification;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TestSpecification;
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
		
		DevelopmentArtefactSpecification devSpec = FieldofactivityannotationsFactory.eINSTANCE.createDevelopmentArtefactSpecification();
		repository.setDevelopmentArtefactSpecification(devSpec);
		DeploymentSpecification deploymentSpec = FieldofactivityannotationsFactory.eINSTANCE.createDeploymentSpecification();
		repository.setDeploymentSpecification(deploymentSpec);
		TestSpecification testSpec = FieldofactivityannotationsFactory.eINSTANCE.createTestSpecification();
		repository.setTestSpecification(testSpec);
		ReleaseSpecification releaseSpec = FieldofactivityannotationsFactory.eINSTANCE.createReleaseSpecification();
		repository.setReleaseSpecification(releaseSpec);
		BuildSpecification buildSpec = FieldofactivityannotationsFactory.eINSTANCE.createBuildSpecification();
		repository.setBuildSpecification(buildSpec);
		StaffSpecification staffSpec = FieldofactivityannotationsFactory.eINSTANCE.createStaffSpecification();
		repository.setStaffSpecification(staffSpec);
		staffSpec.setPersonList(FieldofactivityannotationsFactory.eINSTANCE.createPersonList());
		staffSpec.setRoleList(FieldofactivityannotationsFactory.eINSTANCE.createRoleList());
		
		return repository;
	}

}
