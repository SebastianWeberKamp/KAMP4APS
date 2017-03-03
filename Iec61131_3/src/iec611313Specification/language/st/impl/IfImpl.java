/**
 */
package iec611313Specification.language.st.impl;

import iec611313Specification.common.Expression;

import iec611313Specification.language.st.If;
import iec611313Specification.language.st.StPackage;
import iec611313Specification.language.st.StatementList;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.language.st.impl.IfImpl#getHasIfCondition <em>Has If Condition</em>}</li>
 *   <li>{@link iec611313Specification.language.st.impl.IfImpl#getHasElseIf <em>Has Else If</em>}</li>
 *   <li>{@link iec611313Specification.language.st.impl.IfImpl#getHasElse <em>Has Else</em>}</li>
 *   <li>{@link iec611313Specification.language.st.impl.IfImpl#getHasThen <em>Has Then</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfImpl extends StatementImpl implements If {
	/**
	 * The cached value of the '{@link #getHasIfCondition() <em>Has If Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasIfCondition()
	 * @generated
	 * @ordered
	 */
	protected Expression hasIfCondition;

	/**
	 * The cached value of the '{@link #getHasElseIf() <em>Has Else If</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasElseIf()
	 * @generated
	 * @ordered
	 */
	protected If hasElseIf;

	/**
	 * The cached value of the '{@link #getHasElse() <em>Has Else</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasElse()
	 * @generated
	 * @ordered
	 */
	protected StatementList hasElse;

	/**
	 * The cached value of the '{@link #getHasThen() <em>Has Then</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasThen()
	 * @generated
	 * @ordered
	 */
	protected StatementList hasThen;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StPackage.Literals.IF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getHasIfCondition() {
		if (hasIfCondition != null && hasIfCondition.eIsProxy()) {
			InternalEObject oldHasIfCondition = (InternalEObject)hasIfCondition;
			hasIfCondition = (Expression)eResolveProxy(oldHasIfCondition);
			if (hasIfCondition != oldHasIfCondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StPackage.IF__HAS_IF_CONDITION, oldHasIfCondition, hasIfCondition));
			}
		}
		return hasIfCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetHasIfCondition() {
		return hasIfCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasIfCondition(Expression newHasIfCondition) {
		Expression oldHasIfCondition = hasIfCondition;
		hasIfCondition = newHasIfCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StPackage.IF__HAS_IF_CONDITION, oldHasIfCondition, hasIfCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public If getHasElseIf() {
		if (hasElseIf != null && hasElseIf.eIsProxy()) {
			InternalEObject oldHasElseIf = (InternalEObject)hasElseIf;
			hasElseIf = (If)eResolveProxy(oldHasElseIf);
			if (hasElseIf != oldHasElseIf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StPackage.IF__HAS_ELSE_IF, oldHasElseIf, hasElseIf));
			}
		}
		return hasElseIf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public If basicGetHasElseIf() {
		return hasElseIf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasElseIf(If newHasElseIf) {
		If oldHasElseIf = hasElseIf;
		hasElseIf = newHasElseIf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StPackage.IF__HAS_ELSE_IF, oldHasElseIf, hasElseIf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementList getHasElse() {
		if (hasElse != null && hasElse.eIsProxy()) {
			InternalEObject oldHasElse = (InternalEObject)hasElse;
			hasElse = (StatementList)eResolveProxy(oldHasElse);
			if (hasElse != oldHasElse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StPackage.IF__HAS_ELSE, oldHasElse, hasElse));
			}
		}
		return hasElse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementList basicGetHasElse() {
		return hasElse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasElse(StatementList newHasElse) {
		StatementList oldHasElse = hasElse;
		hasElse = newHasElse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StPackage.IF__HAS_ELSE, oldHasElse, hasElse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementList getHasThen() {
		if (hasThen != null && hasThen.eIsProxy()) {
			InternalEObject oldHasThen = (InternalEObject)hasThen;
			hasThen = (StatementList)eResolveProxy(oldHasThen);
			if (hasThen != oldHasThen) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StPackage.IF__HAS_THEN, oldHasThen, hasThen));
			}
		}
		return hasThen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementList basicGetHasThen() {
		return hasThen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasThen(StatementList newHasThen) {
		StatementList oldHasThen = hasThen;
		hasThen = newHasThen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StPackage.IF__HAS_THEN, oldHasThen, hasThen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StPackage.IF__HAS_IF_CONDITION:
				if (resolve) return getHasIfCondition();
				return basicGetHasIfCondition();
			case StPackage.IF__HAS_ELSE_IF:
				if (resolve) return getHasElseIf();
				return basicGetHasElseIf();
			case StPackage.IF__HAS_ELSE:
				if (resolve) return getHasElse();
				return basicGetHasElse();
			case StPackage.IF__HAS_THEN:
				if (resolve) return getHasThen();
				return basicGetHasThen();
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
			case StPackage.IF__HAS_IF_CONDITION:
				setHasIfCondition((Expression)newValue);
				return;
			case StPackage.IF__HAS_ELSE_IF:
				setHasElseIf((If)newValue);
				return;
			case StPackage.IF__HAS_ELSE:
				setHasElse((StatementList)newValue);
				return;
			case StPackage.IF__HAS_THEN:
				setHasThen((StatementList)newValue);
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
			case StPackage.IF__HAS_IF_CONDITION:
				setHasIfCondition((Expression)null);
				return;
			case StPackage.IF__HAS_ELSE_IF:
				setHasElseIf((If)null);
				return;
			case StPackage.IF__HAS_ELSE:
				setHasElse((StatementList)null);
				return;
			case StPackage.IF__HAS_THEN:
				setHasThen((StatementList)null);
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
			case StPackage.IF__HAS_IF_CONDITION:
				return hasIfCondition != null;
			case StPackage.IF__HAS_ELSE_IF:
				return hasElseIf != null;
			case StPackage.IF__HAS_ELSE:
				return hasElse != null;
			case StPackage.IF__HAS_THEN:
				return hasThen != null;
		}
		return super.eIsSet(featureID);
	}

} //IfImpl
