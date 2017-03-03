/**
 */
package iec611313Specification.language.il;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see iec611313Specification.language.il.IlPackage
 * @generated
 */
public interface IlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IlFactory eINSTANCE = iec611313Specification.language.il.impl.IlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Complex Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complex Instruction</em>'.
	 * @generated
	 */
	ComplexInstruction createComplexInstruction();

	/**
	 * Returns a new object of class '<em>Instruction List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instruction List</em>'.
	 * @generated
	 */
	InstructionList createInstructionList();

	/**
	 * Returns a new object of class '<em>Jump Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jump Instruction</em>'.
	 * @generated
	 */
	JumpInstruction createJumpInstruction();

	/**
	 * Returns a new object of class '<em>Return Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Instruction</em>'.
	 * @generated
	 */
	ReturnInstruction createReturnInstruction();

	/**
	 * Returns a new object of class '<em>Simple Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Instruction</em>'.
	 * @generated
	 */
	SimpleInstruction createSimpleInstruction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IlPackage getIlPackage();

} //IlFactory
