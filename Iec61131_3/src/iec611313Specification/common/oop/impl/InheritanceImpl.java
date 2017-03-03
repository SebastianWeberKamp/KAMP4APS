/**
 */
package iec611313Specification.common.oop.impl;

import iec611313Specification.common.oop.Inheritance;
import iec611313Specification.common.oop.OopPackage;

import iec611313Specification.common.pous.function_blocks.FunctionBlockType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inheritance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.common.oop.impl.InheritanceImpl#getHasSuperType <em>Has Super Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InheritanceImpl extends MinimalEObjectImpl.Container implements Inheritance {
	/**
	 * The cached value of the '{@link #getHasSuperType() <em>Has Super Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasSuperType()
	 * @generated
	 * @ordered
	 */
	protected FunctionBlockType hasSuperType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InheritanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OopPackage.Literals.INHERITANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBlockType getHasSuperType() {
		if (hasSuperType != null && hasSuperType.eIsProxy()) {
			InternalEObject oldHasSuperType = (InternalEObject)hasSuperType;
			hasSuperType = (FunctionBlockType)eResolveProxy(oldHasSuperType);
			if (hasSuperType != oldHasSuperType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OopPackage.INHERITANCE__HAS_SUPER_TYPE, oldHasSuperType, hasSuperType));
			}
		}
		return hasSuperType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBlockType basicGetHasSuperType() {
		return hasSuperType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasSuperType(FunctionBlockType newHasSuperType) {
		FunctionBlockType oldHasSuperType = hasSuperType;
		hasSuperType = newHasSuperType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OopPackage.INHERITANCE__HAS_SUPER_TYPE, oldHasSuperType, hasSuperType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OopPackage.INHERITANCE__HAS_SUPER_TYPE:
				if (resolve) return getHasSuperType();
				return basicGetHasSuperType();
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
			case OopPackage.INHERITANCE__HAS_SUPER_TYPE:
				setHasSuperType((FunctionBlockType)newValue);
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
			case OopPackage.INHERITANCE__HAS_SUPER_TYPE:
				setHasSuperType((FunctionBlockType)null);
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
			case OopPackage.INHERITANCE__HAS_SUPER_TYPE:
				return hasSuperType != null;
		}
		return super.eIsSet(featureID);
	}

} //InheritanceImpl
