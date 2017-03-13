/**
 */
package xPPU.InterfaceRepository.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import xPPU.BusComponents.BusComponentsPackage;

import xPPU.BusComponents.impl.BusComponentsPackageImpl;

import xPPU.ComponentRepository.ComponentRepositoryPackage;

import xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl;

import xPPU.ElectronicComponents.ElectronicComponentsPackage;

import xPPU.ElectronicComponents.impl.ElectronicComponentsPackageImpl;

import xPPU.Identifier.IdentifierPackage;

import xPPU.Identifier.impl.IdentifierPackageImpl;

import xPPU.InterfaceRepository.Clamping;
import xPPU.InterfaceRepository.Gearing;
import xPPU.InterfaceRepository.Interface;
import xPPU.InterfaceRepository.InterfaceRepository;
import xPPU.InterfaceRepository.InterfaceRepositoryFactory;
import xPPU.InterfaceRepository.InterfaceRepositoryPackage;
import xPPU.InterfaceRepository.PhysicalConnection;
import xPPU.InterfaceRepository.PneumaticSupply;
import xPPU.InterfaceRepository.Screwing;
import xPPU.InterfaceRepository.ScrewingCylinder;
import xPPU.InterfaceRepository.ScrewingFixture;
import xPPU.InterfaceRepository.ScrewingMotor;
import xPPU.InterfaceRepository.ScrewingPotentiometer;
import xPPU.InterfaceRepository.ScrewingRack;
import xPPU.InterfaceRepository.ScrewingSplitter;
import xPPU.InterfaceRepository.SignalInterface;
import xPPU.InterfaceRepository.Suspension;
import xPPU.InterfaceRepository.SuspensionArm;
import xPPU.InterfaceRepository.SuspensionRack;
import xPPU.InterfaceRepository.TransportConnection;
import xPPU.InterfaceRepository.WaterSupply;

import xPPU.MechanicalComponents.MechanicalComponentsPackage;

import xPPU.MechanicalComponents.impl.MechanicalComponentsPackageImpl;

import xPPU.ModuleRepository.ModuleRepositoryPackage;

import xPPU.ModuleRepository.impl.ModuleRepositoryPackageImpl;

import xPPU.StructureRepository.StructureRepositoryPackage;

import xPPU.StructureRepository.impl.StructureRepositoryPackageImpl;

import xPPU.XPPUPackage;

import xPPU.impl.XPPUPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InterfaceRepositoryPackageImpl extends EPackageImpl implements InterfaceRepositoryPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass screwingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass screwingSplitterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass screwingMotorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass screwingRackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass screwingCylinderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass screwingFixtureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass screwingPotentiometerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass suspensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass suspensionRackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass suspensionArmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gearingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clampingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pneumaticSupplyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass waterSupplyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transportConnectionEClass = null;

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
	 * @see xPPU.InterfaceRepository.InterfaceRepositoryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InterfaceRepositoryPackageImpl() {
		super(eNS_URI, InterfaceRepositoryFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link InterfaceRepositoryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InterfaceRepositoryPackage init() {
		if (isInited) return (InterfaceRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(InterfaceRepositoryPackage.eNS_URI);

		// Obtain or create and register package
		InterfaceRepositoryPackageImpl theInterfaceRepositoryPackage = (InterfaceRepositoryPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof InterfaceRepositoryPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new InterfaceRepositoryPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		XPPUPackageImpl theXPPUPackage = (XPPUPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XPPUPackage.eNS_URI) instanceof XPPUPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XPPUPackage.eNS_URI) : XPPUPackage.eINSTANCE);
		ComponentRepositoryPackageImpl theComponentRepositoryPackage = (ComponentRepositoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ComponentRepositoryPackage.eNS_URI) instanceof ComponentRepositoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ComponentRepositoryPackage.eNS_URI) : ComponentRepositoryPackage.eINSTANCE);
		BusComponentsPackageImpl theBusComponentsPackage = (BusComponentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BusComponentsPackage.eNS_URI) instanceof BusComponentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BusComponentsPackage.eNS_URI) : BusComponentsPackage.eINSTANCE);
		ElectronicComponentsPackageImpl theElectronicComponentsPackage = (ElectronicComponentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ElectronicComponentsPackage.eNS_URI) instanceof ElectronicComponentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ElectronicComponentsPackage.eNS_URI) : ElectronicComponentsPackage.eINSTANCE);
		MechanicalComponentsPackageImpl theMechanicalComponentsPackage = (MechanicalComponentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MechanicalComponentsPackage.eNS_URI) instanceof MechanicalComponentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MechanicalComponentsPackage.eNS_URI) : MechanicalComponentsPackage.eINSTANCE);
		StructureRepositoryPackageImpl theStructureRepositoryPackage = (StructureRepositoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructureRepositoryPackage.eNS_URI) instanceof StructureRepositoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructureRepositoryPackage.eNS_URI) : StructureRepositoryPackage.eINSTANCE);
		ModuleRepositoryPackageImpl theModuleRepositoryPackage = (ModuleRepositoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModuleRepositoryPackage.eNS_URI) instanceof ModuleRepositoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModuleRepositoryPackage.eNS_URI) : ModuleRepositoryPackage.eINSTANCE);
		IdentifierPackageImpl theIdentifierPackage = (IdentifierPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI) instanceof IdentifierPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI) : IdentifierPackage.eINSTANCE);

		// Create package meta-data objects
		theInterfaceRepositoryPackage.createPackageContents();
		theXPPUPackage.createPackageContents();
		theComponentRepositoryPackage.createPackageContents();
		theBusComponentsPackage.createPackageContents();
		theElectronicComponentsPackage.createPackageContents();
		theMechanicalComponentsPackage.createPackageContents();
		theStructureRepositoryPackage.createPackageContents();
		theModuleRepositoryPackage.createPackageContents();
		theIdentifierPackage.createPackageContents();

		// Initialize created meta-data
		theInterfaceRepositoryPackage.initializePackageContents();
		theXPPUPackage.initializePackageContents();
		theComponentRepositoryPackage.initializePackageContents();
		theBusComponentsPackage.initializePackageContents();
		theElectronicComponentsPackage.initializePackageContents();
		theMechanicalComponentsPackage.initializePackageContents();
		theStructureRepositoryPackage.initializePackageContents();
		theModuleRepositoryPackage.initializePackageContents();
		theIdentifierPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInterfaceRepositoryPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InterfaceRepositoryPackage.eNS_URI, theInterfaceRepositoryPackage);
		return theInterfaceRepositoryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceRepository() {
		return interfaceRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceRepository_AllInterfacesInPlant() {
		return (EReference)interfaceRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface() {
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScrewing() {
		return screwingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScrewingSplitter() {
		return screwingSplitterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScrewingMotor() {
		return screwingMotorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScrewingRack() {
		return screwingRackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScrewingCylinder() {
		return screwingCylinderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScrewingFixture() {
		return screwingFixtureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScrewingPotentiometer() {
		return screwingPotentiometerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuspension() {
		return suspensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuspensionRack() {
		return suspensionRackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuspensionArm() {
		return suspensionArmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGearing() {
		return gearingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClamping() {
		return clampingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPneumaticSupply() {
		return pneumaticSupplyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignalInterface() {
		return signalInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWaterSupply() {
		return waterSupplyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalConnection() {
		return physicalConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransportConnection() {
		return transportConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceRepositoryFactory getInterfaceRepositoryFactory() {
		return (InterfaceRepositoryFactory)getEFactoryInstance();
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
		interfaceRepositoryEClass = createEClass(INTERFACE_REPOSITORY);
		createEReference(interfaceRepositoryEClass, INTERFACE_REPOSITORY__ALL_INTERFACES_IN_PLANT);

		interfaceEClass = createEClass(INTERFACE);

		screwingEClass = createEClass(SCREWING);

		screwingSplitterEClass = createEClass(SCREWING_SPLITTER);

		screwingMotorEClass = createEClass(SCREWING_MOTOR);

		screwingRackEClass = createEClass(SCREWING_RACK);

		screwingCylinderEClass = createEClass(SCREWING_CYLINDER);

		screwingFixtureEClass = createEClass(SCREWING_FIXTURE);

		screwingPotentiometerEClass = createEClass(SCREWING_POTENTIOMETER);

		suspensionEClass = createEClass(SUSPENSION);

		suspensionRackEClass = createEClass(SUSPENSION_RACK);

		suspensionArmEClass = createEClass(SUSPENSION_ARM);

		gearingEClass = createEClass(GEARING);

		clampingEClass = createEClass(CLAMPING);

		pneumaticSupplyEClass = createEClass(PNEUMATIC_SUPPLY);

		signalInterfaceEClass = createEClass(SIGNAL_INTERFACE);

		waterSupplyEClass = createEClass(WATER_SUPPLY);

		physicalConnectionEClass = createEClass(PHYSICAL_CONNECTION);

		transportConnectionEClass = createEClass(TRANSPORT_CONNECTION);
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
		IdentifierPackage theIdentifierPackage = (IdentifierPackage)EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		interfaceRepositoryEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		interfaceEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		screwingEClass.getESuperTypes().add(this.getInterface());
		screwingSplitterEClass.getESuperTypes().add(this.getScrewing());
		screwingMotorEClass.getESuperTypes().add(this.getScrewing());
		screwingRackEClass.getESuperTypes().add(this.getScrewing());
		screwingCylinderEClass.getESuperTypes().add(this.getScrewing());
		screwingFixtureEClass.getESuperTypes().add(this.getScrewing());
		screwingPotentiometerEClass.getESuperTypes().add(this.getScrewing());
		suspensionEClass.getESuperTypes().add(this.getInterface());
		suspensionRackEClass.getESuperTypes().add(this.getSuspension());
		suspensionArmEClass.getESuperTypes().add(this.getSuspension());
		gearingEClass.getESuperTypes().add(this.getInterface());
		clampingEClass.getESuperTypes().add(this.getInterface());
		pneumaticSupplyEClass.getESuperTypes().add(this.getInterface());
		signalInterfaceEClass.getESuperTypes().add(this.getInterface());
		waterSupplyEClass.getESuperTypes().add(this.getInterface());
		physicalConnectionEClass.getESuperTypes().add(this.getInterface());
		transportConnectionEClass.getESuperTypes().add(this.getInterface());

		// Initialize classes, features, and operations; add parameters
		initEClass(interfaceRepositoryEClass, InterfaceRepository.class, "InterfaceRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceRepository_AllInterfacesInPlant(), this.getInterface(), null, "allInterfacesInPlant", null, 0, -1, InterfaceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceEClass, Interface.class, "Interface", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(screwingEClass, Screwing.class, "Screwing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(screwingSplitterEClass, ScrewingSplitter.class, "ScrewingSplitter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(screwingMotorEClass, ScrewingMotor.class, "ScrewingMotor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(screwingRackEClass, ScrewingRack.class, "ScrewingRack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(screwingCylinderEClass, ScrewingCylinder.class, "ScrewingCylinder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(screwingFixtureEClass, ScrewingFixture.class, "ScrewingFixture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(screwingPotentiometerEClass, ScrewingPotentiometer.class, "ScrewingPotentiometer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(suspensionEClass, Suspension.class, "Suspension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(suspensionRackEClass, SuspensionRack.class, "SuspensionRack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(suspensionArmEClass, SuspensionArm.class, "SuspensionArm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gearingEClass, Gearing.class, "Gearing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(clampingEClass, Clamping.class, "Clamping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pneumaticSupplyEClass, PneumaticSupply.class, "PneumaticSupply", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(signalInterfaceEClass, SignalInterface.class, "SignalInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(waterSupplyEClass, WaterSupply.class, "WaterSupply", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(physicalConnectionEClass, PhysicalConnection.class, "PhysicalConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transportConnectionEClass, TransportConnection.class, "TransportConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //InterfaceRepositoryPackageImpl
