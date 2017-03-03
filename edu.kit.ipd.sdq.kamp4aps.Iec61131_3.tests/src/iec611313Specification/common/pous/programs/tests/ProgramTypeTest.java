/**
 */
package iec611313Specification.common.pous.programs.tests;

import iec611313Specification.common.pous.programs.ProgramType;
import iec611313Specification.common.pous.programs.ProgramsFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Program Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProgramTypeTest extends TestCase {

	/**
	 * The fixture for this Program Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProgramTypeTest.class);
	}

	/**
	 * Constructs a new Program Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Program Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ProgramType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Program Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramType getFixture() {
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
		setFixture(ProgramsFactory.eINSTANCE.createProgramType());
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

} //ProgramTypeTest
