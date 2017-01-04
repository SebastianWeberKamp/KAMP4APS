/**
 */
package edu.kit.ipd.sdq.kaps.model.fieldofactivityannotations.impl;

import edu.kit.ipd.sdq.kaps.model.fieldofactivityannotations.FieldofactivityannotationsPackage;
import edu.kit.ipd.sdq.kaps.model.fieldofactivityannotations.TestCase;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kaps.model.fieldofactivityannotations.impl.TestCaseImpl#getNameOfTest <em>Name Of Test</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TestCaseImpl extends EObjectImpl implements TestCase {
	/**
	 * The default value of the '{@link #getNameOfTest() <em>Name Of Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameOfTest()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_OF_TEST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameOfTest() <em>Name Of Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameOfTest()
	 * @generated
	 * @ordered
	 */
	protected String nameOfTest = NAME_OF_TEST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FieldofactivityannotationsPackage.Literals.TEST_CASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameOfTest() {
		return nameOfTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameOfTest(String newNameOfTest) {
		String oldNameOfTest = nameOfTest;
		nameOfTest = newNameOfTest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FieldofactivityannotationsPackage.TEST_CASE__NAME_OF_TEST, oldNameOfTest, nameOfTest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FieldofactivityannotationsPackage.TEST_CASE__NAME_OF_TEST:
				return getNameOfTest();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FieldofactivityannotationsPackage.TEST_CASE__NAME_OF_TEST:
				setNameOfTest((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FieldofactivityannotationsPackage.TEST_CASE__NAME_OF_TEST:
				setNameOfTest(NAME_OF_TEST_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FieldofactivityannotationsPackage.TEST_CASE__NAME_OF_TEST:
				return NAME_OF_TEST_EDEFAULT == null ? nameOfTest != null : !NAME_OF_TEST_EDEFAULT.equals(nameOfTest);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nameOfTest: ");
		result.append(nameOfTest);
		result.append(')');
		return result.toString();
	}

} //TestCaseImpl
