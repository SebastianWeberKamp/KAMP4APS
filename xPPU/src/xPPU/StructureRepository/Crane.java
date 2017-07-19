/**
 */
package xPPU.StructureRepository;

import xPPU.ComponentRepository.TurningTable;
import xPPU.ComponentRepository.VacuumGripper;

import xPPU.MechanicalComponents.Arm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Crane</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPPU.StructureRepository.Crane#getArm <em>Arm</em>}</li>
 *   <li>{@link xPPU.StructureRepository.Crane#getMountedOn <em>Mounted On</em>}</li>
 *   <li>{@link xPPU.StructureRepository.Crane#getVacuumgripper <em>Vacuumgripper</em>}</li>
 * </ul>
 *
 * @see xPPU.StructureRepository.StructureRepositoryPackage#getCrane()
 * @model
 * @generated
 */
public interface Crane extends Structure {
	/**
	 * Returns the value of the '<em><b>Arm</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link xPPU.MechanicalComponents.Arm#getMountedTo <em>Mounted To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arm</em>' reference.
	 * @see #setArm(Arm)
	 * @see xPPU.StructureRepository.StructureRepositoryPackage#getCrane_Arm()
	 * @see xPPU.MechanicalComponents.Arm#getMountedTo
	 * @model opposite="mountedTo" required="true"
	 * @generated
	 */
	Arm getArm();

	/**
	 * Sets the value of the '{@link xPPU.StructureRepository.Crane#getArm <em>Arm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arm</em>' reference.
	 * @see #getArm()
	 * @generated
	 */
	void setArm(Arm value);

	/**
	 * Returns the value of the '<em><b>Mounted On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mounted On</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mounted On</em>' reference.
	 * @see #setMountedOn(TurningTable)
	 * @see xPPU.StructureRepository.StructureRepositoryPackage#getCrane_MountedOn()
	 * @model required="true"
	 * @generated
	 */
	TurningTable getMountedOn();

	/**
	 * Sets the value of the '{@link xPPU.StructureRepository.Crane#getMountedOn <em>Mounted On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mounted On</em>' reference.
	 * @see #getMountedOn()
	 * @generated
	 */
	void setMountedOn(TurningTable value);

	/**
	 * Returns the value of the '<em><b>Vacuumgripper</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link xPPU.ComponentRepository.VacuumGripper#getMountedTo <em>Mounted To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vacuumgripper</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vacuumgripper</em>' reference.
	 * @see #setVacuumgripper(VacuumGripper)
	 * @see xPPU.StructureRepository.StructureRepositoryPackage#getCrane_Vacuumgripper()
	 * @see xPPU.ComponentRepository.VacuumGripper#getMountedTo
	 * @model opposite="mountedTo" required="true"
	 * @generated
	 */
	VacuumGripper getVacuumgripper();

	/**
	 * Sets the value of the '{@link xPPU.StructureRepository.Crane#getVacuumgripper <em>Vacuumgripper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vacuumgripper</em>' reference.
	 * @see #getVacuumgripper()
	 * @generated
	 */
	void setVacuumgripper(VacuumGripper value);

} // Crane
