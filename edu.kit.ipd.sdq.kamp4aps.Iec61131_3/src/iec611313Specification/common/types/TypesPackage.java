/**
 */
package iec611313Specification.common.types;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see iec611313Specification.common.types.TypesFactory
 * @model kind="package"
 * @generated
 */
public interface TypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "types";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.kit.edu/iec611313/common/types";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "types";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TypesPackage eINSTANCE = iec611313Specification.common.types.impl.TypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link iec611313Specification.common.types.impl.ANYImpl <em>ANY</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.types.impl.ANYImpl
	 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getANY()
	 * @generated
	 */
	int ANY = 0;

	/**
	 * The number of structural features of the '<em>ANY</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>ANY</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.types.impl.ANY_ELEMENTARYImpl <em>ANY ELEMENTARY</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.types.impl.ANY_ELEMENTARYImpl
	 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getANY_ELEMENTARY()
	 * @generated
	 */
	int ANY_ELEMENTARY = 1;

	/**
	 * The number of structural features of the '<em>ANY ELEMENTARY</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_ELEMENTARY_FEATURE_COUNT = ANY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ANY ELEMENTARY</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_ELEMENTARY_OPERATION_COUNT = ANY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.types.impl.ANY_DERIVEDImpl <em>ANY DERIVED</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.types.impl.ANY_DERIVEDImpl
	 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getANY_DERIVED()
	 * @generated
	 */
	int ANY_DERIVED = 2;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_DERIVED__TYPE_NAME = ANY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ANY DERIVED</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_DERIVED_FEATURE_COUNT = ANY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>ANY DERIVED</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_DERIVED_OPERATION_COUNT = ANY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.types.impl.ANY_MAGNITUDEImpl <em>ANY MAGNITUDE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.types.impl.ANY_MAGNITUDEImpl
	 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getANY_MAGNITUDE()
	 * @generated
	 */
	int ANY_MAGNITUDE = 3;

	/**
	 * The number of structural features of the '<em>ANY MAGNITUDE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_MAGNITUDE_FEATURE_COUNT = ANY_ELEMENTARY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ANY MAGNITUDE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_MAGNITUDE_OPERATION_COUNT = ANY_ELEMENTARY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.types.impl.ANY_DATEImpl <em>ANY DATE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.types.impl.ANY_DATEImpl
	 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getANY_DATE()
	 * @generated
	 */
	int ANY_DATE = 4;

	/**
	 * The number of structural features of the '<em>ANY DATE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_DATE_FEATURE_COUNT = ANY_ELEMENTARY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ANY DATE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_DATE_OPERATION_COUNT = ANY_ELEMENTARY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.types.impl.ANY_BITImpl <em>ANY BIT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.types.impl.ANY_BITImpl
	 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getANY_BIT()
	 * @generated
	 */
	int ANY_BIT = 5;

	/**
	 * The number of structural features of the '<em>ANY BIT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_BIT_FEATURE_COUNT = ANY_ELEMENTARY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ANY BIT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_BIT_OPERATION_COUNT = ANY_ELEMENTARY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.types.impl.ANY_STRINGImpl <em>ANY STRING</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.types.impl.ANY_STRINGImpl
	 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getANY_STRING()
	 * @generated
	 */
	int ANY_STRING = 6;

	/**
	 * The number of structural features of the '<em>ANY STRING</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_STRING_FEATURE_COUNT = ANY_ELEMENTARY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ANY STRING</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_STRING_OPERATION_COUNT = ANY_ELEMENTARY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.types.impl.TIMEImpl <em>TIME</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.types.impl.TIMEImpl
	 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getTIME()
	 * @generated
	 */
	int TIME = 7;

	/**
	 * The number of structural features of the '<em>TIME</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FEATURE_COUNT = ANY_MAGNITUDE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TIME</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OPERATION_COUNT = ANY_MAGNITUDE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.types.impl.ANY_NUMImpl <em>ANY NUM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.types.impl.ANY_NUMImpl
	 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getANY_NUM()
	 * @generated
	 */
	int ANY_NUM = 8;

	/**
	 * The number of structural features of the '<em>ANY NUM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_NUM_FEATURE_COUNT = ANY_MAGNITUDE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ANY NUM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_NUM_OPERATION_COUNT = ANY_MAGNITUDE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.types.impl.ANY_REALImpl <em>ANY REAL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.types.impl.ANY_REALImpl
	 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getANY_REAL()
	 * @generated
	 */
	int ANY_REAL = 9;

	/**
	 * The number of structural features of the '<em>ANY REAL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_REAL_FEATURE_COUNT = ANY_NUM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ANY REAL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_REAL_OPERATION_COUNT = ANY_NUM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.types.impl.ANY_INTImpl <em>ANY INT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.types.impl.ANY_INTImpl
	 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getANY_INT()
	 * @generated
	 */
	int ANY_INT = 10;

	/**
	 * The number of structural features of the '<em>ANY INT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_INT_FEATURE_COUNT = ANY_NUM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ANY INT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_INT_OPERATION_COUNT = ANY_NUM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.types.impl.REALImpl <em>REAL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.types.impl.REALImpl
	 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getREAL()
	 * @generated
	 */
	int REAL = 11;

	/**
	 * The number of structural features of the '<em>REAL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_FEATURE_COUNT = ANY_REAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>REAL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_OPERATION_COUNT = ANY_REAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.types.impl.LREALImpl <em>LREAL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.types.impl.LREALImpl
	 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getLREAL()
	 * @generated
	 */
	int LREAL = 12;

	/**
	 * The number of structural features of the '<em>LREAL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LREAL_FEATURE_COUNT = ANY_REAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>LREAL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LREAL_OPERATION_COUNT = ANY_REAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.types.impl.SINTImpl <em>SINT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.types.impl.SINTImpl
	 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getSINT()
	 * @generated
	 */
	int SINT = 13;

	/**
	 * The number of structural features of the '<em>SINT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINT_FEATURE_COUNT = ANY_INT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SINT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINT_OPERATION_COUNT = ANY_INT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.types.impl.INTImpl <em>INT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.types.impl.INTImpl
	 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getINT()
	 * @generated
	 */
	int INT = 14;

	/**
	 * The number of structural features of the '<em>INT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_FEATURE_COUNT = ANY_INT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>INT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OPERATION_COUNT = ANY_INT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.types.impl.DINTImpl <em>DINT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.types.impl.DINTImpl
	 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getDINT()
	 * @generated
	 */
	int DINT = 15;

	/**
	 * The number of structural features of the '<em>DINT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINT_FEATURE_COUNT = ANY_INT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DINT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINT_OPERATION_COUNT = ANY_INT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.types.impl.LINTImpl <em>LINT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.types.impl.LINTImpl
	 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getLINT()
	 * @generated
	 */
	int LINT = 16;

	/**
	 * The number of structural features of the '<em>LINT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINT_FEATURE_COUNT = ANY_INT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>LINT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINT_OPERATION_COUNT = ANY_INT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.types.impl.USINTImpl <em>USINT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.types.impl.USINTImpl
	 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getUSINT()
	 * @generated
	 */
	int USINT = 17;

	/**
	 * The number of structural features of the '<em>USINT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USINT_FEATURE_COUNT = ANY_INT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>USINT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USINT_OPERATION_COUNT = ANY_INT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.types.impl.UINTImpl <em>UINT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.types.impl.UINTImpl
	 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getUINT()
	 * @generated
	 */
	int UINT = 18;

	/**
	 * The number of structural features of the '<em>UINT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINT_FEATURE_COUNT = ANY_INT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>UINT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINT_OPERATION_COUNT = ANY_INT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.types.impl.UDINTImpl <em>UDINT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.types.impl.UDINTImpl
	 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getUDINT()
	 * @generated
	 */
	int UDINT = 19;

	/**
	 * The number of structural features of the '<em>UDINT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDINT_FEATURE_COUNT = ANY_INT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>UDINT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDINT_OPERATION_COUNT = ANY_INT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.types.impl.ULINTImpl <em>ULINT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.types.impl.ULINTImpl
	 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getULINT()
	 * @generated
	 */
	int ULINT = 20;

	/**
	 * The number of structural features of the '<em>ULINT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULINT_FEATURE_COUNT = ANY_INT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ULINT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULINT_OPERATION_COUNT = ANY_INT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.types.impl.DATEImpl <em>DATE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.types.impl.DATEImpl
	 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getDATE()
	 * @generated
	 */
	int DATE = 21;

	/**
	 * The number of structural features of the '<em>DATE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FEATURE_COUNT = ANY_DATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DATE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_OPERATION_COUNT = ANY_DATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.types.impl.DATE_AND_TIMEImpl <em>DATE AND TIME</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.types.impl.DATE_AND_TIMEImpl
	 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getDATE_AND_TIME()
	 * @generated
	 */
	int DATE_AND_TIME = 22;

	/**
	 * The number of structural features of the '<em>DATE AND TIME</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_AND_TIME_FEATURE_COUNT = ANY_DATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DATE AND TIME</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_AND_TIME_OPERATION_COUNT = ANY_DATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.types.impl.TIME_OF_DAYImpl <em>TIME OF DAY</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.types.impl.TIME_OF_DAYImpl
	 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getTIME_OF_DAY()
	 * @generated
	 */
	int TIME_OF_DAY = 23;

	/**
	 * The number of structural features of the '<em>TIME OF DAY</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OF_DAY_FEATURE_COUNT = DATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TIME OF DAY</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OF_DAY_OPERATION_COUNT = DATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.types.impl.BOOLImpl <em>BOOL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.types.impl.BOOLImpl
	 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getBOOL()
	 * @generated
	 */
	int BOOL = 24;

	/**
	 * The number of structural features of the '<em>BOOL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_FEATURE_COUNT = ANY_BIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>BOOL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_OPERATION_COUNT = ANY_BIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.types.impl.BYTEImpl <em>BYTE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.types.impl.BYTEImpl
	 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getBYTE()
	 * @generated
	 */
	int BYTE = 25;

	/**
	 * The number of structural features of the '<em>BYTE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE_FEATURE_COUNT = ANY_BIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>BYTE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE_OPERATION_COUNT = ANY_BIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.types.impl.WORDImpl <em>WORD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.types.impl.WORDImpl
	 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getWORD()
	 * @generated
	 */
	int WORD = 26;

	/**
	 * The number of structural features of the '<em>WORD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORD_FEATURE_COUNT = ANY_BIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>WORD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORD_OPERATION_COUNT = ANY_BIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.types.impl.DWORDImpl <em>DWORD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.types.impl.DWORDImpl
	 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getDWORD()
	 * @generated
	 */
	int DWORD = 27;

	/**
	 * The number of structural features of the '<em>DWORD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DWORD_FEATURE_COUNT = ANY_BIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DWORD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DWORD_OPERATION_COUNT = ANY_BIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.types.impl.LWORDImpl <em>LWORD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.types.impl.LWORDImpl
	 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getLWORD()
	 * @generated
	 */
	int LWORD = 28;

	/**
	 * The number of structural features of the '<em>LWORD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWORD_FEATURE_COUNT = ANY_BIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>LWORD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LWORD_OPERATION_COUNT = ANY_BIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.types.impl.STRINGImpl <em>STRING</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.types.impl.STRINGImpl
	 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getSTRING()
	 * @generated
	 */
	int STRING = 29;

	/**
	 * The number of structural features of the '<em>STRING</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FEATURE_COUNT = ANY_STRING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>STRING</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OPERATION_COUNT = ANY_STRING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.types.impl.WSTRINGImpl <em>WSTRING</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.types.impl.WSTRINGImpl
	 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getWSTRING()
	 * @generated
	 */
	int WSTRING = 30;

	/**
	 * The number of structural features of the '<em>WSTRING</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSTRING_FEATURE_COUNT = ANY_STRING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>WSTRING</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSTRING_OPERATION_COUNT = ANY_STRING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.types.impl.ENUMERATIONImpl <em>ENUMERATION</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.types.impl.ENUMERATIONImpl
	 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getENUMERATION()
	 * @generated
	 */
	int ENUMERATION = 31;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__TYPE_NAME = ANY_DERIVED__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Contains Enum Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__CONTAINS_ENUM_VALUE = ANY_DERIVED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Initial Enum Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__HAS_INITIAL_ENUM_VALUE = ANY_DERIVED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ENUMERATION</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FEATURE_COUNT = ANY_DERIVED_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>ENUMERATION</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_OPERATION_COUNT = ANY_DERIVED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.types.impl.DERIVEDImpl <em>DERIVED</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.types.impl.DERIVEDImpl
	 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getDERIVED()
	 * @generated
	 */
	int DERIVED = 32;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED__TYPE_NAME = ANY_DERIVED__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Has Initial Derived Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED__HAS_INITIAL_DERIVED_VALUE = ANY_DERIVED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Subrange Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED__HAS_SUBRANGE_RANGE = ANY_DERIVED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Derived Base Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED__HAS_DERIVED_BASE_TYPE = ANY_DERIVED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>DERIVED</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FEATURE_COUNT = ANY_DERIVED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>DERIVED</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_OPERATION_COUNT = ANY_DERIVED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.types.impl.ARRAYImpl <em>ARRAY</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.types.impl.ARRAYImpl
	 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getARRAY()
	 * @generated
	 */
	int ARRAY = 33;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__TYPE_NAME = ANY_DERIVED__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Has Array Dimension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__HAS_ARRAY_DIMENSION = ANY_DERIVED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Initial Array Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__HAS_INITIAL_ARRAY_VALUE = ANY_DERIVED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Array Base Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__HAS_ARRAY_BASE_TYPE = ANY_DERIVED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>ARRAY</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_FEATURE_COUNT = ANY_DERIVED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>ARRAY</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_OPERATION_COUNT = ANY_DERIVED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.types.impl.STRUCTUREImpl <em>STRUCTURE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.types.impl.STRUCTUREImpl
	 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getSTRUCTURE()
	 * @generated
	 */
	int STRUCTURE = 34;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__TYPE_NAME = ANY_DERIVED__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Contains Struct Var Decl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__CONTAINS_STRUCT_VAR_DECL = ANY_DERIVED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>STRUCTURE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_FEATURE_COUNT = ANY_DERIVED_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>STRUCTURE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_OPERATION_COUNT = ANY_DERIVED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.types.impl.POINTERImpl <em>POINTER</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.types.impl.POINTERImpl
	 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getPOINTER()
	 * @generated
	 */
	int POINTER = 35;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER__TYPE_NAME = ANY_DERIVED__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Has Derived Base Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER__HAS_DERIVED_BASE_TYPE = ANY_DERIVED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>POINTER</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_FEATURE_COUNT = ANY_DERIVED_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>POINTER</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_OPERATION_COUNT = ANY_DERIVED_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.types.ANY <em>ANY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ANY</em>'.
	 * @see iec611313Specification.common.types.ANY
	 * @generated
	 */
	EClass getANY();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.types.ANY_ELEMENTARY <em>ANY ELEMENTARY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ANY ELEMENTARY</em>'.
	 * @see iec611313Specification.common.types.ANY_ELEMENTARY
	 * @generated
	 */
	EClass getANY_ELEMENTARY();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.types.ANY_DERIVED <em>ANY DERIVED</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ANY DERIVED</em>'.
	 * @see iec611313Specification.common.types.ANY_DERIVED
	 * @generated
	 */
	EClass getANY_DERIVED();

	/**
	 * Returns the meta object for the attribute '{@link iec611313Specification.common.types.ANY_DERIVED#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see iec611313Specification.common.types.ANY_DERIVED#getTypeName()
	 * @see #getANY_DERIVED()
	 * @generated
	 */
	EAttribute getANY_DERIVED_TypeName();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.types.ANY_MAGNITUDE <em>ANY MAGNITUDE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ANY MAGNITUDE</em>'.
	 * @see iec611313Specification.common.types.ANY_MAGNITUDE
	 * @generated
	 */
	EClass getANY_MAGNITUDE();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.types.ANY_DATE <em>ANY DATE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ANY DATE</em>'.
	 * @see iec611313Specification.common.types.ANY_DATE
	 * @generated
	 */
	EClass getANY_DATE();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.types.ANY_BIT <em>ANY BIT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ANY BIT</em>'.
	 * @see iec611313Specification.common.types.ANY_BIT
	 * @generated
	 */
	EClass getANY_BIT();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.types.ANY_STRING <em>ANY STRING</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ANY STRING</em>'.
	 * @see iec611313Specification.common.types.ANY_STRING
	 * @generated
	 */
	EClass getANY_STRING();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.types.TIME <em>TIME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TIME</em>'.
	 * @see iec611313Specification.common.types.TIME
	 * @generated
	 */
	EClass getTIME();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.types.ANY_NUM <em>ANY NUM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ANY NUM</em>'.
	 * @see iec611313Specification.common.types.ANY_NUM
	 * @generated
	 */
	EClass getANY_NUM();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.types.ANY_REAL <em>ANY REAL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ANY REAL</em>'.
	 * @see iec611313Specification.common.types.ANY_REAL
	 * @generated
	 */
	EClass getANY_REAL();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.types.ANY_INT <em>ANY INT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ANY INT</em>'.
	 * @see iec611313Specification.common.types.ANY_INT
	 * @generated
	 */
	EClass getANY_INT();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.types.REAL <em>REAL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>REAL</em>'.
	 * @see iec611313Specification.common.types.REAL
	 * @generated
	 */
	EClass getREAL();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.types.LREAL <em>LREAL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LREAL</em>'.
	 * @see iec611313Specification.common.types.LREAL
	 * @generated
	 */
	EClass getLREAL();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.types.SINT <em>SINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SINT</em>'.
	 * @see iec611313Specification.common.types.SINT
	 * @generated
	 */
	EClass getSINT();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.types.INT <em>INT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>INT</em>'.
	 * @see iec611313Specification.common.types.INT
	 * @generated
	 */
	EClass getINT();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.types.DINT <em>DINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DINT</em>'.
	 * @see iec611313Specification.common.types.DINT
	 * @generated
	 */
	EClass getDINT();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.types.LINT <em>LINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LINT</em>'.
	 * @see iec611313Specification.common.types.LINT
	 * @generated
	 */
	EClass getLINT();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.types.USINT <em>USINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>USINT</em>'.
	 * @see iec611313Specification.common.types.USINT
	 * @generated
	 */
	EClass getUSINT();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.types.UINT <em>UINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UINT</em>'.
	 * @see iec611313Specification.common.types.UINT
	 * @generated
	 */
	EClass getUINT();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.types.UDINT <em>UDINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UDINT</em>'.
	 * @see iec611313Specification.common.types.UDINT
	 * @generated
	 */
	EClass getUDINT();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.types.ULINT <em>ULINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ULINT</em>'.
	 * @see iec611313Specification.common.types.ULINT
	 * @generated
	 */
	EClass getULINT();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.types.DATE <em>DATE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DATE</em>'.
	 * @see iec611313Specification.common.types.DATE
	 * @generated
	 */
	EClass getDATE();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.types.DATE_AND_TIME <em>DATE AND TIME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DATE AND TIME</em>'.
	 * @see iec611313Specification.common.types.DATE_AND_TIME
	 * @generated
	 */
	EClass getDATE_AND_TIME();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.types.TIME_OF_DAY <em>TIME OF DAY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TIME OF DAY</em>'.
	 * @see iec611313Specification.common.types.TIME_OF_DAY
	 * @generated
	 */
	EClass getTIME_OF_DAY();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.types.BOOL <em>BOOL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BOOL</em>'.
	 * @see iec611313Specification.common.types.BOOL
	 * @generated
	 */
	EClass getBOOL();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.types.BYTE <em>BYTE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BYTE</em>'.
	 * @see iec611313Specification.common.types.BYTE
	 * @generated
	 */
	EClass getBYTE();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.types.WORD <em>WORD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WORD</em>'.
	 * @see iec611313Specification.common.types.WORD
	 * @generated
	 */
	EClass getWORD();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.types.DWORD <em>DWORD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DWORD</em>'.
	 * @see iec611313Specification.common.types.DWORD
	 * @generated
	 */
	EClass getDWORD();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.types.LWORD <em>LWORD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LWORD</em>'.
	 * @see iec611313Specification.common.types.LWORD
	 * @generated
	 */
	EClass getLWORD();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.types.STRING <em>STRING</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>STRING</em>'.
	 * @see iec611313Specification.common.types.STRING
	 * @generated
	 */
	EClass getSTRING();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.types.WSTRING <em>WSTRING</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WSTRING</em>'.
	 * @see iec611313Specification.common.types.WSTRING
	 * @generated
	 */
	EClass getWSTRING();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.types.ENUMERATION <em>ENUMERATION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ENUMERATION</em>'.
	 * @see iec611313Specification.common.types.ENUMERATION
	 * @generated
	 */
	EClass getENUMERATION();

	/**
	 * Returns the meta object for the containment reference list '{@link iec611313Specification.common.types.ENUMERATION#getContainsEnumValue <em>Contains Enum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Enum Value</em>'.
	 * @see iec611313Specification.common.types.ENUMERATION#getContainsEnumValue()
	 * @see #getENUMERATION()
	 * @generated
	 */
	EReference getENUMERATION_ContainsEnumValue();

	/**
	 * Returns the meta object for the containment reference '{@link iec611313Specification.common.types.ENUMERATION#getHasInitialEnumValue <em>Has Initial Enum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Initial Enum Value</em>'.
	 * @see iec611313Specification.common.types.ENUMERATION#getHasInitialEnumValue()
	 * @see #getENUMERATION()
	 * @generated
	 */
	EReference getENUMERATION_HasInitialEnumValue();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.types.DERIVED <em>DERIVED</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DERIVED</em>'.
	 * @see iec611313Specification.common.types.DERIVED
	 * @generated
	 */
	EClass getDERIVED();

	/**
	 * Returns the meta object for the containment reference '{@link iec611313Specification.common.types.DERIVED#getHasInitialDerivedValue <em>Has Initial Derived Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Initial Derived Value</em>'.
	 * @see iec611313Specification.common.types.DERIVED#getHasInitialDerivedValue()
	 * @see #getDERIVED()
	 * @generated
	 */
	EReference getDERIVED_HasInitialDerivedValue();

	/**
	 * Returns the meta object for the containment reference '{@link iec611313Specification.common.types.DERIVED#getHasSubrangeRange <em>Has Subrange Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Subrange Range</em>'.
	 * @see iec611313Specification.common.types.DERIVED#getHasSubrangeRange()
	 * @see #getDERIVED()
	 * @generated
	 */
	EReference getDERIVED_HasSubrangeRange();

	/**
	 * Returns the meta object for the containment reference '{@link iec611313Specification.common.types.DERIVED#getHasDerivedBaseType <em>Has Derived Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Derived Base Type</em>'.
	 * @see iec611313Specification.common.types.DERIVED#getHasDerivedBaseType()
	 * @see #getDERIVED()
	 * @generated
	 */
	EReference getDERIVED_HasDerivedBaseType();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.types.ARRAY <em>ARRAY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ARRAY</em>'.
	 * @see iec611313Specification.common.types.ARRAY
	 * @generated
	 */
	EClass getARRAY();

	/**
	 * Returns the meta object for the containment reference list '{@link iec611313Specification.common.types.ARRAY#getHasArrayDimension <em>Has Array Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Array Dimension</em>'.
	 * @see iec611313Specification.common.types.ARRAY#getHasArrayDimension()
	 * @see #getARRAY()
	 * @generated
	 */
	EReference getARRAY_HasArrayDimension();

	/**
	 * Returns the meta object for the containment reference list '{@link iec611313Specification.common.types.ARRAY#getHasInitialArrayValue <em>Has Initial Array Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Initial Array Value</em>'.
	 * @see iec611313Specification.common.types.ARRAY#getHasInitialArrayValue()
	 * @see #getARRAY()
	 * @generated
	 */
	EReference getARRAY_HasInitialArrayValue();

	/**
	 * Returns the meta object for the containment reference '{@link iec611313Specification.common.types.ARRAY#getHasArrayBaseType <em>Has Array Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Array Base Type</em>'.
	 * @see iec611313Specification.common.types.ARRAY#getHasArrayBaseType()
	 * @see #getARRAY()
	 * @generated
	 */
	EReference getARRAY_HasArrayBaseType();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.types.STRUCTURE <em>STRUCTURE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>STRUCTURE</em>'.
	 * @see iec611313Specification.common.types.STRUCTURE
	 * @generated
	 */
	EClass getSTRUCTURE();

	/**
	 * Returns the meta object for the containment reference list '{@link iec611313Specification.common.types.STRUCTURE#getContainsStructVarDecl <em>Contains Struct Var Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Struct Var Decl</em>'.
	 * @see iec611313Specification.common.types.STRUCTURE#getContainsStructVarDecl()
	 * @see #getSTRUCTURE()
	 * @generated
	 */
	EReference getSTRUCTURE_ContainsStructVarDecl();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.types.POINTER <em>POINTER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>POINTER</em>'.
	 * @see iec611313Specification.common.types.POINTER
	 * @generated
	 */
	EClass getPOINTER();

	/**
	 * Returns the meta object for the containment reference '{@link iec611313Specification.common.types.POINTER#getHasDerivedBaseType <em>Has Derived Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Derived Base Type</em>'.
	 * @see iec611313Specification.common.types.POINTER#getHasDerivedBaseType()
	 * @see #getPOINTER()
	 * @generated
	 */
	EReference getPOINTER_HasDerivedBaseType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TypesFactory getTypesFactory();

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
		 * The meta object literal for the '{@link iec611313Specification.common.types.impl.ANYImpl <em>ANY</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.types.impl.ANYImpl
		 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getANY()
		 * @generated
		 */
		EClass ANY = eINSTANCE.getANY();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.types.impl.ANY_ELEMENTARYImpl <em>ANY ELEMENTARY</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.types.impl.ANY_ELEMENTARYImpl
		 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getANY_ELEMENTARY()
		 * @generated
		 */
		EClass ANY_ELEMENTARY = eINSTANCE.getANY_ELEMENTARY();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.types.impl.ANY_DERIVEDImpl <em>ANY DERIVED</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.types.impl.ANY_DERIVEDImpl
		 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getANY_DERIVED()
		 * @generated
		 */
		EClass ANY_DERIVED = eINSTANCE.getANY_DERIVED();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANY_DERIVED__TYPE_NAME = eINSTANCE.getANY_DERIVED_TypeName();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.types.impl.ANY_MAGNITUDEImpl <em>ANY MAGNITUDE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.types.impl.ANY_MAGNITUDEImpl
		 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getANY_MAGNITUDE()
		 * @generated
		 */
		EClass ANY_MAGNITUDE = eINSTANCE.getANY_MAGNITUDE();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.types.impl.ANY_DATEImpl <em>ANY DATE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.types.impl.ANY_DATEImpl
		 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getANY_DATE()
		 * @generated
		 */
		EClass ANY_DATE = eINSTANCE.getANY_DATE();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.types.impl.ANY_BITImpl <em>ANY BIT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.types.impl.ANY_BITImpl
		 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getANY_BIT()
		 * @generated
		 */
		EClass ANY_BIT = eINSTANCE.getANY_BIT();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.types.impl.ANY_STRINGImpl <em>ANY STRING</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.types.impl.ANY_STRINGImpl
		 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getANY_STRING()
		 * @generated
		 */
		EClass ANY_STRING = eINSTANCE.getANY_STRING();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.types.impl.TIMEImpl <em>TIME</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.types.impl.TIMEImpl
		 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getTIME()
		 * @generated
		 */
		EClass TIME = eINSTANCE.getTIME();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.types.impl.ANY_NUMImpl <em>ANY NUM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.types.impl.ANY_NUMImpl
		 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getANY_NUM()
		 * @generated
		 */
		EClass ANY_NUM = eINSTANCE.getANY_NUM();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.types.impl.ANY_REALImpl <em>ANY REAL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.types.impl.ANY_REALImpl
		 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getANY_REAL()
		 * @generated
		 */
		EClass ANY_REAL = eINSTANCE.getANY_REAL();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.types.impl.ANY_INTImpl <em>ANY INT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.types.impl.ANY_INTImpl
		 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getANY_INT()
		 * @generated
		 */
		EClass ANY_INT = eINSTANCE.getANY_INT();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.types.impl.REALImpl <em>REAL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.types.impl.REALImpl
		 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getREAL()
		 * @generated
		 */
		EClass REAL = eINSTANCE.getREAL();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.types.impl.LREALImpl <em>LREAL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.types.impl.LREALImpl
		 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getLREAL()
		 * @generated
		 */
		EClass LREAL = eINSTANCE.getLREAL();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.types.impl.SINTImpl <em>SINT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.types.impl.SINTImpl
		 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getSINT()
		 * @generated
		 */
		EClass SINT = eINSTANCE.getSINT();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.types.impl.INTImpl <em>INT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.types.impl.INTImpl
		 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getINT()
		 * @generated
		 */
		EClass INT = eINSTANCE.getINT();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.types.impl.DINTImpl <em>DINT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.types.impl.DINTImpl
		 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getDINT()
		 * @generated
		 */
		EClass DINT = eINSTANCE.getDINT();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.types.impl.LINTImpl <em>LINT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.types.impl.LINTImpl
		 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getLINT()
		 * @generated
		 */
		EClass LINT = eINSTANCE.getLINT();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.types.impl.USINTImpl <em>USINT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.types.impl.USINTImpl
		 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getUSINT()
		 * @generated
		 */
		EClass USINT = eINSTANCE.getUSINT();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.types.impl.UINTImpl <em>UINT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.types.impl.UINTImpl
		 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getUINT()
		 * @generated
		 */
		EClass UINT = eINSTANCE.getUINT();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.types.impl.UDINTImpl <em>UDINT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.types.impl.UDINTImpl
		 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getUDINT()
		 * @generated
		 */
		EClass UDINT = eINSTANCE.getUDINT();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.types.impl.ULINTImpl <em>ULINT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.types.impl.ULINTImpl
		 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getULINT()
		 * @generated
		 */
		EClass ULINT = eINSTANCE.getULINT();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.types.impl.DATEImpl <em>DATE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.types.impl.DATEImpl
		 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getDATE()
		 * @generated
		 */
		EClass DATE = eINSTANCE.getDATE();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.types.impl.DATE_AND_TIMEImpl <em>DATE AND TIME</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.types.impl.DATE_AND_TIMEImpl
		 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getDATE_AND_TIME()
		 * @generated
		 */
		EClass DATE_AND_TIME = eINSTANCE.getDATE_AND_TIME();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.types.impl.TIME_OF_DAYImpl <em>TIME OF DAY</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.types.impl.TIME_OF_DAYImpl
		 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getTIME_OF_DAY()
		 * @generated
		 */
		EClass TIME_OF_DAY = eINSTANCE.getTIME_OF_DAY();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.types.impl.BOOLImpl <em>BOOL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.types.impl.BOOLImpl
		 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getBOOL()
		 * @generated
		 */
		EClass BOOL = eINSTANCE.getBOOL();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.types.impl.BYTEImpl <em>BYTE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.types.impl.BYTEImpl
		 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getBYTE()
		 * @generated
		 */
		EClass BYTE = eINSTANCE.getBYTE();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.types.impl.WORDImpl <em>WORD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.types.impl.WORDImpl
		 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getWORD()
		 * @generated
		 */
		EClass WORD = eINSTANCE.getWORD();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.types.impl.DWORDImpl <em>DWORD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.types.impl.DWORDImpl
		 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getDWORD()
		 * @generated
		 */
		EClass DWORD = eINSTANCE.getDWORD();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.types.impl.LWORDImpl <em>LWORD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.types.impl.LWORDImpl
		 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getLWORD()
		 * @generated
		 */
		EClass LWORD = eINSTANCE.getLWORD();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.types.impl.STRINGImpl <em>STRING</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.types.impl.STRINGImpl
		 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getSTRING()
		 * @generated
		 */
		EClass STRING = eINSTANCE.getSTRING();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.types.impl.WSTRINGImpl <em>WSTRING</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.types.impl.WSTRINGImpl
		 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getWSTRING()
		 * @generated
		 */
		EClass WSTRING = eINSTANCE.getWSTRING();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.types.impl.ENUMERATIONImpl <em>ENUMERATION</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.types.impl.ENUMERATIONImpl
		 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getENUMERATION()
		 * @generated
		 */
		EClass ENUMERATION = eINSTANCE.getENUMERATION();

		/**
		 * The meta object literal for the '<em><b>Contains Enum Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION__CONTAINS_ENUM_VALUE = eINSTANCE.getENUMERATION_ContainsEnumValue();

		/**
		 * The meta object literal for the '<em><b>Has Initial Enum Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION__HAS_INITIAL_ENUM_VALUE = eINSTANCE.getENUMERATION_HasInitialEnumValue();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.types.impl.DERIVEDImpl <em>DERIVED</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.types.impl.DERIVEDImpl
		 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getDERIVED()
		 * @generated
		 */
		EClass DERIVED = eINSTANCE.getDERIVED();

		/**
		 * The meta object literal for the '<em><b>Has Initial Derived Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVED__HAS_INITIAL_DERIVED_VALUE = eINSTANCE.getDERIVED_HasInitialDerivedValue();

		/**
		 * The meta object literal for the '<em><b>Has Subrange Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVED__HAS_SUBRANGE_RANGE = eINSTANCE.getDERIVED_HasSubrangeRange();

		/**
		 * The meta object literal for the '<em><b>Has Derived Base Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVED__HAS_DERIVED_BASE_TYPE = eINSTANCE.getDERIVED_HasDerivedBaseType();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.types.impl.ARRAYImpl <em>ARRAY</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.types.impl.ARRAYImpl
		 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getARRAY()
		 * @generated
		 */
		EClass ARRAY = eINSTANCE.getARRAY();

		/**
		 * The meta object literal for the '<em><b>Has Array Dimension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY__HAS_ARRAY_DIMENSION = eINSTANCE.getARRAY_HasArrayDimension();

		/**
		 * The meta object literal for the '<em><b>Has Initial Array Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY__HAS_INITIAL_ARRAY_VALUE = eINSTANCE.getARRAY_HasInitialArrayValue();

		/**
		 * The meta object literal for the '<em><b>Has Array Base Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY__HAS_ARRAY_BASE_TYPE = eINSTANCE.getARRAY_HasArrayBaseType();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.types.impl.STRUCTUREImpl <em>STRUCTURE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.types.impl.STRUCTUREImpl
		 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getSTRUCTURE()
		 * @generated
		 */
		EClass STRUCTURE = eINSTANCE.getSTRUCTURE();

		/**
		 * The meta object literal for the '<em><b>Contains Struct Var Decl</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE__CONTAINS_STRUCT_VAR_DECL = eINSTANCE.getSTRUCTURE_ContainsStructVarDecl();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.types.impl.POINTERImpl <em>POINTER</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.types.impl.POINTERImpl
		 * @see iec611313Specification.common.types.impl.TypesPackageImpl#getPOINTER()
		 * @generated
		 */
		EClass POINTER = eINSTANCE.getPOINTER();

		/**
		 * The meta object literal for the '<em><b>Has Derived Base Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINTER__HAS_DERIVED_BASE_TYPE = eINSTANCE.getPOINTER_HasDerivedBaseType();

	}

} //TypesPackage
