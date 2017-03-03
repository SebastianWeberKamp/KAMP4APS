/**
 */
package iec611313Specification.common.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ANY DERIVED</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.common.types.ANY_DERIVED#getTypeName <em>Type Name</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.common.types.TypesPackage#getANY_DERIVED()
 * @model abstract="true"
 * @generated
 */
public interface ANY_DERIVED extends ANY {
	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Name</em>' attribute.
	 * @see #setTypeName(String)
	 * @see iec611313Specification.common.types.TypesPackage#getANY_DERIVED_TypeName()
	 * @model default="" unique="false" required="true"
	 * @generated
	 */
	String getTypeName();

	/**
	 * Sets the value of the '{@link iec611313Specification.common.types.ANY_DERIVED#getTypeName <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' attribute.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(String value);

} // ANY_DERIVED
