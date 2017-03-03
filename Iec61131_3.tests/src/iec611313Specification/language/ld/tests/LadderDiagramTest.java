/**
 */
package iec611313Specification.language.ld.tests;

import iec611313Specification.common.pous.functions.tests.FunctionBodySpecificationTest;

import iec611313Specification.language.ld.LadderDiagram;
import iec611313Specification.language.ld.LdFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ladder Diagram</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LadderDiagramTest extends FunctionBodySpecificationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LadderDiagramTest.class);
	}

	/**
	 * Constructs a new Ladder Diagram test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LadderDiagramTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Ladder Diagram test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LadderDiagram getFixture() {
		return (LadderDiagram)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(LdFactory.eINSTANCE.createLadderDiagram());
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

} //LadderDiagramTest
