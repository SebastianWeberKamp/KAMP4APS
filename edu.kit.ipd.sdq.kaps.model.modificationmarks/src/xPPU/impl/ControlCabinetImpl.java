/**
 */
package xPPU.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import xPPU.ControlCabinet;
import xPPU.Controller;
import xPPU.Structure;
import xPPU.XPPUPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Cabinet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xPPU.impl.ControlCabinetImpl#getParentStructure <em>Parent Structure</em>}</li>
 *   <li>{@link xPPU.impl.ControlCabinetImpl#getController <em>Controller</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlCabinetImpl extends EObjectImpl implements ControlCabinet {
	/**
	 * The cached value of the '{@link #getParentStructure() <em>Parent Structure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentStructure()
	 * @generated
	 * @ordered
	 */
	protected Structure parentStructure;

	/**
	 * The cached value of the '{@link #getController() <em>Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getController()
	 * @generated
	 * @ordered
	 */
	protected Controller controller;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlCabinetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XPPUPackage.Literals.CONTROL_CABINET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Structure getParentStructure() {
		if (parentStructure != null && parentStructure.eIsProxy()) {
			InternalEObject oldParentStructure = (InternalEObject)parentStructure;
			parentStructure = (Structure)eResolveProxy(oldParentStructure);
			if (parentStructure != oldParentStructure) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XPPUPackage.CONTROL_CABINET__PARENT_STRUCTURE, oldParentStructure, parentStructure));
			}
		}
		return parentStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Structure basicGetParentStructure() {
		return parentStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentStructure(Structure newParentStructure) {
		Structure oldParentStructure = parentStructure;
		parentStructure = newParentStructure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XPPUPackage.CONTROL_CABINET__PARENT_STRUCTURE, oldParentStructure, parentStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controller getController() {
		if (controller != null && controller.eIsProxy()) {
			InternalEObject oldController = (InternalEObject)controller;
			controller = (Controller)eResolveProxy(oldController);
			if (controller != oldController) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XPPUPackage.CONTROL_CABINET__CONTROLLER, oldController, controller));
			}
		}
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controller basicGetController() {
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetController(Controller newController, NotificationChain msgs) {
		Controller oldController = controller;
		controller = newController;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPPUPackage.CONTROL_CABINET__CONTROLLER, oldController, newController);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setController(Controller newController) {
		if (newController != controller) {
			NotificationChain msgs = null;
			if (controller != null)
				msgs = ((InternalEObject)controller).eInverseRemove(this, XPPUPackage.CONTROLLER__CONTROLLER_OF, Controller.class, msgs);
			if (newController != null)
				msgs = ((InternalEObject)newController).eInverseAdd(this, XPPUPackage.CONTROLLER__CONTROLLER_OF, Controller.class, msgs);
			msgs = basicSetController(newController, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XPPUPackage.CONTROL_CABINET__CONTROLLER, newController, newController));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XPPUPackage.CONTROL_CABINET__CONTROLLER:
				if (controller != null)
					msgs = ((InternalEObject)controller).eInverseRemove(this, XPPUPackage.CONTROLLER__CONTROLLER_OF, Controller.class, msgs);
				return basicSetController((Controller)otherEnd, msgs);
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
			case XPPUPackage.CONTROL_CABINET__CONTROLLER:
				return basicSetController(null, msgs);
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
			case XPPUPackage.CONTROL_CABINET__PARENT_STRUCTURE:
				if (resolve) return getParentStructure();
				return basicGetParentStructure();
			case XPPUPackage.CONTROL_CABINET__CONTROLLER:
				if (resolve) return getController();
				return basicGetController();
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
			case XPPUPackage.CONTROL_CABINET__PARENT_STRUCTURE:
				setParentStructure((Structure)newValue);
				return;
			case XPPUPackage.CONTROL_CABINET__CONTROLLER:
				setController((Controller)newValue);
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
			case XPPUPackage.CONTROL_CABINET__PARENT_STRUCTURE:
				setParentStructure((Structure)null);
				return;
			case XPPUPackage.CONTROL_CABINET__CONTROLLER:
				setController((Controller)null);
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
			case XPPUPackage.CONTROL_CABINET__PARENT_STRUCTURE:
				return parentStructure != null;
			case XPPUPackage.CONTROL_CABINET__CONTROLLER:
				return controller != null;
		}
		return super.eIsSet(featureID);
	}

} //ControlCabinetImpl
