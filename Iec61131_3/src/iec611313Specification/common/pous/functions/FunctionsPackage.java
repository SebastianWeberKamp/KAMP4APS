/**
 */
package iec611313Specification.common.pous.functions;

import iec611313Specification.common.CommonPackage;

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
 * @see iec611313Specification.common.pous.functions.FunctionsFactory
 * @model kind="package"
 * @generated
 */
public interface FunctionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "functions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.kit.edu/iec611313/common/pous/functions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "functions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FunctionsPackage eINSTANCE = iec611313Specification.common.pous.functions.impl.FunctionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link iec611313Specification.common.pous.functions.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.pous.functions.impl.FunctionImpl
	 * @see iec611313Specification.common.pous.functions.impl.FunctionsPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 0;

	/**
	 * The feature id for the '<em><b>Has Function Body Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__HAS_FUNCTION_BODY_SPEC = 0;

	/**
	 * The feature id for the '<em><b>Contains Function Var Decl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__CONTAINS_FUNCTION_VAR_DECL = 1;

	/**
	 * The feature id for the '<em><b>Has Function Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__HAS_FUNCTION_RETURN_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = 3;

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
	 * The meta object id for the '{@link iec611313Specification.common.pous.functions.impl.FunctionBodySpecificationImpl <em>Function Body Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.pous.functions.impl.FunctionBodySpecificationImpl
	 * @see iec611313Specification.common.pous.functions.impl.FunctionsPackageImpl#getFunctionBodySpecification()
	 * @generated
	 */
	int FUNCTION_BODY_SPECIFICATION = 1;

	/**
	 * The number of structural features of the '<em>Function Body Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BODY_SPECIFICATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Function Body Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BODY_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.pous.functions.impl.FunctionCallImpl <em>Function Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.pous.functions.impl.FunctionCallImpl
	 * @see iec611313Specification.common.pous.functions.impl.FunctionsPackageImpl#getFunctionCall()
	 * @generated
	 */
	int FUNCTION_CALL = 2;

	/**
	 * The feature id for the '<em><b>Has Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__HAS_TYPE = CommonPackage.EXPRESSION__HAS_TYPE;

	/**
	 * The feature id for the '<em><b>Has Instruction Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__HAS_INSTRUCTION_LABEL = CommonPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Calls Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__CALLS_FUNCTION = CommonPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Fun Call Param List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__HAS_FUN_CALL_PARAM_LIST = CommonPackage.EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_FEATURE_COUNT = CommonPackage.EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_OPERATION_COUNT = CommonPackage.EXPRESSION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.pous.functions.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see iec611313Specification.common.pous.functions.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the containment reference '{@link iec611313Specification.common.pous.functions.Function#getHasFunctionBodySpec <em>Has Function Body Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Function Body Spec</em>'.
	 * @see iec611313Specification.common.pous.functions.Function#getHasFunctionBodySpec()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_HasFunctionBodySpec();

	/**
	 * Returns the meta object for the containment reference '{@link iec611313Specification.common.pous.functions.Function#getContainsFunctionVarDecl <em>Contains Function Var Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contains Function Var Decl</em>'.
	 * @see iec611313Specification.common.pous.functions.Function#getContainsFunctionVarDecl()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_ContainsFunctionVarDecl();

	/**
	 * Returns the meta object for the containment reference '{@link iec611313Specification.common.pous.functions.Function#getHasFunctionReturnType <em>Has Function Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Function Return Type</em>'.
	 * @see iec611313Specification.common.pous.functions.Function#getHasFunctionReturnType()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_HasFunctionReturnType();

	/**
	 * Returns the meta object for the attribute '{@link iec611313Specification.common.pous.functions.Function#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iec611313Specification.common.pous.functions.Function#getName()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Name();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.pous.functions.FunctionBodySpecification <em>Function Body Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Body Specification</em>'.
	 * @see iec611313Specification.common.pous.functions.FunctionBodySpecification
	 * @generated
	 */
	EClass getFunctionBodySpecification();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.pous.functions.FunctionCall <em>Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Call</em>'.
	 * @see iec611313Specification.common.pous.functions.FunctionCall
	 * @generated
	 */
	EClass getFunctionCall();

	/**
	 * Returns the meta object for the reference '{@link iec611313Specification.common.pous.functions.FunctionCall#getCallsFunction <em>Calls Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Calls Function</em>'.
	 * @see iec611313Specification.common.pous.functions.FunctionCall#getCallsFunction()
	 * @see #getFunctionCall()
	 * @generated
	 */
	EReference getFunctionCall_CallsFunction();

	/**
	 * Returns the meta object for the reference '{@link iec611313Specification.common.pous.functions.FunctionCall#getHasFunCallParamList <em>Has Fun Call Param List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Fun Call Param List</em>'.
	 * @see iec611313Specification.common.pous.functions.FunctionCall#getHasFunCallParamList()
	 * @see #getFunctionCall()
	 * @generated
	 */
	EReference getFunctionCall_HasFunCallParamList();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FunctionsFactory getFunctionsFactory();

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
		 * The meta object literal for the '{@link iec611313Specification.common.pous.functions.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.pous.functions.impl.FunctionImpl
		 * @see iec611313Specification.common.pous.functions.impl.FunctionsPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Has Function Body Spec</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__HAS_FUNCTION_BODY_SPEC = eINSTANCE.getFunction_HasFunctionBodySpec();

		/**
		 * The meta object literal for the '<em><b>Contains Function Var Decl</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__CONTAINS_FUNCTION_VAR_DECL = eINSTANCE.getFunction_ContainsFunctionVarDecl();

		/**
		 * The meta object literal for the '<em><b>Has Function Return Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__HAS_FUNCTION_RETURN_TYPE = eINSTANCE.getFunction_HasFunctionReturnType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__NAME = eINSTANCE.getFunction_Name();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.pous.functions.impl.FunctionBodySpecificationImpl <em>Function Body Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.pous.functions.impl.FunctionBodySpecificationImpl
		 * @see iec611313Specification.common.pous.functions.impl.FunctionsPackageImpl#getFunctionBodySpecification()
		 * @generated
		 */
		EClass FUNCTION_BODY_SPECIFICATION = eINSTANCE.getFunctionBodySpecification();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.pous.functions.impl.FunctionCallImpl <em>Function Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.pous.functions.impl.FunctionCallImpl
		 * @see iec611313Specification.common.pous.functions.impl.FunctionsPackageImpl#getFunctionCall()
		 * @generated
		 */
		EClass FUNCTION_CALL = eINSTANCE.getFunctionCall();

		/**
		 * The meta object literal for the '<em><b>Calls Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_CALL__CALLS_FUNCTION = eINSTANCE.getFunctionCall_CallsFunction();

		/**
		 * The meta object literal for the '<em><b>Has Fun Call Param List</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_CALL__HAS_FUN_CALL_PARAM_LIST = eINSTANCE.getFunctionCall_HasFunCallParamList();

	}

} //FunctionsPackage
