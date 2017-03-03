/**
 */
package iec611313Specification.language.sfc.impl;

import iec611313Specification.common.Expression;

import iec611313Specification.language.sfc.SfcPackage;
import iec611313Specification.language.sfc.Step;
import iec611313Specification.language.sfc.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.language.sfc.impl.TransitionImpl#getHasSourceStep <em>Has Source Step</em>}</li>
 *   <li>{@link iec611313Specification.language.sfc.impl.TransitionImpl#getHasTargetStep <em>Has Target Step</em>}</li>
 *   <li>{@link iec611313Specification.language.sfc.impl.TransitionImpl#getHasTransitionCondition <em>Has Transition Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition {
	/**
	 * The cached value of the '{@link #getHasSourceStep() <em>Has Source Step</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasSourceStep()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> hasSourceStep;

	/**
	 * The cached value of the '{@link #getHasTargetStep() <em>Has Target Step</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasTargetStep()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> hasTargetStep;

	/**
	 * The cached value of the '{@link #getHasTransitionCondition() <em>Has Transition Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasTransitionCondition()
	 * @generated
	 * @ordered
	 */
	protected Expression hasTransitionCondition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SfcPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Step> getHasSourceStep() {
		if (hasSourceStep == null) {
			hasSourceStep = new EObjectResolvingEList<Step>(Step.class, this, SfcPackage.TRANSITION__HAS_SOURCE_STEP);
		}
		return hasSourceStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Step> getHasTargetStep() {
		if (hasTargetStep == null) {
			hasTargetStep = new EObjectResolvingEList<Step>(Step.class, this, SfcPackage.TRANSITION__HAS_TARGET_STEP);
		}
		return hasTargetStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getHasTransitionCondition() {
		if (hasTransitionCondition != null && hasTransitionCondition.eIsProxy()) {
			InternalEObject oldHasTransitionCondition = (InternalEObject)hasTransitionCondition;
			hasTransitionCondition = (Expression)eResolveProxy(oldHasTransitionCondition);
			if (hasTransitionCondition != oldHasTransitionCondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SfcPackage.TRANSITION__HAS_TRANSITION_CONDITION, oldHasTransitionCondition, hasTransitionCondition));
			}
		}
		return hasTransitionCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetHasTransitionCondition() {
		return hasTransitionCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasTransitionCondition(Expression newHasTransitionCondition) {
		Expression oldHasTransitionCondition = hasTransitionCondition;
		hasTransitionCondition = newHasTransitionCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SfcPackage.TRANSITION__HAS_TRANSITION_CONDITION, oldHasTransitionCondition, hasTransitionCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SfcPackage.TRANSITION__HAS_SOURCE_STEP:
				return getHasSourceStep();
			case SfcPackage.TRANSITION__HAS_TARGET_STEP:
				return getHasTargetStep();
			case SfcPackage.TRANSITION__HAS_TRANSITION_CONDITION:
				if (resolve) return getHasTransitionCondition();
				return basicGetHasTransitionCondition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SfcPackage.TRANSITION__HAS_SOURCE_STEP:
				getHasSourceStep().clear();
				getHasSourceStep().addAll((Collection<? extends Step>)newValue);
				return;
			case SfcPackage.TRANSITION__HAS_TARGET_STEP:
				getHasTargetStep().clear();
				getHasTargetStep().addAll((Collection<? extends Step>)newValue);
				return;
			case SfcPackage.TRANSITION__HAS_TRANSITION_CONDITION:
				setHasTransitionCondition((Expression)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SfcPackage.TRANSITION__HAS_SOURCE_STEP:
				getHasSourceStep().clear();
				return;
			case SfcPackage.TRANSITION__HAS_TARGET_STEP:
				getHasTargetStep().clear();
				return;
			case SfcPackage.TRANSITION__HAS_TRANSITION_CONDITION:
				setHasTransitionCondition((Expression)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SfcPackage.TRANSITION__HAS_SOURCE_STEP:
				return hasSourceStep != null && !hasSourceStep.isEmpty();
			case SfcPackage.TRANSITION__HAS_TARGET_STEP:
				return hasTargetStep != null && !hasTargetStep.isEmpty();
			case SfcPackage.TRANSITION__HAS_TRANSITION_CONDITION:
				return hasTransitionCondition != null;
		}
		return super.eIsSet(featureID);
	}

} //TransitionImpl
