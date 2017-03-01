/**
 */
package fieldofactivityannotations;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ECAD Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fieldofactivityannotations.ECADSpecification#getParent <em>Parent</em>}</li>
 *   <li>{@link fieldofactivityannotations.ECADSpecification#getDrawings <em>Drawings</em>}</li>
 *   <li>{@link fieldofactivityannotations.ECADSpecification#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getECADSpecification()
 * @model
 * @generated
 */
public interface ECADSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fieldofactivityannotations.FieldOfActivityAnnotationRepository#getEcadSpecification <em>Ecad Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(FieldOfActivityAnnotationRepository)
	 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getECADSpecification_Parent()
	 * @see fieldofactivityannotations.FieldOfActivityAnnotationRepository#getEcadSpecification
	 * @model opposite="ecadSpecification" required="true" transient="false"
	 * @generated
	 */
	FieldOfActivityAnnotationRepository getParent();

	/**
	 * Sets the value of the '{@link fieldofactivityannotations.ECADSpecification#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(FieldOfActivityAnnotationRepository value);

	/**
	 * Returns the value of the '<em><b>Drawings</b></em>' containment reference list.
	 * The list contents are of type {@link fieldofactivityannotations.Drawing}.
	 * It is bidirectional and its opposite is '{@link fieldofactivityannotations.Drawing#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drawings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drawings</em>' containment reference list.
	 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getECADSpecification_Drawings()
	 * @see fieldofactivityannotations.Drawing#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Drawing> getDrawings();

	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(Role)
	 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getECADSpecification_Role()
	 * @model
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link fieldofactivityannotations.ECADSpecification#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

} // ECADSpecification
