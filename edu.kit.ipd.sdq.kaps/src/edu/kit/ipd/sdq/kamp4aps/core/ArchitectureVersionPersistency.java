package edu.kit.ipd.sdq.kamp4aps.core;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import de.uka.ipd.sdq.componentInternalDependencies.ComponentInternalDependencyRepository;
import edu.kit.ipd.sdq.amp.util.FileAndFolderManagement;
import edu.kit.ipd.sdq.kamp4aps.core.ArchitectureVersion.ArchitectureVersionParams;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.FieldOfActivityAnnotationRepository;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.AbstractKAPSModificationRepository;
import xPPU.Plant;
import xPPU.XPPUPackage;
import xPPU.InterfaceRepository.InterfaceRepository;

public class ArchitectureVersionPersistency extends AbstractKAPSArchitectureVersionPersistency<ArchitectureVersion> {	
	
	
	private ArchitectureVersionParams archParams = new ArchitectureVersionParams();

	@Override
	public ArchitectureVersion load(String folderpath, String filename, String versionname) {
		ResourceSet loadResourceSet = new ResourceSetImpl();	
		String fieldOfActivityRepositoryFilePath = filename + "."+FILEEXTENSION_FIELDOFACTIVITYANNOTATIONS;
		String internalModFilePath = filename + "." + FILEEXTENSION_MODIFICATIONMARK;
		String cidepfilePath = filename + "." + FILEEXTENSION_COMPONENTINTERNALDEPENDENCIES;
		String xppufilePath = filename + "." + FILEEXTENSION_XPPU;
		
		archParams.name = versionname;
		archParams.fieldOfActivityRepository = (FieldOfActivityAnnotationRepository)loadEmfModelFromResource(folderpath, fieldOfActivityRepositoryFilePath, loadResourceSet);
		archParams.modificationMarkRepository = (AbstractKAPSModificationRepository<?>)loadEmfModelFromResource(folderpath, internalModFilePath, loadResourceSet);
		archParams.componentInternalDependencyRepository = (ComponentInternalDependencyRepository)loadEmfModelFromResource(folderpath, cidepfilePath, loadResourceSet);
		archParams.xPPUPlant = (Plant)loadEmfModelFromResource(folderpath, xppufilePath, loadResourceSet);
		
		return new ArchitectureVersion(archParams);
	}	
	
	@Override
	public ArchitectureVersion load(IContainer folder, String versionname) {
		ResourceSet loadResourceSet = new ResourceSetImpl();	
		IFile fieldOfActivityRepositoryFile = FileAndFolderManagement.retrieveFileWithExtension(folder, FILEEXTENSION_FIELDOFACTIVITYANNOTATIONS);
		IFile internalModFile = FileAndFolderManagement.retrieveFileWithExtension(folder, FILEEXTENSION_MODIFICATIONMARK);
		IFile cidepfile = FileAndFolderManagement.retrieveFileWithExtension(folder, FILEEXTENSION_COMPONENTINTERNALDEPENDENCIES);
		IFile xppufile = FileAndFolderManagement.retrieveFileWithExtension(folder, FILEEXTENSION_XPPU);
		
		archParams.fieldOfActivityRepository = null;
		archParams.modificationMarkRepository = null;
		archParams.componentInternalDependencyRepository = null;
		archParams.xPPUPlant = null;
		
		archParams.name = versionname;
		if (fieldOfActivityRepositoryFile != null && fieldOfActivityRepositoryFile.exists())
			archParams.fieldOfActivityRepository = (FieldOfActivityAnnotationRepository)loadEmfModelFromResource(fieldOfActivityRepositoryFile.getFullPath().toString(), null, loadResourceSet);
		if (internalModFile != null && internalModFile.exists())
			archParams.modificationMarkRepository = (AbstractKAPSModificationRepository<?>)loadEmfModelFromResource(internalModFile.getFullPath().toString(), null, loadResourceSet);
		if (cidepfile != null && cidepfile.exists())
			archParams.componentInternalDependencyRepository = (ComponentInternalDependencyRepository)loadEmfModelFromResource(cidepfile.getFullPath().toString(), null, loadResourceSet);
		if (xppufile != null && xppufile.exists())
			archParams.xPPUPlant = (Plant)loadEmfModelFromResource(xppufile.getFullPath().toString(), null, loadResourceSet);
		
		return new ArchitectureVersion(archParams);
	}
	
}
