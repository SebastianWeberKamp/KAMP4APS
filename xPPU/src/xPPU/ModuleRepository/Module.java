/**
 */
package xPPU.ModuleRepository;

import org.eclipse.emf.common.util.EList;

import xPPU.ComponentRepository.Component;

import xPPU.Entity;

import xPPU.InterfaceRepository.Interface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPPU.ModuleRepository.Module#getParentEntity <em>Parent Entity</em>}</li>
 *   <li>{@link xPPU.ModuleRepository.Module#getModules <em>Modules</em>}</li>
 *   <li>{@link xPPU.ModuleRepository.Module#getComponents <em>Components</em>}</li>
 *   <li>{@link xPPU.ModuleRepository.Module#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 *
 * @see xPPU.ModuleRepository.ModuleRepositoryPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends Entity {
	/**
	 * Returns the value of the '<em><b>Parent Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Entity</em>' reference.
	 * @see #setParentEntity(Entity)
	 * @see xPPU.ModuleRepository.ModuleRepositoryPackage#getModule_ParentEntity()
	 * @model required="true"
	 * @generated
	 */
	Entity getParentEntity();

	/**
	 * Sets the value of the '{@link xPPU.ModuleRepository.Module#getParentEntity <em>Parent Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Entity</em>' reference.
	 * @see #getParentEntity()
	 * @generated
	 */
	void setParentEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Modules</b></em>' containment reference list.
	 * The list contents are of type {@link xPPU.ModuleRepository.Module}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' containment reference list.
	 * @see xPPU.ModuleRepository.ModuleRepositoryPackage#getModule_Modules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Module> getModules();

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link xPPU.ComponentRepository.Component}.
	 * It is bidirectional and its opposite is '{@link xPPU.ComponentRepository.Component#getParentModule <em>Parent Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see xPPU.ModuleRepository.ModuleRepositoryPackage#getModule_Components()
	 * @see xPPU.ComponentRepository.Component#getParentModule
	 * @model opposite="parentModule" containment="true"
	 * @generated
	 */
	EList<Component> getComponents();

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' reference list.
	 * The list contents are of type {@link xPPU.InterfaceRepository.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' reference list.
	 * @see xPPU.ModuleRepository.ModuleRepositoryPackage#getModule_Interfaces()
	 * @model
	 * @generated
	 */
	EList<Interface> getInterfaces();

} // Module
