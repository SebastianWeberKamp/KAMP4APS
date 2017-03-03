/**
 */
package iec611313Specification.common;

import iec611313Specification.common.pous.programs.ProgramsPackage;

import iec611313Specification.language.fbd.FbdPackage;

import iec611313Specification.language.st.StPackage;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see iec611313Specification.common.CommonFactory
 * @model kind="package"
 * @generated
 */
public interface CommonPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "common";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.kit.edu/iec611313/common";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "common";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommonPackage eINSTANCE = iec611313Specification.common.impl.CommonPackageImpl.init();

	/**
	 * The meta object id for the '{@link iec611313Specification.common.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.impl.AssignmentImpl
	 * @see iec611313Specification.common.impl.CommonPackageImpl#getAssignment()
	 * @generated
	 */
	int ASSIGNMENT = 0;

	/**
	 * The feature id for the '<em><b>Has Assignment Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__HAS_ASSIGNMENT_EXPRESSION = ProgramsPackage.PROGRAM_CONFIG_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Assignment Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__HAS_ASSIGNMENT_VARIABLE = ProgramsPackage.PROGRAM_CONFIG_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_FEATURE_COUNT = ProgramsPackage.PROGRAM_CONFIG_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATION_COUNT = ProgramsPackage.PROGRAM_CONFIG_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.impl.ExpressionImpl
	 * @see iec611313Specification.common.impl.CommonPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Has Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__HAS_TYPE = StPackage.STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = StPackage.STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = StPackage.STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.impl.ParameterListImpl <em>Parameter List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.impl.ParameterListImpl
	 * @see iec611313Specification.common.impl.CommonPackageImpl#getParameterList()
	 * @generated
	 */
	int PARAMETER_LIST = 6;

	/**
	 * The number of structural features of the '<em>Parameter List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Parameter List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.impl.FormalParameterListImpl <em>Formal Parameter List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.impl.FormalParameterListImpl
	 * @see iec611313Specification.common.impl.CommonPackageImpl#getFormalParameterList()
	 * @generated
	 */
	int FORMAL_PARAMETER_LIST = 2;

	/**
	 * The feature id for the '<em><b>Contains Formal Param Assignment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_LIST__CONTAINS_FORMAL_PARAM_ASSIGNMENT = PARAMETER_LIST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Formal Parameter List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_LIST_FEATURE_COUNT = PARAMETER_LIST_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Formal Parameter List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_LIST_OPERATION_COUNT = PARAMETER_LIST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.impl.JumpImpl <em>Jump</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.impl.JumpImpl
	 * @see iec611313Specification.common.impl.CommonPackageImpl#getJump()
	 * @generated
	 */
	int JUMP = 3;

	/**
	 * The feature id for the '<em><b>Has Jump Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP__HAS_JUMP_TARGET = FbdPackage.SIGNAL_SINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Jump</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_FEATURE_COUNT = FbdPackage.SIGNAL_SINK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Jump</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_OPERATION_COUNT = FbdPackage.SIGNAL_SINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.impl.LabelImpl
	 * @see iec611313Specification.common.impl.CommonPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__NAME = 0;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.impl.LiteralImpl
	 * @see iec611313Specification.common.impl.CommonPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 5;

	/**
	 * The feature id for the '<em><b>Has Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__HAS_TYPE = EXPRESSION__HAS_TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.impl.PositionalParameterListImpl <em>Positional Parameter List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.impl.PositionalParameterListImpl
	 * @see iec611313Specification.common.impl.CommonPackageImpl#getPositionalParameterList()
	 * @generated
	 */
	int POSITIONAL_PARAMETER_LIST = 7;

	/**
	 * The feature id for the '<em><b>Contains Param Expression</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONAL_PARAMETER_LIST__CONTAINS_PARAM_EXPRESSION = PARAMETER_LIST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Positional Parameter List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONAL_PARAMETER_LIST_FEATURE_COUNT = PARAMETER_LIST_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Positional Parameter List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONAL_PARAMETER_LIST_OPERATION_COUNT = PARAMETER_LIST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.common.impl.RangeImpl <em>Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.common.impl.RangeImpl
	 * @see iec611313Specification.common.impl.CommonPackageImpl#getRange()
	 * @generated
	 */
	int RANGE = 8;

	/**
	 * The feature id for the '<em><b>Has Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__HAS_LOWER_BOUND = 0;

	/**
	 * The feature id for the '<em><b>Has Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__HAS_UPPER_BOUND = 1;

	/**
	 * The number of structural features of the '<em>Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see iec611313Specification.common.Assignment
	 * @generated
	 */
	EClass getAssignment();

	/**
	 * Returns the meta object for the reference '{@link iec611313Specification.common.Assignment#getHasAssignmentExpression <em>Has Assignment Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Assignment Expression</em>'.
	 * @see iec611313Specification.common.Assignment#getHasAssignmentExpression()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_HasAssignmentExpression();

	/**
	 * Returns the meta object for the reference '{@link iec611313Specification.common.Assignment#getHasAssignmentVariable <em>Has Assignment Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Assignment Variable</em>'.
	 * @see iec611313Specification.common.Assignment#getHasAssignmentVariable()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_HasAssignmentVariable();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see iec611313Specification.common.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the containment reference '{@link iec611313Specification.common.Expression#getHasType <em>Has Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Type</em>'.
	 * @see iec611313Specification.common.Expression#getHasType()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_HasType();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.FormalParameterList <em>Formal Parameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formal Parameter List</em>'.
	 * @see iec611313Specification.common.FormalParameterList
	 * @generated
	 */
	EClass getFormalParameterList();

	/**
	 * Returns the meta object for the containment reference list '{@link iec611313Specification.common.FormalParameterList#getContainsFormalParamAssignment <em>Contains Formal Param Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Formal Param Assignment</em>'.
	 * @see iec611313Specification.common.FormalParameterList#getContainsFormalParamAssignment()
	 * @see #getFormalParameterList()
	 * @generated
	 */
	EReference getFormalParameterList_ContainsFormalParamAssignment();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.Jump <em>Jump</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jump</em>'.
	 * @see iec611313Specification.common.Jump
	 * @generated
	 */
	EClass getJump();

	/**
	 * Returns the meta object for the reference '{@link iec611313Specification.common.Jump#getHasJumpTarget <em>Has Jump Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Jump Target</em>'.
	 * @see iec611313Specification.common.Jump#getHasJumpTarget()
	 * @see #getJump()
	 * @generated
	 */
	EReference getJump_HasJumpTarget();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see iec611313Specification.common.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for the attribute '{@link iec611313Specification.common.Label#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iec611313Specification.common.Label#getName()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Name();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see iec611313Specification.common.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for the attribute '{@link iec611313Specification.common.Literal#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see iec611313Specification.common.Literal#getValue()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Value();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.ParameterList <em>Parameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter List</em>'.
	 * @see iec611313Specification.common.ParameterList
	 * @generated
	 */
	EClass getParameterList();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.PositionalParameterList <em>Positional Parameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positional Parameter List</em>'.
	 * @see iec611313Specification.common.PositionalParameterList
	 * @generated
	 */
	EClass getPositionalParameterList();

	/**
	 * Returns the meta object for the reference list '{@link iec611313Specification.common.PositionalParameterList#getContainsParamExpression <em>Contains Param Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contains Param Expression</em>'.
	 * @see iec611313Specification.common.PositionalParameterList#getContainsParamExpression()
	 * @see #getPositionalParameterList()
	 * @generated
	 */
	EReference getPositionalParameterList_ContainsParamExpression();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.common.Range <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range</em>'.
	 * @see iec611313Specification.common.Range
	 * @generated
	 */
	EClass getRange();

	/**
	 * Returns the meta object for the containment reference '{@link iec611313Specification.common.Range#getHasLowerBound <em>Has Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Lower Bound</em>'.
	 * @see iec611313Specification.common.Range#getHasLowerBound()
	 * @see #getRange()
	 * @generated
	 */
	EReference getRange_HasLowerBound();

	/**
	 * Returns the meta object for the containment reference '{@link iec611313Specification.common.Range#getHasUpperBound <em>Has Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Upper Bound</em>'.
	 * @see iec611313Specification.common.Range#getHasUpperBound()
	 * @see #getRange()
	 * @generated
	 */
	EReference getRange_HasUpperBound();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommonFactory getCommonFactory();

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
		 * The meta object literal for the '{@link iec611313Specification.common.impl.AssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.impl.AssignmentImpl
		 * @see iec611313Specification.common.impl.CommonPackageImpl#getAssignment()
		 * @generated
		 */
		EClass ASSIGNMENT = eINSTANCE.getAssignment();

		/**
		 * The meta object literal for the '<em><b>Has Assignment Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__HAS_ASSIGNMENT_EXPRESSION = eINSTANCE.getAssignment_HasAssignmentExpression();

		/**
		 * The meta object literal for the '<em><b>Has Assignment Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__HAS_ASSIGNMENT_VARIABLE = eINSTANCE.getAssignment_HasAssignmentVariable();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.impl.ExpressionImpl
		 * @see iec611313Specification.common.impl.CommonPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Has Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__HAS_TYPE = eINSTANCE.getExpression_HasType();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.impl.FormalParameterListImpl <em>Formal Parameter List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.impl.FormalParameterListImpl
		 * @see iec611313Specification.common.impl.CommonPackageImpl#getFormalParameterList()
		 * @generated
		 */
		EClass FORMAL_PARAMETER_LIST = eINSTANCE.getFormalParameterList();

		/**
		 * The meta object literal for the '<em><b>Contains Formal Param Assignment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMAL_PARAMETER_LIST__CONTAINS_FORMAL_PARAM_ASSIGNMENT = eINSTANCE.getFormalParameterList_ContainsFormalParamAssignment();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.impl.JumpImpl <em>Jump</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.impl.JumpImpl
		 * @see iec611313Specification.common.impl.CommonPackageImpl#getJump()
		 * @generated
		 */
		EClass JUMP = eINSTANCE.getJump();

		/**
		 * The meta object literal for the '<em><b>Has Jump Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JUMP__HAS_JUMP_TARGET = eINSTANCE.getJump_HasJumpTarget();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.impl.LabelImpl
		 * @see iec611313Specification.common.impl.CommonPackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__NAME = eINSTANCE.getLabel_Name();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.impl.LiteralImpl
		 * @see iec611313Specification.common.impl.CommonPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__VALUE = eINSTANCE.getLiteral_Value();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.impl.ParameterListImpl <em>Parameter List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.impl.ParameterListImpl
		 * @see iec611313Specification.common.impl.CommonPackageImpl#getParameterList()
		 * @generated
		 */
		EClass PARAMETER_LIST = eINSTANCE.getParameterList();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.impl.PositionalParameterListImpl <em>Positional Parameter List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.impl.PositionalParameterListImpl
		 * @see iec611313Specification.common.impl.CommonPackageImpl#getPositionalParameterList()
		 * @generated
		 */
		EClass POSITIONAL_PARAMETER_LIST = eINSTANCE.getPositionalParameterList();

		/**
		 * The meta object literal for the '<em><b>Contains Param Expression</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITIONAL_PARAMETER_LIST__CONTAINS_PARAM_EXPRESSION = eINSTANCE.getPositionalParameterList_ContainsParamExpression();

		/**
		 * The meta object literal for the '{@link iec611313Specification.common.impl.RangeImpl <em>Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.common.impl.RangeImpl
		 * @see iec611313Specification.common.impl.CommonPackageImpl#getRange()
		 * @generated
		 */
		EClass RANGE = eINSTANCE.getRange();

		/**
		 * The meta object literal for the '<em><b>Has Lower Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE__HAS_LOWER_BOUND = eINSTANCE.getRange_HasLowerBound();

		/**
		 * The meta object literal for the '<em><b>Has Upper Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE__HAS_UPPER_BOUND = eINSTANCE.getRange_HasUpperBound();

	}

} //CommonPackage
