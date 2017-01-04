/**
 */
package xPPU.ModuleRepository.impl;

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

import xPPU.InterfaceRepository.InterfaceRepositoryPackage;

import xPPU.InterfaceRepository.impl.InterfaceRepositoryPackageImpl;

import xPPU.MechanicalComponents.MechanicalComponentsPackage;

import xPPU.MechanicalComponents.impl.MechanicalComponentsPackageImpl;

import xPPU.ModuleRepository.InductiveSensorModule;
import xPPU.ModuleRepository.Module;
import xPPU.ModuleRepository.ModuleRepositoryFactory;
import xPPU.ModuleRepository.ModuleRepositoryPackage;
import xPPU.ModuleRepository.MotorModule;
import xPPU.ModuleRepository.OpticalSensorModule;
import xPPU.ModuleRepository.PresenceSensorModule;
import xPPU.ModuleRepository.PressureSensorModule;
import xPPU.ModuleRepository.PusherModule;
import xPPU.ModuleRepository.RampModule;
import xPPU.ModuleRepository.SensorModule;

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
public class ModuleRepositoryPackageImpl extends EPackageImpl implements ModuleRepositoryPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rampModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pusherModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass motorModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opticalSensorModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inductiveSensorModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass presenceSensorModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pressureSensorModuleEClass = null;

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
	 * @see xPPU.ModuleRepository.ModuleRepositoryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModuleRepositoryPackageImpl() {
		super(eNS_URI, ModuleRepositoryFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ModuleRepositoryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModuleRepositoryPackage init() {
		if (isInited) return (ModuleRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(ModuleRepositoryPackage.eNS_URI);

		// Obtain or create and register package
		ModuleRepositoryPackageImpl theModuleRepositoryPackage = (ModuleRepositoryPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModuleRepositoryPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModuleRepositoryPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		XPPUPackageImpl theXPPUPackage = (XPPUPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XPPUPackage.eNS_URI) instanceof XPPUPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XPPUPackage.eNS_URI) : XPPUPackage.eINSTANCE);
		ComponentRepositoryPackageImpl theComponentRepositoryPackage = (ComponentRepositoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ComponentRepositoryPackage.eNS_URI) instanceof ComponentRepositoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ComponentRepositoryPackage.eNS_URI) : ComponentRepositoryPackage.eINSTANCE);
		BusComponentsPackageImpl theBusComponentsPackage = (BusComponentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BusComponentsPackage.eNS_URI) instanceof BusComponentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BusComponentsPackage.eNS_URI) : BusComponentsPackage.eINSTANCE);
		ElectronicComponentsPackageImpl theElectronicComponentsPackage = (ElectronicComponentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ElectronicComponentsPackage.eNS_URI) instanceof ElectronicComponentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ElectronicComponentsPackage.eNS_URI) : ElectronicComponentsPackage.eINSTANCE);
		MechanicalComponentsPackageImpl theMechanicalComponentsPackage = (MechanicalComponentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MechanicalComponentsPackage.eNS_URI) instanceof MechanicalComponentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MechanicalComponentsPackage.eNS_URI) : MechanicalComponentsPackage.eINSTANCE);
		StructureRepositoryPackageImpl theStructureRepositoryPackage = (StructureRepositoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructureRepositoryPackage.eNS_URI) instanceof StructureRepositoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructureRepositoryPackage.eNS_URI) : StructureRepositoryPackage.eINSTANCE);
		InterfaceRepositoryPackageImpl theInterfaceRepositoryPackage = (InterfaceRepositoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InterfaceRepositoryPackage.eNS_URI) instanceof InterfaceRepositoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InterfaceRepositoryPackage.eNS_URI) : InterfaceRepositoryPackage.eINSTANCE);

		// Create package meta-data objects
		theModuleRepositoryPackage.createPackageContents();
		theXPPUPackage.createPackageContents();
		theComponentRepositoryPackage.createPackageContents();
		theBusComponentsPackage.createPackageContents();
		theElectronicComponentsPackage.createPackageContents();
		theMechanicalComponentsPackage.createPackageContents();
		theStructureRepositoryPackage.createPackageContents();
		theInterfaceRepositoryPackage.createPackageContents();

		// Initialize created meta-data
		theModuleRepositoryPackage.initializePackageContents();
		theXPPUPackage.initializePackageContents();
		theComponentRepositoryPackage.initializePackageContents();
		theBusComponentsPackage.initializePackageContents();
		theElectronicComponentsPackage.initializePackageContents();
		theMechanicalComponentsPackage.initializePackageContents();
		theStructureRepositoryPackage.initializePackageContents();
		theInterfaceRepositoryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModuleRepositoryPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModuleRepositoryPackage.eNS_URI, theModuleRepositoryPackage);
		return theModuleRepositoryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModule() {
		return moduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_Modules() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_ParentStructure() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRampModule() {
		return rampModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPusherModule() {
		return pusherModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMotorModule() {
		return motorModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMotorModule_SimpleMotor() {
		return (EReference)motorModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMotorModule_BusSlave() {
		return (EReference)motorModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMotorModule_BusBox() {
		return (EReference)motorModuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMotorModule_BusCable() {
		return (EReference)motorModuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensorModule() {
		return sensorModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpticalSensorModule() {
		return opticalSensorModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpticalSensorModule_OpticalSensor() {
		return (EReference)opticalSensorModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpticalSensorModule_BusSlave() {
		return (EReference)opticalSensorModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInductiveSensorModule() {
		return inductiveSensorModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInductiveSensorModule_InductiveSensor() {
		return (EReference)inductiveSensorModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInductiveSensorModule_BusSlave() {
		return (EReference)inductiveSensorModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPresenceSensorModule() {
		return presenceSensorModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPresenceSensorModule_PresenceSensor() {
		return (EReference)presenceSensorModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPresenceSensorModule_BusSlave() {
		return (EReference)presenceSensorModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPressureSensorModule() {
		return pressureSensorModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleRepositoryFactory getModuleRepositoryFactory() {
		return (ModuleRepositoryFactory)getEFactoryInstance();
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
		moduleEClass = createEClass(MODULE);
		createEReference(moduleEClass, MODULE__MODULES);
		createEReference(moduleEClass, MODULE__PARENT_STRUCTURE);

		rampModuleEClass = createEClass(RAMP_MODULE);

		pusherModuleEClass = createEClass(PUSHER_MODULE);

		motorModuleEClass = createEClass(MOTOR_MODULE);
		createEReference(motorModuleEClass, MOTOR_MODULE__SIMPLE_MOTOR);
		createEReference(motorModuleEClass, MOTOR_MODULE__BUS_SLAVE);
		createEReference(motorModuleEClass, MOTOR_MODULE__BUS_BOX);
		createEReference(motorModuleEClass, MOTOR_MODULE__BUS_CABLE);

		sensorModuleEClass = createEClass(SENSOR_MODULE);

		opticalSensorModuleEClass = createEClass(OPTICAL_SENSOR_MODULE);
		createEReference(opticalSensorModuleEClass, OPTICAL_SENSOR_MODULE__OPTICAL_SENSOR);
		createEReference(opticalSensorModuleEClass, OPTICAL_SENSOR_MODULE__BUS_SLAVE);

		inductiveSensorModuleEClass = createEClass(INDUCTIVE_SENSOR_MODULE);
		createEReference(inductiveSensorModuleEClass, INDUCTIVE_SENSOR_MODULE__INDUCTIVE_SENSOR);
		createEReference(inductiveSensorModuleEClass, INDUCTIVE_SENSOR_MODULE__BUS_SLAVE);

		presenceSensorModuleEClass = createEClass(PRESENCE_SENSOR_MODULE);
		createEReference(presenceSensorModuleEClass, PRESENCE_SENSOR_MODULE__PRESENCE_SENSOR);
		createEReference(presenceSensorModuleEClass, PRESENCE_SENSOR_MODULE__BUS_SLAVE);

		pressureSensorModuleEClass = createEClass(PRESSURE_SENSOR_MODULE);
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
		StructureRepositoryPackage theStructureRepositoryPackage = (StructureRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(StructureRepositoryPackage.eNS_URI);
		ComponentRepositoryPackage theComponentRepositoryPackage = (ComponentRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentRepositoryPackage.eNS_URI);
		BusComponentsPackage theBusComponentsPackage = (BusComponentsPackage)EPackage.Registry.INSTANCE.getEPackage(BusComponentsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		rampModuleEClass.getESuperTypes().add(this.getModule());
		pusherModuleEClass.getESuperTypes().add(this.getModule());
		motorModuleEClass.getESuperTypes().add(this.getModule());
		sensorModuleEClass.getESuperTypes().add(this.getModule());
		opticalSensorModuleEClass.getESuperTypes().add(this.getModule());
		inductiveSensorModuleEClass.getESuperTypes().add(this.getModule());
		presenceSensorModuleEClass.getESuperTypes().add(this.getModule());
		pressureSensorModuleEClass.getESuperTypes().add(this.getModule());

		// Initialize classes, features, and operations; add parameters
		initEClass(moduleEClass, Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModule_Modules(), this.getModule(), null, "modules", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_ParentStructure(), theStructureRepositoryPackage.getStructure(), theStructureRepositoryPackage.getStructure_Modules(), "parentStructure", null, 1, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rampModuleEClass, RampModule.class, "RampModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pusherModuleEClass, PusherModule.class, "PusherModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(motorModuleEClass, MotorModule.class, "MotorModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMotorModule_SimpleMotor(), theComponentRepositoryPackage.getSimpleMotor(), null, "simpleMotor", null, 1, -1, MotorModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMotorModule_BusSlave(), theBusComponentsPackage.getBusSlave(), null, "busSlave", null, 1, -1, MotorModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMotorModule_BusBox(), theBusComponentsPackage.getBusBox(), null, "busBox", null, 1, 1, MotorModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMotorModule_BusCable(), theBusComponentsPackage.getBusCable(), null, "busCable", null, 1, -1, MotorModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sensorModuleEClass, SensorModule.class, "SensorModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(opticalSensorModuleEClass, OpticalSensorModule.class, "OpticalSensorModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOpticalSensorModule_OpticalSensor(), theComponentRepositoryPackage.getOpticalSensor(), null, "opticalSensor", null, 1, -1, OpticalSensorModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOpticalSensorModule_BusSlave(), theBusComponentsPackage.getBusSlave(), null, "busSlave", null, 1, -1, OpticalSensorModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inductiveSensorModuleEClass, InductiveSensorModule.class, "InductiveSensorModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInductiveSensorModule_InductiveSensor(), theComponentRepositoryPackage.getInductiveSensor(), null, "inductiveSensor", null, 1, -1, InductiveSensorModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInductiveSensorModule_BusSlave(), theBusComponentsPackage.getBusSlave(), null, "busSlave", null, 1, -1, InductiveSensorModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(presenceSensorModuleEClass, PresenceSensorModule.class, "PresenceSensorModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPresenceSensorModule_PresenceSensor(), theComponentRepositoryPackage.getPresenceSensor(), null, "presenceSensor", null, 1, -1, PresenceSensorModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPresenceSensorModule_BusSlave(), theBusComponentsPackage.getBusSlave(), null, "busSlave", null, 1, -1, PresenceSensorModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pressureSensorModuleEClass, PressureSensorModule.class, "PressureSensorModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //ModuleRepositoryPackageImpl
