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
 *   <li>{@link fieldofactivityannotations.DocumentationSpecification#getMainteneance <em>Mainteneance</em>}</li>
 *   <li>{@link fieldofactivityannotations.DocumentationSpecification#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link fieldofactivityannotations.DocumentationSpecification#getTrainingIntern <em>Training Intern</em>}</li>
 *   <li>{@link fieldofactivityannotations.DocumentationSpecification#getTrainingExternal <em>Training External</em>}</li>
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
	 * Returns the value of the '<em><b>Mainteneance</b></em>' reference list.
	 * The list contents are of type {@link fieldofactivityannotations.MainteneanceDocumentation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mainteneance</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mainteneance</em>' reference list.
	 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getDocumentationSpecification_Mainteneance()
	 * @model
	 * @generated
	 */
	EList<MainteneanceDocumentation> getMainteneance();

	/**
	 * Returns the value of the '<em><b>Instructions</b></em>' reference list.
	 * The list contents are of type {@link fieldofactivityannotations.OperatorInstructions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instructions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructions</em>' reference list.
	 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getDocumentationSpecification_Instructions()
	 * @model
	 * @generated
	 */
	EList<OperatorInstructions> getInstructions();

	/**
	 * Returns the value of the '<em><b>Training Intern</b></em>' reference list.
	 * The list contents are of type {@link fieldofactivityannotations.TrainingDocIntern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Training Intern</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Training Intern</em>' reference list.
	 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getDocumentationSpecification_TrainingIntern()
	 * @model
	 * @generated
	 */
	EList<TrainingDocIntern> getTrainingIntern();

	/**
	 * Returns the value of the '<em><b>Training External</b></em>' reference list.
	 * The list contents are of type {@link fieldofactivityannotations.TrainingDocExternal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Training External</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Training External</em>' reference list.
	 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getDocumentationSpecification_TrainingExternal()
	 * @model
	 * @generated
	 */
	EList<TrainingDocExternal> getTrainingExternal();

} // DocumentationSpecification
