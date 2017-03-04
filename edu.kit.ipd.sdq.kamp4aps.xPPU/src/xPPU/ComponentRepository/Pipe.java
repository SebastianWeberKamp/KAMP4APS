/**
 */
package xPPU.ComponentRepository;

import xPPU.InterfaceRepository.PneumaticSupply;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pipe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPPU.ComponentRepository.Pipe#getPlugs <em>Plugs</em>}</li>
 * </ul>
 *
 * @see xPPU.ComponentRepository.ComponentRepositoryPackage#getPipe()
 * @model abstract="true"
 * @generated
 */
public interface Pipe extends Component {
	/**
	 * Returns the value of the '<em><b>Plugs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plugs</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugs</em>' reference.
	 * @see #setPlugs(PneumaticSupply)
	 * @see xPPU.ComponentRepository.ComponentRepositoryPackage#getPipe_Plugs()
	 * @model
	 * @generated
	 */
	PneumaticSupply getPlugs();

	/**
	 * Sets the value of the '{@link xPPU.ComponentRepository.Pipe#getPlugs <em>Plugs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plugs</em>' reference.
	 * @see #getPlugs()
	 * @generated
	 */
	void setPlugs(PneumaticSupply value);

} // Pipe
