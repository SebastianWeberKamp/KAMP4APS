/**
 */
package xPPU;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Screwing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPPU.Screwing#getIntefacePart <em>Inteface Part</em>}</li>
 * </ul>
 *
 * @see xPPU.XPPUPackage#getScrewing()
 * @model
 * @generated
 */
public interface Screwing extends EObject {
	/**
	 * Returns the value of the '<em><b>Inteface Part</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link xPPU.Interface#getScrewings <em>Screwings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inteface Part</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inteface Part</em>' container reference.
	 * @see #setIntefacePart(Interface)
	 * @see xPPU.XPPUPackage#getScrewing_IntefacePart()
	 * @see xPPU.Interface#getScrewings
	 * @model opposite="screwings" required="true" transient="false"
	 * @generated
	 */
	Interface getIntefacePart();

	/**
	 * Sets the value of the '{@link xPPU.Screwing#getIntefacePart <em>Inteface Part</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inteface Part</em>' container reference.
	 * @see #getIntefacePart()
	 * @generated
	 */
	void setIntefacePart(Interface value);

} // Screwing
