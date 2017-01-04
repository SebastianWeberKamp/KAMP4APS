/**
 */
package edu.kit.ipd.sdq.kaps.model.modificationmarks;

import org.eclipse.emf.common.util.EList;
import org.palladiosimulator.pcm.repository.Interface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modify Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifyInterface#getSignatureModifications <em>Signature Modifications</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.modificationmarksPackage#getModifyInterface()
 * @model
 * @generated
 */
public interface ModifyInterface extends ModifyEntity<Interface> {

	/**
	 * Returns the value of the '<em><b>Signature Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifySignature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kaps.model.modificationmarks.modificationmarksPackage#getModifyInterface_SignatureModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModifySignature> getSignatureModifications();

} // ModifyInterface
