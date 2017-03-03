/**
 */
package iec611313Specification.common.types.tests;

import iec611313Specification.common.types.DATE_AND_TIME;
import iec611313Specification.common.types.TypesFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>DATE AND TIME</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DATE_AND_TIMETest extends ANY_DATETest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DATE_AND_TIMETest.class);
	}

	/**
	 * Constructs a new DATE AND TIME test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DATE_AND_TIMETest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this DATE AND TIME test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DATE_AND_TIME getFixture() {
		return (DATE_AND_TIME)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TypesFactory.eINSTANCE.createDATE_AND_TIME());
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

} //DATE_AND_TIMETest
