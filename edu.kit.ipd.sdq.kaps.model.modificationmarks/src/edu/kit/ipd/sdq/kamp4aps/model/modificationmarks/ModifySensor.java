/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.modificationmarks;

import edu.kit.ipd.sdq.amp.model.modificationmarks.AbstractModification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import xPPU.InterfaceRepository.PhysicalConnection;
import xPPU.InterfaceRepository.SignalInterface;
import xPPU.Sensor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modify Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifySensor#getModifySignalInterfaces <em>Modify Signal Interfaces</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifySensor#getModifyPhysicalConnections <em>Modify Physical Connections</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.modificationmarksPackage#getModifySensor()
 * @model
 * @generated
 */
public interface ModifySensor<T extends xPPU.ComponentRepository.Sensor> extends AbstractModification<T, EObject> {

	/**
	 * Returns the value of the '<em><b>Modify Signal Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link xPPU.InterfaceRepository.SignalInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modify Signal Interfaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modify Signal Interfaces</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.modificationmarksPackage#getModifySensor_ModifySignalInterfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<SignalInterface> getModifySignalInterfaces();

	/**
	 * Returns the value of the '<em><b>Modify Physical Connections</b></em>' containment reference list.
	 * The list contents are of type {@link xPPU.InterfaceRepository.PhysicalConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modify Physical Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modify Physical Connections</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.modificationmarksPackage#getModifySensor_ModifyPhysicalConnections()
	 * @model containment="true"
	 * @generated
	 */
	EList<PhysicalConnection> getModifyPhysicalConnections();
} // ModifySensor
