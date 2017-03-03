/**
 */
package iec611313Specification.common.types;

import iec611313Specification.common.Literal;
import iec611313Specification.common.Range;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DERIVED</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.common.types.DERIVED#getHasInitialDerivedValue <em>Has Initial Derived Value</em>}</li>
 *   <li>{@link iec611313Specification.common.types.DERIVED#getHasSubrangeRange <em>Has Subrange Range</em>}</li>
 *   <li>{@link iec611313Specification.common.types.DERIVED#getHasDerivedBaseType <em>Has Derived Base Type</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.common.types.TypesPackage#getDERIVED()
 * @model
 * @generated
 */
public interface DERIVED extends ANY_DERIVED {
	/**
	 * Returns the value of the '<em><b>Has Initial Derived Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Initial Derived Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Initial Derived Value</em>' containment reference.
	 * @see #setHasInitialDerivedValue(Literal)
	 * @see iec611313Specification.common.types.TypesPackage#getDERIVED_HasInitialDerivedValue()
	 * @model containment="true"
	 * @generated
	 */
	Literal getHasInitialDerivedValue();

	/**
	 * Sets the value of the '{@link iec611313Specification.common.types.DERIVED#getHasInitialDerivedValue <em>Has Initial Derived Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Initial Derived Value</em>' containment reference.
	 * @see #getHasInitialDerivedValue()
	 * @generated
	 */
	void setHasInitialDerivedValue(Literal value);

	/**
	 * Returns the value of the '<em><b>Has Subrange Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Subrange Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Subrange Range</em>' containment reference.
	 * @see #setHasSubrangeRange(Range)
	 * @see iec611313Specification.common.types.TypesPackage#getDERIVED_HasSubrangeRange()
	 * @model containment="true"
	 * @generated
	 */
	Range getHasSubrangeRange();

	/**
	 * Sets the value of the '{@link iec611313Specification.common.types.DERIVED#getHasSubrangeRange <em>Has Subrange Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Subrange Range</em>' containment reference.
	 * @see #getHasSubrangeRange()
	 * @generated
	 */
	void setHasSubrangeRange(Range value);

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
	 * @see iec611313Specification.common.types.TypesPackage#getDERIVED_HasDerivedBaseType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ANY getHasDerivedBaseType();

	/**
	 * Sets the value of the '{@link iec611313Specification.common.types.DERIVED#getHasDerivedBaseType <em>Has Derived Base Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Derived Base Type</em>' containment reference.
	 * @see #getHasDerivedBaseType()
	 * @generated
	 */
	void setHasDerivedBaseType(ANY value);

} // DERIVED
