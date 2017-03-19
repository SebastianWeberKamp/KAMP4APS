/**
 */
package xPPU.ComponentRepository;

import org.eclipse.emf.common.util.EList;

import xPPU.Identifier.Identifier;

import xPPU.InterfaceRepository.Interface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPPU.ComponentRepository.Component#getConnectedInterfaces <em>Connected Interfaces</em>}</li>
 * </ul>
 *
 * @see xPPU.ComponentRepository.ComponentRepositoryPackage#getComponent()
 * @model abstract="true"
 * @generated
 */
public interface Component extends Identifier {
	/**
	 * Returns the value of the '<em><b>Connected Interfaces</b></em>' reference list.
	 * The list contents are of type {@link xPPU.InterfaceRepository.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected Interfaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected Interfaces</em>' reference list.
	 * @see xPPU.ComponentRepository.ComponentRepositoryPackage#getComponent_ConnectedInterfaces()
	 * @model
	 * @generated
	 */
	EList<Interface> getConnectedInterfaces();

} // Component
