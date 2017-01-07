/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.repository.RepositoryComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Technological Correspondence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TechnologicalCorrespondence#getTechnologicalCorrespondenceType <em>Technological Correspondence Type</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TechnologicalCorrespondence#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.FieldofactivityannotationsPackage#getTechnologicalCorrespondence()
 * @model
 * @generated
 */
public interface TechnologicalCorrespondence extends EObject, Identifier {
	/**
	 * Returns the value of the '<em><b>Technological Correspondence Type</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TechnologicalCorrespondenceTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Technological Correspondence Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technological Correspondence Type</em>' attribute.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TechnologicalCorrespondenceTypes
	 * @see #setTechnologicalCorrespondenceType(TechnologicalCorrespondenceTypes)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.FieldofactivityannotationsPackage#getTechnologicalCorrespondence_TechnologicalCorrespondenceType()
	 * @model ordered="false"
	 * @generated
	 */
	TechnologicalCorrespondenceTypes getTechnologicalCorrespondenceType();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TechnologicalCorrespondence#getTechnologicalCorrespondenceType <em>Technological Correspondence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technological Correspondence Type</em>' attribute.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TechnologicalCorrespondenceTypes
	 * @see #getTechnologicalCorrespondenceType()
	 * @generated
	 */
	void setTechnologicalCorrespondenceType(TechnologicalCorrespondenceTypes value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(RepositoryComponent)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.FieldofactivityannotationsPackage#getTechnologicalCorrespondence_Component()
	 * @model ordered="false"
	 * @generated
	 */
	RepositoryComponent getComponent();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TechnologicalCorrespondence#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(RepositoryComponent value);

} // TechnologicalCorrespondence
