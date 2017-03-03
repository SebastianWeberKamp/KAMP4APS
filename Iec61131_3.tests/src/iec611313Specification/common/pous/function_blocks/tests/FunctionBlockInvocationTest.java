/**
 */
package iec611313Specification.common.pous.function_blocks.tests;

import iec611313Specification.common.pous.function_blocks.FunctionBlockInvocation;
import iec611313Specification.common.pous.function_blocks.Function_blocksFactory;

import iec611313Specification.language.st.tests.StatementTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Function Block Invocation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionBlockInvocationTest extends StatementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FunctionBlockInvocationTest.class);
	}

	/**
	 * Constructs a new Function Block Invocation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBlockInvocationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Function Block Invocation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FunctionBlockInvocation getFixture() {
		return (FunctionBlockInvocation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Function_blocksFactory.eINSTANCE.createFunctionBlockInvocation());
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

} //FunctionBlockInvocationTest
