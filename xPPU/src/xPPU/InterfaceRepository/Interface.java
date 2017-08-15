/**
 */
package xPPU.InterfaceRepository;

import org.eclipse.emf.common.util.EList;
import xPPU.Entity;

import xPPU.Identifier.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPPU.InterfaceRepository.Interface#getParentElement <em>Parent Element</em>}</li>
 * </ul>
 *
 * @see xPPU.InterfaceRepository.InterfaceRepositoryPackage#getInterface()
 * @model
 * @generated
 */
public interface Interface extends Entity {
	/**
	 * Returns the value of the '<em><b>Parent Element</b></em>' reference list.
	 * The list contents are of type {@link xPPU.Identifier.Identifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Element</em>' reference list.
	 * @see xPPU.InterfaceRepository.InterfaceRepositoryPackage#getInterface_ParentElement()
	 * @model required="true"
	 * @generated
	 */
	EList<Identifier> getParentElement();

} // Interface
