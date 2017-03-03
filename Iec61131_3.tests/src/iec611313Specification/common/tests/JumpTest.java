/**
 */
package iec611313Specification.common.tests;

import iec611313Specification.common.CommonFactory;
import iec611313Specification.common.Jump;

import iec611313Specification.language.fbd.tests.SignalSinkTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Jump</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class JumpTest extends SignalSinkTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(JumpTest.class);
	}

	/**
	 * Constructs a new Jump test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JumpTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Jump test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Jump getFixture() {
		return (Jump)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CommonFactory.eINSTANCE.createJump());
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

} //JumpTest
