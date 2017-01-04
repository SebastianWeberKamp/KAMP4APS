/**
 */
package xPPU;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Turning Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPPU.TurningTable#getMounts <em>Mounts</em>}</li>
 * </ul>
 *
 * @see xPPU.XPPUPackage#getTurningTable()
 * @model
 * @generated
 */
public interface TurningTable extends EObject {
	/**
	 * Returns the value of the '<em><b>Mounts</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link xPPU.Crane#getMountedOn <em>Mounted On</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mounts</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mounts</em>' reference.
	 * @see #setMounts(Crane)
	 * @see xPPU.XPPUPackage#getTurningTable_Mounts()
	 * @see xPPU.Crane#getMountedOn
	 * @model opposite="mountedOn" required="true"
	 * @generated
	 */
	Crane getMounts();

	/**
	 * Sets the value of the '{@link xPPU.TurningTable#getMounts <em>Mounts</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mounts</em>' reference.
	 * @see #getMounts()
	 * @generated
	 */
	void setMounts(Crane value);

} // TurningTable
