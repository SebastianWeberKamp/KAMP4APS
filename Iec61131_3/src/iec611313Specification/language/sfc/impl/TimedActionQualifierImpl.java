/**
 */
package iec611313Specification.language.sfc.impl;

import iec611313Specification.common.Literal;

import iec611313Specification.language.sfc.SfcPackage;
import iec611313Specification.language.sfc.SimpleQualifier;
import iec611313Specification.language.sfc.TimedActionQualifier;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timed Action Qualifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.language.sfc.impl.TimedActionQualifierImpl#getHasDuration <em>Has Duration</em>}</li>
 *   <li>{@link iec611313Specification.language.sfc.impl.TimedActionQualifierImpl#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimedActionQualifierImpl extends ActionQualifierImpl implements TimedActionQualifier {
	/**
	 * The cached value of the '{@link #getHasDuration() <em>Has Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasDuration()
	 * @generated
	 * @ordered
	 */
	protected Literal hasDuration;

	/**
	 * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifier()
	 * @generated
	 * @ordered
	 */
	protected SimpleQualifier qualifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimedActionQualifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SfcPackage.Literals.TIMED_ACTION_QUALIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal getHasDuration() {
		return hasDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasDuration(Literal newHasDuration, NotificationChain msgs) {
		Literal oldHasDuration = hasDuration;
		hasDuration = newHasDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SfcPackage.TIMED_ACTION_QUALIFIER__HAS_DURATION, oldHasDuration, newHasDuration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasDuration(Literal newHasDuration) {
		if (newHasDuration != hasDuration) {
			NotificationChain msgs = null;
			if (hasDuration != null)
				msgs = ((InternalEObject)hasDuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SfcPackage.TIMED_ACTION_QUALIFIER__HAS_DURATION, null, msgs);
			if (newHasDuration != null)
				msgs = ((InternalEObject)newHasDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SfcPackage.TIMED_ACTION_QUALIFIER__HAS_DURATION, null, msgs);
			msgs = basicSetHasDuration(newHasDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SfcPackage.TIMED_ACTION_QUALIFIER__HAS_DURATION, newHasDuration, newHasDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQualifier getQualifier() {
		if (qualifier != null && qualifier.eIsProxy()) {
			InternalEObject oldQualifier = (InternalEObject)qualifier;
			qualifier = (SimpleQualifier)eResolveProxy(oldQualifier);
			if (qualifier != oldQualifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SfcPackage.TIMED_ACTION_QUALIFIER__QUALIFIER, oldQualifier, qualifier));
			}
		}
		return qualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQualifier basicGetQualifier() {
		return qualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifier(SimpleQualifier newQualifier) {
		SimpleQualifier oldQualifier = qualifier;
		qualifier = newQualifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SfcPackage.TIMED_ACTION_QUALIFIER__QUALIFIER, oldQualifier, qualifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SfcPackage.TIMED_ACTION_QUALIFIER__HAS_DURATION:
				return basicSetHasDuration(null, msgs);
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
			case SfcPackage.TIMED_ACTION_QUALIFIER__HAS_DURATION:
				return getHasDuration();
			case SfcPackage.TIMED_ACTION_QUALIFIER__QUALIFIER:
				if (resolve) return getQualifier();
				return basicGetQualifier();
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
			case SfcPackage.TIMED_ACTION_QUALIFIER__HAS_DURATION:
				setHasDuration((Literal)newValue);
				return;
			case SfcPackage.TIMED_ACTION_QUALIFIER__QUALIFIER:
				setQualifier((SimpleQualifier)newValue);
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
			case SfcPackage.TIMED_ACTION_QUALIFIER__HAS_DURATION:
				setHasDuration((Literal)null);
				return;
			case SfcPackage.TIMED_ACTION_QUALIFIER__QUALIFIER:
				setQualifier((SimpleQualifier)null);
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
			case SfcPackage.TIMED_ACTION_QUALIFIER__HAS_DURATION:
				return hasDuration != null;
			case SfcPackage.TIMED_ACTION_QUALIFIER__QUALIFIER:
				return qualifier != null;
		}
		return super.eIsSet(featureID);
	}

} //TimedActionQualifierImpl
