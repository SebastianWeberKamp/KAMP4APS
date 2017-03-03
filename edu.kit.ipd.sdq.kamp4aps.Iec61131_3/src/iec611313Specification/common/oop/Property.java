/**
 */
package iec611313Specification.common.oop;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.common.oop.Property#getContainsGetter <em>Contains Getter</em>}</li>
 *   <li>{@link iec611313Specification.common.oop.Property#getContainsSetter <em>Contains Setter</em>}</li>
 *   <li>{@link iec611313Specification.common.oop.Property#getHasSignature <em>Has Signature</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.common.oop.OopPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends EObject {
	/**
	 * Returns the value of the '<em><b>Contains Getter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Getter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Getter</em>' containment reference.
	 * @see #setContainsGetter(GetAccessor)
	 * @see iec611313Specification.common.oop.OopPackage#getProperty_ContainsGetter()
	 * @model containment="true"
	 * @generated
	 */
	GetAccessor getContainsGetter();

	/**
	 * Sets the value of the '{@link iec611313Specification.common.oop.Property#getContainsGetter <em>Contains Getter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contains Getter</em>' containment reference.
	 * @see #getContainsGetter()
	 * @generated
	 */
	void setContainsGetter(GetAccessor value);

	/**
	 * Returns the value of the '<em><b>Contains Setter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Setter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Setter</em>' containment reference.
	 * @see #setContainsSetter(SetAccessor)
	 * @see iec611313Specification.common.oop.OopPackage#getProperty_ContainsSetter()
	 * @model containment="true"
	 * @generated
	 */
	SetAccessor getContainsSetter();

	/**
	 * Sets the value of the '{@link iec611313Specification.common.oop.Property#getContainsSetter <em>Contains Setter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contains Setter</em>' containment reference.
	 * @see #getContainsSetter()
	 * @generated
	 */
	void setContainsSetter(SetAccessor value);

	/**
	 * Returns the value of the '<em><b>Has Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Signature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Signature</em>' containment reference.
	 * @see #setHasSignature(PropertySignature)
	 * @see iec611313Specification.common.oop.OopPackage#getProperty_HasSignature()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PropertySignature getHasSignature();

	/**
	 * Sets the value of the '{@link iec611313Specification.common.oop.Property#getHasSignature <em>Has Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Signature</em>' containment reference.
	 * @see #getHasSignature()
	 * @generated
	 */
	void setHasSignature(PropertySignature value);

} // Property
