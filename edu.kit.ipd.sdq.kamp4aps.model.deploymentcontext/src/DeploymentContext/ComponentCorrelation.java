/**
 */
package DeploymentContext;

import iec611313Specification.common.pous.programs.ProgramType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import xPPU.ComponentRepository.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Correlation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DeploymentContext.ComponentCorrelation#getParent <em>Parent</em>}</li>
 *   <li>{@link DeploymentContext.ComponentCorrelation#getComponent <em>Component</em>}</li>
 *   <li>{@link DeploymentContext.ComponentCorrelation#getProgram <em>Program</em>}</li>
 *   <li>{@link DeploymentContext.ComponentCorrelation#getName <em>Name</em>}</li>
 *   <li>{@link DeploymentContext.ComponentCorrelation#getVariableMapping <em>Variable Mapping</em>}</li>
 * </ul>
 *
 * @see DeploymentContext.DeploymentContextPackage#getComponentCorrelation()
 * @model
 * @generated
 */
public interface ComponentCorrelation extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link DeploymentContext.DeploymentContextRepository#getComponentCorrelation <em>Component Correlation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(DeploymentContextRepository)
	 * @see DeploymentContext.DeploymentContextPackage#getComponentCorrelation_Parent()
	 * @see DeploymentContext.DeploymentContextRepository#getComponentCorrelation
	 * @model opposite="componentCorrelation" required="true" transient="false"
	 * @generated
	 */
	DeploymentContextRepository getParent();

	/**
	 * Sets the value of the '{@link DeploymentContext.ComponentCorrelation#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(DeploymentContextRepository value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(Component)
	 * @see DeploymentContext.DeploymentContextPackage#getComponentCorrelation_Component()
	 * @model
	 * @generated
	 */
	Component getComponent();

	/**
	 * Sets the value of the '{@link DeploymentContext.ComponentCorrelation#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(Component value);

	/**
	 * Returns the value of the '<em><b>Program</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Program</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program</em>' reference.
	 * @see #setProgram(ProgramType)
	 * @see DeploymentContext.DeploymentContextPackage#getComponentCorrelation_Program()
	 * @model
	 * @generated
	 */
	ProgramType getProgram();

	/**
	 * Sets the value of the '{@link DeploymentContext.ComponentCorrelation#getProgram <em>Program</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program</em>' reference.
	 * @see #getProgram()
	 * @generated
	 */
	void setProgram(ProgramType value);

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
	 * @see DeploymentContext.DeploymentContextPackage#getComponentCorrelation_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link DeploymentContext.ComponentCorrelation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Variable Mapping</b></em>' containment reference list.
	 * The list contents are of type {@link DeploymentContext.VariableMapping}.
	 * It is bidirectional and its opposite is '{@link DeploymentContext.VariableMapping#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Mapping</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Mapping</em>' containment reference list.
	 * @see DeploymentContext.DeploymentContextPackage#getComponentCorrelation_VariableMapping()
	 * @see DeploymentContext.VariableMapping#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<VariableMapping> getVariableMapping();

} // ComponentCorrelation
