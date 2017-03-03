/**
 */
package iec611313Specification.common.pous.function_blocks;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see iec611313Specification.common.pous.function_blocks.Function_blocksPackage
 * @generated
 */
public interface Function_blocksFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Function_blocksFactory eINSTANCE = iec611313Specification.common.pous.function_blocks.impl.Function_blocksFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Function Block Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Block Invocation</em>'.
	 * @generated
	 */
	FunctionBlockInvocation createFunctionBlockInvocation();

	/**
	 * Returns a new object of class '<em>Function Block Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Block Type</em>'.
	 * @generated
	 */
	FunctionBlockType createFunctionBlockType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Function_blocksPackage getFunction_blocksPackage();

} //Function_blocksFactory
