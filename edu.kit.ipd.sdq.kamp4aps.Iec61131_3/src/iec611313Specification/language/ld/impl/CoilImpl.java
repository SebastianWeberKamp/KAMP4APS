/**
 */
package iec611313Specification.language.ld.impl;

import iec611313Specification.language.ld.Coil;
import iec611313Specification.language.ld.CoilType;
import iec611313Specification.language.ld.LdPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coil</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.language.ld.impl.CoilImpl#getCoilType <em>Coil Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoilImpl extends LDNodeImpl implements Coil {
	/**
	 * The default value of the '{@link #getCoilType() <em>Coil Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoilType()
	 * @generated
	 * @ordered
	 */
	protected static final CoilType COIL_TYPE_EDEFAULT = CoilType.COIL;

	/**
	 * The cached value of the '{@link #getCoilType() <em>Coil Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoilType()
	 * @generated
	 * @ordered
	 */
	protected CoilType coilType = COIL_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoilImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LdPackage.Literals.COIL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoilType getCoilType() {
		return coilType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoilType(CoilType newCoilType) {
		CoilType oldCoilType = coilType;
		coilType = newCoilType == null ? COIL_TYPE_EDEFAULT : newCoilType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LdPackage.COIL__COIL_TYPE, oldCoilType, coilType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LdPackage.COIL__COIL_TYPE:
				return getCoilType();
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
			case LdPackage.COIL__COIL_TYPE:
				setCoilType((CoilType)newValue);
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
			case LdPackage.COIL__COIL_TYPE:
				setCoilType(COIL_TYPE_EDEFAULT);
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
			case LdPackage.COIL__COIL_TYPE:
				return coilType != COIL_TYPE_EDEFAULT;
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
		result.append(" (coilType: ");
		result.append(coilType);
		result.append(')');
		return result.toString();
	}

} //CoilImpl
