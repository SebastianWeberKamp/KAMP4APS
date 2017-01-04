/**
 */
package edu.kit.ipd.sdq.kaps.model.fieldofactivityannotations;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Design Pattern Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kaps.model.fieldofactivityannotations.DesignPatternSpecification#getParent <em>Parent</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kaps.model.fieldofactivityannotations.DesignPatternSpecification#getDesignPatternRoles <em>Design Pattern Roles</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kaps.model.fieldofactivityannotations.FieldofactivityannotationsPackage#getDesignPatternSpecification()
 * @model
 * @generated
 */
public interface DesignPatternSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kaps.model.fieldofactivityannotations.FieldOfActivityAnnotationRepository#getDesignPatternSpecification <em>Design Pattern Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(FieldOfActivityAnnotationRepository)
	 * @see edu.kit.ipd.sdq.kaps.model.fieldofactivityannotations.FieldofactivityannotationsPackage#getDesignPatternSpecification_Parent()
	 * @see edu.kit.ipd.sdq.kaps.model.fieldofactivityannotations.FieldOfActivityAnnotationRepository#getDesignPatternSpecification
	 * @model opposite="designPatternSpecification" required="true" transient="false"
	 * @generated
	 */
	FieldOfActivityAnnotationRepository getParent();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kaps.model.fieldofactivityannotations.DesignPatternSpecification#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(FieldOfActivityAnnotationRepository value);

	/**
	 * Returns the value of the '<em><b>Design Pattern Roles</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kaps.model.fieldofactivityannotations.DesignPatternRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design Pattern Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Pattern Roles</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kaps.model.fieldofactivityannotations.FieldofactivityannotationsPackage#getDesignPatternSpecification_DesignPatternRoles()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DesignPatternRole> getDesignPatternRoles();

} // DesignPatternSpecification
