/**
 */
package xPPU.StructureRepository;

import xPPU.ComponentRepository.Controller;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Cabinet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPPU.StructureRepository.ControlCabinet#getController <em>Controller</em>}</li>
 * </ul>
 *
 * @see xPPU.StructureRepository.StructureRepositoryPackage#getControlCabinet()
 * @model
 * @generated
 */
public interface ControlCabinet extends Structure {
	/**
	 * Returns the value of the '<em><b>Controller</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link xPPU.ComponentRepository.Controller#getControllerOf <em>Controller Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controller</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller</em>' reference.
	 * @see #setController(Controller)
	 * @see xPPU.StructureRepository.StructureRepositoryPackage#getControlCabinet_Controller()
	 * @see xPPU.ComponentRepository.Controller#getControllerOf
	 * @model opposite="controllerOf" required="true"
	 * @generated
	 */
	Controller getController();

	/**
	 * Sets the value of the '{@link xPPU.StructureRepository.ControlCabinet#getController <em>Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controller</em>' reference.
	 * @see #getController()
	 * @generated
	 */
	void setController(Controller value);

} // ControlCabinet
