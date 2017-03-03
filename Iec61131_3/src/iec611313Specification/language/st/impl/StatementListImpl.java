/**
 */
package iec611313Specification.language.st.impl;

import iec611313Specification.common.pous.functions.impl.FunctionBodySpecificationImpl;

import iec611313Specification.language.st.StPackage;
import iec611313Specification.language.st.Statement;
import iec611313Specification.language.st.StatementList;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.language.st.impl.StatementListImpl#getContainsStatement <em>Contains Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatementListImpl extends FunctionBodySpecificationImpl implements StatementList {
	/**
	 * The cached value of the '{@link #getContainsStatement() <em>Contains Statement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsStatement()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> containsStatement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatementListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StPackage.Literals.STATEMENT_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getContainsStatement() {
		if (containsStatement == null) {
			containsStatement = new EObjectContainmentEList<Statement>(Statement.class, this, StPackage.STATEMENT_LIST__CONTAINS_STATEMENT);
		}
		return containsStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StPackage.STATEMENT_LIST__CONTAINS_STATEMENT:
				return ((InternalEList<?>)getContainsStatement()).basicRemove(otherEnd, msgs);
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
			case StPackage.STATEMENT_LIST__CONTAINS_STATEMENT:
				return getContainsStatement();
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
			case StPackage.STATEMENT_LIST__CONTAINS_STATEMENT:
				getContainsStatement().clear();
				getContainsStatement().addAll((Collection<? extends Statement>)newValue);
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
			case StPackage.STATEMENT_LIST__CONTAINS_STATEMENT:
				getContainsStatement().clear();
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
			case StPackage.STATEMENT_LIST__CONTAINS_STATEMENT:
				return containsStatement != null && !containsStatement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StatementListImpl
