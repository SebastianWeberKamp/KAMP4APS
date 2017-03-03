/**
 */
package iec611313Specification.common.pous.function_blocks.util;

import iec611313Specification.common.pous.function_blocks.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see iec611313Specification.common.pous.function_blocks.Function_blocksPackage
 * @generated
 */
public class Function_blocksValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Function_blocksValidator INSTANCE = new Function_blocksValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "iec611313Specification.common.pous.function_blocks";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function_blocksValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return Function_blocksPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case Function_blocksPackage.FUNCTION_BLOCK_BODY_SPECIFICATION:
				return validateFunctionBlockBodySpecification((FunctionBlockBodySpecification)value, diagnostics, context);
			case Function_blocksPackage.FUNCTION_BLOCK_INVOCATION:
				return validateFunctionBlockInvocation((FunctionBlockInvocation)value, diagnostics, context);
			case Function_blocksPackage.FUNCTION_BLOCK_TYPE:
				return validateFunctionBlockType((FunctionBlockType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionBlockBodySpecification(FunctionBlockBodySpecification functionBlockBodySpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(functionBlockBodySpecification, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionBlockInvocation(FunctionBlockInvocation functionBlockInvocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(functionBlockInvocation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionBlockType(FunctionBlockType functionBlockType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(functionBlockType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(functionBlockType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(functionBlockType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(functionBlockType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(functionBlockType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(functionBlockType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(functionBlockType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(functionBlockType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(functionBlockType, diagnostics, context);
		if (result || diagnostics != null) result &= validateFunctionBlockType_hasValidVariableDeclarations(functionBlockType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the hasValidVariableDeclarations constraint of '<em>Function Block Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionBlockType_hasValidVariableDeclarations(FunctionBlockType functionBlockType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "hasValidVariableDeclarations", getObjectLabel(functionBlockType, context) },
						 new Object[] { functionBlockType },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Function_blocksValidator
