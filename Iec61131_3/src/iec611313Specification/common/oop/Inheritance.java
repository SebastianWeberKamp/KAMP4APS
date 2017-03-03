/**
 */
package iec611313Specification.common.oop;

import iec611313Specification.common.pous.function_blocks.FunctionBlockType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inheritance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.common.oop.Inheritance#getHasSuperType <em>Has Super Type</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.common.oop.OopPackage#getInheritance()
 * @model
 * @generated
 */
public interface Inheritance extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Super Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Super Type</em>' reference.
	 * @see #setHasSuperType(FunctionBlockType)
	 * @see iec611313Specification.common.oop.OopPackage#getInheritance_HasSuperType()
	 * @model required="true"
	 * @generated
	 */
	FunctionBlockType getHasSuperType();

	/**
	 * Sets the value of the '{@link iec611313Specification.common.oop.Inheritance#getHasSuperType <em>Has Super Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Super Type</em>' reference.
	 * @see #getHasSuperType()
	 * @generated
	 */
	void setHasSuperType(FunctionBlockType value);

} // Inheritance
