/**
 */
package edu.kit.ipd.sdq.kaps.model.modificationmarks.impl;

import edu.kit.ipd.sdq.amp.model.modificationmarks.impl.AbstractModificationImpl;
import edu.kit.ipd.sdq.kaps.model.modificationmarks.ModifyBusBox;
import edu.kit.ipd.sdq.kaps.model.modificationmarks.modificationmarksPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.repository.ComponentType;
import xPPU.BusBox;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modify Bus Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ModifyBusBoxImpl<T extends xPPU.BusComponents.BusBox> extends AbstractModificationImpl<T, EObject> implements ModifyBusBox<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifyBusBoxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return modificationmarksPackage.Literals.MODIFY_BUS_BOX;
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

} //ModifyBusBoxImpl
