/**
 */
package iec611313Specification.common;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formal Parameter List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.common.FormalParameterList#getContainsFormalParamAssignment <em>Contains Formal Param Assignment</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.common.CommonPackage#getFormalParameterList()
 * @model
 * @generated
 */
public interface FormalParameterList extends ParameterList {
	/**
	 * Returns the value of the '<em><b>Contains Formal Param Assignment</b></em>' containment reference list.
	 * The list contents are of type {@link iec611313Specification.common.Assignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Formal Param Assignment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Formal Param Assignment</em>' containment reference list.
	 * @see iec611313Specification.common.CommonPackage#getFormalParameterList_ContainsFormalParamAssignment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Assignment> getContainsFormalParamAssignment();

} // FormalParameterList
