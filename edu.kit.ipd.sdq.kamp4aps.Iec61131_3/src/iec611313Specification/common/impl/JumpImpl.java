/**
 */
package iec611313Specification.common.impl;

import iec611313Specification.common.CommonPackage;
import iec611313Specification.common.Jump;
import iec611313Specification.common.Label;

import iec611313Specification.language.fbd.impl.SignalSinkImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jump</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.common.impl.JumpImpl#getHasJumpTarget <em>Has Jump Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JumpImpl extends SignalSinkImpl implements Jump {
	/**
	 * The cached value of the '{@link #getHasJumpTarget() <em>Has Jump Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasJumpTarget()
	 * @generated
	 * @ordered
	 */
	protected Label hasJumpTarget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JumpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.JUMP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label getHasJumpTarget() {
		if (hasJumpTarget != null && hasJumpTarget.eIsProxy()) {
			InternalEObject oldHasJumpTarget = (InternalEObject)hasJumpTarget;
			hasJumpTarget = (Label)eResolveProxy(oldHasJumpTarget);
			if (hasJumpTarget != oldHasJumpTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.JUMP__HAS_JUMP_TARGET, oldHasJumpTarget, hasJumpTarget));
			}
		}
		return hasJumpTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label basicGetHasJumpTarget() {
		return hasJumpTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasJumpTarget(Label newHasJumpTarget) {
		Label oldHasJumpTarget = hasJumpTarget;
		hasJumpTarget = newHasJumpTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.JUMP__HAS_JUMP_TARGET, oldHasJumpTarget, hasJumpTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommonPackage.JUMP__HAS_JUMP_TARGET:
				if (resolve) return getHasJumpTarget();
				return basicGetHasJumpTarget();
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
			case CommonPackage.JUMP__HAS_JUMP_TARGET:
				setHasJumpTarget((Label)newValue);
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
			case CommonPackage.JUMP__HAS_JUMP_TARGET:
				setHasJumpTarget((Label)null);
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
			case CommonPackage.JUMP__HAS_JUMP_TARGET:
				return hasJumpTarget != null;
		}
		return super.eIsSet(featureID);
	}

} //JumpImpl
