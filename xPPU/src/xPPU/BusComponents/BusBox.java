/**
 */
package xPPU.BusComponents;

import org.eclipse.emf.common.util.EList;

import xPPU.ComponentRepository.Component;
import xPPU.ComponentRepository.PowerSupply;

import xPPU.InterfaceRepository.SignalInterface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bus Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPPU.BusComponents.BusBox#getSignalinterfaces <em>Signalinterfaces</em>}</li>
 *   <li>{@link xPPU.BusComponents.BusBox#getSignalinterface_master <em>Signalinterface master</em>}</li>
 *   <li>{@link xPPU.BusComponents.BusBox#getSignalinterface_box <em>Signalinterface box</em>}</li>
 *   <li>{@link xPPU.BusComponents.BusBox#getPowersupply <em>Powersupply</em>}</li>
 * </ul>
 *
 * @see xPPU.BusComponents.BusComponentsPackage#getBusBox()
 * @model
 * @generated
 */
public interface BusBox extends Component {
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
	 * @see xPPU.BusComponents.BusComponentsPackage#getBusBox_Signalinterfaces()
	 * @model
	 * @generated
	 */
	EList<SignalInterface> getSignalinterfaces();

	/**
	 * Returns the value of the '<em><b>Signalinterface master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signalinterface master</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signalinterface master</em>' reference.
	 * @see #setSignalinterface_master(SignalInterface)
	 * @see xPPU.BusComponents.BusComponentsPackage#getBusBox_Signalinterface_master()
	 * @model required="true"
	 * @generated
	 */
	SignalInterface getSignalinterface_master();

	/**
	 * Sets the value of the '{@link xPPU.BusComponents.BusBox#getSignalinterface_master <em>Signalinterface master</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signalinterface master</em>' reference.
	 * @see #getSignalinterface_master()
	 * @generated
	 */
	void setSignalinterface_master(SignalInterface value);

	/**
	 * Returns the value of the '<em><b>Signalinterface box</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signalinterface box</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signalinterface box</em>' reference.
	 * @see #setSignalinterface_box(SignalInterface)
	 * @see xPPU.BusComponents.BusComponentsPackage#getBusBox_Signalinterface_box()
	 * @model required="true"
	 * @generated
	 */
	SignalInterface getSignalinterface_box();

	/**
	 * Sets the value of the '{@link xPPU.BusComponents.BusBox#getSignalinterface_box <em>Signalinterface box</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signalinterface box</em>' reference.
	 * @see #getSignalinterface_box()
	 * @generated
	 */
	void setSignalinterface_box(SignalInterface value);

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
	 * @see xPPU.BusComponents.BusComponentsPackage#getBusBox_Powersupply()
	 * @model required="true"
	 * @generated
	 */
	PowerSupply getPowersupply();

	/**
	 * Sets the value of the '{@link xPPU.BusComponents.BusBox#getPowersupply <em>Powersupply</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Powersupply</em>' reference.
	 * @see #getPowersupply()
	 * @generated
	 */
	void setPowersupply(PowerSupply value);

} // BusBox
