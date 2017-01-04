/**
 */
package xPPU;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPPU.Plant#getStructures <em>Structures</em>}</li>
 * </ul>
 *
 * @see xPPU.XPPUPackage#getPlant()
 * @model
 * @generated
 */
public interface Plant extends EObject {
	/**
	 * Returns the value of the '<em><b>Structures</b></em>' containment reference list.
	 * The list contents are of type {@link xPPU.Structure}.
	 * It is bidirectional and its opposite is '{@link xPPU.Structure#getParentPlant <em>Parent Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structures</em>' containment reference list.
	 * @see xPPU.XPPUPackage#getPlant_Structures()
	 * @see xPPU.Structure#getParentPlant
	 * @model opposite="parentPlant" containment="true"
	 * @generated
	 */
	EList<Structure> getStructures();

} // Plant
