/**
 */
package xPPU.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import xPPU.Components;
import xPPU.Rack;
import xPPU.Screwing;
import xPPU.XPPUPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rack</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xPPU.impl.RackImpl#getScrewing_to_base <em>Screwing to base</em>}</li>
 *   <li>{@link xPPU.impl.RackImpl#getComponentRepository <em>Component Repository</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RackImpl extends EObjectImpl implements Rack {
	/**
	 * The cached value of the '{@link #getScrewing_to_base() <em>Screwing to base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScrewing_to_base()
	 * @generated
	 * @ordered
	 */
	protected Screwing screwing_to_base;

	/**
	 * The cached value of the '{@link #getComponentRepository() <em>Component Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentRepository()
	 * @generated
	 * @ordered
	 */
	protected Components componentRepository;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XPPUPackage.Literals.RACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Screwing getScrewing_to_base() {
		if (screwing_to_base != null && screwing_to_base.eIsProxy()) {
			InternalEObject oldScrewing_to_base = (InternalEObject)screwing_to_base;
			screwing_to_base = (Screwing)eResolveProxy(oldScrewing_to_base);
			if (screwing_to_base != oldScrewing_to_base) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XPPUPackage.RACK__SCREWING_TO_BASE, oldScrewing_to_base, screwing_to_base));
			}
		}
		return screwing_to_base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Screwing basicGetScrewing_to_base() {
		return screwing_to_base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScrewing_to_base(Screwing newScrewing_to_base) {
		Screwing oldScrewing_to_base = screwing_to_base;
		screwing_to_base = newScrewing_to_base;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XPPUPackage.RACK__SCREWING_TO_BASE, oldScrewing_to_base, screwing_to_base));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Components getComponentRepository() {
		if (componentRepository != null && componentRepository.eIsProxy()) {
			InternalEObject oldComponentRepository = (InternalEObject)componentRepository;
			componentRepository = (Components)eResolveProxy(oldComponentRepository);
			if (componentRepository != oldComponentRepository) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XPPUPackage.RACK__COMPONENT_REPOSITORY, oldComponentRepository, componentRepository));
			}
		}
		return componentRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Components basicGetComponentRepository() {
		return componentRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentRepository(Components newComponentRepository, NotificationChain msgs) {
		Components oldComponentRepository = componentRepository;
		componentRepository = newComponentRepository;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPPUPackage.RACK__COMPONENT_REPOSITORY, oldComponentRepository, newComponentRepository);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentRepository(Components newComponentRepository) {
		if (newComponentRepository != componentRepository) {
			NotificationChain msgs = null;
			if (componentRepository != null)
				msgs = ((InternalEObject)componentRepository).eInverseRemove(this, XPPUPackage.COMPONENTS__RACKS, Components.class, msgs);
			if (newComponentRepository != null)
				msgs = ((InternalEObject)newComponentRepository).eInverseAdd(this, XPPUPackage.COMPONENTS__RACKS, Components.class, msgs);
			msgs = basicSetComponentRepository(newComponentRepository, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XPPUPackage.RACK__COMPONENT_REPOSITORY, newComponentRepository, newComponentRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XPPUPackage.RACK__COMPONENT_REPOSITORY:
				if (componentRepository != null)
					msgs = ((InternalEObject)componentRepository).eInverseRemove(this, XPPUPackage.COMPONENTS__RACKS, Components.class, msgs);
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
			case XPPUPackage.RACK__COMPONENT_REPOSITORY:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XPPUPackage.RACK__SCREWING_TO_BASE:
				if (resolve) return getScrewing_to_base();
				return basicGetScrewing_to_base();
			case XPPUPackage.RACK__COMPONENT_REPOSITORY:
				if (resolve) return getComponentRepository();
				return basicGetComponentRepository();
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
			case XPPUPackage.RACK__SCREWING_TO_BASE:
				setScrewing_to_base((Screwing)newValue);
				return;
			case XPPUPackage.RACK__COMPONENT_REPOSITORY:
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
			case XPPUPackage.RACK__SCREWING_TO_BASE:
				setScrewing_to_base((Screwing)null);
				return;
			case XPPUPackage.RACK__COMPONENT_REPOSITORY:
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
			case XPPUPackage.RACK__SCREWING_TO_BASE:
				return screwing_to_base != null;
			case XPPUPackage.RACK__COMPONENT_REPOSITORY:
				return componentRepository != null;
		}
		return super.eIsSet(featureID);
	}

} //RackImpl
