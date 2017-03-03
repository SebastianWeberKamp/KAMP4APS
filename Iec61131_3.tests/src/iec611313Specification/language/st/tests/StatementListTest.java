/**
 */
package iec611313Specification.language.st.tests;

import iec611313Specification.common.pous.functions.tests.FunctionBodySpecificationTest;

import iec611313Specification.language.st.StFactory;
import iec611313Specification.language.st.StatementList;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Statement List</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StatementListTest extends FunctionBodySpecificationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StatementListTest.class);
	}

	/**
	 * Constructs a new Statement List test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementListTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Statement List test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StatementList getFixture() {
		return (StatementList)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StFactory.eINSTANCE.createStatementList());
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

} //StatementListTest
