/**
 */
package xPPU.ModuleRepository.tests;

import junit.textui.TestRunner;

import xPPU.Identifier.tests.IdentifierTest;

import xPPU.ModuleRepository.Module;
import xPPU.ModuleRepository.ModuleRepositoryFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModuleTest extends IdentifierTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ModuleTest.class);
	}

	/**
	 * Constructs a new Module test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Module test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Module getFixture() {
		return (Module)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModuleRepositoryFactory.eINSTANCE.createModule());
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

} //ModuleTest
