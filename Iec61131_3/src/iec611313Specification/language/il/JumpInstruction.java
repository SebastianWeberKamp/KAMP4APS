/**
 */
package iec611313Specification.language.il;

import iec611313Specification.common.Label;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jump Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.language.il.JumpInstruction#getHasJumpInstructionTarget <em>Has Jump Instruction Target</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.language.il.IlPackage#getJumpInstruction()
 * @model
 * @generated
 */
public interface JumpInstruction extends Instruction {
	/**
	 * Returns the value of the '<em><b>Has Jump Instruction Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Jump Instruction Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Jump Instruction Target</em>' reference.
	 * @see #setHasJumpInstructionTarget(Label)
	 * @see iec611313Specification.language.il.IlPackage#getJumpInstruction_HasJumpInstructionTarget()
	 * @model required="true"
	 * @generated
	 */
	Label getHasJumpInstructionTarget();

	/**
	 * Sets the value of the '{@link iec611313Specification.language.il.JumpInstruction#getHasJumpInstructionTarget <em>Has Jump Instruction Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Jump Instruction Target</em>' reference.
	 * @see #getHasJumpInstructionTarget()
	 * @generated
	 */
	void setHasJumpInstructionTarget(Label value);

} // JumpInstruction
