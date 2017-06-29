/**
 */
package ComponentInternalDependencies;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ComponentInternalDependencies.ComponentInternalDependenciesRepository#getHasFunctionblockDependency <em>Has Functionblock Dependency</em>}</li>
 * </ul>
 *
 * @see ComponentInternalDependencies.ComponentInternalDependenciesPackage#getComponentInternalDependenciesRepository()
 * @model
 * @generated
 */
public interface ComponentInternalDependenciesRepository extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Functionblock Dependency</b></em>' containment reference list.
	 * The list contents are of type {@link ComponentInternalDependencies.FunctionblockDependency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Functionblock Dependency</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Functionblock Dependency</em>' containment reference list.
	 * @see ComponentInternalDependencies.ComponentInternalDependenciesPackage#getComponentInternalDependenciesRepository_HasFunctionblockDependency()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionblockDependency> getHasFunctionblockDependency();

} // ComponentInternalDependenciesRepository
