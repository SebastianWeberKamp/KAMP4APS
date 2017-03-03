/**
 */
package iec611313Specification.language.fbd;

import iec611313Specification.common.pous.function_blocks.FunctionBlockBodySpecification;

import iec611313Specification.common.pous.functions.FunctionBodySpecification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Block Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.language.fbd.FunctionBlockDiagram#getContainsFBDNetwork <em>Contains FBD Network</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.language.fbd.FbdPackage#getFunctionBlockDiagram()
 * @model
 * @generated
 */
public interface FunctionBlockDiagram extends FunctionBodySpecification, FunctionBlockBodySpecification {
	/**
	 * Returns the value of the '<em><b>Contains FBD Network</b></em>' containment reference list.
	 * The list contents are of type {@link iec611313Specification.language.fbd.FunctionBlockNetwork}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains FBD Network</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains FBD Network</em>' containment reference list.
	 * @see iec611313Specification.language.fbd.FbdPackage#getFunctionBlockDiagram_ContainsFBDNetwork()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<FunctionBlockNetwork> getContainsFBDNetwork();

} // FunctionBlockDiagram
