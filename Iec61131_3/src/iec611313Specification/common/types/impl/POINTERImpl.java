/**
 */
package iec611313Specification.common.types.impl;

import iec611313Specification.common.types.ANY;
import iec611313Specification.common.types.POINTER;
import iec611313Specification.common.types.TypesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>POINTER</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.common.types.impl.POINTERImpl#getHasDerivedBaseType <em>Has Derived Base Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class POINTERImpl extends ANY_DERIVEDImpl implements POINTER {
	/**
	 * The cached value of the '{@link #getHasDerivedBaseType() <em>Has Derived Base Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasDerivedBaseType()
	 * @generated
	 * @ordered
	 */
	protected ANY hasDerivedBaseType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected POINTERImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.POINTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ANY getHasDerivedBaseType() {
		return hasDerivedBaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasDerivedBaseType(ANY newHasDerivedBaseType, NotificationChain msgs) {
		ANY oldHasDerivedBaseType = hasDerivedBaseType;
		hasDerivedBaseType = newHasDerivedBaseType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.POINTER__HAS_DERIVED_BASE_TYPE, oldHasDerivedBaseType, newHasDerivedBaseType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasDerivedBaseType(ANY newHasDerivedBaseType) {
		if (newHasDerivedBaseType != hasDerivedBaseType) {
			NotificationChain msgs = null;
			if (hasDerivedBaseType != null)
				msgs = ((InternalEObject)hasDerivedBaseType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.POINTER__HAS_DERIVED_BASE_TYPE, null, msgs);
			if (newHasDerivedBaseType != null)
				msgs = ((InternalEObject)newHasDerivedBaseType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.POINTER__HAS_DERIVED_BASE_TYPE, null, msgs);
			msgs = basicSetHasDerivedBaseType(newHasDerivedBaseType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.POINTER__HAS_DERIVED_BASE_TYPE, newHasDerivedBaseType, newHasDerivedBaseType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.POINTER__HAS_DERIVED_BASE_TYPE:
				return basicSetHasDerivedBaseType(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.POINTER__HAS_DERIVED_BASE_TYPE:
				return getHasDerivedBaseType();
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
			case TypesPackage.POINTER__HAS_DERIVED_BASE_TYPE:
				setHasDerivedBaseType((ANY)newValue);
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
			case TypesPackage.POINTER__HAS_DERIVED_BASE_TYPE:
				setHasDerivedBaseType((ANY)null);
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
			case TypesPackage.POINTER__HAS_DERIVED_BASE_TYPE:
				return hasDerivedBaseType != null;
		}
		return super.eIsSet(featureID);
	}

} //POINTERImpl
