/**
 */
package iec611313Specification.language.il.impl;

import iec611313Specification.language.il.ComplexInstruction;
import iec611313Specification.language.il.IlPackage;
import iec611313Specification.language.il.InstructionList;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.language.il.impl.ComplexInstructionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link iec611313Specification.language.il.impl.ComplexInstructionImpl#getHasComplexOperand <em>Has Complex Operand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComplexInstructionImpl extends InstructionImpl implements ComplexInstruction {
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
	 * The cached value of the '{@link #getHasComplexOperand() <em>Has Complex Operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasComplexOperand()
	 * @generated
	 * @ordered
	 */
	protected InstructionList hasComplexOperand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplexInstructionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IlPackage.Literals.COMPLEX_INSTRUCTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IlPackage.COMPLEX_INSTRUCTION__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionList getHasComplexOperand() {
		if (hasComplexOperand != null && hasComplexOperand.eIsProxy()) {
			InternalEObject oldHasComplexOperand = (InternalEObject)hasComplexOperand;
			hasComplexOperand = (InstructionList)eResolveProxy(oldHasComplexOperand);
			if (hasComplexOperand != oldHasComplexOperand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IlPackage.COMPLEX_INSTRUCTION__HAS_COMPLEX_OPERAND, oldHasComplexOperand, hasComplexOperand));
			}
		}
		return hasComplexOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionList basicGetHasComplexOperand() {
		return hasComplexOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasComplexOperand(InstructionList newHasComplexOperand) {
		InstructionList oldHasComplexOperand = hasComplexOperand;
		hasComplexOperand = newHasComplexOperand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IlPackage.COMPLEX_INSTRUCTION__HAS_COMPLEX_OPERAND, oldHasComplexOperand, hasComplexOperand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IlPackage.COMPLEX_INSTRUCTION__OPERATOR:
				return getOperator();
			case IlPackage.COMPLEX_INSTRUCTION__HAS_COMPLEX_OPERAND:
				if (resolve) return getHasComplexOperand();
				return basicGetHasComplexOperand();
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
			case IlPackage.COMPLEX_INSTRUCTION__OPERATOR:
				setOperator((String)newValue);
				return;
			case IlPackage.COMPLEX_INSTRUCTION__HAS_COMPLEX_OPERAND:
				setHasComplexOperand((InstructionList)newValue);
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
			case IlPackage.COMPLEX_INSTRUCTION__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case IlPackage.COMPLEX_INSTRUCTION__HAS_COMPLEX_OPERAND:
				setHasComplexOperand((InstructionList)null);
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
			case IlPackage.COMPLEX_INSTRUCTION__OPERATOR:
				return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
			case IlPackage.COMPLEX_INSTRUCTION__HAS_COMPLEX_OPERAND:
				return hasComplexOperand != null;
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

} //ComplexInstructionImpl
