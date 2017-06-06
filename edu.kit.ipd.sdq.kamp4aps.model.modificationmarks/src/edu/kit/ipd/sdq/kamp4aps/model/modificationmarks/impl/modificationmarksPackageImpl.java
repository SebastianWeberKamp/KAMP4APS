/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.impl;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.AbstractKAPSModificationRepository;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ChangePropagationDueToHardwareChange;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.KAPSModificationRepository;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.KAPSSeedModifications;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyBusBox;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyBusCable;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyBusMaster;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyBusSlave;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyComponent;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyInterface;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyMicroSwitchModule;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyModule;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyPhysicalConnection;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyPowerSupply;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifySensor;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifySignalinterface;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyStructure;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.modificationmarksFactory;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.modificationmarksPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;

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
public class modificationmarksPackageImpl extends EPackageImpl implements modificationmarksPackage {
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
	private EClass modifySensorEClass = null;

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
	private EClass modifyBusBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifyPowerSupplyEClass = null;

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
	 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.modificationmarksPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private modificationmarksPackageImpl() {
		super(eNS_URI, modificationmarksFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link modificationmarksPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static modificationmarksPackage init() {
		if (isInited) return (modificationmarksPackage)EPackage.Registry.INSTANCE.getEPackage(modificationmarksPackage.eNS_URI);

		// Obtain or create and register package
		modificationmarksPackageImpl themodificationmarksPackage = (modificationmarksPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof modificationmarksPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new modificationmarksPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ModificationmarksPackage.eINSTANCE.eClass();
		XPPUPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		themodificationmarksPackage.createPackageContents();

		// Initialize created meta-data
		themodificationmarksPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		themodificationmarksPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(modificationmarksPackage.eNS_URI, themodificationmarksPackage);
		return themodificationmarksPackage;
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
	public EReference getKAPSSeedModifications_BusBoxModifications() {
		return (EReference)kapsSeedModificationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKAPSSeedModifications_SensorModifications() {
		return (EReference)kapsSeedModificationsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKAPSSeedModifications_BusMasterModifications() {
		return (EReference)kapsSeedModificationsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKAPSSeedModifications_BusSlaveModifications() {
		return (EReference)kapsSeedModificationsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKAPSSeedModifications_MicroswitchModuleModifications() {
		return (EReference)kapsSeedModificationsEClass.getEStructuralFeatures().get(4);
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
	public EClass getModifyBusBox() {
		return modifyBusBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifyPowerSupply() {
		return modifyPowerSupplyEClass;
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
	public modificationmarksFactory getmodificationmarksFactory() {
		return (modificationmarksFactory)getEFactoryInstance();
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
		createEReference(kapsSeedModificationsEClass, KAPS_SEED_MODIFICATIONS__BUS_BOX_MODIFICATIONS);
		createEReference(kapsSeedModificationsEClass, KAPS_SEED_MODIFICATIONS__SENSOR_MODIFICATIONS);
		createEReference(kapsSeedModificationsEClass, KAPS_SEED_MODIFICATIONS__BUS_MASTER_MODIFICATIONS);
		createEReference(kapsSeedModificationsEClass, KAPS_SEED_MODIFICATIONS__BUS_SLAVE_MODIFICATIONS);
		createEReference(kapsSeedModificationsEClass, KAPS_SEED_MODIFICATIONS__MICROSWITCH_MODULE_MODIFICATIONS);

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

		modifyComponentEClass = createEClass(MODIFY_COMPONENT);

		modifyModuleEClass = createEClass(MODIFY_MODULE);

		modifyStructureEClass = createEClass(MODIFY_STRUCTURE);

		modifyInterfaceEClass = createEClass(MODIFY_INTERFACE);

		modifyPowerSupplyEClass = createEClass(MODIFY_POWER_SUPPLY);

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
		ModificationmarksPackage theModificationmarksPackage = (ModificationmarksPackage)EPackage.Registry.INSTANCE.getEPackage(ModificationmarksPackage.eNS_URI);
		InterfaceRepositoryPackage theInterfaceRepositoryPackage = (InterfaceRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(InterfaceRepositoryPackage.eNS_URI);
		ComponentRepositoryPackage theComponentRepositoryPackage = (ComponentRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentRepositoryPackage.eNS_URI);
		StructureRepositoryPackage theStructureRepositoryPackage = (StructureRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(StructureRepositoryPackage.eNS_URI);
		ModuleRepositoryPackage theModuleRepositoryPackage = (ModuleRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(ModuleRepositoryPackage.eNS_URI);
		BusComponentsPackage theBusComponentsPackage = (BusComponentsPackage)EPackage.Registry.INSTANCE.getEPackage(BusComponentsPackage.eNS_URI);

		// Create type parameters
		ETypeParameter abstractKAPSModificationRepositoryEClass_T = addETypeParameter(abstractKAPSModificationRepositoryEClass, "T");
		ETypeParameter modifyComponentEClass_T = addETypeParameter(modifyComponentEClass, "T");
		ETypeParameter modifyModuleEClass_T = addETypeParameter(modifyModuleEClass, "T");
		ETypeParameter modifyStructureEClass_T = addETypeParameter(modifyStructureEClass, "T");
		ETypeParameter modifyInterfaceEClass_T = addETypeParameter(modifyInterfaceEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getKAPSSeedModifications());
		abstractKAPSModificationRepositoryEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theComponentRepositoryPackage.getComponent());
		modifyComponentEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theModuleRepositoryPackage.getModule());
		modifyModuleEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theStructureRepositoryPackage.getStructure());
		modifyStructureEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theInterfaceRepositoryPackage.getInterface());
		modifyInterfaceEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		g1 = createEGenericType(theModificationmarksPackage.getAbstractModificationRepository());
		EGenericType g2 = createEGenericType(abstractKAPSModificationRepositoryEClass_T);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theModificationmarksPackage.getChangePropagationStep());
		g1.getETypeArguments().add(g2);
		abstractKAPSModificationRepositoryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getAbstractKAPSModificationRepository());
		g2 = createEGenericType(this.getKAPSSeedModifications());
		g1.getETypeArguments().add(g2);
		kapsModificationRepositoryEClass.getEGenericSuperTypes().add(g1);
		kapsSeedModificationsEClass.getESuperTypes().add(theModificationmarksPackage.getAbstractSeedModifications());
		changePropagationDueToHardwareChangeEClass.getESuperTypes().add(theModificationmarksPackage.getChangePropagationStep());
		g1 = createEGenericType(theModificationmarksPackage.getAbstractModification());
		g2 = createEGenericType(modifyComponentEClass_T);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEObject());
		g1.getETypeArguments().add(g2);
		modifyComponentEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theModificationmarksPackage.getAbstractModification());
		g2 = createEGenericType(modifyModuleEClass_T);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEObject());
		g1.getETypeArguments().add(g2);
		modifyModuleEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theModificationmarksPackage.getAbstractModification());
		g2 = createEGenericType(modifyStructureEClass_T);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEObject());
		g1.getETypeArguments().add(g2);
		modifyStructureEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theModificationmarksPackage.getAbstractModification());
		g2 = createEGenericType(modifyInterfaceEClass_T);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEObject());
		g1.getETypeArguments().add(g2);
		modifyInterfaceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getModifyComponent());
		g2 = createEGenericType(theComponentRepositoryPackage.getPowerSupply());
		g1.getETypeArguments().add(g2);
		modifyPowerSupplyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getModifyInterface());
		g2 = createEGenericType(theComponentRepositoryPackage.getPowerSupply());
		g1.getETypeArguments().add(g2);
		modifyPowerSupplyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getModifyInterface());
		g2 = createEGenericType(theInterfaceRepositoryPackage.getSignalInterface());
		g1.getETypeArguments().add(g2);
		modifySignalinterfaceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getModifyInterface());
		g2 = createEGenericType(theInterfaceRepositoryPackage.getPhysicalConnection());
		g1.getETypeArguments().add(g2);
		modifyPhysicalConnectionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getModifyComponent());
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

		// Initialize classes and features; add operations and parameters
		initEClass(abstractKAPSModificationRepositoryEClass, AbstractKAPSModificationRepository.class, "AbstractKAPSModificationRepository", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(kapsModificationRepositoryEClass, KAPSModificationRepository.class, "KAPSModificationRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(kapsSeedModificationsEClass, KAPSSeedModifications.class, "KAPSSeedModifications", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKAPSSeedModifications_BusBoxModifications(), this.getModifyBusBox(), null, "busBoxModifications", null, 0, -1, KAPSSeedModifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKAPSSeedModifications_SensorModifications(), this.getModifySensor(), null, "sensorModifications", null, 0, -1, KAPSSeedModifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKAPSSeedModifications_BusMasterModifications(), this.getModifyBusMaster(), null, "busMasterModifications", null, 0, -1, KAPSSeedModifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKAPSSeedModifications_BusSlaveModifications(), this.getModifyBusSlave(), null, "busSlaveModifications", null, 0, -1, KAPSSeedModifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKAPSSeedModifications_MicroswitchModuleModifications(), this.getModifyMicroSwitchModule(), null, "microswitchModuleModifications", null, 0, -1, KAPSSeedModifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(modifyComponentEClass, ModifyComponent.class, "ModifyComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modifyModuleEClass, ModifyModule.class, "ModifyModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modifyStructureEClass, ModifyStructure.class, "ModifyStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modifyInterfaceEClass, ModifyInterface.class, "ModifyInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modifyPowerSupplyEClass, ModifyPowerSupply.class, "ModifyPowerSupply", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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

} //modificationmarksPackageImpl
