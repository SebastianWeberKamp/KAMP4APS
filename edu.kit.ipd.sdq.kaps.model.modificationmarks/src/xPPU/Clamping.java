/**
 */
package xPPU;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clamping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPPU.Clamping#getIntefacePart <em>Inteface Part</em>}</li>
 * </ul>
 *
 * @see xPPU.XPPUPackage#getClamping()
 * @model
 * @generated
 */
public interface Clamping extends EObject {
	/**
	 * Returns the value of the '<em><b>Inteface Part</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link xPPU.Interface#getClamping <em>Clamping</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inteface Part</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inteface Part</em>' reference.
	 * @see #setIntefacePart(Interface)
	 * @see xPPU.XPPUPackage#getClamping_IntefacePart()
	 * @see xPPU.Interface#getClamping
	 * @model opposite="clamping" required="true"
	 * @generated
	 */
	Interface getIntefacePart();

	/**
	 * Sets the value of the '{@link xPPU.Clamping#getIntefacePart <em>Inteface Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inteface Part</em>' reference.
	 * @see #getIntefacePart()
	 * @generated
	 */
	void setIntefacePart(Interface value);

} // Clamping
