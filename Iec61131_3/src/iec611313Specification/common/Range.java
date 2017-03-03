/**
 */
package iec611313Specification.common;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.common.Range#getHasLowerBound <em>Has Lower Bound</em>}</li>
 *   <li>{@link iec611313Specification.common.Range#getHasUpperBound <em>Has Upper Bound</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.common.CommonPackage#getRange()
 * @model
 * @generated
 */
public interface Range extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Lower Bound</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Lower Bound</em>' containment reference.
	 * @see #setHasLowerBound(Literal)
	 * @see iec611313Specification.common.CommonPackage#getRange_HasLowerBound()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Literal getHasLowerBound();

	/**
	 * Sets the value of the '{@link iec611313Specification.common.Range#getHasLowerBound <em>Has Lower Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Lower Bound</em>' containment reference.
	 * @see #getHasLowerBound()
	 * @generated
	 */
	void setHasLowerBound(Literal value);

	/**
	 * Returns the value of the '<em><b>Has Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Upper Bound</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Upper Bound</em>' containment reference.
	 * @see #setHasUpperBound(Literal)
	 * @see iec611313Specification.common.CommonPackage#getRange_HasUpperBound()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Literal getHasUpperBound();

	/**
	 * Sets the value of the '{@link iec611313Specification.common.Range#getHasUpperBound <em>Has Upper Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Upper Bound</em>' containment reference.
	 * @see #getHasUpperBound()
	 * @generated
	 */
	void setHasUpperBound(Literal value);

} // Range
