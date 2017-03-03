/**
 */
package iec611313Specification.configuration;

import iec611313Specification.common.pous.programs.ProgramConfiguration;

import iec611313Specification.common.variables.VariableDeclaration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.configuration.Resource#getName <em>Name</em>}</li>
 *   <li>{@link iec611313Specification.configuration.Resource#getResourceTypeName <em>Resource Type Name</em>}</li>
 *   <li>{@link iec611313Specification.configuration.Resource#getContainsProgramConfigs <em>Contains Program Configs</em>}</li>
 *   <li>{@link iec611313Specification.configuration.Resource#getContainsResourceVarDecl <em>Contains Resource Var Decl</em>}</li>
 *   <li>{@link iec611313Specification.configuration.Resource#getContainsTaskConfigs <em>Contains Task Configs</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.configuration.ConfigurationPackage#getResource()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='hasValidVariableDeclarations'"
 * @generated
 */
public interface Resource extends EObject {
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
	 * @see iec611313Specification.configuration.ConfigurationPackage#getResource_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link iec611313Specification.configuration.Resource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Resource Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Type Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Type Name</em>' attribute.
	 * @see #setResourceTypeName(String)
	 * @see iec611313Specification.configuration.ConfigurationPackage#getResource_ResourceTypeName()
	 * @model required="true"
	 * @generated
	 */
	String getResourceTypeName();

	/**
	 * Sets the value of the '{@link iec611313Specification.configuration.Resource#getResourceTypeName <em>Resource Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Type Name</em>' attribute.
	 * @see #getResourceTypeName()
	 * @generated
	 */
	void setResourceTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Contains Program Configs</b></em>' containment reference list.
	 * The list contents are of type {@link iec611313Specification.common.pous.programs.ProgramConfiguration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Program Configs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Program Configs</em>' containment reference list.
	 * @see iec611313Specification.configuration.ConfigurationPackage#getResource_ContainsProgramConfigs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ProgramConfiguration> getContainsProgramConfigs();

	/**
	 * Returns the value of the '<em><b>Contains Resource Var Decl</b></em>' containment reference list.
	 * The list contents are of type {@link iec611313Specification.common.variables.VariableDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Resource Var Decl</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Resource Var Decl</em>' containment reference list.
	 * @see iec611313Specification.configuration.ConfigurationPackage#getResource_ContainsResourceVarDecl()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariableDeclaration> getContainsResourceVarDecl();

	/**
	 * Returns the value of the '<em><b>Contains Task Configs</b></em>' containment reference list.
	 * The list contents are of type {@link iec611313Specification.configuration.TaskConfiguration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Task Configs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Task Configs</em>' containment reference list.
	 * @see iec611313Specification.configuration.ConfigurationPackage#getResource_ContainsTaskConfigs()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskConfiguration> getContainsTaskConfigs();

} // Resource
