/**
 */
package xPPU.ElectronicComponents.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import xPPU.ComponentRepository.impl.ComponentImpl;

import xPPU.ElectronicComponents.ElectronicComponentsPackage;
import xPPU.ElectronicComponents.ElectronicPart;

import xPPU.InterfaceRepository.PhysicalConnection;
import xPPU.InterfaceRepository.SignalInterface;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Electronic Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xPPU.ElectronicComponents.impl.ElectronicPartImpl#getPin <em>Pin</em>}</li>
 *   <li>{@link xPPU.ElectronicComponents.impl.ElectronicPartImpl#getPhysicalconnection <em>Physicalconnection</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ElectronicPartImpl extends ComponentImpl implements ElectronicPart {
	/**
	 * The cached value of the '{@link #getPin() <em>Pin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPin()
	 * @generated
	 * @ordered
	 */
	protected SignalInterface pin;

	/**
	 * The cached value of the '{@link #getPhysicalconnection() <em>Physicalconnection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalconnection()
	 * @generated
	 * @ordered
	 */
	protected PhysicalConnection physicalconnection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElectronicPartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElectronicComponentsPackage.Literals.ELECTRONIC_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalInterface getPin() {
		if (pin != null && pin.eIsProxy()) {
			InternalEObject oldPin = (InternalEObject)pin;
			pin = (SignalInterface)eResolveProxy(oldPin);
			if (pin != oldPin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ElectronicComponentsPackage.ELECTRONIC_PART__PIN, oldPin, pin));
			}
		}
		return pin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalInterface basicGetPin() {
		return pin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPin(SignalInterface newPin) {
		SignalInterface oldPin = pin;
		pin = newPin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElectronicComponentsPackage.ELECTRONIC_PART__PIN, oldPin, pin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalConnection getPhysicalconnection() {
		if (physicalconnection != null && physicalconnection.eIsProxy()) {
			InternalEObject oldPhysicalconnection = (InternalEObject)physicalconnection;
			physicalconnection = (PhysicalConnection)eResolveProxy(oldPhysicalconnection);
			if (physicalconnection != oldPhysicalconnection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ElectronicComponentsPackage.ELECTRONIC_PART__PHYSICALCONNECTION, oldPhysicalconnection, physicalconnection));
			}
		}
		return physicalconnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalConnection basicGetPhysicalconnection() {
		return physicalconnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysicalconnection(PhysicalConnection newPhysicalconnection) {
		PhysicalConnection oldPhysicalconnection = physicalconnection;
		physicalconnection = newPhysicalconnection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElectronicComponentsPackage.ELECTRONIC_PART__PHYSICALCONNECTION, oldPhysicalconnection, physicalconnection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ElectronicComponentsPackage.ELECTRONIC_PART__PIN:
				if (resolve) return getPin();
				return basicGetPin();
			case ElectronicComponentsPackage.ELECTRONIC_PART__PHYSICALCONNECTION:
				if (resolve) return getPhysicalconnection();
				return basicGetPhysicalconnection();
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
			case ElectronicComponentsPackage.ELECTRONIC_PART__PIN:
				setPin((SignalInterface)newValue);
				return;
			case ElectronicComponentsPackage.ELECTRONIC_PART__PHYSICALCONNECTION:
				setPhysicalconnection((PhysicalConnection)newValue);
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
			case ElectronicComponentsPackage.ELECTRONIC_PART__PIN:
				setPin((SignalInterface)null);
				return;
			case ElectronicComponentsPackage.ELECTRONIC_PART__PHYSICALCONNECTION:
				setPhysicalconnection((PhysicalConnection)null);
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
			case ElectronicComponentsPackage.ELECTRONIC_PART__PIN:
				return pin != null;
			case ElectronicComponentsPackage.ELECTRONIC_PART__PHYSICALCONNECTION:
				return physicalconnection != null;
		}
		return super.eIsSet(featureID);
	}

} //ElectronicPartImpl
