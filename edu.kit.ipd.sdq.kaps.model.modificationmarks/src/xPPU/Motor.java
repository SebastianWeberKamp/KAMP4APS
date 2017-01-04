/**
 */
package xPPU;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Motor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPPU.Motor#getGearing <em>Gearing</em>}</li>
 *   <li>{@link xPPU.Motor#getScrewing <em>Screwing</em>}</li>
 *   <li>{@link xPPU.Motor#getPowersupply <em>Powersupply</em>}</li>
 *   <li>{@link xPPU.Motor#getComponentRepository <em>Component Repository</em>}</li>
 * </ul>
 *
 * @see xPPU.XPPUPackage#getMotor()
 * @model abstract="true"
 * @generated
 */
public interface Motor extends EObject {
	/**
	 * Returns the value of the '<em><b>Gearing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gearing</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gearing</em>' reference.
	 * @see #setGearing(Gearing)
	 * @see xPPU.XPPUPackage#getMotor_Gearing()
	 * @model required="true"
	 * @generated
	 */
	Gearing getGearing();

	/**
	 * Sets the value of the '{@link xPPU.Motor#getGearing <em>Gearing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gearing</em>' reference.
	 * @see #getGearing()
	 * @generated
	 */
	void setGearing(Gearing value);

	/**
	 * Returns the value of the '<em><b>Screwing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Screwing</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screwing</em>' reference.
	 * @see #setScrewing(Screwing)
	 * @see xPPU.XPPUPackage#getMotor_Screwing()
	 * @model required="true"
	 * @generated
	 */
	Screwing getScrewing();

	/**
	 * Sets the value of the '{@link xPPU.Motor#getScrewing <em>Screwing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Screwing</em>' reference.
	 * @see #getScrewing()
	 * @generated
	 */
	void setScrewing(Screwing value);

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
	 * @see xPPU.XPPUPackage#getMotor_Powersupply()
	 * @model required="true"
	 * @generated
	 */
	PowerSupply getPowersupply();

	/**
	 * Sets the value of the '{@link xPPU.Motor#getPowersupply <em>Powersupply</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Powersupply</em>' reference.
	 * @see #getPowersupply()
	 * @generated
	 */
	void setPowersupply(PowerSupply value);

	/**
	 * Returns the value of the '<em><b>Component Repository</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link xPPU.Components#getMotors <em>Motors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Repository</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Repository</em>' container reference.
	 * @see #setComponentRepository(Components)
	 * @see xPPU.XPPUPackage#getMotor_ComponentRepository()
	 * @see xPPU.Components#getMotors
	 * @model opposite="motors" required="true" transient="false"
	 * @generated
	 */
	Components getComponentRepository();

	/**
	 * Sets the value of the '{@link xPPU.Motor#getComponentRepository <em>Component Repository</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Repository</em>' container reference.
	 * @see #getComponentRepository()
	 * @generated
	 */
	void setComponentRepository(Components value);

} // Motor
