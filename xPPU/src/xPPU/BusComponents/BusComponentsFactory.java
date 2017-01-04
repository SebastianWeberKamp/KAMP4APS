/**
 */
package xPPU.BusComponents;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see xPPU.BusComponents.BusComponentsPackage
 * @generated
 */
public interface BusComponentsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BusComponentsFactory eINSTANCE = xPPU.BusComponents.impl.BusComponentsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Bus Cable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bus Cable</em>'.
	 * @generated
	 */
	BusCable createBusCable();

	/**
	 * Returns a new object of class '<em>Bus Master</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bus Master</em>'.
	 * @generated
	 */
	BusMaster createBusMaster();

	/**
	 * Returns a new object of class '<em>Profibus DP Master</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Profibus DP Master</em>'.
	 * @generated
	 */
	ProfibusDPMaster createProfibusDPMaster();

	/**
	 * Returns a new object of class '<em>Bus Slave</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bus Slave</em>'.
	 * @generated
	 */
	BusSlave createBusSlave();

	/**
	 * Returns a new object of class '<em>Profibus DP Slave</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Profibus DP Slave</em>'.
	 * @generated
	 */
	ProfibusDPSlave createProfibusDPSlave();

	/**
	 * Returns a new object of class '<em>Bus Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bus Box</em>'.
	 * @generated
	 */
	BusBox createBusBox();

	/**
	 * Returns a new object of class '<em>Profibus DP Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Profibus DP Box</em>'.
	 * @generated
	 */
	ProfibusDPBox createProfibusDPBox();

	/**
	 * Returns a new object of class '<em>Profibus DP Cable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Profibus DP Cable</em>'.
	 * @generated
	 */
	ProfibusDPCable createProfibusDPCable();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BusComponentsPackage getBusComponentsPackage();

} //BusComponentsFactory
