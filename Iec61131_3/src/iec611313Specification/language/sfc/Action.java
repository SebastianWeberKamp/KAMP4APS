/**
 */
package iec611313Specification.language.sfc;

import iec611313Specification.common.pous.function_blocks.FunctionBlockBodySpecification;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.language.sfc.Action#getHasActionSpec <em>Has Action Spec</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.language.sfc.SfcPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Action Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Action Spec</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Action Spec</em>' reference.
	 * @see #setHasActionSpec(FunctionBlockBodySpecification)
	 * @see iec611313Specification.language.sfc.SfcPackage#getAction_HasActionSpec()
	 * @model required="true"
	 * @generated
	 */
	FunctionBlockBodySpecification getHasActionSpec();

	/**
	 * Sets the value of the '{@link iec611313Specification.language.sfc.Action#getHasActionSpec <em>Has Action Spec</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Action Spec</em>' reference.
	 * @see #getHasActionSpec()
	 * @generated
	 */
	void setHasActionSpec(FunctionBlockBodySpecification value);

} // Action
