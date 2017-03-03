/**
 */
package iec611313Specification.configuration.impl;

import iec611313Specification.common.CommonPackage;

import iec611313Specification.common.impl.CommonPackageImpl;

import iec611313Specification.common.oop.OopPackage;

import iec611313Specification.common.oop.impl.OopPackageImpl;

import iec611313Specification.common.pous.function_blocks.Function_blocksPackage;

import iec611313Specification.common.pous.function_blocks.impl.Function_blocksPackageImpl;

import iec611313Specification.common.pous.functions.FunctionsPackage;

import iec611313Specification.common.pous.functions.impl.FunctionsPackageImpl;

import iec611313Specification.common.pous.programs.ProgramsPackage;

import iec611313Specification.common.pous.programs.impl.ProgramsPackageImpl;

import iec611313Specification.common.types.TypesPackage;

import iec611313Specification.common.types.impl.TypesPackageImpl;

import iec611313Specification.common.variables.VariablesPackage;

import iec611313Specification.common.variables.impl.VariablesPackageImpl;

import iec611313Specification.configuration.Configuration;
import iec611313Specification.configuration.ConfigurationFactory;
import iec611313Specification.configuration.ConfigurationPackage;
import iec611313Specification.configuration.Resource;
import iec611313Specification.configuration.Task;
import iec611313Specification.configuration.TaskConfiguration;

import iec611313Specification.configuration.util.ConfigurationValidator;

import iec611313Specification.dummy.DummyPackage;

import iec611313Specification.dummy.impl.DummyPackageImpl;

import iec611313Specification.language.fbd.FbdPackage;

import iec611313Specification.language.fbd.impl.FbdPackageImpl;

import iec611313Specification.language.il.IlPackage;

import iec611313Specification.language.il.impl.IlPackageImpl;

import iec611313Specification.language.ld.LdPackage;

import iec611313Specification.language.ld.impl.LdPackageImpl;

import iec611313Specification.language.sfc.SfcPackage;

import iec611313Specification.language.sfc.impl.SfcPackageImpl;

import iec611313Specification.language.st.StPackage;

import iec611313Specification.language.st.impl.StPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigurationPackageImpl extends EPackageImpl implements ConfigurationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskConfigurationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see iec611313Specification.configuration.ConfigurationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConfigurationPackageImpl() {
		super(eNS_URI, ConfigurationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ConfigurationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConfigurationPackage init() {
		if (isInited) return (ConfigurationPackage)EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI);

		// Obtain or create and register package
		ConfigurationPackageImpl theConfigurationPackage = (ConfigurationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ConfigurationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ConfigurationPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) : CommonPackage.eINSTANCE);
		Function_blocksPackageImpl theFunction_blocksPackage = (Function_blocksPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Function_blocksPackage.eNS_URI) instanceof Function_blocksPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Function_blocksPackage.eNS_URI) : Function_blocksPackage.eINSTANCE);
		ProgramsPackageImpl theProgramsPackage = (ProgramsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProgramsPackage.eNS_URI) instanceof ProgramsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProgramsPackage.eNS_URI) : ProgramsPackage.eINSTANCE);
		FunctionsPackageImpl theFunctionsPackage = (FunctionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI) instanceof FunctionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI) : FunctionsPackage.eINSTANCE);
		VariablesPackageImpl theVariablesPackage = (VariablesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI) instanceof VariablesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI) : VariablesPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		OopPackageImpl theOopPackage = (OopPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OopPackage.eNS_URI) instanceof OopPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OopPackage.eNS_URI) : OopPackage.eINSTANCE);
		IlPackageImpl theIlPackage = (IlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IlPackage.eNS_URI) instanceof IlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IlPackage.eNS_URI) : IlPackage.eINSTANCE);
		StPackageImpl theStPackage = (StPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StPackage.eNS_URI) instanceof StPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StPackage.eNS_URI) : StPackage.eINSTANCE);
		FbdPackageImpl theFbdPackage = (FbdPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FbdPackage.eNS_URI) instanceof FbdPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FbdPackage.eNS_URI) : FbdPackage.eINSTANCE);
		LdPackageImpl theLdPackage = (LdPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LdPackage.eNS_URI) instanceof LdPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LdPackage.eNS_URI) : LdPackage.eINSTANCE);
		SfcPackageImpl theSfcPackage = (SfcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SfcPackage.eNS_URI) instanceof SfcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SfcPackage.eNS_URI) : SfcPackage.eINSTANCE);
		DummyPackageImpl theDummyPackage = (DummyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DummyPackage.eNS_URI) instanceof DummyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DummyPackage.eNS_URI) : DummyPackage.eINSTANCE);

		// Create package meta-data objects
		theConfigurationPackage.createPackageContents();
		theCommonPackage.createPackageContents();
		theFunction_blocksPackage.createPackageContents();
		theProgramsPackage.createPackageContents();
		theFunctionsPackage.createPackageContents();
		theVariablesPackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theOopPackage.createPackageContents();
		theIlPackage.createPackageContents();
		theStPackage.createPackageContents();
		theFbdPackage.createPackageContents();
		theLdPackage.createPackageContents();
		theSfcPackage.createPackageContents();
		theDummyPackage.createPackageContents();

		// Initialize created meta-data
		theConfigurationPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theFunction_blocksPackage.initializePackageContents();
		theProgramsPackage.initializePackageContents();
		theFunctionsPackage.initializePackageContents();
		theVariablesPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theOopPackage.initializePackageContents();
		theIlPackage.initializePackageContents();
		theStPackage.initializePackageContents();
		theFbdPackage.initializePackageContents();
		theLdPackage.initializePackageContents();
		theSfcPackage.initializePackageContents();
		theDummyPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theConfigurationPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ConfigurationValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theConfigurationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConfigurationPackage.eNS_URI, theConfigurationPackage);
		return theConfigurationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfiguration() {
		return configurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_ContainsTypeDefinition() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_ContainsConfigVarDecl() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_Name() {
		return (EAttribute)configurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_ContainsResource() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_Name() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_ResourceTypeName() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResource_ContainsProgramConfigs() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResource_ContainsResourceVarDecl() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResource_ContainsTaskConfigs() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskConfiguration() {
		return taskConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskConfiguration_Name() {
		return (EAttribute)taskConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskConfiguration_ConfiguresTask() {
		return (EReference)taskConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskConfiguration_HasPriority() {
		return (EReference)taskConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskConfiguration_HasSingleExecution() {
		return (EReference)taskConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskConfiguration_HasIntervalExecution() {
		return (EReference)taskConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationFactory getConfigurationFactory() {
		return (ConfigurationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		configurationEClass = createEClass(CONFIGURATION);
		createEReference(configurationEClass, CONFIGURATION__CONTAINS_TYPE_DEFINITION);
		createEReference(configurationEClass, CONFIGURATION__CONTAINS_CONFIG_VAR_DECL);
		createEAttribute(configurationEClass, CONFIGURATION__NAME);
		createEReference(configurationEClass, CONFIGURATION__CONTAINS_RESOURCE);

		resourceEClass = createEClass(RESOURCE);
		createEAttribute(resourceEClass, RESOURCE__NAME);
		createEAttribute(resourceEClass, RESOURCE__RESOURCE_TYPE_NAME);
		createEReference(resourceEClass, RESOURCE__CONTAINS_PROGRAM_CONFIGS);
		createEReference(resourceEClass, RESOURCE__CONTAINS_RESOURCE_VAR_DECL);
		createEReference(resourceEClass, RESOURCE__CONTAINS_TASK_CONFIGS);

		taskEClass = createEClass(TASK);

		taskConfigurationEClass = createEClass(TASK_CONFIGURATION);
		createEAttribute(taskConfigurationEClass, TASK_CONFIGURATION__NAME);
		createEReference(taskConfigurationEClass, TASK_CONFIGURATION__CONFIGURES_TASK);
		createEReference(taskConfigurationEClass, TASK_CONFIGURATION__HAS_PRIORITY);
		createEReference(taskConfigurationEClass, TASK_CONFIGURATION__HAS_SINGLE_EXECUTION);
		createEReference(taskConfigurationEClass, TASK_CONFIGURATION__HAS_INTERVAL_EXECUTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		VariablesPackage theVariablesPackage = (VariablesPackage)EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI);
		ProgramsPackage theProgramsPackage = (ProgramsPackage)EPackage.Registry.INSTANCE.getEPackage(ProgramsPackage.eNS_URI);
		CommonPackage theCommonPackage = (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(configurationEClass, Configuration.class, "Configuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfiguration_ContainsTypeDefinition(), theTypesPackage.getANY_DERIVED(), null, "ContainsTypeDefinition", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_ContainsConfigVarDecl(), theVariablesPackage.getVariableDeclaration(), null, "ContainsConfigVarDecl", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfiguration_Name(), ecorePackage.getEString(), "name", null, 1, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_ContainsResource(), this.getResource(), null, "ContainsResource", null, 1, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResource_Name(), ecorePackage.getEString(), "name", null, 1, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_ResourceTypeName(), ecorePackage.getEString(), "resourceTypeName", null, 1, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_ContainsProgramConfigs(), theProgramsPackage.getProgramConfiguration(), null, "ContainsProgramConfigs", null, 1, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_ContainsResourceVarDecl(), theVariablesPackage.getVariableDeclaration(), null, "ContainsResourceVarDecl", null, 0, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_ContainsTaskConfigs(), this.getTaskConfiguration(), null, "ContainsTaskConfigs", null, 0, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(taskConfigurationEClass, TaskConfiguration.class, "TaskConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaskConfiguration_Name(), ecorePackage.getEString(), "name", null, 1, 1, TaskConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskConfiguration_ConfiguresTask(), this.getTask(), null, "ConfiguresTask", null, 1, 1, TaskConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskConfiguration_HasPriority(), theCommonPackage.getExpression(), null, "HasPriority", null, 1, 1, TaskConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskConfiguration_HasSingleExecution(), theCommonPackage.getExpression(), null, "HasSingleExecution", null, 1, 1, TaskConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskConfiguration_HasIntervalExecution(), theCommonPackage.getExpression(), null, "HasIntervalExecution", null, 1, 1, TaskConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (configurationEClass, 
		   source, 
		   new String[] {
			 "constraints", "hasValidVariableDeclarations"
		   });	
		addAnnotation
		  (resourceEClass, 
		   source, 
		   new String[] {
			 "constraints", "hasValidVariableDeclarations"
		   });	
		addAnnotation
		  (taskConfigurationEClass, 
		   source, 
		   new String[] {
			 "constraints", "hasOnlyOneExecutionMechanism"
		   });
	}

} //ConfigurationPackageImpl
