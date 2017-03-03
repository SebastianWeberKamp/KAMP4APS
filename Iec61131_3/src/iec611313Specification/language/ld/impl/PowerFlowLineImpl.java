/**
 */
package iec611313Specification.language.ld.impl;

import iec611313Specification.language.ld.LDElement;
import iec611313Specification.language.ld.LdPackage;
import iec611313Specification.language.ld.PowerFlowLine;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Power Flow Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.language.ld.impl.PowerFlowLineImpl#getHasPowerSource <em>Has Power Source</em>}</li>
 *   <li>{@link iec611313Specification.language.ld.impl.PowerFlowLineImpl#getHasPowerSink <em>Has Power Sink</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PowerFlowLineImpl extends MinimalEObjectImpl.Container implements PowerFlowLine {
	/**
	 * The cached value of the '{@link #getHasPowerSource() <em>Has Power Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPowerSource()
	 * @generated
	 * @ordered
	 */
	protected EList<LDElement> hasPowerSource;

	/**
	 * The cached value of the '{@link #getHasPowerSink() <em>Has Power Sink</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPowerSink()
	 * @generated
	 * @ordered
	 */
	protected EList<LDElement> hasPowerSink;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PowerFlowLineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LdPackage.Literals.POWER_FLOW_LINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LDElement> getHasPowerSource() {
		if (hasPowerSource == null) {
			hasPowerSource = new EObjectResolvingEList<LDElement>(LDElement.class, this, LdPackage.POWER_FLOW_LINE__HAS_POWER_SOURCE);
		}
		return hasPowerSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LDElement> getHasPowerSink() {
		if (hasPowerSink == null) {
			hasPowerSink = new EObjectResolvingEList<LDElement>(LDElement.class, this, LdPackage.POWER_FLOW_LINE__HAS_POWER_SINK);
		}
		return hasPowerSink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LdPackage.POWER_FLOW_LINE__HAS_POWER_SOURCE:
				return getHasPowerSource();
			case LdPackage.POWER_FLOW_LINE__HAS_POWER_SINK:
				return getHasPowerSink();
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
			case LdPackage.POWER_FLOW_LINE__HAS_POWER_SOURCE:
				getHasPowerSource().clear();
				getHasPowerSource().addAll((Collection<? extends LDElement>)newValue);
				return;
			case LdPackage.POWER_FLOW_LINE__HAS_POWER_SINK:
				getHasPowerSink().clear();
				getHasPowerSink().addAll((Collection<? extends LDElement>)newValue);
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
			case LdPackage.POWER_FLOW_LINE__HAS_POWER_SOURCE:
				getHasPowerSource().clear();
				return;
			case LdPackage.POWER_FLOW_LINE__HAS_POWER_SINK:
				getHasPowerSink().clear();
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
			case LdPackage.POWER_FLOW_LINE__HAS_POWER_SOURCE:
				return hasPowerSource != null && !hasPowerSource.isEmpty();
			case LdPackage.POWER_FLOW_LINE__HAS_POWER_SINK:
				return hasPowerSink != null && !hasPowerSink.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PowerFlowLineImpl
