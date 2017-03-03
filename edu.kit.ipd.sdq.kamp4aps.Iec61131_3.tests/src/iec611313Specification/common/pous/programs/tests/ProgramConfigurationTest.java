/**
 */
package iec611313Specification.common.pous.programs.tests;

import iec611313Specification.common.pous.programs.ProgramConfiguration;
import iec611313Specification.common.pous.programs.ProgramsFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Program Configuration</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProgramConfigurationTest extends TestCase {

	/**
	 * The fixture for this Program Configuration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramConfiguration fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProgramConfigurationTest.class);
	}

	/**
	 * Constructs a new Program Configuration test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramConfigurationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Program Configuration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ProgramConfiguration fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Program Configuration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramConfiguration getFixture() {
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
		setFixture(ProgramsFactory.eINSTANCE.createProgramConfiguration());
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

} //ProgramConfigurationTest
