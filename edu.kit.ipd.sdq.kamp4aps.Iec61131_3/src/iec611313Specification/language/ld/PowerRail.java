/**
 */
package iec611313Specification.language.ld;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Power Rail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.language.ld.PowerRail#getHasLeftPowerRail <em>Has Left Power Rail</em>}</li>
 *   <li>{@link iec611313Specification.language.ld.PowerRail#getHasRightPowerRail <em>Has Right Power Rail</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.language.ld.LdPackage#getPowerRail()
 * @model
 * @generated
 */
public interface PowerRail extends LDElement {
	/**
	 * Returns the value of the '<em><b>Has Left Power Rail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Left Power Rail</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Left Power Rail</em>' reference.
	 * @see #setHasLeftPowerRail(LadderNetwork)
	 * @see iec611313Specification.language.ld.LdPackage#getPowerRail_HasLeftPowerRail()
	 * @model required="true"
	 * @generated
	 */
	LadderNetwork getHasLeftPowerRail();

	/**
	 * Sets the value of the '{@link iec611313Specification.language.ld.PowerRail#getHasLeftPowerRail <em>Has Left Power Rail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Left Power Rail</em>' reference.
	 * @see #getHasLeftPowerRail()
	 * @generated
	 */
	void setHasLeftPowerRail(LadderNetwork value);

	/**
	 * Returns the value of the '<em><b>Has Right Power Rail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Right Power Rail</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Right Power Rail</em>' reference.
	 * @see #setHasRightPowerRail(LadderNetwork)
	 * @see iec611313Specification.language.ld.LdPackage#getPowerRail_HasRightPowerRail()
	 * @model required="true"
	 * @generated
	 */
	LadderNetwork getHasRightPowerRail();

	/**
	 * Sets the value of the '{@link iec611313Specification.language.ld.PowerRail#getHasRightPowerRail <em>Has Right Power Rail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Right Power Rail</em>' reference.
	 * @see #getHasRightPowerRail()
	 * @generated
	 */
	void setHasRightPowerRail(LadderNetwork value);

} // PowerRail
