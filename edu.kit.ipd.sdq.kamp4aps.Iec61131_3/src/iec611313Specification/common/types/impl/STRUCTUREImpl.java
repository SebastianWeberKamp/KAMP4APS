/**
 */
package iec611313Specification.common.types.impl;

import iec611313Specification.common.types.STRUCTURE;
import iec611313Specification.common.types.TypesPackage;

import iec611313Specification.common.variables.VariableDeclaration;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>STRUCTURE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.common.types.impl.STRUCTUREImpl#getContainsStructVarDecl <em>Contains Struct Var Decl</em>}</li>
 * </ul>
 *
 * @generated
 */
public class STRUCTUREImpl extends ANY_DERIVEDImpl implements STRUCTURE {
	/**
	 * The cached value of the '{@link #getContainsStructVarDecl() <em>Contains Struct Var Decl</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsStructVarDecl()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableDeclaration> containsStructVarDecl;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected STRUCTUREImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableDeclaration> getContainsStructVarDecl() {
		if (containsStructVarDecl == null) {
			containsStructVarDecl = new EObjectContainmentEList<VariableDeclaration>(VariableDeclaration.class, this, TypesPackage.STRUCTURE__CONTAINS_STRUCT_VAR_DECL);
		}
		return containsStructVarDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.STRUCTURE__CONTAINS_STRUCT_VAR_DECL:
				return ((InternalEList<?>)getContainsStructVarDecl()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.STRUCTURE__CONTAINS_STRUCT_VAR_DECL:
				return getContainsStructVarDecl();
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
			case TypesPackage.STRUCTURE__CONTAINS_STRUCT_VAR_DECL:
				getContainsStructVarDecl().clear();
				getContainsStructVarDecl().addAll((Collection<? extends VariableDeclaration>)newValue);
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
			case TypesPackage.STRUCTURE__CONTAINS_STRUCT_VAR_DECL:
				getContainsStructVarDecl().clear();
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
			case TypesPackage.STRUCTURE__CONTAINS_STRUCT_VAR_DECL:
				return containsStructVarDecl != null && !containsStructVarDecl.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //STRUCTUREImpl
