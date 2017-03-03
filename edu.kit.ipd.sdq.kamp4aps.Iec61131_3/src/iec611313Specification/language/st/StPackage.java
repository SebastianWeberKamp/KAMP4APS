/**
 */
package iec611313Specification.language.st;

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
 * @see iec611313Specification.language.st.StFactory
 * @model kind="package"
 * @generated
 */
public interface StPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "st";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.kit.edu/iec611313/language/st";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "st";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StPackage eINSTANCE = iec611313Specification.language.st.impl.StPackageImpl.init();

	/**
	 * The meta object id for the '{@link iec611313Specification.language.st.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.language.st.impl.StatementImpl
	 * @see iec611313Specification.language.st.impl.StPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 10;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.language.st.impl.CaseImpl <em>Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.language.st.impl.CaseImpl
	 * @see iec611313Specification.language.st.impl.StPackageImpl#getCase()
	 * @generated
	 */
	int CASE = 0;

	/**
	 * The feature id for the '<em><b>Has Case Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__HAS_CASE_EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contains Case Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__CONTAINS_CASE_ELEMENT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Default Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__HAS_DEFAULT_PART = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.language.st.impl.CaseElementImpl <em>Case Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.language.st.impl.CaseElementImpl
	 * @see iec611313Specification.language.st.impl.StPackageImpl#getCaseElement()
	 * @generated
	 */
	int CASE_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Has Case Element Matches Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_ELEMENT__HAS_CASE_ELEMENT_MATCHES_PART = 0;

	/**
	 * The feature id for the '<em><b>Has Case Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_ELEMENT__HAS_CASE_VALUE = 1;

	/**
	 * The number of structural features of the '<em>Case Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Case Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.language.st.impl.ExitImpl <em>Exit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.language.st.impl.ExitImpl
	 * @see iec611313Specification.language.st.impl.StPackageImpl#getExit()
	 * @generated
	 */
	int EXIT = 2;

	/**
	 * The number of structural features of the '<em>Exit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Exit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.language.st.impl.IterationImpl <em>Iteration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.language.st.impl.IterationImpl
	 * @see iec611313Specification.language.st.impl.StPackageImpl#getIteration()
	 * @generated
	 */
	int ITERATION = 5;

	/**
	 * The number of structural features of the '<em>Iteration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Iteration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.language.st.impl.ForImpl <em>For</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.language.st.impl.ForImpl
	 * @see iec611313Specification.language.st.impl.StPackageImpl#getFor()
	 * @generated
	 */
	int FOR = 3;

	/**
	 * The feature id for the '<em><b>Has To Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR__HAS_TO_EXPRESSION = ITERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Step Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR__HAS_STEP_EXPRESSION = ITERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Control Variable Assignment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR__HAS_CONTROL_VARIABLE_ASSIGNMENT = ITERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>For</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_FEATURE_COUNT = ITERATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>For</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_OPERATION_COUNT = ITERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.language.st.impl.IfImpl <em>If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.language.st.impl.IfImpl
	 * @see iec611313Specification.language.st.impl.StPackageImpl#getIf()
	 * @generated
	 */
	int IF = 4;

	/**
	 * The feature id for the '<em><b>Has If Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__HAS_IF_CONDITION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Else If</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__HAS_ELSE_IF = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Else</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__HAS_ELSE = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Has Then</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__HAS_THEN = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.language.st.impl.NilValueImpl <em>Nil Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.language.st.impl.NilValueImpl
	 * @see iec611313Specification.language.st.impl.StPackageImpl#getNilValue()
	 * @generated
	 */
	int NIL_VALUE = 6;

	/**
	 * The number of structural features of the '<em>Nil Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NIL_VALUE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Nil Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NIL_VALUE_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.language.st.impl.SimpleIterationImpl <em>Simple Iteration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.language.st.impl.SimpleIterationImpl
	 * @see iec611313Specification.language.st.impl.StPackageImpl#getSimpleIteration()
	 * @generated
	 */
	int SIMPLE_ITERATION = 9;

	/**
	 * The feature id for the '<em><b>Has Iteration Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ITERATION__HAS_ITERATION_CONDITION = ITERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Iteration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ITERATION_FEATURE_COUNT = ITERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Simple Iteration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ITERATION_OPERATION_COUNT = ITERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.language.st.impl.RepeatImpl <em>Repeat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.language.st.impl.RepeatImpl
	 * @see iec611313Specification.language.st.impl.StPackageImpl#getRepeat()
	 * @generated
	 */
	int REPEAT = 7;

	/**
	 * The feature id for the '<em><b>Has Iteration Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__HAS_ITERATION_CONDITION = SIMPLE_ITERATION__HAS_ITERATION_CONDITION;

	/**
	 * The number of structural features of the '<em>Repeat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_FEATURE_COUNT = SIMPLE_ITERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Repeat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_OPERATION_COUNT = SIMPLE_ITERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.language.st.impl.ReturnImpl <em>Return</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.language.st.impl.ReturnImpl
	 * @see iec611313Specification.language.st.impl.StPackageImpl#getReturn()
	 * @generated
	 */
	int RETURN = 8;

	/**
	 * The number of structural features of the '<em>Return</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Return</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.language.st.impl.StatementListImpl <em>Statement List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.language.st.impl.StatementListImpl
	 * @see iec611313Specification.language.st.impl.StPackageImpl#getStatementList()
	 * @generated
	 */
	int STATEMENT_LIST = 11;

	/**
	 * The feature id for the '<em><b>Contains Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_LIST__CONTAINS_STATEMENT = FunctionsPackage.FUNCTION_BODY_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Statement List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_LIST_FEATURE_COUNT = FunctionsPackage.FUNCTION_BODY_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Statement List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_LIST_OPERATION_COUNT = FunctionsPackage.FUNCTION_BODY_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.language.st.impl.WhileImpl <em>While</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.language.st.impl.WhileImpl
	 * @see iec611313Specification.language.st.impl.StPackageImpl#getWhile()
	 * @generated
	 */
	int WHILE = 12;

	/**
	 * The feature id for the '<em><b>Has Iteration Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__HAS_ITERATION_CONDITION = SIMPLE_ITERATION__HAS_ITERATION_CONDITION;

	/**
	 * The number of structural features of the '<em>While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_FEATURE_COUNT = SIMPLE_ITERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_OPERATION_COUNT = SIMPLE_ITERATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link iec611313Specification.language.st.Case <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case</em>'.
	 * @see iec611313Specification.language.st.Case
	 * @generated
	 */
	EClass getCase();

	/**
	 * Returns the meta object for the reference '{@link iec611313Specification.language.st.Case#getHasCaseExpression <em>Has Case Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Case Expression</em>'.
	 * @see iec611313Specification.language.st.Case#getHasCaseExpression()
	 * @see #getCase()
	 * @generated
	 */
	EReference getCase_HasCaseExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link iec611313Specification.language.st.Case#getContainsCaseElement <em>Contains Case Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Case Element</em>'.
	 * @see iec611313Specification.language.st.Case#getContainsCaseElement()
	 * @see #getCase()
	 * @generated
	 */
	EReference getCase_ContainsCaseElement();

	/**
	 * Returns the meta object for the reference '{@link iec611313Specification.language.st.Case#getHasDefaultPart <em>Has Default Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Default Part</em>'.
	 * @see iec611313Specification.language.st.Case#getHasDefaultPart()
	 * @see #getCase()
	 * @generated
	 */
	EReference getCase_HasDefaultPart();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.language.st.CaseElement <em>Case Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case Element</em>'.
	 * @see iec611313Specification.language.st.CaseElement
	 * @generated
	 */
	EClass getCaseElement();

	/**
	 * Returns the meta object for the reference '{@link iec611313Specification.language.st.CaseElement#getHasCaseElementMatchesPart <em>Has Case Element Matches Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Case Element Matches Part</em>'.
	 * @see iec611313Specification.language.st.CaseElement#getHasCaseElementMatchesPart()
	 * @see #getCaseElement()
	 * @generated
	 */
	EReference getCaseElement_HasCaseElementMatchesPart();

	/**
	 * Returns the meta object for the containment reference list '{@link iec611313Specification.language.st.CaseElement#getHasCaseValue <em>Has Case Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Case Value</em>'.
	 * @see iec611313Specification.language.st.CaseElement#getHasCaseValue()
	 * @see #getCaseElement()
	 * @generated
	 */
	EReference getCaseElement_HasCaseValue();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.language.st.Exit <em>Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exit</em>'.
	 * @see iec611313Specification.language.st.Exit
	 * @generated
	 */
	EClass getExit();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.language.st.For <em>For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For</em>'.
	 * @see iec611313Specification.language.st.For
	 * @generated
	 */
	EClass getFor();

	/**
	 * Returns the meta object for the reference '{@link iec611313Specification.language.st.For#getHasToExpression <em>Has To Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has To Expression</em>'.
	 * @see iec611313Specification.language.st.For#getHasToExpression()
	 * @see #getFor()
	 * @generated
	 */
	EReference getFor_HasToExpression();

	/**
	 * Returns the meta object for the reference '{@link iec611313Specification.language.st.For#getHasStepExpression <em>Has Step Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Step Expression</em>'.
	 * @see iec611313Specification.language.st.For#getHasStepExpression()
	 * @see #getFor()
	 * @generated
	 */
	EReference getFor_HasStepExpression();

	/**
	 * Returns the meta object for the reference '{@link iec611313Specification.language.st.For#getHasControlVariableAssignment <em>Has Control Variable Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Control Variable Assignment</em>'.
	 * @see iec611313Specification.language.st.For#getHasControlVariableAssignment()
	 * @see #getFor()
	 * @generated
	 */
	EReference getFor_HasControlVariableAssignment();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.language.st.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If</em>'.
	 * @see iec611313Specification.language.st.If
	 * @generated
	 */
	EClass getIf();

	/**
	 * Returns the meta object for the reference '{@link iec611313Specification.language.st.If#getHasIfCondition <em>Has If Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has If Condition</em>'.
	 * @see iec611313Specification.language.st.If#getHasIfCondition()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_HasIfCondition();

	/**
	 * Returns the meta object for the reference '{@link iec611313Specification.language.st.If#getHasElseIf <em>Has Else If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Else If</em>'.
	 * @see iec611313Specification.language.st.If#getHasElseIf()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_HasElseIf();

	/**
	 * Returns the meta object for the reference '{@link iec611313Specification.language.st.If#getHasElse <em>Has Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Else</em>'.
	 * @see iec611313Specification.language.st.If#getHasElse()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_HasElse();

	/**
	 * Returns the meta object for the reference '{@link iec611313Specification.language.st.If#getHasThen <em>Has Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Then</em>'.
	 * @see iec611313Specification.language.st.If#getHasThen()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_HasThen();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.language.st.Iteration <em>Iteration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iteration</em>'.
	 * @see iec611313Specification.language.st.Iteration
	 * @generated
	 */
	EClass getIteration();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.language.st.NilValue <em>Nil Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nil Value</em>'.
	 * @see iec611313Specification.language.st.NilValue
	 * @generated
	 */
	EClass getNilValue();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.language.st.Repeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repeat</em>'.
	 * @see iec611313Specification.language.st.Repeat
	 * @generated
	 */
	EClass getRepeat();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.language.st.Return <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return</em>'.
	 * @see iec611313Specification.language.st.Return
	 * @generated
	 */
	EClass getReturn();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.language.st.SimpleIteration <em>Simple Iteration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Iteration</em>'.
	 * @see iec611313Specification.language.st.SimpleIteration
	 * @generated
	 */
	EClass getSimpleIteration();

	/**
	 * Returns the meta object for the reference '{@link iec611313Specification.language.st.SimpleIteration#getHasIterationCondition <em>Has Iteration Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Iteration Condition</em>'.
	 * @see iec611313Specification.language.st.SimpleIteration#getHasIterationCondition()
	 * @see #getSimpleIteration()
	 * @generated
	 */
	EReference getSimpleIteration_HasIterationCondition();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.language.st.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see iec611313Specification.language.st.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.language.st.StatementList <em>Statement List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement List</em>'.
	 * @see iec611313Specification.language.st.StatementList
	 * @generated
	 */
	EClass getStatementList();

	/**
	 * Returns the meta object for the containment reference list '{@link iec611313Specification.language.st.StatementList#getContainsStatement <em>Contains Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Statement</em>'.
	 * @see iec611313Specification.language.st.StatementList#getContainsStatement()
	 * @see #getStatementList()
	 * @generated
	 */
	EReference getStatementList_ContainsStatement();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.language.st.While <em>While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While</em>'.
	 * @see iec611313Specification.language.st.While
	 * @generated
	 */
	EClass getWhile();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StFactory getStFactory();

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
		 * The meta object literal for the '{@link iec611313Specification.language.st.impl.CaseImpl <em>Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.language.st.impl.CaseImpl
		 * @see iec611313Specification.language.st.impl.StPackageImpl#getCase()
		 * @generated
		 */
		EClass CASE = eINSTANCE.getCase();

		/**
		 * The meta object literal for the '<em><b>Has Case Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE__HAS_CASE_EXPRESSION = eINSTANCE.getCase_HasCaseExpression();

		/**
		 * The meta object literal for the '<em><b>Contains Case Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE__CONTAINS_CASE_ELEMENT = eINSTANCE.getCase_ContainsCaseElement();

		/**
		 * The meta object literal for the '<em><b>Has Default Part</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE__HAS_DEFAULT_PART = eINSTANCE.getCase_HasDefaultPart();

		/**
		 * The meta object literal for the '{@link iec611313Specification.language.st.impl.CaseElementImpl <em>Case Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.language.st.impl.CaseElementImpl
		 * @see iec611313Specification.language.st.impl.StPackageImpl#getCaseElement()
		 * @generated
		 */
		EClass CASE_ELEMENT = eINSTANCE.getCaseElement();

		/**
		 * The meta object literal for the '<em><b>Has Case Element Matches Part</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_ELEMENT__HAS_CASE_ELEMENT_MATCHES_PART = eINSTANCE.getCaseElement_HasCaseElementMatchesPart();

		/**
		 * The meta object literal for the '<em><b>Has Case Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_ELEMENT__HAS_CASE_VALUE = eINSTANCE.getCaseElement_HasCaseValue();

		/**
		 * The meta object literal for the '{@link iec611313Specification.language.st.impl.ExitImpl <em>Exit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.language.st.impl.ExitImpl
		 * @see iec611313Specification.language.st.impl.StPackageImpl#getExit()
		 * @generated
		 */
		EClass EXIT = eINSTANCE.getExit();

		/**
		 * The meta object literal for the '{@link iec611313Specification.language.st.impl.ForImpl <em>For</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.language.st.impl.ForImpl
		 * @see iec611313Specification.language.st.impl.StPackageImpl#getFor()
		 * @generated
		 */
		EClass FOR = eINSTANCE.getFor();

		/**
		 * The meta object literal for the '<em><b>Has To Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR__HAS_TO_EXPRESSION = eINSTANCE.getFor_HasToExpression();

		/**
		 * The meta object literal for the '<em><b>Has Step Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR__HAS_STEP_EXPRESSION = eINSTANCE.getFor_HasStepExpression();

		/**
		 * The meta object literal for the '<em><b>Has Control Variable Assignment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR__HAS_CONTROL_VARIABLE_ASSIGNMENT = eINSTANCE.getFor_HasControlVariableAssignment();

		/**
		 * The meta object literal for the '{@link iec611313Specification.language.st.impl.IfImpl <em>If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.language.st.impl.IfImpl
		 * @see iec611313Specification.language.st.impl.StPackageImpl#getIf()
		 * @generated
		 */
		EClass IF = eINSTANCE.getIf();

		/**
		 * The meta object literal for the '<em><b>Has If Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__HAS_IF_CONDITION = eINSTANCE.getIf_HasIfCondition();

		/**
		 * The meta object literal for the '<em><b>Has Else If</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__HAS_ELSE_IF = eINSTANCE.getIf_HasElseIf();

		/**
		 * The meta object literal for the '<em><b>Has Else</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__HAS_ELSE = eINSTANCE.getIf_HasElse();

		/**
		 * The meta object literal for the '<em><b>Has Then</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__HAS_THEN = eINSTANCE.getIf_HasThen();

		/**
		 * The meta object literal for the '{@link iec611313Specification.language.st.impl.IterationImpl <em>Iteration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.language.st.impl.IterationImpl
		 * @see iec611313Specification.language.st.impl.StPackageImpl#getIteration()
		 * @generated
		 */
		EClass ITERATION = eINSTANCE.getIteration();

		/**
		 * The meta object literal for the '{@link iec611313Specification.language.st.impl.NilValueImpl <em>Nil Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.language.st.impl.NilValueImpl
		 * @see iec611313Specification.language.st.impl.StPackageImpl#getNilValue()
		 * @generated
		 */
		EClass NIL_VALUE = eINSTANCE.getNilValue();

		/**
		 * The meta object literal for the '{@link iec611313Specification.language.st.impl.RepeatImpl <em>Repeat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.language.st.impl.RepeatImpl
		 * @see iec611313Specification.language.st.impl.StPackageImpl#getRepeat()
		 * @generated
		 */
		EClass REPEAT = eINSTANCE.getRepeat();

		/**
		 * The meta object literal for the '{@link iec611313Specification.language.st.impl.ReturnImpl <em>Return</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.language.st.impl.ReturnImpl
		 * @see iec611313Specification.language.st.impl.StPackageImpl#getReturn()
		 * @generated
		 */
		EClass RETURN = eINSTANCE.getReturn();

		/**
		 * The meta object literal for the '{@link iec611313Specification.language.st.impl.SimpleIterationImpl <em>Simple Iteration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.language.st.impl.SimpleIterationImpl
		 * @see iec611313Specification.language.st.impl.StPackageImpl#getSimpleIteration()
		 * @generated
		 */
		EClass SIMPLE_ITERATION = eINSTANCE.getSimpleIteration();

		/**
		 * The meta object literal for the '<em><b>Has Iteration Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_ITERATION__HAS_ITERATION_CONDITION = eINSTANCE.getSimpleIteration_HasIterationCondition();

		/**
		 * The meta object literal for the '{@link iec611313Specification.language.st.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.language.st.impl.StatementImpl
		 * @see iec611313Specification.language.st.impl.StPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link iec611313Specification.language.st.impl.StatementListImpl <em>Statement List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.language.st.impl.StatementListImpl
		 * @see iec611313Specification.language.st.impl.StPackageImpl#getStatementList()
		 * @generated
		 */
		EClass STATEMENT_LIST = eINSTANCE.getStatementList();

		/**
		 * The meta object literal for the '<em><b>Contains Statement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_LIST__CONTAINS_STATEMENT = eINSTANCE.getStatementList_ContainsStatement();

		/**
		 * The meta object literal for the '{@link iec611313Specification.language.st.impl.WhileImpl <em>While</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.language.st.impl.WhileImpl
		 * @see iec611313Specification.language.st.impl.StPackageImpl#getWhile()
		 * @generated
		 */
		EClass WHILE = eINSTANCE.getWhile();

	}

} //StPackage
