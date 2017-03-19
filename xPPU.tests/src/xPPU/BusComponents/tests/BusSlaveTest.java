/**
 */
package xPPU.BusComponents.tests;

import junit.textui.TestRunner;

import xPPU.BusComponents.BusComponentsFactory;
import xPPU.BusComponents.BusSlave;

import xPPU.ComponentRepository.tests.ComponentTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bus Slave</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BusSlaveTest extends ComponentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BusSlaveTest.class);
	}

	/**
	 * Constructs a new Bus Slave test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusSlaveTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Bus Slave test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BusSlave getFixture() {
		return (BusSlave)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BusComponentsFactory.eINSTANCE.createBusSlave());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //BusSlaveTest
