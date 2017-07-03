/**
 */
package edu.kit.ipd.sdq.kamp4aps.iec.ComponentInternalDependencies;

import edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.FunctionBlock;
import edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IFunctionblock;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functionblock Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.iec.ComponentInternalDependencies.FunctionblockDependency#getProvidedFunctionBlock <em>Provided Function Block</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.iec.ComponentInternalDependencies.FunctionblockDependency#getRequiredResource <em>Required Resource</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.iec.ComponentInternalDependencies.FunctionblockDependency#getHasMethodDependency <em>Has Method Dependency</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps.iec.ComponentInternalDependencies.ComponentInternalDependenciesPackage#getFunctionblockDependency()
 * @model
 * @generated
 */
public interface FunctionblockDependency extends EObject {
	/**
	 * Returns the value of the '<em><b>Provided Function Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Function Block</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Function Block</em>' reference.
	 * @see #setProvidedFunctionBlock(FunctionBlock)
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.ComponentInternalDependencies.ComponentInternalDependenciesPackage#getFunctionblockDependency_ProvidedFunctionBlock()
	 * @model required="true"
	 * @generated
	 */
	FunctionBlock getProvidedFunctionBlock();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.iec.ComponentInternalDependencies.FunctionblockDependency#getProvidedFunctionBlock <em>Provided Function Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided Function Block</em>' reference.
	 * @see #getProvidedFunctionBlock()
	 * @generated
	 */
	void setProvidedFunctionBlock(FunctionBlock value);

	/**
	 * Returns the value of the '<em><b>Required Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Resource</em>' reference.
	 * @see #setRequiredResource(IFunctionblock)
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.ComponentInternalDependencies.ComponentInternalDependenciesPackage#getFunctionblockDependency_RequiredResource()
	 * @model required="true"
	 * @generated
	 */
	IFunctionblock getRequiredResource();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.iec.ComponentInternalDependencies.FunctionblockDependency#getRequiredResource <em>Required Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Resource</em>' reference.
	 * @see #getRequiredResource()
	 * @generated
	 */
	void setRequiredResource(IFunctionblock value);

	/**
	 * Returns the value of the '<em><b>Has Method Dependency</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.iec.ComponentInternalDependencies.MethodDependency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Method Dependency</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Method Dependency</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.ComponentInternalDependencies.ComponentInternalDependenciesPackage#getFunctionblockDependency_HasMethodDependency()
	 * @model containment="true"
	 * @generated
	 */
	EList<MethodDependency> getHasMethodDependency();

} // FunctionblockDependency
