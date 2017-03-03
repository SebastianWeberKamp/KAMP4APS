/**
 */
package iec611313Specification.language.st;

import iec611313Specification.common.Expression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.language.st.Case#getHasCaseExpression <em>Has Case Expression</em>}</li>
 *   <li>{@link iec611313Specification.language.st.Case#getContainsCaseElement <em>Contains Case Element</em>}</li>
 *   <li>{@link iec611313Specification.language.st.Case#getHasDefaultPart <em>Has Default Part</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.language.st.StPackage#getCase()
 * @model
 * @generated
 */
public interface Case extends Statement {
	/**
	 * Returns the value of the '<em><b>Has Case Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Case Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Case Expression</em>' reference.
	 * @see #setHasCaseExpression(Expression)
	 * @see iec611313Specification.language.st.StPackage#getCase_HasCaseExpression()
	 * @model required="true"
	 * @generated
	 */
	Expression getHasCaseExpression();

	/**
	 * Sets the value of the '{@link iec611313Specification.language.st.Case#getHasCaseExpression <em>Has Case Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Case Expression</em>' reference.
	 * @see #getHasCaseExpression()
	 * @generated
	 */
	void setHasCaseExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Contains Case Element</b></em>' containment reference list.
	 * The list contents are of type {@link iec611313Specification.language.st.CaseElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Case Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Case Element</em>' containment reference list.
	 * @see iec611313Specification.language.st.StPackage#getCase_ContainsCaseElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<CaseElement> getContainsCaseElement();

	/**
	 * Returns the value of the '<em><b>Has Default Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Default Part</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Default Part</em>' reference.
	 * @see #setHasDefaultPart(StatementList)
	 * @see iec611313Specification.language.st.StPackage#getCase_HasDefaultPart()
	 * @model required="true"
	 * @generated
	 */
	StatementList getHasDefaultPart();

	/**
	 * Sets the value of the '{@link iec611313Specification.language.st.Case#getHasDefaultPart <em>Has Default Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Default Part</em>' reference.
	 * @see #getHasDefaultPart()
	 * @generated
	 */
	void setHasDefaultPart(StatementList value);

} // Case
