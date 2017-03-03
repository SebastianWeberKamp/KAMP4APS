/**
 */
package iec611313Specification.common.pous.function_blocks;

import iec611313Specification.common.oop.Inheritance;
import iec611313Specification.common.oop.Interface;
import iec611313Specification.common.oop.Method;
import iec611313Specification.common.oop.Property;

import iec611313Specification.common.types.ANY_DERIVED;

import iec611313Specification.common.variables.VariableDeclaration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Block Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.common.pous.function_blocks.FunctionBlockType#getHasFunBlockBodySpec <em>Has Fun Block Body Spec</em>}</li>
 *   <li>{@link iec611313Specification.common.pous.function_blocks.FunctionBlockType#getContainsFunctionBlockVarDecl <em>Contains Function Block Var Decl</em>}</li>
 *   <li>{@link iec611313Specification.common.pous.function_blocks.FunctionBlockType#getHasInterfaceImplementations <em>Has Interface Implementations</em>}</li>
 *   <li>{@link iec611313Specification.common.pous.function_blocks.FunctionBlockType#getHasExtensions <em>Has Extensions</em>}</li>
 *   <li>{@link iec611313Specification.common.pous.function_blocks.FunctionBlockType#getContainsMethods <em>Contains Methods</em>}</li>
 *   <li>{@link iec611313Specification.common.pous.function_blocks.FunctionBlockType#getContainsProperties <em>Contains Properties</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.common.pous.function_blocks.Function_blocksPackage#getFunctionBlockType()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='hasValidVariableDeclarations'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='hasValidVariableAccess'"
 * @generated
 */
public interface FunctionBlockType extends ANY_DERIVED {
	/**
	 * Returns the value of the '<em><b>Has Fun Block Body Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Fun Block Body Spec</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Fun Block Body Spec</em>' containment reference.
	 * @see #setHasFunBlockBodySpec(FunctionBlockBodySpecification)
	 * @see iec611313Specification.common.pous.function_blocks.Function_blocksPackage#getFunctionBlockType_HasFunBlockBodySpec()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FunctionBlockBodySpecification getHasFunBlockBodySpec();

	/**
	 * Sets the value of the '{@link iec611313Specification.common.pous.function_blocks.FunctionBlockType#getHasFunBlockBodySpec <em>Has Fun Block Body Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Fun Block Body Spec</em>' containment reference.
	 * @see #getHasFunBlockBodySpec()
	 * @generated
	 */
	void setHasFunBlockBodySpec(FunctionBlockBodySpecification value);

	/**
	 * Returns the value of the '<em><b>Contains Function Block Var Decl</b></em>' containment reference list.
	 * The list contents are of type {@link iec611313Specification.common.variables.VariableDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Function Block Var Decl</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Function Block Var Decl</em>' containment reference list.
	 * @see iec611313Specification.common.pous.function_blocks.Function_blocksPackage#getFunctionBlockType_ContainsFunctionBlockVarDecl()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<VariableDeclaration> getContainsFunctionBlockVarDecl();

	/**
	 * Returns the value of the '<em><b>Has Interface Implementations</b></em>' reference list.
	 * The list contents are of type {@link iec611313Specification.common.oop.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Interface Implementations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Interface Implementations</em>' reference list.
	 * @see iec611313Specification.common.pous.function_blocks.Function_blocksPackage#getFunctionBlockType_HasInterfaceImplementations()
	 * @model
	 * @generated
	 */
	EList<Interface> getHasInterfaceImplementations();

	/**
	 * Returns the value of the '<em><b>Has Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Extensions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Extensions</em>' containment reference.
	 * @see #setHasExtensions(Inheritance)
	 * @see iec611313Specification.common.pous.function_blocks.Function_blocksPackage#getFunctionBlockType_HasExtensions()
	 * @model containment="true"
	 * @generated
	 */
	Inheritance getHasExtensions();

	/**
	 * Sets the value of the '{@link iec611313Specification.common.pous.function_blocks.FunctionBlockType#getHasExtensions <em>Has Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Extensions</em>' containment reference.
	 * @see #getHasExtensions()
	 * @generated
	 */
	void setHasExtensions(Inheritance value);

	/**
	 * Returns the value of the '<em><b>Contains Methods</b></em>' containment reference list.
	 * The list contents are of type {@link iec611313Specification.common.oop.Method}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Methods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Methods</em>' containment reference list.
	 * @see iec611313Specification.common.pous.function_blocks.Function_blocksPackage#getFunctionBlockType_ContainsMethods()
	 * @model containment="true"
	 * @generated
	 */
	EList<Method> getContainsMethods();

	/**
	 * Returns the value of the '<em><b>Contains Properties</b></em>' containment reference list.
	 * The list contents are of type {@link iec611313Specification.common.oop.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Properties</em>' containment reference list.
	 * @see iec611313Specification.common.pous.function_blocks.Function_blocksPackage#getFunctionBlockType_ContainsProperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getContainsProperties();

} // FunctionBlockType
