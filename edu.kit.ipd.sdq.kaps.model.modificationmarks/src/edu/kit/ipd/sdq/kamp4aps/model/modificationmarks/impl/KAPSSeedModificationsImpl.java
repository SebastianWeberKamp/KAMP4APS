/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.impl;

import edu.kit.ipd.sdq.amp.model.modificationmarks.impl.AbstractSeedModificationsImpl;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.KAPSSeedModifications;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyBusBox;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyBusMaster;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyBusSlave;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyMicroSwitchModule;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifySensor;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.modificationmarksPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>KAPS Seed Modifications</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.impl.KAPSSeedModificationsImpl#getBusBoxModifications <em>Bus Box Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.impl.KAPSSeedModificationsImpl#getSensorModifications <em>Sensor Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.impl.KAPSSeedModificationsImpl#getBusMasterModifications <em>Bus Master Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.impl.KAPSSeedModificationsImpl#getBusSlaveModifications <em>Bus Slave Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.impl.KAPSSeedModificationsImpl#getMicroswitchModuleModifications <em>Microswitch Module Modifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KAPSSeedModificationsImpl extends AbstractSeedModificationsImpl implements KAPSSeedModifications {
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
	 * The cached value of the '{@link #getSensorModifications() <em>Sensor Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<ModifySensor<?>> sensorModifications;

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
	 * The cached value of the '{@link #getMicroswitchModuleModifications() <em>Microswitch Module Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMicroswitchModuleModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<ModifyMicroSwitchModule<?>> microswitchModuleModifications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KAPSSeedModificationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return modificationmarksPackage.Literals.KAPS_SEED_MODIFICATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModifyBusBox<?>> getBusBoxModifications() {
		if (busBoxModifications == null) {
			busBoxModifications = new EObjectContainmentEList<ModifyBusBox<?>>(ModifyBusBox.class, this, modificationmarksPackage.KAPS_SEED_MODIFICATIONS__BUS_BOX_MODIFICATIONS);
		}
		return busBoxModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModifySensor<?>> getSensorModifications() {
		if (sensorModifications == null) {
			sensorModifications = new EObjectContainmentEList<ModifySensor<?>>(ModifySensor.class, this, modificationmarksPackage.KAPS_SEED_MODIFICATIONS__SENSOR_MODIFICATIONS);
		}
		return sensorModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModifyBusMaster<?>> getBusMasterModifications() {
		if (busMasterModifications == null) {
			busMasterModifications = new EObjectContainmentEList<ModifyBusMaster<?>>(ModifyBusMaster.class, this, modificationmarksPackage.KAPS_SEED_MODIFICATIONS__BUS_MASTER_MODIFICATIONS);
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
			busSlaveModifications = new EObjectContainmentEList<ModifyBusSlave<?>>(ModifyBusSlave.class, this, modificationmarksPackage.KAPS_SEED_MODIFICATIONS__BUS_SLAVE_MODIFICATIONS);
		}
		return busSlaveModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModifyMicroSwitchModule<?>> getMicroswitchModuleModifications() {
		if (microswitchModuleModifications == null) {
			microswitchModuleModifications = new EObjectContainmentEList<ModifyMicroSwitchModule<?>>(ModifyMicroSwitchModule.class, this, modificationmarksPackage.KAPS_SEED_MODIFICATIONS__MICROSWITCH_MODULE_MODIFICATIONS);
		}
		return microswitchModuleModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case modificationmarksPackage.KAPS_SEED_MODIFICATIONS__BUS_BOX_MODIFICATIONS:
				return ((InternalEList<?>)getBusBoxModifications()).basicRemove(otherEnd, msgs);
			case modificationmarksPackage.KAPS_SEED_MODIFICATIONS__SENSOR_MODIFICATIONS:
				return ((InternalEList<?>)getSensorModifications()).basicRemove(otherEnd, msgs);
			case modificationmarksPackage.KAPS_SEED_MODIFICATIONS__BUS_MASTER_MODIFICATIONS:
				return ((InternalEList<?>)getBusMasterModifications()).basicRemove(otherEnd, msgs);
			case modificationmarksPackage.KAPS_SEED_MODIFICATIONS__BUS_SLAVE_MODIFICATIONS:
				return ((InternalEList<?>)getBusSlaveModifications()).basicRemove(otherEnd, msgs);
			case modificationmarksPackage.KAPS_SEED_MODIFICATIONS__MICROSWITCH_MODULE_MODIFICATIONS:
				return ((InternalEList<?>)getMicroswitchModuleModifications()).basicRemove(otherEnd, msgs);
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
			case modificationmarksPackage.KAPS_SEED_MODIFICATIONS__BUS_BOX_MODIFICATIONS:
				return getBusBoxModifications();
			case modificationmarksPackage.KAPS_SEED_MODIFICATIONS__SENSOR_MODIFICATIONS:
				return getSensorModifications();
			case modificationmarksPackage.KAPS_SEED_MODIFICATIONS__BUS_MASTER_MODIFICATIONS:
				return getBusMasterModifications();
			case modificationmarksPackage.KAPS_SEED_MODIFICATIONS__BUS_SLAVE_MODIFICATIONS:
				return getBusSlaveModifications();
			case modificationmarksPackage.KAPS_SEED_MODIFICATIONS__MICROSWITCH_MODULE_MODIFICATIONS:
				return getMicroswitchModuleModifications();
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
			case modificationmarksPackage.KAPS_SEED_MODIFICATIONS__BUS_BOX_MODIFICATIONS:
				getBusBoxModifications().clear();
				getBusBoxModifications().addAll((Collection<? extends ModifyBusBox<?>>)newValue);
				return;
			case modificationmarksPackage.KAPS_SEED_MODIFICATIONS__SENSOR_MODIFICATIONS:
				getSensorModifications().clear();
				getSensorModifications().addAll((Collection<? extends ModifySensor<?>>)newValue);
				return;
			case modificationmarksPackage.KAPS_SEED_MODIFICATIONS__BUS_MASTER_MODIFICATIONS:
				getBusMasterModifications().clear();
				getBusMasterModifications().addAll((Collection<? extends ModifyBusMaster<?>>)newValue);
				return;
			case modificationmarksPackage.KAPS_SEED_MODIFICATIONS__BUS_SLAVE_MODIFICATIONS:
				getBusSlaveModifications().clear();
				getBusSlaveModifications().addAll((Collection<? extends ModifyBusSlave<?>>)newValue);
				return;
			case modificationmarksPackage.KAPS_SEED_MODIFICATIONS__MICROSWITCH_MODULE_MODIFICATIONS:
				getMicroswitchModuleModifications().clear();
				getMicroswitchModuleModifications().addAll((Collection<? extends ModifyMicroSwitchModule<?>>)newValue);
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
			case modificationmarksPackage.KAPS_SEED_MODIFICATIONS__BUS_BOX_MODIFICATIONS:
				getBusBoxModifications().clear();
				return;
			case modificationmarksPackage.KAPS_SEED_MODIFICATIONS__SENSOR_MODIFICATIONS:
				getSensorModifications().clear();
				return;
			case modificationmarksPackage.KAPS_SEED_MODIFICATIONS__BUS_MASTER_MODIFICATIONS:
				getBusMasterModifications().clear();
				return;
			case modificationmarksPackage.KAPS_SEED_MODIFICATIONS__BUS_SLAVE_MODIFICATIONS:
				getBusSlaveModifications().clear();
				return;
			case modificationmarksPackage.KAPS_SEED_MODIFICATIONS__MICROSWITCH_MODULE_MODIFICATIONS:
				getMicroswitchModuleModifications().clear();
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
			case modificationmarksPackage.KAPS_SEED_MODIFICATIONS__BUS_BOX_MODIFICATIONS:
				return busBoxModifications != null && !busBoxModifications.isEmpty();
			case modificationmarksPackage.KAPS_SEED_MODIFICATIONS__SENSOR_MODIFICATIONS:
				return sensorModifications != null && !sensorModifications.isEmpty();
			case modificationmarksPackage.KAPS_SEED_MODIFICATIONS__BUS_MASTER_MODIFICATIONS:
				return busMasterModifications != null && !busMasterModifications.isEmpty();
			case modificationmarksPackage.KAPS_SEED_MODIFICATIONS__BUS_SLAVE_MODIFICATIONS:
				return busSlaveModifications != null && !busSlaveModifications.isEmpty();
			case modificationmarksPackage.KAPS_SEED_MODIFICATIONS__MICROSWITCH_MODULE_MODIFICATIONS:
				return microswitchModuleModifications != null && !microswitchModuleModifications.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //KAPSSeedModificationsImpl
