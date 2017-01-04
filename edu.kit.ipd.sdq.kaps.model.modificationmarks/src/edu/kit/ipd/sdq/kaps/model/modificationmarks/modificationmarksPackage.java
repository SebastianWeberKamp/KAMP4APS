/**
 */
package edu.kit.ipd.sdq.kaps.model.modificationmarks;

import edu.kit.ipd.sdq.amp.model.modificationmarks.ModificationmarksPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.modificationmarksFactory
 * @model kind="package"
 * @generated
 */
public interface modificationmarksPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "modificationmarks";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.kit.edu/KAPSModificationmarks/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "modificationmarks";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	modificationmarksPackage eINSTANCE = edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.modificationmarksPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.AbstractKAPSModificationRepositoryImpl <em>Abstract KAPS Modification Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.AbstractKAPSModificationRepositoryImpl
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.modificationmarksPackageImpl#getAbstractKAPSModificationRepository()
	 * @generated
	 */
	int ABSTRACT_KAPS_MODIFICATION_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Seed Modifications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_KAPS_MODIFICATION_REPOSITORY__SEED_MODIFICATIONS = ModificationmarksPackage.ABSTRACT_MODIFICATION_REPOSITORY__SEED_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Change Propagation Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_KAPS_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS = ModificationmarksPackage.ABSTRACT_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS;

	/**
	 * The number of structural features of the '<em>Abstract KAPS Modification Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_KAPS_MODIFICATION_REPOSITORY_FEATURE_COUNT = ModificationmarksPackage.ABSTRACT_MODIFICATION_REPOSITORY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.KAPSModificationRepositoryImpl <em>KAPS Modification Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.KAPSModificationRepositoryImpl
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.modificationmarksPackageImpl#getKAPSModificationRepository()
	 * @generated
	 */
	int KAPS_MODIFICATION_REPOSITORY = 1;

	/**
	 * The feature id for the '<em><b>Seed Modifications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAPS_MODIFICATION_REPOSITORY__SEED_MODIFICATIONS = ABSTRACT_KAPS_MODIFICATION_REPOSITORY__SEED_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Change Propagation Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAPS_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS = ABSTRACT_KAPS_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS;

	/**
	 * The number of structural features of the '<em>KAPS Modification Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAPS_MODIFICATION_REPOSITORY_FEATURE_COUNT = ABSTRACT_KAPS_MODIFICATION_REPOSITORY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.KAPSSeedModificationsImpl <em>KAPS Seed Modifications</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.KAPSSeedModificationsImpl
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.modificationmarksPackageImpl#getKAPSSeedModifications()
	 * @generated
	 */
	int KAPS_SEED_MODIFICATIONS = 2;

	/**
	 * The feature id for the '<em><b>Bus Box Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAPS_SEED_MODIFICATIONS__BUS_BOX_MODIFICATIONS = ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sensor Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAPS_SEED_MODIFICATIONS__SENSOR_MODIFICATIONS = ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bus Master Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAPS_SEED_MODIFICATIONS__BUS_MASTER_MODIFICATIONS = ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bus Slave Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAPS_SEED_MODIFICATIONS__BUS_SLAVE_MODIFICATIONS = ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Microswitch Module Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAPS_SEED_MODIFICATIONS__MICROSWITCH_MODULE_MODIFICATIONS = ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>KAPS Seed Modifications</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAPS_SEED_MODIFICATIONS_FEATURE_COUNT = ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.ModifySensorImpl <em>Modify Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.ModifySensorImpl
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.modificationmarksPackageImpl#getModifySensor()
	 * @generated
	 */
	int MODIFY_SENSOR = 3;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_SENSOR__AFFECTED_ELEMENT = ModificationmarksPackage.ABSTRACT_MODIFICATION__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_SENSOR__CAUSING_ELEMENTS = ModificationmarksPackage.ABSTRACT_MODIFICATION__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_SENSOR__ID = ModificationmarksPackage.ABSTRACT_MODIFICATION__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_SENSOR__TOOLDERIVED = ModificationmarksPackage.ABSTRACT_MODIFICATION__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_SENSOR__USER_DECISION = ModificationmarksPackage.ABSTRACT_MODIFICATION__USER_DECISION;

	/**
	 * The feature id for the '<em><b>Modify Signal Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_SENSOR__MODIFY_SIGNAL_INTERFACES = ModificationmarksPackage.ABSTRACT_MODIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modify Physical Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_SENSOR__MODIFY_PHYSICAL_CONNECTIONS = ModificationmarksPackage.ABSTRACT_MODIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Modify Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_SENSOR_FEATURE_COUNT = ModificationmarksPackage.ABSTRACT_MODIFICATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.ChangePropagationDueToHardwareChangeImpl <em>Change Propagation Due To Hardware Change</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.ChangePropagationDueToHardwareChangeImpl
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.modificationmarksPackageImpl#getChangePropagationDueToHardwareChange()
	 * @generated
	 */
	int CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE = 4;

	/**
	 * The feature id for the '<em><b>Sensor Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__SENSOR_MODIFICATIONS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Signalinterface Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__SIGNALINTERFACE_MODIFICATIONS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Physical Connection Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__PHYSICAL_CONNECTION_MODIFICATIONS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Micro Switch Module Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__MICRO_SWITCH_MODULE_MODIFICATIONS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Bus Box Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_BOX_MODIFICATIONS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Bus Master Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_MASTER_MODIFICATIONS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Bus Slave Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_SLAVE_MODIFICATIONS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Bus Cable Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_CABLE_MODIFICATIONS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Change Propagation Due To Hardware Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE_FEATURE_COUNT = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.ModifyEntityImpl <em>Modify Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.ModifyEntityImpl
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.modificationmarksPackageImpl#getModifyEntity()
	 * @generated
	 */
	int MODIFY_ENTITY = 5;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_ENTITY__AFFECTED_ELEMENT = ModificationmarksPackage.ABSTRACT_MODIFICATION__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_ENTITY__CAUSING_ELEMENTS = ModificationmarksPackage.ABSTRACT_MODIFICATION__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_ENTITY__ID = ModificationmarksPackage.ABSTRACT_MODIFICATION__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_ENTITY__TOOLDERIVED = ModificationmarksPackage.ABSTRACT_MODIFICATION__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_ENTITY__USER_DECISION = ModificationmarksPackage.ABSTRACT_MODIFICATION__USER_DECISION;

	/**
	 * The number of structural features of the '<em>Modify Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_ENTITY_FEATURE_COUNT = ModificationmarksPackage.ABSTRACT_MODIFICATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.ModifyBusBoxImpl <em>Modify Bus Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.ModifyBusBoxImpl
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.modificationmarksPackageImpl#getModifyBusBox()
	 * @generated
	 */
	int MODIFY_BUS_BOX = 6;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_BOX__AFFECTED_ELEMENT = ModificationmarksPackage.ABSTRACT_MODIFICATION__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_BOX__CAUSING_ELEMENTS = ModificationmarksPackage.ABSTRACT_MODIFICATION__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_BOX__ID = ModificationmarksPackage.ABSTRACT_MODIFICATION__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_BOX__TOOLDERIVED = ModificationmarksPackage.ABSTRACT_MODIFICATION__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_BOX__USER_DECISION = ModificationmarksPackage.ABSTRACT_MODIFICATION__USER_DECISION;

	/**
	 * The number of structural features of the '<em>Modify Bus Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_BOX_FEATURE_COUNT = ModificationmarksPackage.ABSTRACT_MODIFICATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.ModifyPowerSupplyImpl <em>Modify Power Supply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.ModifyPowerSupplyImpl
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.modificationmarksPackageImpl#getModifyPowerSupply()
	 * @generated
	 */
	int MODIFY_POWER_SUPPLY = 7;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_POWER_SUPPLY__AFFECTED_ELEMENT = ModificationmarksPackage.ABSTRACT_MODIFICATION__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_POWER_SUPPLY__CAUSING_ELEMENTS = ModificationmarksPackage.ABSTRACT_MODIFICATION__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_POWER_SUPPLY__ID = ModificationmarksPackage.ABSTRACT_MODIFICATION__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_POWER_SUPPLY__TOOLDERIVED = ModificationmarksPackage.ABSTRACT_MODIFICATION__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_POWER_SUPPLY__USER_DECISION = ModificationmarksPackage.ABSTRACT_MODIFICATION__USER_DECISION;

	/**
	 * The number of structural features of the '<em>Modify Power Supply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_POWER_SUPPLY_FEATURE_COUNT = ModificationmarksPackage.ABSTRACT_MODIFICATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.ModifySignalinterfaceImpl <em>Modify Signalinterface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.ModifySignalinterfaceImpl
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.modificationmarksPackageImpl#getModifySignalinterface()
	 * @generated
	 */
	int MODIFY_SIGNALINTERFACE = 8;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_SIGNALINTERFACE__AFFECTED_ELEMENT = ModificationmarksPackage.ABSTRACT_MODIFICATION__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_SIGNALINTERFACE__CAUSING_ELEMENTS = ModificationmarksPackage.ABSTRACT_MODIFICATION__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_SIGNALINTERFACE__ID = ModificationmarksPackage.ABSTRACT_MODIFICATION__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_SIGNALINTERFACE__TOOLDERIVED = ModificationmarksPackage.ABSTRACT_MODIFICATION__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_SIGNALINTERFACE__USER_DECISION = ModificationmarksPackage.ABSTRACT_MODIFICATION__USER_DECISION;

	/**
	 * The number of structural features of the '<em>Modify Signalinterface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_SIGNALINTERFACE_FEATURE_COUNT = ModificationmarksPackage.ABSTRACT_MODIFICATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.ModifyPhysicalConnectionImpl <em>Modify Physical Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.ModifyPhysicalConnectionImpl
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.modificationmarksPackageImpl#getModifyPhysicalConnection()
	 * @generated
	 */
	int MODIFY_PHYSICAL_CONNECTION = 9;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_PHYSICAL_CONNECTION__AFFECTED_ELEMENT = ModificationmarksPackage.ABSTRACT_MODIFICATION__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_PHYSICAL_CONNECTION__CAUSING_ELEMENTS = ModificationmarksPackage.ABSTRACT_MODIFICATION__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_PHYSICAL_CONNECTION__ID = ModificationmarksPackage.ABSTRACT_MODIFICATION__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_PHYSICAL_CONNECTION__TOOLDERIVED = ModificationmarksPackage.ABSTRACT_MODIFICATION__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_PHYSICAL_CONNECTION__USER_DECISION = ModificationmarksPackage.ABSTRACT_MODIFICATION__USER_DECISION;

	/**
	 * The number of structural features of the '<em>Modify Physical Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_PHYSICAL_CONNECTION_FEATURE_COUNT = ModificationmarksPackage.ABSTRACT_MODIFICATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.ModifyMicroSwitchModuleImpl <em>Modify Micro Switch Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.ModifyMicroSwitchModuleImpl
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.modificationmarksPackageImpl#getModifyMicroSwitchModule()
	 * @generated
	 */
	int MODIFY_MICRO_SWITCH_MODULE = 10;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_MICRO_SWITCH_MODULE__AFFECTED_ELEMENT = ModificationmarksPackage.ABSTRACT_MODIFICATION__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_MICRO_SWITCH_MODULE__CAUSING_ELEMENTS = ModificationmarksPackage.ABSTRACT_MODIFICATION__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_MICRO_SWITCH_MODULE__ID = ModificationmarksPackage.ABSTRACT_MODIFICATION__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_MICRO_SWITCH_MODULE__TOOLDERIVED = ModificationmarksPackage.ABSTRACT_MODIFICATION__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_MICRO_SWITCH_MODULE__USER_DECISION = ModificationmarksPackage.ABSTRACT_MODIFICATION__USER_DECISION;

	/**
	 * The feature id for the '<em><b>Is Replaced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_MICRO_SWITCH_MODULE__IS_REPLACED = ModificationmarksPackage.ABSTRACT_MODIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Modify Micro Switch Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_MICRO_SWITCH_MODULE_FEATURE_COUNT = ModificationmarksPackage.ABSTRACT_MODIFICATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.ModifyBusMasterImpl <em>Modify Bus Master</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.ModifyBusMasterImpl
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.modificationmarksPackageImpl#getModifyBusMaster()
	 * @generated
	 */
	int MODIFY_BUS_MASTER = 11;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_MASTER__AFFECTED_ELEMENT = ModificationmarksPackage.ABSTRACT_MODIFICATION__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_MASTER__CAUSING_ELEMENTS = ModificationmarksPackage.ABSTRACT_MODIFICATION__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_MASTER__ID = ModificationmarksPackage.ABSTRACT_MODIFICATION__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_MASTER__TOOLDERIVED = ModificationmarksPackage.ABSTRACT_MODIFICATION__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_MASTER__USER_DECISION = ModificationmarksPackage.ABSTRACT_MODIFICATION__USER_DECISION;

	/**
	 * The number of structural features of the '<em>Modify Bus Master</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_MASTER_FEATURE_COUNT = ModificationmarksPackage.ABSTRACT_MODIFICATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.ModifyBusSlaveImpl <em>Modify Bus Slave</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.ModifyBusSlaveImpl
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.modificationmarksPackageImpl#getModifyBusSlave()
	 * @generated
	 */
	int MODIFY_BUS_SLAVE = 12;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_SLAVE__AFFECTED_ELEMENT = ModificationmarksPackage.ABSTRACT_MODIFICATION__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_SLAVE__CAUSING_ELEMENTS = ModificationmarksPackage.ABSTRACT_MODIFICATION__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_SLAVE__ID = ModificationmarksPackage.ABSTRACT_MODIFICATION__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_SLAVE__TOOLDERIVED = ModificationmarksPackage.ABSTRACT_MODIFICATION__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_SLAVE__USER_DECISION = ModificationmarksPackage.ABSTRACT_MODIFICATION__USER_DECISION;

	/**
	 * The number of structural features of the '<em>Modify Bus Slave</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_SLAVE_FEATURE_COUNT = ModificationmarksPackage.ABSTRACT_MODIFICATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.ModifyBusCableImpl <em>Modify Bus Cable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.ModifyBusCableImpl
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.modificationmarksPackageImpl#getModifyBusCable()
	 * @generated
	 */
	int MODIFY_BUS_CABLE = 13;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_CABLE__AFFECTED_ELEMENT = ModificationmarksPackage.ABSTRACT_MODIFICATION__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_CABLE__CAUSING_ELEMENTS = ModificationmarksPackage.ABSTRACT_MODIFICATION__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_CABLE__ID = ModificationmarksPackage.ABSTRACT_MODIFICATION__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_CABLE__TOOLDERIVED = ModificationmarksPackage.ABSTRACT_MODIFICATION__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_CABLE__USER_DECISION = ModificationmarksPackage.ABSTRACT_MODIFICATION__USER_DECISION;

	/**
	 * The number of structural features of the '<em>Modify Bus Cable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_CABLE_FEATURE_COUNT = ModificationmarksPackage.ABSTRACT_MODIFICATION_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.AbstractKAPSModificationRepository <em>Abstract KAPS Modification Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract KAPS Modification Repository</em>'.
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.AbstractKAPSModificationRepository
	 * @generated
	 */
	EClass getAbstractKAPSModificationRepository();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.KAPSModificationRepository <em>KAPS Modification Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KAPS Modification Repository</em>'.
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.KAPSModificationRepository
	 * @generated
	 */
	EClass getKAPSModificationRepository();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.KAPSSeedModifications <em>KAPS Seed Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KAPS Seed Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.KAPSSeedModifications
	 * @generated
	 */
	EClass getKAPSSeedModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.KAPSSeedModifications#getBusBoxModifications <em>Bus Box Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bus Box Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.KAPSSeedModifications#getBusBoxModifications()
	 * @see #getKAPSSeedModifications()
	 * @generated
	 */
	EReference getKAPSSeedModifications_BusBoxModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.KAPSSeedModifications#getSensorModifications <em>Sensor Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sensor Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.KAPSSeedModifications#getSensorModifications()
	 * @see #getKAPSSeedModifications()
	 * @generated
	 */
	EReference getKAPSSeedModifications_SensorModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.KAPSSeedModifications#getBusMasterModifications <em>Bus Master Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bus Master Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.KAPSSeedModifications#getBusMasterModifications()
	 * @see #getKAPSSeedModifications()
	 * @generated
	 */
	EReference getKAPSSeedModifications_BusMasterModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.KAPSSeedModifications#getBusSlaveModifications <em>Bus Slave Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bus Slave Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.KAPSSeedModifications#getBusSlaveModifications()
	 * @see #getKAPSSeedModifications()
	 * @generated
	 */
	EReference getKAPSSeedModifications_BusSlaveModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.KAPSSeedModifications#getMicroswitchModuleModifications <em>Microswitch Module Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Microswitch Module Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.KAPSSeedModifications#getMicroswitchModuleModifications()
	 * @see #getKAPSSeedModifications()
	 * @generated
	 */
	EReference getKAPSSeedModifications_MicroswitchModuleModifications();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifySensor <em>Modify Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modify Sensor</em>'.
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifySensor
	 * @generated
	 */
	EClass getModifySensor();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifySensor#getModifySignalInterfaces <em>Modify Signal Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modify Signal Interfaces</em>'.
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifySensor#getModifySignalInterfaces()
	 * @see #getModifySensor()
	 * @generated
	 */
	EReference getModifySensor_ModifySignalInterfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifySensor#getModifyPhysicalConnections <em>Modify Physical Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modify Physical Connections</em>'.
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifySensor#getModifyPhysicalConnections()
	 * @see #getModifySensor()
	 * @generated
	 */
	EReference getModifySensor_ModifyPhysicalConnections();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.ChangePropagationDueToHardwareChange <em>Change Propagation Due To Hardware Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Propagation Due To Hardware Change</em>'.
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.ChangePropagationDueToHardwareChange
	 * @generated
	 */
	EClass getChangePropagationDueToHardwareChange();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.ChangePropagationDueToHardwareChange#getSensorModifications <em>Sensor Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sensor Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.ChangePropagationDueToHardwareChange#getSensorModifications()
	 * @see #getChangePropagationDueToHardwareChange()
	 * @generated
	 */
	EReference getChangePropagationDueToHardwareChange_SensorModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.ChangePropagationDueToHardwareChange#getSignalinterfaceModifications <em>Signalinterface Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signalinterface Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.ChangePropagationDueToHardwareChange#getSignalinterfaceModifications()
	 * @see #getChangePropagationDueToHardwareChange()
	 * @generated
	 */
	EReference getChangePropagationDueToHardwareChange_SignalinterfaceModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.ChangePropagationDueToHardwareChange#getPhysicalConnectionModifications <em>Physical Connection Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Physical Connection Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.ChangePropagationDueToHardwareChange#getPhysicalConnectionModifications()
	 * @see #getChangePropagationDueToHardwareChange()
	 * @generated
	 */
	EReference getChangePropagationDueToHardwareChange_PhysicalConnectionModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.ChangePropagationDueToHardwareChange#getMicroSwitchModuleModifications <em>Micro Switch Module Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Micro Switch Module Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.ChangePropagationDueToHardwareChange#getMicroSwitchModuleModifications()
	 * @see #getChangePropagationDueToHardwareChange()
	 * @generated
	 */
	EReference getChangePropagationDueToHardwareChange_MicroSwitchModuleModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.ChangePropagationDueToHardwareChange#getBusBoxModifications <em>Bus Box Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bus Box Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.ChangePropagationDueToHardwareChange#getBusBoxModifications()
	 * @see #getChangePropagationDueToHardwareChange()
	 * @generated
	 */
	EReference getChangePropagationDueToHardwareChange_BusBoxModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.ChangePropagationDueToHardwareChange#getBusMasterModifications <em>Bus Master Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bus Master Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.ChangePropagationDueToHardwareChange#getBusMasterModifications()
	 * @see #getChangePropagationDueToHardwareChange()
	 * @generated
	 */
	EReference getChangePropagationDueToHardwareChange_BusMasterModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.ChangePropagationDueToHardwareChange#getBusSlaveModifications <em>Bus Slave Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bus Slave Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.ChangePropagationDueToHardwareChange#getBusSlaveModifications()
	 * @see #getChangePropagationDueToHardwareChange()
	 * @generated
	 */
	EReference getChangePropagationDueToHardwareChange_BusSlaveModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.ChangePropagationDueToHardwareChange#getBusCableModifications <em>Bus Cable Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bus Cable Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.ChangePropagationDueToHardwareChange#getBusCableModifications()
	 * @see #getChangePropagationDueToHardwareChange()
	 * @generated
	 */
	EReference getChangePropagationDueToHardwareChange_BusCableModifications();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifyEntity <em>Modify Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modify Entity</em>'.
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifyEntity
	 * @generated
	 */
	EClass getModifyEntity();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifyBusBox <em>Modify Bus Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modify Bus Box</em>'.
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifyBusBox
	 * @generated
	 */
	EClass getModifyBusBox();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifyPowerSupply <em>Modify Power Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modify Power Supply</em>'.
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifyPowerSupply
	 * @generated
	 */
	EClass getModifyPowerSupply();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifySignalinterface <em>Modify Signalinterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modify Signalinterface</em>'.
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifySignalinterface
	 * @generated
	 */
	EClass getModifySignalinterface();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifyPhysicalConnection <em>Modify Physical Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modify Physical Connection</em>'.
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifyPhysicalConnection
	 * @generated
	 */
	EClass getModifyPhysicalConnection();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifyMicroSwitchModule <em>Modify Micro Switch Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modify Micro Switch Module</em>'.
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifyMicroSwitchModule
	 * @generated
	 */
	EClass getModifyMicroSwitchModule();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifyMicroSwitchModule#isIsReplaced <em>Is Replaced</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Replaced</em>'.
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifyMicroSwitchModule#isIsReplaced()
	 * @see #getModifyMicroSwitchModule()
	 * @generated
	 */
	EAttribute getModifyMicroSwitchModule_IsReplaced();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifyBusMaster <em>Modify Bus Master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modify Bus Master</em>'.
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifyBusMaster
	 * @generated
	 */
	EClass getModifyBusMaster();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifyBusSlave <em>Modify Bus Slave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modify Bus Slave</em>'.
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifyBusSlave
	 * @generated
	 */
	EClass getModifyBusSlave();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifyBusCable <em>Modify Bus Cable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modify Bus Cable</em>'.
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifyBusCable
	 * @generated
	 */
	EClass getModifyBusCable();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	modificationmarksFactory getmodificationmarksFactory();

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
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.AbstractKAPSModificationRepositoryImpl <em>Abstract KAPS Modification Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.AbstractKAPSModificationRepositoryImpl
		 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.modificationmarksPackageImpl#getAbstractKAPSModificationRepository()
		 * @generated
		 */
		EClass ABSTRACT_KAPS_MODIFICATION_REPOSITORY = eINSTANCE.getAbstractKAPSModificationRepository();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.KAPSModificationRepositoryImpl <em>KAPS Modification Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.KAPSModificationRepositoryImpl
		 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.modificationmarksPackageImpl#getKAPSModificationRepository()
		 * @generated
		 */
		EClass KAPS_MODIFICATION_REPOSITORY = eINSTANCE.getKAPSModificationRepository();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.KAPSSeedModificationsImpl <em>KAPS Seed Modifications</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.KAPSSeedModificationsImpl
		 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.modificationmarksPackageImpl#getKAPSSeedModifications()
		 * @generated
		 */
		EClass KAPS_SEED_MODIFICATIONS = eINSTANCE.getKAPSSeedModifications();

		/**
		 * The meta object literal for the '<em><b>Bus Box Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KAPS_SEED_MODIFICATIONS__BUS_BOX_MODIFICATIONS = eINSTANCE.getKAPSSeedModifications_BusBoxModifications();

		/**
		 * The meta object literal for the '<em><b>Sensor Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KAPS_SEED_MODIFICATIONS__SENSOR_MODIFICATIONS = eINSTANCE.getKAPSSeedModifications_SensorModifications();

		/**
		 * The meta object literal for the '<em><b>Bus Master Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KAPS_SEED_MODIFICATIONS__BUS_MASTER_MODIFICATIONS = eINSTANCE.getKAPSSeedModifications_BusMasterModifications();

		/**
		 * The meta object literal for the '<em><b>Bus Slave Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KAPS_SEED_MODIFICATIONS__BUS_SLAVE_MODIFICATIONS = eINSTANCE.getKAPSSeedModifications_BusSlaveModifications();

		/**
		 * The meta object literal for the '<em><b>Microswitch Module Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KAPS_SEED_MODIFICATIONS__MICROSWITCH_MODULE_MODIFICATIONS = eINSTANCE.getKAPSSeedModifications_MicroswitchModuleModifications();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.ModifySensorImpl <em>Modify Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.ModifySensorImpl
		 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.modificationmarksPackageImpl#getModifySensor()
		 * @generated
		 */
		EClass MODIFY_SENSOR = eINSTANCE.getModifySensor();

		/**
		 * The meta object literal for the '<em><b>Modify Signal Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODIFY_SENSOR__MODIFY_SIGNAL_INTERFACES = eINSTANCE.getModifySensor_ModifySignalInterfaces();

		/**
		 * The meta object literal for the '<em><b>Modify Physical Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODIFY_SENSOR__MODIFY_PHYSICAL_CONNECTIONS = eINSTANCE.getModifySensor_ModifyPhysicalConnections();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.ChangePropagationDueToHardwareChangeImpl <em>Change Propagation Due To Hardware Change</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.ChangePropagationDueToHardwareChangeImpl
		 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.modificationmarksPackageImpl#getChangePropagationDueToHardwareChange()
		 * @generated
		 */
		EClass CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE = eINSTANCE.getChangePropagationDueToHardwareChange();

		/**
		 * The meta object literal for the '<em><b>Sensor Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__SENSOR_MODIFICATIONS = eINSTANCE.getChangePropagationDueToHardwareChange_SensorModifications();

		/**
		 * The meta object literal for the '<em><b>Signalinterface Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__SIGNALINTERFACE_MODIFICATIONS = eINSTANCE.getChangePropagationDueToHardwareChange_SignalinterfaceModifications();

		/**
		 * The meta object literal for the '<em><b>Physical Connection Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__PHYSICAL_CONNECTION_MODIFICATIONS = eINSTANCE.getChangePropagationDueToHardwareChange_PhysicalConnectionModifications();

		/**
		 * The meta object literal for the '<em><b>Micro Switch Module Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__MICRO_SWITCH_MODULE_MODIFICATIONS = eINSTANCE.getChangePropagationDueToHardwareChange_MicroSwitchModuleModifications();

		/**
		 * The meta object literal for the '<em><b>Bus Box Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_BOX_MODIFICATIONS = eINSTANCE.getChangePropagationDueToHardwareChange_BusBoxModifications();

		/**
		 * The meta object literal for the '<em><b>Bus Master Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_MASTER_MODIFICATIONS = eINSTANCE.getChangePropagationDueToHardwareChange_BusMasterModifications();

		/**
		 * The meta object literal for the '<em><b>Bus Slave Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_SLAVE_MODIFICATIONS = eINSTANCE.getChangePropagationDueToHardwareChange_BusSlaveModifications();

		/**
		 * The meta object literal for the '<em><b>Bus Cable Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_CABLE_MODIFICATIONS = eINSTANCE.getChangePropagationDueToHardwareChange_BusCableModifications();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.ModifyEntityImpl <em>Modify Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.ModifyEntityImpl
		 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.modificationmarksPackageImpl#getModifyEntity()
		 * @generated
		 */
		EClass MODIFY_ENTITY = eINSTANCE.getModifyEntity();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.ModifyBusBoxImpl <em>Modify Bus Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.ModifyBusBoxImpl
		 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.modificationmarksPackageImpl#getModifyBusBox()
		 * @generated
		 */
		EClass MODIFY_BUS_BOX = eINSTANCE.getModifyBusBox();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.ModifyPowerSupplyImpl <em>Modify Power Supply</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.ModifyPowerSupplyImpl
		 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.modificationmarksPackageImpl#getModifyPowerSupply()
		 * @generated
		 */
		EClass MODIFY_POWER_SUPPLY = eINSTANCE.getModifyPowerSupply();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.ModifySignalinterfaceImpl <em>Modify Signalinterface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.ModifySignalinterfaceImpl
		 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.modificationmarksPackageImpl#getModifySignalinterface()
		 * @generated
		 */
		EClass MODIFY_SIGNALINTERFACE = eINSTANCE.getModifySignalinterface();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.ModifyPhysicalConnectionImpl <em>Modify Physical Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.ModifyPhysicalConnectionImpl
		 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.modificationmarksPackageImpl#getModifyPhysicalConnection()
		 * @generated
		 */
		EClass MODIFY_PHYSICAL_CONNECTION = eINSTANCE.getModifyPhysicalConnection();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.ModifyMicroSwitchModuleImpl <em>Modify Micro Switch Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.ModifyMicroSwitchModuleImpl
		 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.modificationmarksPackageImpl#getModifyMicroSwitchModule()
		 * @generated
		 */
		EClass MODIFY_MICRO_SWITCH_MODULE = eINSTANCE.getModifyMicroSwitchModule();

		/**
		 * The meta object literal for the '<em><b>Is Replaced</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODIFY_MICRO_SWITCH_MODULE__IS_REPLACED = eINSTANCE.getModifyMicroSwitchModule_IsReplaced();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.ModifyBusMasterImpl <em>Modify Bus Master</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.ModifyBusMasterImpl
		 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.modificationmarksPackageImpl#getModifyBusMaster()
		 * @generated
		 */
		EClass MODIFY_BUS_MASTER = eINSTANCE.getModifyBusMaster();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.ModifyBusSlaveImpl <em>Modify Bus Slave</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.ModifyBusSlaveImpl
		 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.modificationmarksPackageImpl#getModifyBusSlave()
		 * @generated
		 */
		EClass MODIFY_BUS_SLAVE = eINSTANCE.getModifyBusSlave();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.ModifyBusCableImpl <em>Modify Bus Cable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.ModifyBusCableImpl
		 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.modificationmarksPackageImpl#getModifyBusCable()
		 * @generated
		 */
		EClass MODIFY_BUS_CABLE = eINSTANCE.getModifyBusCable();

	}

} //modificationmarksPackage
