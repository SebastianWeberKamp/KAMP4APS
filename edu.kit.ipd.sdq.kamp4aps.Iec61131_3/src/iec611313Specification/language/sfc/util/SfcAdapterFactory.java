/**
 */
package iec611313Specification.language.sfc.util;

import iec611313Specification.common.pous.function_blocks.FunctionBlockBodySpecification;

import iec611313Specification.language.sfc.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see iec611313Specification.language.sfc.SfcPackage
 * @generated
 */
public class SfcAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SfcPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SfcAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SfcPackage.eINSTANCE;
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
	protected SfcSwitch<Adapter> modelSwitch =
		new SfcSwitch<Adapter>() {
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseActionAssociation(ActionAssociation object) {
				return createActionAssociationAdapter();
			}
			@Override
			public Adapter caseActionQualifier(ActionQualifier object) {
				return createActionQualifierAdapter();
			}
			@Override
			public Adapter caseSequentialFunctionChart(SequentialFunctionChart object) {
				return createSequentialFunctionChartAdapter();
			}
			@Override
			public Adapter caseSimpleActionQualifier(SimpleActionQualifier object) {
				return createSimpleActionQualifierAdapter();
			}
			@Override
			public Adapter caseSimpleQualifier(SimpleQualifier object) {
				return createSimpleQualifierAdapter();
			}
			@Override
			public Adapter caseStep(Step object) {
				return createStepAdapter();
			}
			@Override
			public Adapter caseTimedActionQualifier(TimedActionQualifier object) {
				return createTimedActionQualifierAdapter();
			}
			@Override
			public Adapter caseTransition(Transition object) {
				return createTransitionAdapter();
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
	 * Creates a new adapter for an object of class '{@link iec611313Specification.language.sfc.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.language.sfc.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.language.sfc.ActionAssociation <em>Action Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.language.sfc.ActionAssociation
	 * @generated
	 */
	public Adapter createActionAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.language.sfc.ActionQualifier <em>Action Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.language.sfc.ActionQualifier
	 * @generated
	 */
	public Adapter createActionQualifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.language.sfc.SequentialFunctionChart <em>Sequential Function Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.language.sfc.SequentialFunctionChart
	 * @generated
	 */
	public Adapter createSequentialFunctionChartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.language.sfc.SimpleActionQualifier <em>Simple Action Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.language.sfc.SimpleActionQualifier
	 * @generated
	 */
	public Adapter createSimpleActionQualifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.language.sfc.SimpleQualifier <em>Simple Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.language.sfc.SimpleQualifier
	 * @generated
	 */
	public Adapter createSimpleQualifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.language.sfc.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.language.sfc.Step
	 * @generated
	 */
	public Adapter createStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.language.sfc.TimedActionQualifier <em>Timed Action Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.language.sfc.TimedActionQualifier
	 * @generated
	 */
	public Adapter createTimedActionQualifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.language.sfc.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.language.sfc.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
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

} //SfcAdapterFactory
