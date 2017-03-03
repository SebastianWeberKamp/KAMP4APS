/**
 */
package iec611313Specification.language.st;

import iec611313Specification.common.pous.function_blocks.FunctionBlockBodySpecification;

import iec611313Specification.common.pous.functions.FunctionBodySpecification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.language.st.StatementList#getContainsStatement <em>Contains Statement</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.language.st.StPackage#getStatementList()
 * @model
 * @generated
 */
public interface StatementList extends FunctionBodySpecification, FunctionBlockBodySpecification {
	/**
	 * Returns the value of the '<em><b>Contains Statement</b></em>' containment reference list.
	 * The list contents are of type {@link iec611313Specification.language.st.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Statement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Statement</em>' containment reference list.
	 * @see iec611313Specification.language.st.StPackage#getStatementList_ContainsStatement()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getContainsStatement();

} // StatementList
