/**
 */
package iec611313Specification.language.ld.impl;

import iec611313Specification.common.variables.VariableAccess;

import iec611313Specification.language.ld.LDNode;
import iec611313Specification.language.ld.LdPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LD Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.language.ld.impl.LDNodeImpl#getHasLDNodeVariable <em>Has LD Node Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class LDNodeImpl extends LDElementImpl implements LDNode {
	/**
	 * The cached value of the '{@link #getHasLDNodeVariable() <em>Has LD Node Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasLDNodeVariable()
	 * @generated
	 * @ordered
	 */
	protected VariableAccess hasLDNodeVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LDNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LdPackage.Literals.LD_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableAccess getHasLDNodeVariable() {
		if (hasLDNodeVariable != null && hasLDNodeVariable.eIsProxy()) {
			InternalEObject oldHasLDNodeVariable = (InternalEObject)hasLDNodeVariable;
			hasLDNodeVariable = (VariableAccess)eResolveProxy(oldHasLDNodeVariable);
			if (hasLDNodeVariable != oldHasLDNodeVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LdPackage.LD_NODE__HAS_LD_NODE_VARIABLE, oldHasLDNodeVariable, hasLDNodeVariable));
			}
		}
		return hasLDNodeVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableAccess basicGetHasLDNodeVariable() {
		return hasLDNodeVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasLDNodeVariable(VariableAccess newHasLDNodeVariable) {
		VariableAccess oldHasLDNodeVariable = hasLDNodeVariable;
		hasLDNodeVariable = newHasLDNodeVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LdPackage.LD_NODE__HAS_LD_NODE_VARIABLE, oldHasLDNodeVariable, hasLDNodeVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LdPackage.LD_NODE__HAS_LD_NODE_VARIABLE:
				if (resolve) return getHasLDNodeVariable();
				return basicGetHasLDNodeVariable();
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
			case LdPackage.LD_NODE__HAS_LD_NODE_VARIABLE:
				setHasLDNodeVariable((VariableAccess)newValue);
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
			case LdPackage.LD_NODE__HAS_LD_NODE_VARIABLE:
				setHasLDNodeVariable((VariableAccess)null);
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
			case LdPackage.LD_NODE__HAS_LD_NODE_VARIABLE:
				return hasLDNodeVariable != null;
		}
		return super.eIsSet(featureID);
	}

} //LDNodeImpl
