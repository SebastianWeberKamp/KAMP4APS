/**
 */
package iec611313Specification.language.il.impl;

import iec611313Specification.common.Label;

import iec611313Specification.language.il.IlPackage;
import iec611313Specification.language.il.JumpInstruction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jump Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.language.il.impl.JumpInstructionImpl#getHasJumpInstructionTarget <em>Has Jump Instruction Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JumpInstructionImpl extends InstructionImpl implements JumpInstruction {
	/**
	 * The cached value of the '{@link #getHasJumpInstructionTarget() <em>Has Jump Instruction Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasJumpInstructionTarget()
	 * @generated
	 * @ordered
	 */
	protected Label hasJumpInstructionTarget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JumpInstructionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IlPackage.Literals.JUMP_INSTRUCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label getHasJumpInstructionTarget() {
		if (hasJumpInstructionTarget != null && hasJumpInstructionTarget.eIsProxy()) {
			InternalEObject oldHasJumpInstructionTarget = (InternalEObject)hasJumpInstructionTarget;
			hasJumpInstructionTarget = (Label)eResolveProxy(oldHasJumpInstructionTarget);
			if (hasJumpInstructionTarget != oldHasJumpInstructionTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IlPackage.JUMP_INSTRUCTION__HAS_JUMP_INSTRUCTION_TARGET, oldHasJumpInstructionTarget, hasJumpInstructionTarget));
			}
		}
		return hasJumpInstructionTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label basicGetHasJumpInstructionTarget() {
		return hasJumpInstructionTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasJumpInstructionTarget(Label newHasJumpInstructionTarget) {
		Label oldHasJumpInstructionTarget = hasJumpInstructionTarget;
		hasJumpInstructionTarget = newHasJumpInstructionTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IlPackage.JUMP_INSTRUCTION__HAS_JUMP_INSTRUCTION_TARGET, oldHasJumpInstructionTarget, hasJumpInstructionTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IlPackage.JUMP_INSTRUCTION__HAS_JUMP_INSTRUCTION_TARGET:
				if (resolve) return getHasJumpInstructionTarget();
				return basicGetHasJumpInstructionTarget();
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
			case IlPackage.JUMP_INSTRUCTION__HAS_JUMP_INSTRUCTION_TARGET:
				setHasJumpInstructionTarget((Label)newValue);
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
			case IlPackage.JUMP_INSTRUCTION__HAS_JUMP_INSTRUCTION_TARGET:
				setHasJumpInstructionTarget((Label)null);
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
			case IlPackage.JUMP_INSTRUCTION__HAS_JUMP_INSTRUCTION_TARGET:
				return hasJumpInstructionTarget != null;
		}
		return super.eIsSet(featureID);
	}

} //JumpInstructionImpl
