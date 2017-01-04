/**
 */
package xPPU;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bus Master</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPPU.BusMaster#getSignalinterfaces <em>Signalinterfaces</em>}</li>
 *   <li>{@link xPPU.BusMaster#getSignalinterface_controller <em>Signalinterface controller</em>}</li>
 *   <li>{@link xPPU.BusMaster#getComponentRepostitory <em>Component Repostitory</em>}</li>
 * </ul>
 *
 * @see xPPU.XPPUPackage#getBusMaster()
 * @model
 * @generated
 */
public interface BusMaster extends EObject {
	/**
	 * Returns the value of the '<em><b>Signalinterfaces</b></em>' reference list.
	 * The list contents are of type {@link xPPU.SignalInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signalinterfaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signalinterfaces</em>' reference list.
	 * @see xPPU.XPPUPackage#getBusMaster_Signalinterfaces()
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
	 * @see xPPU.XPPUPackage#getBusMaster_Signalinterface_controller()
	 * @model required="true"
	 * @generated
	 */
	SignalInterface getSignalinterface_controller();

	/**
	 * Sets the value of the '{@link xPPU.BusMaster#getSignalinterface_controller <em>Signalinterface controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signalinterface controller</em>' reference.
	 * @see #getSignalinterface_controller()
	 * @generated
	 */
	void setSignalinterface_controller(SignalInterface value);

	/**
	 * Returns the value of the '<em><b>Component Repostitory</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link xPPU.Components#getBusmasters <em>Busmasters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Repostitory</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Repostitory</em>' container reference.
	 * @see #setComponentRepostitory(Components)
	 * @see xPPU.XPPUPackage#getBusMaster_ComponentRepostitory()
	 * @see xPPU.Components#getBusmasters
	 * @model opposite="busmasters" required="true" transient="false"
	 * @generated
	 */
	Components getComponentRepostitory();

	/**
	 * Sets the value of the '{@link xPPU.BusMaster#getComponentRepostitory <em>Component Repostitory</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Repostitory</em>' container reference.
	 * @see #getComponentRepostitory()
	 * @generated
	 */
	void setComponentRepostitory(Components value);

} // BusMaster
