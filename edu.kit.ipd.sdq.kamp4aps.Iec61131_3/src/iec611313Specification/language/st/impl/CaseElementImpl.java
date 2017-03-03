/**
 */
package iec611313Specification.language.st.impl;

import iec611313Specification.common.Literal;

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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.language.st.impl.CaseElementImpl#getHasCaseElementMatchesPart <em>Has Case Element Matches Part</em>}</li>
 *   <li>{@link iec611313Specification.language.st.impl.CaseElementImpl#getHasCaseValue <em>Has Case Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CaseElementImpl extends MinimalEObjectImpl.Container implements CaseElement {
	/**
	 * The cached value of the '{@link #getHasCaseElementMatchesPart() <em>Has Case Element Matches Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasCaseElementMatchesPart()
	 * @generated
	 * @ordered
	 */
	protected StatementList hasCaseElementMatchesPart;

	/**
	 * The cached value of the '{@link #getHasCaseValue() <em>Has Case Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasCaseValue()
	 * @generated
	 * @ordered
	 */
	protected EList<Literal> hasCaseValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CaseElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StPackage.Literals.CASE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementList getHasCaseElementMatchesPart() {
		if (hasCaseElementMatchesPart != null && hasCaseElementMatchesPart.eIsProxy()) {
			InternalEObject oldHasCaseElementMatchesPart = (InternalEObject)hasCaseElementMatchesPart;
			hasCaseElementMatchesPart = (StatementList)eResolveProxy(oldHasCaseElementMatchesPart);
			if (hasCaseElementMatchesPart != oldHasCaseElementMatchesPart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StPackage.CASE_ELEMENT__HAS_CASE_ELEMENT_MATCHES_PART, oldHasCaseElementMatchesPart, hasCaseElementMatchesPart));
			}
		}
		return hasCaseElementMatchesPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementList basicGetHasCaseElementMatchesPart() {
		return hasCaseElementMatchesPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasCaseElementMatchesPart(StatementList newHasCaseElementMatchesPart) {
		StatementList oldHasCaseElementMatchesPart = hasCaseElementMatchesPart;
		hasCaseElementMatchesPart = newHasCaseElementMatchesPart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StPackage.CASE_ELEMENT__HAS_CASE_ELEMENT_MATCHES_PART, oldHasCaseElementMatchesPart, hasCaseElementMatchesPart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Literal> getHasCaseValue() {
		if (hasCaseValue == null) {
			hasCaseValue = new EObjectContainmentEList<Literal>(Literal.class, this, StPackage.CASE_ELEMENT__HAS_CASE_VALUE);
		}
		return hasCaseValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StPackage.CASE_ELEMENT__HAS_CASE_VALUE:
				return ((InternalEList<?>)getHasCaseValue()).basicRemove(otherEnd, msgs);
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
			case StPackage.CASE_ELEMENT__HAS_CASE_ELEMENT_MATCHES_PART:
				if (resolve) return getHasCaseElementMatchesPart();
				return basicGetHasCaseElementMatchesPart();
			case StPackage.CASE_ELEMENT__HAS_CASE_VALUE:
				return getHasCaseValue();
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
			case StPackage.CASE_ELEMENT__HAS_CASE_ELEMENT_MATCHES_PART:
				setHasCaseElementMatchesPart((StatementList)newValue);
				return;
			case StPackage.CASE_ELEMENT__HAS_CASE_VALUE:
				getHasCaseValue().clear();
				getHasCaseValue().addAll((Collection<? extends Literal>)newValue);
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
			case StPackage.CASE_ELEMENT__HAS_CASE_ELEMENT_MATCHES_PART:
				setHasCaseElementMatchesPart((StatementList)null);
				return;
			case StPackage.CASE_ELEMENT__HAS_CASE_VALUE:
				getHasCaseValue().clear();
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
			case StPackage.CASE_ELEMENT__HAS_CASE_ELEMENT_MATCHES_PART:
				return hasCaseElementMatchesPart != null;
			case StPackage.CASE_ELEMENT__HAS_CASE_VALUE:
				return hasCaseValue != null && !hasCaseValue.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CaseElementImpl
