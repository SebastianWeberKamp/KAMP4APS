/**
 */
package iec611313Specification.common.types;

import iec611313Specification.common.variables.VariableDeclaration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>STRUCTURE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.common.types.STRUCTURE#getContainsStructVarDecl <em>Contains Struct Var Decl</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.common.types.TypesPackage#getSTRUCTURE()
 * @model
 * @generated
 */
public interface STRUCTURE extends ANY_DERIVED {
	/**
	 * Returns the value of the '<em><b>Contains Struct Var Decl</b></em>' containment reference list.
	 * The list contents are of type {@link iec611313Specification.common.variables.VariableDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Struct Var Decl</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Struct Var Decl</em>' containment reference list.
	 * @see iec611313Specification.common.types.TypesPackage#getSTRUCTURE_ContainsStructVarDecl()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<VariableDeclaration> getContainsStructVarDecl();

} // STRUCTURE
