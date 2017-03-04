/**
 */
package xPPU.InterfaceRepository.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import xPPU.InterfaceRepository.Interface;
import xPPU.InterfaceRepository.InterfaceRepositoryPackage;
import xPPU.InterfaceRepository.TransportConnection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transport Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xPPU.InterfaceRepository.impl.TransportConnectionImpl#getIntefacePart <em>Inteface Part</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransportConnectionImpl extends InterfaceImpl implements TransportConnection {
	/**
	 * The cached value of the '{@link #getIntefacePart() <em>Inteface Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntefacePart()
	 * @generated
	 * @ordered
	 */
	protected Interface intefacePart;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransportConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InterfaceRepositoryPackage.Literals.TRANSPORT_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getIntefacePart() {
		if (intefacePart != null && intefacePart.eIsProxy()) {
			InternalEObject oldIntefacePart = (InternalEObject)intefacePart;
			intefacePart = (Interface)eResolveProxy(oldIntefacePart);
			if (intefacePart != oldIntefacePart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InterfaceRepositoryPackage.TRANSPORT_CONNECTION__INTEFACE_PART, oldIntefacePart, intefacePart));
			}
		}
		return intefacePart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface basicGetIntefacePart() {
		return intefacePart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntefacePart(Interface newIntefacePart) {
		Interface oldIntefacePart = intefacePart;
		intefacePart = newIntefacePart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InterfaceRepositoryPackage.TRANSPORT_CONNECTION__INTEFACE_PART, oldIntefacePart, intefacePart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InterfaceRepositoryPackage.TRANSPORT_CONNECTION__INTEFACE_PART:
				if (resolve) return getIntefacePart();
				return basicGetIntefacePart();
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
			case InterfaceRepositoryPackage.TRANSPORT_CONNECTION__INTEFACE_PART:
				setIntefacePart((Interface)newValue);
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
			case InterfaceRepositoryPackage.TRANSPORT_CONNECTION__INTEFACE_PART:
				setIntefacePart((Interface)null);
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
			case InterfaceRepositoryPackage.TRANSPORT_CONNECTION__INTEFACE_PART:
				return intefacePart != null;
		}
		return super.eIsSet(featureID);
	}

} //TransportConnectionImpl
