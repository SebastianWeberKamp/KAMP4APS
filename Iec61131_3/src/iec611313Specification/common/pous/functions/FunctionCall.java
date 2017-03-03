/**
 */
package iec611313Specification.common.pous.functions;

import iec611313Specification.common.Expression;
import iec611313Specification.common.ParameterList;

import iec611313Specification.language.fbd.FBDElement;

import iec611313Specification.language.il.Instruction;

import iec611313Specification.language.ld.LDElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.common.pous.functions.FunctionCall#getCallsFunction <em>Calls Function</em>}</li>
 *   <li>{@link iec611313Specification.common.pous.functions.FunctionCall#getHasFunCallParamList <em>Has Fun Call Param List</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.common.pous.functions.FunctionsPackage#getFunctionCall()
 * @model
 * @generated
 */
public interface FunctionCall extends Expression, Instruction, FBDElement, LDElement {
	/**
	 * Returns the value of the '<em><b>Calls Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calls Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calls Function</em>' reference.
	 * @see #setCallsFunction(Function)
	 * @see iec611313Specification.common.pous.functions.FunctionsPackage#getFunctionCall_CallsFunction()
	 * @model required="true"
	 * @generated
	 */
	Function getCallsFunction();

	/**
	 * Sets the value of the '{@link iec611313Specification.common.pous.functions.FunctionCall#getCallsFunction <em>Calls Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calls Function</em>' reference.
	 * @see #getCallsFunction()
	 * @generated
	 */
	void setCallsFunction(Function value);

	/**
	 * Returns the value of the '<em><b>Has Fun Call Param List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Fun Call Param List</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Fun Call Param List</em>' reference.
	 * @see #setHasFunCallParamList(ParameterList)
	 * @see iec611313Specification.common.pous.functions.FunctionsPackage#getFunctionCall_HasFunCallParamList()
	 * @model required="true"
	 * @generated
	 */
	ParameterList getHasFunCallParamList();

	/**
	 * Sets the value of the '{@link iec611313Specification.common.pous.functions.FunctionCall#getHasFunCallParamList <em>Has Fun Call Param List</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Fun Call Param List</em>' reference.
	 * @see #getHasFunCallParamList()
	 * @generated
	 */
	void setHasFunCallParamList(ParameterList value);

} // FunctionCall
