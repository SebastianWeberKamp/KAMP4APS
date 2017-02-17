/**
 */
package fieldofactivityannotations.tests;

import fieldofactivityannotations.FieldofactivityannotationsFactory;
import fieldofactivityannotations.Purchaser;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Purchaser</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PurchaserTest extends RoleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PurchaserTest.class);
	}

	/**
	 * Constructs a new Purchaser test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PurchaserTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Purchaser test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Purchaser getFixture() {
		return (Purchaser)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FieldofactivityannotationsFactory.eINSTANCE.createPurchaser());
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

} //PurchaserTest
