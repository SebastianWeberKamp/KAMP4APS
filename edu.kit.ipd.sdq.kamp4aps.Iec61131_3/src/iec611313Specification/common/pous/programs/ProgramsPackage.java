/**
 */
package iec611313Specification.common.pous.programs;

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
 * @see iec611313Specification.common.pous.programs.ProgramsFactory
 * @model kind="package"
 * @generated
 */
public interface ProgramsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "programs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.kit.edu/iec611313/common/pous/programs";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "programs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProgramsPackage eINSTANCE = iec611313Specification.common.pous.programs.impl.ProgramsPackageImpl.init();

	/**
	 * The meta object id for the '{@link iec611313Specification.common.pous.programs.impl.ProgramConfigElementImpl <em>Program Config Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.pous.programs.impl.ProgramConfigElementImpl
	 * @see iec611313Specification.common.pous.programs.impl.ProgramsPackageImpl#getProgramConfigElement()
	 * @generated
	 */
	int PROGRAM_CONFIG_ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Program Config Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_CONFIG_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Program Config Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_CONFIG_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.pous.programs.impl.FunctionBlockInstanceTaskAssignmentImpl <em>Function Block Instance Task Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.pous.programs.impl.FunctionBlockInstanceTaskAssignmentImpl
	 * @see iec611313Specification.common.pous.programs.impl.ProgramsPackageImpl#getFunctionBlockInstanceTaskAssignment()
	 * @generated
	 */
	int FUNCTION_BLOCK_INSTANCE_TASK_ASSIGNMENT = 0;

	/**
	 * The feature id for the '<em><b>Assigns Fun Block Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_INSTANCE_TASK_ASSIGNMENT__ASSIGNS_FUN_BLOCK_INSTANCE = PROGRAM_CONFIG_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Fun Block Assign Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_INSTANCE_TASK_ASSIGNMENT__HAS_FUN_BLOCK_ASSIGN_TASK = PROGRAM_CONFIG_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function Block Instance Task Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_INSTANCE_TASK_ASSIGNMENT_FEATURE_COUNT = PROGRAM_CONFIG_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Function Block Instance Task Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_INSTANCE_TASK_ASSIGNMENT_OPERATION_COUNT = PROGRAM_CONFIG_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.pous.programs.impl.ProgramConfigurationImpl <em>Program Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.pous.programs.impl.ProgramConfigurationImpl
	 * @see iec611313Specification.common.pous.programs.impl.ProgramsPackageImpl#getProgramConfiguration()
	 * @generated
	 */
	int PROGRAM_CONFIGURATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_CONFIGURATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Retentive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_CONFIGURATION__RETENTIVE = 1;

	/**
	 * The feature id for the '<em><b>Has Program Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_CONFIGURATION__HAS_PROGRAM_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Contains Prog Config Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_CONFIGURATION__CONTAINS_PROG_CONFIG_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Is Assigned To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_CONFIGURATION__IS_ASSIGNED_TO = 4;

	/**
	 * The number of structural features of the '<em>Program Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_CONFIGURATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Program Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.pous.programs.impl.ProgramTypeImpl <em>Program Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.pous.programs.impl.ProgramTypeImpl
	 * @see iec611313Specification.common.pous.programs.impl.ProgramsPackageImpl#getProgramType()
	 * @generated
	 */
	int PROGRAM_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_TYPE__TYPE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Has Program Body Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_TYPE__HAS_PROGRAM_BODY_SPEC = 1;

	/**
	 * The feature id for the '<em><b>Contains Program Var Decl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_TYPE__CONTAINS_PROGRAM_VAR_DECL = 2;

	/**
	 * The number of structural features of the '<em>Program Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Program Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_TYPE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.pous.programs.FunctionBlockInstanceTaskAssignment <em>Function Block Instance Task Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Block Instance Task Assignment</em>'.
	 * @see iec611313Specification.common.pous.programs.FunctionBlockInstanceTaskAssignment
	 * @generated
	 */
	EClass getFunctionBlockInstanceTaskAssignment();

	/**
	 * Returns the meta object for the reference '{@link iec611313Specification.common.pous.programs.FunctionBlockInstanceTaskAssignment#getAssignsFunBlockInstance <em>Assigns Fun Block Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assigns Fun Block Instance</em>'.
	 * @see iec611313Specification.common.pous.programs.FunctionBlockInstanceTaskAssignment#getAssignsFunBlockInstance()
	 * @see #getFunctionBlockInstanceTaskAssignment()
	 * @generated
	 */
	EReference getFunctionBlockInstanceTaskAssignment_AssignsFunBlockInstance();

	/**
	 * Returns the meta object for the reference '{@link iec611313Specification.common.pous.programs.FunctionBlockInstanceTaskAssignment#getHasFunBlockAssignTask <em>Has Fun Block Assign Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Fun Block Assign Task</em>'.
	 * @see iec611313Specification.common.pous.programs.FunctionBlockInstanceTaskAssignment#getHasFunBlockAssignTask()
	 * @see #getFunctionBlockInstanceTaskAssignment()
	 * @generated
	 */
	EReference getFunctionBlockInstanceTaskAssignment_HasFunBlockAssignTask();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.pous.programs.ProgramConfigElement <em>Program Config Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Config Element</em>'.
	 * @see iec611313Specification.common.pous.programs.ProgramConfigElement
	 * @generated
	 */
	EClass getProgramConfigElement();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.pous.programs.ProgramConfiguration <em>Program Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Configuration</em>'.
	 * @see iec611313Specification.common.pous.programs.ProgramConfiguration
	 * @generated
	 */
	EClass getProgramConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link iec611313Specification.common.pous.programs.ProgramConfiguration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iec611313Specification.common.pous.programs.ProgramConfiguration#getName()
	 * @see #getProgramConfiguration()
	 * @generated
	 */
	EAttribute getProgramConfiguration_Name();

	/**
	 * Returns the meta object for the attribute '{@link iec611313Specification.common.pous.programs.ProgramConfiguration#isRetentive <em>Retentive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retentive</em>'.
	 * @see iec611313Specification.common.pous.programs.ProgramConfiguration#isRetentive()
	 * @see #getProgramConfiguration()
	 * @generated
	 */
	EAttribute getProgramConfiguration_Retentive();

	/**
	 * Returns the meta object for the containment reference '{@link iec611313Specification.common.pous.programs.ProgramConfiguration#getHasProgramType <em>Has Program Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Program Type</em>'.
	 * @see iec611313Specification.common.pous.programs.ProgramConfiguration#getHasProgramType()
	 * @see #getProgramConfiguration()
	 * @generated
	 */
	EReference getProgramConfiguration_HasProgramType();

	/**
	 * Returns the meta object for the containment reference list '{@link iec611313Specification.common.pous.programs.ProgramConfiguration#getContainsProgConfigElement <em>Contains Prog Config Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Prog Config Element</em>'.
	 * @see iec611313Specification.common.pous.programs.ProgramConfiguration#getContainsProgConfigElement()
	 * @see #getProgramConfiguration()
	 * @generated
	 */
	EReference getProgramConfiguration_ContainsProgConfigElement();

	/**
	 * Returns the meta object for the reference list '{@link iec611313Specification.common.pous.programs.ProgramConfiguration#getIsAssignedTo <em>Is Assigned To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Assigned To</em>'.
	 * @see iec611313Specification.common.pous.programs.ProgramConfiguration#getIsAssignedTo()
	 * @see #getProgramConfiguration()
	 * @generated
	 */
	EReference getProgramConfiguration_IsAssignedTo();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.pous.programs.ProgramType <em>Program Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Type</em>'.
	 * @see iec611313Specification.common.pous.programs.ProgramType
	 * @generated
	 */
	EClass getProgramType();

	/**
	 * Returns the meta object for the attribute '{@link iec611313Specification.common.pous.programs.ProgramType#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see iec611313Specification.common.pous.programs.ProgramType#getTypeName()
	 * @see #getProgramType()
	 * @generated
	 */
	EAttribute getProgramType_TypeName();

	/**
	 * Returns the meta object for the containment reference '{@link iec611313Specification.common.pous.programs.ProgramType#getHasProgramBodySpec <em>Has Program Body Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Program Body Spec</em>'.
	 * @see iec611313Specification.common.pous.programs.ProgramType#getHasProgramBodySpec()
	 * @see #getProgramType()
	 * @generated
	 */
	EReference getProgramType_HasProgramBodySpec();

	/**
	 * Returns the meta object for the containment reference list '{@link iec611313Specification.common.pous.programs.ProgramType#getContainsProgramVarDecl <em>Contains Program Var Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Program Var Decl</em>'.
	 * @see iec611313Specification.common.pous.programs.ProgramType#getContainsProgramVarDecl()
	 * @see #getProgramType()
	 * @generated
	 */
	EReference getProgramType_ContainsProgramVarDecl();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProgramsFactory getProgramsFactory();

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
		 * The meta object literal for the '{@link iec611313Specification.common.pous.programs.impl.FunctionBlockInstanceTaskAssignmentImpl <em>Function Block Instance Task Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.pous.programs.impl.FunctionBlockInstanceTaskAssignmentImpl
		 * @see iec611313Specification.common.pous.programs.impl.ProgramsPackageImpl#getFunctionBlockInstanceTaskAssignment()
		 * @generated
		 */
		EClass FUNCTION_BLOCK_INSTANCE_TASK_ASSIGNMENT = eINSTANCE.getFunctionBlockInstanceTaskAssignment();

		/**
		 * The meta object literal for the '<em><b>Assigns Fun Block Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK_INSTANCE_TASK_ASSIGNMENT__ASSIGNS_FUN_BLOCK_INSTANCE = eINSTANCE.getFunctionBlockInstanceTaskAssignment_AssignsFunBlockInstance();

		/**
		 * The meta object literal for the '<em><b>Has Fun Block Assign Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK_INSTANCE_TASK_ASSIGNMENT__HAS_FUN_BLOCK_ASSIGN_TASK = eINSTANCE.getFunctionBlockInstanceTaskAssignment_HasFunBlockAssignTask();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.pous.programs.impl.ProgramConfigElementImpl <em>Program Config Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.pous.programs.impl.ProgramConfigElementImpl
		 * @see iec611313Specification.common.pous.programs.impl.ProgramsPackageImpl#getProgramConfigElement()
		 * @generated
		 */
		EClass PROGRAM_CONFIG_ELEMENT = eINSTANCE.getProgramConfigElement();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.pous.programs.impl.ProgramConfigurationImpl <em>Program Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.pous.programs.impl.ProgramConfigurationImpl
		 * @see iec611313Specification.common.pous.programs.impl.ProgramsPackageImpl#getProgramConfiguration()
		 * @generated
		 */
		EClass PROGRAM_CONFIGURATION = eINSTANCE.getProgramConfiguration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM_CONFIGURATION__NAME = eINSTANCE.getProgramConfiguration_Name();

		/**
		 * The meta object literal for the '<em><b>Retentive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM_CONFIGURATION__RETENTIVE = eINSTANCE.getProgramConfiguration_Retentive();

		/**
		 * The meta object literal for the '<em><b>Has Program Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM_CONFIGURATION__HAS_PROGRAM_TYPE = eINSTANCE.getProgramConfiguration_HasProgramType();

		/**
		 * The meta object literal for the '<em><b>Contains Prog Config Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM_CONFIGURATION__CONTAINS_PROG_CONFIG_ELEMENT = eINSTANCE.getProgramConfiguration_ContainsProgConfigElement();

		/**
		 * The meta object literal for the '<em><b>Is Assigned To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM_CONFIGURATION__IS_ASSIGNED_TO = eINSTANCE.getProgramConfiguration_IsAssignedTo();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.pous.programs.impl.ProgramTypeImpl <em>Program Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.pous.programs.impl.ProgramTypeImpl
		 * @see iec611313Specification.common.pous.programs.impl.ProgramsPackageImpl#getProgramType()
		 * @generated
		 */
		EClass PROGRAM_TYPE = eINSTANCE.getProgramType();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM_TYPE__TYPE_NAME = eINSTANCE.getProgramType_TypeName();

		/**
		 * The meta object literal for the '<em><b>Has Program Body Spec</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM_TYPE__HAS_PROGRAM_BODY_SPEC = eINSTANCE.getProgramType_HasProgramBodySpec();

		/**
		 * The meta object literal for the '<em><b>Contains Program Var Decl</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM_TYPE__CONTAINS_PROGRAM_VAR_DECL = eINSTANCE.getProgramType_ContainsProgramVarDecl();

	}

} //ProgramsPackage
