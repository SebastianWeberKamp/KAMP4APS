/**
 */
package xPPU.StructureRepository;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see xPPU.StructureRepository.StructureRepositoryPackage
 * @generated
 */
public interface StructureRepositoryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StructureRepositoryFactory eINSTANCE = xPPU.StructureRepository.impl.StructureRepositoryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Communication Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication Network</em>'.
	 * @generated
	 */
	CommunicationNetwork createCommunicationNetwork();

	/**
	 * Returns a new object of class '<em>Power Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Power Network</em>'.
	 * @generated
	 */
	PowerNetwork createPowerNetwork();

	/**
	 * Returns a new object of class '<em>Control Cabinet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Cabinet</em>'.
	 * @generated
	 */
	ControlCabinet createControlCabinet();

	/**
	 * Returns a new object of class '<em>Pneumatic Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pneumatic Network</em>'.
	 * @generated
	 */
	PneumaticNetwork createPneumaticNetwork();

	/**
	 * Returns a new object of class '<em>Conveyor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conveyor</em>'.
	 * @generated
	 */
	Conveyor createConveyor();

	/**
	 * Returns a new object of class '<em>Crane</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Crane</em>'.
	 * @generated
	 */
	Crane createCrane();

	/**
	 * Returns a new object of class '<em>Power Wiring</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Power Wiring</em>'.
	 * @generated
	 */
	PowerWiring createPowerWiring();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StructureRepositoryPackage getStructureRepositoryPackage();

} //StructureRepositoryFactory
