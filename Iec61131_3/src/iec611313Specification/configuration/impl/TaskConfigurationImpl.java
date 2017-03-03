/**
 */
package iec611313Specification.configuration.impl;

import iec611313Specification.common.Expression;

import iec611313Specification.configuration.ConfigurationPackage;
import iec611313Specification.configuration.Task;
import iec611313Specification.configuration.TaskConfiguration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.configuration.impl.TaskConfigurationImpl#getName <em>Name</em>}</li>
 *   <li>{@link iec611313Specification.configuration.impl.TaskConfigurationImpl#getConfiguresTask <em>Configures Task</em>}</li>
 *   <li>{@link iec611313Specification.configuration.impl.TaskConfigurationImpl#getHasPriority <em>Has Priority</em>}</li>
 *   <li>{@link iec611313Specification.configuration.impl.TaskConfigurationImpl#getHasSingleExecution <em>Has Single Execution</em>}</li>
 *   <li>{@link iec611313Specification.configuration.impl.TaskConfigurationImpl#getHasIntervalExecution <em>Has Interval Execution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskConfigurationImpl extends MinimalEObjectImpl.Container implements TaskConfiguration {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConfiguresTask() <em>Configures Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguresTask()
	 * @generated
	 * @ordered
	 */
	protected Task configuresTask;

	/**
	 * The cached value of the '{@link #getHasPriority() <em>Has Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPriority()
	 * @generated
	 * @ordered
	 */
	protected Expression hasPriority;

	/**
	 * The cached value of the '{@link #getHasSingleExecution() <em>Has Single Execution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasSingleExecution()
	 * @generated
	 * @ordered
	 */
	protected Expression hasSingleExecution;

	/**
	 * The cached value of the '{@link #getHasIntervalExecution() <em>Has Interval Execution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasIntervalExecution()
	 * @generated
	 * @ordered
	 */
	protected Expression hasIntervalExecution;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.TASK_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.TASK_CONFIGURATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getConfiguresTask() {
		return configuresTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfiguresTask(Task newConfiguresTask, NotificationChain msgs) {
		Task oldConfiguresTask = configuresTask;
		configuresTask = newConfiguresTask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigurationPackage.TASK_CONFIGURATION__CONFIGURES_TASK, oldConfiguresTask, newConfiguresTask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfiguresTask(Task newConfiguresTask) {
		if (newConfiguresTask != configuresTask) {
			NotificationChain msgs = null;
			if (configuresTask != null)
				msgs = ((InternalEObject)configuresTask).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.TASK_CONFIGURATION__CONFIGURES_TASK, null, msgs);
			if (newConfiguresTask != null)
				msgs = ((InternalEObject)newConfiguresTask).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.TASK_CONFIGURATION__CONFIGURES_TASK, null, msgs);
			msgs = basicSetConfiguresTask(newConfiguresTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.TASK_CONFIGURATION__CONFIGURES_TASK, newConfiguresTask, newConfiguresTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getHasPriority() {
		return hasPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasPriority(Expression newHasPriority, NotificationChain msgs) {
		Expression oldHasPriority = hasPriority;
		hasPriority = newHasPriority;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigurationPackage.TASK_CONFIGURATION__HAS_PRIORITY, oldHasPriority, newHasPriority);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasPriority(Expression newHasPriority) {
		if (newHasPriority != hasPriority) {
			NotificationChain msgs = null;
			if (hasPriority != null)
				msgs = ((InternalEObject)hasPriority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.TASK_CONFIGURATION__HAS_PRIORITY, null, msgs);
			if (newHasPriority != null)
				msgs = ((InternalEObject)newHasPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.TASK_CONFIGURATION__HAS_PRIORITY, null, msgs);
			msgs = basicSetHasPriority(newHasPriority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.TASK_CONFIGURATION__HAS_PRIORITY, newHasPriority, newHasPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getHasSingleExecution() {
		return hasSingleExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasSingleExecution(Expression newHasSingleExecution, NotificationChain msgs) {
		Expression oldHasSingleExecution = hasSingleExecution;
		hasSingleExecution = newHasSingleExecution;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigurationPackage.TASK_CONFIGURATION__HAS_SINGLE_EXECUTION, oldHasSingleExecution, newHasSingleExecution);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasSingleExecution(Expression newHasSingleExecution) {
		if (newHasSingleExecution != hasSingleExecution) {
			NotificationChain msgs = null;
			if (hasSingleExecution != null)
				msgs = ((InternalEObject)hasSingleExecution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.TASK_CONFIGURATION__HAS_SINGLE_EXECUTION, null, msgs);
			if (newHasSingleExecution != null)
				msgs = ((InternalEObject)newHasSingleExecution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.TASK_CONFIGURATION__HAS_SINGLE_EXECUTION, null, msgs);
			msgs = basicSetHasSingleExecution(newHasSingleExecution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.TASK_CONFIGURATION__HAS_SINGLE_EXECUTION, newHasSingleExecution, newHasSingleExecution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getHasIntervalExecution() {
		return hasIntervalExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasIntervalExecution(Expression newHasIntervalExecution, NotificationChain msgs) {
		Expression oldHasIntervalExecution = hasIntervalExecution;
		hasIntervalExecution = newHasIntervalExecution;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigurationPackage.TASK_CONFIGURATION__HAS_INTERVAL_EXECUTION, oldHasIntervalExecution, newHasIntervalExecution);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasIntervalExecution(Expression newHasIntervalExecution) {
		if (newHasIntervalExecution != hasIntervalExecution) {
			NotificationChain msgs = null;
			if (hasIntervalExecution != null)
				msgs = ((InternalEObject)hasIntervalExecution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.TASK_CONFIGURATION__HAS_INTERVAL_EXECUTION, null, msgs);
			if (newHasIntervalExecution != null)
				msgs = ((InternalEObject)newHasIntervalExecution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.TASK_CONFIGURATION__HAS_INTERVAL_EXECUTION, null, msgs);
			msgs = basicSetHasIntervalExecution(newHasIntervalExecution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.TASK_CONFIGURATION__HAS_INTERVAL_EXECUTION, newHasIntervalExecution, newHasIntervalExecution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigurationPackage.TASK_CONFIGURATION__CONFIGURES_TASK:
				return basicSetConfiguresTask(null, msgs);
			case ConfigurationPackage.TASK_CONFIGURATION__HAS_PRIORITY:
				return basicSetHasPriority(null, msgs);
			case ConfigurationPackage.TASK_CONFIGURATION__HAS_SINGLE_EXECUTION:
				return basicSetHasSingleExecution(null, msgs);
			case ConfigurationPackage.TASK_CONFIGURATION__HAS_INTERVAL_EXECUTION:
				return basicSetHasIntervalExecution(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigurationPackage.TASK_CONFIGURATION__NAME:
				return getName();
			case ConfigurationPackage.TASK_CONFIGURATION__CONFIGURES_TASK:
				return getConfiguresTask();
			case ConfigurationPackage.TASK_CONFIGURATION__HAS_PRIORITY:
				return getHasPriority();
			case ConfigurationPackage.TASK_CONFIGURATION__HAS_SINGLE_EXECUTION:
				return getHasSingleExecution();
			case ConfigurationPackage.TASK_CONFIGURATION__HAS_INTERVAL_EXECUTION:
				return getHasIntervalExecution();
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
			case ConfigurationPackage.TASK_CONFIGURATION__NAME:
				setName((String)newValue);
				return;
			case ConfigurationPackage.TASK_CONFIGURATION__CONFIGURES_TASK:
				setConfiguresTask((Task)newValue);
				return;
			case ConfigurationPackage.TASK_CONFIGURATION__HAS_PRIORITY:
				setHasPriority((Expression)newValue);
				return;
			case ConfigurationPackage.TASK_CONFIGURATION__HAS_SINGLE_EXECUTION:
				setHasSingleExecution((Expression)newValue);
				return;
			case ConfigurationPackage.TASK_CONFIGURATION__HAS_INTERVAL_EXECUTION:
				setHasIntervalExecution((Expression)newValue);
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
			case ConfigurationPackage.TASK_CONFIGURATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConfigurationPackage.TASK_CONFIGURATION__CONFIGURES_TASK:
				setConfiguresTask((Task)null);
				return;
			case ConfigurationPackage.TASK_CONFIGURATION__HAS_PRIORITY:
				setHasPriority((Expression)null);
				return;
			case ConfigurationPackage.TASK_CONFIGURATION__HAS_SINGLE_EXECUTION:
				setHasSingleExecution((Expression)null);
				return;
			case ConfigurationPackage.TASK_CONFIGURATION__HAS_INTERVAL_EXECUTION:
				setHasIntervalExecution((Expression)null);
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
			case ConfigurationPackage.TASK_CONFIGURATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConfigurationPackage.TASK_CONFIGURATION__CONFIGURES_TASK:
				return configuresTask != null;
			case ConfigurationPackage.TASK_CONFIGURATION__HAS_PRIORITY:
				return hasPriority != null;
			case ConfigurationPackage.TASK_CONFIGURATION__HAS_SINGLE_EXECUTION:
				return hasSingleExecution != null;
			case ConfigurationPackage.TASK_CONFIGURATION__HAS_INTERVAL_EXECUTION:
				return hasIntervalExecution != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TaskConfigurationImpl
