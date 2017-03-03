/**
 */
package iec611313Specification.common.types.tests;

import iec611313Specification.common.types.ENUMERATION;
import iec611313Specification.common.types.TypesFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>ENUMERATION</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ENUMERATIONTest extends ANY_DERIVEDTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ENUMERATIONTest.class);
	}

	/**
	 * Constructs a new ENUMERATION test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMERATIONTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this ENUMERATION test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ENUMERATION getFixture() {
		return (ENUMERATION)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TypesFactory.eINSTANCE.createENUMERATION());
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

} //ENUMERATIONTest
