/**
 */
package iec611313Specification.language.ld;

import iec611313Specification.common.variables.VariableAccess;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LD Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.language.ld.LDNode#getHasLDNodeVariable <em>Has LD Node Variable</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.language.ld.LdPackage#getLDNode()
 * @model abstract="true"
 * @generated
 */
public interface LDNode extends LDElement {
	/**
	 * Returns the value of the '<em><b>Has LD Node Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has LD Node Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has LD Node Variable</em>' reference.
	 * @see #setHasLDNodeVariable(VariableAccess)
	 * @see iec611313Specification.language.ld.LdPackage#getLDNode_HasLDNodeVariable()
	 * @model required="true"
	 * @generated
	 */
	VariableAccess getHasLDNodeVariable();

	/**
	 * Sets the value of the '{@link iec611313Specification.language.ld.LDNode#getHasLDNodeVariable <em>Has LD Node Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has LD Node Variable</em>' reference.
	 * @see #getHasLDNodeVariable()
	 * @generated
	 */
	void setHasLDNodeVariable(VariableAccess value);

} // LDNode
