/**
 */
package iec611313Specification.language.sfc;

import iec611313Specification.common.pous.function_blocks.Function_blocksPackage;

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
 * @see iec611313Specification.language.sfc.SfcFactory
 * @model kind="package"
 * @generated
 */
public interface SfcPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sfc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.kit.edu/iec611313/language/sfc";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sfc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SfcPackage eINSTANCE = iec611313Specification.language.sfc.impl.SfcPackageImpl.init();

	/**
	 * The meta object id for the '{@link iec611313Specification.language.sfc.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.language.sfc.impl.ActionImpl
	 * @see iec611313Specification.language.sfc.impl.SfcPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 0;

	/**
	 * The feature id for the '<em><b>Has Action Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__HAS_ACTION_SPEC = 0;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.language.sfc.impl.ActionAssociationImpl <em>Action Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.language.sfc.impl.ActionAssociationImpl
	 * @see iec611313Specification.language.sfc.impl.SfcPackageImpl#getActionAssociation()
	 * @generated
	 */
	int ACTION_ASSOCIATION = 1;

	/**
	 * The feature id for the '<em><b>Has Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ASSOCIATION__HAS_ACTION = 0;

	/**
	 * The feature id for the '<em><b>Has Indicator Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ASSOCIATION__HAS_INDICATOR_VARIABLE = 1;

	/**
	 * The feature id for the '<em><b>Has Action Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ASSOCIATION__HAS_ACTION_QUALIFIER = 2;

	/**
	 * The number of structural features of the '<em>Action Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ASSOCIATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Action Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ASSOCIATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.language.sfc.impl.ActionQualifierImpl <em>Action Qualifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.language.sfc.impl.ActionQualifierImpl
	 * @see iec611313Specification.language.sfc.impl.SfcPackageImpl#getActionQualifier()
	 * @generated
	 */
	int ACTION_QUALIFIER = 2;

	/**
	 * The number of structural features of the '<em>Action Qualifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_QUALIFIER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Action Qualifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_QUALIFIER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.language.sfc.impl.SequentialFunctionChartImpl <em>Sequential Function Chart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.language.sfc.impl.SequentialFunctionChartImpl
	 * @see iec611313Specification.language.sfc.impl.SfcPackageImpl#getSequentialFunctionChart()
	 * @generated
	 */
	int SEQUENTIAL_FUNCTION_CHART = 3;

	/**
	 * The feature id for the '<em><b>Has Initial Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_FUNCTION_CHART__HAS_INITIAL_STEP = Function_blocksPackage.FUNCTION_BLOCK_BODY_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sequential Function Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_FUNCTION_CHART_FEATURE_COUNT = Function_blocksPackage.FUNCTION_BLOCK_BODY_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sequential Function Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_FUNCTION_CHART_OPERATION_COUNT = Function_blocksPackage.FUNCTION_BLOCK_BODY_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.language.sfc.impl.SimpleActionQualifierImpl <em>Simple Action Qualifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.language.sfc.impl.SimpleActionQualifierImpl
	 * @see iec611313Specification.language.sfc.impl.SfcPackageImpl#getSimpleActionQualifier()
	 * @generated
	 */
	int SIMPLE_ACTION_QUALIFIER = 4;

	/**
	 * The number of structural features of the '<em>Simple Action Qualifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTION_QUALIFIER_FEATURE_COUNT = ACTION_QUALIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Action Qualifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTION_QUALIFIER_OPERATION_COUNT = ACTION_QUALIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.language.sfc.impl.SimpleQualifierImpl <em>Simple Qualifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.language.sfc.impl.SimpleQualifierImpl
	 * @see iec611313Specification.language.sfc.impl.SfcPackageImpl#getSimpleQualifier()
	 * @generated
	 */
	int SIMPLE_QUALIFIER = 5;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUALIFIER__QUALIFIER = 0;

	/**
	 * The number of structural features of the '<em>Simple Qualifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUALIFIER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Simple Qualifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUALIFIER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.language.sfc.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.language.sfc.impl.StepImpl
	 * @see iec611313Specification.language.sfc.impl.SfcPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Contains Action Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__CONTAINS_ACTION_ASSOCIATION = 1;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.language.sfc.impl.TimedActionQualifierImpl <em>Timed Action Qualifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.language.sfc.impl.TimedActionQualifierImpl
	 * @see iec611313Specification.language.sfc.impl.SfcPackageImpl#getTimedActionQualifier()
	 * @generated
	 */
	int TIMED_ACTION_QUALIFIER = 7;

	/**
	 * The feature id for the '<em><b>Has Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ACTION_QUALIFIER__HAS_DURATION = ACTION_QUALIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ACTION_QUALIFIER__QUALIFIER = ACTION_QUALIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Timed Action Qualifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ACTION_QUALIFIER_FEATURE_COUNT = ACTION_QUALIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Timed Action Qualifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ACTION_QUALIFIER_OPERATION_COUNT = ACTION_QUALIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.language.sfc.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.language.sfc.impl.TransitionImpl
	 * @see iec611313Specification.language.sfc.impl.SfcPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 8;

	/**
	 * The feature id for the '<em><b>Has Source Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__HAS_SOURCE_STEP = 0;

	/**
	 * The feature id for the '<em><b>Has Target Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__HAS_TARGET_STEP = 1;

	/**
	 * The feature id for the '<em><b>Has Transition Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__HAS_TRANSITION_CONDITION = 2;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.language.sfc.TimedQualifier <em>Timed Qualifier</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.language.sfc.TimedQualifier
	 * @see iec611313Specification.language.sfc.impl.SfcPackageImpl#getTimedQualifier()
	 * @generated
	 */
	int TIMED_QUALIFIER = 9;


	/**
	 * Returns the meta object for class '{@link iec611313Specification.language.sfc.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see iec611313Specification.language.sfc.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the reference '{@link iec611313Specification.language.sfc.Action#getHasActionSpec <em>Has Action Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Action Spec</em>'.
	 * @see iec611313Specification.language.sfc.Action#getHasActionSpec()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_HasActionSpec();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.language.sfc.ActionAssociation <em>Action Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Association</em>'.
	 * @see iec611313Specification.language.sfc.ActionAssociation
	 * @generated
	 */
	EClass getActionAssociation();

	/**
	 * Returns the meta object for the reference '{@link iec611313Specification.language.sfc.ActionAssociation#getHasAction <em>Has Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Action</em>'.
	 * @see iec611313Specification.language.sfc.ActionAssociation#getHasAction()
	 * @see #getActionAssociation()
	 * @generated
	 */
	EReference getActionAssociation_HasAction();

	/**
	 * Returns the meta object for the reference '{@link iec611313Specification.language.sfc.ActionAssociation#getHasIndicatorVariable <em>Has Indicator Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Indicator Variable</em>'.
	 * @see iec611313Specification.language.sfc.ActionAssociation#getHasIndicatorVariable()
	 * @see #getActionAssociation()
	 * @generated
	 */
	EReference getActionAssociation_HasIndicatorVariable();

	/**
	 * Returns the meta object for the reference '{@link iec611313Specification.language.sfc.ActionAssociation#getHasActionQualifier <em>Has Action Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Action Qualifier</em>'.
	 * @see iec611313Specification.language.sfc.ActionAssociation#getHasActionQualifier()
	 * @see #getActionAssociation()
	 * @generated
	 */
	EReference getActionAssociation_HasActionQualifier();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.language.sfc.ActionQualifier <em>Action Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Qualifier</em>'.
	 * @see iec611313Specification.language.sfc.ActionQualifier
	 * @generated
	 */
	EClass getActionQualifier();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.language.sfc.SequentialFunctionChart <em>Sequential Function Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequential Function Chart</em>'.
	 * @see iec611313Specification.language.sfc.SequentialFunctionChart
	 * @generated
	 */
	EClass getSequentialFunctionChart();

	/**
	 * Returns the meta object for the reference '{@link iec611313Specification.language.sfc.SequentialFunctionChart#getHasInitialStep <em>Has Initial Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Initial Step</em>'.
	 * @see iec611313Specification.language.sfc.SequentialFunctionChart#getHasInitialStep()
	 * @see #getSequentialFunctionChart()
	 * @generated
	 */
	EReference getSequentialFunctionChart_HasInitialStep();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.language.sfc.SimpleActionQualifier <em>Simple Action Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Action Qualifier</em>'.
	 * @see iec611313Specification.language.sfc.SimpleActionQualifier
	 * @generated
	 */
	EClass getSimpleActionQualifier();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.language.sfc.SimpleQualifier <em>Simple Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Qualifier</em>'.
	 * @see iec611313Specification.language.sfc.SimpleQualifier
	 * @generated
	 */
	EClass getSimpleQualifier();

	/**
	 * Returns the meta object for the reference '{@link iec611313Specification.language.sfc.SimpleQualifier#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Qualifier</em>'.
	 * @see iec611313Specification.language.sfc.SimpleQualifier#getQualifier()
	 * @see #getSimpleQualifier()
	 * @generated
	 */
	EReference getSimpleQualifier_Qualifier();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.language.sfc.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see iec611313Specification.language.sfc.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the attribute '{@link iec611313Specification.language.sfc.Step#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iec611313Specification.language.sfc.Step#getName()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link iec611313Specification.language.sfc.Step#getContainsActionAssociation <em>Contains Action Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Action Association</em>'.
	 * @see iec611313Specification.language.sfc.Step#getContainsActionAssociation()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_ContainsActionAssociation();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.language.sfc.TimedActionQualifier <em>Timed Action Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed Action Qualifier</em>'.
	 * @see iec611313Specification.language.sfc.TimedActionQualifier
	 * @generated
	 */
	EClass getTimedActionQualifier();

	/**
	 * Returns the meta object for the containment reference '{@link iec611313Specification.language.sfc.TimedActionQualifier#getHasDuration <em>Has Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Duration</em>'.
	 * @see iec611313Specification.language.sfc.TimedActionQualifier#getHasDuration()
	 * @see #getTimedActionQualifier()
	 * @generated
	 */
	EReference getTimedActionQualifier_HasDuration();

	/**
	 * Returns the meta object for the reference '{@link iec611313Specification.language.sfc.TimedActionQualifier#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Qualifier</em>'.
	 * @see iec611313Specification.language.sfc.TimedActionQualifier#getQualifier()
	 * @see #getTimedActionQualifier()
	 * @generated
	 */
	EReference getTimedActionQualifier_Qualifier();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.language.sfc.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see iec611313Specification.language.sfc.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference list '{@link iec611313Specification.language.sfc.Transition#getHasSourceStep <em>Has Source Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Source Step</em>'.
	 * @see iec611313Specification.language.sfc.Transition#getHasSourceStep()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_HasSourceStep();

	/**
	 * Returns the meta object for the reference list '{@link iec611313Specification.language.sfc.Transition#getHasTargetStep <em>Has Target Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Target Step</em>'.
	 * @see iec611313Specification.language.sfc.Transition#getHasTargetStep()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_HasTargetStep();

	/**
	 * Returns the meta object for the reference '{@link iec611313Specification.language.sfc.Transition#getHasTransitionCondition <em>Has Transition Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Transition Condition</em>'.
	 * @see iec611313Specification.language.sfc.Transition#getHasTransitionCondition()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_HasTransitionCondition();

	/**
	 * Returns the meta object for enum '{@link iec611313Specification.language.sfc.TimedQualifier <em>Timed Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Timed Qualifier</em>'.
	 * @see iec611313Specification.language.sfc.TimedQualifier
	 * @generated
	 */
	EEnum getTimedQualifier();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SfcFactory getSfcFactory();

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
		 * The meta object literal for the '{@link iec611313Specification.language.sfc.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.language.sfc.impl.ActionImpl
		 * @see iec611313Specification.language.sfc.impl.SfcPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Has Action Spec</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__HAS_ACTION_SPEC = eINSTANCE.getAction_HasActionSpec();

		/**
		 * The meta object literal for the '{@link iec611313Specification.language.sfc.impl.ActionAssociationImpl <em>Action Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.language.sfc.impl.ActionAssociationImpl
		 * @see iec611313Specification.language.sfc.impl.SfcPackageImpl#getActionAssociation()
		 * @generated
		 */
		EClass ACTION_ASSOCIATION = eINSTANCE.getActionAssociation();

		/**
		 * The meta object literal for the '<em><b>Has Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_ASSOCIATION__HAS_ACTION = eINSTANCE.getActionAssociation_HasAction();

		/**
		 * The meta object literal for the '<em><b>Has Indicator Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_ASSOCIATION__HAS_INDICATOR_VARIABLE = eINSTANCE.getActionAssociation_HasIndicatorVariable();

		/**
		 * The meta object literal for the '<em><b>Has Action Qualifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_ASSOCIATION__HAS_ACTION_QUALIFIER = eINSTANCE.getActionAssociation_HasActionQualifier();

		/**
		 * The meta object literal for the '{@link iec611313Specification.language.sfc.impl.ActionQualifierImpl <em>Action Qualifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.language.sfc.impl.ActionQualifierImpl
		 * @see iec611313Specification.language.sfc.impl.SfcPackageImpl#getActionQualifier()
		 * @generated
		 */
		EClass ACTION_QUALIFIER = eINSTANCE.getActionQualifier();

		/**
		 * The meta object literal for the '{@link iec611313Specification.language.sfc.impl.SequentialFunctionChartImpl <em>Sequential Function Chart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.language.sfc.impl.SequentialFunctionChartImpl
		 * @see iec611313Specification.language.sfc.impl.SfcPackageImpl#getSequentialFunctionChart()
		 * @generated
		 */
		EClass SEQUENTIAL_FUNCTION_CHART = eINSTANCE.getSequentialFunctionChart();

		/**
		 * The meta object literal for the '<em><b>Has Initial Step</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENTIAL_FUNCTION_CHART__HAS_INITIAL_STEP = eINSTANCE.getSequentialFunctionChart_HasInitialStep();

		/**
		 * The meta object literal for the '{@link iec611313Specification.language.sfc.impl.SimpleActionQualifierImpl <em>Simple Action Qualifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.language.sfc.impl.SimpleActionQualifierImpl
		 * @see iec611313Specification.language.sfc.impl.SfcPackageImpl#getSimpleActionQualifier()
		 * @generated
		 */
		EClass SIMPLE_ACTION_QUALIFIER = eINSTANCE.getSimpleActionQualifier();

		/**
		 * The meta object literal for the '{@link iec611313Specification.language.sfc.impl.SimpleQualifierImpl <em>Simple Qualifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.language.sfc.impl.SimpleQualifierImpl
		 * @see iec611313Specification.language.sfc.impl.SfcPackageImpl#getSimpleQualifier()
		 * @generated
		 */
		EClass SIMPLE_QUALIFIER = eINSTANCE.getSimpleQualifier();

		/**
		 * The meta object literal for the '<em><b>Qualifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_QUALIFIER__QUALIFIER = eINSTANCE.getSimpleQualifier_Qualifier();

		/**
		 * The meta object literal for the '{@link iec611313Specification.language.sfc.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.language.sfc.impl.StepImpl
		 * @see iec611313Specification.language.sfc.impl.SfcPackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__NAME = eINSTANCE.getStep_Name();

		/**
		 * The meta object literal for the '<em><b>Contains Action Association</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__CONTAINS_ACTION_ASSOCIATION = eINSTANCE.getStep_ContainsActionAssociation();

		/**
		 * The meta object literal for the '{@link iec611313Specification.language.sfc.impl.TimedActionQualifierImpl <em>Timed Action Qualifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.language.sfc.impl.TimedActionQualifierImpl
		 * @see iec611313Specification.language.sfc.impl.SfcPackageImpl#getTimedActionQualifier()
		 * @generated
		 */
		EClass TIMED_ACTION_QUALIFIER = eINSTANCE.getTimedActionQualifier();

		/**
		 * The meta object literal for the '<em><b>Has Duration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMED_ACTION_QUALIFIER__HAS_DURATION = eINSTANCE.getTimedActionQualifier_HasDuration();

		/**
		 * The meta object literal for the '<em><b>Qualifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMED_ACTION_QUALIFIER__QUALIFIER = eINSTANCE.getTimedActionQualifier_Qualifier();

		/**
		 * The meta object literal for the '{@link iec611313Specification.language.sfc.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.language.sfc.impl.TransitionImpl
		 * @see iec611313Specification.language.sfc.impl.SfcPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Has Source Step</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__HAS_SOURCE_STEP = eINSTANCE.getTransition_HasSourceStep();

		/**
		 * The meta object literal for the '<em><b>Has Target Step</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__HAS_TARGET_STEP = eINSTANCE.getTransition_HasTargetStep();

		/**
		 * The meta object literal for the '<em><b>Has Transition Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__HAS_TRANSITION_CONDITION = eINSTANCE.getTransition_HasTransitionCondition();

		/**
		 * The meta object literal for the '{@link iec611313Specification.language.sfc.TimedQualifier <em>Timed Qualifier</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.language.sfc.TimedQualifier
		 * @see iec611313Specification.language.sfc.impl.SfcPackageImpl#getTimedQualifier()
		 * @generated
		 */
		EEnum TIMED_QUALIFIER = eINSTANCE.getTimedQualifier();

	}

} //SfcPackage
