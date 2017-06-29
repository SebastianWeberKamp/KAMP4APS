/**
 */
package ComponentInternalDependencies;

import IECRepository.IECMethodImplementation;
import IECRepository.IResource;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ComponentInternalDependencies.MethodDependency#getRequiredResource <em>Required Resource</em>}</li>
 *   <li>{@link ComponentInternalDependencies.MethodDependency#getProvidedMethod <em>Provided Method</em>}</li>
 * </ul>
 *
 * @see ComponentInternalDependencies.ComponentInternalDependenciesPackage#getMethodDependency()
 * @model
 * @generated
 */
public interface MethodDependency extends EObject {
	/**
	 * Returns the value of the '<em><b>Required Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Resource</em>' reference.
	 * @see #setRequiredResource(IResource)
	 * @see ComponentInternalDependencies.ComponentInternalDependenciesPackage#getMethodDependency_RequiredResource()
	 * @model required="true"
	 * @generated
	 */
	IResource getRequiredResource();

	/**
	 * Sets the value of the '{@link ComponentInternalDependencies.MethodDependency#getRequiredResource <em>Required Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Resource</em>' reference.
	 * @see #getRequiredResource()
	 * @generated
	 */
	void setRequiredResource(IResource value);

	/**
	 * Returns the value of the '<em><b>Provided Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Method</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Method</em>' reference.
	 * @see #setProvidedMethod(IECMethodImplementation)
	 * @see ComponentInternalDependencies.ComponentInternalDependenciesPackage#getMethodDependency_ProvidedMethod()
	 * @model required="true"
	 * @generated
	 */
	IECMethodImplementation getProvidedMethod();

	/**
	 * Sets the value of the '{@link ComponentInternalDependencies.MethodDependency#getProvidedMethod <em>Provided Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided Method</em>' reference.
	 * @see #getProvidedMethod()
	 * @generated
	 */
	void setProvidedMethod(IECMethodImplementation value);

} // MethodDependency
