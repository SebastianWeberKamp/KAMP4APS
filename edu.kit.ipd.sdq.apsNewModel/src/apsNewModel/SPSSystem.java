/**
 */
package apsNewModel;

import ComponentInternalDependencies.ComponentInternalDependenciesRepository;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SPS System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apsNewModel.SPSSystem#getName <em>Name</em>}</li>
 *   <li>{@link apsNewModel.SPSSystem#getId <em>Id</em>}</li>
 *   <li>{@link apsNewModel.SPSSystem#getContainsProgram <em>Contains Program</em>}</li>
 *   <li>{@link apsNewModel.SPSSystem#getComponentInternalDependencies <em>Component Internal Dependencies</em>}</li>
 * </ul>
 *
 * @see apsNewModel.ApsNewModelPackage#getSPSSystem()
 * @model
 * @generated
 */
public interface SPSSystem extends EObject {
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
	 * @see apsNewModel.ApsNewModelPackage#getSPSSystem_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link apsNewModel.SPSSystem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see apsNewModel.ApsNewModelPackage#getSPSSystem_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link apsNewModel.SPSSystem#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Contains Program</b></em>' containment reference list.
	 * The list contents are of type {@link apsNewModel.Program}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Program</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Program</em>' containment reference list.
	 * @see apsNewModel.ApsNewModelPackage#getSPSSystem_ContainsProgram()
	 * @model containment="true"
	 * @generated
	 */
	EList<Program> getContainsProgram();

	/**
	 * Returns the value of the '<em><b>Component Internal Dependencies</b></em>' reference list.
	 * The list contents are of type {@link ComponentInternalDependencies.ComponentInternalDependenciesRepository}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Internal Dependencies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Internal Dependencies</em>' reference list.
	 * @see apsNewModel.ApsNewModelPackage#getSPSSystem_ComponentInternalDependencies()
	 * @model
	 * @generated
	 */
	EList<ComponentInternalDependenciesRepository> getComponentInternalDependencies();

} // SPSSystem
