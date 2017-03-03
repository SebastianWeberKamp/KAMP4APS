/**
 */
package iec611313Specification.common.pous.functions;

import iec611313Specification.common.types.ANY;

import iec611313Specification.common.variables.VariableDeclaration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.common.pous.functions.Function#getHasFunctionBodySpec <em>Has Function Body Spec</em>}</li>
 *   <li>{@link iec611313Specification.common.pous.functions.Function#getContainsFunctionVarDecl <em>Contains Function Var Decl</em>}</li>
 *   <li>{@link iec611313Specification.common.pous.functions.Function#getHasFunctionReturnType <em>Has Function Return Type</em>}</li>
 *   <li>{@link iec611313Specification.common.pous.functions.Function#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.common.pous.functions.FunctionsPackage#getFunction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='hasValidVariableDeclarations'"
 * @generated
 */
public interface Function extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Function Body Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Function Body Spec</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Function Body Spec</em>' containment reference.
	 * @see #setHasFunctionBodySpec(FunctionBodySpecification)
	 * @see iec611313Specification.common.pous.functions.FunctionsPackage#getFunction_HasFunctionBodySpec()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FunctionBodySpecification getHasFunctionBodySpec();

	/**
	 * Sets the value of the '{@link iec611313Specification.common.pous.functions.Function#getHasFunctionBodySpec <em>Has Function Body Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Function Body Spec</em>' containment reference.
	 * @see #getHasFunctionBodySpec()
	 * @generated
	 */
	void setHasFunctionBodySpec(FunctionBodySpecification value);

	/**
	 * Returns the value of the '<em><b>Contains Function Var Decl</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link iec611313Specification.common.variables.VariableDeclaration#getIsPartOf <em>Is Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Function Var Decl</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Function Var Decl</em>' containment reference.
	 * @see #setContainsFunctionVarDecl(VariableDeclaration)
	 * @see iec611313Specification.common.pous.functions.FunctionsPackage#getFunction_ContainsFunctionVarDecl()
	 * @see iec611313Specification.common.variables.VariableDeclaration#getIsPartOf
	 * @model opposite="IsPartOf" containment="true"
	 * @generated
	 */
	VariableDeclaration getContainsFunctionVarDecl();

	/**
	 * Sets the value of the '{@link iec611313Specification.common.pous.functions.Function#getContainsFunctionVarDecl <em>Contains Function Var Decl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contains Function Var Decl</em>' containment reference.
	 * @see #getContainsFunctionVarDecl()
	 * @generated
	 */
	void setContainsFunctionVarDecl(VariableDeclaration value);

	/**
	 * Returns the value of the '<em><b>Has Function Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Function Return Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Function Return Type</em>' containment reference.
	 * @see #setHasFunctionReturnType(ANY)
	 * @see iec611313Specification.common.pous.functions.FunctionsPackage#getFunction_HasFunctionReturnType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ANY getHasFunctionReturnType();

	/**
	 * Sets the value of the '{@link iec611313Specification.common.pous.functions.Function#getHasFunctionReturnType <em>Has Function Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Function Return Type</em>' containment reference.
	 * @see #getHasFunctionReturnType()
	 * @generated
	 */
	void setHasFunctionReturnType(ANY value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see iec611313Specification.common.pous.functions.FunctionsPackage#getFunction_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link iec611313Specification.common.pous.functions.Function#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Function
