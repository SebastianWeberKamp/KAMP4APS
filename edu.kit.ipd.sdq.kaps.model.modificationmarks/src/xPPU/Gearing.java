/**
 */
package xPPU;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gearing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPPU.Gearing#getIntefacePart <em>Inteface Part</em>}</li>
 * </ul>
 *
 * @see xPPU.XPPUPackage#getGearing()
 * @model
 * @generated
 */
public interface Gearing extends EObject {
	/**
	 * Returns the value of the '<em><b>Inteface Part</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link xPPU.Interface#getGearings <em>Gearings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inteface Part</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inteface Part</em>' container reference.
	 * @see #setIntefacePart(Interface)
	 * @see xPPU.XPPUPackage#getGearing_IntefacePart()
	 * @see xPPU.Interface#getGearings
	 * @model opposite="gearings" required="true" transient="false"
	 * @generated
	 */
	Interface getIntefacePart();

	/**
	 * Sets the value of the '{@link xPPU.Gearing#getIntefacePart <em>Inteface Part</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inteface Part</em>' container reference.
	 * @see #getIntefacePart()
	 * @generated
	 */
	void setIntefacePart(Interface value);

} // Gearing
