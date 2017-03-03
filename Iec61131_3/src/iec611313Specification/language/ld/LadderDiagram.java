/**
 */
package iec611313Specification.language.ld;

import iec611313Specification.common.pous.function_blocks.FunctionBlockBodySpecification;

import iec611313Specification.common.pous.functions.FunctionBodySpecification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ladder Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.language.ld.LadderDiagram#getContainsLadderNetwork <em>Contains Ladder Network</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.language.ld.LdPackage#getLadderDiagram()
 * @model
 * @generated
 */
public interface LadderDiagram extends FunctionBodySpecification, FunctionBlockBodySpecification {
	/**
	 * Returns the value of the '<em><b>Contains Ladder Network</b></em>' containment reference list.
	 * The list contents are of type {@link iec611313Specification.language.ld.LadderNetwork}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Ladder Network</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Ladder Network</em>' containment reference list.
	 * @see iec611313Specification.language.ld.LdPackage#getLadderDiagram_ContainsLadderNetwork()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<LadderNetwork> getContainsLadderNetwork();

} // LadderDiagram
