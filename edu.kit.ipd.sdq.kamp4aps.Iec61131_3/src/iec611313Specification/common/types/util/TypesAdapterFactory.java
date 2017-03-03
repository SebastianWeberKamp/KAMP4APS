/**
 */
package iec611313Specification.common.types.util;

import iec611313Specification.common.types.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see iec611313Specification.common.types.TypesPackage
 * @generated
 */
public class TypesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TypesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TypesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypesSwitch<Adapter> modelSwitch =
		new TypesSwitch<Adapter>() {
			@Override
			public Adapter caseANY(ANY object) {
				return createANYAdapter();
			}
			@Override
			public Adapter caseANY_ELEMENTARY(ANY_ELEMENTARY object) {
				return createANY_ELEMENTARYAdapter();
			}
			@Override
			public Adapter caseANY_DERIVED(ANY_DERIVED object) {
				return createANY_DERIVEDAdapter();
			}
			@Override
			public Adapter caseANY_MAGNITUDE(ANY_MAGNITUDE object) {
				return createANY_MAGNITUDEAdapter();
			}
			@Override
			public Adapter caseANY_DATE(ANY_DATE object) {
				return createANY_DATEAdapter();
			}
			@Override
			public Adapter caseANY_BIT(ANY_BIT object) {
				return createANY_BITAdapter();
			}
			@Override
			public Adapter caseANY_STRING(ANY_STRING object) {
				return createANY_STRINGAdapter();
			}
			@Override
			public Adapter caseTIME(TIME object) {
				return createTIMEAdapter();
			}
			@Override
			public Adapter caseANY_NUM(ANY_NUM object) {
				return createANY_NUMAdapter();
			}
			@Override
			public Adapter caseANY_REAL(ANY_REAL object) {
				return createANY_REALAdapter();
			}
			@Override
			public Adapter caseANY_INT(ANY_INT object) {
				return createANY_INTAdapter();
			}
			@Override
			public Adapter caseREAL(REAL object) {
				return createREALAdapter();
			}
			@Override
			public Adapter caseLREAL(LREAL object) {
				return createLREALAdapter();
			}
			@Override
			public Adapter caseSINT(SINT object) {
				return createSINTAdapter();
			}
			@Override
			public Adapter caseINT(INT object) {
				return createINTAdapter();
			}
			@Override
			public Adapter caseDINT(DINT object) {
				return createDINTAdapter();
			}
			@Override
			public Adapter caseLINT(LINT object) {
				return createLINTAdapter();
			}
			@Override
			public Adapter caseUSINT(USINT object) {
				return createUSINTAdapter();
			}
			@Override
			public Adapter caseUINT(UINT object) {
				return createUINTAdapter();
			}
			@Override
			public Adapter caseUDINT(UDINT object) {
				return createUDINTAdapter();
			}
			@Override
			public Adapter caseULINT(ULINT object) {
				return createULINTAdapter();
			}
			@Override
			public Adapter caseDATE(DATE object) {
				return createDATEAdapter();
			}
			@Override
			public Adapter caseDATE_AND_TIME(DATE_AND_TIME object) {
				return createDATE_AND_TIMEAdapter();
			}
			@Override
			public Adapter caseTIME_OF_DAY(TIME_OF_DAY object) {
				return createTIME_OF_DAYAdapter();
			}
			@Override
			public Adapter caseBOOL(BOOL object) {
				return createBOOLAdapter();
			}
			@Override
			public Adapter caseBYTE(BYTE object) {
				return createBYTEAdapter();
			}
			@Override
			public Adapter caseWORD(WORD object) {
				return createWORDAdapter();
			}
			@Override
			public Adapter caseDWORD(DWORD object) {
				return createDWORDAdapter();
			}
			@Override
			public Adapter caseLWORD(LWORD object) {
				return createLWORDAdapter();
			}
			@Override
			public Adapter caseSTRING(STRING object) {
				return createSTRINGAdapter();
			}
			@Override
			public Adapter caseWSTRING(WSTRING object) {
				return createWSTRINGAdapter();
			}
			@Override
			public Adapter caseENUMERATION(ENUMERATION object) {
				return createENUMERATIONAdapter();
			}
			@Override
			public Adapter caseDERIVED(DERIVED object) {
				return createDERIVEDAdapter();
			}
			@Override
			public Adapter caseARRAY(ARRAY object) {
				return createARRAYAdapter();
			}
			@Override
			public Adapter caseSTRUCTURE(STRUCTURE object) {
				return createSTRUCTUREAdapter();
			}
			@Override
			public Adapter casePOINTER(POINTER object) {
				return createPOINTERAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.common.types.ANY <em>ANY</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.common.types.ANY
	 * @generated
	 */
	public Adapter createANYAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.common.types.ANY_ELEMENTARY <em>ANY ELEMENTARY</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.common.types.ANY_ELEMENTARY
	 * @generated
	 */
	public Adapter createANY_ELEMENTARYAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.common.types.ANY_DERIVED <em>ANY DERIVED</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.common.types.ANY_DERIVED
	 * @generated
	 */
	public Adapter createANY_DERIVEDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.common.types.ANY_MAGNITUDE <em>ANY MAGNITUDE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.common.types.ANY_MAGNITUDE
	 * @generated
	 */
	public Adapter createANY_MAGNITUDEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.common.types.ANY_DATE <em>ANY DATE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.common.types.ANY_DATE
	 * @generated
	 */
	public Adapter createANY_DATEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.common.types.ANY_BIT <em>ANY BIT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.common.types.ANY_BIT
	 * @generated
	 */
	public Adapter createANY_BITAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.common.types.ANY_STRING <em>ANY STRING</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.common.types.ANY_STRING
	 * @generated
	 */
	public Adapter createANY_STRINGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.common.types.TIME <em>TIME</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.common.types.TIME
	 * @generated
	 */
	public Adapter createTIMEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.common.types.ANY_NUM <em>ANY NUM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.common.types.ANY_NUM
	 * @generated
	 */
	public Adapter createANY_NUMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.common.types.ANY_REAL <em>ANY REAL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.common.types.ANY_REAL
	 * @generated
	 */
	public Adapter createANY_REALAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.common.types.ANY_INT <em>ANY INT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.common.types.ANY_INT
	 * @generated
	 */
	public Adapter createANY_INTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.common.types.REAL <em>REAL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.common.types.REAL
	 * @generated
	 */
	public Adapter createREALAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.common.types.LREAL <em>LREAL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.common.types.LREAL
	 * @generated
	 */
	public Adapter createLREALAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.common.types.SINT <em>SINT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.common.types.SINT
	 * @generated
	 */
	public Adapter createSINTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.common.types.INT <em>INT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.common.types.INT
	 * @generated
	 */
	public Adapter createINTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.common.types.DINT <em>DINT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.common.types.DINT
	 * @generated
	 */
	public Adapter createDINTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.common.types.LINT <em>LINT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.common.types.LINT
	 * @generated
	 */
	public Adapter createLINTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.common.types.USINT <em>USINT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.common.types.USINT
	 * @generated
	 */
	public Adapter createUSINTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.common.types.UINT <em>UINT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.common.types.UINT
	 * @generated
	 */
	public Adapter createUINTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.common.types.UDINT <em>UDINT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.common.types.UDINT
	 * @generated
	 */
	public Adapter createUDINTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.common.types.ULINT <em>ULINT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.common.types.ULINT
	 * @generated
	 */
	public Adapter createULINTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.common.types.DATE <em>DATE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.common.types.DATE
	 * @generated
	 */
	public Adapter createDATEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.common.types.DATE_AND_TIME <em>DATE AND TIME</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.common.types.DATE_AND_TIME
	 * @generated
	 */
	public Adapter createDATE_AND_TIMEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.common.types.TIME_OF_DAY <em>TIME OF DAY</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.common.types.TIME_OF_DAY
	 * @generated
	 */
	public Adapter createTIME_OF_DAYAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.common.types.BOOL <em>BOOL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.common.types.BOOL
	 * @generated
	 */
	public Adapter createBOOLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.common.types.BYTE <em>BYTE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.common.types.BYTE
	 * @generated
	 */
	public Adapter createBYTEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.common.types.WORD <em>WORD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.common.types.WORD
	 * @generated
	 */
	public Adapter createWORDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.common.types.DWORD <em>DWORD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.common.types.DWORD
	 * @generated
	 */
	public Adapter createDWORDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.common.types.LWORD <em>LWORD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.common.types.LWORD
	 * @generated
	 */
	public Adapter createLWORDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.common.types.STRING <em>STRING</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.common.types.STRING
	 * @generated
	 */
	public Adapter createSTRINGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.common.types.WSTRING <em>WSTRING</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.common.types.WSTRING
	 * @generated
	 */
	public Adapter createWSTRINGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.common.types.ENUMERATION <em>ENUMERATION</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.common.types.ENUMERATION
	 * @generated
	 */
	public Adapter createENUMERATIONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.common.types.DERIVED <em>DERIVED</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.common.types.DERIVED
	 * @generated
	 */
	public Adapter createDERIVEDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.common.types.ARRAY <em>ARRAY</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.common.types.ARRAY
	 * @generated
	 */
	public Adapter createARRAYAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.common.types.STRUCTURE <em>STRUCTURE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.common.types.STRUCTURE
	 * @generated
	 */
	public Adapter createSTRUCTUREAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.common.types.POINTER <em>POINTER</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.common.types.POINTER
	 * @generated
	 */
	public Adapter createPOINTERAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TypesAdapterFactory
