/**
 */
package xPPU.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import xPPU.Components;
import xPPU.Compressor;
import xPPU.PneumaticSupply;
import xPPU.PowerSupply;
import xPPU.Screwing;
import xPPU.SignalInterface;
import xPPU.XPPUPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compressor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xPPU.impl.CompressorImpl#getPowersupply <em>Powersupply</em>}</li>
 *   <li>{@link xPPU.impl.CompressorImpl#getPneumaticsupply <em>Pneumaticsupply</em>}</li>
 *   <li>{@link xPPU.impl.CompressorImpl#getPins <em>Pins</em>}</li>
 *   <li>{@link xPPU.impl.CompressorImpl#getScrewing <em>Screwing</em>}</li>
 *   <li>{@link xPPU.impl.CompressorImpl#getComponentRepository <em>Component Repository</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompressorImpl extends EObjectImpl implements Compressor {
	/**
	 * The cached value of the '{@link #getPowersupply() <em>Powersupply</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowersupply()
	 * @generated
	 * @ordered
	 */
	protected PowerSupply powersupply;

	/**
	 * The cached value of the '{@link #getPneumaticsupply() <em>Pneumaticsupply</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPneumaticsupply()
	 * @generated
	 * @ordered
	 */
	protected EList<PneumaticSupply> pneumaticsupply;

	/**
	 * The cached value of the '{@link #getPins() <em>Pins</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPins()
	 * @generated
	 * @ordered
	 */
	protected EList<SignalInterface> pins;

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
	protected CompressorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XPPUPackage.Literals.COMPRESSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerSupply getPowersupply() {
		if (powersupply != null && powersupply.eIsProxy()) {
			InternalEObject oldPowersupply = (InternalEObject)powersupply;
			powersupply = (PowerSupply)eResolveProxy(oldPowersupply);
			if (powersupply != oldPowersupply) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XPPUPackage.COMPRESSOR__POWERSUPPLY, oldPowersupply, powersupply));
			}
		}
		return powersupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerSupply basicGetPowersupply() {
		return powersupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPowersupply(PowerSupply newPowersupply) {
		PowerSupply oldPowersupply = powersupply;
		powersupply = newPowersupply;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XPPUPackage.COMPRESSOR__POWERSUPPLY, oldPowersupply, powersupply));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PneumaticSupply> getPneumaticsupply() {
		if (pneumaticsupply == null) {
			pneumaticsupply = new EObjectResolvingEList<PneumaticSupply>(PneumaticSupply.class, this, XPPUPackage.COMPRESSOR__PNEUMATICSUPPLY);
		}
		return pneumaticsupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SignalInterface> getPins() {
		if (pins == null) {
			pins = new EObjectResolvingEList<SignalInterface>(SignalInterface.class, this, XPPUPackage.COMPRESSOR__PINS);
		}
		return pins;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XPPUPackage.COMPRESSOR__SCREWING, oldScrewing, screwing));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XPPUPackage.COMPRESSOR__SCREWING, oldScrewing, screwing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Components getComponentRepository() {
		if (eContainerFeatureID() != XPPUPackage.COMPRESSOR__COMPONENT_REPOSITORY) return null;
		return (Components)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentRepository(Components newComponentRepository, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newComponentRepository, XPPUPackage.COMPRESSOR__COMPONENT_REPOSITORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentRepository(Components newComponentRepository) {
		if (newComponentRepository != eInternalContainer() || (eContainerFeatureID() != XPPUPackage.COMPRESSOR__COMPONENT_REPOSITORY && newComponentRepository != null)) {
			if (EcoreUtil.isAncestor(this, newComponentRepository))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newComponentRepository != null)
				msgs = ((InternalEObject)newComponentRepository).eInverseAdd(this, XPPUPackage.COMPONENTS__COMPRESSORS, Components.class, msgs);
			msgs = basicSetComponentRepository(newComponentRepository, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XPPUPackage.COMPRESSOR__COMPONENT_REPOSITORY, newComponentRepository, newComponentRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XPPUPackage.COMPRESSOR__COMPONENT_REPOSITORY:
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
			case XPPUPackage.COMPRESSOR__COMPONENT_REPOSITORY:
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
			case XPPUPackage.COMPRESSOR__COMPONENT_REPOSITORY:
				return eInternalContainer().eInverseRemove(this, XPPUPackage.COMPONENTS__COMPRESSORS, Components.class, msgs);
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
			case XPPUPackage.COMPRESSOR__POWERSUPPLY:
				if (resolve) return getPowersupply();
				return basicGetPowersupply();
			case XPPUPackage.COMPRESSOR__PNEUMATICSUPPLY:
				return getPneumaticsupply();
			case XPPUPackage.COMPRESSOR__PINS:
				return getPins();
			case XPPUPackage.COMPRESSOR__SCREWING:
				if (resolve) return getScrewing();
				return basicGetScrewing();
			case XPPUPackage.COMPRESSOR__COMPONENT_REPOSITORY:
				return getComponentRepository();
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
			case XPPUPackage.COMPRESSOR__POWERSUPPLY:
				setPowersupply((PowerSupply)newValue);
				return;
			case XPPUPackage.COMPRESSOR__PNEUMATICSUPPLY:
				getPneumaticsupply().clear();
				getPneumaticsupply().addAll((Collection<? extends PneumaticSupply>)newValue);
				return;
			case XPPUPackage.COMPRESSOR__PINS:
				getPins().clear();
				getPins().addAll((Collection<? extends SignalInterface>)newValue);
				return;
			case XPPUPackage.COMPRESSOR__SCREWING:
				setScrewing((Screwing)newValue);
				return;
			case XPPUPackage.COMPRESSOR__COMPONENT_REPOSITORY:
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
			case XPPUPackage.COMPRESSOR__POWERSUPPLY:
				setPowersupply((PowerSupply)null);
				return;
			case XPPUPackage.COMPRESSOR__PNEUMATICSUPPLY:
				getPneumaticsupply().clear();
				return;
			case XPPUPackage.COMPRESSOR__PINS:
				getPins().clear();
				return;
			case XPPUPackage.COMPRESSOR__SCREWING:
				setScrewing((Screwing)null);
				return;
			case XPPUPackage.COMPRESSOR__COMPONENT_REPOSITORY:
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
			case XPPUPackage.COMPRESSOR__POWERSUPPLY:
				return powersupply != null;
			case XPPUPackage.COMPRESSOR__PNEUMATICSUPPLY:
				return pneumaticsupply != null && !pneumaticsupply.isEmpty();
			case XPPUPackage.COMPRESSOR__PINS:
				return pins != null && !pins.isEmpty();
			case XPPUPackage.COMPRESSOR__SCREWING:
				return screwing != null;
			case XPPUPackage.COMPRESSOR__COMPONENT_REPOSITORY:
				return getComponentRepository() != null;
		}
		return super.eIsSet(featureID);
	}

} //CompressorImpl
