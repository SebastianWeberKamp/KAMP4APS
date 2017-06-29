/**
 */
package apsNewModel;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see apsNewModel.ApsNewModelFactory
 * @model kind="package"
 * @generated
 */
public interface ApsNewModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "apsNewModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/apsNewModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "apsNewModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApsNewModelPackage eINSTANCE = apsNewModel.impl.ApsNewModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link apsNewModel.impl.FunctionBlockImpl <em>Function Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apsNewModel.impl.FunctionBlockImpl
	 * @see apsNewModel.impl.ApsNewModelPackageImpl#getFunctionBlock()
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
	int FUNCTION_BLOCK__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK__NAME = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Accesses Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK__ACCESSES_PROPERTY = 3;

	/**
	 * The feature id for the '<em><b>Has Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK__HAS_METHOD = 4;

	/**
	 * The feature id for the '<em><b>Has Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK__HAS_PROPERTY = 5;

	/**
	 * The number of structural features of the '<em>Function Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Function Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link apsNewModel.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apsNewModel.impl.FunctionImpl
	 * @see apsNewModel.impl.ApsNewModelPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 1;

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
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link apsNewModel.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apsNewModel.impl.ProgramImpl
	 * @see apsNewModel.impl.ApsNewModelPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 2;

	/**
	 * The feature id for the '<em><b>Calls Function</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__CALLS_FUNCTION = 0;

	/**
	 * The feature id for the '<em><b>Calls Function Block</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__CALLS_FUNCTION_BLOCK = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__NAME = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__ID = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__TYPE = 4;

	/**
	 * The feature id for the '<em><b>Implements Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__IMPLEMENTS_INTERFACE = 5;

	/**
	 * The feature id for the '<em><b>Declares Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__DECLARES_VARIABLE = 6;

	/**
	 * The feature id for the '<em><b>Uses Enum</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__USES_ENUM = 7;

	/**
	 * The feature id for the '<em><b>Accesses Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__ACCESSES_PROPERTY = 8;

	/**
	 * The feature id for the '<em><b>Calls Method</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__CALLS_METHOD = 9;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link apsNewModel.impl.SPSSystemImpl <em>SPS System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apsNewModel.impl.SPSSystemImpl
	 * @see apsNewModel.impl.ApsNewModelPackageImpl#getSPSSystem()
	 * @generated
	 */
	int SPS_SYSTEM = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPS_SYSTEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPS_SYSTEM__ID = 1;

	/**
	 * The feature id for the '<em><b>Contains Program</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPS_SYSTEM__CONTAINS_PROGRAM = 2;

	/**
	 * The feature id for the '<em><b>Component Internal Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPS_SYSTEM__COMPONENT_INTERNAL_DEPENDENCIES = 3;

	/**
	 * The number of structural features of the '<em>SPS System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPS_SYSTEM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>SPS System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPS_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link apsNewModel.impl.IECInterfaceImpl <em>IEC Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apsNewModel.impl.IECInterfaceImpl
	 * @see apsNewModel.impl.ApsNewModelPackageImpl#getIECInterface()
	 * @generated
	 */
	int IEC_INTERFACE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_INTERFACE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_INTERFACE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_INTERFACE__TYPE = 2;

	/**
	 * The number of structural features of the '<em>IEC Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_INTERFACE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>IEC Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link apsNewModel.impl.GlobalVariableImpl <em>Global Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apsNewModel.impl.GlobalVariableImpl
	 * @see apsNewModel.impl.ApsNewModelPackageImpl#getGlobalVariable()
	 * @generated
	 */
	int GLOBAL_VARIABLE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Global Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Global Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link apsNewModel.IFunctionBlock <em>IFunction Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apsNewModel.IFunctionBlock
	 * @see apsNewModel.impl.ApsNewModelPackageImpl#getIFunctionBlock()
	 * @generated
	 */
	int IFUNCTION_BLOCK = 7;

	/**
	 * The number of structural features of the '<em>IFunction Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFUNCTION_BLOCK_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>IFunction Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFUNCTION_BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link apsNewModel.impl.StaticFunctionblockImpl <em>Static Functionblock</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apsNewModel.impl.StaticFunctionblockImpl
	 * @see apsNewModel.impl.ApsNewModelPackageImpl#getStaticFunctionblock()
	 * @generated
	 */
	int STATIC_FUNCTIONBLOCK = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_FUNCTIONBLOCK__ID = IFUNCTION_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_FUNCTIONBLOCK__NAME = IFUNCTION_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_FUNCTIONBLOCK__TYPE = IFUNCTION_BLOCK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Accesses Global Variable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_FUNCTIONBLOCK__ACCESSES_GLOBAL_VARIABLE = IFUNCTION_BLOCK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Has Method</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_FUNCTIONBLOCK__HAS_METHOD = IFUNCTION_BLOCK_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Has Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_FUNCTIONBLOCK__HAS_PROPERTY = IFUNCTION_BLOCK_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Static Functionblock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_FUNCTIONBLOCK_FEATURE_COUNT = IFUNCTION_BLOCK_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Static Functionblock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_FUNCTIONBLOCK_OPERATION_COUNT = IFUNCTION_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link apsNewModel.impl.IECMethodImplementationImpl <em>IEC Method Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apsNewModel.impl.IECMethodImplementationImpl
	 * @see apsNewModel.impl.ApsNewModelPackageImpl#getIECMethodImplementation()
	 * @generated
	 */
	int IEC_METHOD_IMPLEMENTATION = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD_IMPLEMENTATION__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD_IMPLEMENTATION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD_IMPLEMENTATION__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Accesses Global Variable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD_IMPLEMENTATION__ACCESSES_GLOBAL_VARIABLE = 3;

	/**
	 * The feature id for the '<em><b>Accesses Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD_IMPLEMENTATION__ACCESSES_PROPERTY = 4;

	/**
	 * The number of structural features of the '<em>IEC Method Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD_IMPLEMENTATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>IEC Method Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD_IMPLEMENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link apsNewModel.impl.IECPropertyImplementationImpl <em>IEC Property Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apsNewModel.impl.IECPropertyImplementationImpl
	 * @see apsNewModel.impl.ApsNewModelPackageImpl#getIECPropertyImplementation()
	 * @generated
	 */
	int IEC_PROPERTY_IMPLEMENTATION = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_PROPERTY_IMPLEMENTATION__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_PROPERTY_IMPLEMENTATION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_PROPERTY_IMPLEMENTATION__TYPE = 2;

	/**
	 * The number of structural features of the '<em>IEC Property Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_PROPERTY_IMPLEMENTATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>IEC Property Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_PROPERTY_IMPLEMENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link apsNewModel.impl.EnumImpl <em>Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apsNewModel.impl.EnumImpl
	 * @see apsNewModel.impl.ApsNewModelPackageImpl#getEnum()
	 * @generated
	 */
	int ENUM = 10;

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
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link apsNewModel.FunctionBlock <em>Function Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Block</em>'.
	 * @see apsNewModel.FunctionBlock
	 * @generated
	 */
	EClass getFunctionBlock();

	/**
	 * Returns the meta object for the attribute '{@link apsNewModel.FunctionBlock#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see apsNewModel.FunctionBlock#getId()
	 * @see #getFunctionBlock()
	 * @generated
	 */
	EAttribute getFunctionBlock_Id();

	/**
	 * Returns the meta object for the attribute '{@link apsNewModel.FunctionBlock#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see apsNewModel.FunctionBlock#getName()
	 * @see #getFunctionBlock()
	 * @generated
	 */
	EAttribute getFunctionBlock_Name();

	/**
	 * Returns the meta object for the reference '{@link apsNewModel.FunctionBlock#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see apsNewModel.FunctionBlock#getType()
	 * @see #getFunctionBlock()
	 * @generated
	 */
	EReference getFunctionBlock_Type();

	/**
	 * Returns the meta object for the reference list '{@link apsNewModel.FunctionBlock#getAccessesProperty <em>Accesses Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Accesses Property</em>'.
	 * @see apsNewModel.FunctionBlock#getAccessesProperty()
	 * @see #getFunctionBlock()
	 * @generated
	 */
	EReference getFunctionBlock_AccessesProperty();

	/**
	 * Returns the meta object for the containment reference list '{@link apsNewModel.FunctionBlock#getHasMethod <em>Has Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Method</em>'.
	 * @see apsNewModel.FunctionBlock#getHasMethod()
	 * @see #getFunctionBlock()
	 * @generated
	 */
	EReference getFunctionBlock_HasMethod();

	/**
	 * Returns the meta object for the containment reference list '{@link apsNewModel.FunctionBlock#getHasProperty <em>Has Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Property</em>'.
	 * @see apsNewModel.FunctionBlock#getHasProperty()
	 * @see #getFunctionBlock()
	 * @generated
	 */
	EReference getFunctionBlock_HasProperty();

	/**
	 * Returns the meta object for class '{@link apsNewModel.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see apsNewModel.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the attribute '{@link apsNewModel.Function#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see apsNewModel.Function#getId()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Id();

	/**
	 * Returns the meta object for the attribute '{@link apsNewModel.Function#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see apsNewModel.Function#getName()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Name();

	/**
	 * Returns the meta object for the reference '{@link apsNewModel.Function#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see apsNewModel.Function#getType()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Type();

	/**
	 * Returns the meta object for class '{@link apsNewModel.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see apsNewModel.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the containment reference list '{@link apsNewModel.Program#getCallsFunction <em>Calls Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Calls Function</em>'.
	 * @see apsNewModel.Program#getCallsFunction()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_CallsFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link apsNewModel.Program#getCallsFunctionBlock <em>Calls Function Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Calls Function Block</em>'.
	 * @see apsNewModel.Program#getCallsFunctionBlock()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_CallsFunctionBlock();

	/**
	 * Returns the meta object for the attribute '{@link apsNewModel.Program#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see apsNewModel.Program#getName()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_Name();

	/**
	 * Returns the meta object for the attribute '{@link apsNewModel.Program#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see apsNewModel.Program#getId()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_Id();

	/**
	 * Returns the meta object for the reference '{@link apsNewModel.Program#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see apsNewModel.Program#getType()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link apsNewModel.Program#getImplementsInterface <em>Implements Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Implements Interface</em>'.
	 * @see apsNewModel.Program#getImplementsInterface()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_ImplementsInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link apsNewModel.Program#getDeclaresVariable <em>Declares Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declares Variable</em>'.
	 * @see apsNewModel.Program#getDeclaresVariable()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_DeclaresVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link apsNewModel.Program#getUsesEnum <em>Uses Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uses Enum</em>'.
	 * @see apsNewModel.Program#getUsesEnum()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_UsesEnum();

	/**
	 * Returns the meta object for the reference list '{@link apsNewModel.Program#getAccessesProperty <em>Accesses Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Accesses Property</em>'.
	 * @see apsNewModel.Program#getAccessesProperty()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_AccessesProperty();

	/**
	 * Returns the meta object for the reference list '{@link apsNewModel.Program#getCallsMethod <em>Calls Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Calls Method</em>'.
	 * @see apsNewModel.Program#getCallsMethod()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_CallsMethod();

	/**
	 * Returns the meta object for class '{@link apsNewModel.SPSSystem <em>SPS System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SPS System</em>'.
	 * @see apsNewModel.SPSSystem
	 * @generated
	 */
	EClass getSPSSystem();

	/**
	 * Returns the meta object for the attribute '{@link apsNewModel.SPSSystem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see apsNewModel.SPSSystem#getName()
	 * @see #getSPSSystem()
	 * @generated
	 */
	EAttribute getSPSSystem_Name();

	/**
	 * Returns the meta object for the attribute '{@link apsNewModel.SPSSystem#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see apsNewModel.SPSSystem#getId()
	 * @see #getSPSSystem()
	 * @generated
	 */
	EAttribute getSPSSystem_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link apsNewModel.SPSSystem#getContainsProgram <em>Contains Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Program</em>'.
	 * @see apsNewModel.SPSSystem#getContainsProgram()
	 * @see #getSPSSystem()
	 * @generated
	 */
	EReference getSPSSystem_ContainsProgram();

	/**
	 * Returns the meta object for the reference list '{@link apsNewModel.SPSSystem#getComponentInternalDependencies <em>Component Internal Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Component Internal Dependencies</em>'.
	 * @see apsNewModel.SPSSystem#getComponentInternalDependencies()
	 * @see #getSPSSystem()
	 * @generated
	 */
	EReference getSPSSystem_ComponentInternalDependencies();

	/**
	 * Returns the meta object for class '{@link apsNewModel.IECInterface <em>IEC Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Interface</em>'.
	 * @see apsNewModel.IECInterface
	 * @generated
	 */
	EClass getIECInterface();

	/**
	 * Returns the meta object for the attribute '{@link apsNewModel.IECInterface#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see apsNewModel.IECInterface#getId()
	 * @see #getIECInterface()
	 * @generated
	 */
	EAttribute getIECInterface_Id();

	/**
	 * Returns the meta object for the attribute '{@link apsNewModel.IECInterface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see apsNewModel.IECInterface#getName()
	 * @see #getIECInterface()
	 * @generated
	 */
	EAttribute getIECInterface_Name();

	/**
	 * Returns the meta object for the reference '{@link apsNewModel.IECInterface#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see apsNewModel.IECInterface#getType()
	 * @see #getIECInterface()
	 * @generated
	 */
	EReference getIECInterface_Type();

	/**
	 * Returns the meta object for class '{@link apsNewModel.GlobalVariable <em>Global Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Variable</em>'.
	 * @see apsNewModel.GlobalVariable
	 * @generated
	 */
	EClass getGlobalVariable();

	/**
	 * Returns the meta object for the attribute '{@link apsNewModel.GlobalVariable#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see apsNewModel.GlobalVariable#getId()
	 * @see #getGlobalVariable()
	 * @generated
	 */
	EAttribute getGlobalVariable_Id();

	/**
	 * Returns the meta object for the attribute '{@link apsNewModel.GlobalVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see apsNewModel.GlobalVariable#getName()
	 * @see #getGlobalVariable()
	 * @generated
	 */
	EAttribute getGlobalVariable_Name();

	/**
	 * Returns the meta object for the reference '{@link apsNewModel.GlobalVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see apsNewModel.GlobalVariable#getType()
	 * @see #getGlobalVariable()
	 * @generated
	 */
	EReference getGlobalVariable_Type();

	/**
	 * Returns the meta object for class '{@link apsNewModel.StaticFunctionblock <em>Static Functionblock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Functionblock</em>'.
	 * @see apsNewModel.StaticFunctionblock
	 * @generated
	 */
	EClass getStaticFunctionblock();

	/**
	 * Returns the meta object for the attribute '{@link apsNewModel.StaticFunctionblock#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see apsNewModel.StaticFunctionblock#getId()
	 * @see #getStaticFunctionblock()
	 * @generated
	 */
	EAttribute getStaticFunctionblock_Id();

	/**
	 * Returns the meta object for the attribute '{@link apsNewModel.StaticFunctionblock#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see apsNewModel.StaticFunctionblock#getName()
	 * @see #getStaticFunctionblock()
	 * @generated
	 */
	EAttribute getStaticFunctionblock_Name();

	/**
	 * Returns the meta object for the reference '{@link apsNewModel.StaticFunctionblock#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see apsNewModel.StaticFunctionblock#getType()
	 * @see #getStaticFunctionblock()
	 * @generated
	 */
	EReference getStaticFunctionblock_Type();

	/**
	 * Returns the meta object for the reference list '{@link apsNewModel.StaticFunctionblock#getAccessesGlobalVariable <em>Accesses Global Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Accesses Global Variable</em>'.
	 * @see apsNewModel.StaticFunctionblock#getAccessesGlobalVariable()
	 * @see #getStaticFunctionblock()
	 * @generated
	 */
	EReference getStaticFunctionblock_AccessesGlobalVariable();

	/**
	 * Returns the meta object for the reference list '{@link apsNewModel.StaticFunctionblock#getHasMethod <em>Has Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Method</em>'.
	 * @see apsNewModel.StaticFunctionblock#getHasMethod()
	 * @see #getStaticFunctionblock()
	 * @generated
	 */
	EReference getStaticFunctionblock_HasMethod();

	/**
	 * Returns the meta object for the reference list '{@link apsNewModel.StaticFunctionblock#getHasProperty <em>Has Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Property</em>'.
	 * @see apsNewModel.StaticFunctionblock#getHasProperty()
	 * @see #getStaticFunctionblock()
	 * @generated
	 */
	EReference getStaticFunctionblock_HasProperty();

	/**
	 * Returns the meta object for class '{@link apsNewModel.IFunctionBlock <em>IFunction Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IFunction Block</em>'.
	 * @see apsNewModel.IFunctionBlock
	 * @generated
	 */
	EClass getIFunctionBlock();

	/**
	 * Returns the meta object for class '{@link apsNewModel.IECMethodImplementation <em>IEC Method Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Method Implementation</em>'.
	 * @see apsNewModel.IECMethodImplementation
	 * @generated
	 */
	EClass getIECMethodImplementation();

	/**
	 * Returns the meta object for the attribute '{@link apsNewModel.IECMethodImplementation#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see apsNewModel.IECMethodImplementation#getId()
	 * @see #getIECMethodImplementation()
	 * @generated
	 */
	EAttribute getIECMethodImplementation_Id();

	/**
	 * Returns the meta object for the attribute '{@link apsNewModel.IECMethodImplementation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see apsNewModel.IECMethodImplementation#getName()
	 * @see #getIECMethodImplementation()
	 * @generated
	 */
	EAttribute getIECMethodImplementation_Name();

	/**
	 * Returns the meta object for the reference '{@link apsNewModel.IECMethodImplementation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see apsNewModel.IECMethodImplementation#getType()
	 * @see #getIECMethodImplementation()
	 * @generated
	 */
	EReference getIECMethodImplementation_Type();

	/**
	 * Returns the meta object for the reference list '{@link apsNewModel.IECMethodImplementation#getAccessesGlobalVariable <em>Accesses Global Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Accesses Global Variable</em>'.
	 * @see apsNewModel.IECMethodImplementation#getAccessesGlobalVariable()
	 * @see #getIECMethodImplementation()
	 * @generated
	 */
	EReference getIECMethodImplementation_AccessesGlobalVariable();

	/**
	 * Returns the meta object for the reference list '{@link apsNewModel.IECMethodImplementation#getAccessesProperty <em>Accesses Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Accesses Property</em>'.
	 * @see apsNewModel.IECMethodImplementation#getAccessesProperty()
	 * @see #getIECMethodImplementation()
	 * @generated
	 */
	EReference getIECMethodImplementation_AccessesProperty();

	/**
	 * Returns the meta object for class '{@link apsNewModel.IECPropertyImplementation <em>IEC Property Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Property Implementation</em>'.
	 * @see apsNewModel.IECPropertyImplementation
	 * @generated
	 */
	EClass getIECPropertyImplementation();

	/**
	 * Returns the meta object for the attribute '{@link apsNewModel.IECPropertyImplementation#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see apsNewModel.IECPropertyImplementation#getId()
	 * @see #getIECPropertyImplementation()
	 * @generated
	 */
	EAttribute getIECPropertyImplementation_Id();

	/**
	 * Returns the meta object for the attribute '{@link apsNewModel.IECPropertyImplementation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see apsNewModel.IECPropertyImplementation#getName()
	 * @see #getIECPropertyImplementation()
	 * @generated
	 */
	EAttribute getIECPropertyImplementation_Name();

	/**
	 * Returns the meta object for the reference '{@link apsNewModel.IECPropertyImplementation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see apsNewModel.IECPropertyImplementation#getType()
	 * @see #getIECPropertyImplementation()
	 * @generated
	 */
	EReference getIECPropertyImplementation_Type();

	/**
	 * Returns the meta object for class '{@link apsNewModel.Enum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum</em>'.
	 * @see apsNewModel.Enum
	 * @generated
	 */
	EClass getEnum();

	/**
	 * Returns the meta object for the attribute '{@link apsNewModel.Enum#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see apsNewModel.Enum#getId()
	 * @see #getEnum()
	 * @generated
	 */
	EAttribute getEnum_Id();

	/**
	 * Returns the meta object for the attribute '{@link apsNewModel.Enum#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see apsNewModel.Enum#getName()
	 * @see #getEnum()
	 * @generated
	 */
	EAttribute getEnum_Name();

	/**
	 * Returns the meta object for the reference '{@link apsNewModel.Enum#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see apsNewModel.Enum#getType()
	 * @see #getEnum()
	 * @generated
	 */
	EReference getEnum_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApsNewModelFactory getApsNewModelFactory();

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
		 * The meta object literal for the '{@link apsNewModel.impl.FunctionBlockImpl <em>Function Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apsNewModel.impl.FunctionBlockImpl
		 * @see apsNewModel.impl.ApsNewModelPackageImpl#getFunctionBlock()
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
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK__TYPE = eINSTANCE.getFunctionBlock_Type();

		/**
		 * The meta object literal for the '<em><b>Accesses Property</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK__ACCESSES_PROPERTY = eINSTANCE.getFunctionBlock_AccessesProperty();

		/**
		 * The meta object literal for the '<em><b>Has Method</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK__HAS_METHOD = eINSTANCE.getFunctionBlock_HasMethod();

		/**
		 * The meta object literal for the '<em><b>Has Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK__HAS_PROPERTY = eINSTANCE.getFunctionBlock_HasProperty();

		/**
		 * The meta object literal for the '{@link apsNewModel.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apsNewModel.impl.FunctionImpl
		 * @see apsNewModel.impl.ApsNewModelPackageImpl#getFunction()
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
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__TYPE = eINSTANCE.getFunction_Type();

		/**
		 * The meta object literal for the '{@link apsNewModel.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apsNewModel.impl.ProgramImpl
		 * @see apsNewModel.impl.ApsNewModelPackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Calls Function</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__CALLS_FUNCTION = eINSTANCE.getProgram_CallsFunction();

		/**
		 * The meta object literal for the '<em><b>Calls Function Block</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__CALLS_FUNCTION_BLOCK = eINSTANCE.getProgram_CallsFunctionBlock();

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
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__TYPE = eINSTANCE.getProgram_Type();

		/**
		 * The meta object literal for the '<em><b>Implements Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__IMPLEMENTS_INTERFACE = eINSTANCE.getProgram_ImplementsInterface();

		/**
		 * The meta object literal for the '<em><b>Declares Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__DECLARES_VARIABLE = eINSTANCE.getProgram_DeclaresVariable();

		/**
		 * The meta object literal for the '<em><b>Uses Enum</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__USES_ENUM = eINSTANCE.getProgram_UsesEnum();

		/**
		 * The meta object literal for the '<em><b>Accesses Property</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__ACCESSES_PROPERTY = eINSTANCE.getProgram_AccessesProperty();

		/**
		 * The meta object literal for the '<em><b>Calls Method</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__CALLS_METHOD = eINSTANCE.getProgram_CallsMethod();

		/**
		 * The meta object literal for the '{@link apsNewModel.impl.SPSSystemImpl <em>SPS System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apsNewModel.impl.SPSSystemImpl
		 * @see apsNewModel.impl.ApsNewModelPackageImpl#getSPSSystem()
		 * @generated
		 */
		EClass SPS_SYSTEM = eINSTANCE.getSPSSystem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPS_SYSTEM__NAME = eINSTANCE.getSPSSystem_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPS_SYSTEM__ID = eINSTANCE.getSPSSystem_Id();

		/**
		 * The meta object literal for the '<em><b>Contains Program</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPS_SYSTEM__CONTAINS_PROGRAM = eINSTANCE.getSPSSystem_ContainsProgram();

		/**
		 * The meta object literal for the '<em><b>Component Internal Dependencies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPS_SYSTEM__COMPONENT_INTERNAL_DEPENDENCIES = eINSTANCE.getSPSSystem_ComponentInternalDependencies();

		/**
		 * The meta object literal for the '{@link apsNewModel.impl.IECInterfaceImpl <em>IEC Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apsNewModel.impl.IECInterfaceImpl
		 * @see apsNewModel.impl.ApsNewModelPackageImpl#getIECInterface()
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
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_INTERFACE__TYPE = eINSTANCE.getIECInterface_Type();

		/**
		 * The meta object literal for the '{@link apsNewModel.impl.GlobalVariableImpl <em>Global Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apsNewModel.impl.GlobalVariableImpl
		 * @see apsNewModel.impl.ApsNewModelPackageImpl#getGlobalVariable()
		 * @generated
		 */
		EClass GLOBAL_VARIABLE = eINSTANCE.getGlobalVariable();

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
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_VARIABLE__TYPE = eINSTANCE.getGlobalVariable_Type();

		/**
		 * The meta object literal for the '{@link apsNewModel.impl.StaticFunctionblockImpl <em>Static Functionblock</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apsNewModel.impl.StaticFunctionblockImpl
		 * @see apsNewModel.impl.ApsNewModelPackageImpl#getStaticFunctionblock()
		 * @generated
		 */
		EClass STATIC_FUNCTIONBLOCK = eINSTANCE.getStaticFunctionblock();

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
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATIC_FUNCTIONBLOCK__TYPE = eINSTANCE.getStaticFunctionblock_Type();

		/**
		 * The meta object literal for the '<em><b>Accesses Global Variable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATIC_FUNCTIONBLOCK__ACCESSES_GLOBAL_VARIABLE = eINSTANCE.getStaticFunctionblock_AccessesGlobalVariable();

		/**
		 * The meta object literal for the '<em><b>Has Method</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATIC_FUNCTIONBLOCK__HAS_METHOD = eINSTANCE.getStaticFunctionblock_HasMethod();

		/**
		 * The meta object literal for the '<em><b>Has Property</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATIC_FUNCTIONBLOCK__HAS_PROPERTY = eINSTANCE.getStaticFunctionblock_HasProperty();

		/**
		 * The meta object literal for the '{@link apsNewModel.IFunctionBlock <em>IFunction Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apsNewModel.IFunctionBlock
		 * @see apsNewModel.impl.ApsNewModelPackageImpl#getIFunctionBlock()
		 * @generated
		 */
		EClass IFUNCTION_BLOCK = eINSTANCE.getIFunctionBlock();

		/**
		 * The meta object literal for the '{@link apsNewModel.impl.IECMethodImplementationImpl <em>IEC Method Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apsNewModel.impl.IECMethodImplementationImpl
		 * @see apsNewModel.impl.ApsNewModelPackageImpl#getIECMethodImplementation()
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
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_METHOD_IMPLEMENTATION__TYPE = eINSTANCE.getIECMethodImplementation_Type();

		/**
		 * The meta object literal for the '<em><b>Accesses Global Variable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_METHOD_IMPLEMENTATION__ACCESSES_GLOBAL_VARIABLE = eINSTANCE.getIECMethodImplementation_AccessesGlobalVariable();

		/**
		 * The meta object literal for the '<em><b>Accesses Property</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_METHOD_IMPLEMENTATION__ACCESSES_PROPERTY = eINSTANCE.getIECMethodImplementation_AccessesProperty();

		/**
		 * The meta object literal for the '{@link apsNewModel.impl.IECPropertyImplementationImpl <em>IEC Property Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apsNewModel.impl.IECPropertyImplementationImpl
		 * @see apsNewModel.impl.ApsNewModelPackageImpl#getIECPropertyImplementation()
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
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_PROPERTY_IMPLEMENTATION__TYPE = eINSTANCE.getIECPropertyImplementation_Type();

		/**
		 * The meta object literal for the '{@link apsNewModel.impl.EnumImpl <em>Enum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apsNewModel.impl.EnumImpl
		 * @see apsNewModel.impl.ApsNewModelPackageImpl#getEnum()
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
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM__TYPE = eINSTANCE.getEnum_Type();

	}

} //ApsNewModelPackage
