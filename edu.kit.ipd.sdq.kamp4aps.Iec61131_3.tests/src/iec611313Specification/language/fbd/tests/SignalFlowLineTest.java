/**
 */
package iec611313Specification.language.fbd.tests;

import iec611313Specification.language.fbd.FbdFactory;
import iec611313Specification.language.fbd.SignalFlowLine;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Signal Flow Line</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SignalFlowLineTest extends TestCase {

	/**
	 * The fixture for this Signal Flow Line test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalFlowLine fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SignalFlowLineTest.class);
	}

	/**
	 * Constructs a new Signal Flow Line test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalFlowLineTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Signal Flow Line test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SignalFlowLine fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Signal Flow Line test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalFlowLine getFixture() {
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
		setFixture(FbdFactory.eINSTANCE.createSignalFlowLine());
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

} //SignalFlowLineTest
