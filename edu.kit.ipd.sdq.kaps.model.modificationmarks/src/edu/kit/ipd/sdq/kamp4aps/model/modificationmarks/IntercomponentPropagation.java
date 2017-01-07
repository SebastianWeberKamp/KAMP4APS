/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.modificationmarks;

import edu.kit.ipd.sdq.amp.model.modificationmarks.ChangePropagationStep;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intercomponent Propagation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.IntercomponentPropagation#getConnectorModifications <em>Connector Modifications</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.modificationmarksPackage#getIntercomponentPropagation()
 * @model
 * @generated
 */
public interface IntercomponentPropagation extends ChangePropagationStep {
	/**
	 * Returns the value of the '<em><b>Connector Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyConnector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.modificationmarksPackage#getIntercomponentPropagation_ConnectorModifications()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ModifyConnector> getConnectorModifications();

} // IntercomponentPropagation
