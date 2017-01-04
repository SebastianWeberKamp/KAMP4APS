/**
 */
package xPPU;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.palladiosimulator.pcm.core.entity.EntityPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see xPPU.XPPUFactory
 * @model kind="package"
 * @generated
 */
public interface XPPUPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xPPU";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/xPPU";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "xPPU";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XPPUPackage eINSTANCE = xPPU.impl.XPPUPackageImpl.init();

	/**
	 * The meta object id for the '{@link xPPU.impl.PlantImpl <em>Plant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.PlantImpl
	 * @see xPPU.impl.XPPUPackageImpl#getPlant()
	 * @generated
	 */
	int PLANT = 0;

	/**
	 * The feature id for the '<em><b>Structures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__STRUCTURES = 0;

	/**
	 * The number of structural features of the '<em>Plant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link xPPU.impl.StructureImpl <em>Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.StructureImpl
	 * @see xPPU.impl.XPPUPackageImpl#getStructure()
	 * @generated
	 */
	int STRUCTURE = 1;

	/**
	 * The feature id for the '<em><b>Parent Plant</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__PARENT_PLANT = 0;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__MODULES = 1;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__COMPONENTS = 2;

	/**
	 * The feature id for the '<em><b>Cranes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__CRANES = 3;

	/**
	 * The feature id for the '<em><b>Conveyor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__CONVEYOR = 4;

	/**
	 * The feature id for the '<em><b>Controlcabinets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__CONTROLCABINETS = 5;

	/**
	 * The feature id for the '<em><b>Powernetworks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__POWERNETWORKS = 6;

	/**
	 * The feature id for the '<em><b>Communicationnetworks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__COMMUNICATIONNETWORKS = 7;

	/**
	 * The feature id for the '<em><b>Pneumaticnetworks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__PNEUMATICNETWORKS = 8;

	/**
	 * The feature id for the '<em><b>Powerwiring</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__POWERWIRING = 9;

	/**
	 * The number of structural features of the '<em>Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link xPPU.impl.CommunicationNetworkImpl <em>Communication Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.CommunicationNetworkImpl
	 * @see xPPU.impl.XPPUPackageImpl#getCommunicationNetwork()
	 * @generated
	 */
	int COMMUNICATION_NETWORK = 2;

	/**
	 * The feature id for the '<em><b>Parent Structure</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_NETWORK__PARENT_STRUCTURE = 0;

	/**
	 * The number of structural features of the '<em>Communication Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_NETWORK_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link xPPU.impl.PowerNetworkImpl <em>Power Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.PowerNetworkImpl
	 * @see xPPU.impl.XPPUPackageImpl#getPowerNetwork()
	 * @generated
	 */
	int POWER_NETWORK = 3;

	/**
	 * The feature id for the '<em><b>Parent Structure</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_NETWORK__PARENT_STRUCTURE = 0;

	/**
	 * The number of structural features of the '<em>Power Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_NETWORK_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link xPPU.impl.ControlCabinetImpl <em>Control Cabinet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.ControlCabinetImpl
	 * @see xPPU.impl.XPPUPackageImpl#getControlCabinet()
	 * @generated
	 */
	int CONTROL_CABINET = 4;

	/**
	 * The feature id for the '<em><b>Parent Structure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CABINET__PARENT_STRUCTURE = 0;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CABINET__CONTROLLER = 1;

	/**
	 * The number of structural features of the '<em>Control Cabinet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CABINET_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link xPPU.impl.PneumaticNetworkImpl <em>Pneumatic Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.PneumaticNetworkImpl
	 * @see xPPU.impl.XPPUPackageImpl#getPneumaticNetwork()
	 * @generated
	 */
	int PNEUMATIC_NETWORK = 5;

	/**
	 * The feature id for the '<em><b>Parent Structure</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_NETWORK__PARENT_STRUCTURE = 0;

	/**
	 * The number of structural features of the '<em>Pneumatic Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_NETWORK_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link xPPU.impl.ConveyorImpl <em>Conveyor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.ConveyorImpl
	 * @see xPPU.impl.XPPUPackageImpl#getConveyor()
	 * @generated
	 */
	int CONVEYOR = 6;

	/**
	 * The feature id for the '<em><b>Belts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__BELTS = 0;

	/**
	 * The feature id for the '<em><b>Parent Structure</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__PARENT_STRUCTURE = 1;

	/**
	 * The number of structural features of the '<em>Conveyor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link xPPU.impl.CraneImpl <em>Crane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.CraneImpl
	 * @see xPPU.impl.XPPUPackageImpl#getCrane()
	 * @generated
	 */
	int CRANE = 7;

	/**
	 * The feature id for the '<em><b>Arm</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRANE__ARM = 0;

	/**
	 * The feature id for the '<em><b>Mounted On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRANE__MOUNTED_ON = 1;

	/**
	 * The feature id for the '<em><b>Vacuumgripper</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRANE__VACUUMGRIPPER = 2;

	/**
	 * The feature id for the '<em><b>Parent Structure</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRANE__PARENT_STRUCTURE = 3;

	/**
	 * The number of structural features of the '<em>Crane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRANE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link xPPU.impl.PowerWiringImpl <em>Power Wiring</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.PowerWiringImpl
	 * @see xPPU.impl.XPPUPackageImpl#getPowerWiring()
	 * @generated
	 */
	int POWER_WIRING = 8;

	/**
	 * The feature id for the '<em><b>Parent Structure</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_WIRING__PARENT_STRUCTURE = 0;

	/**
	 * The number of structural features of the '<em>Power Wiring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_WIRING_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link xPPU.impl.ModulesImpl <em>Modules</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.ModulesImpl
	 * @see xPPU.impl.XPPUPackageImpl#getModules()
	 * @generated
	 */
	int MODULES = 9;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULES__MODULES = 0;

	/**
	 * The feature id for the '<em><b>Rampmodules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULES__RAMPMODULES = 1;

	/**
	 * The feature id for the '<em><b>Pushermodules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULES__PUSHERMODULES = 2;

	/**
	 * The feature id for the '<em><b>Motormodules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULES__MOTORMODULES = 3;

	/**
	 * The feature id for the '<em><b>Sensormodules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULES__SENSORMODULES = 4;

	/**
	 * The feature id for the '<em><b>Parent Structure</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULES__PARENT_STRUCTURE = 5;

	/**
	 * The number of structural features of the '<em>Modules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULES_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link xPPU.impl.RampModuleImpl <em>Ramp Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.RampModuleImpl
	 * @see xPPU.impl.XPPUPackageImpl#getRampModule()
	 * @generated
	 */
	int RAMP_MODULE = 10;

	/**
	 * The feature id for the '<em><b>Parent Module Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_MODULE__PARENT_MODULE_CONTAINER = 0;

	/**
	 * The number of structural features of the '<em>Ramp Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_MODULE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link xPPU.impl.PusherModuleImpl <em>Pusher Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.PusherModuleImpl
	 * @see xPPU.impl.XPPUPackageImpl#getPusherModule()
	 * @generated
	 */
	int PUSHER_MODULE = 11;

	/**
	 * The feature id for the '<em><b>Parent Module Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER_MODULE__PARENT_MODULE_CONTAINER = 0;

	/**
	 * The number of structural features of the '<em>Pusher Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER_MODULE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link xPPU.impl.MotorModuleImpl <em>Motor Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.MotorModuleImpl
	 * @see xPPU.impl.XPPUPackageImpl#getMotorModule()
	 * @generated
	 */
	int MOTOR_MODULE = 12;

	/**
	 * The feature id for the '<em><b>Parent Module Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_MODULE__PARENT_MODULE_CONTAINER = 0;

	/**
	 * The number of structural features of the '<em>Motor Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_MODULE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link xPPU.impl.SensorModuleImpl <em>Sensor Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.SensorModuleImpl
	 * @see xPPU.impl.XPPUPackageImpl#getSensorModule()
	 * @generated
	 */
	int SENSOR_MODULE = 13;

	/**
	 * The feature id for the '<em><b>Parent Module Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_MODULE__PARENT_MODULE_CONTAINER = 0;

	/**
	 * The number of structural features of the '<em>Sensor Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_MODULE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link xPPU.impl.MechanicalAssemblyImpl <em>Mechanical Assembly</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.MechanicalAssemblyImpl
	 * @see xPPU.impl.XPPUPackageImpl#getMechanicalAssembly()
	 * @generated
	 */
	int MECHANICAL_ASSEMBLY = 29;

	/**
	 * The feature id for the '<em><b>Component Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANICAL_ASSEMBLY__COMPONENT_REPOSITORY = 0;

	/**
	 * The number of structural features of the '<em>Mechanical Assembly</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANICAL_ASSEMBLY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link xPPU.impl.ArmImpl <em>Arm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.ArmImpl
	 * @see xPPU.impl.XPPUPackageImpl#getArm()
	 * @generated
	 */
	int ARM = 14;

	/**
	 * The feature id for the '<em><b>Component Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARM__COMPONENT_REPOSITORY = MECHANICAL_ASSEMBLY__COMPONENT_REPOSITORY;

	/**
	 * The feature id for the '<em><b>Mounted To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARM__MOUNTED_TO = MECHANICAL_ASSEMBLY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARM_FEATURE_COUNT = MECHANICAL_ASSEMBLY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link xPPU.impl.TurningTableImpl <em>Turning Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.TurningTableImpl
	 * @see xPPU.impl.XPPUPackageImpl#getTurningTable()
	 * @generated
	 */
	int TURNING_TABLE = 15;

	/**
	 * The feature id for the '<em><b>Mounts</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNING_TABLE__MOUNTS = 0;

	/**
	 * The number of structural features of the '<em>Turning Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNING_TABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link xPPU.impl.VacuumGripperImpl <em>Vacuum Gripper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.VacuumGripperImpl
	 * @see xPPU.impl.XPPUPackageImpl#getVacuumGripper()
	 * @generated
	 */
	int VACUUM_GRIPPER = 16;

	/**
	 * The feature id for the '<em><b>Mounted To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACUUM_GRIPPER__MOUNTED_TO = 0;

	/**
	 * The number of structural features of the '<em>Vacuum Gripper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACUUM_GRIPPER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link xPPU.impl.ConveyorBeltImpl <em>Conveyor Belt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.ConveyorBeltImpl
	 * @see xPPU.impl.XPPUPackageImpl#getConveyorBelt()
	 * @generated
	 */
	int CONVEYOR_BELT = 17;

	/**
	 * The feature id for the '<em><b>Mounted To</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT__MOUNTED_TO = 0;

	/**
	 * The number of structural features of the '<em>Conveyor Belt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link xPPU.impl.PusherImpl <em>Pusher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.PusherImpl
	 * @see xPPU.impl.XPPUPackageImpl#getPusher()
	 * @generated
	 */
	int PUSHER = 18;

	/**
	 * The feature id for the '<em><b>Components Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER__COMPONENTS_REPOSITORY = 0;

	/**
	 * The number of structural features of the '<em>Pusher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link xPPU.impl.ComponentsImpl <em>Components</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.ComponentsImpl
	 * @see xPPU.impl.XPPUPackageImpl#getComponents()
	 * @generated
	 */
	int COMPONENTS = 19;

	/**
	 * The feature id for the '<em><b>Parent Structure</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS__PARENT_STRUCTURE = 0;

	/**
	 * The feature id for the '<em><b>Electronic Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS__ELECTRONIC_COMPONENTS = 1;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS__INTERFACES = 2;

	/**
	 * The feature id for the '<em><b>Motors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS__MOTORS = 3;

	/**
	 * The feature id for the '<em><b>Mechanical Assemblys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS__MECHANICAL_ASSEMBLYS = 4;

	/**
	 * The feature id for the '<em><b>Sensors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS__SENSORS = 5;

	/**
	 * The feature id for the '<em><b>Pipes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS__PIPES = 6;

	/**
	 * The feature id for the '<em><b>Compressors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS__COMPRESSORS = 7;

	/**
	 * The feature id for the '<em><b>Buscables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS__BUSCABLES = 8;

	/**
	 * The feature id for the '<em><b>Busmasters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS__BUSMASTERS = 9;

	/**
	 * The feature id for the '<em><b>Busslaves</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS__BUSSLAVES = 10;

	/**
	 * The feature id for the '<em><b>Busboxes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS__BUSBOXES = 11;

	/**
	 * The feature id for the '<em><b>Cylinders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS__CYLINDERS = 12;

	/**
	 * The feature id for the '<em><b>Powercables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS__POWERCABLES = 13;

	/**
	 * The feature id for the '<em><b>Valves</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS__VALVES = 14;

	/**
	 * The feature id for the '<em><b>Mechanicalparts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS__MECHANICALPARTS = 15;

	/**
	 * The feature id for the '<em><b>Powersupplys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS__POWERSUPPLYS = 16;

	/**
	 * The feature id for the '<em><b>Pushers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS__PUSHERS = 17;

	/**
	 * The feature id for the '<em><b>Corners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS__CORNERS = 18;

	/**
	 * The feature id for the '<em><b>Dispensers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS__DISPENSERS = 19;

	/**
	 * The feature id for the '<em><b>Racks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS__RACKS = 20;

	/**
	 * The feature id for the '<em><b>Tanks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS__TANKS = 21;

	/**
	 * The feature id for the '<em><b>Splitter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS__SPLITTER = 22;

	/**
	 * The feature id for the '<em><b>Bottle Seperator</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS__BOTTLE_SEPERATOR = 23;

	/**
	 * The feature id for the '<em><b>Panels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS__PANELS = 24;

	/**
	 * The feature id for the '<em><b>Cables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS__CABLES = 25;

	/**
	 * The number of structural features of the '<em>Components</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS_FEATURE_COUNT = 26;

	/**
	 * The meta object id for the '{@link xPPU.impl.MotorImpl <em>Motor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.MotorImpl
	 * @see xPPU.impl.XPPUPackageImpl#getMotor()
	 * @generated
	 */
	int MOTOR = 20;

	/**
	 * The feature id for the '<em><b>Gearing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR__GEARING = 0;

	/**
	 * The feature id for the '<em><b>Screwing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR__SCREWING = 1;

	/**
	 * The feature id for the '<em><b>Powersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR__POWERSUPPLY = 2;

	/**
	 * The feature id for the '<em><b>Component Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR__COMPONENT_REPOSITORY = 3;

	/**
	 * The number of structural features of the '<em>Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link xPPU.impl.SimpleMotorImpl <em>Simple Motor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.SimpleMotorImpl
	 * @see xPPU.impl.XPPUPackageImpl#getSimpleMotor()
	 * @generated
	 */
	int SIMPLE_MOTOR = 21;

	/**
	 * The feature id for the '<em><b>Gearing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MOTOR__GEARING = MOTOR__GEARING;

	/**
	 * The feature id for the '<em><b>Screwing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MOTOR__SCREWING = MOTOR__SCREWING;

	/**
	 * The feature id for the '<em><b>Powersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MOTOR__POWERSUPPLY = MOTOR__POWERSUPPLY;

	/**
	 * The feature id for the '<em><b>Component Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MOTOR__COMPONENT_REPOSITORY = MOTOR__COMPONENT_REPOSITORY;

	/**
	 * The number of structural features of the '<em>Simple Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MOTOR_FEATURE_COUNT = MOTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.SensorImpl
	 * @see xPPU.impl.XPPUPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 22;

	/**
	 * The feature id for the '<em><b>Physicalconnection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__PHYSICALCONNECTION = 0;

	/**
	 * The feature id for the '<em><b>Signalinterface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__SIGNALINTERFACE = 1;

	/**
	 * The feature id for the '<em><b>Powersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__POWERSUPPLY = 2;

	/**
	 * The feature id for the '<em><b>Component Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__COMPONENT_REPOSITORY = 3;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link xPPU.impl.RackImpl <em>Rack</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.RackImpl
	 * @see xPPU.impl.XPPUPackageImpl#getRack()
	 * @generated
	 */
	int RACK = 23;

	/**
	 * The feature id for the '<em><b>Screwing to base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK__SCREWING_TO_BASE = 0;

	/**
	 * The feature id for the '<em><b>Component Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK__COMPONENT_REPOSITORY = 1;

	/**
	 * The number of structural features of the '<em>Rack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link xPPU.impl.CornerImpl <em>Corner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.CornerImpl
	 * @see xPPU.impl.XPPUPackageImpl#getCorner()
	 * @generated
	 */
	int CORNER = 24;

	/**
	 * The feature id for the '<em><b>Component Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORNER__COMPONENT_REPOSITORY = 0;

	/**
	 * The number of structural features of the '<em>Corner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORNER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link xPPU.impl.ValveImpl <em>Valve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.ValveImpl
	 * @see xPPU.impl.XPPUPackageImpl#getValve()
	 * @generated
	 */
	int VALVE = 25;

	/**
	 * The feature id for the '<em><b>Pneumaticsupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALVE__PNEUMATICSUPPLY = 0;

	/**
	 * The feature id for the '<em><b>Powersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALVE__POWERSUPPLY = 1;

	/**
	 * The feature id for the '<em><b>Signalinterface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALVE__SIGNALINTERFACE = 2;

	/**
	 * The feature id for the '<em><b>Component Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALVE__COMPONENT_REPOSITORY = 3;

	/**
	 * The number of structural features of the '<em>Valve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALVE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link xPPU.impl.TankImpl <em>Tank</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.TankImpl
	 * @see xPPU.impl.XPPUPackageImpl#getTank()
	 * @generated
	 */
	int TANK = 26;

	/**
	 * The feature id for the '<em><b>Watersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANK__WATERSUPPLY = 0;

	/**
	 * The feature id for the '<em><b>Screwing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANK__SCREWING = 1;

	/**
	 * The feature id for the '<em><b>Component Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANK__COMPONENT_REPOSITORY = 2;

	/**
	 * The number of structural features of the '<em>Tank</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANK_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link xPPU.impl.MechanicalPartImpl <em>Mechanical Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.MechanicalPartImpl
	 * @see xPPU.impl.XPPUPackageImpl#getMechanicalPart()
	 * @generated
	 */
	int MECHANICAL_PART = 27;

	/**
	 * The feature id for the '<em><b>Screwing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANICAL_PART__SCREWING = 0;

	/**
	 * The feature id for the '<em><b>Component Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANICAL_PART__COMPONENT_REPOSITORY = 1;

	/**
	 * The number of structural features of the '<em>Mechanical Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANICAL_PART_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link xPPU.impl.PushheadImpl <em>Pushhead</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.PushheadImpl
	 * @see xPPU.impl.XPPUPackageImpl#getPushhead()
	 * @generated
	 */
	int PUSHHEAD = 28;

	/**
	 * The feature id for the '<em><b>Screwing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHHEAD__SCREWING = MECHANICAL_PART__SCREWING;

	/**
	 * The feature id for the '<em><b>Component Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHHEAD__COMPONENT_REPOSITORY = MECHANICAL_PART__COMPONENT_REPOSITORY;

	/**
	 * The number of structural features of the '<em>Pushhead</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHHEAD_FEATURE_COUNT = MECHANICAL_PART_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.impl.RampImpl <em>Ramp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.RampImpl
	 * @see xPPU.impl.XPPUPackageImpl#getRamp()
	 * @generated
	 */
	int RAMP = 30;

	/**
	 * The feature id for the '<em><b>Component Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP__COMPONENT_REPOSITORY = MECHANICAL_ASSEMBLY__COMPONENT_REPOSITORY;

	/**
	 * The feature id for the '<em><b>Screwing base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP__SCREWING_BASE = MECHANICAL_ASSEMBLY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Screwing component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP__SCREWING_COMPONENT = MECHANICAL_ASSEMBLY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Physicalconnection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP__PHYSICALCONNECTION = MECHANICAL_ASSEMBLY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ramp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_FEATURE_COUNT = MECHANICAL_ASSEMBLY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link xPPU.impl.CylinderImpl <em>Cylinder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.CylinderImpl
	 * @see xPPU.impl.XPPUPackageImpl#getCylinder()
	 * @generated
	 */
	int CYLINDER = 31;

	/**
	 * The feature id for the '<em><b>Pneumaticsupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER__PNEUMATICSUPPLY = 0;

	/**
	 * The feature id for the '<em><b>Signal Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER__SIGNAL_INTERFACE = 1;

	/**
	 * The feature id for the '<em><b>Component Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER__COMPONENT_REPOSITORY = 2;

	/**
	 * The number of structural features of the '<em>Cylinder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link xPPU.impl.DispenserImpl <em>Dispenser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.DispenserImpl
	 * @see xPPU.impl.XPPUPackageImpl#getDispenser()
	 * @generated
	 */
	int DISPENSER = 32;

	/**
	 * The feature id for the '<em><b>Component Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPENSER__COMPONENT_REPOSITORY = 0;

	/**
	 * The number of structural features of the '<em>Dispenser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPENSER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link xPPU.impl.BottleSeperatorImpl <em>Bottle Seperator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.BottleSeperatorImpl
	 * @see xPPU.impl.XPPUPackageImpl#getBottleSeperator()
	 * @generated
	 */
	int BOTTLE_SEPERATOR = 33;

	/**
	 * The feature id for the '<em><b>Signalinterface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTTLE_SEPERATOR__SIGNALINTERFACE = 0;

	/**
	 * The feature id for the '<em><b>Pneumaticsupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTTLE_SEPERATOR__PNEUMATICSUPPLY = 1;

	/**
	 * The feature id for the '<em><b>Powersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTTLE_SEPERATOR__POWERSUPPLY = 2;

	/**
	 * The feature id for the '<em><b>Screwing to rack</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTTLE_SEPERATOR__SCREWING_TO_RACK = 3;

	/**
	 * The feature id for the '<em><b>Component Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTTLE_SEPERATOR__COMPONENT_REPOSITORY = 4;

	/**
	 * The number of structural features of the '<em>Bottle Seperator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTTLE_SEPERATOR_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link xPPU.impl.SplitterImpl <em>Splitter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.SplitterImpl
	 * @see xPPU.impl.XPPUPackageImpl#getSplitter()
	 * @generated
	 */
	int SPLITTER = 34;

	/**
	 * The feature id for the '<em><b>Screwing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLITTER__SCREWING = 0;

	/**
	 * The feature id for the '<em><b>Component Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLITTER__COMPONENT_REPOSITORY = 1;

	/**
	 * The number of structural features of the '<em>Splitter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLITTER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link xPPU.impl.PowerSplitterImpl <em>Power Splitter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.PowerSplitterImpl
	 * @see xPPU.impl.XPPUPackageImpl#getPowerSplitter()
	 * @generated
	 */
	int POWER_SPLITTER = 35;

	/**
	 * The feature id for the '<em><b>Screwing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SPLITTER__SCREWING = SPLITTER__SCREWING;

	/**
	 * The feature id for the '<em><b>Component Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SPLITTER__COMPONENT_REPOSITORY = SPLITTER__COMPONENT_REPOSITORY;

	/**
	 * The feature id for the '<em><b>Powersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SPLITTER__POWERSUPPLY = SPLITTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Power Splitter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SPLITTER_FEATURE_COUNT = SPLITTER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link xPPU.impl.WaterSplitterImpl <em>Water Splitter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.WaterSplitterImpl
	 * @see xPPU.impl.XPPUPackageImpl#getWaterSplitter()
	 * @generated
	 */
	int WATER_SPLITTER = 36;

	/**
	 * The feature id for the '<em><b>Screwing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SPLITTER__SCREWING = SPLITTER__SCREWING;

	/**
	 * The feature id for the '<em><b>Component Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SPLITTER__COMPONENT_REPOSITORY = SPLITTER__COMPONENT_REPOSITORY;

	/**
	 * The feature id for the '<em><b>Watersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SPLITTER__WATERSUPPLY = SPLITTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Water Splitter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SPLITTER_FEATURE_COUNT = SPLITTER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link xPPU.impl.PneumaticSplitterImpl <em>Pneumatic Splitter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.PneumaticSplitterImpl
	 * @see xPPU.impl.XPPUPackageImpl#getPneumaticSplitter()
	 * @generated
	 */
	int PNEUMATIC_SPLITTER = 37;

	/**
	 * The feature id for the '<em><b>Screwing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_SPLITTER__SCREWING = SPLITTER__SCREWING;

	/**
	 * The feature id for the '<em><b>Component Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_SPLITTER__COMPONENT_REPOSITORY = SPLITTER__COMPONENT_REPOSITORY;

	/**
	 * The feature id for the '<em><b>Pneumaticsupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_SPLITTER__PNEUMATICSUPPLY = SPLITTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pneumatic Splitter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_SPLITTER_FEATURE_COUNT = SPLITTER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link xPPU.impl.PanelImpl <em>Panel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.PanelImpl
	 * @see xPPU.impl.XPPUPackageImpl#getPanel()
	 * @generated
	 */
	int PANEL = 38;

	/**
	 * The feature id for the '<em><b>Component Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__COMPONENT_REPOSITORY = 0;

	/**
	 * The number of structural features of the '<em>Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link xPPU.impl.OperationPanelImpl <em>Operation Panel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.OperationPanelImpl
	 * @see xPPU.impl.XPPUPackageImpl#getOperationPanel()
	 * @generated
	 */
	int OPERATION_PANEL = 39;

	/**
	 * The feature id for the '<em><b>Component Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PANEL__COMPONENT_REPOSITORY = PANEL__COMPONENT_REPOSITORY;

	/**
	 * The feature id for the '<em><b>Screwing rack</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PANEL__SCREWING_RACK = PANEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Leds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PANEL__LEDS = PANEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Buttons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PANEL__BUTTONS = PANEL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operation Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PANEL_FEATURE_COUNT = PANEL_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link xPPU.impl.CableImpl <em>Cable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.CableImpl
	 * @see xPPU.impl.XPPUPackageImpl#getCable()
	 * @generated
	 */
	int CABLE = 40;

	/**
	 * The feature id for the '<em><b>Component Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE__COMPONENT_REPOSITORY = 0;

	/**
	 * The number of structural features of the '<em>Cable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link xPPU.impl.PowerSupplyImpl <em>Power Supply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.PowerSupplyImpl
	 * @see xPPU.impl.XPPUPackageImpl#getPowerSupply()
	 * @generated
	 */
	int POWER_SUPPLY = 41;

	/**
	 * The feature id for the '<em><b>Component Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SUPPLY__COMPONENT_REPOSITORY = 0;

	/**
	 * The number of structural features of the '<em>Power Supply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SUPPLY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link xPPU.impl.CompressorImpl <em>Compressor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.CompressorImpl
	 * @see xPPU.impl.XPPUPackageImpl#getCompressor()
	 * @generated
	 */
	int COMPRESSOR = 42;

	/**
	 * The feature id for the '<em><b>Powersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRESSOR__POWERSUPPLY = 0;

	/**
	 * The feature id for the '<em><b>Pneumaticsupply</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRESSOR__PNEUMATICSUPPLY = 1;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRESSOR__PINS = 2;

	/**
	 * The feature id for the '<em><b>Screwing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRESSOR__SCREWING = 3;

	/**
	 * The feature id for the '<em><b>Component Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRESSOR__COMPONENT_REPOSITORY = 4;

	/**
	 * The number of structural features of the '<em>Compressor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRESSOR_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link xPPU.impl.ElectronicPartImpl <em>Electronic Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.ElectronicPartImpl
	 * @see xPPU.impl.XPPUPackageImpl#getElectronicPart()
	 * @generated
	 */
	int ELECTRONIC_PART = 43;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_PART__PIN = 0;

	/**
	 * The feature id for the '<em><b>Physicalconnection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_PART__PHYSICALCONNECTION = 1;

	/**
	 * The feature id for the '<em><b>Component Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_PART__COMPONENT_REPOSITORY = 2;

	/**
	 * The number of structural features of the '<em>Electronic Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_PART_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link xPPU.impl.SwitchImpl <em>Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.SwitchImpl
	 * @see xPPU.impl.XPPUPackageImpl#getSwitch()
	 * @generated
	 */
	int SWITCH = 44;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__PIN = ELECTRONIC_PART__PIN;

	/**
	 * The feature id for the '<em><b>Physicalconnection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__PHYSICALCONNECTION = ELECTRONIC_PART__PHYSICALCONNECTION;

	/**
	 * The feature id for the '<em><b>Component Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__COMPONENT_REPOSITORY = ELECTRONIC_PART__COMPONENT_REPOSITORY;

	/**
	 * The number of structural features of the '<em>Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_FEATURE_COUNT = ELECTRONIC_PART_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.impl.PowerCableImpl <em>Power Cable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.PowerCableImpl
	 * @see xPPU.impl.XPPUPackageImpl#getPowerCable()
	 * @generated
	 */
	int POWER_CABLE = 45;

	/**
	 * The feature id for the '<em><b>Component Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CABLE__COMPONENT_REPOSITORY = CABLE__COMPONENT_REPOSITORY;

	/**
	 * The number of structural features of the '<em>Power Cable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CABLE_FEATURE_COUNT = CABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.impl.MonostableCylinderImpl <em>Monostable Cylinder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.MonostableCylinderImpl
	 * @see xPPU.impl.XPPUPackageImpl#getMonostableCylinder()
	 * @generated
	 */
	int MONOSTABLE_CYLINDER = 46;

	/**
	 * The feature id for the '<em><b>Pneumaticsupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER__PNEUMATICSUPPLY = CYLINDER__PNEUMATICSUPPLY;

	/**
	 * The feature id for the '<em><b>Signal Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER__SIGNAL_INTERFACE = CYLINDER__SIGNAL_INTERFACE;

	/**
	 * The feature id for the '<em><b>Component Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER__COMPONENT_REPOSITORY = CYLINDER__COMPONENT_REPOSITORY;

	/**
	 * The number of structural features of the '<em>Monostable Cylinder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER_FEATURE_COUNT = CYLINDER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.impl.ProportionalCylinderImpl <em>Proportional Cylinder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.ProportionalCylinderImpl
	 * @see xPPU.impl.XPPUPackageImpl#getProportionalCylinder()
	 * @generated
	 */
	int PROPORTIONAL_CYLINDER = 47;

	/**
	 * The feature id for the '<em><b>Pneumaticsupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPORTIONAL_CYLINDER__PNEUMATICSUPPLY = CYLINDER__PNEUMATICSUPPLY;

	/**
	 * The feature id for the '<em><b>Signal Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPORTIONAL_CYLINDER__SIGNAL_INTERFACE = CYLINDER__SIGNAL_INTERFACE;

	/**
	 * The feature id for the '<em><b>Component Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPORTIONAL_CYLINDER__COMPONENT_REPOSITORY = CYLINDER__COMPONENT_REPOSITORY;

	/**
	 * The number of structural features of the '<em>Proportional Cylinder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPORTIONAL_CYLINDER_FEATURE_COUNT = CYLINDER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.impl.BistableCylinderImpl <em>Bistable Cylinder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.BistableCylinderImpl
	 * @see xPPU.impl.XPPUPackageImpl#getBistableCylinder()
	 * @generated
	 */
	int BISTABLE_CYLINDER = 48;

	/**
	 * The feature id for the '<em><b>Pneumaticsupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BISTABLE_CYLINDER__PNEUMATICSUPPLY = CYLINDER__PNEUMATICSUPPLY;

	/**
	 * The feature id for the '<em><b>Signal Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BISTABLE_CYLINDER__SIGNAL_INTERFACE = CYLINDER__SIGNAL_INTERFACE;

	/**
	 * The feature id for the '<em><b>Component Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BISTABLE_CYLINDER__COMPONENT_REPOSITORY = CYLINDER__COMPONENT_REPOSITORY;

	/**
	 * The number of structural features of the '<em>Bistable Cylinder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BISTABLE_CYLINDER_FEATURE_COUNT = CYLINDER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.impl.ControllerImpl <em>Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.ControllerImpl
	 * @see xPPU.impl.XPPUPackageImpl#getController()
	 * @generated
	 */
	int CONTROLLER = 49;

	/**
	 * The feature id for the '<em><b>Signalinterface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__SIGNALINTERFACE = 0;

	/**
	 * The feature id for the '<em><b>Powersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__POWERSUPPLY = 1;

	/**
	 * The feature id for the '<em><b>Controller Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__CONTROLLER_OF = 2;

	/**
	 * The number of structural features of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link xPPU.impl.LEDImpl <em>LED</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.LEDImpl
	 * @see xPPU.impl.XPPUPackageImpl#getLED()
	 * @generated
	 */
	int LED = 50;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__PIN = ELECTRONIC_PART__PIN;

	/**
	 * The feature id for the '<em><b>Physicalconnection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__PHYSICALCONNECTION = ELECTRONIC_PART__PHYSICALCONNECTION;

	/**
	 * The feature id for the '<em><b>Component Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__COMPONENT_REPOSITORY = ELECTRONIC_PART__COMPONENT_REPOSITORY;

	/**
	 * The number of structural features of the '<em>LED</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED_FEATURE_COUNT = ELECTRONIC_PART_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.ButtonImpl
	 * @see xPPU.impl.XPPUPackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 51;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__PIN = ELECTRONIC_PART__PIN;

	/**
	 * The feature id for the '<em><b>Physicalconnection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__PHYSICALCONNECTION = ELECTRONIC_PART__PHYSICALCONNECTION;

	/**
	 * The feature id for the '<em><b>Component Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__COMPONENT_REPOSITORY = ELECTRONIC_PART__COMPONENT_REPOSITORY;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = ELECTRONIC_PART_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.impl.RegularRampImpl <em>Regular Ramp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.RegularRampImpl
	 * @see xPPU.impl.XPPUPackageImpl#getRegularRamp()
	 * @generated
	 */
	int REGULAR_RAMP = 52;

	/**
	 * The feature id for the '<em><b>Component Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_RAMP__COMPONENT_REPOSITORY = RAMP__COMPONENT_REPOSITORY;

	/**
	 * The feature id for the '<em><b>Screwing base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_RAMP__SCREWING_BASE = RAMP__SCREWING_BASE;

	/**
	 * The feature id for the '<em><b>Screwing component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_RAMP__SCREWING_COMPONENT = RAMP__SCREWING_COMPONENT;

	/**
	 * The feature id for the '<em><b>Physicalconnection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_RAMP__PHYSICALCONNECTION = RAMP__PHYSICALCONNECTION;

	/**
	 * The number of structural features of the '<em>Regular Ramp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_RAMP_FEATURE_COUNT = RAMP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.impl.PipeImpl <em>Pipe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.PipeImpl
	 * @see xPPU.impl.XPPUPackageImpl#getPipe()
	 * @generated
	 */
	int PIPE = 53;

	/**
	 * The feature id for the '<em><b>Plugs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE__PLUGS = 0;

	/**
	 * The feature id for the '<em><b>Component Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE__COMPONENT_REPOSITORY = 1;

	/**
	 * The number of structural features of the '<em>Pipe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link xPPU.impl.PneumaticPipeImpl <em>Pneumatic Pipe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.PneumaticPipeImpl
	 * @see xPPU.impl.XPPUPackageImpl#getPneumaticPipe()
	 * @generated
	 */
	int PNEUMATIC_PIPE = 54;

	/**
	 * The feature id for the '<em><b>Plugs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_PIPE__PLUGS = PIPE__PLUGS;

	/**
	 * The feature id for the '<em><b>Component Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_PIPE__COMPONENT_REPOSITORY = PIPE__COMPONENT_REPOSITORY;

	/**
	 * The number of structural features of the '<em>Pneumatic Pipe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_PIPE_FEATURE_COUNT = PIPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.impl.BusMasterImpl <em>Bus Master</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.BusMasterImpl
	 * @see xPPU.impl.XPPUPackageImpl#getBusMaster()
	 * @generated
	 */
	int BUS_MASTER = 55;

	/**
	 * The feature id for the '<em><b>Signalinterfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_MASTER__SIGNALINTERFACES = 0;

	/**
	 * The feature id for the '<em><b>Signalinterface controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_MASTER__SIGNALINTERFACE_CONTROLLER = 1;

	/**
	 * The feature id for the '<em><b>Component Repostitory</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_MASTER__COMPONENT_REPOSTITORY = 2;

	/**
	 * The number of structural features of the '<em>Bus Master</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_MASTER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link xPPU.impl.BusSlaveImpl <em>Bus Slave</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.BusSlaveImpl
	 * @see xPPU.impl.XPPUPackageImpl#getBusSlave()
	 * @generated
	 */
	int BUS_SLAVE = 56;

	/**
	 * The feature id for the '<em><b>Signalinterface master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_SLAVE__SIGNALINTERFACE_MASTER = 0;

	/**
	 * The feature id for the '<em><b>Signalinterface slave</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_SLAVE__SIGNALINTERFACE_SLAVE = 1;

	/**
	 * The feature id for the '<em><b>Component Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_SLAVE__COMPONENT_REPOSITORY = 2;

	/**
	 * The number of structural features of the '<em>Bus Slave</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_SLAVE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link xPPU.impl.BusCableImpl <em>Bus Cable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.BusCableImpl
	 * @see xPPU.impl.XPPUPackageImpl#getBusCable()
	 * @generated
	 */
	int BUS_CABLE = 57;

	/**
	 * The feature id for the '<em><b>Component Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CABLE__COMPONENT_REPOSITORY = CABLE__COMPONENT_REPOSITORY;

	/**
	 * The feature id for the '<em><b>Signal Plug1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CABLE__SIGNAL_PLUG1 = CABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Signal Plug2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CABLE__SIGNAL_PLUG2 = CABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bus Cable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CABLE_FEATURE_COUNT = CABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link xPPU.impl.BusBoxImpl <em>Bus Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.BusBoxImpl
	 * @see xPPU.impl.XPPUPackageImpl#getBusBox()
	 * @generated
	 */
	int BUS_BOX = 58;

	/**
	 * The feature id for the '<em><b>Signalinterfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_BOX__SIGNALINTERFACES = 0;

	/**
	 * The feature id for the '<em><b>Signalinterface master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_BOX__SIGNALINTERFACE_MASTER = 1;

	/**
	 * The feature id for the '<em><b>Signalinterface box</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_BOX__SIGNALINTERFACE_BOX = 2;

	/**
	 * The feature id for the '<em><b>Powersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_BOX__POWERSUPPLY = 3;

	/**
	 * The number of structural features of the '<em>Bus Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_BOX_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link xPPU.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.InterfaceImpl
	 * @see xPPU.impl.XPPUPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 59;

	/**
	 * The feature id for the '<em><b>Screwings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__SCREWINGS = 0;

	/**
	 * The feature id for the '<em><b>Suspensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__SUSPENSIONS = 1;

	/**
	 * The feature id for the '<em><b>Gearings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__GEARINGS = 2;

	/**
	 * The feature id for the '<em><b>Clamping</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__CLAMPING = 3;

	/**
	 * The feature id for the '<em><b>Pneumaticsupplys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__PNEUMATICSUPPLYS = 4;

	/**
	 * The feature id for the '<em><b>Signalinterfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__SIGNALINTERFACES = 5;

	/**
	 * The feature id for the '<em><b>Powersupply</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__POWERSUPPLY = 6;

	/**
	 * The feature id for the '<em><b>Watersupply</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__WATERSUPPLY = 7;

	/**
	 * The feature id for the '<em><b>Physicalconnections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__PHYSICALCONNECTIONS = 8;

	/**
	 * The feature id for the '<em><b>Transportconnection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__TRANSPORTCONNECTION = 9;

	/**
	 * The feature id for the '<em><b>Component Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__COMPONENT_REPOSITORY = 10;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link xPPU.impl.ScrewingImpl <em>Screwing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.ScrewingImpl
	 * @see xPPU.impl.XPPUPackageImpl#getScrewing()
	 * @generated
	 */
	int SCREWING = 60;

	/**
	 * The feature id for the '<em><b>Inteface Part</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING__INTEFACE_PART = 0;

	/**
	 * The number of structural features of the '<em>Screwing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link xPPU.impl.SuspensionImpl <em>Suspension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.SuspensionImpl
	 * @see xPPU.impl.XPPUPackageImpl#getSuspension()
	 * @generated
	 */
	int SUSPENSION = 61;

	/**
	 * The feature id for the '<em><b>Inteface Part</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION__INTEFACE_PART = 0;

	/**
	 * The number of structural features of the '<em>Suspension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link xPPU.impl.GearingImpl <em>Gearing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.GearingImpl
	 * @see xPPU.impl.XPPUPackageImpl#getGearing()
	 * @generated
	 */
	int GEARING = 62;

	/**
	 * The feature id for the '<em><b>Inteface Part</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEARING__INTEFACE_PART = 0;

	/**
	 * The number of structural features of the '<em>Gearing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEARING_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link xPPU.impl.ClampingImpl <em>Clamping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.ClampingImpl
	 * @see xPPU.impl.XPPUPackageImpl#getClamping()
	 * @generated
	 */
	int CLAMPING = 63;

	/**
	 * The feature id for the '<em><b>Inteface Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAMPING__INTEFACE_PART = 0;

	/**
	 * The number of structural features of the '<em>Clamping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAMPING_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link xPPU.impl.PneumaticSupplyImpl <em>Pneumatic Supply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.PneumaticSupplyImpl
	 * @see xPPU.impl.XPPUPackageImpl#getPneumaticSupply()
	 * @generated
	 */
	int PNEUMATIC_SUPPLY = 64;

	/**
	 * The feature id for the '<em><b>Inteface Part</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_SUPPLY__INTEFACE_PART = 0;

	/**
	 * The number of structural features of the '<em>Pneumatic Supply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_SUPPLY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link xPPU.impl.SignalInterfaceImpl <em>Signal Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.SignalInterfaceImpl
	 * @see xPPU.impl.XPPUPackageImpl#getSignalInterface()
	 * @generated
	 */
	int SIGNAL_INTERFACE = 65;

	/**
	 * The feature id for the '<em><b>Inteface Part</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_INTERFACE__INTEFACE_PART = 0;

	/**
	 * The number of structural features of the '<em>Signal Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_INTERFACE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link xPPU.impl.WaterSupplyImpl <em>Water Supply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.WaterSupplyImpl
	 * @see xPPU.impl.XPPUPackageImpl#getWaterSupply()
	 * @generated
	 */
	int WATER_SUPPLY = 66;

	/**
	 * The feature id for the '<em><b>Inteface Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SUPPLY__INTEFACE_PART = 0;

	/**
	 * The number of structural features of the '<em>Water Supply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SUPPLY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link xPPU.impl.PhysicalConnectionImpl <em>Physical Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.PhysicalConnectionImpl
	 * @see xPPU.impl.XPPUPackageImpl#getPhysicalConnection()
	 * @generated
	 */
	int PHYSICAL_CONNECTION = 67;

	/**
	 * The feature id for the '<em><b>Inteface Part</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONNECTION__INTEFACE_PART = 0;

	/**
	 * The number of structural features of the '<em>Physical Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONNECTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link xPPU.impl.TransportConnectionImpl <em>Transport Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.impl.TransportConnectionImpl
	 * @see xPPU.impl.XPPUPackageImpl#getTransportConnection()
	 * @generated
	 */
	int TRANSPORT_CONNECTION = 68;

	/**
	 * The feature id for the '<em><b>Inteface Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_CONNECTION__INTEFACE_PART = 0;

	/**
	 * The number of structural features of the '<em>Transport Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_CONNECTION_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link xPPU.Plant <em>Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plant</em>'.
	 * @see xPPU.Plant
	 * @generated
	 */
	EClass getPlant();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.Plant#getStructures <em>Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Structures</em>'.
	 * @see xPPU.Plant#getStructures()
	 * @see #getPlant()
	 * @generated
	 */
	EReference getPlant_Structures();

	/**
	 * Returns the meta object for class '{@link xPPU.Structure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure</em>'.
	 * @see xPPU.Structure
	 * @generated
	 */
	EClass getStructure();

	/**
	 * Returns the meta object for the container reference '{@link xPPU.Structure#getParentPlant <em>Parent Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Plant</em>'.
	 * @see xPPU.Structure#getParentPlant()
	 * @see #getStructure()
	 * @generated
	 */
	EReference getStructure_ParentPlant();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.Structure#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modules</em>'.
	 * @see xPPU.Structure#getModules()
	 * @see #getStructure()
	 * @generated
	 */
	EReference getStructure_Modules();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.Structure#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see xPPU.Structure#getComponents()
	 * @see #getStructure()
	 * @generated
	 */
	EReference getStructure_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.Structure#getCranes <em>Cranes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cranes</em>'.
	 * @see xPPU.Structure#getCranes()
	 * @see #getStructure()
	 * @generated
	 */
	EReference getStructure_Cranes();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.Structure#getConveyor <em>Conveyor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conveyor</em>'.
	 * @see xPPU.Structure#getConveyor()
	 * @see #getStructure()
	 * @generated
	 */
	EReference getStructure_Conveyor();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.Structure#getControlcabinets <em>Controlcabinets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controlcabinets</em>'.
	 * @see xPPU.Structure#getControlcabinets()
	 * @see #getStructure()
	 * @generated
	 */
	EReference getStructure_Controlcabinets();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.Structure#getPowernetworks <em>Powernetworks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Powernetworks</em>'.
	 * @see xPPU.Structure#getPowernetworks()
	 * @see #getStructure()
	 * @generated
	 */
	EReference getStructure_Powernetworks();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.Structure#getCommunicationnetworks <em>Communicationnetworks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Communicationnetworks</em>'.
	 * @see xPPU.Structure#getCommunicationnetworks()
	 * @see #getStructure()
	 * @generated
	 */
	EReference getStructure_Communicationnetworks();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.Structure#getPneumaticnetworks <em>Pneumaticnetworks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pneumaticnetworks</em>'.
	 * @see xPPU.Structure#getPneumaticnetworks()
	 * @see #getStructure()
	 * @generated
	 */
	EReference getStructure_Pneumaticnetworks();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.Structure#getPowerwiring <em>Powerwiring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Powerwiring</em>'.
	 * @see xPPU.Structure#getPowerwiring()
	 * @see #getStructure()
	 * @generated
	 */
	EReference getStructure_Powerwiring();

	/**
	 * Returns the meta object for class '{@link xPPU.CommunicationNetwork <em>Communication Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Network</em>'.
	 * @see xPPU.CommunicationNetwork
	 * @generated
	 */
	EClass getCommunicationNetwork();

	/**
	 * Returns the meta object for the container reference '{@link xPPU.CommunicationNetwork#getParentStructure <em>Parent Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Structure</em>'.
	 * @see xPPU.CommunicationNetwork#getParentStructure()
	 * @see #getCommunicationNetwork()
	 * @generated
	 */
	EReference getCommunicationNetwork_ParentStructure();

	/**
	 * Returns the meta object for class '{@link xPPU.PowerNetwork <em>Power Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Network</em>'.
	 * @see xPPU.PowerNetwork
	 * @generated
	 */
	EClass getPowerNetwork();

	/**
	 * Returns the meta object for the container reference '{@link xPPU.PowerNetwork#getParentStructure <em>Parent Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Structure</em>'.
	 * @see xPPU.PowerNetwork#getParentStructure()
	 * @see #getPowerNetwork()
	 * @generated
	 */
	EReference getPowerNetwork_ParentStructure();

	/**
	 * Returns the meta object for class '{@link xPPU.ControlCabinet <em>Control Cabinet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Cabinet</em>'.
	 * @see xPPU.ControlCabinet
	 * @generated
	 */
	EClass getControlCabinet();

	/**
	 * Returns the meta object for the reference '{@link xPPU.ControlCabinet#getParentStructure <em>Parent Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Structure</em>'.
	 * @see xPPU.ControlCabinet#getParentStructure()
	 * @see #getControlCabinet()
	 * @generated
	 */
	EReference getControlCabinet_ParentStructure();

	/**
	 * Returns the meta object for the reference '{@link xPPU.ControlCabinet#getController <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Controller</em>'.
	 * @see xPPU.ControlCabinet#getController()
	 * @see #getControlCabinet()
	 * @generated
	 */
	EReference getControlCabinet_Controller();

	/**
	 * Returns the meta object for class '{@link xPPU.PneumaticNetwork <em>Pneumatic Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pneumatic Network</em>'.
	 * @see xPPU.PneumaticNetwork
	 * @generated
	 */
	EClass getPneumaticNetwork();

	/**
	 * Returns the meta object for the container reference '{@link xPPU.PneumaticNetwork#getParentStructure <em>Parent Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Structure</em>'.
	 * @see xPPU.PneumaticNetwork#getParentStructure()
	 * @see #getPneumaticNetwork()
	 * @generated
	 */
	EReference getPneumaticNetwork_ParentStructure();

	/**
	 * Returns the meta object for class '{@link xPPU.Conveyor <em>Conveyor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conveyor</em>'.
	 * @see xPPU.Conveyor
	 * @generated
	 */
	EClass getConveyor();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.Conveyor#getBelts <em>Belts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Belts</em>'.
	 * @see xPPU.Conveyor#getBelts()
	 * @see #getConveyor()
	 * @generated
	 */
	EReference getConveyor_Belts();

	/**
	 * Returns the meta object for the container reference '{@link xPPU.Conveyor#getParentStructure <em>Parent Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Structure</em>'.
	 * @see xPPU.Conveyor#getParentStructure()
	 * @see #getConveyor()
	 * @generated
	 */
	EReference getConveyor_ParentStructure();

	/**
	 * Returns the meta object for class '{@link xPPU.Crane <em>Crane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Crane</em>'.
	 * @see xPPU.Crane
	 * @generated
	 */
	EClass getCrane();

	/**
	 * Returns the meta object for the reference list '{@link xPPU.Crane#getArm <em>Arm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arm</em>'.
	 * @see xPPU.Crane#getArm()
	 * @see #getCrane()
	 * @generated
	 */
	EReference getCrane_Arm();

	/**
	 * Returns the meta object for the reference list '{@link xPPU.Crane#getMountedOn <em>Mounted On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mounted On</em>'.
	 * @see xPPU.Crane#getMountedOn()
	 * @see #getCrane()
	 * @generated
	 */
	EReference getCrane_MountedOn();

	/**
	 * Returns the meta object for the reference list '{@link xPPU.Crane#getVacuumgripper <em>Vacuumgripper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vacuumgripper</em>'.
	 * @see xPPU.Crane#getVacuumgripper()
	 * @see #getCrane()
	 * @generated
	 */
	EReference getCrane_Vacuumgripper();

	/**
	 * Returns the meta object for the container reference '{@link xPPU.Crane#getParentStructure <em>Parent Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Structure</em>'.
	 * @see xPPU.Crane#getParentStructure()
	 * @see #getCrane()
	 * @generated
	 */
	EReference getCrane_ParentStructure();

	/**
	 * Returns the meta object for class '{@link xPPU.PowerWiring <em>Power Wiring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Wiring</em>'.
	 * @see xPPU.PowerWiring
	 * @generated
	 */
	EClass getPowerWiring();

	/**
	 * Returns the meta object for the container reference '{@link xPPU.PowerWiring#getParentStructure <em>Parent Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Structure</em>'.
	 * @see xPPU.PowerWiring#getParentStructure()
	 * @see #getPowerWiring()
	 * @generated
	 */
	EReference getPowerWiring_ParentStructure();

	/**
	 * Returns the meta object for class '{@link xPPU.Modules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modules</em>'.
	 * @see xPPU.Modules
	 * @generated
	 */
	EClass getModules();

	/**
	 * Returns the meta object for the reference list '{@link xPPU.Modules#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Modules</em>'.
	 * @see xPPU.Modules#getModules()
	 * @see #getModules()
	 * @generated
	 */
	EReference getModules_Modules();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.Modules#getRampmodules <em>Rampmodules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rampmodules</em>'.
	 * @see xPPU.Modules#getRampmodules()
	 * @see #getModules()
	 * @generated
	 */
	EReference getModules_Rampmodules();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.Modules#getPushermodules <em>Pushermodules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pushermodules</em>'.
	 * @see xPPU.Modules#getPushermodules()
	 * @see #getModules()
	 * @generated
	 */
	EReference getModules_Pushermodules();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.Modules#getMotormodules <em>Motormodules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Motormodules</em>'.
	 * @see xPPU.Modules#getMotormodules()
	 * @see #getModules()
	 * @generated
	 */
	EReference getModules_Motormodules();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.Modules#getSensormodules <em>Sensormodules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sensormodules</em>'.
	 * @see xPPU.Modules#getSensormodules()
	 * @see #getModules()
	 * @generated
	 */
	EReference getModules_Sensormodules();

	/**
	 * Returns the meta object for the container reference '{@link xPPU.Modules#getParentStructure <em>Parent Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Structure</em>'.
	 * @see xPPU.Modules#getParentStructure()
	 * @see #getModules()
	 * @generated
	 */
	EReference getModules_ParentStructure();

	/**
	 * Returns the meta object for class '{@link xPPU.RampModule <em>Ramp Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ramp Module</em>'.
	 * @see xPPU.RampModule
	 * @generated
	 */
	EClass getRampModule();

	/**
	 * Returns the meta object for the container reference '{@link xPPU.RampModule#getParentModuleContainer <em>Parent Module Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Module Container</em>'.
	 * @see xPPU.RampModule#getParentModuleContainer()
	 * @see #getRampModule()
	 * @generated
	 */
	EReference getRampModule_ParentModuleContainer();

	/**
	 * Returns the meta object for class '{@link xPPU.PusherModule <em>Pusher Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pusher Module</em>'.
	 * @see xPPU.PusherModule
	 * @generated
	 */
	EClass getPusherModule();

	/**
	 * Returns the meta object for the container reference '{@link xPPU.PusherModule#getParentModuleContainer <em>Parent Module Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Module Container</em>'.
	 * @see xPPU.PusherModule#getParentModuleContainer()
	 * @see #getPusherModule()
	 * @generated
	 */
	EReference getPusherModule_ParentModuleContainer();

	/**
	 * Returns the meta object for class '{@link xPPU.MotorModule <em>Motor Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Motor Module</em>'.
	 * @see xPPU.MotorModule
	 * @generated
	 */
	EClass getMotorModule();

	/**
	 * Returns the meta object for the container reference '{@link xPPU.MotorModule#getParentModuleContainer <em>Parent Module Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Module Container</em>'.
	 * @see xPPU.MotorModule#getParentModuleContainer()
	 * @see #getMotorModule()
	 * @generated
	 */
	EReference getMotorModule_ParentModuleContainer();

	/**
	 * Returns the meta object for class '{@link xPPU.SensorModule <em>Sensor Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor Module</em>'.
	 * @see xPPU.SensorModule
	 * @generated
	 */
	EClass getSensorModule();

	/**
	 * Returns the meta object for the container reference '{@link xPPU.SensorModule#getParentModuleContainer <em>Parent Module Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Module Container</em>'.
	 * @see xPPU.SensorModule#getParentModuleContainer()
	 * @see #getSensorModule()
	 * @generated
	 */
	EReference getSensorModule_ParentModuleContainer();

	/**
	 * Returns the meta object for class '{@link xPPU.Arm <em>Arm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arm</em>'.
	 * @see xPPU.Arm
	 * @generated
	 */
	EClass getArm();

	/**
	 * Returns the meta object for the reference '{@link xPPU.Arm#getMountedTo <em>Mounted To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mounted To</em>'.
	 * @see xPPU.Arm#getMountedTo()
	 * @see #getArm()
	 * @generated
	 */
	EReference getArm_MountedTo();

	/**
	 * Returns the meta object for class '{@link xPPU.TurningTable <em>Turning Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turning Table</em>'.
	 * @see xPPU.TurningTable
	 * @generated
	 */
	EClass getTurningTable();

	/**
	 * Returns the meta object for the reference '{@link xPPU.TurningTable#getMounts <em>Mounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mounts</em>'.
	 * @see xPPU.TurningTable#getMounts()
	 * @see #getTurningTable()
	 * @generated
	 */
	EReference getTurningTable_Mounts();

	/**
	 * Returns the meta object for class '{@link xPPU.VacuumGripper <em>Vacuum Gripper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vacuum Gripper</em>'.
	 * @see xPPU.VacuumGripper
	 * @generated
	 */
	EClass getVacuumGripper();

	/**
	 * Returns the meta object for the reference '{@link xPPU.VacuumGripper#getMountedTo <em>Mounted To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mounted To</em>'.
	 * @see xPPU.VacuumGripper#getMountedTo()
	 * @see #getVacuumGripper()
	 * @generated
	 */
	EReference getVacuumGripper_MountedTo();

	/**
	 * Returns the meta object for class '{@link xPPU.ConveyorBelt <em>Conveyor Belt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conveyor Belt</em>'.
	 * @see xPPU.ConveyorBelt
	 * @generated
	 */
	EClass getConveyorBelt();

	/**
	 * Returns the meta object for the container reference '{@link xPPU.ConveyorBelt#getMountedTo <em>Mounted To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Mounted To</em>'.
	 * @see xPPU.ConveyorBelt#getMountedTo()
	 * @see #getConveyorBelt()
	 * @generated
	 */
	EReference getConveyorBelt_MountedTo();

	/**
	 * Returns the meta object for class '{@link xPPU.Pusher <em>Pusher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pusher</em>'.
	 * @see xPPU.Pusher
	 * @generated
	 */
	EClass getPusher();

	/**
	 * Returns the meta object for the reference '{@link xPPU.Pusher#getComponentsRepository <em>Components Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Components Repository</em>'.
	 * @see xPPU.Pusher#getComponentsRepository()
	 * @see #getPusher()
	 * @generated
	 */
	EReference getPusher_ComponentsRepository();

	/**
	 * Returns the meta object for class '{@link xPPU.Components <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Components</em>'.
	 * @see xPPU.Components
	 * @generated
	 */
	EClass getComponents();

	/**
	 * Returns the meta object for the container reference '{@link xPPU.Components#getParentStructure <em>Parent Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Structure</em>'.
	 * @see xPPU.Components#getParentStructure()
	 * @see #getComponents()
	 * @generated
	 */
	EReference getComponents_ParentStructure();

	/**
	 * Returns the meta object for the reference list '{@link xPPU.Components#getElectronicComponents <em>Electronic Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Electronic Components</em>'.
	 * @see xPPU.Components#getElectronicComponents()
	 * @see #getComponents()
	 * @generated
	 */
	EReference getComponents_ElectronicComponents();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.Components#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfaces</em>'.
	 * @see xPPU.Components#getInterfaces()
	 * @see #getComponents()
	 * @generated
	 */
	EReference getComponents_Interfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.Components#getMotors <em>Motors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Motors</em>'.
	 * @see xPPU.Components#getMotors()
	 * @see #getComponents()
	 * @generated
	 */
	EReference getComponents_Motors();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.Components#getMechanicalAssemblys <em>Mechanical Assemblys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mechanical Assemblys</em>'.
	 * @see xPPU.Components#getMechanicalAssemblys()
	 * @see #getComponents()
	 * @generated
	 */
	EReference getComponents_MechanicalAssemblys();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.Components#getSensors <em>Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sensors</em>'.
	 * @see xPPU.Components#getSensors()
	 * @see #getComponents()
	 * @generated
	 */
	EReference getComponents_Sensors();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.Components#getPipes <em>Pipes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pipes</em>'.
	 * @see xPPU.Components#getPipes()
	 * @see #getComponents()
	 * @generated
	 */
	EReference getComponents_Pipes();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.Components#getCompressors <em>Compressors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compressors</em>'.
	 * @see xPPU.Components#getCompressors()
	 * @see #getComponents()
	 * @generated
	 */
	EReference getComponents_Compressors();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.Components#getBuscables <em>Buscables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Buscables</em>'.
	 * @see xPPU.Components#getBuscables()
	 * @see #getComponents()
	 * @generated
	 */
	EReference getComponents_Buscables();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.Components#getBusmasters <em>Busmasters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Busmasters</em>'.
	 * @see xPPU.Components#getBusmasters()
	 * @see #getComponents()
	 * @generated
	 */
	EReference getComponents_Busmasters();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.Components#getBusslaves <em>Busslaves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Busslaves</em>'.
	 * @see xPPU.Components#getBusslaves()
	 * @see #getComponents()
	 * @generated
	 */
	EReference getComponents_Busslaves();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.Components#getBusboxes <em>Busboxes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Busboxes</em>'.
	 * @see xPPU.Components#getBusboxes()
	 * @see #getComponents()
	 * @generated
	 */
	EReference getComponents_Busboxes();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.Components#getCylinders <em>Cylinders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cylinders</em>'.
	 * @see xPPU.Components#getCylinders()
	 * @see #getComponents()
	 * @generated
	 */
	EReference getComponents_Cylinders();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.Components#getPowercables <em>Powercables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Powercables</em>'.
	 * @see xPPU.Components#getPowercables()
	 * @see #getComponents()
	 * @generated
	 */
	EReference getComponents_Powercables();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.Components#getValves <em>Valves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Valves</em>'.
	 * @see xPPU.Components#getValves()
	 * @see #getComponents()
	 * @generated
	 */
	EReference getComponents_Valves();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.Components#getMechanicalparts <em>Mechanicalparts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mechanicalparts</em>'.
	 * @see xPPU.Components#getMechanicalparts()
	 * @see #getComponents()
	 * @generated
	 */
	EReference getComponents_Mechanicalparts();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.Components#getPowersupplys <em>Powersupplys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Powersupplys</em>'.
	 * @see xPPU.Components#getPowersupplys()
	 * @see #getComponents()
	 * @generated
	 */
	EReference getComponents_Powersupplys();

	/**
	 * Returns the meta object for the reference list '{@link xPPU.Components#getPushers <em>Pushers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pushers</em>'.
	 * @see xPPU.Components#getPushers()
	 * @see #getComponents()
	 * @generated
	 */
	EReference getComponents_Pushers();

	/**
	 * Returns the meta object for the reference list '{@link xPPU.Components#getCorners <em>Corners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Corners</em>'.
	 * @see xPPU.Components#getCorners()
	 * @see #getComponents()
	 * @generated
	 */
	EReference getComponents_Corners();

	/**
	 * Returns the meta object for the reference list '{@link xPPU.Components#getDispensers <em>Dispensers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dispensers</em>'.
	 * @see xPPU.Components#getDispensers()
	 * @see #getComponents()
	 * @generated
	 */
	EReference getComponents_Dispensers();

	/**
	 * Returns the meta object for the reference list '{@link xPPU.Components#getRacks <em>Racks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Racks</em>'.
	 * @see xPPU.Components#getRacks()
	 * @see #getComponents()
	 * @generated
	 */
	EReference getComponents_Racks();

	/**
	 * Returns the meta object for the reference list '{@link xPPU.Components#getTanks <em>Tanks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tanks</em>'.
	 * @see xPPU.Components#getTanks()
	 * @see #getComponents()
	 * @generated
	 */
	EReference getComponents_Tanks();

	/**
	 * Returns the meta object for the reference list '{@link xPPU.Components#getSplitter <em>Splitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Splitter</em>'.
	 * @see xPPU.Components#getSplitter()
	 * @see #getComponents()
	 * @generated
	 */
	EReference getComponents_Splitter();

	/**
	 * Returns the meta object for the reference list '{@link xPPU.Components#getBottleSeperator <em>Bottle Seperator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bottle Seperator</em>'.
	 * @see xPPU.Components#getBottleSeperator()
	 * @see #getComponents()
	 * @generated
	 */
	EReference getComponents_BottleSeperator();

	/**
	 * Returns the meta object for the reference list '{@link xPPU.Components#getPanels <em>Panels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Panels</em>'.
	 * @see xPPU.Components#getPanels()
	 * @see #getComponents()
	 * @generated
	 */
	EReference getComponents_Panels();

	/**
	 * Returns the meta object for the reference list '{@link xPPU.Components#getCables <em>Cables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cables</em>'.
	 * @see xPPU.Components#getCables()
	 * @see #getComponents()
	 * @generated
	 */
	EReference getComponents_Cables();

	/**
	 * Returns the meta object for class '{@link xPPU.Motor <em>Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Motor</em>'.
	 * @see xPPU.Motor
	 * @generated
	 */
	EClass getMotor();

	/**
	 * Returns the meta object for the reference '{@link xPPU.Motor#getGearing <em>Gearing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gearing</em>'.
	 * @see xPPU.Motor#getGearing()
	 * @see #getMotor()
	 * @generated
	 */
	EReference getMotor_Gearing();

	/**
	 * Returns the meta object for the reference '{@link xPPU.Motor#getScrewing <em>Screwing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Screwing</em>'.
	 * @see xPPU.Motor#getScrewing()
	 * @see #getMotor()
	 * @generated
	 */
	EReference getMotor_Screwing();

	/**
	 * Returns the meta object for the reference '{@link xPPU.Motor#getPowersupply <em>Powersupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Powersupply</em>'.
	 * @see xPPU.Motor#getPowersupply()
	 * @see #getMotor()
	 * @generated
	 */
	EReference getMotor_Powersupply();

	/**
	 * Returns the meta object for the container reference '{@link xPPU.Motor#getComponentRepository <em>Component Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Component Repository</em>'.
	 * @see xPPU.Motor#getComponentRepository()
	 * @see #getMotor()
	 * @generated
	 */
	EReference getMotor_ComponentRepository();

	/**
	 * Returns the meta object for class '{@link xPPU.SimpleMotor <em>Simple Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Motor</em>'.
	 * @see xPPU.SimpleMotor
	 * @generated
	 */
	EClass getSimpleMotor();

	/**
	 * Returns the meta object for class '{@link xPPU.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see xPPU.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the reference '{@link xPPU.Sensor#getPhysicalconnection <em>Physicalconnection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Physicalconnection</em>'.
	 * @see xPPU.Sensor#getPhysicalconnection()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_Physicalconnection();

	/**
	 * Returns the meta object for the reference '{@link xPPU.Sensor#getSignalinterface <em>Signalinterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signalinterface</em>'.
	 * @see xPPU.Sensor#getSignalinterface()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_Signalinterface();

	/**
	 * Returns the meta object for the reference '{@link xPPU.Sensor#getPowersupply <em>Powersupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Powersupply</em>'.
	 * @see xPPU.Sensor#getPowersupply()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_Powersupply();

	/**
	 * Returns the meta object for the container reference '{@link xPPU.Sensor#getComponentRepository <em>Component Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Component Repository</em>'.
	 * @see xPPU.Sensor#getComponentRepository()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_ComponentRepository();

	/**
	 * Returns the meta object for class '{@link xPPU.Rack <em>Rack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rack</em>'.
	 * @see xPPU.Rack
	 * @generated
	 */
	EClass getRack();

	/**
	 * Returns the meta object for the reference '{@link xPPU.Rack#getScrewing_to_base <em>Screwing to base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Screwing to base</em>'.
	 * @see xPPU.Rack#getScrewing_to_base()
	 * @see #getRack()
	 * @generated
	 */
	EReference getRack_Screwing_to_base();

	/**
	 * Returns the meta object for the reference '{@link xPPU.Rack#getComponentRepository <em>Component Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Repository</em>'.
	 * @see xPPU.Rack#getComponentRepository()
	 * @see #getRack()
	 * @generated
	 */
	EReference getRack_ComponentRepository();

	/**
	 * Returns the meta object for class '{@link xPPU.Corner <em>Corner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Corner</em>'.
	 * @see xPPU.Corner
	 * @generated
	 */
	EClass getCorner();

	/**
	 * Returns the meta object for the reference '{@link xPPU.Corner#getComponentRepository <em>Component Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Repository</em>'.
	 * @see xPPU.Corner#getComponentRepository()
	 * @see #getCorner()
	 * @generated
	 */
	EReference getCorner_ComponentRepository();

	/**
	 * Returns the meta object for class '{@link xPPU.Valve <em>Valve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valve</em>'.
	 * @see xPPU.Valve
	 * @generated
	 */
	EClass getValve();

	/**
	 * Returns the meta object for the reference '{@link xPPU.Valve#getPneumaticsupply <em>Pneumaticsupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pneumaticsupply</em>'.
	 * @see xPPU.Valve#getPneumaticsupply()
	 * @see #getValve()
	 * @generated
	 */
	EReference getValve_Pneumaticsupply();

	/**
	 * Returns the meta object for the reference '{@link xPPU.Valve#getPowersupply <em>Powersupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Powersupply</em>'.
	 * @see xPPU.Valve#getPowersupply()
	 * @see #getValve()
	 * @generated
	 */
	EReference getValve_Powersupply();

	/**
	 * Returns the meta object for the reference '{@link xPPU.Valve#getSignalinterface <em>Signalinterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signalinterface</em>'.
	 * @see xPPU.Valve#getSignalinterface()
	 * @see #getValve()
	 * @generated
	 */
	EReference getValve_Signalinterface();

	/**
	 * Returns the meta object for the container reference '{@link xPPU.Valve#getComponentRepository <em>Component Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Component Repository</em>'.
	 * @see xPPU.Valve#getComponentRepository()
	 * @see #getValve()
	 * @generated
	 */
	EReference getValve_ComponentRepository();

	/**
	 * Returns the meta object for class '{@link xPPU.Tank <em>Tank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tank</em>'.
	 * @see xPPU.Tank
	 * @generated
	 */
	EClass getTank();

	/**
	 * Returns the meta object for the reference '{@link xPPU.Tank#getWatersupply <em>Watersupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Watersupply</em>'.
	 * @see xPPU.Tank#getWatersupply()
	 * @see #getTank()
	 * @generated
	 */
	EReference getTank_Watersupply();

	/**
	 * Returns the meta object for the reference '{@link xPPU.Tank#getScrewing <em>Screwing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Screwing</em>'.
	 * @see xPPU.Tank#getScrewing()
	 * @see #getTank()
	 * @generated
	 */
	EReference getTank_Screwing();

	/**
	 * Returns the meta object for the reference '{@link xPPU.Tank#getComponentRepository <em>Component Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Repository</em>'.
	 * @see xPPU.Tank#getComponentRepository()
	 * @see #getTank()
	 * @generated
	 */
	EReference getTank_ComponentRepository();

	/**
	 * Returns the meta object for class '{@link xPPU.MechanicalPart <em>Mechanical Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mechanical Part</em>'.
	 * @see xPPU.MechanicalPart
	 * @generated
	 */
	EClass getMechanicalPart();

	/**
	 * Returns the meta object for the reference '{@link xPPU.MechanicalPart#getScrewing <em>Screwing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Screwing</em>'.
	 * @see xPPU.MechanicalPart#getScrewing()
	 * @see #getMechanicalPart()
	 * @generated
	 */
	EReference getMechanicalPart_Screwing();

	/**
	 * Returns the meta object for the container reference '{@link xPPU.MechanicalPart#getComponentRepository <em>Component Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Component Repository</em>'.
	 * @see xPPU.MechanicalPart#getComponentRepository()
	 * @see #getMechanicalPart()
	 * @generated
	 */
	EReference getMechanicalPart_ComponentRepository();

	/**
	 * Returns the meta object for class '{@link xPPU.Pushhead <em>Pushhead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pushhead</em>'.
	 * @see xPPU.Pushhead
	 * @generated
	 */
	EClass getPushhead();

	/**
	 * Returns the meta object for class '{@link xPPU.MechanicalAssembly <em>Mechanical Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mechanical Assembly</em>'.
	 * @see xPPU.MechanicalAssembly
	 * @generated
	 */
	EClass getMechanicalAssembly();

	/**
	 * Returns the meta object for the container reference '{@link xPPU.MechanicalAssembly#getComponentRepository <em>Component Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Component Repository</em>'.
	 * @see xPPU.MechanicalAssembly#getComponentRepository()
	 * @see #getMechanicalAssembly()
	 * @generated
	 */
	EReference getMechanicalAssembly_ComponentRepository();

	/**
	 * Returns the meta object for class '{@link xPPU.Ramp <em>Ramp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ramp</em>'.
	 * @see xPPU.Ramp
	 * @generated
	 */
	EClass getRamp();

	/**
	 * Returns the meta object for the reference '{@link xPPU.Ramp#getScrewing_base <em>Screwing base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Screwing base</em>'.
	 * @see xPPU.Ramp#getScrewing_base()
	 * @see #getRamp()
	 * @generated
	 */
	EReference getRamp_Screwing_base();

	/**
	 * Returns the meta object for the reference '{@link xPPU.Ramp#getScrewing_component <em>Screwing component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Screwing component</em>'.
	 * @see xPPU.Ramp#getScrewing_component()
	 * @see #getRamp()
	 * @generated
	 */
	EReference getRamp_Screwing_component();

	/**
	 * Returns the meta object for the reference '{@link xPPU.Ramp#getPhysicalconnection <em>Physicalconnection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Physicalconnection</em>'.
	 * @see xPPU.Ramp#getPhysicalconnection()
	 * @see #getRamp()
	 * @generated
	 */
	EReference getRamp_Physicalconnection();

	/**
	 * Returns the meta object for class '{@link xPPU.Cylinder <em>Cylinder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cylinder</em>'.
	 * @see xPPU.Cylinder
	 * @generated
	 */
	EClass getCylinder();

	/**
	 * Returns the meta object for the reference '{@link xPPU.Cylinder#getPneumaticsupply <em>Pneumaticsupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pneumaticsupply</em>'.
	 * @see xPPU.Cylinder#getPneumaticsupply()
	 * @see #getCylinder()
	 * @generated
	 */
	EReference getCylinder_Pneumaticsupply();

	/**
	 * Returns the meta object for the reference '{@link xPPU.Cylinder#getSignalInterface <em>Signal Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signal Interface</em>'.
	 * @see xPPU.Cylinder#getSignalInterface()
	 * @see #getCylinder()
	 * @generated
	 */
	EReference getCylinder_SignalInterface();

	/**
	 * Returns the meta object for the container reference '{@link xPPU.Cylinder#getComponentRepository <em>Component Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Component Repository</em>'.
	 * @see xPPU.Cylinder#getComponentRepository()
	 * @see #getCylinder()
	 * @generated
	 */
	EReference getCylinder_ComponentRepository();

	/**
	 * Returns the meta object for class '{@link xPPU.Dispenser <em>Dispenser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dispenser</em>'.
	 * @see xPPU.Dispenser
	 * @generated
	 */
	EClass getDispenser();

	/**
	 * Returns the meta object for the reference '{@link xPPU.Dispenser#getComponentRepository <em>Component Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Repository</em>'.
	 * @see xPPU.Dispenser#getComponentRepository()
	 * @see #getDispenser()
	 * @generated
	 */
	EReference getDispenser_ComponentRepository();

	/**
	 * Returns the meta object for class '{@link xPPU.BottleSeperator <em>Bottle Seperator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bottle Seperator</em>'.
	 * @see xPPU.BottleSeperator
	 * @generated
	 */
	EClass getBottleSeperator();

	/**
	 * Returns the meta object for the reference '{@link xPPU.BottleSeperator#getSignalinterface <em>Signalinterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signalinterface</em>'.
	 * @see xPPU.BottleSeperator#getSignalinterface()
	 * @see #getBottleSeperator()
	 * @generated
	 */
	EReference getBottleSeperator_Signalinterface();

	/**
	 * Returns the meta object for the reference '{@link xPPU.BottleSeperator#getPneumaticsupply <em>Pneumaticsupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pneumaticsupply</em>'.
	 * @see xPPU.BottleSeperator#getPneumaticsupply()
	 * @see #getBottleSeperator()
	 * @generated
	 */
	EReference getBottleSeperator_Pneumaticsupply();

	/**
	 * Returns the meta object for the reference '{@link xPPU.BottleSeperator#getPowersupply <em>Powersupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Powersupply</em>'.
	 * @see xPPU.BottleSeperator#getPowersupply()
	 * @see #getBottleSeperator()
	 * @generated
	 */
	EReference getBottleSeperator_Powersupply();

	/**
	 * Returns the meta object for the reference '{@link xPPU.BottleSeperator#getScrewing_to_rack <em>Screwing to rack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Screwing to rack</em>'.
	 * @see xPPU.BottleSeperator#getScrewing_to_rack()
	 * @see #getBottleSeperator()
	 * @generated
	 */
	EReference getBottleSeperator_Screwing_to_rack();

	/**
	 * Returns the meta object for the reference '{@link xPPU.BottleSeperator#getComponentRepository <em>Component Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Repository</em>'.
	 * @see xPPU.BottleSeperator#getComponentRepository()
	 * @see #getBottleSeperator()
	 * @generated
	 */
	EReference getBottleSeperator_ComponentRepository();

	/**
	 * Returns the meta object for class '{@link xPPU.Splitter <em>Splitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Splitter</em>'.
	 * @see xPPU.Splitter
	 * @generated
	 */
	EClass getSplitter();

	/**
	 * Returns the meta object for the reference '{@link xPPU.Splitter#getScrewing <em>Screwing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Screwing</em>'.
	 * @see xPPU.Splitter#getScrewing()
	 * @see #getSplitter()
	 * @generated
	 */
	EReference getSplitter_Screwing();

	/**
	 * Returns the meta object for the reference '{@link xPPU.Splitter#getComponentRepository <em>Component Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Repository</em>'.
	 * @see xPPU.Splitter#getComponentRepository()
	 * @see #getSplitter()
	 * @generated
	 */
	EReference getSplitter_ComponentRepository();

	/**
	 * Returns the meta object for class '{@link xPPU.PowerSplitter <em>Power Splitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Splitter</em>'.
	 * @see xPPU.PowerSplitter
	 * @generated
	 */
	EClass getPowerSplitter();

	/**
	 * Returns the meta object for the reference '{@link xPPU.PowerSplitter#getPowersupply <em>Powersupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Powersupply</em>'.
	 * @see xPPU.PowerSplitter#getPowersupply()
	 * @see #getPowerSplitter()
	 * @generated
	 */
	EReference getPowerSplitter_Powersupply();

	/**
	 * Returns the meta object for class '{@link xPPU.WaterSplitter <em>Water Splitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Water Splitter</em>'.
	 * @see xPPU.WaterSplitter
	 * @generated
	 */
	EClass getWaterSplitter();

	/**
	 * Returns the meta object for the reference '{@link xPPU.WaterSplitter#getWatersupply <em>Watersupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Watersupply</em>'.
	 * @see xPPU.WaterSplitter#getWatersupply()
	 * @see #getWaterSplitter()
	 * @generated
	 */
	EReference getWaterSplitter_Watersupply();

	/**
	 * Returns the meta object for class '{@link xPPU.PneumaticSplitter <em>Pneumatic Splitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pneumatic Splitter</em>'.
	 * @see xPPU.PneumaticSplitter
	 * @generated
	 */
	EClass getPneumaticSplitter();

	/**
	 * Returns the meta object for the reference '{@link xPPU.PneumaticSplitter#getPneumaticsupply <em>Pneumaticsupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pneumaticsupply</em>'.
	 * @see xPPU.PneumaticSplitter#getPneumaticsupply()
	 * @see #getPneumaticSplitter()
	 * @generated
	 */
	EReference getPneumaticSplitter_Pneumaticsupply();

	/**
	 * Returns the meta object for class '{@link xPPU.Panel <em>Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Panel</em>'.
	 * @see xPPU.Panel
	 * @generated
	 */
	EClass getPanel();

	/**
	 * Returns the meta object for the reference '{@link xPPU.Panel#getComponentRepository <em>Component Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Repository</em>'.
	 * @see xPPU.Panel#getComponentRepository()
	 * @see #getPanel()
	 * @generated
	 */
	EReference getPanel_ComponentRepository();

	/**
	 * Returns the meta object for class '{@link xPPU.OperationPanel <em>Operation Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Panel</em>'.
	 * @see xPPU.OperationPanel
	 * @generated
	 */
	EClass getOperationPanel();

	/**
	 * Returns the meta object for the reference '{@link xPPU.OperationPanel#getScrewing_rack <em>Screwing rack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Screwing rack</em>'.
	 * @see xPPU.OperationPanel#getScrewing_rack()
	 * @see #getOperationPanel()
	 * @generated
	 */
	EReference getOperationPanel_Screwing_rack();

	/**
	 * Returns the meta object for the reference list '{@link xPPU.OperationPanel#getLeds <em>Leds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Leds</em>'.
	 * @see xPPU.OperationPanel#getLeds()
	 * @see #getOperationPanel()
	 * @generated
	 */
	EReference getOperationPanel_Leds();

	/**
	 * Returns the meta object for the reference list '{@link xPPU.OperationPanel#getButtons <em>Buttons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Buttons</em>'.
	 * @see xPPU.OperationPanel#getButtons()
	 * @see #getOperationPanel()
	 * @generated
	 */
	EReference getOperationPanel_Buttons();

	/**
	 * Returns the meta object for class '{@link xPPU.Cable <em>Cable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cable</em>'.
	 * @see xPPU.Cable
	 * @generated
	 */
	EClass getCable();

	/**
	 * Returns the meta object for the reference '{@link xPPU.Cable#getComponentRepository <em>Component Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Repository</em>'.
	 * @see xPPU.Cable#getComponentRepository()
	 * @see #getCable()
	 * @generated
	 */
	EReference getCable_ComponentRepository();

	/**
	 * Returns the meta object for class '{@link xPPU.PowerSupply <em>Power Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Supply</em>'.
	 * @see xPPU.PowerSupply
	 * @generated
	 */
	EClass getPowerSupply();

	/**
	 * Returns the meta object for the container reference '{@link xPPU.PowerSupply#getComponentRepository <em>Component Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Component Repository</em>'.
	 * @see xPPU.PowerSupply#getComponentRepository()
	 * @see #getPowerSupply()
	 * @generated
	 */
	EReference getPowerSupply_ComponentRepository();

	/**
	 * Returns the meta object for class '{@link xPPU.Compressor <em>Compressor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compressor</em>'.
	 * @see xPPU.Compressor
	 * @generated
	 */
	EClass getCompressor();

	/**
	 * Returns the meta object for the reference '{@link xPPU.Compressor#getPowersupply <em>Powersupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Powersupply</em>'.
	 * @see xPPU.Compressor#getPowersupply()
	 * @see #getCompressor()
	 * @generated
	 */
	EReference getCompressor_Powersupply();

	/**
	 * Returns the meta object for the reference list '{@link xPPU.Compressor#getPneumaticsupply <em>Pneumaticsupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pneumaticsupply</em>'.
	 * @see xPPU.Compressor#getPneumaticsupply()
	 * @see #getCompressor()
	 * @generated
	 */
	EReference getCompressor_Pneumaticsupply();

	/**
	 * Returns the meta object for the reference list '{@link xPPU.Compressor#getPins <em>Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pins</em>'.
	 * @see xPPU.Compressor#getPins()
	 * @see #getCompressor()
	 * @generated
	 */
	EReference getCompressor_Pins();

	/**
	 * Returns the meta object for the reference '{@link xPPU.Compressor#getScrewing <em>Screwing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Screwing</em>'.
	 * @see xPPU.Compressor#getScrewing()
	 * @see #getCompressor()
	 * @generated
	 */
	EReference getCompressor_Screwing();

	/**
	 * Returns the meta object for the container reference '{@link xPPU.Compressor#getComponentRepository <em>Component Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Component Repository</em>'.
	 * @see xPPU.Compressor#getComponentRepository()
	 * @see #getCompressor()
	 * @generated
	 */
	EReference getCompressor_ComponentRepository();

	/**
	 * Returns the meta object for class '{@link xPPU.ElectronicPart <em>Electronic Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Electronic Part</em>'.
	 * @see xPPU.ElectronicPart
	 * @generated
	 */
	EClass getElectronicPart();

	/**
	 * Returns the meta object for the reference '{@link xPPU.ElectronicPart#getPin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pin</em>'.
	 * @see xPPU.ElectronicPart#getPin()
	 * @see #getElectronicPart()
	 * @generated
	 */
	EReference getElectronicPart_Pin();

	/**
	 * Returns the meta object for the reference '{@link xPPU.ElectronicPart#getPhysicalconnection <em>Physicalconnection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Physicalconnection</em>'.
	 * @see xPPU.ElectronicPart#getPhysicalconnection()
	 * @see #getElectronicPart()
	 * @generated
	 */
	EReference getElectronicPart_Physicalconnection();

	/**
	 * Returns the meta object for the reference '{@link xPPU.ElectronicPart#getComponentRepository <em>Component Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Repository</em>'.
	 * @see xPPU.ElectronicPart#getComponentRepository()
	 * @see #getElectronicPart()
	 * @generated
	 */
	EReference getElectronicPart_ComponentRepository();

	/**
	 * Returns the meta object for class '{@link xPPU.Switch <em>Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch</em>'.
	 * @see xPPU.Switch
	 * @generated
	 */
	EClass getSwitch();

	/**
	 * Returns the meta object for class '{@link xPPU.PowerCable <em>Power Cable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Cable</em>'.
	 * @see xPPU.PowerCable
	 * @generated
	 */
	EClass getPowerCable();

	/**
	 * Returns the meta object for class '{@link xPPU.MonostableCylinder <em>Monostable Cylinder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monostable Cylinder</em>'.
	 * @see xPPU.MonostableCylinder
	 * @generated
	 */
	EClass getMonostableCylinder();

	/**
	 * Returns the meta object for class '{@link xPPU.ProportionalCylinder <em>Proportional Cylinder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proportional Cylinder</em>'.
	 * @see xPPU.ProportionalCylinder
	 * @generated
	 */
	EClass getProportionalCylinder();

	/**
	 * Returns the meta object for class '{@link xPPU.BistableCylinder <em>Bistable Cylinder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bistable Cylinder</em>'.
	 * @see xPPU.BistableCylinder
	 * @generated
	 */
	EClass getBistableCylinder();

	/**
	 * Returns the meta object for class '{@link xPPU.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller</em>'.
	 * @see xPPU.Controller
	 * @generated
	 */
	EClass getController();

	/**
	 * Returns the meta object for the reference '{@link xPPU.Controller#getSignalinterface <em>Signalinterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signalinterface</em>'.
	 * @see xPPU.Controller#getSignalinterface()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_Signalinterface();

	/**
	 * Returns the meta object for the reference '{@link xPPU.Controller#getPowersupply <em>Powersupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Powersupply</em>'.
	 * @see xPPU.Controller#getPowersupply()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_Powersupply();

	/**
	 * Returns the meta object for the reference '{@link xPPU.Controller#getControllerOf <em>Controller Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Controller Of</em>'.
	 * @see xPPU.Controller#getControllerOf()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_ControllerOf();

	/**
	 * Returns the meta object for class '{@link xPPU.LED <em>LED</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LED</em>'.
	 * @see xPPU.LED
	 * @generated
	 */
	EClass getLED();

	/**
	 * Returns the meta object for class '{@link xPPU.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see xPPU.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for class '{@link xPPU.RegularRamp <em>Regular Ramp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regular Ramp</em>'.
	 * @see xPPU.RegularRamp
	 * @generated
	 */
	EClass getRegularRamp();

	/**
	 * Returns the meta object for class '{@link xPPU.Pipe <em>Pipe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pipe</em>'.
	 * @see xPPU.Pipe
	 * @generated
	 */
	EClass getPipe();

	/**
	 * Returns the meta object for the reference '{@link xPPU.Pipe#getPlugs <em>Plugs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Plugs</em>'.
	 * @see xPPU.Pipe#getPlugs()
	 * @see #getPipe()
	 * @generated
	 */
	EReference getPipe_Plugs();

	/**
	 * Returns the meta object for the container reference '{@link xPPU.Pipe#getComponentRepository <em>Component Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Component Repository</em>'.
	 * @see xPPU.Pipe#getComponentRepository()
	 * @see #getPipe()
	 * @generated
	 */
	EReference getPipe_ComponentRepository();

	/**
	 * Returns the meta object for class '{@link xPPU.PneumaticPipe <em>Pneumatic Pipe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pneumatic Pipe</em>'.
	 * @see xPPU.PneumaticPipe
	 * @generated
	 */
	EClass getPneumaticPipe();

	/**
	 * Returns the meta object for class '{@link xPPU.BusMaster <em>Bus Master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus Master</em>'.
	 * @see xPPU.BusMaster
	 * @generated
	 */
	EClass getBusMaster();

	/**
	 * Returns the meta object for the reference list '{@link xPPU.BusMaster#getSignalinterfaces <em>Signalinterfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Signalinterfaces</em>'.
	 * @see xPPU.BusMaster#getSignalinterfaces()
	 * @see #getBusMaster()
	 * @generated
	 */
	EReference getBusMaster_Signalinterfaces();

	/**
	 * Returns the meta object for the reference '{@link xPPU.BusMaster#getSignalinterface_controller <em>Signalinterface controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signalinterface controller</em>'.
	 * @see xPPU.BusMaster#getSignalinterface_controller()
	 * @see #getBusMaster()
	 * @generated
	 */
	EReference getBusMaster_Signalinterface_controller();

	/**
	 * Returns the meta object for the container reference '{@link xPPU.BusMaster#getComponentRepostitory <em>Component Repostitory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Component Repostitory</em>'.
	 * @see xPPU.BusMaster#getComponentRepostitory()
	 * @see #getBusMaster()
	 * @generated
	 */
	EReference getBusMaster_ComponentRepostitory();

	/**
	 * Returns the meta object for class '{@link xPPU.BusSlave <em>Bus Slave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus Slave</em>'.
	 * @see xPPU.BusSlave
	 * @generated
	 */
	EClass getBusSlave();

	/**
	 * Returns the meta object for the reference '{@link xPPU.BusSlave#getSignalinterface_master <em>Signalinterface master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signalinterface master</em>'.
	 * @see xPPU.BusSlave#getSignalinterface_master()
	 * @see #getBusSlave()
	 * @generated
	 */
	EReference getBusSlave_Signalinterface_master();

	/**
	 * Returns the meta object for the reference '{@link xPPU.BusSlave#getSignalinterface_slave <em>Signalinterface slave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signalinterface slave</em>'.
	 * @see xPPU.BusSlave#getSignalinterface_slave()
	 * @see #getBusSlave()
	 * @generated
	 */
	EReference getBusSlave_Signalinterface_slave();

	/**
	 * Returns the meta object for the container reference '{@link xPPU.BusSlave#getComponentRepository <em>Component Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Component Repository</em>'.
	 * @see xPPU.BusSlave#getComponentRepository()
	 * @see #getBusSlave()
	 * @generated
	 */
	EReference getBusSlave_ComponentRepository();

	/**
	 * Returns the meta object for class '{@link xPPU.BusCable <em>Bus Cable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus Cable</em>'.
	 * @see xPPU.BusCable
	 * @generated
	 */
	EClass getBusCable();

	/**
	 * Returns the meta object for the reference '{@link xPPU.BusCable#getSignalPlug1 <em>Signal Plug1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signal Plug1</em>'.
	 * @see xPPU.BusCable#getSignalPlug1()
	 * @see #getBusCable()
	 * @generated
	 */
	EReference getBusCable_SignalPlug1();

	/**
	 * Returns the meta object for the reference '{@link xPPU.BusCable#getSignalPlug2 <em>Signal Plug2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signal Plug2</em>'.
	 * @see xPPU.BusCable#getSignalPlug2()
	 * @see #getBusCable()
	 * @generated
	 */
	EReference getBusCable_SignalPlug2();

	/**
	 * Returns the meta object for class '{@link xPPU.BusBox <em>Bus Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus Box</em>'.
	 * @see xPPU.BusBox
	 * @generated
	 */
	EClass getBusBox();

	/**
	 * Returns the meta object for the reference list '{@link xPPU.BusBox#getSignalinterfaces <em>Signalinterfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Signalinterfaces</em>'.
	 * @see xPPU.BusBox#getSignalinterfaces()
	 * @see #getBusBox()
	 * @generated
	 */
	EReference getBusBox_Signalinterfaces();

	/**
	 * Returns the meta object for the reference '{@link xPPU.BusBox#getSignalinterface_master <em>Signalinterface master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signalinterface master</em>'.
	 * @see xPPU.BusBox#getSignalinterface_master()
	 * @see #getBusBox()
	 * @generated
	 */
	EReference getBusBox_Signalinterface_master();

	/**
	 * Returns the meta object for the reference '{@link xPPU.BusBox#getSignalinterface_box <em>Signalinterface box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signalinterface box</em>'.
	 * @see xPPU.BusBox#getSignalinterface_box()
	 * @see #getBusBox()
	 * @generated
	 */
	EReference getBusBox_Signalinterface_box();

	/**
	 * Returns the meta object for the reference '{@link xPPU.BusBox#getPowersupply <em>Powersupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Powersupply</em>'.
	 * @see xPPU.BusBox#getPowersupply()
	 * @see #getBusBox()
	 * @generated
	 */
	EReference getBusBox_Powersupply();

	/**
	 * Returns the meta object for class '{@link xPPU.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see xPPU.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.Interface#getScrewings <em>Screwings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Screwings</em>'.
	 * @see xPPU.Interface#getScrewings()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Screwings();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.Interface#getSuspensions <em>Suspensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Suspensions</em>'.
	 * @see xPPU.Interface#getSuspensions()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Suspensions();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.Interface#getGearings <em>Gearings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gearings</em>'.
	 * @see xPPU.Interface#getGearings()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Gearings();

	/**
	 * Returns the meta object for the reference list '{@link xPPU.Interface#getClamping <em>Clamping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clamping</em>'.
	 * @see xPPU.Interface#getClamping()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Clamping();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.Interface#getPneumaticsupplys <em>Pneumaticsupplys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pneumaticsupplys</em>'.
	 * @see xPPU.Interface#getPneumaticsupplys()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Pneumaticsupplys();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.Interface#getSignalinterfaces <em>Signalinterfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signalinterfaces</em>'.
	 * @see xPPU.Interface#getSignalinterfaces()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Signalinterfaces();

	/**
	 * Returns the meta object for the reference list '{@link xPPU.Interface#getPowersupply <em>Powersupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Powersupply</em>'.
	 * @see xPPU.Interface#getPowersupply()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Powersupply();

	/**
	 * Returns the meta object for the reference list '{@link xPPU.Interface#getWatersupply <em>Watersupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Watersupply</em>'.
	 * @see xPPU.Interface#getWatersupply()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Watersupply();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.Interface#getPhysicalconnections <em>Physicalconnections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Physicalconnections</em>'.
	 * @see xPPU.Interface#getPhysicalconnections()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Physicalconnections();

	/**
	 * Returns the meta object for the reference list '{@link xPPU.Interface#getTransportconnection <em>Transportconnection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transportconnection</em>'.
	 * @see xPPU.Interface#getTransportconnection()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Transportconnection();

	/**
	 * Returns the meta object for the container reference '{@link xPPU.Interface#getComponentRepository <em>Component Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Component Repository</em>'.
	 * @see xPPU.Interface#getComponentRepository()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_ComponentRepository();

	/**
	 * Returns the meta object for class '{@link xPPU.Screwing <em>Screwing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Screwing</em>'.
	 * @see xPPU.Screwing
	 * @generated
	 */
	EClass getScrewing();

	/**
	 * Returns the meta object for the container reference '{@link xPPU.Screwing#getIntefacePart <em>Inteface Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Inteface Part</em>'.
	 * @see xPPU.Screwing#getIntefacePart()
	 * @see #getScrewing()
	 * @generated
	 */
	EReference getScrewing_IntefacePart();

	/**
	 * Returns the meta object for class '{@link xPPU.Suspension <em>Suspension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Suspension</em>'.
	 * @see xPPU.Suspension
	 * @generated
	 */
	EClass getSuspension();

	/**
	 * Returns the meta object for the container reference '{@link xPPU.Suspension#getIntefacePart <em>Inteface Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Inteface Part</em>'.
	 * @see xPPU.Suspension#getIntefacePart()
	 * @see #getSuspension()
	 * @generated
	 */
	EReference getSuspension_IntefacePart();

	/**
	 * Returns the meta object for class '{@link xPPU.Gearing <em>Gearing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gearing</em>'.
	 * @see xPPU.Gearing
	 * @generated
	 */
	EClass getGearing();

	/**
	 * Returns the meta object for the container reference '{@link xPPU.Gearing#getIntefacePart <em>Inteface Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Inteface Part</em>'.
	 * @see xPPU.Gearing#getIntefacePart()
	 * @see #getGearing()
	 * @generated
	 */
	EReference getGearing_IntefacePart();

	/**
	 * Returns the meta object for class '{@link xPPU.Clamping <em>Clamping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clamping</em>'.
	 * @see xPPU.Clamping
	 * @generated
	 */
	EClass getClamping();

	/**
	 * Returns the meta object for the reference '{@link xPPU.Clamping#getIntefacePart <em>Inteface Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inteface Part</em>'.
	 * @see xPPU.Clamping#getIntefacePart()
	 * @see #getClamping()
	 * @generated
	 */
	EReference getClamping_IntefacePart();

	/**
	 * Returns the meta object for class '{@link xPPU.PneumaticSupply <em>Pneumatic Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pneumatic Supply</em>'.
	 * @see xPPU.PneumaticSupply
	 * @generated
	 */
	EClass getPneumaticSupply();

	/**
	 * Returns the meta object for the container reference '{@link xPPU.PneumaticSupply#getIntefacePart <em>Inteface Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Inteface Part</em>'.
	 * @see xPPU.PneumaticSupply#getIntefacePart()
	 * @see #getPneumaticSupply()
	 * @generated
	 */
	EReference getPneumaticSupply_IntefacePart();

	/**
	 * Returns the meta object for class '{@link xPPU.SignalInterface <em>Signal Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Interface</em>'.
	 * @see xPPU.SignalInterface
	 * @generated
	 */
	EClass getSignalInterface();

	/**
	 * Returns the meta object for the container reference '{@link xPPU.SignalInterface#getIntefacePart <em>Inteface Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Inteface Part</em>'.
	 * @see xPPU.SignalInterface#getIntefacePart()
	 * @see #getSignalInterface()
	 * @generated
	 */
	EReference getSignalInterface_IntefacePart();

	/**
	 * Returns the meta object for class '{@link xPPU.WaterSupply <em>Water Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Water Supply</em>'.
	 * @see xPPU.WaterSupply
	 * @generated
	 */
	EClass getWaterSupply();

	/**
	 * Returns the meta object for the reference '{@link xPPU.WaterSupply#getIntefacePart <em>Inteface Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inteface Part</em>'.
	 * @see xPPU.WaterSupply#getIntefacePart()
	 * @see #getWaterSupply()
	 * @generated
	 */
	EReference getWaterSupply_IntefacePart();

	/**
	 * Returns the meta object for class '{@link xPPU.PhysicalConnection <em>Physical Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Connection</em>'.
	 * @see xPPU.PhysicalConnection
	 * @generated
	 */
	EClass getPhysicalConnection();

	/**
	 * Returns the meta object for the container reference '{@link xPPU.PhysicalConnection#getIntefacePart <em>Inteface Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Inteface Part</em>'.
	 * @see xPPU.PhysicalConnection#getIntefacePart()
	 * @see #getPhysicalConnection()
	 * @generated
	 */
	EReference getPhysicalConnection_IntefacePart();

	/**
	 * Returns the meta object for class '{@link xPPU.TransportConnection <em>Transport Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transport Connection</em>'.
	 * @see xPPU.TransportConnection
	 * @generated
	 */
	EClass getTransportConnection();

	/**
	 * Returns the meta object for the reference '{@link xPPU.TransportConnection#getIntefacePart <em>Inteface Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inteface Part</em>'.
	 * @see xPPU.TransportConnection#getIntefacePart()
	 * @see #getTransportConnection()
	 * @generated
	 */
	EReference getTransportConnection_IntefacePart();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XPPUFactory getXPPUFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link xPPU.impl.PlantImpl <em>Plant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.PlantImpl
		 * @see xPPU.impl.XPPUPackageImpl#getPlant()
		 * @generated
		 */
		EClass PLANT = eINSTANCE.getPlant();

		/**
		 * The meta object literal for the '<em><b>Structures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANT__STRUCTURES = eINSTANCE.getPlant_Structures();

		/**
		 * The meta object literal for the '{@link xPPU.impl.StructureImpl <em>Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.StructureImpl
		 * @see xPPU.impl.XPPUPackageImpl#getStructure()
		 * @generated
		 */
		EClass STRUCTURE = eINSTANCE.getStructure();

		/**
		 * The meta object literal for the '<em><b>Parent Plant</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE__PARENT_PLANT = eINSTANCE.getStructure_ParentPlant();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE__MODULES = eINSTANCE.getStructure_Modules();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE__COMPONENTS = eINSTANCE.getStructure_Components();

		/**
		 * The meta object literal for the '<em><b>Cranes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE__CRANES = eINSTANCE.getStructure_Cranes();

		/**
		 * The meta object literal for the '<em><b>Conveyor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE__CONVEYOR = eINSTANCE.getStructure_Conveyor();

		/**
		 * The meta object literal for the '<em><b>Controlcabinets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE__CONTROLCABINETS = eINSTANCE.getStructure_Controlcabinets();

		/**
		 * The meta object literal for the '<em><b>Powernetworks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE__POWERNETWORKS = eINSTANCE.getStructure_Powernetworks();

		/**
		 * The meta object literal for the '<em><b>Communicationnetworks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE__COMMUNICATIONNETWORKS = eINSTANCE.getStructure_Communicationnetworks();

		/**
		 * The meta object literal for the '<em><b>Pneumaticnetworks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE__PNEUMATICNETWORKS = eINSTANCE.getStructure_Pneumaticnetworks();

		/**
		 * The meta object literal for the '<em><b>Powerwiring</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE__POWERWIRING = eINSTANCE.getStructure_Powerwiring();

		/**
		 * The meta object literal for the '{@link xPPU.impl.CommunicationNetworkImpl <em>Communication Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.CommunicationNetworkImpl
		 * @see xPPU.impl.XPPUPackageImpl#getCommunicationNetwork()
		 * @generated
		 */
		EClass COMMUNICATION_NETWORK = eINSTANCE.getCommunicationNetwork();

		/**
		 * The meta object literal for the '<em><b>Parent Structure</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_NETWORK__PARENT_STRUCTURE = eINSTANCE.getCommunicationNetwork_ParentStructure();

		/**
		 * The meta object literal for the '{@link xPPU.impl.PowerNetworkImpl <em>Power Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.PowerNetworkImpl
		 * @see xPPU.impl.XPPUPackageImpl#getPowerNetwork()
		 * @generated
		 */
		EClass POWER_NETWORK = eINSTANCE.getPowerNetwork();

		/**
		 * The meta object literal for the '<em><b>Parent Structure</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_NETWORK__PARENT_STRUCTURE = eINSTANCE.getPowerNetwork_ParentStructure();

		/**
		 * The meta object literal for the '{@link xPPU.impl.ControlCabinetImpl <em>Control Cabinet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.ControlCabinetImpl
		 * @see xPPU.impl.XPPUPackageImpl#getControlCabinet()
		 * @generated
		 */
		EClass CONTROL_CABINET = eINSTANCE.getControlCabinet();

		/**
		 * The meta object literal for the '<em><b>Parent Structure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_CABINET__PARENT_STRUCTURE = eINSTANCE.getControlCabinet_ParentStructure();

		/**
		 * The meta object literal for the '<em><b>Controller</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_CABINET__CONTROLLER = eINSTANCE.getControlCabinet_Controller();

		/**
		 * The meta object literal for the '{@link xPPU.impl.PneumaticNetworkImpl <em>Pneumatic Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.PneumaticNetworkImpl
		 * @see xPPU.impl.XPPUPackageImpl#getPneumaticNetwork()
		 * @generated
		 */
		EClass PNEUMATIC_NETWORK = eINSTANCE.getPneumaticNetwork();

		/**
		 * The meta object literal for the '<em><b>Parent Structure</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PNEUMATIC_NETWORK__PARENT_STRUCTURE = eINSTANCE.getPneumaticNetwork_ParentStructure();

		/**
		 * The meta object literal for the '{@link xPPU.impl.ConveyorImpl <em>Conveyor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.ConveyorImpl
		 * @see xPPU.impl.XPPUPackageImpl#getConveyor()
		 * @generated
		 */
		EClass CONVEYOR = eINSTANCE.getConveyor();

		/**
		 * The meta object literal for the '<em><b>Belts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVEYOR__BELTS = eINSTANCE.getConveyor_Belts();

		/**
		 * The meta object literal for the '<em><b>Parent Structure</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVEYOR__PARENT_STRUCTURE = eINSTANCE.getConveyor_ParentStructure();

		/**
		 * The meta object literal for the '{@link xPPU.impl.CraneImpl <em>Crane</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.CraneImpl
		 * @see xPPU.impl.XPPUPackageImpl#getCrane()
		 * @generated
		 */
		EClass CRANE = eINSTANCE.getCrane();

		/**
		 * The meta object literal for the '<em><b>Arm</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRANE__ARM = eINSTANCE.getCrane_Arm();

		/**
		 * The meta object literal for the '<em><b>Mounted On</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRANE__MOUNTED_ON = eINSTANCE.getCrane_MountedOn();

		/**
		 * The meta object literal for the '<em><b>Vacuumgripper</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRANE__VACUUMGRIPPER = eINSTANCE.getCrane_Vacuumgripper();

		/**
		 * The meta object literal for the '<em><b>Parent Structure</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRANE__PARENT_STRUCTURE = eINSTANCE.getCrane_ParentStructure();

		/**
		 * The meta object literal for the '{@link xPPU.impl.PowerWiringImpl <em>Power Wiring</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.PowerWiringImpl
		 * @see xPPU.impl.XPPUPackageImpl#getPowerWiring()
		 * @generated
		 */
		EClass POWER_WIRING = eINSTANCE.getPowerWiring();

		/**
		 * The meta object literal for the '<em><b>Parent Structure</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_WIRING__PARENT_STRUCTURE = eINSTANCE.getPowerWiring_ParentStructure();

		/**
		 * The meta object literal for the '{@link xPPU.impl.ModulesImpl <em>Modules</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.ModulesImpl
		 * @see xPPU.impl.XPPUPackageImpl#getModules()
		 * @generated
		 */
		EClass MODULES = eINSTANCE.getModules();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULES__MODULES = eINSTANCE.getModules_Modules();

		/**
		 * The meta object literal for the '<em><b>Rampmodules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULES__RAMPMODULES = eINSTANCE.getModules_Rampmodules();

		/**
		 * The meta object literal for the '<em><b>Pushermodules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULES__PUSHERMODULES = eINSTANCE.getModules_Pushermodules();

		/**
		 * The meta object literal for the '<em><b>Motormodules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULES__MOTORMODULES = eINSTANCE.getModules_Motormodules();

		/**
		 * The meta object literal for the '<em><b>Sensormodules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULES__SENSORMODULES = eINSTANCE.getModules_Sensormodules();

		/**
		 * The meta object literal for the '<em><b>Parent Structure</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULES__PARENT_STRUCTURE = eINSTANCE.getModules_ParentStructure();

		/**
		 * The meta object literal for the '{@link xPPU.impl.RampModuleImpl <em>Ramp Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.RampModuleImpl
		 * @see xPPU.impl.XPPUPackageImpl#getRampModule()
		 * @generated
		 */
		EClass RAMP_MODULE = eINSTANCE.getRampModule();

		/**
		 * The meta object literal for the '<em><b>Parent Module Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAMP_MODULE__PARENT_MODULE_CONTAINER = eINSTANCE.getRampModule_ParentModuleContainer();

		/**
		 * The meta object literal for the '{@link xPPU.impl.PusherModuleImpl <em>Pusher Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.PusherModuleImpl
		 * @see xPPU.impl.XPPUPackageImpl#getPusherModule()
		 * @generated
		 */
		EClass PUSHER_MODULE = eINSTANCE.getPusherModule();

		/**
		 * The meta object literal for the '<em><b>Parent Module Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUSHER_MODULE__PARENT_MODULE_CONTAINER = eINSTANCE.getPusherModule_ParentModuleContainer();

		/**
		 * The meta object literal for the '{@link xPPU.impl.MotorModuleImpl <em>Motor Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.MotorModuleImpl
		 * @see xPPU.impl.XPPUPackageImpl#getMotorModule()
		 * @generated
		 */
		EClass MOTOR_MODULE = eINSTANCE.getMotorModule();

		/**
		 * The meta object literal for the '<em><b>Parent Module Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOTOR_MODULE__PARENT_MODULE_CONTAINER = eINSTANCE.getMotorModule_ParentModuleContainer();

		/**
		 * The meta object literal for the '{@link xPPU.impl.SensorModuleImpl <em>Sensor Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.SensorModuleImpl
		 * @see xPPU.impl.XPPUPackageImpl#getSensorModule()
		 * @generated
		 */
		EClass SENSOR_MODULE = eINSTANCE.getSensorModule();

		/**
		 * The meta object literal for the '<em><b>Parent Module Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR_MODULE__PARENT_MODULE_CONTAINER = eINSTANCE.getSensorModule_ParentModuleContainer();

		/**
		 * The meta object literal for the '{@link xPPU.impl.ArmImpl <em>Arm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.ArmImpl
		 * @see xPPU.impl.XPPUPackageImpl#getArm()
		 * @generated
		 */
		EClass ARM = eINSTANCE.getArm();

		/**
		 * The meta object literal for the '<em><b>Mounted To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARM__MOUNTED_TO = eINSTANCE.getArm_MountedTo();

		/**
		 * The meta object literal for the '{@link xPPU.impl.TurningTableImpl <em>Turning Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.TurningTableImpl
		 * @see xPPU.impl.XPPUPackageImpl#getTurningTable()
		 * @generated
		 */
		EClass TURNING_TABLE = eINSTANCE.getTurningTable();

		/**
		 * The meta object literal for the '<em><b>Mounts</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURNING_TABLE__MOUNTS = eINSTANCE.getTurningTable_Mounts();

		/**
		 * The meta object literal for the '{@link xPPU.impl.VacuumGripperImpl <em>Vacuum Gripper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.VacuumGripperImpl
		 * @see xPPU.impl.XPPUPackageImpl#getVacuumGripper()
		 * @generated
		 */
		EClass VACUUM_GRIPPER = eINSTANCE.getVacuumGripper();

		/**
		 * The meta object literal for the '<em><b>Mounted To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VACUUM_GRIPPER__MOUNTED_TO = eINSTANCE.getVacuumGripper_MountedTo();

		/**
		 * The meta object literal for the '{@link xPPU.impl.ConveyorBeltImpl <em>Conveyor Belt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.ConveyorBeltImpl
		 * @see xPPU.impl.XPPUPackageImpl#getConveyorBelt()
		 * @generated
		 */
		EClass CONVEYOR_BELT = eINSTANCE.getConveyorBelt();

		/**
		 * The meta object literal for the '<em><b>Mounted To</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVEYOR_BELT__MOUNTED_TO = eINSTANCE.getConveyorBelt_MountedTo();

		/**
		 * The meta object literal for the '{@link xPPU.impl.PusherImpl <em>Pusher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.PusherImpl
		 * @see xPPU.impl.XPPUPackageImpl#getPusher()
		 * @generated
		 */
		EClass PUSHER = eINSTANCE.getPusher();

		/**
		 * The meta object literal for the '<em><b>Components Repository</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUSHER__COMPONENTS_REPOSITORY = eINSTANCE.getPusher_ComponentsRepository();

		/**
		 * The meta object literal for the '{@link xPPU.impl.ComponentsImpl <em>Components</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.ComponentsImpl
		 * @see xPPU.impl.XPPUPackageImpl#getComponents()
		 * @generated
		 */
		EClass COMPONENTS = eINSTANCE.getComponents();

		/**
		 * The meta object literal for the '<em><b>Parent Structure</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENTS__PARENT_STRUCTURE = eINSTANCE.getComponents_ParentStructure();

		/**
		 * The meta object literal for the '<em><b>Electronic Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENTS__ELECTRONIC_COMPONENTS = eINSTANCE.getComponents_ElectronicComponents();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENTS__INTERFACES = eINSTANCE.getComponents_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Motors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENTS__MOTORS = eINSTANCE.getComponents_Motors();

		/**
		 * The meta object literal for the '<em><b>Mechanical Assemblys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENTS__MECHANICAL_ASSEMBLYS = eINSTANCE.getComponents_MechanicalAssemblys();

		/**
		 * The meta object literal for the '<em><b>Sensors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENTS__SENSORS = eINSTANCE.getComponents_Sensors();

		/**
		 * The meta object literal for the '<em><b>Pipes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENTS__PIPES = eINSTANCE.getComponents_Pipes();

		/**
		 * The meta object literal for the '<em><b>Compressors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENTS__COMPRESSORS = eINSTANCE.getComponents_Compressors();

		/**
		 * The meta object literal for the '<em><b>Buscables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENTS__BUSCABLES = eINSTANCE.getComponents_Buscables();

		/**
		 * The meta object literal for the '<em><b>Busmasters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENTS__BUSMASTERS = eINSTANCE.getComponents_Busmasters();

		/**
		 * The meta object literal for the '<em><b>Busslaves</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENTS__BUSSLAVES = eINSTANCE.getComponents_Busslaves();

		/**
		 * The meta object literal for the '<em><b>Busboxes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENTS__BUSBOXES = eINSTANCE.getComponents_Busboxes();

		/**
		 * The meta object literal for the '<em><b>Cylinders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENTS__CYLINDERS = eINSTANCE.getComponents_Cylinders();

		/**
		 * The meta object literal for the '<em><b>Powercables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENTS__POWERCABLES = eINSTANCE.getComponents_Powercables();

		/**
		 * The meta object literal for the '<em><b>Valves</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENTS__VALVES = eINSTANCE.getComponents_Valves();

		/**
		 * The meta object literal for the '<em><b>Mechanicalparts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENTS__MECHANICALPARTS = eINSTANCE.getComponents_Mechanicalparts();

		/**
		 * The meta object literal for the '<em><b>Powersupplys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENTS__POWERSUPPLYS = eINSTANCE.getComponents_Powersupplys();

		/**
		 * The meta object literal for the '<em><b>Pushers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENTS__PUSHERS = eINSTANCE.getComponents_Pushers();

		/**
		 * The meta object literal for the '<em><b>Corners</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENTS__CORNERS = eINSTANCE.getComponents_Corners();

		/**
		 * The meta object literal for the '<em><b>Dispensers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENTS__DISPENSERS = eINSTANCE.getComponents_Dispensers();

		/**
		 * The meta object literal for the '<em><b>Racks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENTS__RACKS = eINSTANCE.getComponents_Racks();

		/**
		 * The meta object literal for the '<em><b>Tanks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENTS__TANKS = eINSTANCE.getComponents_Tanks();

		/**
		 * The meta object literal for the '<em><b>Splitter</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENTS__SPLITTER = eINSTANCE.getComponents_Splitter();

		/**
		 * The meta object literal for the '<em><b>Bottle Seperator</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENTS__BOTTLE_SEPERATOR = eINSTANCE.getComponents_BottleSeperator();

		/**
		 * The meta object literal for the '<em><b>Panels</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENTS__PANELS = eINSTANCE.getComponents_Panels();

		/**
		 * The meta object literal for the '<em><b>Cables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENTS__CABLES = eINSTANCE.getComponents_Cables();

		/**
		 * The meta object literal for the '{@link xPPU.impl.MotorImpl <em>Motor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.MotorImpl
		 * @see xPPU.impl.XPPUPackageImpl#getMotor()
		 * @generated
		 */
		EClass MOTOR = eINSTANCE.getMotor();

		/**
		 * The meta object literal for the '<em><b>Gearing</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOTOR__GEARING = eINSTANCE.getMotor_Gearing();

		/**
		 * The meta object literal for the '<em><b>Screwing</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOTOR__SCREWING = eINSTANCE.getMotor_Screwing();

		/**
		 * The meta object literal for the '<em><b>Powersupply</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOTOR__POWERSUPPLY = eINSTANCE.getMotor_Powersupply();

		/**
		 * The meta object literal for the '<em><b>Component Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOTOR__COMPONENT_REPOSITORY = eINSTANCE.getMotor_ComponentRepository();

		/**
		 * The meta object literal for the '{@link xPPU.impl.SimpleMotorImpl <em>Simple Motor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.SimpleMotorImpl
		 * @see xPPU.impl.XPPUPackageImpl#getSimpleMotor()
		 * @generated
		 */
		EClass SIMPLE_MOTOR = eINSTANCE.getSimpleMotor();

		/**
		 * The meta object literal for the '{@link xPPU.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.SensorImpl
		 * @see xPPU.impl.XPPUPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Physicalconnection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__PHYSICALCONNECTION = eINSTANCE.getSensor_Physicalconnection();

		/**
		 * The meta object literal for the '<em><b>Signalinterface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__SIGNALINTERFACE = eINSTANCE.getSensor_Signalinterface();

		/**
		 * The meta object literal for the '<em><b>Powersupply</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__POWERSUPPLY = eINSTANCE.getSensor_Powersupply();

		/**
		 * The meta object literal for the '<em><b>Component Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__COMPONENT_REPOSITORY = eINSTANCE.getSensor_ComponentRepository();

		/**
		 * The meta object literal for the '{@link xPPU.impl.RackImpl <em>Rack</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.RackImpl
		 * @see xPPU.impl.XPPUPackageImpl#getRack()
		 * @generated
		 */
		EClass RACK = eINSTANCE.getRack();

		/**
		 * The meta object literal for the '<em><b>Screwing to base</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RACK__SCREWING_TO_BASE = eINSTANCE.getRack_Screwing_to_base();

		/**
		 * The meta object literal for the '<em><b>Component Repository</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RACK__COMPONENT_REPOSITORY = eINSTANCE.getRack_ComponentRepository();

		/**
		 * The meta object literal for the '{@link xPPU.impl.CornerImpl <em>Corner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.CornerImpl
		 * @see xPPU.impl.XPPUPackageImpl#getCorner()
		 * @generated
		 */
		EClass CORNER = eINSTANCE.getCorner();

		/**
		 * The meta object literal for the '<em><b>Component Repository</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORNER__COMPONENT_REPOSITORY = eINSTANCE.getCorner_ComponentRepository();

		/**
		 * The meta object literal for the '{@link xPPU.impl.ValveImpl <em>Valve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.ValveImpl
		 * @see xPPU.impl.XPPUPackageImpl#getValve()
		 * @generated
		 */
		EClass VALVE = eINSTANCE.getValve();

		/**
		 * The meta object literal for the '<em><b>Pneumaticsupply</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALVE__PNEUMATICSUPPLY = eINSTANCE.getValve_Pneumaticsupply();

		/**
		 * The meta object literal for the '<em><b>Powersupply</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALVE__POWERSUPPLY = eINSTANCE.getValve_Powersupply();

		/**
		 * The meta object literal for the '<em><b>Signalinterface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALVE__SIGNALINTERFACE = eINSTANCE.getValve_Signalinterface();

		/**
		 * The meta object literal for the '<em><b>Component Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALVE__COMPONENT_REPOSITORY = eINSTANCE.getValve_ComponentRepository();

		/**
		 * The meta object literal for the '{@link xPPU.impl.TankImpl <em>Tank</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.TankImpl
		 * @see xPPU.impl.XPPUPackageImpl#getTank()
		 * @generated
		 */
		EClass TANK = eINSTANCE.getTank();

		/**
		 * The meta object literal for the '<em><b>Watersupply</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TANK__WATERSUPPLY = eINSTANCE.getTank_Watersupply();

		/**
		 * The meta object literal for the '<em><b>Screwing</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TANK__SCREWING = eINSTANCE.getTank_Screwing();

		/**
		 * The meta object literal for the '<em><b>Component Repository</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TANK__COMPONENT_REPOSITORY = eINSTANCE.getTank_ComponentRepository();

		/**
		 * The meta object literal for the '{@link xPPU.impl.MechanicalPartImpl <em>Mechanical Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.MechanicalPartImpl
		 * @see xPPU.impl.XPPUPackageImpl#getMechanicalPart()
		 * @generated
		 */
		EClass MECHANICAL_PART = eINSTANCE.getMechanicalPart();

		/**
		 * The meta object literal for the '<em><b>Screwing</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MECHANICAL_PART__SCREWING = eINSTANCE.getMechanicalPart_Screwing();

		/**
		 * The meta object literal for the '<em><b>Component Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MECHANICAL_PART__COMPONENT_REPOSITORY = eINSTANCE.getMechanicalPart_ComponentRepository();

		/**
		 * The meta object literal for the '{@link xPPU.impl.PushheadImpl <em>Pushhead</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.PushheadImpl
		 * @see xPPU.impl.XPPUPackageImpl#getPushhead()
		 * @generated
		 */
		EClass PUSHHEAD = eINSTANCE.getPushhead();

		/**
		 * The meta object literal for the '{@link xPPU.impl.MechanicalAssemblyImpl <em>Mechanical Assembly</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.MechanicalAssemblyImpl
		 * @see xPPU.impl.XPPUPackageImpl#getMechanicalAssembly()
		 * @generated
		 */
		EClass MECHANICAL_ASSEMBLY = eINSTANCE.getMechanicalAssembly();

		/**
		 * The meta object literal for the '<em><b>Component Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MECHANICAL_ASSEMBLY__COMPONENT_REPOSITORY = eINSTANCE.getMechanicalAssembly_ComponentRepository();

		/**
		 * The meta object literal for the '{@link xPPU.impl.RampImpl <em>Ramp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.RampImpl
		 * @see xPPU.impl.XPPUPackageImpl#getRamp()
		 * @generated
		 */
		EClass RAMP = eINSTANCE.getRamp();

		/**
		 * The meta object literal for the '<em><b>Screwing base</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAMP__SCREWING_BASE = eINSTANCE.getRamp_Screwing_base();

		/**
		 * The meta object literal for the '<em><b>Screwing component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAMP__SCREWING_COMPONENT = eINSTANCE.getRamp_Screwing_component();

		/**
		 * The meta object literal for the '<em><b>Physicalconnection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAMP__PHYSICALCONNECTION = eINSTANCE.getRamp_Physicalconnection();

		/**
		 * The meta object literal for the '{@link xPPU.impl.CylinderImpl <em>Cylinder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.CylinderImpl
		 * @see xPPU.impl.XPPUPackageImpl#getCylinder()
		 * @generated
		 */
		EClass CYLINDER = eINSTANCE.getCylinder();

		/**
		 * The meta object literal for the '<em><b>Pneumaticsupply</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CYLINDER__PNEUMATICSUPPLY = eINSTANCE.getCylinder_Pneumaticsupply();

		/**
		 * The meta object literal for the '<em><b>Signal Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CYLINDER__SIGNAL_INTERFACE = eINSTANCE.getCylinder_SignalInterface();

		/**
		 * The meta object literal for the '<em><b>Component Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CYLINDER__COMPONENT_REPOSITORY = eINSTANCE.getCylinder_ComponentRepository();

		/**
		 * The meta object literal for the '{@link xPPU.impl.DispenserImpl <em>Dispenser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.DispenserImpl
		 * @see xPPU.impl.XPPUPackageImpl#getDispenser()
		 * @generated
		 */
		EClass DISPENSER = eINSTANCE.getDispenser();

		/**
		 * The meta object literal for the '<em><b>Component Repository</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPENSER__COMPONENT_REPOSITORY = eINSTANCE.getDispenser_ComponentRepository();

		/**
		 * The meta object literal for the '{@link xPPU.impl.BottleSeperatorImpl <em>Bottle Seperator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.BottleSeperatorImpl
		 * @see xPPU.impl.XPPUPackageImpl#getBottleSeperator()
		 * @generated
		 */
		EClass BOTTLE_SEPERATOR = eINSTANCE.getBottleSeperator();

		/**
		 * The meta object literal for the '<em><b>Signalinterface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOTTLE_SEPERATOR__SIGNALINTERFACE = eINSTANCE.getBottleSeperator_Signalinterface();

		/**
		 * The meta object literal for the '<em><b>Pneumaticsupply</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOTTLE_SEPERATOR__PNEUMATICSUPPLY = eINSTANCE.getBottleSeperator_Pneumaticsupply();

		/**
		 * The meta object literal for the '<em><b>Powersupply</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOTTLE_SEPERATOR__POWERSUPPLY = eINSTANCE.getBottleSeperator_Powersupply();

		/**
		 * The meta object literal for the '<em><b>Screwing to rack</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOTTLE_SEPERATOR__SCREWING_TO_RACK = eINSTANCE.getBottleSeperator_Screwing_to_rack();

		/**
		 * The meta object literal for the '<em><b>Component Repository</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOTTLE_SEPERATOR__COMPONENT_REPOSITORY = eINSTANCE.getBottleSeperator_ComponentRepository();

		/**
		 * The meta object literal for the '{@link xPPU.impl.SplitterImpl <em>Splitter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.SplitterImpl
		 * @see xPPU.impl.XPPUPackageImpl#getSplitter()
		 * @generated
		 */
		EClass SPLITTER = eINSTANCE.getSplitter();

		/**
		 * The meta object literal for the '<em><b>Screwing</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPLITTER__SCREWING = eINSTANCE.getSplitter_Screwing();

		/**
		 * The meta object literal for the '<em><b>Component Repository</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPLITTER__COMPONENT_REPOSITORY = eINSTANCE.getSplitter_ComponentRepository();

		/**
		 * The meta object literal for the '{@link xPPU.impl.PowerSplitterImpl <em>Power Splitter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.PowerSplitterImpl
		 * @see xPPU.impl.XPPUPackageImpl#getPowerSplitter()
		 * @generated
		 */
		EClass POWER_SPLITTER = eINSTANCE.getPowerSplitter();

		/**
		 * The meta object literal for the '<em><b>Powersupply</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_SPLITTER__POWERSUPPLY = eINSTANCE.getPowerSplitter_Powersupply();

		/**
		 * The meta object literal for the '{@link xPPU.impl.WaterSplitterImpl <em>Water Splitter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.WaterSplitterImpl
		 * @see xPPU.impl.XPPUPackageImpl#getWaterSplitter()
		 * @generated
		 */
		EClass WATER_SPLITTER = eINSTANCE.getWaterSplitter();

		/**
		 * The meta object literal for the '<em><b>Watersupply</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WATER_SPLITTER__WATERSUPPLY = eINSTANCE.getWaterSplitter_Watersupply();

		/**
		 * The meta object literal for the '{@link xPPU.impl.PneumaticSplitterImpl <em>Pneumatic Splitter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.PneumaticSplitterImpl
		 * @see xPPU.impl.XPPUPackageImpl#getPneumaticSplitter()
		 * @generated
		 */
		EClass PNEUMATIC_SPLITTER = eINSTANCE.getPneumaticSplitter();

		/**
		 * The meta object literal for the '<em><b>Pneumaticsupply</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PNEUMATIC_SPLITTER__PNEUMATICSUPPLY = eINSTANCE.getPneumaticSplitter_Pneumaticsupply();

		/**
		 * The meta object literal for the '{@link xPPU.impl.PanelImpl <em>Panel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.PanelImpl
		 * @see xPPU.impl.XPPUPackageImpl#getPanel()
		 * @generated
		 */
		EClass PANEL = eINSTANCE.getPanel();

		/**
		 * The meta object literal for the '<em><b>Component Repository</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PANEL__COMPONENT_REPOSITORY = eINSTANCE.getPanel_ComponentRepository();

		/**
		 * The meta object literal for the '{@link xPPU.impl.OperationPanelImpl <em>Operation Panel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.OperationPanelImpl
		 * @see xPPU.impl.XPPUPackageImpl#getOperationPanel()
		 * @generated
		 */
		EClass OPERATION_PANEL = eINSTANCE.getOperationPanel();

		/**
		 * The meta object literal for the '<em><b>Screwing rack</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_PANEL__SCREWING_RACK = eINSTANCE.getOperationPanel_Screwing_rack();

		/**
		 * The meta object literal for the '<em><b>Leds</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_PANEL__LEDS = eINSTANCE.getOperationPanel_Leds();

		/**
		 * The meta object literal for the '<em><b>Buttons</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_PANEL__BUTTONS = eINSTANCE.getOperationPanel_Buttons();

		/**
		 * The meta object literal for the '{@link xPPU.impl.CableImpl <em>Cable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.CableImpl
		 * @see xPPU.impl.XPPUPackageImpl#getCable()
		 * @generated
		 */
		EClass CABLE = eINSTANCE.getCable();

		/**
		 * The meta object literal for the '<em><b>Component Repository</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CABLE__COMPONENT_REPOSITORY = eINSTANCE.getCable_ComponentRepository();

		/**
		 * The meta object literal for the '{@link xPPU.impl.PowerSupplyImpl <em>Power Supply</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.PowerSupplyImpl
		 * @see xPPU.impl.XPPUPackageImpl#getPowerSupply()
		 * @generated
		 */
		EClass POWER_SUPPLY = eINSTANCE.getPowerSupply();

		/**
		 * The meta object literal for the '<em><b>Component Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_SUPPLY__COMPONENT_REPOSITORY = eINSTANCE.getPowerSupply_ComponentRepository();

		/**
		 * The meta object literal for the '{@link xPPU.impl.CompressorImpl <em>Compressor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.CompressorImpl
		 * @see xPPU.impl.XPPUPackageImpl#getCompressor()
		 * @generated
		 */
		EClass COMPRESSOR = eINSTANCE.getCompressor();

		/**
		 * The meta object literal for the '<em><b>Powersupply</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPRESSOR__POWERSUPPLY = eINSTANCE.getCompressor_Powersupply();

		/**
		 * The meta object literal for the '<em><b>Pneumaticsupply</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPRESSOR__PNEUMATICSUPPLY = eINSTANCE.getCompressor_Pneumaticsupply();

		/**
		 * The meta object literal for the '<em><b>Pins</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPRESSOR__PINS = eINSTANCE.getCompressor_Pins();

		/**
		 * The meta object literal for the '<em><b>Screwing</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPRESSOR__SCREWING = eINSTANCE.getCompressor_Screwing();

		/**
		 * The meta object literal for the '<em><b>Component Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPRESSOR__COMPONENT_REPOSITORY = eINSTANCE.getCompressor_ComponentRepository();

		/**
		 * The meta object literal for the '{@link xPPU.impl.ElectronicPartImpl <em>Electronic Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.ElectronicPartImpl
		 * @see xPPU.impl.XPPUPackageImpl#getElectronicPart()
		 * @generated
		 */
		EClass ELECTRONIC_PART = eINSTANCE.getElectronicPart();

		/**
		 * The meta object literal for the '<em><b>Pin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELECTRONIC_PART__PIN = eINSTANCE.getElectronicPart_Pin();

		/**
		 * The meta object literal for the '<em><b>Physicalconnection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELECTRONIC_PART__PHYSICALCONNECTION = eINSTANCE.getElectronicPart_Physicalconnection();

		/**
		 * The meta object literal for the '<em><b>Component Repository</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELECTRONIC_PART__COMPONENT_REPOSITORY = eINSTANCE.getElectronicPart_ComponentRepository();

		/**
		 * The meta object literal for the '{@link xPPU.impl.SwitchImpl <em>Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.SwitchImpl
		 * @see xPPU.impl.XPPUPackageImpl#getSwitch()
		 * @generated
		 */
		EClass SWITCH = eINSTANCE.getSwitch();

		/**
		 * The meta object literal for the '{@link xPPU.impl.PowerCableImpl <em>Power Cable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.PowerCableImpl
		 * @see xPPU.impl.XPPUPackageImpl#getPowerCable()
		 * @generated
		 */
		EClass POWER_CABLE = eINSTANCE.getPowerCable();

		/**
		 * The meta object literal for the '{@link xPPU.impl.MonostableCylinderImpl <em>Monostable Cylinder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.MonostableCylinderImpl
		 * @see xPPU.impl.XPPUPackageImpl#getMonostableCylinder()
		 * @generated
		 */
		EClass MONOSTABLE_CYLINDER = eINSTANCE.getMonostableCylinder();

		/**
		 * The meta object literal for the '{@link xPPU.impl.ProportionalCylinderImpl <em>Proportional Cylinder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.ProportionalCylinderImpl
		 * @see xPPU.impl.XPPUPackageImpl#getProportionalCylinder()
		 * @generated
		 */
		EClass PROPORTIONAL_CYLINDER = eINSTANCE.getProportionalCylinder();

		/**
		 * The meta object literal for the '{@link xPPU.impl.BistableCylinderImpl <em>Bistable Cylinder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.BistableCylinderImpl
		 * @see xPPU.impl.XPPUPackageImpl#getBistableCylinder()
		 * @generated
		 */
		EClass BISTABLE_CYLINDER = eINSTANCE.getBistableCylinder();

		/**
		 * The meta object literal for the '{@link xPPU.impl.ControllerImpl <em>Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.ControllerImpl
		 * @see xPPU.impl.XPPUPackageImpl#getController()
		 * @generated
		 */
		EClass CONTROLLER = eINSTANCE.getController();

		/**
		 * The meta object literal for the '<em><b>Signalinterface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__SIGNALINTERFACE = eINSTANCE.getController_Signalinterface();

		/**
		 * The meta object literal for the '<em><b>Powersupply</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__POWERSUPPLY = eINSTANCE.getController_Powersupply();

		/**
		 * The meta object literal for the '<em><b>Controller Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__CONTROLLER_OF = eINSTANCE.getController_ControllerOf();

		/**
		 * The meta object literal for the '{@link xPPU.impl.LEDImpl <em>LED</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.LEDImpl
		 * @see xPPU.impl.XPPUPackageImpl#getLED()
		 * @generated
		 */
		EClass LED = eINSTANCE.getLED();

		/**
		 * The meta object literal for the '{@link xPPU.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.ButtonImpl
		 * @see xPPU.impl.XPPUPackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

		/**
		 * The meta object literal for the '{@link xPPU.impl.RegularRampImpl <em>Regular Ramp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.RegularRampImpl
		 * @see xPPU.impl.XPPUPackageImpl#getRegularRamp()
		 * @generated
		 */
		EClass REGULAR_RAMP = eINSTANCE.getRegularRamp();

		/**
		 * The meta object literal for the '{@link xPPU.impl.PipeImpl <em>Pipe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.PipeImpl
		 * @see xPPU.impl.XPPUPackageImpl#getPipe()
		 * @generated
		 */
		EClass PIPE = eINSTANCE.getPipe();

		/**
		 * The meta object literal for the '<em><b>Plugs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPE__PLUGS = eINSTANCE.getPipe_Plugs();

		/**
		 * The meta object literal for the '<em><b>Component Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPE__COMPONENT_REPOSITORY = eINSTANCE.getPipe_ComponentRepository();

		/**
		 * The meta object literal for the '{@link xPPU.impl.PneumaticPipeImpl <em>Pneumatic Pipe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.PneumaticPipeImpl
		 * @see xPPU.impl.XPPUPackageImpl#getPneumaticPipe()
		 * @generated
		 */
		EClass PNEUMATIC_PIPE = eINSTANCE.getPneumaticPipe();

		/**
		 * The meta object literal for the '{@link xPPU.impl.BusMasterImpl <em>Bus Master</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.BusMasterImpl
		 * @see xPPU.impl.XPPUPackageImpl#getBusMaster()
		 * @generated
		 */
		EClass BUS_MASTER = eINSTANCE.getBusMaster();

		/**
		 * The meta object literal for the '<em><b>Signalinterfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_MASTER__SIGNALINTERFACES = eINSTANCE.getBusMaster_Signalinterfaces();

		/**
		 * The meta object literal for the '<em><b>Signalinterface controller</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_MASTER__SIGNALINTERFACE_CONTROLLER = eINSTANCE.getBusMaster_Signalinterface_controller();

		/**
		 * The meta object literal for the '<em><b>Component Repostitory</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_MASTER__COMPONENT_REPOSTITORY = eINSTANCE.getBusMaster_ComponentRepostitory();

		/**
		 * The meta object literal for the '{@link xPPU.impl.BusSlaveImpl <em>Bus Slave</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.BusSlaveImpl
		 * @see xPPU.impl.XPPUPackageImpl#getBusSlave()
		 * @generated
		 */
		EClass BUS_SLAVE = eINSTANCE.getBusSlave();

		/**
		 * The meta object literal for the '<em><b>Signalinterface master</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_SLAVE__SIGNALINTERFACE_MASTER = eINSTANCE.getBusSlave_Signalinterface_master();

		/**
		 * The meta object literal for the '<em><b>Signalinterface slave</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_SLAVE__SIGNALINTERFACE_SLAVE = eINSTANCE.getBusSlave_Signalinterface_slave();

		/**
		 * The meta object literal for the '<em><b>Component Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_SLAVE__COMPONENT_REPOSITORY = eINSTANCE.getBusSlave_ComponentRepository();

		/**
		 * The meta object literal for the '{@link xPPU.impl.BusCableImpl <em>Bus Cable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.BusCableImpl
		 * @see xPPU.impl.XPPUPackageImpl#getBusCable()
		 * @generated
		 */
		EClass BUS_CABLE = eINSTANCE.getBusCable();

		/**
		 * The meta object literal for the '<em><b>Signal Plug1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_CABLE__SIGNAL_PLUG1 = eINSTANCE.getBusCable_SignalPlug1();

		/**
		 * The meta object literal for the '<em><b>Signal Plug2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_CABLE__SIGNAL_PLUG2 = eINSTANCE.getBusCable_SignalPlug2();

		/**
		 * The meta object literal for the '{@link xPPU.impl.BusBoxImpl <em>Bus Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.BusBoxImpl
		 * @see xPPU.impl.XPPUPackageImpl#getBusBox()
		 * @generated
		 */
		EClass BUS_BOX = eINSTANCE.getBusBox();

		/**
		 * The meta object literal for the '<em><b>Signalinterfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_BOX__SIGNALINTERFACES = eINSTANCE.getBusBox_Signalinterfaces();

		/**
		 * The meta object literal for the '<em><b>Signalinterface master</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_BOX__SIGNALINTERFACE_MASTER = eINSTANCE.getBusBox_Signalinterface_master();

		/**
		 * The meta object literal for the '<em><b>Signalinterface box</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_BOX__SIGNALINTERFACE_BOX = eINSTANCE.getBusBox_Signalinterface_box();

		/**
		 * The meta object literal for the '<em><b>Powersupply</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_BOX__POWERSUPPLY = eINSTANCE.getBusBox_Powersupply();

		/**
		 * The meta object literal for the '{@link xPPU.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.InterfaceImpl
		 * @see xPPU.impl.XPPUPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Screwings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__SCREWINGS = eINSTANCE.getInterface_Screwings();

		/**
		 * The meta object literal for the '<em><b>Suspensions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__SUSPENSIONS = eINSTANCE.getInterface_Suspensions();

		/**
		 * The meta object literal for the '<em><b>Gearings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__GEARINGS = eINSTANCE.getInterface_Gearings();

		/**
		 * The meta object literal for the '<em><b>Clamping</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__CLAMPING = eINSTANCE.getInterface_Clamping();

		/**
		 * The meta object literal for the '<em><b>Pneumaticsupplys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__PNEUMATICSUPPLYS = eINSTANCE.getInterface_Pneumaticsupplys();

		/**
		 * The meta object literal for the '<em><b>Signalinterfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__SIGNALINTERFACES = eINSTANCE.getInterface_Signalinterfaces();

		/**
		 * The meta object literal for the '<em><b>Powersupply</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__POWERSUPPLY = eINSTANCE.getInterface_Powersupply();

		/**
		 * The meta object literal for the '<em><b>Watersupply</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__WATERSUPPLY = eINSTANCE.getInterface_Watersupply();

		/**
		 * The meta object literal for the '<em><b>Physicalconnections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__PHYSICALCONNECTIONS = eINSTANCE.getInterface_Physicalconnections();

		/**
		 * The meta object literal for the '<em><b>Transportconnection</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__TRANSPORTCONNECTION = eINSTANCE.getInterface_Transportconnection();

		/**
		 * The meta object literal for the '<em><b>Component Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__COMPONENT_REPOSITORY = eINSTANCE.getInterface_ComponentRepository();

		/**
		 * The meta object literal for the '{@link xPPU.impl.ScrewingImpl <em>Screwing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.ScrewingImpl
		 * @see xPPU.impl.XPPUPackageImpl#getScrewing()
		 * @generated
		 */
		EClass SCREWING = eINSTANCE.getScrewing();

		/**
		 * The meta object literal for the '<em><b>Inteface Part</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCREWING__INTEFACE_PART = eINSTANCE.getScrewing_IntefacePart();

		/**
		 * The meta object literal for the '{@link xPPU.impl.SuspensionImpl <em>Suspension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.SuspensionImpl
		 * @see xPPU.impl.XPPUPackageImpl#getSuspension()
		 * @generated
		 */
		EClass SUSPENSION = eINSTANCE.getSuspension();

		/**
		 * The meta object literal for the '<em><b>Inteface Part</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUSPENSION__INTEFACE_PART = eINSTANCE.getSuspension_IntefacePart();

		/**
		 * The meta object literal for the '{@link xPPU.impl.GearingImpl <em>Gearing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.GearingImpl
		 * @see xPPU.impl.XPPUPackageImpl#getGearing()
		 * @generated
		 */
		EClass GEARING = eINSTANCE.getGearing();

		/**
		 * The meta object literal for the '<em><b>Inteface Part</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEARING__INTEFACE_PART = eINSTANCE.getGearing_IntefacePart();

		/**
		 * The meta object literal for the '{@link xPPU.impl.ClampingImpl <em>Clamping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.ClampingImpl
		 * @see xPPU.impl.XPPUPackageImpl#getClamping()
		 * @generated
		 */
		EClass CLAMPING = eINSTANCE.getClamping();

		/**
		 * The meta object literal for the '<em><b>Inteface Part</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAMPING__INTEFACE_PART = eINSTANCE.getClamping_IntefacePart();

		/**
		 * The meta object literal for the '{@link xPPU.impl.PneumaticSupplyImpl <em>Pneumatic Supply</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.PneumaticSupplyImpl
		 * @see xPPU.impl.XPPUPackageImpl#getPneumaticSupply()
		 * @generated
		 */
		EClass PNEUMATIC_SUPPLY = eINSTANCE.getPneumaticSupply();

		/**
		 * The meta object literal for the '<em><b>Inteface Part</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PNEUMATIC_SUPPLY__INTEFACE_PART = eINSTANCE.getPneumaticSupply_IntefacePart();

		/**
		 * The meta object literal for the '{@link xPPU.impl.SignalInterfaceImpl <em>Signal Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.SignalInterfaceImpl
		 * @see xPPU.impl.XPPUPackageImpl#getSignalInterface()
		 * @generated
		 */
		EClass SIGNAL_INTERFACE = eINSTANCE.getSignalInterface();

		/**
		 * The meta object literal for the '<em><b>Inteface Part</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_INTERFACE__INTEFACE_PART = eINSTANCE.getSignalInterface_IntefacePart();

		/**
		 * The meta object literal for the '{@link xPPU.impl.WaterSupplyImpl <em>Water Supply</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.WaterSupplyImpl
		 * @see xPPU.impl.XPPUPackageImpl#getWaterSupply()
		 * @generated
		 */
		EClass WATER_SUPPLY = eINSTANCE.getWaterSupply();

		/**
		 * The meta object literal for the '<em><b>Inteface Part</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WATER_SUPPLY__INTEFACE_PART = eINSTANCE.getWaterSupply_IntefacePart();

		/**
		 * The meta object literal for the '{@link xPPU.impl.PhysicalConnectionImpl <em>Physical Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.PhysicalConnectionImpl
		 * @see xPPU.impl.XPPUPackageImpl#getPhysicalConnection()
		 * @generated
		 */
		EClass PHYSICAL_CONNECTION = eINSTANCE.getPhysicalConnection();

		/**
		 * The meta object literal for the '<em><b>Inteface Part</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_CONNECTION__INTEFACE_PART = eINSTANCE.getPhysicalConnection_IntefacePart();

		/**
		 * The meta object literal for the '{@link xPPU.impl.TransportConnectionImpl <em>Transport Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.impl.TransportConnectionImpl
		 * @see xPPU.impl.XPPUPackageImpl#getTransportConnection()
		 * @generated
		 */
		EClass TRANSPORT_CONNECTION = eINSTANCE.getTransportConnection();

		/**
		 * The meta object literal for the '<em><b>Inteface Part</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSPORT_CONNECTION__INTEFACE_PART = eINSTANCE.getTransportConnection_IntefacePart();

	}

} //XPPUPackage
