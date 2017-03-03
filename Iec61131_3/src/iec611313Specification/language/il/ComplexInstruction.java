/**
 */
package iec611313Specification.language.il;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.language.il.ComplexInstruction#getOperator <em>Operator</em>}</li>
 *   <li>{@link iec611313Specification.language.il.ComplexInstruction#getHasComplexOperand <em>Has Complex Operand</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.language.il.IlPackage#getComplexInstruction()
 * @model
 * @generated
 */
public interface ComplexInstruction extends Instruction {
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
	 * @see iec611313Specification.language.il.IlPackage#getComplexInstruction_Operator()
	 * @model required="true"
	 * @generated
	 */
	String getOperator();

	/**
	 * Sets the value of the '{@link iec611313Specification.language.il.ComplexInstruction#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(String value);

	/**
	 * Returns the value of the '<em><b>Has Complex Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Complex Operand</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Complex Operand</em>' reference.
	 * @see #setHasComplexOperand(InstructionList)
	 * @see iec611313Specification.language.il.IlPackage#getComplexInstruction_HasComplexOperand()
	 * @model required="true"
	 * @generated
	 */
	InstructionList getHasComplexOperand();

	/**
	 * Sets the value of the '{@link iec611313Specification.language.il.ComplexInstruction#getHasComplexOperand <em>Has Complex Operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Complex Operand</em>' reference.
	 * @see #getHasComplexOperand()
	 * @generated
	 */
	void setHasComplexOperand(InstructionList value);

} // ComplexInstruction
