/**
 */
package iec611313Specification.language.il.tests;

import iec611313Specification.common.pous.functions.tests.FunctionBodySpecificationTest;

import iec611313Specification.language.il.IlFactory;
import iec611313Specification.language.il.InstructionList;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Instruction List</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InstructionListTest extends FunctionBodySpecificationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InstructionListTest.class);
	}

	/**
	 * Constructs a new Instruction List test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionListTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Instruction List test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InstructionList getFixture() {
		return (InstructionList)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(IlFactory.eINSTANCE.createInstructionList());
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

} //InstructionListTest
