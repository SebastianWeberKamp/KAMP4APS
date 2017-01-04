/**
 */
package edu.kit.ipd.sdq.kaps.model.modificationmarks;

import org.eclipse.emf.ecore.EFactory;
import org.palladiosimulator.pcm.repository.Role;
import xPPU.BusBox;
import xPPU.BusComponents.BusCable;
import xPPU.BusComponents.BusMaster;
import xPPU.BusComponents.BusSlave;
import xPPU.ComponentRepository.MicroswitchModule;
import xPPU.Interface;
import xPPU.InterfaceRepository.PhysicalConnection;
import xPPU.InterfaceRepository.SignalInterface;
import xPPU.PowerSupply;
import xPPU.Sensor;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.modificationmarksPackage
 * @generated
 */
public interface modificationmarksFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	modificationmarksFactory eINSTANCE = edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.modificationmarksFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>KAPS Modification Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>KAPS Modification Repository</em>'.
	 * @generated
	 */
	KAPSModificationRepository createKAPSModificationRepository();

	/**
	 * Returns a new object of class '<em>KAPS Seed Modifications</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>KAPS Seed Modifications</em>'.
	 * @generated
	 */
	KAPSSeedModifications createKAPSSeedModifications();

	/**
	 * Returns a new object of class '<em>Modify Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modify Sensor</em>'.
	 * @generated
	 */
	<T extends xPPU.ComponentRepository.Sensor> ModifySensor<T> createModifySensor();

	/**
	 * Returns a new object of class '<em>Change Propagation Due To Hardware Change</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Propagation Due To Hardware Change</em>'.
	 * @generated
	 */
	ChangePropagationDueToHardwareChange createChangePropagationDueToHardwareChange();

	/**
	 * Returns a new object of class '<em>Modify Bus Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modify Bus Box</em>'.
	 * @generated
	 */
	<T extends xPPU.BusComponents.BusBox> ModifyBusBox<T> createModifyBusBox();

	/**
	 * Returns a new object of class '<em>Modify Power Supply</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modify Power Supply</em>'.
	 * @generated
	 */
	<T extends xPPU.ComponentRepository.PowerSupply> ModifyPowerSupply<T> createModifyPowerSupply();

	/**
	 * Returns a new object of class '<em>Modify Signalinterface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modify Signalinterface</em>'.
	 * @generated
	 */
	<T extends SignalInterface> ModifySignalinterface<T> createModifySignalinterface();

	/**
	 * Returns a new object of class '<em>Modify Physical Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modify Physical Connection</em>'.
	 * @generated
	 */
	<T extends PhysicalConnection> ModifyPhysicalConnection<T> createModifyPhysicalConnection();

	/**
	 * Returns a new object of class '<em>Modify Micro Switch Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modify Micro Switch Module</em>'.
	 * @generated
	 */
	<T extends MicroswitchModule> ModifyMicroSwitchModule<T> createModifyMicroSwitchModule();

	/**
	 * Returns a new object of class '<em>Modify Bus Master</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modify Bus Master</em>'.
	 * @generated
	 */
	<T extends BusMaster> ModifyBusMaster<T> createModifyBusMaster();

	/**
	 * Returns a new object of class '<em>Modify Bus Slave</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modify Bus Slave</em>'.
	 * @generated
	 */
	<T extends BusSlave> ModifyBusSlave<T> createModifyBusSlave();

	/**
	 * Returns a new object of class '<em>Modify Bus Cable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modify Bus Cable</em>'.
	 * @generated
	 */
	<T extends BusCable> ModifyBusCable<T> createModifyBusCable();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	modificationmarksPackage getmodificationmarksPackage();

} //modificationmarksFactory
