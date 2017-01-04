/**
 */
package xPPU;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compressor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPPU.Compressor#getPowersupply <em>Powersupply</em>}</li>
 *   <li>{@link xPPU.Compressor#getPneumaticsupply <em>Pneumaticsupply</em>}</li>
 *   <li>{@link xPPU.Compressor#getPins <em>Pins</em>}</li>
 *   <li>{@link xPPU.Compressor#getScrewing <em>Screwing</em>}</li>
 *   <li>{@link xPPU.Compressor#getComponentRepository <em>Component Repository</em>}</li>
 * </ul>
 *
 * @see xPPU.XPPUPackage#getCompressor()
 * @model
 * @generated
 */
public interface Compressor extends EObject {
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
	 * @see xPPU.XPPUPackage#getCompressor_Powersupply()
	 * @model required="true"
	 * @generated
	 */
	PowerSupply getPowersupply();

	/**
	 * Sets the value of the '{@link xPPU.Compressor#getPowersupply <em>Powersupply</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Powersupply</em>' reference.
	 * @see #getPowersupply()
	 * @generated
	 */
	void setPowersupply(PowerSupply value);

	/**
	 * Returns the value of the '<em><b>Pneumaticsupply</b></em>' reference list.
	 * The list contents are of type {@link xPPU.PneumaticSupply}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pneumaticsupply</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pneumaticsupply</em>' reference list.
	 * @see xPPU.XPPUPackage#getCompressor_Pneumaticsupply()
	 * @model
	 * @generated
	 */
	EList<PneumaticSupply> getPneumaticsupply();

	/**
	 * Returns the value of the '<em><b>Pins</b></em>' reference list.
	 * The list contents are of type {@link xPPU.SignalInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pins</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pins</em>' reference list.
	 * @see xPPU.XPPUPackage#getCompressor_Pins()
	 * @model lower="2" upper="2"
	 * @generated
	 */
	EList<SignalInterface> getPins();

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
	 * @see xPPU.XPPUPackage#getCompressor_Screwing()
	 * @model required="true"
	 * @generated
	 */
	Screwing getScrewing();

	/**
	 * Sets the value of the '{@link xPPU.Compressor#getScrewing <em>Screwing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Screwing</em>' reference.
	 * @see #getScrewing()
	 * @generated
	 */
	void setScrewing(Screwing value);

	/**
	 * Returns the value of the '<em><b>Component Repository</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link xPPU.Components#getCompressors <em>Compressors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Repository</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Repository</em>' container reference.
	 * @see #setComponentRepository(Components)
	 * @see xPPU.XPPUPackage#getCompressor_ComponentRepository()
	 * @see xPPU.Components#getCompressors
	 * @model opposite="compressors" required="true" transient="false"
	 * @generated
	 */
	Components getComponentRepository();

	/**
	 * Sets the value of the '{@link xPPU.Compressor#getComponentRepository <em>Component Repository</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Repository</em>' container reference.
	 * @see #getComponentRepository()
	 * @generated
	 */
	void setComponentRepository(Components value);

} // Compressor
