/**
 */
package xPPU.ModuleRepository;

import org.eclipse.emf.common.util.EList;

import xPPU.BusComponents.BusSlave;

import xPPU.ComponentRepository.InductiveSensor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inductive Sensor Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPPU.ModuleRepository.InductiveSensorModule#getInductiveSensor <em>Inductive Sensor</em>}</li>
 *   <li>{@link xPPU.ModuleRepository.InductiveSensorModule#getBusSlave <em>Bus Slave</em>}</li>
 * </ul>
 *
 * @see xPPU.ModuleRepository.ModuleRepositoryPackage#getInductiveSensorModule()
 * @model
 * @generated
 */
public interface InductiveSensorModule extends Module {
	/**
	 * Returns the value of the '<em><b>Inductive Sensor</b></em>' containment reference list.
	 * The list contents are of type {@link xPPU.ComponentRepository.InductiveSensor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inductive Sensor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inductive Sensor</em>' containment reference list.
	 * @see xPPU.ModuleRepository.ModuleRepositoryPackage#getInductiveSensorModule_InductiveSensor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<InductiveSensor> getInductiveSensor();

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
	 * @see xPPU.ModuleRepository.ModuleRepositoryPackage#getInductiveSensorModule_BusSlave()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<BusSlave> getBusSlave();

} // InductiveSensorModule
