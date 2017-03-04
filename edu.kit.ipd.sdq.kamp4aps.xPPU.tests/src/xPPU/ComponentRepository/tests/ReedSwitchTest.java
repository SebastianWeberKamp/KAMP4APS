/**
 */
package xPPU.ComponentRepository.tests;

import junit.textui.TestRunner;

import xPPU.ComponentRepository.ComponentRepositoryFactory;
import xPPU.ComponentRepository.ReedSwitch;

import xPPU.ElectronicComponents.tests.SwitchTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Reed Switch</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReedSwitchTest extends SwitchTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReedSwitchTest.class);
	}

	/**
	 * Constructs a new Reed Switch test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReedSwitchTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Reed Switch test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ReedSwitch getFixture() {
		return (ReedSwitch)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ComponentRepositoryFactory.eINSTANCE.createReedSwitch());
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

} //ReedSwitchTest
