/**
 */
package xPPU;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bottle Seperator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPPU.BottleSeperator#getSignalinterface <em>Signalinterface</em>}</li>
 *   <li>{@link xPPU.BottleSeperator#getPneumaticsupply <em>Pneumaticsupply</em>}</li>
 *   <li>{@link xPPU.BottleSeperator#getPowersupply <em>Powersupply</em>}</li>
 *   <li>{@link xPPU.BottleSeperator#getScrewing_to_rack <em>Screwing to rack</em>}</li>
 *   <li>{@link xPPU.BottleSeperator#getComponentRepository <em>Component Repository</em>}</li>
 * </ul>
 *
 * @see xPPU.XPPUPackage#getBottleSeperator()
 * @model
 * @generated
 */
public interface BottleSeperator extends EObject {
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
	 * @see xPPU.XPPUPackage#getBottleSeperator_Signalinterface()
	 * @model required="true"
	 * @generated
	 */
	SignalInterface getSignalinterface();

	/**
	 * Sets the value of the '{@link xPPU.BottleSeperator#getSignalinterface <em>Signalinterface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signalinterface</em>' reference.
	 * @see #getSignalinterface()
	 * @generated
	 */
	void setSignalinterface(SignalInterface value);

	/**
	 * Returns the value of the '<em><b>Pneumaticsupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pneumaticsupply</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pneumaticsupply</em>' reference.
	 * @see #setPneumaticsupply(PneumaticSupply)
	 * @see xPPU.XPPUPackage#getBottleSeperator_Pneumaticsupply()
	 * @model required="true"
	 * @generated
	 */
	PneumaticSupply getPneumaticsupply();

	/**
	 * Sets the value of the '{@link xPPU.BottleSeperator#getPneumaticsupply <em>Pneumaticsupply</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pneumaticsupply</em>' reference.
	 * @see #getPneumaticsupply()
	 * @generated
	 */
	void setPneumaticsupply(PneumaticSupply value);

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
	 * @see xPPU.XPPUPackage#getBottleSeperator_Powersupply()
	 * @model required="true"
	 * @generated
	 */
	PowerSupply getPowersupply();

	/**
	 * Sets the value of the '{@link xPPU.BottleSeperator#getPowersupply <em>Powersupply</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Powersupply</em>' reference.
	 * @see #getPowersupply()
	 * @generated
	 */
	void setPowersupply(PowerSupply value);

	/**
	 * Returns the value of the '<em><b>Screwing to rack</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Screwing to rack</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screwing to rack</em>' reference.
	 * @see #setScrewing_to_rack(Screwing)
	 * @see xPPU.XPPUPackage#getBottleSeperator_Screwing_to_rack()
	 * @model required="true"
	 * @generated
	 */
	Screwing getScrewing_to_rack();

	/**
	 * Sets the value of the '{@link xPPU.BottleSeperator#getScrewing_to_rack <em>Screwing to rack</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Screwing to rack</em>' reference.
	 * @see #getScrewing_to_rack()
	 * @generated
	 */
	void setScrewing_to_rack(Screwing value);

	/**
	 * Returns the value of the '<em><b>Component Repository</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link xPPU.Components#getBottleSeperator <em>Bottle Seperator</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Repository</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Repository</em>' reference.
	 * @see #setComponentRepository(Components)
	 * @see xPPU.XPPUPackage#getBottleSeperator_ComponentRepository()
	 * @see xPPU.Components#getBottleSeperator
	 * @model opposite="bottleSeperator" required="true"
	 * @generated
	 */
	Components getComponentRepository();

	/**
	 * Sets the value of the '{@link xPPU.BottleSeperator#getComponentRepository <em>Component Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Repository</em>' reference.
	 * @see #getComponentRepository()
	 * @generated
	 */
	void setComponentRepository(Components value);

} // BottleSeperator
