/**
 */
package xPPU.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import xPPU.BusMaster;
import xPPU.Components;
import xPPU.SignalInterface;
import xPPU.XPPUPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bus Master</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xPPU.impl.BusMasterImpl#getSignalinterfaces <em>Signalinterfaces</em>}</li>
 *   <li>{@link xPPU.impl.BusMasterImpl#getSignalinterface_controller <em>Signalinterface controller</em>}</li>
 *   <li>{@link xPPU.impl.BusMasterImpl#getComponentRepostitory <em>Component Repostitory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusMasterImpl extends EObjectImpl implements BusMaster {
	/**
	 * The cached value of the '{@link #getSignalinterfaces() <em>Signalinterfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalinterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<SignalInterface> signalinterfaces;

	/**
	 * The cached value of the '{@link #getSignalinterface_controller() <em>Signalinterface controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalinterface_controller()
	 * @generated
	 * @ordered
	 */
	protected SignalInterface signalinterface_controller;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusMasterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XPPUPackage.Literals.BUS_MASTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SignalInterface> getSignalinterfaces() {
		if (signalinterfaces == null) {
			signalinterfaces = new EObjectResolvingEList<SignalInterface>(SignalInterface.class, this, XPPUPackage.BUS_MASTER__SIGNALINTERFACES);
		}
		return signalinterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalInterface getSignalinterface_controller() {
		if (signalinterface_controller != null && signalinterface_controller.eIsProxy()) {
			InternalEObject oldSignalinterface_controller = (InternalEObject)signalinterface_controller;
			signalinterface_controller = (SignalInterface)eResolveProxy(oldSignalinterface_controller);
			if (signalinterface_controller != oldSignalinterface_controller) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XPPUPackage.BUS_MASTER__SIGNALINTERFACE_CONTROLLER, oldSignalinterface_controller, signalinterface_controller));
			}
		}
		return signalinterface_controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalInterface basicGetSignalinterface_controller() {
		return signalinterface_controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignalinterface_controller(SignalInterface newSignalinterface_controller) {
		SignalInterface oldSignalinterface_controller = signalinterface_controller;
		signalinterface_controller = newSignalinterface_controller;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XPPUPackage.BUS_MASTER__SIGNALINTERFACE_CONTROLLER, oldSignalinterface_controller, signalinterface_controller));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Components getComponentRepostitory() {
		if (eContainerFeatureID() != XPPUPackage.BUS_MASTER__COMPONENT_REPOSTITORY) return null;
		return (Components)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentRepostitory(Components newComponentRepostitory, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newComponentRepostitory, XPPUPackage.BUS_MASTER__COMPONENT_REPOSTITORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentRepostitory(Components newComponentRepostitory) {
		if (newComponentRepostitory != eInternalContainer() || (eContainerFeatureID() != XPPUPackage.BUS_MASTER__COMPONENT_REPOSTITORY && newComponentRepostitory != null)) {
			if (EcoreUtil.isAncestor(this, newComponentRepostitory))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newComponentRepostitory != null)
				msgs = ((InternalEObject)newComponentRepostitory).eInverseAdd(this, XPPUPackage.COMPONENTS__BUSMASTERS, Components.class, msgs);
			msgs = basicSetComponentRepostitory(newComponentRepostitory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XPPUPackage.BUS_MASTER__COMPONENT_REPOSTITORY, newComponentRepostitory, newComponentRepostitory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XPPUPackage.BUS_MASTER__COMPONENT_REPOSTITORY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetComponentRepostitory((Components)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XPPUPackage.BUS_MASTER__COMPONENT_REPOSTITORY:
				return basicSetComponentRepostitory(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case XPPUPackage.BUS_MASTER__COMPONENT_REPOSTITORY:
				return eInternalContainer().eInverseRemove(this, XPPUPackage.COMPONENTS__BUSMASTERS, Components.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XPPUPackage.BUS_MASTER__SIGNALINTERFACES:
				return getSignalinterfaces();
			case XPPUPackage.BUS_MASTER__SIGNALINTERFACE_CONTROLLER:
				if (resolve) return getSignalinterface_controller();
				return basicGetSignalinterface_controller();
			case XPPUPackage.BUS_MASTER__COMPONENT_REPOSTITORY:
				return getComponentRepostitory();
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
			case XPPUPackage.BUS_MASTER__SIGNALINTERFACES:
				getSignalinterfaces().clear();
				getSignalinterfaces().addAll((Collection<? extends SignalInterface>)newValue);
				return;
			case XPPUPackage.BUS_MASTER__SIGNALINTERFACE_CONTROLLER:
				setSignalinterface_controller((SignalInterface)newValue);
				return;
			case XPPUPackage.BUS_MASTER__COMPONENT_REPOSTITORY:
				setComponentRepostitory((Components)newValue);
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
			case XPPUPackage.BUS_MASTER__SIGNALINTERFACES:
				getSignalinterfaces().clear();
				return;
			case XPPUPackage.BUS_MASTER__SIGNALINTERFACE_CONTROLLER:
				setSignalinterface_controller((SignalInterface)null);
				return;
			case XPPUPackage.BUS_MASTER__COMPONENT_REPOSTITORY:
				setComponentRepostitory((Components)null);
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
			case XPPUPackage.BUS_MASTER__SIGNALINTERFACES:
				return signalinterfaces != null && !signalinterfaces.isEmpty();
			case XPPUPackage.BUS_MASTER__SIGNALINTERFACE_CONTROLLER:
				return signalinterface_controller != null;
			case XPPUPackage.BUS_MASTER__COMPONENT_REPOSTITORY:
				return getComponentRepostitory() != null;
		}
		return super.eIsSet(featureID);
	}

} //BusMasterImpl
