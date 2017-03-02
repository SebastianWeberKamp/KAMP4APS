/**
 */
package fieldofactivityannotations.impl;

import fieldofactivityannotations.ComponentDocumentationFiles;
import fieldofactivityannotations.DocumentationSpecification;
import fieldofactivityannotations.FieldOfActivityAnnotationRepository;
import fieldofactivityannotations.FieldofactivityannotationsPackage;
import fieldofactivityannotations.InterfaceDocumentationFiles;
import fieldofactivityannotations.ModuleDocumentationFiles;
import fieldofactivityannotations.Role;
import fieldofactivityannotations.StructureDocumentationFiles;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Documentation Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fieldofactivityannotations.impl.DocumentationSpecificationImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link fieldofactivityannotations.impl.DocumentationSpecificationImpl#getComponentDocumentation <em>Component Documentation</em>}</li>
 *   <li>{@link fieldofactivityannotations.impl.DocumentationSpecificationImpl#getModuleDocumentation <em>Module Documentation</em>}</li>
 *   <li>{@link fieldofactivityannotations.impl.DocumentationSpecificationImpl#getInterfaceDocumentation <em>Interface Documentation</em>}</li>
 *   <li>{@link fieldofactivityannotations.impl.DocumentationSpecificationImpl#getStructureDocumentation <em>Structure Documentation</em>}</li>
 *   <li>{@link fieldofactivityannotations.impl.DocumentationSpecificationImpl#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentationSpecificationImpl extends MinimalEObjectImpl.Container implements DocumentationSpecification {
	/**
	 * The cached value of the '{@link #getComponentDocumentation() <em>Component Documentation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentDocumentation()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentDocumentationFiles> componentDocumentation;

	/**
	 * The cached value of the '{@link #getModuleDocumentation() <em>Module Documentation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleDocumentation()
	 * @generated
	 * @ordered
	 */
	protected EList<ModuleDocumentationFiles> moduleDocumentation;

	/**
	 * The cached value of the '{@link #getInterfaceDocumentation() <em>Interface Documentation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceDocumentation()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceDocumentationFiles> interfaceDocumentation;

	/**
	 * The cached value of the '{@link #getStructureDocumentation() <em>Structure Documentation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructureDocumentation()
	 * @generated
	 * @ordered
	 */
	protected EList<StructureDocumentationFiles> structureDocumentation;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected Role role;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentationSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FieldofactivityannotationsPackage.Literals.DOCUMENTATION_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldOfActivityAnnotationRepository getParent() {
		if (eContainerFeatureID() != FieldofactivityannotationsPackage.DOCUMENTATION_SPECIFICATION__PARENT) return null;
		return (FieldOfActivityAnnotationRepository)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(FieldOfActivityAnnotationRepository newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, FieldofactivityannotationsPackage.DOCUMENTATION_SPECIFICATION__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(FieldOfActivityAnnotationRepository newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != FieldofactivityannotationsPackage.DOCUMENTATION_SPECIFICATION__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__DOCUMENTATION_SPECIFICATION, FieldOfActivityAnnotationRepository.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FieldofactivityannotationsPackage.DOCUMENTATION_SPECIFICATION__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentDocumentationFiles> getComponentDocumentation() {
		if (componentDocumentation == null) {
			componentDocumentation = new EObjectContainmentWithInverseEList<ComponentDocumentationFiles>(ComponentDocumentationFiles.class, this, FieldofactivityannotationsPackage.DOCUMENTATION_SPECIFICATION__COMPONENT_DOCUMENTATION, FieldofactivityannotationsPackage.COMPONENT_DOCUMENTATION_FILES__PARENT);
		}
		return componentDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModuleDocumentationFiles> getModuleDocumentation() {
		if (moduleDocumentation == null) {
			moduleDocumentation = new EObjectContainmentWithInverseEList<ModuleDocumentationFiles>(ModuleDocumentationFiles.class, this, FieldofactivityannotationsPackage.DOCUMENTATION_SPECIFICATION__MODULE_DOCUMENTATION, FieldofactivityannotationsPackage.MODULE_DOCUMENTATION_FILES__PARENT);
		}
		return moduleDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceDocumentationFiles> getInterfaceDocumentation() {
		if (interfaceDocumentation == null) {
			interfaceDocumentation = new EObjectContainmentWithInverseEList<InterfaceDocumentationFiles>(InterfaceDocumentationFiles.class, this, FieldofactivityannotationsPackage.DOCUMENTATION_SPECIFICATION__INTERFACE_DOCUMENTATION, FieldofactivityannotationsPackage.INTERFACE_DOCUMENTATION_FILES__PARENT);
		}
		return interfaceDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructureDocumentationFiles> getStructureDocumentation() {
		if (structureDocumentation == null) {
			structureDocumentation = new EObjectContainmentWithInverseEList<StructureDocumentationFiles>(StructureDocumentationFiles.class, this, FieldofactivityannotationsPackage.DOCUMENTATION_SPECIFICATION__STRUCTURE_DOCUMENTATION, FieldofactivityannotationsPackage.STRUCTURE_DOCUMENTATION_FILES__PARENT);
		}
		return structureDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getRole() {
		if (role != null && role.eIsProxy()) {
			InternalEObject oldRole = (InternalEObject)role;
			role = (Role)eResolveProxy(oldRole);
			if (role != oldRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FieldofactivityannotationsPackage.DOCUMENTATION_SPECIFICATION__ROLE, oldRole, role));
			}
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(Role newRole) {
		Role oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FieldofactivityannotationsPackage.DOCUMENTATION_SPECIFICATION__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FieldofactivityannotationsPackage.DOCUMENTATION_SPECIFICATION__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((FieldOfActivityAnnotationRepository)otherEnd, msgs);
			case FieldofactivityannotationsPackage.DOCUMENTATION_SPECIFICATION__COMPONENT_DOCUMENTATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComponentDocumentation()).basicAdd(otherEnd, msgs);
			case FieldofactivityannotationsPackage.DOCUMENTATION_SPECIFICATION__MODULE_DOCUMENTATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getModuleDocumentation()).basicAdd(otherEnd, msgs);
			case FieldofactivityannotationsPackage.DOCUMENTATION_SPECIFICATION__INTERFACE_DOCUMENTATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInterfaceDocumentation()).basicAdd(otherEnd, msgs);
			case FieldofactivityannotationsPackage.DOCUMENTATION_SPECIFICATION__STRUCTURE_DOCUMENTATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStructureDocumentation()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FieldofactivityannotationsPackage.DOCUMENTATION_SPECIFICATION__PARENT:
				return basicSetParent(null, msgs);
			case FieldofactivityannotationsPackage.DOCUMENTATION_SPECIFICATION__COMPONENT_DOCUMENTATION:
				return ((InternalEList<?>)getComponentDocumentation()).basicRemove(otherEnd, msgs);
			case FieldofactivityannotationsPackage.DOCUMENTATION_SPECIFICATION__MODULE_DOCUMENTATION:
				return ((InternalEList<?>)getModuleDocumentation()).basicRemove(otherEnd, msgs);
			case FieldofactivityannotationsPackage.DOCUMENTATION_SPECIFICATION__INTERFACE_DOCUMENTATION:
				return ((InternalEList<?>)getInterfaceDocumentation()).basicRemove(otherEnd, msgs);
			case FieldofactivityannotationsPackage.DOCUMENTATION_SPECIFICATION__STRUCTURE_DOCUMENTATION:
				return ((InternalEList<?>)getStructureDocumentation()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case FieldofactivityannotationsPackage.DOCUMENTATION_SPECIFICATION__PARENT:
				return eInternalContainer().eInverseRemove(this, FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__DOCUMENTATION_SPECIFICATION, FieldOfActivityAnnotationRepository.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FieldofactivityannotationsPackage.DOCUMENTATION_SPECIFICATION__PARENT:
				return getParent();
			case FieldofactivityannotationsPackage.DOCUMENTATION_SPECIFICATION__COMPONENT_DOCUMENTATION:
				return getComponentDocumentation();
			case FieldofactivityannotationsPackage.DOCUMENTATION_SPECIFICATION__MODULE_DOCUMENTATION:
				return getModuleDocumentation();
			case FieldofactivityannotationsPackage.DOCUMENTATION_SPECIFICATION__INTERFACE_DOCUMENTATION:
				return getInterfaceDocumentation();
			case FieldofactivityannotationsPackage.DOCUMENTATION_SPECIFICATION__STRUCTURE_DOCUMENTATION:
				return getStructureDocumentation();
			case FieldofactivityannotationsPackage.DOCUMENTATION_SPECIFICATION__ROLE:
				if (resolve) return getRole();
				return basicGetRole();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FieldofactivityannotationsPackage.DOCUMENTATION_SPECIFICATION__PARENT:
				setParent((FieldOfActivityAnnotationRepository)newValue);
				return;
			case FieldofactivityannotationsPackage.DOCUMENTATION_SPECIFICATION__COMPONENT_DOCUMENTATION:
				getComponentDocumentation().clear();
				getComponentDocumentation().addAll((Collection<? extends ComponentDocumentationFiles>)newValue);
				return;
			case FieldofactivityannotationsPackage.DOCUMENTATION_SPECIFICATION__MODULE_DOCUMENTATION:
				getModuleDocumentation().clear();
				getModuleDocumentation().addAll((Collection<? extends ModuleDocumentationFiles>)newValue);
				return;
			case FieldofactivityannotationsPackage.DOCUMENTATION_SPECIFICATION__INTERFACE_DOCUMENTATION:
				getInterfaceDocumentation().clear();
				getInterfaceDocumentation().addAll((Collection<? extends InterfaceDocumentationFiles>)newValue);
				return;
			case FieldofactivityannotationsPackage.DOCUMENTATION_SPECIFICATION__STRUCTURE_DOCUMENTATION:
				getStructureDocumentation().clear();
				getStructureDocumentation().addAll((Collection<? extends StructureDocumentationFiles>)newValue);
				return;
			case FieldofactivityannotationsPackage.DOCUMENTATION_SPECIFICATION__ROLE:
				setRole((Role)newValue);
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
			case FieldofactivityannotationsPackage.DOCUMENTATION_SPECIFICATION__PARENT:
				setParent((FieldOfActivityAnnotationRepository)null);
				return;
			case FieldofactivityannotationsPackage.DOCUMENTATION_SPECIFICATION__COMPONENT_DOCUMENTATION:
				getComponentDocumentation().clear();
				return;
			case FieldofactivityannotationsPackage.DOCUMENTATION_SPECIFICATION__MODULE_DOCUMENTATION:
				getModuleDocumentation().clear();
				return;
			case FieldofactivityannotationsPackage.DOCUMENTATION_SPECIFICATION__INTERFACE_DOCUMENTATION:
				getInterfaceDocumentation().clear();
				return;
			case FieldofactivityannotationsPackage.DOCUMENTATION_SPECIFICATION__STRUCTURE_DOCUMENTATION:
				getStructureDocumentation().clear();
				return;
			case FieldofactivityannotationsPackage.DOCUMENTATION_SPECIFICATION__ROLE:
				setRole((Role)null);
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
			case FieldofactivityannotationsPackage.DOCUMENTATION_SPECIFICATION__PARENT:
				return getParent() != null;
			case FieldofactivityannotationsPackage.DOCUMENTATION_SPECIFICATION__COMPONENT_DOCUMENTATION:
				return componentDocumentation != null && !componentDocumentation.isEmpty();
			case FieldofactivityannotationsPackage.DOCUMENTATION_SPECIFICATION__MODULE_DOCUMENTATION:
				return moduleDocumentation != null && !moduleDocumentation.isEmpty();
			case FieldofactivityannotationsPackage.DOCUMENTATION_SPECIFICATION__INTERFACE_DOCUMENTATION:
				return interfaceDocumentation != null && !interfaceDocumentation.isEmpty();
			case FieldofactivityannotationsPackage.DOCUMENTATION_SPECIFICATION__STRUCTURE_DOCUMENTATION:
				return structureDocumentation != null && !structureDocumentation.isEmpty();
			case FieldofactivityannotationsPackage.DOCUMENTATION_SPECIFICATION__ROLE:
				return role != null;
		}
		return super.eIsSet(featureID);
	}

} //DocumentationSpecificationImpl
