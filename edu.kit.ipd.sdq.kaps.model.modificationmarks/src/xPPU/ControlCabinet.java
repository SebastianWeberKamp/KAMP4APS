/**
 */
package xPPU;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Cabinet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPPU.ControlCabinet#getParentStructure <em>Parent Structure</em>}</li>
 *   <li>{@link xPPU.ControlCabinet#getController <em>Controller</em>}</li>
 * </ul>
 *
 * @see xPPU.XPPUPackage#getControlCabinet()
 * @model
 * @generated
 */
public interface ControlCabinet extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent Structure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Structure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Structure</em>' reference.
	 * @see #setParentStructure(Structure)
	 * @see xPPU.XPPUPackage#getControlCabinet_ParentStructure()
	 * @model required="true"
	 * @generated
	 */
	Structure getParentStructure();

	/**
	 * Sets the value of the '{@link xPPU.ControlCabinet#getParentStructure <em>Parent Structure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Structure</em>' reference.
	 * @see #getParentStructure()
	 * @generated
	 */
	void setParentStructure(Structure value);

	/**
	 * Returns the value of the '<em><b>Controller</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link xPPU.Controller#getControllerOf <em>Controller Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controller</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller</em>' reference.
	 * @see #setController(Controller)
	 * @see xPPU.XPPUPackage#getControlCabinet_Controller()
	 * @see xPPU.Controller#getControllerOf
	 * @model opposite="controllerOf" required="true"
	 * @generated
	 */
	Controller getController();

	/**
	 * Sets the value of the '{@link xPPU.ControlCabinet#getController <em>Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controller</em>' reference.
	 * @see #getController()
	 * @generated
	 */
	void setController(Controller value);

} // ControlCabinet
