/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.tests;

import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModificationmarksFactory;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyStructure;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Modify Structure</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModifyStructureTest extends ModifyEntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ModifyStructureTest.class);
	}

	/**
	 * Constructs a new Modify Structure test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifyStructureTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Modify Structure test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ModifyStructure<?> getFixture() {
		return (ModifyStructure<?>)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModificationmarksFactory.eINSTANCE.createModifyStructure());
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

} //ModifyStructureTest
