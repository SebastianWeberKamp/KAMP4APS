package edu.kit.ipd.sdq.kamp4aps.core.derivation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.ReferenceChange;
import org.palladiosimulator.pcm.core.entity.NamedElement;
import org.palladiosimulator.pcm.repository.DataType;

import edu.kit.ipd.sdq.amp.workplan.AbstractWorkplanDerivation;
import edu.kit.ipd.sdq.amp.workplan.Activity;
import edu.kit.ipd.sdq.amp.workplan.BasicActivity;
import edu.kit.ipd.sdq.kamp4aps.core.ActivityElementType;
import edu.kit.ipd.sdq.kamp4aps.core.ActivityType;
import edu.kit.ipd.sdq.kamp4aps.core.ArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.provider.LabelCustomizing;

public abstract class AbstractKAPSDifferenceCalculation<T extends ArchitectureVersion> 
		extends AbstractWorkplanDerivation<T> {

	private final InternalModificationDerivation architectureInternalModificationDerivation = 
			new InternalModificationDerivation();
	private final SubactivityDerivation architectureSubactivityDerivation =
			new SubactivityDerivation();

	@Override
	protected void checkForDifferencesAndAddToWorkplan(Diff diffElement, List<Activity> workplan) {
		for (ActivityElementType elementType: ActivityElementType.topLevelPCMActivityElementTypes()) {
			if (detectionRuleAdded(diffElement, elementType.getElementClass())) {
				if (elementType == ActivityElementType.DATATYPE) {
					DataType architectureElement = (DataType)(((ReferenceChange)diffElement).getValue());
					workplan.add(new Activity(ActivityType.ARCHITECTUREMODELDIFF, elementType, 
							architectureElement, LabelCustomizing.getDataTypeName(architectureElement), 
							null, BasicActivity.ADD, createAddElementDescription(architectureElement)));
				} else { //all other supported elements (including CompositeDataType and 
					// CollectionDataType are Entities -> NamedElements
					NamedElement architectureElement = (NamedElement)(((ReferenceChange)diffElement).getValue());
					Activity newActivity = new Activity(ActivityType.ARCHITECTUREMODELDIFF, elementType, 
							architectureElement, architectureElement.getEntityName(), null,
							BasicActivity.ADD, createAddElementDescription(architectureElement));
					workplan.add(newActivity);
					this.architectureSubactivityDerivation.deriveSubactivities(
							architectureElement, newActivity);
				}
				return;
			} else if (detectionRuleDeleted(diffElement, elementType.getElementClass())) {
				if (elementType == ActivityElementType.DATATYPE) {
					DataType architectureElement = (DataType)(((ReferenceChange)diffElement).getValue());
					workplan.add(new Activity(ActivityType.ARCHITECTUREMODELDIFF, elementType, 
							architectureElement, LabelCustomizing.getDataTypeName(architectureElement), 
							null, BasicActivity.REMOVE, createRemoveElementDescription(architectureElement)));
				} else {
					NamedElement architectureElement = (NamedElement)(((ReferenceChange)diffElement).getValue());
					Activity newActivity = new Activity(ActivityType.ARCHITECTUREMODELDIFF, elementType,
							architectureElement, architectureElement.getEntityName(), null,
							BasicActivity.REMOVE, createRemoveElementDescription(architectureElement));
					workplan.add(newActivity);
					this.architectureSubactivityDerivation.deriveSubactivities(
							architectureElement, newActivity);
				}
				return;
			}
		}
	}

	@Override
	public List<Activity> deriveWorkplan(T baseVersion, T targetVersion) {
		List<Activity> activityList = new ArrayList<Activity>();		
		List<Activity> internalModificationActivities = this.architectureInternalModificationDerivation.
				deriveInternalModifications(targetVersion);
		activityList.addAll(internalModificationActivities);
		
		return activityList;
	}
	
	public static String createAddElementDescription(NamedElement element) {
		return "Add " + element.eClass().getName() + " " + element.getEntityName() + ".";
	}
	
	public static String createAddElementDescription(DataType element) {
		return "Add " + element.eClass().getName() + " " + element.toString() + ".";
	}
	
	public static String createRemoveElementDescription(NamedElement element) {
		return "Remove " + element.eClass().getName() + " " + element.getEntityName() + ".";
	}
	
	public static String createRemoveElementDescription(DataType element) {
		return "Remove " + element.eClass().getName() + " " + LabelCustomizing.
				getDataTypeName(element) + ".";
	}
}
