/**
 */
package iec611313Specification.common.impl;

import iec611313Specification.common.Assignment;
import iec611313Specification.common.CommonPackage;
import iec611313Specification.common.Expression;

import iec611313Specification.common.pous.programs.impl.ProgramConfigElementImpl;

import iec611313Specification.common.variables.VariableAccess;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.common.impl.AssignmentImpl#getHasAssignmentExpression <em>Has Assignment Expression</em>}</li>
 *   <li>{@link iec611313Specification.common.impl.AssignmentImpl#getHasAssignmentVariable <em>Has Assignment Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssignmentImpl extends ProgramConfigElementImpl implements Assignment {
	/**
	 * The cached value of the '{@link #getHasAssignmentExpression() <em>Has Assignment Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasAssignmentExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression hasAssignmentExpression;

	/**
	 * The cached value of the '{@link #getHasAssignmentVariable() <em>Has Assignment Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasAssignmentVariable()
	 * @generated
	 * @ordered
	 */
	protected VariableAccess hasAssignmentVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getHasAssignmentExpression() {
		if (hasAssignmentExpression != null && hasAssignmentExpression.eIsProxy()) {
			InternalEObject oldHasAssignmentExpression = (InternalEObject)hasAssignmentExpression;
			hasAssignmentExpression = (Expression)eResolveProxy(oldHasAssignmentExpression);
			if (hasAssignmentExpression != oldHasAssignmentExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.ASSIGNMENT__HAS_ASSIGNMENT_EXPRESSION, oldHasAssignmentExpression, hasAssignmentExpression));
			}
		}
		return hasAssignmentExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetHasAssignmentExpression() {
		return hasAssignmentExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasAssignmentExpression(Expression newHasAssignmentExpression) {
		Expression oldHasAssignmentExpression = hasAssignmentExpression;
		hasAssignmentExpression = newHasAssignmentExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.ASSIGNMENT__HAS_ASSIGNMENT_EXPRESSION, oldHasAssignmentExpression, hasAssignmentExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableAccess getHasAssignmentVariable() {
		if (hasAssignmentVariable != null && hasAssignmentVariable.eIsProxy()) {
			InternalEObject oldHasAssignmentVariable = (InternalEObject)hasAssignmentVariable;
			hasAssignmentVariable = (VariableAccess)eResolveProxy(oldHasAssignmentVariable);
			if (hasAssignmentVariable != oldHasAssignmentVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.ASSIGNMENT__HAS_ASSIGNMENT_VARIABLE, oldHasAssignmentVariable, hasAssignmentVariable));
			}
		}
		return hasAssignmentVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableAccess basicGetHasAssignmentVariable() {
		return hasAssignmentVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasAssignmentVariable(VariableAccess newHasAssignmentVariable) {
		VariableAccess oldHasAssignmentVariable = hasAssignmentVariable;
		hasAssignmentVariable = newHasAssignmentVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.ASSIGNMENT__HAS_ASSIGNMENT_VARIABLE, oldHasAssignmentVariable, hasAssignmentVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommonPackage.ASSIGNMENT__HAS_ASSIGNMENT_EXPRESSION:
				if (resolve) return getHasAssignmentExpression();
				return basicGetHasAssignmentExpression();
			case CommonPackage.ASSIGNMENT__HAS_ASSIGNMENT_VARIABLE:
				if (resolve) return getHasAssignmentVariable();
				return basicGetHasAssignmentVariable();
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
			case CommonPackage.ASSIGNMENT__HAS_ASSIGNMENT_EXPRESSION:
				setHasAssignmentExpression((Expression)newValue);
				return;
			case CommonPackage.ASSIGNMENT__HAS_ASSIGNMENT_VARIABLE:
				setHasAssignmentVariable((VariableAccess)newValue);
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
			case CommonPackage.ASSIGNMENT__HAS_ASSIGNMENT_EXPRESSION:
				setHasAssignmentExpression((Expression)null);
				return;
			case CommonPackage.ASSIGNMENT__HAS_ASSIGNMENT_VARIABLE:
				setHasAssignmentVariable((VariableAccess)null);
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
			case CommonPackage.ASSIGNMENT__HAS_ASSIGNMENT_EXPRESSION:
				return hasAssignmentExpression != null;
			case CommonPackage.ASSIGNMENT__HAS_ASSIGNMENT_VARIABLE:
				return hasAssignmentVariable != null;
		}
		return super.eIsSet(featureID);
	}

} //AssignmentImpl
