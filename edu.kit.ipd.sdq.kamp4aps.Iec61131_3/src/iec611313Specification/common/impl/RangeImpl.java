/**
 */
package iec611313Specification.common.impl;

import iec611313Specification.common.CommonPackage;
import iec611313Specification.common.Literal;
import iec611313Specification.common.Range;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.common.impl.RangeImpl#getHasLowerBound <em>Has Lower Bound</em>}</li>
 *   <li>{@link iec611313Specification.common.impl.RangeImpl#getHasUpperBound <em>Has Upper Bound</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RangeImpl extends MinimalEObjectImpl.Container implements Range {
	/**
	 * The cached value of the '{@link #getHasLowerBound() <em>Has Lower Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasLowerBound()
	 * @generated
	 * @ordered
	 */
	protected Literal hasLowerBound;

	/**
	 * The cached value of the '{@link #getHasUpperBound() <em>Has Upper Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasUpperBound()
	 * @generated
	 * @ordered
	 */
	protected Literal hasUpperBound;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.RANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal getHasLowerBound() {
		return hasLowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasLowerBound(Literal newHasLowerBound, NotificationChain msgs) {
		Literal oldHasLowerBound = hasLowerBound;
		hasLowerBound = newHasLowerBound;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonPackage.RANGE__HAS_LOWER_BOUND, oldHasLowerBound, newHasLowerBound);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasLowerBound(Literal newHasLowerBound) {
		if (newHasLowerBound != hasLowerBound) {
			NotificationChain msgs = null;
			if (hasLowerBound != null)
				msgs = ((InternalEObject)hasLowerBound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonPackage.RANGE__HAS_LOWER_BOUND, null, msgs);
			if (newHasLowerBound != null)
				msgs = ((InternalEObject)newHasLowerBound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonPackage.RANGE__HAS_LOWER_BOUND, null, msgs);
			msgs = basicSetHasLowerBound(newHasLowerBound, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.RANGE__HAS_LOWER_BOUND, newHasLowerBound, newHasLowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal getHasUpperBound() {
		return hasUpperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasUpperBound(Literal newHasUpperBound, NotificationChain msgs) {
		Literal oldHasUpperBound = hasUpperBound;
		hasUpperBound = newHasUpperBound;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonPackage.RANGE__HAS_UPPER_BOUND, oldHasUpperBound, newHasUpperBound);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasUpperBound(Literal newHasUpperBound) {
		if (newHasUpperBound != hasUpperBound) {
			NotificationChain msgs = null;
			if (hasUpperBound != null)
				msgs = ((InternalEObject)hasUpperBound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonPackage.RANGE__HAS_UPPER_BOUND, null, msgs);
			if (newHasUpperBound != null)
				msgs = ((InternalEObject)newHasUpperBound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonPackage.RANGE__HAS_UPPER_BOUND, null, msgs);
			msgs = basicSetHasUpperBound(newHasUpperBound, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.RANGE__HAS_UPPER_BOUND, newHasUpperBound, newHasUpperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommonPackage.RANGE__HAS_LOWER_BOUND:
				return basicSetHasLowerBound(null, msgs);
			case CommonPackage.RANGE__HAS_UPPER_BOUND:
				return basicSetHasUpperBound(null, msgs);
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
			case CommonPackage.RANGE__HAS_LOWER_BOUND:
				return getHasLowerBound();
			case CommonPackage.RANGE__HAS_UPPER_BOUND:
				return getHasUpperBound();
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
			case CommonPackage.RANGE__HAS_LOWER_BOUND:
				setHasLowerBound((Literal)newValue);
				return;
			case CommonPackage.RANGE__HAS_UPPER_BOUND:
				setHasUpperBound((Literal)newValue);
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
			case CommonPackage.RANGE__HAS_LOWER_BOUND:
				setHasLowerBound((Literal)null);
				return;
			case CommonPackage.RANGE__HAS_UPPER_BOUND:
				setHasUpperBound((Literal)null);
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
			case CommonPackage.RANGE__HAS_LOWER_BOUND:
				return hasLowerBound != null;
			case CommonPackage.RANGE__HAS_UPPER_BOUND:
				return hasUpperBound != null;
		}
		return super.eIsSet(featureID);
	}

} //RangeImpl
