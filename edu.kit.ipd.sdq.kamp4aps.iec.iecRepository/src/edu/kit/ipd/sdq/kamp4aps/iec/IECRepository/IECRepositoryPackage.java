/**
 */
package edu.kit.ipd.sdq.kamp4aps.iec.IECRepository;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECRepositoryFactory
 * @model kind="package"
 * @generated
 */
public interface IECRepositoryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "IECRepository";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.kit.edu/IECRepository";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "IECReporitory";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IECRepositoryPackage eINSTANCE = edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.IECRepositoryPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IFunctionblock <em>IFunctionblock</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IFunctionblock
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.IECRepositoryPackageImpl#getIFunctionblock()
	 * @generated
	 */
	int IFUNCTIONBLOCK = 10;

	/**
	 * The number of structural features of the '<em>IFunctionblock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFUNCTIONBLOCK_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>IFunctionblock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFUNCTIONBLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.FunctionBlockImpl <em>Function Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.FunctionBlockImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.IECRepositoryPackageImpl#getFunctionBlock()
	 * @generated
	 */
	int FUNCTION_BLOCK = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK__ID = IFUNCTIONBLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK__NAME = IFUNCTIONBLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Iec Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK__HAS_IEC_METHOD = IFUNCTIONBLOCK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Has Iec Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK__HAS_IEC_PROPERTY = IFUNCTIONBLOCK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Accesses Variable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK__ACCESSES_VARIABLE = IFUNCTIONBLOCK_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Uses Function Block</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK__USES_FUNCTION_BLOCK = IFUNCTIONBLOCK_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Calls Function</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK__CALLS_FUNCTION = IFUNCTIONBLOCK_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK__IMPLEMENTS = IFUNCTIONBLOCK_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Uses Enum</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK__USES_ENUM = IFUNCTIONBLOCK_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Function Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_FEATURE_COUNT = IFUNCTIONBLOCK_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Function Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_OPERATION_COUNT = IFUNCTIONBLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.GlobalVariableImpl <em>Global Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.GlobalVariableImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.IECRepositoryPackageImpl#getGlobalVariable()
	 * @generated
	 */
	int GLOBAL_VARIABLE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE__ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Uses Enum</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE__USES_ENUM = 3;

	/**
	 * The number of structural features of the '<em>Global Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Global Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.IECInterfaceImpl <em>IEC Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.IECInterfaceImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.IECRepositoryPackageImpl#getIECInterface()
	 * @generated
	 */
	int IEC_INTERFACE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_INTERFACE__ID = IFUNCTIONBLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_INTERFACE__NAME = IFUNCTIONBLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Defines Iec Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_INTERFACE__DEFINES_IEC_METHOD = IFUNCTIONBLOCK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Defines Iec Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_INTERFACE__DEFINES_IEC_PROPERTY = IFUNCTIONBLOCK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Uses Enum</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_INTERFACE__USES_ENUM = IFUNCTIONBLOCK_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>IEC Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_INTERFACE_FEATURE_COUNT = IFUNCTIONBLOCK_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>IEC Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_INTERFACE_OPERATION_COUNT = IFUNCTIONBLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IResource <em>IResource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IResource
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.IECRepositoryPackageImpl#getIResource()
	 * @generated
	 */
	int IRESOURCE = 12;

	/**
	 * The number of structural features of the '<em>IResource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESOURCE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>IResource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.IECMethodImplementationImpl <em>IEC Method Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.IECMethodImplementationImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.IECRepositoryPackageImpl#getIECMethodImplementation()
	 * @generated
	 */
	int IEC_METHOD_IMPLEMENTATION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD_IMPLEMENTATION__ID = IRESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD_IMPLEMENTATION__NAME = IRESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD_IMPLEMENTATION__IMPLEMENTS = IRESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Accesses Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD_IMPLEMENTATION__ACCESSES_PROPERTY = IRESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Accesses Variable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD_IMPLEMENTATION__ACCESSES_VARIABLE = IRESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Uses Enum</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD_IMPLEMENTATION__USES_ENUM = IRESOURCE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>IEC Method Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD_IMPLEMENTATION_FEATURE_COUNT = IRESOURCE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>IEC Method Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD_IMPLEMENTATION_OPERATION_COUNT = IRESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.FunctionImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.IECRepositoryPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Calls Function</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__CALLS_FUNCTION = 2;

	/**
	 * The feature id for the '<em><b>Uses Enum</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__USES_ENUM = 3;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.ProgramImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.IECRepositoryPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__ID = 1;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.RepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.RepositoryImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.IECRepositoryPackageImpl#getRepository()
	 * @generated
	 */
	int REPOSITORY = 6;

	/**
	 * The feature id for the '<em><b>Contains Program</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__CONTAINS_PROGRAM = 0;

	/**
	 * The feature id for the '<em><b>Contains Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__CONTAINS_INTERFACE = 1;

	/**
	 * The feature id for the '<em><b>Contains Function Block</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__CONTAINS_FUNCTION_BLOCK = 2;

	/**
	 * The feature id for the '<em><b>Contains Function</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__CONTAINS_FUNCTION = 3;

	/**
	 * The feature id for the '<em><b>Contains Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__CONTAINS_VARIABLE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__NAME = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__ID = 6;

	/**
	 * The feature id for the '<em><b>Contains Static Functionblock</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__CONTAINS_STATIC_FUNCTIONBLOCK = 7;

	/**
	 * The feature id for the '<em><b>Contains Enum</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__CONTAINS_ENUM = 8;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.IECPropertyImplementationImpl <em>IEC Property Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.IECPropertyImplementationImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.IECRepositoryPackageImpl#getIECPropertyImplementation()
	 * @generated
	 */
	int IEC_PROPERTY_IMPLEMENTATION = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_PROPERTY_IMPLEMENTATION__ID = IRESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_PROPERTY_IMPLEMENTATION__NAME = IRESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_PROPERTY_IMPLEMENTATION__IMPLEMENTS = IRESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Accesses Variable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_PROPERTY_IMPLEMENTATION__ACCESSES_VARIABLE = IRESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Uses Enum</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_PROPERTY_IMPLEMENTATION__USES_ENUM = IRESOURCE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>IEC Property Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_PROPERTY_IMPLEMENTATION_FEATURE_COUNT = IRESOURCE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>IEC Property Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_PROPERTY_IMPLEMENTATION_OPERATION_COUNT = IRESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.IECPropertyImpl <em>IEC Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.IECPropertyImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.IECRepositoryPackageImpl#getIECProperty()
	 * @generated
	 */
	int IEC_PROPERTY = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_PROPERTY__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_PROPERTY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Uses Enum</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_PROPERTY__USES_ENUM = 2;

	/**
	 * The number of structural features of the '<em>IEC Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_PROPERTY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>IEC Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.IECMethodImpl <em>IEC Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.IECMethodImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.IECRepositoryPackageImpl#getIECMethod()
	 * @generated
	 */
	int IEC_METHOD = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD__NAME = 1;

	/**
	 * The feature id for the '<em><b>Uses Enum</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD__USES_ENUM = 2;

	/**
	 * The number of structural features of the '<em>IEC Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>IEC Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.StaticFunctionblockImpl <em>Static Functionblock</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.StaticFunctionblockImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.IECRepositoryPackageImpl#getStaticFunctionblock()
	 * @generated
	 */
	int STATIC_FUNCTIONBLOCK = 11;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_FUNCTIONBLOCK__TYPE = IFUNCTIONBLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_FUNCTIONBLOCK__ID = IFUNCTIONBLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_FUNCTIONBLOCK__NAME = IFUNCTIONBLOCK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Uses Enum</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_FUNCTIONBLOCK__USES_ENUM = IFUNCTIONBLOCK_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Static Functionblock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_FUNCTIONBLOCK_FEATURE_COUNT = IFUNCTIONBLOCK_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Static Functionblock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_FUNCTIONBLOCK_OPERATION_COUNT = IFUNCTIONBLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.EnumImpl <em>Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.EnumImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.IECRepositoryPackageImpl#getEnum()
	 * @generated
	 */
	int ENUM = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__NAME = 1;

	/**
	 * The number of structural features of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.VariableType <em>Variable Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.VariableType
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.IECRepositoryPackageImpl#getVariableType()
	 * @generated
	 */
	int VARIABLE_TYPE = 14;


	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.FunctionBlock <em>Function Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Block</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.FunctionBlock
	 * @generated
	 */
	EClass getFunctionBlock();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.FunctionBlock#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.FunctionBlock#getId()
	 * @see #getFunctionBlock()
	 * @generated
	 */
	EAttribute getFunctionBlock_Id();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.FunctionBlock#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.FunctionBlock#getName()
	 * @see #getFunctionBlock()
	 * @generated
	 */
	EAttribute getFunctionBlock_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.FunctionBlock#getHasIecMethod <em>Has Iec Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Iec Method</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.FunctionBlock#getHasIecMethod()
	 * @see #getFunctionBlock()
	 * @generated
	 */
	EReference getFunctionBlock_HasIecMethod();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.FunctionBlock#getHasIecProperty <em>Has Iec Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Iec Property</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.FunctionBlock#getHasIecProperty()
	 * @see #getFunctionBlock()
	 * @generated
	 */
	EReference getFunctionBlock_HasIecProperty();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.FunctionBlock#getAccessesVariable <em>Accesses Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Accesses Variable</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.FunctionBlock#getAccessesVariable()
	 * @see #getFunctionBlock()
	 * @generated
	 */
	EReference getFunctionBlock_AccessesVariable();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.FunctionBlock#getUsesFunctionBlock <em>Uses Function Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uses Function Block</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.FunctionBlock#getUsesFunctionBlock()
	 * @see #getFunctionBlock()
	 * @generated
	 */
	EReference getFunctionBlock_UsesFunctionBlock();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.FunctionBlock#getCallsFunction <em>Calls Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Calls Function</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.FunctionBlock#getCallsFunction()
	 * @see #getFunctionBlock()
	 * @generated
	 */
	EReference getFunctionBlock_CallsFunction();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.FunctionBlock#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Implements</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.FunctionBlock#getImplements()
	 * @see #getFunctionBlock()
	 * @generated
	 */
	EReference getFunctionBlock_Implements();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.FunctionBlock#getUsesEnum <em>Uses Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uses Enum</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.FunctionBlock#getUsesEnum()
	 * @see #getFunctionBlock()
	 * @generated
	 */
	EReference getFunctionBlock_UsesEnum();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.GlobalVariable <em>Global Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Variable</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.GlobalVariable
	 * @generated
	 */
	EClass getGlobalVariable();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.GlobalVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.GlobalVariable#getType()
	 * @see #getGlobalVariable()
	 * @generated
	 */
	EAttribute getGlobalVariable_Type();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.GlobalVariable#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.GlobalVariable#getId()
	 * @see #getGlobalVariable()
	 * @generated
	 */
	EAttribute getGlobalVariable_Id();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.GlobalVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.GlobalVariable#getName()
	 * @see #getGlobalVariable()
	 * @generated
	 */
	EAttribute getGlobalVariable_Name();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.GlobalVariable#getUsesEnum <em>Uses Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uses Enum</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.GlobalVariable#getUsesEnum()
	 * @see #getGlobalVariable()
	 * @generated
	 */
	EReference getGlobalVariable_UsesEnum();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECInterface <em>IEC Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Interface</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECInterface
	 * @generated
	 */
	EClass getIECInterface();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECInterface#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECInterface#getId()
	 * @see #getIECInterface()
	 * @generated
	 */
	EAttribute getIECInterface_Id();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECInterface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECInterface#getName()
	 * @see #getIECInterface()
	 * @generated
	 */
	EAttribute getIECInterface_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECInterface#getDefinesIecMethod <em>Defines Iec Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Defines Iec Method</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECInterface#getDefinesIecMethod()
	 * @see #getIECInterface()
	 * @generated
	 */
	EReference getIECInterface_DefinesIecMethod();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECInterface#getDefinesIecProperty <em>Defines Iec Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Defines Iec Property</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECInterface#getDefinesIecProperty()
	 * @see #getIECInterface()
	 * @generated
	 */
	EReference getIECInterface_DefinesIecProperty();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECInterface#getUsesEnum <em>Uses Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uses Enum</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECInterface#getUsesEnum()
	 * @see #getIECInterface()
	 * @generated
	 */
	EReference getIECInterface_UsesEnum();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECMethodImplementation <em>IEC Method Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Method Implementation</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECMethodImplementation
	 * @generated
	 */
	EClass getIECMethodImplementation();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECMethodImplementation#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECMethodImplementation#getId()
	 * @see #getIECMethodImplementation()
	 * @generated
	 */
	EAttribute getIECMethodImplementation_Id();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECMethodImplementation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECMethodImplementation#getName()
	 * @see #getIECMethodImplementation()
	 * @generated
	 */
	EAttribute getIECMethodImplementation_Name();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECMethodImplementation#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implements</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECMethodImplementation#getImplements()
	 * @see #getIECMethodImplementation()
	 * @generated
	 */
	EReference getIECMethodImplementation_Implements();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECMethodImplementation#getAccessesProperty <em>Accesses Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Accesses Property</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECMethodImplementation#getAccessesProperty()
	 * @see #getIECMethodImplementation()
	 * @generated
	 */
	EReference getIECMethodImplementation_AccessesProperty();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECMethodImplementation#getAccessesVariable <em>Accesses Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Accesses Variable</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECMethodImplementation#getAccessesVariable()
	 * @see #getIECMethodImplementation()
	 * @generated
	 */
	EReference getIECMethodImplementation_AccessesVariable();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECMethodImplementation#getUsesEnum <em>Uses Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uses Enum</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECMethodImplementation#getUsesEnum()
	 * @see #getIECMethodImplementation()
	 * @generated
	 */
	EReference getIECMethodImplementation_UsesEnum();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Function#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Function#getId()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Id();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Function#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Function#getName()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Name();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Function#getCallsFunction <em>Calls Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Calls Function</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Function#getCallsFunction()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_CallsFunction();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Function#getUsesEnum <em>Uses Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uses Enum</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Function#getUsesEnum()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_UsesEnum();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Program#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Program#getName()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Program#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Program#getId()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_Id();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Repository
	 * @generated
	 */
	EClass getRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Repository#getContainsProgram <em>Contains Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Program</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Repository#getContainsProgram()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_ContainsProgram();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Repository#getContainsInterface <em>Contains Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Interface</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Repository#getContainsInterface()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_ContainsInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Repository#getContainsFunctionBlock <em>Contains Function Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Function Block</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Repository#getContainsFunctionBlock()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_ContainsFunctionBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Repository#getContainsFunction <em>Contains Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Function</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Repository#getContainsFunction()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_ContainsFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Repository#getContainsVariable <em>Contains Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Variable</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Repository#getContainsVariable()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_ContainsVariable();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Repository#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Repository#getName()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Repository#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Repository#getId()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Repository#getContainsStaticFunctionblock <em>Contains Static Functionblock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Static Functionblock</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Repository#getContainsStaticFunctionblock()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_ContainsStaticFunctionblock();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Repository#getContainsEnum <em>Contains Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Enum</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Repository#getContainsEnum()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_ContainsEnum();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECPropertyImplementation <em>IEC Property Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Property Implementation</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECPropertyImplementation
	 * @generated
	 */
	EClass getIECPropertyImplementation();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECPropertyImplementation#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECPropertyImplementation#getId()
	 * @see #getIECPropertyImplementation()
	 * @generated
	 */
	EAttribute getIECPropertyImplementation_Id();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECPropertyImplementation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECPropertyImplementation#getName()
	 * @see #getIECPropertyImplementation()
	 * @generated
	 */
	EAttribute getIECPropertyImplementation_Name();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECPropertyImplementation#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implements</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECPropertyImplementation#getImplements()
	 * @see #getIECPropertyImplementation()
	 * @generated
	 */
	EReference getIECPropertyImplementation_Implements();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECPropertyImplementation#getAccessesVariable <em>Accesses Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Accesses Variable</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECPropertyImplementation#getAccessesVariable()
	 * @see #getIECPropertyImplementation()
	 * @generated
	 */
	EReference getIECPropertyImplementation_AccessesVariable();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECPropertyImplementation#getUsesEnum <em>Uses Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uses Enum</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECPropertyImplementation#getUsesEnum()
	 * @see #getIECPropertyImplementation()
	 * @generated
	 */
	EReference getIECPropertyImplementation_UsesEnum();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECProperty <em>IEC Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Property</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECProperty
	 * @generated
	 */
	EClass getIECProperty();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECProperty#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECProperty#getId()
	 * @see #getIECProperty()
	 * @generated
	 */
	EAttribute getIECProperty_Id();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECProperty#getName()
	 * @see #getIECProperty()
	 * @generated
	 */
	EAttribute getIECProperty_Name();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECProperty#getUsesEnum <em>Uses Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uses Enum</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECProperty#getUsesEnum()
	 * @see #getIECProperty()
	 * @generated
	 */
	EReference getIECProperty_UsesEnum();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECMethod <em>IEC Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Method</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECMethod
	 * @generated
	 */
	EClass getIECMethod();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECMethod#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECMethod#getId()
	 * @see #getIECMethod()
	 * @generated
	 */
	EAttribute getIECMethod_Id();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECMethod#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECMethod#getName()
	 * @see #getIECMethod()
	 * @generated
	 */
	EAttribute getIECMethod_Name();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECMethod#getUsesEnum <em>Uses Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uses Enum</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECMethod#getUsesEnum()
	 * @see #getIECMethod()
	 * @generated
	 */
	EReference getIECMethod_UsesEnum();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IFunctionblock <em>IFunctionblock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IFunctionblock</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IFunctionblock
	 * @generated
	 */
	EClass getIFunctionblock();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.StaticFunctionblock <em>Static Functionblock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Functionblock</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.StaticFunctionblock
	 * @generated
	 */
	EClass getStaticFunctionblock();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.StaticFunctionblock#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.StaticFunctionblock#getType()
	 * @see #getStaticFunctionblock()
	 * @generated
	 */
	EReference getStaticFunctionblock_Type();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.StaticFunctionblock#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.StaticFunctionblock#getId()
	 * @see #getStaticFunctionblock()
	 * @generated
	 */
	EAttribute getStaticFunctionblock_Id();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.StaticFunctionblock#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.StaticFunctionblock#getName()
	 * @see #getStaticFunctionblock()
	 * @generated
	 */
	EAttribute getStaticFunctionblock_Name();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.StaticFunctionblock#getUsesEnum <em>Uses Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uses Enum</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.StaticFunctionblock#getUsesEnum()
	 * @see #getStaticFunctionblock()
	 * @generated
	 */
	EReference getStaticFunctionblock_UsesEnum();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IResource <em>IResource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IResource</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IResource
	 * @generated
	 */
	EClass getIResource();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Enum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Enum
	 * @generated
	 */
	EClass getEnum();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Enum#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Enum#getId()
	 * @see #getEnum()
	 * @generated
	 */
	EAttribute getEnum_Id();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Enum#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Enum#getName()
	 * @see #getEnum()
	 * @generated
	 */
	EAttribute getEnum_Name();

	/**
	 * Returns the meta object for enum '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.VariableType <em>Variable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Variable Type</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.VariableType
	 * @generated
	 */
	EEnum getVariableType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IECRepositoryFactory getIECRepositoryFactory();

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
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.FunctionBlockImpl <em>Function Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.FunctionBlockImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.IECRepositoryPackageImpl#getFunctionBlock()
		 * @generated
		 */
		EClass FUNCTION_BLOCK = eINSTANCE.getFunctionBlock();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_BLOCK__ID = eINSTANCE.getFunctionBlock_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_BLOCK__NAME = eINSTANCE.getFunctionBlock_Name();

		/**
		 * The meta object literal for the '<em><b>Has Iec Method</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK__HAS_IEC_METHOD = eINSTANCE.getFunctionBlock_HasIecMethod();

		/**
		 * The meta object literal for the '<em><b>Has Iec Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK__HAS_IEC_PROPERTY = eINSTANCE.getFunctionBlock_HasIecProperty();

		/**
		 * The meta object literal for the '<em><b>Accesses Variable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK__ACCESSES_VARIABLE = eINSTANCE.getFunctionBlock_AccessesVariable();

		/**
		 * The meta object literal for the '<em><b>Uses Function Block</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK__USES_FUNCTION_BLOCK = eINSTANCE.getFunctionBlock_UsesFunctionBlock();

		/**
		 * The meta object literal for the '<em><b>Calls Function</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK__CALLS_FUNCTION = eINSTANCE.getFunctionBlock_CallsFunction();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK__IMPLEMENTS = eINSTANCE.getFunctionBlock_Implements();

		/**
		 * The meta object literal for the '<em><b>Uses Enum</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK__USES_ENUM = eINSTANCE.getFunctionBlock_UsesEnum();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.GlobalVariableImpl <em>Global Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.GlobalVariableImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.IECRepositoryPackageImpl#getGlobalVariable()
		 * @generated
		 */
		EClass GLOBAL_VARIABLE = eINSTANCE.getGlobalVariable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_VARIABLE__TYPE = eINSTANCE.getGlobalVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_VARIABLE__ID = eINSTANCE.getGlobalVariable_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_VARIABLE__NAME = eINSTANCE.getGlobalVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Uses Enum</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_VARIABLE__USES_ENUM = eINSTANCE.getGlobalVariable_UsesEnum();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.IECInterfaceImpl <em>IEC Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.IECInterfaceImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.IECRepositoryPackageImpl#getIECInterface()
		 * @generated
		 */
		EClass IEC_INTERFACE = eINSTANCE.getIECInterface();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IEC_INTERFACE__ID = eINSTANCE.getIECInterface_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IEC_INTERFACE__NAME = eINSTANCE.getIECInterface_Name();

		/**
		 * The meta object literal for the '<em><b>Defines Iec Method</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_INTERFACE__DEFINES_IEC_METHOD = eINSTANCE.getIECInterface_DefinesIecMethod();

		/**
		 * The meta object literal for the '<em><b>Defines Iec Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_INTERFACE__DEFINES_IEC_PROPERTY = eINSTANCE.getIECInterface_DefinesIecProperty();

		/**
		 * The meta object literal for the '<em><b>Uses Enum</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_INTERFACE__USES_ENUM = eINSTANCE.getIECInterface_UsesEnum();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.IECMethodImplementationImpl <em>IEC Method Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.IECMethodImplementationImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.IECRepositoryPackageImpl#getIECMethodImplementation()
		 * @generated
		 */
		EClass IEC_METHOD_IMPLEMENTATION = eINSTANCE.getIECMethodImplementation();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IEC_METHOD_IMPLEMENTATION__ID = eINSTANCE.getIECMethodImplementation_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IEC_METHOD_IMPLEMENTATION__NAME = eINSTANCE.getIECMethodImplementation_Name();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_METHOD_IMPLEMENTATION__IMPLEMENTS = eINSTANCE.getIECMethodImplementation_Implements();

		/**
		 * The meta object literal for the '<em><b>Accesses Property</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_METHOD_IMPLEMENTATION__ACCESSES_PROPERTY = eINSTANCE.getIECMethodImplementation_AccessesProperty();

		/**
		 * The meta object literal for the '<em><b>Accesses Variable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_METHOD_IMPLEMENTATION__ACCESSES_VARIABLE = eINSTANCE.getIECMethodImplementation_AccessesVariable();

		/**
		 * The meta object literal for the '<em><b>Uses Enum</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_METHOD_IMPLEMENTATION__USES_ENUM = eINSTANCE.getIECMethodImplementation_UsesEnum();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.FunctionImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.IECRepositoryPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__ID = eINSTANCE.getFunction_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__NAME = eINSTANCE.getFunction_Name();

		/**
		 * The meta object literal for the '<em><b>Calls Function</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__CALLS_FUNCTION = eINSTANCE.getFunction_CallsFunction();

		/**
		 * The meta object literal for the '<em><b>Uses Enum</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__USES_ENUM = eINSTANCE.getFunction_UsesEnum();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.ProgramImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.IECRepositoryPackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__NAME = eINSTANCE.getProgram_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__ID = eINSTANCE.getProgram_Id();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.RepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.RepositoryImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.IECRepositoryPackageImpl#getRepository()
		 * @generated
		 */
		EClass REPOSITORY = eINSTANCE.getRepository();

		/**
		 * The meta object literal for the '<em><b>Contains Program</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__CONTAINS_PROGRAM = eINSTANCE.getRepository_ContainsProgram();

		/**
		 * The meta object literal for the '<em><b>Contains Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__CONTAINS_INTERFACE = eINSTANCE.getRepository_ContainsInterface();

		/**
		 * The meta object literal for the '<em><b>Contains Function Block</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__CONTAINS_FUNCTION_BLOCK = eINSTANCE.getRepository_ContainsFunctionBlock();

		/**
		 * The meta object literal for the '<em><b>Contains Function</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__CONTAINS_FUNCTION = eINSTANCE.getRepository_ContainsFunction();

		/**
		 * The meta object literal for the '<em><b>Contains Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__CONTAINS_VARIABLE = eINSTANCE.getRepository_ContainsVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__NAME = eINSTANCE.getRepository_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__ID = eINSTANCE.getRepository_Id();

		/**
		 * The meta object literal for the '<em><b>Contains Static Functionblock</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__CONTAINS_STATIC_FUNCTIONBLOCK = eINSTANCE.getRepository_ContainsStaticFunctionblock();

		/**
		 * The meta object literal for the '<em><b>Contains Enum</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__CONTAINS_ENUM = eINSTANCE.getRepository_ContainsEnum();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.IECPropertyImplementationImpl <em>IEC Property Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.IECPropertyImplementationImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.IECRepositoryPackageImpl#getIECPropertyImplementation()
		 * @generated
		 */
		EClass IEC_PROPERTY_IMPLEMENTATION = eINSTANCE.getIECPropertyImplementation();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IEC_PROPERTY_IMPLEMENTATION__ID = eINSTANCE.getIECPropertyImplementation_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IEC_PROPERTY_IMPLEMENTATION__NAME = eINSTANCE.getIECPropertyImplementation_Name();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_PROPERTY_IMPLEMENTATION__IMPLEMENTS = eINSTANCE.getIECPropertyImplementation_Implements();

		/**
		 * The meta object literal for the '<em><b>Accesses Variable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_PROPERTY_IMPLEMENTATION__ACCESSES_VARIABLE = eINSTANCE.getIECPropertyImplementation_AccessesVariable();

		/**
		 * The meta object literal for the '<em><b>Uses Enum</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_PROPERTY_IMPLEMENTATION__USES_ENUM = eINSTANCE.getIECPropertyImplementation_UsesEnum();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.IECPropertyImpl <em>IEC Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.IECPropertyImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.IECRepositoryPackageImpl#getIECProperty()
		 * @generated
		 */
		EClass IEC_PROPERTY = eINSTANCE.getIECProperty();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IEC_PROPERTY__ID = eINSTANCE.getIECProperty_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IEC_PROPERTY__NAME = eINSTANCE.getIECProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Uses Enum</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_PROPERTY__USES_ENUM = eINSTANCE.getIECProperty_UsesEnum();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.IECMethodImpl <em>IEC Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.IECMethodImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.IECRepositoryPackageImpl#getIECMethod()
		 * @generated
		 */
		EClass IEC_METHOD = eINSTANCE.getIECMethod();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IEC_METHOD__ID = eINSTANCE.getIECMethod_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IEC_METHOD__NAME = eINSTANCE.getIECMethod_Name();

		/**
		 * The meta object literal for the '<em><b>Uses Enum</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_METHOD__USES_ENUM = eINSTANCE.getIECMethod_UsesEnum();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IFunctionblock <em>IFunctionblock</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IFunctionblock
		 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.IECRepositoryPackageImpl#getIFunctionblock()
		 * @generated
		 */
		EClass IFUNCTIONBLOCK = eINSTANCE.getIFunctionblock();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.StaticFunctionblockImpl <em>Static Functionblock</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.StaticFunctionblockImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.IECRepositoryPackageImpl#getStaticFunctionblock()
		 * @generated
		 */
		EClass STATIC_FUNCTIONBLOCK = eINSTANCE.getStaticFunctionblock();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATIC_FUNCTIONBLOCK__TYPE = eINSTANCE.getStaticFunctionblock_Type();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_FUNCTIONBLOCK__ID = eINSTANCE.getStaticFunctionblock_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_FUNCTIONBLOCK__NAME = eINSTANCE.getStaticFunctionblock_Name();

		/**
		 * The meta object literal for the '<em><b>Uses Enum</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATIC_FUNCTIONBLOCK__USES_ENUM = eINSTANCE.getStaticFunctionblock_UsesEnum();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IResource <em>IResource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IResource
		 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.IECRepositoryPackageImpl#getIResource()
		 * @generated
		 */
		EClass IRESOURCE = eINSTANCE.getIResource();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.EnumImpl <em>Enum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.EnumImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.IECRepositoryPackageImpl#getEnum()
		 * @generated
		 */
		EClass ENUM = eINSTANCE.getEnum();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM__ID = eINSTANCE.getEnum_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM__NAME = eINSTANCE.getEnum_Name();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.VariableType <em>Variable Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.VariableType
		 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.impl.IECRepositoryPackageImpl#getVariableType()
		 * @generated
		 */
		EEnum VARIABLE_TYPE = eINSTANCE.getVariableType();

	}

} //IECRepositoryPackage
