package edu.kit.ipd.sdq.kamp4aps.core;

import edu.kit.ipd.sdq.kamp.workplan.AbstractActivityType;

public enum ActivityType implements AbstractActivityType {
	ARCHITECTUREMODELDIFF("Architecture-related activity"),
	INTERNALMODIFICATIONMARK("Modification mark"),

	CALIBRATION("Calibration"),
	TEST_EXECUTION("Test execution"),

	// Remove stuff
	REMOVE_COMPONENT("Remove component"),
	REMOVE_MODULE("Remove module"),
	REMOVE_INTERFACE("Remove interface"),
	REMOVE_DOCUMENTATION("Remove Documentation"),

	// Add stuff
	ADD_COMPONENT("Add component"),
	ADD_MODULE("Add module"),
	ADD_INTERFACE("Add interface"),
	ADD_DOCUMENTATION("Add documentation"),

	// Update stuff
	UPDATE_STOCKLIST("Update stocklist"),
	UPDATE_DOCUMENTATION("Update documentation"),
	UPDATE_HMI("Update HMI"),
	UPDATE_CAD("Update CAD"),
	UPDATE_CALIBRATION("Update Calibration"),
	
	// Buy stuff
	BUY_COMPONENT("Buy component"),
	
	// Software
	UPDATE_SOFTWARE("Update Software");
	
	private final String name;
	
	private ActivityType(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}
}
