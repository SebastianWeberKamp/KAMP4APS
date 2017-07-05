/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECRepository.tests;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Function Block</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionBlockTest extends IdentifierTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FunctionBlockTest.class);
	}

	/**
	 * Constructs a new Function Block test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBlockTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Function Block test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FunctionBlock getFixture() {
		return (FunctionBlock)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(IECRepositoryFactory.eINSTANCE.createFunctionBlock());
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

} //FunctionBlockTest
