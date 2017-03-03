/**
 */
package iec611313Specification.language.ld.impl;

import iec611313Specification.common.Label;

import iec611313Specification.language.ld.LDElement;
import iec611313Specification.language.ld.LadderNetwork;
import iec611313Specification.language.ld.LdPackage;
import iec611313Specification.language.ld.PowerFlowLine;

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
 * An implementation of the model object '<em><b>Ladder Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.language.ld.impl.LadderNetworkImpl#getHasLDNetworkLabel <em>Has LD Network Label</em>}</li>
 *   <li>{@link iec611313Specification.language.ld.impl.LadderNetworkImpl#getContainsPowerFlowLine <em>Contains Power Flow Line</em>}</li>
 *   <li>{@link iec611313Specification.language.ld.impl.LadderNetworkImpl#getContainsLDElement <em>Contains LD Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LadderNetworkImpl extends MinimalEObjectImpl.Container implements LadderNetwork {
	/**
	 * The cached value of the '{@link #getHasLDNetworkLabel() <em>Has LD Network Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasLDNetworkLabel()
	 * @generated
	 * @ordered
	 */
	protected Label hasLDNetworkLabel;

	/**
	 * The cached value of the '{@link #getContainsPowerFlowLine() <em>Contains Power Flow Line</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsPowerFlowLine()
	 * @generated
	 * @ordered
	 */
	protected EList<PowerFlowLine> containsPowerFlowLine;

	/**
	 * The cached value of the '{@link #getContainsLDElement() <em>Contains LD Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsLDElement()
	 * @generated
	 * @ordered
	 */
	protected EList<LDElement> containsLDElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LadderNetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LdPackage.Literals.LADDER_NETWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label getHasLDNetworkLabel() {
		if (hasLDNetworkLabel != null && hasLDNetworkLabel.eIsProxy()) {
			InternalEObject oldHasLDNetworkLabel = (InternalEObject)hasLDNetworkLabel;
			hasLDNetworkLabel = (Label)eResolveProxy(oldHasLDNetworkLabel);
			if (hasLDNetworkLabel != oldHasLDNetworkLabel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LdPackage.LADDER_NETWORK__HAS_LD_NETWORK_LABEL, oldHasLDNetworkLabel, hasLDNetworkLabel));
			}
		}
		return hasLDNetworkLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label basicGetHasLDNetworkLabel() {
		return hasLDNetworkLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasLDNetworkLabel(Label newHasLDNetworkLabel) {
		Label oldHasLDNetworkLabel = hasLDNetworkLabel;
		hasLDNetworkLabel = newHasLDNetworkLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LdPackage.LADDER_NETWORK__HAS_LD_NETWORK_LABEL, oldHasLDNetworkLabel, hasLDNetworkLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PowerFlowLine> getContainsPowerFlowLine() {
		if (containsPowerFlowLine == null) {
			containsPowerFlowLine = new EObjectContainmentEList<PowerFlowLine>(PowerFlowLine.class, this, LdPackage.LADDER_NETWORK__CONTAINS_POWER_FLOW_LINE);
		}
		return containsPowerFlowLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LDElement> getContainsLDElement() {
		if (containsLDElement == null) {
			containsLDElement = new EObjectContainmentEList<LDElement>(LDElement.class, this, LdPackage.LADDER_NETWORK__CONTAINS_LD_ELEMENT);
		}
		return containsLDElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LdPackage.LADDER_NETWORK__CONTAINS_POWER_FLOW_LINE:
				return ((InternalEList<?>)getContainsPowerFlowLine()).basicRemove(otherEnd, msgs);
			case LdPackage.LADDER_NETWORK__CONTAINS_LD_ELEMENT:
				return ((InternalEList<?>)getContainsLDElement()).basicRemove(otherEnd, msgs);
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
			case LdPackage.LADDER_NETWORK__HAS_LD_NETWORK_LABEL:
				if (resolve) return getHasLDNetworkLabel();
				return basicGetHasLDNetworkLabel();
			case LdPackage.LADDER_NETWORK__CONTAINS_POWER_FLOW_LINE:
				return getContainsPowerFlowLine();
			case LdPackage.LADDER_NETWORK__CONTAINS_LD_ELEMENT:
				return getContainsLDElement();
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
			case LdPackage.LADDER_NETWORK__HAS_LD_NETWORK_LABEL:
				setHasLDNetworkLabel((Label)newValue);
				return;
			case LdPackage.LADDER_NETWORK__CONTAINS_POWER_FLOW_LINE:
				getContainsPowerFlowLine().clear();
				getContainsPowerFlowLine().addAll((Collection<? extends PowerFlowLine>)newValue);
				return;
			case LdPackage.LADDER_NETWORK__CONTAINS_LD_ELEMENT:
				getContainsLDElement().clear();
				getContainsLDElement().addAll((Collection<? extends LDElement>)newValue);
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
			case LdPackage.LADDER_NETWORK__HAS_LD_NETWORK_LABEL:
				setHasLDNetworkLabel((Label)null);
				return;
			case LdPackage.LADDER_NETWORK__CONTAINS_POWER_FLOW_LINE:
				getContainsPowerFlowLine().clear();
				return;
			case LdPackage.LADDER_NETWORK__CONTAINS_LD_ELEMENT:
				getContainsLDElement().clear();
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
			case LdPackage.LADDER_NETWORK__HAS_LD_NETWORK_LABEL:
				return hasLDNetworkLabel != null;
			case LdPackage.LADDER_NETWORK__CONTAINS_POWER_FLOW_LINE:
				return containsPowerFlowLine != null && !containsPowerFlowLine.isEmpty();
			case LdPackage.LADDER_NETWORK__CONTAINS_LD_ELEMENT:
				return containsLDElement != null && !containsLDElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LadderNetworkImpl
