/**
 */
package iec611313Specification.language.sfc.tests;

import iec611313Specification.language.sfc.SfcFactory;
import iec611313Specification.language.sfc.SimpleActionQualifier;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Simple Action Qualifier</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleActionQualifierTest extends ActionQualifierTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SimpleActionQualifierTest.class);
	}

	/**
	 * Constructs a new Simple Action Qualifier test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleActionQualifierTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Simple Action Qualifier test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SimpleActionQualifier getFixture() {
		return (SimpleActionQualifier)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SfcFactory.eINSTANCE.createSimpleActionQualifier());
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

} //SimpleActionQualifierTest
