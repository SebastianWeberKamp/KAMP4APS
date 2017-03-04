/**
 */
package xPPU.ModuleRepository;

import org.eclipse.emf.common.util.EList;

import xPPU.BusComponents.BusBox;
import xPPU.BusComponents.BusCable;
import xPPU.BusComponents.BusSlave;

import xPPU.ComponentRepository.SimpleMotor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Motor Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPPU.ModuleRepository.MotorModule#getSimpleMotor <em>Simple Motor</em>}</li>
 *   <li>{@link xPPU.ModuleRepository.MotorModule#getBusSlave <em>Bus Slave</em>}</li>
 *   <li>{@link xPPU.ModuleRepository.MotorModule#getBusBox <em>Bus Box</em>}</li>
 *   <li>{@link xPPU.ModuleRepository.MotorModule#getBusCable <em>Bus Cable</em>}</li>
 * </ul>
 *
 * @see xPPU.ModuleRepository.ModuleRepositoryPackage#getMotorModule()
 * @model
 * @generated
 */
public interface MotorModule extends Module {
	/**
	 * Returns the value of the '<em><b>Simple Motor</b></em>' containment reference list.
	 * The list contents are of type {@link xPPU.ComponentRepository.SimpleMotor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Motor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Motor</em>' containment reference list.
	 * @see xPPU.ModuleRepository.ModuleRepositoryPackage#getMotorModule_SimpleMotor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SimpleMotor> getSimpleMotor();

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
	 * @see xPPU.ModuleRepository.ModuleRepositoryPackage#getMotorModule_BusSlave()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<BusSlave> getBusSlave();

	/**
	 * Returns the value of the '<em><b>Bus Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus Box</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Box</em>' containment reference.
	 * @see #setBusBox(BusBox)
	 * @see xPPU.ModuleRepository.ModuleRepositoryPackage#getMotorModule_BusBox()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BusBox getBusBox();

	/**
	 * Sets the value of the '{@link xPPU.ModuleRepository.MotorModule#getBusBox <em>Bus Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus Box</em>' containment reference.
	 * @see #getBusBox()
	 * @generated
	 */
	void setBusBox(BusBox value);

	/**
	 * Returns the value of the '<em><b>Bus Cable</b></em>' containment reference list.
	 * The list contents are of type {@link xPPU.BusComponents.BusCable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus Cable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Cable</em>' containment reference list.
	 * @see xPPU.ModuleRepository.ModuleRepositoryPackage#getMotorModule_BusCable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<BusCable> getBusCable();

} // MotorModule
