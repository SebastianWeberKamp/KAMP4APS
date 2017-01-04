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

import xPPU.Modules;
import xPPU.PusherModule;
import xPPU.XPPUPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pusher Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xPPU.impl.PusherModuleImpl#getParentModuleContainer <em>Parent Module Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PusherModuleImpl extends EObjectImpl implements PusherModule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PusherModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XPPUPackage.Literals.PUSHER_MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modules getParentModuleContainer() {
		if (eContainerFeatureID() != XPPUPackage.PUSHER_MODULE__PARENT_MODULE_CONTAINER) return null;
		return (Modules)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentModuleContainer(Modules newParentModuleContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentModuleContainer, XPPUPackage.PUSHER_MODULE__PARENT_MODULE_CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentModuleContainer(Modules newParentModuleContainer) {
		if (newParentModuleContainer != eInternalContainer() || (eContainerFeatureID() != XPPUPackage.PUSHER_MODULE__PARENT_MODULE_CONTAINER && newParentModuleContainer != null)) {
			if (EcoreUtil.isAncestor(this, newParentModuleContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentModuleContainer != null)
				msgs = ((InternalEObject)newParentModuleContainer).eInverseAdd(this, XPPUPackage.MODULES__PUSHERMODULES, Modules.class, msgs);
			msgs = basicSetParentModuleContainer(newParentModuleContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XPPUPackage.PUSHER_MODULE__PARENT_MODULE_CONTAINER, newParentModuleContainer, newParentModuleContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XPPUPackage.PUSHER_MODULE__PARENT_MODULE_CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentModuleContainer((Modules)otherEnd, msgs);
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
			case XPPUPackage.PUSHER_MODULE__PARENT_MODULE_CONTAINER:
				return basicSetParentModuleContainer(null, msgs);
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
			case XPPUPackage.PUSHER_MODULE__PARENT_MODULE_CONTAINER:
				return eInternalContainer().eInverseRemove(this, XPPUPackage.MODULES__PUSHERMODULES, Modules.class, msgs);
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
			case XPPUPackage.PUSHER_MODULE__PARENT_MODULE_CONTAINER:
				return getParentModuleContainer();
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
			case XPPUPackage.PUSHER_MODULE__PARENT_MODULE_CONTAINER:
				setParentModuleContainer((Modules)newValue);
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
			case XPPUPackage.PUSHER_MODULE__PARENT_MODULE_CONTAINER:
				setParentModuleContainer((Modules)null);
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
			case XPPUPackage.PUSHER_MODULE__PARENT_MODULE_CONTAINER:
				return getParentModuleContainer() != null;
		}
		return super.eIsSet(featureID);
	}

} //PusherModuleImpl
