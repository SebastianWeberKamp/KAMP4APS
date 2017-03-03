/**
 */
package iec611313Specification.language.sfc.tests;

import iec611313Specification.language.sfc.ActionAssociation;
import iec611313Specification.language.sfc.SfcFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Action Association</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActionAssociationTest extends TestCase {

	/**
	 * The fixture for this Action Association test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionAssociation fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ActionAssociationTest.class);
	}

	/**
	 * Constructs a new Action Association test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionAssociationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Action Association test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ActionAssociation fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Action Association test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionAssociation getFixture() {
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
		setFixture(SfcFactory.eINSTANCE.createActionAssociation());
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

} //ActionAssociationTest
