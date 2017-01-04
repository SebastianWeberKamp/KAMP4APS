/**
 */
package xPPU;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPPU.Controller#getSignalinterface <em>Signalinterface</em>}</li>
 *   <li>{@link xPPU.Controller#getPowersupply <em>Powersupply</em>}</li>
 *   <li>{@link xPPU.Controller#getControllerOf <em>Controller Of</em>}</li>
 * </ul>
 *
 * @see xPPU.XPPUPackage#getController()
 * @model
 * @generated
 */
public interface Controller extends EObject {
	/**
	 * Returns the value of the '<em><b>Signalinterface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signalinterface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signalinterface</em>' reference.
	 * @see #setSignalinterface(SignalInterface)
	 * @see xPPU.XPPUPackage#getController_Signalinterface()
	 * @model required="true"
	 * @generated
	 */
	SignalInterface getSignalinterface();

	/**
	 * Sets the value of the '{@link xPPU.Controller#getSignalinterface <em>Signalinterface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signalinterface</em>' reference.
	 * @see #getSignalinterface()
	 * @generated
	 */
	void setSignalinterface(SignalInterface value);

	/**
	 * Returns the value of the '<em><b>Powersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Powersupply</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Powersupply</em>' reference.
	 * @see #setPowersupply(PowerSupply)
	 * @see xPPU.XPPUPackage#getController_Powersupply()
	 * @model required="true"
	 * @generated
	 */
	PowerSupply getPowersupply();

	/**
	 * Sets the value of the '{@link xPPU.Controller#getPowersupply <em>Powersupply</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Powersupply</em>' reference.
	 * @see #getPowersupply()
	 * @generated
	 */
	void setPowersupply(PowerSupply value);

	/**
	 * Returns the value of the '<em><b>Controller Of</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link xPPU.ControlCabinet#getController <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controller Of</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller Of</em>' reference.
	 * @see #setControllerOf(ControlCabinet)
	 * @see xPPU.XPPUPackage#getController_ControllerOf()
	 * @see xPPU.ControlCabinet#getController
	 * @model opposite="controller" required="true"
	 * @generated
	 */
	ControlCabinet getControllerOf();

	/**
	 * Sets the value of the '{@link xPPU.Controller#getControllerOf <em>Controller Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controller Of</em>' reference.
	 * @see #getControllerOf()
	 * @generated
	 */
	void setControllerOf(ControlCabinet value);

} // Controller
