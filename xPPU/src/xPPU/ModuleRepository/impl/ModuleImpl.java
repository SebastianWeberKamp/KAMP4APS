/**
 */
package xPPU.ModuleRepository.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import xPPU.Identifier.impl.IdentifierImpl;

import xPPU.ModuleRepository.Module;
import xPPU.ModuleRepository.ModuleRepositoryPackage;

import xPPU.StructureRepository.Structure;
import xPPU.StructureRepository.StructureRepositoryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xPPU.ModuleRepository.impl.ModuleImpl#getModules <em>Modules</em>}</li>
 *   <li>{@link xPPU.ModuleRepository.impl.ModuleImpl#getParentStructure <em>Parent Structure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleImpl extends IdentifierImpl implements Module {
	/**
	 * The cached value of the '{@link #getModules() <em>Modules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModules()
	 * @generated
	 * @ordered
	 */
	protected EList<Module> modules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModuleRepositoryPackage.Literals.MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Module> getModules() {
		if (modules == null) {
			modules = new EObjectResolvingEList<Module>(Module.class, this, ModuleRepositoryPackage.MODULE__MODULES);
		}
		return modules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Structure getParentStructure() {
		if (eContainerFeatureID() != ModuleRepositoryPackage.MODULE__PARENT_STRUCTURE) return null;
		return (Structure)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentStructure(Structure newParentStructure, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentStructure, ModuleRepositoryPackage.MODULE__PARENT_STRUCTURE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentStructure(Structure newParentStructure) {
		if (newParentStructure != eInternalContainer() || (eContainerFeatureID() != ModuleRepositoryPackage.MODULE__PARENT_STRUCTURE && newParentStructure != null)) {
			if (EcoreUtil.isAncestor(this, newParentStructure))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentStructure != null)
				msgs = ((InternalEObject)newParentStructure).eInverseAdd(this, StructureRepositoryPackage.STRUCTURE__MODULES, Structure.class, msgs);
			msgs = basicSetParentStructure(newParentStructure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModuleRepositoryPackage.MODULE__PARENT_STRUCTURE, newParentStructure, newParentStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModuleRepositoryPackage.MODULE__PARENT_STRUCTURE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentStructure((Structure)otherEnd, msgs);
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
			case ModuleRepositoryPackage.MODULE__PARENT_STRUCTURE:
				return basicSetParentStructure(null, msgs);
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
			case ModuleRepositoryPackage.MODULE__PARENT_STRUCTURE:
				return eInternalContainer().eInverseRemove(this, StructureRepositoryPackage.STRUCTURE__MODULES, Structure.class, msgs);
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
			case ModuleRepositoryPackage.MODULE__MODULES:
				return getModules();
			case ModuleRepositoryPackage.MODULE__PARENT_STRUCTURE:
				return getParentStructure();
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
			case ModuleRepositoryPackage.MODULE__MODULES:
				getModules().clear();
				getModules().addAll((Collection<? extends Module>)newValue);
				return;
			case ModuleRepositoryPackage.MODULE__PARENT_STRUCTURE:
				setParentStructure((Structure)newValue);
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
			case ModuleRepositoryPackage.MODULE__MODULES:
				getModules().clear();
				return;
			case ModuleRepositoryPackage.MODULE__PARENT_STRUCTURE:
				setParentStructure((Structure)null);
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
			case ModuleRepositoryPackage.MODULE__MODULES:
				return modules != null && !modules.isEmpty();
			case ModuleRepositoryPackage.MODULE__PARENT_STRUCTURE:
				return getParentStructure() != null;
		}
		return super.eIsSet(featureID);
	}

} //ModuleImpl
