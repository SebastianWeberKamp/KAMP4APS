/**
 */
package xPPU.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import xPPU.BusSlave;
import xPPU.Components;
import xPPU.SignalInterface;
import xPPU.XPPUPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bus Slave</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xPPU.impl.BusSlaveImpl#getSignalinterface_master <em>Signalinterface master</em>}</li>
 *   <li>{@link xPPU.impl.BusSlaveImpl#getSignalinterface_slave <em>Signalinterface slave</em>}</li>
 *   <li>{@link xPPU.impl.BusSlaveImpl#getComponentRepository <em>Component Repository</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusSlaveImpl extends EObjectImpl implements BusSlave {
	/**
	 * The cached value of the '{@link #getSignalinterface_master() <em>Signalinterface master</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalinterface_master()
	 * @generated
	 * @ordered
	 */
	protected SignalInterface signalinterface_master;

	/**
	 * The cached value of the '{@link #getSignalinterface_slave() <em>Signalinterface slave</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalinterface_slave()
	 * @generated
	 * @ordered
	 */
	protected SignalInterface signalinterface_slave;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusSlaveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XPPUPackage.Literals.BUS_SLAVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalInterface getSignalinterface_master() {
		if (signalinterface_master != null && signalinterface_master.eIsProxy()) {
			InternalEObject oldSignalinterface_master = (InternalEObject)signalinterface_master;
			signalinterface_master = (SignalInterface)eResolveProxy(oldSignalinterface_master);
			if (signalinterface_master != oldSignalinterface_master) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XPPUPackage.BUS_SLAVE__SIGNALINTERFACE_MASTER, oldSignalinterface_master, signalinterface_master));
			}
		}
		return signalinterface_master;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalInterface basicGetSignalinterface_master() {
		return signalinterface_master;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignalinterface_master(SignalInterface newSignalinterface_master) {
		SignalInterface oldSignalinterface_master = signalinterface_master;
		signalinterface_master = newSignalinterface_master;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XPPUPackage.BUS_SLAVE__SIGNALINTERFACE_MASTER, oldSignalinterface_master, signalinterface_master));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalInterface getSignalinterface_slave() {
		if (signalinterface_slave != null && signalinterface_slave.eIsProxy()) {
			InternalEObject oldSignalinterface_slave = (InternalEObject)signalinterface_slave;
			signalinterface_slave = (SignalInterface)eResolveProxy(oldSignalinterface_slave);
			if (signalinterface_slave != oldSignalinterface_slave) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XPPUPackage.BUS_SLAVE__SIGNALINTERFACE_SLAVE, oldSignalinterface_slave, signalinterface_slave));
			}
		}
		return signalinterface_slave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalInterface basicGetSignalinterface_slave() {
		return signalinterface_slave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignalinterface_slave(SignalInterface newSignalinterface_slave) {
		SignalInterface oldSignalinterface_slave = signalinterface_slave;
		signalinterface_slave = newSignalinterface_slave;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XPPUPackage.BUS_SLAVE__SIGNALINTERFACE_SLAVE, oldSignalinterface_slave, signalinterface_slave));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Components getComponentRepository() {
		if (eContainerFeatureID() != XPPUPackage.BUS_SLAVE__COMPONENT_REPOSITORY) return null;
		return (Components)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentRepository(Components newComponentRepository, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newComponentRepository, XPPUPackage.BUS_SLAVE__COMPONENT_REPOSITORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentRepository(Components newComponentRepository) {
		if (newComponentRepository != eInternalContainer() || (eContainerFeatureID() != XPPUPackage.BUS_SLAVE__COMPONENT_REPOSITORY && newComponentRepository != null)) {
			if (EcoreUtil.isAncestor(this, newComponentRepository))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newComponentRepository != null)
				msgs = ((InternalEObject)newComponentRepository).eInverseAdd(this, XPPUPackage.COMPONENTS__BUSSLAVES, Components.class, msgs);
			msgs = basicSetComponentRepository(newComponentRepository, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XPPUPackage.BUS_SLAVE__COMPONENT_REPOSITORY, newComponentRepository, newComponentRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XPPUPackage.BUS_SLAVE__COMPONENT_REPOSITORY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetComponentRepository((Components)otherEnd, msgs);
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
			case XPPUPackage.BUS_SLAVE__COMPONENT_REPOSITORY:
				return basicSetComponentRepository(null, msgs);
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
			case XPPUPackage.BUS_SLAVE__COMPONENT_REPOSITORY:
				return eInternalContainer().eInverseRemove(this, XPPUPackage.COMPONENTS__BUSSLAVES, Components.class, msgs);
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
			case XPPUPackage.BUS_SLAVE__SIGNALINTERFACE_MASTER:
				if (resolve) return getSignalinterface_master();
				return basicGetSignalinterface_master();
			case XPPUPackage.BUS_SLAVE__SIGNALINTERFACE_SLAVE:
				if (resolve) return getSignalinterface_slave();
				return basicGetSignalinterface_slave();
			case XPPUPackage.BUS_SLAVE__COMPONENT_REPOSITORY:
				return getComponentRepository();
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
			case XPPUPackage.BUS_SLAVE__SIGNALINTERFACE_MASTER:
				setSignalinterface_master((SignalInterface)newValue);
				return;
			case XPPUPackage.BUS_SLAVE__SIGNALINTERFACE_SLAVE:
				setSignalinterface_slave((SignalInterface)newValue);
				return;
			case XPPUPackage.BUS_SLAVE__COMPONENT_REPOSITORY:
				setComponentRepository((Components)newValue);
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
			case XPPUPackage.BUS_SLAVE__SIGNALINTERFACE_MASTER:
				setSignalinterface_master((SignalInterface)null);
				return;
			case XPPUPackage.BUS_SLAVE__SIGNALINTERFACE_SLAVE:
				setSignalinterface_slave((SignalInterface)null);
				return;
			case XPPUPackage.BUS_SLAVE__COMPONENT_REPOSITORY:
				setComponentRepository((Components)null);
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
			case XPPUPackage.BUS_SLAVE__SIGNALINTERFACE_MASTER:
				return signalinterface_master != null;
			case XPPUPackage.BUS_SLAVE__SIGNALINTERFACE_SLAVE:
				return signalinterface_slave != null;
			case XPPUPackage.BUS_SLAVE__COMPONENT_REPOSITORY:
				return getComponentRepository() != null;
		}
		return super.eIsSet(featureID);
	}

} //BusSlaveImpl
