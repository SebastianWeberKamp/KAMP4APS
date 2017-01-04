/**
 */
package xPPU;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPPU.Arm#getMountedTo <em>Mounted To</em>}</li>
 * </ul>
 *
 * @see xPPU.XPPUPackage#getArm()
 * @model
 * @generated
 */
public interface Arm extends MechanicalAssembly {
	/**
	 * Returns the value of the '<em><b>Mounted To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link xPPU.Crane#getArm <em>Arm</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mounted To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mounted To</em>' reference.
	 * @see #setMountedTo(Crane)
	 * @see xPPU.XPPUPackage#getArm_MountedTo()
	 * @see xPPU.Crane#getArm
	 * @model opposite="arm" required="true"
	 * @generated
	 */
	Crane getMountedTo();

	/**
	 * Sets the value of the '{@link xPPU.Arm#getMountedTo <em>Mounted To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mounted To</em>' reference.
	 * @see #getMountedTo()
	 * @generated
	 */
	void setMountedTo(Crane value);

} // Arm
