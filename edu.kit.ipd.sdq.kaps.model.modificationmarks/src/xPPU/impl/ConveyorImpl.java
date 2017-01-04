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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import xPPU.Conveyor;
import xPPU.ConveyorBelt;
import xPPU.Structure;
import xPPU.XPPUPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conveyor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xPPU.impl.ConveyorImpl#getBelts <em>Belts</em>}</li>
 *   <li>{@link xPPU.impl.ConveyorImpl#getParentStructure <em>Parent Structure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConveyorImpl extends EObjectImpl implements Conveyor {
	/**
	 * The cached value of the '{@link #getBelts() <em>Belts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBelts()
	 * @generated
	 * @ordered
	 */
	protected EList<ConveyorBelt> belts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConveyorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XPPUPackage.Literals.CONVEYOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConveyorBelt> getBelts() {
		if (belts == null) {
			belts = new EObjectContainmentWithInverseEList<ConveyorBelt>(ConveyorBelt.class, this, XPPUPackage.CONVEYOR__BELTS, XPPUPackage.CONVEYOR_BELT__MOUNTED_TO);
		}
		return belts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Structure getParentStructure() {
		if (eContainerFeatureID() != XPPUPackage.CONVEYOR__PARENT_STRUCTURE) return null;
		return (Structure)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentStructure(Structure newParentStructure, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentStructure, XPPUPackage.CONVEYOR__PARENT_STRUCTURE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentStructure(Structure newParentStructure) {
		if (newParentStructure != eInternalContainer() || (eContainerFeatureID() != XPPUPackage.CONVEYOR__PARENT_STRUCTURE && newParentStructure != null)) {
			if (EcoreUtil.isAncestor(this, newParentStructure))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentStructure != null)
				msgs = ((InternalEObject)newParentStructure).eInverseAdd(this, XPPUPackage.STRUCTURE__CONVEYOR, Structure.class, msgs);
			msgs = basicSetParentStructure(newParentStructure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XPPUPackage.CONVEYOR__PARENT_STRUCTURE, newParentStructure, newParentStructure));
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
			case XPPUPackage.CONVEYOR__BELTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBelts()).basicAdd(otherEnd, msgs);
			case XPPUPackage.CONVEYOR__PARENT_STRUCTURE:
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
			case XPPUPackage.CONVEYOR__BELTS:
				return ((InternalEList<?>)getBelts()).basicRemove(otherEnd, msgs);
			case XPPUPackage.CONVEYOR__PARENT_STRUCTURE:
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
			case XPPUPackage.CONVEYOR__PARENT_STRUCTURE:
				return eInternalContainer().eInverseRemove(this, XPPUPackage.STRUCTURE__CONVEYOR, Structure.class, msgs);
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
			case XPPUPackage.CONVEYOR__BELTS:
				return getBelts();
			case XPPUPackage.CONVEYOR__PARENT_STRUCTURE:
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
			case XPPUPackage.CONVEYOR__BELTS:
				getBelts().clear();
				getBelts().addAll((Collection<? extends ConveyorBelt>)newValue);
				return;
			case XPPUPackage.CONVEYOR__PARENT_STRUCTURE:
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
			case XPPUPackage.CONVEYOR__BELTS:
				getBelts().clear();
				return;
			case XPPUPackage.CONVEYOR__PARENT_STRUCTURE:
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
			case XPPUPackage.CONVEYOR__BELTS:
				return belts != null && !belts.isEmpty();
			case XPPUPackage.CONVEYOR__PARENT_STRUCTURE:
				return getParentStructure() != null;
		}
		return super.eIsSet(featureID);
	}

} //ConveyorImpl
