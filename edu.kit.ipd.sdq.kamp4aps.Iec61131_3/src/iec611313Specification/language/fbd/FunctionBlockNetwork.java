/**
 */
package iec611313Specification.language.fbd;

import iec611313Specification.common.Label;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Block Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.language.fbd.FunctionBlockNetwork#getHasFBDNetworkLabel <em>Has FBD Network Label</em>}</li>
 *   <li>{@link iec611313Specification.language.fbd.FunctionBlockNetwork#getContainsFBDElement <em>Contains FBD Element</em>}</li>
 *   <li>{@link iec611313Specification.language.fbd.FunctionBlockNetwork#getContainsSignalFlowLine <em>Contains Signal Flow Line</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.language.fbd.FbdPackage#getFunctionBlockNetwork()
 * @model
 * @generated
 */
public interface FunctionBlockNetwork extends EObject {
	/**
	 * Returns the value of the '<em><b>Has FBD Network Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has FBD Network Label</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has FBD Network Label</em>' reference.
	 * @see #setHasFBDNetworkLabel(Label)
	 * @see iec611313Specification.language.fbd.FbdPackage#getFunctionBlockNetwork_HasFBDNetworkLabel()
	 * @model
	 * @generated
	 */
	Label getHasFBDNetworkLabel();

	/**
	 * Sets the value of the '{@link iec611313Specification.language.fbd.FunctionBlockNetwork#getHasFBDNetworkLabel <em>Has FBD Network Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has FBD Network Label</em>' reference.
	 * @see #getHasFBDNetworkLabel()
	 * @generated
	 */
	void setHasFBDNetworkLabel(Label value);

	/**
	 * Returns the value of the '<em><b>Contains FBD Element</b></em>' containment reference list.
	 * The list contents are of type {@link iec611313Specification.language.fbd.FBDElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains FBD Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains FBD Element</em>' containment reference list.
	 * @see iec611313Specification.language.fbd.FbdPackage#getFunctionBlockNetwork_ContainsFBDElement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<FBDElement> getContainsFBDElement();

	/**
	 * Returns the value of the '<em><b>Contains Signal Flow Line</b></em>' containment reference list.
	 * The list contents are of type {@link iec611313Specification.language.fbd.SignalFlowLine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Signal Flow Line</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Signal Flow Line</em>' containment reference list.
	 * @see iec611313Specification.language.fbd.FbdPackage#getFunctionBlockNetwork_ContainsSignalFlowLine()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SignalFlowLine> getContainsSignalFlowLine();

} // FunctionBlockNetwork
