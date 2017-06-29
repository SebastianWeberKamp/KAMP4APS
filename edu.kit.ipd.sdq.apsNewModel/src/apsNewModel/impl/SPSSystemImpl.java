/**
 */
package apsNewModel.impl;

import ComponentInternalDependencies.ComponentInternalDependenciesRepository;

import apsNewModel.ApsNewModelPackage;
import apsNewModel.Program;
import apsNewModel.SPSSystem;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SPS System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link apsNewModel.impl.SPSSystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link apsNewModel.impl.SPSSystemImpl#getId <em>Id</em>}</li>
 *   <li>{@link apsNewModel.impl.SPSSystemImpl#getContainsProgram <em>Contains Program</em>}</li>
 *   <li>{@link apsNewModel.impl.SPSSystemImpl#getComponentInternalDependencies <em>Component Internal Dependencies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SPSSystemImpl extends MinimalEObjectImpl.Container implements SPSSystem {
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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContainsProgram() <em>Contains Program</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsProgram()
	 * @generated
	 * @ordered
	 */
	protected EList<Program> containsProgram;

	/**
	 * The cached value of the '{@link #getComponentInternalDependencies() <em>Component Internal Dependencies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentInternalDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentInternalDependenciesRepository> componentInternalDependencies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SPSSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApsNewModelPackage.Literals.SPS_SYSTEM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApsNewModelPackage.SPS_SYSTEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApsNewModelPackage.SPS_SYSTEM__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Program> getContainsProgram() {
		if (containsProgram == null) {
			containsProgram = new EObjectContainmentEList<Program>(Program.class, this, ApsNewModelPackage.SPS_SYSTEM__CONTAINS_PROGRAM);
		}
		return containsProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentInternalDependenciesRepository> getComponentInternalDependencies() {
		if (componentInternalDependencies == null) {
			componentInternalDependencies = new EObjectResolvingEList<ComponentInternalDependenciesRepository>(ComponentInternalDependenciesRepository.class, this, ApsNewModelPackage.SPS_SYSTEM__COMPONENT_INTERNAL_DEPENDENCIES);
		}
		return componentInternalDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApsNewModelPackage.SPS_SYSTEM__CONTAINS_PROGRAM:
				return ((InternalEList<?>)getContainsProgram()).basicRemove(otherEnd, msgs);
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
			case ApsNewModelPackage.SPS_SYSTEM__NAME:
				return getName();
			case ApsNewModelPackage.SPS_SYSTEM__ID:
				return getId();
			case ApsNewModelPackage.SPS_SYSTEM__CONTAINS_PROGRAM:
				return getContainsProgram();
			case ApsNewModelPackage.SPS_SYSTEM__COMPONENT_INTERNAL_DEPENDENCIES:
				return getComponentInternalDependencies();
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
			case ApsNewModelPackage.SPS_SYSTEM__NAME:
				setName((String)newValue);
				return;
			case ApsNewModelPackage.SPS_SYSTEM__ID:
				setId((String)newValue);
				return;
			case ApsNewModelPackage.SPS_SYSTEM__CONTAINS_PROGRAM:
				getContainsProgram().clear();
				getContainsProgram().addAll((Collection<? extends Program>)newValue);
				return;
			case ApsNewModelPackage.SPS_SYSTEM__COMPONENT_INTERNAL_DEPENDENCIES:
				getComponentInternalDependencies().clear();
				getComponentInternalDependencies().addAll((Collection<? extends ComponentInternalDependenciesRepository>)newValue);
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
			case ApsNewModelPackage.SPS_SYSTEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ApsNewModelPackage.SPS_SYSTEM__ID:
				setId(ID_EDEFAULT);
				return;
			case ApsNewModelPackage.SPS_SYSTEM__CONTAINS_PROGRAM:
				getContainsProgram().clear();
				return;
			case ApsNewModelPackage.SPS_SYSTEM__COMPONENT_INTERNAL_DEPENDENCIES:
				getComponentInternalDependencies().clear();
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
			case ApsNewModelPackage.SPS_SYSTEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ApsNewModelPackage.SPS_SYSTEM__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ApsNewModelPackage.SPS_SYSTEM__CONTAINS_PROGRAM:
				return containsProgram != null && !containsProgram.isEmpty();
			case ApsNewModelPackage.SPS_SYSTEM__COMPONENT_INTERNAL_DEPENDENCIES:
				return componentInternalDependencies != null && !componentInternalDependencies.isEmpty();
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
		result.append(" (Name: ");
		result.append(name);
		result.append(", Id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //SPSSystemImpl