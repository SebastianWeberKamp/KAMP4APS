/**
 */
package iec611313Specification.language.ld.impl;

import iec611313Specification.language.ld.LadderNetwork;
import iec611313Specification.language.ld.LdPackage;
import iec611313Specification.language.ld.PowerRail;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Power Rail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.language.ld.impl.PowerRailImpl#getHasLeftPowerRail <em>Has Left Power Rail</em>}</li>
 *   <li>{@link iec611313Specification.language.ld.impl.PowerRailImpl#getHasRightPowerRail <em>Has Right Power Rail</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PowerRailImpl extends LDElementImpl implements PowerRail {
	/**
	 * The cached value of the '{@link #getHasLeftPowerRail() <em>Has Left Power Rail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasLeftPowerRail()
	 * @generated
	 * @ordered
	 */
	protected LadderNetwork hasLeftPowerRail;

	/**
	 * The cached value of the '{@link #getHasRightPowerRail() <em>Has Right Power Rail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasRightPowerRail()
	 * @generated
	 * @ordered
	 */
	protected LadderNetwork hasRightPowerRail;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PowerRailImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LdPackage.Literals.POWER_RAIL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LadderNetwork getHasLeftPowerRail() {
		if (hasLeftPowerRail != null && hasLeftPowerRail.eIsProxy()) {
			InternalEObject oldHasLeftPowerRail = (InternalEObject)hasLeftPowerRail;
			hasLeftPowerRail = (LadderNetwork)eResolveProxy(oldHasLeftPowerRail);
			if (hasLeftPowerRail != oldHasLeftPowerRail) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LdPackage.POWER_RAIL__HAS_LEFT_POWER_RAIL, oldHasLeftPowerRail, hasLeftPowerRail));
			}
		}
		return hasLeftPowerRail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LadderNetwork basicGetHasLeftPowerRail() {
		return hasLeftPowerRail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasLeftPowerRail(LadderNetwork newHasLeftPowerRail) {
		LadderNetwork oldHasLeftPowerRail = hasLeftPowerRail;
		hasLeftPowerRail = newHasLeftPowerRail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LdPackage.POWER_RAIL__HAS_LEFT_POWER_RAIL, oldHasLeftPowerRail, hasLeftPowerRail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LadderNetwork getHasRightPowerRail() {
		if (hasRightPowerRail != null && hasRightPowerRail.eIsProxy()) {
			InternalEObject oldHasRightPowerRail = (InternalEObject)hasRightPowerRail;
			hasRightPowerRail = (LadderNetwork)eResolveProxy(oldHasRightPowerRail);
			if (hasRightPowerRail != oldHasRightPowerRail) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LdPackage.POWER_RAIL__HAS_RIGHT_POWER_RAIL, oldHasRightPowerRail, hasRightPowerRail));
			}
		}
		return hasRightPowerRail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LadderNetwork basicGetHasRightPowerRail() {
		return hasRightPowerRail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasRightPowerRail(LadderNetwork newHasRightPowerRail) {
		LadderNetwork oldHasRightPowerRail = hasRightPowerRail;
		hasRightPowerRail = newHasRightPowerRail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LdPackage.POWER_RAIL__HAS_RIGHT_POWER_RAIL, oldHasRightPowerRail, hasRightPowerRail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LdPackage.POWER_RAIL__HAS_LEFT_POWER_RAIL:
				if (resolve) return getHasLeftPowerRail();
				return basicGetHasLeftPowerRail();
			case LdPackage.POWER_RAIL__HAS_RIGHT_POWER_RAIL:
				if (resolve) return getHasRightPowerRail();
				return basicGetHasRightPowerRail();
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
			case LdPackage.POWER_RAIL__HAS_LEFT_POWER_RAIL:
				setHasLeftPowerRail((LadderNetwork)newValue);
				return;
			case LdPackage.POWER_RAIL__HAS_RIGHT_POWER_RAIL:
				setHasRightPowerRail((LadderNetwork)newValue);
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
			case LdPackage.POWER_RAIL__HAS_LEFT_POWER_RAIL:
				setHasLeftPowerRail((LadderNetwork)null);
				return;
			case LdPackage.POWER_RAIL__HAS_RIGHT_POWER_RAIL:
				setHasRightPowerRail((LadderNetwork)null);
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
			case LdPackage.POWER_RAIL__HAS_LEFT_POWER_RAIL:
				return hasLeftPowerRail != null;
			case LdPackage.POWER_RAIL__HAS_RIGHT_POWER_RAIL:
				return hasRightPowerRail != null;
		}
		return super.eIsSet(featureID);
	}

} //PowerRailImpl
