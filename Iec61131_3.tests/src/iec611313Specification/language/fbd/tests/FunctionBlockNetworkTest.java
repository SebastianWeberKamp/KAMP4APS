/**
 */
package iec611313Specification.language.fbd.tests;

import iec611313Specification.language.fbd.FbdFactory;
import iec611313Specification.language.fbd.FunctionBlockNetwork;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Function Block Network</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionBlockNetworkTest extends TestCase {

	/**
	 * The fixture for this Function Block Network test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionBlockNetwork fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FunctionBlockNetworkTest.class);
	}

	/**
	 * Constructs a new Function Block Network test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBlockNetworkTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Function Block Network test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(FunctionBlockNetwork fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Function Block Network test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionBlockNetwork getFixture() {
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
		setFixture(FbdFactory.eINSTANCE.createFunctionBlockNetwork());
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

} //FunctionBlockNetworkTest
