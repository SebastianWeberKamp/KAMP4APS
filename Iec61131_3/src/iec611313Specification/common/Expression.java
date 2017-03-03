/**
 */
package iec611313Specification.common;

import iec611313Specification.common.types.ANY;

import iec611313Specification.language.st.Statement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.common.Expression#getHasType <em>Has Type</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.common.CommonPackage#getExpression()
 * @model abstract="true"
 * @generated
 */
public interface Expression extends Statement {
	/**
	 * Returns the value of the '<em><b>Has Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Type</em>' containment reference.
	 * @see #setHasType(ANY)
	 * @see iec611313Specification.common.CommonPackage#getExpression_HasType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ANY getHasType();

	/**
	 * Sets the value of the '{@link iec611313Specification.common.Expression#getHasType <em>Has Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Type</em>' containment reference.
	 * @see #getHasType()
	 * @generated
	 */
	void setHasType(ANY value);

} // Expression
