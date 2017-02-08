/**
 */
package fieldofactivityannotations;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fieldofactivityannotations.RoleList#getParent <em>Parent</em>}</li>
 *   <li>{@link fieldofactivityannotations.RoleList#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getRoleList()
 * @model
 * @generated
 */
public interface RoleList extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fieldofactivityannotations.StaffSpecification#getRoleList <em>Role List</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(StaffSpecification)
	 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getRoleList_Parent()
	 * @see fieldofactivityannotations.StaffSpecification#getRoleList
	 * @model opposite="roleList" required="true" transient="false"
	 * @generated
	 */
	StaffSpecification getParent();

	/**
	 * Sets the value of the '{@link fieldofactivityannotations.RoleList#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(StaffSpecification value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' reference list.
	 * The list contents are of type {@link fieldofactivityannotations.Role}.
	 * It is bidirectional and its opposite is '{@link fieldofactivityannotations.Role#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' reference list.
	 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getRoleList_Roles()
	 * @see fieldofactivityannotations.Role#getParent
	 * @model opposite="parent"
	 * @generated
	 */
	EList<Role> getRoles();

} // RoleList
