package edu.kit.ipd.sdq.kamp4aps.core;

import java.util.ArrayList;
import java.util.List;

import fieldofactivityannotations.SystemTest;
import xPPU.Plant;

public class ArchitectureAnnotationLookup {
	
	public static List<?> lookUpSystemTestsForPlant(ArchitectureVersion version,
			Plant plant){
		List<SystemTest> systemTests = new ArrayList<SystemTest>();
		
		if(version.getFieldOfActivityRepository().getTestSpecification() != null) {
			for(SystemTest sysTest : version.getFieldOfActivityRepository().getTestSpecification().getSystemTests()){
				if (sysTest.getSystemUnderTest() == plant){
					systemTests.add(sysTest);
				}
			}
		}
		return systemTests;
	}
}
