/**
 */
package iec611313Specification.language.st.impl;

import iec611313Specification.common.Expression;

import iec611313Specification.language.st.SimpleIteration;
import iec611313Specification.language.st.StPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Iteration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.language.st.impl.SimpleIterationImpl#getHasIterationCondition <em>Has Iteration Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SimpleIterationImpl extends IterationImpl implements SimpleIteration {
	/**
	 * The cached value of the '{@link #getHasIterationCondition() <em>Has Iteration Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasIterationCondition()
	 * @generated
	 * @ordered
	 */
	protected Expression hasIterationCondition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleIterationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StPackage.Literals.SIMPLE_ITERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getHasIterationCondition() {
		if (hasIterationCondition != null && hasIterationCondition.eIsProxy()) {
			InternalEObject oldHasIterationCondition = (InternalEObject)hasIterationCondition;
			hasIterationCondition = (Expression)eResolveProxy(oldHasIterationCondition);
			if (hasIterationCondition != oldHasIterationCondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StPackage.SIMPLE_ITERATION__HAS_ITERATION_CONDITION, oldHasIterationCondition, hasIterationCondition));
			}
		}
		return hasIterationCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetHasIterationCondition() {
		return hasIterationCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasIterationCondition(Expression newHasIterationCondition) {
		Expression oldHasIterationCondition = hasIterationCondition;
		hasIterationCondition = newHasIterationCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StPackage.SIMPLE_ITERATION__HAS_ITERATION_CONDITION, oldHasIterationCondition, hasIterationCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StPackage.SIMPLE_ITERATION__HAS_ITERATION_CONDITION:
				if (resolve) return getHasIterationCondition();
				return basicGetHasIterationCondition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StPackage.SIMPLE_ITERATION__HAS_ITERATION_CONDITION:
				setHasIterationCondition((Expression)newValue);
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
			case StPackage.SIMPLE_ITERATION__HAS_ITERATION_CONDITION:
				setHasIterationCondition((Expression)null);
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
			case StPackage.SIMPLE_ITERATION__HAS_ITERATION_CONDITION:
				return hasIterationCondition != null;
		}
		return super.eIsSet(featureID);
	}

} //SimpleIterationImpl
