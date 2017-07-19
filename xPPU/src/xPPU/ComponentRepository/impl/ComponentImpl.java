/**
 */
package xPPU.ComponentRepository.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import xPPU.ComponentRepository.Component;
import xPPU.ComponentRepository.ComponentRepositoryPackage;

import xPPU.Identifier.impl.IdentifierImpl;

import xPPU.InterfaceRepository.Interface;

import xPPU.ModuleRepository.Module;
import xPPU.ModuleRepository.ModuleRepositoryPackage;

import xPPU.StructureRepository.Structure;
import xPPU.StructureRepository.StructureRepositoryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xPPU.ComponentRepository.impl.ComponentImpl#getConnectedInterfaces <em>Connected Interfaces</em>}</li>
 *   <li>{@link xPPU.ComponentRepository.impl.ComponentImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link xPPU.ComponentRepository.impl.ComponentImpl#getParentModule <em>Parent Module</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ComponentImpl extends IdentifierImpl implements Component {
	/**
	 * The cached value of the '{@link #getConnectedInterfaces() <em>Connected Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> connectedInterfaces;

	/**
	 * The cached value of the '{@link #getParentModule() <em>Parent Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentModule()
	 * @generated
	 * @ordered
	 */
	protected Module parentModule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentRepositoryPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getConnectedInterfaces() {
		if (connectedInterfaces == null) {
			connectedInterfaces = new EObjectResolvingEList<Interface>(Interface.class, this, ComponentRepositoryPackage.COMPONENT__CONNECTED_INTERFACES);
		}
		return connectedInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Structure getParent() {
		if (eContainerFeatureID() != ComponentRepositoryPackage.COMPONENT__PARENT) return null;
		return (Structure)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Structure newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, ComponentRepositoryPackage.COMPONENT__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Structure newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != ComponentRepositoryPackage.COMPONENT__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, StructureRepositoryPackage.STRUCTURE__COMPONENTS, Structure.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentRepositoryPackage.COMPONENT__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module getParentModule() {
		if (parentModule != null && parentModule.eIsProxy()) {
			InternalEObject oldParentModule = (InternalEObject)parentModule;
			parentModule = (Module)eResolveProxy(oldParentModule);
			if (parentModule != oldParentModule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentRepositoryPackage.COMPONENT__PARENT_MODULE, oldParentModule, parentModule));
			}
		}
		return parentModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module basicGetParentModule() {
		return parentModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentModule(Module newParentModule, NotificationChain msgs) {
		Module oldParentModule = parentModule;
		parentModule = newParentModule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentRepositoryPackage.COMPONENT__PARENT_MODULE, oldParentModule, newParentModule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentModule(Module newParentModule) {
		if (newParentModule != parentModule) {
			NotificationChain msgs = null;
			if (parentModule != null)
				msgs = ((InternalEObject)parentModule).eInverseRemove(this, ModuleRepositoryPackage.MODULE__COMPONENTS, Module.class, msgs);
			if (newParentModule != null)
				msgs = ((InternalEObject)newParentModule).eInverseAdd(this, ModuleRepositoryPackage.MODULE__COMPONENTS, Module.class, msgs);
			msgs = basicSetParentModule(newParentModule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentRepositoryPackage.COMPONENT__PARENT_MODULE, newParentModule, newParentModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentRepositoryPackage.COMPONENT__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((Structure)otherEnd, msgs);
			case ComponentRepositoryPackage.COMPONENT__PARENT_MODULE:
				if (parentModule != null)
					msgs = ((InternalEObject)parentModule).eInverseRemove(this, ModuleRepositoryPackage.MODULE__COMPONENTS, Module.class, msgs);
				return basicSetParentModule((Module)otherEnd, msgs);
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
			case ComponentRepositoryPackage.COMPONENT__PARENT:
				return basicSetParent(null, msgs);
			case ComponentRepositoryPackage.COMPONENT__PARENT_MODULE:
				return basicSetParentModule(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ComponentRepositoryPackage.COMPONENT__PARENT:
				return eInternalContainer().eInverseRemove(this, StructureRepositoryPackage.STRUCTURE__COMPONENTS, Structure.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentRepositoryPackage.COMPONENT__CONNECTED_INTERFACES:
				return getConnectedInterfaces();
			case ComponentRepositoryPackage.COMPONENT__PARENT:
				return getParent();
			case ComponentRepositoryPackage.COMPONENT__PARENT_MODULE:
				if (resolve) return getParentModule();
				return basicGetParentModule();
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
			case ComponentRepositoryPackage.COMPONENT__CONNECTED_INTERFACES:
				getConnectedInterfaces().clear();
				getConnectedInterfaces().addAll((Collection<? extends Interface>)newValue);
				return;
			case ComponentRepositoryPackage.COMPONENT__PARENT:
				setParent((Structure)newValue);
				return;
			case ComponentRepositoryPackage.COMPONENT__PARENT_MODULE:
				setParentModule((Module)newValue);
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
			case ComponentRepositoryPackage.COMPONENT__CONNECTED_INTERFACES:
				getConnectedInterfaces().clear();
				return;
			case ComponentRepositoryPackage.COMPONENT__PARENT:
				setParent((Structure)null);
				return;
			case ComponentRepositoryPackage.COMPONENT__PARENT_MODULE:
				setParentModule((Module)null);
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
			case ComponentRepositoryPackage.COMPONENT__CONNECTED_INTERFACES:
				return connectedInterfaces != null && !connectedInterfaces.isEmpty();
			case ComponentRepositoryPackage.COMPONENT__PARENT:
				return getParent() != null;
			case ComponentRepositoryPackage.COMPONENT__PARENT_MODULE:
				return parentModule != null;
		}
		return super.eIsSet(featureID);
	}

} //ComponentImpl
