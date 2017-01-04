/**
 */
package xPPU;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ramp Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPPU.RampModule#getParentModuleContainer <em>Parent Module Container</em>}</li>
 * </ul>
 *
 * @see xPPU.XPPUPackage#getRampModule()
 * @model
 * @generated
 */
public interface RampModule extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent Module Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link xPPU.Modules#getRampmodules <em>Rampmodules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Module Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Module Container</em>' container reference.
	 * @see #setParentModuleContainer(Modules)
	 * @see xPPU.XPPUPackage#getRampModule_ParentModuleContainer()
	 * @see xPPU.Modules#getRampmodules
	 * @model opposite="rampmodules" required="true" transient="false"
	 * @generated
	 */
	Modules getParentModuleContainer();

	/**
	 * Sets the value of the '{@link xPPU.RampModule#getParentModuleContainer <em>Parent Module Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Module Container</em>' container reference.
	 * @see #getParentModuleContainer()
	 * @generated
	 */
	void setParentModuleContainer(Modules value);

} // RampModule
