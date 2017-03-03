/**
 */
package xPPU.ComponentRepository.tests;

import junit.textui.TestRunner;

import xPPU.ComponentRepository.ComponentRepositoryFactory;
import xPPU.ComponentRepository.CylinderPart;

import xPPU.MechanicalComponents.tests.MechanicalPartTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cylinder Part</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CylinderPartTest extends MechanicalPartTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CylinderPartTest.class);
	}

	/**
	 * Constructs a new Cylinder Part test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CylinderPartTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Cylinder Part test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CylinderPart getFixture() {
		return (CylinderPart)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ComponentRepositoryFactory.eINSTANCE.createCylinderPart());
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

} //CylinderPartTest
