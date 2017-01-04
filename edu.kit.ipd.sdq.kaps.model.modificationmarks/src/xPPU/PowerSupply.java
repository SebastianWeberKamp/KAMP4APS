/**
 */
package xPPU;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Power Supply</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPPU.PowerSupply#getComponentRepository <em>Component Repository</em>}</li>
 * </ul>
 *
 * @see xPPU.XPPUPackage#getPowerSupply()
 * @model
 * @generated
 */
public interface PowerSupply extends EObject {
	/**
	 * Returns the value of the '<em><b>Component Repository</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link xPPU.Components#getPowersupplys <em>Powersupplys</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Repository</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Repository</em>' container reference.
	 * @see #setComponentRepository(Components)
	 * @see xPPU.XPPUPackage#getPowerSupply_ComponentRepository()
	 * @see xPPU.Components#getPowersupplys
	 * @model opposite="powersupplys" required="true" transient="false"
	 * @generated
	 */
	Components getComponentRepository();

	/**
	 * Sets the value of the '{@link xPPU.PowerSupply#getComponentRepository <em>Component Repository</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Repository</em>' container reference.
	 * @see #getComponentRepository()
	 * @generated
	 */
	void setComponentRepository(Components value);

} // PowerSupply
