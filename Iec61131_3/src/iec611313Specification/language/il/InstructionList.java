/**
 */
package iec611313Specification.language.il;

import iec611313Specification.common.pous.function_blocks.FunctionBlockBodySpecification;

import iec611313Specification.common.pous.functions.FunctionBodySpecification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.language.il.InstructionList#getContainsInstruction <em>Contains Instruction</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.language.il.IlPackage#getInstructionList()
 * @model
 * @generated
 */
public interface InstructionList extends FunctionBodySpecification, FunctionBlockBodySpecification {
	/**
	 * Returns the value of the '<em><b>Contains Instruction</b></em>' containment reference list.
	 * The list contents are of type {@link iec611313Specification.language.il.Instruction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Instruction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Instruction</em>' containment reference list.
	 * @see iec611313Specification.language.il.IlPackage#getInstructionList_ContainsInstruction()
	 * @model containment="true"
	 * @generated
	 */
	EList<Instruction> getContainsInstruction();

} // InstructionList
