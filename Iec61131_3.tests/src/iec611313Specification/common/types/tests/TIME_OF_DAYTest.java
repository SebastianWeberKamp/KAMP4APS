/**
 */
package iec611313Specification.common.types.tests;

import iec611313Specification.common.types.TIME_OF_DAY;
import iec611313Specification.common.types.TypesFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>TIME OF DAY</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TIME_OF_DAYTest extends DATETest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TIME_OF_DAYTest.class);
	}

	/**
	 * Constructs a new TIME OF DAY test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TIME_OF_DAYTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this TIME OF DAY test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TIME_OF_DAY getFixture() {
		return (TIME_OF_DAY)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TypesFactory.eINSTANCE.createTIME_OF_DAY());
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

} //TIME_OF_DAYTest
