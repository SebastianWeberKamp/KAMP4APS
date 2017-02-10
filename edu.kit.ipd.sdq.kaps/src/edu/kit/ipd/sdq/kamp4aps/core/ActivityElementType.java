package edu.kit.ipd.sdq.kamp4aps.core;

import edu.kit.ipd.sdq.amp.workplan.AbstractActivityElementType;
import fieldofactivityannotations.TestCase;

public enum ActivityElementType implements AbstractActivityElementType {
	// annotation-related
	TESTCASE(TestCase.class);
	
	
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
}
