/**
 */
package iec611313Specification.common.pous.programs;

import iec611313Specification.configuration.Task;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.common.pous.programs.ProgramConfiguration#getName <em>Name</em>}</li>
 *   <li>{@link iec611313Specification.common.pous.programs.ProgramConfiguration#isRetentive <em>Retentive</em>}</li>
 *   <li>{@link iec611313Specification.common.pous.programs.ProgramConfiguration#getHasProgramType <em>Has Program Type</em>}</li>
 *   <li>{@link iec611313Specification.common.pous.programs.ProgramConfiguration#getContainsProgConfigElement <em>Contains Prog Config Element</em>}</li>
 *   <li>{@link iec611313Specification.common.pous.programs.ProgramConfiguration#getIsAssignedTo <em>Is Assigned To</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.common.pous.programs.ProgramsPackage#getProgramConfiguration()
 * @model
 * @generated
 */
public interface ProgramConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see iec611313Specification.common.pous.programs.ProgramsPackage#getProgramConfiguration_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link iec611313Specification.common.pous.programs.ProgramConfiguration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Retentive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Retentive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retentive</em>' attribute.
	 * @see #setRetentive(boolean)
	 * @see iec611313Specification.common.pous.programs.ProgramsPackage#getProgramConfiguration_Retentive()
	 * @model required="true"
	 * @generated
	 */
	boolean isRetentive();

	/**
	 * Sets the value of the '{@link iec611313Specification.common.pous.programs.ProgramConfiguration#isRetentive <em>Retentive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retentive</em>' attribute.
	 * @see #isRetentive()
	 * @generated
	 */
	void setRetentive(boolean value);

	/**
	 * Returns the value of the '<em><b>Has Program Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Program Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Program Type</em>' containment reference.
	 * @see #setHasProgramType(ProgramType)
	 * @see iec611313Specification.common.pous.programs.ProgramsPackage#getProgramConfiguration_HasProgramType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ProgramType getHasProgramType();

	/**
	 * Sets the value of the '{@link iec611313Specification.common.pous.programs.ProgramConfiguration#getHasProgramType <em>Has Program Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Program Type</em>' containment reference.
	 * @see #getHasProgramType()
	 * @generated
	 */
	void setHasProgramType(ProgramType value);

	/**
	 * Returns the value of the '<em><b>Contains Prog Config Element</b></em>' containment reference list.
	 * The list contents are of type {@link iec611313Specification.common.pous.programs.ProgramConfigElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Prog Config Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Prog Config Element</em>' containment reference list.
	 * @see iec611313Specification.common.pous.programs.ProgramsPackage#getProgramConfiguration_ContainsProgConfigElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProgramConfigElement> getContainsProgConfigElement();

	/**
	 * Returns the value of the '<em><b>Is Assigned To</b></em>' reference list.
	 * The list contents are of type {@link iec611313Specification.configuration.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Assigned To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Assigned To</em>' reference list.
	 * @see iec611313Specification.common.pous.programs.ProgramsPackage#getProgramConfiguration_IsAssignedTo()
	 * @model
	 * @generated
	 */
	EList<Task> getIsAssignedTo();

} // ProgramConfiguration
