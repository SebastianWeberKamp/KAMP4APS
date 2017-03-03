/**
 */
package iec611313Specification.language.fbd.util;

import iec611313Specification.common.pous.function_blocks.FunctionBlockBodySpecification;

import iec611313Specification.common.pous.functions.FunctionBodySpecification;

import iec611313Specification.language.fbd.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see iec611313Specification.language.fbd.FbdPackage
 * @generated
 */
public class FbdAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FbdPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FbdAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FbdPackage.eINSTANCE;
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
	protected FbdSwitch<Adapter> modelSwitch =
		new FbdSwitch<Adapter>() {
			@Override
			public Adapter caseFBDElement(FBDElement object) {
				return createFBDElementAdapter();
			}
			@Override
			public Adapter caseFunctionBlockDiagram(FunctionBlockDiagram object) {
				return createFunctionBlockDiagramAdapter();
			}
			@Override
			public Adapter caseFunctionBlockNetwork(FunctionBlockNetwork object) {
				return createFunctionBlockNetworkAdapter();
			}
			@Override
			public Adapter caseSignalFlowLine(SignalFlowLine object) {
				return createSignalFlowLineAdapter();
			}
			@Override
			public Adapter caseSignalSink(SignalSink object) {
				return createSignalSinkAdapter();
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
	 * Creates a new adapter for an object of class '{@link iec611313Specification.language.fbd.FBDElement <em>FBD Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.language.fbd.FBDElement
	 * @generated
	 */
	public Adapter createFBDElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.language.fbd.FunctionBlockDiagram <em>Function Block Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.language.fbd.FunctionBlockDiagram
	 * @generated
	 */
	public Adapter createFunctionBlockDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.language.fbd.FunctionBlockNetwork <em>Function Block Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.language.fbd.FunctionBlockNetwork
	 * @generated
	 */
	public Adapter createFunctionBlockNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.language.fbd.SignalFlowLine <em>Signal Flow Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.language.fbd.SignalFlowLine
	 * @generated
	 */
	public Adapter createSignalFlowLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.language.fbd.SignalSink <em>Signal Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.language.fbd.SignalSink
	 * @generated
	 */
	public Adapter createSignalSinkAdapter() {
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

} //FbdAdapterFactory
