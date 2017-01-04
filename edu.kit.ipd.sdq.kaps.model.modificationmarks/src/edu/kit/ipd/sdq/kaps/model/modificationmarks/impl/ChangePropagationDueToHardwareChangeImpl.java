/**
 */
package edu.kit.ipd.sdq.kaps.model.modificationmarks.impl;

import edu.kit.ipd.sdq.amp.model.modificationmarks.impl.ChangePropagationStepImpl;

import edu.kit.ipd.sdq.kaps.model.modificationmarks.ChangePropagationDueToHardwareChange;
import edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifyBusBox;
import edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifyBusCable;
import edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifyBusMaster;
import edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifyBusSlave;
import edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifyMicroSwitchModule;
import edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifyPhysicalConnection;
import edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifySensor;
import edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifySignalinterface;
import edu.kit.ipd.sdq.kaps.model.modificationmarks.modificationmarksPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Propagation Due To Hardware Change</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.ChangePropagationDueToHardwareChangeImpl#getSensorModifications <em>Sensor Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.ChangePropagationDueToHardwareChangeImpl#getSignalinterfaceModifications <em>Signalinterface Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.ChangePropagationDueToHardwareChangeImpl#getPhysicalConnectionModifications <em>Physical Connection Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.ChangePropagationDueToHardwareChangeImpl#getMicroSwitchModuleModifications <em>Micro Switch Module Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.ChangePropagationDueToHardwareChangeImpl#getBusBoxModifications <em>Bus Box Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.ChangePropagationDueToHardwareChangeImpl#getBusMasterModifications <em>Bus Master Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.ChangePropagationDueToHardwareChangeImpl#getBusSlaveModifications <em>Bus Slave Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.impl.ChangePropagationDueToHardwareChangeImpl#getBusCableModifications <em>Bus Cable Modifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChangePropagationDueToHardwareChangeImpl extends ChangePropagationStepImpl implements ChangePropagationDueToHardwareChange {
	/**
	 * The cached value of the '{@link #getSensorModifications() <em>Sensor Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<ModifySensor<?>> sensorModifications;

	/**
	 * The cached value of the '{@link #getSignalinterfaceModifications() <em>Signalinterface Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalinterfaceModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<ModifySignalinterface<?>> signalinterfaceModifications;

	/**
	 * The cached value of the '{@link #getPhysicalConnectionModifications() <em>Physical Connection Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalConnectionModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<ModifyPhysicalConnection<?>> physicalConnectionModifications;

	/**
	 * The cached value of the '{@link #getMicroSwitchModuleModifications() <em>Micro Switch Module Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMicroSwitchModuleModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<ModifyMicroSwitchModule<?>> microSwitchModuleModifications;

	/**
	 * The cached value of the '{@link #getBusBoxModifications() <em>Bus Box Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusBoxModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<ModifyBusBox<?>> busBoxModifications;

	/**
	 * The cached value of the '{@link #getBusMasterModifications() <em>Bus Master Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusMasterModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<ModifyBusMaster<?>> busMasterModifications;

	/**
	 * The cached value of the '{@link #getBusSlaveModifications() <em>Bus Slave Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusSlaveModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<ModifyBusSlave<?>> busSlaveModifications;

	/**
	 * The cached value of the '{@link #getBusCableModifications() <em>Bus Cable Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusCableModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<ModifyBusCable<?>> busCableModifications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangePropagationDueToHardwareChangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return modificationmarksPackage.Literals.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModifySensor<?>> getSensorModifications() {
		if (sensorModifications == null) {
			sensorModifications = new EObjectContainmentEList<ModifySensor<?>>(ModifySensor.class, this, modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__SENSOR_MODIFICATIONS);
		}
		return sensorModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModifySignalinterface<?>> getSignalinterfaceModifications() {
		if (signalinterfaceModifications == null) {
			signalinterfaceModifications = new EObjectContainmentEList<ModifySignalinterface<?>>(ModifySignalinterface.class, this, modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__SIGNALINTERFACE_MODIFICATIONS);
		}
		return signalinterfaceModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModifyPhysicalConnection<?>> getPhysicalConnectionModifications() {
		if (physicalConnectionModifications == null) {
			physicalConnectionModifications = new EObjectContainmentEList<ModifyPhysicalConnection<?>>(ModifyPhysicalConnection.class, this, modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__PHYSICAL_CONNECTION_MODIFICATIONS);
		}
		return physicalConnectionModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModifyMicroSwitchModule<?>> getMicroSwitchModuleModifications() {
		if (microSwitchModuleModifications == null) {
			microSwitchModuleModifications = new EObjectContainmentEList<ModifyMicroSwitchModule<?>>(ModifyMicroSwitchModule.class, this, modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__MICRO_SWITCH_MODULE_MODIFICATIONS);
		}
		return microSwitchModuleModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModifyBusBox<?>> getBusBoxModifications() {
		if (busBoxModifications == null) {
			busBoxModifications = new EObjectContainmentEList<ModifyBusBox<?>>(ModifyBusBox.class, this, modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_BOX_MODIFICATIONS);
		}
		return busBoxModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModifyBusMaster<?>> getBusMasterModifications() {
		if (busMasterModifications == null) {
			busMasterModifications = new EObjectContainmentEList<ModifyBusMaster<?>>(ModifyBusMaster.class, this, modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_MASTER_MODIFICATIONS);
		}
		return busMasterModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModifyBusSlave<?>> getBusSlaveModifications() {
		if (busSlaveModifications == null) {
			busSlaveModifications = new EObjectContainmentEList<ModifyBusSlave<?>>(ModifyBusSlave.class, this, modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_SLAVE_MODIFICATIONS);
		}
		return busSlaveModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModifyBusCable<?>> getBusCableModifications() {
		if (busCableModifications == null) {
			busCableModifications = new EObjectContainmentEList<ModifyBusCable<?>>(ModifyBusCable.class, this, modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_CABLE_MODIFICATIONS);
		}
		return busCableModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__SENSOR_MODIFICATIONS:
				return ((InternalEList<?>)getSensorModifications()).basicRemove(otherEnd, msgs);
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__SIGNALINTERFACE_MODIFICATIONS:
				return ((InternalEList<?>)getSignalinterfaceModifications()).basicRemove(otherEnd, msgs);
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__PHYSICAL_CONNECTION_MODIFICATIONS:
				return ((InternalEList<?>)getPhysicalConnectionModifications()).basicRemove(otherEnd, msgs);
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__MICRO_SWITCH_MODULE_MODIFICATIONS:
				return ((InternalEList<?>)getMicroSwitchModuleModifications()).basicRemove(otherEnd, msgs);
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_BOX_MODIFICATIONS:
				return ((InternalEList<?>)getBusBoxModifications()).basicRemove(otherEnd, msgs);
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_MASTER_MODIFICATIONS:
				return ((InternalEList<?>)getBusMasterModifications()).basicRemove(otherEnd, msgs);
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_SLAVE_MODIFICATIONS:
				return ((InternalEList<?>)getBusSlaveModifications()).basicRemove(otherEnd, msgs);
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_CABLE_MODIFICATIONS:
				return ((InternalEList<?>)getBusCableModifications()).basicRemove(otherEnd, msgs);
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
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__SENSOR_MODIFICATIONS:
				return getSensorModifications();
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__SIGNALINTERFACE_MODIFICATIONS:
				return getSignalinterfaceModifications();
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__PHYSICAL_CONNECTION_MODIFICATIONS:
				return getPhysicalConnectionModifications();
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__MICRO_SWITCH_MODULE_MODIFICATIONS:
				return getMicroSwitchModuleModifications();
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_BOX_MODIFICATIONS:
				return getBusBoxModifications();
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_MASTER_MODIFICATIONS:
				return getBusMasterModifications();
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_SLAVE_MODIFICATIONS:
				return getBusSlaveModifications();
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_CABLE_MODIFICATIONS:
				return getBusCableModifications();
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
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__SENSOR_MODIFICATIONS:
				getSensorModifications().clear();
				getSensorModifications().addAll((Collection<? extends ModifySensor<?>>)newValue);
				return;
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__SIGNALINTERFACE_MODIFICATIONS:
				getSignalinterfaceModifications().clear();
				getSignalinterfaceModifications().addAll((Collection<? extends ModifySignalinterface<?>>)newValue);
				return;
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__PHYSICAL_CONNECTION_MODIFICATIONS:
				getPhysicalConnectionModifications().clear();
				getPhysicalConnectionModifications().addAll((Collection<? extends ModifyPhysicalConnection<?>>)newValue);
				return;
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__MICRO_SWITCH_MODULE_MODIFICATIONS:
				getMicroSwitchModuleModifications().clear();
				getMicroSwitchModuleModifications().addAll((Collection<? extends ModifyMicroSwitchModule<?>>)newValue);
				return;
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_BOX_MODIFICATIONS:
				getBusBoxModifications().clear();
				getBusBoxModifications().addAll((Collection<? extends ModifyBusBox<?>>)newValue);
				return;
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_MASTER_MODIFICATIONS:
				getBusMasterModifications().clear();
				getBusMasterModifications().addAll((Collection<? extends ModifyBusMaster<?>>)newValue);
				return;
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_SLAVE_MODIFICATIONS:
				getBusSlaveModifications().clear();
				getBusSlaveModifications().addAll((Collection<? extends ModifyBusSlave<?>>)newValue);
				return;
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_CABLE_MODIFICATIONS:
				getBusCableModifications().clear();
				getBusCableModifications().addAll((Collection<? extends ModifyBusCable<?>>)newValue);
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
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__SENSOR_MODIFICATIONS:
				getSensorModifications().clear();
				return;
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__SIGNALINTERFACE_MODIFICATIONS:
				getSignalinterfaceModifications().clear();
				return;
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__PHYSICAL_CONNECTION_MODIFICATIONS:
				getPhysicalConnectionModifications().clear();
				return;
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__MICRO_SWITCH_MODULE_MODIFICATIONS:
				getMicroSwitchModuleModifications().clear();
				return;
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_BOX_MODIFICATIONS:
				getBusBoxModifications().clear();
				return;
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_MASTER_MODIFICATIONS:
				getBusMasterModifications().clear();
				return;
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_SLAVE_MODIFICATIONS:
				getBusSlaveModifications().clear();
				return;
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_CABLE_MODIFICATIONS:
				getBusCableModifications().clear();
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
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__SENSOR_MODIFICATIONS:
				return sensorModifications != null && !sensorModifications.isEmpty();
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__SIGNALINTERFACE_MODIFICATIONS:
				return signalinterfaceModifications != null && !signalinterfaceModifications.isEmpty();
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__PHYSICAL_CONNECTION_MODIFICATIONS:
				return physicalConnectionModifications != null && !physicalConnectionModifications.isEmpty();
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__MICRO_SWITCH_MODULE_MODIFICATIONS:
				return microSwitchModuleModifications != null && !microSwitchModuleModifications.isEmpty();
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_BOX_MODIFICATIONS:
				return busBoxModifications != null && !busBoxModifications.isEmpty();
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_MASTER_MODIFICATIONS:
				return busMasterModifications != null && !busMasterModifications.isEmpty();
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_SLAVE_MODIFICATIONS:
				return busSlaveModifications != null && !busSlaveModifications.isEmpty();
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_CABLE_MODIFICATIONS:
				return busCableModifications != null && !busCableModifications.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ChangePropagationDueToHardwareChangeImpl
