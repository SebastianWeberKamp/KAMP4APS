/**
 */
package xPPU;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Power Wiring</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPPU.PowerWiring#getParentStructure <em>Parent Structure</em>}</li>
 * </ul>
 *
 * @see xPPU.XPPUPackage#getPowerWiring()
 * @model
 * @generated
 */
public interface PowerWiring extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent Structure</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link xPPU.Structure#getPowerwiring <em>Powerwiring</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Structure</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Structure</em>' container reference.
	 * @see #setParentStructure(Structure)
	 * @see xPPU.XPPUPackage#getPowerWiring_ParentStructure()
	 * @see xPPU.Structure#getPowerwiring
	 * @model opposite="powerwiring" required="true" transient="false"
	 * @generated
	 */
	Structure getParentStructure();

	/**
	 * Sets the value of the '{@link xPPU.PowerWiring#getParentStructure <em>Parent Structure</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Structure</em>' container reference.
	 * @see #getParentStructure()
	 * @generated
	 */
	void setParentStructure(Structure value);

} // PowerWiring
