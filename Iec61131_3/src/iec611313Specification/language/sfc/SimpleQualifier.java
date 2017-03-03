/**
 */
package iec611313Specification.language.sfc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Qualifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.language.sfc.SimpleQualifier#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.language.sfc.SfcPackage#getSimpleQualifier()
 * @model
 * @generated
 */
public interface SimpleQualifier extends EObject {
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
	 * @see iec611313Specification.language.sfc.SfcPackage#getSimpleQualifier_Qualifier()
	 * @model required="true"
	 * @generated
	 */
	SimpleQualifier getQualifier();

	/**
	 * Sets the value of the '{@link iec611313Specification.language.sfc.SimpleQualifier#getQualifier <em>Qualifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier</em>' reference.
	 * @see #getQualifier()
	 * @generated
	 */
	void setQualifier(SimpleQualifier value);

} // SimpleQualifier
