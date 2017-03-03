/**
 */
package iec611313Specification.common.oop.tests;

import iec611313Specification.common.oop.GetAccessor;
import iec611313Specification.common.oop.OopFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Get Accessor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GetAccessorTest extends TestCase {

	/**
	 * The fixture for this Get Accessor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GetAccessor fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GetAccessorTest.class);
	}

	/**
	 * Constructs a new Get Accessor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetAccessorTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Get Accessor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(GetAccessor fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Get Accessor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GetAccessor getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OopFactory.eINSTANCE.createGetAccessor());
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

} //GetAccessorTest
