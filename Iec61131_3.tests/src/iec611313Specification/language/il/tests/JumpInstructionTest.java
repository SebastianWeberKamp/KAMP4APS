/**
 */
package iec611313Specification.language.il.tests;

import iec611313Specification.language.il.IlFactory;
import iec611313Specification.language.il.JumpInstruction;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Jump Instruction</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class JumpInstructionTest extends InstructionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(JumpInstructionTest.class);
	}

	/**
	 * Constructs a new Jump Instruction test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JumpInstructionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Jump Instruction test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected JumpInstruction getFixture() {
		return (JumpInstruction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(IlFactory.eINSTANCE.createJumpInstruction());
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

} //JumpInstructionTest
