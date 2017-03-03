/**
 */
package iec611313Specification.common;

import iec611313Specification.common.pous.programs.ProgramConfigElement;

import iec611313Specification.common.variables.VariableAccess;

import iec611313Specification.language.st.Statement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.common.Assignment#getHasAssignmentExpression <em>Has Assignment Expression</em>}</li>
 *   <li>{@link iec611313Specification.common.Assignment#getHasAssignmentVariable <em>Has Assignment Variable</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.common.CommonPackage#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends ProgramConfigElement, Statement {
	/**
	 * Returns the value of the '<em><b>Has Assignment Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Assignment Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Assignment Expression</em>' reference.
	 * @see #setHasAssignmentExpression(Expression)
	 * @see iec611313Specification.common.CommonPackage#getAssignment_HasAssignmentExpression()
	 * @model required="true"
	 * @generated
	 */
	Expression getHasAssignmentExpression();

	/**
	 * Sets the value of the '{@link iec611313Specification.common.Assignment#getHasAssignmentExpression <em>Has Assignment Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Assignment Expression</em>' reference.
	 * @see #getHasAssignmentExpression()
	 * @generated
	 */
	void setHasAssignmentExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Has Assignment Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Assignment Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Assignment Variable</em>' reference.
	 * @see #setHasAssignmentVariable(VariableAccess)
	 * @see iec611313Specification.common.CommonPackage#getAssignment_HasAssignmentVariable()
	 * @model required="true"
	 * @generated
	 */
	VariableAccess getHasAssignmentVariable();

	/**
	 * Sets the value of the '{@link iec611313Specification.common.Assignment#getHasAssignmentVariable <em>Has Assignment Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Assignment Variable</em>' reference.
	 * @see #getHasAssignmentVariable()
	 * @generated
	 */
	void setHasAssignmentVariable(VariableAccess value);

} // Assignment
