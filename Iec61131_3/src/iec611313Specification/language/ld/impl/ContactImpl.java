/**
 */
package iec611313Specification.language.ld.impl;

import iec611313Specification.language.ld.Contact;
import iec611313Specification.language.ld.ContactType;
import iec611313Specification.language.ld.LdPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.language.ld.impl.ContactImpl#getContactType <em>Contact Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContactImpl extends LDNodeImpl implements Contact {
	/**
	 * The default value of the '{@link #getContactType() <em>Contact Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactType()
	 * @generated
	 * @ordered
	 */
	protected static final ContactType CONTACT_TYPE_EDEFAULT = ContactType.NORMALLY_OPEN;

	/**
	 * The cached value of the '{@link #getContactType() <em>Contact Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactType()
	 * @generated
	 * @ordered
	 */
	protected ContactType contactType = CONTACT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LdPackage.Literals.CONTACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactType getContactType() {
		return contactType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContactType(ContactType newContactType) {
		ContactType oldContactType = contactType;
		contactType = newContactType == null ? CONTACT_TYPE_EDEFAULT : newContactType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LdPackage.CONTACT__CONTACT_TYPE, oldContactType, contactType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LdPackage.CONTACT__CONTACT_TYPE:
				return getContactType();
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
			case LdPackage.CONTACT__CONTACT_TYPE:
				setContactType((ContactType)newValue);
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
			case LdPackage.CONTACT__CONTACT_TYPE:
				setContactType(CONTACT_TYPE_EDEFAULT);
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
			case LdPackage.CONTACT__CONTACT_TYPE:
				return contactType != CONTACT_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (contactType: ");
		result.append(contactType);
		result.append(')');
		return result.toString();
	}

} //ContactImpl
