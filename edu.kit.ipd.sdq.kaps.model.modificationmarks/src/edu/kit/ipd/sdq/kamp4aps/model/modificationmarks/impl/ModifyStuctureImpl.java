/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.impl;

import edu.kit.ipd.sdq.amp.model.modificationmarks.impl.AbstractModificationImpl;

import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyStucture;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.modificationmarksPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import xPPU.StructureRepository.Structure;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modify Stucture</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ModifyStuctureImpl<T extends Structure> extends AbstractModificationImpl<T, EObject> implements ModifyStucture<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifyStuctureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return modificationmarksPackage.Literals.MODIFY_STUCTURE;
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

} //ModifyStuctureImpl
