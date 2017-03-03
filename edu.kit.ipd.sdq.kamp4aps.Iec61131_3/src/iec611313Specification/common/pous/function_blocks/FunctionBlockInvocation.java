/**
 */
package iec611313Specification.common.pous.function_blocks;

import iec611313Specification.common.ParameterList;

import iec611313Specification.common.variables.VariableAccess;

import iec611313Specification.language.fbd.FBDElement;

import iec611313Specification.language.il.Instruction;

import iec611313Specification.language.st.Statement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Block Invocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.common.pous.function_blocks.FunctionBlockInvocation#getInvokesFunBlockInstance <em>Invokes Fun Block Instance</em>}</li>
 *   <li>{@link iec611313Specification.common.pous.function_blocks.FunctionBlockInvocation#getHasFunBlockInvocationParamList <em>Has Fun Block Invocation Param List</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.common.pous.function_blocks.Function_blocksPackage#getFunctionBlockInvocation()
 * @model
 * @generated
 */
public interface FunctionBlockInvocation extends Statement, Instruction, FBDElement {
	/**
	 * Returns the value of the '<em><b>Invokes Fun Block Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invokes Fun Block Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invokes Fun Block Instance</em>' reference.
	 * @see #setInvokesFunBlockInstance(VariableAccess)
	 * @see iec611313Specification.common.pous.function_blocks.Function_blocksPackage#getFunctionBlockInvocation_InvokesFunBlockInstance()
	 * @model required="true"
	 * @generated
	 */
	VariableAccess getInvokesFunBlockInstance();

	/**
	 * Sets the value of the '{@link iec611313Specification.common.pous.function_blocks.FunctionBlockInvocation#getInvokesFunBlockInstance <em>Invokes Fun Block Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invokes Fun Block Instance</em>' reference.
	 * @see #getInvokesFunBlockInstance()
	 * @generated
	 */
	void setInvokesFunBlockInstance(VariableAccess value);

	/**
	 * Returns the value of the '<em><b>Has Fun Block Invocation Param List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Fun Block Invocation Param List</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Fun Block Invocation Param List</em>' reference.
	 * @see #setHasFunBlockInvocationParamList(ParameterList)
	 * @see iec611313Specification.common.pous.function_blocks.Function_blocksPackage#getFunctionBlockInvocation_HasFunBlockInvocationParamList()
	 * @model required="true"
	 * @generated
	 */
	ParameterList getHasFunBlockInvocationParamList();

	/**
	 * Sets the value of the '{@link iec611313Specification.common.pous.function_blocks.FunctionBlockInvocation#getHasFunBlockInvocationParamList <em>Has Fun Block Invocation Param List</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Fun Block Invocation Param List</em>' reference.
	 * @see #getHasFunBlockInvocationParamList()
	 * @generated
	 */
	void setHasFunBlockInvocationParamList(ParameterList value);

} // FunctionBlockInvocation
