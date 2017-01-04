/**
 */
package xPPU.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import xPPU.Components;
import xPPU.Pipe;
import xPPU.PneumaticSupply;
import xPPU.XPPUPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pipe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xPPU.impl.PipeImpl#getPlugs <em>Plugs</em>}</li>
 *   <li>{@link xPPU.impl.PipeImpl#getComponentRepository <em>Component Repository</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PipeImpl extends EObjectImpl implements Pipe {
	/**
	 * The cached value of the '{@link #getPlugs() <em>Plugs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlugs()
	 * @generated
	 * @ordered
	 */
	protected PneumaticSupply plugs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PipeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XPPUPackage.Literals.PIPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PneumaticSupply getPlugs() {
		if (plugs != null && plugs.eIsProxy()) {
			InternalEObject oldPlugs = (InternalEObject)plugs;
			plugs = (PneumaticSupply)eResolveProxy(oldPlugs);
			if (plugs != oldPlugs) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XPPUPackage.PIPE__PLUGS, oldPlugs, plugs));
			}
		}
		return plugs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PneumaticSupply basicGetPlugs() {
		return plugs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlugs(PneumaticSupply newPlugs) {
		PneumaticSupply oldPlugs = plugs;
		plugs = newPlugs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XPPUPackage.PIPE__PLUGS, oldPlugs, plugs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Components getComponentRepository() {
		if (eContainerFeatureID() != XPPUPackage.PIPE__COMPONENT_REPOSITORY) return null;
		return (Components)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentRepository(Components newComponentRepository, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newComponentRepository, XPPUPackage.PIPE__COMPONENT_REPOSITORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentRepository(Components newComponentRepository) {
		if (newComponentRepository != eInternalContainer() || (eContainerFeatureID() != XPPUPackage.PIPE__COMPONENT_REPOSITORY && newComponentRepository != null)) {
			if (EcoreUtil.isAncestor(this, newComponentRepository))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newComponentRepository != null)
				msgs = ((InternalEObject)newComponentRepository).eInverseAdd(this, XPPUPackage.COMPONENTS__PIPES, Components.class, msgs);
			msgs = basicSetComponentRepository(newComponentRepository, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XPPUPackage.PIPE__COMPONENT_REPOSITORY, newComponentRepository, newComponentRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XPPUPackage.PIPE__COMPONENT_REPOSITORY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetComponentRepository((Components)otherEnd, msgs);
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
			case XPPUPackage.PIPE__COMPONENT_REPOSITORY:
				return basicSetComponentRepository(null, msgs);
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
			case XPPUPackage.PIPE__COMPONENT_REPOSITORY:
				return eInternalContainer().eInverseRemove(this, XPPUPackage.COMPONENTS__PIPES, Components.class, msgs);
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
			case XPPUPackage.PIPE__PLUGS:
				if (resolve) return getPlugs();
				return basicGetPlugs();
			case XPPUPackage.PIPE__COMPONENT_REPOSITORY:
				return getComponentRepository();
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
			case XPPUPackage.PIPE__PLUGS:
				setPlugs((PneumaticSupply)newValue);
				return;
			case XPPUPackage.PIPE__COMPONENT_REPOSITORY:
				setComponentRepository((Components)newValue);
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
			case XPPUPackage.PIPE__PLUGS:
				setPlugs((PneumaticSupply)null);
				return;
			case XPPUPackage.PIPE__COMPONENT_REPOSITORY:
				setComponentRepository((Components)null);
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
			case XPPUPackage.PIPE__PLUGS:
				return plugs != null;
			case XPPUPackage.PIPE__COMPONENT_REPOSITORY:
				return getComponentRepository() != null;
		}
		return super.eIsSet(featureID);
	}

} //PipeImpl
