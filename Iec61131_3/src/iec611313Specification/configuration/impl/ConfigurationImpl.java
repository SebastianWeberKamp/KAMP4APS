/**
 */
package iec611313Specification.configuration.impl;

import iec611313Specification.common.types.ANY_DERIVED;

import iec611313Specification.common.variables.VariableDeclaration;

import iec611313Specification.configuration.Configuration;
import iec611313Specification.configuration.ConfigurationPackage;
import iec611313Specification.configuration.Resource;

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
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.configuration.impl.ConfigurationImpl#getContainsTypeDefinition <em>Contains Type Definition</em>}</li>
 *   <li>{@link iec611313Specification.configuration.impl.ConfigurationImpl#getContainsConfigVarDecl <em>Contains Config Var Decl</em>}</li>
 *   <li>{@link iec611313Specification.configuration.impl.ConfigurationImpl#getName <em>Name</em>}</li>
 *   <li>{@link iec611313Specification.configuration.impl.ConfigurationImpl#getContainsResource <em>Contains Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationImpl extends MinimalEObjectImpl.Container implements Configuration {
	/**
	 * The cached value of the '{@link #getContainsTypeDefinition() <em>Contains Type Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsTypeDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<ANY_DERIVED> containsTypeDefinition;

	/**
	 * The cached value of the '{@link #getContainsConfigVarDecl() <em>Contains Config Var Decl</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsConfigVarDecl()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableDeclaration> containsConfigVarDecl;

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
	 * The cached value of the '{@link #getContainsResource() <em>Contains Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsResource()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> containsResource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ANY_DERIVED> getContainsTypeDefinition() {
		if (containsTypeDefinition == null) {
			containsTypeDefinition = new EObjectContainmentEList<ANY_DERIVED>(ANY_DERIVED.class, this, ConfigurationPackage.CONFIGURATION__CONTAINS_TYPE_DEFINITION);
		}
		return containsTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableDeclaration> getContainsConfigVarDecl() {
		if (containsConfigVarDecl == null) {
			containsConfigVarDecl = new EObjectContainmentEList<VariableDeclaration>(VariableDeclaration.class, this, ConfigurationPackage.CONFIGURATION__CONTAINS_CONFIG_VAR_DECL);
		}
		return containsConfigVarDecl;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.CONFIGURATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getContainsResource() {
		if (containsResource == null) {
			containsResource = new EObjectContainmentEList<Resource>(Resource.class, this, ConfigurationPackage.CONFIGURATION__CONTAINS_RESOURCE);
		}
		return containsResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigurationPackage.CONFIGURATION__CONTAINS_TYPE_DEFINITION:
				return ((InternalEList<?>)getContainsTypeDefinition()).basicRemove(otherEnd, msgs);
			case ConfigurationPackage.CONFIGURATION__CONTAINS_CONFIG_VAR_DECL:
				return ((InternalEList<?>)getContainsConfigVarDecl()).basicRemove(otherEnd, msgs);
			case ConfigurationPackage.CONFIGURATION__CONTAINS_RESOURCE:
				return ((InternalEList<?>)getContainsResource()).basicRemove(otherEnd, msgs);
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
			case ConfigurationPackage.CONFIGURATION__CONTAINS_TYPE_DEFINITION:
				return getContainsTypeDefinition();
			case ConfigurationPackage.CONFIGURATION__CONTAINS_CONFIG_VAR_DECL:
				return getContainsConfigVarDecl();
			case ConfigurationPackage.CONFIGURATION__NAME:
				return getName();
			case ConfigurationPackage.CONFIGURATION__CONTAINS_RESOURCE:
				return getContainsResource();
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
			case ConfigurationPackage.CONFIGURATION__CONTAINS_TYPE_DEFINITION:
				getContainsTypeDefinition().clear();
				getContainsTypeDefinition().addAll((Collection<? extends ANY_DERIVED>)newValue);
				return;
			case ConfigurationPackage.CONFIGURATION__CONTAINS_CONFIG_VAR_DECL:
				getContainsConfigVarDecl().clear();
				getContainsConfigVarDecl().addAll((Collection<? extends VariableDeclaration>)newValue);
				return;
			case ConfigurationPackage.CONFIGURATION__NAME:
				setName((String)newValue);
				return;
			case ConfigurationPackage.CONFIGURATION__CONTAINS_RESOURCE:
				getContainsResource().clear();
				getContainsResource().addAll((Collection<? extends Resource>)newValue);
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
			case ConfigurationPackage.CONFIGURATION__CONTAINS_TYPE_DEFINITION:
				getContainsTypeDefinition().clear();
				return;
			case ConfigurationPackage.CONFIGURATION__CONTAINS_CONFIG_VAR_DECL:
				getContainsConfigVarDecl().clear();
				return;
			case ConfigurationPackage.CONFIGURATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConfigurationPackage.CONFIGURATION__CONTAINS_RESOURCE:
				getContainsResource().clear();
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
			case ConfigurationPackage.CONFIGURATION__CONTAINS_TYPE_DEFINITION:
				return containsTypeDefinition != null && !containsTypeDefinition.isEmpty();
			case ConfigurationPackage.CONFIGURATION__CONTAINS_CONFIG_VAR_DECL:
				return containsConfigVarDecl != null && !containsConfigVarDecl.isEmpty();
			case ConfigurationPackage.CONFIGURATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConfigurationPackage.CONFIGURATION__CONTAINS_RESOURCE:
				return containsResource != null && !containsResource.isEmpty();
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

} //ConfigurationImpl
