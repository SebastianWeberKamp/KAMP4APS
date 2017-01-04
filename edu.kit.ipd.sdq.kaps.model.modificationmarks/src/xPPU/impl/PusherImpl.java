/**
 */
package xPPU.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import xPPU.Components;
import xPPU.Pusher;
import xPPU.XPPUPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pusher</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xPPU.impl.PusherImpl#getComponentsRepository <em>Components Repository</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PusherImpl extends EObjectImpl implements Pusher {
	/**
	 * The cached value of the '{@link #getComponentsRepository() <em>Components Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentsRepository()
	 * @generated
	 * @ordered
	 */
	protected Components componentsRepository;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PusherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XPPUPackage.Literals.PUSHER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Components getComponentsRepository() {
		if (componentsRepository != null && componentsRepository.eIsProxy()) {
			InternalEObject oldComponentsRepository = (InternalEObject)componentsRepository;
			componentsRepository = (Components)eResolveProxy(oldComponentsRepository);
			if (componentsRepository != oldComponentsRepository) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XPPUPackage.PUSHER__COMPONENTS_REPOSITORY, oldComponentsRepository, componentsRepository));
			}
		}
		return componentsRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Components basicGetComponentsRepository() {
		return componentsRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentsRepository(Components newComponentsRepository, NotificationChain msgs) {
		Components oldComponentsRepository = componentsRepository;
		componentsRepository = newComponentsRepository;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPPUPackage.PUSHER__COMPONENTS_REPOSITORY, oldComponentsRepository, newComponentsRepository);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentsRepository(Components newComponentsRepository) {
		if (newComponentsRepository != componentsRepository) {
			NotificationChain msgs = null;
			if (componentsRepository != null)
				msgs = ((InternalEObject)componentsRepository).eInverseRemove(this, XPPUPackage.COMPONENTS__PUSHERS, Components.class, msgs);
			if (newComponentsRepository != null)
				msgs = ((InternalEObject)newComponentsRepository).eInverseAdd(this, XPPUPackage.COMPONENTS__PUSHERS, Components.class, msgs);
			msgs = basicSetComponentsRepository(newComponentsRepository, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XPPUPackage.PUSHER__COMPONENTS_REPOSITORY, newComponentsRepository, newComponentsRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XPPUPackage.PUSHER__COMPONENTS_REPOSITORY:
				if (componentsRepository != null)
					msgs = ((InternalEObject)componentsRepository).eInverseRemove(this, XPPUPackage.COMPONENTS__PUSHERS, Components.class, msgs);
				return basicSetComponentsRepository((Components)otherEnd, msgs);
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
			case XPPUPackage.PUSHER__COMPONENTS_REPOSITORY:
				return basicSetComponentsRepository(null, msgs);
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
			case XPPUPackage.PUSHER__COMPONENTS_REPOSITORY:
				if (resolve) return getComponentsRepository();
				return basicGetComponentsRepository();
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
			case XPPUPackage.PUSHER__COMPONENTS_REPOSITORY:
				setComponentsRepository((Components)newValue);
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
			case XPPUPackage.PUSHER__COMPONENTS_REPOSITORY:
				setComponentsRepository((Components)null);
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
			case XPPUPackage.PUSHER__COMPONENTS_REPOSITORY:
				return componentsRepository != null;
		}
		return super.eIsSet(featureID);
	}

} //PusherImpl
