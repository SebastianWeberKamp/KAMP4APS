/**
 */
package xPPU.ModuleRepository.tests;

import junit.textui.TestRunner;

import xPPU.ModuleRepository.ModuleRepositoryFactory;
import xPPU.ModuleRepository.PressureSensorModule;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Pressure Sensor Module</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PressureSensorModuleTest extends ModuleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PressureSensorModuleTest.class);
	}

	/**
	 * Constructs a new Pressure Sensor Module test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PressureSensorModuleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Pressure Sensor Module test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PressureSensorModule getFixture() {
		return (PressureSensorModule)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModuleRepositoryFactory.eINSTANCE.createPressureSensorModule());
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

} //PressureSensorModuleTest
