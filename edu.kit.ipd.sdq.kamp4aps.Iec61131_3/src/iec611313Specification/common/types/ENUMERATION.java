/**
 */
package iec611313Specification.common.types;

import iec611313Specification.common.Literal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ENUMERATION</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.common.types.ENUMERATION#getContainsEnumValue <em>Contains Enum Value</em>}</li>
 *   <li>{@link iec611313Specification.common.types.ENUMERATION#getHasInitialEnumValue <em>Has Initial Enum Value</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.common.types.TypesPackage#getENUMERATION()
 * @model
 * @generated
 */
public interface ENUMERATION extends ANY_DERIVED {
	/**
	 * Returns the value of the '<em><b>Contains Enum Value</b></em>' containment reference list.
	 * The list contents are of type {@link iec611313Specification.common.Literal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Enum Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Enum Value</em>' containment reference list.
	 * @see iec611313Specification.common.types.TypesPackage#getENUMERATION_ContainsEnumValue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Literal> getContainsEnumValue();

	/**
	 * Returns the value of the '<em><b>Has Initial Enum Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Initial Enum Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Initial Enum Value</em>' containment reference.
	 * @see #setHasInitialEnumValue(Literal)
	 * @see iec611313Specification.common.types.TypesPackage#getENUMERATION_HasInitialEnumValue()
	 * @model containment="true"
	 * @generated
	 */
	Literal getHasInitialEnumValue();

	/**
	 * Sets the value of the '{@link iec611313Specification.common.types.ENUMERATION#getHasInitialEnumValue <em>Has Initial Enum Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Initial Enum Value</em>' containment reference.
	 * @see #getHasInitialEnumValue()
	 * @generated
	 */
	void setHasInitialEnumValue(Literal value);

} // ENUMERATION
