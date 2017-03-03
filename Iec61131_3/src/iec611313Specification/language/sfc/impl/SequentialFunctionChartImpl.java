/**
 */
package iec611313Specification.language.sfc.impl;

import iec611313Specification.common.pous.function_blocks.impl.FunctionBlockBodySpecificationImpl;

import iec611313Specification.language.sfc.SequentialFunctionChart;
import iec611313Specification.language.sfc.SfcPackage;
import iec611313Specification.language.sfc.Step;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequential Function Chart</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.language.sfc.impl.SequentialFunctionChartImpl#getHasInitialStep <em>Has Initial Step</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SequentialFunctionChartImpl extends FunctionBlockBodySpecificationImpl implements SequentialFunctionChart {
	/**
	 * The cached value of the '{@link #getHasInitialStep() <em>Has Initial Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasInitialStep()
	 * @generated
	 * @ordered
	 */
	protected Step hasInitialStep;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequentialFunctionChartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SfcPackage.Literals.SEQUENTIAL_FUNCTION_CHART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step getHasInitialStep() {
		if (hasInitialStep != null && hasInitialStep.eIsProxy()) {
			InternalEObject oldHasInitialStep = (InternalEObject)hasInitialStep;
			hasInitialStep = (Step)eResolveProxy(oldHasInitialStep);
			if (hasInitialStep != oldHasInitialStep) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SfcPackage.SEQUENTIAL_FUNCTION_CHART__HAS_INITIAL_STEP, oldHasInitialStep, hasInitialStep));
			}
		}
		return hasInitialStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step basicGetHasInitialStep() {
		return hasInitialStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasInitialStep(Step newHasInitialStep) {
		Step oldHasInitialStep = hasInitialStep;
		hasInitialStep = newHasInitialStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SfcPackage.SEQUENTIAL_FUNCTION_CHART__HAS_INITIAL_STEP, oldHasInitialStep, hasInitialStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SfcPackage.SEQUENTIAL_FUNCTION_CHART__HAS_INITIAL_STEP:
				if (resolve) return getHasInitialStep();
				return basicGetHasInitialStep();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SfcPackage.SEQUENTIAL_FUNCTION_CHART__HAS_INITIAL_STEP:
				setHasInitialStep((Step)newValue);
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
			case SfcPackage.SEQUENTIAL_FUNCTION_CHART__HAS_INITIAL_STEP:
				setHasInitialStep((Step)null);
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
			case SfcPackage.SEQUENTIAL_FUNCTION_CHART__HAS_INITIAL_STEP:
				return hasInitialStep != null;
		}
		return super.eIsSet(featureID);
	}

} //SequentialFunctionChartImpl
