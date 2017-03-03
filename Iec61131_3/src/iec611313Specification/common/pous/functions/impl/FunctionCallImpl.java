/**
 */
package iec611313Specification.common.pous.functions.impl;

import iec611313Specification.common.Label;
import iec611313Specification.common.ParameterList;

import iec611313Specification.common.impl.ExpressionImpl;

import iec611313Specification.common.pous.functions.Function;
import iec611313Specification.common.pous.functions.FunctionCall;
import iec611313Specification.common.pous.functions.FunctionsPackage;

import iec611313Specification.language.fbd.FBDElement;

import iec611313Specification.language.il.IlPackage;
import iec611313Specification.language.il.Instruction;

import iec611313Specification.language.ld.LDElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.common.pous.functions.impl.FunctionCallImpl#getHasInstructionLabel <em>Has Instruction Label</em>}</li>
 *   <li>{@link iec611313Specification.common.pous.functions.impl.FunctionCallImpl#getCallsFunction <em>Calls Function</em>}</li>
 *   <li>{@link iec611313Specification.common.pous.functions.impl.FunctionCallImpl#getHasFunCallParamList <em>Has Fun Call Param List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionCallImpl extends ExpressionImpl implements FunctionCall {
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
	 * The cached value of the '{@link #getCallsFunction() <em>Calls Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallsFunction()
	 * @generated
	 * @ordered
	 */
	protected Function callsFunction;

	/**
	 * The cached value of the '{@link #getHasFunCallParamList() <em>Has Fun Call Param List</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasFunCallParamList()
	 * @generated
	 * @ordered
	 */
	protected ParameterList hasFunCallParamList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionsPackage.Literals.FUNCTION_CALL;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FunctionsPackage.FUNCTION_CALL__HAS_INSTRUCTION_LABEL, oldHasInstructionLabel, hasInstructionLabel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.FUNCTION_CALL__HAS_INSTRUCTION_LABEL, oldHasInstructionLabel, hasInstructionLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function getCallsFunction() {
		if (callsFunction != null && callsFunction.eIsProxy()) {
			InternalEObject oldCallsFunction = (InternalEObject)callsFunction;
			callsFunction = (Function)eResolveProxy(oldCallsFunction);
			if (callsFunction != oldCallsFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FunctionsPackage.FUNCTION_CALL__CALLS_FUNCTION, oldCallsFunction, callsFunction));
			}
		}
		return callsFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function basicGetCallsFunction() {
		return callsFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallsFunction(Function newCallsFunction) {
		Function oldCallsFunction = callsFunction;
		callsFunction = newCallsFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.FUNCTION_CALL__CALLS_FUNCTION, oldCallsFunction, callsFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterList getHasFunCallParamList() {
		if (hasFunCallParamList != null && hasFunCallParamList.eIsProxy()) {
			InternalEObject oldHasFunCallParamList = (InternalEObject)hasFunCallParamList;
			hasFunCallParamList = (ParameterList)eResolveProxy(oldHasFunCallParamList);
			if (hasFunCallParamList != oldHasFunCallParamList) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FunctionsPackage.FUNCTION_CALL__HAS_FUN_CALL_PARAM_LIST, oldHasFunCallParamList, hasFunCallParamList));
			}
		}
		return hasFunCallParamList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterList basicGetHasFunCallParamList() {
		return hasFunCallParamList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasFunCallParamList(ParameterList newHasFunCallParamList) {
		ParameterList oldHasFunCallParamList = hasFunCallParamList;
		hasFunCallParamList = newHasFunCallParamList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.FUNCTION_CALL__HAS_FUN_CALL_PARAM_LIST, oldHasFunCallParamList, hasFunCallParamList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FunctionsPackage.FUNCTION_CALL__HAS_INSTRUCTION_LABEL:
				if (resolve) return getHasInstructionLabel();
				return basicGetHasInstructionLabel();
			case FunctionsPackage.FUNCTION_CALL__CALLS_FUNCTION:
				if (resolve) return getCallsFunction();
				return basicGetCallsFunction();
			case FunctionsPackage.FUNCTION_CALL__HAS_FUN_CALL_PARAM_LIST:
				if (resolve) return getHasFunCallParamList();
				return basicGetHasFunCallParamList();
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
			case FunctionsPackage.FUNCTION_CALL__HAS_INSTRUCTION_LABEL:
				setHasInstructionLabel((Label)newValue);
				return;
			case FunctionsPackage.FUNCTION_CALL__CALLS_FUNCTION:
				setCallsFunction((Function)newValue);
				return;
			case FunctionsPackage.FUNCTION_CALL__HAS_FUN_CALL_PARAM_LIST:
				setHasFunCallParamList((ParameterList)newValue);
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
			case FunctionsPackage.FUNCTION_CALL__HAS_INSTRUCTION_LABEL:
				setHasInstructionLabel((Label)null);
				return;
			case FunctionsPackage.FUNCTION_CALL__CALLS_FUNCTION:
				setCallsFunction((Function)null);
				return;
			case FunctionsPackage.FUNCTION_CALL__HAS_FUN_CALL_PARAM_LIST:
				setHasFunCallParamList((ParameterList)null);
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
			case FunctionsPackage.FUNCTION_CALL__HAS_INSTRUCTION_LABEL:
				return hasInstructionLabel != null;
			case FunctionsPackage.FUNCTION_CALL__CALLS_FUNCTION:
				return callsFunction != null;
			case FunctionsPackage.FUNCTION_CALL__HAS_FUN_CALL_PARAM_LIST:
				return hasFunCallParamList != null;
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
				case FunctionsPackage.FUNCTION_CALL__HAS_INSTRUCTION_LABEL: return IlPackage.INSTRUCTION__HAS_INSTRUCTION_LABEL;
				default: return -1;
			}
		}
		if (baseClass == FBDElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == LDElement.class) {
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
				case IlPackage.INSTRUCTION__HAS_INSTRUCTION_LABEL: return FunctionsPackage.FUNCTION_CALL__HAS_INSTRUCTION_LABEL;
				default: return -1;
			}
		}
		if (baseClass == FBDElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == LDElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //FunctionCallImpl
