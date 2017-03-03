/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.tests;

import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyBusSlave;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.modificationmarksFactory;
import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Modify Bus Slave</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModifyBusSlaveTest extends ModifyComponentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ModifyBusSlaveTest.class);
	}

	/**
	 * Constructs a new Modify Bus Slave test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifyBusSlaveTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Modify Bus Slave test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ModifyBusSlave getFixture() {
		return (ModifyBusSlave)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(modificationmarksFactory.eINSTANCE.createModifyBusSlave());
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

} //ModifyBusSlaveTest
