package edu.kit.ipd.sdq.kaps.core.derivation;

import java.util.Collection;

import org.palladiosimulator.pcm.core.entity.NamedElement;
import org.palladiosimulator.pcm.repository.CompositeDataType;
import org.palladiosimulator.pcm.repository.EventGroup;
import org.palladiosimulator.pcm.repository.EventType;
import org.palladiosimulator.pcm.repository.InnerDeclaration;
import org.palladiosimulator.pcm.repository.Interface;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.RequiredRole;
import org.palladiosimulator.pcm.repository.Signature;
import org.palladiosimulator.pcm.repository.SinkRole;
import org.palladiosimulator.pcm.repository.SourceRole;

import edu.kit.ipd.sdq.amp.workplan.AbstractActivityElementType;
import edu.kit.ipd.sdq.amp.workplan.Activity;
import edu.kit.ipd.sdq.amp.workplan.BasicActivity;
import edu.kit.ipd.sdq.kaps.core.ActivityElementType;
import edu.kit.ipd.sdq.kaps.core.ActivityType;

public class SubactivityDerivation {
	
	public static Activity addSubActivity(NamedElement entity, 
			AbstractActivityElementType activityElementType, 
			NamedElement parentElement, Activity parentActivity) {
		Activity result = new Activity(ActivityType.ARCHITECTUREMODELDIFF, 
				activityElementType, entity, entity.getEntityName(), null, 
				parentActivity.getBasicActivity(), generateDescription(parentElement, 
						entity, parentActivity.getBasicActivity()));
		parentActivity.addSubActivity(result);
		return result;
	}
	
	public void deriveSubactivities(NamedElement architectureElement, Activity parentActivity) {
		if (architectureElement instanceof Interface) {
			this.deriveSubactivities((Interface) architectureElement, parentActivity);
		} else if (architectureElement instanceof ProvidedRole) {
			this.deriveSubactivities((ProvidedRole) architectureElement, parentActivity);
	 	} else if (architectureElement instanceof RepositoryComponent) {
	 		this.deriveSubactivities((RepositoryComponent) architectureElement, parentActivity);
		} else if (architectureElement instanceof RequiredRole) {
			this.deriveSubactivities((RequiredRole) architectureElement, parentActivity);
		} else if (architectureElement instanceof CompositeDataType) {
			this.deriveSubactivities((CompositeDataType) architectureElement, parentActivity);
		}
	}
	
	protected void deriveSubactivities(RepositoryComponent basicComponent, 
			Activity parentActivity) {
		for (ProvidedRole providedRole : basicComponent.getProvidedRoles_InterfaceProvidingEntity()) {			
			Activity newActivity = addSubActivity(providedRole, ActivityElementType.PROVIDEDROLE, 
					basicComponent, parentActivity);
			this.deriveSubactivities((ProvidedRole) providedRole, newActivity);
		}

		for (RequiredRole requiredRole : basicComponent.getRequiredRoles_InterfaceRequiringEntity()) {
			Activity newActivity = addSubActivity(requiredRole, ActivityElementType.REQUIREDROLE, 
					basicComponent, parentActivity);
			this.deriveSubactivities((RequiredRole) requiredRole, newActivity);
		}
	}

	protected void deriveSubactivities(Interface interfac, Activity parentActivity) {
		if (interfac instanceof OperationInterface) {
			this.deriveSubactivities(((OperationInterface) interfac).
					getSignatures__OperationInterface(), interfac, parentActivity);
		} else if (interfac instanceof EventGroup) {
			this.deriveSubactivities(((EventGroup) interfac).getEventTypes__EventGroup(),
					interfac, parentActivity);
		}
	}

	protected void deriveSubactivities(ProvidedRole providedRole, Activity parentActivity) {
		if (providedRole instanceof OperationProvidedRole) {
			OperationProvidedRole operationProvidedRole = (OperationProvidedRole) providedRole;
			for (OperationSignature operationSignature : operationProvidedRole.
					getProvidedInterface__OperationProvidedRole().getSignatures__OperationInterface()) {
				addSubActivity(operationSignature, ActivityElementType.SIGNATURE, 
						providedRole, parentActivity);
			}
		} else if (providedRole instanceof SinkRole) {
			SinkRole sinkRole = (SinkRole) providedRole;
			for (EventType eventType : sinkRole.getEventGroup__SinkRole().getEventTypes__EventGroup()) {
				addSubActivity(eventType, ActivityElementType.SIGNATURE, 
						providedRole, parentActivity);
			}
		}
	}
	
	protected void deriveSubactivities(RequiredRole requiredRole, Activity parentActivity) {
		if (requiredRole instanceof OperationRequiredRole) {
			OperationRequiredRole operationRequiredRole = (OperationRequiredRole) requiredRole;
			for (OperationSignature operationSignature : operationRequiredRole.
					getRequiredInterface__OperationRequiredRole().getSignatures__OperationInterface()) {
				addSubActivity(operationSignature, ActivityElementType.SIGNATURE, 
						requiredRole, parentActivity);
			}
		} else if (requiredRole instanceof SourceRole) {
			SourceRole sourceRole = (SourceRole) requiredRole;
			for (EventType eventType: sourceRole.getEventGroup__SourceRole().getEventTypes__EventGroup()) {
				addSubActivity(eventType, ActivityElementType.SIGNATURE, 
						requiredRole, parentActivity);
			}
		}		
	}
	
	protected void deriveSubactivities(Collection<? extends Signature> signatures, 
			NamedElement parentElement, Activity parentActivity) {
		for (Signature signature : signatures) {
			addSubActivity(signature, ActivityElementType.SIGNATURE, parentElement, parentActivity);
		}
	}
	
	protected void deriveSubactivities(CompositeDataType dataType, Activity parentActivity) {
		for(InnerDeclaration innerDeclaration: dataType.getInnerDeclaration_CompositeDataType()) {
			addSubActivity(innerDeclaration, ActivityElementType.COMPOSITEDATATYPE_INNERDECLARATION, 
					dataType, parentActivity);
		}	
	}
	
	public static String generateDescription(NamedElement superElement, NamedElement subElement, 
			BasicActivity action) {
		String result = "";
		if (action.equals(BasicActivity.ADD)) {
			result += "Add ";
		} else if (action.equals(BasicActivity.REMOVE)) {
			result += "Remove ";
		} else if (action.equals(BasicActivity.MODIFY)) {
			result += "Modify ";
		}
		result += subElement.eClass().getName() + " " + subElement.getEntityName();
		if (action.equals(BasicActivity.ADD)) {
			result += " to ";
		} else if (action.equals(BasicActivity.REMOVE)) {
			result += " from ";
		} else if (action.equals(BasicActivity.MODIFY)) {
			result += " of ";
		}
		result += superElement.eClass().getName() + " " + superElement.getEntityName() + ".";
		return result;
	}

}
