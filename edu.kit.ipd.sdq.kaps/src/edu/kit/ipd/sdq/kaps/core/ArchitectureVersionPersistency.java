package edu.kit.ipd.sdq.kaps.core;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import de.uka.ipd.sdq.componentInternalDependencies.ComponentInternalDependencyRepository;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.system.System;

import edu.kit.ipd.sdq.amp.util.FileAndFolderManagement;
import edu.kit.ipd.sdq.kaps.model.fieldofactivityannotations.FieldOfActivityAnnotationRepository;
import edu.kit.ipd.sdq.kaps.model.modificationmarks.AbstractKAPSModificationRepository;

public class ArchitectureVersionPersistency extends AbstractKAPSArchitectureVersionPersistency<ArchitectureVersion> {	
	
	@Override
	public ArchitectureVersion load(String folderpath, String filename, String versionname) {
		ResourceSet loadResourceSet = new ResourceSetImpl();	
		String repositoryfilePath = filename + "."+FILEEXTENSION_REPOSITORY;
		String systemfilePath = filename + "."+FILEEXTENSION_SYSTEM;
		String fieldOfActivityRepositoryFilePath = filename + "."+FILEEXTENSION_FIELDOFACTIVITYANNOTATIONS;
		String internalModFilePath = filename + "." + FILEEXTENSION_MODIFICATIONMARK;
		String cidepfilePath = filename + "." + FILEEXTENSION_COMPONENTINTERNALDEPENDENCIES;

		Repository repository = (Repository)loadEmfModelFromResource(folderpath, repositoryfilePath, loadResourceSet);
		System system = (System)loadEmfModelFromResource(folderpath, systemfilePath, loadResourceSet);
		FieldOfActivityAnnotationRepository fieldOfActivityRepository = (FieldOfActivityAnnotationRepository)loadEmfModelFromResource(folderpath, fieldOfActivityRepositoryFilePath, loadResourceSet);
		AbstractKAPSModificationRepository<?> modificationMarkRepository = (AbstractKAPSModificationRepository<?>)loadEmfModelFromResource(folderpath, internalModFilePath, loadResourceSet);
		ComponentInternalDependencyRepository componentInternalDependencyRepository = (ComponentInternalDependencyRepository)loadEmfModelFromResource(folderpath, cidepfilePath, loadResourceSet);
		
		return new ArchitectureVersion(versionname, repository, system, fieldOfActivityRepository, modificationMarkRepository, componentInternalDependencyRepository);
	}	
	
	@Override
	public ArchitectureVersion load(IContainer folder, String versionname) {
		ResourceSet loadResourceSet = new ResourceSetImpl();	
		IFile repositoryfile = FileAndFolderManagement.retrieveFileWithExtension(folder, FILEEXTENSION_REPOSITORY);
		IFile systemfile = FileAndFolderManagement.retrieveFileWithExtension(folder, FILEEXTENSION_SYSTEM);
		IFile fieldOfActivityRepositoryFile = FileAndFolderManagement.retrieveFileWithExtension(folder, FILEEXTENSION_FIELDOFACTIVITYANNOTATIONS);
		IFile internalModFile = FileAndFolderManagement.retrieveFileWithExtension(folder, FILEEXTENSION_MODIFICATIONMARK);
		IFile cidepfile = FileAndFolderManagement.retrieveFileWithExtension(folder, FILEEXTENSION_COMPONENTINTERNALDEPENDENCIES);

		Repository repository = null;
		System system = null;
		FieldOfActivityAnnotationRepository fieldOfActivityRepository = null;
		AbstractKAPSModificationRepository<?> modificationMarkRepository = null;
		ComponentInternalDependencyRepository componentInternalDependencyRepository = null;
		
		if (repositoryfile != null && repositoryfile.exists())
			repository = (Repository)loadEmfModelFromResource(repositoryfile.getFullPath().toString(), null, loadResourceSet);
		if (systemfile != null && systemfile.exists())
			system = (System)loadEmfModelFromResource(systemfile.getFullPath().toString(), null, loadResourceSet);
		if (fieldOfActivityRepositoryFile != null && fieldOfActivityRepositoryFile.exists())
			fieldOfActivityRepository = (FieldOfActivityAnnotationRepository)loadEmfModelFromResource(fieldOfActivityRepositoryFile.getFullPath().toString(), null, loadResourceSet);
		if (internalModFile != null && internalModFile.exists())
			modificationMarkRepository = (AbstractKAPSModificationRepository<?>)loadEmfModelFromResource(internalModFile.getFullPath().toString(), null, loadResourceSet);
		if (cidepfile != null && cidepfile.exists())
			componentInternalDependencyRepository = (ComponentInternalDependencyRepository)loadEmfModelFromResource(cidepfile.getFullPath().toString(), null, loadResourceSet);
		
		return new ArchitectureVersion(versionname, repository, system, fieldOfActivityRepository, modificationMarkRepository, componentInternalDependencyRepository);
	}
	
}
