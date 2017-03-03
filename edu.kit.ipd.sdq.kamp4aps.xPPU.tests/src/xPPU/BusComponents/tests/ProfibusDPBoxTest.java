/**
 */
package xPPU.BusComponents.tests;

import junit.textui.TestRunner;

import xPPU.BusComponents.BusComponentsFactory;
import xPPU.BusComponents.ProfibusDPBox;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Profibus DP Box</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProfibusDPBoxTest extends BusBoxTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProfibusDPBoxTest.class);
	}

	/**
	 * Constructs a new Profibus DP Box test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfibusDPBoxTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Profibus DP Box test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ProfibusDPBox getFixture() {
		return (ProfibusDPBox)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BusComponentsFactory.eINSTANCE.createProfibusDPBox());
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

} //ProfibusDPBoxTest
