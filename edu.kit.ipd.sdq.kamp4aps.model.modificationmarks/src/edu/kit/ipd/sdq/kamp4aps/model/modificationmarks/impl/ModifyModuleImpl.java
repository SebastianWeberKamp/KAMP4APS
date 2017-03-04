/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.impl;

import edu.kit.ipd.sdq.amp.model.modificationmarks.impl.AbstractModificationImpl;

import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyModule;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.modificationmarksPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import xPPU.ModuleRepository.Module;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modify Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ModifyModuleImpl<T extends Module> extends AbstractModificationImpl<T, EObject> implements ModifyModule<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifyModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return modificationmarksPackage.Literals.MODIFY_MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setAffectedElement(T newAffectedElement) {
		super.setAffectedElement(newAffectedElement);
	}

} //ModifyModuleImpl
