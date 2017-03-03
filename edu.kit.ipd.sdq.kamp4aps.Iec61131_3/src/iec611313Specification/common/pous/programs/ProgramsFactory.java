/**
 */
package iec611313Specification.common.pous.programs;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see iec611313Specification.common.pous.programs.ProgramsPackage
 * @generated
 */
public interface ProgramsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProgramsFactory eINSTANCE = iec611313Specification.common.pous.programs.impl.ProgramsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Function Block Instance Task Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Block Instance Task Assignment</em>'.
	 * @generated
	 */
	FunctionBlockInstanceTaskAssignment createFunctionBlockInstanceTaskAssignment();

	/**
	 * Returns a new object of class '<em>Program Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Program Configuration</em>'.
	 * @generated
	 */
	ProgramConfiguration createProgramConfiguration();

	/**
	 * Returns a new object of class '<em>Program Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Program Type</em>'.
	 * @generated
	 */
	ProgramType createProgramType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ProgramsPackage getProgramsPackage();

} //ProgramsFactory
