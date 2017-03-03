/**
 */
package iec611313Specification.common.pous.programs;

import iec611313Specification.common.variables.VariableAccess;

import iec611313Specification.configuration.Task;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Block Instance Task Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.common.pous.programs.FunctionBlockInstanceTaskAssignment#getAssignsFunBlockInstance <em>Assigns Fun Block Instance</em>}</li>
 *   <li>{@link iec611313Specification.common.pous.programs.FunctionBlockInstanceTaskAssignment#getHasFunBlockAssignTask <em>Has Fun Block Assign Task</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.common.pous.programs.ProgramsPackage#getFunctionBlockInstanceTaskAssignment()
 * @model
 * @generated
 */
public interface FunctionBlockInstanceTaskAssignment extends ProgramConfigElement {
	/**
	 * Returns the value of the '<em><b>Assigns Fun Block Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigns Fun Block Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigns Fun Block Instance</em>' reference.
	 * @see #setAssignsFunBlockInstance(VariableAccess)
	 * @see iec611313Specification.common.pous.programs.ProgramsPackage#getFunctionBlockInstanceTaskAssignment_AssignsFunBlockInstance()
	 * @model required="true"
	 * @generated
	 */
	VariableAccess getAssignsFunBlockInstance();

	/**
	 * Sets the value of the '{@link iec611313Specification.common.pous.programs.FunctionBlockInstanceTaskAssignment#getAssignsFunBlockInstance <em>Assigns Fun Block Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assigns Fun Block Instance</em>' reference.
	 * @see #getAssignsFunBlockInstance()
	 * @generated
	 */
	void setAssignsFunBlockInstance(VariableAccess value);

	/**
	 * Returns the value of the '<em><b>Has Fun Block Assign Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Fun Block Assign Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Fun Block Assign Task</em>' reference.
	 * @see #setHasFunBlockAssignTask(Task)
	 * @see iec611313Specification.common.pous.programs.ProgramsPackage#getFunctionBlockInstanceTaskAssignment_HasFunBlockAssignTask()
	 * @model required="true"
	 * @generated
	 */
	Task getHasFunBlockAssignTask();

	/**
	 * Sets the value of the '{@link iec611313Specification.common.pous.programs.FunctionBlockInstanceTaskAssignment#getHasFunBlockAssignTask <em>Has Fun Block Assign Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Fun Block Assign Task</em>' reference.
	 * @see #getHasFunBlockAssignTask()
	 * @generated
	 */
	void setHasFunBlockAssignTask(Task value);

} // FunctionBlockInstanceTaskAssignment
