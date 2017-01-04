package edu.kit.ipd.sdq.kaps.core.derivation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.repository.DataType;

import edu.kit.ipd.sdq.amp.architecture.AMPArchitectureModelLookup;
import edu.kit.ipd.sdq.amp.model.modificationmarks.AbstractModification;
import edu.kit.ipd.sdq.amp.workplan.AbstractActivityElementType;
import edu.kit.ipd.sdq.amp.workplan.Activity;
import edu.kit.ipd.sdq.amp.workplan.BasicActivity;
import edu.kit.ipd.sdq.kaps.core.ActivityElementType;
import edu.kit.ipd.sdq.kaps.core.ActivityType;
import edu.kit.ipd.sdq.kaps.core.ArchitectureVersion;
import edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifyComponent;
import edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifyDataType;
import edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifyEntity;
import edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifyInterface;
import edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifyProvidedRole;
import edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifyRequiredRole;
import edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifySignature;
import edu.kit.ipd.sdq.kaps.model.modificationmarks.provider.LabelCustomizing;

public class InternalModificationDerivation {
	
	public static List<String> getCausingElementsNames(AbstractModification<?, ?>
			modification) {
		List<String> causingElementNames = new LinkedList<String>();
		for (Object causingElement: modification.getCausingElements()) {
			if (causingElement instanceof Entity) {
				Entity causingEntity = (Entity) causingElement;
				causingElementNames.add(causingEntity.eClass().getName() + " \"" 
						+ causingEntity.getEntityName() + "\"");
			} else if (causingElement instanceof DataType) {
				DataType causingDataType = (DataType) causingElement;
				causingElementNames.add(causingDataType.eClass().getName() + " \""
						+ LabelCustomizing.getDataTypeName(causingDataType) +"\"");
			}
		}
		return causingElementNames;
	}
	
	public static Activity createModificationActivity(AbstractModification<?, ?> 
			modification, List<String> causingElementNames, 
			AbstractActivityElementType activityElementType) {
		if (modification instanceof ModifyEntity<?>) {
			Entity entity = ((ModifyEntity<?>) modification).getAffectedElement();
			return new Activity(ActivityType.INTERNALMODIFICATIONMARK, activityElementType, 
					entity, entity.getEntityName(), causingElementNames, 
					BasicActivity.MODIFY, "Modify " + entity.eClass().getName() + " " 
					+ entity.getEntityName() + ".");
		} else if (modification instanceof ModifyDataType) {
			DataType dataType = ((ModifyDataType) modification).getAffectedElement();
			String dataTypeName = LabelCustomizing.getDataTypeName(dataType);
			return new Activity(ActivityType.INTERNALMODIFICATIONMARK, activityElementType, 
					dataType, dataTypeName, causingElementNames, BasicActivity.MODIFY, 
					"Modify DataType " + dataTypeName + ".");
		} else {
			return null;
		}
	}
	
	public static Activity createModificationActivity(AbstractModification<?, ?> 
			modification, AbstractActivityElementType activityElementType) {
		List<String> causingElementNames = getCausingElementsNames(modification);
		return createModificationActivity(modification, causingElementNames, activityElementType);
	}
	
	public static Activity addModificationSubActivity(AbstractModification<?, ?>
			modification, AbstractActivityElementType activityType, Activity superActivity) {
		Activity result = createModificationActivity(modification, activityType);
		superActivity.addSubActivity(result);
		return result;
	}
	
	public List<Activity> deriveInternalModifications(ArchitectureVersion targetVersion) {
		List<Activity> activityList = new ArrayList<Activity>();
		
		this.deriveComponentModifications(targetVersion, activityList);
		this.deriveInterfaceModifications(targetVersion, activityList);
		
		return activityList;
	}
	
	private void deriveComponentModifications(ArchitectureVersion targetVersion, List<Activity> activityList) {
		Collection<ModifyComponent> modifyComponents = AMPArchitectureModelLookup.
				lookUpAllCalculatedMarksOfAType(targetVersion, ModifyComponent.class);
		for (ModifyComponent modifyComponent : modifyComponents) {
			Activity componentActivity = createModificationActivity(modifyComponent, 
					   ActivityElementType.COMPONENT);
			activityList.add(componentActivity);
			this.deriveSubActivities(modifyComponent, componentActivity);
		}
	}
	
	private void deriveInterfaceModifications(ArchitectureVersion targetVersion, List<Activity> activityList) {
		Collection<ModifyInterface> modifyInterfaces = AMPArchitectureModelLookup.
				lookUpAllCalculatedMarksOfAType(targetVersion, ModifyInterface.class);
		for (ModifyInterface modifyInterface : modifyInterfaces) {
			Activity interfaceActivity = createModificationActivity(modifyInterface, 
					ActivityElementType.INTERFACE);
			activityList.add(interfaceActivity);
			for (ModifySignature modifySignature : modifyInterface.getSignatureModifications()) {
				addModificationSubActivity(modifySignature, ActivityElementType.SIGNATURE, 
						interfaceActivity);
			}
		}
	}

	private void deriveSubActivities(ModifyComponent modifyComponent, 
			Activity componentActivity) {
		for (ModifyProvidedRole modifyProvidedRole : modifyComponent.getProvidedRoleModifications()) {			
		    Activity providedRoleActivity = addModificationSubActivity(modifyProvidedRole, 
						ActivityElementType.PROVIDEDROLE, componentActivity);
		    for (ModifySignature modifySignature : modifyProvidedRole.getSignatureModifications()) {	
				addModificationSubActivity(modifySignature, ActivityElementType.PROVIDEDOPERATION, 
							providedRoleActivity);
			}
		}
		for (ModifyRequiredRole modifyRequiredRole : modifyComponent.getRequiredRoleModifications()) {			
		    Activity requiredRoleActivity = addModificationSubActivity(modifyRequiredRole, 
						ActivityElementType.REQUIREDROLE, componentActivity);
		    for (ModifySignature modifySignature : modifyRequiredRole.getSignatureModifications()) {
				addModificationSubActivity(modifySignature, ActivityElementType.REQUIREDOPERATION, 
							requiredRoleActivity);
			}
		}
	}
}
