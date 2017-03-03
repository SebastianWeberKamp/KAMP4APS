/**
 */
package iec611313Specification.configuration.impl;

import iec611313Specification.common.pous.programs.ProgramConfiguration;

import iec611313Specification.common.variables.VariableDeclaration;

import iec611313Specification.configuration.ConfigurationPackage;
import iec611313Specification.configuration.Resource;
import iec611313Specification.configuration.TaskConfiguration;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.configuration.impl.ResourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link iec611313Specification.configuration.impl.ResourceImpl#getResourceTypeName <em>Resource Type Name</em>}</li>
 *   <li>{@link iec611313Specification.configuration.impl.ResourceImpl#getContainsProgramConfigs <em>Contains Program Configs</em>}</li>
 *   <li>{@link iec611313Specification.configuration.impl.ResourceImpl#getContainsResourceVarDecl <em>Contains Resource Var Decl</em>}</li>
 *   <li>{@link iec611313Specification.configuration.impl.ResourceImpl#getContainsTaskConfigs <em>Contains Task Configs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceImpl extends MinimalEObjectImpl.Container implements Resource {
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
	 * The default value of the '{@link #getResourceTypeName() <em>Resource Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourceTypeName() <em>Resource Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceTypeName()
	 * @generated
	 * @ordered
	 */
	protected String resourceTypeName = RESOURCE_TYPE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContainsProgramConfigs() <em>Contains Program Configs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsProgramConfigs()
	 * @generated
	 * @ordered
	 */
	protected EList<ProgramConfiguration> containsProgramConfigs;

	/**
	 * The cached value of the '{@link #getContainsResourceVarDecl() <em>Contains Resource Var Decl</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsResourceVarDecl()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableDeclaration> containsResourceVarDecl;

	/**
	 * The cached value of the '{@link #getContainsTaskConfigs() <em>Contains Task Configs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsTaskConfigs()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskConfiguration> containsTaskConfigs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.RESOURCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.RESOURCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResourceTypeName() {
		return resourceTypeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceTypeName(String newResourceTypeName) {
		String oldResourceTypeName = resourceTypeName;
		resourceTypeName = newResourceTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.RESOURCE__RESOURCE_TYPE_NAME, oldResourceTypeName, resourceTypeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProgramConfiguration> getContainsProgramConfigs() {
		if (containsProgramConfigs == null) {
			containsProgramConfigs = new EObjectContainmentEList<ProgramConfiguration>(ProgramConfiguration.class, this, ConfigurationPackage.RESOURCE__CONTAINS_PROGRAM_CONFIGS);
		}
		return containsProgramConfigs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableDeclaration> getContainsResourceVarDecl() {
		if (containsResourceVarDecl == null) {
			containsResourceVarDecl = new EObjectContainmentEList<VariableDeclaration>(VariableDeclaration.class, this, ConfigurationPackage.RESOURCE__CONTAINS_RESOURCE_VAR_DECL);
		}
		return containsResourceVarDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskConfiguration> getContainsTaskConfigs() {
		if (containsTaskConfigs == null) {
			containsTaskConfigs = new EObjectContainmentEList<TaskConfiguration>(TaskConfiguration.class, this, ConfigurationPackage.RESOURCE__CONTAINS_TASK_CONFIGS);
		}
		return containsTaskConfigs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigurationPackage.RESOURCE__CONTAINS_PROGRAM_CONFIGS:
				return ((InternalEList<?>)getContainsProgramConfigs()).basicRemove(otherEnd, msgs);
			case ConfigurationPackage.RESOURCE__CONTAINS_RESOURCE_VAR_DECL:
				return ((InternalEList<?>)getContainsResourceVarDecl()).basicRemove(otherEnd, msgs);
			case ConfigurationPackage.RESOURCE__CONTAINS_TASK_CONFIGS:
				return ((InternalEList<?>)getContainsTaskConfigs()).basicRemove(otherEnd, msgs);
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
			case ConfigurationPackage.RESOURCE__NAME:
				return getName();
			case ConfigurationPackage.RESOURCE__RESOURCE_TYPE_NAME:
				return getResourceTypeName();
			case ConfigurationPackage.RESOURCE__CONTAINS_PROGRAM_CONFIGS:
				return getContainsProgramConfigs();
			case ConfigurationPackage.RESOURCE__CONTAINS_RESOURCE_VAR_DECL:
				return getContainsResourceVarDecl();
			case ConfigurationPackage.RESOURCE__CONTAINS_TASK_CONFIGS:
				return getContainsTaskConfigs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConfigurationPackage.RESOURCE__NAME:
				setName((String)newValue);
				return;
			case ConfigurationPackage.RESOURCE__RESOURCE_TYPE_NAME:
				setResourceTypeName((String)newValue);
				return;
			case ConfigurationPackage.RESOURCE__CONTAINS_PROGRAM_CONFIGS:
				getContainsProgramConfigs().clear();
				getContainsProgramConfigs().addAll((Collection<? extends ProgramConfiguration>)newValue);
				return;
			case ConfigurationPackage.RESOURCE__CONTAINS_RESOURCE_VAR_DECL:
				getContainsResourceVarDecl().clear();
				getContainsResourceVarDecl().addAll((Collection<? extends VariableDeclaration>)newValue);
				return;
			case ConfigurationPackage.RESOURCE__CONTAINS_TASK_CONFIGS:
				getContainsTaskConfigs().clear();
				getContainsTaskConfigs().addAll((Collection<? extends TaskConfiguration>)newValue);
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
			case ConfigurationPackage.RESOURCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConfigurationPackage.RESOURCE__RESOURCE_TYPE_NAME:
				setResourceTypeName(RESOURCE_TYPE_NAME_EDEFAULT);
				return;
			case ConfigurationPackage.RESOURCE__CONTAINS_PROGRAM_CONFIGS:
				getContainsProgramConfigs().clear();
				return;
			case ConfigurationPackage.RESOURCE__CONTAINS_RESOURCE_VAR_DECL:
				getContainsResourceVarDecl().clear();
				return;
			case ConfigurationPackage.RESOURCE__CONTAINS_TASK_CONFIGS:
				getContainsTaskConfigs().clear();
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
			case ConfigurationPackage.RESOURCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConfigurationPackage.RESOURCE__RESOURCE_TYPE_NAME:
				return RESOURCE_TYPE_NAME_EDEFAULT == null ? resourceTypeName != null : !RESOURCE_TYPE_NAME_EDEFAULT.equals(resourceTypeName);
			case ConfigurationPackage.RESOURCE__CONTAINS_PROGRAM_CONFIGS:
				return containsProgramConfigs != null && !containsProgramConfigs.isEmpty();
			case ConfigurationPackage.RESOURCE__CONTAINS_RESOURCE_VAR_DECL:
				return containsResourceVarDecl != null && !containsResourceVarDecl.isEmpty();
			case ConfigurationPackage.RESOURCE__CONTAINS_TASK_CONFIGS:
				return containsTaskConfigs != null && !containsTaskConfigs.isEmpty();
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
		result.append(", resourceTypeName: ");
		result.append(resourceTypeName);
		result.append(')');
		return result.toString();
	}

} //ResourceImpl
