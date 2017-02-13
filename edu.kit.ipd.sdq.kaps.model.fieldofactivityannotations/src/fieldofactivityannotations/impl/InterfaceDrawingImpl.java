/**
 */
package fieldofactivityannotations.impl;

import fieldofactivityannotations.FieldofactivityannotationsPackage;
import fieldofactivityannotations.InterfaceDrawing;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import xPPU.InterfaceRepository.Interface;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Drawing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fieldofactivityannotations.impl.InterfaceDrawingImpl#getDrawn_interface <em>Drawn interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceDrawingImpl extends DrawingImpl implements InterfaceDrawing {
	/**
	 * The cached value of the '{@link #getDrawn_interface() <em>Drawn interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrawn_interface()
	 * @generated
	 * @ordered
	 */
	protected Interface drawn_interface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceDrawingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FieldofactivityannotationsPackage.Literals.INTERFACE_DRAWING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getDrawn_interface() {
		if (drawn_interface != null && drawn_interface.eIsProxy()) {
			InternalEObject oldDrawn_interface = (InternalEObject)drawn_interface;
			drawn_interface = (Interface)eResolveProxy(oldDrawn_interface);
			if (drawn_interface != oldDrawn_interface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FieldofactivityannotationsPackage.INTERFACE_DRAWING__DRAWN_INTERFACE, oldDrawn_interface, drawn_interface));
			}
		}
		return drawn_interface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface basicGetDrawn_interface() {
		return drawn_interface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDrawn_interface(Interface newDrawn_interface) {
		Interface oldDrawn_interface = drawn_interface;
		drawn_interface = newDrawn_interface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FieldofactivityannotationsPackage.INTERFACE_DRAWING__DRAWN_INTERFACE, oldDrawn_interface, drawn_interface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FieldofactivityannotationsPackage.INTERFACE_DRAWING__DRAWN_INTERFACE:
				if (resolve) return getDrawn_interface();
				return basicGetDrawn_interface();
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
			case FieldofactivityannotationsPackage.INTERFACE_DRAWING__DRAWN_INTERFACE:
				setDrawn_interface((Interface)newValue);
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
			case FieldofactivityannotationsPackage.INTERFACE_DRAWING__DRAWN_INTERFACE:
				setDrawn_interface((Interface)null);
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
			case FieldofactivityannotationsPackage.INTERFACE_DRAWING__DRAWN_INTERFACE:
				return drawn_interface != null;
		}
		return super.eIsSet(featureID);
	}

} //InterfaceDrawingImpl
