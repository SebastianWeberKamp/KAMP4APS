/**
 */
package xPPU.ComponentRepository.tests;

import junit.textui.TestRunner;

import xPPU.ComponentRepository.ComponentRepositoryFactory;
import xPPU.ComponentRepository.VacuumSwitch;

import xPPU.ElectronicComponents.tests.SwitchTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Vacuum Switch</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VacuumSwitchTest extends SwitchTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VacuumSwitchTest.class);
	}

	/**
	 * Constructs a new Vacuum Switch test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VacuumSwitchTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Vacuum Switch test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected VacuumSwitch getFixture() {
		return (VacuumSwitch)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ComponentRepositoryFactory.eINSTANCE.createVacuumSwitch());
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

} //VacuumSwitchTest
