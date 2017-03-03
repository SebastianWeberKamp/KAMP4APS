/**
 */
package iec611313Specification.configuration;

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
 * @see iec611313Specification.configuration.ConfigurationFactory
 * @model kind="package"
 * @generated
 */
public interface ConfigurationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "configuration";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.kit.edu/iec611313/configuration";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "configuration";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigurationPackage eINSTANCE = iec611313Specification.configuration.impl.ConfigurationPackageImpl.init();

	/**
	 * The meta object id for the '{@link iec611313Specification.configuration.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.configuration.impl.ConfigurationImpl
	 * @see iec611313Specification.configuration.impl.ConfigurationPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Contains Type Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__CONTAINS_TYPE_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Contains Config Var Decl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__CONTAINS_CONFIG_VAR_DECL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__NAME = 2;

	/**
	 * The feature id for the '<em><b>Contains Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__CONTAINS_RESOURCE = 3;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.configuration.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.configuration.impl.ResourceImpl
	 * @see iec611313Specification.configuration.impl.ConfigurationPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Resource Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__RESOURCE_TYPE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Contains Program Configs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__CONTAINS_PROGRAM_CONFIGS = 2;

	/**
	 * The feature id for the '<em><b>Contains Resource Var Decl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__CONTAINS_RESOURCE_VAR_DECL = 3;

	/**
	 * The feature id for the '<em><b>Contains Task Configs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__CONTAINS_TASK_CONFIGS = 4;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.configuration.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.configuration.impl.TaskImpl
	 * @see iec611313Specification.configuration.impl.ConfigurationPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 2;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.configuration.impl.TaskConfigurationImpl <em>Task Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.configuration.impl.TaskConfigurationImpl
	 * @see iec611313Specification.configuration.impl.ConfigurationPackageImpl#getTaskConfiguration()
	 * @generated
	 */
	int TASK_CONFIGURATION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CONFIGURATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Configures Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CONFIGURATION__CONFIGURES_TASK = 1;

	/**
	 * The feature id for the '<em><b>Has Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CONFIGURATION__HAS_PRIORITY = 2;

	/**
	 * The feature id for the '<em><b>Has Single Execution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CONFIGURATION__HAS_SINGLE_EXECUTION = 3;

	/**
	 * The feature id for the '<em><b>Has Interval Execution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CONFIGURATION__HAS_INTERVAL_EXECUTION = 4;

	/**
	 * The number of structural features of the '<em>Task Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CONFIGURATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Task Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CONFIGURATION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link iec611313Specification.configuration.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see iec611313Specification.configuration.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link iec611313Specification.configuration.Configuration#getContainsTypeDefinition <em>Contains Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Type Definition</em>'.
	 * @see iec611313Specification.configuration.Configuration#getContainsTypeDefinition()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_ContainsTypeDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link iec611313Specification.configuration.Configuration#getContainsConfigVarDecl <em>Contains Config Var Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Config Var Decl</em>'.
	 * @see iec611313Specification.configuration.Configuration#getContainsConfigVarDecl()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_ContainsConfigVarDecl();

	/**
	 * Returns the meta object for the attribute '{@link iec611313Specification.configuration.Configuration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iec611313Specification.configuration.Configuration#getName()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link iec611313Specification.configuration.Configuration#getContainsResource <em>Contains Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Resource</em>'.
	 * @see iec611313Specification.configuration.Configuration#getContainsResource()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_ContainsResource();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.configuration.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see iec611313Specification.configuration.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link iec611313Specification.configuration.Resource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iec611313Specification.configuration.Resource#getName()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Name();

	/**
	 * Returns the meta object for the attribute '{@link iec611313Specification.configuration.Resource#getResourceTypeName <em>Resource Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Type Name</em>'.
	 * @see iec611313Specification.configuration.Resource#getResourceTypeName()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_ResourceTypeName();

	/**
	 * Returns the meta object for the containment reference list '{@link iec611313Specification.configuration.Resource#getContainsProgramConfigs <em>Contains Program Configs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Program Configs</em>'.
	 * @see iec611313Specification.configuration.Resource#getContainsProgramConfigs()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_ContainsProgramConfigs();

	/**
	 * Returns the meta object for the containment reference list '{@link iec611313Specification.configuration.Resource#getContainsResourceVarDecl <em>Contains Resource Var Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Resource Var Decl</em>'.
	 * @see iec611313Specification.configuration.Resource#getContainsResourceVarDecl()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_ContainsResourceVarDecl();

	/**
	 * Returns the meta object for the containment reference list '{@link iec611313Specification.configuration.Resource#getContainsTaskConfigs <em>Contains Task Configs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Task Configs</em>'.
	 * @see iec611313Specification.configuration.Resource#getContainsTaskConfigs()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_ContainsTaskConfigs();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.configuration.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see iec611313Specification.configuration.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.configuration.TaskConfiguration <em>Task Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Configuration</em>'.
	 * @see iec611313Specification.configuration.TaskConfiguration
	 * @generated
	 */
	EClass getTaskConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link iec611313Specification.configuration.TaskConfiguration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iec611313Specification.configuration.TaskConfiguration#getName()
	 * @see #getTaskConfiguration()
	 * @generated
	 */
	EAttribute getTaskConfiguration_Name();

	/**
	 * Returns the meta object for the containment reference '{@link iec611313Specification.configuration.TaskConfiguration#getConfiguresTask <em>Configures Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configures Task</em>'.
	 * @see iec611313Specification.configuration.TaskConfiguration#getConfiguresTask()
	 * @see #getTaskConfiguration()
	 * @generated
	 */
	EReference getTaskConfiguration_ConfiguresTask();

	/**
	 * Returns the meta object for the containment reference '{@link iec611313Specification.configuration.TaskConfiguration#getHasPriority <em>Has Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Priority</em>'.
	 * @see iec611313Specification.configuration.TaskConfiguration#getHasPriority()
	 * @see #getTaskConfiguration()
	 * @generated
	 */
	EReference getTaskConfiguration_HasPriority();

	/**
	 * Returns the meta object for the containment reference '{@link iec611313Specification.configuration.TaskConfiguration#getHasSingleExecution <em>Has Single Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Single Execution</em>'.
	 * @see iec611313Specification.configuration.TaskConfiguration#getHasSingleExecution()
	 * @see #getTaskConfiguration()
	 * @generated
	 */
	EReference getTaskConfiguration_HasSingleExecution();

	/**
	 * Returns the meta object for the containment reference '{@link iec611313Specification.configuration.TaskConfiguration#getHasIntervalExecution <em>Has Interval Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Interval Execution</em>'.
	 * @see iec611313Specification.configuration.TaskConfiguration#getHasIntervalExecution()
	 * @see #getTaskConfiguration()
	 * @generated
	 */
	EReference getTaskConfiguration_HasIntervalExecution();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConfigurationFactory getConfigurationFactory();

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
		 * The meta object literal for the '{@link iec611313Specification.configuration.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.configuration.impl.ConfigurationImpl
		 * @see iec611313Specification.configuration.impl.ConfigurationPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Contains Type Definition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__CONTAINS_TYPE_DEFINITION = eINSTANCE.getConfiguration_ContainsTypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Contains Config Var Decl</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__CONTAINS_CONFIG_VAR_DECL = eINSTANCE.getConfiguration_ContainsConfigVarDecl();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__NAME = eINSTANCE.getConfiguration_Name();

		/**
		 * The meta object literal for the '<em><b>Contains Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__CONTAINS_RESOURCE = eINSTANCE.getConfiguration_ContainsResource();

		/**
		 * The meta object literal for the '{@link iec611313Specification.configuration.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.configuration.impl.ResourceImpl
		 * @see iec611313Specification.configuration.impl.ConfigurationPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__NAME = eINSTANCE.getResource_Name();

		/**
		 * The meta object literal for the '<em><b>Resource Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__RESOURCE_TYPE_NAME = eINSTANCE.getResource_ResourceTypeName();

		/**
		 * The meta object literal for the '<em><b>Contains Program Configs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__CONTAINS_PROGRAM_CONFIGS = eINSTANCE.getResource_ContainsProgramConfigs();

		/**
		 * The meta object literal for the '<em><b>Contains Resource Var Decl</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__CONTAINS_RESOURCE_VAR_DECL = eINSTANCE.getResource_ContainsResourceVarDecl();

		/**
		 * The meta object literal for the '<em><b>Contains Task Configs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__CONTAINS_TASK_CONFIGS = eINSTANCE.getResource_ContainsTaskConfigs();

		/**
		 * The meta object literal for the '{@link iec611313Specification.configuration.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.configuration.impl.TaskImpl
		 * @see iec611313Specification.configuration.impl.ConfigurationPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '{@link iec611313Specification.configuration.impl.TaskConfigurationImpl <em>Task Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.configuration.impl.TaskConfigurationImpl
		 * @see iec611313Specification.configuration.impl.ConfigurationPackageImpl#getTaskConfiguration()
		 * @generated
		 */
		EClass TASK_CONFIGURATION = eINSTANCE.getTaskConfiguration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_CONFIGURATION__NAME = eINSTANCE.getTaskConfiguration_Name();

		/**
		 * The meta object literal for the '<em><b>Configures Task</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_CONFIGURATION__CONFIGURES_TASK = eINSTANCE.getTaskConfiguration_ConfiguresTask();

		/**
		 * The meta object literal for the '<em><b>Has Priority</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_CONFIGURATION__HAS_PRIORITY = eINSTANCE.getTaskConfiguration_HasPriority();

		/**
		 * The meta object literal for the '<em><b>Has Single Execution</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_CONFIGURATION__HAS_SINGLE_EXECUTION = eINSTANCE.getTaskConfiguration_HasSingleExecution();

		/**
		 * The meta object literal for the '<em><b>Has Interval Execution</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_CONFIGURATION__HAS_INTERVAL_EXECUTION = eINSTANCE.getTaskConfiguration_HasIntervalExecution();

	}

} //ConfigurationPackage
