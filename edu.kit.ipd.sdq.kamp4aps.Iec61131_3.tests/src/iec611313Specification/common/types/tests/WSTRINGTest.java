/**
 */
package iec611313Specification.common.types.tests;

import iec611313Specification.common.types.TypesFactory;
import iec611313Specification.common.types.WSTRING;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>WSTRING</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WSTRINGTest extends ANY_STRINGTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WSTRINGTest.class);
	}

	/**
	 * Constructs a new WSTRING test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WSTRINGTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this WSTRING test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected WSTRING getFixture() {
		return (WSTRING)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TypesFactory.eINSTANCE.createWSTRING());
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

} //WSTRINGTest
