/**
 */
package xPPU.BusComponents.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>BusComponents</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class BusComponentsTests extends TestSuite {

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
		TestSuite suite = new BusComponentsTests("BusComponents Tests");
		suite.addTestSuite(BusBoxTest.class);
		suite.addTestSuite(BusMasterTest.class);
		suite.addTestSuite(BusSlaveTest.class);
		suite.addTestSuite(BusCableTest.class);
		suite.addTestSuite(ProfibusDPBoxTest.class);
		suite.addTestSuite(ProfibusDPMasterTest.class);
		suite.addTestSuite(ProfibusDPSlaveTest.class);
		suite.addTestSuite(ProfibusDPCableTest.class);
		suite.addTestSuite(EtherCATBoxTest.class);
		suite.addTestSuite(EtherCATMasterTest.class);
		suite.addTestSuite(EtherCATSlaveTest.class);
		suite.addTestSuite(EtherCATCableTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusComponentsTests(String name) {
		super(name);
	}

} //BusComponentsTests
