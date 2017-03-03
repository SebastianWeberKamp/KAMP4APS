/**
 */
package xPPU.ComponentRepository.tests;

import junit.textui.TestRunner;

import xPPU.ComponentRepository.ComponentRepositoryFactory;
import xPPU.ComponentRepository.RegularValve;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Regular Valve</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RegularValveTest extends ValveTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RegularValveTest.class);
	}

	/**
	 * Constructs a new Regular Valve test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegularValveTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Regular Valve test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RegularValve getFixture() {
		return (RegularValve)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ComponentRepositoryFactory.eINSTANCE.createRegularValve());
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

} //RegularValveTest
