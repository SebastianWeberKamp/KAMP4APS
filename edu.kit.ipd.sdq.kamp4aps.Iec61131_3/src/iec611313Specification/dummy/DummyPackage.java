/**
 */
package iec611313Specification.dummy;

import iec611313Specification.common.pous.function_blocks.Function_blocksPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see iec611313Specification.dummy.DummyFactory
 * @model kind="package"
 * @generated
 */
public interface DummyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dummy";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.kit.edu/iec611313/dummy";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dummy";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DummyPackage eINSTANCE = iec611313Specification.dummy.impl.DummyPackageImpl.init();

	/**
	 * The meta object id for the '{@link iec611313Specification.dummy.impl.CodeBodyDummyImpl <em>Code Body Dummy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.dummy.impl.CodeBodyDummyImpl
	 * @see iec611313Specification.dummy.impl.DummyPackageImpl#getCodeBodyDummy()
	 * @generated
	 */
	int CODE_BODY_DUMMY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BODY_DUMMY__VALUE = Function_blocksPackage.FUNCTION_BLOCK_BODY_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Code Body Dummy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BODY_DUMMY_FEATURE_COUNT = Function_blocksPackage.FUNCTION_BLOCK_BODY_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Code Body Dummy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BODY_DUMMY_OPERATION_COUNT = Function_blocksPackage.FUNCTION_BLOCK_BODY_SPECIFICATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link iec611313Specification.dummy.CodeBodyDummy <em>Code Body Dummy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Body Dummy</em>'.
	 * @see iec611313Specification.dummy.CodeBodyDummy
	 * @generated
	 */
	EClass getCodeBodyDummy();

	/**
	 * Returns the meta object for the attribute '{@link iec611313Specification.dummy.CodeBodyDummy#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see iec611313Specification.dummy.CodeBodyDummy#getValue()
	 * @see #getCodeBodyDummy()
	 * @generated
	 */
	EAttribute getCodeBodyDummy_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DummyFactory getDummyFactory();

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
		 * The meta object literal for the '{@link iec611313Specification.dummy.impl.CodeBodyDummyImpl <em>Code Body Dummy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.dummy.impl.CodeBodyDummyImpl
		 * @see iec611313Specification.dummy.impl.DummyPackageImpl#getCodeBodyDummy()
		 * @generated
		 */
		EClass CODE_BODY_DUMMY = eINSTANCE.getCodeBodyDummy();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_BODY_DUMMY__VALUE = eINSTANCE.getCodeBodyDummy_Value();

	}

} //DummyPackage
