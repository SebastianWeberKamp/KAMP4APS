/**
 */
package xPPU;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Power Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPPU.PowerNetwork#getParentStructure <em>Parent Structure</em>}</li>
 * </ul>
 *
 * @see xPPU.XPPUPackage#getPowerNetwork()
 * @model
 * @generated
 */
public interface PowerNetwork extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent Structure</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link xPPU.Structure#getPowernetworks <em>Powernetworks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Structure</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Structure</em>' container reference.
	 * @see #setParentStructure(Structure)
	 * @see xPPU.XPPUPackage#getPowerNetwork_ParentStructure()
	 * @see xPPU.Structure#getPowernetworks
	 * @model opposite="powernetworks" required="true" transient="false"
	 * @generated
	 */
	Structure getParentStructure();

	/**
	 * Sets the value of the '{@link xPPU.PowerNetwork#getParentStructure <em>Parent Structure</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Structure</em>' container reference.
	 * @see #getParentStructure()
	 * @generated
	 */
	void setParentStructure(Structure value);

} // PowerNetwork
