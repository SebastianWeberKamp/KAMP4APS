/**
 */
package iec611313Specification.language.ld;

import iec611313Specification.common.pous.functions.FunctionsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see iec611313Specification.language.ld.LdFactory
 * @model kind="package"
 * @generated
 */
public interface LdPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ld";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.kit.edu/iec611313/language/ld";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ld";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LdPackage eINSTANCE = iec611313Specification.language.ld.impl.LdPackageImpl.init();

	/**
	 * The meta object id for the '{@link iec611313Specification.language.ld.impl.LDElementImpl <em>LD Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.language.ld.impl.LDElementImpl
	 * @see iec611313Specification.language.ld.impl.LdPackageImpl#getLDElement()
	 * @generated
	 */
	int LD_ELEMENT = 4;

	/**
	 * The number of structural features of the '<em>LD Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LD_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>LD Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LD_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.language.ld.impl.LDNodeImpl <em>LD Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.language.ld.impl.LDNodeImpl
	 * @see iec611313Specification.language.ld.impl.LdPackageImpl#getLDNode()
	 * @generated
	 */
	int LD_NODE = 5;

	/**
	 * The feature id for the '<em><b>Has LD Node Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LD_NODE__HAS_LD_NODE_VARIABLE = LD_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>LD Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LD_NODE_FEATURE_COUNT = LD_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>LD Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LD_NODE_OPERATION_COUNT = LD_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.language.ld.impl.CoilImpl <em>Coil</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.language.ld.impl.CoilImpl
	 * @see iec611313Specification.language.ld.impl.LdPackageImpl#getCoil()
	 * @generated
	 */
	int COIL = 0;

	/**
	 * The feature id for the '<em><b>Has LD Node Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COIL__HAS_LD_NODE_VARIABLE = LD_NODE__HAS_LD_NODE_VARIABLE;

	/**
	 * The feature id for the '<em><b>Coil Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COIL__COIL_TYPE = LD_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Coil</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COIL_FEATURE_COUNT = LD_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Coil</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COIL_OPERATION_COUNT = LD_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.language.ld.impl.ContactImpl <em>Contact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.language.ld.impl.ContactImpl
	 * @see iec611313Specification.language.ld.impl.LdPackageImpl#getContact()
	 * @generated
	 */
	int CONTACT = 1;

	/**
	 * The feature id for the '<em><b>Has LD Node Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__HAS_LD_NODE_VARIABLE = LD_NODE__HAS_LD_NODE_VARIABLE;

	/**
	 * The feature id for the '<em><b>Contact Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__CONTACT_TYPE = LD_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Contact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_FEATURE_COUNT = LD_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Contact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_OPERATION_COUNT = LD_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.language.ld.impl.LadderDiagramImpl <em>Ladder Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.language.ld.impl.LadderDiagramImpl
	 * @see iec611313Specification.language.ld.impl.LdPackageImpl#getLadderDiagram()
	 * @generated
	 */
	int LADDER_DIAGRAM = 2;

	/**
	 * The feature id for the '<em><b>Contains Ladder Network</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LADDER_DIAGRAM__CONTAINS_LADDER_NETWORK = FunctionsPackage.FUNCTION_BODY_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ladder Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LADDER_DIAGRAM_FEATURE_COUNT = FunctionsPackage.FUNCTION_BODY_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ladder Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LADDER_DIAGRAM_OPERATION_COUNT = FunctionsPackage.FUNCTION_BODY_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.language.ld.impl.LadderNetworkImpl <em>Ladder Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.language.ld.impl.LadderNetworkImpl
	 * @see iec611313Specification.language.ld.impl.LdPackageImpl#getLadderNetwork()
	 * @generated
	 */
	int LADDER_NETWORK = 3;

	/**
	 * The feature id for the '<em><b>Has LD Network Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LADDER_NETWORK__HAS_LD_NETWORK_LABEL = 0;

	/**
	 * The feature id for the '<em><b>Contains Power Flow Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LADDER_NETWORK__CONTAINS_POWER_FLOW_LINE = 1;

	/**
	 * The feature id for the '<em><b>Contains LD Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LADDER_NETWORK__CONTAINS_LD_ELEMENT = 2;

	/**
	 * The number of structural features of the '<em>Ladder Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LADDER_NETWORK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Ladder Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LADDER_NETWORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.language.ld.impl.PowerFlowLineImpl <em>Power Flow Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.language.ld.impl.PowerFlowLineImpl
	 * @see iec611313Specification.language.ld.impl.LdPackageImpl#getPowerFlowLine()
	 * @generated
	 */
	int POWER_FLOW_LINE = 6;

	/**
	 * The feature id for the '<em><b>Has Power Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_FLOW_LINE__HAS_POWER_SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Has Power Sink</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_FLOW_LINE__HAS_POWER_SINK = 1;

	/**
	 * The number of structural features of the '<em>Power Flow Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_FLOW_LINE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Power Flow Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_FLOW_LINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.language.ld.impl.PowerRailImpl <em>Power Rail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.language.ld.impl.PowerRailImpl
	 * @see iec611313Specification.language.ld.impl.LdPackageImpl#getPowerRail()
	 * @generated
	 */
	int POWER_RAIL = 7;

	/**
	 * The feature id for the '<em><b>Has Left Power Rail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_RAIL__HAS_LEFT_POWER_RAIL = LD_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Right Power Rail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_RAIL__HAS_RIGHT_POWER_RAIL = LD_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Power Rail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_RAIL_FEATURE_COUNT = LD_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Power Rail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_RAIL_OPERATION_COUNT = LD_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.language.ld.ContactType <em>Contact Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.language.ld.ContactType
	 * @see iec611313Specification.language.ld.impl.LdPackageImpl#getContactType()
	 * @generated
	 */
	int CONTACT_TYPE = 8;

	/**
	 * The meta object id for the '{@link iec611313Specification.language.ld.CoilType <em>Coil Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.language.ld.CoilType
	 * @see iec611313Specification.language.ld.impl.LdPackageImpl#getCoilType()
	 * @generated
	 */
	int COIL_TYPE = 9;


	/**
	 * Returns the meta object for class '{@link iec611313Specification.language.ld.Coil <em>Coil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coil</em>'.
	 * @see iec611313Specification.language.ld.Coil
	 * @generated
	 */
	EClass getCoil();

	/**
	 * Returns the meta object for the attribute '{@link iec611313Specification.language.ld.Coil#getCoilType <em>Coil Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coil Type</em>'.
	 * @see iec611313Specification.language.ld.Coil#getCoilType()
	 * @see #getCoil()
	 * @generated
	 */
	EAttribute getCoil_CoilType();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.language.ld.Contact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact</em>'.
	 * @see iec611313Specification.language.ld.Contact
	 * @generated
	 */
	EClass getContact();

	/**
	 * Returns the meta object for the attribute '{@link iec611313Specification.language.ld.Contact#getContactType <em>Contact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Type</em>'.
	 * @see iec611313Specification.language.ld.Contact#getContactType()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_ContactType();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.language.ld.LadderDiagram <em>Ladder Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ladder Diagram</em>'.
	 * @see iec611313Specification.language.ld.LadderDiagram
	 * @generated
	 */
	EClass getLadderDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link iec611313Specification.language.ld.LadderDiagram#getContainsLadderNetwork <em>Contains Ladder Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Ladder Network</em>'.
	 * @see iec611313Specification.language.ld.LadderDiagram#getContainsLadderNetwork()
	 * @see #getLadderDiagram()
	 * @generated
	 */
	EReference getLadderDiagram_ContainsLadderNetwork();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.language.ld.LadderNetwork <em>Ladder Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ladder Network</em>'.
	 * @see iec611313Specification.language.ld.LadderNetwork
	 * @generated
	 */
	EClass getLadderNetwork();

	/**
	 * Returns the meta object for the reference '{@link iec611313Specification.language.ld.LadderNetwork#getHasLDNetworkLabel <em>Has LD Network Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has LD Network Label</em>'.
	 * @see iec611313Specification.language.ld.LadderNetwork#getHasLDNetworkLabel()
	 * @see #getLadderNetwork()
	 * @generated
	 */
	EReference getLadderNetwork_HasLDNetworkLabel();

	/**
	 * Returns the meta object for the containment reference list '{@link iec611313Specification.language.ld.LadderNetwork#getContainsPowerFlowLine <em>Contains Power Flow Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Power Flow Line</em>'.
	 * @see iec611313Specification.language.ld.LadderNetwork#getContainsPowerFlowLine()
	 * @see #getLadderNetwork()
	 * @generated
	 */
	EReference getLadderNetwork_ContainsPowerFlowLine();

	/**
	 * Returns the meta object for the containment reference list '{@link iec611313Specification.language.ld.LadderNetwork#getContainsLDElement <em>Contains LD Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains LD Element</em>'.
	 * @see iec611313Specification.language.ld.LadderNetwork#getContainsLDElement()
	 * @see #getLadderNetwork()
	 * @generated
	 */
	EReference getLadderNetwork_ContainsLDElement();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.language.ld.LDElement <em>LD Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LD Element</em>'.
	 * @see iec611313Specification.language.ld.LDElement
	 * @generated
	 */
	EClass getLDElement();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.language.ld.LDNode <em>LD Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LD Node</em>'.
	 * @see iec611313Specification.language.ld.LDNode
	 * @generated
	 */
	EClass getLDNode();

	/**
	 * Returns the meta object for the reference '{@link iec611313Specification.language.ld.LDNode#getHasLDNodeVariable <em>Has LD Node Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has LD Node Variable</em>'.
	 * @see iec611313Specification.language.ld.LDNode#getHasLDNodeVariable()
	 * @see #getLDNode()
	 * @generated
	 */
	EReference getLDNode_HasLDNodeVariable();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.language.ld.PowerFlowLine <em>Power Flow Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Flow Line</em>'.
	 * @see iec611313Specification.language.ld.PowerFlowLine
	 * @generated
	 */
	EClass getPowerFlowLine();

	/**
	 * Returns the meta object for the reference list '{@link iec611313Specification.language.ld.PowerFlowLine#getHasPowerSource <em>Has Power Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Power Source</em>'.
	 * @see iec611313Specification.language.ld.PowerFlowLine#getHasPowerSource()
	 * @see #getPowerFlowLine()
	 * @generated
	 */
	EReference getPowerFlowLine_HasPowerSource();

	/**
	 * Returns the meta object for the reference list '{@link iec611313Specification.language.ld.PowerFlowLine#getHasPowerSink <em>Has Power Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Power Sink</em>'.
	 * @see iec611313Specification.language.ld.PowerFlowLine#getHasPowerSink()
	 * @see #getPowerFlowLine()
	 * @generated
	 */
	EReference getPowerFlowLine_HasPowerSink();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.language.ld.PowerRail <em>Power Rail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Rail</em>'.
	 * @see iec611313Specification.language.ld.PowerRail
	 * @generated
	 */
	EClass getPowerRail();

	/**
	 * Returns the meta object for the reference '{@link iec611313Specification.language.ld.PowerRail#getHasLeftPowerRail <em>Has Left Power Rail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Left Power Rail</em>'.
	 * @see iec611313Specification.language.ld.PowerRail#getHasLeftPowerRail()
	 * @see #getPowerRail()
	 * @generated
	 */
	EReference getPowerRail_HasLeftPowerRail();

	/**
	 * Returns the meta object for the reference '{@link iec611313Specification.language.ld.PowerRail#getHasRightPowerRail <em>Has Right Power Rail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Right Power Rail</em>'.
	 * @see iec611313Specification.language.ld.PowerRail#getHasRightPowerRail()
	 * @see #getPowerRail()
	 * @generated
	 */
	EReference getPowerRail_HasRightPowerRail();

	/**
	 * Returns the meta object for enum '{@link iec611313Specification.language.ld.ContactType <em>Contact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contact Type</em>'.
	 * @see iec611313Specification.language.ld.ContactType
	 * @generated
	 */
	EEnum getContactType();

	/**
	 * Returns the meta object for enum '{@link iec611313Specification.language.ld.CoilType <em>Coil Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Coil Type</em>'.
	 * @see iec611313Specification.language.ld.CoilType
	 * @generated
	 */
	EEnum getCoilType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LdFactory getLdFactory();

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
		 * The meta object literal for the '{@link iec611313Specification.language.ld.impl.CoilImpl <em>Coil</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.language.ld.impl.CoilImpl
		 * @see iec611313Specification.language.ld.impl.LdPackageImpl#getCoil()
		 * @generated
		 */
		EClass COIL = eINSTANCE.getCoil();

		/**
		 * The meta object literal for the '<em><b>Coil Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COIL__COIL_TYPE = eINSTANCE.getCoil_CoilType();

		/**
		 * The meta object literal for the '{@link iec611313Specification.language.ld.impl.ContactImpl <em>Contact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.language.ld.impl.ContactImpl
		 * @see iec611313Specification.language.ld.impl.LdPackageImpl#getContact()
		 * @generated
		 */
		EClass CONTACT = eINSTANCE.getContact();

		/**
		 * The meta object literal for the '<em><b>Contact Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__CONTACT_TYPE = eINSTANCE.getContact_ContactType();

		/**
		 * The meta object literal for the '{@link iec611313Specification.language.ld.impl.LadderDiagramImpl <em>Ladder Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.language.ld.impl.LadderDiagramImpl
		 * @see iec611313Specification.language.ld.impl.LdPackageImpl#getLadderDiagram()
		 * @generated
		 */
		EClass LADDER_DIAGRAM = eINSTANCE.getLadderDiagram();

		/**
		 * The meta object literal for the '<em><b>Contains Ladder Network</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LADDER_DIAGRAM__CONTAINS_LADDER_NETWORK = eINSTANCE.getLadderDiagram_ContainsLadderNetwork();

		/**
		 * The meta object literal for the '{@link iec611313Specification.language.ld.impl.LadderNetworkImpl <em>Ladder Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.language.ld.impl.LadderNetworkImpl
		 * @see iec611313Specification.language.ld.impl.LdPackageImpl#getLadderNetwork()
		 * @generated
		 */
		EClass LADDER_NETWORK = eINSTANCE.getLadderNetwork();

		/**
		 * The meta object literal for the '<em><b>Has LD Network Label</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LADDER_NETWORK__HAS_LD_NETWORK_LABEL = eINSTANCE.getLadderNetwork_HasLDNetworkLabel();

		/**
		 * The meta object literal for the '<em><b>Contains Power Flow Line</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LADDER_NETWORK__CONTAINS_POWER_FLOW_LINE = eINSTANCE.getLadderNetwork_ContainsPowerFlowLine();

		/**
		 * The meta object literal for the '<em><b>Contains LD Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LADDER_NETWORK__CONTAINS_LD_ELEMENT = eINSTANCE.getLadderNetwork_ContainsLDElement();

		/**
		 * The meta object literal for the '{@link iec611313Specification.language.ld.impl.LDElementImpl <em>LD Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.language.ld.impl.LDElementImpl
		 * @see iec611313Specification.language.ld.impl.LdPackageImpl#getLDElement()
		 * @generated
		 */
		EClass LD_ELEMENT = eINSTANCE.getLDElement();

		/**
		 * The meta object literal for the '{@link iec611313Specification.language.ld.impl.LDNodeImpl <em>LD Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.language.ld.impl.LDNodeImpl
		 * @see iec611313Specification.language.ld.impl.LdPackageImpl#getLDNode()
		 * @generated
		 */
		EClass LD_NODE = eINSTANCE.getLDNode();

		/**
		 * The meta object literal for the '<em><b>Has LD Node Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LD_NODE__HAS_LD_NODE_VARIABLE = eINSTANCE.getLDNode_HasLDNodeVariable();

		/**
		 * The meta object literal for the '{@link iec611313Specification.language.ld.impl.PowerFlowLineImpl <em>Power Flow Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.language.ld.impl.PowerFlowLineImpl
		 * @see iec611313Specification.language.ld.impl.LdPackageImpl#getPowerFlowLine()
		 * @generated
		 */
		EClass POWER_FLOW_LINE = eINSTANCE.getPowerFlowLine();

		/**
		 * The meta object literal for the '<em><b>Has Power Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_FLOW_LINE__HAS_POWER_SOURCE = eINSTANCE.getPowerFlowLine_HasPowerSource();

		/**
		 * The meta object literal for the '<em><b>Has Power Sink</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_FLOW_LINE__HAS_POWER_SINK = eINSTANCE.getPowerFlowLine_HasPowerSink();

		/**
		 * The meta object literal for the '{@link iec611313Specification.language.ld.impl.PowerRailImpl <em>Power Rail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.language.ld.impl.PowerRailImpl
		 * @see iec611313Specification.language.ld.impl.LdPackageImpl#getPowerRail()
		 * @generated
		 */
		EClass POWER_RAIL = eINSTANCE.getPowerRail();

		/**
		 * The meta object literal for the '<em><b>Has Left Power Rail</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_RAIL__HAS_LEFT_POWER_RAIL = eINSTANCE.getPowerRail_HasLeftPowerRail();

		/**
		 * The meta object literal for the '<em><b>Has Right Power Rail</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_RAIL__HAS_RIGHT_POWER_RAIL = eINSTANCE.getPowerRail_HasRightPowerRail();

		/**
		 * The meta object literal for the '{@link iec611313Specification.language.ld.ContactType <em>Contact Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.language.ld.ContactType
		 * @see iec611313Specification.language.ld.impl.LdPackageImpl#getContactType()
		 * @generated
		 */
		EEnum CONTACT_TYPE = eINSTANCE.getContactType();

		/**
		 * The meta object literal for the '{@link iec611313Specification.language.ld.CoilType <em>Coil Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.language.ld.CoilType
		 * @see iec611313Specification.language.ld.impl.LdPackageImpl#getCoilType()
		 * @generated
		 */
		EEnum COIL_TYPE = eINSTANCE.getCoilType();

	}

} //LdPackage
