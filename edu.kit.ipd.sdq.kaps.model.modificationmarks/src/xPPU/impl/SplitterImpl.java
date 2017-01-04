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
import xPPU.Screwing;
import xPPU.Splitter;
import xPPU.XPPUPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Splitter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xPPU.impl.SplitterImpl#getScrewing <em>Screwing</em>}</li>
 *   <li>{@link xPPU.impl.SplitterImpl#getComponentRepository <em>Component Repository</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SplitterImpl extends EObjectImpl implements Splitter {
	/**
	 * The cached value of the '{@link #getScrewing() <em>Screwing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScrewing()
	 * @generated
	 * @ordered
	 */
	protected Screwing screwing;

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
	protected SplitterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XPPUPackage.Literals.SPLITTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Screwing getScrewing() {
		if (screwing != null && screwing.eIsProxy()) {
			InternalEObject oldScrewing = (InternalEObject)screwing;
			screwing = (Screwing)eResolveProxy(oldScrewing);
			if (screwing != oldScrewing) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XPPUPackage.SPLITTER__SCREWING, oldScrewing, screwing));
			}
		}
		return screwing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Screwing basicGetScrewing() {
		return screwing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScrewing(Screwing newScrewing) {
		Screwing oldScrewing = screwing;
		screwing = newScrewing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XPPUPackage.SPLITTER__SCREWING, oldScrewing, screwing));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XPPUPackage.SPLITTER__COMPONENT_REPOSITORY, oldComponentRepository, componentRepository));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPPUPackage.SPLITTER__COMPONENT_REPOSITORY, oldComponentRepository, newComponentRepository);
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
				msgs = ((InternalEObject)componentRepository).eInverseRemove(this, XPPUPackage.COMPONENTS__SPLITTER, Components.class, msgs);
			if (newComponentRepository != null)
				msgs = ((InternalEObject)newComponentRepository).eInverseAdd(this, XPPUPackage.COMPONENTS__SPLITTER, Components.class, msgs);
			msgs = basicSetComponentRepository(newComponentRepository, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XPPUPackage.SPLITTER__COMPONENT_REPOSITORY, newComponentRepository, newComponentRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XPPUPackage.SPLITTER__COMPONENT_REPOSITORY:
				if (componentRepository != null)
					msgs = ((InternalEObject)componentRepository).eInverseRemove(this, XPPUPackage.COMPONENTS__SPLITTER, Components.class, msgs);
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
			case XPPUPackage.SPLITTER__COMPONENT_REPOSITORY:
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
			case XPPUPackage.SPLITTER__SCREWING:
				if (resolve) return getScrewing();
				return basicGetScrewing();
			case XPPUPackage.SPLITTER__COMPONENT_REPOSITORY:
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
			case XPPUPackage.SPLITTER__SCREWING:
				setScrewing((Screwing)newValue);
				return;
			case XPPUPackage.SPLITTER__COMPONENT_REPOSITORY:
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
			case XPPUPackage.SPLITTER__SCREWING:
				setScrewing((Screwing)null);
				return;
			case XPPUPackage.SPLITTER__COMPONENT_REPOSITORY:
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
			case XPPUPackage.SPLITTER__SCREWING:
				return screwing != null;
			case XPPUPackage.SPLITTER__COMPONENT_REPOSITORY:
				return componentRepository != null;
		}
		return super.eIsSet(featureID);
	}

} //SplitterImpl
