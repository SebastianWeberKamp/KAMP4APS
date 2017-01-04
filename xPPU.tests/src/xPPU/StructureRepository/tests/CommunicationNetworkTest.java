/**
 */
package xPPU.StructureRepository.tests;

import junit.textui.TestRunner;

import xPPU.StructureRepository.CommunicationNetwork;
import xPPU.StructureRepository.StructureRepositoryFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Communication Network</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommunicationNetworkTest extends StructureTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CommunicationNetworkTest.class);
	}

	/**
	 * Constructs a new Communication Network test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationNetworkTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Communication Network test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CommunicationNetwork getFixture() {
		return (CommunicationNetwork)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StructureRepositoryFactory.eINSTANCE.createCommunicationNetwork());
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

} //CommunicationNetworkTest
