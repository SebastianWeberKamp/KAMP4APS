/**
 */
package iec611313Specification.language.st;

import iec611313Specification.common.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.language.st.If#getHasIfCondition <em>Has If Condition</em>}</li>
 *   <li>{@link iec611313Specification.language.st.If#getHasElseIf <em>Has Else If</em>}</li>
 *   <li>{@link iec611313Specification.language.st.If#getHasElse <em>Has Else</em>}</li>
 *   <li>{@link iec611313Specification.language.st.If#getHasThen <em>Has Then</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.language.st.StPackage#getIf()
 * @model
 * @generated
 */
public interface If extends Statement {
	/**
	 * Returns the value of the '<em><b>Has If Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has If Condition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has If Condition</em>' reference.
	 * @see #setHasIfCondition(Expression)
	 * @see iec611313Specification.language.st.StPackage#getIf_HasIfCondition()
	 * @model required="true"
	 * @generated
	 */
	Expression getHasIfCondition();

	/**
	 * Sets the value of the '{@link iec611313Specification.language.st.If#getHasIfCondition <em>Has If Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has If Condition</em>' reference.
	 * @see #getHasIfCondition()
	 * @generated
	 */
	void setHasIfCondition(Expression value);

	/**
	 * Returns the value of the '<em><b>Has Else If</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Else If</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Else If</em>' reference.
	 * @see #setHasElseIf(If)
	 * @see iec611313Specification.language.st.StPackage#getIf_HasElseIf()
	 * @model
	 * @generated
	 */
	If getHasElseIf();

	/**
	 * Sets the value of the '{@link iec611313Specification.language.st.If#getHasElseIf <em>Has Else If</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Else If</em>' reference.
	 * @see #getHasElseIf()
	 * @generated
	 */
	void setHasElseIf(If value);

	/**
	 * Returns the value of the '<em><b>Has Else</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Else</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Else</em>' reference.
	 * @see #setHasElse(StatementList)
	 * @see iec611313Specification.language.st.StPackage#getIf_HasElse()
	 * @model required="true"
	 * @generated
	 */
	StatementList getHasElse();

	/**
	 * Sets the value of the '{@link iec611313Specification.language.st.If#getHasElse <em>Has Else</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Else</em>' reference.
	 * @see #getHasElse()
	 * @generated
	 */
	void setHasElse(StatementList value);

	/**
	 * Returns the value of the '<em><b>Has Then</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Then</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Then</em>' reference.
	 * @see #setHasThen(StatementList)
	 * @see iec611313Specification.language.st.StPackage#getIf_HasThen()
	 * @model required="true"
	 * @generated
	 */
	StatementList getHasThen();

	/**
	 * Sets the value of the '{@link iec611313Specification.language.st.If#getHasThen <em>Has Then</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Then</em>' reference.
	 * @see #getHasThen()
	 * @generated
	 */
	void setHasThen(StatementList value);

} // If
