/**
 */
package iec611313Specification.common.impl;

import iec611313Specification.common.CommonPackage;
import iec611313Specification.common.Expression;

import iec611313Specification.common.types.ANY;

import iec611313Specification.language.st.impl.StatementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.common.impl.ExpressionImpl#getHasType <em>Has Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ExpressionImpl extends StatementImpl implements Expression {
	/**
	 * The cached value of the '{@link #getHasType() <em>Has Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasType()
	 * @generated
	 * @ordered
	 */
	protected ANY hasType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ANY getHasType() {
		return hasType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasType(ANY newHasType, NotificationChain msgs) {
		ANY oldHasType = hasType;
		hasType = newHasType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonPackage.EXPRESSION__HAS_TYPE, oldHasType, newHasType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasType(ANY newHasType) {
		if (newHasType != hasType) {
			NotificationChain msgs = null;
			if (hasType != null)
				msgs = ((InternalEObject)hasType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonPackage.EXPRESSION__HAS_TYPE, null, msgs);
			if (newHasType != null)
				msgs = ((InternalEObject)newHasType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonPackage.EXPRESSION__HAS_TYPE, null, msgs);
			msgs = basicSetHasType(newHasType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.EXPRESSION__HAS_TYPE, newHasType, newHasType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommonPackage.EXPRESSION__HAS_TYPE:
				return basicSetHasType(null, msgs);
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
			case CommonPackage.EXPRESSION__HAS_TYPE:
				return getHasType();
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
			case CommonPackage.EXPRESSION__HAS_TYPE:
				setHasType((ANY)newValue);
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
			case CommonPackage.EXPRESSION__HAS_TYPE:
				setHasType((ANY)null);
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
			case CommonPackage.EXPRESSION__HAS_TYPE:
				return hasType != null;
		}
		return super.eIsSet(featureID);
	}

} //ExpressionImpl
