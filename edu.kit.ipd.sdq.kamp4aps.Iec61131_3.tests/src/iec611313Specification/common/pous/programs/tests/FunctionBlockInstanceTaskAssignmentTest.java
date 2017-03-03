/**
 */
package iec611313Specification.common.pous.programs.tests;

import iec611313Specification.common.pous.programs.FunctionBlockInstanceTaskAssignment;
import iec611313Specification.common.pous.programs.ProgramsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Function Block Instance Task Assignment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionBlockInstanceTaskAssignmentTest extends ProgramConfigElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FunctionBlockInstanceTaskAssignmentTest.class);
	}

	/**
	 * Constructs a new Function Block Instance Task Assignment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBlockInstanceTaskAssignmentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Function Block Instance Task Assignment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FunctionBlockInstanceTaskAssignment getFixture() {
		return (FunctionBlockInstanceTaskAssignment)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ProgramsFactory.eINSTANCE.createFunctionBlockInstanceTaskAssignment());
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

} //FunctionBlockInstanceTaskAssignmentTest
