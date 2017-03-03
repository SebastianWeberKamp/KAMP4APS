/**
 */
package iec611313Specification.common.oop.impl;

import iec611313Specification.common.oop.OopPackage;
import iec611313Specification.common.oop.PropertySignature;

import iec611313Specification.common.types.ANY;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.common.oop.impl.PropertySignatureImpl#isHasSetter <em>Has Setter</em>}</li>
 *   <li>{@link iec611313Specification.common.oop.impl.PropertySignatureImpl#isHasGetter <em>Has Getter</em>}</li>
 *   <li>{@link iec611313Specification.common.oop.impl.PropertySignatureImpl#getHasReturnType <em>Has Return Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertySignatureImpl extends MinimalEObjectImpl.Container implements PropertySignature {
	/**
	 * The default value of the '{@link #isHasSetter() <em>Has Setter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasSetter()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_SETTER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasSetter() <em>Has Setter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasSetter()
	 * @generated
	 * @ordered
	 */
	protected boolean hasSetter = HAS_SETTER_EDEFAULT;

	/**
	 * The default value of the '{@link #isHasGetter() <em>Has Getter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasGetter()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_GETTER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasGetter() <em>Has Getter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasGetter()
	 * @generated
	 * @ordered
	 */
	protected boolean hasGetter = HAS_GETTER_EDEFAULT;

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
	protected PropertySignatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OopPackage.Literals.PROPERTY_SIGNATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasSetter() {
		return hasSetter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasSetter(boolean newHasSetter) {
		boolean oldHasSetter = hasSetter;
		hasSetter = newHasSetter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OopPackage.PROPERTY_SIGNATURE__HAS_SETTER, oldHasSetter, hasSetter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasGetter() {
		return hasGetter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasGetter(boolean newHasGetter) {
		boolean oldHasGetter = hasGetter;
		hasGetter = newHasGetter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OopPackage.PROPERTY_SIGNATURE__HAS_GETTER, oldHasGetter, hasGetter));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OopPackage.PROPERTY_SIGNATURE__HAS_RETURN_TYPE, oldHasReturnType, newHasReturnType);
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
				msgs = ((InternalEObject)hasReturnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OopPackage.PROPERTY_SIGNATURE__HAS_RETURN_TYPE, null, msgs);
			if (newHasReturnType != null)
				msgs = ((InternalEObject)newHasReturnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OopPackage.PROPERTY_SIGNATURE__HAS_RETURN_TYPE, null, msgs);
			msgs = basicSetHasReturnType(newHasReturnType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OopPackage.PROPERTY_SIGNATURE__HAS_RETURN_TYPE, newHasReturnType, newHasReturnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OopPackage.PROPERTY_SIGNATURE__HAS_RETURN_TYPE:
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
			case OopPackage.PROPERTY_SIGNATURE__HAS_SETTER:
				return isHasSetter();
			case OopPackage.PROPERTY_SIGNATURE__HAS_GETTER:
				return isHasGetter();
			case OopPackage.PROPERTY_SIGNATURE__HAS_RETURN_TYPE:
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
			case OopPackage.PROPERTY_SIGNATURE__HAS_SETTER:
				setHasSetter((Boolean)newValue);
				return;
			case OopPackage.PROPERTY_SIGNATURE__HAS_GETTER:
				setHasGetter((Boolean)newValue);
				return;
			case OopPackage.PROPERTY_SIGNATURE__HAS_RETURN_TYPE:
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
			case OopPackage.PROPERTY_SIGNATURE__HAS_SETTER:
				setHasSetter(HAS_SETTER_EDEFAULT);
				return;
			case OopPackage.PROPERTY_SIGNATURE__HAS_GETTER:
				setHasGetter(HAS_GETTER_EDEFAULT);
				return;
			case OopPackage.PROPERTY_SIGNATURE__HAS_RETURN_TYPE:
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
			case OopPackage.PROPERTY_SIGNATURE__HAS_SETTER:
				return hasSetter != HAS_SETTER_EDEFAULT;
			case OopPackage.PROPERTY_SIGNATURE__HAS_GETTER:
				return hasGetter != HAS_GETTER_EDEFAULT;
			case OopPackage.PROPERTY_SIGNATURE__HAS_RETURN_TYPE:
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
		result.append(" (HasSetter: ");
		result.append(hasSetter);
		result.append(", HasGetter: ");
		result.append(hasGetter);
		result.append(')');
		return result.toString();
	}

} //PropertySignatureImpl
