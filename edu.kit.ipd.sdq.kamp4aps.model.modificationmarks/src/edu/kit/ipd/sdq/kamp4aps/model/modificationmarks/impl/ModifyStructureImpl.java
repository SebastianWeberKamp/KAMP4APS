/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.impl;

import edu.kit.ipd.sdq.amp.model.modificationmarks.impl.AbstractModificationImpl;

import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyStructure;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.modificationmarksPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import xPPU.StructureRepository.Structure;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modify Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ModifyStructureImpl<T extends Structure> extends AbstractModificationImpl<T, EObject> implements ModifyStructure<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifyStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return modificationmarksPackage.Literals.MODIFY_STRUCTURE;
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

} //ModifyStructureImpl
