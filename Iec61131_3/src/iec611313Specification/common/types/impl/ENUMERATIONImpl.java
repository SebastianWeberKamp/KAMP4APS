/**
 */
package iec611313Specification.common.types.impl;

import iec611313Specification.common.Literal;

import iec611313Specification.common.types.ENUMERATION;
import iec611313Specification.common.types.TypesPackage;

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
 * An implementation of the model object '<em><b>ENUMERATION</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.common.types.impl.ENUMERATIONImpl#getContainsEnumValue <em>Contains Enum Value</em>}</li>
 *   <li>{@link iec611313Specification.common.types.impl.ENUMERATIONImpl#getHasInitialEnumValue <em>Has Initial Enum Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ENUMERATIONImpl extends ANY_DERIVEDImpl implements ENUMERATION {
	/**
	 * The cached value of the '{@link #getContainsEnumValue() <em>Contains Enum Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsEnumValue()
	 * @generated
	 * @ordered
	 */
	protected EList<Literal> containsEnumValue;

	/**
	 * The cached value of the '{@link #getHasInitialEnumValue() <em>Has Initial Enum Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasInitialEnumValue()
	 * @generated
	 * @ordered
	 */
	protected Literal hasInitialEnumValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ENUMERATIONImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.ENUMERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Literal> getContainsEnumValue() {
		if (containsEnumValue == null) {
			containsEnumValue = new EObjectContainmentEList<Literal>(Literal.class, this, TypesPackage.ENUMERATION__CONTAINS_ENUM_VALUE);
		}
		return containsEnumValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal getHasInitialEnumValue() {
		return hasInitialEnumValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasInitialEnumValue(Literal newHasInitialEnumValue, NotificationChain msgs) {
		Literal oldHasInitialEnumValue = hasInitialEnumValue;
		hasInitialEnumValue = newHasInitialEnumValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.ENUMERATION__HAS_INITIAL_ENUM_VALUE, oldHasInitialEnumValue, newHasInitialEnumValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasInitialEnumValue(Literal newHasInitialEnumValue) {
		if (newHasInitialEnumValue != hasInitialEnumValue) {
			NotificationChain msgs = null;
			if (hasInitialEnumValue != null)
				msgs = ((InternalEObject)hasInitialEnumValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ENUMERATION__HAS_INITIAL_ENUM_VALUE, null, msgs);
			if (newHasInitialEnumValue != null)
				msgs = ((InternalEObject)newHasInitialEnumValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ENUMERATION__HAS_INITIAL_ENUM_VALUE, null, msgs);
			msgs = basicSetHasInitialEnumValue(newHasInitialEnumValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ENUMERATION__HAS_INITIAL_ENUM_VALUE, newHasInitialEnumValue, newHasInitialEnumValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.ENUMERATION__CONTAINS_ENUM_VALUE:
				return ((InternalEList<?>)getContainsEnumValue()).basicRemove(otherEnd, msgs);
			case TypesPackage.ENUMERATION__HAS_INITIAL_ENUM_VALUE:
				return basicSetHasInitialEnumValue(null, msgs);
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
			case TypesPackage.ENUMERATION__CONTAINS_ENUM_VALUE:
				return getContainsEnumValue();
			case TypesPackage.ENUMERATION__HAS_INITIAL_ENUM_VALUE:
				return getHasInitialEnumValue();
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
			case TypesPackage.ENUMERATION__CONTAINS_ENUM_VALUE:
				getContainsEnumValue().clear();
				getContainsEnumValue().addAll((Collection<? extends Literal>)newValue);
				return;
			case TypesPackage.ENUMERATION__HAS_INITIAL_ENUM_VALUE:
				setHasInitialEnumValue((Literal)newValue);
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
			case TypesPackage.ENUMERATION__CONTAINS_ENUM_VALUE:
				getContainsEnumValue().clear();
				return;
			case TypesPackage.ENUMERATION__HAS_INITIAL_ENUM_VALUE:
				setHasInitialEnumValue((Literal)null);
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
			case TypesPackage.ENUMERATION__CONTAINS_ENUM_VALUE:
				return containsEnumValue != null && !containsEnumValue.isEmpty();
			case TypesPackage.ENUMERATION__HAS_INITIAL_ENUM_VALUE:
				return hasInitialEnumValue != null;
		}
		return super.eIsSet(featureID);
	}

} //ENUMERATIONImpl
