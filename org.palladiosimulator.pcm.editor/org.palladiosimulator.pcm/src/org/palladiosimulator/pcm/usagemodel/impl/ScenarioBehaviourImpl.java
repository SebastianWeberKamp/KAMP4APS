/**
 * Copyright 2005-2009 by SDQ, IPD, University of Karlsruhe, Germany
 */
package org.palladiosimulator.pcm.usagemodel.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;
import org.palladiosimulator.pcm.usagemodel.AbstractUserAction;
import org.palladiosimulator.pcm.usagemodel.BranchTransition;
import org.palladiosimulator.pcm.usagemodel.Loop;
import org.palladiosimulator.pcm.usagemodel.ScenarioBehaviour;
import org.palladiosimulator.pcm.usagemodel.UsageScenario;
import org.palladiosimulator.pcm.usagemodel.UsagemodelPackage;
import org.palladiosimulator.pcm.usagemodel.util.UsagemodelValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Scenario Behaviour</b></em>
 * '. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.usagemodel.impl.ScenarioBehaviourImpl#getUsageScenario_SenarioBehaviour <em>Usage Scenario Senario Behaviour</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.usagemodel.impl.ScenarioBehaviourImpl#getBranchTransition_ScenarioBehaviour <em>Branch Transition Scenario Behaviour</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.usagemodel.impl.ScenarioBehaviourImpl#getLoop_ScenarioBehaviour <em>Loop Scenario Behaviour</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.usagemodel.impl.ScenarioBehaviourImpl#getActions_ScenarioBehaviour <em>Actions Scenario Behaviour</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScenarioBehaviourImpl extends EntityImpl implements ScenarioBehaviour {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2005-2015 by palladiosimulator.org";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioBehaviourImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsagemodelPackage.Literals.SCENARIO_BEHAVIOUR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UsageScenario getUsageScenario_SenarioBehaviour() {
		return (UsageScenario) eDynamicGet(UsagemodelPackage.SCENARIO_BEHAVIOUR__USAGE_SCENARIO_SENARIO_BEHAVIOUR,
				UsagemodelPackage.Literals.SCENARIO_BEHAVIOUR__USAGE_SCENARIO_SENARIO_BEHAVIOUR, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsageScenario_SenarioBehaviour(UsageScenario newUsageScenario_SenarioBehaviour,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newUsageScenario_SenarioBehaviour,
				UsagemodelPackage.SCENARIO_BEHAVIOUR__USAGE_SCENARIO_SENARIO_BEHAVIOUR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsageScenario_SenarioBehaviour(UsageScenario newUsageScenario_SenarioBehaviour) {
		eDynamicSet(UsagemodelPackage.SCENARIO_BEHAVIOUR__USAGE_SCENARIO_SENARIO_BEHAVIOUR,
				UsagemodelPackage.Literals.SCENARIO_BEHAVIOUR__USAGE_SCENARIO_SENARIO_BEHAVIOUR,
				newUsageScenario_SenarioBehaviour);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BranchTransition getBranchTransition_ScenarioBehaviour() {
		return (BranchTransition) eDynamicGet(
				UsagemodelPackage.SCENARIO_BEHAVIOUR__BRANCH_TRANSITION_SCENARIO_BEHAVIOUR,
				UsagemodelPackage.Literals.SCENARIO_BEHAVIOUR__BRANCH_TRANSITION_SCENARIO_BEHAVIOUR, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBranchTransition_ScenarioBehaviour(
			BranchTransition newBranchTransition_ScenarioBehaviour, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newBranchTransition_ScenarioBehaviour,
				UsagemodelPackage.SCENARIO_BEHAVIOUR__BRANCH_TRANSITION_SCENARIO_BEHAVIOUR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBranchTransition_ScenarioBehaviour(BranchTransition newBranchTransition_ScenarioBehaviour) {
		eDynamicSet(UsagemodelPackage.SCENARIO_BEHAVIOUR__BRANCH_TRANSITION_SCENARIO_BEHAVIOUR,
				UsagemodelPackage.Literals.SCENARIO_BEHAVIOUR__BRANCH_TRANSITION_SCENARIO_BEHAVIOUR,
				newBranchTransition_ScenarioBehaviour);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Loop getLoop_ScenarioBehaviour() {
		return (Loop) eDynamicGet(UsagemodelPackage.SCENARIO_BEHAVIOUR__LOOP_SCENARIO_BEHAVIOUR,
				UsagemodelPackage.Literals.SCENARIO_BEHAVIOUR__LOOP_SCENARIO_BEHAVIOUR, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoop_ScenarioBehaviour(Loop newLoop_ScenarioBehaviour, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newLoop_ScenarioBehaviour,
				UsagemodelPackage.SCENARIO_BEHAVIOUR__LOOP_SCENARIO_BEHAVIOUR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoop_ScenarioBehaviour(Loop newLoop_ScenarioBehaviour) {
		eDynamicSet(UsagemodelPackage.SCENARIO_BEHAVIOUR__LOOP_SCENARIO_BEHAVIOUR,
				UsagemodelPackage.Literals.SCENARIO_BEHAVIOUR__LOOP_SCENARIO_BEHAVIOUR, newLoop_ScenarioBehaviour);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public EList<AbstractUserAction> getActions_ScenarioBehaviour() {
		return (EList<AbstractUserAction>) eDynamicGet(UsagemodelPackage.SCENARIO_BEHAVIOUR__ACTIONS_SCENARIO_BEHAVIOUR,
				UsagemodelPackage.Literals.SCENARIO_BEHAVIOUR__ACTIONS_SCENARIO_BEHAVIOUR, true, true);
	}

	/**
	 * The cached OCL expression body for the '{@link #Exactlyonestart(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Exactlyonestart</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #Exactlyonestart(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String EXACTLYONESTART__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.actions_ScenarioBehaviour->select(s|s.oclIsTypeOf(Start))->size() = 1";
	/**
	 * The cached OCL invariant for the '{@link #Exactlyonestart(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Exactlyonestart</em>}' invariant operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #Exactlyonestart(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint EXACTLYONESTART__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean Exactlyonestart(DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (EXACTLYONESTART__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(UsagemodelPackage.Literals.SCENARIO_BEHAVIOUR);
			try {
				EXACTLYONESTART__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper
						.createInvariant(EXACTLYONESTART__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(EXACTLYONESTART__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(this)) {
			if (diagnostics != null) {
				diagnostics
						.add(new BasicDiagnostic(Diagnostic.ERROR, UsagemodelValidator.DIAGNOSTIC_SOURCE,
								UsagemodelValidator.SCENARIO_BEHAVIOUR__EXACTLYONESTART,
								EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic",
										new Object[] { "Exactlyonestart",
												EObjectValidator.getObjectLabel(this, context) }),
						new Object[] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #Exactlyonestop(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Exactlyonestop</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #Exactlyonestop(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String EXACTLYONESTOP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.actions_ScenarioBehaviour->select(s|s.oclIsTypeOf(Stop))->size() = 1";
	/**
	 * The cached OCL invariant for the '{@link #Exactlyonestop(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Exactlyonestop</em>}' invariant operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #Exactlyonestop(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint EXACTLYONESTOP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean Exactlyonestop(DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (EXACTLYONESTOP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(UsagemodelPackage.Literals.SCENARIO_BEHAVIOUR);
			try {
				EXACTLYONESTOP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper
						.createInvariant(EXACTLYONESTOP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(EXACTLYONESTOP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(this)) {
			if (diagnostics != null) {
				diagnostics
						.add(new BasicDiagnostic(Diagnostic.ERROR, UsagemodelValidator.DIAGNOSTIC_SOURCE,
								UsagemodelValidator.SCENARIO_BEHAVIOUR__EXACTLYONESTOP,
								EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic",
										new Object[] { "Exactlyonestop",
												EObjectValidator.getObjectLabel(this, context) }),
						new Object[] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #EachuseractionexceptStartandStopmusthaveapredecessorandsuccessor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Eachuseractionexcept Startand Stopmusthaveapredecessorandsuccessor</em>}' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #EachuseractionexceptStartandStopmusthaveapredecessorandsuccessor(org.eclipse.emf.common.util.DiagnosticChain,
	 *      java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String EACHUSERACTIONEXCEPT_STARTAND_STOPMUSTHAVEAPREDECESSORANDSUCCESSOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.actions_ScenarioBehaviour->select(s|not s.oclIsTypeOf(Start) and not s.oclIsTypeOf(Stop))->exists(a|a.oclAsType(AbstractUserAction).predecessor.oclIsUndefined()) and not self.actions_ScenarioBehaviour->select(s|not s.oclIsTypeOf(Start) and not s.oclIsTypeOf(Stop))->exists(a|a.oclAsType(AbstractUserAction).successor.oclIsUndefined())";
	/**
	 * The cached OCL invariant for the '{@link #EachuseractionexceptStartandStopmusthaveapredecessorandsuccessor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Eachuseractionexcept Startand Stopmusthaveapredecessorandsuccessor</em>}' invariant operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #EachuseractionexceptStartandStopmusthaveapredecessorandsuccessor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint EACHUSERACTIONEXCEPT_STARTAND_STOPMUSTHAVEAPREDECESSORANDSUCCESSOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean EachuseractionexceptStartandStopmusthaveapredecessorandsuccessor(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (EACHUSERACTIONEXCEPT_STARTAND_STOPMUSTHAVEAPREDECESSORANDSUCCESSOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(UsagemodelPackage.Literals.SCENARIO_BEHAVIOUR);
			try {
				EACHUSERACTIONEXCEPT_STARTAND_STOPMUSTHAVEAPREDECESSORANDSUCCESSOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper
						.createInvariant(
								EACHUSERACTIONEXCEPT_STARTAND_STOPMUSTHAVEAPREDECESSORANDSUCCESSOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV
				.createQuery(
						EACHUSERACTIONEXCEPT_STARTAND_STOPMUSTHAVEAPREDECESSORANDSUCCESSOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV)
				.check(this)) {
			if (diagnostics != null) {
				diagnostics
						.add(new BasicDiagnostic(Diagnostic.ERROR, UsagemodelValidator.DIAGNOSTIC_SOURCE,
								UsagemodelValidator.SCENARIO_BEHAVIOUR__EACHUSERACTIONEXCEPT_STARTAND_STOPMUSTHAVEAPREDECESSORANDSUCCESSOR,
								EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic",
										new Object[] {
												"EachuseractionexceptStartandStopmusthaveapredecessorandsuccessor",
												EObjectValidator.getObjectLabel(this, context) }),
						new Object[] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UsagemodelPackage.SCENARIO_BEHAVIOUR__USAGE_SCENARIO_SENARIO_BEHAVIOUR:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetUsageScenario_SenarioBehaviour((UsageScenario) otherEnd, msgs);
		case UsagemodelPackage.SCENARIO_BEHAVIOUR__BRANCH_TRANSITION_SCENARIO_BEHAVIOUR:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetBranchTransition_ScenarioBehaviour((BranchTransition) otherEnd, msgs);
		case UsagemodelPackage.SCENARIO_BEHAVIOUR__LOOP_SCENARIO_BEHAVIOUR:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetLoop_ScenarioBehaviour((Loop) otherEnd, msgs);
		case UsagemodelPackage.SCENARIO_BEHAVIOUR__ACTIONS_SCENARIO_BEHAVIOUR:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getActions_ScenarioBehaviour())
					.basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UsagemodelPackage.SCENARIO_BEHAVIOUR__USAGE_SCENARIO_SENARIO_BEHAVIOUR:
			return basicSetUsageScenario_SenarioBehaviour(null, msgs);
		case UsagemodelPackage.SCENARIO_BEHAVIOUR__BRANCH_TRANSITION_SCENARIO_BEHAVIOUR:
			return basicSetBranchTransition_ScenarioBehaviour(null, msgs);
		case UsagemodelPackage.SCENARIO_BEHAVIOUR__LOOP_SCENARIO_BEHAVIOUR:
			return basicSetLoop_ScenarioBehaviour(null, msgs);
		case UsagemodelPackage.SCENARIO_BEHAVIOUR__ACTIONS_SCENARIO_BEHAVIOUR:
			return ((InternalEList<?>) getActions_ScenarioBehaviour()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case UsagemodelPackage.SCENARIO_BEHAVIOUR__USAGE_SCENARIO_SENARIO_BEHAVIOUR:
			return eInternalContainer().eInverseRemove(this,
					UsagemodelPackage.USAGE_SCENARIO__SCENARIO_BEHAVIOUR_USAGE_SCENARIO, UsageScenario.class, msgs);
		case UsagemodelPackage.SCENARIO_BEHAVIOUR__BRANCH_TRANSITION_SCENARIO_BEHAVIOUR:
			return eInternalContainer().eInverseRemove(this,
					UsagemodelPackage.BRANCH_TRANSITION__BRANCHED_BEHAVIOUR_BRANCH_TRANSITION, BranchTransition.class,
					msgs);
		case UsagemodelPackage.SCENARIO_BEHAVIOUR__LOOP_SCENARIO_BEHAVIOUR:
			return eInternalContainer().eInverseRemove(this, UsagemodelPackage.LOOP__BODY_BEHAVIOUR_LOOP, Loop.class,
					msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UsagemodelPackage.SCENARIO_BEHAVIOUR__USAGE_SCENARIO_SENARIO_BEHAVIOUR:
			return getUsageScenario_SenarioBehaviour();
		case UsagemodelPackage.SCENARIO_BEHAVIOUR__BRANCH_TRANSITION_SCENARIO_BEHAVIOUR:
			return getBranchTransition_ScenarioBehaviour();
		case UsagemodelPackage.SCENARIO_BEHAVIOUR__LOOP_SCENARIO_BEHAVIOUR:
			return getLoop_ScenarioBehaviour();
		case UsagemodelPackage.SCENARIO_BEHAVIOUR__ACTIONS_SCENARIO_BEHAVIOUR:
			return getActions_ScenarioBehaviour();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case UsagemodelPackage.SCENARIO_BEHAVIOUR__USAGE_SCENARIO_SENARIO_BEHAVIOUR:
			setUsageScenario_SenarioBehaviour((UsageScenario) newValue);
			return;
		case UsagemodelPackage.SCENARIO_BEHAVIOUR__BRANCH_TRANSITION_SCENARIO_BEHAVIOUR:
			setBranchTransition_ScenarioBehaviour((BranchTransition) newValue);
			return;
		case UsagemodelPackage.SCENARIO_BEHAVIOUR__LOOP_SCENARIO_BEHAVIOUR:
			setLoop_ScenarioBehaviour((Loop) newValue);
			return;
		case UsagemodelPackage.SCENARIO_BEHAVIOUR__ACTIONS_SCENARIO_BEHAVIOUR:
			getActions_ScenarioBehaviour().clear();
			getActions_ScenarioBehaviour().addAll((Collection<? extends AbstractUserAction>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case UsagemodelPackage.SCENARIO_BEHAVIOUR__USAGE_SCENARIO_SENARIO_BEHAVIOUR:
			setUsageScenario_SenarioBehaviour((UsageScenario) null);
			return;
		case UsagemodelPackage.SCENARIO_BEHAVIOUR__BRANCH_TRANSITION_SCENARIO_BEHAVIOUR:
			setBranchTransition_ScenarioBehaviour((BranchTransition) null);
			return;
		case UsagemodelPackage.SCENARIO_BEHAVIOUR__LOOP_SCENARIO_BEHAVIOUR:
			setLoop_ScenarioBehaviour((Loop) null);
			return;
		case UsagemodelPackage.SCENARIO_BEHAVIOUR__ACTIONS_SCENARIO_BEHAVIOUR:
			getActions_ScenarioBehaviour().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case UsagemodelPackage.SCENARIO_BEHAVIOUR__USAGE_SCENARIO_SENARIO_BEHAVIOUR:
			return getUsageScenario_SenarioBehaviour() != null;
		case UsagemodelPackage.SCENARIO_BEHAVIOUR__BRANCH_TRANSITION_SCENARIO_BEHAVIOUR:
			return getBranchTransition_ScenarioBehaviour() != null;
		case UsagemodelPackage.SCENARIO_BEHAVIOUR__LOOP_SCENARIO_BEHAVIOUR:
			return getLoop_ScenarioBehaviour() != null;
		case UsagemodelPackage.SCENARIO_BEHAVIOUR__ACTIONS_SCENARIO_BEHAVIOUR:
			return !getActions_ScenarioBehaviour().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * The cached environment for evaluating OCL expressions.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final OCL EOCL_ENV = OCL.newInstance();

} // ScenarioBehaviourImpl
