/**
 */
package apsNewModel.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>apsNewModel</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApsNewModelTests extends TestSuite {

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
		TestSuite suite = new ApsNewModelTests("apsNewModel Tests");
		suite.addTestSuite(IECMethodImplementationTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApsNewModelTests(String name) {
		super(name);
	}

} //ApsNewModelTests
