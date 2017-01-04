/**
 */
package xPPU.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;
import xPPU.BusMaster;
import xPPU.XPPUFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bus Master</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BusMasterTest extends TestCase {

	/**
	 * The fixture for this Bus Master test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusMaster fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BusMasterTest.class);
	}

	/**
	 * Constructs a new Bus Master test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusMasterTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Bus Master test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(BusMaster fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Bus Master test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusMaster getFixture() {
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
		setFixture(XPPUFactory.eINSTANCE.createBusMaster());
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

} //BusMasterTest
