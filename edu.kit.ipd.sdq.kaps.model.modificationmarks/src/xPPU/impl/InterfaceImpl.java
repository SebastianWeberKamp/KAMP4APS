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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import xPPU.Clamping;
import xPPU.Components;
import xPPU.Gearing;
import xPPU.Interface;
import xPPU.PhysicalConnection;
import xPPU.PneumaticSupply;
import xPPU.PowerSupply;
import xPPU.Screwing;
import xPPU.SignalInterface;
import xPPU.Suspension;
import xPPU.TransportConnection;
import xPPU.WaterSupply;
import xPPU.XPPUPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xPPU.impl.InterfaceImpl#getScrewings <em>Screwings</em>}</li>
 *   <li>{@link xPPU.impl.InterfaceImpl#getSuspensions <em>Suspensions</em>}</li>
 *   <li>{@link xPPU.impl.InterfaceImpl#getGearings <em>Gearings</em>}</li>
 *   <li>{@link xPPU.impl.InterfaceImpl#getClamping <em>Clamping</em>}</li>
 *   <li>{@link xPPU.impl.InterfaceImpl#getPneumaticsupplys <em>Pneumaticsupplys</em>}</li>
 *   <li>{@link xPPU.impl.InterfaceImpl#getSignalinterfaces <em>Signalinterfaces</em>}</li>
 *   <li>{@link xPPU.impl.InterfaceImpl#getPowersupply <em>Powersupply</em>}</li>
 *   <li>{@link xPPU.impl.InterfaceImpl#getWatersupply <em>Watersupply</em>}</li>
 *   <li>{@link xPPU.impl.InterfaceImpl#getPhysicalconnections <em>Physicalconnections</em>}</li>
 *   <li>{@link xPPU.impl.InterfaceImpl#getTransportconnection <em>Transportconnection</em>}</li>
 *   <li>{@link xPPU.impl.InterfaceImpl#getComponentRepository <em>Component Repository</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceImpl extends EObjectImpl implements Interface {
	/**
	 * The cached value of the '{@link #getScrewings() <em>Screwings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScrewings()
	 * @generated
	 * @ordered
	 */
	protected EList<Screwing> screwings;

	/**
	 * The cached value of the '{@link #getSuspensions() <em>Suspensions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuspensions()
	 * @generated
	 * @ordered
	 */
	protected EList<Suspension> suspensions;

	/**
	 * The cached value of the '{@link #getGearings() <em>Gearings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGearings()
	 * @generated
	 * @ordered
	 */
	protected EList<Gearing> gearings;

	/**
	 * The cached value of the '{@link #getClamping() <em>Clamping</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClamping()
	 * @generated
	 * @ordered
	 */
	protected EList<Clamping> clamping;

	/**
	 * The cached value of the '{@link #getPneumaticsupplys() <em>Pneumaticsupplys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPneumaticsupplys()
	 * @generated
	 * @ordered
	 */
	protected EList<PneumaticSupply> pneumaticsupplys;

	/**
	 * The cached value of the '{@link #getSignalinterfaces() <em>Signalinterfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalinterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<SignalInterface> signalinterfaces;

	/**
	 * The cached value of the '{@link #getPowersupply() <em>Powersupply</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowersupply()
	 * @generated
	 * @ordered
	 */
	protected EList<PowerSupply> powersupply;

	/**
	 * The cached value of the '{@link #getWatersupply() <em>Watersupply</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWatersupply()
	 * @generated
	 * @ordered
	 */
	protected EList<WaterSupply> watersupply;

	/**
	 * The cached value of the '{@link #getPhysicalconnections() <em>Physicalconnections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalconnections()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalConnection> physicalconnections;

	/**
	 * The cached value of the '{@link #getTransportconnection() <em>Transportconnection</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportconnection()
	 * @generated
	 * @ordered
	 */
	protected EList<TransportConnection> transportconnection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XPPUPackage.Literals.INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Screwing> getScrewings() {
		if (screwings == null) {
			screwings = new EObjectContainmentWithInverseEList<Screwing>(Screwing.class, this, XPPUPackage.INTERFACE__SCREWINGS, XPPUPackage.SCREWING__INTEFACE_PART);
		}
		return screwings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Suspension> getSuspensions() {
		if (suspensions == null) {
			suspensions = new EObjectContainmentWithInverseEList<Suspension>(Suspension.class, this, XPPUPackage.INTERFACE__SUSPENSIONS, XPPUPackage.SUSPENSION__INTEFACE_PART);
		}
		return suspensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Gearing> getGearings() {
		if (gearings == null) {
			gearings = new EObjectContainmentWithInverseEList<Gearing>(Gearing.class, this, XPPUPackage.INTERFACE__GEARINGS, XPPUPackage.GEARING__INTEFACE_PART);
		}
		return gearings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clamping> getClamping() {
		if (clamping == null) {
			clamping = new EObjectWithInverseResolvingEList<Clamping>(Clamping.class, this, XPPUPackage.INTERFACE__CLAMPING, XPPUPackage.CLAMPING__INTEFACE_PART);
		}
		return clamping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PneumaticSupply> getPneumaticsupplys() {
		if (pneumaticsupplys == null) {
			pneumaticsupplys = new EObjectContainmentWithInverseEList<PneumaticSupply>(PneumaticSupply.class, this, XPPUPackage.INTERFACE__PNEUMATICSUPPLYS, XPPUPackage.PNEUMATIC_SUPPLY__INTEFACE_PART);
		}
		return pneumaticsupplys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SignalInterface> getSignalinterfaces() {
		if (signalinterfaces == null) {
			signalinterfaces = new EObjectContainmentWithInverseEList<SignalInterface>(SignalInterface.class, this, XPPUPackage.INTERFACE__SIGNALINTERFACES, XPPUPackage.SIGNAL_INTERFACE__INTEFACE_PART);
		}
		return signalinterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PowerSupply> getPowersupply() {
		if (powersupply == null) {
			powersupply = new EObjectResolvingEList<PowerSupply>(PowerSupply.class, this, XPPUPackage.INTERFACE__POWERSUPPLY);
		}
		return powersupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WaterSupply> getWatersupply() {
		if (watersupply == null) {
			watersupply = new EObjectWithInverseResolvingEList<WaterSupply>(WaterSupply.class, this, XPPUPackage.INTERFACE__WATERSUPPLY, XPPUPackage.WATER_SUPPLY__INTEFACE_PART);
		}
		return watersupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalConnection> getPhysicalconnections() {
		if (physicalconnections == null) {
			physicalconnections = new EObjectContainmentWithInverseEList<PhysicalConnection>(PhysicalConnection.class, this, XPPUPackage.INTERFACE__PHYSICALCONNECTIONS, XPPUPackage.PHYSICAL_CONNECTION__INTEFACE_PART);
		}
		return physicalconnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransportConnection> getTransportconnection() {
		if (transportconnection == null) {
			transportconnection = new EObjectWithInverseResolvingEList<TransportConnection>(TransportConnection.class, this, XPPUPackage.INTERFACE__TRANSPORTCONNECTION, XPPUPackage.TRANSPORT_CONNECTION__INTEFACE_PART);
		}
		return transportconnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Components getComponentRepository() {
		if (eContainerFeatureID() != XPPUPackage.INTERFACE__COMPONENT_REPOSITORY) return null;
		return (Components)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentRepository(Components newComponentRepository, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newComponentRepository, XPPUPackage.INTERFACE__COMPONENT_REPOSITORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentRepository(Components newComponentRepository) {
		if (newComponentRepository != eInternalContainer() || (eContainerFeatureID() != XPPUPackage.INTERFACE__COMPONENT_REPOSITORY && newComponentRepository != null)) {
			if (EcoreUtil.isAncestor(this, newComponentRepository))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newComponentRepository != null)
				msgs = ((InternalEObject)newComponentRepository).eInverseAdd(this, XPPUPackage.COMPONENTS__INTERFACES, Components.class, msgs);
			msgs = basicSetComponentRepository(newComponentRepository, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XPPUPackage.INTERFACE__COMPONENT_REPOSITORY, newComponentRepository, newComponentRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XPPUPackage.INTERFACE__SCREWINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getScrewings()).basicAdd(otherEnd, msgs);
			case XPPUPackage.INTERFACE__SUSPENSIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSuspensions()).basicAdd(otherEnd, msgs);
			case XPPUPackage.INTERFACE__GEARINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGearings()).basicAdd(otherEnd, msgs);
			case XPPUPackage.INTERFACE__CLAMPING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getClamping()).basicAdd(otherEnd, msgs);
			case XPPUPackage.INTERFACE__PNEUMATICSUPPLYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPneumaticsupplys()).basicAdd(otherEnd, msgs);
			case XPPUPackage.INTERFACE__SIGNALINTERFACES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSignalinterfaces()).basicAdd(otherEnd, msgs);
			case XPPUPackage.INTERFACE__WATERSUPPLY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWatersupply()).basicAdd(otherEnd, msgs);
			case XPPUPackage.INTERFACE__PHYSICALCONNECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPhysicalconnections()).basicAdd(otherEnd, msgs);
			case XPPUPackage.INTERFACE__TRANSPORTCONNECTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransportconnection()).basicAdd(otherEnd, msgs);
			case XPPUPackage.INTERFACE__COMPONENT_REPOSITORY:
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
			case XPPUPackage.INTERFACE__SCREWINGS:
				return ((InternalEList<?>)getScrewings()).basicRemove(otherEnd, msgs);
			case XPPUPackage.INTERFACE__SUSPENSIONS:
				return ((InternalEList<?>)getSuspensions()).basicRemove(otherEnd, msgs);
			case XPPUPackage.INTERFACE__GEARINGS:
				return ((InternalEList<?>)getGearings()).basicRemove(otherEnd, msgs);
			case XPPUPackage.INTERFACE__CLAMPING:
				return ((InternalEList<?>)getClamping()).basicRemove(otherEnd, msgs);
			case XPPUPackage.INTERFACE__PNEUMATICSUPPLYS:
				return ((InternalEList<?>)getPneumaticsupplys()).basicRemove(otherEnd, msgs);
			case XPPUPackage.INTERFACE__SIGNALINTERFACES:
				return ((InternalEList<?>)getSignalinterfaces()).basicRemove(otherEnd, msgs);
			case XPPUPackage.INTERFACE__WATERSUPPLY:
				return ((InternalEList<?>)getWatersupply()).basicRemove(otherEnd, msgs);
			case XPPUPackage.INTERFACE__PHYSICALCONNECTIONS:
				return ((InternalEList<?>)getPhysicalconnections()).basicRemove(otherEnd, msgs);
			case XPPUPackage.INTERFACE__TRANSPORTCONNECTION:
				return ((InternalEList<?>)getTransportconnection()).basicRemove(otherEnd, msgs);
			case XPPUPackage.INTERFACE__COMPONENT_REPOSITORY:
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
			case XPPUPackage.INTERFACE__COMPONENT_REPOSITORY:
				return eInternalContainer().eInverseRemove(this, XPPUPackage.COMPONENTS__INTERFACES, Components.class, msgs);
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
			case XPPUPackage.INTERFACE__SCREWINGS:
				return getScrewings();
			case XPPUPackage.INTERFACE__SUSPENSIONS:
				return getSuspensions();
			case XPPUPackage.INTERFACE__GEARINGS:
				return getGearings();
			case XPPUPackage.INTERFACE__CLAMPING:
				return getClamping();
			case XPPUPackage.INTERFACE__PNEUMATICSUPPLYS:
				return getPneumaticsupplys();
			case XPPUPackage.INTERFACE__SIGNALINTERFACES:
				return getSignalinterfaces();
			case XPPUPackage.INTERFACE__POWERSUPPLY:
				return getPowersupply();
			case XPPUPackage.INTERFACE__WATERSUPPLY:
				return getWatersupply();
			case XPPUPackage.INTERFACE__PHYSICALCONNECTIONS:
				return getPhysicalconnections();
			case XPPUPackage.INTERFACE__TRANSPORTCONNECTION:
				return getTransportconnection();
			case XPPUPackage.INTERFACE__COMPONENT_REPOSITORY:
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
			case XPPUPackage.INTERFACE__SCREWINGS:
				getScrewings().clear();
				getScrewings().addAll((Collection<? extends Screwing>)newValue);
				return;
			case XPPUPackage.INTERFACE__SUSPENSIONS:
				getSuspensions().clear();
				getSuspensions().addAll((Collection<? extends Suspension>)newValue);
				return;
			case XPPUPackage.INTERFACE__GEARINGS:
				getGearings().clear();
				getGearings().addAll((Collection<? extends Gearing>)newValue);
				return;
			case XPPUPackage.INTERFACE__CLAMPING:
				getClamping().clear();
				getClamping().addAll((Collection<? extends Clamping>)newValue);
				return;
			case XPPUPackage.INTERFACE__PNEUMATICSUPPLYS:
				getPneumaticsupplys().clear();
				getPneumaticsupplys().addAll((Collection<? extends PneumaticSupply>)newValue);
				return;
			case XPPUPackage.INTERFACE__SIGNALINTERFACES:
				getSignalinterfaces().clear();
				getSignalinterfaces().addAll((Collection<? extends SignalInterface>)newValue);
				return;
			case XPPUPackage.INTERFACE__POWERSUPPLY:
				getPowersupply().clear();
				getPowersupply().addAll((Collection<? extends PowerSupply>)newValue);
				return;
			case XPPUPackage.INTERFACE__WATERSUPPLY:
				getWatersupply().clear();
				getWatersupply().addAll((Collection<? extends WaterSupply>)newValue);
				return;
			case XPPUPackage.INTERFACE__PHYSICALCONNECTIONS:
				getPhysicalconnections().clear();
				getPhysicalconnections().addAll((Collection<? extends PhysicalConnection>)newValue);
				return;
			case XPPUPackage.INTERFACE__TRANSPORTCONNECTION:
				getTransportconnection().clear();
				getTransportconnection().addAll((Collection<? extends TransportConnection>)newValue);
				return;
			case XPPUPackage.INTERFACE__COMPONENT_REPOSITORY:
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
			case XPPUPackage.INTERFACE__SCREWINGS:
				getScrewings().clear();
				return;
			case XPPUPackage.INTERFACE__SUSPENSIONS:
				getSuspensions().clear();
				return;
			case XPPUPackage.INTERFACE__GEARINGS:
				getGearings().clear();
				return;
			case XPPUPackage.INTERFACE__CLAMPING:
				getClamping().clear();
				return;
			case XPPUPackage.INTERFACE__PNEUMATICSUPPLYS:
				getPneumaticsupplys().clear();
				return;
			case XPPUPackage.INTERFACE__SIGNALINTERFACES:
				getSignalinterfaces().clear();
				return;
			case XPPUPackage.INTERFACE__POWERSUPPLY:
				getPowersupply().clear();
				return;
			case XPPUPackage.INTERFACE__WATERSUPPLY:
				getWatersupply().clear();
				return;
			case XPPUPackage.INTERFACE__PHYSICALCONNECTIONS:
				getPhysicalconnections().clear();
				return;
			case XPPUPackage.INTERFACE__TRANSPORTCONNECTION:
				getTransportconnection().clear();
				return;
			case XPPUPackage.INTERFACE__COMPONENT_REPOSITORY:
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
			case XPPUPackage.INTERFACE__SCREWINGS:
				return screwings != null && !screwings.isEmpty();
			case XPPUPackage.INTERFACE__SUSPENSIONS:
				return suspensions != null && !suspensions.isEmpty();
			case XPPUPackage.INTERFACE__GEARINGS:
				return gearings != null && !gearings.isEmpty();
			case XPPUPackage.INTERFACE__CLAMPING:
				return clamping != null && !clamping.isEmpty();
			case XPPUPackage.INTERFACE__PNEUMATICSUPPLYS:
				return pneumaticsupplys != null && !pneumaticsupplys.isEmpty();
			case XPPUPackage.INTERFACE__SIGNALINTERFACES:
				return signalinterfaces != null && !signalinterfaces.isEmpty();
			case XPPUPackage.INTERFACE__POWERSUPPLY:
				return powersupply != null && !powersupply.isEmpty();
			case XPPUPackage.INTERFACE__WATERSUPPLY:
				return watersupply != null && !watersupply.isEmpty();
			case XPPUPackage.INTERFACE__PHYSICALCONNECTIONS:
				return physicalconnections != null && !physicalconnections.isEmpty();
			case XPPUPackage.INTERFACE__TRANSPORTCONNECTION:
				return transportconnection != null && !transportconnection.isEmpty();
			case XPPUPackage.INTERFACE__COMPONENT_REPOSITORY:
				return getComponentRepository() != null;
		}
		return super.eIsSet(featureID);
	}

} //InterfaceImpl
