/**
 */
package xPPU.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import xPPU.BottleSeperator;
import xPPU.Components;
import xPPU.PneumaticSupply;
import xPPU.PowerSupply;
import xPPU.Screwing;
import xPPU.SignalInterface;
import xPPU.XPPUPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bottle Seperator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xPPU.impl.BottleSeperatorImpl#getSignalinterface <em>Signalinterface</em>}</li>
 *   <li>{@link xPPU.impl.BottleSeperatorImpl#getPneumaticsupply <em>Pneumaticsupply</em>}</li>
 *   <li>{@link xPPU.impl.BottleSeperatorImpl#getPowersupply <em>Powersupply</em>}</li>
 *   <li>{@link xPPU.impl.BottleSeperatorImpl#getScrewing_to_rack <em>Screwing to rack</em>}</li>
 *   <li>{@link xPPU.impl.BottleSeperatorImpl#getComponentRepository <em>Component Repository</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BottleSeperatorImpl extends EObjectImpl implements BottleSeperator {
	/**
	 * The cached value of the '{@link #getSignalinterface() <em>Signalinterface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalinterface()
	 * @generated
	 * @ordered
	 */
	protected SignalInterface signalinterface;

	/**
	 * The cached value of the '{@link #getPneumaticsupply() <em>Pneumaticsupply</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPneumaticsupply()
	 * @generated
	 * @ordered
	 */
	protected PneumaticSupply pneumaticsupply;

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
	 * The cached value of the '{@link #getScrewing_to_rack() <em>Screwing to rack</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScrewing_to_rack()
	 * @generated
	 * @ordered
	 */
	protected Screwing screwing_to_rack;

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
	protected BottleSeperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XPPUPackage.Literals.BOTTLE_SEPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalInterface getSignalinterface() {
		if (signalinterface != null && signalinterface.eIsProxy()) {
			InternalEObject oldSignalinterface = (InternalEObject)signalinterface;
			signalinterface = (SignalInterface)eResolveProxy(oldSignalinterface);
			if (signalinterface != oldSignalinterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XPPUPackage.BOTTLE_SEPERATOR__SIGNALINTERFACE, oldSignalinterface, signalinterface));
			}
		}
		return signalinterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalInterface basicGetSignalinterface() {
		return signalinterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignalinterface(SignalInterface newSignalinterface) {
		SignalInterface oldSignalinterface = signalinterface;
		signalinterface = newSignalinterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XPPUPackage.BOTTLE_SEPERATOR__SIGNALINTERFACE, oldSignalinterface, signalinterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PneumaticSupply getPneumaticsupply() {
		if (pneumaticsupply != null && pneumaticsupply.eIsProxy()) {
			InternalEObject oldPneumaticsupply = (InternalEObject)pneumaticsupply;
			pneumaticsupply = (PneumaticSupply)eResolveProxy(oldPneumaticsupply);
			if (pneumaticsupply != oldPneumaticsupply) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XPPUPackage.BOTTLE_SEPERATOR__PNEUMATICSUPPLY, oldPneumaticsupply, pneumaticsupply));
			}
		}
		return pneumaticsupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PneumaticSupply basicGetPneumaticsupply() {
		return pneumaticsupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPneumaticsupply(PneumaticSupply newPneumaticsupply) {
		PneumaticSupply oldPneumaticsupply = pneumaticsupply;
		pneumaticsupply = newPneumaticsupply;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XPPUPackage.BOTTLE_SEPERATOR__PNEUMATICSUPPLY, oldPneumaticsupply, pneumaticsupply));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XPPUPackage.BOTTLE_SEPERATOR__POWERSUPPLY, oldPowersupply, powersupply));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XPPUPackage.BOTTLE_SEPERATOR__POWERSUPPLY, oldPowersupply, powersupply));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Screwing getScrewing_to_rack() {
		if (screwing_to_rack != null && screwing_to_rack.eIsProxy()) {
			InternalEObject oldScrewing_to_rack = (InternalEObject)screwing_to_rack;
			screwing_to_rack = (Screwing)eResolveProxy(oldScrewing_to_rack);
			if (screwing_to_rack != oldScrewing_to_rack) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XPPUPackage.BOTTLE_SEPERATOR__SCREWING_TO_RACK, oldScrewing_to_rack, screwing_to_rack));
			}
		}
		return screwing_to_rack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Screwing basicGetScrewing_to_rack() {
		return screwing_to_rack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScrewing_to_rack(Screwing newScrewing_to_rack) {
		Screwing oldScrewing_to_rack = screwing_to_rack;
		screwing_to_rack = newScrewing_to_rack;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XPPUPackage.BOTTLE_SEPERATOR__SCREWING_TO_RACK, oldScrewing_to_rack, screwing_to_rack));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XPPUPackage.BOTTLE_SEPERATOR__COMPONENT_REPOSITORY, oldComponentRepository, componentRepository));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPPUPackage.BOTTLE_SEPERATOR__COMPONENT_REPOSITORY, oldComponentRepository, newComponentRepository);
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
				msgs = ((InternalEObject)componentRepository).eInverseRemove(this, XPPUPackage.COMPONENTS__BOTTLE_SEPERATOR, Components.class, msgs);
			if (newComponentRepository != null)
				msgs = ((InternalEObject)newComponentRepository).eInverseAdd(this, XPPUPackage.COMPONENTS__BOTTLE_SEPERATOR, Components.class, msgs);
			msgs = basicSetComponentRepository(newComponentRepository, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XPPUPackage.BOTTLE_SEPERATOR__COMPONENT_REPOSITORY, newComponentRepository, newComponentRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XPPUPackage.BOTTLE_SEPERATOR__COMPONENT_REPOSITORY:
				if (componentRepository != null)
					msgs = ((InternalEObject)componentRepository).eInverseRemove(this, XPPUPackage.COMPONENTS__BOTTLE_SEPERATOR, Components.class, msgs);
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
			case XPPUPackage.BOTTLE_SEPERATOR__COMPONENT_REPOSITORY:
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
			case XPPUPackage.BOTTLE_SEPERATOR__SIGNALINTERFACE:
				if (resolve) return getSignalinterface();
				return basicGetSignalinterface();
			case XPPUPackage.BOTTLE_SEPERATOR__PNEUMATICSUPPLY:
				if (resolve) return getPneumaticsupply();
				return basicGetPneumaticsupply();
			case XPPUPackage.BOTTLE_SEPERATOR__POWERSUPPLY:
				if (resolve) return getPowersupply();
				return basicGetPowersupply();
			case XPPUPackage.BOTTLE_SEPERATOR__SCREWING_TO_RACK:
				if (resolve) return getScrewing_to_rack();
				return basicGetScrewing_to_rack();
			case XPPUPackage.BOTTLE_SEPERATOR__COMPONENT_REPOSITORY:
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
			case XPPUPackage.BOTTLE_SEPERATOR__SIGNALINTERFACE:
				setSignalinterface((SignalInterface)newValue);
				return;
			case XPPUPackage.BOTTLE_SEPERATOR__PNEUMATICSUPPLY:
				setPneumaticsupply((PneumaticSupply)newValue);
				return;
			case XPPUPackage.BOTTLE_SEPERATOR__POWERSUPPLY:
				setPowersupply((PowerSupply)newValue);
				return;
			case XPPUPackage.BOTTLE_SEPERATOR__SCREWING_TO_RACK:
				setScrewing_to_rack((Screwing)newValue);
				return;
			case XPPUPackage.BOTTLE_SEPERATOR__COMPONENT_REPOSITORY:
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
			case XPPUPackage.BOTTLE_SEPERATOR__SIGNALINTERFACE:
				setSignalinterface((SignalInterface)null);
				return;
			case XPPUPackage.BOTTLE_SEPERATOR__PNEUMATICSUPPLY:
				setPneumaticsupply((PneumaticSupply)null);
				return;
			case XPPUPackage.BOTTLE_SEPERATOR__POWERSUPPLY:
				setPowersupply((PowerSupply)null);
				return;
			case XPPUPackage.BOTTLE_SEPERATOR__SCREWING_TO_RACK:
				setScrewing_to_rack((Screwing)null);
				return;
			case XPPUPackage.BOTTLE_SEPERATOR__COMPONENT_REPOSITORY:
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
			case XPPUPackage.BOTTLE_SEPERATOR__SIGNALINTERFACE:
				return signalinterface != null;
			case XPPUPackage.BOTTLE_SEPERATOR__PNEUMATICSUPPLY:
				return pneumaticsupply != null;
			case XPPUPackage.BOTTLE_SEPERATOR__POWERSUPPLY:
				return powersupply != null;
			case XPPUPackage.BOTTLE_SEPERATOR__SCREWING_TO_RACK:
				return screwing_to_rack != null;
			case XPPUPackage.BOTTLE_SEPERATOR__COMPONENT_REPOSITORY:
				return componentRepository != null;
		}
		return super.eIsSet(featureID);
	}

} //BottleSeperatorImpl
