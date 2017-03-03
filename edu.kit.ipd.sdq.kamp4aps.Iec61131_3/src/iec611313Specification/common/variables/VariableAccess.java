/**
 */
package iec611313Specification.common.variables;

import iec611313Specification.common.Expression;

import iec611313Specification.language.fbd.FBDElement;
import iec611313Specification.language.fbd.SignalSink;

import iec611313Specification.language.ld.LDElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.common.variables.VariableAccess#getHasVariableDeclaration <em>Has Variable Declaration</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.common.variables.VariablesPackage#getVariableAccess()
 * @model
 * @generated
 */
public interface VariableAccess extends Expression, SignalSink, FBDElement, LDElement {
	/**
	 * Returns the value of the '<em><b>Has Variable Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Variable Declaration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Variable Declaration</em>' reference.
	 * @see #setHasVariableDeclaration(VariableDeclaration)
	 * @see iec611313Specification.common.variables.VariablesPackage#getVariableAccess_HasVariableDeclaration()
	 * @model required="true"
	 * @generated
	 */
	VariableDeclaration getHasVariableDeclaration();

	/**
	 * Sets the value of the '{@link iec611313Specification.common.variables.VariableAccess#getHasVariableDeclaration <em>Has Variable Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Variable Declaration</em>' reference.
	 * @see #getHasVariableDeclaration()
	 * @generated
	 */
	void setHasVariableDeclaration(VariableDeclaration value);

} // VariableAccess
