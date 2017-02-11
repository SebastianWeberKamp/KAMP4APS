package edu.kit.ipd.sdq.kamp4aps.core;

import edu.kit.ipd.sdq.amp.workplan.AbstractActivityType;

public enum ActivityType implements AbstractActivityType {
	//TODO Update for aPS
	ARCHITECTUREMODELDIFF("Architecture-related activity"),
	INTERNALMODIFICATIONMARK("Modification mark"),
	IMPLEMENTATION_SOURCECODE("Source code implementation"),
	IMPLEMENTATION_METADATA("Meta data implementation"),
	BUILDCONFIGURATION("Build configuration"),
	BUILDEXECUTION("Build execution"),
	TESTDEVELOPMENT("Test development"),
	TESTUPDATE("Test update"),
	TESTEXECUTION("Test execution"), 
	RELEASECONFIGURATION("Release configuration"),
	RELEASEEXECUTION("Release execution"),
	DEPLOYMENTCONFIGURATION("Deployment configuration"),
	DEPLOYMENTEXECUTION("Deployment execution");
	
	private final String name;
	
	private ActivityType(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}
}
