/**
 */
package iec611313Specification.language.ld.impl;

import iec611313Specification.common.pous.functions.impl.FunctionBodySpecificationImpl;

import iec611313Specification.language.ld.LadderDiagram;
import iec611313Specification.language.ld.LadderNetwork;
import iec611313Specification.language.ld.LdPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ladder Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.language.ld.impl.LadderDiagramImpl#getContainsLadderNetwork <em>Contains Ladder Network</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LadderDiagramImpl extends FunctionBodySpecificationImpl implements LadderDiagram {
	/**
	 * The cached value of the '{@link #getContainsLadderNetwork() <em>Contains Ladder Network</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsLadderNetwork()
	 * @generated
	 * @ordered
	 */
	protected EList<LadderNetwork> containsLadderNetwork;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LadderDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LdPackage.Literals.LADDER_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LadderNetwork> getContainsLadderNetwork() {
		if (containsLadderNetwork == null) {
			containsLadderNetwork = new EObjectContainmentEList<LadderNetwork>(LadderNetwork.class, this, LdPackage.LADDER_DIAGRAM__CONTAINS_LADDER_NETWORK);
		}
		return containsLadderNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LdPackage.LADDER_DIAGRAM__CONTAINS_LADDER_NETWORK:
				return ((InternalEList<?>)getContainsLadderNetwork()).basicRemove(otherEnd, msgs);
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
			case LdPackage.LADDER_DIAGRAM__CONTAINS_LADDER_NETWORK:
				return getContainsLadderNetwork();
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
			case LdPackage.LADDER_DIAGRAM__CONTAINS_LADDER_NETWORK:
				getContainsLadderNetwork().clear();
				getContainsLadderNetwork().addAll((Collection<? extends LadderNetwork>)newValue);
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
			case LdPackage.LADDER_DIAGRAM__CONTAINS_LADDER_NETWORK:
				getContainsLadderNetwork().clear();
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
			case LdPackage.LADDER_DIAGRAM__CONTAINS_LADDER_NETWORK:
				return containsLadderNetwork != null && !containsLadderNetwork.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LadderDiagramImpl
