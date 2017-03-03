/**
 */
package iec611313Specification.common.pous.function_blocks.tests;

import iec611313Specification.common.pous.function_blocks.FunctionBlockType;
import iec611313Specification.common.pous.function_blocks.Function_blocksFactory;

import iec611313Specification.common.types.tests.ANY_DERIVEDTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Function Block Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionBlockTypeTest extends ANY_DERIVEDTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FunctionBlockTypeTest.class);
	}

	/**
	 * Constructs a new Function Block Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBlockTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Function Block Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FunctionBlockType getFixture() {
		return (FunctionBlockType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Function_blocksFactory.eINSTANCE.createFunctionBlockType());
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

} //FunctionBlockTypeTest
