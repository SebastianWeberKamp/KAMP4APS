/**
 */
package iec611313Specification.language.st;

import iec611313Specification.common.Assignment;
import iec611313Specification.common.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.language.st.For#getHasToExpression <em>Has To Expression</em>}</li>
 *   <li>{@link iec611313Specification.language.st.For#getHasStepExpression <em>Has Step Expression</em>}</li>
 *   <li>{@link iec611313Specification.language.st.For#getHasControlVariableAssignment <em>Has Control Variable Assignment</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.language.st.StPackage#getFor()
 * @model
 * @generated
 */
public interface For extends Iteration {
	/**
	 * Returns the value of the '<em><b>Has To Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has To Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has To Expression</em>' reference.
	 * @see #setHasToExpression(Expression)
	 * @see iec611313Specification.language.st.StPackage#getFor_HasToExpression()
	 * @model required="true"
	 * @generated
	 */
	Expression getHasToExpression();

	/**
	 * Sets the value of the '{@link iec611313Specification.language.st.For#getHasToExpression <em>Has To Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has To Expression</em>' reference.
	 * @see #getHasToExpression()
	 * @generated
	 */
	void setHasToExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Has Step Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Step Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Step Expression</em>' reference.
	 * @see #setHasStepExpression(Expression)
	 * @see iec611313Specification.language.st.StPackage#getFor_HasStepExpression()
	 * @model required="true"
	 * @generated
	 */
	Expression getHasStepExpression();

	/**
	 * Sets the value of the '{@link iec611313Specification.language.st.For#getHasStepExpression <em>Has Step Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Step Expression</em>' reference.
	 * @see #getHasStepExpression()
	 * @generated
	 */
	void setHasStepExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Has Control Variable Assignment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Control Variable Assignment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Control Variable Assignment</em>' reference.
	 * @see #setHasControlVariableAssignment(Assignment)
	 * @see iec611313Specification.language.st.StPackage#getFor_HasControlVariableAssignment()
	 * @model required="true"
	 * @generated
	 */
	Assignment getHasControlVariableAssignment();

	/**
	 * Sets the value of the '{@link iec611313Specification.language.st.For#getHasControlVariableAssignment <em>Has Control Variable Assignment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Control Variable Assignment</em>' reference.
	 * @see #getHasControlVariableAssignment()
	 * @generated
	 */
	void setHasControlVariableAssignment(Assignment value);

} // For
