/**
 */
package xPPU.MechanicalComponents;

import xPPU.ComponentRepository.MechanicalAssembly;

import xPPU.StructureRepository.Crane;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPPU.MechanicalComponents.Arm#getMountedTo <em>Mounted To</em>}</li>
 * </ul>
 *
 * @see xPPU.MechanicalComponents.MechanicalComponentsPackage#getArm()
 * @model
 * @generated
 */
public interface Arm extends MechanicalAssembly {
	/**
	 * Returns the value of the '<em><b>Mounted To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link xPPU.StructureRepository.Crane#getArm <em>Arm</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mounted To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mounted To</em>' reference.
	 * @see #setMountedTo(Crane)
	 * @see xPPU.MechanicalComponents.MechanicalComponentsPackage#getArm_MountedTo()
	 * @see xPPU.StructureRepository.Crane#getArm
	 * @model opposite="arm" required="true"
	 * @generated
	 */
	Crane getMountedTo();

	/**
	 * Sets the value of the '{@link xPPU.MechanicalComponents.Arm#getMountedTo <em>Mounted To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mounted To</em>' reference.
	 * @see #getMountedTo()
	 * @generated
	 */
	void setMountedTo(Crane value);

} // Arm
