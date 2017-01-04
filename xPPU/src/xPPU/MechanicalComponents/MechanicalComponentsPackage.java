/**
 */
package xPPU.MechanicalComponents;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import xPPU.ComponentRepository.ComponentRepositoryPackage;

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
 * @see xPPU.MechanicalComponents.MechanicalComponentsFactory
 * @model kind="package"
 * @generated
 */
public interface MechanicalComponentsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "MechanicalComponents";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "edu.kit.ipd.sdq.kaps.xppu.mechanicalcomponents";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "MechanicalComponents";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MechanicalComponentsPackage eINSTANCE = xPPU.MechanicalComponents.impl.MechanicalComponentsPackageImpl.init();

	/**
	 * The meta object id for the '{@link xPPU.MechanicalComponents.impl.MechanicalPartImpl <em>Mechanical Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.MechanicalComponents.impl.MechanicalPartImpl
	 * @see xPPU.MechanicalComponents.impl.MechanicalComponentsPackageImpl#getMechanicalPart()
	 * @generated
	 */
	int MECHANICAL_PART = 0;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANICAL_PART__INTERFACES = ComponentRepositoryPackage.COMPONENT__INTERFACES;

	/**
	 * The feature id for the '<em><b>Screwing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANICAL_PART__SCREWING = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mechanical Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANICAL_PART_FEATURE_COUNT = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Mechanical Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANICAL_PART_OPERATION_COUNT = ComponentRepositoryPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.MechanicalComponents.impl.PushheadImpl <em>Pushhead</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.MechanicalComponents.impl.PushheadImpl
	 * @see xPPU.MechanicalComponents.impl.MechanicalComponentsPackageImpl#getPushhead()
	 * @generated
	 */
	int PUSHHEAD = 1;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHHEAD__INTERFACES = MECHANICAL_PART__INTERFACES;

	/**
	 * The feature id for the '<em><b>Screwing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHHEAD__SCREWING = MECHANICAL_PART__SCREWING;

	/**
	 * The number of structural features of the '<em>Pushhead</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHHEAD_FEATURE_COUNT = MECHANICAL_PART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pushhead</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHHEAD_OPERATION_COUNT = MECHANICAL_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.MechanicalComponents.impl.HousingImpl <em>Housing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.MechanicalComponents.impl.HousingImpl
	 * @see xPPU.MechanicalComponents.impl.MechanicalComponentsPackageImpl#getHousing()
	 * @generated
	 */
	int HOUSING = 2;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSING__INTERFACES = MECHANICAL_PART__INTERFACES;

	/**
	 * The feature id for the '<em><b>Screwing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSING__SCREWING = MECHANICAL_PART__SCREWING;

	/**
	 * The number of structural features of the '<em>Housing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSING_FEATURE_COUNT = MECHANICAL_PART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Housing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSING_OPERATION_COUNT = MECHANICAL_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.MechanicalComponents.impl.ReturnSpringImpl <em>Return Spring</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.MechanicalComponents.impl.ReturnSpringImpl
	 * @see xPPU.MechanicalComponents.impl.MechanicalComponentsPackageImpl#getReturnSpring()
	 * @generated
	 */
	int RETURN_SPRING = 3;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_SPRING__INTERFACES = MECHANICAL_PART__INTERFACES;

	/**
	 * The feature id for the '<em><b>Screwing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_SPRING__SCREWING = MECHANICAL_PART__SCREWING;

	/**
	 * The number of structural features of the '<em>Return Spring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_SPRING_FEATURE_COUNT = MECHANICAL_PART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Return Spring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_SPRING_OPERATION_COUNT = MECHANICAL_PART_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link xPPU.MechanicalComponents.MechanicalPart <em>Mechanical Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mechanical Part</em>'.
	 * @see xPPU.MechanicalComponents.MechanicalPart
	 * @generated
	 */
	EClass getMechanicalPart();

	/**
	 * Returns the meta object for the reference '{@link xPPU.MechanicalComponents.MechanicalPart#getScrewing <em>Screwing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Screwing</em>'.
	 * @see xPPU.MechanicalComponents.MechanicalPart#getScrewing()
	 * @see #getMechanicalPart()
	 * @generated
	 */
	EReference getMechanicalPart_Screwing();

	/**
	 * Returns the meta object for class '{@link xPPU.MechanicalComponents.Pushhead <em>Pushhead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pushhead</em>'.
	 * @see xPPU.MechanicalComponents.Pushhead
	 * @generated
	 */
	EClass getPushhead();

	/**
	 * Returns the meta object for class '{@link xPPU.MechanicalComponents.Housing <em>Housing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Housing</em>'.
	 * @see xPPU.MechanicalComponents.Housing
	 * @generated
	 */
	EClass getHousing();

	/**
	 * Returns the meta object for class '{@link xPPU.MechanicalComponents.ReturnSpring <em>Return Spring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Spring</em>'.
	 * @see xPPU.MechanicalComponents.ReturnSpring
	 * @generated
	 */
	EClass getReturnSpring();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MechanicalComponentsFactory getMechanicalComponentsFactory();

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
		 * The meta object literal for the '{@link xPPU.MechanicalComponents.impl.MechanicalPartImpl <em>Mechanical Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.MechanicalComponents.impl.MechanicalPartImpl
		 * @see xPPU.MechanicalComponents.impl.MechanicalComponentsPackageImpl#getMechanicalPart()
		 * @generated
		 */
		EClass MECHANICAL_PART = eINSTANCE.getMechanicalPart();

		/**
		 * The meta object literal for the '<em><b>Screwing</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MECHANICAL_PART__SCREWING = eINSTANCE.getMechanicalPart_Screwing();

		/**
		 * The meta object literal for the '{@link xPPU.MechanicalComponents.impl.PushheadImpl <em>Pushhead</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.MechanicalComponents.impl.PushheadImpl
		 * @see xPPU.MechanicalComponents.impl.MechanicalComponentsPackageImpl#getPushhead()
		 * @generated
		 */
		EClass PUSHHEAD = eINSTANCE.getPushhead();

		/**
		 * The meta object literal for the '{@link xPPU.MechanicalComponents.impl.HousingImpl <em>Housing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.MechanicalComponents.impl.HousingImpl
		 * @see xPPU.MechanicalComponents.impl.MechanicalComponentsPackageImpl#getHousing()
		 * @generated
		 */
		EClass HOUSING = eINSTANCE.getHousing();

		/**
		 * The meta object literal for the '{@link xPPU.MechanicalComponents.impl.ReturnSpringImpl <em>Return Spring</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.MechanicalComponents.impl.ReturnSpringImpl
		 * @see xPPU.MechanicalComponents.impl.MechanicalComponentsPackageImpl#getReturnSpring()
		 * @generated
		 */
		EClass RETURN_SPRING = eINSTANCE.getReturnSpring();

	}

} //MechanicalComponentsPackage
