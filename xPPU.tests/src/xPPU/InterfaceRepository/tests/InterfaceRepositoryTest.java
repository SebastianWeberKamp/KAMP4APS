/**
 */
package xPPU.InterfaceRepository.tests;

import junit.textui.TestRunner;

import xPPU.Identifier.tests.IdentifierTest;

import xPPU.InterfaceRepository.InterfaceRepository;
import xPPU.InterfaceRepository.InterfaceRepositoryFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Interface Repository</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InterfaceRepositoryTest extends IdentifierTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InterfaceRepositoryTest.class);
	}

	/**
	 * Constructs a new Interface Repository test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceRepositoryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Interface Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InterfaceRepository getFixture() {
		return (InterfaceRepository)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(InterfaceRepositoryFactory.eINSTANCE.createInterfaceRepository());
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

} //InterfaceRepositoryTest
