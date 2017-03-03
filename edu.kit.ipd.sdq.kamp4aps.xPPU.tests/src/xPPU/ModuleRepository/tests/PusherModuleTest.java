/**
 */
package xPPU.ModuleRepository.tests;

import junit.textui.TestRunner;

import xPPU.ModuleRepository.ModuleRepositoryFactory;
import xPPU.ModuleRepository.PusherModule;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Pusher Module</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PusherModuleTest extends ModuleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PusherModuleTest.class);
	}

	/**
	 * Constructs a new Pusher Module test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PusherModuleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Pusher Module test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PusherModule getFixture() {
		return (PusherModule)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModuleRepositoryFactory.eINSTANCE.createPusherModule());
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

} //PusherModuleTest
