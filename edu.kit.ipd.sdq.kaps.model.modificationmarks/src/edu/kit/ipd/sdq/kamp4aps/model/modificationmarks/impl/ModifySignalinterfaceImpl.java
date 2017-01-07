/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.impl;

import edu.kit.ipd.sdq.amp.model.modificationmarks.impl.AbstractModificationImpl;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifySignalinterface;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.modificationmarksPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import xPPU.InterfaceRepository.SignalInterface;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modify Signalinterface</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ModifySignalinterfaceImpl<T extends SignalInterface> extends AbstractModificationImpl<T, EObject> implements ModifySignalinterface<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifySignalinterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return modificationmarksPackage.Literals.MODIFY_SIGNALINTERFACE;
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

} //ModifySignalinterfaceImpl
