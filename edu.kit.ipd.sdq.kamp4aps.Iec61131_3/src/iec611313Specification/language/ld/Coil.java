/**
 */
package iec611313Specification.language.ld;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coil</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.language.ld.Coil#getCoilType <em>Coil Type</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.language.ld.LdPackage#getCoil()
 * @model
 * @generated
 */
public interface Coil extends LDNode {
	/**
	 * Returns the value of the '<em><b>Coil Type</b></em>' attribute.
	 * The literals are from the enumeration {@link iec611313Specification.language.ld.CoilType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coil Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coil Type</em>' attribute.
	 * @see iec611313Specification.language.ld.CoilType
	 * @see #setCoilType(CoilType)
	 * @see iec611313Specification.language.ld.LdPackage#getCoil_CoilType()
	 * @model required="true"
	 * @generated
	 */
	CoilType getCoilType();

	/**
	 * Sets the value of the '{@link iec611313Specification.language.ld.Coil#getCoilType <em>Coil Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coil Type</em>' attribute.
	 * @see iec611313Specification.language.ld.CoilType
	 * @see #getCoilType()
	 * @generated
	 */
	void setCoilType(CoilType value);

} // Coil
