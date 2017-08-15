/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.impl;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.AbstractModificationImpl;

import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModificationmarksPackage;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyEntity;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import xPPU.Entity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modify Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ModifyEntityImpl<T extends Entity> extends AbstractModificationImpl<T, EObject> implements ModifyEntity<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifyEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModificationmarksPackage.Literals.MODIFY_ENTITY;
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

} //ModifyEntityImpl
