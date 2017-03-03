/**
 */
package fieldofactivityannotations;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import xPPU.ComponentRepository.Component;

import xPPU.InterfaceRepository.Interface;

import xPPU.ModuleRepository.Module;

import xPPU.StructureRepository.Structure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calibration Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fieldofactivityannotations.CalibrationConfiguration#getName <em>Name</em>}</li>
 *   <li>{@link fieldofactivityannotations.CalibrationConfiguration#getParent <em>Parent</em>}</li>
 *   <li>{@link fieldofactivityannotations.CalibrationConfiguration#getComponents <em>Components</em>}</li>
 *   <li>{@link fieldofactivityannotations.CalibrationConfiguration#getModules <em>Modules</em>}</li>
 *   <li>{@link fieldofactivityannotations.CalibrationConfiguration#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link fieldofactivityannotations.CalibrationConfiguration#getStructures <em>Structures</em>}</li>
 * </ul>
 *
 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getCalibrationConfiguration()
 * @model
 * @generated
 */
public interface CalibrationConfiguration extends EObject {
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
	 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getCalibrationConfiguration_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fieldofactivityannotations.CalibrationConfiguration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fieldofactivityannotations.CalibrationSpecification#getCalibrationConfig <em>Calibration Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(CalibrationSpecification)
	 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getCalibrationConfiguration_Parent()
	 * @see fieldofactivityannotations.CalibrationSpecification#getCalibrationConfig
	 * @model opposite="calibrationConfig" required="true" transient="false"
	 * @generated
	 */
	CalibrationSpecification getParent();

	/**
	 * Sets the value of the '{@link fieldofactivityannotations.CalibrationConfiguration#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(CalibrationSpecification value);

	/**
	 * Returns the value of the '<em><b>Components</b></em>' reference list.
	 * The list contents are of type {@link xPPU.ComponentRepository.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' reference list.
	 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getCalibrationConfiguration_Components()
	 * @model
	 * @generated
	 */
	EList<Component> getComponents();

	/**
	 * Returns the value of the '<em><b>Modules</b></em>' reference list.
	 * The list contents are of type {@link xPPU.ModuleRepository.Module}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' reference list.
	 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getCalibrationConfiguration_Modules()
	 * @model
	 * @generated
	 */
	EList<Module> getModules();

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' reference list.
	 * The list contents are of type {@link xPPU.InterfaceRepository.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' reference list.
	 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getCalibrationConfiguration_Interfaces()
	 * @model
	 * @generated
	 */
	EList<Interface> getInterfaces();

	/**
	 * Returns the value of the '<em><b>Structures</b></em>' reference list.
	 * The list contents are of type {@link xPPU.StructureRepository.Structure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structures</em>' reference list.
	 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getCalibrationConfiguration_Structures()
	 * @model
	 * @generated
	 */
	EList<Structure> getStructures();

} // CalibrationConfiguration
