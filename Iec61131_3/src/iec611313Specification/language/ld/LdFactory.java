/**
 */
package iec611313Specification.language.ld;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see iec611313Specification.language.ld.LdPackage
 * @generated
 */
public interface LdFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LdFactory eINSTANCE = iec611313Specification.language.ld.impl.LdFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Coil</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coil</em>'.
	 * @generated
	 */
	Coil createCoil();

	/**
	 * Returns a new object of class '<em>Contact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contact</em>'.
	 * @generated
	 */
	Contact createContact();

	/**
	 * Returns a new object of class '<em>Ladder Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ladder Diagram</em>'.
	 * @generated
	 */
	LadderDiagram createLadderDiagram();

	/**
	 * Returns a new object of class '<em>Ladder Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ladder Network</em>'.
	 * @generated
	 */
	LadderNetwork createLadderNetwork();

	/**
	 * Returns a new object of class '<em>Power Flow Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Power Flow Line</em>'.
	 * @generated
	 */
	PowerFlowLine createPowerFlowLine();

	/**
	 * Returns a new object of class '<em>Power Rail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Power Rail</em>'.
	 * @generated
	 */
	PowerRail createPowerRail();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LdPackage getLdPackage();

} //LdFactory
