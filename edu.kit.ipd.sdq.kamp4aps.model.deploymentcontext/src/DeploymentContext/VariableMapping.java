/**
 */
package DeploymentContext;

import iec611313Specification.common.variables.VariableDeclaration;

import org.eclipse.emf.ecore.EObject;

import xPPU.InterfaceRepository.Interface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DeploymentContext.VariableMapping#getName <em>Name</em>}</li>
 *   <li>{@link DeploymentContext.VariableMapping#getProgramVariable <em>Program Variable</em>}</li>
 *   <li>{@link DeploymentContext.VariableMapping#getInterfaceDeclaration <em>Interface Declaration</em>}</li>
 *   <li>{@link DeploymentContext.VariableMapping#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see DeploymentContext.DeploymentContextPackage#getVariableMapping()
 * @model
 * @generated
 */
public interface VariableMapping extends EObject {
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
	 * @see DeploymentContext.DeploymentContextPackage#getVariableMapping_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link DeploymentContext.VariableMapping#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Program Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Program Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program Variable</em>' reference.
	 * @see #setProgramVariable(VariableDeclaration)
	 * @see DeploymentContext.DeploymentContextPackage#getVariableMapping_ProgramVariable()
	 * @model required="true"
	 * @generated
	 */
	VariableDeclaration getProgramVariable();

	/**
	 * Sets the value of the '{@link DeploymentContext.VariableMapping#getProgramVariable <em>Program Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program Variable</em>' reference.
	 * @see #getProgramVariable()
	 * @generated
	 */
	void setProgramVariable(VariableDeclaration value);

	/**
	 * Returns the value of the '<em><b>Interface Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Declaration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Declaration</em>' reference.
	 * @see #setInterfaceDeclaration(Interface)
	 * @see DeploymentContext.DeploymentContextPackage#getVariableMapping_InterfaceDeclaration()
	 * @model required="true"
	 * @generated
	 */
	Interface getInterfaceDeclaration();

	/**
	 * Sets the value of the '{@link DeploymentContext.VariableMapping#getInterfaceDeclaration <em>Interface Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Declaration</em>' reference.
	 * @see #getInterfaceDeclaration()
	 * @generated
	 */
	void setInterfaceDeclaration(Interface value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link DeploymentContext.ComponentCorrelation#getVariableMapping <em>Variable Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(ComponentCorrelation)
	 * @see DeploymentContext.DeploymentContextPackage#getVariableMapping_Parent()
	 * @see DeploymentContext.ComponentCorrelation#getVariableMapping
	 * @model opposite="variableMapping" required="true" transient="false"
	 * @generated
	 */
	ComponentCorrelation getParent();

	/**
	 * Sets the value of the '{@link DeploymentContext.VariableMapping#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(ComponentCorrelation value);

} // VariableMapping
