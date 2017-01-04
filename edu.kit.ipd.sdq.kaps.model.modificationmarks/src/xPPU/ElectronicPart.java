/**
 */
package xPPU;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Electronic Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPPU.ElectronicPart#getPin <em>Pin</em>}</li>
 *   <li>{@link xPPU.ElectronicPart#getPhysicalconnection <em>Physicalconnection</em>}</li>
 *   <li>{@link xPPU.ElectronicPart#getComponentRepository <em>Component Repository</em>}</li>
 * </ul>
 *
 * @see xPPU.XPPUPackage#getElectronicPart()
 * @model abstract="true"
 * @generated
 */
public interface ElectronicPart extends EObject {
	/**
	 * Returns the value of the '<em><b>Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin</em>' reference.
	 * @see #setPin(SignalInterface)
	 * @see xPPU.XPPUPackage#getElectronicPart_Pin()
	 * @model required="true"
	 * @generated
	 */
	SignalInterface getPin();

	/**
	 * Sets the value of the '{@link xPPU.ElectronicPart#getPin <em>Pin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin</em>' reference.
	 * @see #getPin()
	 * @generated
	 */
	void setPin(SignalInterface value);

	/**
	 * Returns the value of the '<em><b>Physicalconnection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physicalconnection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physicalconnection</em>' reference.
	 * @see #setPhysicalconnection(PhysicalConnection)
	 * @see xPPU.XPPUPackage#getElectronicPart_Physicalconnection()
	 * @model required="true"
	 * @generated
	 */
	PhysicalConnection getPhysicalconnection();

	/**
	 * Sets the value of the '{@link xPPU.ElectronicPart#getPhysicalconnection <em>Physicalconnection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physicalconnection</em>' reference.
	 * @see #getPhysicalconnection()
	 * @generated
	 */
	void setPhysicalconnection(PhysicalConnection value);

	/**
	 * Returns the value of the '<em><b>Component Repository</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link xPPU.Components#getElectronicComponents <em>Electronic Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Repository</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Repository</em>' reference.
	 * @see #setComponentRepository(Components)
	 * @see xPPU.XPPUPackage#getElectronicPart_ComponentRepository()
	 * @see xPPU.Components#getElectronicComponents
	 * @model opposite="electronicComponents" required="true"
	 * @generated
	 */
	Components getComponentRepository();

	/**
	 * Sets the value of the '{@link xPPU.ElectronicPart#getComponentRepository <em>Component Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Repository</em>' reference.
	 * @see #getComponentRepository()
	 * @generated
	 */
	void setComponentRepository(Components value);

} // ElectronicPart
