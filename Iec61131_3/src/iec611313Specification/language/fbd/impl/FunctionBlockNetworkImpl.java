/**
 */
package iec611313Specification.language.fbd.impl;

import iec611313Specification.common.Label;

import iec611313Specification.language.fbd.FBDElement;
import iec611313Specification.language.fbd.FbdPackage;
import iec611313Specification.language.fbd.FunctionBlockNetwork;
import iec611313Specification.language.fbd.SignalFlowLine;

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
 * An implementation of the model object '<em><b>Function Block Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.language.fbd.impl.FunctionBlockNetworkImpl#getHasFBDNetworkLabel <em>Has FBD Network Label</em>}</li>
 *   <li>{@link iec611313Specification.language.fbd.impl.FunctionBlockNetworkImpl#getContainsFBDElement <em>Contains FBD Element</em>}</li>
 *   <li>{@link iec611313Specification.language.fbd.impl.FunctionBlockNetworkImpl#getContainsSignalFlowLine <em>Contains Signal Flow Line</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionBlockNetworkImpl extends MinimalEObjectImpl.Container implements FunctionBlockNetwork {
	/**
	 * The cached value of the '{@link #getHasFBDNetworkLabel() <em>Has FBD Network Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasFBDNetworkLabel()
	 * @generated
	 * @ordered
	 */
	protected Label hasFBDNetworkLabel;

	/**
	 * The cached value of the '{@link #getContainsFBDElement() <em>Contains FBD Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsFBDElement()
	 * @generated
	 * @ordered
	 */
	protected EList<FBDElement> containsFBDElement;

	/**
	 * The cached value of the '{@link #getContainsSignalFlowLine() <em>Contains Signal Flow Line</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsSignalFlowLine()
	 * @generated
	 * @ordered
	 */
	protected EList<SignalFlowLine> containsSignalFlowLine;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionBlockNetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FbdPackage.Literals.FUNCTION_BLOCK_NETWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label getHasFBDNetworkLabel() {
		if (hasFBDNetworkLabel != null && hasFBDNetworkLabel.eIsProxy()) {
			InternalEObject oldHasFBDNetworkLabel = (InternalEObject)hasFBDNetworkLabel;
			hasFBDNetworkLabel = (Label)eResolveProxy(oldHasFBDNetworkLabel);
			if (hasFBDNetworkLabel != oldHasFBDNetworkLabel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FbdPackage.FUNCTION_BLOCK_NETWORK__HAS_FBD_NETWORK_LABEL, oldHasFBDNetworkLabel, hasFBDNetworkLabel));
			}
		}
		return hasFBDNetworkLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label basicGetHasFBDNetworkLabel() {
		return hasFBDNetworkLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasFBDNetworkLabel(Label newHasFBDNetworkLabel) {
		Label oldHasFBDNetworkLabel = hasFBDNetworkLabel;
		hasFBDNetworkLabel = newHasFBDNetworkLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FbdPackage.FUNCTION_BLOCK_NETWORK__HAS_FBD_NETWORK_LABEL, oldHasFBDNetworkLabel, hasFBDNetworkLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FBDElement> getContainsFBDElement() {
		if (containsFBDElement == null) {
			containsFBDElement = new EObjectContainmentEList<FBDElement>(FBDElement.class, this, FbdPackage.FUNCTION_BLOCK_NETWORK__CONTAINS_FBD_ELEMENT);
		}
		return containsFBDElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SignalFlowLine> getContainsSignalFlowLine() {
		if (containsSignalFlowLine == null) {
			containsSignalFlowLine = new EObjectContainmentEList<SignalFlowLine>(SignalFlowLine.class, this, FbdPackage.FUNCTION_BLOCK_NETWORK__CONTAINS_SIGNAL_FLOW_LINE);
		}
		return containsSignalFlowLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FbdPackage.FUNCTION_BLOCK_NETWORK__CONTAINS_FBD_ELEMENT:
				return ((InternalEList<?>)getContainsFBDElement()).basicRemove(otherEnd, msgs);
			case FbdPackage.FUNCTION_BLOCK_NETWORK__CONTAINS_SIGNAL_FLOW_LINE:
				return ((InternalEList<?>)getContainsSignalFlowLine()).basicRemove(otherEnd, msgs);
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
			case FbdPackage.FUNCTION_BLOCK_NETWORK__HAS_FBD_NETWORK_LABEL:
				if (resolve) return getHasFBDNetworkLabel();
				return basicGetHasFBDNetworkLabel();
			case FbdPackage.FUNCTION_BLOCK_NETWORK__CONTAINS_FBD_ELEMENT:
				return getContainsFBDElement();
			case FbdPackage.FUNCTION_BLOCK_NETWORK__CONTAINS_SIGNAL_FLOW_LINE:
				return getContainsSignalFlowLine();
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
			case FbdPackage.FUNCTION_BLOCK_NETWORK__HAS_FBD_NETWORK_LABEL:
				setHasFBDNetworkLabel((Label)newValue);
				return;
			case FbdPackage.FUNCTION_BLOCK_NETWORK__CONTAINS_FBD_ELEMENT:
				getContainsFBDElement().clear();
				getContainsFBDElement().addAll((Collection<? extends FBDElement>)newValue);
				return;
			case FbdPackage.FUNCTION_BLOCK_NETWORK__CONTAINS_SIGNAL_FLOW_LINE:
				getContainsSignalFlowLine().clear();
				getContainsSignalFlowLine().addAll((Collection<? extends SignalFlowLine>)newValue);
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
			case FbdPackage.FUNCTION_BLOCK_NETWORK__HAS_FBD_NETWORK_LABEL:
				setHasFBDNetworkLabel((Label)null);
				return;
			case FbdPackage.FUNCTION_BLOCK_NETWORK__CONTAINS_FBD_ELEMENT:
				getContainsFBDElement().clear();
				return;
			case FbdPackage.FUNCTION_BLOCK_NETWORK__CONTAINS_SIGNAL_FLOW_LINE:
				getContainsSignalFlowLine().clear();
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
			case FbdPackage.FUNCTION_BLOCK_NETWORK__HAS_FBD_NETWORK_LABEL:
				return hasFBDNetworkLabel != null;
			case FbdPackage.FUNCTION_BLOCK_NETWORK__CONTAINS_FBD_ELEMENT:
				return containsFBDElement != null && !containsFBDElement.isEmpty();
			case FbdPackage.FUNCTION_BLOCK_NETWORK__CONTAINS_SIGNAL_FLOW_LINE:
				return containsSignalFlowLine != null && !containsSignalFlowLine.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FunctionBlockNetworkImpl
