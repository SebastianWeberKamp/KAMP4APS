/**
 */
package iec611313Specification.common.types.util;

import iec611313Specification.common.types.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see iec611313Specification.common.types.TypesPackage
 * @generated
 */
public class TypesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TypesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesSwitch() {
		if (modelPackage == null) {
			modelPackage = TypesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TypesPackage.ANY: {
				ANY any = (ANY)theEObject;
				T result = caseANY(any);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ANY_ELEMENTARY: {
				ANY_ELEMENTARY anY_ELEMENTARY = (ANY_ELEMENTARY)theEObject;
				T result = caseANY_ELEMENTARY(anY_ELEMENTARY);
				if (result == null) result = caseANY(anY_ELEMENTARY);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ANY_DERIVED: {
				ANY_DERIVED anY_DERIVED = (ANY_DERIVED)theEObject;
				T result = caseANY_DERIVED(anY_DERIVED);
				if (result == null) result = caseANY(anY_DERIVED);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ANY_MAGNITUDE: {
				ANY_MAGNITUDE anY_MAGNITUDE = (ANY_MAGNITUDE)theEObject;
				T result = caseANY_MAGNITUDE(anY_MAGNITUDE);
				if (result == null) result = caseANY_ELEMENTARY(anY_MAGNITUDE);
				if (result == null) result = caseANY(anY_MAGNITUDE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ANY_DATE: {
				ANY_DATE anY_DATE = (ANY_DATE)theEObject;
				T result = caseANY_DATE(anY_DATE);
				if (result == null) result = caseANY_ELEMENTARY(anY_DATE);
				if (result == null) result = caseANY(anY_DATE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ANY_BIT: {
				ANY_BIT anY_BIT = (ANY_BIT)theEObject;
				T result = caseANY_BIT(anY_BIT);
				if (result == null) result = caseANY_ELEMENTARY(anY_BIT);
				if (result == null) result = caseANY(anY_BIT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ANY_STRING: {
				ANY_STRING anY_STRING = (ANY_STRING)theEObject;
				T result = caseANY_STRING(anY_STRING);
				if (result == null) result = caseANY_ELEMENTARY(anY_STRING);
				if (result == null) result = caseANY(anY_STRING);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.TIME: {
				TIME time = (TIME)theEObject;
				T result = caseTIME(time);
				if (result == null) result = caseANY_MAGNITUDE(time);
				if (result == null) result = caseANY_ELEMENTARY(time);
				if (result == null) result = caseANY(time);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ANY_NUM: {
				ANY_NUM anY_NUM = (ANY_NUM)theEObject;
				T result = caseANY_NUM(anY_NUM);
				if (result == null) result = caseANY_MAGNITUDE(anY_NUM);
				if (result == null) result = caseANY_ELEMENTARY(anY_NUM);
				if (result == null) result = caseANY(anY_NUM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ANY_REAL: {
				ANY_REAL anY_REAL = (ANY_REAL)theEObject;
				T result = caseANY_REAL(anY_REAL);
				if (result == null) result = caseANY_NUM(anY_REAL);
				if (result == null) result = caseANY_MAGNITUDE(anY_REAL);
				if (result == null) result = caseANY_ELEMENTARY(anY_REAL);
				if (result == null) result = caseANY(anY_REAL);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ANY_INT: {
				ANY_INT anY_INT = (ANY_INT)theEObject;
				T result = caseANY_INT(anY_INT);
				if (result == null) result = caseANY_NUM(anY_INT);
				if (result == null) result = caseANY_MAGNITUDE(anY_INT);
				if (result == null) result = caseANY_ELEMENTARY(anY_INT);
				if (result == null) result = caseANY(anY_INT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.REAL: {
				REAL real = (REAL)theEObject;
				T result = caseREAL(real);
				if (result == null) result = caseANY_REAL(real);
				if (result == null) result = caseANY_NUM(real);
				if (result == null) result = caseANY_MAGNITUDE(real);
				if (result == null) result = caseANY_ELEMENTARY(real);
				if (result == null) result = caseANY(real);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LREAL: {
				LREAL lreal = (LREAL)theEObject;
				T result = caseLREAL(lreal);
				if (result == null) result = caseANY_REAL(lreal);
				if (result == null) result = caseANY_NUM(lreal);
				if (result == null) result = caseANY_MAGNITUDE(lreal);
				if (result == null) result = caseANY_ELEMENTARY(lreal);
				if (result == null) result = caseANY(lreal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.SINT: {
				SINT sint = (SINT)theEObject;
				T result = caseSINT(sint);
				if (result == null) result = caseANY_INT(sint);
				if (result == null) result = caseANY_NUM(sint);
				if (result == null) result = caseANY_MAGNITUDE(sint);
				if (result == null) result = caseANY_ELEMENTARY(sint);
				if (result == null) result = caseANY(sint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.INT: {
				INT int_ = (INT)theEObject;
				T result = caseINT(int_);
				if (result == null) result = caseANY_INT(int_);
				if (result == null) result = caseANY_NUM(int_);
				if (result == null) result = caseANY_MAGNITUDE(int_);
				if (result == null) result = caseANY_ELEMENTARY(int_);
				if (result == null) result = caseANY(int_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.DINT: {
				DINT dint = (DINT)theEObject;
				T result = caseDINT(dint);
				if (result == null) result = caseANY_INT(dint);
				if (result == null) result = caseANY_NUM(dint);
				if (result == null) result = caseANY_MAGNITUDE(dint);
				if (result == null) result = caseANY_ELEMENTARY(dint);
				if (result == null) result = caseANY(dint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LINT: {
				LINT lint = (LINT)theEObject;
				T result = caseLINT(lint);
				if (result == null) result = caseANY_INT(lint);
				if (result == null) result = caseANY_NUM(lint);
				if (result == null) result = caseANY_MAGNITUDE(lint);
				if (result == null) result = caseANY_ELEMENTARY(lint);
				if (result == null) result = caseANY(lint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.USINT: {
				USINT usint = (USINT)theEObject;
				T result = caseUSINT(usint);
				if (result == null) result = caseANY_INT(usint);
				if (result == null) result = caseANY_NUM(usint);
				if (result == null) result = caseANY_MAGNITUDE(usint);
				if (result == null) result = caseANY_ELEMENTARY(usint);
				if (result == null) result = caseANY(usint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.UINT: {
				UINT uint = (UINT)theEObject;
				T result = caseUINT(uint);
				if (result == null) result = caseANY_INT(uint);
				if (result == null) result = caseANY_NUM(uint);
				if (result == null) result = caseANY_MAGNITUDE(uint);
				if (result == null) result = caseANY_ELEMENTARY(uint);
				if (result == null) result = caseANY(uint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.UDINT: {
				UDINT udint = (UDINT)theEObject;
				T result = caseUDINT(udint);
				if (result == null) result = caseANY_INT(udint);
				if (result == null) result = caseANY_NUM(udint);
				if (result == null) result = caseANY_MAGNITUDE(udint);
				if (result == null) result = caseANY_ELEMENTARY(udint);
				if (result == null) result = caseANY(udint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ULINT: {
				ULINT ulint = (ULINT)theEObject;
				T result = caseULINT(ulint);
				if (result == null) result = caseANY_INT(ulint);
				if (result == null) result = caseANY_NUM(ulint);
				if (result == null) result = caseANY_MAGNITUDE(ulint);
				if (result == null) result = caseANY_ELEMENTARY(ulint);
				if (result == null) result = caseANY(ulint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.DATE: {
				DATE date = (DATE)theEObject;
				T result = caseDATE(date);
				if (result == null) result = caseANY_DATE(date);
				if (result == null) result = caseANY_ELEMENTARY(date);
				if (result == null) result = caseANY(date);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.DATE_AND_TIME: {
				DATE_AND_TIME datE_AND_TIME = (DATE_AND_TIME)theEObject;
				T result = caseDATE_AND_TIME(datE_AND_TIME);
				if (result == null) result = caseANY_DATE(datE_AND_TIME);
				if (result == null) result = caseANY_ELEMENTARY(datE_AND_TIME);
				if (result == null) result = caseANY(datE_AND_TIME);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.TIME_OF_DAY: {
				TIME_OF_DAY timE_OF_DAY = (TIME_OF_DAY)theEObject;
				T result = caseTIME_OF_DAY(timE_OF_DAY);
				if (result == null) result = caseDATE(timE_OF_DAY);
				if (result == null) result = caseDATE_AND_TIME(timE_OF_DAY);
				if (result == null) result = caseANY_DATE(timE_OF_DAY);
				if (result == null) result = caseANY_ELEMENTARY(timE_OF_DAY);
				if (result == null) result = caseANY(timE_OF_DAY);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.BOOL: {
				BOOL bool = (BOOL)theEObject;
				T result = caseBOOL(bool);
				if (result == null) result = caseANY_BIT(bool);
				if (result == null) result = caseANY_ELEMENTARY(bool);
				if (result == null) result = caseANY(bool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.BYTE: {
				BYTE byte_ = (BYTE)theEObject;
				T result = caseBYTE(byte_);
				if (result == null) result = caseANY_BIT(byte_);
				if (result == null) result = caseANY_ELEMENTARY(byte_);
				if (result == null) result = caseANY(byte_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.WORD: {
				WORD word = (WORD)theEObject;
				T result = caseWORD(word);
				if (result == null) result = caseANY_BIT(word);
				if (result == null) result = caseANY_ELEMENTARY(word);
				if (result == null) result = caseANY(word);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.DWORD: {
				DWORD dword = (DWORD)theEObject;
				T result = caseDWORD(dword);
				if (result == null) result = caseANY_BIT(dword);
				if (result == null) result = caseANY_ELEMENTARY(dword);
				if (result == null) result = caseANY(dword);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LWORD: {
				LWORD lword = (LWORD)theEObject;
				T result = caseLWORD(lword);
				if (result == null) result = caseANY_BIT(lword);
				if (result == null) result = caseANY_ELEMENTARY(lword);
				if (result == null) result = caseANY(lword);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.STRING: {
				STRING string = (STRING)theEObject;
				T result = caseSTRING(string);
				if (result == null) result = caseANY_STRING(string);
				if (result == null) result = caseANY_ELEMENTARY(string);
				if (result == null) result = caseANY(string);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.WSTRING: {
				WSTRING wstring = (WSTRING)theEObject;
				T result = caseWSTRING(wstring);
				if (result == null) result = caseANY_STRING(wstring);
				if (result == null) result = caseANY_ELEMENTARY(wstring);
				if (result == null) result = caseANY(wstring);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ENUMERATION: {
				ENUMERATION enumeration = (ENUMERATION)theEObject;
				T result = caseENUMERATION(enumeration);
				if (result == null) result = caseANY_DERIVED(enumeration);
				if (result == null) result = caseANY(enumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.DERIVED: {
				DERIVED derived = (DERIVED)theEObject;
				T result = caseDERIVED(derived);
				if (result == null) result = caseANY_DERIVED(derived);
				if (result == null) result = caseANY(derived);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ARRAY: {
				ARRAY array = (ARRAY)theEObject;
				T result = caseARRAY(array);
				if (result == null) result = caseANY_DERIVED(array);
				if (result == null) result = caseANY(array);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.STRUCTURE: {
				STRUCTURE structure = (STRUCTURE)theEObject;
				T result = caseSTRUCTURE(structure);
				if (result == null) result = caseANY_DERIVED(structure);
				if (result == null) result = caseANY(structure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.POINTER: {
				POINTER pointer = (POINTER)theEObject;
				T result = casePOINTER(pointer);
				if (result == null) result = caseANY_DERIVED(pointer);
				if (result == null) result = caseANY(pointer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ANY</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ANY</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseANY(ANY object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ANY ELEMENTARY</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ANY ELEMENTARY</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseANY_ELEMENTARY(ANY_ELEMENTARY object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ANY DERIVED</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ANY DERIVED</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseANY_DERIVED(ANY_DERIVED object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ANY MAGNITUDE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ANY MAGNITUDE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseANY_MAGNITUDE(ANY_MAGNITUDE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ANY DATE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ANY DATE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseANY_DATE(ANY_DATE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ANY BIT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ANY BIT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseANY_BIT(ANY_BIT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ANY STRING</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ANY STRING</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseANY_STRING(ANY_STRING object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TIME</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TIME</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTIME(TIME object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ANY NUM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ANY NUM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseANY_NUM(ANY_NUM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ANY REAL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ANY REAL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseANY_REAL(ANY_REAL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ANY INT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ANY INT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseANY_INT(ANY_INT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>REAL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>REAL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseREAL(REAL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LREAL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LREAL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLREAL(LREAL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SINT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SINT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSINT(SINT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>INT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>INT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseINT(INT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DINT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DINT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDINT(DINT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LINT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LINT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLINT(LINT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>USINT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>USINT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUSINT(USINT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UINT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UINT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUINT(UINT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UDINT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UDINT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUDINT(UDINT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ULINT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ULINT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseULINT(ULINT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DATE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DATE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDATE(DATE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DATE AND TIME</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DATE AND TIME</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDATE_AND_TIME(DATE_AND_TIME object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TIME OF DAY</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TIME OF DAY</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTIME_OF_DAY(TIME_OF_DAY object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BOOL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BOOL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBOOL(BOOL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BYTE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BYTE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBYTE(BYTE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WORD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WORD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWORD(WORD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DWORD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DWORD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDWORD(DWORD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LWORD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LWORD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLWORD(LWORD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>STRING</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>STRING</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSTRING(STRING object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WSTRING</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WSTRING</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWSTRING(WSTRING object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ENUMERATION</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ENUMERATION</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseENUMERATION(ENUMERATION object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DERIVED</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DERIVED</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDERIVED(DERIVED object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ARRAY</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ARRAY</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseARRAY(ARRAY object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>STRUCTURE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>STRUCTURE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSTRUCTURE(STRUCTURE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>POINTER</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>POINTER</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePOINTER(POINTER object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TypesSwitch
