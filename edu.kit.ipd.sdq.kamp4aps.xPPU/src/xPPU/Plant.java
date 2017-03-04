/**
 */
package xPPU;

import org.eclipse.emf.common.util.EList;

import xPPU.ComponentRepository.ComponentRepository;

import xPPU.Identifier.Identifier;

import xPPU.InterfaceRepository.InterfaceRepository;

import xPPU.StructureRepository.Structure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPPU.Plant#getPlantName <em>Plant Name</em>}</li>
 *   <li>{@link xPPU.Plant#getStructures <em>Structures</em>}</li>
 *   <li>{@link xPPU.Plant#getInterfaceRepository <em>Interface Repository</em>}</li>
 *   <li>{@link xPPU.Plant#getComponentRepository <em>Component Repository</em>}</li>
 * </ul>
 *
 * @see xPPU.XPPUPackage#getPlant()
 * @model
 * @generated
 */
public interface Plant extends Identifier {
	/**
	 * Returns the value of the '<em><b>Plant Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plant Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plant Name</em>' attribute.
	 * @see #setPlantName(String)
	 * @see xPPU.XPPUPackage#getPlant_PlantName()
	 * @model
	 * @generated
	 */
	String getPlantName();

	/**
	 * Sets the value of the '{@link xPPU.Plant#getPlantName <em>Plant Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plant Name</em>' attribute.
	 * @see #getPlantName()
	 * @generated
	 */
	void setPlantName(String value);

	/**
	 * Returns the value of the '<em><b>Structures</b></em>' containment reference list.
	 * The list contents are of type {@link xPPU.StructureRepository.Structure}.
	 * It is bidirectional and its opposite is '{@link xPPU.StructureRepository.Structure#getParentPlant <em>Parent Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structures</em>' containment reference list.
	 * @see xPPU.XPPUPackage#getPlant_Structures()
	 * @see xPPU.StructureRepository.Structure#getParentPlant
	 * @model opposite="parentPlant" containment="true"
	 * @generated
	 */
	EList<Structure> getStructures();

	/**
	 * Returns the value of the '<em><b>Interface Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Repository</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Repository</em>' containment reference.
	 * @see #setInterfaceRepository(InterfaceRepository)
	 * @see xPPU.XPPUPackage#getPlant_InterfaceRepository()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InterfaceRepository getInterfaceRepository();

	/**
	 * Sets the value of the '{@link xPPU.Plant#getInterfaceRepository <em>Interface Repository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Repository</em>' containment reference.
	 * @see #getInterfaceRepository()
	 * @generated
	 */
	void setInterfaceRepository(InterfaceRepository value);

	/**
	 * Returns the value of the '<em><b>Component Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Repository</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Repository</em>' containment reference.
	 * @see #setComponentRepository(ComponentRepository)
	 * @see xPPU.XPPUPackage#getPlant_ComponentRepository()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ComponentRepository getComponentRepository();

	/**
	 * Sets the value of the '{@link xPPU.Plant#getComponentRepository <em>Component Repository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Repository</em>' containment reference.
	 * @see #getComponentRepository()
	 * @generated
	 */
	void setComponentRepository(ComponentRepository value);

} // Plant
