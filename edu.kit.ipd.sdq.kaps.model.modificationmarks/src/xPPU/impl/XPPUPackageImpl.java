/**
 */
package xPPU.impl;

import edu.kit.ipd.sdq.amp.model.modificationmarks.ModificationmarksPackage;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.modificationmarksPackage;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.impl.modificationmarksPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;

import org.palladiosimulator.pcm.core.entity.EntityPackage;

import xPPU.Arm;
import xPPU.BistableCylinder;
import xPPU.BottleSeperator;
import xPPU.BusBox;
import xPPU.BusCable;
import xPPU.BusMaster;
import xPPU.BusSlave;
import xPPU.Button;
import xPPU.Cable;
import xPPU.Clamping;
import xPPU.CommunicationNetwork;
import xPPU.Components;
import xPPU.Compressor;
import xPPU.ControlCabinet;
import xPPU.Controller;
import xPPU.Conveyor;
import xPPU.ConveyorBelt;
import xPPU.Corner;
import xPPU.Crane;
import xPPU.Cylinder;
import xPPU.Dispenser;
import xPPU.ElectronicPart;
import xPPU.Gearing;
import xPPU.Interface;
import xPPU.MechanicalAssembly;
import xPPU.MechanicalPart;
import xPPU.Modules;
import xPPU.MonostableCylinder;
import xPPU.Motor;
import xPPU.MotorModule;
import xPPU.OperationPanel;
import xPPU.Panel;
import xPPU.PhysicalConnection;
import xPPU.Pipe;
import xPPU.Plant;
import xPPU.PneumaticNetwork;
import xPPU.PneumaticPipe;
import xPPU.PneumaticSplitter;
import xPPU.PneumaticSupply;
import xPPU.PowerCable;
import xPPU.PowerNetwork;
import xPPU.PowerSplitter;
import xPPU.PowerSupply;
import xPPU.PowerWiring;
import xPPU.ProportionalCylinder;
import xPPU.Pusher;
import xPPU.PusherModule;
import xPPU.Pushhead;
import xPPU.Rack;
import xPPU.Ramp;
import xPPU.RampModule;
import xPPU.RegularRamp;
import xPPU.Screwing;
import xPPU.Sensor;
import xPPU.SensorModule;
import xPPU.SignalInterface;
import xPPU.SimpleMotor;
import xPPU.Splitter;
import xPPU.Structure;
import xPPU.Suspension;
import xPPU.Switch;
import xPPU.Tank;
import xPPU.TransportConnection;
import xPPU.TurningTable;
import xPPU.VacuumGripper;
import xPPU.Valve;
import xPPU.WaterSplitter;
import xPPU.WaterSupply;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationNetworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerNetworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlCabinetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pneumaticNetworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conveyorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass craneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerWiringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modulesEClass = null;

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
	private EClass armEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turningTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vacuumGripperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conveyorBeltEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pusherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass motorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleMotorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cornerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tankEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mechanicalPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pushheadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mechanicalAssemblyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rampEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cylinderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dispenserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bottleSeperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass splitterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerSplitterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass waterSplitterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pneumaticSplitterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass panelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationPanelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerSupplyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compressorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass electronicPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerCableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monostableCylinderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proportionalCylinderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bistableCylinderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ledEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regularRampEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pipeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pneumaticPipeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busMasterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busSlaveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busCableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busBoxEClass = null;

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
	private EClass suspensionEClass = null;

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

		// Initialize simple dependencies
		ModificationmarksPackage.eINSTANCE.eClass();
		PcmPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		modificationmarksPackageImpl themodificationmarksPackage = (modificationmarksPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(modificationmarksPackage.eNS_URI) instanceof modificationmarksPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(modificationmarksPackage.eNS_URI) : modificationmarksPackage.eINSTANCE);

		// Create package meta-data objects
		theXPPUPackage.createPackageContents();
		themodificationmarksPackage.createPackageContents();

		// Initialize created meta-data
		theXPPUPackage.initializePackageContents();
		themodificationmarksPackage.initializePackageContents();

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
	public EReference getPlant_Structures() {
		return (EReference)plantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructure() {
		return structureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructure_ParentPlant() {
		return (EReference)structureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructure_Modules() {
		return (EReference)structureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructure_Components() {
		return (EReference)structureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructure_Cranes() {
		return (EReference)structureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructure_Conveyor() {
		return (EReference)structureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructure_Controlcabinets() {
		return (EReference)structureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructure_Powernetworks() {
		return (EReference)structureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructure_Communicationnetworks() {
		return (EReference)structureEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructure_Pneumaticnetworks() {
		return (EReference)structureEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructure_Powerwiring() {
		return (EReference)structureEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationNetwork() {
		return communicationNetworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationNetwork_ParentStructure() {
		return (EReference)communicationNetworkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPowerNetwork() {
		return powerNetworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPowerNetwork_ParentStructure() {
		return (EReference)powerNetworkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlCabinet() {
		return controlCabinetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlCabinet_ParentStructure() {
		return (EReference)controlCabinetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlCabinet_Controller() {
		return (EReference)controlCabinetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPneumaticNetwork() {
		return pneumaticNetworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPneumaticNetwork_ParentStructure() {
		return (EReference)pneumaticNetworkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConveyor() {
		return conveyorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConveyor_Belts() {
		return (EReference)conveyorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConveyor_ParentStructure() {
		return (EReference)conveyorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCrane() {
		return craneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrane_Arm() {
		return (EReference)craneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrane_MountedOn() {
		return (EReference)craneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrane_Vacuumgripper() {
		return (EReference)craneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrane_ParentStructure() {
		return (EReference)craneEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPowerWiring() {
		return powerWiringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPowerWiring_ParentStructure() {
		return (EReference)powerWiringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModules() {
		return modulesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModules_Modules() {
		return (EReference)modulesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModules_Rampmodules() {
		return (EReference)modulesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModules_Pushermodules() {
		return (EReference)modulesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModules_Motormodules() {
		return (EReference)modulesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModules_Sensormodules() {
		return (EReference)modulesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModules_ParentStructure() {
		return (EReference)modulesEClass.getEStructuralFeatures().get(5);
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
	public EReference getRampModule_ParentModuleContainer() {
		return (EReference)rampModuleEClass.getEStructuralFeatures().get(0);
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
	public EReference getPusherModule_ParentModuleContainer() {
		return (EReference)pusherModuleEClass.getEStructuralFeatures().get(0);
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
	public EReference getMotorModule_ParentModuleContainer() {
		return (EReference)motorModuleEClass.getEStructuralFeatures().get(0);
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
	public EReference getSensorModule_ParentModuleContainer() {
		return (EReference)sensorModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArm() {
		return armEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArm_MountedTo() {
		return (EReference)armEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTurningTable() {
		return turningTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTurningTable_Mounts() {
		return (EReference)turningTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVacuumGripper() {
		return vacuumGripperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVacuumGripper_MountedTo() {
		return (EReference)vacuumGripperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConveyorBelt() {
		return conveyorBeltEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConveyorBelt_MountedTo() {
		return (EReference)conveyorBeltEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPusher() {
		return pusherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPusher_ComponentsRepository() {
		return (EReference)pusherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponents() {
		return componentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponents_ParentStructure() {
		return (EReference)componentsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponents_ElectronicComponents() {
		return (EReference)componentsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponents_Interfaces() {
		return (EReference)componentsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponents_Motors() {
		return (EReference)componentsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponents_MechanicalAssemblys() {
		return (EReference)componentsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponents_Sensors() {
		return (EReference)componentsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponents_Pipes() {
		return (EReference)componentsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponents_Compressors() {
		return (EReference)componentsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponents_Buscables() {
		return (EReference)componentsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponents_Busmasters() {
		return (EReference)componentsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponents_Busslaves() {
		return (EReference)componentsEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponents_Busboxes() {
		return (EReference)componentsEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponents_Cylinders() {
		return (EReference)componentsEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponents_Powercables() {
		return (EReference)componentsEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponents_Valves() {
		return (EReference)componentsEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponents_Mechanicalparts() {
		return (EReference)componentsEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponents_Powersupplys() {
		return (EReference)componentsEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponents_Pushers() {
		return (EReference)componentsEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponents_Corners() {
		return (EReference)componentsEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponents_Dispensers() {
		return (EReference)componentsEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponents_Racks() {
		return (EReference)componentsEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponents_Tanks() {
		return (EReference)componentsEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponents_Splitter() {
		return (EReference)componentsEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponents_BottleSeperator() {
		return (EReference)componentsEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponents_Panels() {
		return (EReference)componentsEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponents_Cables() {
		return (EReference)componentsEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMotor() {
		return motorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMotor_Gearing() {
		return (EReference)motorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMotor_Screwing() {
		return (EReference)motorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMotor_Powersupply() {
		return (EReference)motorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMotor_ComponentRepository() {
		return (EReference)motorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleMotor() {
		return simpleMotorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensor() {
		return sensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensor_Physicalconnection() {
		return (EReference)sensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensor_Signalinterface() {
		return (EReference)sensorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensor_Powersupply() {
		return (EReference)sensorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensor_ComponentRepository() {
		return (EReference)sensorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRack() {
		return rackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRack_Screwing_to_base() {
		return (EReference)rackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRack_ComponentRepository() {
		return (EReference)rackEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCorner() {
		return cornerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCorner_ComponentRepository() {
		return (EReference)cornerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValve() {
		return valveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValve_Pneumaticsupply() {
		return (EReference)valveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValve_Powersupply() {
		return (EReference)valveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValve_Signalinterface() {
		return (EReference)valveEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValve_ComponentRepository() {
		return (EReference)valveEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTank() {
		return tankEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTank_Watersupply() {
		return (EReference)tankEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTank_Screwing() {
		return (EReference)tankEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTank_ComponentRepository() {
		return (EReference)tankEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMechanicalPart() {
		return mechanicalPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMechanicalPart_Screwing() {
		return (EReference)mechanicalPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMechanicalPart_ComponentRepository() {
		return (EReference)mechanicalPartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPushhead() {
		return pushheadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMechanicalAssembly() {
		return mechanicalAssemblyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMechanicalAssembly_ComponentRepository() {
		return (EReference)mechanicalAssemblyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRamp() {
		return rampEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRamp_Screwing_base() {
		return (EReference)rampEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRamp_Screwing_component() {
		return (EReference)rampEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRamp_Physicalconnection() {
		return (EReference)rampEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCylinder() {
		return cylinderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCylinder_Pneumaticsupply() {
		return (EReference)cylinderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCylinder_SignalInterface() {
		return (EReference)cylinderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCylinder_ComponentRepository() {
		return (EReference)cylinderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDispenser() {
		return dispenserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDispenser_ComponentRepository() {
		return (EReference)dispenserEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBottleSeperator() {
		return bottleSeperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBottleSeperator_Signalinterface() {
		return (EReference)bottleSeperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBottleSeperator_Pneumaticsupply() {
		return (EReference)bottleSeperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBottleSeperator_Powersupply() {
		return (EReference)bottleSeperatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBottleSeperator_Screwing_to_rack() {
		return (EReference)bottleSeperatorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBottleSeperator_ComponentRepository() {
		return (EReference)bottleSeperatorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSplitter() {
		return splitterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSplitter_Screwing() {
		return (EReference)splitterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSplitter_ComponentRepository() {
		return (EReference)splitterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPowerSplitter() {
		return powerSplitterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPowerSplitter_Powersupply() {
		return (EReference)powerSplitterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWaterSplitter() {
		return waterSplitterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWaterSplitter_Watersupply() {
		return (EReference)waterSplitterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPneumaticSplitter() {
		return pneumaticSplitterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPneumaticSplitter_Pneumaticsupply() {
		return (EReference)pneumaticSplitterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPanel() {
		return panelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPanel_ComponentRepository() {
		return (EReference)panelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationPanel() {
		return operationPanelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationPanel_Screwing_rack() {
		return (EReference)operationPanelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationPanel_Leds() {
		return (EReference)operationPanelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationPanel_Buttons() {
		return (EReference)operationPanelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCable() {
		return cableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCable_ComponentRepository() {
		return (EReference)cableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPowerSupply() {
		return powerSupplyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPowerSupply_ComponentRepository() {
		return (EReference)powerSupplyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompressor() {
		return compressorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompressor_Powersupply() {
		return (EReference)compressorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompressor_Pneumaticsupply() {
		return (EReference)compressorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompressor_Pins() {
		return (EReference)compressorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompressor_Screwing() {
		return (EReference)compressorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompressor_ComponentRepository() {
		return (EReference)compressorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElectronicPart() {
		return electronicPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElectronicPart_Pin() {
		return (EReference)electronicPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElectronicPart_Physicalconnection() {
		return (EReference)electronicPartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElectronicPart_ComponentRepository() {
		return (EReference)electronicPartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwitch() {
		return switchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPowerCable() {
		return powerCableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMonostableCylinder() {
		return monostableCylinderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProportionalCylinder() {
		return proportionalCylinderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBistableCylinder() {
		return bistableCylinderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getController() {
		return controllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getController_Signalinterface() {
		return (EReference)controllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getController_Powersupply() {
		return (EReference)controllerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getController_ControllerOf() {
		return (EReference)controllerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLED() {
		return ledEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButton() {
		return buttonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegularRamp() {
		return regularRampEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPipe() {
		return pipeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPipe_Plugs() {
		return (EReference)pipeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPipe_ComponentRepository() {
		return (EReference)pipeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPneumaticPipe() {
		return pneumaticPipeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusMaster() {
		return busMasterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusMaster_Signalinterfaces() {
		return (EReference)busMasterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusMaster_Signalinterface_controller() {
		return (EReference)busMasterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusMaster_ComponentRepostitory() {
		return (EReference)busMasterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusSlave() {
		return busSlaveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusSlave_Signalinterface_master() {
		return (EReference)busSlaveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusSlave_Signalinterface_slave() {
		return (EReference)busSlaveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusSlave_ComponentRepository() {
		return (EReference)busSlaveEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusCable() {
		return busCableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusCable_SignalPlug1() {
		return (EReference)busCableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusCable_SignalPlug2() {
		return (EReference)busCableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusBox() {
		return busBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusBox_Signalinterfaces() {
		return (EReference)busBoxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusBox_Signalinterface_master() {
		return (EReference)busBoxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusBox_Signalinterface_box() {
		return (EReference)busBoxEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusBox_Powersupply() {
		return (EReference)busBoxEClass.getEStructuralFeatures().get(3);
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
	public EReference getInterface_Screwings() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Suspensions() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Gearings() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Clamping() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Pneumaticsupplys() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Signalinterfaces() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Powersupply() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Watersupply() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Physicalconnections() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Transportconnection() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_ComponentRepository() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(10);
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
	public EReference getScrewing_IntefacePart() {
		return (EReference)screwingEClass.getEStructuralFeatures().get(0);
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
	public EReference getSuspension_IntefacePart() {
		return (EReference)suspensionEClass.getEStructuralFeatures().get(0);
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
	public EReference getGearing_IntefacePart() {
		return (EReference)gearingEClass.getEStructuralFeatures().get(0);
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
	public EReference getClamping_IntefacePart() {
		return (EReference)clampingEClass.getEStructuralFeatures().get(0);
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
	public EReference getPneumaticSupply_IntefacePart() {
		return (EReference)pneumaticSupplyEClass.getEStructuralFeatures().get(0);
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
	public EReference getSignalInterface_IntefacePart() {
		return (EReference)signalInterfaceEClass.getEStructuralFeatures().get(0);
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
	public EReference getWaterSupply_IntefacePart() {
		return (EReference)waterSupplyEClass.getEStructuralFeatures().get(0);
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
	public EReference getPhysicalConnection_IntefacePart() {
		return (EReference)physicalConnectionEClass.getEStructuralFeatures().get(0);
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
	public EReference getTransportConnection_IntefacePart() {
		return (EReference)transportConnectionEClass.getEStructuralFeatures().get(0);
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
		createEReference(plantEClass, PLANT__STRUCTURES);

		structureEClass = createEClass(STRUCTURE);
		createEReference(structureEClass, STRUCTURE__PARENT_PLANT);
		createEReference(structureEClass, STRUCTURE__MODULES);
		createEReference(structureEClass, STRUCTURE__COMPONENTS);
		createEReference(structureEClass, STRUCTURE__CRANES);
		createEReference(structureEClass, STRUCTURE__CONVEYOR);
		createEReference(structureEClass, STRUCTURE__CONTROLCABINETS);
		createEReference(structureEClass, STRUCTURE__POWERNETWORKS);
		createEReference(structureEClass, STRUCTURE__COMMUNICATIONNETWORKS);
		createEReference(structureEClass, STRUCTURE__PNEUMATICNETWORKS);
		createEReference(structureEClass, STRUCTURE__POWERWIRING);

		communicationNetworkEClass = createEClass(COMMUNICATION_NETWORK);
		createEReference(communicationNetworkEClass, COMMUNICATION_NETWORK__PARENT_STRUCTURE);

		powerNetworkEClass = createEClass(POWER_NETWORK);
		createEReference(powerNetworkEClass, POWER_NETWORK__PARENT_STRUCTURE);

		controlCabinetEClass = createEClass(CONTROL_CABINET);
		createEReference(controlCabinetEClass, CONTROL_CABINET__PARENT_STRUCTURE);
		createEReference(controlCabinetEClass, CONTROL_CABINET__CONTROLLER);

		pneumaticNetworkEClass = createEClass(PNEUMATIC_NETWORK);
		createEReference(pneumaticNetworkEClass, PNEUMATIC_NETWORK__PARENT_STRUCTURE);

		conveyorEClass = createEClass(CONVEYOR);
		createEReference(conveyorEClass, CONVEYOR__BELTS);
		createEReference(conveyorEClass, CONVEYOR__PARENT_STRUCTURE);

		craneEClass = createEClass(CRANE);
		createEReference(craneEClass, CRANE__ARM);
		createEReference(craneEClass, CRANE__MOUNTED_ON);
		createEReference(craneEClass, CRANE__VACUUMGRIPPER);
		createEReference(craneEClass, CRANE__PARENT_STRUCTURE);

		powerWiringEClass = createEClass(POWER_WIRING);
		createEReference(powerWiringEClass, POWER_WIRING__PARENT_STRUCTURE);

		modulesEClass = createEClass(MODULES);
		createEReference(modulesEClass, MODULES__MODULES);
		createEReference(modulesEClass, MODULES__RAMPMODULES);
		createEReference(modulesEClass, MODULES__PUSHERMODULES);
		createEReference(modulesEClass, MODULES__MOTORMODULES);
		createEReference(modulesEClass, MODULES__SENSORMODULES);
		createEReference(modulesEClass, MODULES__PARENT_STRUCTURE);

		rampModuleEClass = createEClass(RAMP_MODULE);
		createEReference(rampModuleEClass, RAMP_MODULE__PARENT_MODULE_CONTAINER);

		pusherModuleEClass = createEClass(PUSHER_MODULE);
		createEReference(pusherModuleEClass, PUSHER_MODULE__PARENT_MODULE_CONTAINER);

		motorModuleEClass = createEClass(MOTOR_MODULE);
		createEReference(motorModuleEClass, MOTOR_MODULE__PARENT_MODULE_CONTAINER);

		sensorModuleEClass = createEClass(SENSOR_MODULE);
		createEReference(sensorModuleEClass, SENSOR_MODULE__PARENT_MODULE_CONTAINER);

		armEClass = createEClass(ARM);
		createEReference(armEClass, ARM__MOUNTED_TO);

		turningTableEClass = createEClass(TURNING_TABLE);
		createEReference(turningTableEClass, TURNING_TABLE__MOUNTS);

		vacuumGripperEClass = createEClass(VACUUM_GRIPPER);
		createEReference(vacuumGripperEClass, VACUUM_GRIPPER__MOUNTED_TO);

		conveyorBeltEClass = createEClass(CONVEYOR_BELT);
		createEReference(conveyorBeltEClass, CONVEYOR_BELT__MOUNTED_TO);

		pusherEClass = createEClass(PUSHER);
		createEReference(pusherEClass, PUSHER__COMPONENTS_REPOSITORY);

		componentsEClass = createEClass(COMPONENTS);
		createEReference(componentsEClass, COMPONENTS__PARENT_STRUCTURE);
		createEReference(componentsEClass, COMPONENTS__ELECTRONIC_COMPONENTS);
		createEReference(componentsEClass, COMPONENTS__INTERFACES);
		createEReference(componentsEClass, COMPONENTS__MOTORS);
		createEReference(componentsEClass, COMPONENTS__MECHANICAL_ASSEMBLYS);
		createEReference(componentsEClass, COMPONENTS__SENSORS);
		createEReference(componentsEClass, COMPONENTS__PIPES);
		createEReference(componentsEClass, COMPONENTS__COMPRESSORS);
		createEReference(componentsEClass, COMPONENTS__BUSCABLES);
		createEReference(componentsEClass, COMPONENTS__BUSMASTERS);
		createEReference(componentsEClass, COMPONENTS__BUSSLAVES);
		createEReference(componentsEClass, COMPONENTS__BUSBOXES);
		createEReference(componentsEClass, COMPONENTS__CYLINDERS);
		createEReference(componentsEClass, COMPONENTS__POWERCABLES);
		createEReference(componentsEClass, COMPONENTS__VALVES);
		createEReference(componentsEClass, COMPONENTS__MECHANICALPARTS);
		createEReference(componentsEClass, COMPONENTS__POWERSUPPLYS);
		createEReference(componentsEClass, COMPONENTS__PUSHERS);
		createEReference(componentsEClass, COMPONENTS__CORNERS);
		createEReference(componentsEClass, COMPONENTS__DISPENSERS);
		createEReference(componentsEClass, COMPONENTS__RACKS);
		createEReference(componentsEClass, COMPONENTS__TANKS);
		createEReference(componentsEClass, COMPONENTS__SPLITTER);
		createEReference(componentsEClass, COMPONENTS__BOTTLE_SEPERATOR);
		createEReference(componentsEClass, COMPONENTS__PANELS);
		createEReference(componentsEClass, COMPONENTS__CABLES);

		motorEClass = createEClass(MOTOR);
		createEReference(motorEClass, MOTOR__GEARING);
		createEReference(motorEClass, MOTOR__SCREWING);
		createEReference(motorEClass, MOTOR__POWERSUPPLY);
		createEReference(motorEClass, MOTOR__COMPONENT_REPOSITORY);

		simpleMotorEClass = createEClass(SIMPLE_MOTOR);

		sensorEClass = createEClass(SENSOR);
		createEReference(sensorEClass, SENSOR__PHYSICALCONNECTION);
		createEReference(sensorEClass, SENSOR__SIGNALINTERFACE);
		createEReference(sensorEClass, SENSOR__POWERSUPPLY);
		createEReference(sensorEClass, SENSOR__COMPONENT_REPOSITORY);

		rackEClass = createEClass(RACK);
		createEReference(rackEClass, RACK__SCREWING_TO_BASE);
		createEReference(rackEClass, RACK__COMPONENT_REPOSITORY);

		cornerEClass = createEClass(CORNER);
		createEReference(cornerEClass, CORNER__COMPONENT_REPOSITORY);

		valveEClass = createEClass(VALVE);
		createEReference(valveEClass, VALVE__PNEUMATICSUPPLY);
		createEReference(valveEClass, VALVE__POWERSUPPLY);
		createEReference(valveEClass, VALVE__SIGNALINTERFACE);
		createEReference(valveEClass, VALVE__COMPONENT_REPOSITORY);

		tankEClass = createEClass(TANK);
		createEReference(tankEClass, TANK__WATERSUPPLY);
		createEReference(tankEClass, TANK__SCREWING);
		createEReference(tankEClass, TANK__COMPONENT_REPOSITORY);

		mechanicalPartEClass = createEClass(MECHANICAL_PART);
		createEReference(mechanicalPartEClass, MECHANICAL_PART__SCREWING);
		createEReference(mechanicalPartEClass, MECHANICAL_PART__COMPONENT_REPOSITORY);

		pushheadEClass = createEClass(PUSHHEAD);

		mechanicalAssemblyEClass = createEClass(MECHANICAL_ASSEMBLY);
		createEReference(mechanicalAssemblyEClass, MECHANICAL_ASSEMBLY__COMPONENT_REPOSITORY);

		rampEClass = createEClass(RAMP);
		createEReference(rampEClass, RAMP__SCREWING_BASE);
		createEReference(rampEClass, RAMP__SCREWING_COMPONENT);
		createEReference(rampEClass, RAMP__PHYSICALCONNECTION);

		cylinderEClass = createEClass(CYLINDER);
		createEReference(cylinderEClass, CYLINDER__PNEUMATICSUPPLY);
		createEReference(cylinderEClass, CYLINDER__SIGNAL_INTERFACE);
		createEReference(cylinderEClass, CYLINDER__COMPONENT_REPOSITORY);

		dispenserEClass = createEClass(DISPENSER);
		createEReference(dispenserEClass, DISPENSER__COMPONENT_REPOSITORY);

		bottleSeperatorEClass = createEClass(BOTTLE_SEPERATOR);
		createEReference(bottleSeperatorEClass, BOTTLE_SEPERATOR__SIGNALINTERFACE);
		createEReference(bottleSeperatorEClass, BOTTLE_SEPERATOR__PNEUMATICSUPPLY);
		createEReference(bottleSeperatorEClass, BOTTLE_SEPERATOR__POWERSUPPLY);
		createEReference(bottleSeperatorEClass, BOTTLE_SEPERATOR__SCREWING_TO_RACK);
		createEReference(bottleSeperatorEClass, BOTTLE_SEPERATOR__COMPONENT_REPOSITORY);

		splitterEClass = createEClass(SPLITTER);
		createEReference(splitterEClass, SPLITTER__SCREWING);
		createEReference(splitterEClass, SPLITTER__COMPONENT_REPOSITORY);

		powerSplitterEClass = createEClass(POWER_SPLITTER);
		createEReference(powerSplitterEClass, POWER_SPLITTER__POWERSUPPLY);

		waterSplitterEClass = createEClass(WATER_SPLITTER);
		createEReference(waterSplitterEClass, WATER_SPLITTER__WATERSUPPLY);

		pneumaticSplitterEClass = createEClass(PNEUMATIC_SPLITTER);
		createEReference(pneumaticSplitterEClass, PNEUMATIC_SPLITTER__PNEUMATICSUPPLY);

		panelEClass = createEClass(PANEL);
		createEReference(panelEClass, PANEL__COMPONENT_REPOSITORY);

		operationPanelEClass = createEClass(OPERATION_PANEL);
		createEReference(operationPanelEClass, OPERATION_PANEL__SCREWING_RACK);
		createEReference(operationPanelEClass, OPERATION_PANEL__LEDS);
		createEReference(operationPanelEClass, OPERATION_PANEL__BUTTONS);

		cableEClass = createEClass(CABLE);
		createEReference(cableEClass, CABLE__COMPONENT_REPOSITORY);

		powerSupplyEClass = createEClass(POWER_SUPPLY);
		createEReference(powerSupplyEClass, POWER_SUPPLY__COMPONENT_REPOSITORY);

		compressorEClass = createEClass(COMPRESSOR);
		createEReference(compressorEClass, COMPRESSOR__POWERSUPPLY);
		createEReference(compressorEClass, COMPRESSOR__PNEUMATICSUPPLY);
		createEReference(compressorEClass, COMPRESSOR__PINS);
		createEReference(compressorEClass, COMPRESSOR__SCREWING);
		createEReference(compressorEClass, COMPRESSOR__COMPONENT_REPOSITORY);

		electronicPartEClass = createEClass(ELECTRONIC_PART);
		createEReference(electronicPartEClass, ELECTRONIC_PART__PIN);
		createEReference(electronicPartEClass, ELECTRONIC_PART__PHYSICALCONNECTION);
		createEReference(electronicPartEClass, ELECTRONIC_PART__COMPONENT_REPOSITORY);

		switchEClass = createEClass(SWITCH);

		powerCableEClass = createEClass(POWER_CABLE);

		monostableCylinderEClass = createEClass(MONOSTABLE_CYLINDER);

		proportionalCylinderEClass = createEClass(PROPORTIONAL_CYLINDER);

		bistableCylinderEClass = createEClass(BISTABLE_CYLINDER);

		controllerEClass = createEClass(CONTROLLER);
		createEReference(controllerEClass, CONTROLLER__SIGNALINTERFACE);
		createEReference(controllerEClass, CONTROLLER__POWERSUPPLY);
		createEReference(controllerEClass, CONTROLLER__CONTROLLER_OF);

		ledEClass = createEClass(LED);

		buttonEClass = createEClass(BUTTON);

		regularRampEClass = createEClass(REGULAR_RAMP);

		pipeEClass = createEClass(PIPE);
		createEReference(pipeEClass, PIPE__PLUGS);
		createEReference(pipeEClass, PIPE__COMPONENT_REPOSITORY);

		pneumaticPipeEClass = createEClass(PNEUMATIC_PIPE);

		busMasterEClass = createEClass(BUS_MASTER);
		createEReference(busMasterEClass, BUS_MASTER__SIGNALINTERFACES);
		createEReference(busMasterEClass, BUS_MASTER__SIGNALINTERFACE_CONTROLLER);
		createEReference(busMasterEClass, BUS_MASTER__COMPONENT_REPOSTITORY);

		busSlaveEClass = createEClass(BUS_SLAVE);
		createEReference(busSlaveEClass, BUS_SLAVE__SIGNALINTERFACE_MASTER);
		createEReference(busSlaveEClass, BUS_SLAVE__SIGNALINTERFACE_SLAVE);
		createEReference(busSlaveEClass, BUS_SLAVE__COMPONENT_REPOSITORY);

		busCableEClass = createEClass(BUS_CABLE);
		createEReference(busCableEClass, BUS_CABLE__SIGNAL_PLUG1);
		createEReference(busCableEClass, BUS_CABLE__SIGNAL_PLUG2);

		busBoxEClass = createEClass(BUS_BOX);
		createEReference(busBoxEClass, BUS_BOX__SIGNALINTERFACES);
		createEReference(busBoxEClass, BUS_BOX__SIGNALINTERFACE_MASTER);
		createEReference(busBoxEClass, BUS_BOX__SIGNALINTERFACE_BOX);
		createEReference(busBoxEClass, BUS_BOX__POWERSUPPLY);

		interfaceEClass = createEClass(INTERFACE);
		createEReference(interfaceEClass, INTERFACE__SCREWINGS);
		createEReference(interfaceEClass, INTERFACE__SUSPENSIONS);
		createEReference(interfaceEClass, INTERFACE__GEARINGS);
		createEReference(interfaceEClass, INTERFACE__CLAMPING);
		createEReference(interfaceEClass, INTERFACE__PNEUMATICSUPPLYS);
		createEReference(interfaceEClass, INTERFACE__SIGNALINTERFACES);
		createEReference(interfaceEClass, INTERFACE__POWERSUPPLY);
		createEReference(interfaceEClass, INTERFACE__WATERSUPPLY);
		createEReference(interfaceEClass, INTERFACE__PHYSICALCONNECTIONS);
		createEReference(interfaceEClass, INTERFACE__TRANSPORTCONNECTION);
		createEReference(interfaceEClass, INTERFACE__COMPONENT_REPOSITORY);

		screwingEClass = createEClass(SCREWING);
		createEReference(screwingEClass, SCREWING__INTEFACE_PART);

		suspensionEClass = createEClass(SUSPENSION);
		createEReference(suspensionEClass, SUSPENSION__INTEFACE_PART);

		gearingEClass = createEClass(GEARING);
		createEReference(gearingEClass, GEARING__INTEFACE_PART);

		clampingEClass = createEClass(CLAMPING);
		createEReference(clampingEClass, CLAMPING__INTEFACE_PART);

		pneumaticSupplyEClass = createEClass(PNEUMATIC_SUPPLY);
		createEReference(pneumaticSupplyEClass, PNEUMATIC_SUPPLY__INTEFACE_PART);

		signalInterfaceEClass = createEClass(SIGNAL_INTERFACE);
		createEReference(signalInterfaceEClass, SIGNAL_INTERFACE__INTEFACE_PART);

		waterSupplyEClass = createEClass(WATER_SUPPLY);
		createEReference(waterSupplyEClass, WATER_SUPPLY__INTEFACE_PART);

		physicalConnectionEClass = createEClass(PHYSICAL_CONNECTION);
		createEReference(physicalConnectionEClass, PHYSICAL_CONNECTION__INTEFACE_PART);

		transportConnectionEClass = createEClass(TRANSPORT_CONNECTION);
		createEReference(transportConnectionEClass, TRANSPORT_CONNECTION__INTEFACE_PART);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		armEClass.getESuperTypes().add(this.getMechanicalAssembly());
		simpleMotorEClass.getESuperTypes().add(this.getMotor());
		pushheadEClass.getESuperTypes().add(this.getMechanicalPart());
		rampEClass.getESuperTypes().add(this.getMechanicalAssembly());
		powerSplitterEClass.getESuperTypes().add(this.getSplitter());
		waterSplitterEClass.getESuperTypes().add(this.getSplitter());
		pneumaticSplitterEClass.getESuperTypes().add(this.getSplitter());
		operationPanelEClass.getESuperTypes().add(this.getPanel());
		switchEClass.getESuperTypes().add(this.getElectronicPart());
		powerCableEClass.getESuperTypes().add(this.getCable());
		monostableCylinderEClass.getESuperTypes().add(this.getCylinder());
		proportionalCylinderEClass.getESuperTypes().add(this.getCylinder());
		bistableCylinderEClass.getESuperTypes().add(this.getCylinder());
		ledEClass.getESuperTypes().add(this.getElectronicPart());
		buttonEClass.getESuperTypes().add(this.getElectronicPart());
		regularRampEClass.getESuperTypes().add(this.getRamp());
		pneumaticPipeEClass.getESuperTypes().add(this.getPipe());
		busCableEClass.getESuperTypes().add(this.getCable());

		// Initialize classes and features; add operations and parameters
		initEClass(plantEClass, Plant.class, "Plant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlant_Structures(), this.getStructure(), this.getStructure_ParentPlant(), "structures", null, 0, -1, Plant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structureEClass, Structure.class, "Structure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructure_ParentPlant(), this.getPlant(), this.getPlant_Structures(), "parentPlant", null, 1, 1, Structure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructure_Modules(), this.getModules(), this.getModules_ParentStructure(), "modules", null, 0, -1, Structure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructure_Components(), this.getComponents(), this.getComponents_ParentStructure(), "components", null, 0, -1, Structure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructure_Cranes(), this.getCrane(), this.getCrane_ParentStructure(), "cranes", null, 0, -1, Structure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructure_Conveyor(), this.getConveyor(), this.getConveyor_ParentStructure(), "conveyor", null, 0, -1, Structure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructure_Controlcabinets(), this.getControlCabinet(), null, "controlcabinets", null, 0, -1, Structure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructure_Powernetworks(), this.getPowerNetwork(), this.getPowerNetwork_ParentStructure(), "powernetworks", null, 0, -1, Structure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructure_Communicationnetworks(), this.getCommunicationNetwork(), this.getCommunicationNetwork_ParentStructure(), "communicationnetworks", null, 0, -1, Structure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructure_Pneumaticnetworks(), this.getPneumaticNetwork(), this.getPneumaticNetwork_ParentStructure(), "pneumaticnetworks", null, 0, -1, Structure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructure_Powerwiring(), this.getPowerWiring(), this.getPowerWiring_ParentStructure(), "powerwiring", null, 0, -1, Structure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(communicationNetworkEClass, CommunicationNetwork.class, "CommunicationNetwork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommunicationNetwork_ParentStructure(), this.getStructure(), this.getStructure_Communicationnetworks(), "parentStructure", null, 1, 1, CommunicationNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(powerNetworkEClass, PowerNetwork.class, "PowerNetwork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPowerNetwork_ParentStructure(), this.getStructure(), this.getStructure_Powernetworks(), "parentStructure", null, 1, 1, PowerNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlCabinetEClass, ControlCabinet.class, "ControlCabinet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControlCabinet_ParentStructure(), this.getStructure(), null, "parentStructure", null, 1, 1, ControlCabinet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlCabinet_Controller(), this.getController(), this.getController_ControllerOf(), "controller", null, 1, 1, ControlCabinet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pneumaticNetworkEClass, PneumaticNetwork.class, "PneumaticNetwork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPneumaticNetwork_ParentStructure(), this.getStructure(), this.getStructure_Pneumaticnetworks(), "parentStructure", null, 1, 1, PneumaticNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conveyorEClass, Conveyor.class, "Conveyor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConveyor_Belts(), this.getConveyorBelt(), this.getConveyorBelt_MountedTo(), "belts", null, 0, -1, Conveyor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConveyor_ParentStructure(), this.getStructure(), this.getStructure_Conveyor(), "parentStructure", null, 1, 1, Conveyor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(craneEClass, Crane.class, "Crane", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCrane_Arm(), this.getArm(), this.getArm_MountedTo(), "arm", null, 0, -1, Crane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCrane_MountedOn(), this.getTurningTable(), this.getTurningTable_Mounts(), "mountedOn", null, 0, -1, Crane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCrane_Vacuumgripper(), this.getVacuumGripper(), this.getVacuumGripper_MountedTo(), "vacuumgripper", null, 0, -1, Crane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCrane_ParentStructure(), this.getStructure(), this.getStructure_Cranes(), "parentStructure", null, 1, 1, Crane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(powerWiringEClass, PowerWiring.class, "PowerWiring", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPowerWiring_ParentStructure(), this.getStructure(), this.getStructure_Powerwiring(), "parentStructure", null, 1, 1, PowerWiring.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modulesEClass, Modules.class, "Modules", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModules_Modules(), this.getModules(), null, "modules", null, 0, -1, Modules.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModules_Rampmodules(), this.getRampModule(), this.getRampModule_ParentModuleContainer(), "rampmodules", null, 0, -1, Modules.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModules_Pushermodules(), this.getPusherModule(), this.getPusherModule_ParentModuleContainer(), "pushermodules", null, 0, -1, Modules.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModules_Motormodules(), this.getMotorModule(), this.getMotorModule_ParentModuleContainer(), "motormodules", null, 0, -1, Modules.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModules_Sensormodules(), this.getSensorModule(), this.getSensorModule_ParentModuleContainer(), "sensormodules", null, 0, -1, Modules.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModules_ParentStructure(), this.getStructure(), this.getStructure_Modules(), "parentStructure", null, 1, 1, Modules.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rampModuleEClass, RampModule.class, "RampModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRampModule_ParentModuleContainer(), this.getModules(), this.getModules_Rampmodules(), "parentModuleContainer", null, 1, 1, RampModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pusherModuleEClass, PusherModule.class, "PusherModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPusherModule_ParentModuleContainer(), this.getModules(), this.getModules_Pushermodules(), "parentModuleContainer", null, 1, 1, PusherModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(motorModuleEClass, MotorModule.class, "MotorModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMotorModule_ParentModuleContainer(), this.getModules(), this.getModules_Motormodules(), "parentModuleContainer", null, 1, 1, MotorModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sensorModuleEClass, SensorModule.class, "SensorModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSensorModule_ParentModuleContainer(), this.getModules(), this.getModules_Sensormodules(), "parentModuleContainer", null, 1, 1, SensorModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(armEClass, Arm.class, "Arm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArm_MountedTo(), this.getCrane(), this.getCrane_Arm(), "mountedTo", null, 1, 1, Arm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(turningTableEClass, TurningTable.class, "TurningTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTurningTable_Mounts(), this.getCrane(), this.getCrane_MountedOn(), "mounts", null, 1, 1, TurningTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vacuumGripperEClass, VacuumGripper.class, "VacuumGripper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVacuumGripper_MountedTo(), this.getCrane(), this.getCrane_Vacuumgripper(), "mountedTo", null, 1, 1, VacuumGripper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conveyorBeltEClass, ConveyorBelt.class, "ConveyorBelt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConveyorBelt_MountedTo(), this.getConveyor(), this.getConveyor_Belts(), "mountedTo", null, 1, 1, ConveyorBelt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pusherEClass, Pusher.class, "Pusher", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPusher_ComponentsRepository(), this.getComponents(), this.getComponents_Pushers(), "componentsRepository", null, 1, 1, Pusher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentsEClass, Components.class, "Components", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponents_ParentStructure(), this.getStructure(), this.getStructure_Components(), "parentStructure", null, 1, 1, Components.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponents_ElectronicComponents(), this.getElectronicPart(), this.getElectronicPart_ComponentRepository(), "electronicComponents", null, 0, -1, Components.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponents_Interfaces(), this.getInterface(), this.getInterface_ComponentRepository(), "interfaces", null, 0, -1, Components.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponents_Motors(), this.getMotor(), this.getMotor_ComponentRepository(), "motors", null, 0, -1, Components.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponents_MechanicalAssemblys(), this.getMechanicalAssembly(), this.getMechanicalAssembly_ComponentRepository(), "mechanicalAssemblys", null, 0, -1, Components.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponents_Sensors(), this.getSensor(), this.getSensor_ComponentRepository(), "sensors", null, 0, -1, Components.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponents_Pipes(), this.getPipe(), this.getPipe_ComponentRepository(), "pipes", null, 0, -1, Components.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponents_Compressors(), this.getCompressor(), this.getCompressor_ComponentRepository(), "compressors", null, 0, -1, Components.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponents_Buscables(), this.getBusCable(), null, "buscables", null, 0, -1, Components.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponents_Busmasters(), this.getBusMaster(), this.getBusMaster_ComponentRepostitory(), "busmasters", null, 0, -1, Components.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponents_Busslaves(), this.getBusSlave(), this.getBusSlave_ComponentRepository(), "busslaves", null, 0, -1, Components.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponents_Busboxes(), this.getBusBox(), null, "busboxes", null, 0, -1, Components.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponents_Cylinders(), this.getCylinder(), this.getCylinder_ComponentRepository(), "cylinders", null, 0, -1, Components.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponents_Powercables(), this.getPowerCable(), null, "powercables", null, 0, -1, Components.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponents_Valves(), this.getValve(), this.getValve_ComponentRepository(), "valves", null, 0, -1, Components.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponents_Mechanicalparts(), this.getMechanicalPart(), this.getMechanicalPart_ComponentRepository(), "mechanicalparts", null, 0, -1, Components.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponents_Powersupplys(), this.getPowerSupply(), this.getPowerSupply_ComponentRepository(), "powersupplys", null, 0, -1, Components.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponents_Pushers(), this.getPusher(), this.getPusher_ComponentsRepository(), "pushers", null, 0, -1, Components.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponents_Corners(), this.getCorner(), this.getCorner_ComponentRepository(), "corners", null, 0, -1, Components.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponents_Dispensers(), this.getDispenser(), this.getDispenser_ComponentRepository(), "dispensers", null, 0, -1, Components.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponents_Racks(), this.getRack(), this.getRack_ComponentRepository(), "racks", null, 0, -1, Components.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponents_Tanks(), this.getTank(), this.getTank_ComponentRepository(), "tanks", null, 0, -1, Components.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponents_Splitter(), this.getSplitter(), this.getSplitter_ComponentRepository(), "splitter", null, 0, -1, Components.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponents_BottleSeperator(), this.getBottleSeperator(), this.getBottleSeperator_ComponentRepository(), "bottleSeperator", null, 0, -1, Components.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponents_Panels(), this.getPanel(), this.getPanel_ComponentRepository(), "panels", null, 0, -1, Components.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponents_Cables(), this.getCable(), this.getCable_ComponentRepository(), "cables", null, 0, -1, Components.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(motorEClass, Motor.class, "Motor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMotor_Gearing(), this.getGearing(), null, "gearing", null, 1, 1, Motor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMotor_Screwing(), this.getScrewing(), null, "screwing", null, 1, 1, Motor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMotor_Powersupply(), this.getPowerSupply(), null, "powersupply", null, 1, 1, Motor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMotor_ComponentRepository(), this.getComponents(), this.getComponents_Motors(), "componentRepository", null, 1, 1, Motor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleMotorEClass, SimpleMotor.class, "SimpleMotor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sensorEClass, Sensor.class, "Sensor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSensor_Physicalconnection(), this.getPhysicalConnection(), null, "physicalconnection", null, 1, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSensor_Signalinterface(), this.getSignalInterface(), null, "signalinterface", null, 1, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSensor_Powersupply(), this.getPowerSupply(), null, "powersupply", null, 1, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSensor_ComponentRepository(), this.getComponents(), this.getComponents_Sensors(), "componentRepository", null, 1, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rackEClass, Rack.class, "Rack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRack_Screwing_to_base(), this.getScrewing(), null, "screwing_to_base", null, 1, 1, Rack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRack_ComponentRepository(), this.getComponents(), this.getComponents_Racks(), "componentRepository", null, 1, 1, Rack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cornerEClass, Corner.class, "Corner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCorner_ComponentRepository(), this.getComponents(), this.getComponents_Corners(), "componentRepository", null, 1, 1, Corner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valveEClass, Valve.class, "Valve", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValve_Pneumaticsupply(), this.getPneumaticSupply(), null, "pneumaticsupply", null, 1, 1, Valve.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValve_Powersupply(), this.getPowerSupply(), null, "powersupply", null, 1, 1, Valve.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValve_Signalinterface(), this.getSignalInterface(), null, "signalinterface", null, 1, 1, Valve.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValve_ComponentRepository(), this.getComponents(), this.getComponents_Valves(), "componentRepository", null, 1, 1, Valve.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tankEClass, Tank.class, "Tank", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTank_Watersupply(), this.getWaterSupply(), null, "watersupply", null, 1, 1, Tank.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTank_Screwing(), this.getScrewing(), null, "screwing", null, 1, 1, Tank.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTank_ComponentRepository(), this.getComponents(), this.getComponents_Tanks(), "componentRepository", null, 1, 1, Tank.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mechanicalPartEClass, MechanicalPart.class, "MechanicalPart", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMechanicalPart_Screwing(), this.getScrewing(), null, "screwing", null, 1, 1, MechanicalPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMechanicalPart_ComponentRepository(), this.getComponents(), this.getComponents_Mechanicalparts(), "componentRepository", null, 1, 1, MechanicalPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pushheadEClass, Pushhead.class, "Pushhead", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mechanicalAssemblyEClass, MechanicalAssembly.class, "MechanicalAssembly", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMechanicalAssembly_ComponentRepository(), this.getComponents(), this.getComponents_MechanicalAssemblys(), "componentRepository", null, 1, 1, MechanicalAssembly.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rampEClass, Ramp.class, "Ramp", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRamp_Screwing_base(), this.getScrewing(), null, "screwing_base", null, 1, 1, Ramp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRamp_Screwing_component(), this.getScrewing(), null, "screwing_component", null, 1, 1, Ramp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRamp_Physicalconnection(), this.getPhysicalConnection(), null, "physicalconnection", null, 1, 1, Ramp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cylinderEClass, Cylinder.class, "Cylinder", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCylinder_Pneumaticsupply(), this.getPneumaticSupply(), null, "pneumaticsupply", null, 1, 1, Cylinder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCylinder_SignalInterface(), this.getSignalInterface(), null, "SignalInterface", null, 1, 1, Cylinder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCylinder_ComponentRepository(), this.getComponents(), this.getComponents_Cylinders(), "componentRepository", null, 1, 1, Cylinder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dispenserEClass, Dispenser.class, "Dispenser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDispenser_ComponentRepository(), this.getComponents(), this.getComponents_Dispensers(), "componentRepository", null, 1, 1, Dispenser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bottleSeperatorEClass, BottleSeperator.class, "BottleSeperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBottleSeperator_Signalinterface(), this.getSignalInterface(), null, "signalinterface", null, 1, 1, BottleSeperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBottleSeperator_Pneumaticsupply(), this.getPneumaticSupply(), null, "pneumaticsupply", null, 1, 1, BottleSeperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBottleSeperator_Powersupply(), this.getPowerSupply(), null, "powersupply", null, 1, 1, BottleSeperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBottleSeperator_Screwing_to_rack(), this.getScrewing(), null, "screwing_to_rack", null, 1, 1, BottleSeperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBottleSeperator_ComponentRepository(), this.getComponents(), this.getComponents_BottleSeperator(), "componentRepository", null, 1, 1, BottleSeperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(splitterEClass, Splitter.class, "Splitter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSplitter_Screwing(), this.getScrewing(), null, "screwing", null, 1, 1, Splitter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSplitter_ComponentRepository(), this.getComponents(), this.getComponents_Splitter(), "componentRepository", null, 1, 1, Splitter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(powerSplitterEClass, PowerSplitter.class, "PowerSplitter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPowerSplitter_Powersupply(), this.getPowerSupply(), null, "powersupply", null, 1, 1, PowerSplitter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(waterSplitterEClass, WaterSplitter.class, "WaterSplitter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWaterSplitter_Watersupply(), this.getWaterSupply(), null, "watersupply", null, 1, 1, WaterSplitter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pneumaticSplitterEClass, PneumaticSplitter.class, "PneumaticSplitter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPneumaticSplitter_Pneumaticsupply(), this.getPneumaticSupply(), null, "pneumaticsupply", null, 0, 1, PneumaticSplitter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(panelEClass, Panel.class, "Panel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPanel_ComponentRepository(), this.getComponents(), this.getComponents_Panels(), "componentRepository", null, 1, 1, Panel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationPanelEClass, OperationPanel.class, "OperationPanel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationPanel_Screwing_rack(), this.getScrewing(), null, "screwing_rack", null, 1, 1, OperationPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationPanel_Leds(), this.getLED(), null, "leds", null, 0, -1, OperationPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationPanel_Buttons(), this.getButton(), null, "buttons", null, 0, -1, OperationPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cableEClass, Cable.class, "Cable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCable_ComponentRepository(), this.getComponents(), this.getComponents_Cables(), "componentRepository", null, 1, 1, Cable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(powerSupplyEClass, PowerSupply.class, "PowerSupply", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPowerSupply_ComponentRepository(), this.getComponents(), this.getComponents_Powersupplys(), "componentRepository", null, 1, 1, PowerSupply.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compressorEClass, Compressor.class, "Compressor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompressor_Powersupply(), this.getPowerSupply(), null, "powersupply", null, 1, 1, Compressor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompressor_Pneumaticsupply(), this.getPneumaticSupply(), null, "pneumaticsupply", null, 0, -1, Compressor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompressor_Pins(), this.getSignalInterface(), null, "pins", null, 2, 2, Compressor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompressor_Screwing(), this.getScrewing(), null, "screwing", null, 1, 1, Compressor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompressor_ComponentRepository(), this.getComponents(), this.getComponents_Compressors(), "componentRepository", null, 1, 1, Compressor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(electronicPartEClass, ElectronicPart.class, "ElectronicPart", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElectronicPart_Pin(), this.getSignalInterface(), null, "pin", null, 1, 1, ElectronicPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElectronicPart_Physicalconnection(), this.getPhysicalConnection(), null, "physicalconnection", null, 1, 1, ElectronicPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElectronicPart_ComponentRepository(), this.getComponents(), this.getComponents_ElectronicComponents(), "componentRepository", null, 1, 1, ElectronicPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(switchEClass, Switch.class, "Switch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(powerCableEClass, PowerCable.class, "PowerCable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(monostableCylinderEClass, MonostableCylinder.class, "MonostableCylinder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(proportionalCylinderEClass, ProportionalCylinder.class, "ProportionalCylinder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bistableCylinderEClass, BistableCylinder.class, "BistableCylinder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(controllerEClass, Controller.class, "Controller", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getController_Signalinterface(), this.getSignalInterface(), null, "signalinterface", null, 1, 1, Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getController_Powersupply(), this.getPowerSupply(), null, "powersupply", null, 1, 1, Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getController_ControllerOf(), this.getControlCabinet(), this.getControlCabinet_Controller(), "controllerOf", null, 1, 1, Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ledEClass, xPPU.LED.class, "LED", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(buttonEClass, Button.class, "Button", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(regularRampEClass, RegularRamp.class, "RegularRamp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pipeEClass, Pipe.class, "Pipe", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPipe_Plugs(), this.getPneumaticSupply(), null, "plugs", null, 0, 1, Pipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPipe_ComponentRepository(), this.getComponents(), this.getComponents_Pipes(), "componentRepository", null, 1, 1, Pipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pneumaticPipeEClass, PneumaticPipe.class, "PneumaticPipe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(busMasterEClass, BusMaster.class, "BusMaster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusMaster_Signalinterfaces(), this.getSignalInterface(), null, "signalinterfaces", null, 0, -1, BusMaster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusMaster_Signalinterface_controller(), this.getSignalInterface(), null, "signalinterface_controller", null, 1, 1, BusMaster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusMaster_ComponentRepostitory(), this.getComponents(), this.getComponents_Busmasters(), "componentRepostitory", null, 1, 1, BusMaster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(busSlaveEClass, BusSlave.class, "BusSlave", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusSlave_Signalinterface_master(), this.getSignalInterface(), null, "signalinterface_master", null, 1, 1, BusSlave.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusSlave_Signalinterface_slave(), this.getSignalInterface(), null, "signalinterface_slave", null, 1, 1, BusSlave.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusSlave_ComponentRepository(), this.getComponents(), this.getComponents_Busslaves(), "componentRepository", null, 1, 1, BusSlave.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(busCableEClass, BusCable.class, "BusCable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusCable_SignalPlug1(), this.getSignalInterface(), null, "SignalPlug1", null, 1, 1, BusCable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusCable_SignalPlug2(), this.getSignalInterface(), null, "SignalPlug2", null, 1, 1, BusCable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(busBoxEClass, BusBox.class, "BusBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusBox_Signalinterfaces(), this.getSignalInterface(), null, "signalinterfaces", null, 0, -1, BusBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusBox_Signalinterface_master(), this.getSignalInterface(), null, "signalinterface_master", null, 1, 1, BusBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusBox_Signalinterface_box(), this.getSignalInterface(), null, "signalinterface_box", null, 1, 1, BusBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusBox_Powersupply(), this.getPowerSupply(), null, "powersupply", null, 1, 1, BusBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterface_Screwings(), this.getScrewing(), this.getScrewing_IntefacePart(), "screwings", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_Suspensions(), this.getSuspension(), this.getSuspension_IntefacePart(), "suspensions", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_Gearings(), this.getGearing(), this.getGearing_IntefacePart(), "gearings", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_Clamping(), this.getClamping(), this.getClamping_IntefacePart(), "clamping", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_Pneumaticsupplys(), this.getPneumaticSupply(), this.getPneumaticSupply_IntefacePart(), "pneumaticsupplys", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_Signalinterfaces(), this.getSignalInterface(), this.getSignalInterface_IntefacePart(), "signalinterfaces", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_Powersupply(), this.getPowerSupply(), null, "powersupply", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_Watersupply(), this.getWaterSupply(), this.getWaterSupply_IntefacePart(), "watersupply", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_Physicalconnections(), this.getPhysicalConnection(), this.getPhysicalConnection_IntefacePart(), "physicalconnections", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_Transportconnection(), this.getTransportConnection(), this.getTransportConnection_IntefacePart(), "transportconnection", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_ComponentRepository(), this.getComponents(), this.getComponents_Interfaces(), "componentRepository", null, 1, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(screwingEClass, Screwing.class, "Screwing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScrewing_IntefacePart(), this.getInterface(), this.getInterface_Screwings(), "intefacePart", null, 1, 1, Screwing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(suspensionEClass, Suspension.class, "Suspension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSuspension_IntefacePart(), this.getInterface(), this.getInterface_Suspensions(), "intefacePart", null, 1, 1, Suspension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gearingEClass, Gearing.class, "Gearing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGearing_IntefacePart(), this.getInterface(), this.getInterface_Gearings(), "intefacePart", null, 1, 1, Gearing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clampingEClass, Clamping.class, "Clamping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClamping_IntefacePart(), this.getInterface(), this.getInterface_Clamping(), "intefacePart", null, 1, 1, Clamping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pneumaticSupplyEClass, PneumaticSupply.class, "PneumaticSupply", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPneumaticSupply_IntefacePart(), this.getInterface(), this.getInterface_Pneumaticsupplys(), "intefacePart", null, 1, 1, PneumaticSupply.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signalInterfaceEClass, SignalInterface.class, "SignalInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignalInterface_IntefacePart(), this.getInterface(), this.getInterface_Signalinterfaces(), "intefacePart", null, 1, 1, SignalInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(waterSupplyEClass, WaterSupply.class, "WaterSupply", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWaterSupply_IntefacePart(), this.getInterface(), this.getInterface_Watersupply(), "intefacePart", null, 1, 1, WaterSupply.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicalConnectionEClass, PhysicalConnection.class, "PhysicalConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhysicalConnection_IntefacePart(), this.getInterface(), this.getInterface_Physicalconnections(), "intefacePart", null, 1, 1, PhysicalConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transportConnectionEClass, TransportConnection.class, "TransportConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransportConnection_IntefacePart(), this.getInterface(), this.getInterface_Transportconnection(), "intefacePart", null, 1, 1, TransportConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //XPPUPackageImpl
