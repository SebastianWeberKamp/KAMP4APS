/**
 */
package iec611313Specification.common.variables.tests;

import iec611313Specification.common.tests.ExpressionTest;

import iec611313Specification.common.variables.VariableAccess;
import iec611313Specification.common.variables.VariablesFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Variable Access</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VariableAccessTest extends ExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VariableAccessTest.class);
	}

	/**
	 * Constructs a new Variable Access test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableAccessTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Variable Access test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected VariableAccess getFixture() {
		return (VariableAccess)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(VariablesFactory.eINSTANCE.createVariableAccess());
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

} //VariableAccessTest
