/**
 */
package iec611313Specification.common.types.impl;

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

import iec611313Specification.common.types.TypesFactory;
import iec611313Specification.common.types.TypesPackage;

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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypesPackageImpl extends EPackageImpl implements TypesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anY_ELEMENTARYEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anY_DERIVEDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anY_MAGNITUDEEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anY_DATEEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anY_BITEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anY_STRINGEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anY_NUMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anY_REALEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anY_INTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lrealEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass udintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ulintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datE_AND_TIMEEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timE_OF_DAYEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass byteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dwordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lwordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wstringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointerEClass = null;

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
	 * @see iec611313Specification.common.types.TypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TypesPackageImpl() {
		super(eNS_URI, TypesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TypesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TypesPackage init() {
		if (isInited) return (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Obtain or create and register package
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TypesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) : CommonPackage.eINSTANCE);
		Function_blocksPackageImpl theFunction_blocksPackage = (Function_blocksPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Function_blocksPackage.eNS_URI) instanceof Function_blocksPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Function_blocksPackage.eNS_URI) : Function_blocksPackage.eINSTANCE);
		ProgramsPackageImpl theProgramsPackage = (ProgramsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProgramsPackage.eNS_URI) instanceof ProgramsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProgramsPackage.eNS_URI) : ProgramsPackage.eINSTANCE);
		FunctionsPackageImpl theFunctionsPackage = (FunctionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI) instanceof FunctionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI) : FunctionsPackage.eINSTANCE);
		VariablesPackageImpl theVariablesPackage = (VariablesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI) instanceof VariablesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI) : VariablesPackage.eINSTANCE);
		OopPackageImpl theOopPackage = (OopPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OopPackage.eNS_URI) instanceof OopPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OopPackage.eNS_URI) : OopPackage.eINSTANCE);
		ConfigurationPackageImpl theConfigurationPackage = (ConfigurationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI) instanceof ConfigurationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI) : ConfigurationPackage.eINSTANCE);
		IlPackageImpl theIlPackage = (IlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IlPackage.eNS_URI) instanceof IlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IlPackage.eNS_URI) : IlPackage.eINSTANCE);
		StPackageImpl theStPackage = (StPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StPackage.eNS_URI) instanceof StPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StPackage.eNS_URI) : StPackage.eINSTANCE);
		FbdPackageImpl theFbdPackage = (FbdPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FbdPackage.eNS_URI) instanceof FbdPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FbdPackage.eNS_URI) : FbdPackage.eINSTANCE);
		LdPackageImpl theLdPackage = (LdPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LdPackage.eNS_URI) instanceof LdPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LdPackage.eNS_URI) : LdPackage.eINSTANCE);
		SfcPackageImpl theSfcPackage = (SfcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SfcPackage.eNS_URI) instanceof SfcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SfcPackage.eNS_URI) : SfcPackage.eINSTANCE);
		DummyPackageImpl theDummyPackage = (DummyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DummyPackage.eNS_URI) instanceof DummyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DummyPackage.eNS_URI) : DummyPackage.eINSTANCE);

		// Create package meta-data objects
		theTypesPackage.createPackageContents();
		theCommonPackage.createPackageContents();
		theFunction_blocksPackage.createPackageContents();
		theProgramsPackage.createPackageContents();
		theFunctionsPackage.createPackageContents();
		theVariablesPackage.createPackageContents();
		theOopPackage.createPackageContents();
		theConfigurationPackage.createPackageContents();
		theIlPackage.createPackageContents();
		theStPackage.createPackageContents();
		theFbdPackage.createPackageContents();
		theLdPackage.createPackageContents();
		theSfcPackage.createPackageContents();
		theDummyPackage.createPackageContents();

		// Initialize created meta-data
		theTypesPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theFunction_blocksPackage.initializePackageContents();
		theProgramsPackage.initializePackageContents();
		theFunctionsPackage.initializePackageContents();
		theVariablesPackage.initializePackageContents();
		theOopPackage.initializePackageContents();
		theConfigurationPackage.initializePackageContents();
		theIlPackage.initializePackageContents();
		theStPackage.initializePackageContents();
		theFbdPackage.initializePackageContents();
		theLdPackage.initializePackageContents();
		theSfcPackage.initializePackageContents();
		theDummyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTypesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TypesPackage.eNS_URI, theTypesPackage);
		return theTypesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getANY() {
		return anyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getANY_ELEMENTARY() {
		return anY_ELEMENTARYEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getANY_DERIVED() {
		return anY_DERIVEDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getANY_DERIVED_TypeName() {
		return (EAttribute)anY_DERIVEDEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getANY_MAGNITUDE() {
		return anY_MAGNITUDEEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getANY_DATE() {
		return anY_DATEEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getANY_BIT() {
		return anY_BITEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getANY_STRING() {
		return anY_STRINGEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTIME() {
		return timeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getANY_NUM() {
		return anY_NUMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getANY_REAL() {
		return anY_REALEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getANY_INT() {
		return anY_INTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getREAL() {
		return realEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLREAL() {
		return lrealEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSINT() {
		return sintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getINT() {
		return intEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDINT() {
		return dintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLINT() {
		return lintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUSINT() {
		return usintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUINT() {
		return uintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUDINT() {
		return udintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getULINT() {
		return ulintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDATE() {
		return dateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDATE_AND_TIME() {
		return datE_AND_TIMEEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTIME_OF_DAY() {
		return timE_OF_DAYEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBOOL() {
		return boolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBYTE() {
		return byteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWORD() {
		return wordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDWORD() {
		return dwordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLWORD() {
		return lwordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSTRING() {
		return stringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWSTRING() {
		return wstringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getENUMERATION() {
		return enumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getENUMERATION_ContainsEnumValue() {
		return (EReference)enumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getENUMERATION_HasInitialEnumValue() {
		return (EReference)enumerationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDERIVED() {
		return derivedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDERIVED_HasInitialDerivedValue() {
		return (EReference)derivedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDERIVED_HasSubrangeRange() {
		return (EReference)derivedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDERIVED_HasDerivedBaseType() {
		return (EReference)derivedEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getARRAY() {
		return arrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getARRAY_HasArrayDimension() {
		return (EReference)arrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getARRAY_HasInitialArrayValue() {
		return (EReference)arrayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getARRAY_HasArrayBaseType() {
		return (EReference)arrayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSTRUCTURE() {
		return structureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSTRUCTURE_ContainsStructVarDecl() {
		return (EReference)structureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPOINTER() {
		return pointerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPOINTER_HasDerivedBaseType() {
		return (EReference)pointerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesFactory getTypesFactory() {
		return (TypesFactory)getEFactoryInstance();
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
		anyEClass = createEClass(ANY);

		anY_ELEMENTARYEClass = createEClass(ANY_ELEMENTARY);

		anY_DERIVEDEClass = createEClass(ANY_DERIVED);
		createEAttribute(anY_DERIVEDEClass, ANY_DERIVED__TYPE_NAME);

		anY_MAGNITUDEEClass = createEClass(ANY_MAGNITUDE);

		anY_DATEEClass = createEClass(ANY_DATE);

		anY_BITEClass = createEClass(ANY_BIT);

		anY_STRINGEClass = createEClass(ANY_STRING);

		timeEClass = createEClass(TIME);

		anY_NUMEClass = createEClass(ANY_NUM);

		anY_REALEClass = createEClass(ANY_REAL);

		anY_INTEClass = createEClass(ANY_INT);

		realEClass = createEClass(REAL);

		lrealEClass = createEClass(LREAL);

		sintEClass = createEClass(SINT);

		intEClass = createEClass(INT);

		dintEClass = createEClass(DINT);

		lintEClass = createEClass(LINT);

		usintEClass = createEClass(USINT);

		uintEClass = createEClass(UINT);

		udintEClass = createEClass(UDINT);

		ulintEClass = createEClass(ULINT);

		dateEClass = createEClass(DATE);

		datE_AND_TIMEEClass = createEClass(DATE_AND_TIME);

		timE_OF_DAYEClass = createEClass(TIME_OF_DAY);

		boolEClass = createEClass(BOOL);

		byteEClass = createEClass(BYTE);

		wordEClass = createEClass(WORD);

		dwordEClass = createEClass(DWORD);

		lwordEClass = createEClass(LWORD);

		stringEClass = createEClass(STRING);

		wstringEClass = createEClass(WSTRING);

		enumerationEClass = createEClass(ENUMERATION);
		createEReference(enumerationEClass, ENUMERATION__CONTAINS_ENUM_VALUE);
		createEReference(enumerationEClass, ENUMERATION__HAS_INITIAL_ENUM_VALUE);

		derivedEClass = createEClass(DERIVED);
		createEReference(derivedEClass, DERIVED__HAS_INITIAL_DERIVED_VALUE);
		createEReference(derivedEClass, DERIVED__HAS_SUBRANGE_RANGE);
		createEReference(derivedEClass, DERIVED__HAS_DERIVED_BASE_TYPE);

		arrayEClass = createEClass(ARRAY);
		createEReference(arrayEClass, ARRAY__HAS_ARRAY_DIMENSION);
		createEReference(arrayEClass, ARRAY__HAS_INITIAL_ARRAY_VALUE);
		createEReference(arrayEClass, ARRAY__HAS_ARRAY_BASE_TYPE);

		structureEClass = createEClass(STRUCTURE);
		createEReference(structureEClass, STRUCTURE__CONTAINS_STRUCT_VAR_DECL);

		pointerEClass = createEClass(POINTER);
		createEReference(pointerEClass, POINTER__HAS_DERIVED_BASE_TYPE);
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
		CommonPackage theCommonPackage = (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);
		VariablesPackage theVariablesPackage = (VariablesPackage)EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		anY_ELEMENTARYEClass.getESuperTypes().add(this.getANY());
		anY_DERIVEDEClass.getESuperTypes().add(this.getANY());
		anY_MAGNITUDEEClass.getESuperTypes().add(this.getANY_ELEMENTARY());
		anY_DATEEClass.getESuperTypes().add(this.getANY_ELEMENTARY());
		anY_BITEClass.getESuperTypes().add(this.getANY_ELEMENTARY());
		anY_STRINGEClass.getESuperTypes().add(this.getANY_ELEMENTARY());
		timeEClass.getESuperTypes().add(this.getANY_MAGNITUDE());
		anY_NUMEClass.getESuperTypes().add(this.getANY_MAGNITUDE());
		anY_REALEClass.getESuperTypes().add(this.getANY_NUM());
		anY_INTEClass.getESuperTypes().add(this.getANY_NUM());
		realEClass.getESuperTypes().add(this.getANY_REAL());
		lrealEClass.getESuperTypes().add(this.getANY_REAL());
		sintEClass.getESuperTypes().add(this.getANY_INT());
		intEClass.getESuperTypes().add(this.getANY_INT());
		dintEClass.getESuperTypes().add(this.getANY_INT());
		lintEClass.getESuperTypes().add(this.getANY_INT());
		usintEClass.getESuperTypes().add(this.getANY_INT());
		uintEClass.getESuperTypes().add(this.getANY_INT());
		udintEClass.getESuperTypes().add(this.getANY_INT());
		ulintEClass.getESuperTypes().add(this.getANY_INT());
		dateEClass.getESuperTypes().add(this.getANY_DATE());
		datE_AND_TIMEEClass.getESuperTypes().add(this.getANY_DATE());
		timE_OF_DAYEClass.getESuperTypes().add(this.getDATE());
		timE_OF_DAYEClass.getESuperTypes().add(this.getDATE_AND_TIME());
		boolEClass.getESuperTypes().add(this.getANY_BIT());
		byteEClass.getESuperTypes().add(this.getANY_BIT());
		wordEClass.getESuperTypes().add(this.getANY_BIT());
		dwordEClass.getESuperTypes().add(this.getANY_BIT());
		lwordEClass.getESuperTypes().add(this.getANY_BIT());
		stringEClass.getESuperTypes().add(this.getANY_STRING());
		wstringEClass.getESuperTypes().add(this.getANY_STRING());
		enumerationEClass.getESuperTypes().add(this.getANY_DERIVED());
		derivedEClass.getESuperTypes().add(this.getANY_DERIVED());
		arrayEClass.getESuperTypes().add(this.getANY_DERIVED());
		structureEClass.getESuperTypes().add(this.getANY_DERIVED());
		pointerEClass.getESuperTypes().add(this.getANY_DERIVED());

		// Initialize classes, features, and operations; add parameters
		initEClass(anyEClass, iec611313Specification.common.types.ANY.class, "ANY", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(anY_ELEMENTARYEClass, iec611313Specification.common.types.ANY_ELEMENTARY.class, "ANY_ELEMENTARY", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(anY_DERIVEDEClass, iec611313Specification.common.types.ANY_DERIVED.class, "ANY_DERIVED", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getANY_DERIVED_TypeName(), ecorePackage.getEString(), "typeName", "", 1, 1, iec611313Specification.common.types.ANY_DERIVED.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anY_MAGNITUDEEClass, iec611313Specification.common.types.ANY_MAGNITUDE.class, "ANY_MAGNITUDE", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(anY_DATEEClass, iec611313Specification.common.types.ANY_DATE.class, "ANY_DATE", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(anY_BITEClass, iec611313Specification.common.types.ANY_BIT.class, "ANY_BIT", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(anY_STRINGEClass, iec611313Specification.common.types.ANY_STRING.class, "ANY_STRING", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timeEClass, iec611313Specification.common.types.TIME.class, "TIME", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(anY_NUMEClass, iec611313Specification.common.types.ANY_NUM.class, "ANY_NUM", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(anY_REALEClass, iec611313Specification.common.types.ANY_REAL.class, "ANY_REAL", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(anY_INTEClass, iec611313Specification.common.types.ANY_INT.class, "ANY_INT", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(realEClass, iec611313Specification.common.types.REAL.class, "REAL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lrealEClass, iec611313Specification.common.types.LREAL.class, "LREAL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sintEClass, iec611313Specification.common.types.SINT.class, "SINT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(intEClass, iec611313Specification.common.types.INT.class, "INT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dintEClass, iec611313Specification.common.types.DINT.class, "DINT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lintEClass, iec611313Specification.common.types.LINT.class, "LINT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(usintEClass, iec611313Specification.common.types.USINT.class, "USINT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uintEClass, iec611313Specification.common.types.UINT.class, "UINT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(udintEClass, iec611313Specification.common.types.UDINT.class, "UDINT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ulintEClass, iec611313Specification.common.types.ULINT.class, "ULINT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dateEClass, iec611313Specification.common.types.DATE.class, "DATE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(datE_AND_TIMEEClass, iec611313Specification.common.types.DATE_AND_TIME.class, "DATE_AND_TIME", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timE_OF_DAYEClass, iec611313Specification.common.types.TIME_OF_DAY.class, "TIME_OF_DAY", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(boolEClass, iec611313Specification.common.types.BOOL.class, "BOOL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(byteEClass, iec611313Specification.common.types.BYTE.class, "BYTE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wordEClass, iec611313Specification.common.types.WORD.class, "WORD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dwordEClass, iec611313Specification.common.types.DWORD.class, "DWORD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lwordEClass, iec611313Specification.common.types.LWORD.class, "LWORD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringEClass, iec611313Specification.common.types.STRING.class, "STRING", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wstringEClass, iec611313Specification.common.types.WSTRING.class, "WSTRING", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(enumerationEClass, iec611313Specification.common.types.ENUMERATION.class, "ENUMERATION", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getENUMERATION_ContainsEnumValue(), theCommonPackage.getLiteral(), null, "ContainsEnumValue", null, 1, -1, iec611313Specification.common.types.ENUMERATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getENUMERATION_HasInitialEnumValue(), theCommonPackage.getLiteral(), null, "HasInitialEnumValue", null, 0, 1, iec611313Specification.common.types.ENUMERATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(derivedEClass, iec611313Specification.common.types.DERIVED.class, "DERIVED", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDERIVED_HasInitialDerivedValue(), theCommonPackage.getLiteral(), null, "HasInitialDerivedValue", null, 0, 1, iec611313Specification.common.types.DERIVED.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDERIVED_HasSubrangeRange(), theCommonPackage.getRange(), null, "HasSubrangeRange", null, 0, 1, iec611313Specification.common.types.DERIVED.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDERIVED_HasDerivedBaseType(), this.getANY(), null, "HasDerivedBaseType", null, 1, 1, iec611313Specification.common.types.DERIVED.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayEClass, iec611313Specification.common.types.ARRAY.class, "ARRAY", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getARRAY_HasArrayDimension(), theCommonPackage.getRange(), null, "HasArrayDimension", null, 1, -1, iec611313Specification.common.types.ARRAY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getARRAY_HasInitialArrayValue(), theCommonPackage.getLiteral(), null, "HasInitialArrayValue", null, 0, -1, iec611313Specification.common.types.ARRAY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getARRAY_HasArrayBaseType(), this.getANY(), null, "HasArrayBaseType", null, 1, 1, iec611313Specification.common.types.ARRAY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structureEClass, iec611313Specification.common.types.STRUCTURE.class, "STRUCTURE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSTRUCTURE_ContainsStructVarDecl(), theVariablesPackage.getVariableDeclaration(), null, "ContainsStructVarDecl", null, 1, -1, iec611313Specification.common.types.STRUCTURE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pointerEClass, iec611313Specification.common.types.POINTER.class, "POINTER", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPOINTER_HasDerivedBaseType(), this.getANY(), null, "HasDerivedBaseType", null, 1, 1, iec611313Specification.common.types.POINTER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //TypesPackageImpl
