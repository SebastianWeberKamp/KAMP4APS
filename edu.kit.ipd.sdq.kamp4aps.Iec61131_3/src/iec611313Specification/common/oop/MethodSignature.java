/**
 */
package iec611313Specification.common.oop;

import iec611313Specification.common.types.ANY;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.common.oop.MethodSignature#getName <em>Name</em>}</li>
 *   <li>{@link iec611313Specification.common.oop.MethodSignature#getHasReturnType <em>Has Return Type</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.common.oop.OopPackage#getMethodSignature()
 * @model
 * @generated
 */
public interface MethodSignature extends EObject {
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
	 * @see iec611313Specification.common.oop.OopPackage#getMethodSignature_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link iec611313Specification.common.oop.MethodSignature#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Has Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Return Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Return Type</em>' containment reference.
	 * @see #setHasReturnType(ANY)
	 * @see iec611313Specification.common.oop.OopPackage#getMethodSignature_HasReturnType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ANY getHasReturnType();

	/**
	 * Sets the value of the '{@link iec611313Specification.common.oop.MethodSignature#getHasReturnType <em>Has Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Return Type</em>' containment reference.
	 * @see #getHasReturnType()
	 * @generated
	 */
	void setHasReturnType(ANY value);

} // MethodSignature
