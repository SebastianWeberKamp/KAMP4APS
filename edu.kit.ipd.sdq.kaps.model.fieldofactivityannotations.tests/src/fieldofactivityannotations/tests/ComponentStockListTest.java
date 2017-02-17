/**
 */
package fieldofactivityannotations.tests;

import fieldofactivityannotations.ComponentStockList;
import fieldofactivityannotations.FieldofactivityannotationsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Component Stock List</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentStockListTest extends StockListTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ComponentStockListTest.class);
	}

	/**
	 * Constructs a new Component Stock List test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentStockListTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Component Stock List test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ComponentStockList getFixture() {
		return (ComponentStockList)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FieldofactivityannotationsFactory.eINSTANCE.createComponentStockList());
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

} //ComponentStockListTest
