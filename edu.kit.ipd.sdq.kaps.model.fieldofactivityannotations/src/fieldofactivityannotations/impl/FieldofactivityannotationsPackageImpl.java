/**
 */
package fieldofactivityannotations.impl;

import fieldofactivityannotations.CalibrationSpecification;
import fieldofactivityannotations.ComponentSpecification;
import fieldofactivityannotations.DevelopmentSpecification;
import fieldofactivityannotations.Documentation;
import fieldofactivityannotations.DocumentationSpecification;
import fieldofactivityannotations.Drawing;
import fieldofactivityannotations.ECADSpecification;
import fieldofactivityannotations.Engineer;
import fieldofactivityannotations.FieldOfActivityAnnotationRepository;
import fieldofactivityannotations.FieldofactivityannotationsFactory;
import fieldofactivityannotations.FieldofactivityannotationsPackage;
import fieldofactivityannotations.File;
import fieldofactivityannotations.HMIConfiguration;
import fieldofactivityannotations.HMISpecification;
import fieldofactivityannotations.MainteneanceDocumentation;
import fieldofactivityannotations.Mechanic;
import fieldofactivityannotations.OperatorInstructions;
import fieldofactivityannotations.Person;
import fieldofactivityannotations.PersonList;
import fieldofactivityannotations.Purchaser;
import fieldofactivityannotations.Role;
import fieldofactivityannotations.RoleList;
import fieldofactivityannotations.StaffSpecification;
import fieldofactivityannotations.StockList;
import fieldofactivityannotations.StockSpecification;
import fieldofactivityannotations.SystemTest;
import fieldofactivityannotations.TestCase;
import fieldofactivityannotations.TestSpecification;
import fieldofactivityannotations.TrainingDocExternal;
import fieldofactivityannotations.TrainingDocIntern;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import xPPU.ComponentRepository.ComponentRepositoryPackage;

import xPPU.InterfaceRepository.InterfaceRepositoryPackage;

import xPPU.ModuleRepository.ModuleRepositoryPackage;

import xPPU.StructureRepository.StructureRepositoryPackage;

import xPPU.XPPUPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FieldofactivityannotationsPackageImpl extends EPackageImpl implements FieldofactivityannotationsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldOfActivityAnnotationRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stockSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hmiSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hmiConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecadSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentationSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staffSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calibrationSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass developmentSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stockListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass engineerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass purchaserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mechanicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass drawingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mainteneanceDocumentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatorInstructionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trainingDocInternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trainingDocExternalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemTestEClass = null;

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
	 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FieldofactivityannotationsPackageImpl() {
		super(eNS_URI, FieldofactivityannotationsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FieldofactivityannotationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FieldofactivityannotationsPackage init() {
		if (isInited) return (FieldofactivityannotationsPackage)EPackage.Registry.INSTANCE.getEPackage(FieldofactivityannotationsPackage.eNS_URI);

		// Obtain or create and register package
		FieldofactivityannotationsPackageImpl theFieldofactivityannotationsPackage = (FieldofactivityannotationsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FieldofactivityannotationsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FieldofactivityannotationsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XPPUPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theFieldofactivityannotationsPackage.createPackageContents();

		// Initialize created meta-data
		theFieldofactivityannotationsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFieldofactivityannotationsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FieldofactivityannotationsPackage.eNS_URI, theFieldofactivityannotationsPackage);
		return theFieldofactivityannotationsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldOfActivityAnnotationRepository() {
		return fieldOfActivityAnnotationRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldOfActivityAnnotationRepository_CalibrationSpecification() {
		return (EReference)fieldOfActivityAnnotationRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldOfActivityAnnotationRepository_TestSpecification() {
		return (EReference)fieldOfActivityAnnotationRepositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldOfActivityAnnotationRepository_DevelopmentSpecification() {
		return (EReference)fieldOfActivityAnnotationRepositoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldOfActivityAnnotationRepository_PurchaseSpecification() {
		return (EReference)fieldOfActivityAnnotationRepositoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldOfActivityAnnotationRepository_HmiSpecification() {
		return (EReference)fieldOfActivityAnnotationRepositoryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldOfActivityAnnotationRepository_EcadSpecification() {
		return (EReference)fieldOfActivityAnnotationRepositoryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldOfActivityAnnotationRepository_DocumentationSpecification() {
		return (EReference)fieldOfActivityAnnotationRepositoryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldOfActivityAnnotationRepository_ComponentSpecification() {
		return (EReference)fieldOfActivityAnnotationRepositoryEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldOfActivityAnnotationRepository_StaffSpecification() {
		return (EReference)fieldOfActivityAnnotationRepositoryEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestSpecification() {
		return testSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestSpecification_Parent() {
		return (EReference)testSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestSpecification_SystemTests() {
		return (EReference)testSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStockSpecification() {
		return stockSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStockSpecification_Parent() {
		return (EReference)stockSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStockSpecification_StockList() {
		return (EReference)stockSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHMISpecification() {
		return hmiSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHMISpecification_Parent() {
		return (EReference)hmiSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHMISpecification_HmiConfiguration() {
		return (EReference)hmiSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHMIConfiguration() {
		return hmiConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHMIConfiguration_Parent() {
		return (EReference)hmiConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHMIConfiguration_Name() {
		return (EAttribute)hmiConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHMIConfiguration_Components() {
		return (EReference)hmiConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHMIConfiguration_Modules() {
		return (EReference)hmiConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHMIConfiguration_Interfaces() {
		return (EReference)hmiConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHMIConfiguration_Structures() {
		return (EReference)hmiConfigurationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getECADSpecification() {
		return ecadSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getECADSpecification_Parent() {
		return (EReference)ecadSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getECADSpecification_Components() {
		return (EReference)ecadSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getECADSpecification_Modules() {
		return (EReference)ecadSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getECADSpecification_Interfaces() {
		return (EReference)ecadSpecificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getECADSpecification_Structures() {
		return (EReference)ecadSpecificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentationSpecification() {
		return documentationSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentationSpecification_Parent() {
		return (EReference)documentationSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentationSpecification_Mainteneance() {
		return (EReference)documentationSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentationSpecification_Instructions() {
		return (EReference)documentationSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentationSpecification_TrainingIntern() {
		return (EReference)documentationSpecificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentationSpecification_TrainingExternal() {
		return (EReference)documentationSpecificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaffSpecification() {
		return staffSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaffSpecification_Parent() {
		return (EReference)staffSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaffSpecification_PersonList() {
		return (EReference)staffSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaffSpecification_RoleList() {
		return (EReference)staffSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalibrationSpecification() {
		return calibrationSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalibrationSpecification_Parent() {
		return (EReference)calibrationSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevelopmentSpecification() {
		return developmentSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevelopmentSpecification_Parent() {
		return (EReference)developmentSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentSpecification() {
		return componentSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentSpecification_Parent() {
		return (EReference)componentSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStockList() {
		return stockListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStockList_Parent() {
		return (EReference)stockListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStockList_Components() {
		return (EReference)stockListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStockList_Modules() {
		return (EReference)stockListEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStockList_Interfaces() {
		return (EReference)stockListEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStockList_Structures() {
		return (EReference)stockListEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleList() {
		return roleListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleList_Parent() {
		return (EReference)roleListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleList_Roles() {
		return (EReference)roleListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_Parent() {
		return (EReference)roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_Person() {
		return (EReference)roleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRole_Description() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonList() {
		return personListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonList_Parent() {
		return (EReference)personListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonList_Persons() {
		return (EReference)personListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Parent() {
		return (EReference)personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Roles() {
		return (EReference)personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Name() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFile() {
		return fileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Filename() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestCase() {
		return testCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestCase_TestName() {
		return (EAttribute)testCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEngineer() {
		return engineerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPurchaser() {
		return purchaserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMechanic() {
		return mechanicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentation() {
		return documentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDrawing() {
		return drawingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMainteneanceDocumentation() {
		return mainteneanceDocumentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperatorInstructions() {
		return operatorInstructionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrainingDocIntern() {
		return trainingDocInternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrainingDocExternal() {
		return trainingDocExternalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemTest() {
		return systemTestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemTest_Parent() {
		return (EReference)systemTestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemTest_SystemUnderTest() {
		return (EReference)systemTestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldofactivityannotationsFactory getFieldofactivityannotationsFactory() {
		return (FieldofactivityannotationsFactory)getEFactoryInstance();
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
		fieldOfActivityAnnotationRepositoryEClass = createEClass(FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY);
		createEReference(fieldOfActivityAnnotationRepositoryEClass, FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__CALIBRATION_SPECIFICATION);
		createEReference(fieldOfActivityAnnotationRepositoryEClass, FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__TEST_SPECIFICATION);
		createEReference(fieldOfActivityAnnotationRepositoryEClass, FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__DEVELOPMENT_SPECIFICATION);
		createEReference(fieldOfActivityAnnotationRepositoryEClass, FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__PURCHASE_SPECIFICATION);
		createEReference(fieldOfActivityAnnotationRepositoryEClass, FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__HMI_SPECIFICATION);
		createEReference(fieldOfActivityAnnotationRepositoryEClass, FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__ECAD_SPECIFICATION);
		createEReference(fieldOfActivityAnnotationRepositoryEClass, FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__DOCUMENTATION_SPECIFICATION);
		createEReference(fieldOfActivityAnnotationRepositoryEClass, FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__COMPONENT_SPECIFICATION);
		createEReference(fieldOfActivityAnnotationRepositoryEClass, FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__STAFF_SPECIFICATION);

		testSpecificationEClass = createEClass(TEST_SPECIFICATION);
		createEReference(testSpecificationEClass, TEST_SPECIFICATION__PARENT);
		createEReference(testSpecificationEClass, TEST_SPECIFICATION__SYSTEM_TESTS);

		stockSpecificationEClass = createEClass(STOCK_SPECIFICATION);
		createEReference(stockSpecificationEClass, STOCK_SPECIFICATION__PARENT);
		createEReference(stockSpecificationEClass, STOCK_SPECIFICATION__STOCK_LIST);

		hmiSpecificationEClass = createEClass(HMI_SPECIFICATION);
		createEReference(hmiSpecificationEClass, HMI_SPECIFICATION__PARENT);
		createEReference(hmiSpecificationEClass, HMI_SPECIFICATION__HMI_CONFIGURATION);

		hmiConfigurationEClass = createEClass(HMI_CONFIGURATION);
		createEReference(hmiConfigurationEClass, HMI_CONFIGURATION__PARENT);
		createEAttribute(hmiConfigurationEClass, HMI_CONFIGURATION__NAME);
		createEReference(hmiConfigurationEClass, HMI_CONFIGURATION__COMPONENTS);
		createEReference(hmiConfigurationEClass, HMI_CONFIGURATION__MODULES);
		createEReference(hmiConfigurationEClass, HMI_CONFIGURATION__INTERFACES);
		createEReference(hmiConfigurationEClass, HMI_CONFIGURATION__STRUCTURES);

		ecadSpecificationEClass = createEClass(ECAD_SPECIFICATION);
		createEReference(ecadSpecificationEClass, ECAD_SPECIFICATION__PARENT);
		createEReference(ecadSpecificationEClass, ECAD_SPECIFICATION__COMPONENTS);
		createEReference(ecadSpecificationEClass, ECAD_SPECIFICATION__MODULES);
		createEReference(ecadSpecificationEClass, ECAD_SPECIFICATION__INTERFACES);
		createEReference(ecadSpecificationEClass, ECAD_SPECIFICATION__STRUCTURES);

		documentationSpecificationEClass = createEClass(DOCUMENTATION_SPECIFICATION);
		createEReference(documentationSpecificationEClass, DOCUMENTATION_SPECIFICATION__PARENT);
		createEReference(documentationSpecificationEClass, DOCUMENTATION_SPECIFICATION__MAINTENEANCE);
		createEReference(documentationSpecificationEClass, DOCUMENTATION_SPECIFICATION__INSTRUCTIONS);
		createEReference(documentationSpecificationEClass, DOCUMENTATION_SPECIFICATION__TRAINING_INTERN);
		createEReference(documentationSpecificationEClass, DOCUMENTATION_SPECIFICATION__TRAINING_EXTERNAL);

		staffSpecificationEClass = createEClass(STAFF_SPECIFICATION);
		createEReference(staffSpecificationEClass, STAFF_SPECIFICATION__PARENT);
		createEReference(staffSpecificationEClass, STAFF_SPECIFICATION__PERSON_LIST);
		createEReference(staffSpecificationEClass, STAFF_SPECIFICATION__ROLE_LIST);

		calibrationSpecificationEClass = createEClass(CALIBRATION_SPECIFICATION);
		createEReference(calibrationSpecificationEClass, CALIBRATION_SPECIFICATION__PARENT);

		developmentSpecificationEClass = createEClass(DEVELOPMENT_SPECIFICATION);
		createEReference(developmentSpecificationEClass, DEVELOPMENT_SPECIFICATION__PARENT);

		componentSpecificationEClass = createEClass(COMPONENT_SPECIFICATION);
		createEReference(componentSpecificationEClass, COMPONENT_SPECIFICATION__PARENT);

		stockListEClass = createEClass(STOCK_LIST);
		createEReference(stockListEClass, STOCK_LIST__PARENT);
		createEReference(stockListEClass, STOCK_LIST__COMPONENTS);
		createEReference(stockListEClass, STOCK_LIST__MODULES);
		createEReference(stockListEClass, STOCK_LIST__INTERFACES);
		createEReference(stockListEClass, STOCK_LIST__STRUCTURES);

		roleListEClass = createEClass(ROLE_LIST);
		createEReference(roleListEClass, ROLE_LIST__PARENT);
		createEReference(roleListEClass, ROLE_LIST__ROLES);

		roleEClass = createEClass(ROLE);
		createEReference(roleEClass, ROLE__PARENT);
		createEReference(roleEClass, ROLE__PERSON);
		createEAttribute(roleEClass, ROLE__DESCRIPTION);

		personListEClass = createEClass(PERSON_LIST);
		createEReference(personListEClass, PERSON_LIST__PARENT);
		createEReference(personListEClass, PERSON_LIST__PERSONS);

		personEClass = createEClass(PERSON);
		createEReference(personEClass, PERSON__PARENT);
		createEReference(personEClass, PERSON__ROLES);
		createEAttribute(personEClass, PERSON__NAME);

		fileEClass = createEClass(FILE);
		createEAttribute(fileEClass, FILE__FILENAME);

		testCaseEClass = createEClass(TEST_CASE);
		createEAttribute(testCaseEClass, TEST_CASE__TEST_NAME);

		engineerEClass = createEClass(ENGINEER);

		purchaserEClass = createEClass(PURCHASER);

		mechanicEClass = createEClass(MECHANIC);

		documentationEClass = createEClass(DOCUMENTATION);

		drawingEClass = createEClass(DRAWING);

		mainteneanceDocumentationEClass = createEClass(MAINTENEANCE_DOCUMENTATION);

		operatorInstructionsEClass = createEClass(OPERATOR_INSTRUCTIONS);

		trainingDocInternEClass = createEClass(TRAINING_DOC_INTERN);

		trainingDocExternalEClass = createEClass(TRAINING_DOC_EXTERNAL);

		systemTestEClass = createEClass(SYSTEM_TEST);
		createEReference(systemTestEClass, SYSTEM_TEST__PARENT);
		createEReference(systemTestEClass, SYSTEM_TEST__SYSTEM_UNDER_TEST);
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
		ComponentRepositoryPackage theComponentRepositoryPackage = (ComponentRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentRepositoryPackage.eNS_URI);
		ModuleRepositoryPackage theModuleRepositoryPackage = (ModuleRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(ModuleRepositoryPackage.eNS_URI);
		InterfaceRepositoryPackage theInterfaceRepositoryPackage = (InterfaceRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(InterfaceRepositoryPackage.eNS_URI);
		StructureRepositoryPackage theStructureRepositoryPackage = (StructureRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(StructureRepositoryPackage.eNS_URI);
		XPPUPackage theXPPUPackage = (XPPUPackage)EPackage.Registry.INSTANCE.getEPackage(XPPUPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		stockListEClass.getESuperTypes().add(this.getFile());
		engineerEClass.getESuperTypes().add(this.getRole());
		purchaserEClass.getESuperTypes().add(this.getRole());
		mechanicEClass.getESuperTypes().add(this.getRole());
		documentationEClass.getESuperTypes().add(this.getFile());
		drawingEClass.getESuperTypes().add(this.getFile());
		mainteneanceDocumentationEClass.getESuperTypes().add(this.getDocumentation());
		operatorInstructionsEClass.getESuperTypes().add(this.getDocumentation());
		trainingDocInternEClass.getESuperTypes().add(this.getDocumentation());
		trainingDocExternalEClass.getESuperTypes().add(this.getDocumentation());
		systemTestEClass.getESuperTypes().add(this.getTestCase());

		// Initialize classes, features, and operations; add parameters
		initEClass(fieldOfActivityAnnotationRepositoryEClass, FieldOfActivityAnnotationRepository.class, "FieldOfActivityAnnotationRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFieldOfActivityAnnotationRepository_CalibrationSpecification(), this.getCalibrationSpecification(), this.getCalibrationSpecification_Parent(), "calibrationSpecification", null, 0, 1, FieldOfActivityAnnotationRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldOfActivityAnnotationRepository_TestSpecification(), this.getTestSpecification(), this.getTestSpecification_Parent(), "testSpecification", null, 0, 1, FieldOfActivityAnnotationRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldOfActivityAnnotationRepository_DevelopmentSpecification(), this.getDevelopmentSpecification(), this.getDevelopmentSpecification_Parent(), "developmentSpecification", null, 0, 1, FieldOfActivityAnnotationRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldOfActivityAnnotationRepository_PurchaseSpecification(), this.getStockSpecification(), this.getStockSpecification_Parent(), "purchaseSpecification", null, 0, 1, FieldOfActivityAnnotationRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldOfActivityAnnotationRepository_HmiSpecification(), this.getHMISpecification(), this.getHMISpecification_Parent(), "hmiSpecification", null, 0, 1, FieldOfActivityAnnotationRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldOfActivityAnnotationRepository_EcadSpecification(), this.getECADSpecification(), this.getECADSpecification_Parent(), "ecadSpecification", null, 0, 1, FieldOfActivityAnnotationRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldOfActivityAnnotationRepository_DocumentationSpecification(), this.getDocumentationSpecification(), this.getDocumentationSpecification_Parent(), "documentationSpecification", null, 0, 1, FieldOfActivityAnnotationRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldOfActivityAnnotationRepository_ComponentSpecification(), this.getComponentSpecification(), this.getComponentSpecification_Parent(), "componentSpecification", null, 0, 1, FieldOfActivityAnnotationRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldOfActivityAnnotationRepository_StaffSpecification(), this.getStaffSpecification(), this.getStaffSpecification_Parent(), "staffSpecification", null, 0, 1, FieldOfActivityAnnotationRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testSpecificationEClass, TestSpecification.class, "TestSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestSpecification_Parent(), this.getFieldOfActivityAnnotationRepository(), this.getFieldOfActivityAnnotationRepository_TestSpecification(), "parent", null, 1, 1, TestSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestSpecification_SystemTests(), this.getSystemTest(), this.getSystemTest_Parent(), "systemTests", null, 0, -1, TestSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stockSpecificationEClass, StockSpecification.class, "StockSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStockSpecification_Parent(), this.getFieldOfActivityAnnotationRepository(), this.getFieldOfActivityAnnotationRepository_PurchaseSpecification(), "parent", null, 1, 1, StockSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStockSpecification_StockList(), this.getStockList(), this.getStockList_Parent(), "stockList", null, 0, -1, StockSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hmiSpecificationEClass, HMISpecification.class, "HMISpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHMISpecification_Parent(), this.getFieldOfActivityAnnotationRepository(), this.getFieldOfActivityAnnotationRepository_HmiSpecification(), "parent", null, 1, 1, HMISpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHMISpecification_HmiConfiguration(), this.getHMIConfiguration(), this.getHMIConfiguration_Parent(), "hmiConfiguration", null, 0, -1, HMISpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hmiConfigurationEClass, HMIConfiguration.class, "HMIConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHMIConfiguration_Parent(), this.getHMISpecification(), this.getHMISpecification_HmiConfiguration(), "parent", null, 1, 1, HMIConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHMIConfiguration_Name(), ecorePackage.getEString(), "name", null, 0, 1, HMIConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHMIConfiguration_Components(), theComponentRepositoryPackage.getComponent(), null, "components", null, 0, -1, HMIConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHMIConfiguration_Modules(), theModuleRepositoryPackage.getModule(), null, "modules", null, 0, -1, HMIConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHMIConfiguration_Interfaces(), theInterfaceRepositoryPackage.getInterface(), null, "interfaces", null, 0, -1, HMIConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHMIConfiguration_Structures(), theStructureRepositoryPackage.getStructure(), null, "structures", null, 0, -1, HMIConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ecadSpecificationEClass, ECADSpecification.class, "ECADSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getECADSpecification_Parent(), this.getFieldOfActivityAnnotationRepository(), this.getFieldOfActivityAnnotationRepository_EcadSpecification(), "parent", null, 1, 1, ECADSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getECADSpecification_Components(), theComponentRepositoryPackage.getComponent(), null, "components", null, 0, -1, ECADSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getECADSpecification_Modules(), theModuleRepositoryPackage.getModule(), null, "modules", null, 0, -1, ECADSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getECADSpecification_Interfaces(), theInterfaceRepositoryPackage.getInterface(), null, "interfaces", null, 0, -1, ECADSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getECADSpecification_Structures(), theStructureRepositoryPackage.getStructure(), null, "structures", null, 0, -1, ECADSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentationSpecificationEClass, DocumentationSpecification.class, "DocumentationSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocumentationSpecification_Parent(), this.getFieldOfActivityAnnotationRepository(), this.getFieldOfActivityAnnotationRepository_DocumentationSpecification(), "parent", null, 1, 1, DocumentationSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentationSpecification_Mainteneance(), this.getMainteneanceDocumentation(), null, "mainteneance", null, 0, -1, DocumentationSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentationSpecification_Instructions(), this.getOperatorInstructions(), null, "instructions", null, 0, -1, DocumentationSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentationSpecification_TrainingIntern(), this.getTrainingDocIntern(), null, "trainingIntern", null, 0, -1, DocumentationSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentationSpecification_TrainingExternal(), this.getTrainingDocExternal(), null, "trainingExternal", null, 0, -1, DocumentationSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(staffSpecificationEClass, StaffSpecification.class, "StaffSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStaffSpecification_Parent(), this.getFieldOfActivityAnnotationRepository(), this.getFieldOfActivityAnnotationRepository_StaffSpecification(), "parent", null, 1, 1, StaffSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStaffSpecification_PersonList(), this.getPersonList(), this.getPersonList_Parent(), "personList", null, 1, 1, StaffSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStaffSpecification_RoleList(), this.getRoleList(), this.getRoleList_Parent(), "roleList", null, 1, 1, StaffSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(calibrationSpecificationEClass, CalibrationSpecification.class, "CalibrationSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalibrationSpecification_Parent(), this.getFieldOfActivityAnnotationRepository(), this.getFieldOfActivityAnnotationRepository_CalibrationSpecification(), "parent", null, 1, 1, CalibrationSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(developmentSpecificationEClass, DevelopmentSpecification.class, "DevelopmentSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDevelopmentSpecification_Parent(), this.getFieldOfActivityAnnotationRepository(), this.getFieldOfActivityAnnotationRepository_DevelopmentSpecification(), "parent", null, 1, 1, DevelopmentSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentSpecificationEClass, ComponentSpecification.class, "ComponentSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentSpecification_Parent(), this.getFieldOfActivityAnnotationRepository(), this.getFieldOfActivityAnnotationRepository_ComponentSpecification(), "parent", null, 1, 1, ComponentSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stockListEClass, StockList.class, "StockList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStockList_Parent(), this.getStockSpecification(), this.getStockSpecification_StockList(), "parent", null, 1, 1, StockList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStockList_Components(), theComponentRepositoryPackage.getComponent(), null, "components", null, 0, -1, StockList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStockList_Modules(), theModuleRepositoryPackage.getModule(), null, "modules", null, 0, -1, StockList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStockList_Interfaces(), theInterfaceRepositoryPackage.getInterface(), null, "interfaces", null, 0, -1, StockList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStockList_Structures(), theStructureRepositoryPackage.getStructure(), null, "structures", null, 0, -1, StockList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleListEClass, RoleList.class, "RoleList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoleList_Parent(), this.getStaffSpecification(), this.getStaffSpecification_RoleList(), "parent", null, 1, 1, RoleList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleList_Roles(), this.getRole(), this.getRole_Parent(), "roles", null, 0, -1, RoleList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRole_Parent(), this.getRoleList(), this.getRoleList_Roles(), "parent", null, 1, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_Person(), this.getPerson(), this.getPerson_Roles(), "person", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRole_Description(), ecorePackage.getEString(), "description", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personListEClass, PersonList.class, "PersonList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersonList_Parent(), this.getStaffSpecification(), this.getStaffSpecification_PersonList(), "parent", null, 1, 1, PersonList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonList_Persons(), this.getPerson(), this.getPerson_Parent(), "persons", null, 0, -1, PersonList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPerson_Parent(), this.getPersonList(), this.getPersonList_Persons(), "parent", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Roles(), this.getRole(), this.getRole_Person(), "roles", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Name(), ecorePackage.getEString(), "name", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileEClass, File.class, "File", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFile_Filename(), ecorePackage.getEString(), "filename", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testCaseEClass, TestCase.class, "TestCase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestCase_TestName(), ecorePackage.getEString(), "testName", null, 0, 1, TestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(engineerEClass, Engineer.class, "Engineer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(purchaserEClass, Purchaser.class, "Purchaser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mechanicEClass, Mechanic.class, "Mechanic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(documentationEClass, Documentation.class, "Documentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(drawingEClass, Drawing.class, "Drawing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mainteneanceDocumentationEClass, MainteneanceDocumentation.class, "MainteneanceDocumentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operatorInstructionsEClass, OperatorInstructions.class, "OperatorInstructions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trainingDocInternEClass, TrainingDocIntern.class, "TrainingDocIntern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trainingDocExternalEClass, TrainingDocExternal.class, "TrainingDocExternal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemTestEClass, SystemTest.class, "SystemTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemTest_Parent(), this.getTestSpecification(), this.getTestSpecification_SystemTests(), "parent", null, 1, 1, SystemTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemTest_SystemUnderTest(), theXPPUPackage.getPlant(), null, "systemUnderTest", null, 0, 1, SystemTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //FieldofactivityannotationsPackageImpl
