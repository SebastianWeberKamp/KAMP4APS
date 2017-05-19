/**
 */
package xPPU.ComponentRepository;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import xPPU.ElectronicComponents.ElectronicComponentsPackage;

import xPPU.Identifier.IdentifierPackage;

import xPPU.MechanicalComponents.MechanicalComponentsPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see xPPU.ComponentRepository.ComponentRepositoryFactory
 * @model kind="package"
 * @generated
 */
public interface ComponentRepositoryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ComponentRepository";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "edu.kit.ipd.sdq.kaps.xppu.componentrepository";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ComponentRepository";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentRepositoryPackage eINSTANCE = xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl.init();

	/**
	 * The meta object id for the '{@link xPPU.ComponentRepository.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.ComponentRepository.impl.ComponentImpl
	 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CONNECTED_INTERFACES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.ComponentRepository.impl.PanelImpl <em>Panel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.ComponentRepository.impl.PanelImpl
	 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getPanel()
	 * @generated
	 */
	int PANEL = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Component Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__COMPONENT_REPOSITORY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_OPERATION_COUNT = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.ComponentRepository.impl.OperationPanelImpl <em>Operation Panel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.ComponentRepository.impl.OperationPanelImpl
	 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getOperationPanel()
	 * @generated
	 */
	int OPERATION_PANEL = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PANEL__ID = PANEL__ID;

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
	 * The number of operations of the '<em>Operation Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PANEL_OPERATION_COUNT = PANEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.ComponentRepository.impl.MotorImpl <em>Motor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.ComponentRepository.impl.MotorImpl
	 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getMotor()
	 * @generated
	 */
	int MOTOR = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR__CONNECTED_INTERFACES = COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Gearing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR__GEARING = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Screwing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR__SCREWING = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Powersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR__POWERSUPPLY = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.ComponentRepository.impl.SimpleMotorImpl <em>Simple Motor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.ComponentRepository.impl.SimpleMotorImpl
	 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getSimpleMotor()
	 * @generated
	 */
	int SIMPLE_MOTOR = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MOTOR__ID = MOTOR__ID;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MOTOR__CONNECTED_INTERFACES = MOTOR__CONNECTED_INTERFACES;

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
	 * The number of structural features of the '<em>Simple Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MOTOR_FEATURE_COUNT = MOTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MOTOR_OPERATION_COUNT = MOTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.ComponentRepository.impl.MechanicalAssemblyImpl <em>Mechanical Assembly</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.ComponentRepository.impl.MechanicalAssemblyImpl
	 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getMechanicalAssembly()
	 * @generated
	 */
	int MECHANICAL_ASSEMBLY = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANICAL_ASSEMBLY__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANICAL_ASSEMBLY__CONNECTED_INTERFACES = COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The number of structural features of the '<em>Mechanical Assembly</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANICAL_ASSEMBLY_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mechanical Assembly</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANICAL_ASSEMBLY_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.ComponentRepository.impl.RegularRampImpl <em>Regular Ramp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.ComponentRepository.impl.RegularRampImpl
	 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getRegularRamp()
	 * @generated
	 */
	int REGULAR_RAMP = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_RAMP__ID = MechanicalComponentsPackage.RAMP__ID;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_RAMP__CONNECTED_INTERFACES = MechanicalComponentsPackage.RAMP__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Screwing base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_RAMP__SCREWING_BASE = MechanicalComponentsPackage.RAMP__SCREWING_BASE;

	/**
	 * The feature id for the '<em><b>Screwing component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_RAMP__SCREWING_COMPONENT = MechanicalComponentsPackage.RAMP__SCREWING_COMPONENT;

	/**
	 * The feature id for the '<em><b>Physicalconnection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_RAMP__PHYSICALCONNECTION = MechanicalComponentsPackage.RAMP__PHYSICALCONNECTION;

	/**
	 * The number of structural features of the '<em>Regular Ramp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_RAMP_FEATURE_COUNT = MechanicalComponentsPackage.RAMP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Regular Ramp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_RAMP_OPERATION_COUNT = MechanicalComponentsPackage.RAMP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.ComponentRepository.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.ComponentRepository.impl.SensorImpl
	 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__CONNECTED_INTERFACES = COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Physicalconnection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__PHYSICALCONNECTION = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Signalinterface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__SIGNALINTERFACE = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Powersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__POWERSUPPLY = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.ComponentRepository.impl.OpticalSensorImpl <em>Optical Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.ComponentRepository.impl.OpticalSensorImpl
	 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getOpticalSensor()
	 * @generated
	 */
	int OPTICAL_SENSOR = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICAL_SENSOR__ID = SENSOR__ID;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICAL_SENSOR__CONNECTED_INTERFACES = SENSOR__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Physicalconnection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICAL_SENSOR__PHYSICALCONNECTION = SENSOR__PHYSICALCONNECTION;

	/**
	 * The feature id for the '<em><b>Signalinterface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICAL_SENSOR__SIGNALINTERFACE = SENSOR__SIGNALINTERFACE;

	/**
	 * The feature id for the '<em><b>Powersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICAL_SENSOR__POWERSUPPLY = SENSOR__POWERSUPPLY;

	/**
	 * The number of structural features of the '<em>Optical Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICAL_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Optical Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICAL_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.ComponentRepository.impl.InductiveSensorImpl <em>Inductive Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.ComponentRepository.impl.InductiveSensorImpl
	 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getInductiveSensor()
	 * @generated
	 */
	int INDUCTIVE_SENSOR = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTIVE_SENSOR__ID = SENSOR__ID;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTIVE_SENSOR__CONNECTED_INTERFACES = SENSOR__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Physicalconnection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTIVE_SENSOR__PHYSICALCONNECTION = SENSOR__PHYSICALCONNECTION;

	/**
	 * The feature id for the '<em><b>Signalinterface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTIVE_SENSOR__SIGNALINTERFACE = SENSOR__SIGNALINTERFACE;

	/**
	 * The feature id for the '<em><b>Powersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTIVE_SENSOR__POWERSUPPLY = SENSOR__POWERSUPPLY;

	/**
	 * The number of structural features of the '<em>Inductive Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTIVE_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Inductive Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTIVE_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.ComponentRepository.impl.PresenceSensorImpl <em>Presence Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.ComponentRepository.impl.PresenceSensorImpl
	 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getPresenceSensor()
	 * @generated
	 */
	int PRESENCE_SENSOR = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENCE_SENSOR__ID = SENSOR__ID;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENCE_SENSOR__CONNECTED_INTERFACES = SENSOR__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Physicalconnection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENCE_SENSOR__PHYSICALCONNECTION = SENSOR__PHYSICALCONNECTION;

	/**
	 * The feature id for the '<em><b>Signalinterface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENCE_SENSOR__SIGNALINTERFACE = SENSOR__SIGNALINTERFACE;

	/**
	 * The feature id for the '<em><b>Powersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENCE_SENSOR__POWERSUPPLY = SENSOR__POWERSUPPLY;

	/**
	 * The number of structural features of the '<em>Presence Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENCE_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Presence Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENCE_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.ComponentRepository.impl.PipeImpl <em>Pipe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.ComponentRepository.impl.PipeImpl
	 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getPipe()
	 * @generated
	 */
	int PIPE = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE__CONNECTED_INTERFACES = COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Plugs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE__PLUGS = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pipe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pipe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.ComponentRepository.impl.PneumaticPipeImpl <em>Pneumatic Pipe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.ComponentRepository.impl.PneumaticPipeImpl
	 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getPneumaticPipe()
	 * @generated
	 */
	int PNEUMATIC_PIPE = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_PIPE__ID = PIPE__ID;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_PIPE__CONNECTED_INTERFACES = PIPE__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Plugs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_PIPE__PLUGS = PIPE__PLUGS;

	/**
	 * The number of structural features of the '<em>Pneumatic Pipe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_PIPE_FEATURE_COUNT = PIPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pneumatic Pipe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_PIPE_OPERATION_COUNT = PIPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.ComponentRepository.impl.CompressorImpl <em>Compressor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.ComponentRepository.impl.CompressorImpl
	 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getCompressor()
	 * @generated
	 */
	int COMPRESSOR = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRESSOR__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRESSOR__CONNECTED_INTERFACES = COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Powersupply</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRESSOR__POWERSUPPLY = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pneumaticsupply</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRESSOR__PNEUMATICSUPPLY = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRESSOR__PINS = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Screwing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRESSOR__SCREWING = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Switch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRESSOR__SWITCH = COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Compressor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRESSOR_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Compressor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRESSOR_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.ComponentRepository.impl.CableImpl <em>Cable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.ComponentRepository.impl.CableImpl
	 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getCable()
	 * @generated
	 */
	int CABLE = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE__CONNECTED_INTERFACES = COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The number of structural features of the '<em>Cable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.ComponentRepository.impl.PowerCableImpl <em>Power Cable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.ComponentRepository.impl.PowerCableImpl
	 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getPowerCable()
	 * @generated
	 */
	int POWER_CABLE = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CABLE__ID = CABLE__ID;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CABLE__CONNECTED_INTERFACES = CABLE__CONNECTED_INTERFACES;

	/**
	 * The number of structural features of the '<em>Power Cable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CABLE_FEATURE_COUNT = CABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Power Cable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CABLE_OPERATION_COUNT = CABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.ComponentRepository.impl.CylinderImpl <em>Cylinder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.ComponentRepository.impl.CylinderImpl
	 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getCylinder()
	 * @generated
	 */
	int CYLINDER = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER__CONNECTED_INTERFACES = COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Pneumaticsupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER__PNEUMATICSUPPLY = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Signal Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER__SIGNAL_INTERFACE = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cylinder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Cylinder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.ComponentRepository.impl.ProportionalCylinderImpl <em>Proportional Cylinder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.ComponentRepository.impl.ProportionalCylinderImpl
	 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getProportionalCylinder()
	 * @generated
	 */
	int PROPORTIONAL_CYLINDER = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPORTIONAL_CYLINDER__ID = CYLINDER__ID;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPORTIONAL_CYLINDER__CONNECTED_INTERFACES = CYLINDER__CONNECTED_INTERFACES;

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
	 * The number of structural features of the '<em>Proportional Cylinder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPORTIONAL_CYLINDER_FEATURE_COUNT = CYLINDER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Proportional Cylinder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPORTIONAL_CYLINDER_OPERATION_COUNT = CYLINDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.ComponentRepository.impl.BistableCylinderImpl <em>Bistable Cylinder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.ComponentRepository.impl.BistableCylinderImpl
	 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getBistableCylinder()
	 * @generated
	 */
	int BISTABLE_CYLINDER = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BISTABLE_CYLINDER__ID = CYLINDER__ID;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BISTABLE_CYLINDER__CONNECTED_INTERFACES = CYLINDER__CONNECTED_INTERFACES;

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
	 * The number of structural features of the '<em>Bistable Cylinder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BISTABLE_CYLINDER_FEATURE_COUNT = CYLINDER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bistable Cylinder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BISTABLE_CYLINDER_OPERATION_COUNT = CYLINDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.ComponentRepository.impl.RackImpl <em>Rack</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.ComponentRepository.impl.RackImpl
	 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getRack()
	 * @generated
	 */
	int RACK = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK__CONNECTED_INTERFACES = COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Screwing to base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK__SCREWING_TO_BASE = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.ComponentRepository.impl.CornerImpl <em>Corner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.ComponentRepository.impl.CornerImpl
	 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getCorner()
	 * @generated
	 */
	int CORNER = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORNER__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORNER__CONNECTED_INTERFACES = COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The number of structural features of the '<em>Corner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORNER_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Corner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORNER_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.ComponentRepository.impl.ValveImpl <em>Valve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.ComponentRepository.impl.ValveImpl
	 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getValve()
	 * @generated
	 */
	int VALVE = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALVE__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALVE__CONNECTED_INTERFACES = COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Pneumaticsupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALVE__PNEUMATICSUPPLY = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Powersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALVE__POWERSUPPLY = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Signalinterface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALVE__SIGNALINTERFACE = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Valve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALVE_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Valve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALVE_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.ComponentRepository.impl.RegularValveImpl <em>Regular Valve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.ComponentRepository.impl.RegularValveImpl
	 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getRegularValve()
	 * @generated
	 */
	int REGULAR_VALVE = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_VALVE__ID = VALVE__ID;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_VALVE__CONNECTED_INTERFACES = VALVE__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Pneumaticsupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_VALVE__PNEUMATICSUPPLY = VALVE__PNEUMATICSUPPLY;

	/**
	 * The feature id for the '<em><b>Powersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_VALVE__POWERSUPPLY = VALVE__POWERSUPPLY;

	/**
	 * The feature id for the '<em><b>Signalinterface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_VALVE__SIGNALINTERFACE = VALVE__SIGNALINTERFACE;

	/**
	 * The number of structural features of the '<em>Regular Valve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_VALVE_FEATURE_COUNT = VALVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Regular Valve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_VALVE_OPERATION_COUNT = VALVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.ComponentRepository.impl.TankImpl <em>Tank</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.ComponentRepository.impl.TankImpl
	 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getTank()
	 * @generated
	 */
	int TANK = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANK__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANK__CONNECTED_INTERFACES = COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Watersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANK__WATERSUPPLY = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Screwing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANK__SCREWING = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tank</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANK_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Tank</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANK_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.ComponentRepository.impl.DispenserImpl <em>Dispenser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.ComponentRepository.impl.DispenserImpl
	 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getDispenser()
	 * @generated
	 */
	int DISPENSER = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPENSER__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPENSER__CONNECTED_INTERFACES = COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The number of structural features of the '<em>Dispenser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPENSER_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dispenser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPENSER_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.ComponentRepository.impl.BottleSeperatorImpl <em>Bottle Seperator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.ComponentRepository.impl.BottleSeperatorImpl
	 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getBottleSeperator()
	 * @generated
	 */
	int BOTTLE_SEPERATOR = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTTLE_SEPERATOR__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTTLE_SEPERATOR__CONNECTED_INTERFACES = COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Signalinterface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTTLE_SEPERATOR__SIGNALINTERFACE = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pneumaticsupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTTLE_SEPERATOR__PNEUMATICSUPPLY = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Powersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTTLE_SEPERATOR__POWERSUPPLY = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Screwing to rack</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTTLE_SEPERATOR__SCREWING_TO_RACK = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Bottle Seperator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTTLE_SEPERATOR_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Bottle Seperator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTTLE_SEPERATOR_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.ComponentRepository.impl.SplitterImpl <em>Splitter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.ComponentRepository.impl.SplitterImpl
	 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getSplitter()
	 * @generated
	 */
	int SPLITTER = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLITTER__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLITTER__CONNECTED_INTERFACES = COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Screwing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLITTER__SCREWING = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Splitter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLITTER_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Splitter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLITTER_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.ComponentRepository.impl.PowerSupplyImpl <em>Power Supply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.ComponentRepository.impl.PowerSupplyImpl
	 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getPowerSupply()
	 * @generated
	 */
	int POWER_SUPPLY = 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SUPPLY__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SUPPLY__CONNECTED_INTERFACES = COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The number of structural features of the '<em>Power Supply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SUPPLY_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Power Supply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SUPPLY_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.ComponentRepository.impl.VacuumGripperImpl <em>Vacuum Gripper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.ComponentRepository.impl.VacuumGripperImpl
	 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getVacuumGripper()
	 * @generated
	 */
	int VACUUM_GRIPPER = 28;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACUUM_GRIPPER__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACUUM_GRIPPER__CONNECTED_INTERFACES = COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Mounted To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACUUM_GRIPPER__MOUNTED_TO = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gripper Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACUUM_GRIPPER__GRIPPER_PART = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Valve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACUUM_GRIPPER__VALVE = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Vacuum Switch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACUUM_GRIPPER__VACUUM_SWITCH = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Bus Slave</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACUUM_GRIPPER__BUS_SLAVE = COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Vacuum Gripper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACUUM_GRIPPER_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Vacuum Gripper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACUUM_GRIPPER_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.ComponentRepository.impl.ConveyorBeltImpl <em>Conveyor Belt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.ComponentRepository.impl.ConveyorBeltImpl
	 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getConveyorBelt()
	 * @generated
	 */
	int CONVEYOR_BELT = 29;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT__CONNECTED_INTERFACES = COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Mounted To</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT__MOUNTED_TO = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT__FRAME = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rubber Band</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT__RUBBER_BAND = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Conveyor Belt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Conveyor Belt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.ComponentRepository.impl.FrameImpl <em>Frame</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.ComponentRepository.impl.FrameImpl
	 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getFrame()
	 * @generated
	 */
	int FRAME = 30;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__ID = MECHANICAL_ASSEMBLY__ID;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__CONNECTED_INTERFACES = MECHANICAL_ASSEMBLY__CONNECTED_INTERFACES;

	/**
	 * The number of structural features of the '<em>Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_FEATURE_COUNT = MECHANICAL_ASSEMBLY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_OPERATION_COUNT = MECHANICAL_ASSEMBLY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.ComponentRepository.impl.PusherImpl <em>Pusher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.ComponentRepository.impl.PusherImpl
	 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getPusher()
	 * @generated
	 */
	int PUSHER = 31;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER__CONNECTED_INTERFACES = COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Components Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER__COMPONENTS_REPOSITORY = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fixture Cylinder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER__FIXTURE_CYLINDER = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Monostable Cylinder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER__MONOSTABLE_CYLINDER = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bus Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER__BUS_BOX = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Bus Cable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER__BUS_CABLE = COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Pusher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Pusher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.ComponentRepository.impl.TurningTableImpl <em>Turning Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.ComponentRepository.impl.TurningTableImpl
	 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getTurningTable()
	 * @generated
	 */
	int TURNING_TABLE = 32;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNING_TABLE__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNING_TABLE__CONNECTED_INTERFACES = COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Rack for turningtable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNING_TABLE__RACK_FOR_TURNINGTABLE = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Table to stand on</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNING_TABLE__TABLE_TO_STAND_ON = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Motor to drive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNING_TABLE__MOTOR_TO_DRIVE = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Microswitch Module</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNING_TABLE__MICROSWITCH_MODULE = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Bus Slave</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNING_TABLE__BUS_SLAVE = COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Bus Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNING_TABLE__BUS_BOX = COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Bus Cable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNING_TABLE__BUS_CABLE = COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Potentiometer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNING_TABLE__POTENTIOMETER = COMPONENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNING_TABLE__PARENT = COMPONENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Turning Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNING_TABLE_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Turning Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNING_TABLE_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.ComponentRepository.impl.ControllerImpl <em>Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.ComponentRepository.impl.ControllerImpl
	 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getController()
	 * @generated
	 */
	int CONTROLLER = 33;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__CONNECTED_INTERFACES = COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Powersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__POWERSUPPLY = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Controller Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__CONTROLLER_OF = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.ComponentRepository.impl.LogicalWiringImpl <em>Logical Wiring</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.ComponentRepository.impl.LogicalWiringImpl
	 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getLogicalWiring()
	 * @generated
	 */
	int LOGICAL_WIRING = 34;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_WIRING__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_WIRING__CONNECTED_INTERFACES = COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Bus Cable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_WIRING__BUS_CABLE = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Logical Wiring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_WIRING_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Logical Wiring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_WIRING_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.ComponentRepository.impl.MicroswitchModuleImpl <em>Microswitch Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.ComponentRepository.impl.MicroswitchModuleImpl
	 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getMicroswitchModule()
	 * @generated
	 */
	int MICROSWITCH_MODULE = 35;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSWITCH_MODULE__ID = ElectronicComponentsPackage.SWITCH__ID;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSWITCH_MODULE__CONNECTED_INTERFACES = ElectronicComponentsPackage.SWITCH__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSWITCH_MODULE__PIN = ElectronicComponentsPackage.SWITCH__PIN;

	/**
	 * The feature id for the '<em><b>Physicalconnection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSWITCH_MODULE__PHYSICALCONNECTION = ElectronicComponentsPackage.SWITCH__PHYSICALCONNECTION;

	/**
	 * The feature id for the '<em><b>Bus Slave</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSWITCH_MODULE__BUS_SLAVE = ElectronicComponentsPackage.SWITCH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Microswitch Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSWITCH_MODULE_FEATURE_COUNT = ElectronicComponentsPackage.SWITCH_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Microswitch Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSWITCH_MODULE_OPERATION_COUNT = ElectronicComponentsPackage.SWITCH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.ComponentRepository.impl.PotentiometerImpl <em>Potentiometer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.ComponentRepository.impl.PotentiometerImpl
	 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getPotentiometer()
	 * @generated
	 */
	int POTENTIOMETER = 36;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIOMETER__ID = ElectronicComponentsPackage.ELECTRONIC_PART__ID;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIOMETER__CONNECTED_INTERFACES = ElectronicComponentsPackage.ELECTRONIC_PART__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIOMETER__PIN = ElectronicComponentsPackage.ELECTRONIC_PART__PIN;

	/**
	 * The feature id for the '<em><b>Physicalconnection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIOMETER__PHYSICALCONNECTION = ElectronicComponentsPackage.ELECTRONIC_PART__PHYSICALCONNECTION;

	/**
	 * The number of structural features of the '<em>Potentiometer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIOMETER_FEATURE_COUNT = ElectronicComponentsPackage.ELECTRONIC_PART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Potentiometer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIOMETER_OPERATION_COUNT = ElectronicComponentsPackage.ELECTRONIC_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.ComponentRepository.impl.VacuumSwitchImpl <em>Vacuum Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.ComponentRepository.impl.VacuumSwitchImpl
	 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getVacuumSwitch()
	 * @generated
	 */
	int VACUUM_SWITCH = 37;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACUUM_SWITCH__ID = ElectronicComponentsPackage.SWITCH__ID;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACUUM_SWITCH__CONNECTED_INTERFACES = ElectronicComponentsPackage.SWITCH__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACUUM_SWITCH__PIN = ElectronicComponentsPackage.SWITCH__PIN;

	/**
	 * The feature id for the '<em><b>Physicalconnection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACUUM_SWITCH__PHYSICALCONNECTION = ElectronicComponentsPackage.SWITCH__PHYSICALCONNECTION;

	/**
	 * The number of structural features of the '<em>Vacuum Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACUUM_SWITCH_FEATURE_COUNT = ElectronicComponentsPackage.SWITCH_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Vacuum Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACUUM_SWITCH_OPERATION_COUNT = ElectronicComponentsPackage.SWITCH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.ComponentRepository.impl.ReedSwitchImpl <em>Reed Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.ComponentRepository.impl.ReedSwitchImpl
	 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getReedSwitch()
	 * @generated
	 */
	int REED_SWITCH = 38;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REED_SWITCH__ID = ElectronicComponentsPackage.SWITCH__ID;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REED_SWITCH__CONNECTED_INTERFACES = ElectronicComponentsPackage.SWITCH__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REED_SWITCH__PIN = ElectronicComponentsPackage.SWITCH__PIN;

	/**
	 * The feature id for the '<em><b>Physicalconnection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REED_SWITCH__PHYSICALCONNECTION = ElectronicComponentsPackage.SWITCH__PHYSICALCONNECTION;

	/**
	 * The number of structural features of the '<em>Reed Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REED_SWITCH_FEATURE_COUNT = ElectronicComponentsPackage.SWITCH_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Reed Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REED_SWITCH_OPERATION_COUNT = ElectronicComponentsPackage.SWITCH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.ComponentRepository.impl.PowerSplitterImpl <em>Power Splitter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.ComponentRepository.impl.PowerSplitterImpl
	 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getPowerSplitter()
	 * @generated
	 */
	int POWER_SPLITTER = 39;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SPLITTER__ID = SPLITTER__ID;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SPLITTER__CONNECTED_INTERFACES = SPLITTER__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Screwing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SPLITTER__SCREWING = SPLITTER__SCREWING;

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
	 * The number of operations of the '<em>Power Splitter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SPLITTER_OPERATION_COUNT = SPLITTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.ComponentRepository.impl.WaterSplitterImpl <em>Water Splitter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.ComponentRepository.impl.WaterSplitterImpl
	 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getWaterSplitter()
	 * @generated
	 */
	int WATER_SPLITTER = 40;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SPLITTER__ID = SPLITTER__ID;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SPLITTER__CONNECTED_INTERFACES = SPLITTER__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Screwing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SPLITTER__SCREWING = SPLITTER__SCREWING;

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
	 * The number of operations of the '<em>Water Splitter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SPLITTER_OPERATION_COUNT = SPLITTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.ComponentRepository.impl.PneumaticSplitterImpl <em>Pneumatic Splitter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.ComponentRepository.impl.PneumaticSplitterImpl
	 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getPneumaticSplitter()
	 * @generated
	 */
	int PNEUMATIC_SPLITTER = 41;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_SPLITTER__ID = SPLITTER__ID;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_SPLITTER__CONNECTED_INTERFACES = SPLITTER__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Screwing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_SPLITTER__SCREWING = SPLITTER__SCREWING;

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
	 * The number of operations of the '<em>Pneumatic Splitter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_SPLITTER_OPERATION_COUNT = SPLITTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.ComponentRepository.impl.CylinderPartImpl <em>Cylinder Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.ComponentRepository.impl.CylinderPartImpl
	 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getCylinderPart()
	 * @generated
	 */
	int CYLINDER_PART = 42;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER_PART__ID = MechanicalComponentsPackage.MECHANICAL_PART__ID;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER_PART__CONNECTED_INTERFACES = MechanicalComponentsPackage.MECHANICAL_PART__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Screwing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER_PART__SCREWING = MechanicalComponentsPackage.MECHANICAL_PART__SCREWING;

	/**
	 * The number of structural features of the '<em>Cylinder Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER_PART_FEATURE_COUNT = MechanicalComponentsPackage.MECHANICAL_PART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cylinder Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER_PART_OPERATION_COUNT = MechanicalComponentsPackage.MECHANICAL_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.ComponentRepository.impl.MonostableCylinderImpl <em>Monostable Cylinder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.ComponentRepository.impl.MonostableCylinderImpl
	 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getMonostableCylinder()
	 * @generated
	 */
	int MONOSTABLE_CYLINDER = 43;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER__ID = CYLINDER__ID;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER__CONNECTED_INTERFACES = CYLINDER__CONNECTED_INTERFACES;

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
	 * The feature id for the '<em><b>Housing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER__HOUSING = CYLINDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Spring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER__SPRING = CYLINDER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reed Switches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER__REED_SWITCHES = CYLINDER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cylinder Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER__CYLINDER_PART = CYLINDER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Valve</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER__VALVE = CYLINDER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Bus Slave</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER__BUS_SLAVE = CYLINDER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Monostable Cylinder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER_FEATURE_COUNT = CYLINDER_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Monostable Cylinder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER_OPERATION_COUNT = CYLINDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.ComponentRepository.impl.ComponentRepositoryImpl <em>Component Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.ComponentRepository.impl.ComponentRepositoryImpl
	 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getComponentRepository()
	 * @generated
	 */
	int COMPONENT_REPOSITORY = 44;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REPOSITORY__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>All Components In Plant</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REPOSITORY__ALL_COMPONENTS_IN_PLANT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REPOSITORY_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Component Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REPOSITORY_OPERATION_COUNT = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link xPPU.ComponentRepository.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see xPPU.ComponentRepository.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the reference list '{@link xPPU.ComponentRepository.Component#getConnectedInterfaces <em>Connected Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected Interfaces</em>'.
	 * @see xPPU.ComponentRepository.Component#getConnectedInterfaces()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_ConnectedInterfaces();

	/**
	 * Returns the meta object for class '{@link xPPU.ComponentRepository.Panel <em>Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Panel</em>'.
	 * @see xPPU.ComponentRepository.Panel
	 * @generated
	 */
	EClass getPanel();

	/**
	 * Returns the meta object for the reference '{@link xPPU.ComponentRepository.Panel#getComponentRepository <em>Component Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Repository</em>'.
	 * @see xPPU.ComponentRepository.Panel#getComponentRepository()
	 * @see #getPanel()
	 * @generated
	 */
	EReference getPanel_ComponentRepository();

	/**
	 * Returns the meta object for class '{@link xPPU.ComponentRepository.OperationPanel <em>Operation Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Panel</em>'.
	 * @see xPPU.ComponentRepository.OperationPanel
	 * @generated
	 */
	EClass getOperationPanel();

	/**
	 * Returns the meta object for the reference '{@link xPPU.ComponentRepository.OperationPanel#getScrewing_rack <em>Screwing rack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Screwing rack</em>'.
	 * @see xPPU.ComponentRepository.OperationPanel#getScrewing_rack()
	 * @see #getOperationPanel()
	 * @generated
	 */
	EReference getOperationPanel_Screwing_rack();

	/**
	 * Returns the meta object for the reference list '{@link xPPU.ComponentRepository.OperationPanel#getLeds <em>Leds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Leds</em>'.
	 * @see xPPU.ComponentRepository.OperationPanel#getLeds()
	 * @see #getOperationPanel()
	 * @generated
	 */
	EReference getOperationPanel_Leds();

	/**
	 * Returns the meta object for the reference list '{@link xPPU.ComponentRepository.OperationPanel#getButtons <em>Buttons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Buttons</em>'.
	 * @see xPPU.ComponentRepository.OperationPanel#getButtons()
	 * @see #getOperationPanel()
	 * @generated
	 */
	EReference getOperationPanel_Buttons();

	/**
	 * Returns the meta object for class '{@link xPPU.ComponentRepository.Motor <em>Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Motor</em>'.
	 * @see xPPU.ComponentRepository.Motor
	 * @generated
	 */
	EClass getMotor();

	/**
	 * Returns the meta object for the reference '{@link xPPU.ComponentRepository.Motor#getGearing <em>Gearing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gearing</em>'.
	 * @see xPPU.ComponentRepository.Motor#getGearing()
	 * @see #getMotor()
	 * @generated
	 */
	EReference getMotor_Gearing();

	/**
	 * Returns the meta object for the reference '{@link xPPU.ComponentRepository.Motor#getScrewing <em>Screwing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Screwing</em>'.
	 * @see xPPU.ComponentRepository.Motor#getScrewing()
	 * @see #getMotor()
	 * @generated
	 */
	EReference getMotor_Screwing();

	/**
	 * Returns the meta object for the reference '{@link xPPU.ComponentRepository.Motor#getPowersupply <em>Powersupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Powersupply</em>'.
	 * @see xPPU.ComponentRepository.Motor#getPowersupply()
	 * @see #getMotor()
	 * @generated
	 */
	EReference getMotor_Powersupply();

	/**
	 * Returns the meta object for class '{@link xPPU.ComponentRepository.SimpleMotor <em>Simple Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Motor</em>'.
	 * @see xPPU.ComponentRepository.SimpleMotor
	 * @generated
	 */
	EClass getSimpleMotor();

	/**
	 * Returns the meta object for class '{@link xPPU.ComponentRepository.MechanicalAssembly <em>Mechanical Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mechanical Assembly</em>'.
	 * @see xPPU.ComponentRepository.MechanicalAssembly
	 * @generated
	 */
	EClass getMechanicalAssembly();

	/**
	 * Returns the meta object for class '{@link xPPU.ComponentRepository.RegularRamp <em>Regular Ramp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regular Ramp</em>'.
	 * @see xPPU.ComponentRepository.RegularRamp
	 * @generated
	 */
	EClass getRegularRamp();

	/**
	 * Returns the meta object for class '{@link xPPU.ComponentRepository.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see xPPU.ComponentRepository.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the reference '{@link xPPU.ComponentRepository.Sensor#getPhysicalconnection <em>Physicalconnection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Physicalconnection</em>'.
	 * @see xPPU.ComponentRepository.Sensor#getPhysicalconnection()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_Physicalconnection();

	/**
	 * Returns the meta object for the reference '{@link xPPU.ComponentRepository.Sensor#getSignalinterface <em>Signalinterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signalinterface</em>'.
	 * @see xPPU.ComponentRepository.Sensor#getSignalinterface()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_Signalinterface();

	/**
	 * Returns the meta object for the reference '{@link xPPU.ComponentRepository.Sensor#getPowersupply <em>Powersupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Powersupply</em>'.
	 * @see xPPU.ComponentRepository.Sensor#getPowersupply()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_Powersupply();

	/**
	 * Returns the meta object for class '{@link xPPU.ComponentRepository.OpticalSensor <em>Optical Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Optical Sensor</em>'.
	 * @see xPPU.ComponentRepository.OpticalSensor
	 * @generated
	 */
	EClass getOpticalSensor();

	/**
	 * Returns the meta object for class '{@link xPPU.ComponentRepository.InductiveSensor <em>Inductive Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inductive Sensor</em>'.
	 * @see xPPU.ComponentRepository.InductiveSensor
	 * @generated
	 */
	EClass getInductiveSensor();

	/**
	 * Returns the meta object for class '{@link xPPU.ComponentRepository.PresenceSensor <em>Presence Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Presence Sensor</em>'.
	 * @see xPPU.ComponentRepository.PresenceSensor
	 * @generated
	 */
	EClass getPresenceSensor();

	/**
	 * Returns the meta object for class '{@link xPPU.ComponentRepository.Pipe <em>Pipe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pipe</em>'.
	 * @see xPPU.ComponentRepository.Pipe
	 * @generated
	 */
	EClass getPipe();

	/**
	 * Returns the meta object for the reference '{@link xPPU.ComponentRepository.Pipe#getPlugs <em>Plugs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Plugs</em>'.
	 * @see xPPU.ComponentRepository.Pipe#getPlugs()
	 * @see #getPipe()
	 * @generated
	 */
	EReference getPipe_Plugs();

	/**
	 * Returns the meta object for class '{@link xPPU.ComponentRepository.PneumaticPipe <em>Pneumatic Pipe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pneumatic Pipe</em>'.
	 * @see xPPU.ComponentRepository.PneumaticPipe
	 * @generated
	 */
	EClass getPneumaticPipe();

	/**
	 * Returns the meta object for class '{@link xPPU.ComponentRepository.Compressor <em>Compressor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compressor</em>'.
	 * @see xPPU.ComponentRepository.Compressor
	 * @generated
	 */
	EClass getCompressor();

	/**
	 * Returns the meta object for the containment reference '{@link xPPU.ComponentRepository.Compressor#getPowersupply <em>Powersupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Powersupply</em>'.
	 * @see xPPU.ComponentRepository.Compressor#getPowersupply()
	 * @see #getCompressor()
	 * @generated
	 */
	EReference getCompressor_Powersupply();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.ComponentRepository.Compressor#getPneumaticsupply <em>Pneumaticsupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pneumaticsupply</em>'.
	 * @see xPPU.ComponentRepository.Compressor#getPneumaticsupply()
	 * @see #getCompressor()
	 * @generated
	 */
	EReference getCompressor_Pneumaticsupply();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.ComponentRepository.Compressor#getPins <em>Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pins</em>'.
	 * @see xPPU.ComponentRepository.Compressor#getPins()
	 * @see #getCompressor()
	 * @generated
	 */
	EReference getCompressor_Pins();

	/**
	 * Returns the meta object for the containment reference '{@link xPPU.ComponentRepository.Compressor#getScrewing <em>Screwing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Screwing</em>'.
	 * @see xPPU.ComponentRepository.Compressor#getScrewing()
	 * @see #getCompressor()
	 * @generated
	 */
	EReference getCompressor_Screwing();

	/**
	 * Returns the meta object for the containment reference '{@link xPPU.ComponentRepository.Compressor#getSwitch <em>Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Switch</em>'.
	 * @see xPPU.ComponentRepository.Compressor#getSwitch()
	 * @see #getCompressor()
	 * @generated
	 */
	EReference getCompressor_Switch();

	/**
	 * Returns the meta object for class '{@link xPPU.ComponentRepository.Cable <em>Cable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cable</em>'.
	 * @see xPPU.ComponentRepository.Cable
	 * @generated
	 */
	EClass getCable();

	/**
	 * Returns the meta object for class '{@link xPPU.ComponentRepository.PowerCable <em>Power Cable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Cable</em>'.
	 * @see xPPU.ComponentRepository.PowerCable
	 * @generated
	 */
	EClass getPowerCable();

	/**
	 * Returns the meta object for class '{@link xPPU.ComponentRepository.Cylinder <em>Cylinder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cylinder</em>'.
	 * @see xPPU.ComponentRepository.Cylinder
	 * @generated
	 */
	EClass getCylinder();

	/**
	 * Returns the meta object for the reference '{@link xPPU.ComponentRepository.Cylinder#getPneumaticsupply <em>Pneumaticsupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pneumaticsupply</em>'.
	 * @see xPPU.ComponentRepository.Cylinder#getPneumaticsupply()
	 * @see #getCylinder()
	 * @generated
	 */
	EReference getCylinder_Pneumaticsupply();

	/**
	 * Returns the meta object for the reference '{@link xPPU.ComponentRepository.Cylinder#getSignalInterface <em>Signal Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signal Interface</em>'.
	 * @see xPPU.ComponentRepository.Cylinder#getSignalInterface()
	 * @see #getCylinder()
	 * @generated
	 */
	EReference getCylinder_SignalInterface();

	/**
	 * Returns the meta object for class '{@link xPPU.ComponentRepository.ProportionalCylinder <em>Proportional Cylinder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proportional Cylinder</em>'.
	 * @see xPPU.ComponentRepository.ProportionalCylinder
	 * @generated
	 */
	EClass getProportionalCylinder();

	/**
	 * Returns the meta object for class '{@link xPPU.ComponentRepository.BistableCylinder <em>Bistable Cylinder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bistable Cylinder</em>'.
	 * @see xPPU.ComponentRepository.BistableCylinder
	 * @generated
	 */
	EClass getBistableCylinder();

	/**
	 * Returns the meta object for class '{@link xPPU.ComponentRepository.Rack <em>Rack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rack</em>'.
	 * @see xPPU.ComponentRepository.Rack
	 * @generated
	 */
	EClass getRack();

	/**
	 * Returns the meta object for the reference '{@link xPPU.ComponentRepository.Rack#getScrewing_to_base <em>Screwing to base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Screwing to base</em>'.
	 * @see xPPU.ComponentRepository.Rack#getScrewing_to_base()
	 * @see #getRack()
	 * @generated
	 */
	EReference getRack_Screwing_to_base();

	/**
	 * Returns the meta object for class '{@link xPPU.ComponentRepository.Corner <em>Corner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Corner</em>'.
	 * @see xPPU.ComponentRepository.Corner
	 * @generated
	 */
	EClass getCorner();

	/**
	 * Returns the meta object for class '{@link xPPU.ComponentRepository.Valve <em>Valve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valve</em>'.
	 * @see xPPU.ComponentRepository.Valve
	 * @generated
	 */
	EClass getValve();

	/**
	 * Returns the meta object for the reference '{@link xPPU.ComponentRepository.Valve#getPneumaticsupply <em>Pneumaticsupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pneumaticsupply</em>'.
	 * @see xPPU.ComponentRepository.Valve#getPneumaticsupply()
	 * @see #getValve()
	 * @generated
	 */
	EReference getValve_Pneumaticsupply();

	/**
	 * Returns the meta object for the reference '{@link xPPU.ComponentRepository.Valve#getPowersupply <em>Powersupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Powersupply</em>'.
	 * @see xPPU.ComponentRepository.Valve#getPowersupply()
	 * @see #getValve()
	 * @generated
	 */
	EReference getValve_Powersupply();

	/**
	 * Returns the meta object for the reference '{@link xPPU.ComponentRepository.Valve#getSignalinterface <em>Signalinterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signalinterface</em>'.
	 * @see xPPU.ComponentRepository.Valve#getSignalinterface()
	 * @see #getValve()
	 * @generated
	 */
	EReference getValve_Signalinterface();

	/**
	 * Returns the meta object for class '{@link xPPU.ComponentRepository.RegularValve <em>Regular Valve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regular Valve</em>'.
	 * @see xPPU.ComponentRepository.RegularValve
	 * @generated
	 */
	EClass getRegularValve();

	/**
	 * Returns the meta object for class '{@link xPPU.ComponentRepository.Tank <em>Tank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tank</em>'.
	 * @see xPPU.ComponentRepository.Tank
	 * @generated
	 */
	EClass getTank();

	/**
	 * Returns the meta object for the reference '{@link xPPU.ComponentRepository.Tank#getWatersupply <em>Watersupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Watersupply</em>'.
	 * @see xPPU.ComponentRepository.Tank#getWatersupply()
	 * @see #getTank()
	 * @generated
	 */
	EReference getTank_Watersupply();

	/**
	 * Returns the meta object for the reference '{@link xPPU.ComponentRepository.Tank#getScrewing <em>Screwing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Screwing</em>'.
	 * @see xPPU.ComponentRepository.Tank#getScrewing()
	 * @see #getTank()
	 * @generated
	 */
	EReference getTank_Screwing();

	/**
	 * Returns the meta object for class '{@link xPPU.ComponentRepository.Dispenser <em>Dispenser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dispenser</em>'.
	 * @see xPPU.ComponentRepository.Dispenser
	 * @generated
	 */
	EClass getDispenser();

	/**
	 * Returns the meta object for class '{@link xPPU.ComponentRepository.BottleSeperator <em>Bottle Seperator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bottle Seperator</em>'.
	 * @see xPPU.ComponentRepository.BottleSeperator
	 * @generated
	 */
	EClass getBottleSeperator();

	/**
	 * Returns the meta object for the reference '{@link xPPU.ComponentRepository.BottleSeperator#getSignalinterface <em>Signalinterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signalinterface</em>'.
	 * @see xPPU.ComponentRepository.BottleSeperator#getSignalinterface()
	 * @see #getBottleSeperator()
	 * @generated
	 */
	EReference getBottleSeperator_Signalinterface();

	/**
	 * Returns the meta object for the reference '{@link xPPU.ComponentRepository.BottleSeperator#getPneumaticsupply <em>Pneumaticsupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pneumaticsupply</em>'.
	 * @see xPPU.ComponentRepository.BottleSeperator#getPneumaticsupply()
	 * @see #getBottleSeperator()
	 * @generated
	 */
	EReference getBottleSeperator_Pneumaticsupply();

	/**
	 * Returns the meta object for the reference '{@link xPPU.ComponentRepository.BottleSeperator#getPowersupply <em>Powersupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Powersupply</em>'.
	 * @see xPPU.ComponentRepository.BottleSeperator#getPowersupply()
	 * @see #getBottleSeperator()
	 * @generated
	 */
	EReference getBottleSeperator_Powersupply();

	/**
	 * Returns the meta object for the reference '{@link xPPU.ComponentRepository.BottleSeperator#getScrewing_to_rack <em>Screwing to rack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Screwing to rack</em>'.
	 * @see xPPU.ComponentRepository.BottleSeperator#getScrewing_to_rack()
	 * @see #getBottleSeperator()
	 * @generated
	 */
	EReference getBottleSeperator_Screwing_to_rack();

	/**
	 * Returns the meta object for class '{@link xPPU.ComponentRepository.Splitter <em>Splitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Splitter</em>'.
	 * @see xPPU.ComponentRepository.Splitter
	 * @generated
	 */
	EClass getSplitter();

	/**
	 * Returns the meta object for the reference '{@link xPPU.ComponentRepository.Splitter#getScrewing <em>Screwing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Screwing</em>'.
	 * @see xPPU.ComponentRepository.Splitter#getScrewing()
	 * @see #getSplitter()
	 * @generated
	 */
	EReference getSplitter_Screwing();

	/**
	 * Returns the meta object for class '{@link xPPU.ComponentRepository.PowerSupply <em>Power Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Supply</em>'.
	 * @see xPPU.ComponentRepository.PowerSupply
	 * @generated
	 */
	EClass getPowerSupply();

	/**
	 * Returns the meta object for class '{@link xPPU.ComponentRepository.VacuumGripper <em>Vacuum Gripper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vacuum Gripper</em>'.
	 * @see xPPU.ComponentRepository.VacuumGripper
	 * @generated
	 */
	EClass getVacuumGripper();

	/**
	 * Returns the meta object for the reference '{@link xPPU.ComponentRepository.VacuumGripper#getMountedTo <em>Mounted To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mounted To</em>'.
	 * @see xPPU.ComponentRepository.VacuumGripper#getMountedTo()
	 * @see #getVacuumGripper()
	 * @generated
	 */
	EReference getVacuumGripper_MountedTo();

	/**
	 * Returns the meta object for the containment reference '{@link xPPU.ComponentRepository.VacuumGripper#getGripperPart <em>Gripper Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gripper Part</em>'.
	 * @see xPPU.ComponentRepository.VacuumGripper#getGripperPart()
	 * @see #getVacuumGripper()
	 * @generated
	 */
	EReference getVacuumGripper_GripperPart();

	/**
	 * Returns the meta object for the containment reference '{@link xPPU.ComponentRepository.VacuumGripper#getValve <em>Valve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Valve</em>'.
	 * @see xPPU.ComponentRepository.VacuumGripper#getValve()
	 * @see #getVacuumGripper()
	 * @generated
	 */
	EReference getVacuumGripper_Valve();

	/**
	 * Returns the meta object for the containment reference '{@link xPPU.ComponentRepository.VacuumGripper#getVacuumSwitch <em>Vacuum Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vacuum Switch</em>'.
	 * @see xPPU.ComponentRepository.VacuumGripper#getVacuumSwitch()
	 * @see #getVacuumGripper()
	 * @generated
	 */
	EReference getVacuumGripper_VacuumSwitch();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.ComponentRepository.VacuumGripper#getBusSlave <em>Bus Slave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bus Slave</em>'.
	 * @see xPPU.ComponentRepository.VacuumGripper#getBusSlave()
	 * @see #getVacuumGripper()
	 * @generated
	 */
	EReference getVacuumGripper_BusSlave();

	/**
	 * Returns the meta object for class '{@link xPPU.ComponentRepository.ConveyorBelt <em>Conveyor Belt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conveyor Belt</em>'.
	 * @see xPPU.ComponentRepository.ConveyorBelt
	 * @generated
	 */
	EClass getConveyorBelt();

	/**
	 * Returns the meta object for the container reference '{@link xPPU.ComponentRepository.ConveyorBelt#getMountedTo <em>Mounted To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Mounted To</em>'.
	 * @see xPPU.ComponentRepository.ConveyorBelt#getMountedTo()
	 * @see #getConveyorBelt()
	 * @generated
	 */
	EReference getConveyorBelt_MountedTo();

	/**
	 * Returns the meta object for the containment reference '{@link xPPU.ComponentRepository.ConveyorBelt#getFrame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Frame</em>'.
	 * @see xPPU.ComponentRepository.ConveyorBelt#getFrame()
	 * @see #getConveyorBelt()
	 * @generated
	 */
	EReference getConveyorBelt_Frame();

	/**
	 * Returns the meta object for the containment reference '{@link xPPU.ComponentRepository.ConveyorBelt#getRubberBand <em>Rubber Band</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rubber Band</em>'.
	 * @see xPPU.ComponentRepository.ConveyorBelt#getRubberBand()
	 * @see #getConveyorBelt()
	 * @generated
	 */
	EReference getConveyorBelt_RubberBand();

	/**
	 * Returns the meta object for class '{@link xPPU.ComponentRepository.Frame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Frame</em>'.
	 * @see xPPU.ComponentRepository.Frame
	 * @generated
	 */
	EClass getFrame();

	/**
	 * Returns the meta object for class '{@link xPPU.ComponentRepository.Pusher <em>Pusher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pusher</em>'.
	 * @see xPPU.ComponentRepository.Pusher
	 * @generated
	 */
	EClass getPusher();

	/**
	 * Returns the meta object for the reference '{@link xPPU.ComponentRepository.Pusher#getComponentsRepository <em>Components Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Components Repository</em>'.
	 * @see xPPU.ComponentRepository.Pusher#getComponentsRepository()
	 * @see #getPusher()
	 * @generated
	 */
	EReference getPusher_ComponentsRepository();

	/**
	 * Returns the meta object for the containment reference '{@link xPPU.ComponentRepository.Pusher#getFixtureCylinder <em>Fixture Cylinder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fixture Cylinder</em>'.
	 * @see xPPU.ComponentRepository.Pusher#getFixtureCylinder()
	 * @see #getPusher()
	 * @generated
	 */
	EReference getPusher_FixtureCylinder();

	/**
	 * Returns the meta object for the containment reference '{@link xPPU.ComponentRepository.Pusher#getMonostableCylinder <em>Monostable Cylinder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Monostable Cylinder</em>'.
	 * @see xPPU.ComponentRepository.Pusher#getMonostableCylinder()
	 * @see #getPusher()
	 * @generated
	 */
	EReference getPusher_MonostableCylinder();

	/**
	 * Returns the meta object for the containment reference '{@link xPPU.ComponentRepository.Pusher#getBusBox <em>Bus Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bus Box</em>'.
	 * @see xPPU.ComponentRepository.Pusher#getBusBox()
	 * @see #getPusher()
	 * @generated
	 */
	EReference getPusher_BusBox();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.ComponentRepository.Pusher#getBusCable <em>Bus Cable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bus Cable</em>'.
	 * @see xPPU.ComponentRepository.Pusher#getBusCable()
	 * @see #getPusher()
	 * @generated
	 */
	EReference getPusher_BusCable();

	/**
	 * Returns the meta object for class '{@link xPPU.ComponentRepository.TurningTable <em>Turning Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turning Table</em>'.
	 * @see xPPU.ComponentRepository.TurningTable
	 * @generated
	 */
	EClass getTurningTable();

	/**
	 * Returns the meta object for the containment reference '{@link xPPU.ComponentRepository.TurningTable#getRack_for_turningtable <em>Rack for turningtable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rack for turningtable</em>'.
	 * @see xPPU.ComponentRepository.TurningTable#getRack_for_turningtable()
	 * @see #getTurningTable()
	 * @generated
	 */
	EReference getTurningTable_Rack_for_turningtable();

	/**
	 * Returns the meta object for the containment reference '{@link xPPU.ComponentRepository.TurningTable#getTable_to_stand_on <em>Table to stand on</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table to stand on</em>'.
	 * @see xPPU.ComponentRepository.TurningTable#getTable_to_stand_on()
	 * @see #getTurningTable()
	 * @generated
	 */
	EReference getTurningTable_Table_to_stand_on();

	/**
	 * Returns the meta object for the containment reference '{@link xPPU.ComponentRepository.TurningTable#getMotor_to_drive <em>Motor to drive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Motor to drive</em>'.
	 * @see xPPU.ComponentRepository.TurningTable#getMotor_to_drive()
	 * @see #getTurningTable()
	 * @generated
	 */
	EReference getTurningTable_Motor_to_drive();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.ComponentRepository.TurningTable#getMicroswitchModule <em>Microswitch Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Microswitch Module</em>'.
	 * @see xPPU.ComponentRepository.TurningTable#getMicroswitchModule()
	 * @see #getTurningTable()
	 * @generated
	 */
	EReference getTurningTable_MicroswitchModule();

	/**
	 * Returns the meta object for the containment reference '{@link xPPU.ComponentRepository.TurningTable#getBusSlave <em>Bus Slave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bus Slave</em>'.
	 * @see xPPU.ComponentRepository.TurningTable#getBusSlave()
	 * @see #getTurningTable()
	 * @generated
	 */
	EReference getTurningTable_BusSlave();

	/**
	 * Returns the meta object for the containment reference '{@link xPPU.ComponentRepository.TurningTable#getBusBox <em>Bus Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bus Box</em>'.
	 * @see xPPU.ComponentRepository.TurningTable#getBusBox()
	 * @see #getTurningTable()
	 * @generated
	 */
	EReference getTurningTable_BusBox();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.ComponentRepository.TurningTable#getBusCable <em>Bus Cable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bus Cable</em>'.
	 * @see xPPU.ComponentRepository.TurningTable#getBusCable()
	 * @see #getTurningTable()
	 * @generated
	 */
	EReference getTurningTable_BusCable();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.ComponentRepository.TurningTable#getPotentiometer <em>Potentiometer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Potentiometer</em>'.
	 * @see xPPU.ComponentRepository.TurningTable#getPotentiometer()
	 * @see #getTurningTable()
	 * @generated
	 */
	EReference getTurningTable_Potentiometer();

	/**
	 * Returns the meta object for the reference '{@link xPPU.ComponentRepository.TurningTable#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see xPPU.ComponentRepository.TurningTable#getParent()
	 * @see #getTurningTable()
	 * @generated
	 */
	EReference getTurningTable_Parent();

	/**
	 * Returns the meta object for class '{@link xPPU.ComponentRepository.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller</em>'.
	 * @see xPPU.ComponentRepository.Controller
	 * @generated
	 */
	EClass getController();

	/**
	 * Returns the meta object for the reference '{@link xPPU.ComponentRepository.Controller#getPowersupply <em>Powersupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Powersupply</em>'.
	 * @see xPPU.ComponentRepository.Controller#getPowersupply()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_Powersupply();

	/**
	 * Returns the meta object for the reference '{@link xPPU.ComponentRepository.Controller#getControllerOf <em>Controller Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Controller Of</em>'.
	 * @see xPPU.ComponentRepository.Controller#getControllerOf()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_ControllerOf();

	/**
	 * Returns the meta object for class '{@link xPPU.ComponentRepository.LogicalWiring <em>Logical Wiring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Wiring</em>'.
	 * @see xPPU.ComponentRepository.LogicalWiring
	 * @generated
	 */
	EClass getLogicalWiring();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.ComponentRepository.LogicalWiring#getBusCable <em>Bus Cable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bus Cable</em>'.
	 * @see xPPU.ComponentRepository.LogicalWiring#getBusCable()
	 * @see #getLogicalWiring()
	 * @generated
	 */
	EReference getLogicalWiring_BusCable();

	/**
	 * Returns the meta object for class '{@link xPPU.ComponentRepository.MicroswitchModule <em>Microswitch Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Microswitch Module</em>'.
	 * @see xPPU.ComponentRepository.MicroswitchModule
	 * @generated
	 */
	EClass getMicroswitchModule();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.ComponentRepository.MicroswitchModule#getBusSlave <em>Bus Slave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bus Slave</em>'.
	 * @see xPPU.ComponentRepository.MicroswitchModule#getBusSlave()
	 * @see #getMicroswitchModule()
	 * @generated
	 */
	EReference getMicroswitchModule_BusSlave();

	/**
	 * Returns the meta object for class '{@link xPPU.ComponentRepository.Potentiometer <em>Potentiometer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Potentiometer</em>'.
	 * @see xPPU.ComponentRepository.Potentiometer
	 * @generated
	 */
	EClass getPotentiometer();

	/**
	 * Returns the meta object for class '{@link xPPU.ComponentRepository.VacuumSwitch <em>Vacuum Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vacuum Switch</em>'.
	 * @see xPPU.ComponentRepository.VacuumSwitch
	 * @generated
	 */
	EClass getVacuumSwitch();

	/**
	 * Returns the meta object for class '{@link xPPU.ComponentRepository.ReedSwitch <em>Reed Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reed Switch</em>'.
	 * @see xPPU.ComponentRepository.ReedSwitch
	 * @generated
	 */
	EClass getReedSwitch();

	/**
	 * Returns the meta object for class '{@link xPPU.ComponentRepository.PowerSplitter <em>Power Splitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Splitter</em>'.
	 * @see xPPU.ComponentRepository.PowerSplitter
	 * @generated
	 */
	EClass getPowerSplitter();

	/**
	 * Returns the meta object for the reference '{@link xPPU.ComponentRepository.PowerSplitter#getPowersupply <em>Powersupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Powersupply</em>'.
	 * @see xPPU.ComponentRepository.PowerSplitter#getPowersupply()
	 * @see #getPowerSplitter()
	 * @generated
	 */
	EReference getPowerSplitter_Powersupply();

	/**
	 * Returns the meta object for class '{@link xPPU.ComponentRepository.WaterSplitter <em>Water Splitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Water Splitter</em>'.
	 * @see xPPU.ComponentRepository.WaterSplitter
	 * @generated
	 */
	EClass getWaterSplitter();

	/**
	 * Returns the meta object for the reference '{@link xPPU.ComponentRepository.WaterSplitter#getWatersupply <em>Watersupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Watersupply</em>'.
	 * @see xPPU.ComponentRepository.WaterSplitter#getWatersupply()
	 * @see #getWaterSplitter()
	 * @generated
	 */
	EReference getWaterSplitter_Watersupply();

	/**
	 * Returns the meta object for class '{@link xPPU.ComponentRepository.PneumaticSplitter <em>Pneumatic Splitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pneumatic Splitter</em>'.
	 * @see xPPU.ComponentRepository.PneumaticSplitter
	 * @generated
	 */
	EClass getPneumaticSplitter();

	/**
	 * Returns the meta object for the reference '{@link xPPU.ComponentRepository.PneumaticSplitter#getPneumaticsupply <em>Pneumaticsupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pneumaticsupply</em>'.
	 * @see xPPU.ComponentRepository.PneumaticSplitter#getPneumaticsupply()
	 * @see #getPneumaticSplitter()
	 * @generated
	 */
	EReference getPneumaticSplitter_Pneumaticsupply();

	/**
	 * Returns the meta object for class '{@link xPPU.ComponentRepository.CylinderPart <em>Cylinder Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cylinder Part</em>'.
	 * @see xPPU.ComponentRepository.CylinderPart
	 * @generated
	 */
	EClass getCylinderPart();

	/**
	 * Returns the meta object for class '{@link xPPU.ComponentRepository.MonostableCylinder <em>Monostable Cylinder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monostable Cylinder</em>'.
	 * @see xPPU.ComponentRepository.MonostableCylinder
	 * @generated
	 */
	EClass getMonostableCylinder();

	/**
	 * Returns the meta object for the containment reference '{@link xPPU.ComponentRepository.MonostableCylinder#getHousing <em>Housing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Housing</em>'.
	 * @see xPPU.ComponentRepository.MonostableCylinder#getHousing()
	 * @see #getMonostableCylinder()
	 * @generated
	 */
	EReference getMonostableCylinder_Housing();

	/**
	 * Returns the meta object for the containment reference '{@link xPPU.ComponentRepository.MonostableCylinder#getSpring <em>Spring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Spring</em>'.
	 * @see xPPU.ComponentRepository.MonostableCylinder#getSpring()
	 * @see #getMonostableCylinder()
	 * @generated
	 */
	EReference getMonostableCylinder_Spring();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.ComponentRepository.MonostableCylinder#getReedSwitches <em>Reed Switches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reed Switches</em>'.
	 * @see xPPU.ComponentRepository.MonostableCylinder#getReedSwitches()
	 * @see #getMonostableCylinder()
	 * @generated
	 */
	EReference getMonostableCylinder_ReedSwitches();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.ComponentRepository.MonostableCylinder#getCylinderPart <em>Cylinder Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cylinder Part</em>'.
	 * @see xPPU.ComponentRepository.MonostableCylinder#getCylinderPart()
	 * @see #getMonostableCylinder()
	 * @generated
	 */
	EReference getMonostableCylinder_CylinderPart();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.ComponentRepository.MonostableCylinder#getValve <em>Valve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Valve</em>'.
	 * @see xPPU.ComponentRepository.MonostableCylinder#getValve()
	 * @see #getMonostableCylinder()
	 * @generated
	 */
	EReference getMonostableCylinder_Valve();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.ComponentRepository.MonostableCylinder#getBusSlave <em>Bus Slave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bus Slave</em>'.
	 * @see xPPU.ComponentRepository.MonostableCylinder#getBusSlave()
	 * @see #getMonostableCylinder()
	 * @generated
	 */
	EReference getMonostableCylinder_BusSlave();

	/**
	 * Returns the meta object for class '{@link xPPU.ComponentRepository.ComponentRepository <em>Component Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Repository</em>'.
	 * @see xPPU.ComponentRepository.ComponentRepository
	 * @generated
	 */
	EClass getComponentRepository();

	/**
	 * Returns the meta object for the reference list '{@link xPPU.ComponentRepository.ComponentRepository#getAllComponentsInPlant <em>All Components In Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Components In Plant</em>'.
	 * @see xPPU.ComponentRepository.ComponentRepository#getAllComponentsInPlant()
	 * @see #getComponentRepository()
	 * @generated
	 */
	EReference getComponentRepository_AllComponentsInPlant();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComponentRepositoryFactory getComponentRepositoryFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link xPPU.ComponentRepository.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.ComponentRepository.impl.ComponentImpl
		 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Connected Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__CONNECTED_INTERFACES = eINSTANCE.getComponent_ConnectedInterfaces();

		/**
		 * The meta object literal for the '{@link xPPU.ComponentRepository.impl.PanelImpl <em>Panel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.ComponentRepository.impl.PanelImpl
		 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getPanel()
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
		 * The meta object literal for the '{@link xPPU.ComponentRepository.impl.OperationPanelImpl <em>Operation Panel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.ComponentRepository.impl.OperationPanelImpl
		 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getOperationPanel()
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
		 * The meta object literal for the '{@link xPPU.ComponentRepository.impl.MotorImpl <em>Motor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.ComponentRepository.impl.MotorImpl
		 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getMotor()
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
		 * The meta object literal for the '{@link xPPU.ComponentRepository.impl.SimpleMotorImpl <em>Simple Motor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.ComponentRepository.impl.SimpleMotorImpl
		 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getSimpleMotor()
		 * @generated
		 */
		EClass SIMPLE_MOTOR = eINSTANCE.getSimpleMotor();

		/**
		 * The meta object literal for the '{@link xPPU.ComponentRepository.impl.MechanicalAssemblyImpl <em>Mechanical Assembly</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.ComponentRepository.impl.MechanicalAssemblyImpl
		 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getMechanicalAssembly()
		 * @generated
		 */
		EClass MECHANICAL_ASSEMBLY = eINSTANCE.getMechanicalAssembly();

		/**
		 * The meta object literal for the '{@link xPPU.ComponentRepository.impl.RegularRampImpl <em>Regular Ramp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.ComponentRepository.impl.RegularRampImpl
		 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getRegularRamp()
		 * @generated
		 */
		EClass REGULAR_RAMP = eINSTANCE.getRegularRamp();

		/**
		 * The meta object literal for the '{@link xPPU.ComponentRepository.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.ComponentRepository.impl.SensorImpl
		 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getSensor()
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
		 * The meta object literal for the '{@link xPPU.ComponentRepository.impl.OpticalSensorImpl <em>Optical Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.ComponentRepository.impl.OpticalSensorImpl
		 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getOpticalSensor()
		 * @generated
		 */
		EClass OPTICAL_SENSOR = eINSTANCE.getOpticalSensor();

		/**
		 * The meta object literal for the '{@link xPPU.ComponentRepository.impl.InductiveSensorImpl <em>Inductive Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.ComponentRepository.impl.InductiveSensorImpl
		 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getInductiveSensor()
		 * @generated
		 */
		EClass INDUCTIVE_SENSOR = eINSTANCE.getInductiveSensor();

		/**
		 * The meta object literal for the '{@link xPPU.ComponentRepository.impl.PresenceSensorImpl <em>Presence Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.ComponentRepository.impl.PresenceSensorImpl
		 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getPresenceSensor()
		 * @generated
		 */
		EClass PRESENCE_SENSOR = eINSTANCE.getPresenceSensor();

		/**
		 * The meta object literal for the '{@link xPPU.ComponentRepository.impl.PipeImpl <em>Pipe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.ComponentRepository.impl.PipeImpl
		 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getPipe()
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
		 * The meta object literal for the '{@link xPPU.ComponentRepository.impl.PneumaticPipeImpl <em>Pneumatic Pipe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.ComponentRepository.impl.PneumaticPipeImpl
		 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getPneumaticPipe()
		 * @generated
		 */
		EClass PNEUMATIC_PIPE = eINSTANCE.getPneumaticPipe();

		/**
		 * The meta object literal for the '{@link xPPU.ComponentRepository.impl.CompressorImpl <em>Compressor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.ComponentRepository.impl.CompressorImpl
		 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getCompressor()
		 * @generated
		 */
		EClass COMPRESSOR = eINSTANCE.getCompressor();

		/**
		 * The meta object literal for the '<em><b>Powersupply</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPRESSOR__POWERSUPPLY = eINSTANCE.getCompressor_Powersupply();

		/**
		 * The meta object literal for the '<em><b>Pneumaticsupply</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPRESSOR__PNEUMATICSUPPLY = eINSTANCE.getCompressor_Pneumaticsupply();

		/**
		 * The meta object literal for the '<em><b>Pins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPRESSOR__PINS = eINSTANCE.getCompressor_Pins();

		/**
		 * The meta object literal for the '<em><b>Screwing</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPRESSOR__SCREWING = eINSTANCE.getCompressor_Screwing();

		/**
		 * The meta object literal for the '<em><b>Switch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPRESSOR__SWITCH = eINSTANCE.getCompressor_Switch();

		/**
		 * The meta object literal for the '{@link xPPU.ComponentRepository.impl.CableImpl <em>Cable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.ComponentRepository.impl.CableImpl
		 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getCable()
		 * @generated
		 */
		EClass CABLE = eINSTANCE.getCable();

		/**
		 * The meta object literal for the '{@link xPPU.ComponentRepository.impl.PowerCableImpl <em>Power Cable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.ComponentRepository.impl.PowerCableImpl
		 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getPowerCable()
		 * @generated
		 */
		EClass POWER_CABLE = eINSTANCE.getPowerCable();

		/**
		 * The meta object literal for the '{@link xPPU.ComponentRepository.impl.CylinderImpl <em>Cylinder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.ComponentRepository.impl.CylinderImpl
		 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getCylinder()
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
		 * The meta object literal for the '{@link xPPU.ComponentRepository.impl.ProportionalCylinderImpl <em>Proportional Cylinder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.ComponentRepository.impl.ProportionalCylinderImpl
		 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getProportionalCylinder()
		 * @generated
		 */
		EClass PROPORTIONAL_CYLINDER = eINSTANCE.getProportionalCylinder();

		/**
		 * The meta object literal for the '{@link xPPU.ComponentRepository.impl.BistableCylinderImpl <em>Bistable Cylinder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.ComponentRepository.impl.BistableCylinderImpl
		 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getBistableCylinder()
		 * @generated
		 */
		EClass BISTABLE_CYLINDER = eINSTANCE.getBistableCylinder();

		/**
		 * The meta object literal for the '{@link xPPU.ComponentRepository.impl.RackImpl <em>Rack</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.ComponentRepository.impl.RackImpl
		 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getRack()
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
		 * The meta object literal for the '{@link xPPU.ComponentRepository.impl.CornerImpl <em>Corner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.ComponentRepository.impl.CornerImpl
		 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getCorner()
		 * @generated
		 */
		EClass CORNER = eINSTANCE.getCorner();

		/**
		 * The meta object literal for the '{@link xPPU.ComponentRepository.impl.ValveImpl <em>Valve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.ComponentRepository.impl.ValveImpl
		 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getValve()
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
		 * The meta object literal for the '{@link xPPU.ComponentRepository.impl.RegularValveImpl <em>Regular Valve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.ComponentRepository.impl.RegularValveImpl
		 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getRegularValve()
		 * @generated
		 */
		EClass REGULAR_VALVE = eINSTANCE.getRegularValve();

		/**
		 * The meta object literal for the '{@link xPPU.ComponentRepository.impl.TankImpl <em>Tank</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.ComponentRepository.impl.TankImpl
		 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getTank()
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
		 * The meta object literal for the '{@link xPPU.ComponentRepository.impl.DispenserImpl <em>Dispenser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.ComponentRepository.impl.DispenserImpl
		 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getDispenser()
		 * @generated
		 */
		EClass DISPENSER = eINSTANCE.getDispenser();

		/**
		 * The meta object literal for the '{@link xPPU.ComponentRepository.impl.BottleSeperatorImpl <em>Bottle Seperator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.ComponentRepository.impl.BottleSeperatorImpl
		 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getBottleSeperator()
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
		 * The meta object literal for the '{@link xPPU.ComponentRepository.impl.SplitterImpl <em>Splitter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.ComponentRepository.impl.SplitterImpl
		 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getSplitter()
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
		 * The meta object literal for the '{@link xPPU.ComponentRepository.impl.PowerSupplyImpl <em>Power Supply</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.ComponentRepository.impl.PowerSupplyImpl
		 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getPowerSupply()
		 * @generated
		 */
		EClass POWER_SUPPLY = eINSTANCE.getPowerSupply();

		/**
		 * The meta object literal for the '{@link xPPU.ComponentRepository.impl.VacuumGripperImpl <em>Vacuum Gripper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.ComponentRepository.impl.VacuumGripperImpl
		 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getVacuumGripper()
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
		 * The meta object literal for the '<em><b>Gripper Part</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VACUUM_GRIPPER__GRIPPER_PART = eINSTANCE.getVacuumGripper_GripperPart();

		/**
		 * The meta object literal for the '<em><b>Valve</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VACUUM_GRIPPER__VALVE = eINSTANCE.getVacuumGripper_Valve();

		/**
		 * The meta object literal for the '<em><b>Vacuum Switch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VACUUM_GRIPPER__VACUUM_SWITCH = eINSTANCE.getVacuumGripper_VacuumSwitch();

		/**
		 * The meta object literal for the '<em><b>Bus Slave</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VACUUM_GRIPPER__BUS_SLAVE = eINSTANCE.getVacuumGripper_BusSlave();

		/**
		 * The meta object literal for the '{@link xPPU.ComponentRepository.impl.ConveyorBeltImpl <em>Conveyor Belt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.ComponentRepository.impl.ConveyorBeltImpl
		 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getConveyorBelt()
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
		 * The meta object literal for the '<em><b>Frame</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVEYOR_BELT__FRAME = eINSTANCE.getConveyorBelt_Frame();

		/**
		 * The meta object literal for the '<em><b>Rubber Band</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVEYOR_BELT__RUBBER_BAND = eINSTANCE.getConveyorBelt_RubberBand();

		/**
		 * The meta object literal for the '{@link xPPU.ComponentRepository.impl.FrameImpl <em>Frame</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.ComponentRepository.impl.FrameImpl
		 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getFrame()
		 * @generated
		 */
		EClass FRAME = eINSTANCE.getFrame();

		/**
		 * The meta object literal for the '{@link xPPU.ComponentRepository.impl.PusherImpl <em>Pusher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.ComponentRepository.impl.PusherImpl
		 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getPusher()
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
		 * The meta object literal for the '<em><b>Fixture Cylinder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUSHER__FIXTURE_CYLINDER = eINSTANCE.getPusher_FixtureCylinder();

		/**
		 * The meta object literal for the '<em><b>Monostable Cylinder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUSHER__MONOSTABLE_CYLINDER = eINSTANCE.getPusher_MonostableCylinder();

		/**
		 * The meta object literal for the '<em><b>Bus Box</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUSHER__BUS_BOX = eINSTANCE.getPusher_BusBox();

		/**
		 * The meta object literal for the '<em><b>Bus Cable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUSHER__BUS_CABLE = eINSTANCE.getPusher_BusCable();

		/**
		 * The meta object literal for the '{@link xPPU.ComponentRepository.impl.TurningTableImpl <em>Turning Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.ComponentRepository.impl.TurningTableImpl
		 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getTurningTable()
		 * @generated
		 */
		EClass TURNING_TABLE = eINSTANCE.getTurningTable();

		/**
		 * The meta object literal for the '<em><b>Rack for turningtable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURNING_TABLE__RACK_FOR_TURNINGTABLE = eINSTANCE.getTurningTable_Rack_for_turningtable();

		/**
		 * The meta object literal for the '<em><b>Table to stand on</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURNING_TABLE__TABLE_TO_STAND_ON = eINSTANCE.getTurningTable_Table_to_stand_on();

		/**
		 * The meta object literal for the '<em><b>Motor to drive</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURNING_TABLE__MOTOR_TO_DRIVE = eINSTANCE.getTurningTable_Motor_to_drive();

		/**
		 * The meta object literal for the '<em><b>Microswitch Module</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURNING_TABLE__MICROSWITCH_MODULE = eINSTANCE.getTurningTable_MicroswitchModule();

		/**
		 * The meta object literal for the '<em><b>Bus Slave</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURNING_TABLE__BUS_SLAVE = eINSTANCE.getTurningTable_BusSlave();

		/**
		 * The meta object literal for the '<em><b>Bus Box</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURNING_TABLE__BUS_BOX = eINSTANCE.getTurningTable_BusBox();

		/**
		 * The meta object literal for the '<em><b>Bus Cable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURNING_TABLE__BUS_CABLE = eINSTANCE.getTurningTable_BusCable();

		/**
		 * The meta object literal for the '<em><b>Potentiometer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURNING_TABLE__POTENTIOMETER = eINSTANCE.getTurningTable_Potentiometer();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURNING_TABLE__PARENT = eINSTANCE.getTurningTable_Parent();

		/**
		 * The meta object literal for the '{@link xPPU.ComponentRepository.impl.ControllerImpl <em>Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.ComponentRepository.impl.ControllerImpl
		 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getController()
		 * @generated
		 */
		EClass CONTROLLER = eINSTANCE.getController();

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
		 * The meta object literal for the '{@link xPPU.ComponentRepository.impl.LogicalWiringImpl <em>Logical Wiring</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.ComponentRepository.impl.LogicalWiringImpl
		 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getLogicalWiring()
		 * @generated
		 */
		EClass LOGICAL_WIRING = eINSTANCE.getLogicalWiring();

		/**
		 * The meta object literal for the '<em><b>Bus Cable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_WIRING__BUS_CABLE = eINSTANCE.getLogicalWiring_BusCable();

		/**
		 * The meta object literal for the '{@link xPPU.ComponentRepository.impl.MicroswitchModuleImpl <em>Microswitch Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.ComponentRepository.impl.MicroswitchModuleImpl
		 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getMicroswitchModule()
		 * @generated
		 */
		EClass MICROSWITCH_MODULE = eINSTANCE.getMicroswitchModule();

		/**
		 * The meta object literal for the '<em><b>Bus Slave</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSWITCH_MODULE__BUS_SLAVE = eINSTANCE.getMicroswitchModule_BusSlave();

		/**
		 * The meta object literal for the '{@link xPPU.ComponentRepository.impl.PotentiometerImpl <em>Potentiometer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.ComponentRepository.impl.PotentiometerImpl
		 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getPotentiometer()
		 * @generated
		 */
		EClass POTENTIOMETER = eINSTANCE.getPotentiometer();

		/**
		 * The meta object literal for the '{@link xPPU.ComponentRepository.impl.VacuumSwitchImpl <em>Vacuum Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.ComponentRepository.impl.VacuumSwitchImpl
		 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getVacuumSwitch()
		 * @generated
		 */
		EClass VACUUM_SWITCH = eINSTANCE.getVacuumSwitch();

		/**
		 * The meta object literal for the '{@link xPPU.ComponentRepository.impl.ReedSwitchImpl <em>Reed Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.ComponentRepository.impl.ReedSwitchImpl
		 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getReedSwitch()
		 * @generated
		 */
		EClass REED_SWITCH = eINSTANCE.getReedSwitch();

		/**
		 * The meta object literal for the '{@link xPPU.ComponentRepository.impl.PowerSplitterImpl <em>Power Splitter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.ComponentRepository.impl.PowerSplitterImpl
		 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getPowerSplitter()
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
		 * The meta object literal for the '{@link xPPU.ComponentRepository.impl.WaterSplitterImpl <em>Water Splitter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.ComponentRepository.impl.WaterSplitterImpl
		 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getWaterSplitter()
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
		 * The meta object literal for the '{@link xPPU.ComponentRepository.impl.PneumaticSplitterImpl <em>Pneumatic Splitter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.ComponentRepository.impl.PneumaticSplitterImpl
		 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getPneumaticSplitter()
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
		 * The meta object literal for the '{@link xPPU.ComponentRepository.impl.CylinderPartImpl <em>Cylinder Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.ComponentRepository.impl.CylinderPartImpl
		 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getCylinderPart()
		 * @generated
		 */
		EClass CYLINDER_PART = eINSTANCE.getCylinderPart();

		/**
		 * The meta object literal for the '{@link xPPU.ComponentRepository.impl.MonostableCylinderImpl <em>Monostable Cylinder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.ComponentRepository.impl.MonostableCylinderImpl
		 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getMonostableCylinder()
		 * @generated
		 */
		EClass MONOSTABLE_CYLINDER = eINSTANCE.getMonostableCylinder();

		/**
		 * The meta object literal for the '<em><b>Housing</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONOSTABLE_CYLINDER__HOUSING = eINSTANCE.getMonostableCylinder_Housing();

		/**
		 * The meta object literal for the '<em><b>Spring</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONOSTABLE_CYLINDER__SPRING = eINSTANCE.getMonostableCylinder_Spring();

		/**
		 * The meta object literal for the '<em><b>Reed Switches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONOSTABLE_CYLINDER__REED_SWITCHES = eINSTANCE.getMonostableCylinder_ReedSwitches();

		/**
		 * The meta object literal for the '<em><b>Cylinder Part</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONOSTABLE_CYLINDER__CYLINDER_PART = eINSTANCE.getMonostableCylinder_CylinderPart();

		/**
		 * The meta object literal for the '<em><b>Valve</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONOSTABLE_CYLINDER__VALVE = eINSTANCE.getMonostableCylinder_Valve();

		/**
		 * The meta object literal for the '<em><b>Bus Slave</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONOSTABLE_CYLINDER__BUS_SLAVE = eINSTANCE.getMonostableCylinder_BusSlave();

		/**
		 * The meta object literal for the '{@link xPPU.ComponentRepository.impl.ComponentRepositoryImpl <em>Component Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.ComponentRepository.impl.ComponentRepositoryImpl
		 * @see xPPU.ComponentRepository.impl.ComponentRepositoryPackageImpl#getComponentRepository()
		 * @generated
		 */
		EClass COMPONENT_REPOSITORY = eINSTANCE.getComponentRepository();

		/**
		 * The meta object literal for the '<em><b>All Components In Plant</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_REPOSITORY__ALL_COMPONENTS_IN_PLANT = eINSTANCE.getComponentRepository_AllComponentsInPlant();

	}

} //ComponentRepositoryPackage
