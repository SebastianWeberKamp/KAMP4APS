/**
 */
package xPPU.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;
import xPPU.BusSlave;
import xPPU.XPPUFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bus Slave</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BusSlaveTest extends TestCase {

	/**
	 * The fixture for this Bus Slave test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusSlave fixture = null;

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
	 * Sets the fixture for this Bus Slave test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(BusSlave fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Bus Slave test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusSlave getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(XPPUFactory.eINSTANCE.createBusSlave());
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
