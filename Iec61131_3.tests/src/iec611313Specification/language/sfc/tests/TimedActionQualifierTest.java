/**
 */
package iec611313Specification.language.sfc.tests;

import iec611313Specification.language.sfc.SfcFactory;
import iec611313Specification.language.sfc.TimedActionQualifier;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Timed Action Qualifier</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimedActionQualifierTest extends ActionQualifierTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TimedActionQualifierTest.class);
	}

	/**
	 * Constructs a new Timed Action Qualifier test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedActionQualifierTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Timed Action Qualifier test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TimedActionQualifier getFixture() {
		return (TimedActionQualifier)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SfcFactory.eINSTANCE.createTimedActionQualifier());
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

} //TimedActionQualifierTest
