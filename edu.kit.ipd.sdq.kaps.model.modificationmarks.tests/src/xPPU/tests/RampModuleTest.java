/**
 */
package xPPU.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import xPPU.RampModule;
import xPPU.XPPUFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ramp Module</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RampModuleTest extends TestCase {

	/**
	 * The fixture for this Ramp Module test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RampModule fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RampModuleTest.class);
	}

	/**
	 * Constructs a new Ramp Module test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RampModuleTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Ramp Module test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(RampModule fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Ramp Module test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RampModule getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(XPPUFactory.eINSTANCE.createRampModule());
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

} //RampModuleTest
