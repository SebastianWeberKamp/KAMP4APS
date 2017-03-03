/**
 */
package xPPU.InterfaceRepository.tests;

import junit.textui.TestRunner;

import xPPU.InterfaceRepository.InterfaceRepositoryFactory;
import xPPU.InterfaceRepository.ScrewingSplitter;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Screwing Splitter</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScrewingSplitterTest extends ScrewingTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ScrewingSplitterTest.class);
	}

	/**
	 * Constructs a new Screwing Splitter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScrewingSplitterTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Screwing Splitter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ScrewingSplitter getFixture() {
		return (ScrewingSplitter)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(InterfaceRepositoryFactory.eINSTANCE.createScrewingSplitter());
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

} //ScrewingSplitterTest
