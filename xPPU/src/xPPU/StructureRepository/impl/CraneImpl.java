/**
 */
package xPPU.StructureRepository.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import xPPU.ComponentRepository.Arm;
import xPPU.ComponentRepository.ComponentRepositoryPackage;
import xPPU.ComponentRepository.TurningTable;
import xPPU.ComponentRepository.VacuumGripper;

import xPPU.StructureRepository.Crane;
import xPPU.StructureRepository.StructureRepositoryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Crane</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xPPU.StructureRepository.impl.CraneImpl#getArm <em>Arm</em>}</li>
 *   <li>{@link xPPU.StructureRepository.impl.CraneImpl#getMountedOn <em>Mounted On</em>}</li>
 *   <li>{@link xPPU.StructureRepository.impl.CraneImpl#getVacuumgripper <em>Vacuumgripper</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CraneImpl extends StructureImpl implements Crane {
	/**
	 * The cached value of the '{@link #getArm() <em>Arm</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArm()
	 * @generated
	 * @ordered
	 */
	protected EList<Arm> arm;

	/**
	 * The cached value of the '{@link #getMountedOn() <em>Mounted On</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMountedOn()
	 * @generated
	 * @ordered
	 */
	protected EList<TurningTable> mountedOn;

	/**
	 * The cached value of the '{@link #getVacuumgripper() <em>Vacuumgripper</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVacuumgripper()
	 * @generated
	 * @ordered
	 */
	protected EList<VacuumGripper> vacuumgripper;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CraneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructureRepositoryPackage.Literals.CRANE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arm> getArm() {
		if (arm == null) {
			arm = new EObjectWithInverseResolvingEList<Arm>(Arm.class, this, StructureRepositoryPackage.CRANE__ARM, ComponentRepositoryPackage.ARM__MOUNTED_TO);
		}
		return arm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TurningTable> getMountedOn() {
		if (mountedOn == null) {
			mountedOn = new EObjectContainmentEList<TurningTable>(TurningTable.class, this, StructureRepositoryPackage.CRANE__MOUNTED_ON);
		}
		return mountedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VacuumGripper> getVacuumgripper() {
		if (vacuumgripper == null) {
			vacuumgripper = new EObjectWithInverseResolvingEList<VacuumGripper>(VacuumGripper.class, this, StructureRepositoryPackage.CRANE__VACUUMGRIPPER, ComponentRepositoryPackage.VACUUM_GRIPPER__MOUNTED_TO);
		}
		return vacuumgripper;
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
			case StructureRepositoryPackage.CRANE__ARM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getArm()).basicAdd(otherEnd, msgs);
			case StructureRepositoryPackage.CRANE__VACUUMGRIPPER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVacuumgripper()).basicAdd(otherEnd, msgs);
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
			case StructureRepositoryPackage.CRANE__ARM:
				return ((InternalEList<?>)getArm()).basicRemove(otherEnd, msgs);
			case StructureRepositoryPackage.CRANE__MOUNTED_ON:
				return ((InternalEList<?>)getMountedOn()).basicRemove(otherEnd, msgs);
			case StructureRepositoryPackage.CRANE__VACUUMGRIPPER:
				return ((InternalEList<?>)getVacuumgripper()).basicRemove(otherEnd, msgs);
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
			case StructureRepositoryPackage.CRANE__ARM:
				return getArm();
			case StructureRepositoryPackage.CRANE__MOUNTED_ON:
				return getMountedOn();
			case StructureRepositoryPackage.CRANE__VACUUMGRIPPER:
				return getVacuumgripper();
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
			case StructureRepositoryPackage.CRANE__ARM:
				getArm().clear();
				getArm().addAll((Collection<? extends Arm>)newValue);
				return;
			case StructureRepositoryPackage.CRANE__MOUNTED_ON:
				getMountedOn().clear();
				getMountedOn().addAll((Collection<? extends TurningTable>)newValue);
				return;
			case StructureRepositoryPackage.CRANE__VACUUMGRIPPER:
				getVacuumgripper().clear();
				getVacuumgripper().addAll((Collection<? extends VacuumGripper>)newValue);
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
			case StructureRepositoryPackage.CRANE__ARM:
				getArm().clear();
				return;
			case StructureRepositoryPackage.CRANE__MOUNTED_ON:
				getMountedOn().clear();
				return;
			case StructureRepositoryPackage.CRANE__VACUUMGRIPPER:
				getVacuumgripper().clear();
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
			case StructureRepositoryPackage.CRANE__ARM:
				return arm != null && !arm.isEmpty();
			case StructureRepositoryPackage.CRANE__MOUNTED_ON:
				return mountedOn != null && !mountedOn.isEmpty();
			case StructureRepositoryPackage.CRANE__VACUUMGRIPPER:
				return vacuumgripper != null && !vacuumgripper.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CraneImpl
