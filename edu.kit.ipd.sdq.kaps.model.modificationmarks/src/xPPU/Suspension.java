/**
 */
package xPPU;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Suspension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPPU.Suspension#getIntefacePart <em>Inteface Part</em>}</li>
 * </ul>
 *
 * @see xPPU.XPPUPackage#getSuspension()
 * @model
 * @generated
 */
public interface Suspension extends EObject {
	/**
	 * Returns the value of the '<em><b>Inteface Part</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link xPPU.Interface#getSuspensions <em>Suspensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inteface Part</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inteface Part</em>' container reference.
	 * @see #setIntefacePart(Interface)
	 * @see xPPU.XPPUPackage#getSuspension_IntefacePart()
	 * @see xPPU.Interface#getSuspensions
	 * @model opposite="suspensions" required="true" transient="false"
	 * @generated
	 */
	Interface getIntefacePart();

	/**
	 * Sets the value of the '{@link xPPU.Suspension#getIntefacePart <em>Inteface Part</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inteface Part</em>' container reference.
	 * @see #getIntefacePart()
	 * @generated
	 */
	void setIntefacePart(Interface value);

} // Suspension
