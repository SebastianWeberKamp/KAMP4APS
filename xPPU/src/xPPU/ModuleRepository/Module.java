/**
 */
package xPPU.ModuleRepository;

import org.eclipse.emf.common.util.EList;

import xPPU.ComponentRepository.Component;

import xPPU.Identifier.Identifier;

import xPPU.InterfaceRepository.Interface;

import xPPU.StructureRepository.Structure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPPU.ModuleRepository.Module#getParentStructure <em>Parent Structure</em>}</li>
 *   <li>{@link xPPU.ModuleRepository.Module#getModules <em>Modules</em>}</li>
 *   <li>{@link xPPU.ModuleRepository.Module#getComponents <em>Components</em>}</li>
 *   <li>{@link xPPU.ModuleRepository.Module#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 *
 * @see xPPU.ModuleRepository.ModuleRepositoryPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends Identifier {
	/**
	 * Returns the value of the '<em><b>Parent Structure</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link xPPU.StructureRepository.Structure#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Structure</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Structure</em>' container reference.
	 * @see #setParentStructure(Structure)
	 * @see xPPU.ModuleRepository.ModuleRepositoryPackage#getModule_ParentStructure()
	 * @see xPPU.StructureRepository.Structure#getModules
	 * @model opposite="modules" required="true" transient="false"
	 * @generated
	 */
	Structure getParentStructure();

	/**
	 * Sets the value of the '{@link xPPU.ModuleRepository.Module#getParentStructure <em>Parent Structure</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Structure</em>' container reference.
	 * @see #getParentStructure()
	 * @generated
	 */
	void setParentStructure(Structure value);

	/**
	 * Returns the value of the '<em><b>Modules</b></em>' reference list.
	 * The list contents are of type {@link xPPU.ModuleRepository.Module}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' reference list.
	 * @see xPPU.ModuleRepository.ModuleRepositoryPackage#getModule_Modules()
	 * @model
	 * @generated
	 */
	EList<Module> getModules();

	/**
	 * Returns the value of the '<em><b>Components</b></em>' reference list.
	 * The list contents are of type {@link xPPU.ComponentRepository.Component}.
	 * It is bidirectional and its opposite is '{@link xPPU.ComponentRepository.Component#getParentModule <em>Parent Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' reference list.
	 * @see xPPU.ModuleRepository.ModuleRepositoryPackage#getModule_Components()
	 * @see xPPU.ComponentRepository.Component#getParentModule
	 * @model opposite="parentModule"
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
