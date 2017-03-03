/**
 */
package iec611313Specification.common.oop;

import iec611313Specification.common.pous.functions.FunctionBodySpecification;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Accessor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.common.oop.SetAccessor#getHasBody <em>Has Body</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.common.oop.OopPackage#getSetAccessor()
 * @model
 * @generated
 */
public interface SetAccessor extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Body</em>' containment reference.
	 * @see #setHasBody(FunctionBodySpecification)
	 * @see iec611313Specification.common.oop.OopPackage#getSetAccessor_HasBody()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FunctionBodySpecification getHasBody();

	/**
	 * Sets the value of the '{@link iec611313Specification.common.oop.SetAccessor#getHasBody <em>Has Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Body</em>' containment reference.
	 * @see #getHasBody()
	 * @generated
	 */
	void setHasBody(FunctionBodySpecification value);

} // SetAccessor
