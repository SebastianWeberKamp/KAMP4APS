/**
 */
package iec611313Specification.common.pous.programs.impl;

import iec611313Specification.common.pous.programs.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProgramsFactoryImpl extends EFactoryImpl implements ProgramsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProgramsFactory init() {
		try {
			ProgramsFactory theProgramsFactory = (ProgramsFactory)EPackage.Registry.INSTANCE.getEFactory(ProgramsPackage.eNS_URI);
			if (theProgramsFactory != null) {
				return theProgramsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProgramsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ProgramsPackage.FUNCTION_BLOCK_INSTANCE_TASK_ASSIGNMENT: return createFunctionBlockInstanceTaskAssignment();
			case ProgramsPackage.PROGRAM_CONFIGURATION: return createProgramConfiguration();
			case ProgramsPackage.PROGRAM_TYPE: return createProgramType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBlockInstanceTaskAssignment createFunctionBlockInstanceTaskAssignment() {
		FunctionBlockInstanceTaskAssignmentImpl functionBlockInstanceTaskAssignment = new FunctionBlockInstanceTaskAssignmentImpl();
		return functionBlockInstanceTaskAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramConfiguration createProgramConfiguration() {
		ProgramConfigurationImpl programConfiguration = new ProgramConfigurationImpl();
		return programConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramType createProgramType() {
		ProgramTypeImpl programType = new ProgramTypeImpl();
		return programType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramsPackage getProgramsPackage() {
		return (ProgramsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProgramsPackage getPackage() {
		return ProgramsPackage.eINSTANCE;
	}

} //ProgramsFactoryImpl
