/**
 */
package iec611313Specification.common;

import iec611313Specification.language.fbd.SignalSink;

import iec611313Specification.language.ld.LDElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jump</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.common.Jump#getHasJumpTarget <em>Has Jump Target</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.common.CommonPackage#getJump()
 * @model
 * @generated
 */
public interface Jump extends SignalSink, LDElement {
	/**
	 * Returns the value of the '<em><b>Has Jump Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Jump Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Jump Target</em>' reference.
	 * @see #setHasJumpTarget(Label)
	 * @see iec611313Specification.common.CommonPackage#getJump_HasJumpTarget()
	 * @model required="true"
	 * @generated
	 */
	Label getHasJumpTarget();

	/**
	 * Sets the value of the '{@link iec611313Specification.common.Jump#getHasJumpTarget <em>Has Jump Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Jump Target</em>' reference.
	 * @see #getHasJumpTarget()
	 * @generated
	 */
	void setHasJumpTarget(Label value);

} // Jump
