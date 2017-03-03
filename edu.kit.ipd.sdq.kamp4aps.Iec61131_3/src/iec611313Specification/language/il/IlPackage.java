/**
 */
package iec611313Specification.language.il;

import iec611313Specification.common.pous.functions.FunctionsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see iec611313Specification.language.il.IlFactory
 * @model kind="package"
 * @generated
 */
public interface IlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "il";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.kit.edu/iec611313/language/il";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "il";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IlPackage eINSTANCE = iec611313Specification.language.il.impl.IlPackageImpl.init();

	/**
	 * The meta object id for the '{@link iec611313Specification.language.il.impl.InstructionImpl <em>Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.language.il.impl.InstructionImpl
	 * @see iec611313Specification.language.il.impl.IlPackageImpl#getInstruction()
	 * @generated
	 */
	int INSTRUCTION = 1;

	/**
	 * The feature id for the '<em><b>Has Instruction Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__HAS_INSTRUCTION_LABEL = 0;

	/**
	 * The number of structural features of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.language.il.impl.ComplexInstructionImpl <em>Complex Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.language.il.impl.ComplexInstructionImpl
	 * @see iec611313Specification.language.il.impl.IlPackageImpl#getComplexInstruction()
	 * @generated
	 */
	int COMPLEX_INSTRUCTION = 0;

	/**
	 * The feature id for the '<em><b>Has Instruction Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_INSTRUCTION__HAS_INSTRUCTION_LABEL = INSTRUCTION__HAS_INSTRUCTION_LABEL;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_INSTRUCTION__OPERATOR = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Complex Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_INSTRUCTION__HAS_COMPLEX_OPERAND = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Complex Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_INSTRUCTION_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Complex Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_INSTRUCTION_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.language.il.impl.InstructionListImpl <em>Instruction List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.language.il.impl.InstructionListImpl
	 * @see iec611313Specification.language.il.impl.IlPackageImpl#getInstructionList()
	 * @generated
	 */
	int INSTRUCTION_LIST = 2;

	/**
	 * The feature id for the '<em><b>Contains Instruction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_LIST__CONTAINS_INSTRUCTION = FunctionsPackage.FUNCTION_BODY_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Instruction List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_LIST_FEATURE_COUNT = FunctionsPackage.FUNCTION_BODY_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Instruction List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_LIST_OPERATION_COUNT = FunctionsPackage.FUNCTION_BODY_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.language.il.impl.JumpInstructionImpl <em>Jump Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.language.il.impl.JumpInstructionImpl
	 * @see iec611313Specification.language.il.impl.IlPackageImpl#getJumpInstruction()
	 * @generated
	 */
	int JUMP_INSTRUCTION = 3;

	/**
	 * The feature id for the '<em><b>Has Instruction Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_INSTRUCTION__HAS_INSTRUCTION_LABEL = INSTRUCTION__HAS_INSTRUCTION_LABEL;

	/**
	 * The feature id for the '<em><b>Has Jump Instruction Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_INSTRUCTION__HAS_JUMP_INSTRUCTION_TARGET = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Jump Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_INSTRUCTION_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Jump Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_INSTRUCTION_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.language.il.impl.ReturnInstructionImpl <em>Return Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.language.il.impl.ReturnInstructionImpl
	 * @see iec611313Specification.language.il.impl.IlPackageImpl#getReturnInstruction()
	 * @generated
	 */
	int RETURN_INSTRUCTION = 4;

	/**
	 * The feature id for the '<em><b>Has Instruction Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_INSTRUCTION__HAS_INSTRUCTION_LABEL = INSTRUCTION__HAS_INSTRUCTION_LABEL;

	/**
	 * The number of structural features of the '<em>Return Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_INSTRUCTION_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Return Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_INSTRUCTION_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iec611313Specification.language.il.impl.SimpleInstructionImpl <em>Simple Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iec611313Specification.language.il.impl.SimpleInstructionImpl
	 * @see iec611313Specification.language.il.impl.IlPackageImpl#getSimpleInstruction()
	 * @generated
	 */
	int SIMPLE_INSTRUCTION = 5;

	/**
	 * The feature id for the '<em><b>Has Instruction Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_INSTRUCTION__HAS_INSTRUCTION_LABEL = INSTRUCTION__HAS_INSTRUCTION_LABEL;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_INSTRUCTION__OPERATOR = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_INSTRUCTION__HAS_OPERAND = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Simple Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_INSTRUCTION_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Simple Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_INSTRUCTION_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link iec611313Specification.language.il.ComplexInstruction <em>Complex Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Instruction</em>'.
	 * @see iec611313Specification.language.il.ComplexInstruction
	 * @generated
	 */
	EClass getComplexInstruction();

	/**
	 * Returns the meta object for the attribute '{@link iec611313Specification.language.il.ComplexInstruction#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see iec611313Specification.language.il.ComplexInstruction#getOperator()
	 * @see #getComplexInstruction()
	 * @generated
	 */
	EAttribute getComplexInstruction_Operator();

	/**
	 * Returns the meta object for the reference '{@link iec611313Specification.language.il.ComplexInstruction#getHasComplexOperand <em>Has Complex Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Complex Operand</em>'.
	 * @see iec611313Specification.language.il.ComplexInstruction#getHasComplexOperand()
	 * @see #getComplexInstruction()
	 * @generated
	 */
	EReference getComplexInstruction_HasComplexOperand();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.language.il.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction</em>'.
	 * @see iec611313Specification.language.il.Instruction
	 * @generated
	 */
	EClass getInstruction();

	/**
	 * Returns the meta object for the reference '{@link iec611313Specification.language.il.Instruction#getHasInstructionLabel <em>Has Instruction Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Instruction Label</em>'.
	 * @see iec611313Specification.language.il.Instruction#getHasInstructionLabel()
	 * @see #getInstruction()
	 * @generated
	 */
	EReference getInstruction_HasInstructionLabel();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.language.il.InstructionList <em>Instruction List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction List</em>'.
	 * @see iec611313Specification.language.il.InstructionList
	 * @generated
	 */
	EClass getInstructionList();

	/**
	 * Returns the meta object for the containment reference list '{@link iec611313Specification.language.il.InstructionList#getContainsInstruction <em>Contains Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Instruction</em>'.
	 * @see iec611313Specification.language.il.InstructionList#getContainsInstruction()
	 * @see #getInstructionList()
	 * @generated
	 */
	EReference getInstructionList_ContainsInstruction();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.language.il.JumpInstruction <em>Jump Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jump Instruction</em>'.
	 * @see iec611313Specification.language.il.JumpInstruction
	 * @generated
	 */
	EClass getJumpInstruction();

	/**
	 * Returns the meta object for the reference '{@link iec611313Specification.language.il.JumpInstruction#getHasJumpInstructionTarget <em>Has Jump Instruction Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Jump Instruction Target</em>'.
	 * @see iec611313Specification.language.il.JumpInstruction#getHasJumpInstructionTarget()
	 * @see #getJumpInstruction()
	 * @generated
	 */
	EReference getJumpInstruction_HasJumpInstructionTarget();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.language.il.ReturnInstruction <em>Return Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Instruction</em>'.
	 * @see iec611313Specification.language.il.ReturnInstruction
	 * @generated
	 */
	EClass getReturnInstruction();

	/**
	 * Returns the meta object for class '{@link iec611313Specification.language.il.SimpleInstruction <em>Simple Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Instruction</em>'.
	 * @see iec611313Specification.language.il.SimpleInstruction
	 * @generated
	 */
	EClass getSimpleInstruction();

	/**
	 * Returns the meta object for the attribute '{@link iec611313Specification.language.il.SimpleInstruction#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see iec611313Specification.language.il.SimpleInstruction#getOperator()
	 * @see #getSimpleInstruction()
	 * @generated
	 */
	EAttribute getSimpleInstruction_Operator();

	/**
	 * Returns the meta object for the reference '{@link iec611313Specification.language.il.SimpleInstruction#getHasOperand <em>Has Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Operand</em>'.
	 * @see iec611313Specification.language.il.SimpleInstruction#getHasOperand()
	 * @see #getSimpleInstruction()
	 * @generated
	 */
	EReference getSimpleInstruction_HasOperand();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IlFactory getIlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link iec611313Specification.language.il.impl.ComplexInstructionImpl <em>Complex Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.language.il.impl.ComplexInstructionImpl
		 * @see iec611313Specification.language.il.impl.IlPackageImpl#getComplexInstruction()
		 * @generated
		 */
		EClass COMPLEX_INSTRUCTION = eINSTANCE.getComplexInstruction();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_INSTRUCTION__OPERATOR = eINSTANCE.getComplexInstruction_Operator();

		/**
		 * The meta object literal for the '<em><b>Has Complex Operand</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_INSTRUCTION__HAS_COMPLEX_OPERAND = eINSTANCE.getComplexInstruction_HasComplexOperand();

		/**
		 * The meta object literal for the '{@link iec611313Specification.language.il.impl.InstructionImpl <em>Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.language.il.impl.InstructionImpl
		 * @see iec611313Specification.language.il.impl.IlPackageImpl#getInstruction()
		 * @generated
		 */
		EClass INSTRUCTION = eINSTANCE.getInstruction();

		/**
		 * The meta object literal for the '<em><b>Has Instruction Label</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION__HAS_INSTRUCTION_LABEL = eINSTANCE.getInstruction_HasInstructionLabel();

		/**
		 * The meta object literal for the '{@link iec611313Specification.language.il.impl.InstructionListImpl <em>Instruction List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.language.il.impl.InstructionListImpl
		 * @see iec611313Specification.language.il.impl.IlPackageImpl#getInstructionList()
		 * @generated
		 */
		EClass INSTRUCTION_LIST = eINSTANCE.getInstructionList();

		/**
		 * The meta object literal for the '<em><b>Contains Instruction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION_LIST__CONTAINS_INSTRUCTION = eINSTANCE.getInstructionList_ContainsInstruction();

		/**
		 * The meta object literal for the '{@link iec611313Specification.language.il.impl.JumpInstructionImpl <em>Jump Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.language.il.impl.JumpInstructionImpl
		 * @see iec611313Specification.language.il.impl.IlPackageImpl#getJumpInstruction()
		 * @generated
		 */
		EClass JUMP_INSTRUCTION = eINSTANCE.getJumpInstruction();

		/**
		 * The meta object literal for the '<em><b>Has Jump Instruction Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JUMP_INSTRUCTION__HAS_JUMP_INSTRUCTION_TARGET = eINSTANCE.getJumpInstruction_HasJumpInstructionTarget();

		/**
		 * The meta object literal for the '{@link iec611313Specification.language.il.impl.ReturnInstructionImpl <em>Return Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.language.il.impl.ReturnInstructionImpl
		 * @see iec611313Specification.language.il.impl.IlPackageImpl#getReturnInstruction()
		 * @generated
		 */
		EClass RETURN_INSTRUCTION = eINSTANCE.getReturnInstruction();

		/**
		 * The meta object literal for the '{@link iec611313Specification.language.il.impl.SimpleInstructionImpl <em>Simple Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iec611313Specification.language.il.impl.SimpleInstructionImpl
		 * @see iec611313Specification.language.il.impl.IlPackageImpl#getSimpleInstruction()
		 * @generated
		 */
		EClass SIMPLE_INSTRUCTION = eINSTANCE.getSimpleInstruction();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_INSTRUCTION__OPERATOR = eINSTANCE.getSimpleInstruction_Operator();

		/**
		 * The meta object literal for the '<em><b>Has Operand</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_INSTRUCTION__HAS_OPERAND = eINSTANCE.getSimpleInstruction_HasOperand();

	}

} //IlPackage
