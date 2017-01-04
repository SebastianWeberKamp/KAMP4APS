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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import xPPU.Arm;
import xPPU.Crane;
import xPPU.Structure;
import xPPU.TurningTable;
import xPPU.VacuumGripper;
import xPPU.XPPUPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Crane</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xPPU.impl.CraneImpl#getArm <em>Arm</em>}</li>
 *   <li>{@link xPPU.impl.CraneImpl#getMountedOn <em>Mounted On</em>}</li>
 *   <li>{@link xPPU.impl.CraneImpl#getVacuumgripper <em>Vacuumgripper</em>}</li>
 *   <li>{@link xPPU.impl.CraneImpl#getParentStructure <em>Parent Structure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CraneImpl extends EObjectImpl implements Crane {
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
	 * The cached value of the '{@link #getMountedOn() <em>Mounted On</em>}' reference list.
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
		return XPPUPackage.Literals.CRANE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arm> getArm() {
		if (arm == null) {
			arm = new EObjectWithInverseResolvingEList<Arm>(Arm.class, this, XPPUPackage.CRANE__ARM, XPPUPackage.ARM__MOUNTED_TO);
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
			mountedOn = new EObjectWithInverseResolvingEList<TurningTable>(TurningTable.class, this, XPPUPackage.CRANE__MOUNTED_ON, XPPUPackage.TURNING_TABLE__MOUNTS);
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
			vacuumgripper = new EObjectWithInverseResolvingEList<VacuumGripper>(VacuumGripper.class, this, XPPUPackage.CRANE__VACUUMGRIPPER, XPPUPackage.VACUUM_GRIPPER__MOUNTED_TO);
		}
		return vacuumgripper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Structure getParentStructure() {
		if (eContainerFeatureID() != XPPUPackage.CRANE__PARENT_STRUCTURE) return null;
		return (Structure)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentStructure(Structure newParentStructure, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentStructure, XPPUPackage.CRANE__PARENT_STRUCTURE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentStructure(Structure newParentStructure) {
		if (newParentStructure != eInternalContainer() || (eContainerFeatureID() != XPPUPackage.CRANE__PARENT_STRUCTURE && newParentStructure != null)) {
			if (EcoreUtil.isAncestor(this, newParentStructure))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentStructure != null)
				msgs = ((InternalEObject)newParentStructure).eInverseAdd(this, XPPUPackage.STRUCTURE__CRANES, Structure.class, msgs);
			msgs = basicSetParentStructure(newParentStructure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XPPUPackage.CRANE__PARENT_STRUCTURE, newParentStructure, newParentStructure));
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
			case XPPUPackage.CRANE__ARM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getArm()).basicAdd(otherEnd, msgs);
			case XPPUPackage.CRANE__MOUNTED_ON:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMountedOn()).basicAdd(otherEnd, msgs);
			case XPPUPackage.CRANE__VACUUMGRIPPER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVacuumgripper()).basicAdd(otherEnd, msgs);
			case XPPUPackage.CRANE__PARENT_STRUCTURE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentStructure((Structure)otherEnd, msgs);
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
			case XPPUPackage.CRANE__ARM:
				return ((InternalEList<?>)getArm()).basicRemove(otherEnd, msgs);
			case XPPUPackage.CRANE__MOUNTED_ON:
				return ((InternalEList<?>)getMountedOn()).basicRemove(otherEnd, msgs);
			case XPPUPackage.CRANE__VACUUMGRIPPER:
				return ((InternalEList<?>)getVacuumgripper()).basicRemove(otherEnd, msgs);
			case XPPUPackage.CRANE__PARENT_STRUCTURE:
				return basicSetParentStructure(null, msgs);
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
			case XPPUPackage.CRANE__PARENT_STRUCTURE:
				return eInternalContainer().eInverseRemove(this, XPPUPackage.STRUCTURE__CRANES, Structure.class, msgs);
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
			case XPPUPackage.CRANE__ARM:
				return getArm();
			case XPPUPackage.CRANE__MOUNTED_ON:
				return getMountedOn();
			case XPPUPackage.CRANE__VACUUMGRIPPER:
				return getVacuumgripper();
			case XPPUPackage.CRANE__PARENT_STRUCTURE:
				return getParentStructure();
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
			case XPPUPackage.CRANE__ARM:
				getArm().clear();
				getArm().addAll((Collection<? extends Arm>)newValue);
				return;
			case XPPUPackage.CRANE__MOUNTED_ON:
				getMountedOn().clear();
				getMountedOn().addAll((Collection<? extends TurningTable>)newValue);
				return;
			case XPPUPackage.CRANE__VACUUMGRIPPER:
				getVacuumgripper().clear();
				getVacuumgripper().addAll((Collection<? extends VacuumGripper>)newValue);
				return;
			case XPPUPackage.CRANE__PARENT_STRUCTURE:
				setParentStructure((Structure)newValue);
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
			case XPPUPackage.CRANE__ARM:
				getArm().clear();
				return;
			case XPPUPackage.CRANE__MOUNTED_ON:
				getMountedOn().clear();
				return;
			case XPPUPackage.CRANE__VACUUMGRIPPER:
				getVacuumgripper().clear();
				return;
			case XPPUPackage.CRANE__PARENT_STRUCTURE:
				setParentStructure((Structure)null);
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
			case XPPUPackage.CRANE__ARM:
				return arm != null && !arm.isEmpty();
			case XPPUPackage.CRANE__MOUNTED_ON:
				return mountedOn != null && !mountedOn.isEmpty();
			case XPPUPackage.CRANE__VACUUMGRIPPER:
				return vacuumgripper != null && !vacuumgripper.isEmpty();
			case XPPUPackage.CRANE__PARENT_STRUCTURE:
				return getParentStructure() != null;
		}
		return super.eIsSet(featureID);
	}

} //CraneImpl
