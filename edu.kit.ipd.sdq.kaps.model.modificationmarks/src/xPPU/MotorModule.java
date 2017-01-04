/**
 */
package xPPU;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Motor Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPPU.MotorModule#getParentModuleContainer <em>Parent Module Container</em>}</li>
 * </ul>
 *
 * @see xPPU.XPPUPackage#getMotorModule()
 * @model
 * @generated
 */
public interface MotorModule extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent Module Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link xPPU.Modules#getMotormodules <em>Motormodules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Module Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Module Container</em>' container reference.
	 * @see #setParentModuleContainer(Modules)
	 * @see xPPU.XPPUPackage#getMotorModule_ParentModuleContainer()
	 * @see xPPU.Modules#getMotormodules
	 * @model opposite="motormodules" required="true" transient="false"
	 * @generated
	 */
	Modules getParentModuleContainer();

	/**
	 * Sets the value of the '{@link xPPU.MotorModule#getParentModuleContainer <em>Parent Module Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Module Container</em>' container reference.
	 * @see #getParentModuleContainer()
	 * @generated
	 */
	void setParentModuleContainer(Modules value);

} // MotorModule
