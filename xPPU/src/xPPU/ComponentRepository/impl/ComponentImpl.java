/**
 */
package xPPU.ComponentRepository.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import xPPU.ComponentRepository.Component;
import xPPU.ComponentRepository.ComponentRepositoryPackage;

import xPPU.Identifier.impl.IdentifierImpl;

import xPPU.InterfaceRepository.Interface;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xPPU.ComponentRepository.impl.ComponentImpl#getConnectedInterfaces <em>Connected Interfaces</em>}</li>
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentRepositoryPackage.COMPONENT__CONNECTED_INTERFACES:
				return getConnectedInterfaces();
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
		}
		return super.eIsSet(featureID);
	}

} //ComponentImpl
