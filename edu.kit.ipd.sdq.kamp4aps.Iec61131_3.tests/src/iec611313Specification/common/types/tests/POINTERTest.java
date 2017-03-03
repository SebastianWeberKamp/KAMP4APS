/**
 */
package iec611313Specification.common.types.tests;

import iec611313Specification.common.types.POINTER;
import iec611313Specification.common.types.TypesFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>POINTER</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class POINTERTest extends ANY_DERIVEDTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(POINTERTest.class);
	}

	/**
	 * Constructs a new POINTER test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public POINTERTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this POINTER test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected POINTER getFixture() {
		return (POINTER)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TypesFactory.eINSTANCE.createPOINTER());
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

} //POINTERTest
