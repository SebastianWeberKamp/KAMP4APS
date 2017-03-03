/**
 */
package xPPU.ModuleRepository.tests;

import junit.textui.TestRunner;

import xPPU.ModuleRepository.ModuleRepositoryFactory;
import xPPU.ModuleRepository.MotorModule;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Motor Module</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MotorModuleTest extends ModuleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MotorModuleTest.class);
	}

	/**
	 * Constructs a new Motor Module test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MotorModuleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Motor Module test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MotorModule getFixture() {
		return (MotorModule)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModuleRepositoryFactory.eINSTANCE.createMotorModule());
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

} //MotorModuleTest
