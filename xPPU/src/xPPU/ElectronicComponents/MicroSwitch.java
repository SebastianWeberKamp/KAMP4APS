/**
 */
package xPPU.ElectronicComponents;

import xPPU.ComponentRepository.MicroswitchModule;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Micro Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPPU.ElectronicComponents.MicroSwitch#getMsModule <em>Ms Module</em>}</li>
 * </ul>
 *
 * @see xPPU.ElectronicComponents.ElectronicComponentsPackage#getMicroSwitch()
 * @model
 * @generated
 */
public interface MicroSwitch extends Switch {
	/**
	 * Returns the value of the '<em><b>Ms Module</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link xPPU.ComponentRepository.MicroswitchModule#getSwitch <em>Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ms Module</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ms Module</em>' container reference.
	 * @see #setMsModule(MicroswitchModule)
	 * @see xPPU.ElectronicComponents.ElectronicComponentsPackage#getMicroSwitch_MsModule()
	 * @see xPPU.ComponentRepository.MicroswitchModule#getSwitch
	 * @model opposite="switch" required="true" transient="false"
	 * @generated
	 */
	MicroswitchModule getMsModule();

	/**
	 * Sets the value of the '{@link xPPU.ElectronicComponents.MicroSwitch#getMsModule <em>Ms Module</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ms Module</em>' container reference.
	 * @see #getMsModule()
	 * @generated
	 */
	void setMsModule(MicroswitchModule value);

} // MicroSwitch
