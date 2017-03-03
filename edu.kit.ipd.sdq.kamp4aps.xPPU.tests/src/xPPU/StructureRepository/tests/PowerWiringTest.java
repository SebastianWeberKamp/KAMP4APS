/**
 */
package xPPU.StructureRepository.tests;

import junit.textui.TestRunner;

import xPPU.StructureRepository.PowerWiring;
import xPPU.StructureRepository.StructureRepositoryFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Power Wiring</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PowerWiringTest extends StructureTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PowerWiringTest.class);
	}

	/**
	 * Constructs a new Power Wiring test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerWiringTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Power Wiring test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PowerWiring getFixture() {
		return (PowerWiring)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StructureRepositoryFactory.eINSTANCE.createPowerWiring());
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

} //PowerWiringTest
