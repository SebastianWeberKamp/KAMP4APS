/**
 */
package iec611313Specification.language.il.impl;

import iec611313Specification.common.pous.functions.impl.FunctionBodySpecificationImpl;

import iec611313Specification.language.il.IlPackage;
import iec611313Specification.language.il.Instruction;
import iec611313Specification.language.il.InstructionList;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instruction List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.language.il.impl.InstructionListImpl#getContainsInstruction <em>Contains Instruction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstructionListImpl extends FunctionBodySpecificationImpl implements InstructionList {
	/**
	 * The cached value of the '{@link #getContainsInstruction() <em>Contains Instruction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsInstruction()
	 * @generated
	 * @ordered
	 */
	protected EList<Instruction> containsInstruction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstructionListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IlPackage.Literals.INSTRUCTION_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Instruction> getContainsInstruction() {
		if (containsInstruction == null) {
			containsInstruction = new EObjectContainmentEList<Instruction>(Instruction.class, this, IlPackage.INSTRUCTION_LIST__CONTAINS_INSTRUCTION);
		}
		return containsInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IlPackage.INSTRUCTION_LIST__CONTAINS_INSTRUCTION:
				return ((InternalEList<?>)getContainsInstruction()).basicRemove(otherEnd, msgs);
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
			case IlPackage.INSTRUCTION_LIST__CONTAINS_INSTRUCTION:
				return getContainsInstruction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IlPackage.INSTRUCTION_LIST__CONTAINS_INSTRUCTION:
				getContainsInstruction().clear();
				getContainsInstruction().addAll((Collection<? extends Instruction>)newValue);
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
			case IlPackage.INSTRUCTION_LIST__CONTAINS_INSTRUCTION:
				getContainsInstruction().clear();
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
			case IlPackage.INSTRUCTION_LIST__CONTAINS_INSTRUCTION:
				return containsInstruction != null && !containsInstruction.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InstructionListImpl
