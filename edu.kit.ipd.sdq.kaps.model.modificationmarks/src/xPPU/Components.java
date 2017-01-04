/**
 */
package xPPU;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Components</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPPU.Components#getParentStructure <em>Parent Structure</em>}</li>
 *   <li>{@link xPPU.Components#getElectronicComponents <em>Electronic Components</em>}</li>
 *   <li>{@link xPPU.Components#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link xPPU.Components#getMotors <em>Motors</em>}</li>
 *   <li>{@link xPPU.Components#getMechanicalAssemblys <em>Mechanical Assemblys</em>}</li>
 *   <li>{@link xPPU.Components#getSensors <em>Sensors</em>}</li>
 *   <li>{@link xPPU.Components#getPipes <em>Pipes</em>}</li>
 *   <li>{@link xPPU.Components#getCompressors <em>Compressors</em>}</li>
 *   <li>{@link xPPU.Components#getBuscables <em>Buscables</em>}</li>
 *   <li>{@link xPPU.Components#getBusmasters <em>Busmasters</em>}</li>
 *   <li>{@link xPPU.Components#getBusslaves <em>Busslaves</em>}</li>
 *   <li>{@link xPPU.Components#getBusboxes <em>Busboxes</em>}</li>
 *   <li>{@link xPPU.Components#getCylinders <em>Cylinders</em>}</li>
 *   <li>{@link xPPU.Components#getPowercables <em>Powercables</em>}</li>
 *   <li>{@link xPPU.Components#getValves <em>Valves</em>}</li>
 *   <li>{@link xPPU.Components#getMechanicalparts <em>Mechanicalparts</em>}</li>
 *   <li>{@link xPPU.Components#getPowersupplys <em>Powersupplys</em>}</li>
 *   <li>{@link xPPU.Components#getPushers <em>Pushers</em>}</li>
 *   <li>{@link xPPU.Components#getCorners <em>Corners</em>}</li>
 *   <li>{@link xPPU.Components#getDispensers <em>Dispensers</em>}</li>
 *   <li>{@link xPPU.Components#getRacks <em>Racks</em>}</li>
 *   <li>{@link xPPU.Components#getTanks <em>Tanks</em>}</li>
 *   <li>{@link xPPU.Components#getSplitter <em>Splitter</em>}</li>
 *   <li>{@link xPPU.Components#getBottleSeperator <em>Bottle Seperator</em>}</li>
 *   <li>{@link xPPU.Components#getPanels <em>Panels</em>}</li>
 *   <li>{@link xPPU.Components#getCables <em>Cables</em>}</li>
 * </ul>
 *
 * @see xPPU.XPPUPackage#getComponents()
 * @model
 * @generated
 */
public interface Components extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent Structure</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link xPPU.Structure#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Structure</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Structure</em>' container reference.
	 * @see #setParentStructure(Structure)
	 * @see xPPU.XPPUPackage#getComponents_ParentStructure()
	 * @see xPPU.Structure#getComponents
	 * @model opposite="components" required="true" transient="false"
	 * @generated
	 */
	Structure getParentStructure();

	/**
	 * Sets the value of the '{@link xPPU.Components#getParentStructure <em>Parent Structure</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Structure</em>' container reference.
	 * @see #getParentStructure()
	 * @generated
	 */
	void setParentStructure(Structure value);

	/**
	 * Returns the value of the '<em><b>Electronic Components</b></em>' reference list.
	 * The list contents are of type {@link xPPU.ElectronicPart}.
	 * It is bidirectional and its opposite is '{@link xPPU.ElectronicPart#getComponentRepository <em>Component Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Electronic Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Electronic Components</em>' reference list.
	 * @see xPPU.XPPUPackage#getComponents_ElectronicComponents()
	 * @see xPPU.ElectronicPart#getComponentRepository
	 * @model opposite="componentRepository"
	 * @generated
	 */
	EList<ElectronicPart> getElectronicComponents();

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link xPPU.Interface}.
	 * It is bidirectional and its opposite is '{@link xPPU.Interface#getComponentRepository <em>Component Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' containment reference list.
	 * @see xPPU.XPPUPackage#getComponents_Interfaces()
	 * @see xPPU.Interface#getComponentRepository
	 * @model opposite="componentRepository" containment="true"
	 * @generated
	 */
	EList<Interface> getInterfaces();

	/**
	 * Returns the value of the '<em><b>Motors</b></em>' containment reference list.
	 * The list contents are of type {@link xPPU.Motor}.
	 * It is bidirectional and its opposite is '{@link xPPU.Motor#getComponentRepository <em>Component Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Motors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Motors</em>' containment reference list.
	 * @see xPPU.XPPUPackage#getComponents_Motors()
	 * @see xPPU.Motor#getComponentRepository
	 * @model opposite="componentRepository" containment="true"
	 * @generated
	 */
	EList<Motor> getMotors();

	/**
	 * Returns the value of the '<em><b>Mechanical Assemblys</b></em>' containment reference list.
	 * The list contents are of type {@link xPPU.MechanicalAssembly}.
	 * It is bidirectional and its opposite is '{@link xPPU.MechanicalAssembly#getComponentRepository <em>Component Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mechanical Assemblys</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mechanical Assemblys</em>' containment reference list.
	 * @see xPPU.XPPUPackage#getComponents_MechanicalAssemblys()
	 * @see xPPU.MechanicalAssembly#getComponentRepository
	 * @model opposite="componentRepository" containment="true"
	 * @generated
	 */
	EList<MechanicalAssembly> getMechanicalAssemblys();

	/**
	 * Returns the value of the '<em><b>Sensors</b></em>' containment reference list.
	 * The list contents are of type {@link xPPU.Sensor}.
	 * It is bidirectional and its opposite is '{@link xPPU.Sensor#getComponentRepository <em>Component Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensors</em>' containment reference list.
	 * @see xPPU.XPPUPackage#getComponents_Sensors()
	 * @see xPPU.Sensor#getComponentRepository
	 * @model opposite="componentRepository" containment="true"
	 * @generated
	 */
	EList<Sensor> getSensors();

	/**
	 * Returns the value of the '<em><b>Pipes</b></em>' containment reference list.
	 * The list contents are of type {@link xPPU.Pipe}.
	 * It is bidirectional and its opposite is '{@link xPPU.Pipe#getComponentRepository <em>Component Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pipes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pipes</em>' containment reference list.
	 * @see xPPU.XPPUPackage#getComponents_Pipes()
	 * @see xPPU.Pipe#getComponentRepository
	 * @model opposite="componentRepository" containment="true"
	 * @generated
	 */
	EList<Pipe> getPipes();

	/**
	 * Returns the value of the '<em><b>Compressors</b></em>' containment reference list.
	 * The list contents are of type {@link xPPU.Compressor}.
	 * It is bidirectional and its opposite is '{@link xPPU.Compressor#getComponentRepository <em>Component Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compressors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compressors</em>' containment reference list.
	 * @see xPPU.XPPUPackage#getComponents_Compressors()
	 * @see xPPU.Compressor#getComponentRepository
	 * @model opposite="componentRepository" containment="true"
	 * @generated
	 */
	EList<Compressor> getCompressors();

	/**
	 * Returns the value of the '<em><b>Buscables</b></em>' containment reference list.
	 * The list contents are of type {@link xPPU.BusCable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buscables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buscables</em>' containment reference list.
	 * @see xPPU.XPPUPackage#getComponents_Buscables()
	 * @model containment="true"
	 * @generated
	 */
	EList<BusCable> getBuscables();

	/**
	 * Returns the value of the '<em><b>Busmasters</b></em>' containment reference list.
	 * The list contents are of type {@link xPPU.BusMaster}.
	 * It is bidirectional and its opposite is '{@link xPPU.BusMaster#getComponentRepostitory <em>Component Repostitory</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Busmasters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Busmasters</em>' containment reference list.
	 * @see xPPU.XPPUPackage#getComponents_Busmasters()
	 * @see xPPU.BusMaster#getComponentRepostitory
	 * @model opposite="componentRepostitory" containment="true"
	 * @generated
	 */
	EList<BusMaster> getBusmasters();

	/**
	 * Returns the value of the '<em><b>Busslaves</b></em>' containment reference list.
	 * The list contents are of type {@link xPPU.BusSlave}.
	 * It is bidirectional and its opposite is '{@link xPPU.BusSlave#getComponentRepository <em>Component Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Busslaves</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Busslaves</em>' containment reference list.
	 * @see xPPU.XPPUPackage#getComponents_Busslaves()
	 * @see xPPU.BusSlave#getComponentRepository
	 * @model opposite="componentRepository" containment="true"
	 * @generated
	 */
	EList<BusSlave> getBusslaves();

	/**
	 * Returns the value of the '<em><b>Busboxes</b></em>' containment reference list.
	 * The list contents are of type {@link xPPU.BusBox}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Busboxes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Busboxes</em>' containment reference list.
	 * @see xPPU.XPPUPackage#getComponents_Busboxes()
	 * @model containment="true"
	 * @generated
	 */
	EList<BusBox> getBusboxes();

	/**
	 * Returns the value of the '<em><b>Cylinders</b></em>' containment reference list.
	 * The list contents are of type {@link xPPU.Cylinder}.
	 * It is bidirectional and its opposite is '{@link xPPU.Cylinder#getComponentRepository <em>Component Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cylinders</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cylinders</em>' containment reference list.
	 * @see xPPU.XPPUPackage#getComponents_Cylinders()
	 * @see xPPU.Cylinder#getComponentRepository
	 * @model opposite="componentRepository" containment="true"
	 * @generated
	 */
	EList<Cylinder> getCylinders();

	/**
	 * Returns the value of the '<em><b>Powercables</b></em>' containment reference list.
	 * The list contents are of type {@link xPPU.PowerCable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Powercables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Powercables</em>' containment reference list.
	 * @see xPPU.XPPUPackage#getComponents_Powercables()
	 * @model containment="true"
	 * @generated
	 */
	EList<PowerCable> getPowercables();

	/**
	 * Returns the value of the '<em><b>Valves</b></em>' containment reference list.
	 * The list contents are of type {@link xPPU.Valve}.
	 * It is bidirectional and its opposite is '{@link xPPU.Valve#getComponentRepository <em>Component Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valves</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valves</em>' containment reference list.
	 * @see xPPU.XPPUPackage#getComponents_Valves()
	 * @see xPPU.Valve#getComponentRepository
	 * @model opposite="componentRepository" containment="true"
	 * @generated
	 */
	EList<Valve> getValves();

	/**
	 * Returns the value of the '<em><b>Mechanicalparts</b></em>' containment reference list.
	 * The list contents are of type {@link xPPU.MechanicalPart}.
	 * It is bidirectional and its opposite is '{@link xPPU.MechanicalPart#getComponentRepository <em>Component Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mechanicalparts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mechanicalparts</em>' containment reference list.
	 * @see xPPU.XPPUPackage#getComponents_Mechanicalparts()
	 * @see xPPU.MechanicalPart#getComponentRepository
	 * @model opposite="componentRepository" containment="true"
	 * @generated
	 */
	EList<MechanicalPart> getMechanicalparts();

	/**
	 * Returns the value of the '<em><b>Powersupplys</b></em>' containment reference list.
	 * The list contents are of type {@link xPPU.PowerSupply}.
	 * It is bidirectional and its opposite is '{@link xPPU.PowerSupply#getComponentRepository <em>Component Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Powersupplys</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Powersupplys</em>' containment reference list.
	 * @see xPPU.XPPUPackage#getComponents_Powersupplys()
	 * @see xPPU.PowerSupply#getComponentRepository
	 * @model opposite="componentRepository" containment="true"
	 * @generated
	 */
	EList<PowerSupply> getPowersupplys();

	/**
	 * Returns the value of the '<em><b>Pushers</b></em>' reference list.
	 * The list contents are of type {@link xPPU.Pusher}.
	 * It is bidirectional and its opposite is '{@link xPPU.Pusher#getComponentsRepository <em>Components Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pushers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pushers</em>' reference list.
	 * @see xPPU.XPPUPackage#getComponents_Pushers()
	 * @see xPPU.Pusher#getComponentsRepository
	 * @model opposite="componentsRepository"
	 * @generated
	 */
	EList<Pusher> getPushers();

	/**
	 * Returns the value of the '<em><b>Corners</b></em>' reference list.
	 * The list contents are of type {@link xPPU.Corner}.
	 * It is bidirectional and its opposite is '{@link xPPU.Corner#getComponentRepository <em>Component Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Corners</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corners</em>' reference list.
	 * @see xPPU.XPPUPackage#getComponents_Corners()
	 * @see xPPU.Corner#getComponentRepository
	 * @model opposite="componentRepository"
	 * @generated
	 */
	EList<Corner> getCorners();

	/**
	 * Returns the value of the '<em><b>Dispensers</b></em>' reference list.
	 * The list contents are of type {@link xPPU.Dispenser}.
	 * It is bidirectional and its opposite is '{@link xPPU.Dispenser#getComponentRepository <em>Component Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dispensers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dispensers</em>' reference list.
	 * @see xPPU.XPPUPackage#getComponents_Dispensers()
	 * @see xPPU.Dispenser#getComponentRepository
	 * @model opposite="componentRepository"
	 * @generated
	 */
	EList<Dispenser> getDispensers();

	/**
	 * Returns the value of the '<em><b>Racks</b></em>' reference list.
	 * The list contents are of type {@link xPPU.Rack}.
	 * It is bidirectional and its opposite is '{@link xPPU.Rack#getComponentRepository <em>Component Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Racks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Racks</em>' reference list.
	 * @see xPPU.XPPUPackage#getComponents_Racks()
	 * @see xPPU.Rack#getComponentRepository
	 * @model opposite="componentRepository"
	 * @generated
	 */
	EList<Rack> getRacks();

	/**
	 * Returns the value of the '<em><b>Tanks</b></em>' reference list.
	 * The list contents are of type {@link xPPU.Tank}.
	 * It is bidirectional and its opposite is '{@link xPPU.Tank#getComponentRepository <em>Component Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tanks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tanks</em>' reference list.
	 * @see xPPU.XPPUPackage#getComponents_Tanks()
	 * @see xPPU.Tank#getComponentRepository
	 * @model opposite="componentRepository"
	 * @generated
	 */
	EList<Tank> getTanks();

	/**
	 * Returns the value of the '<em><b>Splitter</b></em>' reference list.
	 * The list contents are of type {@link xPPU.Splitter}.
	 * It is bidirectional and its opposite is '{@link xPPU.Splitter#getComponentRepository <em>Component Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Splitter</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Splitter</em>' reference list.
	 * @see xPPU.XPPUPackage#getComponents_Splitter()
	 * @see xPPU.Splitter#getComponentRepository
	 * @model opposite="componentRepository"
	 * @generated
	 */
	EList<Splitter> getSplitter();

	/**
	 * Returns the value of the '<em><b>Bottle Seperator</b></em>' reference list.
	 * The list contents are of type {@link xPPU.BottleSeperator}.
	 * It is bidirectional and its opposite is '{@link xPPU.BottleSeperator#getComponentRepository <em>Component Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bottle Seperator</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bottle Seperator</em>' reference list.
	 * @see xPPU.XPPUPackage#getComponents_BottleSeperator()
	 * @see xPPU.BottleSeperator#getComponentRepository
	 * @model opposite="componentRepository"
	 * @generated
	 */
	EList<BottleSeperator> getBottleSeperator();

	/**
	 * Returns the value of the '<em><b>Panels</b></em>' reference list.
	 * The list contents are of type {@link xPPU.Panel}.
	 * It is bidirectional and its opposite is '{@link xPPU.Panel#getComponentRepository <em>Component Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Panels</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Panels</em>' reference list.
	 * @see xPPU.XPPUPackage#getComponents_Panels()
	 * @see xPPU.Panel#getComponentRepository
	 * @model opposite="componentRepository"
	 * @generated
	 */
	EList<Panel> getPanels();

	/**
	 * Returns the value of the '<em><b>Cables</b></em>' reference list.
	 * The list contents are of type {@link xPPU.Cable}.
	 * It is bidirectional and its opposite is '{@link xPPU.Cable#getComponentRepository <em>Component Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cables</em>' reference list.
	 * @see xPPU.XPPUPackage#getComponents_Cables()
	 * @see xPPU.Cable#getComponentRepository
	 * @model opposite="componentRepository"
	 * @generated
	 */
	EList<Cable> getCables();

} // Components
