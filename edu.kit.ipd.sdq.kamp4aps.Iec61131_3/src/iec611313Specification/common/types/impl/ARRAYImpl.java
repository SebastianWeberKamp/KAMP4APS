/**
 */
package iec611313Specification.common.types.impl;

import iec611313Specification.common.Literal;
import iec611313Specification.common.Range;

import iec611313Specification.common.types.ANY;
import iec611313Specification.common.types.ARRAY;
import iec611313Specification.common.types.TypesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ARRAY</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.common.types.impl.ARRAYImpl#getHasArrayDimension <em>Has Array Dimension</em>}</li>
 *   <li>{@link iec611313Specification.common.types.impl.ARRAYImpl#getHasInitialArrayValue <em>Has Initial Array Value</em>}</li>
 *   <li>{@link iec611313Specification.common.types.impl.ARRAYImpl#getHasArrayBaseType <em>Has Array Base Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ARRAYImpl extends ANY_DERIVEDImpl implements ARRAY {
	/**
	 * The cached value of the '{@link #getHasArrayDimension() <em>Has Array Dimension</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasArrayDimension()
	 * @generated
	 * @ordered
	 */
	protected EList<Range> hasArrayDimension;

	/**
	 * The cached value of the '{@link #getHasInitialArrayValue() <em>Has Initial Array Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasInitialArrayValue()
	 * @generated
	 * @ordered
	 */
	protected EList<Literal> hasInitialArrayValue;

	/**
	 * The cached value of the '{@link #getHasArrayBaseType() <em>Has Array Base Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasArrayBaseType()
	 * @generated
	 * @ordered
	 */
	protected ANY hasArrayBaseType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ARRAYImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.ARRAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Range> getHasArrayDimension() {
		if (hasArrayDimension == null) {
			hasArrayDimension = new EObjectContainmentEList<Range>(Range.class, this, TypesPackage.ARRAY__HAS_ARRAY_DIMENSION);
		}
		return hasArrayDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Literal> getHasInitialArrayValue() {
		if (hasInitialArrayValue == null) {
			hasInitialArrayValue = new EObjectContainmentEList<Literal>(Literal.class, this, TypesPackage.ARRAY__HAS_INITIAL_ARRAY_VALUE);
		}
		return hasInitialArrayValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ANY getHasArrayBaseType() {
		return hasArrayBaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasArrayBaseType(ANY newHasArrayBaseType, NotificationChain msgs) {
		ANY oldHasArrayBaseType = hasArrayBaseType;
		hasArrayBaseType = newHasArrayBaseType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.ARRAY__HAS_ARRAY_BASE_TYPE, oldHasArrayBaseType, newHasArrayBaseType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasArrayBaseType(ANY newHasArrayBaseType) {
		if (newHasArrayBaseType != hasArrayBaseType) {
			NotificationChain msgs = null;
			if (hasArrayBaseType != null)
				msgs = ((InternalEObject)hasArrayBaseType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ARRAY__HAS_ARRAY_BASE_TYPE, null, msgs);
			if (newHasArrayBaseType != null)
				msgs = ((InternalEObject)newHasArrayBaseType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ARRAY__HAS_ARRAY_BASE_TYPE, null, msgs);
			msgs = basicSetHasArrayBaseType(newHasArrayBaseType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ARRAY__HAS_ARRAY_BASE_TYPE, newHasArrayBaseType, newHasArrayBaseType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.ARRAY__HAS_ARRAY_DIMENSION:
				return ((InternalEList<?>)getHasArrayDimension()).basicRemove(otherEnd, msgs);
			case TypesPackage.ARRAY__HAS_INITIAL_ARRAY_VALUE:
				return ((InternalEList<?>)getHasInitialArrayValue()).basicRemove(otherEnd, msgs);
			case TypesPackage.ARRAY__HAS_ARRAY_BASE_TYPE:
				return basicSetHasArrayBaseType(null, msgs);
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
			case TypesPackage.ARRAY__HAS_ARRAY_DIMENSION:
				return getHasArrayDimension();
			case TypesPackage.ARRAY__HAS_INITIAL_ARRAY_VALUE:
				return getHasInitialArrayValue();
			case TypesPackage.ARRAY__HAS_ARRAY_BASE_TYPE:
				return getHasArrayBaseType();
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
			case TypesPackage.ARRAY__HAS_ARRAY_DIMENSION:
				getHasArrayDimension().clear();
				getHasArrayDimension().addAll((Collection<? extends Range>)newValue);
				return;
			case TypesPackage.ARRAY__HAS_INITIAL_ARRAY_VALUE:
				getHasInitialArrayValue().clear();
				getHasInitialArrayValue().addAll((Collection<? extends Literal>)newValue);
				return;
			case TypesPackage.ARRAY__HAS_ARRAY_BASE_TYPE:
				setHasArrayBaseType((ANY)newValue);
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
			case TypesPackage.ARRAY__HAS_ARRAY_DIMENSION:
				getHasArrayDimension().clear();
				return;
			case TypesPackage.ARRAY__HAS_INITIAL_ARRAY_VALUE:
				getHasInitialArrayValue().clear();
				return;
			case TypesPackage.ARRAY__HAS_ARRAY_BASE_TYPE:
				setHasArrayBaseType((ANY)null);
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
			case TypesPackage.ARRAY__HAS_ARRAY_DIMENSION:
				return hasArrayDimension != null && !hasArrayDimension.isEmpty();
			case TypesPackage.ARRAY__HAS_INITIAL_ARRAY_VALUE:
				return hasInitialArrayValue != null && !hasInitialArrayValue.isEmpty();
			case TypesPackage.ARRAY__HAS_ARRAY_BASE_TYPE:
				return hasArrayBaseType != null;
		}
		return super.eIsSet(featureID);
	}

} //ARRAYImpl
