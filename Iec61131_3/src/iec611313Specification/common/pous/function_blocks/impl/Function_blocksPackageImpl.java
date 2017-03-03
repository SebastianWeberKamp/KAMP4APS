/**
 */
package iec611313Specification.common.pous.function_blocks.impl;

import iec611313Specification.common.CommonPackage;

import iec611313Specification.common.impl.CommonPackageImpl;

import iec611313Specification.common.oop.OopPackage;

import iec611313Specification.common.oop.impl.OopPackageImpl;

import iec611313Specification.common.pous.function_blocks.FunctionBlockBodySpecification;
import iec611313Specification.common.pous.function_blocks.FunctionBlockInvocation;
import iec611313Specification.common.pous.function_blocks.FunctionBlockType;
import iec611313Specification.common.pous.function_blocks.Function_blocksFactory;
import iec611313Specification.common.pous.function_blocks.Function_blocksPackage;

import iec611313Specification.common.pous.function_blocks.util.Function_blocksValidator;

import iec611313Specification.common.pous.functions.FunctionsPackage;

import iec611313Specification.common.pous.functions.impl.FunctionsPackageImpl;

import iec611313Specification.common.pous.programs.ProgramsPackage;

import iec611313Specification.common.pous.programs.impl.ProgramsPackageImpl;

import iec611313Specification.common.types.TypesPackage;

import iec611313Specification.common.types.impl.TypesPackageImpl;

import iec611313Specification.common.variables.VariablesPackage;

import iec611313Specification.common.variables.impl.VariablesPackageImpl;

import iec611313Specification.configuration.ConfigurationPackage;

import iec611313Specification.configuration.impl.ConfigurationPackageImpl;

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
public class Function_blocksPackageImpl extends EPackageImpl implements Function_blocksPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionBlockBodySpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionBlockInvocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionBlockTypeEClass = null;

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
	 * @see iec611313Specification.common.pous.function_blocks.Function_blocksPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Function_blocksPackageImpl() {
		super(eNS_URI, Function_blocksFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Function_blocksPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Function_blocksPackage init() {
		if (isInited) return (Function_blocksPackage)EPackage.Registry.INSTANCE.getEPackage(Function_blocksPackage.eNS_URI);

		// Obtain or create and register package
		Function_blocksPackageImpl theFunction_blocksPackage = (Function_blocksPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Function_blocksPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Function_blocksPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) : CommonPackage.eINSTANCE);
		ProgramsPackageImpl theProgramsPackage = (ProgramsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProgramsPackage.eNS_URI) instanceof ProgramsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProgramsPackage.eNS_URI) : ProgramsPackage.eINSTANCE);
		FunctionsPackageImpl theFunctionsPackage = (FunctionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI) instanceof FunctionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI) : FunctionsPackage.eINSTANCE);
		VariablesPackageImpl theVariablesPackage = (VariablesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI) instanceof VariablesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI) : VariablesPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		OopPackageImpl theOopPackage = (OopPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OopPackage.eNS_URI) instanceof OopPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OopPackage.eNS_URI) : OopPackage.eINSTANCE);
		ConfigurationPackageImpl theConfigurationPackage = (ConfigurationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI) instanceof ConfigurationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI) : ConfigurationPackage.eINSTANCE);
		IlPackageImpl theIlPackage = (IlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IlPackage.eNS_URI) instanceof IlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IlPackage.eNS_URI) : IlPackage.eINSTANCE);
		StPackageImpl theStPackage = (StPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StPackage.eNS_URI) instanceof StPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StPackage.eNS_URI) : StPackage.eINSTANCE);
		FbdPackageImpl theFbdPackage = (FbdPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FbdPackage.eNS_URI) instanceof FbdPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FbdPackage.eNS_URI) : FbdPackage.eINSTANCE);
		LdPackageImpl theLdPackage = (LdPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LdPackage.eNS_URI) instanceof LdPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LdPackage.eNS_URI) : LdPackage.eINSTANCE);
		SfcPackageImpl theSfcPackage = (SfcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SfcPackage.eNS_URI) instanceof SfcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SfcPackage.eNS_URI) : SfcPackage.eINSTANCE);
		DummyPackageImpl theDummyPackage = (DummyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DummyPackage.eNS_URI) instanceof DummyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DummyPackage.eNS_URI) : DummyPackage.eINSTANCE);

		// Create package meta-data objects
		theFunction_blocksPackage.createPackageContents();
		theCommonPackage.createPackageContents();
		theProgramsPackage.createPackageContents();
		theFunctionsPackage.createPackageContents();
		theVariablesPackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theOopPackage.createPackageContents();
		theConfigurationPackage.createPackageContents();
		theIlPackage.createPackageContents();
		theStPackage.createPackageContents();
		theFbdPackage.createPackageContents();
		theLdPackage.createPackageContents();
		theSfcPackage.createPackageContents();
		theDummyPackage.createPackageContents();

		// Initialize created meta-data
		theFunction_blocksPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theProgramsPackage.initializePackageContents();
		theFunctionsPackage.initializePackageContents();
		theVariablesPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theOopPackage.initializePackageContents();
		theConfigurationPackage.initializePackageContents();
		theIlPackage.initializePackageContents();
		theStPackage.initializePackageContents();
		theFbdPackage.initializePackageContents();
		theLdPackage.initializePackageContents();
		theSfcPackage.initializePackageContents();
		theDummyPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theFunction_blocksPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return Function_blocksValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theFunction_blocksPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Function_blocksPackage.eNS_URI, theFunction_blocksPackage);
		return theFunction_blocksPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionBlockBodySpecification() {
		return functionBlockBodySpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionBlockInvocation() {
		return functionBlockInvocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionBlockInvocation_InvokesFunBlockInstance() {
		return (EReference)functionBlockInvocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionBlockInvocation_HasFunBlockInvocationParamList() {
		return (EReference)functionBlockInvocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionBlockType() {
		return functionBlockTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionBlockType_HasFunBlockBodySpec() {
		return (EReference)functionBlockTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionBlockType_ContainsFunctionBlockVarDecl() {
		return (EReference)functionBlockTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionBlockType_HasInterfaceImplementations() {
		return (EReference)functionBlockTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionBlockType_HasExtensions() {
		return (EReference)functionBlockTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionBlockType_ContainsMethods() {
		return (EReference)functionBlockTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionBlockType_ContainsProperties() {
		return (EReference)functionBlockTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function_blocksFactory getFunction_blocksFactory() {
		return (Function_blocksFactory)getEFactoryInstance();
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
		functionBlockBodySpecificationEClass = createEClass(FUNCTION_BLOCK_BODY_SPECIFICATION);

		functionBlockInvocationEClass = createEClass(FUNCTION_BLOCK_INVOCATION);
		createEReference(functionBlockInvocationEClass, FUNCTION_BLOCK_INVOCATION__INVOKES_FUN_BLOCK_INSTANCE);
		createEReference(functionBlockInvocationEClass, FUNCTION_BLOCK_INVOCATION__HAS_FUN_BLOCK_INVOCATION_PARAM_LIST);

		functionBlockTypeEClass = createEClass(FUNCTION_BLOCK_TYPE);
		createEReference(functionBlockTypeEClass, FUNCTION_BLOCK_TYPE__HAS_FUN_BLOCK_BODY_SPEC);
		createEReference(functionBlockTypeEClass, FUNCTION_BLOCK_TYPE__CONTAINS_FUNCTION_BLOCK_VAR_DECL);
		createEReference(functionBlockTypeEClass, FUNCTION_BLOCK_TYPE__HAS_INTERFACE_IMPLEMENTATIONS);
		createEReference(functionBlockTypeEClass, FUNCTION_BLOCK_TYPE__HAS_EXTENSIONS);
		createEReference(functionBlockTypeEClass, FUNCTION_BLOCK_TYPE__CONTAINS_METHODS);
		createEReference(functionBlockTypeEClass, FUNCTION_BLOCK_TYPE__CONTAINS_PROPERTIES);
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
		StPackage theStPackage = (StPackage)EPackage.Registry.INSTANCE.getEPackage(StPackage.eNS_URI);
		IlPackage theIlPackage = (IlPackage)EPackage.Registry.INSTANCE.getEPackage(IlPackage.eNS_URI);
		FbdPackage theFbdPackage = (FbdPackage)EPackage.Registry.INSTANCE.getEPackage(FbdPackage.eNS_URI);
		VariablesPackage theVariablesPackage = (VariablesPackage)EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI);
		CommonPackage theCommonPackage = (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		OopPackage theOopPackage = (OopPackage)EPackage.Registry.INSTANCE.getEPackage(OopPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		functionBlockInvocationEClass.getESuperTypes().add(theStPackage.getStatement());
		functionBlockInvocationEClass.getESuperTypes().add(theIlPackage.getInstruction());
		functionBlockInvocationEClass.getESuperTypes().add(theFbdPackage.getFBDElement());
		functionBlockTypeEClass.getESuperTypes().add(theTypesPackage.getANY_DERIVED());

		// Initialize classes, features, and operations; add parameters
		initEClass(functionBlockBodySpecificationEClass, FunctionBlockBodySpecification.class, "FunctionBlockBodySpecification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionBlockInvocationEClass, FunctionBlockInvocation.class, "FunctionBlockInvocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionBlockInvocation_InvokesFunBlockInstance(), theVariablesPackage.getVariableAccess(), null, "InvokesFunBlockInstance", null, 1, 1, FunctionBlockInvocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionBlockInvocation_HasFunBlockInvocationParamList(), theCommonPackage.getParameterList(), null, "HasFunBlockInvocationParamList", null, 1, 1, FunctionBlockInvocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionBlockTypeEClass, FunctionBlockType.class, "FunctionBlockType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionBlockType_HasFunBlockBodySpec(), this.getFunctionBlockBodySpecification(), null, "HasFunBlockBodySpec", null, 1, 1, FunctionBlockType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionBlockType_ContainsFunctionBlockVarDecl(), theVariablesPackage.getVariableDeclaration(), null, "ContainsFunctionBlockVarDecl", null, 1, -1, FunctionBlockType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionBlockType_HasInterfaceImplementations(), theOopPackage.getInterface(), null, "HasInterfaceImplementations", null, 0, -1, FunctionBlockType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionBlockType_HasExtensions(), theOopPackage.getInheritance(), null, "HasExtensions", null, 0, 1, FunctionBlockType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionBlockType_ContainsMethods(), theOopPackage.getMethod(), null, "ContainsMethods", null, 0, -1, FunctionBlockType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionBlockType_ContainsProperties(), theOopPackage.getProperty(), null, "ContainsProperties", null, 0, -1, FunctionBlockType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (functionBlockTypeEClass, 
		   source, 
		   new String[] {
			 "constraints", "hasValidVariableDeclarations"
		   });	
		addAnnotation
		  (functionBlockTypeEClass, 
		   source, 
		   new String[] {
			 "constraints", "hasValidVariableAccess"
		   });
	}

} //Function_blocksPackageImpl
