/**
 */
package xPPU.ModuleRepository.tests;

import junit.textui.TestRunner;

import xPPU.ModuleRepository.ModuleRepositoryFactory;
import xPPU.ModuleRepository.OpticalSensorModule;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Optical Sensor Module</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpticalSensorModuleTest extends ModuleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OpticalSensorModuleTest.class);
	}

	/**
	 * Constructs a new Optical Sensor Module test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpticalSensorModuleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Optical Sensor Module test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OpticalSensorModule getFixture() {
		return (OpticalSensorModule)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModuleRepositoryFactory.eINSTANCE.createOpticalSensorModule());
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

} //OpticalSensorModuleTest
