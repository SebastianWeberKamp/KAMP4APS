/**
 */
package iec611313Specification.common.oop;

import iec611313Specification.common.types.ANY;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.common.oop.PropertySignature#isHasSetter <em>Has Setter</em>}</li>
 *   <li>{@link iec611313Specification.common.oop.PropertySignature#isHasGetter <em>Has Getter</em>}</li>
 *   <li>{@link iec611313Specification.common.oop.PropertySignature#getHasReturnType <em>Has Return Type</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.common.oop.OopPackage#getPropertySignature()
 * @model
 * @generated
 */
public interface PropertySignature extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Setter</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Setter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Setter</em>' attribute.
	 * @see #setHasSetter(boolean)
	 * @see iec611313Specification.common.oop.OopPackage#getPropertySignature_HasSetter()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isHasSetter();

	/**
	 * Sets the value of the '{@link iec611313Specification.common.oop.PropertySignature#isHasSetter <em>Has Setter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Setter</em>' attribute.
	 * @see #isHasSetter()
	 * @generated
	 */
	void setHasSetter(boolean value);

	/**
	 * Returns the value of the '<em><b>Has Getter</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Getter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Getter</em>' attribute.
	 * @see #setHasGetter(boolean)
	 * @see iec611313Specification.common.oop.OopPackage#getPropertySignature_HasGetter()
	 * @model default="false"
	 * @generated
	 */
	boolean isHasGetter();

	/**
	 * Sets the value of the '{@link iec611313Specification.common.oop.PropertySignature#isHasGetter <em>Has Getter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Getter</em>' attribute.
	 * @see #isHasGetter()
	 * @generated
	 */
	void setHasGetter(boolean value);

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
	 * @see iec611313Specification.common.oop.OopPackage#getPropertySignature_HasReturnType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ANY getHasReturnType();

	/**
	 * Sets the value of the '{@link iec611313Specification.common.oop.PropertySignature#getHasReturnType <em>Has Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Return Type</em>' containment reference.
	 * @see #getHasReturnType()
	 * @generated
	 */
	void setHasReturnType(ANY value);

} // PropertySignature
