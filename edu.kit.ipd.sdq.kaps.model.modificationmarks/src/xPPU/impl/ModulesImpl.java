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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import xPPU.Modules;
import xPPU.MotorModule;
import xPPU.PusherModule;
import xPPU.RampModule;
import xPPU.SensorModule;
import xPPU.Structure;
import xPPU.XPPUPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modules</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xPPU.impl.ModulesImpl#getModules <em>Modules</em>}</li>
 *   <li>{@link xPPU.impl.ModulesImpl#getRampmodules <em>Rampmodules</em>}</li>
 *   <li>{@link xPPU.impl.ModulesImpl#getPushermodules <em>Pushermodules</em>}</li>
 *   <li>{@link xPPU.impl.ModulesImpl#getMotormodules <em>Motormodules</em>}</li>
 *   <li>{@link xPPU.impl.ModulesImpl#getSensormodules <em>Sensormodules</em>}</li>
 *   <li>{@link xPPU.impl.ModulesImpl#getParentStructure <em>Parent Structure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModulesImpl extends EObjectImpl implements Modules {
	/**
	 * The cached value of the '{@link #getModules() <em>Modules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModules()
	 * @generated
	 * @ordered
	 */
	protected EList<Modules> modules;

	/**
	 * The cached value of the '{@link #getRampmodules() <em>Rampmodules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRampmodules()
	 * @generated
	 * @ordered
	 */
	protected EList<RampModule> rampmodules;

	/**
	 * The cached value of the '{@link #getPushermodules() <em>Pushermodules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPushermodules()
	 * @generated
	 * @ordered
	 */
	protected EList<PusherModule> pushermodules;

	/**
	 * The cached value of the '{@link #getMotormodules() <em>Motormodules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotormodules()
	 * @generated
	 * @ordered
	 */
	protected EList<MotorModule> motormodules;

	/**
	 * The cached value of the '{@link #getSensormodules() <em>Sensormodules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensormodules()
	 * @generated
	 * @ordered
	 */
	protected EList<SensorModule> sensormodules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModulesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XPPUPackage.Literals.MODULES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Modules> getModules() {
		if (modules == null) {
			modules = new EObjectResolvingEList<Modules>(Modules.class, this, XPPUPackage.MODULES__MODULES);
		}
		return modules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RampModule> getRampmodules() {
		if (rampmodules == null) {
			rampmodules = new EObjectContainmentWithInverseEList<RampModule>(RampModule.class, this, XPPUPackage.MODULES__RAMPMODULES, XPPUPackage.RAMP_MODULE__PARENT_MODULE_CONTAINER);
		}
		return rampmodules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PusherModule> getPushermodules() {
		if (pushermodules == null) {
			pushermodules = new EObjectContainmentWithInverseEList<PusherModule>(PusherModule.class, this, XPPUPackage.MODULES__PUSHERMODULES, XPPUPackage.PUSHER_MODULE__PARENT_MODULE_CONTAINER);
		}
		return pushermodules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MotorModule> getMotormodules() {
		if (motormodules == null) {
			motormodules = new EObjectContainmentWithInverseEList<MotorModule>(MotorModule.class, this, XPPUPackage.MODULES__MOTORMODULES, XPPUPackage.MOTOR_MODULE__PARENT_MODULE_CONTAINER);
		}
		return motormodules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SensorModule> getSensormodules() {
		if (sensormodules == null) {
			sensormodules = new EObjectContainmentWithInverseEList<SensorModule>(SensorModule.class, this, XPPUPackage.MODULES__SENSORMODULES, XPPUPackage.SENSOR_MODULE__PARENT_MODULE_CONTAINER);
		}
		return sensormodules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Structure getParentStructure() {
		if (eContainerFeatureID() != XPPUPackage.MODULES__PARENT_STRUCTURE) return null;
		return (Structure)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentStructure(Structure newParentStructure, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentStructure, XPPUPackage.MODULES__PARENT_STRUCTURE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentStructure(Structure newParentStructure) {
		if (newParentStructure != eInternalContainer() || (eContainerFeatureID() != XPPUPackage.MODULES__PARENT_STRUCTURE && newParentStructure != null)) {
			if (EcoreUtil.isAncestor(this, newParentStructure))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentStructure != null)
				msgs = ((InternalEObject)newParentStructure).eInverseAdd(this, XPPUPackage.STRUCTURE__MODULES, Structure.class, msgs);
			msgs = basicSetParentStructure(newParentStructure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XPPUPackage.MODULES__PARENT_STRUCTURE, newParentStructure, newParentStructure));
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
			case XPPUPackage.MODULES__RAMPMODULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRampmodules()).basicAdd(otherEnd, msgs);
			case XPPUPackage.MODULES__PUSHERMODULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPushermodules()).basicAdd(otherEnd, msgs);
			case XPPUPackage.MODULES__MOTORMODULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMotormodules()).basicAdd(otherEnd, msgs);
			case XPPUPackage.MODULES__SENSORMODULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSensormodules()).basicAdd(otherEnd, msgs);
			case XPPUPackage.MODULES__PARENT_STRUCTURE:
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
			case XPPUPackage.MODULES__RAMPMODULES:
				return ((InternalEList<?>)getRampmodules()).basicRemove(otherEnd, msgs);
			case XPPUPackage.MODULES__PUSHERMODULES:
				return ((InternalEList<?>)getPushermodules()).basicRemove(otherEnd, msgs);
			case XPPUPackage.MODULES__MOTORMODULES:
				return ((InternalEList<?>)getMotormodules()).basicRemove(otherEnd, msgs);
			case XPPUPackage.MODULES__SENSORMODULES:
				return ((InternalEList<?>)getSensormodules()).basicRemove(otherEnd, msgs);
			case XPPUPackage.MODULES__PARENT_STRUCTURE:
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
			case XPPUPackage.MODULES__PARENT_STRUCTURE:
				return eInternalContainer().eInverseRemove(this, XPPUPackage.STRUCTURE__MODULES, Structure.class, msgs);
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
			case XPPUPackage.MODULES__MODULES:
				return getModules();
			case XPPUPackage.MODULES__RAMPMODULES:
				return getRampmodules();
			case XPPUPackage.MODULES__PUSHERMODULES:
				return getPushermodules();
			case XPPUPackage.MODULES__MOTORMODULES:
				return getMotormodules();
			case XPPUPackage.MODULES__SENSORMODULES:
				return getSensormodules();
			case XPPUPackage.MODULES__PARENT_STRUCTURE:
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
			case XPPUPackage.MODULES__MODULES:
				getModules().clear();
				getModules().addAll((Collection<? extends Modules>)newValue);
				return;
			case XPPUPackage.MODULES__RAMPMODULES:
				getRampmodules().clear();
				getRampmodules().addAll((Collection<? extends RampModule>)newValue);
				return;
			case XPPUPackage.MODULES__PUSHERMODULES:
				getPushermodules().clear();
				getPushermodules().addAll((Collection<? extends PusherModule>)newValue);
				return;
			case XPPUPackage.MODULES__MOTORMODULES:
				getMotormodules().clear();
				getMotormodules().addAll((Collection<? extends MotorModule>)newValue);
				return;
			case XPPUPackage.MODULES__SENSORMODULES:
				getSensormodules().clear();
				getSensormodules().addAll((Collection<? extends SensorModule>)newValue);
				return;
			case XPPUPackage.MODULES__PARENT_STRUCTURE:
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
			case XPPUPackage.MODULES__MODULES:
				getModules().clear();
				return;
			case XPPUPackage.MODULES__RAMPMODULES:
				getRampmodules().clear();
				return;
			case XPPUPackage.MODULES__PUSHERMODULES:
				getPushermodules().clear();
				return;
			case XPPUPackage.MODULES__MOTORMODULES:
				getMotormodules().clear();
				return;
			case XPPUPackage.MODULES__SENSORMODULES:
				getSensormodules().clear();
				return;
			case XPPUPackage.MODULES__PARENT_STRUCTURE:
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
			case XPPUPackage.MODULES__MODULES:
				return modules != null && !modules.isEmpty();
			case XPPUPackage.MODULES__RAMPMODULES:
				return rampmodules != null && !rampmodules.isEmpty();
			case XPPUPackage.MODULES__PUSHERMODULES:
				return pushermodules != null && !pushermodules.isEmpty();
			case XPPUPackage.MODULES__MOTORMODULES:
				return motormodules != null && !motormodules.isEmpty();
			case XPPUPackage.MODULES__SENSORMODULES:
				return sensormodules != null && !sensormodules.isEmpty();
			case XPPUPackage.MODULES__PARENT_STRUCTURE:
				return getParentStructure() != null;
		}
		return super.eIsSet(featureID);
	}

} //ModulesImpl
