/**
 */
package xPPU.util;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.core.entity.NamedElement;

import xPPU.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see xPPU.XPPUPackage
 * @generated
 */
public class XPPUSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XPPUPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPPUSwitch() {
		if (modelPackage == null) {
			modelPackage = XPPUPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case XPPUPackage.PLANT: {
				Plant plant = (Plant)theEObject;
				T result = casePlant(plant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.STRUCTURE: {
				Structure structure = (Structure)theEObject;
				T result = caseStructure(structure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.COMMUNICATION_NETWORK: {
				CommunicationNetwork communicationNetwork = (CommunicationNetwork)theEObject;
				T result = caseCommunicationNetwork(communicationNetwork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.POWER_NETWORK: {
				PowerNetwork powerNetwork = (PowerNetwork)theEObject;
				T result = casePowerNetwork(powerNetwork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.CONTROL_CABINET: {
				ControlCabinet controlCabinet = (ControlCabinet)theEObject;
				T result = caseControlCabinet(controlCabinet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.PNEUMATIC_NETWORK: {
				PneumaticNetwork pneumaticNetwork = (PneumaticNetwork)theEObject;
				T result = casePneumaticNetwork(pneumaticNetwork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.CONVEYOR: {
				Conveyor conveyor = (Conveyor)theEObject;
				T result = caseConveyor(conveyor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.CRANE: {
				Crane crane = (Crane)theEObject;
				T result = caseCrane(crane);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.POWER_WIRING: {
				PowerWiring powerWiring = (PowerWiring)theEObject;
				T result = casePowerWiring(powerWiring);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.MODULES: {
				Modules modules = (Modules)theEObject;
				T result = caseModules(modules);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.RAMP_MODULE: {
				RampModule rampModule = (RampModule)theEObject;
				T result = caseRampModule(rampModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.PUSHER_MODULE: {
				PusherModule pusherModule = (PusherModule)theEObject;
				T result = casePusherModule(pusherModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.MOTOR_MODULE: {
				MotorModule motorModule = (MotorModule)theEObject;
				T result = caseMotorModule(motorModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.SENSOR_MODULE: {
				SensorModule sensorModule = (SensorModule)theEObject;
				T result = caseSensorModule(sensorModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.ARM: {
				Arm arm = (Arm)theEObject;
				T result = caseArm(arm);
				if (result == null) result = caseMechanicalAssembly(arm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.TURNING_TABLE: {
				TurningTable turningTable = (TurningTable)theEObject;
				T result = caseTurningTable(turningTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.VACUUM_GRIPPER: {
				VacuumGripper vacuumGripper = (VacuumGripper)theEObject;
				T result = caseVacuumGripper(vacuumGripper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.CONVEYOR_BELT: {
				ConveyorBelt conveyorBelt = (ConveyorBelt)theEObject;
				T result = caseConveyorBelt(conveyorBelt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.PUSHER: {
				Pusher pusher = (Pusher)theEObject;
				T result = casePusher(pusher);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.COMPONENTS: {
				Components components = (Components)theEObject;
				T result = caseComponents(components);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.MOTOR: {
				Motor motor = (Motor)theEObject;
				T result = caseMotor(motor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.SIMPLE_MOTOR: {
				SimpleMotor simpleMotor = (SimpleMotor)theEObject;
				T result = caseSimpleMotor(simpleMotor);
				if (result == null) result = caseMotor(simpleMotor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.SENSOR: {
				Sensor sensor = (Sensor)theEObject;
				T result = caseSensor(sensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.RACK: {
				Rack rack = (Rack)theEObject;
				T result = caseRack(rack);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.CORNER: {
				Corner corner = (Corner)theEObject;
				T result = caseCorner(corner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.VALVE: {
				Valve valve = (Valve)theEObject;
				T result = caseValve(valve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.TANK: {
				Tank tank = (Tank)theEObject;
				T result = caseTank(tank);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.MECHANICAL_PART: {
				MechanicalPart mechanicalPart = (MechanicalPart)theEObject;
				T result = caseMechanicalPart(mechanicalPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.PUSHHEAD: {
				Pushhead pushhead = (Pushhead)theEObject;
				T result = casePushhead(pushhead);
				if (result == null) result = caseMechanicalPart(pushhead);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.MECHANICAL_ASSEMBLY: {
				MechanicalAssembly mechanicalAssembly = (MechanicalAssembly)theEObject;
				T result = caseMechanicalAssembly(mechanicalAssembly);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.RAMP: {
				Ramp ramp = (Ramp)theEObject;
				T result = caseRamp(ramp);
				if (result == null) result = caseMechanicalAssembly(ramp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.CYLINDER: {
				Cylinder cylinder = (Cylinder)theEObject;
				T result = caseCylinder(cylinder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.DISPENSER: {
				Dispenser dispenser = (Dispenser)theEObject;
				T result = caseDispenser(dispenser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.BOTTLE_SEPERATOR: {
				BottleSeperator bottleSeperator = (BottleSeperator)theEObject;
				T result = caseBottleSeperator(bottleSeperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.SPLITTER: {
				Splitter splitter = (Splitter)theEObject;
				T result = caseSplitter(splitter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.POWER_SPLITTER: {
				PowerSplitter powerSplitter = (PowerSplitter)theEObject;
				T result = casePowerSplitter(powerSplitter);
				if (result == null) result = caseSplitter(powerSplitter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.WATER_SPLITTER: {
				WaterSplitter waterSplitter = (WaterSplitter)theEObject;
				T result = caseWaterSplitter(waterSplitter);
				if (result == null) result = caseSplitter(waterSplitter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.PNEUMATIC_SPLITTER: {
				PneumaticSplitter pneumaticSplitter = (PneumaticSplitter)theEObject;
				T result = casePneumaticSplitter(pneumaticSplitter);
				if (result == null) result = caseSplitter(pneumaticSplitter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.PANEL: {
				Panel panel = (Panel)theEObject;
				T result = casePanel(panel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.OPERATION_PANEL: {
				OperationPanel operationPanel = (OperationPanel)theEObject;
				T result = caseOperationPanel(operationPanel);
				if (result == null) result = casePanel(operationPanel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.CABLE: {
				Cable cable = (Cable)theEObject;
				T result = caseCable(cable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.POWER_SUPPLY: {
				PowerSupply powerSupply = (PowerSupply)theEObject;
				T result = casePowerSupply(powerSupply);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.COMPRESSOR: {
				Compressor compressor = (Compressor)theEObject;
				T result = caseCompressor(compressor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.ELECTRONIC_PART: {
				ElectronicPart electronicPart = (ElectronicPart)theEObject;
				T result = caseElectronicPart(electronicPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.SWITCH: {
				xPPU.Switch switch_ = (xPPU.Switch)theEObject;
				T result = caseSwitch(switch_);
				if (result == null) result = caseElectronicPart(switch_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.POWER_CABLE: {
				PowerCable powerCable = (PowerCable)theEObject;
				T result = casePowerCable(powerCable);
				if (result == null) result = caseCable(powerCable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.MONOSTABLE_CYLINDER: {
				MonostableCylinder monostableCylinder = (MonostableCylinder)theEObject;
				T result = caseMonostableCylinder(monostableCylinder);
				if (result == null) result = caseCylinder(monostableCylinder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.PROPORTIONAL_CYLINDER: {
				ProportionalCylinder proportionalCylinder = (ProportionalCylinder)theEObject;
				T result = caseProportionalCylinder(proportionalCylinder);
				if (result == null) result = caseCylinder(proportionalCylinder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.BISTABLE_CYLINDER: {
				BistableCylinder bistableCylinder = (BistableCylinder)theEObject;
				T result = caseBistableCylinder(bistableCylinder);
				if (result == null) result = caseCylinder(bistableCylinder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.CONTROLLER: {
				Controller controller = (Controller)theEObject;
				T result = caseController(controller);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.LED: {
				LED led = (LED)theEObject;
				T result = caseLED(led);
				if (result == null) result = caseElectronicPart(led);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.BUTTON: {
				Button button = (Button)theEObject;
				T result = caseButton(button);
				if (result == null) result = caseElectronicPart(button);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.REGULAR_RAMP: {
				RegularRamp regularRamp = (RegularRamp)theEObject;
				T result = caseRegularRamp(regularRamp);
				if (result == null) result = caseRamp(regularRamp);
				if (result == null) result = caseMechanicalAssembly(regularRamp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.PIPE: {
				Pipe pipe = (Pipe)theEObject;
				T result = casePipe(pipe);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.PNEUMATIC_PIPE: {
				PneumaticPipe pneumaticPipe = (PneumaticPipe)theEObject;
				T result = casePneumaticPipe(pneumaticPipe);
				if (result == null) result = casePipe(pneumaticPipe);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.BUS_MASTER: {
				BusMaster busMaster = (BusMaster)theEObject;
				T result = caseBusMaster(busMaster);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.BUS_SLAVE: {
				BusSlave busSlave = (BusSlave)theEObject;
				T result = caseBusSlave(busSlave);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.BUS_CABLE: {
				BusCable busCable = (BusCable)theEObject;
				T result = caseBusCable(busCable);
				if (result == null) result = caseCable(busCable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.BUS_BOX: {
				BusBox busBox = (BusBox)theEObject;
				T result = caseBusBox(busBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.INTERFACE: {
				Interface interface_ = (Interface)theEObject;
				T result = caseInterface(interface_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.SCREWING: {
				Screwing screwing = (Screwing)theEObject;
				T result = caseScrewing(screwing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.SUSPENSION: {
				Suspension suspension = (Suspension)theEObject;
				T result = caseSuspension(suspension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.GEARING: {
				Gearing gearing = (Gearing)theEObject;
				T result = caseGearing(gearing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.CLAMPING: {
				Clamping clamping = (Clamping)theEObject;
				T result = caseClamping(clamping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.PNEUMATIC_SUPPLY: {
				PneumaticSupply pneumaticSupply = (PneumaticSupply)theEObject;
				T result = casePneumaticSupply(pneumaticSupply);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.SIGNAL_INTERFACE: {
				SignalInterface signalInterface = (SignalInterface)theEObject;
				T result = caseSignalInterface(signalInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.WATER_SUPPLY: {
				WaterSupply waterSupply = (WaterSupply)theEObject;
				T result = caseWaterSupply(waterSupply);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.PHYSICAL_CONNECTION: {
				PhysicalConnection physicalConnection = (PhysicalConnection)theEObject;
				T result = casePhysicalConnection(physicalConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XPPUPackage.TRANSPORT_CONNECTION: {
				TransportConnection transportConnection = (TransportConnection)theEObject;
				T result = caseTransportConnection(transportConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlant(Plant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructure(Structure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationNetwork(CommunicationNetwork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerNetwork(PowerNetwork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Cabinet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Cabinet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlCabinet(ControlCabinet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pneumatic Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pneumatic Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePneumaticNetwork(PneumaticNetwork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conveyor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conveyor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConveyor(Conveyor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Crane</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Crane</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCrane(Crane object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power Wiring</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power Wiring</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerWiring(PowerWiring object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modules</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modules</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModules(Modules object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ramp Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ramp Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRampModule(RampModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pusher Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pusher Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePusherModule(PusherModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Motor Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Motor Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMotorModule(MotorModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensorModule(SensorModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArm(Arm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turning Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turning Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurningTable(TurningTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vacuum Gripper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vacuum Gripper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVacuumGripper(VacuumGripper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conveyor Belt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conveyor Belt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConveyorBelt(ConveyorBelt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pusher</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pusher</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePusher(Pusher object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Components</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Components</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponents(Components object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Motor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Motor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMotor(Motor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Motor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Motor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleMotor(SimpleMotor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensor(Sensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rack</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rack</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRack(Rack object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Corner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Corner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorner(Corner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Valve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Valve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValve(Valve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tank</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tank</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTank(Tank object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mechanical Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mechanical Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMechanicalPart(MechanicalPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pushhead</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pushhead</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePushhead(Pushhead object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mechanical Assembly</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mechanical Assembly</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMechanicalAssembly(MechanicalAssembly object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ramp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ramp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRamp(Ramp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cylinder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cylinder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCylinder(Cylinder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dispenser</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dispenser</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDispenser(Dispenser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bottle Seperator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bottle Seperator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBottleSeperator(BottleSeperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Splitter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Splitter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSplitter(Splitter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power Splitter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power Splitter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerSplitter(PowerSplitter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Water Splitter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Water Splitter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWaterSplitter(WaterSplitter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pneumatic Splitter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pneumatic Splitter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePneumaticSplitter(PneumaticSplitter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Panel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Panel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePanel(Panel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Panel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Panel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationPanel(OperationPanel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCable(Cable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power Supply</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power Supply</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerSupply(PowerSupply object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compressor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compressor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompressor(Compressor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Electronic Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Electronic Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElectronicPart(ElectronicPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitch(xPPU.Switch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power Cable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power Cable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerCable(PowerCable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Monostable Cylinder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Monostable Cylinder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonostableCylinder(MonostableCylinder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proportional Cylinder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proportional Cylinder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProportionalCylinder(ProportionalCylinder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bistable Cylinder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bistable Cylinder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBistableCylinder(BistableCylinder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseController(Controller object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LED</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LED</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLED(LED object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButton(Button object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regular Ramp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regular Ramp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegularRamp(RegularRamp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pipe</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pipe</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePipe(Pipe object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pneumatic Pipe</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pneumatic Pipe</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePneumaticPipe(PneumaticPipe object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bus Master</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bus Master</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusMaster(BusMaster object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bus Slave</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bus Slave</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusSlave(BusSlave object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bus Cable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bus Cable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusCable(BusCable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bus Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bus Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusBox(BusBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface(Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Screwing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Screwing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScrewing(Screwing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Suspension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Suspension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuspension(Suspension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gearing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gearing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGearing(Gearing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clamping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clamping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClamping(Clamping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pneumatic Supply</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pneumatic Supply</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePneumaticSupply(PneumaticSupply object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignalInterface(SignalInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Water Supply</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Water Supply</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWaterSupply(WaterSupply object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalConnection(PhysicalConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transport Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transport Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransportConnection(TransportConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //XPPUSwitch
