/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.impl;

import edu.kit.ipd.sdq.amp.model.modificationmarks.impl.AbstractModificationImpl;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyPowerSupply;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.modificationmarksPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import xPPU.PowerSupply;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modify Power Supply</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ModifyPowerSupplyImpl<T extends xPPU.ComponentRepository.PowerSupply> extends AbstractModificationImpl<T, EObject> implements ModifyPowerSupply<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifyPowerSupplyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return modificationmarksPackage.Literals.MODIFY_POWER_SUPPLY;
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

} //ModifyPowerSupplyImpl
