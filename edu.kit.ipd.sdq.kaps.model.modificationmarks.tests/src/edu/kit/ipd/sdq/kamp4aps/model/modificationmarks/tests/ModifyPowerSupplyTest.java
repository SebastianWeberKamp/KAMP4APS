/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.tests;

import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyPowerSupply;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.modificationmarksFactory;
import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Modify Power Supply</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModifyPowerSupplyTest extends ModifyComponentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ModifyPowerSupplyTest.class);
	}

	/**
	 * Constructs a new Modify Power Supply test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifyPowerSupplyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Modify Power Supply test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ModifyPowerSupply getFixture() {
		return (ModifyPowerSupply)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(modificationmarksFactory.eINSTANCE.createModifyPowerSupply());
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

} //ModifyPowerSupplyTest
