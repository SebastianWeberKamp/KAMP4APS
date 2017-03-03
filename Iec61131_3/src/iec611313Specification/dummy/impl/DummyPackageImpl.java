/**
 */
package iec611313Specification.dummy.impl;

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

import iec611313Specification.configuration.ConfigurationPackage;

import iec611313Specification.configuration.impl.ConfigurationPackageImpl;

import iec611313Specification.dummy.CodeBodyDummy;
import iec611313Specification.dummy.DummyFactory;
import iec611313Specification.dummy.DummyPackage;

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

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DummyPackageImpl extends EPackageImpl implements DummyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeBodyDummyEClass = null;

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
	 * @see iec611313Specification.dummy.DummyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DummyPackageImpl() {
		super(eNS_URI, DummyFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DummyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DummyPackage init() {
		if (isInited) return (DummyPackage)EPackage.Registry.INSTANCE.getEPackage(DummyPackage.eNS_URI);

		// Obtain or create and register package
		DummyPackageImpl theDummyPackage = (DummyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DummyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DummyPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) : CommonPackage.eINSTANCE);
		Function_blocksPackageImpl theFunction_blocksPackage = (Function_blocksPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Function_blocksPackage.eNS_URI) instanceof Function_blocksPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Function_blocksPackage.eNS_URI) : Function_blocksPackage.eINSTANCE);
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

		// Create package meta-data objects
		theDummyPackage.createPackageContents();
		theCommonPackage.createPackageContents();
		theFunction_blocksPackage.createPackageContents();
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

		// Initialize created meta-data
		theDummyPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theFunction_blocksPackage.initializePackageContents();
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

		// Mark meta-data to indicate it can't be changed
		theDummyPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DummyPackage.eNS_URI, theDummyPackage);
		return theDummyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeBodyDummy() {
		return codeBodyDummyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeBodyDummy_Value() {
		return (EAttribute)codeBodyDummyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DummyFactory getDummyFactory() {
		return (DummyFactory)getEFactoryInstance();
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
		codeBodyDummyEClass = createEClass(CODE_BODY_DUMMY);
		createEAttribute(codeBodyDummyEClass, CODE_BODY_DUMMY__VALUE);
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
		Function_blocksPackage theFunction_blocksPackage = (Function_blocksPackage)EPackage.Registry.INSTANCE.getEPackage(Function_blocksPackage.eNS_URI);
		FunctionsPackage theFunctionsPackage = (FunctionsPackage)EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		codeBodyDummyEClass.getESuperTypes().add(theFunction_blocksPackage.getFunctionBlockBodySpecification());
		codeBodyDummyEClass.getESuperTypes().add(theFunctionsPackage.getFunctionBodySpecification());

		// Initialize classes, features, and operations; add parameters
		initEClass(codeBodyDummyEClass, CodeBodyDummy.class, "CodeBodyDummy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCodeBodyDummy_Value(), ecorePackage.getEString(), "value", null, 1, 1, CodeBodyDummy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DummyPackageImpl
