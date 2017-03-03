/**
 */
package iec611313Specification.language.fbd;

import iec611313Specification.common.pous.functions.FunctionsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see iec611313Specification.language.fbd.FbdFactory
 * @model kind="package"
 * @generated
 */
public interface FbdPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fbd";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.kit.edu/iec611313/language/fbd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fbd";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FbdPackage eINSTANCE = iec611313Specification.language.fbd.impl.FbdPackageImpl.init();

	/**
	 * The meta object id for the '{@link iec611313Specification.language.fbd.impl.FBDElementImpl <em>FBD Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.language.fbd.impl.FBDElementImpl
	 * @see iec611313Specification.language.fbd.impl.FbdPackageImpl#getFBDElement()
	 * @generated
	 */
	int FBD_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>FBD Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FBD_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>FBD Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FBD_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.language.fbd.impl.FunctionBlockDiagramImpl <em>Function Block Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.language.fbd.impl.FunctionBlockDiagramImpl
	 * @see iec611313Specification.language.fbd.impl.FbdPackageImpl#getFunctionBlockDiagram()
	 * @generated
	 */
	int FUNCTION_BLOCK_DIAGRAM = 1;

	/**
	 * The feature id for the '<em><b>Contains FBD Network</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_DIAGRAM__CONTAINS_FBD_NETWORK = FunctionsPackage.FUNCTION_BODY_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Function Block Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_DIAGRAM_FEATURE_COUNT = FunctionsPackage.FUNCTION_BODY_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Function Block Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_DIAGRAM_OPERATION_COUNT = FunctionsPackage.FUNCTION_BODY_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.language.fbd.impl.FunctionBlockNetworkImpl <em>Function Block Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.language.fbd.impl.FunctionBlockNetworkImpl
	 * @see iec611313Specification.language.fbd.impl.FbdPackageImpl#getFunctionBlockNetwork()
	 * @generated
	 */
	int FUNCTION_BLOCK_NETWORK = 2;

	/**
	 * The feature id for the '<em><b>Has FBD Network Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_NETWORK__HAS_FBD_NETWORK_LABEL = 0;

	/**
	 * The feature id for the '<em><b>Contains FBD Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_NETWORK__CONTAINS_FBD_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Contains Signal Flow Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_NETWORK__CONTAINS_SIGNAL_FLOW_LINE = 2;

	/**
	 * The number of structural features of the '<em>Function Block Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_NETWORK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Function Block Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_NETWORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.language.fbd.impl.SignalFlowLineImpl <em>Signal Flow Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.language.fbd.impl.SignalFlowLineImpl
	 * @see iec611313Specification.language.fbd.impl.FbdPackageImpl#getSignalFlowLine()
	 * @generated
	 */
	int SIGNAL_FLOW_LINE = 3;

	/**
	 * The feature id for the '<em><b>Has Signal Sink</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FLOW_LINE__HAS_SIGNAL_SINK = 0;

	/**
	 * The feature id for the '<em><b>Has Signal Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FLOW_LINE__HAS_SIGNAL_SOURCE = 1;

	/**
	 * The number of structural features of the '<em>Signal Flow Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FLOW_LINE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Signal Flow Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FLOW_LINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.language.fbd.impl.SignalSinkImpl <em>Signal Sink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.language.fbd.impl.SignalSinkImpl
	 * @see iec611313Specification.language.fbd.impl.FbdPackageImpl#getSignalSink()
	 * @generated
	 */
	int SIGNAL_SINK = 4;

	/**
	 * The number of structural features of the '<em>Signal Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_SINK_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Signal Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_SINK_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link iec611313Specification.language.fbd.FBDElement <em>FBD Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FBD Element</em>'.
	 * @see iec611313Specification.language.fbd.FBDElement
	 * @generated
	 */
	EClass getFBDElement();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.language.fbd.FunctionBlockDiagram <em>Function Block Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Block Diagram</em>'.
	 * @see iec611313Specification.language.fbd.FunctionBlockDiagram
	 * @generated
	 */
	EClass getFunctionBlockDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link iec611313Specification.language.fbd.FunctionBlockDiagram#getContainsFBDNetwork <em>Contains FBD Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains FBD Network</em>'.
	 * @see iec611313Specification.language.fbd.FunctionBlockDiagram#getContainsFBDNetwork()
	 * @see #getFunctionBlockDiagram()
	 * @generated
	 */
	EReference getFunctionBlockDiagram_ContainsFBDNetwork();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.language.fbd.FunctionBlockNetwork <em>Function Block Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Block Network</em>'.
	 * @see iec611313Specification.language.fbd.FunctionBlockNetwork
	 * @generated
	 */
	EClass getFunctionBlockNetwork();

	/**
	 * Returns the meta object for the reference '{@link iec611313Specification.language.fbd.FunctionBlockNetwork#getHasFBDNetworkLabel <em>Has FBD Network Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has FBD Network Label</em>'.
	 * @see iec611313Specification.language.fbd.FunctionBlockNetwork#getHasFBDNetworkLabel()
	 * @see #getFunctionBlockNetwork()
	 * @generated
	 */
	EReference getFunctionBlockNetwork_HasFBDNetworkLabel();

	/**
	 * Returns the meta object for the containment reference list '{@link iec611313Specification.language.fbd.FunctionBlockNetwork#getContainsFBDElement <em>Contains FBD Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains FBD Element</em>'.
	 * @see iec611313Specification.language.fbd.FunctionBlockNetwork#getContainsFBDElement()
	 * @see #getFunctionBlockNetwork()
	 * @generated
	 */
	EReference getFunctionBlockNetwork_ContainsFBDElement();

	/**
	 * Returns the meta object for the containment reference list '{@link iec611313Specification.language.fbd.FunctionBlockNetwork#getContainsSignalFlowLine <em>Contains Signal Flow Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Signal Flow Line</em>'.
	 * @see iec611313Specification.language.fbd.FunctionBlockNetwork#getContainsSignalFlowLine()
	 * @see #getFunctionBlockNetwork()
	 * @generated
	 */
	EReference getFunctionBlockNetwork_ContainsSignalFlowLine();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.language.fbd.SignalFlowLine <em>Signal Flow Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Flow Line</em>'.
	 * @see iec611313Specification.language.fbd.SignalFlowLine
	 * @generated
	 */
	EClass getSignalFlowLine();

	/**
	 * Returns the meta object for the reference list '{@link iec611313Specification.language.fbd.SignalFlowLine#getHasSignalSink <em>Has Signal Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Signal Sink</em>'.
	 * @see iec611313Specification.language.fbd.SignalFlowLine#getHasSignalSink()
	 * @see #getSignalFlowLine()
	 * @generated
	 */
	EReference getSignalFlowLine_HasSignalSink();

	/**
	 * Returns the meta object for the reference '{@link iec611313Specification.language.fbd.SignalFlowLine#getHasSignalSource <em>Has Signal Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Signal Source</em>'.
	 * @see iec611313Specification.language.fbd.SignalFlowLine#getHasSignalSource()
	 * @see #getSignalFlowLine()
	 * @generated
	 */
	EReference getSignalFlowLine_HasSignalSource();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.language.fbd.SignalSink <em>Signal Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Sink</em>'.
	 * @see iec611313Specification.language.fbd.SignalSink
	 * @generated
	 */
	EClass getSignalSink();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FbdFactory getFbdFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link iec611313Specification.language.fbd.impl.FBDElementImpl <em>FBD Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.language.fbd.impl.FBDElementImpl
		 * @see iec611313Specification.language.fbd.impl.FbdPackageImpl#getFBDElement()
		 * @generated
		 */
		EClass FBD_ELEMENT = eINSTANCE.getFBDElement();

		/**
		 * The meta object literal for the '{@link iec611313Specification.language.fbd.impl.FunctionBlockDiagramImpl <em>Function Block Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.language.fbd.impl.FunctionBlockDiagramImpl
		 * @see iec611313Specification.language.fbd.impl.FbdPackageImpl#getFunctionBlockDiagram()
		 * @generated
		 */
		EClass FUNCTION_BLOCK_DIAGRAM = eINSTANCE.getFunctionBlockDiagram();

		/**
		 * The meta object literal for the '<em><b>Contains FBD Network</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK_DIAGRAM__CONTAINS_FBD_NETWORK = eINSTANCE.getFunctionBlockDiagram_ContainsFBDNetwork();

		/**
		 * The meta object literal for the '{@link iec611313Specification.language.fbd.impl.FunctionBlockNetworkImpl <em>Function Block Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.language.fbd.impl.FunctionBlockNetworkImpl
		 * @see iec611313Specification.language.fbd.impl.FbdPackageImpl#getFunctionBlockNetwork()
		 * @generated
		 */
		EClass FUNCTION_BLOCK_NETWORK = eINSTANCE.getFunctionBlockNetwork();

		/**
		 * The meta object literal for the '<em><b>Has FBD Network Label</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK_NETWORK__HAS_FBD_NETWORK_LABEL = eINSTANCE.getFunctionBlockNetwork_HasFBDNetworkLabel();

		/**
		 * The meta object literal for the '<em><b>Contains FBD Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK_NETWORK__CONTAINS_FBD_ELEMENT = eINSTANCE.getFunctionBlockNetwork_ContainsFBDElement();

		/**
		 * The meta object literal for the '<em><b>Contains Signal Flow Line</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK_NETWORK__CONTAINS_SIGNAL_FLOW_LINE = eINSTANCE.getFunctionBlockNetwork_ContainsSignalFlowLine();

		/**
		 * The meta object literal for the '{@link iec611313Specification.language.fbd.impl.SignalFlowLineImpl <em>Signal Flow Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.language.fbd.impl.SignalFlowLineImpl
		 * @see iec611313Specification.language.fbd.impl.FbdPackageImpl#getSignalFlowLine()
		 * @generated
		 */
		EClass SIGNAL_FLOW_LINE = eINSTANCE.getSignalFlowLine();

		/**
		 * The meta object literal for the '<em><b>Has Signal Sink</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_FLOW_LINE__HAS_SIGNAL_SINK = eINSTANCE.getSignalFlowLine_HasSignalSink();

		/**
		 * The meta object literal for the '<em><b>Has Signal Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_FLOW_LINE__HAS_SIGNAL_SOURCE = eINSTANCE.getSignalFlowLine_HasSignalSource();

		/**
		 * The meta object literal for the '{@link iec611313Specification.language.fbd.impl.SignalSinkImpl <em>Signal Sink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.language.fbd.impl.SignalSinkImpl
		 * @see iec611313Specification.language.fbd.impl.FbdPackageImpl#getSignalSink()
		 * @generated
		 */
		EClass SIGNAL_SINK = eINSTANCE.getSignalSink();

	}

} //FbdPackage
