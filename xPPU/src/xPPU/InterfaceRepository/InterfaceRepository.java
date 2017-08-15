/**
 */
package xPPU.InterfaceRepository;

import org.eclipse.emf.common.util.EList;

import xPPU.Identifier.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPPU.InterfaceRepository.InterfaceRepository#getAllInterfacesInPlant <em>All Interfaces In Plant</em>}</li>
 * </ul>
 *
 * @see xPPU.InterfaceRepository.InterfaceRepositoryPackage#getInterfaceRepository()
 * @model
 * @generated
 */
public interface InterfaceRepository extends Identifier {
	/**
	 * Returns the value of the '<em><b>All Interfaces In Plant</b></em>' containment reference list.
	 * The list contents are of type {@link xPPU.InterfaceRepository.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Interfaces In Plant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Interfaces In Plant</em>' containment reference list.
	 * @see xPPU.InterfaceRepository.InterfaceRepositoryPackage#getInterfaceRepository_AllInterfacesInPlant()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interface> getAllInterfacesInPlant();

} // InterfaceRepository
