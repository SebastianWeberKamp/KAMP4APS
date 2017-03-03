/**
 */
package iec611313Specification.language.il.tests;

import iec611313Specification.language.il.IlFactory;
import iec611313Specification.language.il.SimpleInstruction;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Simple Instruction</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleInstructionTest extends InstructionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SimpleInstructionTest.class);
	}

	/**
	 * Constructs a new Simple Instruction test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleInstructionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Simple Instruction test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SimpleInstruction getFixture() {
		return (SimpleInstruction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(IlFactory.eINSTANCE.createSimpleInstruction());
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

} //SimpleInstructionTest
