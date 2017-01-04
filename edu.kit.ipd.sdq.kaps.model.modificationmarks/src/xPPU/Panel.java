/**
 */
package xPPU;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Panel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPPU.Panel#getComponentRepository <em>Component Repository</em>}</li>
 * </ul>
 *
 * @see xPPU.XPPUPackage#getPanel()
 * @model abstract="true"
 * @generated
 */
public interface Panel extends EObject {
	/**
	 * Returns the value of the '<em><b>Component Repository</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link xPPU.Components#getPanels <em>Panels</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Repository</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Repository</em>' reference.
	 * @see #setComponentRepository(Components)
	 * @see xPPU.XPPUPackage#getPanel_ComponentRepository()
	 * @see xPPU.Components#getPanels
	 * @model opposite="panels" required="true"
	 * @generated
	 */
	Components getComponentRepository();

	/**
	 * Sets the value of the '{@link xPPU.Panel#getComponentRepository <em>Component Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Repository</em>' reference.
	 * @see #getComponentRepository()
	 * @generated
	 */
	void setComponentRepository(Components value);

} // Panel
