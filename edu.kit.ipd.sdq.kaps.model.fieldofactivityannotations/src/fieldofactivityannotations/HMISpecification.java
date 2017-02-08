/**
 */
package fieldofactivityannotations;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HMI Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fieldofactivityannotations.HMISpecification#getParent <em>Parent</em>}</li>
 *   <li>{@link fieldofactivityannotations.HMISpecification#getHmiConfiguration <em>Hmi Configuration</em>}</li>
 * </ul>
 *
 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getHMISpecification()
 * @model
 * @generated
 */
public interface HMISpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fieldofactivityannotations.FieldOfActivityAnnotationRepository#getHmiSpecification <em>Hmi Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(FieldOfActivityAnnotationRepository)
	 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getHMISpecification_Parent()
	 * @see fieldofactivityannotations.FieldOfActivityAnnotationRepository#getHmiSpecification
	 * @model opposite="hmiSpecification" required="true" transient="false"
	 * @generated
	 */
	FieldOfActivityAnnotationRepository getParent();

	/**
	 * Sets the value of the '{@link fieldofactivityannotations.HMISpecification#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(FieldOfActivityAnnotationRepository value);

	/**
	 * Returns the value of the '<em><b>Hmi Configuration</b></em>' reference list.
	 * The list contents are of type {@link fieldofactivityannotations.HMIConfiguration}.
	 * It is bidirectional and its opposite is '{@link fieldofactivityannotations.HMIConfiguration#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hmi Configuration</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hmi Configuration</em>' reference list.
	 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getHMISpecification_HmiConfiguration()
	 * @see fieldofactivityannotations.HMIConfiguration#getParent
	 * @model opposite="parent"
	 * @generated
	 */
	EList<HMIConfiguration> getHmiConfiguration();

} // HMISpecification
