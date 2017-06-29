/**
 */
package apsNewModel.util;

import apsNewModel.ApsNewModelPackage;
import apsNewModel.Function;
import apsNewModel.FunctionBlock;
import apsNewModel.GlobalVariable;
import apsNewModel.IECInterface;
import apsNewModel.IECMethodImplementation;
import apsNewModel.IECPropertyImplementation;
import apsNewModel.IFunctionBlock;
import apsNewModel.Program;
import apsNewModel.SPSSystem;
import apsNewModel.StaticFunctionblock;

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
 * @see apsNewModel.ApsNewModelPackage
 * @generated
 */
public class ApsNewModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ApsNewModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApsNewModelSwitch() {
		if (modelPackage == null) {
			modelPackage = ApsNewModelPackage.eINSTANCE;
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
			case ApsNewModelPackage.FUNCTION_BLOCK: {
				FunctionBlock functionBlock = (FunctionBlock)theEObject;
				T result = caseFunctionBlock(functionBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApsNewModelPackage.FUNCTION: {
				Function function = (Function)theEObject;
				T result = caseFunction(function);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApsNewModelPackage.PROGRAM: {
				Program program = (Program)theEObject;
				T result = caseProgram(program);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApsNewModelPackage.SPS_SYSTEM: {
				SPSSystem spsSystem = (SPSSystem)theEObject;
				T result = caseSPSSystem(spsSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApsNewModelPackage.IEC_INTERFACE: {
				IECInterface iecInterface = (IECInterface)theEObject;
				T result = caseIECInterface(iecInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApsNewModelPackage.GLOBAL_VARIABLE: {
				GlobalVariable globalVariable = (GlobalVariable)theEObject;
				T result = caseGlobalVariable(globalVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApsNewModelPackage.STATIC_FUNCTIONBLOCK: {
				StaticFunctionblock staticFunctionblock = (StaticFunctionblock)theEObject;
				T result = caseStaticFunctionblock(staticFunctionblock);
				if (result == null) result = caseIFunctionBlock(staticFunctionblock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApsNewModelPackage.IFUNCTION_BLOCK: {
				IFunctionBlock iFunctionBlock = (IFunctionBlock)theEObject;
				T result = caseIFunctionBlock(iFunctionBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApsNewModelPackage.IEC_METHOD_IMPLEMENTATION: {
				IECMethodImplementation iecMethodImplementation = (IECMethodImplementation)theEObject;
				T result = caseIECMethodImplementation(iecMethodImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApsNewModelPackage.IEC_PROPERTY_IMPLEMENTATION: {
				IECPropertyImplementation iecPropertyImplementation = (IECPropertyImplementation)theEObject;
				T result = caseIECPropertyImplementation(iecPropertyImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApsNewModelPackage.ENUM: {
				apsNewModel.Enum enum_ = (apsNewModel.Enum)theEObject;
				T result = caseEnum(enum_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionBlock(FunctionBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunction(Function object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Program</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Program</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgram(Program object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SPS System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SPS System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSPSSystem(SPSSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIECInterface(IECInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalVariable(GlobalVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Functionblock</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Functionblock</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticFunctionblock(StaticFunctionblock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IFunction Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IFunction Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIFunctionBlock(IFunctionBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC Method Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC Method Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIECMethodImplementation(IECMethodImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC Property Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC Property Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIECPropertyImplementation(IECPropertyImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnum(apsNewModel.Enum object) {
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

} //ApsNewModelSwitch
