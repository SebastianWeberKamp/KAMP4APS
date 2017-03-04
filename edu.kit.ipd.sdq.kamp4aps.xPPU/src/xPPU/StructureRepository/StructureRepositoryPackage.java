/**
 */
package xPPU.StructureRepository;

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
 * @see xPPU.StructureRepository.StructureRepositoryFactory
 * @model kind="package"
 * @generated
 */
public interface StructureRepositoryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "StructureRepository";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "edu.kit.ipd.sdq.kaps.xppu.structurerepository";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "StructureRepository";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StructureRepositoryPackage eINSTANCE = xPPU.StructureRepository.impl.StructureRepositoryPackageImpl.init();

	/**
	 * The meta object id for the '{@link xPPU.StructureRepository.impl.StructureImpl <em>Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.StructureRepository.impl.StructureImpl
	 * @see xPPU.StructureRepository.impl.StructureRepositoryPackageImpl#getStructure()
	 * @generated
	 */
	int STRUCTURE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Parent Plant</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__PARENT_PLANT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__MODULES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__COMPONENTS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_OPERATION_COUNT = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.StructureRepository.impl.CommunicationNetworkImpl <em>Communication Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.StructureRepository.impl.CommunicationNetworkImpl
	 * @see xPPU.StructureRepository.impl.StructureRepositoryPackageImpl#getCommunicationNetwork()
	 * @generated
	 */
	int COMMUNICATION_NETWORK = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_NETWORK__ID = STRUCTURE__ID;

	/**
	 * The feature id for the '<em><b>Parent Plant</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_NETWORK__PARENT_PLANT = STRUCTURE__PARENT_PLANT;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_NETWORK__MODULES = STRUCTURE__MODULES;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_NETWORK__COMPONENTS = STRUCTURE__COMPONENTS;

	/**
	 * The number of structural features of the '<em>Communication Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_NETWORK_FEATURE_COUNT = STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Communication Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_NETWORK_OPERATION_COUNT = STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.StructureRepository.impl.PowerNetworkImpl <em>Power Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.StructureRepository.impl.PowerNetworkImpl
	 * @see xPPU.StructureRepository.impl.StructureRepositoryPackageImpl#getPowerNetwork()
	 * @generated
	 */
	int POWER_NETWORK = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_NETWORK__ID = STRUCTURE__ID;

	/**
	 * The feature id for the '<em><b>Parent Plant</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_NETWORK__PARENT_PLANT = STRUCTURE__PARENT_PLANT;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_NETWORK__MODULES = STRUCTURE__MODULES;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_NETWORK__COMPONENTS = STRUCTURE__COMPONENTS;

	/**
	 * The number of structural features of the '<em>Power Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_NETWORK_FEATURE_COUNT = STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Power Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_NETWORK_OPERATION_COUNT = STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.StructureRepository.impl.ControlCabinetImpl <em>Control Cabinet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.StructureRepository.impl.ControlCabinetImpl
	 * @see xPPU.StructureRepository.impl.StructureRepositoryPackageImpl#getControlCabinet()
	 * @generated
	 */
	int CONTROL_CABINET = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CABINET__ID = STRUCTURE__ID;

	/**
	 * The feature id for the '<em><b>Parent Plant</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CABINET__PARENT_PLANT = STRUCTURE__PARENT_PLANT;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CABINET__MODULES = STRUCTURE__MODULES;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CABINET__COMPONENTS = STRUCTURE__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CABINET__CONTROLLER = STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control Cabinet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CABINET_FEATURE_COUNT = STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Control Cabinet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CABINET_OPERATION_COUNT = STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.StructureRepository.impl.PneumaticNetworkImpl <em>Pneumatic Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.StructureRepository.impl.PneumaticNetworkImpl
	 * @see xPPU.StructureRepository.impl.StructureRepositoryPackageImpl#getPneumaticNetwork()
	 * @generated
	 */
	int PNEUMATIC_NETWORK = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_NETWORK__ID = STRUCTURE__ID;

	/**
	 * The feature id for the '<em><b>Parent Plant</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_NETWORK__PARENT_PLANT = STRUCTURE__PARENT_PLANT;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_NETWORK__MODULES = STRUCTURE__MODULES;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_NETWORK__COMPONENTS = STRUCTURE__COMPONENTS;

	/**
	 * The number of structural features of the '<em>Pneumatic Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_NETWORK_FEATURE_COUNT = STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pneumatic Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_NETWORK_OPERATION_COUNT = STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.StructureRepository.impl.ConveyorImpl <em>Conveyor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.StructureRepository.impl.ConveyorImpl
	 * @see xPPU.StructureRepository.impl.StructureRepositoryPackageImpl#getConveyor()
	 * @generated
	 */
	int CONVEYOR = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__ID = STRUCTURE__ID;

	/**
	 * The feature id for the '<em><b>Parent Plant</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__PARENT_PLANT = STRUCTURE__PARENT_PLANT;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__MODULES = STRUCTURE__MODULES;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__COMPONENTS = STRUCTURE__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Belts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__BELTS = STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Conveyor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_FEATURE_COUNT = STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Conveyor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_OPERATION_COUNT = STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.StructureRepository.impl.CraneImpl <em>Crane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.StructureRepository.impl.CraneImpl
	 * @see xPPU.StructureRepository.impl.StructureRepositoryPackageImpl#getCrane()
	 * @generated
	 */
	int CRANE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRANE__ID = STRUCTURE__ID;

	/**
	 * The feature id for the '<em><b>Parent Plant</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRANE__PARENT_PLANT = STRUCTURE__PARENT_PLANT;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRANE__MODULES = STRUCTURE__MODULES;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRANE__COMPONENTS = STRUCTURE__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Arm</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRANE__ARM = STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mounted On</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRANE__MOUNTED_ON = STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vacuumgripper</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRANE__VACUUMGRIPPER = STRUCTURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Crane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRANE_FEATURE_COUNT = STRUCTURE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Crane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRANE_OPERATION_COUNT = STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.StructureRepository.impl.PowerWiringImpl <em>Power Wiring</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.StructureRepository.impl.PowerWiringImpl
	 * @see xPPU.StructureRepository.impl.StructureRepositoryPackageImpl#getPowerWiring()
	 * @generated
	 */
	int POWER_WIRING = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_WIRING__ID = STRUCTURE__ID;

	/**
	 * The feature id for the '<em><b>Parent Plant</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_WIRING__PARENT_PLANT = STRUCTURE__PARENT_PLANT;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_WIRING__MODULES = STRUCTURE__MODULES;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_WIRING__COMPONENTS = STRUCTURE__COMPONENTS;

	/**
	 * The number of structural features of the '<em>Power Wiring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_WIRING_FEATURE_COUNT = STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Power Wiring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_WIRING_OPERATION_COUNT = STRUCTURE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link xPPU.StructureRepository.Structure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure</em>'.
	 * @see xPPU.StructureRepository.Structure
	 * @generated
	 */
	EClass getStructure();

	/**
	 * Returns the meta object for the container reference '{@link xPPU.StructureRepository.Structure#getParentPlant <em>Parent Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Plant</em>'.
	 * @see xPPU.StructureRepository.Structure#getParentPlant()
	 * @see #getStructure()
	 * @generated
	 */
	EReference getStructure_ParentPlant();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.StructureRepository.Structure#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modules</em>'.
	 * @see xPPU.StructureRepository.Structure#getModules()
	 * @see #getStructure()
	 * @generated
	 */
	EReference getStructure_Modules();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.StructureRepository.Structure#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see xPPU.StructureRepository.Structure#getComponents()
	 * @see #getStructure()
	 * @generated
	 */
	EReference getStructure_Components();

	/**
	 * Returns the meta object for class '{@link xPPU.StructureRepository.CommunicationNetwork <em>Communication Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Network</em>'.
	 * @see xPPU.StructureRepository.CommunicationNetwork
	 * @generated
	 */
	EClass getCommunicationNetwork();

	/**
	 * Returns the meta object for class '{@link xPPU.StructureRepository.PowerNetwork <em>Power Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Network</em>'.
	 * @see xPPU.StructureRepository.PowerNetwork
	 * @generated
	 */
	EClass getPowerNetwork();

	/**
	 * Returns the meta object for class '{@link xPPU.StructureRepository.ControlCabinet <em>Control Cabinet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Cabinet</em>'.
	 * @see xPPU.StructureRepository.ControlCabinet
	 * @generated
	 */
	EClass getControlCabinet();

	/**
	 * Returns the meta object for the reference '{@link xPPU.StructureRepository.ControlCabinet#getController <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Controller</em>'.
	 * @see xPPU.StructureRepository.ControlCabinet#getController()
	 * @see #getControlCabinet()
	 * @generated
	 */
	EReference getControlCabinet_Controller();

	/**
	 * Returns the meta object for class '{@link xPPU.StructureRepository.PneumaticNetwork <em>Pneumatic Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pneumatic Network</em>'.
	 * @see xPPU.StructureRepository.PneumaticNetwork
	 * @generated
	 */
	EClass getPneumaticNetwork();

	/**
	 * Returns the meta object for class '{@link xPPU.StructureRepository.Conveyor <em>Conveyor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conveyor</em>'.
	 * @see xPPU.StructureRepository.Conveyor
	 * @generated
	 */
	EClass getConveyor();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.StructureRepository.Conveyor#getBelts <em>Belts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Belts</em>'.
	 * @see xPPU.StructureRepository.Conveyor#getBelts()
	 * @see #getConveyor()
	 * @generated
	 */
	EReference getConveyor_Belts();

	/**
	 * Returns the meta object for class '{@link xPPU.StructureRepository.Crane <em>Crane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Crane</em>'.
	 * @see xPPU.StructureRepository.Crane
	 * @generated
	 */
	EClass getCrane();

	/**
	 * Returns the meta object for the reference list '{@link xPPU.StructureRepository.Crane#getArm <em>Arm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arm</em>'.
	 * @see xPPU.StructureRepository.Crane#getArm()
	 * @see #getCrane()
	 * @generated
	 */
	EReference getCrane_Arm();

	/**
	 * Returns the meta object for the containment reference list '{@link xPPU.StructureRepository.Crane#getMountedOn <em>Mounted On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mounted On</em>'.
	 * @see xPPU.StructureRepository.Crane#getMountedOn()
	 * @see #getCrane()
	 * @generated
	 */
	EReference getCrane_MountedOn();

	/**
	 * Returns the meta object for the reference list '{@link xPPU.StructureRepository.Crane#getVacuumgripper <em>Vacuumgripper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vacuumgripper</em>'.
	 * @see xPPU.StructureRepository.Crane#getVacuumgripper()
	 * @see #getCrane()
	 * @generated
	 */
	EReference getCrane_Vacuumgripper();

	/**
	 * Returns the meta object for class '{@link xPPU.StructureRepository.PowerWiring <em>Power Wiring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Wiring</em>'.
	 * @see xPPU.StructureRepository.PowerWiring
	 * @generated
	 */
	EClass getPowerWiring();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StructureRepositoryFactory getStructureRepositoryFactory();

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
		 * The meta object literal for the '{@link xPPU.StructureRepository.impl.StructureImpl <em>Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.StructureRepository.impl.StructureImpl
		 * @see xPPU.StructureRepository.impl.StructureRepositoryPackageImpl#getStructure()
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
		 * The meta object literal for the '{@link xPPU.StructureRepository.impl.CommunicationNetworkImpl <em>Communication Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.StructureRepository.impl.CommunicationNetworkImpl
		 * @see xPPU.StructureRepository.impl.StructureRepositoryPackageImpl#getCommunicationNetwork()
		 * @generated
		 */
		EClass COMMUNICATION_NETWORK = eINSTANCE.getCommunicationNetwork();

		/**
		 * The meta object literal for the '{@link xPPU.StructureRepository.impl.PowerNetworkImpl <em>Power Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.StructureRepository.impl.PowerNetworkImpl
		 * @see xPPU.StructureRepository.impl.StructureRepositoryPackageImpl#getPowerNetwork()
		 * @generated
		 */
		EClass POWER_NETWORK = eINSTANCE.getPowerNetwork();

		/**
		 * The meta object literal for the '{@link xPPU.StructureRepository.impl.ControlCabinetImpl <em>Control Cabinet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.StructureRepository.impl.ControlCabinetImpl
		 * @see xPPU.StructureRepository.impl.StructureRepositoryPackageImpl#getControlCabinet()
		 * @generated
		 */
		EClass CONTROL_CABINET = eINSTANCE.getControlCabinet();

		/**
		 * The meta object literal for the '<em><b>Controller</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_CABINET__CONTROLLER = eINSTANCE.getControlCabinet_Controller();

		/**
		 * The meta object literal for the '{@link xPPU.StructureRepository.impl.PneumaticNetworkImpl <em>Pneumatic Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.StructureRepository.impl.PneumaticNetworkImpl
		 * @see xPPU.StructureRepository.impl.StructureRepositoryPackageImpl#getPneumaticNetwork()
		 * @generated
		 */
		EClass PNEUMATIC_NETWORK = eINSTANCE.getPneumaticNetwork();

		/**
		 * The meta object literal for the '{@link xPPU.StructureRepository.impl.ConveyorImpl <em>Conveyor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.StructureRepository.impl.ConveyorImpl
		 * @see xPPU.StructureRepository.impl.StructureRepositoryPackageImpl#getConveyor()
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
		 * The meta object literal for the '{@link xPPU.StructureRepository.impl.CraneImpl <em>Crane</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.StructureRepository.impl.CraneImpl
		 * @see xPPU.StructureRepository.impl.StructureRepositoryPackageImpl#getCrane()
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
		 * The meta object literal for the '<em><b>Mounted On</b></em>' containment reference list feature.
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
		 * The meta object literal for the '{@link xPPU.StructureRepository.impl.PowerWiringImpl <em>Power Wiring</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.StructureRepository.impl.PowerWiringImpl
		 * @see xPPU.StructureRepository.impl.StructureRepositoryPackageImpl#getPowerWiring()
		 * @generated
		 */
		EClass POWER_WIRING = eINSTANCE.getPowerWiring();

	}

} //StructureRepositoryPackage
