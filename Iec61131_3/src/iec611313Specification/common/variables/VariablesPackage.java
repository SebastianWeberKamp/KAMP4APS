/**
 */
package iec611313Specification.common.variables;

import iec611313Specification.common.CommonPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see iec611313Specification.common.variables.VariablesFactory
 * @model kind="package"
 * @generated
 */
public interface VariablesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "variables";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.kit.edu/iec611313/common/variables";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "variables";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VariablesPackage eINSTANCE = iec611313Specification.common.variables.impl.VariablesPackageImpl.init();

	/**
	 * The meta object id for the '{@link iec611313Specification.common.variables.impl.LocationSpecificationImpl <em>Location Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.variables.impl.LocationSpecificationImpl
	 * @see iec611313Specification.common.variables.impl.VariablesPackageImpl#getLocationSpecification()
	 * @generated
	 */
	int LOCATION_SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_SPECIFICATION__LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_SPECIFICATION__SIZE = 1;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_SPECIFICATION__ADDRESS = 2;

	/**
	 * The number of structural features of the '<em>Location Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_SPECIFICATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Location Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.variables.impl.VariableAccessImpl <em>Variable Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.variables.impl.VariableAccessImpl
	 * @see iec611313Specification.common.variables.impl.VariablesPackageImpl#getVariableAccess()
	 * @generated
	 */
	int VARIABLE_ACCESS = 1;

	/**
	 * The feature id for the '<em><b>Has Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACCESS__HAS_TYPE = CommonPackage.EXPRESSION__HAS_TYPE;

	/**
	 * The feature id for the '<em><b>Has Variable Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACCESS__HAS_VARIABLE_DECLARATION = CommonPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACCESS_FEATURE_COUNT = CommonPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACCESS_OPERATION_COUNT = CommonPackage.EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.variables.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.variables.impl.VariableDeclarationImpl
	 * @see iec611313Specification.common.variables.impl.VariablesPackageImpl#getVariableDeclaration()
	 * @generated
	 */
	int VARIABLE_DECLARATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Variable Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__VARIABLE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Variable Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__VARIABLE_MODIFIER = 2;

	/**
	 * The feature id for the '<em><b>Declares Variable Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__DECLARES_VARIABLE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Has Variable Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__HAS_VARIABLE_LOCATION = 4;

	/**
	 * The feature id for the '<em><b>Has Initial Variable Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__HAS_INITIAL_VARIABLE_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Is Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__IS_PART_OF = 6;

	/**
	 * The number of structural features of the '<em>Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.variables.Size <em>Size</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.variables.Size
	 * @see iec611313Specification.common.variables.impl.VariablesPackageImpl#getSize()
	 * @generated
	 */
	int SIZE = 3;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.variables.VariableModifier <em>Variable Modifier</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.variables.VariableModifier
	 * @see iec611313Specification.common.variables.impl.VariablesPackageImpl#getVariableModifier()
	 * @generated
	 */
	int VARIABLE_MODIFIER = 4;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.variables.Location <em>Location</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.variables.Location
	 * @see iec611313Specification.common.variables.impl.VariablesPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 5;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.variables.VariableType <em>Variable Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.variables.VariableType
	 * @see iec611313Specification.common.variables.impl.VariablesPackageImpl#getVariableType()
	 * @generated
	 */
	int VARIABLE_TYPE = 6;


	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.variables.LocationSpecification <em>Location Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Specification</em>'.
	 * @see iec611313Specification.common.variables.LocationSpecification
	 * @generated
	 */
	EClass getLocationSpecification();

	/**
	 * Returns the meta object for the attribute '{@link iec611313Specification.common.variables.LocationSpecification#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see iec611313Specification.common.variables.LocationSpecification#getLocation()
	 * @see #getLocationSpecification()
	 * @generated
	 */
	EAttribute getLocationSpecification_Location();

	/**
	 * Returns the meta object for the attribute '{@link iec611313Specification.common.variables.LocationSpecification#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see iec611313Specification.common.variables.LocationSpecification#getSize()
	 * @see #getLocationSpecification()
	 * @generated
	 */
	EAttribute getLocationSpecification_Size();

	/**
	 * Returns the meta object for the attribute '{@link iec611313Specification.common.variables.LocationSpecification#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see iec611313Specification.common.variables.LocationSpecification#getAddress()
	 * @see #getLocationSpecification()
	 * @generated
	 */
	EAttribute getLocationSpecification_Address();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.variables.VariableAccess <em>Variable Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Access</em>'.
	 * @see iec611313Specification.common.variables.VariableAccess
	 * @generated
	 */
	EClass getVariableAccess();

	/**
	 * Returns the meta object for the reference '{@link iec611313Specification.common.variables.VariableAccess#getHasVariableDeclaration <em>Has Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Variable Declaration</em>'.
	 * @see iec611313Specification.common.variables.VariableAccess#getHasVariableDeclaration()
	 * @see #getVariableAccess()
	 * @generated
	 */
	EReference getVariableAccess_HasVariableDeclaration();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.variables.VariableDeclaration <em>Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Declaration</em>'.
	 * @see iec611313Specification.common.variables.VariableDeclaration
	 * @generated
	 */
	EClass getVariableDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link iec611313Specification.common.variables.VariableDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iec611313Specification.common.variables.VariableDeclaration#getName()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EAttribute getVariableDeclaration_Name();

	/**
	 * Returns the meta object for the attribute '{@link iec611313Specification.common.variables.VariableDeclaration#getVariableType <em>Variable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Type</em>'.
	 * @see iec611313Specification.common.variables.VariableDeclaration#getVariableType()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EAttribute getVariableDeclaration_VariableType();

	/**
	 * Returns the meta object for the attribute '{@link iec611313Specification.common.variables.VariableDeclaration#getVariableModifier <em>Variable Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Modifier</em>'.
	 * @see iec611313Specification.common.variables.VariableDeclaration#getVariableModifier()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EAttribute getVariableDeclaration_VariableModifier();

	/**
	 * Returns the meta object for the containment reference '{@link iec611313Specification.common.variables.VariableDeclaration#getDeclaresVariableType <em>Declares Variable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Declares Variable Type</em>'.
	 * @see iec611313Specification.common.variables.VariableDeclaration#getDeclaresVariableType()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EReference getVariableDeclaration_DeclaresVariableType();

	/**
	 * Returns the meta object for the containment reference '{@link iec611313Specification.common.variables.VariableDeclaration#getHasVariableLocation <em>Has Variable Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Variable Location</em>'.
	 * @see iec611313Specification.common.variables.VariableDeclaration#getHasVariableLocation()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EReference getVariableDeclaration_HasVariableLocation();

	/**
	 * Returns the meta object for the containment reference '{@link iec611313Specification.common.variables.VariableDeclaration#getHasInitialVariableValue <em>Has Initial Variable Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Initial Variable Value</em>'.
	 * @see iec611313Specification.common.variables.VariableDeclaration#getHasInitialVariableValue()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EReference getVariableDeclaration_HasInitialVariableValue();

	/**
	 * Returns the meta object for the container reference '{@link iec611313Specification.common.variables.VariableDeclaration#getIsPartOf <em>Is Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Is Part Of</em>'.
	 * @see iec611313Specification.common.variables.VariableDeclaration#getIsPartOf()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EReference getVariableDeclaration_IsPartOf();

	/**
	 * Returns the meta object for enum '{@link iec611313Specification.common.variables.Size <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Size</em>'.
	 * @see iec611313Specification.common.variables.Size
	 * @generated
	 */
	EEnum getSize();

	/**
	 * Returns the meta object for enum '{@link iec611313Specification.common.variables.VariableModifier <em>Variable Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Variable Modifier</em>'.
	 * @see iec611313Specification.common.variables.VariableModifier
	 * @generated
	 */
	EEnum getVariableModifier();

	/**
	 * Returns the meta object for enum '{@link iec611313Specification.common.variables.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Location</em>'.
	 * @see iec611313Specification.common.variables.Location
	 * @generated
	 */
	EEnum getLocation();

	/**
	 * Returns the meta object for enum '{@link iec611313Specification.common.variables.VariableType <em>Variable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Variable Type</em>'.
	 * @see iec611313Specification.common.variables.VariableType
	 * @generated
	 */
	EEnum getVariableType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VariablesFactory getVariablesFactory();

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
		 * The meta object literal for the '{@link iec611313Specification.common.variables.impl.LocationSpecificationImpl <em>Location Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.variables.impl.LocationSpecificationImpl
		 * @see iec611313Specification.common.variables.impl.VariablesPackageImpl#getLocationSpecification()
		 * @generated
		 */
		EClass LOCATION_SPECIFICATION = eINSTANCE.getLocationSpecification();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_SPECIFICATION__LOCATION = eINSTANCE.getLocationSpecification_Location();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_SPECIFICATION__SIZE = eINSTANCE.getLocationSpecification_Size();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_SPECIFICATION__ADDRESS = eINSTANCE.getLocationSpecification_Address();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.variables.impl.VariableAccessImpl <em>Variable Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.variables.impl.VariableAccessImpl
		 * @see iec611313Specification.common.variables.impl.VariablesPackageImpl#getVariableAccess()
		 * @generated
		 */
		EClass VARIABLE_ACCESS = eINSTANCE.getVariableAccess();

		/**
		 * The meta object literal for the '<em><b>Has Variable Declaration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_ACCESS__HAS_VARIABLE_DECLARATION = eINSTANCE.getVariableAccess_HasVariableDeclaration();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.variables.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.variables.impl.VariableDeclarationImpl
		 * @see iec611313Specification.common.variables.impl.VariablesPackageImpl#getVariableDeclaration()
		 * @generated
		 */
		EClass VARIABLE_DECLARATION = eINSTANCE.getVariableDeclaration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_DECLARATION__NAME = eINSTANCE.getVariableDeclaration_Name();

		/**
		 * The meta object literal for the '<em><b>Variable Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_DECLARATION__VARIABLE_TYPE = eINSTANCE.getVariableDeclaration_VariableType();

		/**
		 * The meta object literal for the '<em><b>Variable Modifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_DECLARATION__VARIABLE_MODIFIER = eINSTANCE.getVariableDeclaration_VariableModifier();

		/**
		 * The meta object literal for the '<em><b>Declares Variable Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DECLARATION__DECLARES_VARIABLE_TYPE = eINSTANCE.getVariableDeclaration_DeclaresVariableType();

		/**
		 * The meta object literal for the '<em><b>Has Variable Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DECLARATION__HAS_VARIABLE_LOCATION = eINSTANCE.getVariableDeclaration_HasVariableLocation();

		/**
		 * The meta object literal for the '<em><b>Has Initial Variable Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DECLARATION__HAS_INITIAL_VARIABLE_VALUE = eINSTANCE.getVariableDeclaration_HasInitialVariableValue();

		/**
		 * The meta object literal for the '<em><b>Is Part Of</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DECLARATION__IS_PART_OF = eINSTANCE.getVariableDeclaration_IsPartOf();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.variables.Size <em>Size</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.variables.Size
		 * @see iec611313Specification.common.variables.impl.VariablesPackageImpl#getSize()
		 * @generated
		 */
		EEnum SIZE = eINSTANCE.getSize();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.variables.VariableModifier <em>Variable Modifier</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.variables.VariableModifier
		 * @see iec611313Specification.common.variables.impl.VariablesPackageImpl#getVariableModifier()
		 * @generated
		 */
		EEnum VARIABLE_MODIFIER = eINSTANCE.getVariableModifier();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.variables.Location <em>Location</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.variables.Location
		 * @see iec611313Specification.common.variables.impl.VariablesPackageImpl#getLocation()
		 * @generated
		 */
		EEnum LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.variables.VariableType <em>Variable Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.variables.VariableType
		 * @see iec611313Specification.common.variables.impl.VariablesPackageImpl#getVariableType()
		 * @generated
		 */
		EEnum VARIABLE_TYPE = eINSTANCE.getVariableType();

	}

} //VariablesPackage
