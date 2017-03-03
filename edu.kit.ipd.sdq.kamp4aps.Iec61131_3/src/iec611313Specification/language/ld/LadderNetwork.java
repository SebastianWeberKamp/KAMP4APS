/**
 */
package iec611313Specification.language.ld;

import iec611313Specification.common.Label;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ladder Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.language.ld.LadderNetwork#getHasLDNetworkLabel <em>Has LD Network Label</em>}</li>
 *   <li>{@link iec611313Specification.language.ld.LadderNetwork#getContainsPowerFlowLine <em>Contains Power Flow Line</em>}</li>
 *   <li>{@link iec611313Specification.language.ld.LadderNetwork#getContainsLDElement <em>Contains LD Element</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.language.ld.LdPackage#getLadderNetwork()
 * @model
 * @generated
 */
public interface LadderNetwork extends EObject {
	/**
	 * Returns the value of the '<em><b>Has LD Network Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has LD Network Label</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has LD Network Label</em>' reference.
	 * @see #setHasLDNetworkLabel(Label)
	 * @see iec611313Specification.language.ld.LdPackage#getLadderNetwork_HasLDNetworkLabel()
	 * @model
	 * @generated
	 */
	Label getHasLDNetworkLabel();

	/**
	 * Sets the value of the '{@link iec611313Specification.language.ld.LadderNetwork#getHasLDNetworkLabel <em>Has LD Network Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has LD Network Label</em>' reference.
	 * @see #getHasLDNetworkLabel()
	 * @generated
	 */
	void setHasLDNetworkLabel(Label value);

	/**
	 * Returns the value of the '<em><b>Contains Power Flow Line</b></em>' containment reference list.
	 * The list contents are of type {@link iec611313Specification.language.ld.PowerFlowLine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Power Flow Line</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Power Flow Line</em>' containment reference list.
	 * @see iec611313Specification.language.ld.LdPackage#getLadderNetwork_ContainsPowerFlowLine()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PowerFlowLine> getContainsPowerFlowLine();

	/**
	 * Returns the value of the '<em><b>Contains LD Element</b></em>' containment reference list.
	 * The list contents are of type {@link iec611313Specification.language.ld.LDElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains LD Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains LD Element</em>' containment reference list.
	 * @see iec611313Specification.language.ld.LdPackage#getLadderNetwork_ContainsLDElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<LDElement> getContainsLDElement();

} // LadderNetwork
