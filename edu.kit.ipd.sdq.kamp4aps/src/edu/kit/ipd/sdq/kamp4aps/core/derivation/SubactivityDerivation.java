package edu.kit.ipd.sdq.kamp4aps.core.derivation;

import edu.kit.ipd.sdq.amp.workplan.AbstractActivityElementType;
import edu.kit.ipd.sdq.amp.workplan.Activity;
import edu.kit.ipd.sdq.amp.workplan.BasicActivity;
import edu.kit.ipd.sdq.kamp4aps.core.ActivityType;
import xPPU.ModuleRepository.Module;

public class SubactivityDerivation {
	
	public static Activity addSubActivity(Module entity, 
			AbstractActivityElementType activityElementType, 
			Module parentElement, Activity parentActivity) {
		Activity result = new Activity(ActivityType.ARCHITECTUREMODELDIFF, 
				activityElementType, entity, entity.getId(), null, 
				parentActivity.getBasicActivity(), generateDescription(parentElement, 
						entity, parentActivity.getBasicActivity()));
		parentActivity.addSubActivity(result);
		return result;
	}
	
//	public void deriveSubactivities(NamedElement architectureElement, Activity parentActivity) {
//		if (architectureElement instanceof Interface) {
//			this.deriveSubactivities((Interface) architectureElement, parentActivity);
//		} else if (architectureElement instanceof ProvidedRole) {
//			this.deriveSubactivities((ProvidedRole) architectureElement, parentActivity);
//	 	} else if (architectureElement instanceof RepositoryComponent) {
//	 		this.deriveSubactivities((RepositoryComponent) architectureElement, parentActivity);
//		} else if (architectureElement instanceof RequiredRole) {
//			this.deriveSubactivities((RequiredRole) architectureElement, parentActivity);
//		} else if (architectureElement instanceof CompositeDataType) {
//			this.deriveSubactivities((CompositeDataType) architectureElement, parentActivity);
//		}
//	}
	
//	protected void deriveSubactivities(RepositoryComponent basicComponent, 
//			Activity parentActivity) {
//		for (ProvidedRole providedRole : basicComponent.getProvidedRoles_InterfaceProvidingEntity()) {			
//			Activity newActivity = addSubActivity(providedRole, ActivityElementType.PROVIDEDROLE, 
//					basicComponent, parentActivity);
//			this.deriveSubactivities((ProvidedRole) providedRole, newActivity);
//		}
//
//		for (RequiredRole requiredRole : basicComponent.getRequiredRoles_InterfaceRequiringEntity()) {
//			Activity newActivity = addSubActivity(requiredRole, ActivityElementType.REQUIREDROLE, 
//					basicComponent, parentActivity);
//			this.deriveSubactivities((RequiredRole) requiredRole, newActivity);
//		}
//	}
//
//	protected void deriveSubactivities(Interface interfac, Activity parentActivity) {
//		if (interfac instanceof OperationInterface) {
//			this.deriveSubactivities(((OperationInterface) interfac).
//					getSignatures__OperationInterface(), interfac, parentActivity);
//		} else if (interfac instanceof EventGroup) {
//			this.deriveSubactivities(((EventGroup) interfac).getEventTypes__EventGroup(),
//					interfac, parentActivity);
//		}
//	}
//
//	protected void deriveSubactivities(ProvidedRole providedRole, Activity parentActivity) {
//		if (providedRole instanceof OperationProvidedRole) {
//			OperationProvidedRole operationProvidedRole = (OperationProvidedRole) providedRole;
//			for (OperationSignature operationSignature : operationProvidedRole.
//					getProvidedInterface__OperationProvidedRole().getSignatures__OperationInterface()) {
//				addSubActivity(operationSignature, ActivityElementType.SIGNATURE, 
//						providedRole, parentActivity);
//			}
//		} else if (providedRole instanceof SinkRole) {
//			SinkRole sinkRole = (SinkRole) providedRole;
//			for (EventType eventType : sinkRole.getEventGroup__SinkRole().getEventTypes__EventGroup()) {
//				addSubActivity(eventType, ActivityElementType.SIGNATURE, 
//						providedRole, parentActivity);
//			}
//		}
//	}
//	
//	protected void deriveSubactivities(RequiredRole requiredRole, Activity parentActivity) {
//		if (requiredRole instanceof OperationRequiredRole) {
//			OperationRequiredRole operationRequiredRole = (OperationRequiredRole) requiredRole;
//			for (OperationSignature operationSignature : operationRequiredRole.
//					getRequiredInterface__OperationRequiredRole().getSignatures__OperationInterface()) {
//				addSubActivity(operationSignature, ActivityElementType.SIGNATURE, 
//						requiredRole, parentActivity);
//			}
//		} else if (requiredRole instanceof SourceRole) {
//			SourceRole sourceRole = (SourceRole) requiredRole;
//			for (EventType eventType: sourceRole.getEventGroup__SourceRole().getEventTypes__EventGroup()) {
//				addSubActivity(eventType, ActivityElementType.SIGNATURE, 
//						requiredRole, parentActivity);
//			}
//		}		
//	}
//	
//	protected void deriveSubactivities(Collection<? extends Signature> signatures, 
//			NamedElement parentElement, Activity parentActivity) {
//		for (Signature signature : signatures) {
//			addSubActivity(signature, ActivityElementType.SIGNATURE, parentElement, parentActivity);
//		}
//	}
//	
//	protected void deriveSubactivities(CompositeDataType dataType, Activity parentActivity) {
//		for(InnerDeclaration innerDeclaration: dataType.getInnerDeclaration_CompositeDataType()) {
//			addSubActivity(innerDeclaration, ActivityElementType.COMPOSITEDATATYPE_INNERDECLARATION, 
//					dataType, parentActivity);
//		}	
//	}
	
	public static String generateDescription(Module superElement, Module subElement, 
			BasicActivity action) {
		String result = "";
		if (action.equals(BasicActivity.ADD)) {
			result += "Add ";
		} else if (action.equals(BasicActivity.REMOVE)) {
			result += "Remove ";
		} else if (action.equals(BasicActivity.MODIFY)) {
			result += "Modify ";
		}
		result += subElement.eClass().getName() + " " + subElement.getId();
		if (action.equals(BasicActivity.ADD)) {
			result += " to ";
		} else if (action.equals(BasicActivity.REMOVE)) {
			result += " from ";
		} else if (action.equals(BasicActivity.MODIFY)) {
			result += " of ";
		}
		result += superElement.eClass().getName() + " " + superElement.getId() + ".";
		return result;
	}

}
