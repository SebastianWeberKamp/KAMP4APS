/**
 */
package iec611313Specification.language.st;

import iec611313Specification.common.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Iteration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.language.st.SimpleIteration#getHasIterationCondition <em>Has Iteration Condition</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.language.st.StPackage#getSimpleIteration()
 * @model abstract="true"
 * @generated
 */
public interface SimpleIteration extends Iteration {
	/**
	 * Returns the value of the '<em><b>Has Iteration Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Iteration Condition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Iteration Condition</em>' reference.
	 * @see #setHasIterationCondition(Expression)
	 * @see iec611313Specification.language.st.StPackage#getSimpleIteration_HasIterationCondition()
	 * @model required="true"
	 * @generated
	 */
	Expression getHasIterationCondition();

	/**
	 * Sets the value of the '{@link iec611313Specification.language.st.SimpleIteration#getHasIterationCondition <em>Has Iteration Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Iteration Condition</em>' reference.
	 * @see #getHasIterationCondition()
	 * @generated
	 */
	void setHasIterationCondition(Expression value);

} // SimpleIteration
