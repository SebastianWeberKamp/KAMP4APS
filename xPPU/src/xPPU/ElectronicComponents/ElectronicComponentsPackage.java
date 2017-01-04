/**
 */
package xPPU.ElectronicComponents;

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
 * @see xPPU.ElectronicComponents.ElectronicComponentsFactory
 * @model kind="package"
 * @generated
 */
public interface ElectronicComponentsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ElectronicComponents";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "edu.kit.ipd.sdq.kaps.xppu.electroniccomponents";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ElectronicComponents";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ElectronicComponentsPackage eINSTANCE = xPPU.ElectronicComponents.impl.ElectronicComponentsPackageImpl.init();

	/**
	 * The meta object id for the '{@link xPPU.ElectronicComponents.impl.ElectronicPartImpl <em>Electronic Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.ElectronicComponents.impl.ElectronicPartImpl
	 * @see xPPU.ElectronicComponents.impl.ElectronicComponentsPackageImpl#getElectronicPart()
	 * @generated
	 */
	int ELECTRONIC_PART = 0;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_PART__INTERFACES = ComponentRepositoryPackage.COMPONENT__INTERFACES;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_PART__PIN = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Physicalconnection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_PART__PHYSICALCONNECTION = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Electronic Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_PART_FEATURE_COUNT = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Electronic Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_PART_OPERATION_COUNT = ComponentRepositoryPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.ElectronicComponents.impl.SwitchImpl <em>Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.ElectronicComponents.impl.SwitchImpl
	 * @see xPPU.ElectronicComponents.impl.ElectronicComponentsPackageImpl#getSwitch()
	 * @generated
	 */
	int SWITCH = 1;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__INTERFACES = ELECTRONIC_PART__INTERFACES;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__PIN = ELECTRONIC_PART__PIN;

	/**
	 * The feature id for the '<em><b>Physicalconnection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__PHYSICALCONNECTION = ELECTRONIC_PART__PHYSICALCONNECTION;

	/**
	 * The number of structural features of the '<em>Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_FEATURE_COUNT = ELECTRONIC_PART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_OPERATION_COUNT = ELECTRONIC_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.ElectronicComponents.impl.LEDImpl <em>LED</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.ElectronicComponents.impl.LEDImpl
	 * @see xPPU.ElectronicComponents.impl.ElectronicComponentsPackageImpl#getLED()
	 * @generated
	 */
	int LED = 2;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__INTERFACES = ELECTRONIC_PART__INTERFACES;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__PIN = ELECTRONIC_PART__PIN;

	/**
	 * The feature id for the '<em><b>Physicalconnection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__PHYSICALCONNECTION = ELECTRONIC_PART__PHYSICALCONNECTION;

	/**
	 * The number of structural features of the '<em>LED</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED_FEATURE_COUNT = ELECTRONIC_PART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>LED</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED_OPERATION_COUNT = ELECTRONIC_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xPPU.ElectronicComponents.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xPPU.ElectronicComponents.impl.ButtonImpl
	 * @see xPPU.ElectronicComponents.impl.ElectronicComponentsPackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 3;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__INTERFACES = ELECTRONIC_PART__INTERFACES;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__PIN = ELECTRONIC_PART__PIN;

	/**
	 * The feature id for the '<em><b>Physicalconnection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__PHYSICALCONNECTION = ELECTRONIC_PART__PHYSICALCONNECTION;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = ELECTRONIC_PART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_OPERATION_COUNT = ELECTRONIC_PART_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link xPPU.ElectronicComponents.ElectronicPart <em>Electronic Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Electronic Part</em>'.
	 * @see xPPU.ElectronicComponents.ElectronicPart
	 * @generated
	 */
	EClass getElectronicPart();

	/**
	 * Returns the meta object for the reference '{@link xPPU.ElectronicComponents.ElectronicPart#getPin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pin</em>'.
	 * @see xPPU.ElectronicComponents.ElectronicPart#getPin()
	 * @see #getElectronicPart()
	 * @generated
	 */
	EReference getElectronicPart_Pin();

	/**
	 * Returns the meta object for the reference '{@link xPPU.ElectronicComponents.ElectronicPart#getPhysicalconnection <em>Physicalconnection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Physicalconnection</em>'.
	 * @see xPPU.ElectronicComponents.ElectronicPart#getPhysicalconnection()
	 * @see #getElectronicPart()
	 * @generated
	 */
	EReference getElectronicPart_Physicalconnection();

	/**
	 * Returns the meta object for class '{@link xPPU.ElectronicComponents.Switch <em>Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch</em>'.
	 * @see xPPU.ElectronicComponents.Switch
	 * @generated
	 */
	EClass getSwitch();

	/**
	 * Returns the meta object for class '{@link xPPU.ElectronicComponents.LED <em>LED</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LED</em>'.
	 * @see xPPU.ElectronicComponents.LED
	 * @generated
	 */
	EClass getLED();

	/**
	 * Returns the meta object for class '{@link xPPU.ElectronicComponents.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see xPPU.ElectronicComponents.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ElectronicComponentsFactory getElectronicComponentsFactory();

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
		 * The meta object literal for the '{@link xPPU.ElectronicComponents.impl.ElectronicPartImpl <em>Electronic Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.ElectronicComponents.impl.ElectronicPartImpl
		 * @see xPPU.ElectronicComponents.impl.ElectronicComponentsPackageImpl#getElectronicPart()
		 * @generated
		 */
		EClass ELECTRONIC_PART = eINSTANCE.getElectronicPart();

		/**
		 * The meta object literal for the '<em><b>Pin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELECTRONIC_PART__PIN = eINSTANCE.getElectronicPart_Pin();

		/**
		 * The meta object literal for the '<em><b>Physicalconnection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELECTRONIC_PART__PHYSICALCONNECTION = eINSTANCE.getElectronicPart_Physicalconnection();

		/**
		 * The meta object literal for the '{@link xPPU.ElectronicComponents.impl.SwitchImpl <em>Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.ElectronicComponents.impl.SwitchImpl
		 * @see xPPU.ElectronicComponents.impl.ElectronicComponentsPackageImpl#getSwitch()
		 * @generated
		 */
		EClass SWITCH = eINSTANCE.getSwitch();

		/**
		 * The meta object literal for the '{@link xPPU.ElectronicComponents.impl.LEDImpl <em>LED</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.ElectronicComponents.impl.LEDImpl
		 * @see xPPU.ElectronicComponents.impl.ElectronicComponentsPackageImpl#getLED()
		 * @generated
		 */
		EClass LED = eINSTANCE.getLED();

		/**
		 * The meta object literal for the '{@link xPPU.ElectronicComponents.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xPPU.ElectronicComponents.impl.ButtonImpl
		 * @see xPPU.ElectronicComponents.impl.ElectronicComponentsPackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

	}

} //ElectronicComponentsPackage
