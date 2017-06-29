/**
 */
package IECRepository.tests;

import IECRepository.IECMethod;
import IECRepository.IECRepositoryFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>IEC Method</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IECMethodTest extends TestCase {

	/**
	 * The fixture for this IEC Method test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IECMethod fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IECMethodTest.class);
	}

	/**
	 * Constructs a new IEC Method test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECMethodTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this IEC Method test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(IECMethod fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this IEC Method test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IECMethod getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(IECRepositoryFactory.eINSTANCE.createIECMethod());
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

} //IECMethodTest
