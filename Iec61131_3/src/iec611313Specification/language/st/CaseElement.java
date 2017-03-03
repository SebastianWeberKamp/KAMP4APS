/**
 */
package iec611313Specification.language.st;

import iec611313Specification.common.Literal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.language.st.CaseElement#getHasCaseElementMatchesPart <em>Has Case Element Matches Part</em>}</li>
 *   <li>{@link iec611313Specification.language.st.CaseElement#getHasCaseValue <em>Has Case Value</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.language.st.StPackage#getCaseElement()
 * @model
 * @generated
 */
public interface CaseElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Case Element Matches Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Case Element Matches Part</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Case Element Matches Part</em>' reference.
	 * @see #setHasCaseElementMatchesPart(StatementList)
	 * @see iec611313Specification.language.st.StPackage#getCaseElement_HasCaseElementMatchesPart()
	 * @model required="true"
	 * @generated
	 */
	StatementList getHasCaseElementMatchesPart();

	/**
	 * Sets the value of the '{@link iec611313Specification.language.st.CaseElement#getHasCaseElementMatchesPart <em>Has Case Element Matches Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Case Element Matches Part</em>' reference.
	 * @see #getHasCaseElementMatchesPart()
	 * @generated
	 */
	void setHasCaseElementMatchesPart(StatementList value);

	/**
	 * Returns the value of the '<em><b>Has Case Value</b></em>' containment reference list.
	 * The list contents are of type {@link iec611313Specification.common.Literal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Case Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Case Value</em>' containment reference list.
	 * @see iec611313Specification.language.st.StPackage#getCaseElement_HasCaseValue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Literal> getHasCaseValue();

} // CaseElement
