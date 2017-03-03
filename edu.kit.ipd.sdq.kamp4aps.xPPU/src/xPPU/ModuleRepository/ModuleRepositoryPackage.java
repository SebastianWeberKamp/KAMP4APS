/**
 */
package xPPU.ModuleRepository;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import xPPU.Identifier.IdentifierPackage;

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
 * @see xPPU.ModuleRepository.ModuleRepositoryFactory
 * @model kind="package"
 * @generated
 */
public interface ModuleRepositoryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ModuleRepository";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "edu.kit.ipd.sdq.kaps.xppu.modulerepository";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ModuleRepository";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModuleRepositoryPackage eINSTANCE = xPPU.ModuleRepository.impl.ModuleRepositoryPackageImpl.init();

	/**
	 * The meta object id for the '{@link xPPU.ModuleRepository.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.ModuleRepository.impl.ModuleImpl
	 * @see xPPU.ModuleRepository.impl.ModuleRepositoryPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__MODULES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Structure</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__PARENT_STRUCTURE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OPERATION_COUNT = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.ModuleRepository.impl.RampModuleImpl <em>Ramp Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.ModuleRepository.impl.RampModuleImpl
	 * @see xPPU.ModuleRepository.impl.ModuleRepositoryPackageImpl#getRampModule()
	 * @generated
	 */
	int RAMP_MODULE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_MODULE__ID = MODULE__ID;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_MODULE__MODULES = MODULE__MODULES;

	/**
	 * The feature id for the '<em><b>Parent Structure</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_MODULE__PARENT_STRUCTURE = MODULE__PARENT_STRUCTURE;

	/**
	 * The number of structural features of the '<em>Ramp Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_MODULE_FEATURE_COUNT = MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ramp Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_MODULE_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.ModuleRepository.impl.PusherModuleImpl <em>Pusher Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.ModuleRepository.impl.PusherModuleImpl
	 * @see xPPU.ModuleRepository.impl.ModuleRepositoryPackageImpl#getPusherModule()
	 * @generated
	 */
	int PUSHER_MODULE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER_MODULE__ID = MODULE__ID;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER_MODULE__MODULES = MODULE__MODULES;

	/**
	 * The feature id for the '<em><b>Parent Structure</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER_MODULE__PARENT_STRUCTURE = MODULE__PARENT_STRUCTURE;

	/**
	 * The number of structural features of the '<em>Pusher Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER_MODULE_FEATURE_COUNT = MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pusher Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER_MODULE_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.ModuleRepository.impl.MotorModuleImpl <em>Motor Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.ModuleRepository.impl.MotorModuleImpl
	 * @see xPPU.ModuleRepository.impl.ModuleRepositoryPackageImpl#getMotorModule()
	 * @generated
	 */
	int MOTOR_MODULE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_MODULE__ID = MODULE__ID;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_MODULE__MODULES = MODULE__MODULES;

	/**
	 * The feature id for the '<em><b>Parent Structure</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_MODULE__PARENT_STRUCTURE = MODULE__PARENT_STRUCTURE;

	/**
	 * The feature id for the '<em><b>Simple Motor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_MODULE__SIMPLE_MOTOR = MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bus Slave</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_MODULE__BUS_SLAVE = MODULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bus Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_MODULE__BUS_BOX = MODULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bus Cable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_MODULE__BUS_CABLE = MODULE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Motor Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_MODULE_FEATURE_COUNT = MODULE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Motor Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_MODULE_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.ModuleRepository.impl.SensorModuleImpl <em>Sensor Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.ModuleRepository.impl.SensorModuleImpl
	 * @see xPPU.ModuleRepository.impl.ModuleRepositoryPackageImpl#getSensorModule()
	 * @generated
	 */
	int SENSOR_MODULE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_MODULE__ID = MODULE__ID;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_MODULE__MODULES = MODULE__MODULES;

	/**
	 * The feature id for the '<em><b>Parent Structure</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_MODULE__PARENT_STRUCTURE = MODULE__PARENT_STRUCTURE;

	/**
	 * The number of structural features of the '<em>Sensor Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_MODULE_FEATURE_COUNT = MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sensor Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_MODULE_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.ModuleRepository.impl.OpticalSensorModuleImpl <em>Optical Sensor Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.ModuleRepository.impl.OpticalSensorModuleImpl
	 * @see xPPU.ModuleRepository.impl.ModuleRepositoryPackageImpl#getOpticalSensorModule()
	 * @generated
	 */
	int OPTICAL_SENSOR_MODULE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICAL_SENSOR_MODULE__ID = MODULE__ID;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICAL_SENSOR_MODULE__MODULES = MODULE__MODULES;

	/**
	 * The feature id for the '<em><b>Parent Structure</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICAL_SENSOR_MODULE__PARENT_STRUCTURE = MODULE__PARENT_STRUCTURE;

	/**
	 * The feature id for the '<em><b>Optical Sensor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICAL_SENSOR_MODULE__OPTICAL_SENSOR = MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bus Slave</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICAL_SENSOR_MODULE__BUS_SLAVE = MODULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Optical Sensor Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICAL_SENSOR_MODULE_FEATURE_COUNT = MODULE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Optical Sensor Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICAL_SENSOR_MODULE_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.ModuleRepository.impl.InductiveSensorModuleImpl <em>Inductive Sensor Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.ModuleRepository.impl.InductiveSensorModuleImpl
	 * @see xPPU.ModuleRepository.impl.ModuleRepositoryPackageImpl#getInductiveSensorModule()
	 * @generated
	 */
	int INDUCTIVE_SENSOR_MODULE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTIVE_SENSOR_MODULE__ID = MODULE__ID;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTIVE_SENSOR_MODULE__MODULES = MODULE__MODULES;

	/**
	 * The feature id for the '<em><b>Parent Structure</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTIVE_SENSOR_MODULE__PARENT_STRUCTURE = MODULE__PARENT_STRUCTURE;

	/**
	 * The feature id for the '<em><b>Inductive Sensor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTIVE_SENSOR_MODULE__INDUCTIVE_SENSOR = MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bus Slave</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTIVE_SENSOR_MODULE__BUS_SLAVE = MODULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Inductive Sensor Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTIVE_SENSOR_MODULE_FEATURE_COUNT = MODULE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Inductive Sensor Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTIVE_SENSOR_MODULE_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.ModuleRepository.impl.PresenceSensorModuleImpl <em>Presence Sensor Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.ModuleRepository.impl.PresenceSensorModuleImpl
	 * @see xPPU.ModuleRepository.impl.ModuleRepositoryPackageImpl#getPresenceSensorModule()
	 * @generated
	 */
	int PRESENCE_SENSOR_MODULE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENCE_SENSOR_MODULE__ID = MODULE__ID;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENCE_SENSOR_MODULE__MODULES = MODULE__MODULES;

	/**
	 * The feature id for the '<em><b>Parent Structure</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENCE_SENSOR_MODULE__PARENT_STRUCTURE = MODULE__PARENT_STRUCTURE;

	/**
	 * The feature id for the '<em><b>Presence Sensor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENCE_SENSOR_MODULE__PRESENCE_SENSOR = MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bus Slave</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENCE_SENSOR_MODULE__BUS_SLAVE = MODULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Presence Sensor Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENCE_SENSOR_MODULE_FEATURE_COUNT = MODULE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Presence Sensor Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENCE_SENSOR_MODULE_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.ModuleRepository.impl.PressureSensorModuleImpl <em>Pressure Sensor Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.ModuleRepository.impl.PressureSensorModuleImpl
	 * @see xPPU.ModuleRepository.impl.ModuleRepositoryPackageImpl#getPressureSensorModule()
	 * @generated
	 */
	int PRESSURE_SENSOR_MODULE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR_MODULE__ID = MODULE__ID;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR_MODULE__MODULES = MODULE__MODULES;

	/**
	 * The feature id for the '<em><b>Parent Structure</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR_MODULE__PARENT_STRUCTURE = MODULE__PARENT_STRUCTURE;

	/**
	 * The number of structural features of the '<em>Pressure Sensor Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR_MODULE_FEATURE_COUNT = MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pressure Sensor Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR_MODULE_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link xPPU.ModuleRepository.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see xPPU.ModuleRepository.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the reference list '{@link xPPU.ModuleRepository.Module#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Modules</em>'.
	 * @see xPPU.ModuleRepository.Module#getModules()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Modules();

	/**
	 * Returns the meta object for the container reference '{@link xPPU.ModuleRepository.Module#getParentStructure <em>Parent Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Structure</em>'.
	 * @see xPPU.ModuleRepository.Module#getParentStructure()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_ParentStructure();

	/**
	 * Returns the meta object for class '{@link xPPU.ModuleRepository.RampModule <em>Ramp Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ramp Module</em>'.
	 * @see xPPU.ModuleRepository.RampModule
	 * @generated
	 */
	EClass getRampModule();

	/**
	 * Returns the meta object for class '{@link xPPU.ModuleRepository.PusherModule <em>Pusher Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pusher Module</em>'.
	 * @see xPPU.ModuleRepository.PusherModule
	 * @generated
	 */
	EClass getPusherModule();

	/**
	 * Returns the meta object for class '{@link xPPU.ModuleRepository.MotorModule <em>Motor Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Motor Module</em>'.
	 * @see xPPU.ModuleRepository.MotorModule
	 * @generated
	 */
	EClass getMotorModule();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.ModuleRepository.MotorModule#getSimpleMotor <em>Simple Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simple Motor</em>'.
	 * @see xPPU.ModuleRepository.MotorModule#getSimpleMotor()
	 * @see #getMotorModule()
	 * @generated
	 */
	EReference getMotorModule_SimpleMotor();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.ModuleRepository.MotorModule#getBusSlave <em>Bus Slave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bus Slave</em>'.
	 * @see xPPU.ModuleRepository.MotorModule#getBusSlave()
	 * @see #getMotorModule()
	 * @generated
	 */
	EReference getMotorModule_BusSlave();

	/**
	 * Returns the meta object for the containment reference '{@link xPPU.ModuleRepository.MotorModule#getBusBox <em>Bus Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bus Box</em>'.
	 * @see xPPU.ModuleRepository.MotorModule#getBusBox()
	 * @see #getMotorModule()
	 * @generated
	 */
	EReference getMotorModule_BusBox();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.ModuleRepository.MotorModule#getBusCable <em>Bus Cable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bus Cable</em>'.
	 * @see xPPU.ModuleRepository.MotorModule#getBusCable()
	 * @see #getMotorModule()
	 * @generated
	 */
	EReference getMotorModule_BusCable();

	/**
	 * Returns the meta object for class '{@link xPPU.ModuleRepository.SensorModule <em>Sensor Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor Module</em>'.
	 * @see xPPU.ModuleRepository.SensorModule
	 * @generated
	 */
	EClass getSensorModule();

	/**
	 * Returns the meta object for class '{@link xPPU.ModuleRepository.OpticalSensorModule <em>Optical Sensor Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Optical Sensor Module</em>'.
	 * @see xPPU.ModuleRepository.OpticalSensorModule
	 * @generated
	 */
	EClass getOpticalSensorModule();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.ModuleRepository.OpticalSensorModule#getOpticalSensor <em>Optical Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Optical Sensor</em>'.
	 * @see xPPU.ModuleRepository.OpticalSensorModule#getOpticalSensor()
	 * @see #getOpticalSensorModule()
	 * @generated
	 */
	EReference getOpticalSensorModule_OpticalSensor();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.ModuleRepository.OpticalSensorModule#getBusSlave <em>Bus Slave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bus Slave</em>'.
	 * @see xPPU.ModuleRepository.OpticalSensorModule#getBusSlave()
	 * @see #getOpticalSensorModule()
	 * @generated
	 */
	EReference getOpticalSensorModule_BusSlave();

	/**
	 * Returns the meta object for class '{@link xPPU.ModuleRepository.InductiveSensorModule <em>Inductive Sensor Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inductive Sensor Module</em>'.
	 * @see xPPU.ModuleRepository.InductiveSensorModule
	 * @generated
	 */
	EClass getInductiveSensorModule();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.ModuleRepository.InductiveSensorModule#getInductiveSensor <em>Inductive Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inductive Sensor</em>'.
	 * @see xPPU.ModuleRepository.InductiveSensorModule#getInductiveSensor()
	 * @see #getInductiveSensorModule()
	 * @generated
	 */
	EReference getInductiveSensorModule_InductiveSensor();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.ModuleRepository.InductiveSensorModule#getBusSlave <em>Bus Slave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bus Slave</em>'.
	 * @see xPPU.ModuleRepository.InductiveSensorModule#getBusSlave()
	 * @see #getInductiveSensorModule()
	 * @generated
	 */
	EReference getInductiveSensorModule_BusSlave();

	/**
	 * Returns the meta object for class '{@link xPPU.ModuleRepository.PresenceSensorModule <em>Presence Sensor Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Presence Sensor Module</em>'.
	 * @see xPPU.ModuleRepository.PresenceSensorModule
	 * @generated
	 */
	EClass getPresenceSensorModule();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.ModuleRepository.PresenceSensorModule#getPresenceSensor <em>Presence Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Presence Sensor</em>'.
	 * @see xPPU.ModuleRepository.PresenceSensorModule#getPresenceSensor()
	 * @see #getPresenceSensorModule()
	 * @generated
	 */
	EReference getPresenceSensorModule_PresenceSensor();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.ModuleRepository.PresenceSensorModule#getBusSlave <em>Bus Slave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bus Slave</em>'.
	 * @see xPPU.ModuleRepository.PresenceSensorModule#getBusSlave()
	 * @see #getPresenceSensorModule()
	 * @generated
	 */
	EReference getPresenceSensorModule_BusSlave();

	/**
	 * Returns the meta object for class '{@link xPPU.ModuleRepository.PressureSensorModule <em>Pressure Sensor Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pressure Sensor Module</em>'.
	 * @see xPPU.ModuleRepository.PressureSensorModule
	 * @generated
	 */
	EClass getPressureSensorModule();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModuleRepositoryFactory getModuleRepositoryFactory();

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
		 * The meta object literal for the '{@link xPPU.ModuleRepository.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.ModuleRepository.impl.ModuleImpl
		 * @see xPPU.ModuleRepository.impl.ModuleRepositoryPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__MODULES = eINSTANCE.getModule_Modules();

		/**
		 * The meta object literal for the '<em><b>Parent Structure</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__PARENT_STRUCTURE = eINSTANCE.getModule_ParentStructure();

		/**
		 * The meta object literal for the '{@link xPPU.ModuleRepository.impl.RampModuleImpl <em>Ramp Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.ModuleRepository.impl.RampModuleImpl
		 * @see xPPU.ModuleRepository.impl.ModuleRepositoryPackageImpl#getRampModule()
		 * @generated
		 */
		EClass RAMP_MODULE = eINSTANCE.getRampModule();

		/**
		 * The meta object literal for the '{@link xPPU.ModuleRepository.impl.PusherModuleImpl <em>Pusher Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.ModuleRepository.impl.PusherModuleImpl
		 * @see xPPU.ModuleRepository.impl.ModuleRepositoryPackageImpl#getPusherModule()
		 * @generated
		 */
		EClass PUSHER_MODULE = eINSTANCE.getPusherModule();

		/**
		 * The meta object literal for the '{@link xPPU.ModuleRepository.impl.MotorModuleImpl <em>Motor Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.ModuleRepository.impl.MotorModuleImpl
		 * @see xPPU.ModuleRepository.impl.ModuleRepositoryPackageImpl#getMotorModule()
		 * @generated
		 */
		EClass MOTOR_MODULE = eINSTANCE.getMotorModule();

		/**
		 * The meta object literal for the '<em><b>Simple Motor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOTOR_MODULE__SIMPLE_MOTOR = eINSTANCE.getMotorModule_SimpleMotor();

		/**
		 * The meta object literal for the '<em><b>Bus Slave</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOTOR_MODULE__BUS_SLAVE = eINSTANCE.getMotorModule_BusSlave();

		/**
		 * The meta object literal for the '<em><b>Bus Box</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOTOR_MODULE__BUS_BOX = eINSTANCE.getMotorModule_BusBox();

		/**
		 * The meta object literal for the '<em><b>Bus Cable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOTOR_MODULE__BUS_CABLE = eINSTANCE.getMotorModule_BusCable();

		/**
		 * The meta object literal for the '{@link xPPU.ModuleRepository.impl.SensorModuleImpl <em>Sensor Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.ModuleRepository.impl.SensorModuleImpl
		 * @see xPPU.ModuleRepository.impl.ModuleRepositoryPackageImpl#getSensorModule()
		 * @generated
		 */
		EClass SENSOR_MODULE = eINSTANCE.getSensorModule();

		/**
		 * The meta object literal for the '{@link xPPU.ModuleRepository.impl.OpticalSensorModuleImpl <em>Optical Sensor Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.ModuleRepository.impl.OpticalSensorModuleImpl
		 * @see xPPU.ModuleRepository.impl.ModuleRepositoryPackageImpl#getOpticalSensorModule()
		 * @generated
		 */
		EClass OPTICAL_SENSOR_MODULE = eINSTANCE.getOpticalSensorModule();

		/**
		 * The meta object literal for the '<em><b>Optical Sensor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTICAL_SENSOR_MODULE__OPTICAL_SENSOR = eINSTANCE.getOpticalSensorModule_OpticalSensor();

		/**
		 * The meta object literal for the '<em><b>Bus Slave</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTICAL_SENSOR_MODULE__BUS_SLAVE = eINSTANCE.getOpticalSensorModule_BusSlave();

		/**
		 * The meta object literal for the '{@link xPPU.ModuleRepository.impl.InductiveSensorModuleImpl <em>Inductive Sensor Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.ModuleRepository.impl.InductiveSensorModuleImpl
		 * @see xPPU.ModuleRepository.impl.ModuleRepositoryPackageImpl#getInductiveSensorModule()
		 * @generated
		 */
		EClass INDUCTIVE_SENSOR_MODULE = eINSTANCE.getInductiveSensorModule();

		/**
		 * The meta object literal for the '<em><b>Inductive Sensor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDUCTIVE_SENSOR_MODULE__INDUCTIVE_SENSOR = eINSTANCE.getInductiveSensorModule_InductiveSensor();

		/**
		 * The meta object literal for the '<em><b>Bus Slave</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDUCTIVE_SENSOR_MODULE__BUS_SLAVE = eINSTANCE.getInductiveSensorModule_BusSlave();

		/**
		 * The meta object literal for the '{@link xPPU.ModuleRepository.impl.PresenceSensorModuleImpl <em>Presence Sensor Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.ModuleRepository.impl.PresenceSensorModuleImpl
		 * @see xPPU.ModuleRepository.impl.ModuleRepositoryPackageImpl#getPresenceSensorModule()
		 * @generated
		 */
		EClass PRESENCE_SENSOR_MODULE = eINSTANCE.getPresenceSensorModule();

		/**
		 * The meta object literal for the '<em><b>Presence Sensor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESENCE_SENSOR_MODULE__PRESENCE_SENSOR = eINSTANCE.getPresenceSensorModule_PresenceSensor();

		/**
		 * The meta object literal for the '<em><b>Bus Slave</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESENCE_SENSOR_MODULE__BUS_SLAVE = eINSTANCE.getPresenceSensorModule_BusSlave();

		/**
		 * The meta object literal for the '{@link xPPU.ModuleRepository.impl.PressureSensorModuleImpl <em>Pressure Sensor Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.ModuleRepository.impl.PressureSensorModuleImpl
		 * @see xPPU.ModuleRepository.impl.ModuleRepositoryPackageImpl#getPressureSensorModule()
		 * @generated
		 */
		EClass PRESSURE_SENSOR_MODULE = eINSTANCE.getPressureSensorModule();

	}

} //ModuleRepositoryPackage
