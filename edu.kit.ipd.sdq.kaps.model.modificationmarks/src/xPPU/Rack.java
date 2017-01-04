/**
 */
package xPPU;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rack</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPPU.Rack#getScrewing_to_base <em>Screwing to base</em>}</li>
 *   <li>{@link xPPU.Rack#getComponentRepository <em>Component Repository</em>}</li>
 * </ul>
 *
 * @see xPPU.XPPUPackage#getRack()
 * @model
 * @generated
 */
public interface Rack extends EObject {
	/**
	 * Returns the value of the '<em><b>Screwing to base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Screwing to base</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screwing to base</em>' reference.
	 * @see #setScrewing_to_base(Screwing)
	 * @see xPPU.XPPUPackage#getRack_Screwing_to_base()
	 * @model required="true"
	 * @generated
	 */
	Screwing getScrewing_to_base();

	/**
	 * Sets the value of the '{@link xPPU.Rack#getScrewing_to_base <em>Screwing to base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Screwing to base</em>' reference.
	 * @see #getScrewing_to_base()
	 * @generated
	 */
	void setScrewing_to_base(Screwing value);

	/**
	 * Returns the value of the '<em><b>Component Repository</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link xPPU.Components#getRacks <em>Racks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Repository</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Repository</em>' reference.
	 * @see #setComponentRepository(Components)
	 * @see xPPU.XPPUPackage#getRack_ComponentRepository()
	 * @see xPPU.Components#getRacks
	 * @model opposite="racks" required="true"
	 * @generated
	 */
	Components getComponentRepository();

	/**
	 * Sets the value of the '{@link xPPU.Rack#getComponentRepository <em>Component Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Repository</em>' reference.
	 * @see #getComponentRepository()
	 * @generated
	 */
	void setComponentRepository(Components value);

} // Rack
