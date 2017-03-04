/**
 */
package xPPU.InterfaceRepository;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transport Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPPU.InterfaceRepository.TransportConnection#getIntefacePart <em>Inteface Part</em>}</li>
 * </ul>
 *
 * @see xPPU.InterfaceRepository.InterfaceRepositoryPackage#getTransportConnection()
 * @model
 * @generated
 */
public interface TransportConnection extends Interface {
	/**
	 * Returns the value of the '<em><b>Inteface Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inteface Part</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inteface Part</em>' reference.
	 * @see #setIntefacePart(Interface)
	 * @see xPPU.InterfaceRepository.InterfaceRepositoryPackage#getTransportConnection_IntefacePart()
	 * @model required="true"
	 * @generated
	 */
	Interface getIntefacePart();

	/**
	 * Sets the value of the '{@link xPPU.InterfaceRepository.TransportConnection#getIntefacePart <em>Inteface Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inteface Part</em>' reference.
	 * @see #getIntefacePart()
	 * @generated
	 */
	void setIntefacePart(Interface value);

} // TransportConnection
