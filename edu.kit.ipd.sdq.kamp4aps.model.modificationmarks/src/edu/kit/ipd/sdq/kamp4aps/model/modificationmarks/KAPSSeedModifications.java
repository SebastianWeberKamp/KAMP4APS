/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.modificationmarks;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractSeedModifications;

import org.eclipse.emf.common.util.EList;

import xPPU.ComponentRepository.Component;

import xPPU.InterfaceRepository.Interface;

import xPPU.ModuleRepository.Module;

import xPPU.StructureRepository.Structure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KAPS Seed Modifications</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.KAPSSeedModifications#getStructureModifications <em>Structure Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.KAPSSeedModifications#getModuleModifications <em>Module Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.KAPSSeedModifications#getComponentModifications <em>Component Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.KAPSSeedModifications#getInterfaceModifications <em>Interface Modifications</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModificationmarksPackage#getKAPSSeedModifications()
 * @model
 * @generated
 */
public interface KAPSSeedModifications extends AbstractSeedModifications {
	/**
	 * Returns the value of the '<em><b>Structure Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyStructure}&lt;xPPU.StructureRepository.Structure>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structure Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModificationmarksPackage#getKAPSSeedModifications_StructureModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModifyStructure<Structure>> getStructureModifications();

	/**
	 * Returns the value of the '<em><b>Module Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyModule}&lt;xPPU.ModuleRepository.Module>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModificationmarksPackage#getKAPSSeedModifications_ModuleModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModifyModule<Module>> getModuleModifications();

	/**
	 * Returns the value of the '<em><b>Component Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyComponent}&lt;xPPU.ComponentRepository.Component>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModificationmarksPackage#getKAPSSeedModifications_ComponentModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModifyComponent<Component>> getComponentModifications();

	/**
	 * Returns the value of the '<em><b>Interface Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyInterface}&lt;xPPU.InterfaceRepository.Interface>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModificationmarksPackage#getKAPSSeedModifications_InterfaceModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModifyInterface<Interface>> getInterfaceModifications();

} // KAPSSeedModifications
