/**
 */
package iec611313Specification.common.oop;

import iec611313Specification.common.types.ANY_DERIVED;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.common.oop.Interface#getHasBaseType <em>Has Base Type</em>}</li>
 *   <li>{@link iec611313Specification.common.oop.Interface#getHasPropertySignatures <em>Has Property Signatures</em>}</li>
 *   <li>{@link iec611313Specification.common.oop.Interface#getHasMethodSignatures <em>Has Method Signatures</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.common.oop.OopPackage#getInterface()
 * @model abstract="true"
 * @generated
 */
public interface Interface extends ANY_DERIVED {
	/**
	 * Returns the value of the '<em><b>Has Base Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Base Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Base Type</em>' containment reference.
	 * @see #setHasBaseType(Interface)
	 * @see iec611313Specification.common.oop.OopPackage#getInterface_HasBaseType()
	 * @model containment="true"
	 * @generated
	 */
	Interface getHasBaseType();

	/**
	 * Sets the value of the '{@link iec611313Specification.common.oop.Interface#getHasBaseType <em>Has Base Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Base Type</em>' containment reference.
	 * @see #getHasBaseType()
	 * @generated
	 */
	void setHasBaseType(Interface value);

	/**
	 * Returns the value of the '<em><b>Has Property Signatures</b></em>' containment reference list.
	 * The list contents are of type {@link iec611313Specification.common.oop.PropertySignature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Property Signatures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Property Signatures</em>' containment reference list.
	 * @see iec611313Specification.common.oop.OopPackage#getInterface_HasPropertySignatures()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropertySignature> getHasPropertySignatures();

	/**
	 * Returns the value of the '<em><b>Has Method Signatures</b></em>' containment reference list.
	 * The list contents are of type {@link iec611313Specification.common.oop.MethodSignature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Method Signatures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Method Signatures</em>' containment reference list.
	 * @see iec611313Specification.common.oop.OopPackage#getInterface_HasMethodSignatures()
	 * @model containment="true"
	 * @generated
	 */
	EList<MethodSignature> getHasMethodSignatures();

} // Interface
