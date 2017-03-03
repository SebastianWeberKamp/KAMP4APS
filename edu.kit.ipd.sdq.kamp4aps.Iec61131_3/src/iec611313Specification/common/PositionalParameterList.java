/**
 */
package iec611313Specification.common;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Positional Parameter List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.common.PositionalParameterList#getContainsParamExpression <em>Contains Param Expression</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.common.CommonPackage#getPositionalParameterList()
 * @model
 * @generated
 */
public interface PositionalParameterList extends ParameterList {
	/**
	 * Returns the value of the '<em><b>Contains Param Expression</b></em>' reference list.
	 * The list contents are of type {@link iec611313Specification.common.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Param Expression</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Param Expression</em>' reference list.
	 * @see iec611313Specification.common.CommonPackage#getPositionalParameterList_ContainsParamExpression()
	 * @model
	 * @generated
	 */
	EList<Expression> getContainsParamExpression();

} // PositionalParameterList
