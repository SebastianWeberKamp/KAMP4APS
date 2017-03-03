/**
 */
package iec611313Specification.language.fbd.impl;

import iec611313Specification.common.Expression;

import iec611313Specification.language.fbd.FbdPackage;
import iec611313Specification.language.fbd.SignalFlowLine;
import iec611313Specification.language.fbd.SignalSink;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal Flow Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.language.fbd.impl.SignalFlowLineImpl#getHasSignalSink <em>Has Signal Sink</em>}</li>
 *   <li>{@link iec611313Specification.language.fbd.impl.SignalFlowLineImpl#getHasSignalSource <em>Has Signal Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SignalFlowLineImpl extends MinimalEObjectImpl.Container implements SignalFlowLine {
	/**
	 * The cached value of the '{@link #getHasSignalSink() <em>Has Signal Sink</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasSignalSink()
	 * @generated
	 * @ordered
	 */
	protected EList<SignalSink> hasSignalSink;

	/**
	 * The cached value of the '{@link #getHasSignalSource() <em>Has Signal Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasSignalSource()
	 * @generated
	 * @ordered
	 */
	protected Expression hasSignalSource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalFlowLineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FbdPackage.Literals.SIGNAL_FLOW_LINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SignalSink> getHasSignalSink() {
		if (hasSignalSink == null) {
			hasSignalSink = new EObjectResolvingEList<SignalSink>(SignalSink.class, this, FbdPackage.SIGNAL_FLOW_LINE__HAS_SIGNAL_SINK);
		}
		return hasSignalSink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getHasSignalSource() {
		if (hasSignalSource != null && hasSignalSource.eIsProxy()) {
			InternalEObject oldHasSignalSource = (InternalEObject)hasSignalSource;
			hasSignalSource = (Expression)eResolveProxy(oldHasSignalSource);
			if (hasSignalSource != oldHasSignalSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FbdPackage.SIGNAL_FLOW_LINE__HAS_SIGNAL_SOURCE, oldHasSignalSource, hasSignalSource));
			}
		}
		return hasSignalSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetHasSignalSource() {
		return hasSignalSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasSignalSource(Expression newHasSignalSource) {
		Expression oldHasSignalSource = hasSignalSource;
		hasSignalSource = newHasSignalSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FbdPackage.SIGNAL_FLOW_LINE__HAS_SIGNAL_SOURCE, oldHasSignalSource, hasSignalSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FbdPackage.SIGNAL_FLOW_LINE__HAS_SIGNAL_SINK:
				return getHasSignalSink();
			case FbdPackage.SIGNAL_FLOW_LINE__HAS_SIGNAL_SOURCE:
				if (resolve) return getHasSignalSource();
				return basicGetHasSignalSource();
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
			case FbdPackage.SIGNAL_FLOW_LINE__HAS_SIGNAL_SINK:
				getHasSignalSink().clear();
				getHasSignalSink().addAll((Collection<? extends SignalSink>)newValue);
				return;
			case FbdPackage.SIGNAL_FLOW_LINE__HAS_SIGNAL_SOURCE:
				setHasSignalSource((Expression)newValue);
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
			case FbdPackage.SIGNAL_FLOW_LINE__HAS_SIGNAL_SINK:
				getHasSignalSink().clear();
				return;
			case FbdPackage.SIGNAL_FLOW_LINE__HAS_SIGNAL_SOURCE:
				setHasSignalSource((Expression)null);
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
			case FbdPackage.SIGNAL_FLOW_LINE__HAS_SIGNAL_SINK:
				return hasSignalSink != null && !hasSignalSink.isEmpty();
			case FbdPackage.SIGNAL_FLOW_LINE__HAS_SIGNAL_SOURCE:
				return hasSignalSource != null;
		}
		return super.eIsSet(featureID);
	}

} //SignalFlowLineImpl
