/**
 */
package xPPU.ComponentRepository.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import xPPU.ComponentRepository.*;

import xPPU.ElectronicComponents.ElectronicPart;
import xPPU.ElectronicComponents.Switch;

import xPPU.Identifier.Identifier;

import xPPU.InterfaceRepository.Interface;

import xPPU.MechanicalComponents.MechanicalPart;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see xPPU.ComponentRepository.ComponentRepositoryPackage
 * @generated
 */
public class ComponentRepositoryAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ComponentRepositoryPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentRepositoryAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ComponentRepositoryPackage.eINSTANCE;
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
	protected ComponentRepositorySwitch<Adapter> modelSwitch =
		new ComponentRepositorySwitch<Adapter>() {
			@Override
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
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
			public Adapter caseMotor(Motor object) {
				return createMotorAdapter();
			}
			@Override
			public Adapter caseSimpleMotor(SimpleMotor object) {
				return createSimpleMotorAdapter();
			}
			@Override
			public Adapter caseMechanicalAssembly(MechanicalAssembly object) {
				return createMechanicalAssemblyAdapter();
			}
			@Override
			public Adapter caseRegularRamp(RegularRamp object) {
				return createRegularRampAdapter();
			}
			@Override
			public Adapter caseSensor(Sensor object) {
				return createSensorAdapter();
			}
			@Override
			public Adapter caseOpticalSensor(OpticalSensor object) {
				return createOpticalSensorAdapter();
			}
			@Override
			public Adapter caseInductiveSensor(InductiveSensor object) {
				return createInductiveSensorAdapter();
			}
			@Override
			public Adapter casePresenceSensor(PresenceSensor object) {
				return createPresenceSensorAdapter();
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
			public Adapter caseCompressor(Compressor object) {
				return createCompressorAdapter();
			}
			@Override
			public Adapter caseCable(Cable object) {
				return createCableAdapter();
			}
			@Override
			public Adapter casePowerCable(PowerCable object) {
				return createPowerCableAdapter();
			}
			@Override
			public Adapter caseCylinder(Cylinder object) {
				return createCylinderAdapter();
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
			public Adapter caseRegularValve(RegularValve object) {
				return createRegularValveAdapter();
			}
			@Override
			public Adapter caseTank(Tank object) {
				return createTankAdapter();
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
			public Adapter casePowerSupply(PowerSupply object) {
				return createPowerSupplyAdapter();
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
			public Adapter caseFrame(Frame object) {
				return createFrameAdapter();
			}
			@Override
			public Adapter caseRubberBand(RubberBand object) {
				return createRubberBandAdapter();
			}
			@Override
			public Adapter casePusher(Pusher object) {
				return createPusherAdapter();
			}
			@Override
			public Adapter caseTurningTable(TurningTable object) {
				return createTurningTableAdapter();
			}
			@Override
			public Adapter caseController(Controller object) {
				return createControllerAdapter();
			}
			@Override
			public Adapter caseLogicalWiring(LogicalWiring object) {
				return createLogicalWiringAdapter();
			}
			@Override
			public Adapter caseArm(Arm object) {
				return createArmAdapter();
			}
			@Override
			public Adapter caseRamp(Ramp object) {
				return createRampAdapter();
			}
			@Override
			public Adapter caseTable(Table object) {
				return createTableAdapter();
			}
			@Override
			public Adapter caseGripperPart(GripperPart object) {
				return createGripperPartAdapter();
			}
			@Override
			public Adapter caseMicroswitchModule(MicroswitchModule object) {
				return createMicroswitchModuleAdapter();
			}
			@Override
			public Adapter caseVacuumSwitch(VacuumSwitch object) {
				return createVacuumSwitchAdapter();
			}
			@Override
			public Adapter caseReedSwitch(ReedSwitch object) {
				return createReedSwitchAdapter();
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
			public Adapter caseCylinderPart(CylinderPart object) {
				return createCylinderPartAdapter();
			}
			@Override
			public Adapter caseMonostableCylinder(MonostableCylinder object) {
				return createMonostableCylinderAdapter();
			}
			@Override
			public Adapter caseComponentRepository(ComponentRepository object) {
				return createComponentRepositoryAdapter();
			}
			@Override
			public Adapter caseIdentifier(Identifier object) {
				return createIdentifierAdapter();
			}
			@Override
			public Adapter caseInterface(Interface object) {
				return createInterfaceAdapter();
			}
			@Override
			public Adapter caseMechanicalPart(MechanicalPart object) {
				return createMechanicalPartAdapter();
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
	 * Creates a new adapter for an object of class '{@link xPPU.ComponentRepository.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ComponentRepository.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ComponentRepository.Panel <em>Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ComponentRepository.Panel
	 * @generated
	 */
	public Adapter createPanelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ComponentRepository.OperationPanel <em>Operation Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ComponentRepository.OperationPanel
	 * @generated
	 */
	public Adapter createOperationPanelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ComponentRepository.Motor <em>Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ComponentRepository.Motor
	 * @generated
	 */
	public Adapter createMotorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ComponentRepository.SimpleMotor <em>Simple Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ComponentRepository.SimpleMotor
	 * @generated
	 */
	public Adapter createSimpleMotorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ComponentRepository.MechanicalAssembly <em>Mechanical Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ComponentRepository.MechanicalAssembly
	 * @generated
	 */
	public Adapter createMechanicalAssemblyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ComponentRepository.RegularRamp <em>Regular Ramp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ComponentRepository.RegularRamp
	 * @generated
	 */
	public Adapter createRegularRampAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ComponentRepository.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ComponentRepository.Sensor
	 * @generated
	 */
	public Adapter createSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ComponentRepository.OpticalSensor <em>Optical Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ComponentRepository.OpticalSensor
	 * @generated
	 */
	public Adapter createOpticalSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ComponentRepository.InductiveSensor <em>Inductive Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ComponentRepository.InductiveSensor
	 * @generated
	 */
	public Adapter createInductiveSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ComponentRepository.PresenceSensor <em>Presence Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ComponentRepository.PresenceSensor
	 * @generated
	 */
	public Adapter createPresenceSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ComponentRepository.Pipe <em>Pipe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ComponentRepository.Pipe
	 * @generated
	 */
	public Adapter createPipeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ComponentRepository.PneumaticPipe <em>Pneumatic Pipe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ComponentRepository.PneumaticPipe
	 * @generated
	 */
	public Adapter createPneumaticPipeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ComponentRepository.Compressor <em>Compressor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ComponentRepository.Compressor
	 * @generated
	 */
	public Adapter createCompressorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ComponentRepository.Cable <em>Cable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ComponentRepository.Cable
	 * @generated
	 */
	public Adapter createCableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ComponentRepository.PowerCable <em>Power Cable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ComponentRepository.PowerCable
	 * @generated
	 */
	public Adapter createPowerCableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ComponentRepository.Cylinder <em>Cylinder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ComponentRepository.Cylinder
	 * @generated
	 */
	public Adapter createCylinderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ComponentRepository.ProportionalCylinder <em>Proportional Cylinder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ComponentRepository.ProportionalCylinder
	 * @generated
	 */
	public Adapter createProportionalCylinderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ComponentRepository.BistableCylinder <em>Bistable Cylinder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ComponentRepository.BistableCylinder
	 * @generated
	 */
	public Adapter createBistableCylinderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ComponentRepository.Rack <em>Rack</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ComponentRepository.Rack
	 * @generated
	 */
	public Adapter createRackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ComponentRepository.Corner <em>Corner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ComponentRepository.Corner
	 * @generated
	 */
	public Adapter createCornerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ComponentRepository.Valve <em>Valve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ComponentRepository.Valve
	 * @generated
	 */
	public Adapter createValveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ComponentRepository.RegularValve <em>Regular Valve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ComponentRepository.RegularValve
	 * @generated
	 */
	public Adapter createRegularValveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ComponentRepository.Tank <em>Tank</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ComponentRepository.Tank
	 * @generated
	 */
	public Adapter createTankAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ComponentRepository.Dispenser <em>Dispenser</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ComponentRepository.Dispenser
	 * @generated
	 */
	public Adapter createDispenserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ComponentRepository.BottleSeperator <em>Bottle Seperator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ComponentRepository.BottleSeperator
	 * @generated
	 */
	public Adapter createBottleSeperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ComponentRepository.Splitter <em>Splitter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ComponentRepository.Splitter
	 * @generated
	 */
	public Adapter createSplitterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ComponentRepository.PowerSupply <em>Power Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ComponentRepository.PowerSupply
	 * @generated
	 */
	public Adapter createPowerSupplyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ComponentRepository.VacuumGripper <em>Vacuum Gripper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ComponentRepository.VacuumGripper
	 * @generated
	 */
	public Adapter createVacuumGripperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ComponentRepository.ConveyorBelt <em>Conveyor Belt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ComponentRepository.ConveyorBelt
	 * @generated
	 */
	public Adapter createConveyorBeltAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ComponentRepository.Frame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ComponentRepository.Frame
	 * @generated
	 */
	public Adapter createFrameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ComponentRepository.RubberBand <em>Rubber Band</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ComponentRepository.RubberBand
	 * @generated
	 */
	public Adapter createRubberBandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ComponentRepository.Pusher <em>Pusher</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ComponentRepository.Pusher
	 * @generated
	 */
	public Adapter createPusherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ComponentRepository.TurningTable <em>Turning Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ComponentRepository.TurningTable
	 * @generated
	 */
	public Adapter createTurningTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ComponentRepository.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ComponentRepository.Controller
	 * @generated
	 */
	public Adapter createControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ComponentRepository.LogicalWiring <em>Logical Wiring</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ComponentRepository.LogicalWiring
	 * @generated
	 */
	public Adapter createLogicalWiringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ComponentRepository.Arm <em>Arm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ComponentRepository.Arm
	 * @generated
	 */
	public Adapter createArmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ComponentRepository.Ramp <em>Ramp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ComponentRepository.Ramp
	 * @generated
	 */
	public Adapter createRampAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ComponentRepository.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ComponentRepository.Table
	 * @generated
	 */
	public Adapter createTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ComponentRepository.GripperPart <em>Gripper Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ComponentRepository.GripperPart
	 * @generated
	 */
	public Adapter createGripperPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ComponentRepository.MicroswitchModule <em>Microswitch Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ComponentRepository.MicroswitchModule
	 * @generated
	 */
	public Adapter createMicroswitchModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ComponentRepository.VacuumSwitch <em>Vacuum Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ComponentRepository.VacuumSwitch
	 * @generated
	 */
	public Adapter createVacuumSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ComponentRepository.ReedSwitch <em>Reed Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ComponentRepository.ReedSwitch
	 * @generated
	 */
	public Adapter createReedSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ComponentRepository.PowerSplitter <em>Power Splitter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ComponentRepository.PowerSplitter
	 * @generated
	 */
	public Adapter createPowerSplitterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ComponentRepository.WaterSplitter <em>Water Splitter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ComponentRepository.WaterSplitter
	 * @generated
	 */
	public Adapter createWaterSplitterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ComponentRepository.PneumaticSplitter <em>Pneumatic Splitter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ComponentRepository.PneumaticSplitter
	 * @generated
	 */
	public Adapter createPneumaticSplitterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ComponentRepository.CylinderPart <em>Cylinder Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ComponentRepository.CylinderPart
	 * @generated
	 */
	public Adapter createCylinderPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ComponentRepository.MonostableCylinder <em>Monostable Cylinder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ComponentRepository.MonostableCylinder
	 * @generated
	 */
	public Adapter createMonostableCylinderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ComponentRepository.ComponentRepository <em>Component Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ComponentRepository.ComponentRepository
	 * @generated
	 */
	public Adapter createComponentRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.Identifier.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.Identifier.Identifier
	 * @generated
	 */
	public Adapter createIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.InterfaceRepository.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.InterfaceRepository.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.MechanicalComponents.MechanicalPart <em>Mechanical Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.MechanicalComponents.MechanicalPart
	 * @generated
	 */
	public Adapter createMechanicalPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ElectronicComponents.ElectronicPart <em>Electronic Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ElectronicComponents.ElectronicPart
	 * @generated
	 */
	public Adapter createElectronicPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ElectronicComponents.Switch <em>Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ElectronicComponents.Switch
	 * @generated
	 */
	public Adapter createSwitchAdapter() {
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

} //ComponentRepositoryAdapterFactory
