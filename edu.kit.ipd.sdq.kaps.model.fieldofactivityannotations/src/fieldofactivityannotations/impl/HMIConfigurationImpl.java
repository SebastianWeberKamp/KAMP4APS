/**
 */
package fieldofactivityannotations.impl;

import fieldofactivityannotations.FieldofactivityannotationsPackage;
import fieldofactivityannotations.HMIConfiguration;
import fieldofactivityannotations.HMISpecification;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import xPPU.ComponentRepository.Component;

import xPPU.InterfaceRepository.Interface;

import xPPU.ModuleRepository.Module;

import xPPU.StructureRepository.Structure;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HMI Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fieldofactivityannotations.impl.HMIConfigurationImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link fieldofactivityannotations.impl.HMIConfigurationImpl#getName <em>Name</em>}</li>
 *   <li>{@link fieldofactivityannotations.impl.HMIConfigurationImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link fieldofactivityannotations.impl.HMIConfigurationImpl#getModules <em>Modules</em>}</li>
 *   <li>{@link fieldofactivityannotations.impl.HMIConfigurationImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link fieldofactivityannotations.impl.HMIConfigurationImpl#getStructures <em>Structures</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HMIConfigurationImpl extends MinimalEObjectImpl.Container implements HMIConfiguration {
	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected HMISpecification parent;

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
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> components;

	/**
	 * The cached value of the '{@link #getModules() <em>Modules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModules()
	 * @generated
	 * @ordered
	 */
	protected EList<Module> modules;

	/**
	 * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> interfaces;

	/**
	 * The cached value of the '{@link #getStructures() <em>Structures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructures()
	 * @generated
	 * @ordered
	 */
	protected EList<Structure> structures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HMIConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FieldofactivityannotationsPackage.Literals.HMI_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMISpecification getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (HMISpecification)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FieldofactivityannotationsPackage.HMI_CONFIGURATION__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMISpecification basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(HMISpecification newParent, NotificationChain msgs) {
		HMISpecification oldParent = parent;
		parent = newParent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FieldofactivityannotationsPackage.HMI_CONFIGURATION__PARENT, oldParent, newParent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(HMISpecification newParent) {
		if (newParent != parent) {
			NotificationChain msgs = null;
			if (parent != null)
				msgs = ((InternalEObject)parent).eInverseRemove(this, FieldofactivityannotationsPackage.HMI_SPECIFICATION__HMI_CONFIGURATION, HMISpecification.class, msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, FieldofactivityannotationsPackage.HMI_SPECIFICATION__HMI_CONFIGURATION, HMISpecification.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FieldofactivityannotationsPackage.HMI_CONFIGURATION__PARENT, newParent, newParent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FieldofactivityannotationsPackage.HMI_CONFIGURATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getComponents() {
		if (components == null) {
			components = new EObjectResolvingEList<Component>(Component.class, this, FieldofactivityannotationsPackage.HMI_CONFIGURATION__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Module> getModules() {
		if (modules == null) {
			modules = new EObjectResolvingEList<Module>(Module.class, this, FieldofactivityannotationsPackage.HMI_CONFIGURATION__MODULES);
		}
		return modules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getInterfaces() {
		if (interfaces == null) {
			interfaces = new EObjectResolvingEList<Interface>(Interface.class, this, FieldofactivityannotationsPackage.HMI_CONFIGURATION__INTERFACES);
		}
		return interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Structure> getStructures() {
		if (structures == null) {
			structures = new EObjectResolvingEList<Structure>(Structure.class, this, FieldofactivityannotationsPackage.HMI_CONFIGURATION__STRUCTURES);
		}
		return structures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FieldofactivityannotationsPackage.HMI_CONFIGURATION__PARENT:
				if (parent != null)
					msgs = ((InternalEObject)parent).eInverseRemove(this, FieldofactivityannotationsPackage.HMI_SPECIFICATION__HMI_CONFIGURATION, HMISpecification.class, msgs);
				return basicSetParent((HMISpecification)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FieldofactivityannotationsPackage.HMI_CONFIGURATION__PARENT:
				return basicSetParent(null, msgs);
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
			case FieldofactivityannotationsPackage.HMI_CONFIGURATION__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case FieldofactivityannotationsPackage.HMI_CONFIGURATION__NAME:
				return getName();
			case FieldofactivityannotationsPackage.HMI_CONFIGURATION__COMPONENTS:
				return getComponents();
			case FieldofactivityannotationsPackage.HMI_CONFIGURATION__MODULES:
				return getModules();
			case FieldofactivityannotationsPackage.HMI_CONFIGURATION__INTERFACES:
				return getInterfaces();
			case FieldofactivityannotationsPackage.HMI_CONFIGURATION__STRUCTURES:
				return getStructures();
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
			case FieldofactivityannotationsPackage.HMI_CONFIGURATION__PARENT:
				setParent((HMISpecification)newValue);
				return;
			case FieldofactivityannotationsPackage.HMI_CONFIGURATION__NAME:
				setName((String)newValue);
				return;
			case FieldofactivityannotationsPackage.HMI_CONFIGURATION__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends Component>)newValue);
				return;
			case FieldofactivityannotationsPackage.HMI_CONFIGURATION__MODULES:
				getModules().clear();
				getModules().addAll((Collection<? extends Module>)newValue);
				return;
			case FieldofactivityannotationsPackage.HMI_CONFIGURATION__INTERFACES:
				getInterfaces().clear();
				getInterfaces().addAll((Collection<? extends Interface>)newValue);
				return;
			case FieldofactivityannotationsPackage.HMI_CONFIGURATION__STRUCTURES:
				getStructures().clear();
				getStructures().addAll((Collection<? extends Structure>)newValue);
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
			case FieldofactivityannotationsPackage.HMI_CONFIGURATION__PARENT:
				setParent((HMISpecification)null);
				return;
			case FieldofactivityannotationsPackage.HMI_CONFIGURATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FieldofactivityannotationsPackage.HMI_CONFIGURATION__COMPONENTS:
				getComponents().clear();
				return;
			case FieldofactivityannotationsPackage.HMI_CONFIGURATION__MODULES:
				getModules().clear();
				return;
			case FieldofactivityannotationsPackage.HMI_CONFIGURATION__INTERFACES:
				getInterfaces().clear();
				return;
			case FieldofactivityannotationsPackage.HMI_CONFIGURATION__STRUCTURES:
				getStructures().clear();
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
			case FieldofactivityannotationsPackage.HMI_CONFIGURATION__PARENT:
				return parent != null;
			case FieldofactivityannotationsPackage.HMI_CONFIGURATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FieldofactivityannotationsPackage.HMI_CONFIGURATION__COMPONENTS:
				return components != null && !components.isEmpty();
			case FieldofactivityannotationsPackage.HMI_CONFIGURATION__MODULES:
				return modules != null && !modules.isEmpty();
			case FieldofactivityannotationsPackage.HMI_CONFIGURATION__INTERFACES:
				return interfaces != null && !interfaces.isEmpty();
			case FieldofactivityannotationsPackage.HMI_CONFIGURATION__STRUCTURES:
				return structures != null && !structures.isEmpty();
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

} //HMIConfigurationImpl
