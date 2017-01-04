/**
 */
package xPPU;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mechanical Assembly</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPPU.MechanicalAssembly#getComponentRepository <em>Component Repository</em>}</li>
 * </ul>
 *
 * @see xPPU.XPPUPackage#getMechanicalAssembly()
 * @model abstract="true"
 * @generated
 */
public interface MechanicalAssembly extends EObject {
	/**
	 * Returns the value of the '<em><b>Component Repository</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link xPPU.Components#getMechanicalAssemblys <em>Mechanical Assemblys</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Repository</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Repository</em>' container reference.
	 * @see #setComponentRepository(Components)
	 * @see xPPU.XPPUPackage#getMechanicalAssembly_ComponentRepository()
	 * @see xPPU.Components#getMechanicalAssemblys
	 * @model opposite="mechanicalAssemblys" required="true" transient="false"
	 * @generated
	 */
	Components getComponentRepository();

	/**
	 * Sets the value of the '{@link xPPU.MechanicalAssembly#getComponentRepository <em>Component Repository</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Repository</em>' container reference.
	 * @see #getComponentRepository()
	 * @generated
	 */
	void setComponentRepository(Components value);

} // MechanicalAssembly
