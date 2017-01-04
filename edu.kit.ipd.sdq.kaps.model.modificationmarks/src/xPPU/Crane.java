/**
 */
package xPPU;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Crane</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPPU.Crane#getArm <em>Arm</em>}</li>
 *   <li>{@link xPPU.Crane#getMountedOn <em>Mounted On</em>}</li>
 *   <li>{@link xPPU.Crane#getVacuumgripper <em>Vacuumgripper</em>}</li>
 *   <li>{@link xPPU.Crane#getParentStructure <em>Parent Structure</em>}</li>
 * </ul>
 *
 * @see xPPU.XPPUPackage#getCrane()
 * @model
 * @generated
 */
public interface Crane extends EObject {
	/**
	 * Returns the value of the '<em><b>Arm</b></em>' reference list.
	 * The list contents are of type {@link xPPU.Arm}.
	 * It is bidirectional and its opposite is '{@link xPPU.Arm#getMountedTo <em>Mounted To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arm</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arm</em>' reference list.
	 * @see xPPU.XPPUPackage#getCrane_Arm()
	 * @see xPPU.Arm#getMountedTo
	 * @model opposite="mountedTo"
	 * @generated
	 */
	EList<Arm> getArm();

	/**
	 * Returns the value of the '<em><b>Mounted On</b></em>' reference list.
	 * The list contents are of type {@link xPPU.TurningTable}.
	 * It is bidirectional and its opposite is '{@link xPPU.TurningTable#getMounts <em>Mounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mounted On</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mounted On</em>' reference list.
	 * @see xPPU.XPPUPackage#getCrane_MountedOn()
	 * @see xPPU.TurningTable#getMounts
	 * @model opposite="mounts"
	 * @generated
	 */
	EList<TurningTable> getMountedOn();

	/**
	 * Returns the value of the '<em><b>Vacuumgripper</b></em>' reference list.
	 * The list contents are of type {@link xPPU.VacuumGripper}.
	 * It is bidirectional and its opposite is '{@link xPPU.VacuumGripper#getMountedTo <em>Mounted To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vacuumgripper</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vacuumgripper</em>' reference list.
	 * @see xPPU.XPPUPackage#getCrane_Vacuumgripper()
	 * @see xPPU.VacuumGripper#getMountedTo
	 * @model opposite="mountedTo"
	 * @generated
	 */
	EList<VacuumGripper> getVacuumgripper();

	/**
	 * Returns the value of the '<em><b>Parent Structure</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link xPPU.Structure#getCranes <em>Cranes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Structure</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Structure</em>' container reference.
	 * @see #setParentStructure(Structure)
	 * @see xPPU.XPPUPackage#getCrane_ParentStructure()
	 * @see xPPU.Structure#getCranes
	 * @model opposite="cranes" required="true" transient="false"
	 * @generated
	 */
	Structure getParentStructure();

	/**
	 * Sets the value of the '{@link xPPU.Crane#getParentStructure <em>Parent Structure</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Structure</em>' container reference.
	 * @see #getParentStructure()
	 * @generated
	 */
	void setParentStructure(Structure value);

} // Crane
