/**
 */
package xPPU.ComponentRepository.tests;

import junit.textui.TestRunner;

import xPPU.ComponentRepository.BottleSeperator;
import xPPU.ComponentRepository.ComponentRepositoryFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bottle Seperator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BottleSeperatorTest extends ComponentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BottleSeperatorTest.class);
	}

	/**
	 * Constructs a new Bottle Seperator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BottleSeperatorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Bottle Seperator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BottleSeperator getFixture() {
		return (BottleSeperator)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ComponentRepositoryFactory.eINSTANCE.createBottleSeperator());
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

} //BottleSeperatorTest
