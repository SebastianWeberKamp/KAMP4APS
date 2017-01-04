/**
 */
package xPPU.tests;

import junit.textui.TestRunner;

import xPPU.BistableCylinder;
import xPPU.XPPUFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bistable Cylinder</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BistableCylinderTest extends CylinderTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BistableCylinderTest.class);
	}

	/**
	 * Constructs a new Bistable Cylinder test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BistableCylinderTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Bistable Cylinder test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BistableCylinder getFixture() {
		return (BistableCylinder)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(XPPUFactory.eINSTANCE.createBistableCylinder());
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

} //BistableCylinderTest
