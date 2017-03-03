/**
 */
package iec611313Specification.language.ld;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.language.ld.Contact#getContactType <em>Contact Type</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.language.ld.LdPackage#getContact()
 * @model
 * @generated
 */
public interface Contact extends LDNode {
	/**
	 * Returns the value of the '<em><b>Contact Type</b></em>' attribute.
	 * The literals are from the enumeration {@link iec611313Specification.language.ld.ContactType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Type</em>' attribute.
	 * @see iec611313Specification.language.ld.ContactType
	 * @see #setContactType(ContactType)
	 * @see iec611313Specification.language.ld.LdPackage#getContact_ContactType()
	 * @model required="true"
	 * @generated
	 */
	ContactType getContactType();

	/**
	 * Sets the value of the '{@link iec611313Specification.language.ld.Contact#getContactType <em>Contact Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Type</em>' attribute.
	 * @see iec611313Specification.language.ld.ContactType
	 * @see #getContactType()
	 * @generated
	 */
	void setContactType(ContactType value);

} // Contact
