/**
 */
package iec611313Specification.common.tests;

import iec611313Specification.common.CommonFactory;
import iec611313Specification.common.PositionalParameterList;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Positional Parameter List</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PositionalParameterListTest extends ParameterListTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PositionalParameterListTest.class);
	}

	/**
	 * Constructs a new Positional Parameter List test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionalParameterListTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Positional Parameter List test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PositionalParameterList getFixture() {
		return (PositionalParameterList)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CommonFactory.eINSTANCE.createPositionalParameterList());
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

} //PositionalParameterListTest
