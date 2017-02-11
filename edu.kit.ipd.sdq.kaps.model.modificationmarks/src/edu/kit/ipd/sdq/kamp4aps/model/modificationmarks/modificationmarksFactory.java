/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.modificationmarks;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.modificationmarksPackage
 * @generated
 */
public interface modificationmarksFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	modificationmarksFactory eINSTANCE = edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.impl.modificationmarksFactoryImpl.init();

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
	ModifySensor createModifySensor();

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
	ModifyBusBox createModifyBusBox();

	/**
	 * Returns a new object of class '<em>Modify Power Supply</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modify Power Supply</em>'.
	 * @generated
	 */
	ModifyPowerSupply createModifyPowerSupply();

	/**
	 * Returns a new object of class '<em>Modify Signalinterface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modify Signalinterface</em>'.
	 * @generated
	 */
	ModifySignalinterface createModifySignalinterface();

	/**
	 * Returns a new object of class '<em>Modify Physical Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modify Physical Connection</em>'.
	 * @generated
	 */
	ModifyPhysicalConnection createModifyPhysicalConnection();

	/**
	 * Returns a new object of class '<em>Modify Micro Switch Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modify Micro Switch Module</em>'.
	 * @generated
	 */
	ModifyMicroSwitchModule createModifyMicroSwitchModule();

	/**
	 * Returns a new object of class '<em>Modify Bus Master</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modify Bus Master</em>'.
	 * @generated
	 */
	ModifyBusMaster createModifyBusMaster();

	/**
	 * Returns a new object of class '<em>Modify Bus Slave</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modify Bus Slave</em>'.
	 * @generated
	 */
	ModifyBusSlave createModifyBusSlave();

	/**
	 * Returns a new object of class '<em>Modify Bus Cable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modify Bus Cable</em>'.
	 * @generated
	 */
	ModifyBusCable createModifyBusCable();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	modificationmarksPackage getmodificationmarksPackage();

} //modificationmarksFactory
