/**
 */
package iec611313Specification.configuration;

import iec611313Specification.common.types.ANY_DERIVED;

import iec611313Specification.common.variables.VariableDeclaration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.configuration.Configuration#getContainsTypeDefinition <em>Contains Type Definition</em>}</li>
 *   <li>{@link iec611313Specification.configuration.Configuration#getContainsConfigVarDecl <em>Contains Config Var Decl</em>}</li>
 *   <li>{@link iec611313Specification.configuration.Configuration#getName <em>Name</em>}</li>
 *   <li>{@link iec611313Specification.configuration.Configuration#getContainsResource <em>Contains Resource</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.configuration.ConfigurationPackage#getConfiguration()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='hasValidVariableDeclarations'"
 * @generated
 */
public interface Configuration extends EObject {
	/**
	 * Returns the value of the '<em><b>Contains Type Definition</b></em>' containment reference list.
	 * The list contents are of type {@link iec611313Specification.common.types.ANY_DERIVED}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Type Definition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Type Definition</em>' containment reference list.
	 * @see iec611313Specification.configuration.ConfigurationPackage#getConfiguration_ContainsTypeDefinition()
	 * @model containment="true"
	 * @generated
	 */
	EList<ANY_DERIVED> getContainsTypeDefinition();

	/**
	 * Returns the value of the '<em><b>Contains Config Var Decl</b></em>' containment reference list.
	 * The list contents are of type {@link iec611313Specification.common.variables.VariableDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Config Var Decl</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Config Var Decl</em>' containment reference list.
	 * @see iec611313Specification.configuration.ConfigurationPackage#getConfiguration_ContainsConfigVarDecl()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariableDeclaration> getContainsConfigVarDecl();

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
	 * @see iec611313Specification.configuration.ConfigurationPackage#getConfiguration_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link iec611313Specification.configuration.Configuration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Contains Resource</b></em>' containment reference list.
	 * The list contents are of type {@link iec611313Specification.configuration.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Resource</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Resource</em>' containment reference list.
	 * @see iec611313Specification.configuration.ConfigurationPackage#getConfiguration_ContainsResource()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Resource> getContainsResource();

} // Configuration
