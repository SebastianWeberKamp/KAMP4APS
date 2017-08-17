/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.ProfibusDPSlave;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.RegularValve;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.VacuumGripper;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.VacuumSwitch;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.GripperPart;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Crane;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.StructureRepositoryPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vacuum Gripper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.VacuumGripperImpl#getMountedTo <em>Mounted To</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.VacuumGripperImpl#getGripperPart <em>Gripper Part</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.VacuumGripperImpl#getValve <em>Valve</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.VacuumGripperImpl#getVacuumSwitch <em>Vacuum Switch</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.VacuumGripperImpl#getBusSlave <em>Bus Slave</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VacuumGripperImpl extends ComponentImpl implements VacuumGripper {
	/**
	 * The cached value of the '{@link #getMountedTo() <em>Mounted To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMountedTo()
	 * @generated
	 * @ordered
	 */
	protected Crane mountedTo;

	/**
	 * The cached value of the '{@link #getGripperPart() <em>Gripper Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGripperPart()
	 * @generated
	 * @ordered
	 */
	protected GripperPart gripperPart;

	/**
	 * The cached value of the '{@link #getValve() <em>Valve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValve()
	 * @generated
	 * @ordered
	 */
	protected RegularValve valve;

	/**
	 * The cached value of the '{@link #getVacuumSwitch() <em>Vacuum Switch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVacuumSwitch()
	 * @generated
	 * @ordered
	 */
	protected VacuumSwitch vacuumSwitch;

	/**
	 * The cached value of the '{@link #getBusSlave() <em>Bus Slave</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusSlave()
	 * @generated
	 * @ordered
	 */
	protected EList<ProfibusDPSlave> busSlave;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VacuumGripperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentRepositoryPackage.Literals.VACUUM_GRIPPER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Crane getMountedTo() {
		if (mountedTo != null && mountedTo.eIsProxy()) {
			InternalEObject oldMountedTo = (InternalEObject)mountedTo;
			mountedTo = (Crane)eResolveProxy(oldMountedTo);
			if (mountedTo != oldMountedTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentRepositoryPackage.VACUUM_GRIPPER__MOUNTED_TO, oldMountedTo, mountedTo));
			}
		}
		return mountedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Crane basicGetMountedTo() {
		return mountedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMountedTo(Crane newMountedTo, NotificationChain msgs) {
		Crane oldMountedTo = mountedTo;
		mountedTo = newMountedTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentRepositoryPackage.VACUUM_GRIPPER__MOUNTED_TO, oldMountedTo, newMountedTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMountedTo(Crane newMountedTo) {
		if (newMountedTo != mountedTo) {
			NotificationChain msgs = null;
			if (mountedTo != null)
				msgs = ((InternalEObject)mountedTo).eInverseRemove(this, StructureRepositoryPackage.CRANE__VACUUMGRIPPER, Crane.class, msgs);
			if (newMountedTo != null)
				msgs = ((InternalEObject)newMountedTo).eInverseAdd(this, StructureRepositoryPackage.CRANE__VACUUMGRIPPER, Crane.class, msgs);
			msgs = basicSetMountedTo(newMountedTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentRepositoryPackage.VACUUM_GRIPPER__MOUNTED_TO, newMountedTo, newMountedTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GripperPart getGripperPart() {
		return gripperPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGripperPart(GripperPart newGripperPart, NotificationChain msgs) {
		GripperPart oldGripperPart = gripperPart;
		gripperPart = newGripperPart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentRepositoryPackage.VACUUM_GRIPPER__GRIPPER_PART, oldGripperPart, newGripperPart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGripperPart(GripperPart newGripperPart) {
		if (newGripperPart != gripperPart) {
			NotificationChain msgs = null;
			if (gripperPart != null)
				msgs = ((InternalEObject)gripperPart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentRepositoryPackage.VACUUM_GRIPPER__GRIPPER_PART, null, msgs);
			if (newGripperPart != null)
				msgs = ((InternalEObject)newGripperPart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentRepositoryPackage.VACUUM_GRIPPER__GRIPPER_PART, null, msgs);
			msgs = basicSetGripperPart(newGripperPart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentRepositoryPackage.VACUUM_GRIPPER__GRIPPER_PART, newGripperPart, newGripperPart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegularValve getValve() {
		return valve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValve(RegularValve newValve, NotificationChain msgs) {
		RegularValve oldValve = valve;
		valve = newValve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentRepositoryPackage.VACUUM_GRIPPER__VALVE, oldValve, newValve);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValve(RegularValve newValve) {
		if (newValve != valve) {
			NotificationChain msgs = null;
			if (valve != null)
				msgs = ((InternalEObject)valve).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentRepositoryPackage.VACUUM_GRIPPER__VALVE, null, msgs);
			if (newValve != null)
				msgs = ((InternalEObject)newValve).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentRepositoryPackage.VACUUM_GRIPPER__VALVE, null, msgs);
			msgs = basicSetValve(newValve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentRepositoryPackage.VACUUM_GRIPPER__VALVE, newValve, newValve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VacuumSwitch getVacuumSwitch() {
		return vacuumSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVacuumSwitch(VacuumSwitch newVacuumSwitch, NotificationChain msgs) {
		VacuumSwitch oldVacuumSwitch = vacuumSwitch;
		vacuumSwitch = newVacuumSwitch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentRepositoryPackage.VACUUM_GRIPPER__VACUUM_SWITCH, oldVacuumSwitch, newVacuumSwitch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVacuumSwitch(VacuumSwitch newVacuumSwitch) {
		if (newVacuumSwitch != vacuumSwitch) {
			NotificationChain msgs = null;
			if (vacuumSwitch != null)
				msgs = ((InternalEObject)vacuumSwitch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentRepositoryPackage.VACUUM_GRIPPER__VACUUM_SWITCH, null, msgs);
			if (newVacuumSwitch != null)
				msgs = ((InternalEObject)newVacuumSwitch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentRepositoryPackage.VACUUM_GRIPPER__VACUUM_SWITCH, null, msgs);
			msgs = basicSetVacuumSwitch(newVacuumSwitch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentRepositoryPackage.VACUUM_GRIPPER__VACUUM_SWITCH, newVacuumSwitch, newVacuumSwitch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProfibusDPSlave> getBusSlave() {
		if (busSlave == null) {
			busSlave = new EObjectContainmentEList<ProfibusDPSlave>(ProfibusDPSlave.class, this, ComponentRepositoryPackage.VACUUM_GRIPPER__BUS_SLAVE);
		}
		return busSlave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentRepositoryPackage.VACUUM_GRIPPER__MOUNTED_TO:
				if (mountedTo != null)
					msgs = ((InternalEObject)mountedTo).eInverseRemove(this, StructureRepositoryPackage.CRANE__VACUUMGRIPPER, Crane.class, msgs);
				return basicSetMountedTo((Crane)otherEnd, msgs);
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
			case ComponentRepositoryPackage.VACUUM_GRIPPER__MOUNTED_TO:
				return basicSetMountedTo(null, msgs);
			case ComponentRepositoryPackage.VACUUM_GRIPPER__GRIPPER_PART:
				return basicSetGripperPart(null, msgs);
			case ComponentRepositoryPackage.VACUUM_GRIPPER__VALVE:
				return basicSetValve(null, msgs);
			case ComponentRepositoryPackage.VACUUM_GRIPPER__VACUUM_SWITCH:
				return basicSetVacuumSwitch(null, msgs);
			case ComponentRepositoryPackage.VACUUM_GRIPPER__BUS_SLAVE:
				return ((InternalEList<?>)getBusSlave()).basicRemove(otherEnd, msgs);
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
			case ComponentRepositoryPackage.VACUUM_GRIPPER__MOUNTED_TO:
				if (resolve) return getMountedTo();
				return basicGetMountedTo();
			case ComponentRepositoryPackage.VACUUM_GRIPPER__GRIPPER_PART:
				return getGripperPart();
			case ComponentRepositoryPackage.VACUUM_GRIPPER__VALVE:
				return getValve();
			case ComponentRepositoryPackage.VACUUM_GRIPPER__VACUUM_SWITCH:
				return getVacuumSwitch();
			case ComponentRepositoryPackage.VACUUM_GRIPPER__BUS_SLAVE:
				return getBusSlave();
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
			case ComponentRepositoryPackage.VACUUM_GRIPPER__MOUNTED_TO:
				setMountedTo((Crane)newValue);
				return;
			case ComponentRepositoryPackage.VACUUM_GRIPPER__GRIPPER_PART:
				setGripperPart((GripperPart)newValue);
				return;
			case ComponentRepositoryPackage.VACUUM_GRIPPER__VALVE:
				setValve((RegularValve)newValue);
				return;
			case ComponentRepositoryPackage.VACUUM_GRIPPER__VACUUM_SWITCH:
				setVacuumSwitch((VacuumSwitch)newValue);
				return;
			case ComponentRepositoryPackage.VACUUM_GRIPPER__BUS_SLAVE:
				getBusSlave().clear();
				getBusSlave().addAll((Collection<? extends ProfibusDPSlave>)newValue);
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
			case ComponentRepositoryPackage.VACUUM_GRIPPER__MOUNTED_TO:
				setMountedTo((Crane)null);
				return;
			case ComponentRepositoryPackage.VACUUM_GRIPPER__GRIPPER_PART:
				setGripperPart((GripperPart)null);
				return;
			case ComponentRepositoryPackage.VACUUM_GRIPPER__VALVE:
				setValve((RegularValve)null);
				return;
			case ComponentRepositoryPackage.VACUUM_GRIPPER__VACUUM_SWITCH:
				setVacuumSwitch((VacuumSwitch)null);
				return;
			case ComponentRepositoryPackage.VACUUM_GRIPPER__BUS_SLAVE:
				getBusSlave().clear();
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
			case ComponentRepositoryPackage.VACUUM_GRIPPER__MOUNTED_TO:
				return mountedTo != null;
			case ComponentRepositoryPackage.VACUUM_GRIPPER__GRIPPER_PART:
				return gripperPart != null;
			case ComponentRepositoryPackage.VACUUM_GRIPPER__VALVE:
				return valve != null;
			case ComponentRepositoryPackage.VACUUM_GRIPPER__VACUUM_SWITCH:
				return vacuumSwitch != null;
			case ComponentRepositoryPackage.VACUUM_GRIPPER__BUS_SLAVE:
				return busSlave != null && !busSlave.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VacuumGripperImpl
