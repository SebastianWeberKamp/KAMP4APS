/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.impl;

import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import xPPU.ComponentRepository.Component;

import xPPU.InterfaceRepository.Interface;

import xPPU.ModuleRepository.Module;

import xPPU.StructureRepository.Structure;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModificationmarksFactoryImpl extends EFactoryImpl implements ModificationmarksFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModificationmarksFactory init() {
		try {
			ModificationmarksFactory theModificationmarksFactory = (ModificationmarksFactory)EPackage.Registry.INSTANCE.getEFactory(ModificationmarksPackage.eNS_URI);
			if (theModificationmarksFactory != null) {
				return theModificationmarksFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModificationmarksFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModificationmarksFactoryImpl() {
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
			case ModificationmarksPackage.KAPS_MODIFICATION_REPOSITORY: return createKAPSModificationRepository();
			case ModificationmarksPackage.KAPS_SEED_MODIFICATIONS: return createKAPSSeedModifications();
			case ModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE: return createChangePropagationDueToHardwareChange();
			case ModificationmarksPackage.MODIFY_COMPONENT: return createModifyComponent();
			case ModificationmarksPackage.MODIFY_MODULE: return createModifyModule();
			case ModificationmarksPackage.MODIFY_STRUCTURE: return createModifyStructure();
			case ModificationmarksPackage.MODIFY_INTERFACE: return createModifyInterface();
			case ModificationmarksPackage.MODIFY_SIGNALINTERFACE: return createModifySignalinterface();
			case ModificationmarksPackage.MODIFY_PHYSICAL_CONNECTION: return createModifyPhysicalConnection();
			case ModificationmarksPackage.MODIFY_MICRO_SWITCH_MODULE: return createModifyMicroSwitchModule();
			case ModificationmarksPackage.MODIFY_BUS_BOX: return createModifyBusBox();
			case ModificationmarksPackage.MODIFY_BUS_MASTER: return createModifyBusMaster();
			case ModificationmarksPackage.MODIFY_BUS_SLAVE: return createModifyBusSlave();
			case ModificationmarksPackage.MODIFY_BUS_CABLE: return createModifyBusCable();
			case ModificationmarksPackage.MODIFY_SENSOR: return createModifySensor();
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
	public ChangePropagationDueToHardwareChange createChangePropagationDueToHardwareChange() {
		ChangePropagationDueToHardwareChangeImpl changePropagationDueToHardwareChange = new ChangePropagationDueToHardwareChangeImpl();
		return changePropagationDueToHardwareChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Component> ModifyComponent<T> createModifyComponent() {
		ModifyComponentImpl<T> modifyComponent = new ModifyComponentImpl<T>();
		return modifyComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Module> ModifyModule<T> createModifyModule() {
		ModifyModuleImpl<T> modifyModule = new ModifyModuleImpl<T>();
		return modifyModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Structure> ModifyStructure<T> createModifyStructure() {
		ModifyStructureImpl<T> modifyStructure = new ModifyStructureImpl<T>();
		return modifyStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Interface> ModifyInterface<T> createModifyInterface() {
		ModifyInterfaceImpl<T> modifyInterface = new ModifyInterfaceImpl<T>();
		return modifyInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifySignalinterface createModifySignalinterface() {
		ModifySignalinterfaceImpl modifySignalinterface = new ModifySignalinterfaceImpl();
		return modifySignalinterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifyPhysicalConnection createModifyPhysicalConnection() {
		ModifyPhysicalConnectionImpl modifyPhysicalConnection = new ModifyPhysicalConnectionImpl();
		return modifyPhysicalConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifyMicroSwitchModule createModifyMicroSwitchModule() {
		ModifyMicroSwitchModuleImpl modifyMicroSwitchModule = new ModifyMicroSwitchModuleImpl();
		return modifyMicroSwitchModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifyBusBox createModifyBusBox() {
		ModifyBusBoxImpl modifyBusBox = new ModifyBusBoxImpl();
		return modifyBusBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifyBusMaster createModifyBusMaster() {
		ModifyBusMasterImpl modifyBusMaster = new ModifyBusMasterImpl();
		return modifyBusMaster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifyBusSlave createModifyBusSlave() {
		ModifyBusSlaveImpl modifyBusSlave = new ModifyBusSlaveImpl();
		return modifyBusSlave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifyBusCable createModifyBusCable() {
		ModifyBusCableImpl modifyBusCable = new ModifyBusCableImpl();
		return modifyBusCable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifySensor createModifySensor() {
		ModifySensorImpl modifySensor = new ModifySensorImpl();
		return modifySensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModificationmarksPackage getModificationmarksPackage() {
		return (ModificationmarksPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModificationmarksPackage getPackage() {
		return ModificationmarksPackage.eINSTANCE;
	}

} //ModificationmarksFactoryImpl
