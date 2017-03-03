/**
 */
package iec611313Specification.configuration;

import iec611313Specification.common.Expression;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.configuration.TaskConfiguration#getName <em>Name</em>}</li>
 *   <li>{@link iec611313Specification.configuration.TaskConfiguration#getConfiguresTask <em>Configures Task</em>}</li>
 *   <li>{@link iec611313Specification.configuration.TaskConfiguration#getHasPriority <em>Has Priority</em>}</li>
 *   <li>{@link iec611313Specification.configuration.TaskConfiguration#getHasSingleExecution <em>Has Single Execution</em>}</li>
 *   <li>{@link iec611313Specification.configuration.TaskConfiguration#getHasIntervalExecution <em>Has Interval Execution</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.configuration.ConfigurationPackage#getTaskConfiguration()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='hasOnlyOneExecutionMechanism'"
 * @generated
 */
public interface TaskConfiguration extends EObject {
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
	 * @see iec611313Specification.configuration.ConfigurationPackage#getTaskConfiguration_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link iec611313Specification.configuration.TaskConfiguration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Configures Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configures Task</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configures Task</em>' containment reference.
	 * @see #setConfiguresTask(Task)
	 * @see iec611313Specification.configuration.ConfigurationPackage#getTaskConfiguration_ConfiguresTask()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Task getConfiguresTask();

	/**
	 * Sets the value of the '{@link iec611313Specification.configuration.TaskConfiguration#getConfiguresTask <em>Configures Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configures Task</em>' containment reference.
	 * @see #getConfiguresTask()
	 * @generated
	 */
	void setConfiguresTask(Task value);

	/**
	 * Returns the value of the '<em><b>Has Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Priority</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Priority</em>' containment reference.
	 * @see #setHasPriority(Expression)
	 * @see iec611313Specification.configuration.ConfigurationPackage#getTaskConfiguration_HasPriority()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getHasPriority();

	/**
	 * Sets the value of the '{@link iec611313Specification.configuration.TaskConfiguration#getHasPriority <em>Has Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Priority</em>' containment reference.
	 * @see #getHasPriority()
	 * @generated
	 */
	void setHasPriority(Expression value);

	/**
	 * Returns the value of the '<em><b>Has Single Execution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Single Execution</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Single Execution</em>' containment reference.
	 * @see #setHasSingleExecution(Expression)
	 * @see iec611313Specification.configuration.ConfigurationPackage#getTaskConfiguration_HasSingleExecution()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getHasSingleExecution();

	/**
	 * Sets the value of the '{@link iec611313Specification.configuration.TaskConfiguration#getHasSingleExecution <em>Has Single Execution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Single Execution</em>' containment reference.
	 * @see #getHasSingleExecution()
	 * @generated
	 */
	void setHasSingleExecution(Expression value);

	/**
	 * Returns the value of the '<em><b>Has Interval Execution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Interval Execution</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Interval Execution</em>' containment reference.
	 * @see #setHasIntervalExecution(Expression)
	 * @see iec611313Specification.configuration.ConfigurationPackage#getTaskConfiguration_HasIntervalExecution()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getHasIntervalExecution();

	/**
	 * Sets the value of the '{@link iec611313Specification.configuration.TaskConfiguration#getHasIntervalExecution <em>Has Interval Execution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Interval Execution</em>' containment reference.
	 * @see #getHasIntervalExecution()
	 * @generated
	 */
	void setHasIntervalExecution(Expression value);

} // TaskConfiguration
