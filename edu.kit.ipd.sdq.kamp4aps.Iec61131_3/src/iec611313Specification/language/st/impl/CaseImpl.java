/**
 */
package iec611313Specification.language.st.impl;

import iec611313Specification.common.Expression;

import iec611313Specification.language.st.Case;
import iec611313Specification.language.st.CaseElement;
import iec611313Specification.language.st.StPackage;
import iec611313Specification.language.st.StatementList;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.language.st.impl.CaseImpl#getHasCaseExpression <em>Has Case Expression</em>}</li>
 *   <li>{@link iec611313Specification.language.st.impl.CaseImpl#getContainsCaseElement <em>Contains Case Element</em>}</li>
 *   <li>{@link iec611313Specification.language.st.impl.CaseImpl#getHasDefaultPart <em>Has Default Part</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CaseImpl extends StatementImpl implements Case {
	/**
	 * The cached value of the '{@link #getHasCaseExpression() <em>Has Case Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasCaseExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression hasCaseExpression;

	/**
	 * The cached value of the '{@link #getContainsCaseElement() <em>Contains Case Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsCaseElement()
	 * @generated
	 * @ordered
	 */
	protected EList<CaseElement> containsCaseElement;

	/**
	 * The cached value of the '{@link #getHasDefaultPart() <em>Has Default Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasDefaultPart()
	 * @generated
	 * @ordered
	 */
	protected StatementList hasDefaultPart;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StPackage.Literals.CASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getHasCaseExpression() {
		if (hasCaseExpression != null && hasCaseExpression.eIsProxy()) {
			InternalEObject oldHasCaseExpression = (InternalEObject)hasCaseExpression;
			hasCaseExpression = (Expression)eResolveProxy(oldHasCaseExpression);
			if (hasCaseExpression != oldHasCaseExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StPackage.CASE__HAS_CASE_EXPRESSION, oldHasCaseExpression, hasCaseExpression));
			}
		}
		return hasCaseExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetHasCaseExpression() {
		return hasCaseExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasCaseExpression(Expression newHasCaseExpression) {
		Expression oldHasCaseExpression = hasCaseExpression;
		hasCaseExpression = newHasCaseExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StPackage.CASE__HAS_CASE_EXPRESSION, oldHasCaseExpression, hasCaseExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CaseElement> getContainsCaseElement() {
		if (containsCaseElement == null) {
			containsCaseElement = new EObjectContainmentEList<CaseElement>(CaseElement.class, this, StPackage.CASE__CONTAINS_CASE_ELEMENT);
		}
		return containsCaseElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementList getHasDefaultPart() {
		if (hasDefaultPart != null && hasDefaultPart.eIsProxy()) {
			InternalEObject oldHasDefaultPart = (InternalEObject)hasDefaultPart;
			hasDefaultPart = (StatementList)eResolveProxy(oldHasDefaultPart);
			if (hasDefaultPart != oldHasDefaultPart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StPackage.CASE__HAS_DEFAULT_PART, oldHasDefaultPart, hasDefaultPart));
			}
		}
		return hasDefaultPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementList basicGetHasDefaultPart() {
		return hasDefaultPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasDefaultPart(StatementList newHasDefaultPart) {
		StatementList oldHasDefaultPart = hasDefaultPart;
		hasDefaultPart = newHasDefaultPart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StPackage.CASE__HAS_DEFAULT_PART, oldHasDefaultPart, hasDefaultPart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StPackage.CASE__CONTAINS_CASE_ELEMENT:
				return ((InternalEList<?>)getContainsCaseElement()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StPackage.CASE__HAS_CASE_EXPRESSION:
				if (resolve) return getHasCaseExpression();
				return basicGetHasCaseExpression();
			case StPackage.CASE__CONTAINS_CASE_ELEMENT:
				return getContainsCaseElement();
			case StPackage.CASE__HAS_DEFAULT_PART:
				if (resolve) return getHasDefaultPart();
				return basicGetHasDefaultPart();
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
			case StPackage.CASE__HAS_CASE_EXPRESSION:
				setHasCaseExpression((Expression)newValue);
				return;
			case StPackage.CASE__CONTAINS_CASE_ELEMENT:
				getContainsCaseElement().clear();
				getContainsCaseElement().addAll((Collection<? extends CaseElement>)newValue);
				return;
			case StPackage.CASE__HAS_DEFAULT_PART:
				setHasDefaultPart((StatementList)newValue);
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
			case StPackage.CASE__HAS_CASE_EXPRESSION:
				setHasCaseExpression((Expression)null);
				return;
			case StPackage.CASE__CONTAINS_CASE_ELEMENT:
				getContainsCaseElement().clear();
				return;
			case StPackage.CASE__HAS_DEFAULT_PART:
				setHasDefaultPart((StatementList)null);
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
			case StPackage.CASE__HAS_CASE_EXPRESSION:
				return hasCaseExpression != null;
			case StPackage.CASE__CONTAINS_CASE_ELEMENT:
				return containsCaseElement != null && !containsCaseElement.isEmpty();
			case StPackage.CASE__HAS_DEFAULT_PART:
				return hasDefaultPart != null;
		}
		return super.eIsSet(featureID);
	}

} //CaseImpl
