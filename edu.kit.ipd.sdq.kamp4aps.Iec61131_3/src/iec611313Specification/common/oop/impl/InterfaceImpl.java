/**
 */
package iec611313Specification.common.oop.impl;

import iec611313Specification.common.oop.Interface;
import iec611313Specification.common.oop.MethodSignature;
import iec611313Specification.common.oop.OopPackage;
import iec611313Specification.common.oop.PropertySignature;

import iec611313Specification.common.types.impl.ANY_DERIVEDImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.common.oop.impl.InterfaceImpl#getHasBaseType <em>Has Base Type</em>}</li>
 *   <li>{@link iec611313Specification.common.oop.impl.InterfaceImpl#getHasPropertySignatures <em>Has Property Signatures</em>}</li>
 *   <li>{@link iec611313Specification.common.oop.impl.InterfaceImpl#getHasMethodSignatures <em>Has Method Signatures</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InterfaceImpl extends ANY_DERIVEDImpl implements Interface {
	/**
	 * The cached value of the '{@link #getHasBaseType() <em>Has Base Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasBaseType()
	 * @generated
	 * @ordered
	 */
	protected Interface hasBaseType;

	/**
	 * The cached value of the '{@link #getHasPropertySignatures() <em>Has Property Signatures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPropertySignatures()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertySignature> hasPropertySignatures;

	/**
	 * The cached value of the '{@link #getHasMethodSignatures() <em>Has Method Signatures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasMethodSignatures()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodSignature> hasMethodSignatures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OopPackage.Literals.INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getHasBaseType() {
		return hasBaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasBaseType(Interface newHasBaseType, NotificationChain msgs) {
		Interface oldHasBaseType = hasBaseType;
		hasBaseType = newHasBaseType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OopPackage.INTERFACE__HAS_BASE_TYPE, oldHasBaseType, newHasBaseType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasBaseType(Interface newHasBaseType) {
		if (newHasBaseType != hasBaseType) {
			NotificationChain msgs = null;
			if (hasBaseType != null)
				msgs = ((InternalEObject)hasBaseType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OopPackage.INTERFACE__HAS_BASE_TYPE, null, msgs);
			if (newHasBaseType != null)
				msgs = ((InternalEObject)newHasBaseType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OopPackage.INTERFACE__HAS_BASE_TYPE, null, msgs);
			msgs = basicSetHasBaseType(newHasBaseType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OopPackage.INTERFACE__HAS_BASE_TYPE, newHasBaseType, newHasBaseType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertySignature> getHasPropertySignatures() {
		if (hasPropertySignatures == null) {
			hasPropertySignatures = new EObjectContainmentEList<PropertySignature>(PropertySignature.class, this, OopPackage.INTERFACE__HAS_PROPERTY_SIGNATURES);
		}
		return hasPropertySignatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MethodSignature> getHasMethodSignatures() {
		if (hasMethodSignatures == null) {
			hasMethodSignatures = new EObjectContainmentEList<MethodSignature>(MethodSignature.class, this, OopPackage.INTERFACE__HAS_METHOD_SIGNATURES);
		}
		return hasMethodSignatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OopPackage.INTERFACE__HAS_BASE_TYPE:
				return basicSetHasBaseType(null, msgs);
			case OopPackage.INTERFACE__HAS_PROPERTY_SIGNATURES:
				return ((InternalEList<?>)getHasPropertySignatures()).basicRemove(otherEnd, msgs);
			case OopPackage.INTERFACE__HAS_METHOD_SIGNATURES:
				return ((InternalEList<?>)getHasMethodSignatures()).basicRemove(otherEnd, msgs);
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
			case OopPackage.INTERFACE__HAS_BASE_TYPE:
				return getHasBaseType();
			case OopPackage.INTERFACE__HAS_PROPERTY_SIGNATURES:
				return getHasPropertySignatures();
			case OopPackage.INTERFACE__HAS_METHOD_SIGNATURES:
				return getHasMethodSignatures();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OopPackage.INTERFACE__HAS_BASE_TYPE:
				setHasBaseType((Interface)newValue);
				return;
			case OopPackage.INTERFACE__HAS_PROPERTY_SIGNATURES:
				getHasPropertySignatures().clear();
				getHasPropertySignatures().addAll((Collection<? extends PropertySignature>)newValue);
				return;
			case OopPackage.INTERFACE__HAS_METHOD_SIGNATURES:
				getHasMethodSignatures().clear();
				getHasMethodSignatures().addAll((Collection<? extends MethodSignature>)newValue);
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
			case OopPackage.INTERFACE__HAS_BASE_TYPE:
				setHasBaseType((Interface)null);
				return;
			case OopPackage.INTERFACE__HAS_PROPERTY_SIGNATURES:
				getHasPropertySignatures().clear();
				return;
			case OopPackage.INTERFACE__HAS_METHOD_SIGNATURES:
				getHasMethodSignatures().clear();
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
			case OopPackage.INTERFACE__HAS_BASE_TYPE:
				return hasBaseType != null;
			case OopPackage.INTERFACE__HAS_PROPERTY_SIGNATURES:
				return hasPropertySignatures != null && !hasPropertySignatures.isEmpty();
			case OopPackage.INTERFACE__HAS_METHOD_SIGNATURES:
				return hasMethodSignatures != null && !hasMethodSignatures.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InterfaceImpl
