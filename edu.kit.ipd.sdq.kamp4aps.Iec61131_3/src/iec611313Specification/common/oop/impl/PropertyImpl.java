/**
 */
package iec611313Specification.common.oop.impl;

import iec611313Specification.common.oop.GetAccessor;
import iec611313Specification.common.oop.OopPackage;
import iec611313Specification.common.oop.Property;
import iec611313Specification.common.oop.PropertySignature;
import iec611313Specification.common.oop.SetAccessor;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.common.oop.impl.PropertyImpl#getContainsGetter <em>Contains Getter</em>}</li>
 *   <li>{@link iec611313Specification.common.oop.impl.PropertyImpl#getContainsSetter <em>Contains Setter</em>}</li>
 *   <li>{@link iec611313Specification.common.oop.impl.PropertyImpl#getHasSignature <em>Has Signature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyImpl extends MinimalEObjectImpl.Container implements Property {
	/**
	 * The cached value of the '{@link #getContainsGetter() <em>Contains Getter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsGetter()
	 * @generated
	 * @ordered
	 */
	protected GetAccessor containsGetter;

	/**
	 * The cached value of the '{@link #getContainsSetter() <em>Contains Setter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsSetter()
	 * @generated
	 * @ordered
	 */
	protected SetAccessor containsSetter;

	/**
	 * The cached value of the '{@link #getHasSignature() <em>Has Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasSignature()
	 * @generated
	 * @ordered
	 */
	protected PropertySignature hasSignature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OopPackage.Literals.PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetAccessor getContainsGetter() {
		return containsGetter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainsGetter(GetAccessor newContainsGetter, NotificationChain msgs) {
		GetAccessor oldContainsGetter = containsGetter;
		containsGetter = newContainsGetter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OopPackage.PROPERTY__CONTAINS_GETTER, oldContainsGetter, newContainsGetter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainsGetter(GetAccessor newContainsGetter) {
		if (newContainsGetter != containsGetter) {
			NotificationChain msgs = null;
			if (containsGetter != null)
				msgs = ((InternalEObject)containsGetter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OopPackage.PROPERTY__CONTAINS_GETTER, null, msgs);
			if (newContainsGetter != null)
				msgs = ((InternalEObject)newContainsGetter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OopPackage.PROPERTY__CONTAINS_GETTER, null, msgs);
			msgs = basicSetContainsGetter(newContainsGetter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OopPackage.PROPERTY__CONTAINS_GETTER, newContainsGetter, newContainsGetter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetAccessor getContainsSetter() {
		return containsSetter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainsSetter(SetAccessor newContainsSetter, NotificationChain msgs) {
		SetAccessor oldContainsSetter = containsSetter;
		containsSetter = newContainsSetter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OopPackage.PROPERTY__CONTAINS_SETTER, oldContainsSetter, newContainsSetter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainsSetter(SetAccessor newContainsSetter) {
		if (newContainsSetter != containsSetter) {
			NotificationChain msgs = null;
			if (containsSetter != null)
				msgs = ((InternalEObject)containsSetter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OopPackage.PROPERTY__CONTAINS_SETTER, null, msgs);
			if (newContainsSetter != null)
				msgs = ((InternalEObject)newContainsSetter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OopPackage.PROPERTY__CONTAINS_SETTER, null, msgs);
			msgs = basicSetContainsSetter(newContainsSetter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OopPackage.PROPERTY__CONTAINS_SETTER, newContainsSetter, newContainsSetter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertySignature getHasSignature() {
		return hasSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasSignature(PropertySignature newHasSignature, NotificationChain msgs) {
		PropertySignature oldHasSignature = hasSignature;
		hasSignature = newHasSignature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OopPackage.PROPERTY__HAS_SIGNATURE, oldHasSignature, newHasSignature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasSignature(PropertySignature newHasSignature) {
		if (newHasSignature != hasSignature) {
			NotificationChain msgs = null;
			if (hasSignature != null)
				msgs = ((InternalEObject)hasSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OopPackage.PROPERTY__HAS_SIGNATURE, null, msgs);
			if (newHasSignature != null)
				msgs = ((InternalEObject)newHasSignature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OopPackage.PROPERTY__HAS_SIGNATURE, null, msgs);
			msgs = basicSetHasSignature(newHasSignature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OopPackage.PROPERTY__HAS_SIGNATURE, newHasSignature, newHasSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OopPackage.PROPERTY__CONTAINS_GETTER:
				return basicSetContainsGetter(null, msgs);
			case OopPackage.PROPERTY__CONTAINS_SETTER:
				return basicSetContainsSetter(null, msgs);
			case OopPackage.PROPERTY__HAS_SIGNATURE:
				return basicSetHasSignature(null, msgs);
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
			case OopPackage.PROPERTY__CONTAINS_GETTER:
				return getContainsGetter();
			case OopPackage.PROPERTY__CONTAINS_SETTER:
				return getContainsSetter();
			case OopPackage.PROPERTY__HAS_SIGNATURE:
				return getHasSignature();
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
			case OopPackage.PROPERTY__CONTAINS_GETTER:
				setContainsGetter((GetAccessor)newValue);
				return;
			case OopPackage.PROPERTY__CONTAINS_SETTER:
				setContainsSetter((SetAccessor)newValue);
				return;
			case OopPackage.PROPERTY__HAS_SIGNATURE:
				setHasSignature((PropertySignature)newValue);
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
			case OopPackage.PROPERTY__CONTAINS_GETTER:
				setContainsGetter((GetAccessor)null);
				return;
			case OopPackage.PROPERTY__CONTAINS_SETTER:
				setContainsSetter((SetAccessor)null);
				return;
			case OopPackage.PROPERTY__HAS_SIGNATURE:
				setHasSignature((PropertySignature)null);
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
			case OopPackage.PROPERTY__CONTAINS_GETTER:
				return containsGetter != null;
			case OopPackage.PROPERTY__CONTAINS_SETTER:
				return containsSetter != null;
			case OopPackage.PROPERTY__HAS_SIGNATURE:
				return hasSignature != null;
		}
		return super.eIsSet(featureID);
	}

} //PropertyImpl
