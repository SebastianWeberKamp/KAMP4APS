/**
 */
package xPPU;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conveyor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPPU.Conveyor#getBelts <em>Belts</em>}</li>
 *   <li>{@link xPPU.Conveyor#getParentStructure <em>Parent Structure</em>}</li>
 * </ul>
 *
 * @see xPPU.XPPUPackage#getConveyor()
 * @model
 * @generated
 */
public interface Conveyor extends EObject {
	/**
	 * Returns the value of the '<em><b>Belts</b></em>' containment reference list.
	 * The list contents are of type {@link xPPU.ConveyorBelt}.
	 * It is bidirectional and its opposite is '{@link xPPU.ConveyorBelt#getMountedTo <em>Mounted To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Belts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Belts</em>' containment reference list.
	 * @see xPPU.XPPUPackage#getConveyor_Belts()
	 * @see xPPU.ConveyorBelt#getMountedTo
	 * @model opposite="mountedTo" containment="true"
	 * @generated
	 */
	EList<ConveyorBelt> getBelts();

	/**
	 * Returns the value of the '<em><b>Parent Structure</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link xPPU.Structure#getConveyor <em>Conveyor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Structure</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Structure</em>' container reference.
	 * @see #setParentStructure(Structure)
	 * @see xPPU.XPPUPackage#getConveyor_ParentStructure()
	 * @see xPPU.Structure#getConveyor
	 * @model opposite="conveyor" required="true" transient="false"
	 * @generated
	 */
	Structure getParentStructure();

	/**
	 * Sets the value of the '{@link xPPU.Conveyor#getParentStructure <em>Parent Structure</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Structure</em>' container reference.
	 * @see #getParentStructure()
	 * @generated
	 */
	void setParentStructure(Structure value);

} // Conveyor
