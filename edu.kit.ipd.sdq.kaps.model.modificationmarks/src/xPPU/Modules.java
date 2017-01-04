/**
 */
package xPPU;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modules</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPPU.Modules#getModules <em>Modules</em>}</li>
 *   <li>{@link xPPU.Modules#getRampmodules <em>Rampmodules</em>}</li>
 *   <li>{@link xPPU.Modules#getPushermodules <em>Pushermodules</em>}</li>
 *   <li>{@link xPPU.Modules#getMotormodules <em>Motormodules</em>}</li>
 *   <li>{@link xPPU.Modules#getSensormodules <em>Sensormodules</em>}</li>
 *   <li>{@link xPPU.Modules#getParentStructure <em>Parent Structure</em>}</li>
 * </ul>
 *
 * @see xPPU.XPPUPackage#getModules()
 * @model
 * @generated
 */
public interface Modules extends EObject {
	/**
	 * Returns the value of the '<em><b>Modules</b></em>' reference list.
	 * The list contents are of type {@link xPPU.Modules}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' reference list.
	 * @see xPPU.XPPUPackage#getModules_Modules()
	 * @model
	 * @generated
	 */
	EList<Modules> getModules();

	/**
	 * Returns the value of the '<em><b>Rampmodules</b></em>' containment reference list.
	 * The list contents are of type {@link xPPU.RampModule}.
	 * It is bidirectional and its opposite is '{@link xPPU.RampModule#getParentModuleContainer <em>Parent Module Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rampmodules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rampmodules</em>' containment reference list.
	 * @see xPPU.XPPUPackage#getModules_Rampmodules()
	 * @see xPPU.RampModule#getParentModuleContainer
	 * @model opposite="parentModuleContainer" containment="true"
	 * @generated
	 */
	EList<RampModule> getRampmodules();

	/**
	 * Returns the value of the '<em><b>Pushermodules</b></em>' containment reference list.
	 * The list contents are of type {@link xPPU.PusherModule}.
	 * It is bidirectional and its opposite is '{@link xPPU.PusherModule#getParentModuleContainer <em>Parent Module Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pushermodules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pushermodules</em>' containment reference list.
	 * @see xPPU.XPPUPackage#getModules_Pushermodules()
	 * @see xPPU.PusherModule#getParentModuleContainer
	 * @model opposite="parentModuleContainer" containment="true"
	 * @generated
	 */
	EList<PusherModule> getPushermodules();

	/**
	 * Returns the value of the '<em><b>Motormodules</b></em>' containment reference list.
	 * The list contents are of type {@link xPPU.MotorModule}.
	 * It is bidirectional and its opposite is '{@link xPPU.MotorModule#getParentModuleContainer <em>Parent Module Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Motormodules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Motormodules</em>' containment reference list.
	 * @see xPPU.XPPUPackage#getModules_Motormodules()
	 * @see xPPU.MotorModule#getParentModuleContainer
	 * @model opposite="parentModuleContainer" containment="true"
	 * @generated
	 */
	EList<MotorModule> getMotormodules();

	/**
	 * Returns the value of the '<em><b>Sensormodules</b></em>' containment reference list.
	 * The list contents are of type {@link xPPU.SensorModule}.
	 * It is bidirectional and its opposite is '{@link xPPU.SensorModule#getParentModuleContainer <em>Parent Module Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensormodules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensormodules</em>' containment reference list.
	 * @see xPPU.XPPUPackage#getModules_Sensormodules()
	 * @see xPPU.SensorModule#getParentModuleContainer
	 * @model opposite="parentModuleContainer" containment="true"
	 * @generated
	 */
	EList<SensorModule> getSensormodules();

	/**
	 * Returns the value of the '<em><b>Parent Structure</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link xPPU.Structure#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Structure</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Structure</em>' container reference.
	 * @see #setParentStructure(Structure)
	 * @see xPPU.XPPUPackage#getModules_ParentStructure()
	 * @see xPPU.Structure#getModules
	 * @model opposite="modules" required="true" transient="false"
	 * @generated
	 */
	Structure getParentStructure();

	/**
	 * Sets the value of the '{@link xPPU.Modules#getParentStructure <em>Parent Structure</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Structure</em>' container reference.
	 * @see #getParentStructure()
	 * @generated
	 */
	void setParentStructure(Structure value);

} // Modules
