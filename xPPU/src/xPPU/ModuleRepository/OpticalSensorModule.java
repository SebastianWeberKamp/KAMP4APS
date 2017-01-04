/**
 */
package xPPU.ModuleRepository;

import org.eclipse.emf.common.util.EList;

import xPPU.BusComponents.BusSlave;

import xPPU.ComponentRepository.OpticalSensor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Optical Sensor Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPPU.ModuleRepository.OpticalSensorModule#getOpticalSensor <em>Optical Sensor</em>}</li>
 *   <li>{@link xPPU.ModuleRepository.OpticalSensorModule#getBusSlave <em>Bus Slave</em>}</li>
 * </ul>
 *
 * @see xPPU.ModuleRepository.ModuleRepositoryPackage#getOpticalSensorModule()
 * @model
 * @generated
 */
public interface OpticalSensorModule extends Module {
	/**
	 * Returns the value of the '<em><b>Optical Sensor</b></em>' containment reference list.
	 * The list contents are of type {@link xPPU.ComponentRepository.OpticalSensor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optical Sensor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optical Sensor</em>' containment reference list.
	 * @see xPPU.ModuleRepository.ModuleRepositoryPackage#getOpticalSensorModule_OpticalSensor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<OpticalSensor> getOpticalSensor();

	/**
	 * Returns the value of the '<em><b>Bus Slave</b></em>' containment reference list.
	 * The list contents are of type {@link xPPU.BusComponents.BusSlave}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus Slave</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Slave</em>' containment reference list.
	 * @see xPPU.ModuleRepository.ModuleRepositoryPackage#getOpticalSensorModule_BusSlave()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<BusSlave> getBusSlave();

} // OpticalSensorModule
