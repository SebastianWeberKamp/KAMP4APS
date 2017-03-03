/**
 */
package iec611313Specification.language.il;

import iec611313Specification.common.Label;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.language.il.Instruction#getHasInstructionLabel <em>Has Instruction Label</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.language.il.IlPackage#getInstruction()
 * @model abstract="true"
 * @generated
 */
public interface Instruction extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Instruction Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Instruction Label</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Instruction Label</em>' reference.
	 * @see #setHasInstructionLabel(Label)
	 * @see iec611313Specification.language.il.IlPackage#getInstruction_HasInstructionLabel()
	 * @model
	 * @generated
	 */
	Label getHasInstructionLabel();

	/**
	 * Sets the value of the '{@link iec611313Specification.language.il.Instruction#getHasInstructionLabel <em>Has Instruction Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Instruction Label</em>' reference.
	 * @see #getHasInstructionLabel()
	 * @generated
	 */
	void setHasInstructionLabel(Label value);

} // Instruction
