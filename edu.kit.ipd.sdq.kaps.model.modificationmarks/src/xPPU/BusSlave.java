/**
 */
package xPPU;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bus Slave</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPPU.BusSlave#getSignalinterface_master <em>Signalinterface master</em>}</li>
 *   <li>{@link xPPU.BusSlave#getSignalinterface_slave <em>Signalinterface slave</em>}</li>
 *   <li>{@link xPPU.BusSlave#getComponentRepository <em>Component Repository</em>}</li>
 * </ul>
 *
 * @see xPPU.XPPUPackage#getBusSlave()
 * @model
 * @generated
 */
public interface BusSlave extends EObject {
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
	 * @see xPPU.XPPUPackage#getBusSlave_Signalinterface_master()
	 * @model required="true"
	 * @generated
	 */
	SignalInterface getSignalinterface_master();

	/**
	 * Sets the value of the '{@link xPPU.BusSlave#getSignalinterface_master <em>Signalinterface master</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signalinterface master</em>' reference.
	 * @see #getSignalinterface_master()
	 * @generated
	 */
	void setSignalinterface_master(SignalInterface value);

	/**
	 * Returns the value of the '<em><b>Signalinterface slave</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signalinterface slave</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signalinterface slave</em>' reference.
	 * @see #setSignalinterface_slave(SignalInterface)
	 * @see xPPU.XPPUPackage#getBusSlave_Signalinterface_slave()
	 * @model required="true"
	 * @generated
	 */
	SignalInterface getSignalinterface_slave();

	/**
	 * Sets the value of the '{@link xPPU.BusSlave#getSignalinterface_slave <em>Signalinterface slave</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signalinterface slave</em>' reference.
	 * @see #getSignalinterface_slave()
	 * @generated
	 */
	void setSignalinterface_slave(SignalInterface value);

	/**
	 * Returns the value of the '<em><b>Component Repository</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link xPPU.Components#getBusslaves <em>Busslaves</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Repository</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Repository</em>' container reference.
	 * @see #setComponentRepository(Components)
	 * @see xPPU.XPPUPackage#getBusSlave_ComponentRepository()
	 * @see xPPU.Components#getBusslaves
	 * @model opposite="busslaves" required="true" transient="false"
	 * @generated
	 */
	Components getComponentRepository();

	/**
	 * Sets the value of the '{@link xPPU.BusSlave#getComponentRepository <em>Component Repository</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Repository</em>' container reference.
	 * @see #getComponentRepository()
	 * @generated
	 */
	void setComponentRepository(Components value);

} // BusSlave
