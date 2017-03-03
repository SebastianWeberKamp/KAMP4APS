/**
 */
package iec611313Specification.common.oop;

import iec611313Specification.common.types.TypesPackage;

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
 * @see iec611313Specification.common.oop.OopFactory
 * @model kind="package"
 * @generated
 */
public interface OopPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "oop";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.kit.edu/iec611313/common/oop";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "oop";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OopPackage eINSTANCE = iec611313Specification.common.oop.impl.OopPackageImpl.init();

	/**
	 * The meta object id for the '{@link iec611313Specification.common.oop.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.oop.impl.InterfaceImpl
	 * @see iec611313Specification.common.oop.impl.OopPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 0;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__TYPE_NAME = TypesPackage.ANY_DERIVED__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Has Base Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__HAS_BASE_TYPE = TypesPackage.ANY_DERIVED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Property Signatures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__HAS_PROPERTY_SIGNATURES = TypesPackage.ANY_DERIVED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Method Signatures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__HAS_METHOD_SIGNATURES = TypesPackage.ANY_DERIVED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = TypesPackage.ANY_DERIVED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = TypesPackage.ANY_DERIVED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.oop.impl.InheritanceImpl <em>Inheritance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.oop.impl.InheritanceImpl
	 * @see iec611313Specification.common.oop.impl.OopPackageImpl#getInheritance()
	 * @generated
	 */
	int INHERITANCE = 1;

	/**
	 * The feature id for the '<em><b>Has Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE__HAS_SUPER_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Inheritance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Inheritance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.oop.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.oop.impl.PropertyImpl
	 * @see iec611313Specification.common.oop.impl.OopPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 2;

	/**
	 * The feature id for the '<em><b>Contains Getter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__CONTAINS_GETTER = 0;

	/**
	 * The feature id for the '<em><b>Contains Setter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__CONTAINS_SETTER = 1;

	/**
	 * The feature id for the '<em><b>Has Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__HAS_SIGNATURE = 2;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.oop.impl.PropertySignatureImpl <em>Property Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.oop.impl.PropertySignatureImpl
	 * @see iec611313Specification.common.oop.impl.OopPackageImpl#getPropertySignature()
	 * @generated
	 */
	int PROPERTY_SIGNATURE = 3;

	/**
	 * The feature id for the '<em><b>Has Setter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_SIGNATURE__HAS_SETTER = 0;

	/**
	 * The feature id for the '<em><b>Has Getter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_SIGNATURE__HAS_GETTER = 1;

	/**
	 * The feature id for the '<em><b>Has Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_SIGNATURE__HAS_RETURN_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Property Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_SIGNATURE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Property Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_SIGNATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.oop.impl.SetAccessorImpl <em>Set Accessor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.oop.impl.SetAccessorImpl
	 * @see iec611313Specification.common.oop.impl.OopPackageImpl#getSetAccessor()
	 * @generated
	 */
	int SET_ACCESSOR = 4;

	/**
	 * The feature id for the '<em><b>Has Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ACCESSOR__HAS_BODY = 0;

	/**
	 * The number of structural features of the '<em>Set Accessor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ACCESSOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Set Accessor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ACCESSOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.oop.impl.GetAccessorImpl <em>Get Accessor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.oop.impl.GetAccessorImpl
	 * @see iec611313Specification.common.oop.impl.OopPackageImpl#getGetAccessor()
	 * @generated
	 */
	int GET_ACCESSOR = 5;

	/**
	 * The feature id for the '<em><b>Has Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ACCESSOR__HAS_BODY = 0;

	/**
	 * The number of structural features of the '<em>Get Accessor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ACCESSOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Get Accessor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ACCESSOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.oop.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.oop.impl.MethodImpl
	 * @see iec611313Specification.common.oop.impl.OopPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 6;

	/**
	 * The feature id for the '<em><b>Access Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__ACCESS_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Is Overridden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__IS_OVERRIDDEN = 1;

	/**
	 * The feature id for the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__IS_FINAL = 2;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__IS_ABSTRACT = 3;

	/**
	 * The feature id for the '<em><b>Has Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__HAS_BODY = 4;

	/**
	 * The feature id for the '<em><b>Has Method Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__HAS_METHOD_SIGNATURE = 5;

	/**
	 * The feature id for the '<em><b>Contains Local Var Decl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__CONTAINS_LOCAL_VAR_DECL = 6;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.oop.impl.MethodSignatureImpl <em>Method Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.oop.impl.MethodSignatureImpl
	 * @see iec611313Specification.common.oop.impl.OopPackageImpl#getMethodSignature()
	 * @generated
	 */
	int METHOD_SIGNATURE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Has Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE__HAS_RETURN_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Method Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Method Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.oop.AccessType <em>Access Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.oop.AccessType
	 * @see iec611313Specification.common.oop.impl.OopPackageImpl#getAccessType()
	 * @generated
	 */
	int ACCESS_TYPE = 8;


	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.oop.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see iec611313Specification.common.oop.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the containment reference '{@link iec611313Specification.common.oop.Interface#getHasBaseType <em>Has Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Base Type</em>'.
	 * @see iec611313Specification.common.oop.Interface#getHasBaseType()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_HasBaseType();

	/**
	 * Returns the meta object for the containment reference list '{@link iec611313Specification.common.oop.Interface#getHasPropertySignatures <em>Has Property Signatures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Property Signatures</em>'.
	 * @see iec611313Specification.common.oop.Interface#getHasPropertySignatures()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_HasPropertySignatures();

	/**
	 * Returns the meta object for the containment reference list '{@link iec611313Specification.common.oop.Interface#getHasMethodSignatures <em>Has Method Signatures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Method Signatures</em>'.
	 * @see iec611313Specification.common.oop.Interface#getHasMethodSignatures()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_HasMethodSignatures();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.oop.Inheritance <em>Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inheritance</em>'.
	 * @see iec611313Specification.common.oop.Inheritance
	 * @generated
	 */
	EClass getInheritance();

	/**
	 * Returns the meta object for the reference '{@link iec611313Specification.common.oop.Inheritance#getHasSuperType <em>Has Super Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Super Type</em>'.
	 * @see iec611313Specification.common.oop.Inheritance#getHasSuperType()
	 * @see #getInheritance()
	 * @generated
	 */
	EReference getInheritance_HasSuperType();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.oop.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see iec611313Specification.common.oop.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the containment reference '{@link iec611313Specification.common.oop.Property#getContainsGetter <em>Contains Getter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contains Getter</em>'.
	 * @see iec611313Specification.common.oop.Property#getContainsGetter()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_ContainsGetter();

	/**
	 * Returns the meta object for the containment reference '{@link iec611313Specification.common.oop.Property#getContainsSetter <em>Contains Setter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contains Setter</em>'.
	 * @see iec611313Specification.common.oop.Property#getContainsSetter()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_ContainsSetter();

	/**
	 * Returns the meta object for the containment reference '{@link iec611313Specification.common.oop.Property#getHasSignature <em>Has Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Signature</em>'.
	 * @see iec611313Specification.common.oop.Property#getHasSignature()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_HasSignature();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.oop.PropertySignature <em>Property Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Signature</em>'.
	 * @see iec611313Specification.common.oop.PropertySignature
	 * @generated
	 */
	EClass getPropertySignature();

	/**
	 * Returns the meta object for the attribute '{@link iec611313Specification.common.oop.PropertySignature#isHasSetter <em>Has Setter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Setter</em>'.
	 * @see iec611313Specification.common.oop.PropertySignature#isHasSetter()
	 * @see #getPropertySignature()
	 * @generated
	 */
	EAttribute getPropertySignature_HasSetter();

	/**
	 * Returns the meta object for the attribute '{@link iec611313Specification.common.oop.PropertySignature#isHasGetter <em>Has Getter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Getter</em>'.
	 * @see iec611313Specification.common.oop.PropertySignature#isHasGetter()
	 * @see #getPropertySignature()
	 * @generated
	 */
	EAttribute getPropertySignature_HasGetter();

	/**
	 * Returns the meta object for the containment reference '{@link iec611313Specification.common.oop.PropertySignature#getHasReturnType <em>Has Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Return Type</em>'.
	 * @see iec611313Specification.common.oop.PropertySignature#getHasReturnType()
	 * @see #getPropertySignature()
	 * @generated
	 */
	EReference getPropertySignature_HasReturnType();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.oop.SetAccessor <em>Set Accessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Accessor</em>'.
	 * @see iec611313Specification.common.oop.SetAccessor
	 * @generated
	 */
	EClass getSetAccessor();

	/**
	 * Returns the meta object for the containment reference '{@link iec611313Specification.common.oop.SetAccessor#getHasBody <em>Has Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Body</em>'.
	 * @see iec611313Specification.common.oop.SetAccessor#getHasBody()
	 * @see #getSetAccessor()
	 * @generated
	 */
	EReference getSetAccessor_HasBody();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.oop.GetAccessor <em>Get Accessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Accessor</em>'.
	 * @see iec611313Specification.common.oop.GetAccessor
	 * @generated
	 */
	EClass getGetAccessor();

	/**
	 * Returns the meta object for the containment reference '{@link iec611313Specification.common.oop.GetAccessor#getHasBody <em>Has Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Body</em>'.
	 * @see iec611313Specification.common.oop.GetAccessor#getHasBody()
	 * @see #getGetAccessor()
	 * @generated
	 */
	EReference getGetAccessor_HasBody();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.oop.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see iec611313Specification.common.oop.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the attribute '{@link iec611313Specification.common.oop.Method#getAccessType <em>Access Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Type</em>'.
	 * @see iec611313Specification.common.oop.Method#getAccessType()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_AccessType();

	/**
	 * Returns the meta object for the attribute '{@link iec611313Specification.common.oop.Method#isIsOverridden <em>Is Overridden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Overridden</em>'.
	 * @see iec611313Specification.common.oop.Method#isIsOverridden()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_IsOverridden();

	/**
	 * Returns the meta object for the attribute '{@link iec611313Specification.common.oop.Method#isIsFinal <em>Is Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Final</em>'.
	 * @see iec611313Specification.common.oop.Method#isIsFinal()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_IsFinal();

	/**
	 * Returns the meta object for the attribute '{@link iec611313Specification.common.oop.Method#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see iec611313Specification.common.oop.Method#isIsAbstract()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_IsAbstract();

	/**
	 * Returns the meta object for the containment reference '{@link iec611313Specification.common.oop.Method#getHasBody <em>Has Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Body</em>'.
	 * @see iec611313Specification.common.oop.Method#getHasBody()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_HasBody();

	/**
	 * Returns the meta object for the containment reference '{@link iec611313Specification.common.oop.Method#getHasMethodSignature <em>Has Method Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Method Signature</em>'.
	 * @see iec611313Specification.common.oop.Method#getHasMethodSignature()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_HasMethodSignature();

	/**
	 * Returns the meta object for the containment reference list '{@link iec611313Specification.common.oop.Method#getContainsLocalVarDecl <em>Contains Local Var Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Local Var Decl</em>'.
	 * @see iec611313Specification.common.oop.Method#getContainsLocalVarDecl()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_ContainsLocalVarDecl();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.oop.MethodSignature <em>Method Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Signature</em>'.
	 * @see iec611313Specification.common.oop.MethodSignature
	 * @generated
	 */
	EClass getMethodSignature();

	/**
	 * Returns the meta object for the attribute '{@link iec611313Specification.common.oop.MethodSignature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iec611313Specification.common.oop.MethodSignature#getName()
	 * @see #getMethodSignature()
	 * @generated
	 */
	EAttribute getMethodSignature_Name();

	/**
	 * Returns the meta object for the containment reference '{@link iec611313Specification.common.oop.MethodSignature#getHasReturnType <em>Has Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Return Type</em>'.
	 * @see iec611313Specification.common.oop.MethodSignature#getHasReturnType()
	 * @see #getMethodSignature()
	 * @generated
	 */
	EReference getMethodSignature_HasReturnType();

	/**
	 * Returns the meta object for enum '{@link iec611313Specification.common.oop.AccessType <em>Access Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Access Type</em>'.
	 * @see iec611313Specification.common.oop.AccessType
	 * @generated
	 */
	EEnum getAccessType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OopFactory getOopFactory();

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
		 * The meta object literal for the '{@link iec611313Specification.common.oop.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.oop.impl.InterfaceImpl
		 * @see iec611313Specification.common.oop.impl.OopPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Has Base Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__HAS_BASE_TYPE = eINSTANCE.getInterface_HasBaseType();

		/**
		 * The meta object literal for the '<em><b>Has Property Signatures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__HAS_PROPERTY_SIGNATURES = eINSTANCE.getInterface_HasPropertySignatures();

		/**
		 * The meta object literal for the '<em><b>Has Method Signatures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__HAS_METHOD_SIGNATURES = eINSTANCE.getInterface_HasMethodSignatures();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.oop.impl.InheritanceImpl <em>Inheritance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.oop.impl.InheritanceImpl
		 * @see iec611313Specification.common.oop.impl.OopPackageImpl#getInheritance()
		 * @generated
		 */
		EClass INHERITANCE = eINSTANCE.getInheritance();

		/**
		 * The meta object literal for the '<em><b>Has Super Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INHERITANCE__HAS_SUPER_TYPE = eINSTANCE.getInheritance_HasSuperType();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.oop.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.oop.impl.PropertyImpl
		 * @see iec611313Specification.common.oop.impl.OopPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Contains Getter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__CONTAINS_GETTER = eINSTANCE.getProperty_ContainsGetter();

		/**
		 * The meta object literal for the '<em><b>Contains Setter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__CONTAINS_SETTER = eINSTANCE.getProperty_ContainsSetter();

		/**
		 * The meta object literal for the '<em><b>Has Signature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__HAS_SIGNATURE = eINSTANCE.getProperty_HasSignature();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.oop.impl.PropertySignatureImpl <em>Property Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.oop.impl.PropertySignatureImpl
		 * @see iec611313Specification.common.oop.impl.OopPackageImpl#getPropertySignature()
		 * @generated
		 */
		EClass PROPERTY_SIGNATURE = eINSTANCE.getPropertySignature();

		/**
		 * The meta object literal for the '<em><b>Has Setter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_SIGNATURE__HAS_SETTER = eINSTANCE.getPropertySignature_HasSetter();

		/**
		 * The meta object literal for the '<em><b>Has Getter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_SIGNATURE__HAS_GETTER = eINSTANCE.getPropertySignature_HasGetter();

		/**
		 * The meta object literal for the '<em><b>Has Return Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_SIGNATURE__HAS_RETURN_TYPE = eINSTANCE.getPropertySignature_HasReturnType();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.oop.impl.SetAccessorImpl <em>Set Accessor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.oop.impl.SetAccessorImpl
		 * @see iec611313Specification.common.oop.impl.OopPackageImpl#getSetAccessor()
		 * @generated
		 */
		EClass SET_ACCESSOR = eINSTANCE.getSetAccessor();

		/**
		 * The meta object literal for the '<em><b>Has Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_ACCESSOR__HAS_BODY = eINSTANCE.getSetAccessor_HasBody();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.oop.impl.GetAccessorImpl <em>Get Accessor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.oop.impl.GetAccessorImpl
		 * @see iec611313Specification.common.oop.impl.OopPackageImpl#getGetAccessor()
		 * @generated
		 */
		EClass GET_ACCESSOR = eINSTANCE.getGetAccessor();

		/**
		 * The meta object literal for the '<em><b>Has Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GET_ACCESSOR__HAS_BODY = eINSTANCE.getGetAccessor_HasBody();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.oop.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.oop.impl.MethodImpl
		 * @see iec611313Specification.common.oop.impl.OopPackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Access Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__ACCESS_TYPE = eINSTANCE.getMethod_AccessType();

		/**
		 * The meta object literal for the '<em><b>Is Overridden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__IS_OVERRIDDEN = eINSTANCE.getMethod_IsOverridden();

		/**
		 * The meta object literal for the '<em><b>Is Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__IS_FINAL = eINSTANCE.getMethod_IsFinal();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__IS_ABSTRACT = eINSTANCE.getMethod_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>Has Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__HAS_BODY = eINSTANCE.getMethod_HasBody();

		/**
		 * The meta object literal for the '<em><b>Has Method Signature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__HAS_METHOD_SIGNATURE = eINSTANCE.getMethod_HasMethodSignature();

		/**
		 * The meta object literal for the '<em><b>Contains Local Var Decl</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__CONTAINS_LOCAL_VAR_DECL = eINSTANCE.getMethod_ContainsLocalVarDecl();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.oop.impl.MethodSignatureImpl <em>Method Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.oop.impl.MethodSignatureImpl
		 * @see iec611313Specification.common.oop.impl.OopPackageImpl#getMethodSignature()
		 * @generated
		 */
		EClass METHOD_SIGNATURE = eINSTANCE.getMethodSignature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_SIGNATURE__NAME = eINSTANCE.getMethodSignature_Name();

		/**
		 * The meta object literal for the '<em><b>Has Return Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_SIGNATURE__HAS_RETURN_TYPE = eINSTANCE.getMethodSignature_HasReturnType();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.oop.AccessType <em>Access Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.oop.AccessType
		 * @see iec611313Specification.common.oop.impl.OopPackageImpl#getAccessType()
		 * @generated
		 */
		EEnum ACCESS_TYPE = eINSTANCE.getAccessType();

	}

} //OopPackage
