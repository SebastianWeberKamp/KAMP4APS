/**
 */
package iec611313Specification.common.tests;

import iec611313Specification.common.CommonFactory;
import iec611313Specification.common.FormalParameterList;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Formal Parameter List</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FormalParameterListTest extends ParameterListTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FormalParameterListTest.class);
	}

	/**
	 * Constructs a new Formal Parameter List test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalParameterListTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Formal Parameter List test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FormalParameterList getFixture() {
		return (FormalParameterList)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CommonFactory.eINSTANCE.createFormalParameterList());
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

} //FormalParameterListTest
