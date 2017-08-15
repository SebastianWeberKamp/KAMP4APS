/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.modificationmarks;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep;

import org.eclipse.emf.common.util.EList;

import xPPU.ComponentRepository.Component;

import xPPU.InterfaceRepository.Interface;

import xPPU.ModuleRepository.Module;

import xPPU.StructureRepository.Structure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Propagation Due To Hardware Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ChangePropagationDueToHardwareChange#getSensorModifications <em>Sensor Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ChangePropagationDueToHardwareChange#getSignalinterfaceModifications <em>Signalinterface Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ChangePropagationDueToHardwareChange#getPhysicalConnectionModifications <em>Physical Connection Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ChangePropagationDueToHardwareChange#getMicroSwitchModuleModifications <em>Micro Switch Module Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ChangePropagationDueToHardwareChange#getBusBoxModifications <em>Bus Box Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ChangePropagationDueToHardwareChange#getBusMasterModifications <em>Bus Master Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ChangePropagationDueToHardwareChange#getBusSlaveModifications <em>Bus Slave Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ChangePropagationDueToHardwareChange#getBusCableModifications <em>Bus Cable Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ChangePropagationDueToHardwareChange#getInterfaceModifications <em>Interface Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ChangePropagationDueToHardwareChange#getComponentModifications <em>Component Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ChangePropagationDueToHardwareChange#getStructureModifications <em>Structure Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ChangePropagationDueToHardwareChange#getModuleModifications <em>Module Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ChangePropagationDueToHardwareChange#isChanged <em>Changed</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModificationmarksPackage#getChangePropagationDueToHardwareChange()
 * @model
 * @generated
 */
public interface ChangePropagationDueToHardwareChange extends ChangePropagationStep {
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
	 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModificationmarksPackage#getChangePropagationDueToHardwareChange_SensorModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModifySensor> getSensorModifications();

	/**
	 * Returns the value of the '<em><b>Signalinterface Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifySignalinterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signalinterface Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signalinterface Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModificationmarksPackage#getChangePropagationDueToHardwareChange_SignalinterfaceModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModifySignalinterface> getSignalinterfaceModifications();

	/**
	 * Returns the value of the '<em><b>Physical Connection Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyPhysicalConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physical Connection Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical Connection Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModificationmarksPackage#getChangePropagationDueToHardwareChange_PhysicalConnectionModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModifyPhysicalConnection> getPhysicalConnectionModifications();

	/**
	 * Returns the value of the '<em><b>Micro Switch Module Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyMicroSwitchModule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Micro Switch Module Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Micro Switch Module Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModificationmarksPackage#getChangePropagationDueToHardwareChange_MicroSwitchModuleModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModifyMicroSwitchModule> getMicroSwitchModuleModifications();

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
	 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModificationmarksPackage#getChangePropagationDueToHardwareChange_BusBoxModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModifyBusBox> getBusBoxModifications();

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
	 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModificationmarksPackage#getChangePropagationDueToHardwareChange_BusMasterModifications()
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
	 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModificationmarksPackage#getChangePropagationDueToHardwareChange_BusSlaveModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModifyBusSlave> getBusSlaveModifications();

	/**
	 * Returns the value of the '<em><b>Bus Cable Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyBusCable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus Cable Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Cable Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModificationmarksPackage#getChangePropagationDueToHardwareChange_BusCableModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModifyBusCable> getBusCableModifications();

	/**
	 * Returns the value of the '<em><b>Interface Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyInterface}&lt;xPPU.InterfaceRepository.Interface>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModificationmarksPackage#getChangePropagationDueToHardwareChange_InterfaceModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModifyInterface<Interface>> getInterfaceModifications();

	/**
	 * Returns the value of the '<em><b>Component Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyComponent}&lt;xPPU.ComponentRepository.Component>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModificationmarksPackage#getChangePropagationDueToHardwareChange_ComponentModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModifyComponent<Component>> getComponentModifications();

	/**
	 * Returns the value of the '<em><b>Structure Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyStructure}&lt;xPPU.StructureRepository.Structure>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structure Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModificationmarksPackage#getChangePropagationDueToHardwareChange_StructureModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModifyStructure<Structure>> getStructureModifications();

	/**
	 * Returns the value of the '<em><b>Module Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyModule}&lt;xPPU.ModuleRepository.Module>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModificationmarksPackage#getChangePropagationDueToHardwareChange_ModuleModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModifyModule<Module>> getModuleModifications();

	/**
	 * Returns the value of the '<em><b>Changed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Changed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changed</em>' attribute.
	 * @see #setChanged(boolean)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModificationmarksPackage#getChangePropagationDueToHardwareChange_Changed()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isChanged();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ChangePropagationDueToHardwareChange#isChanged <em>Changed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Changed</em>' attribute.
	 * @see #isChanged()
	 * @generated
	 */
	void setChanged(boolean value);

} // ChangePropagationDueToHardwareChange
