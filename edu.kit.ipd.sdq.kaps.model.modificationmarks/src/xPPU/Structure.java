/**
 */
package xPPU;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPPU.Structure#getParentPlant <em>Parent Plant</em>}</li>
 *   <li>{@link xPPU.Structure#getModules <em>Modules</em>}</li>
 *   <li>{@link xPPU.Structure#getComponents <em>Components</em>}</li>
 *   <li>{@link xPPU.Structure#getCranes <em>Cranes</em>}</li>
 *   <li>{@link xPPU.Structure#getConveyor <em>Conveyor</em>}</li>
 *   <li>{@link xPPU.Structure#getControlcabinets <em>Controlcabinets</em>}</li>
 *   <li>{@link xPPU.Structure#getPowernetworks <em>Powernetworks</em>}</li>
 *   <li>{@link xPPU.Structure#getCommunicationnetworks <em>Communicationnetworks</em>}</li>
 *   <li>{@link xPPU.Structure#getPneumaticnetworks <em>Pneumaticnetworks</em>}</li>
 *   <li>{@link xPPU.Structure#getPowerwiring <em>Powerwiring</em>}</li>
 * </ul>
 *
 * @see xPPU.XPPUPackage#getStructure()
 * @model
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
	 * @see xPPU.XPPUPackage#getStructure_ParentPlant()
	 * @see xPPU.Plant#getStructures
	 * @model opposite="structures" required="true" transient="false"
	 * @generated
	 */
	Plant getParentPlant();

	/**
	 * Sets the value of the '{@link xPPU.Structure#getParentPlant <em>Parent Plant</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Plant</em>' container reference.
	 * @see #getParentPlant()
	 * @generated
	 */
	void setParentPlant(Plant value);

	/**
	 * Returns the value of the '<em><b>Modules</b></em>' containment reference list.
	 * The list contents are of type {@link xPPU.Modules}.
	 * It is bidirectional and its opposite is '{@link xPPU.Modules#getParentStructure <em>Parent Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' containment reference list.
	 * @see xPPU.XPPUPackage#getStructure_Modules()
	 * @see xPPU.Modules#getParentStructure
	 * @model opposite="parentStructure" containment="true"
	 * @generated
	 */
	EList<Modules> getModules();

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link xPPU.Components}.
	 * It is bidirectional and its opposite is '{@link xPPU.Components#getParentStructure <em>Parent Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see xPPU.XPPUPackage#getStructure_Components()
	 * @see xPPU.Components#getParentStructure
	 * @model opposite="parentStructure" containment="true"
	 * @generated
	 */
	EList<Components> getComponents();

	/**
	 * Returns the value of the '<em><b>Cranes</b></em>' containment reference list.
	 * The list contents are of type {@link xPPU.Crane}.
	 * It is bidirectional and its opposite is '{@link xPPU.Crane#getParentStructure <em>Parent Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cranes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cranes</em>' containment reference list.
	 * @see xPPU.XPPUPackage#getStructure_Cranes()
	 * @see xPPU.Crane#getParentStructure
	 * @model opposite="parentStructure" containment="true"
	 * @generated
	 */
	EList<Crane> getCranes();

	/**
	 * Returns the value of the '<em><b>Conveyor</b></em>' containment reference list.
	 * The list contents are of type {@link xPPU.Conveyor}.
	 * It is bidirectional and its opposite is '{@link xPPU.Conveyor#getParentStructure <em>Parent Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conveyor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conveyor</em>' containment reference list.
	 * @see xPPU.XPPUPackage#getStructure_Conveyor()
	 * @see xPPU.Conveyor#getParentStructure
	 * @model opposite="parentStructure" containment="true"
	 * @generated
	 */
	EList<Conveyor> getConveyor();

	/**
	 * Returns the value of the '<em><b>Controlcabinets</b></em>' containment reference list.
	 * The list contents are of type {@link xPPU.ControlCabinet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controlcabinets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controlcabinets</em>' containment reference list.
	 * @see xPPU.XPPUPackage#getStructure_Controlcabinets()
	 * @model containment="true"
	 * @generated
	 */
	EList<ControlCabinet> getControlcabinets();

	/**
	 * Returns the value of the '<em><b>Powernetworks</b></em>' containment reference list.
	 * The list contents are of type {@link xPPU.PowerNetwork}.
	 * It is bidirectional and its opposite is '{@link xPPU.PowerNetwork#getParentStructure <em>Parent Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Powernetworks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Powernetworks</em>' containment reference list.
	 * @see xPPU.XPPUPackage#getStructure_Powernetworks()
	 * @see xPPU.PowerNetwork#getParentStructure
	 * @model opposite="parentStructure" containment="true"
	 * @generated
	 */
	EList<PowerNetwork> getPowernetworks();

	/**
	 * Returns the value of the '<em><b>Communicationnetworks</b></em>' containment reference list.
	 * The list contents are of type {@link xPPU.CommunicationNetwork}.
	 * It is bidirectional and its opposite is '{@link xPPU.CommunicationNetwork#getParentStructure <em>Parent Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communicationnetworks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communicationnetworks</em>' containment reference list.
	 * @see xPPU.XPPUPackage#getStructure_Communicationnetworks()
	 * @see xPPU.CommunicationNetwork#getParentStructure
	 * @model opposite="parentStructure" containment="true"
	 * @generated
	 */
	EList<CommunicationNetwork> getCommunicationnetworks();

	/**
	 * Returns the value of the '<em><b>Pneumaticnetworks</b></em>' containment reference list.
	 * The list contents are of type {@link xPPU.PneumaticNetwork}.
	 * It is bidirectional and its opposite is '{@link xPPU.PneumaticNetwork#getParentStructure <em>Parent Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pneumaticnetworks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pneumaticnetworks</em>' containment reference list.
	 * @see xPPU.XPPUPackage#getStructure_Pneumaticnetworks()
	 * @see xPPU.PneumaticNetwork#getParentStructure
	 * @model opposite="parentStructure" containment="true"
	 * @generated
	 */
	EList<PneumaticNetwork> getPneumaticnetworks();

	/**
	 * Returns the value of the '<em><b>Powerwiring</b></em>' containment reference list.
	 * The list contents are of type {@link xPPU.PowerWiring}.
	 * It is bidirectional and its opposite is '{@link xPPU.PowerWiring#getParentStructure <em>Parent Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Powerwiring</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Powerwiring</em>' containment reference list.
	 * @see xPPU.XPPUPackage#getStructure_Powerwiring()
	 * @see xPPU.PowerWiring#getParentStructure
	 * @model opposite="parentStructure" containment="true"
	 * @generated
	 */
	EList<PowerWiring> getPowerwiring();

} // Structure
