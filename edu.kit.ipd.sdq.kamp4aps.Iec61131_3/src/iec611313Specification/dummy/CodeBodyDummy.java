/**
 */
package iec611313Specification.dummy;

import iec611313Specification.common.pous.function_blocks.FunctionBlockBodySpecification;

import iec611313Specification.common.pous.functions.FunctionBodySpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Body Dummy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.dummy.CodeBodyDummy#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.dummy.DummyPackage#getCodeBodyDummy()
 * @model
 * @generated
 */
public interface CodeBodyDummy extends FunctionBlockBodySpecification, FunctionBodySpecification {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see iec611313Specification.dummy.DummyPackage#getCodeBodyDummy_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link iec611313Specification.dummy.CodeBodyDummy#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // CodeBodyDummy
