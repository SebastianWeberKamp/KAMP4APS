/**
 */
package iec611313Specification.common.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>POINTER</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.common.types.POINTER#getHasDerivedBaseType <em>Has Derived Base Type</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.common.types.TypesPackage#getPOINTER()
 * @model
 * @generated
 */
public interface POINTER extends ANY_DERIVED {
	/**
	 * Returns the value of the '<em><b>Has Derived Base Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Derived Base Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Derived Base Type</em>' containment reference.
	 * @see #setHasDerivedBaseType(ANY)
	 * @see iec611313Specification.common.types.TypesPackage#getPOINTER_HasDerivedBaseType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ANY getHasDerivedBaseType();

	/**
	 * Sets the value of the '{@link iec611313Specification.common.types.POINTER#getHasDerivedBaseType <em>Has Derived Base Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Derived Base Type</em>' containment reference.
	 * @see #getHasDerivedBaseType()
	 * @generated
	 */
	void setHasDerivedBaseType(ANY value);

} // POINTER
