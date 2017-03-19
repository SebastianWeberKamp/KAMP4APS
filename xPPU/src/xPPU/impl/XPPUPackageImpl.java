/**
 */
package xPPU.impl;

import org.eclipse.emf.ecore.EAttribute;
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

import xPPU.InterfaceRepository.InterfaceRepositoryPackage;

import xPPU.InterfaceRepository.impl.InterfaceRepositoryPackageImpl;

import xPPU.MechanicalComponents.MechanicalComponentsPackage;

import xPPU.MechanicalComponents.impl.MechanicalComponentsPackageImpl;

import xPPU.ModuleRepository.ModuleRepositoryPackage;

import xPPU.ModuleRepository.impl.ModuleRepositoryPackageImpl;

import xPPU.Plant;

import xPPU.StructureRepository.StructureRepositoryPackage;

import xPPU.StructureRepository.impl.StructureRepositoryPackageImpl;

import xPPU.XPPUFactory;
import xPPU.XPPUPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XPPUPackageImpl extends EPackageImpl implements XPPUPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plantEClass = null;

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
	 * @see xPPU.XPPUPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private XPPUPackageImpl() {
		super(eNS_URI, XPPUFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link XPPUPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static XPPUPackage init() {
		if (isInited) return (XPPUPackage)EPackage.Registry.INSTANCE.getEPackage(XPPUPackage.eNS_URI);

		// Obtain or create and register package
		XPPUPackageImpl theXPPUPackage = (XPPUPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof XPPUPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new XPPUPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ComponentRepositoryPackageImpl theComponentRepositoryPackage = (ComponentRepositoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ComponentRepositoryPackage.eNS_URI) instanceof ComponentRepositoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ComponentRepositoryPackage.eNS_URI) : ComponentRepositoryPackage.eINSTANCE);
		BusComponentsPackageImpl theBusComponentsPackage = (BusComponentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BusComponentsPackage.eNS_URI) instanceof BusComponentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BusComponentsPackage.eNS_URI) : BusComponentsPackage.eINSTANCE);
		ElectronicComponentsPackageImpl theElectronicComponentsPackage = (ElectronicComponentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ElectronicComponentsPackage.eNS_URI) instanceof ElectronicComponentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ElectronicComponentsPackage.eNS_URI) : ElectronicComponentsPackage.eINSTANCE);
		MechanicalComponentsPackageImpl theMechanicalComponentsPackage = (MechanicalComponentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MechanicalComponentsPackage.eNS_URI) instanceof MechanicalComponentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MechanicalComponentsPackage.eNS_URI) : MechanicalComponentsPackage.eINSTANCE);
		StructureRepositoryPackageImpl theStructureRepositoryPackage = (StructureRepositoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructureRepositoryPackage.eNS_URI) instanceof StructureRepositoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructureRepositoryPackage.eNS_URI) : StructureRepositoryPackage.eINSTANCE);
		ModuleRepositoryPackageImpl theModuleRepositoryPackage = (ModuleRepositoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModuleRepositoryPackage.eNS_URI) instanceof ModuleRepositoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModuleRepositoryPackage.eNS_URI) : ModuleRepositoryPackage.eINSTANCE);
		InterfaceRepositoryPackageImpl theInterfaceRepositoryPackage = (InterfaceRepositoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InterfaceRepositoryPackage.eNS_URI) instanceof InterfaceRepositoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InterfaceRepositoryPackage.eNS_URI) : InterfaceRepositoryPackage.eINSTANCE);
		IdentifierPackageImpl theIdentifierPackage = (IdentifierPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI) instanceof IdentifierPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI) : IdentifierPackage.eINSTANCE);

		// Create package meta-data objects
		theXPPUPackage.createPackageContents();
		theComponentRepositoryPackage.createPackageContents();
		theBusComponentsPackage.createPackageContents();
		theElectronicComponentsPackage.createPackageContents();
		theMechanicalComponentsPackage.createPackageContents();
		theStructureRepositoryPackage.createPackageContents();
		theModuleRepositoryPackage.createPackageContents();
		theInterfaceRepositoryPackage.createPackageContents();
		theIdentifierPackage.createPackageContents();

		// Initialize created meta-data
		theXPPUPackage.initializePackageContents();
		theComponentRepositoryPackage.initializePackageContents();
		theBusComponentsPackage.initializePackageContents();
		theElectronicComponentsPackage.initializePackageContents();
		theMechanicalComponentsPackage.initializePackageContents();
		theStructureRepositoryPackage.initializePackageContents();
		theModuleRepositoryPackage.initializePackageContents();
		theInterfaceRepositoryPackage.initializePackageContents();
		theIdentifierPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theXPPUPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(XPPUPackage.eNS_URI, theXPPUPackage);
		return theXPPUPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlant() {
		return plantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlant_PlantName() {
		return (EAttribute)plantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlant_Structures() {
		return (EReference)plantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlant_InterfaceRepository() {
		return (EReference)plantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlant_ComponentRepository() {
		return (EReference)plantEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPPUFactory getXPPUFactory() {
		return (XPPUFactory)getEFactoryInstance();
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
		plantEClass = createEClass(PLANT);
		createEAttribute(plantEClass, PLANT__PLANT_NAME);
		createEReference(plantEClass, PLANT__STRUCTURES);
		createEReference(plantEClass, PLANT__INTERFACE_REPOSITORY);
		createEReference(plantEClass, PLANT__COMPONENT_REPOSITORY);
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
		ComponentRepositoryPackage theComponentRepositoryPackage = (ComponentRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentRepositoryPackage.eNS_URI);
		BusComponentsPackage theBusComponentsPackage = (BusComponentsPackage)EPackage.Registry.INSTANCE.getEPackage(BusComponentsPackage.eNS_URI);
		ElectronicComponentsPackage theElectronicComponentsPackage = (ElectronicComponentsPackage)EPackage.Registry.INSTANCE.getEPackage(ElectronicComponentsPackage.eNS_URI);
		MechanicalComponentsPackage theMechanicalComponentsPackage = (MechanicalComponentsPackage)EPackage.Registry.INSTANCE.getEPackage(MechanicalComponentsPackage.eNS_URI);
		StructureRepositoryPackage theStructureRepositoryPackage = (StructureRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(StructureRepositoryPackage.eNS_URI);
		ModuleRepositoryPackage theModuleRepositoryPackage = (ModuleRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(ModuleRepositoryPackage.eNS_URI);
		InterfaceRepositoryPackage theInterfaceRepositoryPackage = (InterfaceRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(InterfaceRepositoryPackage.eNS_URI);
		IdentifierPackage theIdentifierPackage = (IdentifierPackage)EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theComponentRepositoryPackage);
		getESubpackages().add(theBusComponentsPackage);
		getESubpackages().add(theElectronicComponentsPackage);
		getESubpackages().add(theMechanicalComponentsPackage);
		getESubpackages().add(theStructureRepositoryPackage);
		getESubpackages().add(theModuleRepositoryPackage);
		getESubpackages().add(theInterfaceRepositoryPackage);
		getESubpackages().add(theIdentifierPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		plantEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());

		// Initialize classes, features, and operations; add parameters
		initEClass(plantEClass, Plant.class, "Plant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlant_PlantName(), ecorePackage.getEString(), "PlantName", null, 0, 1, Plant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlant_Structures(), theStructureRepositoryPackage.getStructure(), theStructureRepositoryPackage.getStructure_ParentPlant(), "structures", null, 0, -1, Plant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlant_InterfaceRepository(), theInterfaceRepositoryPackage.getInterfaceRepository(), null, "interfaceRepository", null, 1, 1, Plant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlant_ComponentRepository(), theComponentRepositoryPackage.getComponentRepository(), null, "componentRepository", null, 1, 1, Plant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //XPPUPackageImpl
