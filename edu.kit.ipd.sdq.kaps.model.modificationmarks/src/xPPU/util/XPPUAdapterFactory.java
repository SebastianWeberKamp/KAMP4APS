/**
 */
package xPPU.util;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.core.entity.NamedElement;

import xPPU.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see xPPU.XPPUPackage
 * @generated
 */
public class XPPUAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XPPUPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPPUAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = XPPUPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XPPUSwitch<Adapter> modelSwitch =
		new XPPUSwitch<Adapter>() {
			@Override
			public Adapter casePlant(Plant object) {
				return createPlantAdapter();
			}
			@Override
			public Adapter caseStructure(Structure object) {
				return createStructureAdapter();
			}
			@Override
			public Adapter caseCommunicationNetwork(CommunicationNetwork object) {
				return createCommunicationNetworkAdapter();
			}
			@Override
			public Adapter casePowerNetwork(PowerNetwork object) {
				return createPowerNetworkAdapter();
			}
			@Override
			public Adapter caseControlCabinet(ControlCabinet object) {
				return createControlCabinetAdapter();
			}
			@Override
			public Adapter casePneumaticNetwork(PneumaticNetwork object) {
				return createPneumaticNetworkAdapter();
			}
			@Override
			public Adapter caseConveyor(Conveyor object) {
				return createConveyorAdapter();
			}
			@Override
			public Adapter caseCrane(Crane object) {
				return createCraneAdapter();
			}
			@Override
			public Adapter casePowerWiring(PowerWiring object) {
				return createPowerWiringAdapter();
			}
			@Override
			public Adapter caseModules(Modules object) {
				return createModulesAdapter();
			}
			@Override
			public Adapter caseRampModule(RampModule object) {
				return createRampModuleAdapter();
			}
			@Override
			public Adapter casePusherModule(PusherModule object) {
				return createPusherModuleAdapter();
			}
			@Override
			public Adapter caseMotorModule(MotorModule object) {
				return createMotorModuleAdapter();
			}
			@Override
			public Adapter caseSensorModule(SensorModule object) {
				return createSensorModuleAdapter();
			}
			@Override
			public Adapter caseArm(Arm object) {
				return createArmAdapter();
			}
			@Override
			public Adapter caseTurningTable(TurningTable object) {
				return createTurningTableAdapter();
			}
			@Override
			public Adapter caseVacuumGripper(VacuumGripper object) {
				return createVacuumGripperAdapter();
			}
			@Override
			public Adapter caseConveyorBelt(ConveyorBelt object) {
				return createConveyorBeltAdapter();
			}
			@Override
			public Adapter casePusher(Pusher object) {
				return createPusherAdapter();
			}
			@Override
			public Adapter caseComponents(Components object) {
				return createComponentsAdapter();
			}
			@Override
			public Adapter caseMotor(Motor object) {
				return createMotorAdapter();
			}
			@Override
			public Adapter caseSimpleMotor(SimpleMotor object) {
				return createSimpleMotorAdapter();
			}
			@Override
			public Adapter caseSensor(Sensor object) {
				return createSensorAdapter();
			}
			@Override
			public Adapter caseRack(Rack object) {
				return createRackAdapter();
			}
			@Override
			public Adapter caseCorner(Corner object) {
				return createCornerAdapter();
			}
			@Override
			public Adapter caseValve(Valve object) {
				return createValveAdapter();
			}
			@Override
			public Adapter caseTank(Tank object) {
				return createTankAdapter();
			}
			@Override
			public Adapter caseMechanicalPart(MechanicalPart object) {
				return createMechanicalPartAdapter();
			}
			@Override
			public Adapter casePushhead(Pushhead object) {
				return createPushheadAdapter();
			}
			@Override
			public Adapter caseMechanicalAssembly(MechanicalAssembly object) {
				return createMechanicalAssemblyAdapter();
			}
			@Override
			public Adapter caseRamp(Ramp object) {
				return createRampAdapter();
			}
			@Override
			public Adapter caseCylinder(Cylinder object) {
				return createCylinderAdapter();
			}
			@Override
			public Adapter caseDispenser(Dispenser object) {
				return createDispenserAdapter();
			}
			@Override
			public Adapter caseBottleSeperator(BottleSeperator object) {
				return createBottleSeperatorAdapter();
			}
			@Override
			public Adapter caseSplitter(Splitter object) {
				return createSplitterAdapter();
			}
			@Override
			public Adapter casePowerSplitter(PowerSplitter object) {
				return createPowerSplitterAdapter();
			}
			@Override
			public Adapter caseWaterSplitter(WaterSplitter object) {
				return createWaterSplitterAdapter();
			}
			@Override
			public Adapter casePneumaticSplitter(PneumaticSplitter object) {
				return createPneumaticSplitterAdapter();
			}
			@Override
			public Adapter casePanel(Panel object) {
				return createPanelAdapter();
			}
			@Override
			public Adapter caseOperationPanel(OperationPanel object) {
				return createOperationPanelAdapter();
			}
			@Override
			public Adapter caseCable(Cable object) {
				return createCableAdapter();
			}
			@Override
			public Adapter casePowerSupply(PowerSupply object) {
				return createPowerSupplyAdapter();
			}
			@Override
			public Adapter caseCompressor(Compressor object) {
				return createCompressorAdapter();
			}
			@Override
			public Adapter caseElectronicPart(ElectronicPart object) {
				return createElectronicPartAdapter();
			}
			@Override
			public Adapter caseSwitch(Switch object) {
				return createSwitchAdapter();
			}
			@Override
			public Adapter casePowerCable(PowerCable object) {
				return createPowerCableAdapter();
			}
			@Override
			public Adapter caseMonostableCylinder(MonostableCylinder object) {
				return createMonostableCylinderAdapter();
			}
			@Override
			public Adapter caseProportionalCylinder(ProportionalCylinder object) {
				return createProportionalCylinderAdapter();
			}
			@Override
			public Adapter caseBistableCylinder(BistableCylinder object) {
				return createBistableCylinderAdapter();
			}
			@Override
			public Adapter caseController(Controller object) {
				return createControllerAdapter();
			}
			@Override
			public Adapter caseLED(LED object) {
				return createLEDAdapter();
			}
			@Override
			public Adapter caseButton(Button object) {
				return createButtonAdapter();
			}
			@Override
			public Adapter caseRegularRamp(RegularRamp object) {
				return createRegularRampAdapter();
			}
			@Override
			public Adapter casePipe(Pipe object) {
				return createPipeAdapter();
			}
			@Override
			public Adapter casePneumaticPipe(PneumaticPipe object) {
				return createPneumaticPipeAdapter();
			}
			@Override
			public Adapter caseBusMaster(BusMaster object) {
				return createBusMasterAdapter();
			}
			@Override
			public Adapter caseBusSlave(BusSlave object) {
				return createBusSlaveAdapter();
			}
			@Override
			public Adapter caseBusCable(BusCable object) {
				return createBusCableAdapter();
			}
			@Override
			public Adapter caseBusBox(BusBox object) {
				return createBusBoxAdapter();
			}
			@Override
			public Adapter caseInterface(Interface object) {
				return createInterfaceAdapter();
			}
			@Override
			public Adapter caseScrewing(Screwing object) {
				return createScrewingAdapter();
			}
			@Override
			public Adapter caseSuspension(Suspension object) {
				return createSuspensionAdapter();
			}
			@Override
			public Adapter caseGearing(Gearing object) {
				return createGearingAdapter();
			}
			@Override
			public Adapter caseClamping(Clamping object) {
				return createClampingAdapter();
			}
			@Override
			public Adapter casePneumaticSupply(PneumaticSupply object) {
				return createPneumaticSupplyAdapter();
			}
			@Override
			public Adapter caseSignalInterface(SignalInterface object) {
				return createSignalInterfaceAdapter();
			}
			@Override
			public Adapter caseWaterSupply(WaterSupply object) {
				return createWaterSupplyAdapter();
			}
			@Override
			public Adapter casePhysicalConnection(PhysicalConnection object) {
				return createPhysicalConnectionAdapter();
			}
			@Override
			public Adapter caseTransportConnection(TransportConnection object) {
				return createTransportConnectionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link xPPU.Plant <em>Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.Plant
	 * @generated
	 */
	public Adapter createPlantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.Structure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.Structure
	 * @generated
	 */
	public Adapter createStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.CommunicationNetwork <em>Communication Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.CommunicationNetwork
	 * @generated
	 */
	public Adapter createCommunicationNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.PowerNetwork <em>Power Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.PowerNetwork
	 * @generated
	 */
	public Adapter createPowerNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ControlCabinet <em>Control Cabinet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ControlCabinet
	 * @generated
	 */
	public Adapter createControlCabinetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.PneumaticNetwork <em>Pneumatic Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.PneumaticNetwork
	 * @generated
	 */
	public Adapter createPneumaticNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.Conveyor <em>Conveyor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.Conveyor
	 * @generated
	 */
	public Adapter createConveyorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.Crane <em>Crane</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.Crane
	 * @generated
	 */
	public Adapter createCraneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.PowerWiring <em>Power Wiring</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.PowerWiring
	 * @generated
	 */
	public Adapter createPowerWiringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.Modules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.Modules
	 * @generated
	 */
	public Adapter createModulesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.RampModule <em>Ramp Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.RampModule
	 * @generated
	 */
	public Adapter createRampModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.PusherModule <em>Pusher Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.PusherModule
	 * @generated
	 */
	public Adapter createPusherModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.MotorModule <em>Motor Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.MotorModule
	 * @generated
	 */
	public Adapter createMotorModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.SensorModule <em>Sensor Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.SensorModule
	 * @generated
	 */
	public Adapter createSensorModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.Arm <em>Arm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.Arm
	 * @generated
	 */
	public Adapter createArmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.TurningTable <em>Turning Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.TurningTable
	 * @generated
	 */
	public Adapter createTurningTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.VacuumGripper <em>Vacuum Gripper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.VacuumGripper
	 * @generated
	 */
	public Adapter createVacuumGripperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ConveyorBelt <em>Conveyor Belt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ConveyorBelt
	 * @generated
	 */
	public Adapter createConveyorBeltAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.Pusher <em>Pusher</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.Pusher
	 * @generated
	 */
	public Adapter createPusherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.Components <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.Components
	 * @generated
	 */
	public Adapter createComponentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.Motor <em>Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.Motor
	 * @generated
	 */
	public Adapter createMotorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.SimpleMotor <em>Simple Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.SimpleMotor
	 * @generated
	 */
	public Adapter createSimpleMotorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.Sensor
	 * @generated
	 */
	public Adapter createSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.Rack <em>Rack</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.Rack
	 * @generated
	 */
	public Adapter createRackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.Corner <em>Corner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.Corner
	 * @generated
	 */
	public Adapter createCornerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.Valve <em>Valve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.Valve
	 * @generated
	 */
	public Adapter createValveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.Tank <em>Tank</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.Tank
	 * @generated
	 */
	public Adapter createTankAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.MechanicalPart <em>Mechanical Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.MechanicalPart
	 * @generated
	 */
	public Adapter createMechanicalPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.Pushhead <em>Pushhead</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.Pushhead
	 * @generated
	 */
	public Adapter createPushheadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.MechanicalAssembly <em>Mechanical Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.MechanicalAssembly
	 * @generated
	 */
	public Adapter createMechanicalAssemblyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.Ramp <em>Ramp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.Ramp
	 * @generated
	 */
	public Adapter createRampAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.Cylinder <em>Cylinder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.Cylinder
	 * @generated
	 */
	public Adapter createCylinderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.Dispenser <em>Dispenser</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.Dispenser
	 * @generated
	 */
	public Adapter createDispenserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.BottleSeperator <em>Bottle Seperator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.BottleSeperator
	 * @generated
	 */
	public Adapter createBottleSeperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.Splitter <em>Splitter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.Splitter
	 * @generated
	 */
	public Adapter createSplitterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.PowerSplitter <em>Power Splitter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.PowerSplitter
	 * @generated
	 */
	public Adapter createPowerSplitterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.WaterSplitter <em>Water Splitter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.WaterSplitter
	 * @generated
	 */
	public Adapter createWaterSplitterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.PneumaticSplitter <em>Pneumatic Splitter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.PneumaticSplitter
	 * @generated
	 */
	public Adapter createPneumaticSplitterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.Panel <em>Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.Panel
	 * @generated
	 */
	public Adapter createPanelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.OperationPanel <em>Operation Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.OperationPanel
	 * @generated
	 */
	public Adapter createOperationPanelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.Cable <em>Cable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.Cable
	 * @generated
	 */
	public Adapter createCableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.PowerSupply <em>Power Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.PowerSupply
	 * @generated
	 */
	public Adapter createPowerSupplyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.Compressor <em>Compressor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.Compressor
	 * @generated
	 */
	public Adapter createCompressorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ElectronicPart <em>Electronic Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ElectronicPart
	 * @generated
	 */
	public Adapter createElectronicPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.Switch <em>Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.Switch
	 * @generated
	 */
	public Adapter createSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.PowerCable <em>Power Cable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.PowerCable
	 * @generated
	 */
	public Adapter createPowerCableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.MonostableCylinder <em>Monostable Cylinder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.MonostableCylinder
	 * @generated
	 */
	public Adapter createMonostableCylinderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ProportionalCylinder <em>Proportional Cylinder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ProportionalCylinder
	 * @generated
	 */
	public Adapter createProportionalCylinderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.BistableCylinder <em>Bistable Cylinder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.BistableCylinder
	 * @generated
	 */
	public Adapter createBistableCylinderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.Controller
	 * @generated
	 */
	public Adapter createControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.LED <em>LED</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.LED
	 * @generated
	 */
	public Adapter createLEDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.Button
	 * @generated
	 */
	public Adapter createButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.RegularRamp <em>Regular Ramp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.RegularRamp
	 * @generated
	 */
	public Adapter createRegularRampAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.Pipe <em>Pipe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.Pipe
	 * @generated
	 */
	public Adapter createPipeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.PneumaticPipe <em>Pneumatic Pipe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.PneumaticPipe
	 * @generated
	 */
	public Adapter createPneumaticPipeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.BusMaster <em>Bus Master</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.BusMaster
	 * @generated
	 */
	public Adapter createBusMasterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.BusSlave <em>Bus Slave</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.BusSlave
	 * @generated
	 */
	public Adapter createBusSlaveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.BusCable <em>Bus Cable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.BusCable
	 * @generated
	 */
	public Adapter createBusCableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.BusBox <em>Bus Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.BusBox
	 * @generated
	 */
	public Adapter createBusBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.Screwing <em>Screwing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.Screwing
	 * @generated
	 */
	public Adapter createScrewingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.Suspension <em>Suspension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.Suspension
	 * @generated
	 */
	public Adapter createSuspensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.Gearing <em>Gearing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.Gearing
	 * @generated
	 */
	public Adapter createGearingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.Clamping <em>Clamping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.Clamping
	 * @generated
	 */
	public Adapter createClampingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.PneumaticSupply <em>Pneumatic Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.PneumaticSupply
	 * @generated
	 */
	public Adapter createPneumaticSupplyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.SignalInterface <em>Signal Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.SignalInterface
	 * @generated
	 */
	public Adapter createSignalInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.WaterSupply <em>Water Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.WaterSupply
	 * @generated
	 */
	public Adapter createWaterSupplyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.PhysicalConnection <em>Physical Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.PhysicalConnection
	 * @generated
	 */
	public Adapter createPhysicalConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.TransportConnection <em>Transport Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.TransportConnection
	 * @generated
	 */
	public Adapter createTransportConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //XPPUAdapterFactory
