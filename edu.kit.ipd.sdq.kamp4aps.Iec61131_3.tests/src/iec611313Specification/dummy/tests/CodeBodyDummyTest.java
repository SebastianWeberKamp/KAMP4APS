/**
 */
package iec611313Specification.dummy.tests;

import iec611313Specification.common.pous.function_blocks.tests.FunctionBlockBodySpecificationTest;

import iec611313Specification.dummy.CodeBodyDummy;
import iec611313Specification.dummy.DummyFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Code Body Dummy</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CodeBodyDummyTest extends FunctionBlockBodySpecificationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CodeBodyDummyTest.class);
	}

	/**
	 * Constructs a new Code Body Dummy test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeBodyDummyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Code Body Dummy test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CodeBodyDummy getFixture() {
		return (CodeBodyDummy)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DummyFactory.eINSTANCE.createCodeBodyDummy());
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

} //CodeBodyDummyTest
