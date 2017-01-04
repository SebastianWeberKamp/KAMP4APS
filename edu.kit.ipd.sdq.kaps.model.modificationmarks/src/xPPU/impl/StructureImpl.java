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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import xPPU.CommunicationNetwork;
import xPPU.Components;
import xPPU.ControlCabinet;
import xPPU.Conveyor;
import xPPU.Crane;
import xPPU.Modules;
import xPPU.Plant;
import xPPU.PneumaticNetwork;
import xPPU.PowerNetwork;
import xPPU.PowerWiring;
import xPPU.Structure;
import xPPU.XPPUPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xPPU.impl.StructureImpl#getParentPlant <em>Parent Plant</em>}</li>
 *   <li>{@link xPPU.impl.StructureImpl#getModules <em>Modules</em>}</li>
 *   <li>{@link xPPU.impl.StructureImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link xPPU.impl.StructureImpl#getCranes <em>Cranes</em>}</li>
 *   <li>{@link xPPU.impl.StructureImpl#getConveyor <em>Conveyor</em>}</li>
 *   <li>{@link xPPU.impl.StructureImpl#getControlcabinets <em>Controlcabinets</em>}</li>
 *   <li>{@link xPPU.impl.StructureImpl#getPowernetworks <em>Powernetworks</em>}</li>
 *   <li>{@link xPPU.impl.StructureImpl#getCommunicationnetworks <em>Communicationnetworks</em>}</li>
 *   <li>{@link xPPU.impl.StructureImpl#getPneumaticnetworks <em>Pneumaticnetworks</em>}</li>
 *   <li>{@link xPPU.impl.StructureImpl#getPowerwiring <em>Powerwiring</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructureImpl extends EObjectImpl implements Structure {
	/**
	 * The cached value of the '{@link #getModules() <em>Modules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModules()
	 * @generated
	 * @ordered
	 */
	protected EList<Modules> modules;

	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Components> components;

	/**
	 * The cached value of the '{@link #getCranes() <em>Cranes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCranes()
	 * @generated
	 * @ordered
	 */
	protected EList<Crane> cranes;

	/**
	 * The cached value of the '{@link #getConveyor() <em>Conveyor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConveyor()
	 * @generated
	 * @ordered
	 */
	protected EList<Conveyor> conveyor;

	/**
	 * The cached value of the '{@link #getControlcabinets() <em>Controlcabinets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlcabinets()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlCabinet> controlcabinets;

	/**
	 * The cached value of the '{@link #getPowernetworks() <em>Powernetworks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowernetworks()
	 * @generated
	 * @ordered
	 */
	protected EList<PowerNetwork> powernetworks;

	/**
	 * The cached value of the '{@link #getCommunicationnetworks() <em>Communicationnetworks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationnetworks()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationNetwork> communicationnetworks;

	/**
	 * The cached value of the '{@link #getPneumaticnetworks() <em>Pneumaticnetworks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPneumaticnetworks()
	 * @generated
	 * @ordered
	 */
	protected EList<PneumaticNetwork> pneumaticnetworks;

	/**
	 * The cached value of the '{@link #getPowerwiring() <em>Powerwiring</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerwiring()
	 * @generated
	 * @ordered
	 */
	protected EList<PowerWiring> powerwiring;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XPPUPackage.Literals.STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plant getParentPlant() {
		if (eContainerFeatureID() != XPPUPackage.STRUCTURE__PARENT_PLANT) return null;
		return (Plant)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentPlant(Plant newParentPlant, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentPlant, XPPUPackage.STRUCTURE__PARENT_PLANT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentPlant(Plant newParentPlant) {
		if (newParentPlant != eInternalContainer() || (eContainerFeatureID() != XPPUPackage.STRUCTURE__PARENT_PLANT && newParentPlant != null)) {
			if (EcoreUtil.isAncestor(this, newParentPlant))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentPlant != null)
				msgs = ((InternalEObject)newParentPlant).eInverseAdd(this, XPPUPackage.PLANT__STRUCTURES, Plant.class, msgs);
			msgs = basicSetParentPlant(newParentPlant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XPPUPackage.STRUCTURE__PARENT_PLANT, newParentPlant, newParentPlant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Modules> getModules() {
		if (modules == null) {
			modules = new EObjectContainmentWithInverseEList<Modules>(Modules.class, this, XPPUPackage.STRUCTURE__MODULES, XPPUPackage.MODULES__PARENT_STRUCTURE);
		}
		return modules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Components> getComponents() {
		if (components == null) {
			components = new EObjectContainmentWithInverseEList<Components>(Components.class, this, XPPUPackage.STRUCTURE__COMPONENTS, XPPUPackage.COMPONENTS__PARENT_STRUCTURE);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Crane> getCranes() {
		if (cranes == null) {
			cranes = new EObjectContainmentWithInverseEList<Crane>(Crane.class, this, XPPUPackage.STRUCTURE__CRANES, XPPUPackage.CRANE__PARENT_STRUCTURE);
		}
		return cranes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Conveyor> getConveyor() {
		if (conveyor == null) {
			conveyor = new EObjectContainmentWithInverseEList<Conveyor>(Conveyor.class, this, XPPUPackage.STRUCTURE__CONVEYOR, XPPUPackage.CONVEYOR__PARENT_STRUCTURE);
		}
		return conveyor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlCabinet> getControlcabinets() {
		if (controlcabinets == null) {
			controlcabinets = new EObjectContainmentEList<ControlCabinet>(ControlCabinet.class, this, XPPUPackage.STRUCTURE__CONTROLCABINETS);
		}
		return controlcabinets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PowerNetwork> getPowernetworks() {
		if (powernetworks == null) {
			powernetworks = new EObjectContainmentWithInverseEList<PowerNetwork>(PowerNetwork.class, this, XPPUPackage.STRUCTURE__POWERNETWORKS, XPPUPackage.POWER_NETWORK__PARENT_STRUCTURE);
		}
		return powernetworks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommunicationNetwork> getCommunicationnetworks() {
		if (communicationnetworks == null) {
			communicationnetworks = new EObjectContainmentWithInverseEList<CommunicationNetwork>(CommunicationNetwork.class, this, XPPUPackage.STRUCTURE__COMMUNICATIONNETWORKS, XPPUPackage.COMMUNICATION_NETWORK__PARENT_STRUCTURE);
		}
		return communicationnetworks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PneumaticNetwork> getPneumaticnetworks() {
		if (pneumaticnetworks == null) {
			pneumaticnetworks = new EObjectContainmentWithInverseEList<PneumaticNetwork>(PneumaticNetwork.class, this, XPPUPackage.STRUCTURE__PNEUMATICNETWORKS, XPPUPackage.PNEUMATIC_NETWORK__PARENT_STRUCTURE);
		}
		return pneumaticnetworks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PowerWiring> getPowerwiring() {
		if (powerwiring == null) {
			powerwiring = new EObjectContainmentWithInverseEList<PowerWiring>(PowerWiring.class, this, XPPUPackage.STRUCTURE__POWERWIRING, XPPUPackage.POWER_WIRING__PARENT_STRUCTURE);
		}
		return powerwiring;
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
			case XPPUPackage.STRUCTURE__PARENT_PLANT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentPlant((Plant)otherEnd, msgs);
			case XPPUPackage.STRUCTURE__MODULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getModules()).basicAdd(otherEnd, msgs);
			case XPPUPackage.STRUCTURE__COMPONENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComponents()).basicAdd(otherEnd, msgs);
			case XPPUPackage.STRUCTURE__CRANES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCranes()).basicAdd(otherEnd, msgs);
			case XPPUPackage.STRUCTURE__CONVEYOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConveyor()).basicAdd(otherEnd, msgs);
			case XPPUPackage.STRUCTURE__POWERNETWORKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPowernetworks()).basicAdd(otherEnd, msgs);
			case XPPUPackage.STRUCTURE__COMMUNICATIONNETWORKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCommunicationnetworks()).basicAdd(otherEnd, msgs);
			case XPPUPackage.STRUCTURE__PNEUMATICNETWORKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPneumaticnetworks()).basicAdd(otherEnd, msgs);
			case XPPUPackage.STRUCTURE__POWERWIRING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPowerwiring()).basicAdd(otherEnd, msgs);
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
			case XPPUPackage.STRUCTURE__PARENT_PLANT:
				return basicSetParentPlant(null, msgs);
			case XPPUPackage.STRUCTURE__MODULES:
				return ((InternalEList<?>)getModules()).basicRemove(otherEnd, msgs);
			case XPPUPackage.STRUCTURE__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
			case XPPUPackage.STRUCTURE__CRANES:
				return ((InternalEList<?>)getCranes()).basicRemove(otherEnd, msgs);
			case XPPUPackage.STRUCTURE__CONVEYOR:
				return ((InternalEList<?>)getConveyor()).basicRemove(otherEnd, msgs);
			case XPPUPackage.STRUCTURE__CONTROLCABINETS:
				return ((InternalEList<?>)getControlcabinets()).basicRemove(otherEnd, msgs);
			case XPPUPackage.STRUCTURE__POWERNETWORKS:
				return ((InternalEList<?>)getPowernetworks()).basicRemove(otherEnd, msgs);
			case XPPUPackage.STRUCTURE__COMMUNICATIONNETWORKS:
				return ((InternalEList<?>)getCommunicationnetworks()).basicRemove(otherEnd, msgs);
			case XPPUPackage.STRUCTURE__PNEUMATICNETWORKS:
				return ((InternalEList<?>)getPneumaticnetworks()).basicRemove(otherEnd, msgs);
			case XPPUPackage.STRUCTURE__POWERWIRING:
				return ((InternalEList<?>)getPowerwiring()).basicRemove(otherEnd, msgs);
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
			case XPPUPackage.STRUCTURE__PARENT_PLANT:
				return eInternalContainer().eInverseRemove(this, XPPUPackage.PLANT__STRUCTURES, Plant.class, msgs);
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
			case XPPUPackage.STRUCTURE__PARENT_PLANT:
				return getParentPlant();
			case XPPUPackage.STRUCTURE__MODULES:
				return getModules();
			case XPPUPackage.STRUCTURE__COMPONENTS:
				return getComponents();
			case XPPUPackage.STRUCTURE__CRANES:
				return getCranes();
			case XPPUPackage.STRUCTURE__CONVEYOR:
				return getConveyor();
			case XPPUPackage.STRUCTURE__CONTROLCABINETS:
				return getControlcabinets();
			case XPPUPackage.STRUCTURE__POWERNETWORKS:
				return getPowernetworks();
			case XPPUPackage.STRUCTURE__COMMUNICATIONNETWORKS:
				return getCommunicationnetworks();
			case XPPUPackage.STRUCTURE__PNEUMATICNETWORKS:
				return getPneumaticnetworks();
			case XPPUPackage.STRUCTURE__POWERWIRING:
				return getPowerwiring();
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
			case XPPUPackage.STRUCTURE__PARENT_PLANT:
				setParentPlant((Plant)newValue);
				return;
			case XPPUPackage.STRUCTURE__MODULES:
				getModules().clear();
				getModules().addAll((Collection<? extends Modules>)newValue);
				return;
			case XPPUPackage.STRUCTURE__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends Components>)newValue);
				return;
			case XPPUPackage.STRUCTURE__CRANES:
				getCranes().clear();
				getCranes().addAll((Collection<? extends Crane>)newValue);
				return;
			case XPPUPackage.STRUCTURE__CONVEYOR:
				getConveyor().clear();
				getConveyor().addAll((Collection<? extends Conveyor>)newValue);
				return;
			case XPPUPackage.STRUCTURE__CONTROLCABINETS:
				getControlcabinets().clear();
				getControlcabinets().addAll((Collection<? extends ControlCabinet>)newValue);
				return;
			case XPPUPackage.STRUCTURE__POWERNETWORKS:
				getPowernetworks().clear();
				getPowernetworks().addAll((Collection<? extends PowerNetwork>)newValue);
				return;
			case XPPUPackage.STRUCTURE__COMMUNICATIONNETWORKS:
				getCommunicationnetworks().clear();
				getCommunicationnetworks().addAll((Collection<? extends CommunicationNetwork>)newValue);
				return;
			case XPPUPackage.STRUCTURE__PNEUMATICNETWORKS:
				getPneumaticnetworks().clear();
				getPneumaticnetworks().addAll((Collection<? extends PneumaticNetwork>)newValue);
				return;
			case XPPUPackage.STRUCTURE__POWERWIRING:
				getPowerwiring().clear();
				getPowerwiring().addAll((Collection<? extends PowerWiring>)newValue);
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
			case XPPUPackage.STRUCTURE__PARENT_PLANT:
				setParentPlant((Plant)null);
				return;
			case XPPUPackage.STRUCTURE__MODULES:
				getModules().clear();
				return;
			case XPPUPackage.STRUCTURE__COMPONENTS:
				getComponents().clear();
				return;
			case XPPUPackage.STRUCTURE__CRANES:
				getCranes().clear();
				return;
			case XPPUPackage.STRUCTURE__CONVEYOR:
				getConveyor().clear();
				return;
			case XPPUPackage.STRUCTURE__CONTROLCABINETS:
				getControlcabinets().clear();
				return;
			case XPPUPackage.STRUCTURE__POWERNETWORKS:
				getPowernetworks().clear();
				return;
			case XPPUPackage.STRUCTURE__COMMUNICATIONNETWORKS:
				getCommunicationnetworks().clear();
				return;
			case XPPUPackage.STRUCTURE__PNEUMATICNETWORKS:
				getPneumaticnetworks().clear();
				return;
			case XPPUPackage.STRUCTURE__POWERWIRING:
				getPowerwiring().clear();
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
			case XPPUPackage.STRUCTURE__PARENT_PLANT:
				return getParentPlant() != null;
			case XPPUPackage.STRUCTURE__MODULES:
				return modules != null && !modules.isEmpty();
			case XPPUPackage.STRUCTURE__COMPONENTS:
				return components != null && !components.isEmpty();
			case XPPUPackage.STRUCTURE__CRANES:
				return cranes != null && !cranes.isEmpty();
			case XPPUPackage.STRUCTURE__CONVEYOR:
				return conveyor != null && !conveyor.isEmpty();
			case XPPUPackage.STRUCTURE__CONTROLCABINETS:
				return controlcabinets != null && !controlcabinets.isEmpty();
			case XPPUPackage.STRUCTURE__POWERNETWORKS:
				return powernetworks != null && !powernetworks.isEmpty();
			case XPPUPackage.STRUCTURE__COMMUNICATIONNETWORKS:
				return communicationnetworks != null && !communicationnetworks.isEmpty();
			case XPPUPackage.STRUCTURE__PNEUMATICNETWORKS:
				return pneumaticnetworks != null && !pneumaticnetworks.isEmpty();
			case XPPUPackage.STRUCTURE__POWERWIRING:
				return powerwiring != null && !powerwiring.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StructureImpl
