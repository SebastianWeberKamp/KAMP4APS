/**
 */
package iec611313Specification.language.ld.tests;

import iec611313Specification.language.ld.LdFactory;
import iec611313Specification.language.ld.PowerFlowLine;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Power Flow Line</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PowerFlowLineTest extends TestCase {

	/**
	 * The fixture for this Power Flow Line test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PowerFlowLine fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PowerFlowLineTest.class);
	}

	/**
	 * Constructs a new Power Flow Line test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerFlowLineTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Power Flow Line test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PowerFlowLine fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Power Flow Line test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PowerFlowLine getFixture() {
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
		setFixture(LdFactory.eINSTANCE.createPowerFlowLine());
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

} //PowerFlowLineTest
