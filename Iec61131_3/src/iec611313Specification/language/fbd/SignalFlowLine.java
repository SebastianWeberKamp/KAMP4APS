/**
 */
package iec611313Specification.language.fbd;

import iec611313Specification.common.Expression;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Flow Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.language.fbd.SignalFlowLine#getHasSignalSink <em>Has Signal Sink</em>}</li>
 *   <li>{@link iec611313Specification.language.fbd.SignalFlowLine#getHasSignalSource <em>Has Signal Source</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.language.fbd.FbdPackage#getSignalFlowLine()
 * @model
 * @generated
 */
public interface SignalFlowLine extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Signal Sink</b></em>' reference list.
	 * The list contents are of type {@link iec611313Specification.language.fbd.SignalSink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Signal Sink</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Signal Sink</em>' reference list.
	 * @see iec611313Specification.language.fbd.FbdPackage#getSignalFlowLine_HasSignalSink()
	 * @model required="true"
	 * @generated
	 */
	EList<SignalSink> getHasSignalSink();

	/**
	 * Returns the value of the '<em><b>Has Signal Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Signal Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Signal Source</em>' reference.
	 * @see #setHasSignalSource(Expression)
	 * @see iec611313Specification.language.fbd.FbdPackage#getSignalFlowLine_HasSignalSource()
	 * @model required="true"
	 * @generated
	 */
	Expression getHasSignalSource();

	/**
	 * Sets the value of the '{@link iec611313Specification.language.fbd.SignalFlowLine#getHasSignalSource <em>Has Signal Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Signal Source</em>' reference.
	 * @see #getHasSignalSource()
	 * @generated
	 */
	void setHasSignalSource(Expression value);

} // SignalFlowLine
