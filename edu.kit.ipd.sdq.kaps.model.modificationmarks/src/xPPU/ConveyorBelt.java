/**
 */
package xPPU;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conveyor Belt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPPU.ConveyorBelt#getMountedTo <em>Mounted To</em>}</li>
 * </ul>
 *
 * @see xPPU.XPPUPackage#getConveyorBelt()
 * @model
 * @generated
 */
public interface ConveyorBelt extends EObject {
	/**
	 * Returns the value of the '<em><b>Mounted To</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link xPPU.Conveyor#getBelts <em>Belts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mounted To</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mounted To</em>' container reference.
	 * @see #setMountedTo(Conveyor)
	 * @see xPPU.XPPUPackage#getConveyorBelt_MountedTo()
	 * @see xPPU.Conveyor#getBelts
	 * @model opposite="belts" required="true" transient="false"
	 * @generated
	 */
	Conveyor getMountedTo();

	/**
	 * Sets the value of the '{@link xPPU.ConveyorBelt#getMountedTo <em>Mounted To</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mounted To</em>' container reference.
	 * @see #getMountedTo()
	 * @generated
	 */
	void setMountedTo(Conveyor value);

} // ConveyorBelt
