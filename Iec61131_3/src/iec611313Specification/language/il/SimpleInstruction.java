/**
 */
package iec611313Specification.language.il;

import iec611313Specification.common.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.language.il.SimpleInstruction#getOperator <em>Operator</em>}</li>
 *   <li>{@link iec611313Specification.language.il.SimpleInstruction#getHasOperand <em>Has Operand</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.language.il.IlPackage#getSimpleInstruction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='hasValidOperand'"
 * @generated
 */
public interface SimpleInstruction extends Instruction {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see #setOperator(String)
	 * @see iec611313Specification.language.il.IlPackage#getSimpleInstruction_Operator()
	 * @model required="true"
	 * @generated
	 */
	String getOperator();

	/**
	 * Sets the value of the '{@link iec611313Specification.language.il.SimpleInstruction#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(String value);

	/**
	 * Returns the value of the '<em><b>Has Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Operand</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Operand</em>' reference.
	 * @see #setHasOperand(Expression)
	 * @see iec611313Specification.language.il.IlPackage#getSimpleInstruction_HasOperand()
	 * @model required="true"
	 * @generated
	 */
	Expression getHasOperand();

	/**
	 * Sets the value of the '{@link iec611313Specification.language.il.SimpleInstruction#getHasOperand <em>Has Operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Operand</em>' reference.
	 * @see #getHasOperand()
	 * @generated
	 */
	void setHasOperand(Expression value);

} // SimpleInstruction
