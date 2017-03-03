/**
 */
package iec611313Specification.common.pous.programs;

import iec611313Specification.common.pous.function_blocks.FunctionBlockBodySpecification;

import iec611313Specification.common.variables.VariableDeclaration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.common.pous.programs.ProgramType#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link iec611313Specification.common.pous.programs.ProgramType#getHasProgramBodySpec <em>Has Program Body Spec</em>}</li>
 *   <li>{@link iec611313Specification.common.pous.programs.ProgramType#getContainsProgramVarDecl <em>Contains Program Var Decl</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.common.pous.programs.ProgramsPackage#getProgramType()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='hasValidVariableDeclaration'"
 * @generated
 */
public interface ProgramType extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Name</em>' attribute.
	 * @see #setTypeName(String)
	 * @see iec611313Specification.common.pous.programs.ProgramsPackage#getProgramType_TypeName()
	 * @model required="true"
	 * @generated
	 */
	String getTypeName();

	/**
	 * Sets the value of the '{@link iec611313Specification.common.pous.programs.ProgramType#getTypeName <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' attribute.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Has Program Body Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Program Body Spec</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Program Body Spec</em>' containment reference.
	 * @see #setHasProgramBodySpec(FunctionBlockBodySpecification)
	 * @see iec611313Specification.common.pous.programs.ProgramsPackage#getProgramType_HasProgramBodySpec()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FunctionBlockBodySpecification getHasProgramBodySpec();

	/**
	 * Sets the value of the '{@link iec611313Specification.common.pous.programs.ProgramType#getHasProgramBodySpec <em>Has Program Body Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Program Body Spec</em>' containment reference.
	 * @see #getHasProgramBodySpec()
	 * @generated
	 */
	void setHasProgramBodySpec(FunctionBlockBodySpecification value);

	/**
	 * Returns the value of the '<em><b>Contains Program Var Decl</b></em>' containment reference list.
	 * The list contents are of type {@link iec611313Specification.common.variables.VariableDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Program Var Decl</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Program Var Decl</em>' containment reference list.
	 * @see iec611313Specification.common.pous.programs.ProgramsPackage#getProgramType_ContainsProgramVarDecl()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariableDeclaration> getContainsProgramVarDecl();

} // ProgramType
