/**
 */
package iec611313Specification.language.fbd.impl;

import iec611313Specification.language.fbd.*;

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
public class FbdFactoryImpl extends EFactoryImpl implements FbdFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FbdFactory init() {
		try {
			FbdFactory theFbdFactory = (FbdFactory)EPackage.Registry.INSTANCE.getEFactory(FbdPackage.eNS_URI);
			if (theFbdFactory != null) {
				return theFbdFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FbdFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FbdFactoryImpl() {
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
			case FbdPackage.FUNCTION_BLOCK_DIAGRAM: return createFunctionBlockDiagram();
			case FbdPackage.FUNCTION_BLOCK_NETWORK: return createFunctionBlockNetwork();
			case FbdPackage.SIGNAL_FLOW_LINE: return createSignalFlowLine();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBlockDiagram createFunctionBlockDiagram() {
		FunctionBlockDiagramImpl functionBlockDiagram = new FunctionBlockDiagramImpl();
		return functionBlockDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBlockNetwork createFunctionBlockNetwork() {
		FunctionBlockNetworkImpl functionBlockNetwork = new FunctionBlockNetworkImpl();
		return functionBlockNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalFlowLine createSignalFlowLine() {
		SignalFlowLineImpl signalFlowLine = new SignalFlowLineImpl();
		return signalFlowLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FbdPackage getFbdPackage() {
		return (FbdPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FbdPackage getPackage() {
		return FbdPackage.eINSTANCE;
	}

} //FbdFactoryImpl
