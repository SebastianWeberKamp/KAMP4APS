/**
 */
package edu.kit.ipd.sdq.amp.model.modificationmarks.tests;

import edu.kit.ipd.sdq.amp.model.modificationmarks.ModificationmarksFactory;
import edu.kit.ipd.sdq.amp.model.modificationmarks.SeedModifications;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Seed Modifications</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SeedModificationsTest extends AbstractSeedModificationsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SeedModificationsTest.class);
	}

	/**
	 * Constructs a new Seed Modifications test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeedModificationsTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Seed Modifications test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SeedModifications getFixture() {
		return (SeedModifications)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModificationmarksFactory.eINSTANCE.createSeedModifications());
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

} //SeedModificationsTest
