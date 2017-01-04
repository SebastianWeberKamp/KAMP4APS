/**
 */
package edu.kit.ipd.sdq.amp.model.modificationmarks.tests;

import edu.kit.ipd.sdq.amp.model.modificationmarks.ChangePropagationStep;
import edu.kit.ipd.sdq.amp.model.modificationmarks.ModificationmarksFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Change Propagation Step</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChangePropagationStepTest extends AbstractChangePropagationStepTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ChangePropagationStepTest.class);
	}

	/**
	 * Constructs a new Change Propagation Step test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangePropagationStepTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Change Propagation Step test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ChangePropagationStep getFixture() {
		return (ChangePropagationStep)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModificationmarksFactory.eINSTANCE.createChangePropagationStep());
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

} //ChangePropagationStepTest
