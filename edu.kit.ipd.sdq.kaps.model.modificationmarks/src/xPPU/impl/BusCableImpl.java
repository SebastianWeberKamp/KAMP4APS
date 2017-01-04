/**
 */
package xPPU.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import xPPU.BusCable;
import xPPU.SignalInterface;
import xPPU.XPPUPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bus Cable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xPPU.impl.BusCableImpl#getSignalPlug1 <em>Signal Plug1</em>}</li>
 *   <li>{@link xPPU.impl.BusCableImpl#getSignalPlug2 <em>Signal Plug2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusCableImpl extends CableImpl implements BusCable {
	/**
	 * The cached value of the '{@link #getSignalPlug1() <em>Signal Plug1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalPlug1()
	 * @generated
	 * @ordered
	 */
	protected SignalInterface signalPlug1;

	/**
	 * The cached value of the '{@link #getSignalPlug2() <em>Signal Plug2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalPlug2()
	 * @generated
	 * @ordered
	 */
	protected SignalInterface signalPlug2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusCableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XPPUPackage.Literals.BUS_CABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalInterface getSignalPlug1() {
		if (signalPlug1 != null && signalPlug1.eIsProxy()) {
			InternalEObject oldSignalPlug1 = (InternalEObject)signalPlug1;
			signalPlug1 = (SignalInterface)eResolveProxy(oldSignalPlug1);
			if (signalPlug1 != oldSignalPlug1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XPPUPackage.BUS_CABLE__SIGNAL_PLUG1, oldSignalPlug1, signalPlug1));
			}
		}
		return signalPlug1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalInterface basicGetSignalPlug1() {
		return signalPlug1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignalPlug1(SignalInterface newSignalPlug1) {
		SignalInterface oldSignalPlug1 = signalPlug1;
		signalPlug1 = newSignalPlug1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XPPUPackage.BUS_CABLE__SIGNAL_PLUG1, oldSignalPlug1, signalPlug1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalInterface getSignalPlug2() {
		if (signalPlug2 != null && signalPlug2.eIsProxy()) {
			InternalEObject oldSignalPlug2 = (InternalEObject)signalPlug2;
			signalPlug2 = (SignalInterface)eResolveProxy(oldSignalPlug2);
			if (signalPlug2 != oldSignalPlug2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XPPUPackage.BUS_CABLE__SIGNAL_PLUG2, oldSignalPlug2, signalPlug2));
			}
		}
		return signalPlug2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalInterface basicGetSignalPlug2() {
		return signalPlug2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignalPlug2(SignalInterface newSignalPlug2) {
		SignalInterface oldSignalPlug2 = signalPlug2;
		signalPlug2 = newSignalPlug2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XPPUPackage.BUS_CABLE__SIGNAL_PLUG2, oldSignalPlug2, signalPlug2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XPPUPackage.BUS_CABLE__SIGNAL_PLUG1:
				if (resolve) return getSignalPlug1();
				return basicGetSignalPlug1();
			case XPPUPackage.BUS_CABLE__SIGNAL_PLUG2:
				if (resolve) return getSignalPlug2();
				return basicGetSignalPlug2();
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
			case XPPUPackage.BUS_CABLE__SIGNAL_PLUG1:
				setSignalPlug1((SignalInterface)newValue);
				return;
			case XPPUPackage.BUS_CABLE__SIGNAL_PLUG2:
				setSignalPlug2((SignalInterface)newValue);
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
			case XPPUPackage.BUS_CABLE__SIGNAL_PLUG1:
				setSignalPlug1((SignalInterface)null);
				return;
			case XPPUPackage.BUS_CABLE__SIGNAL_PLUG2:
				setSignalPlug2((SignalInterface)null);
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
			case XPPUPackage.BUS_CABLE__SIGNAL_PLUG1:
				return signalPlug1 != null;
			case XPPUPackage.BUS_CABLE__SIGNAL_PLUG2:
				return signalPlug2 != null;
		}
		return super.eIsSet(featureID);
	}

} //BusCableImpl
