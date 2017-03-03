/**
 */
package iec611313Specification.common.pous.function_blocks.impl;

import iec611313Specification.common.Label;
import iec611313Specification.common.ParameterList;

import iec611313Specification.common.pous.function_blocks.FunctionBlockInvocation;
import iec611313Specification.common.pous.function_blocks.Function_blocksPackage;

import iec611313Specification.common.variables.VariableAccess;

import iec611313Specification.language.fbd.FBDElement;

import iec611313Specification.language.il.IlPackage;
import iec611313Specification.language.il.Instruction;

import iec611313Specification.language.st.impl.StatementImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Block Invocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.common.pous.function_blocks.impl.FunctionBlockInvocationImpl#getHasInstructionLabel <em>Has Instruction Label</em>}</li>
 *   <li>{@link iec611313Specification.common.pous.function_blocks.impl.FunctionBlockInvocationImpl#getInvokesFunBlockInstance <em>Invokes Fun Block Instance</em>}</li>
 *   <li>{@link iec611313Specification.common.pous.function_blocks.impl.FunctionBlockInvocationImpl#getHasFunBlockInvocationParamList <em>Has Fun Block Invocation Param List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionBlockInvocationImpl extends StatementImpl implements FunctionBlockInvocation {
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
	 * The cached value of the '{@link #getInvokesFunBlockInstance() <em>Invokes Fun Block Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvokesFunBlockInstance()
	 * @generated
	 * @ordered
	 */
	protected VariableAccess invokesFunBlockInstance;

	/**
	 * The cached value of the '{@link #getHasFunBlockInvocationParamList() <em>Has Fun Block Invocation Param List</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasFunBlockInvocationParamList()
	 * @generated
	 * @ordered
	 */
	protected ParameterList hasFunBlockInvocationParamList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionBlockInvocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Function_blocksPackage.Literals.FUNCTION_BLOCK_INVOCATION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Function_blocksPackage.FUNCTION_BLOCK_INVOCATION__HAS_INSTRUCTION_LABEL, oldHasInstructionLabel, hasInstructionLabel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Function_blocksPackage.FUNCTION_BLOCK_INVOCATION__HAS_INSTRUCTION_LABEL, oldHasInstructionLabel, hasInstructionLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableAccess getInvokesFunBlockInstance() {
		if (invokesFunBlockInstance != null && invokesFunBlockInstance.eIsProxy()) {
			InternalEObject oldInvokesFunBlockInstance = (InternalEObject)invokesFunBlockInstance;
			invokesFunBlockInstance = (VariableAccess)eResolveProxy(oldInvokesFunBlockInstance);
			if (invokesFunBlockInstance != oldInvokesFunBlockInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Function_blocksPackage.FUNCTION_BLOCK_INVOCATION__INVOKES_FUN_BLOCK_INSTANCE, oldInvokesFunBlockInstance, invokesFunBlockInstance));
			}
		}
		return invokesFunBlockInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableAccess basicGetInvokesFunBlockInstance() {
		return invokesFunBlockInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvokesFunBlockInstance(VariableAccess newInvokesFunBlockInstance) {
		VariableAccess oldInvokesFunBlockInstance = invokesFunBlockInstance;
		invokesFunBlockInstance = newInvokesFunBlockInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Function_blocksPackage.FUNCTION_BLOCK_INVOCATION__INVOKES_FUN_BLOCK_INSTANCE, oldInvokesFunBlockInstance, invokesFunBlockInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterList getHasFunBlockInvocationParamList() {
		if (hasFunBlockInvocationParamList != null && hasFunBlockInvocationParamList.eIsProxy()) {
			InternalEObject oldHasFunBlockInvocationParamList = (InternalEObject)hasFunBlockInvocationParamList;
			hasFunBlockInvocationParamList = (ParameterList)eResolveProxy(oldHasFunBlockInvocationParamList);
			if (hasFunBlockInvocationParamList != oldHasFunBlockInvocationParamList) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Function_blocksPackage.FUNCTION_BLOCK_INVOCATION__HAS_FUN_BLOCK_INVOCATION_PARAM_LIST, oldHasFunBlockInvocationParamList, hasFunBlockInvocationParamList));
			}
		}
		return hasFunBlockInvocationParamList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterList basicGetHasFunBlockInvocationParamList() {
		return hasFunBlockInvocationParamList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasFunBlockInvocationParamList(ParameterList newHasFunBlockInvocationParamList) {
		ParameterList oldHasFunBlockInvocationParamList = hasFunBlockInvocationParamList;
		hasFunBlockInvocationParamList = newHasFunBlockInvocationParamList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Function_blocksPackage.FUNCTION_BLOCK_INVOCATION__HAS_FUN_BLOCK_INVOCATION_PARAM_LIST, oldHasFunBlockInvocationParamList, hasFunBlockInvocationParamList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Function_blocksPackage.FUNCTION_BLOCK_INVOCATION__HAS_INSTRUCTION_LABEL:
				if (resolve) return getHasInstructionLabel();
				return basicGetHasInstructionLabel();
			case Function_blocksPackage.FUNCTION_BLOCK_INVOCATION__INVOKES_FUN_BLOCK_INSTANCE:
				if (resolve) return getInvokesFunBlockInstance();
				return basicGetInvokesFunBlockInstance();
			case Function_blocksPackage.FUNCTION_BLOCK_INVOCATION__HAS_FUN_BLOCK_INVOCATION_PARAM_LIST:
				if (resolve) return getHasFunBlockInvocationParamList();
				return basicGetHasFunBlockInvocationParamList();
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
			case Function_blocksPackage.FUNCTION_BLOCK_INVOCATION__HAS_INSTRUCTION_LABEL:
				setHasInstructionLabel((Label)newValue);
				return;
			case Function_blocksPackage.FUNCTION_BLOCK_INVOCATION__INVOKES_FUN_BLOCK_INSTANCE:
				setInvokesFunBlockInstance((VariableAccess)newValue);
				return;
			case Function_blocksPackage.FUNCTION_BLOCK_INVOCATION__HAS_FUN_BLOCK_INVOCATION_PARAM_LIST:
				setHasFunBlockInvocationParamList((ParameterList)newValue);
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
			case Function_blocksPackage.FUNCTION_BLOCK_INVOCATION__HAS_INSTRUCTION_LABEL:
				setHasInstructionLabel((Label)null);
				return;
			case Function_blocksPackage.FUNCTION_BLOCK_INVOCATION__INVOKES_FUN_BLOCK_INSTANCE:
				setInvokesFunBlockInstance((VariableAccess)null);
				return;
			case Function_blocksPackage.FUNCTION_BLOCK_INVOCATION__HAS_FUN_BLOCK_INVOCATION_PARAM_LIST:
				setHasFunBlockInvocationParamList((ParameterList)null);
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
			case Function_blocksPackage.FUNCTION_BLOCK_INVOCATION__HAS_INSTRUCTION_LABEL:
				return hasInstructionLabel != null;
			case Function_blocksPackage.FUNCTION_BLOCK_INVOCATION__INVOKES_FUN_BLOCK_INSTANCE:
				return invokesFunBlockInstance != null;
			case Function_blocksPackage.FUNCTION_BLOCK_INVOCATION__HAS_FUN_BLOCK_INVOCATION_PARAM_LIST:
				return hasFunBlockInvocationParamList != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Instruction.class) {
			switch (derivedFeatureID) {
				case Function_blocksPackage.FUNCTION_BLOCK_INVOCATION__HAS_INSTRUCTION_LABEL: return IlPackage.INSTRUCTION__HAS_INSTRUCTION_LABEL;
				default: return -1;
			}
		}
		if (baseClass == FBDElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Instruction.class) {
			switch (baseFeatureID) {
				case IlPackage.INSTRUCTION__HAS_INSTRUCTION_LABEL: return Function_blocksPackage.FUNCTION_BLOCK_INVOCATION__HAS_INSTRUCTION_LABEL;
				default: return -1;
			}
		}
		if (baseClass == FBDElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //FunctionBlockInvocationImpl
