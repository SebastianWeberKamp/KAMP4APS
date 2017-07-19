/**
 */
package xPPU.ModuleRepository;

import org.eclipse.emf.common.util.EList;

import xPPU.Identifier.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPPU.ModuleRepository.ModuleRepository#getAllModulesInPlant <em>All Modules In Plant</em>}</li>
 * </ul>
 *
 * @see xPPU.ModuleRepository.ModuleRepositoryPackage#getModuleRepository()
 * @model
 * @generated
 */
public interface ModuleRepository extends Identifier {
	/**
	 * Returns the value of the '<em><b>All Modules In Plant</b></em>' reference list.
	 * The list contents are of type {@link xPPU.ModuleRepository.Module}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Modules In Plant</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Modules In Plant</em>' reference list.
	 * @see xPPU.ModuleRepository.ModuleRepositoryPackage#getModuleRepository_AllModulesInPlant()
	 * @model
	 * @generated
	 */
	EList<Module> getAllModulesInPlant();

} // ModuleRepository
