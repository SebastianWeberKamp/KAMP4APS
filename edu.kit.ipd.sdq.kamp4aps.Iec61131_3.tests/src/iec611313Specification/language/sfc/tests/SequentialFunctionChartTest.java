/**
 */
package iec611313Specification.language.sfc.tests;

import iec611313Specification.common.pous.function_blocks.tests.FunctionBlockBodySpecificationTest;

import iec611313Specification.language.sfc.SequentialFunctionChart;
import iec611313Specification.language.sfc.SfcFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sequential Function Chart</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SequentialFunctionChartTest extends FunctionBlockBodySpecificationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SequentialFunctionChartTest.class);
	}

	/**
	 * Constructs a new Sequential Function Chart test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequentialFunctionChartTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Sequential Function Chart test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SequentialFunctionChart getFixture() {
		return (SequentialFunctionChart)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SfcFactory.eINSTANCE.createSequentialFunctionChart());
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

} //SequentialFunctionChartTest
