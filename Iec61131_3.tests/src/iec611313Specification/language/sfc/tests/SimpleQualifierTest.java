/**
 */
package iec611313Specification.language.sfc.tests;

import iec611313Specification.language.sfc.SfcFactory;
import iec611313Specification.language.sfc.SimpleQualifier;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Simple Qualifier</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleQualifierTest extends TestCase {

	/**
	 * The fixture for this Simple Qualifier test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleQualifier fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SimpleQualifierTest.class);
	}

	/**
	 * Constructs a new Simple Qualifier test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQualifierTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Simple Qualifier test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SimpleQualifier fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Simple Qualifier test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleQualifier getFixture() {
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
		setFixture(SfcFactory.eINSTANCE.createSimpleQualifier());
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

} //SimpleQualifierTest
