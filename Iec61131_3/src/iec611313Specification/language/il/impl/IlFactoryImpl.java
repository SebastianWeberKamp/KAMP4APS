/**
 */
package iec611313Specification.language.il.impl;

import iec611313Specification.language.il.*;

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
public class IlFactoryImpl extends EFactoryImpl implements IlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IlFactory init() {
		try {
			IlFactory theIlFactory = (IlFactory)EPackage.Registry.INSTANCE.getEFactory(IlPackage.eNS_URI);
			if (theIlFactory != null) {
				return theIlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IlFactoryImpl() {
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
			case IlPackage.COMPLEX_INSTRUCTION: return createComplexInstruction();
			case IlPackage.INSTRUCTION_LIST: return createInstructionList();
			case IlPackage.JUMP_INSTRUCTION: return createJumpInstruction();
			case IlPackage.RETURN_INSTRUCTION: return createReturnInstruction();
			case IlPackage.SIMPLE_INSTRUCTION: return createSimpleInstruction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexInstruction createComplexInstruction() {
		ComplexInstructionImpl complexInstruction = new ComplexInstructionImpl();
		return complexInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionList createInstructionList() {
		InstructionListImpl instructionList = new InstructionListImpl();
		return instructionList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JumpInstruction createJumpInstruction() {
		JumpInstructionImpl jumpInstruction = new JumpInstructionImpl();
		return jumpInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnInstruction createReturnInstruction() {
		ReturnInstructionImpl returnInstruction = new ReturnInstructionImpl();
		return returnInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleInstruction createSimpleInstruction() {
		SimpleInstructionImpl simpleInstruction = new SimpleInstructionImpl();
		return simpleInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IlPackage getIlPackage() {
		return (IlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IlPackage getPackage() {
		return IlPackage.eINSTANCE;
	}

} //IlFactoryImpl
