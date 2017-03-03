/**
 */
package iec611313Specification.language.il.tests;

import iec611313Specification.language.il.IlFactory;
import iec611313Specification.language.il.ReturnInstruction;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Return Instruction</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReturnInstructionTest extends InstructionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReturnInstructionTest.class);
	}

	/**
	 * Constructs a new Return Instruction test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnInstructionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Return Instruction test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ReturnInstruction getFixture() {
		return (ReturnInstruction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(IlFactory.eINSTANCE.createReturnInstruction());
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

} //ReturnInstructionTest
