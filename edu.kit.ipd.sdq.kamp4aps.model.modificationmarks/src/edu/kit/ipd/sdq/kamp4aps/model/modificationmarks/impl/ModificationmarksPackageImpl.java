/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.impl;

import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.AbstractKAPSModificationRepository;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ChangePropagationDueToHardwareChange;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.KAPSModificationRepository;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.KAPSSeedModifications;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModificationmarksFactory;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModificationmarksPackage;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyBusBox;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyBusCable;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyBusMaster;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyBusSlave;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyComponent;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyEntity;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyInterface;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyMicroSwitchModule;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyModule;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyPhysicalConnection;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifySensor;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifySignalinterface;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyStructure;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import xPPU.BusComponents.BusComponentsPackage;

import xPPU.ComponentRepository.ComponentRepositoryPackage;

import xPPU.InterfaceRepository.InterfaceRepositoryPackage;

import xPPU.ModuleRepository.ModuleRepositoryPackage;

import xPPU.StructureRepository.StructureRepositoryPackage;

import xPPU.XPPUPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModificationmarksPackageImpl extends EPackageImpl implements ModificationmarksPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractKAPSModificationRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kapsModificationRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kapsSeedModificationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changePropagationDueToHardwareChangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifyEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifyComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifyModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifyStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifyInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifySignalinterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifyPhysicalConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifyMicroSwitchModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifyBusBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifyBusMasterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifyBusSlaveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifyBusCableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifySensorEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModificationmarksPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModificationmarksPackageImpl() {
		super(eNS_URI, ModificationmarksFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ModificationmarksPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModificationmarksPackage init() {
		if (isInited) return (ModificationmarksPackage)EPackage.Registry.INSTANCE.getEPackage(ModificationmarksPackage.eNS_URI);

		// Obtain or create and register package
		ModificationmarksPackageImpl theModificationmarksPackage = (ModificationmarksPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModificationmarksPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModificationmarksPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage.eINSTANCE.eClass();
		XPPUPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theModificationmarksPackage.createPackageContents();

		// Initialize created meta-data
		theModificationmarksPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModificationmarksPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModificationmarksPackage.eNS_URI, theModificationmarksPackage);
		return theModificationmarksPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractKAPSModificationRepository() {
		return abstractKAPSModificationRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKAPSModificationRepository() {
		return kapsModificationRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKAPSSeedModifications() {
		return kapsSeedModificationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKAPSSeedModifications_StructureModifications() {
		return (EReference)kapsSeedModificationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKAPSSeedModifications_ModuleModifications() {
		return (EReference)kapsSeedModificationsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKAPSSeedModifications_ComponentModifications() {
		return (EReference)kapsSeedModificationsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKAPSSeedModifications_InterfaceModifications() {
		return (EReference)kapsSeedModificationsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangePropagationDueToHardwareChange() {
		return changePropagationDueToHardwareChangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangePropagationDueToHardwareChange_SensorModifications() {
		return (EReference)changePropagationDueToHardwareChangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangePropagationDueToHardwareChange_SignalinterfaceModifications() {
		return (EReference)changePropagationDueToHardwareChangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangePropagationDueToHardwareChange_PhysicalConnectionModifications() {
		return (EReference)changePropagationDueToHardwareChangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangePropagationDueToHardwareChange_MicroSwitchModuleModifications() {
		return (EReference)changePropagationDueToHardwareChangeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangePropagationDueToHardwareChange_BusBoxModifications() {
		return (EReference)changePropagationDueToHardwareChangeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangePropagationDueToHardwareChange_BusMasterModifications() {
		return (EReference)changePropagationDueToHardwareChangeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangePropagationDueToHardwareChange_BusSlaveModifications() {
		return (EReference)changePropagationDueToHardwareChangeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangePropagationDueToHardwareChange_BusCableModifications() {
		return (EReference)changePropagationDueToHardwareChangeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangePropagationDueToHardwareChange_InterfaceModifications() {
		return (EReference)changePropagationDueToHardwareChangeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangePropagationDueToHardwareChange_ComponentModifications() {
		return (EReference)changePropagationDueToHardwareChangeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangePropagationDueToHardwareChange_StructureModifications() {
		return (EReference)changePropagationDueToHardwareChangeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangePropagationDueToHardwareChange_ModuleModifications() {
		return (EReference)changePropagationDueToHardwareChangeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangePropagationDueToHardwareChange_Changed() {
		return (EAttribute)changePropagationDueToHardwareChangeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifyEntity() {
		return modifyEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifyComponent() {
		return modifyComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifyModule() {
		return modifyModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifyStructure() {
		return modifyStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifyInterface() {
		return modifyInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifySignalinterface() {
		return modifySignalinterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifyPhysicalConnection() {
		return modifyPhysicalConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifyMicroSwitchModule() {
		return modifyMicroSwitchModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModifyMicroSwitchModule_IsReplaced() {
		return (EAttribute)modifyMicroSwitchModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifyBusBox() {
		return modifyBusBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifyBusMaster() {
		return modifyBusMasterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifyBusSlave() {
		return modifyBusSlaveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifyBusCable() {
		return modifyBusCableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifySensor() {
		return modifySensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModifySensor_ModifySignalInterfaces() {
		return (EReference)modifySensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModifySensor_ModifyPhysicalConnections() {
		return (EReference)modifySensorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModificationmarksFactory getModificationmarksFactory() {
		return (ModificationmarksFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		abstractKAPSModificationRepositoryEClass = createEClass(ABSTRACT_KAPS_MODIFICATION_REPOSITORY);

		kapsModificationRepositoryEClass = createEClass(KAPS_MODIFICATION_REPOSITORY);

		kapsSeedModificationsEClass = createEClass(KAPS_SEED_MODIFICATIONS);
		createEReference(kapsSeedModificationsEClass, KAPS_SEED_MODIFICATIONS__STRUCTURE_MODIFICATIONS);
		createEReference(kapsSeedModificationsEClass, KAPS_SEED_MODIFICATIONS__MODULE_MODIFICATIONS);
		createEReference(kapsSeedModificationsEClass, KAPS_SEED_MODIFICATIONS__COMPONENT_MODIFICATIONS);
		createEReference(kapsSeedModificationsEClass, KAPS_SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS);

		changePropagationDueToHardwareChangeEClass = createEClass(CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE);
		createEReference(changePropagationDueToHardwareChangeEClass, CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__SENSOR_MODIFICATIONS);
		createEReference(changePropagationDueToHardwareChangeEClass, CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__SIGNALINTERFACE_MODIFICATIONS);
		createEReference(changePropagationDueToHardwareChangeEClass, CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__PHYSICAL_CONNECTION_MODIFICATIONS);
		createEReference(changePropagationDueToHardwareChangeEClass, CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__MICRO_SWITCH_MODULE_MODIFICATIONS);
		createEReference(changePropagationDueToHardwareChangeEClass, CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_BOX_MODIFICATIONS);
		createEReference(changePropagationDueToHardwareChangeEClass, CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_MASTER_MODIFICATIONS);
		createEReference(changePropagationDueToHardwareChangeEClass, CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_SLAVE_MODIFICATIONS);
		createEReference(changePropagationDueToHardwareChangeEClass, CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_CABLE_MODIFICATIONS);
		createEReference(changePropagationDueToHardwareChangeEClass, CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__INTERFACE_MODIFICATIONS);
		createEReference(changePropagationDueToHardwareChangeEClass, CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__COMPONENT_MODIFICATIONS);
		createEReference(changePropagationDueToHardwareChangeEClass, CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__STRUCTURE_MODIFICATIONS);
		createEReference(changePropagationDueToHardwareChangeEClass, CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__MODULE_MODIFICATIONS);
		createEAttribute(changePropagationDueToHardwareChangeEClass, CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__CHANGED);

		modifyEntityEClass = createEClass(MODIFY_ENTITY);

		modifyComponentEClass = createEClass(MODIFY_COMPONENT);

		modifyModuleEClass = createEClass(MODIFY_MODULE);

		modifyStructureEClass = createEClass(MODIFY_STRUCTURE);

		modifyInterfaceEClass = createEClass(MODIFY_INTERFACE);

		modifySignalinterfaceEClass = createEClass(MODIFY_SIGNALINTERFACE);

		modifyPhysicalConnectionEClass = createEClass(MODIFY_PHYSICAL_CONNECTION);

		modifyMicroSwitchModuleEClass = createEClass(MODIFY_MICRO_SWITCH_MODULE);
		createEAttribute(modifyMicroSwitchModuleEClass, MODIFY_MICRO_SWITCH_MODULE__IS_REPLACED);

		modifyBusBoxEClass = createEClass(MODIFY_BUS_BOX);

		modifyBusMasterEClass = createEClass(MODIFY_BUS_MASTER);

		modifyBusSlaveEClass = createEClass(MODIFY_BUS_SLAVE);

		modifyBusCableEClass = createEClass(MODIFY_BUS_CABLE);

		modifySensorEClass = createEClass(MODIFY_SENSOR);
		createEReference(modifySensorEClass, MODIFY_SENSOR__MODIFY_SIGNAL_INTERFACES);
		createEReference(modifySensorEClass, MODIFY_SENSOR__MODIFY_PHYSICAL_CONNECTIONS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage theModificationmarksPackage_1 = (edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage)EPackage.Registry.INSTANCE.getEPackage(edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage.eNS_URI);
		StructureRepositoryPackage theStructureRepositoryPackage = (StructureRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(StructureRepositoryPackage.eNS_URI);
		ModuleRepositoryPackage theModuleRepositoryPackage = (ModuleRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(ModuleRepositoryPackage.eNS_URI);
		ComponentRepositoryPackage theComponentRepositoryPackage = (ComponentRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentRepositoryPackage.eNS_URI);
		InterfaceRepositoryPackage theInterfaceRepositoryPackage = (InterfaceRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(InterfaceRepositoryPackage.eNS_URI);
		XPPUPackage theXPPUPackage = (XPPUPackage)EPackage.Registry.INSTANCE.getEPackage(XPPUPackage.eNS_URI);
		BusComponentsPackage theBusComponentsPackage = (BusComponentsPackage)EPackage.Registry.INSTANCE.getEPackage(BusComponentsPackage.eNS_URI);

		// Create type parameters
		ETypeParameter abstractKAPSModificationRepositoryEClass_T = addETypeParameter(abstractKAPSModificationRepositoryEClass, "T");
		ETypeParameter modifyEntityEClass_T = addETypeParameter(modifyEntityEClass, "T");
		ETypeParameter modifyComponentEClass_T = addETypeParameter(modifyComponentEClass, "T");
		ETypeParameter modifyModuleEClass_T = addETypeParameter(modifyModuleEClass, "T");
		ETypeParameter modifyStructureEClass_T = addETypeParameter(modifyStructureEClass, "T");
		ETypeParameter modifyInterfaceEClass_T = addETypeParameter(modifyInterfaceEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getKAPSSeedModifications());
		abstractKAPSModificationRepositoryEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theXPPUPackage.getEntity());
		modifyEntityEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theComponentRepositoryPackage.getComponent());
		modifyComponentEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theModuleRepositoryPackage.getModule());
		modifyModuleEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theStructureRepositoryPackage.getStructure());
		modifyStructureEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theInterfaceRepositoryPackage.getInterface());
		modifyInterfaceEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		g1 = createEGenericType(theModificationmarksPackage_1.getAbstractModificationRepository());
		EGenericType g2 = createEGenericType(abstractKAPSModificationRepositoryEClass_T);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theModificationmarksPackage_1.getChangePropagationStep());
		g1.getETypeArguments().add(g2);
		abstractKAPSModificationRepositoryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getAbstractKAPSModificationRepository());
		g2 = createEGenericType(this.getKAPSSeedModifications());
		g1.getETypeArguments().add(g2);
		kapsModificationRepositoryEClass.getEGenericSuperTypes().add(g1);
		kapsSeedModificationsEClass.getESuperTypes().add(theModificationmarksPackage_1.getAbstractSeedModifications());
		changePropagationDueToHardwareChangeEClass.getESuperTypes().add(theModificationmarksPackage_1.getChangePropagationStep());
		g1 = createEGenericType(theModificationmarksPackage_1.getAbstractModification());
		g2 = createEGenericType(modifyEntityEClass_T);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEObject());
		g1.getETypeArguments().add(g2);
		modifyEntityEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getModifyEntity());
		g2 = createEGenericType(theComponentRepositoryPackage.getComponent());
		g1.getETypeArguments().add(g2);
		modifyComponentEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getModifyEntity());
		g2 = createEGenericType(theModuleRepositoryPackage.getModule());
		g1.getETypeArguments().add(g2);
		modifyModuleEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getModifyEntity());
		g2 = createEGenericType(theStructureRepositoryPackage.getStructure());
		g1.getETypeArguments().add(g2);
		modifyStructureEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getModifyEntity());
		g2 = createEGenericType(theInterfaceRepositoryPackage.getInterface());
		g1.getETypeArguments().add(g2);
		modifyInterfaceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getModifyInterface());
		g2 = createEGenericType(theInterfaceRepositoryPackage.getSignalInterface());
		g1.getETypeArguments().add(g2);
		modifySignalinterfaceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getModifyInterface());
		g2 = createEGenericType(theInterfaceRepositoryPackage.getPhysicalConnection());
		g1.getETypeArguments().add(g2);
		modifyPhysicalConnectionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getModifyModule());
		g2 = createEGenericType(theComponentRepositoryPackage.getMicroswitchModule());
		g1.getETypeArguments().add(g2);
		modifyMicroSwitchModuleEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getModifyComponent());
		g2 = createEGenericType(theBusComponentsPackage.getBusBox());
		g1.getETypeArguments().add(g2);
		modifyBusBoxEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getModifyComponent());
		g2 = createEGenericType(theBusComponentsPackage.getBusMaster());
		g1.getETypeArguments().add(g2);
		modifyBusMasterEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getModifyComponent());
		g2 = createEGenericType(theBusComponentsPackage.getBusSlave());
		g1.getETypeArguments().add(g2);
		modifyBusSlaveEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getModifyComponent());
		g2 = createEGenericType(theBusComponentsPackage.getBusCable());
		g1.getETypeArguments().add(g2);
		modifyBusCableEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getModifyComponent());
		g2 = createEGenericType(theComponentRepositoryPackage.getSensor());
		g1.getETypeArguments().add(g2);
		modifySensorEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractKAPSModificationRepositoryEClass, AbstractKAPSModificationRepository.class, "AbstractKAPSModificationRepository", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(kapsModificationRepositoryEClass, KAPSModificationRepository.class, "KAPSModificationRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(kapsSeedModificationsEClass, KAPSSeedModifications.class, "KAPSSeedModifications", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getModifyStructure());
		g2 = createEGenericType(theStructureRepositoryPackage.getStructure());
		g1.getETypeArguments().add(g2);
		initEReference(getKAPSSeedModifications_StructureModifications(), g1, null, "structureModifications", null, 0, -1, KAPSSeedModifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getModifyModule());
		g2 = createEGenericType(theModuleRepositoryPackage.getModule());
		g1.getETypeArguments().add(g2);
		initEReference(getKAPSSeedModifications_ModuleModifications(), g1, null, "moduleModifications", null, 0, -1, KAPSSeedModifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getModifyComponent());
		g2 = createEGenericType(theComponentRepositoryPackage.getComponent());
		g1.getETypeArguments().add(g2);
		initEReference(getKAPSSeedModifications_ComponentModifications(), g1, null, "componentModifications", null, 0, -1, KAPSSeedModifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getModifyInterface());
		g2 = createEGenericType(theInterfaceRepositoryPackage.getInterface());
		g1.getETypeArguments().add(g2);
		initEReference(getKAPSSeedModifications_InterfaceModifications(), g1, null, "interfaceModifications", null, 0, -1, KAPSSeedModifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changePropagationDueToHardwareChangeEClass, ChangePropagationDueToHardwareChange.class, "ChangePropagationDueToHardwareChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChangePropagationDueToHardwareChange_SensorModifications(), this.getModifySensor(), null, "sensorModifications", null, 0, -1, ChangePropagationDueToHardwareChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChangePropagationDueToHardwareChange_SignalinterfaceModifications(), this.getModifySignalinterface(), null, "signalinterfaceModifications", null, 0, -1, ChangePropagationDueToHardwareChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChangePropagationDueToHardwareChange_PhysicalConnectionModifications(), this.getModifyPhysicalConnection(), null, "physicalConnectionModifications", null, 0, -1, ChangePropagationDueToHardwareChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChangePropagationDueToHardwareChange_MicroSwitchModuleModifications(), this.getModifyMicroSwitchModule(), null, "microSwitchModuleModifications", null, 0, -1, ChangePropagationDueToHardwareChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChangePropagationDueToHardwareChange_BusBoxModifications(), this.getModifyBusBox(), null, "busBoxModifications", null, 0, -1, ChangePropagationDueToHardwareChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChangePropagationDueToHardwareChange_BusMasterModifications(), this.getModifyBusMaster(), null, "busMasterModifications", null, 0, -1, ChangePropagationDueToHardwareChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChangePropagationDueToHardwareChange_BusSlaveModifications(), this.getModifyBusSlave(), null, "busSlaveModifications", null, 0, -1, ChangePropagationDueToHardwareChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChangePropagationDueToHardwareChange_BusCableModifications(), this.getModifyBusCable(), null, "busCableModifications", null, 0, -1, ChangePropagationDueToHardwareChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getModifyInterface());
		g2 = createEGenericType(theInterfaceRepositoryPackage.getInterface());
		g1.getETypeArguments().add(g2);
		initEReference(getChangePropagationDueToHardwareChange_InterfaceModifications(), g1, null, "interfaceModifications", null, 0, -1, ChangePropagationDueToHardwareChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getModifyComponent());
		g2 = createEGenericType(theComponentRepositoryPackage.getComponent());
		g1.getETypeArguments().add(g2);
		initEReference(getChangePropagationDueToHardwareChange_ComponentModifications(), g1, null, "componentModifications", null, 0, -1, ChangePropagationDueToHardwareChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getModifyStructure());
		g2 = createEGenericType(theStructureRepositoryPackage.getStructure());
		g1.getETypeArguments().add(g2);
		initEReference(getChangePropagationDueToHardwareChange_StructureModifications(), g1, null, "structureModifications", null, 0, -1, ChangePropagationDueToHardwareChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getModifyModule());
		g2 = createEGenericType(theModuleRepositoryPackage.getModule());
		g1.getETypeArguments().add(g2);
		initEReference(getChangePropagationDueToHardwareChange_ModuleModifications(), g1, null, "moduleModifications", null, 0, -1, ChangePropagationDueToHardwareChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangePropagationDueToHardwareChange_Changed(), ecorePackage.getEBoolean(), "changed", "false", 1, 1, ChangePropagationDueToHardwareChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modifyEntityEClass, ModifyEntity.class, "ModifyEntity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modifyComponentEClass, ModifyComponent.class, "ModifyComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modifyModuleEClass, ModifyModule.class, "ModifyModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modifyStructureEClass, ModifyStructure.class, "ModifyStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modifyInterfaceEClass, ModifyInterface.class, "ModifyInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modifySignalinterfaceEClass, ModifySignalinterface.class, "ModifySignalinterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modifyPhysicalConnectionEClass, ModifyPhysicalConnection.class, "ModifyPhysicalConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modifyMicroSwitchModuleEClass, ModifyMicroSwitchModule.class, "ModifyMicroSwitchModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModifyMicroSwitchModule_IsReplaced(), ecorePackage.getEBoolean(), "isReplaced", null, 1, 1, ModifyMicroSwitchModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modifyBusBoxEClass, ModifyBusBox.class, "ModifyBusBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modifyBusMasterEClass, ModifyBusMaster.class, "ModifyBusMaster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modifyBusSlaveEClass, ModifyBusSlave.class, "ModifyBusSlave", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modifyBusCableEClass, ModifyBusCable.class, "ModifyBusCable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modifySensorEClass, ModifySensor.class, "ModifySensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModifySensor_ModifySignalInterfaces(), theInterfaceRepositoryPackage.getSignalInterface(), null, "modifySignalInterfaces", null, 0, -1, ModifySensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModifySensor_ModifyPhysicalConnections(), theInterfaceRepositoryPackage.getPhysicalConnection(), null, "modifyPhysicalConnections", null, 0, -1, ModifySensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ModificationmarksPackageImpl
