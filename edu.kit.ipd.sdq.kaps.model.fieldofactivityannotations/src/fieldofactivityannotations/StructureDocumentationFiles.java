/**
 */
package fieldofactivityannotations;

import xPPU.StructureRepository.Structure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure Documentation Files</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fieldofactivityannotations.StructureDocumentationFiles#getParent <em>Parent</em>}</li>
 *   <li>{@link fieldofactivityannotations.StructureDocumentationFiles#getDocumentedStructure <em>Documented Structure</em>}</li>
 * </ul>
 *
 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getStructureDocumentationFiles()
 * @model
 * @generated
 */
public interface StructureDocumentationFiles extends DocumentationFiles {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fieldofactivityannotations.DocumentationSpecification#getStructureDocumentation <em>Structure Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(DocumentationSpecification)
	 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getStructureDocumentationFiles_Parent()
	 * @see fieldofactivityannotations.DocumentationSpecification#getStructureDocumentation
	 * @model opposite="structureDocumentation" required="true" transient="false"
	 * @generated
	 */
	DocumentationSpecification getParent();

	/**
	 * Sets the value of the '{@link fieldofactivityannotations.StructureDocumentationFiles#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(DocumentationSpecification value);

	/**
	 * Returns the value of the '<em><b>Documented Structure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documented Structure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documented Structure</em>' reference.
	 * @see #setDocumentedStructure(Structure)
	 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getStructureDocumentationFiles_DocumentedStructure()
	 * @model required="true"
	 * @generated
	 */
	Structure getDocumentedStructure();

	/**
	 * Sets the value of the '{@link fieldofactivityannotations.StructureDocumentationFiles#getDocumentedStructure <em>Documented Structure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documented Structure</em>' reference.
	 * @see #getDocumentedStructure()
	 * @generated
	 */
	void setDocumentedStructure(Structure value);

} // StructureDocumentationFiles
