/**
 */
package xPPU.InterfaceRepository.tests;

import junit.textui.TestRunner;

import xPPU.InterfaceRepository.InterfaceRepositoryFactory;
import xPPU.InterfaceRepository.SuspensionArm;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Suspension Arm</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SuspensionArmTest extends SuspensionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SuspensionArmTest.class);
	}

	/**
	 * Constructs a new Suspension Arm test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuspensionArmTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Suspension Arm test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SuspensionArm getFixture() {
		return (SuspensionArm)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(InterfaceRepositoryFactory.eINSTANCE.createSuspensionArm());
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

} //SuspensionArmTest
