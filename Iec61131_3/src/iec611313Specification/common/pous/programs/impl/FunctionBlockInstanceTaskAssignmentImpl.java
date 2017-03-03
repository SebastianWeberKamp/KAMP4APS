/**
 */
package iec611313Specification.common.pous.programs.impl;

import iec611313Specification.common.pous.programs.FunctionBlockInstanceTaskAssignment;
import iec611313Specification.common.pous.programs.ProgramsPackage;

import iec611313Specification.common.variables.VariableAccess;

import iec611313Specification.configuration.Task;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Block Instance Task Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.common.pous.programs.impl.FunctionBlockInstanceTaskAssignmentImpl#getAssignsFunBlockInstance <em>Assigns Fun Block Instance</em>}</li>
 *   <li>{@link iec611313Specification.common.pous.programs.impl.FunctionBlockInstanceTaskAssignmentImpl#getHasFunBlockAssignTask <em>Has Fun Block Assign Task</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionBlockInstanceTaskAssignmentImpl extends ProgramConfigElementImpl implements FunctionBlockInstanceTaskAssignment {
	/**
	 * The cached value of the '{@link #getAssignsFunBlockInstance() <em>Assigns Fun Block Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignsFunBlockInstance()
	 * @generated
	 * @ordered
	 */
	protected VariableAccess assignsFunBlockInstance;

	/**
	 * The cached value of the '{@link #getHasFunBlockAssignTask() <em>Has Fun Block Assign Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasFunBlockAssignTask()
	 * @generated
	 * @ordered
	 */
	protected Task hasFunBlockAssignTask;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionBlockInstanceTaskAssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProgramsPackage.Literals.FUNCTION_BLOCK_INSTANCE_TASK_ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableAccess getAssignsFunBlockInstance() {
		if (assignsFunBlockInstance != null && assignsFunBlockInstance.eIsProxy()) {
			InternalEObject oldAssignsFunBlockInstance = (InternalEObject)assignsFunBlockInstance;
			assignsFunBlockInstance = (VariableAccess)eResolveProxy(oldAssignsFunBlockInstance);
			if (assignsFunBlockInstance != oldAssignsFunBlockInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProgramsPackage.FUNCTION_BLOCK_INSTANCE_TASK_ASSIGNMENT__ASSIGNS_FUN_BLOCK_INSTANCE, oldAssignsFunBlockInstance, assignsFunBlockInstance));
			}
		}
		return assignsFunBlockInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableAccess basicGetAssignsFunBlockInstance() {
		return assignsFunBlockInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignsFunBlockInstance(VariableAccess newAssignsFunBlockInstance) {
		VariableAccess oldAssignsFunBlockInstance = assignsFunBlockInstance;
		assignsFunBlockInstance = newAssignsFunBlockInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgramsPackage.FUNCTION_BLOCK_INSTANCE_TASK_ASSIGNMENT__ASSIGNS_FUN_BLOCK_INSTANCE, oldAssignsFunBlockInstance, assignsFunBlockInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getHasFunBlockAssignTask() {
		if (hasFunBlockAssignTask != null && hasFunBlockAssignTask.eIsProxy()) {
			InternalEObject oldHasFunBlockAssignTask = (InternalEObject)hasFunBlockAssignTask;
			hasFunBlockAssignTask = (Task)eResolveProxy(oldHasFunBlockAssignTask);
			if (hasFunBlockAssignTask != oldHasFunBlockAssignTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProgramsPackage.FUNCTION_BLOCK_INSTANCE_TASK_ASSIGNMENT__HAS_FUN_BLOCK_ASSIGN_TASK, oldHasFunBlockAssignTask, hasFunBlockAssignTask));
			}
		}
		return hasFunBlockAssignTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetHasFunBlockAssignTask() {
		return hasFunBlockAssignTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasFunBlockAssignTask(Task newHasFunBlockAssignTask) {
		Task oldHasFunBlockAssignTask = hasFunBlockAssignTask;
		hasFunBlockAssignTask = newHasFunBlockAssignTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgramsPackage.FUNCTION_BLOCK_INSTANCE_TASK_ASSIGNMENT__HAS_FUN_BLOCK_ASSIGN_TASK, oldHasFunBlockAssignTask, hasFunBlockAssignTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProgramsPackage.FUNCTION_BLOCK_INSTANCE_TASK_ASSIGNMENT__ASSIGNS_FUN_BLOCK_INSTANCE:
				if (resolve) return getAssignsFunBlockInstance();
				return basicGetAssignsFunBlockInstance();
			case ProgramsPackage.FUNCTION_BLOCK_INSTANCE_TASK_ASSIGNMENT__HAS_FUN_BLOCK_ASSIGN_TASK:
				if (resolve) return getHasFunBlockAssignTask();
				return basicGetHasFunBlockAssignTask();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProgramsPackage.FUNCTION_BLOCK_INSTANCE_TASK_ASSIGNMENT__ASSIGNS_FUN_BLOCK_INSTANCE:
				setAssignsFunBlockInstance((VariableAccess)newValue);
				return;
			case ProgramsPackage.FUNCTION_BLOCK_INSTANCE_TASK_ASSIGNMENT__HAS_FUN_BLOCK_ASSIGN_TASK:
				setHasFunBlockAssignTask((Task)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ProgramsPackage.FUNCTION_BLOCK_INSTANCE_TASK_ASSIGNMENT__ASSIGNS_FUN_BLOCK_INSTANCE:
				setAssignsFunBlockInstance((VariableAccess)null);
				return;
			case ProgramsPackage.FUNCTION_BLOCK_INSTANCE_TASK_ASSIGNMENT__HAS_FUN_BLOCK_ASSIGN_TASK:
				setHasFunBlockAssignTask((Task)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ProgramsPackage.FUNCTION_BLOCK_INSTANCE_TASK_ASSIGNMENT__ASSIGNS_FUN_BLOCK_INSTANCE:
				return assignsFunBlockInstance != null;
			case ProgramsPackage.FUNCTION_BLOCK_INSTANCE_TASK_ASSIGNMENT__HAS_FUN_BLOCK_ASSIGN_TASK:
				return hasFunBlockAssignTask != null;
		}
		return super.eIsSet(featureID);
	}

} //FunctionBlockInstanceTaskAssignmentImpl
