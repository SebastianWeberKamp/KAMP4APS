/**
 */
package iec611313Specification.language.sfc.impl;

import iec611313Specification.common.variables.VariableAccess;

import iec611313Specification.language.sfc.Action;
import iec611313Specification.language.sfc.ActionAssociation;
import iec611313Specification.language.sfc.ActionQualifier;
import iec611313Specification.language.sfc.SfcPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.language.sfc.impl.ActionAssociationImpl#getHasAction <em>Has Action</em>}</li>
 *   <li>{@link iec611313Specification.language.sfc.impl.ActionAssociationImpl#getHasIndicatorVariable <em>Has Indicator Variable</em>}</li>
 *   <li>{@link iec611313Specification.language.sfc.impl.ActionAssociationImpl#getHasActionQualifier <em>Has Action Qualifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionAssociationImpl extends MinimalEObjectImpl.Container implements ActionAssociation {
	/**
	 * The cached value of the '{@link #getHasAction() <em>Has Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasAction()
	 * @generated
	 * @ordered
	 */
	protected Action hasAction;

	/**
	 * The cached value of the '{@link #getHasIndicatorVariable() <em>Has Indicator Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasIndicatorVariable()
	 * @generated
	 * @ordered
	 */
	protected VariableAccess hasIndicatorVariable;

	/**
	 * The cached value of the '{@link #getHasActionQualifier() <em>Has Action Qualifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasActionQualifier()
	 * @generated
	 * @ordered
	 */
	protected ActionQualifier hasActionQualifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SfcPackage.Literals.ACTION_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getHasAction() {
		if (hasAction != null && hasAction.eIsProxy()) {
			InternalEObject oldHasAction = (InternalEObject)hasAction;
			hasAction = (Action)eResolveProxy(oldHasAction);
			if (hasAction != oldHasAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SfcPackage.ACTION_ASSOCIATION__HAS_ACTION, oldHasAction, hasAction));
			}
		}
		return hasAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetHasAction() {
		return hasAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasAction(Action newHasAction) {
		Action oldHasAction = hasAction;
		hasAction = newHasAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SfcPackage.ACTION_ASSOCIATION__HAS_ACTION, oldHasAction, hasAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableAccess getHasIndicatorVariable() {
		if (hasIndicatorVariable != null && hasIndicatorVariable.eIsProxy()) {
			InternalEObject oldHasIndicatorVariable = (InternalEObject)hasIndicatorVariable;
			hasIndicatorVariable = (VariableAccess)eResolveProxy(oldHasIndicatorVariable);
			if (hasIndicatorVariable != oldHasIndicatorVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SfcPackage.ACTION_ASSOCIATION__HAS_INDICATOR_VARIABLE, oldHasIndicatorVariable, hasIndicatorVariable));
			}
		}
		return hasIndicatorVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableAccess basicGetHasIndicatorVariable() {
		return hasIndicatorVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasIndicatorVariable(VariableAccess newHasIndicatorVariable) {
		VariableAccess oldHasIndicatorVariable = hasIndicatorVariable;
		hasIndicatorVariable = newHasIndicatorVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SfcPackage.ACTION_ASSOCIATION__HAS_INDICATOR_VARIABLE, oldHasIndicatorVariable, hasIndicatorVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionQualifier getHasActionQualifier() {
		if (hasActionQualifier != null && hasActionQualifier.eIsProxy()) {
			InternalEObject oldHasActionQualifier = (InternalEObject)hasActionQualifier;
			hasActionQualifier = (ActionQualifier)eResolveProxy(oldHasActionQualifier);
			if (hasActionQualifier != oldHasActionQualifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SfcPackage.ACTION_ASSOCIATION__HAS_ACTION_QUALIFIER, oldHasActionQualifier, hasActionQualifier));
			}
		}
		return hasActionQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionQualifier basicGetHasActionQualifier() {
		return hasActionQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasActionQualifier(ActionQualifier newHasActionQualifier) {
		ActionQualifier oldHasActionQualifier = hasActionQualifier;
		hasActionQualifier = newHasActionQualifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SfcPackage.ACTION_ASSOCIATION__HAS_ACTION_QUALIFIER, oldHasActionQualifier, hasActionQualifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SfcPackage.ACTION_ASSOCIATION__HAS_ACTION:
				if (resolve) return getHasAction();
				return basicGetHasAction();
			case SfcPackage.ACTION_ASSOCIATION__HAS_INDICATOR_VARIABLE:
				if (resolve) return getHasIndicatorVariable();
				return basicGetHasIndicatorVariable();
			case SfcPackage.ACTION_ASSOCIATION__HAS_ACTION_QUALIFIER:
				if (resolve) return getHasActionQualifier();
				return basicGetHasActionQualifier();
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
			case SfcPackage.ACTION_ASSOCIATION__HAS_ACTION:
				setHasAction((Action)newValue);
				return;
			case SfcPackage.ACTION_ASSOCIATION__HAS_INDICATOR_VARIABLE:
				setHasIndicatorVariable((VariableAccess)newValue);
				return;
			case SfcPackage.ACTION_ASSOCIATION__HAS_ACTION_QUALIFIER:
				setHasActionQualifier((ActionQualifier)newValue);
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
			case SfcPackage.ACTION_ASSOCIATION__HAS_ACTION:
				setHasAction((Action)null);
				return;
			case SfcPackage.ACTION_ASSOCIATION__HAS_INDICATOR_VARIABLE:
				setHasIndicatorVariable((VariableAccess)null);
				return;
			case SfcPackage.ACTION_ASSOCIATION__HAS_ACTION_QUALIFIER:
				setHasActionQualifier((ActionQualifier)null);
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
			case SfcPackage.ACTION_ASSOCIATION__HAS_ACTION:
				return hasAction != null;
			case SfcPackage.ACTION_ASSOCIATION__HAS_INDICATOR_VARIABLE:
				return hasIndicatorVariable != null;
			case SfcPackage.ACTION_ASSOCIATION__HAS_ACTION_QUALIFIER:
				return hasActionQualifier != null;
		}
		return super.eIsSet(featureID);
	}

} //ActionAssociationImpl
