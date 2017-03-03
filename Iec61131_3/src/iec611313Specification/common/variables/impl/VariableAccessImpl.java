/**
 */
package iec611313Specification.common.variables.impl;

import iec611313Specification.common.impl.ExpressionImpl;

import iec611313Specification.common.variables.VariableAccess;
import iec611313Specification.common.variables.VariableDeclaration;
import iec611313Specification.common.variables.VariablesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.common.variables.impl.VariableAccessImpl#getHasVariableDeclaration <em>Has Variable Declaration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableAccessImpl extends ExpressionImpl implements VariableAccess {
	/**
	 * The cached value of the '{@link #getHasVariableDeclaration() <em>Has Variable Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasVariableDeclaration()
	 * @generated
	 * @ordered
	 */
	protected VariableDeclaration hasVariableDeclaration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableAccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VariablesPackage.Literals.VARIABLE_ACCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclaration getHasVariableDeclaration() {
		if (hasVariableDeclaration != null && hasVariableDeclaration.eIsProxy()) {
			InternalEObject oldHasVariableDeclaration = (InternalEObject)hasVariableDeclaration;
			hasVariableDeclaration = (VariableDeclaration)eResolveProxy(oldHasVariableDeclaration);
			if (hasVariableDeclaration != oldHasVariableDeclaration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VariablesPackage.VARIABLE_ACCESS__HAS_VARIABLE_DECLARATION, oldHasVariableDeclaration, hasVariableDeclaration));
			}
		}
		return hasVariableDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclaration basicGetHasVariableDeclaration() {
		return hasVariableDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasVariableDeclaration(VariableDeclaration newHasVariableDeclaration) {
		VariableDeclaration oldHasVariableDeclaration = hasVariableDeclaration;
		hasVariableDeclaration = newHasVariableDeclaration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariablesPackage.VARIABLE_ACCESS__HAS_VARIABLE_DECLARATION, oldHasVariableDeclaration, hasVariableDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VariablesPackage.VARIABLE_ACCESS__HAS_VARIABLE_DECLARATION:
				if (resolve) return getHasVariableDeclaration();
				return basicGetHasVariableDeclaration();
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
			case VariablesPackage.VARIABLE_ACCESS__HAS_VARIABLE_DECLARATION:
				setHasVariableDeclaration((VariableDeclaration)newValue);
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
			case VariablesPackage.VARIABLE_ACCESS__HAS_VARIABLE_DECLARATION:
				setHasVariableDeclaration((VariableDeclaration)null);
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
			case VariablesPackage.VARIABLE_ACCESS__HAS_VARIABLE_DECLARATION:
				return hasVariableDeclaration != null;
		}
		return super.eIsSet(featureID);
	}

} //VariableAccessImpl
