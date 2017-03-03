/**
 */
package xPPU.MechanicalComponents;

import xPPU.ComponentRepository.Component;

import xPPU.InterfaceRepository.Screwing;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mechanical Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPPU.MechanicalComponents.MechanicalPart#getScrewing <em>Screwing</em>}</li>
 * </ul>
 *
 * @see xPPU.MechanicalComponents.MechanicalComponentsPackage#getMechanicalPart()
 * @model abstract="true"
 * @generated
 */
public interface MechanicalPart extends Component {
	/**
	 * Returns the value of the '<em><b>Screwing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Screwing</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screwing</em>' reference.
	 * @see #setScrewing(Screwing)
	 * @see xPPU.MechanicalComponents.MechanicalComponentsPackage#getMechanicalPart_Screwing()
	 * @model required="true"
	 * @generated
	 */
	Screwing getScrewing();

	/**
	 * Sets the value of the '{@link xPPU.MechanicalComponents.MechanicalPart#getScrewing <em>Screwing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Screwing</em>' reference.
	 * @see #getScrewing()
	 * @generated
	 */
	void setScrewing(Screwing value);

} // MechanicalPart
