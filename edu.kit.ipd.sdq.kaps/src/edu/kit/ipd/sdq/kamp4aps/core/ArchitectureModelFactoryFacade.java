package edu.kit.ipd.sdq.kamp4aps.core;

import de.uka.ipd.sdq.componentInternalDependencies.ComponentInternalDependenciesFactory;
import de.uka.ipd.sdq.componentInternalDependencies.ComponentInternalDependencyRepository;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryFactory;
import org.palladiosimulator.pcm.system.System;
import org.palladiosimulator.pcm.system.SystemFactory;

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
	
	public static ArchitectureVersion createEmptyModel(String name) {
		Repository repository = ArchitectureModelFactoryFacade.createRepository(name);
		System system = ArchitectureModelFactoryFacade.createSystem();
		FieldOfActivityAnnotationRepository fieldOfActivityRepository = ArchitectureModelFactoryFacade.createFieldOfActivityAnnotationsRepository();
		KAPSModificationRepository modificationMarkRepository = ArchitectureModelFactoryFacade.createKAPSModificationMarkRepository();
		ComponentInternalDependencyRepository componentInternalDependencyRepository = ArchitectureModelFactoryFacade.createComponentInternalDependencyRepository();
		return new ArchitectureVersion(name, repository, system, fieldOfActivityRepository, modificationMarkRepository, componentInternalDependencyRepository);
	}
	
	public static Repository createRepository(String name) {
		Repository repository = RepositoryFactory.eINSTANCE.createRepository();
		repository.setEntityName(name);
		return repository;
	}
	
	public static org.palladiosimulator.pcm.system.System createSystem() {
		return SystemFactory.eINSTANCE.createSystem();
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
