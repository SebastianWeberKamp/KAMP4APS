/**
 */
package iec611313Specification.common.types;

import iec611313Specification.common.Literal;
import iec611313Specification.common.Range;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ARRAY</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.common.types.ARRAY#getHasArrayDimension <em>Has Array Dimension</em>}</li>
 *   <li>{@link iec611313Specification.common.types.ARRAY#getHasInitialArrayValue <em>Has Initial Array Value</em>}</li>
 *   <li>{@link iec611313Specification.common.types.ARRAY#getHasArrayBaseType <em>Has Array Base Type</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.common.types.TypesPackage#getARRAY()
 * @model
 * @generated
 */
public interface ARRAY extends ANY_DERIVED {
	/**
	 * Returns the value of the '<em><b>Has Array Dimension</b></em>' containment reference list.
	 * The list contents are of type {@link iec611313Specification.common.Range}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Array Dimension</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Array Dimension</em>' containment reference list.
	 * @see iec611313Specification.common.types.TypesPackage#getARRAY_HasArrayDimension()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Range> getHasArrayDimension();

	/**
	 * Returns the value of the '<em><b>Has Initial Array Value</b></em>' containment reference list.
	 * The list contents are of type {@link iec611313Specification.common.Literal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Initial Array Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Initial Array Value</em>' containment reference list.
	 * @see iec611313Specification.common.types.TypesPackage#getARRAY_HasInitialArrayValue()
	 * @model containment="true"
	 * @generated
	 */
	EList<Literal> getHasInitialArrayValue();

	/**
	 * Returns the value of the '<em><b>Has Array Base Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Array Base Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Array Base Type</em>' containment reference.
	 * @see #setHasArrayBaseType(ANY)
	 * @see iec611313Specification.common.types.TypesPackage#getARRAY_HasArrayBaseType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ANY getHasArrayBaseType();

	/**
	 * Sets the value of the '{@link iec611313Specification.common.types.ARRAY#getHasArrayBaseType <em>Has Array Base Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Array Base Type</em>' containment reference.
	 * @see #getHasArrayBaseType()
	 * @generated
	 */
	void setHasArrayBaseType(ANY value);

} // ARRAY
