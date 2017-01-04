/**
 */
package xPPU.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import xPPU.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XPPUFactoryImpl extends EFactoryImpl implements XPPUFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XPPUFactory init() {
		try {
			XPPUFactory theXPPUFactory = (XPPUFactory)EPackage.Registry.INSTANCE.getEFactory(XPPUPackage.eNS_URI);
			if (theXPPUFactory != null) {
				return theXPPUFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XPPUFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPPUFactoryImpl() {
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
			case XPPUPackage.PLANT: return createPlant();
			case XPPUPackage.STRUCTURE: return createStructure();
			case XPPUPackage.COMMUNICATION_NETWORK: return createCommunicationNetwork();
			case XPPUPackage.POWER_NETWORK: return createPowerNetwork();
			case XPPUPackage.CONTROL_CABINET: return createControlCabinet();
			case XPPUPackage.PNEUMATIC_NETWORK: return createPneumaticNetwork();
			case XPPUPackage.CONVEYOR: return createConveyor();
			case XPPUPackage.CRANE: return createCrane();
			case XPPUPackage.POWER_WIRING: return createPowerWiring();
			case XPPUPackage.MODULES: return createModules();
			case XPPUPackage.RAMP_MODULE: return createRampModule();
			case XPPUPackage.PUSHER_MODULE: return createPusherModule();
			case XPPUPackage.MOTOR_MODULE: return createMotorModule();
			case XPPUPackage.SENSOR_MODULE: return createSensorModule();
			case XPPUPackage.ARM: return createArm();
			case XPPUPackage.TURNING_TABLE: return createTurningTable();
			case XPPUPackage.VACUUM_GRIPPER: return createVacuumGripper();
			case XPPUPackage.CONVEYOR_BELT: return createConveyorBelt();
			case XPPUPackage.PUSHER: return createPusher();
			case XPPUPackage.COMPONENTS: return createComponents();
			case XPPUPackage.SIMPLE_MOTOR: return createSimpleMotor();
			case XPPUPackage.RACK: return createRack();
			case XPPUPackage.CORNER: return createCorner();
			case XPPUPackage.TANK: return createTank();
			case XPPUPackage.DISPENSER: return createDispenser();
			case XPPUPackage.BOTTLE_SEPERATOR: return createBottleSeperator();
			case XPPUPackage.POWER_SPLITTER: return createPowerSplitter();
			case XPPUPackage.WATER_SPLITTER: return createWaterSplitter();
			case XPPUPackage.OPERATION_PANEL: return createOperationPanel();
			case XPPUPackage.POWER_SUPPLY: return createPowerSupply();
			case XPPUPackage.COMPRESSOR: return createCompressor();
			case XPPUPackage.SWITCH: return createSwitch();
			case XPPUPackage.POWER_CABLE: return createPowerCable();
			case XPPUPackage.MONOSTABLE_CYLINDER: return createMonostableCylinder();
			case XPPUPackage.PROPORTIONAL_CYLINDER: return createProportionalCylinder();
			case XPPUPackage.BISTABLE_CYLINDER: return createBistableCylinder();
			case XPPUPackage.CONTROLLER: return createController();
			case XPPUPackage.LED: return createLED();
			case XPPUPackage.BUTTON: return createButton();
			case XPPUPackage.REGULAR_RAMP: return createRegularRamp();
			case XPPUPackage.PNEUMATIC_PIPE: return createPneumaticPipe();
			case XPPUPackage.BUS_MASTER: return createBusMaster();
			case XPPUPackage.BUS_SLAVE: return createBusSlave();
			case XPPUPackage.BUS_CABLE: return createBusCable();
			case XPPUPackage.BUS_BOX: return createBusBox();
			case XPPUPackage.INTERFACE: return createInterface();
			case XPPUPackage.SCREWING: return createScrewing();
			case XPPUPackage.SUSPENSION: return createSuspension();
			case XPPUPackage.GEARING: return createGearing();
			case XPPUPackage.CLAMPING: return createClamping();
			case XPPUPackage.PNEUMATIC_SUPPLY: return createPneumaticSupply();
			case XPPUPackage.SIGNAL_INTERFACE: return createSignalInterface();
			case XPPUPackage.WATER_SUPPLY: return createWaterSupply();
			case XPPUPackage.PHYSICAL_CONNECTION: return createPhysicalConnection();
			case XPPUPackage.TRANSPORT_CONNECTION: return createTransportConnection();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plant createPlant() {
		PlantImpl plant = new PlantImpl();
		return plant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Structure createStructure() {
		StructureImpl structure = new StructureImpl();
		return structure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationNetwork createCommunicationNetwork() {
		CommunicationNetworkImpl communicationNetwork = new CommunicationNetworkImpl();
		return communicationNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerNetwork createPowerNetwork() {
		PowerNetworkImpl powerNetwork = new PowerNetworkImpl();
		return powerNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlCabinet createControlCabinet() {
		ControlCabinetImpl controlCabinet = new ControlCabinetImpl();
		return controlCabinet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PneumaticNetwork createPneumaticNetwork() {
		PneumaticNetworkImpl pneumaticNetwork = new PneumaticNetworkImpl();
		return pneumaticNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conveyor createConveyor() {
		ConveyorImpl conveyor = new ConveyorImpl();
		return conveyor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Crane createCrane() {
		CraneImpl crane = new CraneImpl();
		return crane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerWiring createPowerWiring() {
		PowerWiringImpl powerWiring = new PowerWiringImpl();
		return powerWiring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modules createModules() {
		ModulesImpl modules = new ModulesImpl();
		return modules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RampModule createRampModule() {
		RampModuleImpl rampModule = new RampModuleImpl();
		return rampModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PusherModule createPusherModule() {
		PusherModuleImpl pusherModule = new PusherModuleImpl();
		return pusherModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MotorModule createMotorModule() {
		MotorModuleImpl motorModule = new MotorModuleImpl();
		return motorModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorModule createSensorModule() {
		SensorModuleImpl sensorModule = new SensorModuleImpl();
		return sensorModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arm createArm() {
		ArmImpl arm = new ArmImpl();
		return arm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurningTable createTurningTable() {
		TurningTableImpl turningTable = new TurningTableImpl();
		return turningTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VacuumGripper createVacuumGripper() {
		VacuumGripperImpl vacuumGripper = new VacuumGripperImpl();
		return vacuumGripper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConveyorBelt createConveyorBelt() {
		ConveyorBeltImpl conveyorBelt = new ConveyorBeltImpl();
		return conveyorBelt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pusher createPusher() {
		PusherImpl pusher = new PusherImpl();
		return pusher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Components createComponents() {
		ComponentsImpl components = new ComponentsImpl();
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleMotor createSimpleMotor() {
		SimpleMotorImpl simpleMotor = new SimpleMotorImpl();
		return simpleMotor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rack createRack() {
		RackImpl rack = new RackImpl();
		return rack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Corner createCorner() {
		CornerImpl corner = new CornerImpl();
		return corner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tank createTank() {
		TankImpl tank = new TankImpl();
		return tank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dispenser createDispenser() {
		DispenserImpl dispenser = new DispenserImpl();
		return dispenser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BottleSeperator createBottleSeperator() {
		BottleSeperatorImpl bottleSeperator = new BottleSeperatorImpl();
		return bottleSeperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerSplitter createPowerSplitter() {
		PowerSplitterImpl powerSplitter = new PowerSplitterImpl();
		return powerSplitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaterSplitter createWaterSplitter() {
		WaterSplitterImpl waterSplitter = new WaterSplitterImpl();
		return waterSplitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationPanel createOperationPanel() {
		OperationPanelImpl operationPanel = new OperationPanelImpl();
		return operationPanel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerSupply createPowerSupply() {
		PowerSupplyImpl powerSupply = new PowerSupplyImpl();
		return powerSupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compressor createCompressor() {
		CompressorImpl compressor = new CompressorImpl();
		return compressor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Switch createSwitch() {
		SwitchImpl switch_ = new SwitchImpl();
		return switch_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerCable createPowerCable() {
		PowerCableImpl powerCable = new PowerCableImpl();
		return powerCable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonostableCylinder createMonostableCylinder() {
		MonostableCylinderImpl monostableCylinder = new MonostableCylinderImpl();
		return monostableCylinder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProportionalCylinder createProportionalCylinder() {
		ProportionalCylinderImpl proportionalCylinder = new ProportionalCylinderImpl();
		return proportionalCylinder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BistableCylinder createBistableCylinder() {
		BistableCylinderImpl bistableCylinder = new BistableCylinderImpl();
		return bistableCylinder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controller createController() {
		ControllerImpl controller = new ControllerImpl();
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LED createLED() {
		LEDImpl led = new LEDImpl();
		return led;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Button createButton() {
		ButtonImpl button = new ButtonImpl();
		return button;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegularRamp createRegularRamp() {
		RegularRampImpl regularRamp = new RegularRampImpl();
		return regularRamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PneumaticPipe createPneumaticPipe() {
		PneumaticPipeImpl pneumaticPipe = new PneumaticPipeImpl();
		return pneumaticPipe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusMaster createBusMaster() {
		BusMasterImpl busMaster = new BusMasterImpl();
		return busMaster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusSlave createBusSlave() {
		BusSlaveImpl busSlave = new BusSlaveImpl();
		return busSlave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusCable createBusCable() {
		BusCableImpl busCable = new BusCableImpl();
		return busCable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusBox createBusBox() {
		BusBoxImpl busBox = new BusBoxImpl();
		return busBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Screwing createScrewing() {
		ScrewingImpl screwing = new ScrewingImpl();
		return screwing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Suspension createSuspension() {
		SuspensionImpl suspension = new SuspensionImpl();
		return suspension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gearing createGearing() {
		GearingImpl gearing = new GearingImpl();
		return gearing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clamping createClamping() {
		ClampingImpl clamping = new ClampingImpl();
		return clamping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PneumaticSupply createPneumaticSupply() {
		PneumaticSupplyImpl pneumaticSupply = new PneumaticSupplyImpl();
		return pneumaticSupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalInterface createSignalInterface() {
		SignalInterfaceImpl signalInterface = new SignalInterfaceImpl();
		return signalInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaterSupply createWaterSupply() {
		WaterSupplyImpl waterSupply = new WaterSupplyImpl();
		return waterSupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalConnection createPhysicalConnection() {
		PhysicalConnectionImpl physicalConnection = new PhysicalConnectionImpl();
		return physicalConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportConnection createTransportConnection() {
		TransportConnectionImpl transportConnection = new TransportConnectionImpl();
		return transportConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPPUPackage getXPPUPackage() {
		return (XPPUPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XPPUPackage getPackage() {
		return XPPUPackage.eINSTANCE;
	}

} //XPPUFactoryImpl
