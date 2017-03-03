/**
 */
package iec611313Specification.language.il.impl;

import iec611313Specification.common.Expression;

import iec611313Specification.language.il.IlPackage;
import iec611313Specification.language.il.SimpleInstruction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.language.il.impl.SimpleInstructionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link iec611313Specification.language.il.impl.SimpleInstructionImpl#getHasOperand <em>Has Operand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleInstructionImpl extends InstructionImpl implements SimpleInstruction {
	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected String operator = OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasOperand() <em>Has Operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasOperand()
	 * @generated
	 * @ordered
	 */
	protected Expression hasOperand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleInstructionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IlPackage.Literals.SIMPLE_INSTRUCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(String newOperator) {
		String oldOperator = operator;
		operator = newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IlPackage.SIMPLE_INSTRUCTION__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getHasOperand() {
		if (hasOperand != null && hasOperand.eIsProxy()) {
			InternalEObject oldHasOperand = (InternalEObject)hasOperand;
			hasOperand = (Expression)eResolveProxy(oldHasOperand);
			if (hasOperand != oldHasOperand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IlPackage.SIMPLE_INSTRUCTION__HAS_OPERAND, oldHasOperand, hasOperand));
			}
		}
		return hasOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetHasOperand() {
		return hasOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasOperand(Expression newHasOperand) {
		Expression oldHasOperand = hasOperand;
		hasOperand = newHasOperand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IlPackage.SIMPLE_INSTRUCTION__HAS_OPERAND, oldHasOperand, hasOperand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IlPackage.SIMPLE_INSTRUCTION__OPERATOR:
				return getOperator();
			case IlPackage.SIMPLE_INSTRUCTION__HAS_OPERAND:
				if (resolve) return getHasOperand();
				return basicGetHasOperand();
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
			case IlPackage.SIMPLE_INSTRUCTION__OPERATOR:
				setOperator((String)newValue);
				return;
			case IlPackage.SIMPLE_INSTRUCTION__HAS_OPERAND:
				setHasOperand((Expression)newValue);
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
			case IlPackage.SIMPLE_INSTRUCTION__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case IlPackage.SIMPLE_INSTRUCTION__HAS_OPERAND:
				setHasOperand((Expression)null);
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
			case IlPackage.SIMPLE_INSTRUCTION__OPERATOR:
				return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
			case IlPackage.SIMPLE_INSTRUCTION__HAS_OPERAND:
				return hasOperand != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //SimpleInstructionImpl
