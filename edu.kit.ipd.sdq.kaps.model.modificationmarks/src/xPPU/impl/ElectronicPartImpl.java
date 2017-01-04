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
import xPPU.ElectronicPart;
import xPPU.PhysicalConnection;
import xPPU.SignalInterface;
import xPPU.XPPUPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Electronic Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xPPU.impl.ElectronicPartImpl#getPin <em>Pin</em>}</li>
 *   <li>{@link xPPU.impl.ElectronicPartImpl#getPhysicalconnection <em>Physicalconnection</em>}</li>
 *   <li>{@link xPPU.impl.ElectronicPartImpl#getComponentRepository <em>Component Repository</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ElectronicPartImpl extends EObjectImpl implements ElectronicPart {
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
	 * The cached value of the '{@link #getComponentRepository() <em>Component Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentRepository()
	 * @generated
	 * @ordered
	 */
	protected Components componentRepository;

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
		return XPPUPackage.Literals.ELECTRONIC_PART;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XPPUPackage.ELECTRONIC_PART__PIN, oldPin, pin));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XPPUPackage.ELECTRONIC_PART__PIN, oldPin, pin));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XPPUPackage.ELECTRONIC_PART__PHYSICALCONNECTION, oldPhysicalconnection, physicalconnection));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XPPUPackage.ELECTRONIC_PART__PHYSICALCONNECTION, oldPhysicalconnection, physicalconnection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Components getComponentRepository() {
		if (componentRepository != null && componentRepository.eIsProxy()) {
			InternalEObject oldComponentRepository = (InternalEObject)componentRepository;
			componentRepository = (Components)eResolveProxy(oldComponentRepository);
			if (componentRepository != oldComponentRepository) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XPPUPackage.ELECTRONIC_PART__COMPONENT_REPOSITORY, oldComponentRepository, componentRepository));
			}
		}
		return componentRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Components basicGetComponentRepository() {
		return componentRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentRepository(Components newComponentRepository, NotificationChain msgs) {
		Components oldComponentRepository = componentRepository;
		componentRepository = newComponentRepository;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPPUPackage.ELECTRONIC_PART__COMPONENT_REPOSITORY, oldComponentRepository, newComponentRepository);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentRepository(Components newComponentRepository) {
		if (newComponentRepository != componentRepository) {
			NotificationChain msgs = null;
			if (componentRepository != null)
				msgs = ((InternalEObject)componentRepository).eInverseRemove(this, XPPUPackage.COMPONENTS__ELECTRONIC_COMPONENTS, Components.class, msgs);
			if (newComponentRepository != null)
				msgs = ((InternalEObject)newComponentRepository).eInverseAdd(this, XPPUPackage.COMPONENTS__ELECTRONIC_COMPONENTS, Components.class, msgs);
			msgs = basicSetComponentRepository(newComponentRepository, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XPPUPackage.ELECTRONIC_PART__COMPONENT_REPOSITORY, newComponentRepository, newComponentRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XPPUPackage.ELECTRONIC_PART__COMPONENT_REPOSITORY:
				if (componentRepository != null)
					msgs = ((InternalEObject)componentRepository).eInverseRemove(this, XPPUPackage.COMPONENTS__ELECTRONIC_COMPONENTS, Components.class, msgs);
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
			case XPPUPackage.ELECTRONIC_PART__COMPONENT_REPOSITORY:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XPPUPackage.ELECTRONIC_PART__PIN:
				if (resolve) return getPin();
				return basicGetPin();
			case XPPUPackage.ELECTRONIC_PART__PHYSICALCONNECTION:
				if (resolve) return getPhysicalconnection();
				return basicGetPhysicalconnection();
			case XPPUPackage.ELECTRONIC_PART__COMPONENT_REPOSITORY:
				if (resolve) return getComponentRepository();
				return basicGetComponentRepository();
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
			case XPPUPackage.ELECTRONIC_PART__PIN:
				setPin((SignalInterface)newValue);
				return;
			case XPPUPackage.ELECTRONIC_PART__PHYSICALCONNECTION:
				setPhysicalconnection((PhysicalConnection)newValue);
				return;
			case XPPUPackage.ELECTRONIC_PART__COMPONENT_REPOSITORY:
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
			case XPPUPackage.ELECTRONIC_PART__PIN:
				setPin((SignalInterface)null);
				return;
			case XPPUPackage.ELECTRONIC_PART__PHYSICALCONNECTION:
				setPhysicalconnection((PhysicalConnection)null);
				return;
			case XPPUPackage.ELECTRONIC_PART__COMPONENT_REPOSITORY:
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
			case XPPUPackage.ELECTRONIC_PART__PIN:
				return pin != null;
			case XPPUPackage.ELECTRONIC_PART__PHYSICALCONNECTION:
				return physicalconnection != null;
			case XPPUPackage.ELECTRONIC_PART__COMPONENT_REPOSITORY:
				return componentRepository != null;
		}
		return super.eIsSet(featureID);
	}

} //ElectronicPartImpl
