/**
 */
package iec611313Specification.language.st.impl;

import iec611313Specification.common.Assignment;
import iec611313Specification.common.Expression;

import iec611313Specification.language.st.For;
import iec611313Specification.language.st.StPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.language.st.impl.ForImpl#getHasToExpression <em>Has To Expression</em>}</li>
 *   <li>{@link iec611313Specification.language.st.impl.ForImpl#getHasStepExpression <em>Has Step Expression</em>}</li>
 *   <li>{@link iec611313Specification.language.st.impl.ForImpl#getHasControlVariableAssignment <em>Has Control Variable Assignment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForImpl extends IterationImpl implements For {
	/**
	 * The cached value of the '{@link #getHasToExpression() <em>Has To Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasToExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression hasToExpression;

	/**
	 * The cached value of the '{@link #getHasStepExpression() <em>Has Step Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasStepExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression hasStepExpression;

	/**
	 * The cached value of the '{@link #getHasControlVariableAssignment() <em>Has Control Variable Assignment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasControlVariableAssignment()
	 * @generated
	 * @ordered
	 */
	protected Assignment hasControlVariableAssignment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StPackage.Literals.FOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getHasToExpression() {
		if (hasToExpression != null && hasToExpression.eIsProxy()) {
			InternalEObject oldHasToExpression = (InternalEObject)hasToExpression;
			hasToExpression = (Expression)eResolveProxy(oldHasToExpression);
			if (hasToExpression != oldHasToExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StPackage.FOR__HAS_TO_EXPRESSION, oldHasToExpression, hasToExpression));
			}
		}
		return hasToExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetHasToExpression() {
		return hasToExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasToExpression(Expression newHasToExpression) {
		Expression oldHasToExpression = hasToExpression;
		hasToExpression = newHasToExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StPackage.FOR__HAS_TO_EXPRESSION, oldHasToExpression, hasToExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getHasStepExpression() {
		if (hasStepExpression != null && hasStepExpression.eIsProxy()) {
			InternalEObject oldHasStepExpression = (InternalEObject)hasStepExpression;
			hasStepExpression = (Expression)eResolveProxy(oldHasStepExpression);
			if (hasStepExpression != oldHasStepExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StPackage.FOR__HAS_STEP_EXPRESSION, oldHasStepExpression, hasStepExpression));
			}
		}
		return hasStepExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetHasStepExpression() {
		return hasStepExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasStepExpression(Expression newHasStepExpression) {
		Expression oldHasStepExpression = hasStepExpression;
		hasStepExpression = newHasStepExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StPackage.FOR__HAS_STEP_EXPRESSION, oldHasStepExpression, hasStepExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignment getHasControlVariableAssignment() {
		if (hasControlVariableAssignment != null && hasControlVariableAssignment.eIsProxy()) {
			InternalEObject oldHasControlVariableAssignment = (InternalEObject)hasControlVariableAssignment;
			hasControlVariableAssignment = (Assignment)eResolveProxy(oldHasControlVariableAssignment);
			if (hasControlVariableAssignment != oldHasControlVariableAssignment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StPackage.FOR__HAS_CONTROL_VARIABLE_ASSIGNMENT, oldHasControlVariableAssignment, hasControlVariableAssignment));
			}
		}
		return hasControlVariableAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignment basicGetHasControlVariableAssignment() {
		return hasControlVariableAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasControlVariableAssignment(Assignment newHasControlVariableAssignment) {
		Assignment oldHasControlVariableAssignment = hasControlVariableAssignment;
		hasControlVariableAssignment = newHasControlVariableAssignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StPackage.FOR__HAS_CONTROL_VARIABLE_ASSIGNMENT, oldHasControlVariableAssignment, hasControlVariableAssignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StPackage.FOR__HAS_TO_EXPRESSION:
				if (resolve) return getHasToExpression();
				return basicGetHasToExpression();
			case StPackage.FOR__HAS_STEP_EXPRESSION:
				if (resolve) return getHasStepExpression();
				return basicGetHasStepExpression();
			case StPackage.FOR__HAS_CONTROL_VARIABLE_ASSIGNMENT:
				if (resolve) return getHasControlVariableAssignment();
				return basicGetHasControlVariableAssignment();
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
			case StPackage.FOR__HAS_TO_EXPRESSION:
				setHasToExpression((Expression)newValue);
				return;
			case StPackage.FOR__HAS_STEP_EXPRESSION:
				setHasStepExpression((Expression)newValue);
				return;
			case StPackage.FOR__HAS_CONTROL_VARIABLE_ASSIGNMENT:
				setHasControlVariableAssignment((Assignment)newValue);
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
			case StPackage.FOR__HAS_TO_EXPRESSION:
				setHasToExpression((Expression)null);
				return;
			case StPackage.FOR__HAS_STEP_EXPRESSION:
				setHasStepExpression((Expression)null);
				return;
			case StPackage.FOR__HAS_CONTROL_VARIABLE_ASSIGNMENT:
				setHasControlVariableAssignment((Assignment)null);
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
			case StPackage.FOR__HAS_TO_EXPRESSION:
				return hasToExpression != null;
			case StPackage.FOR__HAS_STEP_EXPRESSION:
				return hasStepExpression != null;
			case StPackage.FOR__HAS_CONTROL_VARIABLE_ASSIGNMENT:
				return hasControlVariableAssignment != null;
		}
		return super.eIsSet(featureID);
	}

} //ForImpl
