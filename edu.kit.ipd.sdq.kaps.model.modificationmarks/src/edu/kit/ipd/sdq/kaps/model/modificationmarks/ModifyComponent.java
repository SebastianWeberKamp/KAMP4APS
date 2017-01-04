/**
 */
package edu.kit.ipd.sdq.kaps.model.modificationmarks;

import org.eclipse.emf.common.util.EList;
import org.palladiosimulator.pcm.repository.RepositoryComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modify Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifyComponent#getProvidedRoleModifications <em>Provided Role Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifyComponent#getRequiredRoleModifications <em>Required Role Modifications</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.modificationmarksPackage#getModifyComponent()
 * @model
 * @generated
 */
public interface ModifyComponent extends ModifyEntity<RepositoryComponent> {

	/**
	 * Returns the value of the '<em><b>Provided Role Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifyProvidedRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Role Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Role Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.modificationmarksPackage#getModifyComponent_ProvidedRoleModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModifyProvidedRole> getProvidedRoleModifications();

	/**
	 * Returns the value of the '<em><b>Required Role Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifyRequiredRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Role Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Role Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.modificationmarksPackage#getModifyComponent_RequiredRoleModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModifyRequiredRole> getRequiredRoleModifications();

} // ModifyComponent
