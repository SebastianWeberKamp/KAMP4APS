/**
 */
package xPPU.StructureRepository;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import xPPU.ComponentRepository.Component;

import xPPU.ModuleRepository.Module;

import xPPU.Plant;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPPU.StructureRepository.Structure#getParentPlant <em>Parent Plant</em>}</li>
 *   <li>{@link xPPU.StructureRepository.Structure#getModules <em>Modules</em>}</li>
 *   <li>{@link xPPU.StructureRepository.Structure#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @see xPPU.StructureRepository.StructureRepositoryPackage#getStructure()
 * @model abstract="true"
 * @generated
 */
public interface Structure extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent Plant</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link xPPU.Plant#getStructures <em>Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Plant</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Plant</em>' container reference.
	 * @see #setParentPlant(Plant)
	 * @see xPPU.StructureRepository.StructureRepositoryPackage#getStructure_ParentPlant()
	 * @see xPPU.Plant#getStructures
	 * @model opposite="structures" required="true" transient="false"
	 * @generated
	 */
	Plant getParentPlant();

	/**
	 * Sets the value of the '{@link xPPU.StructureRepository.Structure#getParentPlant <em>Parent Plant</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Plant</em>' container reference.
	 * @see #getParentPlant()
	 * @generated
	 */
	void setParentPlant(Plant value);

	/**
	 * Returns the value of the '<em><b>Modules</b></em>' containment reference list.
	 * The list contents are of type {@link xPPU.ModuleRepository.Module}.
	 * It is bidirectional and its opposite is '{@link xPPU.ModuleRepository.Module#getParentStructure <em>Parent Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' containment reference list.
	 * @see xPPU.StructureRepository.StructureRepositoryPackage#getStructure_Modules()
	 * @see xPPU.ModuleRepository.Module#getParentStructure
	 * @model opposite="parentStructure" containment="true"
	 * @generated
	 */
	EList<Module> getModules();

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link xPPU.ComponentRepository.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see xPPU.StructureRepository.StructureRepositoryPackage#getStructure_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponents();

} // Structure
