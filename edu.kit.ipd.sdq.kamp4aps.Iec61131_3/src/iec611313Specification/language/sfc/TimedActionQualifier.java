/**
 */
package iec611313Specification.language.sfc;

import iec611313Specification.common.Literal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timed Action Qualifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.language.sfc.TimedActionQualifier#getHasDuration <em>Has Duration</em>}</li>
 *   <li>{@link iec611313Specification.language.sfc.TimedActionQualifier#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.language.sfc.SfcPackage#getTimedActionQualifier()
 * @model
 * @generated
 */
public interface TimedActionQualifier extends ActionQualifier {
	/**
	 * Returns the value of the '<em><b>Has Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Duration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Duration</em>' containment reference.
	 * @see #setHasDuration(Literal)
	 * @see iec611313Specification.language.sfc.SfcPackage#getTimedActionQualifier_HasDuration()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Literal getHasDuration();

	/**
	 * Sets the value of the '{@link iec611313Specification.language.sfc.TimedActionQualifier#getHasDuration <em>Has Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Duration</em>' containment reference.
	 * @see #getHasDuration()
	 * @generated
	 */
	void setHasDuration(Literal value);

	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' reference.
	 * @see #setQualifier(SimpleQualifier)
	 * @see iec611313Specification.language.sfc.SfcPackage#getTimedActionQualifier_Qualifier()
	 * @model required="true"
	 * @generated
	 */
	SimpleQualifier getQualifier();

	/**
	 * Sets the value of the '{@link iec611313Specification.language.sfc.TimedActionQualifier#getQualifier <em>Qualifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier</em>' reference.
	 * @see #getQualifier()
	 * @generated
	 */
	void setQualifier(SimpleQualifier value);

} // TimedActionQualifier
