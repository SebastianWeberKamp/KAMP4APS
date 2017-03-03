/**
 */
package iec611313Specification.language.ld.tests;

import iec611313Specification.language.ld.LadderNetwork;
import iec611313Specification.language.ld.LdFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ladder Network</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LadderNetworkTest extends TestCase {

	/**
	 * The fixture for this Ladder Network test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LadderNetwork fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LadderNetworkTest.class);
	}

	/**
	 * Constructs a new Ladder Network test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LadderNetworkTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Ladder Network test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(LadderNetwork fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Ladder Network test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LadderNetwork getFixture() {
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
		setFixture(LdFactory.eINSTANCE.createLadderNetwork());
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

} //LadderNetworkTest
