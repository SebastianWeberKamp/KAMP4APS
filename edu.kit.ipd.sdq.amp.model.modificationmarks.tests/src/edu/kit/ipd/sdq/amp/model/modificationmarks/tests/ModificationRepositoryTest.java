/**
 */
package edu.kit.ipd.sdq.amp.model.modificationmarks.tests;

import edu.kit.ipd.sdq.amp.model.modificationmarks.ModificationRepository;
import edu.kit.ipd.sdq.amp.model.modificationmarks.ModificationmarksFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Modification Repository</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModificationRepositoryTest extends AbstractModificationRepositoryTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ModificationRepositoryTest.class);
	}

	/**
	 * Constructs a new Modification Repository test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModificationRepositoryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Modification Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ModificationRepository getFixture() {
		return (ModificationRepository)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModificationmarksFactory.eINSTANCE.createModificationRepository());
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

} //ModificationRepositoryTest
