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

import xPPU.Conveyor;
import xPPU.ConveyorBelt;
import xPPU.XPPUPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conveyor Belt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xPPU.impl.ConveyorBeltImpl#getMountedTo <em>Mounted To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConveyorBeltImpl extends EObjectImpl implements ConveyorBelt {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConveyorBeltImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XPPUPackage.Literals.CONVEYOR_BELT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conveyor getMountedTo() {
		if (eContainerFeatureID() != XPPUPackage.CONVEYOR_BELT__MOUNTED_TO) return null;
		return (Conveyor)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMountedTo(Conveyor newMountedTo, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMountedTo, XPPUPackage.CONVEYOR_BELT__MOUNTED_TO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMountedTo(Conveyor newMountedTo) {
		if (newMountedTo != eInternalContainer() || (eContainerFeatureID() != XPPUPackage.CONVEYOR_BELT__MOUNTED_TO && newMountedTo != null)) {
			if (EcoreUtil.isAncestor(this, newMountedTo))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMountedTo != null)
				msgs = ((InternalEObject)newMountedTo).eInverseAdd(this, XPPUPackage.CONVEYOR__BELTS, Conveyor.class, msgs);
			msgs = basicSetMountedTo(newMountedTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XPPUPackage.CONVEYOR_BELT__MOUNTED_TO, newMountedTo, newMountedTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XPPUPackage.CONVEYOR_BELT__MOUNTED_TO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMountedTo((Conveyor)otherEnd, msgs);
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
			case XPPUPackage.CONVEYOR_BELT__MOUNTED_TO:
				return basicSetMountedTo(null, msgs);
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
			case XPPUPackage.CONVEYOR_BELT__MOUNTED_TO:
				return eInternalContainer().eInverseRemove(this, XPPUPackage.CONVEYOR__BELTS, Conveyor.class, msgs);
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
			case XPPUPackage.CONVEYOR_BELT__MOUNTED_TO:
				return getMountedTo();
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
			case XPPUPackage.CONVEYOR_BELT__MOUNTED_TO:
				setMountedTo((Conveyor)newValue);
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
			case XPPUPackage.CONVEYOR_BELT__MOUNTED_TO:
				setMountedTo((Conveyor)null);
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
			case XPPUPackage.CONVEYOR_BELT__MOUNTED_TO:
				return getMountedTo() != null;
		}
		return super.eIsSet(featureID);
	}

} //ConveyorBeltImpl
