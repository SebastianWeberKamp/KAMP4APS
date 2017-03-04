/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import xPPU.ComponentRepository.Component;
import xPPU.InterfaceRepository.Interface;
import xPPU.ModuleRepository.Module;
import xPPU.StructureRepository.Structure;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.*;

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
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE: return createChangePropagationDueToHardwareChange();
			case modificationmarksPackage.MODIFY_COMPONENT: return createModifyComponent();
			case modificationmarksPackage.MODIFY_MODULE: return createModifyModule();
			case modificationmarksPackage.MODIFY_STRUCTURE: return createModifyStructure();
			case modificationmarksPackage.MODIFY_INTERFACE: return createModifyInterface();
			case modificationmarksPackage.MODIFY_POWER_SUPPLY: return createModifyPowerSupply();
			case modificationmarksPackage.MODIFY_SIGNALINTERFACE: return createModifySignalinterface();
			case modificationmarksPackage.MODIFY_PHYSICAL_CONNECTION: return createModifyPhysicalConnection();
			case modificationmarksPackage.MODIFY_MICRO_SWITCH_MODULE: return createModifyMicroSwitchModule();
			case modificationmarksPackage.MODIFY_BUS_BOX: return createModifyBusBox();
			case modificationmarksPackage.MODIFY_BUS_MASTER: return createModifyBusMaster();
			case modificationmarksPackage.MODIFY_BUS_SLAVE: return createModifyBusSlave();
			case modificationmarksPackage.MODIFY_BUS_CABLE: return createModifyBusCable();
			case modificationmarksPackage.MODIFY_SENSOR: return createModifySensor();
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
	public ModifySensor createModifySensor() {
		ModifySensorImpl modifySensor = new ModifySensorImpl();
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
	public ModifyBusBox createModifyBusBox() {
		ModifyBusBoxImpl modifyBusBox = new ModifyBusBoxImpl();
		return modifyBusBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifyPowerSupply createModifyPowerSupply() {
		ModifyPowerSupplyImpl modifyPowerSupply = new ModifyPowerSupplyImpl();
		return modifyPowerSupply;
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
