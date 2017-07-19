/**
 */
package xPPU.InterfaceRepository;

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
 * @see xPPU.InterfaceRepository.InterfaceRepositoryFactory
 * @model kind="package"
 * @generated
 */
public interface InterfaceRepositoryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "InterfaceRepository";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "edu.kit.ipd.sdq.kaps.xppu.interfacerepository";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "InterfaceRepository";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InterfaceRepositoryPackage eINSTANCE = xPPU.InterfaceRepository.impl.InterfaceRepositoryPackageImpl.init();

	/**
	 * The meta object id for the '{@link xPPU.InterfaceRepository.impl.InterfaceRepositoryImpl <em>Interface Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.InterfaceRepository.impl.InterfaceRepositoryImpl
	 * @see xPPU.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getInterfaceRepository()
	 * @generated
	 */
	int INTERFACE_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REPOSITORY__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>All Interfaces In Plant</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REPOSITORY__ALL_INTERFACES_IN_PLANT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interface Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REPOSITORY_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Interface Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REPOSITORY_OPERATION_COUNT = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.InterfaceRepository.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.InterfaceRepository.impl.InterfaceImpl
	 * @see xPPU.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__PARENT_ELEMENT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.InterfaceRepository.impl.ScrewingImpl <em>Screwing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.InterfaceRepository.impl.ScrewingImpl
	 * @see xPPU.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getScrewing()
	 * @generated
	 */
	int SCREWING = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING__ID = INTERFACE__ID;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING__PARENT_ELEMENT = INTERFACE__PARENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Screwing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Screwing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.InterfaceRepository.impl.ScrewingSplitterImpl <em>Screwing Splitter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.InterfaceRepository.impl.ScrewingSplitterImpl
	 * @see xPPU.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getScrewingSplitter()
	 * @generated
	 */
	int SCREWING_SPLITTER = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_SPLITTER__ID = SCREWING__ID;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_SPLITTER__PARENT_ELEMENT = SCREWING__PARENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Screwing Splitter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_SPLITTER_FEATURE_COUNT = SCREWING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Screwing Splitter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_SPLITTER_OPERATION_COUNT = SCREWING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.InterfaceRepository.impl.ScrewingMotorImpl <em>Screwing Motor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.InterfaceRepository.impl.ScrewingMotorImpl
	 * @see xPPU.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getScrewingMotor()
	 * @generated
	 */
	int SCREWING_MOTOR = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_MOTOR__ID = SCREWING__ID;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_MOTOR__PARENT_ELEMENT = SCREWING__PARENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Screwing Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_MOTOR_FEATURE_COUNT = SCREWING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Screwing Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_MOTOR_OPERATION_COUNT = SCREWING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.InterfaceRepository.impl.ScrewingRackImpl <em>Screwing Rack</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.InterfaceRepository.impl.ScrewingRackImpl
	 * @see xPPU.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getScrewingRack()
	 * @generated
	 */
	int SCREWING_RACK = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_RACK__ID = SCREWING__ID;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_RACK__PARENT_ELEMENT = SCREWING__PARENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Screwing Rack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_RACK_FEATURE_COUNT = SCREWING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Screwing Rack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_RACK_OPERATION_COUNT = SCREWING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.InterfaceRepository.impl.ScrewingCylinderImpl <em>Screwing Cylinder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.InterfaceRepository.impl.ScrewingCylinderImpl
	 * @see xPPU.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getScrewingCylinder()
	 * @generated
	 */
	int SCREWING_CYLINDER = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_CYLINDER__ID = SCREWING__ID;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_CYLINDER__PARENT_ELEMENT = SCREWING__PARENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Screwing Cylinder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_CYLINDER_FEATURE_COUNT = SCREWING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Screwing Cylinder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_CYLINDER_OPERATION_COUNT = SCREWING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.InterfaceRepository.impl.ScrewingFixtureImpl <em>Screwing Fixture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.InterfaceRepository.impl.ScrewingFixtureImpl
	 * @see xPPU.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getScrewingFixture()
	 * @generated
	 */
	int SCREWING_FIXTURE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_FIXTURE__ID = SCREWING__ID;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_FIXTURE__PARENT_ELEMENT = SCREWING__PARENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Screwing Fixture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_FIXTURE_FEATURE_COUNT = SCREWING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Screwing Fixture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_FIXTURE_OPERATION_COUNT = SCREWING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.InterfaceRepository.impl.ScrewingPotentiometerImpl <em>Screwing Potentiometer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.InterfaceRepository.impl.ScrewingPotentiometerImpl
	 * @see xPPU.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getScrewingPotentiometer()
	 * @generated
	 */
	int SCREWING_POTENTIOMETER = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_POTENTIOMETER__ID = SCREWING__ID;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_POTENTIOMETER__PARENT_ELEMENT = SCREWING__PARENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Screwing Potentiometer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_POTENTIOMETER_FEATURE_COUNT = SCREWING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Screwing Potentiometer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_POTENTIOMETER_OPERATION_COUNT = SCREWING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.InterfaceRepository.impl.SuspensionImpl <em>Suspension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.InterfaceRepository.impl.SuspensionImpl
	 * @see xPPU.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getSuspension()
	 * @generated
	 */
	int SUSPENSION = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION__ID = INTERFACE__ID;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION__PARENT_ELEMENT = INTERFACE__PARENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Suspension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Suspension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.InterfaceRepository.impl.SuspensionRackImpl <em>Suspension Rack</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.InterfaceRepository.impl.SuspensionRackImpl
	 * @see xPPU.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getSuspensionRack()
	 * @generated
	 */
	int SUSPENSION_RACK = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION_RACK__ID = SUSPENSION__ID;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION_RACK__PARENT_ELEMENT = SUSPENSION__PARENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Suspension Rack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION_RACK_FEATURE_COUNT = SUSPENSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Suspension Rack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION_RACK_OPERATION_COUNT = SUSPENSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.InterfaceRepository.impl.SuspensionArmImpl <em>Suspension Arm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.InterfaceRepository.impl.SuspensionArmImpl
	 * @see xPPU.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getSuspensionArm()
	 * @generated
	 */
	int SUSPENSION_ARM = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION_ARM__ID = SUSPENSION__ID;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION_ARM__PARENT_ELEMENT = SUSPENSION__PARENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Suspension Arm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION_ARM_FEATURE_COUNT = SUSPENSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Suspension Arm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION_ARM_OPERATION_COUNT = SUSPENSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.InterfaceRepository.impl.GearingImpl <em>Gearing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.InterfaceRepository.impl.GearingImpl
	 * @see xPPU.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getGearing()
	 * @generated
	 */
	int GEARING = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEARING__ID = INTERFACE__ID;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEARING__PARENT_ELEMENT = INTERFACE__PARENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Gearing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEARING_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Gearing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEARING_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.InterfaceRepository.impl.ClampingImpl <em>Clamping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.InterfaceRepository.impl.ClampingImpl
	 * @see xPPU.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getClamping()
	 * @generated
	 */
	int CLAMPING = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAMPING__ID = INTERFACE__ID;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAMPING__PARENT_ELEMENT = INTERFACE__PARENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Clamping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAMPING_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Clamping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAMPING_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.InterfaceRepository.impl.PneumaticSupplyImpl <em>Pneumatic Supply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.InterfaceRepository.impl.PneumaticSupplyImpl
	 * @see xPPU.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getPneumaticSupply()
	 * @generated
	 */
	int PNEUMATIC_SUPPLY = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_SUPPLY__ID = INTERFACE__ID;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_SUPPLY__PARENT_ELEMENT = INTERFACE__PARENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Pneumatic Supply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_SUPPLY_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pneumatic Supply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_SUPPLY_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.InterfaceRepository.impl.SignalInterfaceImpl <em>Signal Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.InterfaceRepository.impl.SignalInterfaceImpl
	 * @see xPPU.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getSignalInterface()
	 * @generated
	 */
	int SIGNAL_INTERFACE = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_INTERFACE__ID = INTERFACE__ID;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_INTERFACE__PARENT_ELEMENT = INTERFACE__PARENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Signal Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_INTERFACE_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Signal Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_INTERFACE_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.InterfaceRepository.impl.WaterSupplyImpl <em>Water Supply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.InterfaceRepository.impl.WaterSupplyImpl
	 * @see xPPU.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getWaterSupply()
	 * @generated
	 */
	int WATER_SUPPLY = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SUPPLY__ID = INTERFACE__ID;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SUPPLY__PARENT_ELEMENT = INTERFACE__PARENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Water Supply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SUPPLY_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Water Supply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SUPPLY_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.InterfaceRepository.impl.PhysicalConnectionImpl <em>Physical Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.InterfaceRepository.impl.PhysicalConnectionImpl
	 * @see xPPU.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getPhysicalConnection()
	 * @generated
	 */
	int PHYSICAL_CONNECTION = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONNECTION__ID = INTERFACE__ID;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONNECTION__PARENT_ELEMENT = INTERFACE__PARENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Physical Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONNECTION_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Physical Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONNECTION_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.InterfaceRepository.impl.TransportConnectionImpl <em>Transport Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.InterfaceRepository.impl.TransportConnectionImpl
	 * @see xPPU.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getTransportConnection()
	 * @generated
	 */
	int TRANSPORT_CONNECTION = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_CONNECTION__ID = INTERFACE__ID;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_CONNECTION__PARENT_ELEMENT = INTERFACE__PARENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Transport Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_CONNECTION_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Transport Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_CONNECTION_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link xPPU.InterfaceRepository.InterfaceRepository <em>Interface Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Repository</em>'.
	 * @see xPPU.InterfaceRepository.InterfaceRepository
	 * @generated
	 */
	EClass getInterfaceRepository();

	/**
	 * Returns the meta object for the reference list '{@link xPPU.InterfaceRepository.InterfaceRepository#getAllInterfacesInPlant <em>All Interfaces In Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Interfaces In Plant</em>'.
	 * @see xPPU.InterfaceRepository.InterfaceRepository#getAllInterfacesInPlant()
	 * @see #getInterfaceRepository()
	 * @generated
	 */
	EReference getInterfaceRepository_AllInterfacesInPlant();

	/**
	 * Returns the meta object for class '{@link xPPU.InterfaceRepository.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see xPPU.InterfaceRepository.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the reference '{@link xPPU.InterfaceRepository.Interface#getParentElement <em>Parent Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Element</em>'.
	 * @see xPPU.InterfaceRepository.Interface#getParentElement()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_ParentElement();

	/**
	 * Returns the meta object for class '{@link xPPU.InterfaceRepository.Screwing <em>Screwing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Screwing</em>'.
	 * @see xPPU.InterfaceRepository.Screwing
	 * @generated
	 */
	EClass getScrewing();

	/**
	 * Returns the meta object for class '{@link xPPU.InterfaceRepository.ScrewingSplitter <em>Screwing Splitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Screwing Splitter</em>'.
	 * @see xPPU.InterfaceRepository.ScrewingSplitter
	 * @generated
	 */
	EClass getScrewingSplitter();

	/**
	 * Returns the meta object for class '{@link xPPU.InterfaceRepository.ScrewingMotor <em>Screwing Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Screwing Motor</em>'.
	 * @see xPPU.InterfaceRepository.ScrewingMotor
	 * @generated
	 */
	EClass getScrewingMotor();

	/**
	 * Returns the meta object for class '{@link xPPU.InterfaceRepository.ScrewingRack <em>Screwing Rack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Screwing Rack</em>'.
	 * @see xPPU.InterfaceRepository.ScrewingRack
	 * @generated
	 */
	EClass getScrewingRack();

	/**
	 * Returns the meta object for class '{@link xPPU.InterfaceRepository.ScrewingCylinder <em>Screwing Cylinder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Screwing Cylinder</em>'.
	 * @see xPPU.InterfaceRepository.ScrewingCylinder
	 * @generated
	 */
	EClass getScrewingCylinder();

	/**
	 * Returns the meta object for class '{@link xPPU.InterfaceRepository.ScrewingFixture <em>Screwing Fixture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Screwing Fixture</em>'.
	 * @see xPPU.InterfaceRepository.ScrewingFixture
	 * @generated
	 */
	EClass getScrewingFixture();

	/**
	 * Returns the meta object for class '{@link xPPU.InterfaceRepository.ScrewingPotentiometer <em>Screwing Potentiometer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Screwing Potentiometer</em>'.
	 * @see xPPU.InterfaceRepository.ScrewingPotentiometer
	 * @generated
	 */
	EClass getScrewingPotentiometer();

	/**
	 * Returns the meta object for class '{@link xPPU.InterfaceRepository.Suspension <em>Suspension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Suspension</em>'.
	 * @see xPPU.InterfaceRepository.Suspension
	 * @generated
	 */
	EClass getSuspension();

	/**
	 * Returns the meta object for class '{@link xPPU.InterfaceRepository.SuspensionRack <em>Suspension Rack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Suspension Rack</em>'.
	 * @see xPPU.InterfaceRepository.SuspensionRack
	 * @generated
	 */
	EClass getSuspensionRack();

	/**
	 * Returns the meta object for class '{@link xPPU.InterfaceRepository.SuspensionArm <em>Suspension Arm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Suspension Arm</em>'.
	 * @see xPPU.InterfaceRepository.SuspensionArm
	 * @generated
	 */
	EClass getSuspensionArm();

	/**
	 * Returns the meta object for class '{@link xPPU.InterfaceRepository.Gearing <em>Gearing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gearing</em>'.
	 * @see xPPU.InterfaceRepository.Gearing
	 * @generated
	 */
	EClass getGearing();

	/**
	 * Returns the meta object for class '{@link xPPU.InterfaceRepository.Clamping <em>Clamping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clamping</em>'.
	 * @see xPPU.InterfaceRepository.Clamping
	 * @generated
	 */
	EClass getClamping();

	/**
	 * Returns the meta object for class '{@link xPPU.InterfaceRepository.PneumaticSupply <em>Pneumatic Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pneumatic Supply</em>'.
	 * @see xPPU.InterfaceRepository.PneumaticSupply
	 * @generated
	 */
	EClass getPneumaticSupply();

	/**
	 * Returns the meta object for class '{@link xPPU.InterfaceRepository.SignalInterface <em>Signal Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Interface</em>'.
	 * @see xPPU.InterfaceRepository.SignalInterface
	 * @generated
	 */
	EClass getSignalInterface();

	/**
	 * Returns the meta object for class '{@link xPPU.InterfaceRepository.WaterSupply <em>Water Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Water Supply</em>'.
	 * @see xPPU.InterfaceRepository.WaterSupply
	 * @generated
	 */
	EClass getWaterSupply();

	/**
	 * Returns the meta object for class '{@link xPPU.InterfaceRepository.PhysicalConnection <em>Physical Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Connection</em>'.
	 * @see xPPU.InterfaceRepository.PhysicalConnection
	 * @generated
	 */
	EClass getPhysicalConnection();

	/**
	 * Returns the meta object for class '{@link xPPU.InterfaceRepository.TransportConnection <em>Transport Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transport Connection</em>'.
	 * @see xPPU.InterfaceRepository.TransportConnection
	 * @generated
	 */
	EClass getTransportConnection();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InterfaceRepositoryFactory getInterfaceRepositoryFactory();

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
		 * The meta object literal for the '{@link xPPU.InterfaceRepository.impl.InterfaceRepositoryImpl <em>Interface Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.InterfaceRepository.impl.InterfaceRepositoryImpl
		 * @see xPPU.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getInterfaceRepository()
		 * @generated
		 */
		EClass INTERFACE_REPOSITORY = eINSTANCE.getInterfaceRepository();

		/**
		 * The meta object literal for the '<em><b>All Interfaces In Plant</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_REPOSITORY__ALL_INTERFACES_IN_PLANT = eINSTANCE.getInterfaceRepository_AllInterfacesInPlant();

		/**
		 * The meta object literal for the '{@link xPPU.InterfaceRepository.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.InterfaceRepository.impl.InterfaceImpl
		 * @see xPPU.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Parent Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__PARENT_ELEMENT = eINSTANCE.getInterface_ParentElement();

		/**
		 * The meta object literal for the '{@link xPPU.InterfaceRepository.impl.ScrewingImpl <em>Screwing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.InterfaceRepository.impl.ScrewingImpl
		 * @see xPPU.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getScrewing()
		 * @generated
		 */
		EClass SCREWING = eINSTANCE.getScrewing();

		/**
		 * The meta object literal for the '{@link xPPU.InterfaceRepository.impl.ScrewingSplitterImpl <em>Screwing Splitter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.InterfaceRepository.impl.ScrewingSplitterImpl
		 * @see xPPU.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getScrewingSplitter()
		 * @generated
		 */
		EClass SCREWING_SPLITTER = eINSTANCE.getScrewingSplitter();

		/**
		 * The meta object literal for the '{@link xPPU.InterfaceRepository.impl.ScrewingMotorImpl <em>Screwing Motor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.InterfaceRepository.impl.ScrewingMotorImpl
		 * @see xPPU.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getScrewingMotor()
		 * @generated
		 */
		EClass SCREWING_MOTOR = eINSTANCE.getScrewingMotor();

		/**
		 * The meta object literal for the '{@link xPPU.InterfaceRepository.impl.ScrewingRackImpl <em>Screwing Rack</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.InterfaceRepository.impl.ScrewingRackImpl
		 * @see xPPU.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getScrewingRack()
		 * @generated
		 */
		EClass SCREWING_RACK = eINSTANCE.getScrewingRack();

		/**
		 * The meta object literal for the '{@link xPPU.InterfaceRepository.impl.ScrewingCylinderImpl <em>Screwing Cylinder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.InterfaceRepository.impl.ScrewingCylinderImpl
		 * @see xPPU.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getScrewingCylinder()
		 * @generated
		 */
		EClass SCREWING_CYLINDER = eINSTANCE.getScrewingCylinder();

		/**
		 * The meta object literal for the '{@link xPPU.InterfaceRepository.impl.ScrewingFixtureImpl <em>Screwing Fixture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.InterfaceRepository.impl.ScrewingFixtureImpl
		 * @see xPPU.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getScrewingFixture()
		 * @generated
		 */
		EClass SCREWING_FIXTURE = eINSTANCE.getScrewingFixture();

		/**
		 * The meta object literal for the '{@link xPPU.InterfaceRepository.impl.ScrewingPotentiometerImpl <em>Screwing Potentiometer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.InterfaceRepository.impl.ScrewingPotentiometerImpl
		 * @see xPPU.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getScrewingPotentiometer()
		 * @generated
		 */
		EClass SCREWING_POTENTIOMETER = eINSTANCE.getScrewingPotentiometer();

		/**
		 * The meta object literal for the '{@link xPPU.InterfaceRepository.impl.SuspensionImpl <em>Suspension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.InterfaceRepository.impl.SuspensionImpl
		 * @see xPPU.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getSuspension()
		 * @generated
		 */
		EClass SUSPENSION = eINSTANCE.getSuspension();

		/**
		 * The meta object literal for the '{@link xPPU.InterfaceRepository.impl.SuspensionRackImpl <em>Suspension Rack</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.InterfaceRepository.impl.SuspensionRackImpl
		 * @see xPPU.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getSuspensionRack()
		 * @generated
		 */
		EClass SUSPENSION_RACK = eINSTANCE.getSuspensionRack();

		/**
		 * The meta object literal for the '{@link xPPU.InterfaceRepository.impl.SuspensionArmImpl <em>Suspension Arm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.InterfaceRepository.impl.SuspensionArmImpl
		 * @see xPPU.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getSuspensionArm()
		 * @generated
		 */
		EClass SUSPENSION_ARM = eINSTANCE.getSuspensionArm();

		/**
		 * The meta object literal for the '{@link xPPU.InterfaceRepository.impl.GearingImpl <em>Gearing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.InterfaceRepository.impl.GearingImpl
		 * @see xPPU.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getGearing()
		 * @generated
		 */
		EClass GEARING = eINSTANCE.getGearing();

		/**
		 * The meta object literal for the '{@link xPPU.InterfaceRepository.impl.ClampingImpl <em>Clamping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.InterfaceRepository.impl.ClampingImpl
		 * @see xPPU.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getClamping()
		 * @generated
		 */
		EClass CLAMPING = eINSTANCE.getClamping();

		/**
		 * The meta object literal for the '{@link xPPU.InterfaceRepository.impl.PneumaticSupplyImpl <em>Pneumatic Supply</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.InterfaceRepository.impl.PneumaticSupplyImpl
		 * @see xPPU.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getPneumaticSupply()
		 * @generated
		 */
		EClass PNEUMATIC_SUPPLY = eINSTANCE.getPneumaticSupply();

		/**
		 * The meta object literal for the '{@link xPPU.InterfaceRepository.impl.SignalInterfaceImpl <em>Signal Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.InterfaceRepository.impl.SignalInterfaceImpl
		 * @see xPPU.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getSignalInterface()
		 * @generated
		 */
		EClass SIGNAL_INTERFACE = eINSTANCE.getSignalInterface();

		/**
		 * The meta object literal for the '{@link xPPU.InterfaceRepository.impl.WaterSupplyImpl <em>Water Supply</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.InterfaceRepository.impl.WaterSupplyImpl
		 * @see xPPU.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getWaterSupply()
		 * @generated
		 */
		EClass WATER_SUPPLY = eINSTANCE.getWaterSupply();

		/**
		 * The meta object literal for the '{@link xPPU.InterfaceRepository.impl.PhysicalConnectionImpl <em>Physical Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.InterfaceRepository.impl.PhysicalConnectionImpl
		 * @see xPPU.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getPhysicalConnection()
		 * @generated
		 */
		EClass PHYSICAL_CONNECTION = eINSTANCE.getPhysicalConnection();

		/**
		 * The meta object literal for the '{@link xPPU.InterfaceRepository.impl.TransportConnectionImpl <em>Transport Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.InterfaceRepository.impl.TransportConnectionImpl
		 * @see xPPU.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getTransportConnection()
		 * @generated
		 */
		EClass TRANSPORT_CONNECTION = eINSTANCE.getTransportConnection();

	}

} //InterfaceRepositoryPackage
