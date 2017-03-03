/**
 */
package iec611313Specification.language.ld.impl;

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

import iec611313Specification.dummy.DummyPackage;

import iec611313Specification.dummy.impl.DummyPackageImpl;

import iec611313Specification.language.fbd.FbdPackage;

import iec611313Specification.language.fbd.impl.FbdPackageImpl;

import iec611313Specification.language.il.IlPackage;

import iec611313Specification.language.il.impl.IlPackageImpl;

import iec611313Specification.language.ld.Coil;
import iec611313Specification.language.ld.CoilType;
import iec611313Specification.language.ld.Contact;
import iec611313Specification.language.ld.ContactType;
import iec611313Specification.language.ld.LDElement;
import iec611313Specification.language.ld.LDNode;
import iec611313Specification.language.ld.LadderDiagram;
import iec611313Specification.language.ld.LadderNetwork;
import iec611313Specification.language.ld.LdFactory;
import iec611313Specification.language.ld.LdPackage;
import iec611313Specification.language.ld.PowerFlowLine;
import iec611313Specification.language.ld.PowerRail;

import iec611313Specification.language.ld.util.LdValidator;

import iec611313Specification.language.sfc.SfcPackage;

import iec611313Specification.language.sfc.impl.SfcPackageImpl;

import iec611313Specification.language.st.StPackage;

import iec611313Specification.language.st.impl.StPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
public class LdPackageImpl extends EPackageImpl implements LdPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coilEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ladderDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ladderNetworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ldElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ldNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerFlowLineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerRailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contactTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum coilTypeEEnum = null;

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
	 * @see iec611313Specification.language.ld.LdPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LdPackageImpl() {
		super(eNS_URI, LdFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LdPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LdPackage init() {
		if (isInited) return (LdPackage)EPackage.Registry.INSTANCE.getEPackage(LdPackage.eNS_URI);

		// Obtain or create and register package
		LdPackageImpl theLdPackage = (LdPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LdPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LdPackageImpl());

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
		SfcPackageImpl theSfcPackage = (SfcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SfcPackage.eNS_URI) instanceof SfcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SfcPackage.eNS_URI) : SfcPackage.eINSTANCE);
		DummyPackageImpl theDummyPackage = (DummyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DummyPackage.eNS_URI) instanceof DummyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DummyPackage.eNS_URI) : DummyPackage.eINSTANCE);

		// Create package meta-data objects
		theLdPackage.createPackageContents();
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
		theSfcPackage.createPackageContents();
		theDummyPackage.createPackageContents();

		// Initialize created meta-data
		theLdPackage.initializePackageContents();
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
		theSfcPackage.initializePackageContents();
		theDummyPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theLdPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return LdValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theLdPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LdPackage.eNS_URI, theLdPackage);
		return theLdPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoil() {
		return coilEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoil_CoilType() {
		return (EAttribute)coilEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContact() {
		return contactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContact_ContactType() {
		return (EAttribute)contactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLadderDiagram() {
		return ladderDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLadderDiagram_ContainsLadderNetwork() {
		return (EReference)ladderDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLadderNetwork() {
		return ladderNetworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLadderNetwork_HasLDNetworkLabel() {
		return (EReference)ladderNetworkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLadderNetwork_ContainsPowerFlowLine() {
		return (EReference)ladderNetworkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLadderNetwork_ContainsLDElement() {
		return (EReference)ladderNetworkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLDElement() {
		return ldElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLDNode() {
		return ldNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLDNode_HasLDNodeVariable() {
		return (EReference)ldNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPowerFlowLine() {
		return powerFlowLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPowerFlowLine_HasPowerSource() {
		return (EReference)powerFlowLineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPowerFlowLine_HasPowerSink() {
		return (EReference)powerFlowLineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPowerRail() {
		return powerRailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPowerRail_HasLeftPowerRail() {
		return (EReference)powerRailEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPowerRail_HasRightPowerRail() {
		return (EReference)powerRailEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContactType() {
		return contactTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCoilType() {
		return coilTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LdFactory getLdFactory() {
		return (LdFactory)getEFactoryInstance();
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
		coilEClass = createEClass(COIL);
		createEAttribute(coilEClass, COIL__COIL_TYPE);

		contactEClass = createEClass(CONTACT);
		createEAttribute(contactEClass, CONTACT__CONTACT_TYPE);

		ladderDiagramEClass = createEClass(LADDER_DIAGRAM);
		createEReference(ladderDiagramEClass, LADDER_DIAGRAM__CONTAINS_LADDER_NETWORK);

		ladderNetworkEClass = createEClass(LADDER_NETWORK);
		createEReference(ladderNetworkEClass, LADDER_NETWORK__HAS_LD_NETWORK_LABEL);
		createEReference(ladderNetworkEClass, LADDER_NETWORK__CONTAINS_POWER_FLOW_LINE);
		createEReference(ladderNetworkEClass, LADDER_NETWORK__CONTAINS_LD_ELEMENT);

		ldElementEClass = createEClass(LD_ELEMENT);

		ldNodeEClass = createEClass(LD_NODE);
		createEReference(ldNodeEClass, LD_NODE__HAS_LD_NODE_VARIABLE);

		powerFlowLineEClass = createEClass(POWER_FLOW_LINE);
		createEReference(powerFlowLineEClass, POWER_FLOW_LINE__HAS_POWER_SOURCE);
		createEReference(powerFlowLineEClass, POWER_FLOW_LINE__HAS_POWER_SINK);

		powerRailEClass = createEClass(POWER_RAIL);
		createEReference(powerRailEClass, POWER_RAIL__HAS_LEFT_POWER_RAIL);
		createEReference(powerRailEClass, POWER_RAIL__HAS_RIGHT_POWER_RAIL);

		// Create enums
		contactTypeEEnum = createEEnum(CONTACT_TYPE);
		coilTypeEEnum = createEEnum(COIL_TYPE);
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
		FunctionsPackage theFunctionsPackage = (FunctionsPackage)EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI);
		Function_blocksPackage theFunction_blocksPackage = (Function_blocksPackage)EPackage.Registry.INSTANCE.getEPackage(Function_blocksPackage.eNS_URI);
		CommonPackage theCommonPackage = (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);
		VariablesPackage theVariablesPackage = (VariablesPackage)EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		coilEClass.getESuperTypes().add(this.getLDNode());
		contactEClass.getESuperTypes().add(this.getLDNode());
		ladderDiagramEClass.getESuperTypes().add(theFunctionsPackage.getFunctionBodySpecification());
		ladderDiagramEClass.getESuperTypes().add(theFunction_blocksPackage.getFunctionBlockBodySpecification());
		ldNodeEClass.getESuperTypes().add(this.getLDElement());
		powerRailEClass.getESuperTypes().add(this.getLDElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(coilEClass, Coil.class, "Coil", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCoil_CoilType(), this.getCoilType(), "coilType", null, 1, 1, Coil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contactEClass, Contact.class, "Contact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContact_ContactType(), this.getContactType(), "contactType", null, 1, 1, Contact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ladderDiagramEClass, LadderDiagram.class, "LadderDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLadderDiagram_ContainsLadderNetwork(), this.getLadderNetwork(), null, "ContainsLadderNetwork", null, 1, -1, LadderDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ladderNetworkEClass, LadderNetwork.class, "LadderNetwork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLadderNetwork_HasLDNetworkLabel(), theCommonPackage.getLabel(), null, "HasLDNetworkLabel", null, 0, 1, LadderNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLadderNetwork_ContainsPowerFlowLine(), this.getPowerFlowLine(), null, "ContainsPowerFlowLine", null, 1, -1, LadderNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLadderNetwork_ContainsLDElement(), this.getLDElement(), null, "ContainsLDElement", null, 0, -1, LadderNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ldElementEClass, LDElement.class, "LDElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ldNodeEClass, LDNode.class, "LDNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLDNode_HasLDNodeVariable(), theVariablesPackage.getVariableAccess(), null, "HasLDNodeVariable", null, 1, 1, LDNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(powerFlowLineEClass, PowerFlowLine.class, "PowerFlowLine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPowerFlowLine_HasPowerSource(), this.getLDElement(), null, "HasPowerSource", null, 1, -1, PowerFlowLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPowerFlowLine_HasPowerSink(), this.getLDElement(), null, "HasPowerSink", null, 1, -1, PowerFlowLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(powerRailEClass, PowerRail.class, "PowerRail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPowerRail_HasLeftPowerRail(), this.getLadderNetwork(), null, "HasLeftPowerRail", null, 1, 1, PowerRail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPowerRail_HasRightPowerRail(), this.getLadderNetwork(), null, "HasRightPowerRail", null, 1, 1, PowerRail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(contactTypeEEnum, ContactType.class, "ContactType");
		addEEnumLiteral(contactTypeEEnum, ContactType.NORMALLY_OPEN);
		addEEnumLiteral(contactTypeEEnum, ContactType.NORMALLY_CLOSED);
		addEEnumLiteral(contactTypeEEnum, ContactType.POSITIVE_TRANSITION);
		addEEnumLiteral(contactTypeEEnum, ContactType.NEGATIVE_TRANSITION);

		initEEnum(coilTypeEEnum, CoilType.class, "CoilType");
		addEEnumLiteral(coilTypeEEnum, CoilType.COIL);
		addEEnumLiteral(coilTypeEEnum, CoilType.NEGATED);
		addEEnumLiteral(coilTypeEEnum, CoilType.SET);
		addEEnumLiteral(coilTypeEEnum, CoilType.RESET);
		addEEnumLiteral(coilTypeEEnum, CoilType.POSITIVE_TRANSITION);
		addEEnumLiteral(coilTypeEEnum, CoilType.NEGATIVE_TRANSITION);

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
		  (powerFlowLineEClass, 
		   source, 
		   new String[] {
			 "constraints", "hasValidPowerSink"
		   });
	}

} //LdPackageImpl
