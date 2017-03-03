/**
 */
package fieldofactivityannotations;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Documentation Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fieldofactivityannotations.DocumentationSpecification#getParent <em>Parent</em>}</li>
 *   <li>{@link fieldofactivityannotations.DocumentationSpecification#getComponentDocumentation <em>Component Documentation</em>}</li>
 *   <li>{@link fieldofactivityannotations.DocumentationSpecification#getModuleDocumentation <em>Module Documentation</em>}</li>
 *   <li>{@link fieldofactivityannotations.DocumentationSpecification#getInterfaceDocumentation <em>Interface Documentation</em>}</li>
 *   <li>{@link fieldofactivityannotations.DocumentationSpecification#getStructureDocumentation <em>Structure Documentation</em>}</li>
 *   <li>{@link fieldofactivityannotations.DocumentationSpecification#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getDocumentationSpecification()
 * @model
 * @generated
 */
public interface DocumentationSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fieldofactivityannotations.FieldOfActivityAnnotationRepository#getDocumentationSpecification <em>Documentation Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(FieldOfActivityAnnotationRepository)
	 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getDocumentationSpecification_Parent()
	 * @see fieldofactivityannotations.FieldOfActivityAnnotationRepository#getDocumentationSpecification
	 * @model opposite="documentationSpecification" required="true" transient="false"
	 * @generated
	 */
	FieldOfActivityAnnotationRepository getParent();

	/**
	 * Sets the value of the '{@link fieldofactivityannotations.DocumentationSpecification#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(FieldOfActivityAnnotationRepository value);

	/**
	 * Returns the value of the '<em><b>Component Documentation</b></em>' containment reference list.
	 * The list contents are of type {@link fieldofactivityannotations.ComponentDocumentationFiles}.
	 * It is bidirectional and its opposite is '{@link fieldofactivityannotations.ComponentDocumentationFiles#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Documentation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Documentation</em>' containment reference list.
	 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getDocumentationSpecification_ComponentDocumentation()
	 * @see fieldofactivityannotations.ComponentDocumentationFiles#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ComponentDocumentationFiles> getComponentDocumentation();

	/**
	 * Returns the value of the '<em><b>Module Documentation</b></em>' containment reference list.
	 * The list contents are of type {@link fieldofactivityannotations.ModuleDocumentationFiles}.
	 * It is bidirectional and its opposite is '{@link fieldofactivityannotations.ModuleDocumentationFiles#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module Documentation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Documentation</em>' containment reference list.
	 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getDocumentationSpecification_ModuleDocumentation()
	 * @see fieldofactivityannotations.ModuleDocumentationFiles#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ModuleDocumentationFiles> getModuleDocumentation();

	/**
	 * Returns the value of the '<em><b>Interface Documentation</b></em>' containment reference list.
	 * The list contents are of type {@link fieldofactivityannotations.InterfaceDocumentationFiles}.
	 * It is bidirectional and its opposite is '{@link fieldofactivityannotations.InterfaceDocumentationFiles#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Documentation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Documentation</em>' containment reference list.
	 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getDocumentationSpecification_InterfaceDocumentation()
	 * @see fieldofactivityannotations.InterfaceDocumentationFiles#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<InterfaceDocumentationFiles> getInterfaceDocumentation();

	/**
	 * Returns the value of the '<em><b>Structure Documentation</b></em>' containment reference list.
	 * The list contents are of type {@link fieldofactivityannotations.StructureDocumentationFiles}.
	 * It is bidirectional and its opposite is '{@link fieldofactivityannotations.StructureDocumentationFiles#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structure Documentation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure Documentation</em>' containment reference list.
	 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getDocumentationSpecification_StructureDocumentation()
	 * @see fieldofactivityannotations.StructureDocumentationFiles#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<StructureDocumentationFiles> getStructureDocumentation();

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
	 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getDocumentationSpecification_Role()
	 * @model
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link fieldofactivityannotations.DocumentationSpecification#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

} // DocumentationSpecification
