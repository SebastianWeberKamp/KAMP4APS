/**
 */
package iec611313Specification.common.pous.function_blocks.impl;

import iec611313Specification.common.pous.function_blocks.*;

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
public class Function_blocksFactoryImpl extends EFactoryImpl implements Function_blocksFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Function_blocksFactory init() {
		try {
			Function_blocksFactory theFunction_blocksFactory = (Function_blocksFactory)EPackage.Registry.INSTANCE.getEFactory(Function_blocksPackage.eNS_URI);
			if (theFunction_blocksFactory != null) {
				return theFunction_blocksFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Function_blocksFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function_blocksFactoryImpl() {
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
			case Function_blocksPackage.FUNCTION_BLOCK_INVOCATION: return createFunctionBlockInvocation();
			case Function_blocksPackage.FUNCTION_BLOCK_TYPE: return createFunctionBlockType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBlockInvocation createFunctionBlockInvocation() {
		FunctionBlockInvocationImpl functionBlockInvocation = new FunctionBlockInvocationImpl();
		return functionBlockInvocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBlockType createFunctionBlockType() {
		FunctionBlockTypeImpl functionBlockType = new FunctionBlockTypeImpl();
		return functionBlockType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function_blocksPackage getFunction_blocksPackage() {
		return (Function_blocksPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Function_blocksPackage getPackage() {
		return Function_blocksPackage.eINSTANCE;
	}

} //Function_blocksFactoryImpl
