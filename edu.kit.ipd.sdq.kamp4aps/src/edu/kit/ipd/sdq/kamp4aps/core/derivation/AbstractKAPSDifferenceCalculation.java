package edu.kit.ipd.sdq.kamp4aps.core.derivation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.ReferenceChange;

import edu.kit.ipd.sdq.kamp.workplan.AbstractWorkplanDerivation;
import edu.kit.ipd.sdq.kamp.workplan.Activity;
import edu.kit.ipd.sdq.kamp.workplan.BasicActivity;
import edu.kit.ipd.sdq.kamp4aps.core.ActivityElementType;
import edu.kit.ipd.sdq.kamp4aps.core.ActivityType;
import edu.kit.ipd.sdq.kamp4aps.core.ArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.provider.LabelCustomizing;
import xPPU.Plant;
import xPPU.Identifier.Identifier;

public abstract class AbstractKAPSDifferenceCalculation<T extends ArchitectureVersion>
		extends AbstractWorkplanDerivation<T> {

	private final InternalModificationDerivation architectureInternalModificationDerivation = new InternalModificationDerivation();
	private final SubactivityDerivation architectureSubactivityDerivation = new SubactivityDerivation();
	private ArchitectureVersion version;
	
	@Override
	protected void checkForDifferencesAndAddToWorkplan(Diff diffElement, List<Activity> workplan) {
		for (ActivityElementType elementType : ActivityElementType.topLevelAPSActivityElementTypes()) {
			if (detectionRuleAdded(diffElement, elementType.getElementClass())) {
				Identifier architectureElement = (Identifier) (((ReferenceChange) diffElement).getValue());
				Activity newActivity = new Activity(ActivityType.ARCHITECTUREMODELDIFF, elementType, architectureElement,
						LabelCustomizing.getIdentifierName(architectureElement), null, BasicActivity.ADD,
						createAddElementDescription(architectureElement));
				workplan.add(newActivity);
				this.architectureSubactivityDerivation.deriveSubactivities(architectureElement, newActivity, version);
				return;
			} else if (detectionRuleDeleted(diffElement, elementType.getElementClass())) {
				Identifier architectureElement = (Identifier) (((ReferenceChange) diffElement).getValue());
				Activity newActivity = new Activity(ActivityType.ARCHITECTUREMODELDIFF, elementType, architectureElement,
						LabelCustomizing.getIdentifierName(architectureElement), null, BasicActivity.REMOVE,
						createRemoveElementDescription(architectureElement));
				workplan.add(newActivity);
				this.architectureSubactivityDerivation.deriveSubactivities(architectureElement, newActivity, version);
				return;
			}
		}
	}

	@Override
	public List<Activity> deriveWorkplan(T baseVersion, T targetVersion) {
		this.version = targetVersion;
		List<Activity> activityList = new ArrayList<Activity>();
		
		List<Diff> plantDiff = calculateDiffModel(baseVersion.getXPPUPlant(), targetVersion.getXPPUPlant());
		
		List<Activity> plantActivities = deriveAddAndRemoveActivities(plantDiff);
		activityList.addAll(plantActivities);		
		
		List<Activity> internalModificationActivities = this.architectureInternalModificationDerivation
				.deriveInternalModifications(targetVersion);
		activityList.addAll(internalModificationActivities);

		return activityList;
	}

	public static String createAddElementDescription(Identifier element) {
		return "Add " + element.eClass().getName() + " " + element.getId() + ".";
	}

	public static String createRemoveElementDescription(Identifier element) {
		return "Remove " + element.eClass().getName() + " " + element.getId() + ".";
	}

}
