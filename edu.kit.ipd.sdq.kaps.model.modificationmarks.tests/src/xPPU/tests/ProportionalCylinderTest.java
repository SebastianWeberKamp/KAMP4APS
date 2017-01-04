/**
 */
package xPPU.tests;

import junit.textui.TestRunner;

import xPPU.ProportionalCylinder;
import xPPU.XPPUFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Proportional Cylinder</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProportionalCylinderTest extends CylinderTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProportionalCylinderTest.class);
	}

	/**
	 * Constructs a new Proportional Cylinder test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProportionalCylinderTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Proportional Cylinder test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ProportionalCylinder getFixture() {
		return (ProportionalCylinder)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(XPPUFactory.eINSTANCE.createProportionalCylinder());
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

} //ProportionalCylinderTest
