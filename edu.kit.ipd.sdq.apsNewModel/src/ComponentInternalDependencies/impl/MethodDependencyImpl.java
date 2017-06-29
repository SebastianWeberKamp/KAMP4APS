/**
 */
package ComponentInternalDependencies.impl;

import ComponentInternalDependencies.ComponentInternalDependenciesPackage;
import ComponentInternalDependencies.MethodDependency;

import IECRepository.IECMethodImplementation;
import IECRepository.IResource;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ComponentInternalDependencies.impl.MethodDependencyImpl#getRequiredResource <em>Required Resource</em>}</li>
 *   <li>{@link ComponentInternalDependencies.impl.MethodDependencyImpl#getProvidedMethod <em>Provided Method</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodDependencyImpl extends MinimalEObjectImpl.Container implements MethodDependency {
	/**
	 * The cached value of the '{@link #getRequiredResource() <em>Required Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredResource()
	 * @generated
	 * @ordered
	 */
	protected IResource requiredResource;

	/**
	 * The cached value of the '{@link #getProvidedMethod() <em>Provided Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedMethod()
	 * @generated
	 * @ordered
	 */
	protected IECMethodImplementation providedMethod;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentInternalDependenciesPackage.Literals.METHOD_DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IResource getRequiredResource() {
		if (requiredResource != null && requiredResource.eIsProxy()) {
			InternalEObject oldRequiredResource = (InternalEObject)requiredResource;
			requiredResource = (IResource)eResolveProxy(oldRequiredResource);
			if (requiredResource != oldRequiredResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentInternalDependenciesPackage.METHOD_DEPENDENCY__REQUIRED_RESOURCE, oldRequiredResource, requiredResource));
			}
		}
		return requiredResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IResource basicGetRequiredResource() {
		return requiredResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredResource(IResource newRequiredResource) {
		IResource oldRequiredResource = requiredResource;
		requiredResource = newRequiredResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentInternalDependenciesPackage.METHOD_DEPENDENCY__REQUIRED_RESOURCE, oldRequiredResource, requiredResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECMethodImplementation getProvidedMethod() {
		if (providedMethod != null && providedMethod.eIsProxy()) {
			InternalEObject oldProvidedMethod = (InternalEObject)providedMethod;
			providedMethod = (IECMethodImplementation)eResolveProxy(oldProvidedMethod);
			if (providedMethod != oldProvidedMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentInternalDependenciesPackage.METHOD_DEPENDENCY__PROVIDED_METHOD, oldProvidedMethod, providedMethod));
			}
		}
		return providedMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECMethodImplementation basicGetProvidedMethod() {
		return providedMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidedMethod(IECMethodImplementation newProvidedMethod) {
		IECMethodImplementation oldProvidedMethod = providedMethod;
		providedMethod = newProvidedMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentInternalDependenciesPackage.METHOD_DEPENDENCY__PROVIDED_METHOD, oldProvidedMethod, providedMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentInternalDependenciesPackage.METHOD_DEPENDENCY__REQUIRED_RESOURCE:
				if (resolve) return getRequiredResource();
				return basicGetRequiredResource();
			case ComponentInternalDependenciesPackage.METHOD_DEPENDENCY__PROVIDED_METHOD:
				if (resolve) return getProvidedMethod();
				return basicGetProvidedMethod();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ComponentInternalDependenciesPackage.METHOD_DEPENDENCY__REQUIRED_RESOURCE:
				setRequiredResource((IResource)newValue);
				return;
			case ComponentInternalDependenciesPackage.METHOD_DEPENDENCY__PROVIDED_METHOD:
				setProvidedMethod((IECMethodImplementation)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ComponentInternalDependenciesPackage.METHOD_DEPENDENCY__REQUIRED_RESOURCE:
				setRequiredResource((IResource)null);
				return;
			case ComponentInternalDependenciesPackage.METHOD_DEPENDENCY__PROVIDED_METHOD:
				setProvidedMethod((IECMethodImplementation)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ComponentInternalDependenciesPackage.METHOD_DEPENDENCY__REQUIRED_RESOURCE:
				return requiredResource != null;
			case ComponentInternalDependenciesPackage.METHOD_DEPENDENCY__PROVIDED_METHOD:
				return providedMethod != null;
		}
		return super.eIsSet(featureID);
	}

} //MethodDependencyImpl
