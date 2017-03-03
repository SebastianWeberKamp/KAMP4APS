/**
 */
package iec611313Specification.common.impl;

import iec611313Specification.common.CommonPackage;
import iec611313Specification.common.Expression;
import iec611313Specification.common.PositionalParameterList;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Positional Parameter List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.common.impl.PositionalParameterListImpl#getContainsParamExpression <em>Contains Param Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PositionalParameterListImpl extends ParameterListImpl implements PositionalParameterList {
	/**
	 * The cached value of the '{@link #getContainsParamExpression() <em>Contains Param Expression</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsParamExpression()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> containsParamExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PositionalParameterListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.POSITIONAL_PARAMETER_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getContainsParamExpression() {
		if (containsParamExpression == null) {
			containsParamExpression = new EObjectResolvingEList<Expression>(Expression.class, this, CommonPackage.POSITIONAL_PARAMETER_LIST__CONTAINS_PARAM_EXPRESSION);
		}
		return containsParamExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommonPackage.POSITIONAL_PARAMETER_LIST__CONTAINS_PARAM_EXPRESSION:
				return getContainsParamExpression();
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
			case CommonPackage.POSITIONAL_PARAMETER_LIST__CONTAINS_PARAM_EXPRESSION:
				getContainsParamExpression().clear();
				getContainsParamExpression().addAll((Collection<? extends Expression>)newValue);
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
			case CommonPackage.POSITIONAL_PARAMETER_LIST__CONTAINS_PARAM_EXPRESSION:
				getContainsParamExpression().clear();
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
			case CommonPackage.POSITIONAL_PARAMETER_LIST__CONTAINS_PARAM_EXPRESSION:
				return containsParamExpression != null && !containsParamExpression.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PositionalParameterListImpl
