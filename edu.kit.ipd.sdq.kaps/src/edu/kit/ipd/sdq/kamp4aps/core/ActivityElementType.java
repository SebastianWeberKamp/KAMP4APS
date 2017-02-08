package edu.kit.ipd.sdq.kamp4aps.core;

import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.repository.CollectionDataType;
import org.palladiosimulator.pcm.repository.CompositeDataType;
import org.palladiosimulator.pcm.repository.DataType;
import org.palladiosimulator.pcm.repository.InnerDeclaration;
import org.palladiosimulator.pcm.repository.Interface;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.RequiredRole;
import org.palladiosimulator.pcm.repository.Signature;

import edu.kit.ipd.sdq.amp.workplan.AbstractActivityElementType;
import fieldofactivityannotations.BuildConfiguration;
import fieldofactivityannotations.DeploymentSpecification;
import fieldofactivityannotations.MetadataFile;
import fieldofactivityannotations.ReleaseConfiguration;
import fieldofactivityannotations.SourceFile;
import fieldofactivityannotations.TestCase;
import xPPU.BusComponents.BusBox;

public enum ActivityElementType implements AbstractActivityElementType {
	// PCM-related
	CONNECTOR(Connector.class),
	COMPONENT(RepositoryComponent.class),
	COMPOSITEDATATYPE(CompositeDataType.class),
	COLLECTIONDATATYPE(CollectionDataType.class),
	DATATYPE(DataType.class),
	INTERFACE(Interface.class), 
	PROVIDEDROLE(ProvidedRole.class),
	REQUIREDROLE(RequiredRole.class),
	SIGNATURE(Signature.class),
	BUSBOX(BusBox.class),
	// PCM-related sub-activity
	COMPOSITEDATATYPE_INNERDECLARATION(InnerDeclaration.class),
	PROVIDEDOPERATION(Signature.class),
	REQUIREDOPERATION(Signature.class),
	// annotation-related
	SOURCECODEFILES(SourceFile.class),
	METADATAFILES(MetadataFile.class),
	BUILDCONFIGURATION(BuildConfiguration.class),
	TESTCASE(TestCase.class), 
	RELEASECONFIGURATION(ReleaseConfiguration.class),
	DEPLOYMENTCONFIGURATION(DeploymentSpecification.class);
	
	private final Class<?> clazz;
	private final String name;
	
	private ActivityElementType(Class<?> clazz) {
		this.clazz = clazz;
		this.name = clazz.getSimpleName();
	}

	@Override
	public Class<?> getElementClass() {
		return clazz;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	public static ActivityElementType[] topLevelPCMActivityElementTypes() {
		return new ActivityElementType[]{CONNECTOR, COMPONENT, COMPOSITEDATATYPE,
				COLLECTIONDATATYPE, DATATYPE, INTERFACE, PROVIDEDROLE, 
				REQUIREDROLE, SIGNATURE};
	}
}
