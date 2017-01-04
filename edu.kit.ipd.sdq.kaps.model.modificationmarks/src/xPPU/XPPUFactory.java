/**
 */
package xPPU;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see xPPU.XPPUPackage
 * @generated
 */
public interface XPPUFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XPPUFactory eINSTANCE = xPPU.impl.XPPUFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Plant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plant</em>'.
	 * @generated
	 */
	Plant createPlant();

	/**
	 * Returns a new object of class '<em>Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure</em>'.
	 * @generated
	 */
	Structure createStructure();

	/**
	 * Returns a new object of class '<em>Communication Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication Network</em>'.
	 * @generated
	 */
	CommunicationNetwork createCommunicationNetwork();

	/**
	 * Returns a new object of class '<em>Power Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Power Network</em>'.
	 * @generated
	 */
	PowerNetwork createPowerNetwork();

	/**
	 * Returns a new object of class '<em>Control Cabinet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Cabinet</em>'.
	 * @generated
	 */
	ControlCabinet createControlCabinet();

	/**
	 * Returns a new object of class '<em>Pneumatic Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pneumatic Network</em>'.
	 * @generated
	 */
	PneumaticNetwork createPneumaticNetwork();

	/**
	 * Returns a new object of class '<em>Conveyor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conveyor</em>'.
	 * @generated
	 */
	Conveyor createConveyor();

	/**
	 * Returns a new object of class '<em>Crane</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Crane</em>'.
	 * @generated
	 */
	Crane createCrane();

	/**
	 * Returns a new object of class '<em>Power Wiring</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Power Wiring</em>'.
	 * @generated
	 */
	PowerWiring createPowerWiring();

	/**
	 * Returns a new object of class '<em>Modules</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modules</em>'.
	 * @generated
	 */
	Modules createModules();

	/**
	 * Returns a new object of class '<em>Ramp Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ramp Module</em>'.
	 * @generated
	 */
	RampModule createRampModule();

	/**
	 * Returns a new object of class '<em>Pusher Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pusher Module</em>'.
	 * @generated
	 */
	PusherModule createPusherModule();

	/**
	 * Returns a new object of class '<em>Motor Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Motor Module</em>'.
	 * @generated
	 */
	MotorModule createMotorModule();

	/**
	 * Returns a new object of class '<em>Sensor Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor Module</em>'.
	 * @generated
	 */
	SensorModule createSensorModule();

	/**
	 * Returns a new object of class '<em>Arm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arm</em>'.
	 * @generated
	 */
	Arm createArm();

	/**
	 * Returns a new object of class '<em>Turning Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Turning Table</em>'.
	 * @generated
	 */
	TurningTable createTurningTable();

	/**
	 * Returns a new object of class '<em>Vacuum Gripper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vacuum Gripper</em>'.
	 * @generated
	 */
	VacuumGripper createVacuumGripper();

	/**
	 * Returns a new object of class '<em>Conveyor Belt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conveyor Belt</em>'.
	 * @generated
	 */
	ConveyorBelt createConveyorBelt();

	/**
	 * Returns a new object of class '<em>Pusher</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pusher</em>'.
	 * @generated
	 */
	Pusher createPusher();

	/**
	 * Returns a new object of class '<em>Components</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Components</em>'.
	 * @generated
	 */
	Components createComponents();

	/**
	 * Returns a new object of class '<em>Simple Motor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Motor</em>'.
	 * @generated
	 */
	SimpleMotor createSimpleMotor();

	/**
	 * Returns a new object of class '<em>Rack</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rack</em>'.
	 * @generated
	 */
	Rack createRack();

	/**
	 * Returns a new object of class '<em>Corner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Corner</em>'.
	 * @generated
	 */
	Corner createCorner();

	/**
	 * Returns a new object of class '<em>Tank</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tank</em>'.
	 * @generated
	 */
	Tank createTank();

	/**
	 * Returns a new object of class '<em>Dispenser</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dispenser</em>'.
	 * @generated
	 */
	Dispenser createDispenser();

	/**
	 * Returns a new object of class '<em>Bottle Seperator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bottle Seperator</em>'.
	 * @generated
	 */
	BottleSeperator createBottleSeperator();

	/**
	 * Returns a new object of class '<em>Power Splitter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Power Splitter</em>'.
	 * @generated
	 */
	PowerSplitter createPowerSplitter();

	/**
	 * Returns a new object of class '<em>Water Splitter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Water Splitter</em>'.
	 * @generated
	 */
	WaterSplitter createWaterSplitter();

	/**
	 * Returns a new object of class '<em>Operation Panel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Panel</em>'.
	 * @generated
	 */
	OperationPanel createOperationPanel();

	/**
	 * Returns a new object of class '<em>Power Supply</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Power Supply</em>'.
	 * @generated
	 */
	PowerSupply createPowerSupply();

	/**
	 * Returns a new object of class '<em>Compressor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compressor</em>'.
	 * @generated
	 */
	Compressor createCompressor();

	/**
	 * Returns a new object of class '<em>Switch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Switch</em>'.
	 * @generated
	 */
	Switch createSwitch();

	/**
	 * Returns a new object of class '<em>Power Cable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Power Cable</em>'.
	 * @generated
	 */
	PowerCable createPowerCable();

	/**
	 * Returns a new object of class '<em>Monostable Cylinder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Monostable Cylinder</em>'.
	 * @generated
	 */
	MonostableCylinder createMonostableCylinder();

	/**
	 * Returns a new object of class '<em>Proportional Cylinder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Proportional Cylinder</em>'.
	 * @generated
	 */
	ProportionalCylinder createProportionalCylinder();

	/**
	 * Returns a new object of class '<em>Bistable Cylinder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bistable Cylinder</em>'.
	 * @generated
	 */
	BistableCylinder createBistableCylinder();

	/**
	 * Returns a new object of class '<em>Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Controller</em>'.
	 * @generated
	 */
	Controller createController();

	/**
	 * Returns a new object of class '<em>LED</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LED</em>'.
	 * @generated
	 */
	LED createLED();

	/**
	 * Returns a new object of class '<em>Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Button</em>'.
	 * @generated
	 */
	Button createButton();

	/**
	 * Returns a new object of class '<em>Regular Ramp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Regular Ramp</em>'.
	 * @generated
	 */
	RegularRamp createRegularRamp();

	/**
	 * Returns a new object of class '<em>Pneumatic Pipe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pneumatic Pipe</em>'.
	 * @generated
	 */
	PneumaticPipe createPneumaticPipe();

	/**
	 * Returns a new object of class '<em>Bus Master</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bus Master</em>'.
	 * @generated
	 */
	BusMaster createBusMaster();

	/**
	 * Returns a new object of class '<em>Bus Slave</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bus Slave</em>'.
	 * @generated
	 */
	BusSlave createBusSlave();

	/**
	 * Returns a new object of class '<em>Bus Cable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bus Cable</em>'.
	 * @generated
	 */
	BusCable createBusCable();

	/**
	 * Returns a new object of class '<em>Bus Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bus Box</em>'.
	 * @generated
	 */
	BusBox createBusBox();

	/**
	 * Returns a new object of class '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface</em>'.
	 * @generated
	 */
	Interface createInterface();

	/**
	 * Returns a new object of class '<em>Screwing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Screwing</em>'.
	 * @generated
	 */
	Screwing createScrewing();

	/**
	 * Returns a new object of class '<em>Suspension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Suspension</em>'.
	 * @generated
	 */
	Suspension createSuspension();

	/**
	 * Returns a new object of class '<em>Gearing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gearing</em>'.
	 * @generated
	 */
	Gearing createGearing();

	/**
	 * Returns a new object of class '<em>Clamping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clamping</em>'.
	 * @generated
	 */
	Clamping createClamping();

	/**
	 * Returns a new object of class '<em>Pneumatic Supply</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pneumatic Supply</em>'.
	 * @generated
	 */
	PneumaticSupply createPneumaticSupply();

	/**
	 * Returns a new object of class '<em>Signal Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signal Interface</em>'.
	 * @generated
	 */
	SignalInterface createSignalInterface();

	/**
	 * Returns a new object of class '<em>Water Supply</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Water Supply</em>'.
	 * @generated
	 */
	WaterSupply createWaterSupply();

	/**
	 * Returns a new object of class '<em>Physical Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Connection</em>'.
	 * @generated
	 */
	PhysicalConnection createPhysicalConnection();

	/**
	 * Returns a new object of class '<em>Transport Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transport Connection</em>'.
	 * @generated
	 */
	TransportConnection createTransportConnection();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	XPPUPackage getXPPUPackage();

} //XPPUFactory
