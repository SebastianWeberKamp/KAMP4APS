/**
 */
package xPPU.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import xPPU.Crane;
import xPPU.TurningTable;
import xPPU.XPPUPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Turning Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xPPU.impl.TurningTableImpl#getMounts <em>Mounts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TurningTableImpl extends EObjectImpl implements TurningTable {
	/**
	 * The cached value of the '{@link #getMounts() <em>Mounts</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMounts()
	 * @generated
	 * @ordered
	 */
	protected Crane mounts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TurningTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XPPUPackage.Literals.TURNING_TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Crane getMounts() {
		if (mounts != null && mounts.eIsProxy()) {
			InternalEObject oldMounts = (InternalEObject)mounts;
			mounts = (Crane)eResolveProxy(oldMounts);
			if (mounts != oldMounts) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XPPUPackage.TURNING_TABLE__MOUNTS, oldMounts, mounts));
			}
		}
		return mounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Crane basicGetMounts() {
		return mounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMounts(Crane newMounts, NotificationChain msgs) {
		Crane oldMounts = mounts;
		mounts = newMounts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPPUPackage.TURNING_TABLE__MOUNTS, oldMounts, newMounts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMounts(Crane newMounts) {
		if (newMounts != mounts) {
			NotificationChain msgs = null;
			if (mounts != null)
				msgs = ((InternalEObject)mounts).eInverseRemove(this, XPPUPackage.CRANE__MOUNTED_ON, Crane.class, msgs);
			if (newMounts != null)
				msgs = ((InternalEObject)newMounts).eInverseAdd(this, XPPUPackage.CRANE__MOUNTED_ON, Crane.class, msgs);
			msgs = basicSetMounts(newMounts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XPPUPackage.TURNING_TABLE__MOUNTS, newMounts, newMounts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XPPUPackage.TURNING_TABLE__MOUNTS:
				if (mounts != null)
					msgs = ((InternalEObject)mounts).eInverseRemove(this, XPPUPackage.CRANE__MOUNTED_ON, Crane.class, msgs);
				return basicSetMounts((Crane)otherEnd, msgs);
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
			case XPPUPackage.TURNING_TABLE__MOUNTS:
				return basicSetMounts(null, msgs);
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
			case XPPUPackage.TURNING_TABLE__MOUNTS:
				if (resolve) return getMounts();
				return basicGetMounts();
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
			case XPPUPackage.TURNING_TABLE__MOUNTS:
				setMounts((Crane)newValue);
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
			case XPPUPackage.TURNING_TABLE__MOUNTS:
				setMounts((Crane)null);
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
			case XPPUPackage.TURNING_TABLE__MOUNTS:
				return mounts != null;
		}
		return super.eIsSet(featureID);
	}

} //TurningTableImpl
