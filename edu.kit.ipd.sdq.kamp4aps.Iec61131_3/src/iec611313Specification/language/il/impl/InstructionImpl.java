/**
 */
package iec611313Specification.language.il.impl;

import iec611313Specification.common.Label;

import iec611313Specification.language.il.IlPackage;
import iec611313Specification.language.il.Instruction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.language.il.impl.InstructionImpl#getHasInstructionLabel <em>Has Instruction Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InstructionImpl extends MinimalEObjectImpl.Container implements Instruction {
	/**
	 * The cached value of the '{@link #getHasInstructionLabel() <em>Has Instruction Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasInstructionLabel()
	 * @generated
	 * @ordered
	 */
	protected Label hasInstructionLabel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstructionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IlPackage.Literals.INSTRUCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label getHasInstructionLabel() {
		if (hasInstructionLabel != null && hasInstructionLabel.eIsProxy()) {
			InternalEObject oldHasInstructionLabel = (InternalEObject)hasInstructionLabel;
			hasInstructionLabel = (Label)eResolveProxy(oldHasInstructionLabel);
			if (hasInstructionLabel != oldHasInstructionLabel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IlPackage.INSTRUCTION__HAS_INSTRUCTION_LABEL, oldHasInstructionLabel, hasInstructionLabel));
			}
		}
		return hasInstructionLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label basicGetHasInstructionLabel() {
		return hasInstructionLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasInstructionLabel(Label newHasInstructionLabel) {
		Label oldHasInstructionLabel = hasInstructionLabel;
		hasInstructionLabel = newHasInstructionLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IlPackage.INSTRUCTION__HAS_INSTRUCTION_LABEL, oldHasInstructionLabel, hasInstructionLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IlPackage.INSTRUCTION__HAS_INSTRUCTION_LABEL:
				if (resolve) return getHasInstructionLabel();
				return basicGetHasInstructionLabel();
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
			case IlPackage.INSTRUCTION__HAS_INSTRUCTION_LABEL:
				setHasInstructionLabel((Label)newValue);
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
			case IlPackage.INSTRUCTION__HAS_INSTRUCTION_LABEL:
				setHasInstructionLabel((Label)null);
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
			case IlPackage.INSTRUCTION__HAS_INSTRUCTION_LABEL:
				return hasInstructionLabel != null;
		}
		return super.eIsSet(featureID);
	}

} //InstructionImpl
