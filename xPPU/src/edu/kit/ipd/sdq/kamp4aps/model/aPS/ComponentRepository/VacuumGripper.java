/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.ProfibusDPSlave;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.GripperPart;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Crane;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vacuum Gripper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.VacuumGripper#getMountedTo <em>Mounted To</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.VacuumGripper#getGripperPart <em>Gripper Part</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.VacuumGripper#getValve <em>Valve</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.VacuumGripper#getVacuumSwitch <em>Vacuum Switch</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.VacuumGripper#getBusSlave <em>Bus Slave</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getVacuumGripper()
 * @model
 * @generated
 */
public interface VacuumGripper extends Component {
	/**
	 * Returns the value of the '<em><b>Mounted To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Crane#getVacuumgripper <em>Vacuumgripper</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mounted To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mounted To</em>' reference.
	 * @see #setMountedTo(Crane)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getVacuumGripper_MountedTo()
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Crane#getVacuumgripper
	 * @model opposite="vacuumgripper" required="true"
	 * @generated
	 */
	Crane getMountedTo();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.VacuumGripper#getMountedTo <em>Mounted To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mounted To</em>' reference.
	 * @see #getMountedTo()
	 * @generated
	 */
	void setMountedTo(Crane value);

	/**
	 * Returns the value of the '<em><b>Gripper Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gripper Part</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gripper Part</em>' containment reference.
	 * @see #setGripperPart(GripperPart)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getVacuumGripper_GripperPart()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GripperPart getGripperPart();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.VacuumGripper#getGripperPart <em>Gripper Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gripper Part</em>' containment reference.
	 * @see #getGripperPart()
	 * @generated
	 */
	void setGripperPart(GripperPart value);

	/**
	 * Returns the value of the '<em><b>Valve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valve</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valve</em>' containment reference.
	 * @see #setValve(RegularValve)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getVacuumGripper_Valve()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RegularValve getValve();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.VacuumGripper#getValve <em>Valve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valve</em>' containment reference.
	 * @see #getValve()
	 * @generated
	 */
	void setValve(RegularValve value);

	/**
	 * Returns the value of the '<em><b>Vacuum Switch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vacuum Switch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vacuum Switch</em>' containment reference.
	 * @see #setVacuumSwitch(VacuumSwitch)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getVacuumGripper_VacuumSwitch()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VacuumSwitch getVacuumSwitch();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.VacuumGripper#getVacuumSwitch <em>Vacuum Switch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vacuum Switch</em>' containment reference.
	 * @see #getVacuumSwitch()
	 * @generated
	 */
	void setVacuumSwitch(VacuumSwitch value);

	/**
	 * Returns the value of the '<em><b>Bus Slave</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.ProfibusDPSlave}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus Slave</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Slave</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getVacuumGripper_BusSlave()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ProfibusDPSlave> getBusSlave();

} // VacuumGripper
