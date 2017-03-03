/**
 */
package xPPU.InterfaceRepository.tests;

import junit.textui.TestRunner;

import xPPU.InterfaceRepository.InterfaceRepositoryFactory;
import xPPU.InterfaceRepository.ScrewingCylinder;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Screwing Cylinder</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScrewingCylinderTest extends ScrewingTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ScrewingCylinderTest.class);
	}

	/**
	 * Constructs a new Screwing Cylinder test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScrewingCylinderTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Screwing Cylinder test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ScrewingCylinder getFixture() {
		return (ScrewingCylinder)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(InterfaceRepositoryFactory.eINSTANCE.createScrewingCylinder());
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

} //ScrewingCylinderTest
