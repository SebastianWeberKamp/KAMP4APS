/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.tests;

import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.KAPSModificationRepository;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModificationmarksFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>KAPS Modification Repository</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class KAPSModificationRepositoryTest extends AbstractKAPSModificationRepositoryTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(KAPSModificationRepositoryTest.class);
	}

	/**
	 * Constructs a new KAPS Modification Repository test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KAPSModificationRepositoryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this KAPS Modification Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected KAPSModificationRepository getFixture() {
		return (KAPSModificationRepository)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModificationmarksFactory.eINSTANCE.createKAPSModificationRepository());
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

} //KAPSModificationRepositoryTest
