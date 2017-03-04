/**
 */
package xPPU.ComponentRepository.tests;

import junit.textui.TestRunner;

import xPPU.ComponentRepository.ComponentRepositoryFactory;
import xPPU.ComponentRepository.PowerSplitter;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Power Splitter</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PowerSplitterTest extends SplitterTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PowerSplitterTest.class);
	}

	/**
	 * Constructs a new Power Splitter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerSplitterTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Power Splitter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PowerSplitter getFixture() {
		return (PowerSplitter)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ComponentRepositoryFactory.eINSTANCE.createPowerSplitter());
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

} //PowerSplitterTest
