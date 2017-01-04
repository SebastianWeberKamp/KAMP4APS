/**
 */
package xPPU;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pusher</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPPU.Pusher#getComponentsRepository <em>Components Repository</em>}</li>
 * </ul>
 *
 * @see xPPU.XPPUPackage#getPusher()
 * @model
 * @generated
 */
public interface Pusher extends EObject {
	/**
	 * Returns the value of the '<em><b>Components Repository</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link xPPU.Components#getPushers <em>Pushers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components Repository</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components Repository</em>' reference.
	 * @see #setComponentsRepository(Components)
	 * @see xPPU.XPPUPackage#getPusher_ComponentsRepository()
	 * @see xPPU.Components#getPushers
	 * @model opposite="pushers" required="true"
	 * @generated
	 */
	Components getComponentsRepository();

	/**
	 * Sets the value of the '{@link xPPU.Pusher#getComponentsRepository <em>Components Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Components Repository</em>' reference.
	 * @see #getComponentsRepository()
	 * @generated
	 */
	void setComponentsRepository(Components value);

} // Pusher
