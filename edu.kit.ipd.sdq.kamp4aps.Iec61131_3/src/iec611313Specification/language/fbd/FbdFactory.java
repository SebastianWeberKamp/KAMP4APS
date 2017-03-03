/**
 */
package iec611313Specification.language.fbd;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see iec611313Specification.language.fbd.FbdPackage
 * @generated
 */
public interface FbdFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FbdFactory eINSTANCE = iec611313Specification.language.fbd.impl.FbdFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Function Block Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Block Diagram</em>'.
	 * @generated
	 */
	FunctionBlockDiagram createFunctionBlockDiagram();

	/**
	 * Returns a new object of class '<em>Function Block Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Block Network</em>'.
	 * @generated
	 */
	FunctionBlockNetwork createFunctionBlockNetwork();

	/**
	 * Returns a new object of class '<em>Signal Flow Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signal Flow Line</em>'.
	 * @generated
	 */
	SignalFlowLine createSignalFlowLine();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FbdPackage getFbdPackage();

} //FbdFactory
