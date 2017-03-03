/**
 */
package iec611313Specification.common.util;

import iec611313Specification.common.*;

import iec611313Specification.common.pous.programs.ProgramConfigElement;

import iec611313Specification.language.fbd.SignalSink;

import iec611313Specification.language.ld.LDElement;

import iec611313Specification.language.st.Statement;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see iec611313Specification.common.CommonPackage
 * @generated
 */
public class CommonAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CommonPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CommonPackage.eINSTANCE;
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
	protected CommonSwitch<Adapter> modelSwitch =
		new CommonSwitch<Adapter>() {
			@Override
			public Adapter caseAssignment(Assignment object) {
				return createAssignmentAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseFormalParameterList(FormalParameterList object) {
				return createFormalParameterListAdapter();
			}
			@Override
			public Adapter caseJump(Jump object) {
				return createJumpAdapter();
			}
			@Override
			public Adapter caseLabel(Label object) {
				return createLabelAdapter();
			}
			@Override
			public Adapter caseLiteral(Literal object) {
				return createLiteralAdapter();
			}
			@Override
			public Adapter caseParameterList(ParameterList object) {
				return createParameterListAdapter();
			}
			@Override
			public Adapter casePositionalParameterList(PositionalParameterList object) {
				return createPositionalParameterListAdapter();
			}
			@Override
			public Adapter caseRange(Range object) {
				return createRangeAdapter();
			}
			@Override
			public Adapter caseProgramConfigElement(ProgramConfigElement object) {
				return createProgramConfigElementAdapter();
			}
			@Override
			public Adapter caseStatement(Statement object) {
				return createStatementAdapter();
			}
			@Override
			public Adapter caseSignalSink(SignalSink object) {
				return createSignalSinkAdapter();
			}
			@Override
			public Adapter caseLDElement(LDElement object) {
				return createLDElementAdapter();
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
	 * Creates a new adapter for an object of class '{@link iec611313Specification.common.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.common.Assignment
	 * @generated
	 */
	public Adapter createAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.common.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.common.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.common.FormalParameterList <em>Formal Parameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.common.FormalParameterList
	 * @generated
	 */
	public Adapter createFormalParameterListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.common.Jump <em>Jump</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.common.Jump
	 * @generated
	 */
	public Adapter createJumpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.common.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.common.Label
	 * @generated
	 */
	public Adapter createLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.common.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.common.Literal
	 * @generated
	 */
	public Adapter createLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.common.ParameterList <em>Parameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.common.ParameterList
	 * @generated
	 */
	public Adapter createParameterListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.common.PositionalParameterList <em>Positional Parameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.common.PositionalParameterList
	 * @generated
	 */
	public Adapter createPositionalParameterListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.common.Range <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.common.Range
	 * @generated
	 */
	public Adapter createRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.common.pous.programs.ProgramConfigElement <em>Program Config Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.common.pous.programs.ProgramConfigElement
	 * @generated
	 */
	public Adapter createProgramConfigElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.language.st.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.language.st.Statement
	 * @generated
	 */
	public Adapter createStatementAdapter() {
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
	 * Creates a new adapter for an object of class '{@link iec611313Specification.language.ld.LDElement <em>LD Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.language.ld.LDElement
	 * @generated
	 */
	public Adapter createLDElementAdapter() {
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

} //CommonAdapterFactory
