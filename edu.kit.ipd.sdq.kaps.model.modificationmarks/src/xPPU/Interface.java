/**
 */
package xPPU;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPPU.Interface#getScrewings <em>Screwings</em>}</li>
 *   <li>{@link xPPU.Interface#getSuspensions <em>Suspensions</em>}</li>
 *   <li>{@link xPPU.Interface#getGearings <em>Gearings</em>}</li>
 *   <li>{@link xPPU.Interface#getClamping <em>Clamping</em>}</li>
 *   <li>{@link xPPU.Interface#getPneumaticsupplys <em>Pneumaticsupplys</em>}</li>
 *   <li>{@link xPPU.Interface#getSignalinterfaces <em>Signalinterfaces</em>}</li>
 *   <li>{@link xPPU.Interface#getPowersupply <em>Powersupply</em>}</li>
 *   <li>{@link xPPU.Interface#getWatersupply <em>Watersupply</em>}</li>
 *   <li>{@link xPPU.Interface#getPhysicalconnections <em>Physicalconnections</em>}</li>
 *   <li>{@link xPPU.Interface#getTransportconnection <em>Transportconnection</em>}</li>
 *   <li>{@link xPPU.Interface#getComponentRepository <em>Component Repository</em>}</li>
 * </ul>
 *
 * @see xPPU.XPPUPackage#getInterface()
 * @model
 * @generated
 */
public interface Interface extends EObject {
	/**
	 * Returns the value of the '<em><b>Screwings</b></em>' containment reference list.
	 * The list contents are of type {@link xPPU.Screwing}.
	 * It is bidirectional and its opposite is '{@link xPPU.Screwing#getIntefacePart <em>Inteface Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Screwings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screwings</em>' containment reference list.
	 * @see xPPU.XPPUPackage#getInterface_Screwings()
	 * @see xPPU.Screwing#getIntefacePart
	 * @model opposite="intefacePart" containment="true"
	 * @generated
	 */
	EList<Screwing> getScrewings();

	/**
	 * Returns the value of the '<em><b>Suspensions</b></em>' containment reference list.
	 * The list contents are of type {@link xPPU.Suspension}.
	 * It is bidirectional and its opposite is '{@link xPPU.Suspension#getIntefacePart <em>Inteface Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suspensions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suspensions</em>' containment reference list.
	 * @see xPPU.XPPUPackage#getInterface_Suspensions()
	 * @see xPPU.Suspension#getIntefacePart
	 * @model opposite="intefacePart" containment="true"
	 * @generated
	 */
	EList<Suspension> getSuspensions();

	/**
	 * Returns the value of the '<em><b>Gearings</b></em>' containment reference list.
	 * The list contents are of type {@link xPPU.Gearing}.
	 * It is bidirectional and its opposite is '{@link xPPU.Gearing#getIntefacePart <em>Inteface Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gearings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gearings</em>' containment reference list.
	 * @see xPPU.XPPUPackage#getInterface_Gearings()
	 * @see xPPU.Gearing#getIntefacePart
	 * @model opposite="intefacePart" containment="true"
	 * @generated
	 */
	EList<Gearing> getGearings();

	/**
	 * Returns the value of the '<em><b>Clamping</b></em>' reference list.
	 * The list contents are of type {@link xPPU.Clamping}.
	 * It is bidirectional and its opposite is '{@link xPPU.Clamping#getIntefacePart <em>Inteface Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clamping</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clamping</em>' reference list.
	 * @see xPPU.XPPUPackage#getInterface_Clamping()
	 * @see xPPU.Clamping#getIntefacePart
	 * @model opposite="intefacePart"
	 * @generated
	 */
	EList<Clamping> getClamping();

	/**
	 * Returns the value of the '<em><b>Pneumaticsupplys</b></em>' containment reference list.
	 * The list contents are of type {@link xPPU.PneumaticSupply}.
	 * It is bidirectional and its opposite is '{@link xPPU.PneumaticSupply#getIntefacePart <em>Inteface Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pneumaticsupplys</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pneumaticsupplys</em>' containment reference list.
	 * @see xPPU.XPPUPackage#getInterface_Pneumaticsupplys()
	 * @see xPPU.PneumaticSupply#getIntefacePart
	 * @model opposite="intefacePart" containment="true"
	 * @generated
	 */
	EList<PneumaticSupply> getPneumaticsupplys();

	/**
	 * Returns the value of the '<em><b>Signalinterfaces</b></em>' containment reference list.
	 * The list contents are of type {@link xPPU.SignalInterface}.
	 * It is bidirectional and its opposite is '{@link xPPU.SignalInterface#getIntefacePart <em>Inteface Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signalinterfaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signalinterfaces</em>' containment reference list.
	 * @see xPPU.XPPUPackage#getInterface_Signalinterfaces()
	 * @see xPPU.SignalInterface#getIntefacePart
	 * @model opposite="intefacePart" containment="true"
	 * @generated
	 */
	EList<SignalInterface> getSignalinterfaces();

	/**
	 * Returns the value of the '<em><b>Powersupply</b></em>' reference list.
	 * The list contents are of type {@link xPPU.PowerSupply}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Powersupply</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Powersupply</em>' reference list.
	 * @see xPPU.XPPUPackage#getInterface_Powersupply()
	 * @model
	 * @generated
	 */
	EList<PowerSupply> getPowersupply();

	/**
	 * Returns the value of the '<em><b>Watersupply</b></em>' reference list.
	 * The list contents are of type {@link xPPU.WaterSupply}.
	 * It is bidirectional and its opposite is '{@link xPPU.WaterSupply#getIntefacePart <em>Inteface Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Watersupply</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Watersupply</em>' reference list.
	 * @see xPPU.XPPUPackage#getInterface_Watersupply()
	 * @see xPPU.WaterSupply#getIntefacePart
	 * @model opposite="intefacePart"
	 * @generated
	 */
	EList<WaterSupply> getWatersupply();

	/**
	 * Returns the value of the '<em><b>Physicalconnections</b></em>' containment reference list.
	 * The list contents are of type {@link xPPU.PhysicalConnection}.
	 * It is bidirectional and its opposite is '{@link xPPU.PhysicalConnection#getIntefacePart <em>Inteface Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physicalconnections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physicalconnections</em>' containment reference list.
	 * @see xPPU.XPPUPackage#getInterface_Physicalconnections()
	 * @see xPPU.PhysicalConnection#getIntefacePart
	 * @model opposite="intefacePart" containment="true"
	 * @generated
	 */
	EList<PhysicalConnection> getPhysicalconnections();

	/**
	 * Returns the value of the '<em><b>Transportconnection</b></em>' reference list.
	 * The list contents are of type {@link xPPU.TransportConnection}.
	 * It is bidirectional and its opposite is '{@link xPPU.TransportConnection#getIntefacePart <em>Inteface Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transportconnection</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transportconnection</em>' reference list.
	 * @see xPPU.XPPUPackage#getInterface_Transportconnection()
	 * @see xPPU.TransportConnection#getIntefacePart
	 * @model opposite="intefacePart"
	 * @generated
	 */
	EList<TransportConnection> getTransportconnection();

	/**
	 * Returns the value of the '<em><b>Component Repository</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link xPPU.Components#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Repository</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Repository</em>' container reference.
	 * @see #setComponentRepository(Components)
	 * @see xPPU.XPPUPackage#getInterface_ComponentRepository()
	 * @see xPPU.Components#getInterfaces
	 * @model opposite="interfaces" required="true" transient="false"
	 * @generated
	 */
	Components getComponentRepository();

	/**
	 * Sets the value of the '{@link xPPU.Interface#getComponentRepository <em>Component Repository</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Repository</em>' container reference.
	 * @see #getComponentRepository()
	 * @generated
	 */
	void setComponentRepository(Components value);

} // Interface
