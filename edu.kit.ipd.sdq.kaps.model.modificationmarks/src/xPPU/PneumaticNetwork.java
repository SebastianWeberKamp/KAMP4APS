/**
 */
package xPPU;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pneumatic Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPPU.PneumaticNetwork#getParentStructure <em>Parent Structure</em>}</li>
 * </ul>
 *
 * @see xPPU.XPPUPackage#getPneumaticNetwork()
 * @model
 * @generated
 */
public interface PneumaticNetwork extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent Structure</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link xPPU.Structure#getPneumaticnetworks <em>Pneumaticnetworks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Structure</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Structure</em>' container reference.
	 * @see #setParentStructure(Structure)
	 * @see xPPU.XPPUPackage#getPneumaticNetwork_ParentStructure()
	 * @see xPPU.Structure#getPneumaticnetworks
	 * @model opposite="pneumaticnetworks" required="true" transient="false"
	 * @generated
	 */
	Structure getParentStructure();

	/**
	 * Sets the value of the '{@link xPPU.PneumaticNetwork#getParentStructure <em>Parent Structure</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Structure</em>' container reference.
	 * @see #getParentStructure()
	 * @generated
	 */
	void setParentStructure(Structure value);

} // PneumaticNetwork
