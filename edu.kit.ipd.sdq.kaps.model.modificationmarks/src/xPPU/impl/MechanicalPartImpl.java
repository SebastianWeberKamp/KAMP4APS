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
import xPPU.MechanicalPart;
import xPPU.Screwing;
import xPPU.XPPUPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mechanical Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xPPU.impl.MechanicalPartImpl#getScrewing <em>Screwing</em>}</li>
 *   <li>{@link xPPU.impl.MechanicalPartImpl#getComponentRepository <em>Component Repository</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MechanicalPartImpl extends EObjectImpl implements MechanicalPart {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MechanicalPartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XPPUPackage.Literals.MECHANICAL_PART;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XPPUPackage.MECHANICAL_PART__SCREWING, oldScrewing, screwing));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XPPUPackage.MECHANICAL_PART__SCREWING, oldScrewing, screwing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Components getComponentRepository() {
		if (eContainerFeatureID() != XPPUPackage.MECHANICAL_PART__COMPONENT_REPOSITORY) return null;
		return (Components)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentRepository(Components newComponentRepository, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newComponentRepository, XPPUPackage.MECHANICAL_PART__COMPONENT_REPOSITORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentRepository(Components newComponentRepository) {
		if (newComponentRepository != eInternalContainer() || (eContainerFeatureID() != XPPUPackage.MECHANICAL_PART__COMPONENT_REPOSITORY && newComponentRepository != null)) {
			if (EcoreUtil.isAncestor(this, newComponentRepository))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newComponentRepository != null)
				msgs = ((InternalEObject)newComponentRepository).eInverseAdd(this, XPPUPackage.COMPONENTS__MECHANICALPARTS, Components.class, msgs);
			msgs = basicSetComponentRepository(newComponentRepository, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XPPUPackage.MECHANICAL_PART__COMPONENT_REPOSITORY, newComponentRepository, newComponentRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XPPUPackage.MECHANICAL_PART__COMPONENT_REPOSITORY:
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
			case XPPUPackage.MECHANICAL_PART__COMPONENT_REPOSITORY:
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
			case XPPUPackage.MECHANICAL_PART__COMPONENT_REPOSITORY:
				return eInternalContainer().eInverseRemove(this, XPPUPackage.COMPONENTS__MECHANICALPARTS, Components.class, msgs);
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
			case XPPUPackage.MECHANICAL_PART__SCREWING:
				if (resolve) return getScrewing();
				return basicGetScrewing();
			case XPPUPackage.MECHANICAL_PART__COMPONENT_REPOSITORY:
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
			case XPPUPackage.MECHANICAL_PART__SCREWING:
				setScrewing((Screwing)newValue);
				return;
			case XPPUPackage.MECHANICAL_PART__COMPONENT_REPOSITORY:
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
			case XPPUPackage.MECHANICAL_PART__SCREWING:
				setScrewing((Screwing)null);
				return;
			case XPPUPackage.MECHANICAL_PART__COMPONENT_REPOSITORY:
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
			case XPPUPackage.MECHANICAL_PART__SCREWING:
				return screwing != null;
			case XPPUPackage.MECHANICAL_PART__COMPONENT_REPOSITORY:
				return getComponentRepository() != null;
		}
		return super.eIsSet(featureID);
	}

} //MechanicalPartImpl
