/**
 */
package xPPU.InterfaceRepository.tests;

import junit.textui.TestRunner;

import xPPU.InterfaceRepository.Gearing;
import xPPU.InterfaceRepository.InterfaceRepositoryFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Gearing</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GearingTest extends InterfaceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GearingTest.class);
	}

	/**
	 * Constructs a new Gearing test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GearingTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Gearing test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Gearing getFixture() {
		return (Gearing)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(InterfaceRepositoryFactory.eINSTANCE.createGearing());
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

} //GearingTest
