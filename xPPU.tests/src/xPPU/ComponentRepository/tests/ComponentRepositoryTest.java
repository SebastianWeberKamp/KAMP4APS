/**
 */
package xPPU.ComponentRepository.tests;

import junit.textui.TestRunner;

import xPPU.ComponentRepository.ComponentRepository;
import xPPU.ComponentRepository.ComponentRepositoryFactory;

import xPPU.Identifier.tests.IdentifierTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Component Repository</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentRepositoryTest extends IdentifierTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ComponentRepositoryTest.class);
	}

	/**
	 * Constructs a new Component Repository test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentRepositoryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Component Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ComponentRepository getFixture() {
		return (ComponentRepository)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ComponentRepositoryFactory.eINSTANCE.createComponentRepository());
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

} //ComponentRepositoryTest
