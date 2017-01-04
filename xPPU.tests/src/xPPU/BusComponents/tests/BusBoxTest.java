/**
 */
package xPPU.BusComponents.tests;

import junit.textui.TestRunner;

import xPPU.BusComponents.BusBox;
import xPPU.BusComponents.BusComponentsFactory;

import xPPU.ComponentRepository.tests.ComponentTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bus Box</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BusBoxTest extends ComponentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BusBoxTest.class);
	}

	/**
	 * Constructs a new Bus Box test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusBoxTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Bus Box test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BusBox getFixture() {
		return (BusBox)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BusComponentsFactory.eINSTANCE.createBusBox());
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

} //BusBoxTest
