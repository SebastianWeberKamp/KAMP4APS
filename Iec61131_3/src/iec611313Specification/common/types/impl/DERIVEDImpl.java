/**
 */
package iec611313Specification.common.types.impl;

import iec611313Specification.common.Literal;
import iec611313Specification.common.Range;

import iec611313Specification.common.types.ANY;
import iec611313Specification.common.types.DERIVED;
import iec611313Specification.common.types.TypesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DERIVED</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.common.types.impl.DERIVEDImpl#getHasInitialDerivedValue <em>Has Initial Derived Value</em>}</li>
 *   <li>{@link iec611313Specification.common.types.impl.DERIVEDImpl#getHasSubrangeRange <em>Has Subrange Range</em>}</li>
 *   <li>{@link iec611313Specification.common.types.impl.DERIVEDImpl#getHasDerivedBaseType <em>Has Derived Base Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DERIVEDImpl extends ANY_DERIVEDImpl implements DERIVED {
	/**
	 * The cached value of the '{@link #getHasInitialDerivedValue() <em>Has Initial Derived Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasInitialDerivedValue()
	 * @generated
	 * @ordered
	 */
	protected Literal hasInitialDerivedValue;

	/**
	 * The cached value of the '{@link #getHasSubrangeRange() <em>Has Subrange Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasSubrangeRange()
	 * @generated
	 * @ordered
	 */
	protected Range hasSubrangeRange;

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
	protected DERIVEDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.DERIVED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal getHasInitialDerivedValue() {
		return hasInitialDerivedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasInitialDerivedValue(Literal newHasInitialDerivedValue, NotificationChain msgs) {
		Literal oldHasInitialDerivedValue = hasInitialDerivedValue;
		hasInitialDerivedValue = newHasInitialDerivedValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.DERIVED__HAS_INITIAL_DERIVED_VALUE, oldHasInitialDerivedValue, newHasInitialDerivedValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasInitialDerivedValue(Literal newHasInitialDerivedValue) {
		if (newHasInitialDerivedValue != hasInitialDerivedValue) {
			NotificationChain msgs = null;
			if (hasInitialDerivedValue != null)
				msgs = ((InternalEObject)hasInitialDerivedValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DERIVED__HAS_INITIAL_DERIVED_VALUE, null, msgs);
			if (newHasInitialDerivedValue != null)
				msgs = ((InternalEObject)newHasInitialDerivedValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DERIVED__HAS_INITIAL_DERIVED_VALUE, null, msgs);
			msgs = basicSetHasInitialDerivedValue(newHasInitialDerivedValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DERIVED__HAS_INITIAL_DERIVED_VALUE, newHasInitialDerivedValue, newHasInitialDerivedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range getHasSubrangeRange() {
		return hasSubrangeRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasSubrangeRange(Range newHasSubrangeRange, NotificationChain msgs) {
		Range oldHasSubrangeRange = hasSubrangeRange;
		hasSubrangeRange = newHasSubrangeRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.DERIVED__HAS_SUBRANGE_RANGE, oldHasSubrangeRange, newHasSubrangeRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasSubrangeRange(Range newHasSubrangeRange) {
		if (newHasSubrangeRange != hasSubrangeRange) {
			NotificationChain msgs = null;
			if (hasSubrangeRange != null)
				msgs = ((InternalEObject)hasSubrangeRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DERIVED__HAS_SUBRANGE_RANGE, null, msgs);
			if (newHasSubrangeRange != null)
				msgs = ((InternalEObject)newHasSubrangeRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DERIVED__HAS_SUBRANGE_RANGE, null, msgs);
			msgs = basicSetHasSubrangeRange(newHasSubrangeRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DERIVED__HAS_SUBRANGE_RANGE, newHasSubrangeRange, newHasSubrangeRange));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.DERIVED__HAS_DERIVED_BASE_TYPE, oldHasDerivedBaseType, newHasDerivedBaseType);
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
				msgs = ((InternalEObject)hasDerivedBaseType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DERIVED__HAS_DERIVED_BASE_TYPE, null, msgs);
			if (newHasDerivedBaseType != null)
				msgs = ((InternalEObject)newHasDerivedBaseType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DERIVED__HAS_DERIVED_BASE_TYPE, null, msgs);
			msgs = basicSetHasDerivedBaseType(newHasDerivedBaseType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DERIVED__HAS_DERIVED_BASE_TYPE, newHasDerivedBaseType, newHasDerivedBaseType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.DERIVED__HAS_INITIAL_DERIVED_VALUE:
				return basicSetHasInitialDerivedValue(null, msgs);
			case TypesPackage.DERIVED__HAS_SUBRANGE_RANGE:
				return basicSetHasSubrangeRange(null, msgs);
			case TypesPackage.DERIVED__HAS_DERIVED_BASE_TYPE:
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
			case TypesPackage.DERIVED__HAS_INITIAL_DERIVED_VALUE:
				return getHasInitialDerivedValue();
			case TypesPackage.DERIVED__HAS_SUBRANGE_RANGE:
				return getHasSubrangeRange();
			case TypesPackage.DERIVED__HAS_DERIVED_BASE_TYPE:
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
			case TypesPackage.DERIVED__HAS_INITIAL_DERIVED_VALUE:
				setHasInitialDerivedValue((Literal)newValue);
				return;
			case TypesPackage.DERIVED__HAS_SUBRANGE_RANGE:
				setHasSubrangeRange((Range)newValue);
				return;
			case TypesPackage.DERIVED__HAS_DERIVED_BASE_TYPE:
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
			case TypesPackage.DERIVED__HAS_INITIAL_DERIVED_VALUE:
				setHasInitialDerivedValue((Literal)null);
				return;
			case TypesPackage.DERIVED__HAS_SUBRANGE_RANGE:
				setHasSubrangeRange((Range)null);
				return;
			case TypesPackage.DERIVED__HAS_DERIVED_BASE_TYPE:
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
			case TypesPackage.DERIVED__HAS_INITIAL_DERIVED_VALUE:
				return hasInitialDerivedValue != null;
			case TypesPackage.DERIVED__HAS_SUBRANGE_RANGE:
				return hasSubrangeRange != null;
			case TypesPackage.DERIVED__HAS_DERIVED_BASE_TYPE:
				return hasDerivedBaseType != null;
		}
		return super.eIsSet(featureID);
	}

} //DERIVEDImpl
