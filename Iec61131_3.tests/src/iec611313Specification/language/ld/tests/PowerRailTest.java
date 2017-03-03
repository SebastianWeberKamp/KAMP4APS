/**
 */
package iec611313Specification.language.ld.tests;

import iec611313Specification.language.ld.LdFactory;
import iec611313Specification.language.ld.PowerRail;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Power Rail</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PowerRailTest extends LDElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PowerRailTest.class);
	}

	/**
	 * Constructs a new Power Rail test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerRailTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Power Rail test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PowerRail getFixture() {
		return (PowerRail)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(LdFactory.eINSTANCE.createPowerRail());
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

} //PowerRailTest
