/**
 */
package iec611313Specification.common.impl;

import iec611313Specification.common.Assignment;
import iec611313Specification.common.CommonPackage;
import iec611313Specification.common.FormalParameterList;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formal Parameter List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.common.impl.FormalParameterListImpl#getContainsFormalParamAssignment <em>Contains Formal Param Assignment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormalParameterListImpl extends ParameterListImpl implements FormalParameterList {
	/**
	 * The cached value of the '{@link #getContainsFormalParamAssignment() <em>Contains Formal Param Assignment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsFormalParamAssignment()
	 * @generated
	 * @ordered
	 */
	protected EList<Assignment> containsFormalParamAssignment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormalParameterListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.FORMAL_PARAMETER_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Assignment> getContainsFormalParamAssignment() {
		if (containsFormalParamAssignment == null) {
			containsFormalParamAssignment = new EObjectContainmentEList<Assignment>(Assignment.class, this, CommonPackage.FORMAL_PARAMETER_LIST__CONTAINS_FORMAL_PARAM_ASSIGNMENT);
		}
		return containsFormalParamAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommonPackage.FORMAL_PARAMETER_LIST__CONTAINS_FORMAL_PARAM_ASSIGNMENT:
				return ((InternalEList<?>)getContainsFormalParamAssignment()).basicRemove(otherEnd, msgs);
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
			case CommonPackage.FORMAL_PARAMETER_LIST__CONTAINS_FORMAL_PARAM_ASSIGNMENT:
				return getContainsFormalParamAssignment();
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
			case CommonPackage.FORMAL_PARAMETER_LIST__CONTAINS_FORMAL_PARAM_ASSIGNMENT:
				getContainsFormalParamAssignment().clear();
				getContainsFormalParamAssignment().addAll((Collection<? extends Assignment>)newValue);
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
			case CommonPackage.FORMAL_PARAMETER_LIST__CONTAINS_FORMAL_PARAM_ASSIGNMENT:
				getContainsFormalParamAssignment().clear();
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
			case CommonPackage.FORMAL_PARAMETER_LIST__CONTAINS_FORMAL_PARAM_ASSIGNMENT:
				return containsFormalParamAssignment != null && !containsFormalParamAssignment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FormalParameterListImpl
