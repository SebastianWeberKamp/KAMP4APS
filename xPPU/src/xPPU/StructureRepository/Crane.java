/**
 */
package xPPU.StructureRepository;

import org.eclipse.emf.common.util.EList;

import xPPU.ComponentRepository.Arm;
import xPPU.ComponentRepository.TurningTable;
import xPPU.ComponentRepository.VacuumGripper;

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
	 * Returns the value of the '<em><b>Arm</b></em>' reference list.
	 * The list contents are of type {@link xPPU.ComponentRepository.Arm}.
	 * It is bidirectional and its opposite is '{@link xPPU.ComponentRepository.Arm#getMountedTo <em>Mounted To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arm</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arm</em>' reference list.
	 * @see xPPU.StructureRepository.StructureRepositoryPackage#getCrane_Arm()
	 * @see xPPU.ComponentRepository.Arm#getMountedTo
	 * @model opposite="mountedTo"
	 * @generated
	 */
	EList<Arm> getArm();

	/**
	 * Returns the value of the '<em><b>Mounted On</b></em>' containment reference list.
	 * The list contents are of type {@link xPPU.ComponentRepository.TurningTable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mounted On</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mounted On</em>' containment reference list.
	 * @see xPPU.StructureRepository.StructureRepositoryPackage#getCrane_MountedOn()
	 * @model containment="true"
	 * @generated
	 */
	EList<TurningTable> getMountedOn();

	/**
	 * Returns the value of the '<em><b>Vacuumgripper</b></em>' reference list.
	 * The list contents are of type {@link xPPU.ComponentRepository.VacuumGripper}.
	 * It is bidirectional and its opposite is '{@link xPPU.ComponentRepository.VacuumGripper#getMountedTo <em>Mounted To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vacuumgripper</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vacuumgripper</em>' reference list.
	 * @see xPPU.StructureRepository.StructureRepositoryPackage#getCrane_Vacuumgripper()
	 * @see xPPU.ComponentRepository.VacuumGripper#getMountedTo
	 * @model opposite="mountedTo"
	 * @generated
	 */
	EList<VacuumGripper> getVacuumgripper();

} // Crane
