package edu.kit.ipd.sdq.kamp4aps.core.derivation;

import java.util.List;

import org.eclipse.emf.compare.Diff;

import edu.kit.ipd.sdq.kamp.derivation.AbstractDifferenceCalculation;
import edu.kit.ipd.sdq.kamp.workplan.Activity;
import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureVersion;
import java.util.ArrayList;

import org.eclipse.emf.compare.ReferenceChange;

import edu.kit.ipd.sdq.kamp.workplan.BasicActivity;
import edu.kit.ipd.sdq.kamp4aps.core.APSActivityElementType;
import edu.kit.ipd.sdq.kamp4aps.core.APSActivityType;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.provider.LabelCustomizing;
import xPPU.Identifier.NamedElement;

/**
 * 
 * This class compares the models before and after the changes.
 * If elements are added or removed, the activity is added
 * to the work plan and the change propagation analysis for
 * the found changes is started.
 * 
 * @author Sandro Koch
 *
 */
public class APSDifferenceCalculation extends AbstractDifferenceCalculation<APSArchitectureVersion>{

	private final APSInternalModificationDerivation architectureInternalModificationDerivation = new APSInternalModificationDerivation();
	private final APSSubactivityDerivation architectureSubactivityDerivation = new APSSubactivityDerivation();
	private APSArchitectureVersion version;
	
	@Override
	protected void checkForDifferencesAndAddToWorkplan(Diff diffElement, List<Activity> workplan) {
		for (APSActivityElementType elementType : APSActivityElementType.topLevelAPSActivityElementTypes()) {
			if (detectionRuleAdded(diffElement, elementType.getElementClass())) {
				NamedElement architectureElement = (NamedElement) (((ReferenceChange) diffElement).getValue());
				Activity newActivity = new Activity(APSActivityType.ARCHITECTUREMODELDIFF, elementType, architectureElement,
						LabelCustomizing.getIdentifierName(architectureElement), null, BasicActivity.ADD,
						createAddElementDescription(architectureElement));
				workplan.add(newActivity);
				this.architectureSubactivityDerivation.deriveSubactivities(architectureElement, newActivity, version);
				return;
			} else if (detectionRuleDeleted(diffElement, elementType.getElementClass())) {
				NamedElement architectureElement = (NamedElement) (((ReferenceChange) diffElement).getValue());
				Activity newActivity = new Activity(APSActivityType.ARCHITECTUREMODELDIFF, elementType, architectureElement,
						LabelCustomizing.getIdentifierName(architectureElement), null, BasicActivity.REMOVE,
						createRemoveElementDescription(architectureElement));
				workplan.add(newActivity);
				this.architectureSubactivityDerivation.deriveSubactivities(architectureElement, newActivity, version);
				return;
			}
		}
	}

	@Override
	public List<Activity> deriveWorkplan(APSArchitectureVersion baseVersion, APSArchitectureVersion targetVersion) {
		this.version = targetVersion;
		List<Activity> activityList = new ArrayList<Activity>();
		
		List<Diff> plantDiff = calculateDiffModel(baseVersion.getXPPUPlant(), targetVersion.getXPPUPlant());
		
		List<Activity> plantActivities = deriveAddAndRemoveActivities(plantDiff);
		plantActivities = removeDuplicates(plantActivities);
		activityList.addAll(plantActivities);		
		
		List<Activity> internalModificationActivities = this.architectureInternalModificationDerivation
				.deriveInternalModifications(targetVersion);
		activityList.addAll(internalModificationActivities);

		return activityList;
	}

	private List<Activity> removeDuplicates(List<Activity> plantActivities) {
		List<Activity> newActivities = new ArrayList<Activity>();
		boolean isContained;
		for(Activity activity : plantActivities){
			isContained = false;
			for(Activity tmpActivity : newActivities){
				if(tmpActivity.getElementName().equals(activity.getElementName()))
					isContained = true;
			}
			
			if(!isContained)
				newActivities.add(activity);
		}
		return newActivities;
	}

	public static String createAddElementDescription(NamedElement element) {
		return "Add " + element.eClass().getName() + " " + element.getName() + ".";
	}

	public static String createRemoveElementDescription(NamedElement element) {
		return "Remove " + element.eClass().getName() + " " + element.getName() + ".";
	}


}
