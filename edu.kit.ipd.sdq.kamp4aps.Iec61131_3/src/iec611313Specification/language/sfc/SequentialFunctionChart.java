/**
 */
package iec611313Specification.language.sfc;

import iec611313Specification.common.pous.function_blocks.FunctionBlockBodySpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequential Function Chart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.language.sfc.SequentialFunctionChart#getHasInitialStep <em>Has Initial Step</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.language.sfc.SfcPackage#getSequentialFunctionChart()
 * @model
 * @generated
 */
public interface SequentialFunctionChart extends FunctionBlockBodySpecification {
	/**
	 * Returns the value of the '<em><b>Has Initial Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Initial Step</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Initial Step</em>' reference.
	 * @see #setHasInitialStep(Step)
	 * @see iec611313Specification.language.sfc.SfcPackage#getSequentialFunctionChart_HasInitialStep()
	 * @model required="true"
	 * @generated
	 */
	Step getHasInitialStep();

	/**
	 * Sets the value of the '{@link iec611313Specification.language.sfc.SequentialFunctionChart#getHasInitialStep <em>Has Initial Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Initial Step</em>' reference.
	 * @see #getHasInitialStep()
	 * @generated
	 */
	void setHasInitialStep(Step value);

} // SequentialFunctionChart
