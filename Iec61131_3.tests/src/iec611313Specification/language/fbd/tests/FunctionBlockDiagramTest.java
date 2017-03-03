/**
 */
package iec611313Specification.language.fbd.tests;

import iec611313Specification.common.pous.functions.tests.FunctionBodySpecificationTest;

import iec611313Specification.language.fbd.FbdFactory;
import iec611313Specification.language.fbd.FunctionBlockDiagram;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Function Block Diagram</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionBlockDiagramTest extends FunctionBodySpecificationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FunctionBlockDiagramTest.class);
	}

	/**
	 * Constructs a new Function Block Diagram test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBlockDiagramTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Function Block Diagram test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FunctionBlockDiagram getFixture() {
		return (FunctionBlockDiagram)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FbdFactory.eINSTANCE.createFunctionBlockDiagram());
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

} //FunctionBlockDiagramTest
