/**
 */
package xPPU.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import xPPU.SensorModule;
import xPPU.XPPUFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sensor Module</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SensorModuleTest extends TestCase {

	/**
	 * The fixture for this Sensor Module test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorModule fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SensorModuleTest.class);
	}

	/**
	 * Constructs a new Sensor Module test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorModuleTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Sensor Module test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SensorModule fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Sensor Module test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorModule getFixture() {
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
		setFixture(XPPUFactory.eINSTANCE.createSensorModule());
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

} //SensorModuleTest
