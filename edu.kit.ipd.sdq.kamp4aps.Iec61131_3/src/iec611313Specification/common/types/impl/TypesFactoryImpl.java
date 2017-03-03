/**
 */
package iec611313Specification.common.types.impl;

import iec611313Specification.common.types.*;

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
public class TypesFactoryImpl extends EFactoryImpl implements TypesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypesFactory init() {
		try {
			TypesFactory theTypesFactory = (TypesFactory)EPackage.Registry.INSTANCE.getEFactory(TypesPackage.eNS_URI);
			if (theTypesFactory != null) {
				return theTypesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TypesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesFactoryImpl() {
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
			case TypesPackage.TIME: return createTIME();
			case TypesPackage.REAL: return createREAL();
			case TypesPackage.LREAL: return createLREAL();
			case TypesPackage.SINT: return createSINT();
			case TypesPackage.INT: return createINT();
			case TypesPackage.DINT: return createDINT();
			case TypesPackage.LINT: return createLINT();
			case TypesPackage.USINT: return createUSINT();
			case TypesPackage.UINT: return createUINT();
			case TypesPackage.UDINT: return createUDINT();
			case TypesPackage.ULINT: return createULINT();
			case TypesPackage.DATE: return createDATE();
			case TypesPackage.DATE_AND_TIME: return createDATE_AND_TIME();
			case TypesPackage.TIME_OF_DAY: return createTIME_OF_DAY();
			case TypesPackage.BOOL: return createBOOL();
			case TypesPackage.BYTE: return createBYTE();
			case TypesPackage.WORD: return createWORD();
			case TypesPackage.DWORD: return createDWORD();
			case TypesPackage.LWORD: return createLWORD();
			case TypesPackage.STRING: return createSTRING();
			case TypesPackage.WSTRING: return createWSTRING();
			case TypesPackage.ENUMERATION: return createENUMERATION();
			case TypesPackage.DERIVED: return createDERIVED();
			case TypesPackage.ARRAY: return createARRAY();
			case TypesPackage.STRUCTURE: return createSTRUCTURE();
			case TypesPackage.POINTER: return createPOINTER();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TIME createTIME() {
		TIMEImpl time = new TIMEImpl();
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REAL createREAL() {
		REALImpl real = new REALImpl();
		return real;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LREAL createLREAL() {
		LREALImpl lreal = new LREALImpl();
		return lreal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SINT createSINT() {
		SINTImpl sint = new SINTImpl();
		return sint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INT createINT() {
		INTImpl int_ = new INTImpl();
		return int_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DINT createDINT() {
		DINTImpl dint = new DINTImpl();
		return dint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LINT createLINT() {
		LINTImpl lint = new LINTImpl();
		return lint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public USINT createUSINT() {
		USINTImpl usint = new USINTImpl();
		return usint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UINT createUINT() {
		UINTImpl uint = new UINTImpl();
		return uint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UDINT createUDINT() {
		UDINTImpl udint = new UDINTImpl();
		return udint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ULINT createULINT() {
		ULINTImpl ulint = new ULINTImpl();
		return ulint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DATE createDATE() {
		DATEImpl date = new DATEImpl();
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DATE_AND_TIME createDATE_AND_TIME() {
		DATE_AND_TIMEImpl datE_AND_TIME = new DATE_AND_TIMEImpl();
		return datE_AND_TIME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TIME_OF_DAY createTIME_OF_DAY() {
		TIME_OF_DAYImpl timE_OF_DAY = new TIME_OF_DAYImpl();
		return timE_OF_DAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BOOL createBOOL() {
		BOOLImpl bool = new BOOLImpl();
		return bool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BYTE createBYTE() {
		BYTEImpl byte_ = new BYTEImpl();
		return byte_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WORD createWORD() {
		WORDImpl word = new WORDImpl();
		return word;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DWORD createDWORD() {
		DWORDImpl dword = new DWORDImpl();
		return dword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LWORD createLWORD() {
		LWORDImpl lword = new LWORDImpl();
		return lword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STRING createSTRING() {
		STRINGImpl string = new STRINGImpl();
		return string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WSTRING createWSTRING() {
		WSTRINGImpl wstring = new WSTRINGImpl();
		return wstring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMERATION createENUMERATION() {
		ENUMERATIONImpl enumeration = new ENUMERATIONImpl();
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DERIVED createDERIVED() {
		DERIVEDImpl derived = new DERIVEDImpl();
		return derived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARRAY createARRAY() {
		ARRAYImpl array = new ARRAYImpl();
		return array;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STRUCTURE createSTRUCTURE() {
		STRUCTUREImpl structure = new STRUCTUREImpl();
		return structure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public POINTER createPOINTER() {
		POINTERImpl pointer = new POINTERImpl();
		return pointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesPackage getTypesPackage() {
		return (TypesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TypesPackage getPackage() {
		return TypesPackage.eINSTANCE;
	}

} //TypesFactoryImpl
