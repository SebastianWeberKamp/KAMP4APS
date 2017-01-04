/**
 */
package edu.kit.ipd.sdq.amp.model.modificationmarks.tests;

import edu.kit.ipd.sdq.amp.model.modificationmarks.Modification;
import edu.kit.ipd.sdq.amp.model.modificationmarks.ModificationmarksFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Modification</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModificationTest extends AbstractModificationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ModificationTest.class);
	}

	/**
	 * Constructs a new Modification test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModificationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Modification test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Modification getFixture() {
		return (Modification)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModificationmarksFactory.eINSTANCE.createModification());
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

} //ModificationTest
