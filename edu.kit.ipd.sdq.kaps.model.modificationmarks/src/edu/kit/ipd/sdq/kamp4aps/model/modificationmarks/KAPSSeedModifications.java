/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.modificationmarks;

import edu.kit.ipd.sdq.amp.model.modificationmarks.AbstractSeedModifications;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KAPS Seed Modifications</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.KAPSSeedModifications#getBusBoxModifications <em>Bus Box Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.KAPSSeedModifications#getSensorModifications <em>Sensor Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.KAPSSeedModifications#getBusMasterModifications <em>Bus Master Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.KAPSSeedModifications#getBusSlaveModifications <em>Bus Slave Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.KAPSSeedModifications#getMicroswitchModuleModifications <em>Microswitch Module Modifications</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.modificationmarksPackage#getKAPSSeedModifications()
 * @model
 * @generated
 */
public interface KAPSSeedModifications extends AbstractSeedModifications {
	/**
	 * Returns the value of the '<em><b>Bus Box Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyBusBox}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus Box Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Box Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.modificationmarksPackage#getKAPSSeedModifications_BusBoxModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModifyBusBox> getBusBoxModifications();

	/**
	 * Returns the value of the '<em><b>Sensor Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifySensor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.modificationmarksPackage#getKAPSSeedModifications_SensorModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModifySensor> getSensorModifications();

	/**
	 * Returns the value of the '<em><b>Bus Master Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyBusMaster}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus Master Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Master Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.modificationmarksPackage#getKAPSSeedModifications_BusMasterModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModifyBusMaster> getBusMasterModifications();

	/**
	 * Returns the value of the '<em><b>Bus Slave Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyBusSlave}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus Slave Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Slave Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.modificationmarksPackage#getKAPSSeedModifications_BusSlaveModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModifyBusSlave> getBusSlaveModifications();

	/**
	 * Returns the value of the '<em><b>Microswitch Module Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyMicroSwitchModule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Microswitch Module Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Microswitch Module Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.modificationmarksPackage#getKAPSSeedModifications_MicroswitchModuleModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModifyMicroSwitchModule> getMicroswitchModuleModifications();

} // KAPSSeedModifications
