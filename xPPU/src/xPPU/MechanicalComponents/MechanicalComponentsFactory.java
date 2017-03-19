/**
 */
package xPPU.MechanicalComponents;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see xPPU.MechanicalComponents.MechanicalComponentsPackage
 * @generated
 */
public interface MechanicalComponentsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MechanicalComponentsFactory eINSTANCE = xPPU.MechanicalComponents.impl.MechanicalComponentsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Housing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Housing</em>'.
	 * @generated
	 */
	Housing createHousing();

	/**
	 * Returns a new object of class '<em>Return Spring</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Spring</em>'.
	 * @generated
	 */
	ReturnSpring createReturnSpring();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MechanicalComponentsPackage getMechanicalComponentsPackage();

} //MechanicalComponentsFactory
