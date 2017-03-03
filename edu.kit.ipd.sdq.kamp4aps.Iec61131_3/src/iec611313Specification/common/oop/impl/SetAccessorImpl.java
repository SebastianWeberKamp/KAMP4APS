/**
 */
package iec611313Specification.common.oop.impl;

import iec611313Specification.common.oop.OopPackage;
import iec611313Specification.common.oop.SetAccessor;

import iec611313Specification.common.pous.functions.FunctionBodySpecification;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Accessor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.common.oop.impl.SetAccessorImpl#getHasBody <em>Has Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetAccessorImpl extends MinimalEObjectImpl.Container implements SetAccessor {
	/**
	 * The cached value of the '{@link #getHasBody() <em>Has Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasBody()
	 * @generated
	 * @ordered
	 */
	protected FunctionBodySpecification hasBody;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetAccessorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OopPackage.Literals.SET_ACCESSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBodySpecification getHasBody() {
		return hasBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasBody(FunctionBodySpecification newHasBody, NotificationChain msgs) {
		FunctionBodySpecification oldHasBody = hasBody;
		hasBody = newHasBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OopPackage.SET_ACCESSOR__HAS_BODY, oldHasBody, newHasBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasBody(FunctionBodySpecification newHasBody) {
		if (newHasBody != hasBody) {
			NotificationChain msgs = null;
			if (hasBody != null)
				msgs = ((InternalEObject)hasBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OopPackage.SET_ACCESSOR__HAS_BODY, null, msgs);
			if (newHasBody != null)
				msgs = ((InternalEObject)newHasBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OopPackage.SET_ACCESSOR__HAS_BODY, null, msgs);
			msgs = basicSetHasBody(newHasBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OopPackage.SET_ACCESSOR__HAS_BODY, newHasBody, newHasBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OopPackage.SET_ACCESSOR__HAS_BODY:
				return basicSetHasBody(null, msgs);
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
			case OopPackage.SET_ACCESSOR__HAS_BODY:
				return getHasBody();
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
			case OopPackage.SET_ACCESSOR__HAS_BODY:
				setHasBody((FunctionBodySpecification)newValue);
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
			case OopPackage.SET_ACCESSOR__HAS_BODY:
				setHasBody((FunctionBodySpecification)null);
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
			case OopPackage.SET_ACCESSOR__HAS_BODY:
				return hasBody != null;
		}
		return super.eIsSet(featureID);
	}

} //SetAccessorImpl
