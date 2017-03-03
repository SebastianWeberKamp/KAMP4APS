/**
 */
package iec611313Specification.language.fbd.impl;

import iec611313Specification.common.pous.functions.impl.FunctionBodySpecificationImpl;

import iec611313Specification.language.fbd.FbdPackage;
import iec611313Specification.language.fbd.FunctionBlockDiagram;
import iec611313Specification.language.fbd.FunctionBlockNetwork;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Block Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.language.fbd.impl.FunctionBlockDiagramImpl#getContainsFBDNetwork <em>Contains FBD Network</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionBlockDiagramImpl extends FunctionBodySpecificationImpl implements FunctionBlockDiagram {
	/**
	 * The cached value of the '{@link #getContainsFBDNetwork() <em>Contains FBD Network</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsFBDNetwork()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionBlockNetwork> containsFBDNetwork;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionBlockDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FbdPackage.Literals.FUNCTION_BLOCK_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionBlockNetwork> getContainsFBDNetwork() {
		if (containsFBDNetwork == null) {
			containsFBDNetwork = new EObjectContainmentEList<FunctionBlockNetwork>(FunctionBlockNetwork.class, this, FbdPackage.FUNCTION_BLOCK_DIAGRAM__CONTAINS_FBD_NETWORK);
		}
		return containsFBDNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FbdPackage.FUNCTION_BLOCK_DIAGRAM__CONTAINS_FBD_NETWORK:
				return ((InternalEList<?>)getContainsFBDNetwork()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FbdPackage.FUNCTION_BLOCK_DIAGRAM__CONTAINS_FBD_NETWORK:
				return getContainsFBDNetwork();
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
			case FbdPackage.FUNCTION_BLOCK_DIAGRAM__CONTAINS_FBD_NETWORK:
				getContainsFBDNetwork().clear();
				getContainsFBDNetwork().addAll((Collection<? extends FunctionBlockNetwork>)newValue);
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
			case FbdPackage.FUNCTION_BLOCK_DIAGRAM__CONTAINS_FBD_NETWORK:
				getContainsFBDNetwork().clear();
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
			case FbdPackage.FUNCTION_BLOCK_DIAGRAM__CONTAINS_FBD_NETWORK:
				return containsFBDNetwork != null && !containsFBDNetwork.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FunctionBlockDiagramImpl
