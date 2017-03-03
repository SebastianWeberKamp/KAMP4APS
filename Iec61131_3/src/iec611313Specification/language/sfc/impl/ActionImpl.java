/**
 */
package iec611313Specification.language.sfc.impl;

import iec611313Specification.common.pous.function_blocks.FunctionBlockBodySpecification;

import iec611313Specification.language.sfc.Action;
import iec611313Specification.language.sfc.SfcPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.language.sfc.impl.ActionImpl#getHasActionSpec <em>Has Action Spec</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends MinimalEObjectImpl.Container implements Action {
	/**
	 * The cached value of the '{@link #getHasActionSpec() <em>Has Action Spec</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasActionSpec()
	 * @generated
	 * @ordered
	 */
	protected FunctionBlockBodySpecification hasActionSpec;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SfcPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBlockBodySpecification getHasActionSpec() {
		if (hasActionSpec != null && hasActionSpec.eIsProxy()) {
			InternalEObject oldHasActionSpec = (InternalEObject)hasActionSpec;
			hasActionSpec = (FunctionBlockBodySpecification)eResolveProxy(oldHasActionSpec);
			if (hasActionSpec != oldHasActionSpec) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SfcPackage.ACTION__HAS_ACTION_SPEC, oldHasActionSpec, hasActionSpec));
			}
		}
		return hasActionSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBlockBodySpecification basicGetHasActionSpec() {
		return hasActionSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasActionSpec(FunctionBlockBodySpecification newHasActionSpec) {
		FunctionBlockBodySpecification oldHasActionSpec = hasActionSpec;
		hasActionSpec = newHasActionSpec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SfcPackage.ACTION__HAS_ACTION_SPEC, oldHasActionSpec, hasActionSpec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SfcPackage.ACTION__HAS_ACTION_SPEC:
				if (resolve) return getHasActionSpec();
				return basicGetHasActionSpec();
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
			case SfcPackage.ACTION__HAS_ACTION_SPEC:
				setHasActionSpec((FunctionBlockBodySpecification)newValue);
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
			case SfcPackage.ACTION__HAS_ACTION_SPEC:
				setHasActionSpec((FunctionBlockBodySpecification)null);
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
			case SfcPackage.ACTION__HAS_ACTION_SPEC:
				return hasActionSpec != null;
		}
		return super.eIsSet(featureID);
	}

} //ActionImpl
