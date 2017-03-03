/**
 */
package iec611313Specification.common.oop.impl;

import iec611313Specification.common.oop.MethodSignature;
import iec611313Specification.common.oop.OopPackage;

import iec611313Specification.common.types.ANY;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.common.oop.impl.MethodSignatureImpl#getName <em>Name</em>}</li>
 *   <li>{@link iec611313Specification.common.oop.impl.MethodSignatureImpl#getHasReturnType <em>Has Return Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodSignatureImpl extends MinimalEObjectImpl.Container implements MethodSignature {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasReturnType() <em>Has Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasReturnType()
	 * @generated
	 * @ordered
	 */
	protected ANY hasReturnType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodSignatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OopPackage.Literals.METHOD_SIGNATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OopPackage.METHOD_SIGNATURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ANY getHasReturnType() {
		return hasReturnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasReturnType(ANY newHasReturnType, NotificationChain msgs) {
		ANY oldHasReturnType = hasReturnType;
		hasReturnType = newHasReturnType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OopPackage.METHOD_SIGNATURE__HAS_RETURN_TYPE, oldHasReturnType, newHasReturnType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasReturnType(ANY newHasReturnType) {
		if (newHasReturnType != hasReturnType) {
			NotificationChain msgs = null;
			if (hasReturnType != null)
				msgs = ((InternalEObject)hasReturnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OopPackage.METHOD_SIGNATURE__HAS_RETURN_TYPE, null, msgs);
			if (newHasReturnType != null)
				msgs = ((InternalEObject)newHasReturnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OopPackage.METHOD_SIGNATURE__HAS_RETURN_TYPE, null, msgs);
			msgs = basicSetHasReturnType(newHasReturnType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OopPackage.METHOD_SIGNATURE__HAS_RETURN_TYPE, newHasReturnType, newHasReturnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OopPackage.METHOD_SIGNATURE__HAS_RETURN_TYPE:
				return basicSetHasReturnType(null, msgs);
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
			case OopPackage.METHOD_SIGNATURE__NAME:
				return getName();
			case OopPackage.METHOD_SIGNATURE__HAS_RETURN_TYPE:
				return getHasReturnType();
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
			case OopPackage.METHOD_SIGNATURE__NAME:
				setName((String)newValue);
				return;
			case OopPackage.METHOD_SIGNATURE__HAS_RETURN_TYPE:
				setHasReturnType((ANY)newValue);
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
			case OopPackage.METHOD_SIGNATURE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OopPackage.METHOD_SIGNATURE__HAS_RETURN_TYPE:
				setHasReturnType((ANY)null);
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
			case OopPackage.METHOD_SIGNATURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OopPackage.METHOD_SIGNATURE__HAS_RETURN_TYPE:
				return hasReturnType != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MethodSignatureImpl
