/**
 */
package xPPU.ModuleRepository;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see xPPU.ModuleRepository.ModuleRepositoryPackage
 * @generated
 */
public interface ModuleRepositoryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModuleRepositoryFactory eINSTANCE = xPPU.ModuleRepository.impl.ModuleRepositoryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module</em>'.
	 * @generated
	 */
	Module createModule();

	/**
	 * Returns a new object of class '<em>Ramp Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ramp Module</em>'.
	 * @generated
	 */
	RampModule createRampModule();

	/**
	 * Returns a new object of class '<em>Pusher Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pusher Module</em>'.
	 * @generated
	 */
	PusherModule createPusherModule();

	/**
	 * Returns a new object of class '<em>Motor Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Motor Module</em>'.
	 * @generated
	 */
	MotorModule createMotorModule();

	/**
	 * Returns a new object of class '<em>Sensor Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor Module</em>'.
	 * @generated
	 */
	SensorModule createSensorModule();

	/**
	 * Returns a new object of class '<em>Optical Sensor Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Optical Sensor Module</em>'.
	 * @generated
	 */
	OpticalSensorModule createOpticalSensorModule();

	/**
	 * Returns a new object of class '<em>Inductive Sensor Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inductive Sensor Module</em>'.
	 * @generated
	 */
	InductiveSensorModule createInductiveSensorModule();

	/**
	 * Returns a new object of class '<em>Presence Sensor Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Presence Sensor Module</em>'.
	 * @generated
	 */
	PresenceSensorModule createPresenceSensorModule();

	/**
	 * Returns a new object of class '<em>Pressure Sensor Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pressure Sensor Module</em>'.
	 * @generated
	 */
	PressureSensorModule createPressureSensorModule();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModuleRepositoryPackage getModuleRepositoryPackage();

} //ModuleRepositoryFactory
