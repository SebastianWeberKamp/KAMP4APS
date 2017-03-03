/**
 */
package iec611313Specification.common.pous.function_blocks;

import iec611313Specification.common.types.TypesPackage;

import iec611313Specification.language.st.StPackage;

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
 * @see iec611313Specification.common.pous.function_blocks.Function_blocksFactory
 * @model kind="package"
 * @generated
 */
public interface Function_blocksPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "function_blocks";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.kit.edu/iec611313/common/pous/function_blocks";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "function_blocks";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Function_blocksPackage eINSTANCE = iec611313Specification.common.pous.function_blocks.impl.Function_blocksPackageImpl.init();

	/**
	 * The meta object id for the '{@link iec611313Specification.common.pous.function_blocks.impl.FunctionBlockBodySpecificationImpl <em>Function Block Body Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.pous.function_blocks.impl.FunctionBlockBodySpecificationImpl
	 * @see iec611313Specification.common.pous.function_blocks.impl.Function_blocksPackageImpl#getFunctionBlockBodySpecification()
	 * @generated
	 */
	int FUNCTION_BLOCK_BODY_SPECIFICATION = 0;

	/**
	 * The number of structural features of the '<em>Function Block Body Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_BODY_SPECIFICATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Function Block Body Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_BODY_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.pous.function_blocks.impl.FunctionBlockInvocationImpl <em>Function Block Invocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.pous.function_blocks.impl.FunctionBlockInvocationImpl
	 * @see iec611313Specification.common.pous.function_blocks.impl.Function_blocksPackageImpl#getFunctionBlockInvocation()
	 * @generated
	 */
	int FUNCTION_BLOCK_INVOCATION = 1;

	/**
	 * The feature id for the '<em><b>Has Instruction Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_INVOCATION__HAS_INSTRUCTION_LABEL = StPackage.STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invokes Fun Block Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_INVOCATION__INVOKES_FUN_BLOCK_INSTANCE = StPackage.STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Fun Block Invocation Param List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_INVOCATION__HAS_FUN_BLOCK_INVOCATION_PARAM_LIST = StPackage.STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Function Block Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_INVOCATION_FEATURE_COUNT = StPackage.STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Function Block Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_INVOCATION_OPERATION_COUNT = StPackage.STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.pous.function_blocks.impl.FunctionBlockTypeImpl <em>Function Block Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.pous.function_blocks.impl.FunctionBlockTypeImpl
	 * @see iec611313Specification.common.pous.function_blocks.impl.Function_blocksPackageImpl#getFunctionBlockType()
	 * @generated
	 */
	int FUNCTION_BLOCK_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_TYPE__TYPE_NAME = TypesPackage.ANY_DERIVED__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Has Fun Block Body Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_TYPE__HAS_FUN_BLOCK_BODY_SPEC = TypesPackage.ANY_DERIVED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contains Function Block Var Decl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_TYPE__CONTAINS_FUNCTION_BLOCK_VAR_DECL = TypesPackage.ANY_DERIVED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Interface Implementations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_TYPE__HAS_INTERFACE_IMPLEMENTATIONS = TypesPackage.ANY_DERIVED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Has Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_TYPE__HAS_EXTENSIONS = TypesPackage.ANY_DERIVED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Contains Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_TYPE__CONTAINS_METHODS = TypesPackage.ANY_DERIVED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Contains Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_TYPE__CONTAINS_PROPERTIES = TypesPackage.ANY_DERIVED_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Function Block Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_TYPE_FEATURE_COUNT = TypesPackage.ANY_DERIVED_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Function Block Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_TYPE_OPERATION_COUNT = TypesPackage.ANY_DERIVED_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.pous.function_blocks.FunctionBlockBodySpecification <em>Function Block Body Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Block Body Specification</em>'.
	 * @see iec611313Specification.common.pous.function_blocks.FunctionBlockBodySpecification
	 * @generated
	 */
	EClass getFunctionBlockBodySpecification();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.pous.function_blocks.FunctionBlockInvocation <em>Function Block Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Block Invocation</em>'.
	 * @see iec611313Specification.common.pous.function_blocks.FunctionBlockInvocation
	 * @generated
	 */
	EClass getFunctionBlockInvocation();

	/**
	 * Returns the meta object for the reference '{@link iec611313Specification.common.pous.function_blocks.FunctionBlockInvocation#getInvokesFunBlockInstance <em>Invokes Fun Block Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invokes Fun Block Instance</em>'.
	 * @see iec611313Specification.common.pous.function_blocks.FunctionBlockInvocation#getInvokesFunBlockInstance()
	 * @see #getFunctionBlockInvocation()
	 * @generated
	 */
	EReference getFunctionBlockInvocation_InvokesFunBlockInstance();

	/**
	 * Returns the meta object for the reference '{@link iec611313Specification.common.pous.function_blocks.FunctionBlockInvocation#getHasFunBlockInvocationParamList <em>Has Fun Block Invocation Param List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Fun Block Invocation Param List</em>'.
	 * @see iec611313Specification.common.pous.function_blocks.FunctionBlockInvocation#getHasFunBlockInvocationParamList()
	 * @see #getFunctionBlockInvocation()
	 * @generated
	 */
	EReference getFunctionBlockInvocation_HasFunBlockInvocationParamList();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.pous.function_blocks.FunctionBlockType <em>Function Block Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Block Type</em>'.
	 * @see iec611313Specification.common.pous.function_blocks.FunctionBlockType
	 * @generated
	 */
	EClass getFunctionBlockType();

	/**
	 * Returns the meta object for the containment reference '{@link iec611313Specification.common.pous.function_blocks.FunctionBlockType#getHasFunBlockBodySpec <em>Has Fun Block Body Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Fun Block Body Spec</em>'.
	 * @see iec611313Specification.common.pous.function_blocks.FunctionBlockType#getHasFunBlockBodySpec()
	 * @see #getFunctionBlockType()
	 * @generated
	 */
	EReference getFunctionBlockType_HasFunBlockBodySpec();

	/**
	 * Returns the meta object for the containment reference list '{@link iec611313Specification.common.pous.function_blocks.FunctionBlockType#getContainsFunctionBlockVarDecl <em>Contains Function Block Var Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Function Block Var Decl</em>'.
	 * @see iec611313Specification.common.pous.function_blocks.FunctionBlockType#getContainsFunctionBlockVarDecl()
	 * @see #getFunctionBlockType()
	 * @generated
	 */
	EReference getFunctionBlockType_ContainsFunctionBlockVarDecl();

	/**
	 * Returns the meta object for the reference list '{@link iec611313Specification.common.pous.function_blocks.FunctionBlockType#getHasInterfaceImplementations <em>Has Interface Implementations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Interface Implementations</em>'.
	 * @see iec611313Specification.common.pous.function_blocks.FunctionBlockType#getHasInterfaceImplementations()
	 * @see #getFunctionBlockType()
	 * @generated
	 */
	EReference getFunctionBlockType_HasInterfaceImplementations();

	/**
	 * Returns the meta object for the containment reference '{@link iec611313Specification.common.pous.function_blocks.FunctionBlockType#getHasExtensions <em>Has Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Extensions</em>'.
	 * @see iec611313Specification.common.pous.function_blocks.FunctionBlockType#getHasExtensions()
	 * @see #getFunctionBlockType()
	 * @generated
	 */
	EReference getFunctionBlockType_HasExtensions();

	/**
	 * Returns the meta object for the containment reference list '{@link iec611313Specification.common.pous.function_blocks.FunctionBlockType#getContainsMethods <em>Contains Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Methods</em>'.
	 * @see iec611313Specification.common.pous.function_blocks.FunctionBlockType#getContainsMethods()
	 * @see #getFunctionBlockType()
	 * @generated
	 */
	EReference getFunctionBlockType_ContainsMethods();

	/**
	 * Returns the meta object for the containment reference list '{@link iec611313Specification.common.pous.function_blocks.FunctionBlockType#getContainsProperties <em>Contains Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Properties</em>'.
	 * @see iec611313Specification.common.pous.function_blocks.FunctionBlockType#getContainsProperties()
	 * @see #getFunctionBlockType()
	 * @generated
	 */
	EReference getFunctionBlockType_ContainsProperties();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Function_blocksFactory getFunction_blocksFactory();

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
		 * The meta object literal for the '{@link iec611313Specification.common.pous.function_blocks.impl.FunctionBlockBodySpecificationImpl <em>Function Block Body Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.pous.function_blocks.impl.FunctionBlockBodySpecificationImpl
		 * @see iec611313Specification.common.pous.function_blocks.impl.Function_blocksPackageImpl#getFunctionBlockBodySpecification()
		 * @generated
		 */
		EClass FUNCTION_BLOCK_BODY_SPECIFICATION = eINSTANCE.getFunctionBlockBodySpecification();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.pous.function_blocks.impl.FunctionBlockInvocationImpl <em>Function Block Invocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.pous.function_blocks.impl.FunctionBlockInvocationImpl
		 * @see iec611313Specification.common.pous.function_blocks.impl.Function_blocksPackageImpl#getFunctionBlockInvocation()
		 * @generated
		 */
		EClass FUNCTION_BLOCK_INVOCATION = eINSTANCE.getFunctionBlockInvocation();

		/**
		 * The meta object literal for the '<em><b>Invokes Fun Block Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK_INVOCATION__INVOKES_FUN_BLOCK_INSTANCE = eINSTANCE.getFunctionBlockInvocation_InvokesFunBlockInstance();

		/**
		 * The meta object literal for the '<em><b>Has Fun Block Invocation Param List</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK_INVOCATION__HAS_FUN_BLOCK_INVOCATION_PARAM_LIST = eINSTANCE.getFunctionBlockInvocation_HasFunBlockInvocationParamList();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.pous.function_blocks.impl.FunctionBlockTypeImpl <em>Function Block Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.pous.function_blocks.impl.FunctionBlockTypeImpl
		 * @see iec611313Specification.common.pous.function_blocks.impl.Function_blocksPackageImpl#getFunctionBlockType()
		 * @generated
		 */
		EClass FUNCTION_BLOCK_TYPE = eINSTANCE.getFunctionBlockType();

		/**
		 * The meta object literal for the '<em><b>Has Fun Block Body Spec</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK_TYPE__HAS_FUN_BLOCK_BODY_SPEC = eINSTANCE.getFunctionBlockType_HasFunBlockBodySpec();

		/**
		 * The meta object literal for the '<em><b>Contains Function Block Var Decl</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK_TYPE__CONTAINS_FUNCTION_BLOCK_VAR_DECL = eINSTANCE.getFunctionBlockType_ContainsFunctionBlockVarDecl();

		/**
		 * The meta object literal for the '<em><b>Has Interface Implementations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK_TYPE__HAS_INTERFACE_IMPLEMENTATIONS = eINSTANCE.getFunctionBlockType_HasInterfaceImplementations();

		/**
		 * The meta object literal for the '<em><b>Has Extensions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK_TYPE__HAS_EXTENSIONS = eINSTANCE.getFunctionBlockType_HasExtensions();

		/**
		 * The meta object literal for the '<em><b>Contains Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK_TYPE__CONTAINS_METHODS = eINSTANCE.getFunctionBlockType_ContainsMethods();

		/**
		 * The meta object literal for the '<em><b>Contains Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK_TYPE__CONTAINS_PROPERTIES = eINSTANCE.getFunctionBlockType_ContainsProperties();

	}

} //Function_blocksPackage
