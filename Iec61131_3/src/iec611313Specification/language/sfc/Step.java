/**
 */
package iec611313Specification.language.sfc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.language.sfc.Step#getName <em>Name</em>}</li>
 *   <li>{@link iec611313Specification.language.sfc.Step#getContainsActionAssociation <em>Contains Action Association</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.language.sfc.SfcPackage#getStep()
 * @model
 * @generated
 */
public interface Step extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see iec611313Specification.language.sfc.SfcPackage#getStep_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link iec611313Specification.language.sfc.Step#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Contains Action Association</b></em>' containment reference list.
	 * The list contents are of type {@link iec611313Specification.language.sfc.ActionAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Action Association</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Action Association</em>' containment reference list.
	 * @see iec611313Specification.language.sfc.SfcPackage#getStep_ContainsActionAssociation()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActionAssociation> getContainsActionAssociation();

} // Step
