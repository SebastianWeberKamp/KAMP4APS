/**
 */
package iec611313Specification.common.variables;

import iec611313Specification.common.Literal;

import iec611313Specification.common.pous.functions.Function;

import iec611313Specification.common.types.ANY;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.common.variables.VariableDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link iec611313Specification.common.variables.VariableDeclaration#getVariableType <em>Variable Type</em>}</li>
 *   <li>{@link iec611313Specification.common.variables.VariableDeclaration#getVariableModifier <em>Variable Modifier</em>}</li>
 *   <li>{@link iec611313Specification.common.variables.VariableDeclaration#getDeclaresVariableType <em>Declares Variable Type</em>}</li>
 *   <li>{@link iec611313Specification.common.variables.VariableDeclaration#getHasVariableLocation <em>Has Variable Location</em>}</li>
 *   <li>{@link iec611313Specification.common.variables.VariableDeclaration#getHasInitialVariableValue <em>Has Initial Variable Value</em>}</li>
 *   <li>{@link iec611313Specification.common.variables.VariableDeclaration#getIsPartOf <em>Is Part Of</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.common.variables.VariablesPackage#getVariableDeclaration()
 * @model
 * @generated
 */
public interface VariableDeclaration extends EObject {
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
	 * @see iec611313Specification.common.variables.VariablesPackage#getVariableDeclaration_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link iec611313Specification.common.variables.VariableDeclaration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Variable Type</b></em>' attribute.
	 * The literals are from the enumeration {@link iec611313Specification.common.variables.VariableType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Type</em>' attribute.
	 * @see iec611313Specification.common.variables.VariableType
	 * @see #setVariableType(VariableType)
	 * @see iec611313Specification.common.variables.VariablesPackage#getVariableDeclaration_VariableType()
	 * @model required="true"
	 * @generated
	 */
	VariableType getVariableType();

	/**
	 * Sets the value of the '{@link iec611313Specification.common.variables.VariableDeclaration#getVariableType <em>Variable Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Type</em>' attribute.
	 * @see iec611313Specification.common.variables.VariableType
	 * @see #getVariableType()
	 * @generated
	 */
	void setVariableType(VariableType value);

	/**
	 * Returns the value of the '<em><b>Variable Modifier</b></em>' attribute.
	 * The default value is <code>"NONE"</code>.
	 * The literals are from the enumeration {@link iec611313Specification.common.variables.VariableModifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Modifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Modifier</em>' attribute.
	 * @see iec611313Specification.common.variables.VariableModifier
	 * @see #setVariableModifier(VariableModifier)
	 * @see iec611313Specification.common.variables.VariablesPackage#getVariableDeclaration_VariableModifier()
	 * @model default="NONE"
	 * @generated
	 */
	VariableModifier getVariableModifier();

	/**
	 * Sets the value of the '{@link iec611313Specification.common.variables.VariableDeclaration#getVariableModifier <em>Variable Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Modifier</em>' attribute.
	 * @see iec611313Specification.common.variables.VariableModifier
	 * @see #getVariableModifier()
	 * @generated
	 */
	void setVariableModifier(VariableModifier value);

	/**
	 * Returns the value of the '<em><b>Declares Variable Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declares Variable Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declares Variable Type</em>' containment reference.
	 * @see #setDeclaresVariableType(ANY)
	 * @see iec611313Specification.common.variables.VariablesPackage#getVariableDeclaration_DeclaresVariableType()
	 * @model containment="true"
	 * @generated
	 */
	ANY getDeclaresVariableType();

	/**
	 * Sets the value of the '{@link iec611313Specification.common.variables.VariableDeclaration#getDeclaresVariableType <em>Declares Variable Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declares Variable Type</em>' containment reference.
	 * @see #getDeclaresVariableType()
	 * @generated
	 */
	void setDeclaresVariableType(ANY value);

	/**
	 * Returns the value of the '<em><b>Has Variable Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Variable Location</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Variable Location</em>' containment reference.
	 * @see #setHasVariableLocation(LocationSpecification)
	 * @see iec611313Specification.common.variables.VariablesPackage#getVariableDeclaration_HasVariableLocation()
	 * @model containment="true"
	 * @generated
	 */
	LocationSpecification getHasVariableLocation();

	/**
	 * Sets the value of the '{@link iec611313Specification.common.variables.VariableDeclaration#getHasVariableLocation <em>Has Variable Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Variable Location</em>' containment reference.
	 * @see #getHasVariableLocation()
	 * @generated
	 */
	void setHasVariableLocation(LocationSpecification value);

	/**
	 * Returns the value of the '<em><b>Has Initial Variable Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Initial Variable Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Initial Variable Value</em>' containment reference.
	 * @see #setHasInitialVariableValue(Literal)
	 * @see iec611313Specification.common.variables.VariablesPackage#getVariableDeclaration_HasInitialVariableValue()
	 * @model containment="true"
	 * @generated
	 */
	Literal getHasInitialVariableValue();

	/**
	 * Sets the value of the '{@link iec611313Specification.common.variables.VariableDeclaration#getHasInitialVariableValue <em>Has Initial Variable Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Initial Variable Value</em>' containment reference.
	 * @see #getHasInitialVariableValue()
	 * @generated
	 */
	void setHasInitialVariableValue(Literal value);

	/**
	 * Returns the value of the '<em><b>Is Part Of</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link iec611313Specification.common.pous.functions.Function#getContainsFunctionVarDecl <em>Contains Function Var Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Part Of</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Part Of</em>' container reference.
	 * @see #setIsPartOf(Function)
	 * @see iec611313Specification.common.variables.VariablesPackage#getVariableDeclaration_IsPartOf()
	 * @see iec611313Specification.common.pous.functions.Function#getContainsFunctionVarDecl
	 * @model opposite="ContainsFunctionVarDecl" transient="false"
	 * @generated
	 */
	Function getIsPartOf();

	/**
	 * Sets the value of the '{@link iec611313Specification.common.variables.VariableDeclaration#getIsPartOf <em>Is Part Of</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Part Of</em>' container reference.
	 * @see #getIsPartOf()
	 * @generated
	 */
	void setIsPartOf(Function value);

} // VariableDeclaration
