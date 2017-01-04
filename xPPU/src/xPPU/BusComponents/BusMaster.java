/**
 */
package xPPU.BusComponents;

import org.eclipse.emf.common.util.EList;

import xPPU.ComponentRepository.Component;

import xPPU.InterfaceRepository.SignalInterface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bus Master</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPPU.BusComponents.BusMaster#getSignalinterfaces <em>Signalinterfaces</em>}</li>
 *   <li>{@link xPPU.BusComponents.BusMaster#getSignalinterface_controller <em>Signalinterface controller</em>}</li>
 * </ul>
 *
 * @see xPPU.BusComponents.BusComponentsPackage#getBusMaster()
 * @model
 * @generated
 */
public interface BusMaster extends Component {
	/**
	 * Returns the value of the '<em><b>Signalinterfaces</b></em>' reference list.
	 * The list contents are of type {@link xPPU.InterfaceRepository.SignalInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signalinterfaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signalinterfaces</em>' reference list.
	 * @see xPPU.BusComponents.BusComponentsPackage#getBusMaster_Signalinterfaces()
	 * @model
	 * @generated
	 */
	EList<SignalInterface> getSignalinterfaces();

	/**
	 * Returns the value of the '<em><b>Signalinterface controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signalinterface controller</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signalinterface controller</em>' reference.
	 * @see #setSignalinterface_controller(SignalInterface)
	 * @see xPPU.BusComponents.BusComponentsPackage#getBusMaster_Signalinterface_controller()
	 * @model required="true"
	 * @generated
	 */
	SignalInterface getSignalinterface_controller();

	/**
	 * Sets the value of the '{@link xPPU.BusComponents.BusMaster#getSignalinterface_controller <em>Signalinterface controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signalinterface controller</em>' reference.
	 * @see #getSignalinterface_controller()
	 * @generated
	 */
	void setSignalinterface_controller(SignalInterface value);

} // BusMaster
