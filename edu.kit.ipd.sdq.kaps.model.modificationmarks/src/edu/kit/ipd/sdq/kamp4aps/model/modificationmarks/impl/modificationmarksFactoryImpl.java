/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.palladiosimulator.pcm.repository.Role;

import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.*;
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
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class modificationmarksFactoryImpl extends EFactoryImpl implements modificationmarksFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static modificationmarksFactory init() {
		try {
			modificationmarksFactory themodificationmarksFactory = (modificationmarksFactory)EPackage.Registry.INSTANCE.getEFactory(modificationmarksPackage.eNS_URI);
			if (themodificationmarksFactory != null) {
				return themodificationmarksFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new modificationmarksFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public modificationmarksFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case modificationmarksPackage.KAPS_MODIFICATION_REPOSITORY: return createKAPSModificationRepository();
			case modificationmarksPackage.KAPS_SEED_MODIFICATIONS: return createKAPSSeedModifications();
			case modificationmarksPackage.MODIFY_SENSOR: return createModifySensor();
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE: return createChangePropagationDueToHardwareChange();
			case modificationmarksPackage.MODIFY_BUS_BOX: return createModifyBusBox();
			case modificationmarksPackage.MODIFY_POWER_SUPPLY: return createModifyPowerSupply();
			case modificationmarksPackage.MODIFY_SIGNALINTERFACE: return createModifySignalinterface();
			case modificationmarksPackage.MODIFY_PHYSICAL_CONNECTION: return createModifyPhysicalConnection();
			case modificationmarksPackage.MODIFY_MICRO_SWITCH_MODULE: return createModifyMicroSwitchModule();
			case modificationmarksPackage.MODIFY_BUS_MASTER: return createModifyBusMaster();
			case modificationmarksPackage.MODIFY_BUS_SLAVE: return createModifyBusSlave();
			case modificationmarksPackage.MODIFY_BUS_CABLE: return createModifyBusCable();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KAPSModificationRepository createKAPSModificationRepository() {
		KAPSModificationRepositoryImpl kapsModificationRepository = new KAPSModificationRepositoryImpl();
		return kapsModificationRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KAPSSeedModifications createKAPSSeedModifications() {
		KAPSSeedModificationsImpl kapsSeedModifications = new KAPSSeedModificationsImpl();
		return kapsSeedModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends xPPU.ComponentRepository.Sensor> ModifySensor<T> createModifySensor() {
		ModifySensorImpl<T> modifySensor = new ModifySensorImpl<T>();
		return modifySensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangePropagationDueToHardwareChange createChangePropagationDueToHardwareChange() {
		ChangePropagationDueToHardwareChangeImpl changePropagationDueToHardwareChange = new ChangePropagationDueToHardwareChangeImpl();
		return changePropagationDueToHardwareChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends xPPU.BusComponents.BusBox> ModifyBusBox<T> createModifyBusBox() {
		ModifyBusBoxImpl<T> modifyBusBox = new ModifyBusBoxImpl<T>();
		return modifyBusBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends xPPU.ComponentRepository.PowerSupply> ModifyPowerSupply<T> createModifyPowerSupply() {
		ModifyPowerSupplyImpl<T> modifyPowerSupply = new ModifyPowerSupplyImpl<T>();
		return modifyPowerSupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends SignalInterface> ModifySignalinterface<T> createModifySignalinterface() {
		ModifySignalinterfaceImpl<T> modifySignalinterface = new ModifySignalinterfaceImpl<T>();
		return modifySignalinterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends PhysicalConnection> ModifyPhysicalConnection<T> createModifyPhysicalConnection() {
		ModifyPhysicalConnectionImpl<T> modifyPhysicalConnection = new ModifyPhysicalConnectionImpl<T>();
		return modifyPhysicalConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends MicroswitchModule> ModifyMicroSwitchModule<T> createModifyMicroSwitchModule() {
		ModifyMicroSwitchModuleImpl<T> modifyMicroSwitchModule = new ModifyMicroSwitchModuleImpl<T>();
		return modifyMicroSwitchModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends BusMaster> ModifyBusMaster<T> createModifyBusMaster() {
		ModifyBusMasterImpl<T> modifyBusMaster = new ModifyBusMasterImpl<T>();
		return modifyBusMaster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends BusSlave> ModifyBusSlave<T> createModifyBusSlave() {
		ModifyBusSlaveImpl<T> modifyBusSlave = new ModifyBusSlaveImpl<T>();
		return modifyBusSlave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends BusCable> ModifyBusCable<T> createModifyBusCable() {
		ModifyBusCableImpl<T> modifyBusCable = new ModifyBusCableImpl<T>();
		return modifyBusCable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public modificationmarksPackage getmodificationmarksPackage() {
		return (modificationmarksPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static modificationmarksPackage getPackage() {
		return modificationmarksPackage.eINSTANCE;
	}

} //modificationmarksFactoryImpl
