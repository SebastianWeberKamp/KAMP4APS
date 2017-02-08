/**
 */
package fieldofactivityannotations.impl;

import fieldofactivityannotations.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FieldofactivityannotationsFactoryImpl extends EFactoryImpl implements FieldofactivityannotationsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FieldofactivityannotationsFactory init() {
		try {
			FieldofactivityannotationsFactory theFieldofactivityannotationsFactory = (FieldofactivityannotationsFactory)EPackage.Registry.INSTANCE.getEFactory(FieldofactivityannotationsPackage.eNS_URI);
			if (theFieldofactivityannotationsFactory != null) {
				return theFieldofactivityannotationsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FieldofactivityannotationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldofactivityannotationsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY: return createFieldOfActivityAnnotationRepository();
			case FieldofactivityannotationsPackage.TEST_SPECIFICATION: return createTestSpecification();
			case FieldofactivityannotationsPackage.STOCK_SPECIFICATION: return createStockSpecification();
			case FieldofactivityannotationsPackage.HMI_SPECIFICATION: return createHMISpecification();
			case FieldofactivityannotationsPackage.HMI_CONFIGURATION: return createHMIConfiguration();
			case FieldofactivityannotationsPackage.ECAD_SPECIFICATION: return createECADSpecification();
			case FieldofactivityannotationsPackage.DOCUMENTATION_SPECIFICATION: return createDocumentationSpecification();
			case FieldofactivityannotationsPackage.STAFF_SPECIFICATION: return createStaffSpecification();
			case FieldofactivityannotationsPackage.CALIBRATION_SPECIFICATION: return createCalibrationSpecification();
			case FieldofactivityannotationsPackage.DEVELOPMENT_SPECIFICATION: return createDevelopmentSpecification();
			case FieldofactivityannotationsPackage.COMPONENT_SPECIFICATION: return createComponentSpecification();
			case FieldofactivityannotationsPackage.STOCK_LIST: return createStockList();
			case FieldofactivityannotationsPackage.ROLE_LIST: return createRoleList();
			case FieldofactivityannotationsPackage.PERSON_LIST: return createPersonList();
			case FieldofactivityannotationsPackage.PERSON: return createPerson();
			case FieldofactivityannotationsPackage.ENGINEER: return createEngineer();
			case FieldofactivityannotationsPackage.PURCHASER: return createPurchaser();
			case FieldofactivityannotationsPackage.MECHANIC: return createMechanic();
			case FieldofactivityannotationsPackage.DOCUMENTATION: return createDocumentation();
			case FieldofactivityannotationsPackage.DRAWING: return createDrawing();
			case FieldofactivityannotationsPackage.MAINTENEANCE_DOCUMENTATION: return createMainteneanceDocumentation();
			case FieldofactivityannotationsPackage.OPERATOR_INSTRUCTIONS: return createOperatorInstructions();
			case FieldofactivityannotationsPackage.TRAINING_DOC_INTERN: return createTrainingDocIntern();
			case FieldofactivityannotationsPackage.TRAINING_DOC_EXTERNAL: return createTrainingDocExternal();
			case FieldofactivityannotationsPackage.SYSTEM_TEST: return createSystemTest();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldOfActivityAnnotationRepository createFieldOfActivityAnnotationRepository() {
		FieldOfActivityAnnotationRepositoryImpl fieldOfActivityAnnotationRepository = new FieldOfActivityAnnotationRepositoryImpl();
		return fieldOfActivityAnnotationRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestSpecification createTestSpecification() {
		TestSpecificationImpl testSpecification = new TestSpecificationImpl();
		return testSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StockSpecification createStockSpecification() {
		StockSpecificationImpl stockSpecification = new StockSpecificationImpl();
		return stockSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMISpecification createHMISpecification() {
		HMISpecificationImpl hmiSpecification = new HMISpecificationImpl();
		return hmiSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMIConfiguration createHMIConfiguration() {
		HMIConfigurationImpl hmiConfiguration = new HMIConfigurationImpl();
		return hmiConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECADSpecification createECADSpecification() {
		ECADSpecificationImpl ecadSpecification = new ECADSpecificationImpl();
		return ecadSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentationSpecification createDocumentationSpecification() {
		DocumentationSpecificationImpl documentationSpecification = new DocumentationSpecificationImpl();
		return documentationSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffSpecification createStaffSpecification() {
		StaffSpecificationImpl staffSpecification = new StaffSpecificationImpl();
		return staffSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalibrationSpecification createCalibrationSpecification() {
		CalibrationSpecificationImpl calibrationSpecification = new CalibrationSpecificationImpl();
		return calibrationSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevelopmentSpecification createDevelopmentSpecification() {
		DevelopmentSpecificationImpl developmentSpecification = new DevelopmentSpecificationImpl();
		return developmentSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentSpecification createComponentSpecification() {
		ComponentSpecificationImpl componentSpecification = new ComponentSpecificationImpl();
		return componentSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StockList createStockList() {
		StockListImpl stockList = new StockListImpl();
		return stockList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleList createRoleList() {
		RoleListImpl roleList = new RoleListImpl();
		return roleList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonList createPersonList() {
		PersonListImpl personList = new PersonListImpl();
		return personList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Engineer createEngineer() {
		EngineerImpl engineer = new EngineerImpl();
		return engineer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Purchaser createPurchaser() {
		PurchaserImpl purchaser = new PurchaserImpl();
		return purchaser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mechanic createMechanic() {
		MechanicImpl mechanic = new MechanicImpl();
		return mechanic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Documentation createDocumentation() {
		DocumentationImpl documentation = new DocumentationImpl();
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Drawing createDrawing() {
		DrawingImpl drawing = new DrawingImpl();
		return drawing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainteneanceDocumentation createMainteneanceDocumentation() {
		MainteneanceDocumentationImpl mainteneanceDocumentation = new MainteneanceDocumentationImpl();
		return mainteneanceDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorInstructions createOperatorInstructions() {
		OperatorInstructionsImpl operatorInstructions = new OperatorInstructionsImpl();
		return operatorInstructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainingDocIntern createTrainingDocIntern() {
		TrainingDocInternImpl trainingDocIntern = new TrainingDocInternImpl();
		return trainingDocIntern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainingDocExternal createTrainingDocExternal() {
		TrainingDocExternalImpl trainingDocExternal = new TrainingDocExternalImpl();
		return trainingDocExternal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemTest createSystemTest() {
		SystemTestImpl systemTest = new SystemTestImpl();
		return systemTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldofactivityannotationsPackage getFieldofactivityannotationsPackage() {
		return (FieldofactivityannotationsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FieldofactivityannotationsPackage getPackage() {
		return FieldofactivityannotationsPackage.eINSTANCE;
	}

} //FieldofactivityannotationsFactoryImpl
