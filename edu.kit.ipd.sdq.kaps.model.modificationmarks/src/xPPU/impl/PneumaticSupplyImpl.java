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

import xPPU.Interface;
import xPPU.PneumaticSupply;
import xPPU.XPPUPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pneumatic Supply</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xPPU.impl.PneumaticSupplyImpl#getIntefacePart <em>Inteface Part</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PneumaticSupplyImpl extends EObjectImpl implements PneumaticSupply {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PneumaticSupplyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XPPUPackage.Literals.PNEUMATIC_SUPPLY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getIntefacePart() {
		if (eContainerFeatureID() != XPPUPackage.PNEUMATIC_SUPPLY__INTEFACE_PART) return null;
		return (Interface)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntefacePart(Interface newIntefacePart, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newIntefacePart, XPPUPackage.PNEUMATIC_SUPPLY__INTEFACE_PART, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntefacePart(Interface newIntefacePart) {
		if (newIntefacePart != eInternalContainer() || (eContainerFeatureID() != XPPUPackage.PNEUMATIC_SUPPLY__INTEFACE_PART && newIntefacePart != null)) {
			if (EcoreUtil.isAncestor(this, newIntefacePart))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newIntefacePart != null)
				msgs = ((InternalEObject)newIntefacePart).eInverseAdd(this, XPPUPackage.INTERFACE__PNEUMATICSUPPLYS, Interface.class, msgs);
			msgs = basicSetIntefacePart(newIntefacePart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XPPUPackage.PNEUMATIC_SUPPLY__INTEFACE_PART, newIntefacePart, newIntefacePart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XPPUPackage.PNEUMATIC_SUPPLY__INTEFACE_PART:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetIntefacePart((Interface)otherEnd, msgs);
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
			case XPPUPackage.PNEUMATIC_SUPPLY__INTEFACE_PART:
				return basicSetIntefacePart(null, msgs);
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
			case XPPUPackage.PNEUMATIC_SUPPLY__INTEFACE_PART:
				return eInternalContainer().eInverseRemove(this, XPPUPackage.INTERFACE__PNEUMATICSUPPLYS, Interface.class, msgs);
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
			case XPPUPackage.PNEUMATIC_SUPPLY__INTEFACE_PART:
				return getIntefacePart();
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
			case XPPUPackage.PNEUMATIC_SUPPLY__INTEFACE_PART:
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
			case XPPUPackage.PNEUMATIC_SUPPLY__INTEFACE_PART:
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
			case XPPUPackage.PNEUMATIC_SUPPLY__INTEFACE_PART:
				return getIntefacePart() != null;
		}
		return super.eIsSet(featureID);
	}

} //PneumaticSupplyImpl
