/**
 */
package iec611313Specification.language.il.util;

import iec611313Specification.common.pous.function_blocks.FunctionBlockBodySpecification;

import iec611313Specification.common.pous.functions.FunctionBodySpecification;

import iec611313Specification.language.il.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see iec611313Specification.language.il.IlPackage
 * @generated
 */
public class IlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = IlPackage.eINSTANCE;
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
	protected IlSwitch<Adapter> modelSwitch =
		new IlSwitch<Adapter>() {
			@Override
			public Adapter caseComplexInstruction(ComplexInstruction object) {
				return createComplexInstructionAdapter();
			}
			@Override
			public Adapter caseInstruction(Instruction object) {
				return createInstructionAdapter();
			}
			@Override
			public Adapter caseInstructionList(InstructionList object) {
				return createInstructionListAdapter();
			}
			@Override
			public Adapter caseJumpInstruction(JumpInstruction object) {
				return createJumpInstructionAdapter();
			}
			@Override
			public Adapter caseReturnInstruction(ReturnInstruction object) {
				return createReturnInstructionAdapter();
			}
			@Override
			public Adapter caseSimpleInstruction(SimpleInstruction object) {
				return createSimpleInstructionAdapter();
			}
			@Override
			public Adapter caseFunctionBodySpecification(FunctionBodySpecification object) {
				return createFunctionBodySpecificationAdapter();
			}
			@Override
			public Adapter caseFunctionBlockBodySpecification(FunctionBlockBodySpecification object) {
				return createFunctionBlockBodySpecificationAdapter();
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
	 * Creates a new adapter for an object of class '{@link iec611313Specification.language.il.ComplexInstruction <em>Complex Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.language.il.ComplexInstruction
	 * @generated
	 */
	public Adapter createComplexInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.language.il.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.language.il.Instruction
	 * @generated
	 */
	public Adapter createInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.language.il.InstructionList <em>Instruction List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.language.il.InstructionList
	 * @generated
	 */
	public Adapter createInstructionListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.language.il.JumpInstruction <em>Jump Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.language.il.JumpInstruction
	 * @generated
	 */
	public Adapter createJumpInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.language.il.ReturnInstruction <em>Return Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.language.il.ReturnInstruction
	 * @generated
	 */
	public Adapter createReturnInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.language.il.SimpleInstruction <em>Simple Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.language.il.SimpleInstruction
	 * @generated
	 */
	public Adapter createSimpleInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.common.pous.functions.FunctionBodySpecification <em>Function Body Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.common.pous.functions.FunctionBodySpecification
	 * @generated
	 */
	public Adapter createFunctionBodySpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.common.pous.function_blocks.FunctionBlockBodySpecification <em>Function Block Body Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.common.pous.function_blocks.FunctionBlockBodySpecification
	 * @generated
	 */
	public Adapter createFunctionBlockBodySpecificationAdapter() {
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

} //IlAdapterFactory
