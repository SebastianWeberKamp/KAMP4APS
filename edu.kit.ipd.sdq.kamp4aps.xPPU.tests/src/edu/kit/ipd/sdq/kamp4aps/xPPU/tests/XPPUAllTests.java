/**
 */
package edu.kit.ipd.sdq.kamp4aps.xPPU.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;
import xPPU.BusComponents.tests.BusComponentsTests;
import xPPU.ComponentRepository.tests.ComponentRepositoryTests;
import xPPU.ElectronicComponents.tests.ElectronicComponentsTests;
import xPPU.MechanicalComponents.tests.MechanicalComponentsTests;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>XPPU</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class XPPUAllTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new XPPUAllTests("XPPU Tests");
		suite.addTest(ComponentRepositoryTests.suite());
		suite.addTest(BusComponentsTests.suite());
		suite.addTest(ElectronicComponentsTests.suite());
		suite.addTest(MechanicalComponentsTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPPUAllTests(String name) {
		super(name);
	}

} //XPPUAllTests
