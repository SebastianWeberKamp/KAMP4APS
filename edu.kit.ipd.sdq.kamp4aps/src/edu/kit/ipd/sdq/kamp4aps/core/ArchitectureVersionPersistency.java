package edu.kit.ipd.sdq.kamp4aps.core;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import DeploymentContext.DeploymentContextRepository;
//import de.uka.ipd.sdq.componentInternalDependencies.ComponentInternalDependencyRepository;
import edu.kit.ipd.sdq.kamp.util.FileAndFolderManagement;
import edu.kit.ipd.sdq.kamp4aps.core.ArchitectureVersion.ArchitectureVersionParams;
import fieldofactivityannotations.FieldOfActivityAnnotationRepository;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.AbstractKAPSModificationRepository;
import xPPU.Plant;

public class ArchitectureVersionPersistency extends AbstractKAPSArchitectureVersionPersistency<ArchitectureVersion> {	
	
	
	private ArchitectureVersionParams archParams = new ArchitectureVersionParams();

	@Override
	public ArchitectureVersion load(String folderpath, String filename, String versionname) {
		ResourceSet loadResourceSet = new ResourceSetImpl();	
		String fieldOfActivityRepositoryFilePath = filename + "."+FILEEXTENSION_FIELDOFACTIVITYANNOTATIONS;
		String internalModFilePath = filename + "." + FILEEXTENSION_MODIFICATIONMARK;
		String xppufilePath = filename + "." + FILEEXTENSION_XPPU;
		
		archParams.name = versionname;
		archParams.fieldOfActivityRepository = (FieldOfActivityAnnotationRepository)loadEmfModelFromResource(folderpath, fieldOfActivityRepositoryFilePath, loadResourceSet);
		archParams.modificationMarkRepository = (AbstractKAPSModificationRepository<?>)loadEmfModelFromResource(folderpath, internalModFilePath, loadResourceSet);
		archParams.xPPUPlant = (Plant)loadEmfModelFromResource(folderpath, xppufilePath, loadResourceSet);
		archParams.deploymentContextRepository = (DeploymentContextRepository)loadEmfModelFromResource(folderpath, internalModFilePath, loadResourceSet);
		return new ArchitectureVersion(archParams);
	}	
	
	@Override
	public ArchitectureVersion load(IContainer folder, String versionname) {
		ResourceSet loadResourceSet = new ResourceSetImpl();	
		IFile fieldOfActivityRepositoryFile = FileAndFolderManagement.retrieveFileWithExtension(folder, FILEEXTENSION_FIELDOFACTIVITYANNOTATIONS);
		IFile internalModFile = FileAndFolderManagement.retrieveFileWithExtension(folder, FILEEXTENSION_MODIFICATIONMARK);
		IFile xppufile = FileAndFolderManagement.retrieveFileWithExtension(folder, FILEEXTENSION_XPPU);
		IFile deploymentContextFile = FileAndFolderManagement.retrieveFileWithExtension(folder, FILEEXTENSION_DEPLOYMENTCONTEXT);
		
		archParams.fieldOfActivityRepository = null;
		archParams.modificationMarkRepository = null;
		archParams.xPPUPlant = null;
		archParams.deploymentContextRepository = null;
		
		archParams.name = versionname;
		if (fieldOfActivityRepositoryFile != null && fieldOfActivityRepositoryFile.exists())
			archParams.fieldOfActivityRepository = (FieldOfActivityAnnotationRepository)loadEmfModelFromResource(fieldOfActivityRepositoryFile.getFullPath().toString(), null, loadResourceSet);
		if (internalModFile != null && internalModFile.exists())
			archParams.modificationMarkRepository = (AbstractKAPSModificationRepository<?>)loadEmfModelFromResource(internalModFile.getFullPath().toString(), null, loadResourceSet);
		if (xppufile != null && xppufile.exists())
			archParams.xPPUPlant = (Plant)loadEmfModelFromResource(xppufile.getFullPath().toString(), null, loadResourceSet);
		if (deploymentContextFile != null && deploymentContextFile.exists())
			archParams.deploymentContextRepository = (DeploymentContextRepository)loadEmfModelFromResource(deploymentContextFile.getFullPath().toString(), null, loadResourceSet);
		return new ArchitectureVersion(archParams);
	}
	
}
