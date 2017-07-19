/**
 */
package xPPU.InterfaceRepository;

import xPPU.Identifier.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPPU.InterfaceRepository.Interface#getParentElement <em>Parent Element</em>}</li>
 * </ul>
 *
 * @see xPPU.InterfaceRepository.InterfaceRepositoryPackage#getInterface()
 * @model abstract="true"
 * @generated
 */
public interface Interface extends Identifier {
	/**
	 * Returns the value of the '<em><b>Parent Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Element</em>' reference.
	 * @see #setParentElement(Identifier)
	 * @see xPPU.InterfaceRepository.InterfaceRepositoryPackage#getInterface_ParentElement()
	 * @model required="true"
	 * @generated
	 */
	Identifier getParentElement();

	/**
	 * Sets the value of the '{@link xPPU.InterfaceRepository.Interface#getParentElement <em>Parent Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Element</em>' reference.
	 * @see #getParentElement()
	 * @generated
	 */
	void setParentElement(Identifier value);

} // Interface
