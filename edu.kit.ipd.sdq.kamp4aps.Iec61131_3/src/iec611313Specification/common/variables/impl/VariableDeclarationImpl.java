/**
 */
package iec611313Specification.common.variables.impl;

import iec611313Specification.common.Literal;

import iec611313Specification.common.pous.functions.Function;
import iec611313Specification.common.pous.functions.FunctionsPackage;

import iec611313Specification.common.types.ANY;

import iec611313Specification.common.variables.LocationSpecification;
import iec611313Specification.common.variables.VariableDeclaration;
import iec611313Specification.common.variables.VariableModifier;
import iec611313Specification.common.variables.VariableType;
import iec611313Specification.common.variables.VariablesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.common.variables.impl.VariableDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link iec611313Specification.common.variables.impl.VariableDeclarationImpl#getVariableType <em>Variable Type</em>}</li>
 *   <li>{@link iec611313Specification.common.variables.impl.VariableDeclarationImpl#getVariableModifier <em>Variable Modifier</em>}</li>
 *   <li>{@link iec611313Specification.common.variables.impl.VariableDeclarationImpl#getDeclaresVariableType <em>Declares Variable Type</em>}</li>
 *   <li>{@link iec611313Specification.common.variables.impl.VariableDeclarationImpl#getHasVariableLocation <em>Has Variable Location</em>}</li>
 *   <li>{@link iec611313Specification.common.variables.impl.VariableDeclarationImpl#getHasInitialVariableValue <em>Has Initial Variable Value</em>}</li>
 *   <li>{@link iec611313Specification.common.variables.impl.VariableDeclarationImpl#getIsPartOf <em>Is Part Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableDeclarationImpl extends MinimalEObjectImpl.Container implements VariableDeclaration {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVariableType() <em>Variable Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableType()
	 * @generated
	 * @ordered
	 */
	protected static final VariableType VARIABLE_TYPE_EDEFAULT = VariableType.INPUT;

	/**
	 * The cached value of the '{@link #getVariableType() <em>Variable Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableType()
	 * @generated
	 * @ordered
	 */
	protected VariableType variableType = VARIABLE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVariableModifier() <em>Variable Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableModifier()
	 * @generated
	 * @ordered
	 */
	protected static final VariableModifier VARIABLE_MODIFIER_EDEFAULT = VariableModifier.NONE;

	/**
	 * The cached value of the '{@link #getVariableModifier() <em>Variable Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableModifier()
	 * @generated
	 * @ordered
	 */
	protected VariableModifier variableModifier = VARIABLE_MODIFIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDeclaresVariableType() <em>Declares Variable Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaresVariableType()
	 * @generated
	 * @ordered
	 */
	protected ANY declaresVariableType;

	/**
	 * The cached value of the '{@link #getHasVariableLocation() <em>Has Variable Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasVariableLocation()
	 * @generated
	 * @ordered
	 */
	protected LocationSpecification hasVariableLocation;

	/**
	 * The cached value of the '{@link #getHasInitialVariableValue() <em>Has Initial Variable Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasInitialVariableValue()
	 * @generated
	 * @ordered
	 */
	protected Literal hasInitialVariableValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VariablesPackage.Literals.VARIABLE_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariablesPackage.VARIABLE_DECLARATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableType getVariableType() {
		return variableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableType(VariableType newVariableType) {
		VariableType oldVariableType = variableType;
		variableType = newVariableType == null ? VARIABLE_TYPE_EDEFAULT : newVariableType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariablesPackage.VARIABLE_DECLARATION__VARIABLE_TYPE, oldVariableType, variableType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableModifier getVariableModifier() {
		return variableModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableModifier(VariableModifier newVariableModifier) {
		VariableModifier oldVariableModifier = variableModifier;
		variableModifier = newVariableModifier == null ? VARIABLE_MODIFIER_EDEFAULT : newVariableModifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariablesPackage.VARIABLE_DECLARATION__VARIABLE_MODIFIER, oldVariableModifier, variableModifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ANY getDeclaresVariableType() {
		return declaresVariableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeclaresVariableType(ANY newDeclaresVariableType, NotificationChain msgs) {
		ANY oldDeclaresVariableType = declaresVariableType;
		declaresVariableType = newDeclaresVariableType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VariablesPackage.VARIABLE_DECLARATION__DECLARES_VARIABLE_TYPE, oldDeclaresVariableType, newDeclaresVariableType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclaresVariableType(ANY newDeclaresVariableType) {
		if (newDeclaresVariableType != declaresVariableType) {
			NotificationChain msgs = null;
			if (declaresVariableType != null)
				msgs = ((InternalEObject)declaresVariableType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VariablesPackage.VARIABLE_DECLARATION__DECLARES_VARIABLE_TYPE, null, msgs);
			if (newDeclaresVariableType != null)
				msgs = ((InternalEObject)newDeclaresVariableType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VariablesPackage.VARIABLE_DECLARATION__DECLARES_VARIABLE_TYPE, null, msgs);
			msgs = basicSetDeclaresVariableType(newDeclaresVariableType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariablesPackage.VARIABLE_DECLARATION__DECLARES_VARIABLE_TYPE, newDeclaresVariableType, newDeclaresVariableType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationSpecification getHasVariableLocation() {
		return hasVariableLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasVariableLocation(LocationSpecification newHasVariableLocation, NotificationChain msgs) {
		LocationSpecification oldHasVariableLocation = hasVariableLocation;
		hasVariableLocation = newHasVariableLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VariablesPackage.VARIABLE_DECLARATION__HAS_VARIABLE_LOCATION, oldHasVariableLocation, newHasVariableLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasVariableLocation(LocationSpecification newHasVariableLocation) {
		if (newHasVariableLocation != hasVariableLocation) {
			NotificationChain msgs = null;
			if (hasVariableLocation != null)
				msgs = ((InternalEObject)hasVariableLocation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VariablesPackage.VARIABLE_DECLARATION__HAS_VARIABLE_LOCATION, null, msgs);
			if (newHasVariableLocation != null)
				msgs = ((InternalEObject)newHasVariableLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VariablesPackage.VARIABLE_DECLARATION__HAS_VARIABLE_LOCATION, null, msgs);
			msgs = basicSetHasVariableLocation(newHasVariableLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariablesPackage.VARIABLE_DECLARATION__HAS_VARIABLE_LOCATION, newHasVariableLocation, newHasVariableLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal getHasInitialVariableValue() {
		return hasInitialVariableValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasInitialVariableValue(Literal newHasInitialVariableValue, NotificationChain msgs) {
		Literal oldHasInitialVariableValue = hasInitialVariableValue;
		hasInitialVariableValue = newHasInitialVariableValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VariablesPackage.VARIABLE_DECLARATION__HAS_INITIAL_VARIABLE_VALUE, oldHasInitialVariableValue, newHasInitialVariableValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasInitialVariableValue(Literal newHasInitialVariableValue) {
		if (newHasInitialVariableValue != hasInitialVariableValue) {
			NotificationChain msgs = null;
			if (hasInitialVariableValue != null)
				msgs = ((InternalEObject)hasInitialVariableValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VariablesPackage.VARIABLE_DECLARATION__HAS_INITIAL_VARIABLE_VALUE, null, msgs);
			if (newHasInitialVariableValue != null)
				msgs = ((InternalEObject)newHasInitialVariableValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VariablesPackage.VARIABLE_DECLARATION__HAS_INITIAL_VARIABLE_VALUE, null, msgs);
			msgs = basicSetHasInitialVariableValue(newHasInitialVariableValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariablesPackage.VARIABLE_DECLARATION__HAS_INITIAL_VARIABLE_VALUE, newHasInitialVariableValue, newHasInitialVariableValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function getIsPartOf() {
		if (eContainerFeatureID() != VariablesPackage.VARIABLE_DECLARATION__IS_PART_OF) return null;
		return (Function)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsPartOf(Function newIsPartOf, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newIsPartOf, VariablesPackage.VARIABLE_DECLARATION__IS_PART_OF, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPartOf(Function newIsPartOf) {
		if (newIsPartOf != eInternalContainer() || (eContainerFeatureID() != VariablesPackage.VARIABLE_DECLARATION__IS_PART_OF && newIsPartOf != null)) {
			if (EcoreUtil.isAncestor(this, newIsPartOf))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newIsPartOf != null)
				msgs = ((InternalEObject)newIsPartOf).eInverseAdd(this, FunctionsPackage.FUNCTION__CONTAINS_FUNCTION_VAR_DECL, Function.class, msgs);
			msgs = basicSetIsPartOf(newIsPartOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariablesPackage.VARIABLE_DECLARATION__IS_PART_OF, newIsPartOf, newIsPartOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VariablesPackage.VARIABLE_DECLARATION__IS_PART_OF:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetIsPartOf((Function)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VariablesPackage.VARIABLE_DECLARATION__DECLARES_VARIABLE_TYPE:
				return basicSetDeclaresVariableType(null, msgs);
			case VariablesPackage.VARIABLE_DECLARATION__HAS_VARIABLE_LOCATION:
				return basicSetHasVariableLocation(null, msgs);
			case VariablesPackage.VARIABLE_DECLARATION__HAS_INITIAL_VARIABLE_VALUE:
				return basicSetHasInitialVariableValue(null, msgs);
			case VariablesPackage.VARIABLE_DECLARATION__IS_PART_OF:
				return basicSetIsPartOf(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case VariablesPackage.VARIABLE_DECLARATION__IS_PART_OF:
				return eInternalContainer().eInverseRemove(this, FunctionsPackage.FUNCTION__CONTAINS_FUNCTION_VAR_DECL, Function.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VariablesPackage.VARIABLE_DECLARATION__NAME:
				return getName();
			case VariablesPackage.VARIABLE_DECLARATION__VARIABLE_TYPE:
				return getVariableType();
			case VariablesPackage.VARIABLE_DECLARATION__VARIABLE_MODIFIER:
				return getVariableModifier();
			case VariablesPackage.VARIABLE_DECLARATION__DECLARES_VARIABLE_TYPE:
				return getDeclaresVariableType();
			case VariablesPackage.VARIABLE_DECLARATION__HAS_VARIABLE_LOCATION:
				return getHasVariableLocation();
			case VariablesPackage.VARIABLE_DECLARATION__HAS_INITIAL_VARIABLE_VALUE:
				return getHasInitialVariableValue();
			case VariablesPackage.VARIABLE_DECLARATION__IS_PART_OF:
				return getIsPartOf();
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
			case VariablesPackage.VARIABLE_DECLARATION__NAME:
				setName((String)newValue);
				return;
			case VariablesPackage.VARIABLE_DECLARATION__VARIABLE_TYPE:
				setVariableType((VariableType)newValue);
				return;
			case VariablesPackage.VARIABLE_DECLARATION__VARIABLE_MODIFIER:
				setVariableModifier((VariableModifier)newValue);
				return;
			case VariablesPackage.VARIABLE_DECLARATION__DECLARES_VARIABLE_TYPE:
				setDeclaresVariableType((ANY)newValue);
				return;
			case VariablesPackage.VARIABLE_DECLARATION__HAS_VARIABLE_LOCATION:
				setHasVariableLocation((LocationSpecification)newValue);
				return;
			case VariablesPackage.VARIABLE_DECLARATION__HAS_INITIAL_VARIABLE_VALUE:
				setHasInitialVariableValue((Literal)newValue);
				return;
			case VariablesPackage.VARIABLE_DECLARATION__IS_PART_OF:
				setIsPartOf((Function)newValue);
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
			case VariablesPackage.VARIABLE_DECLARATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VariablesPackage.VARIABLE_DECLARATION__VARIABLE_TYPE:
				setVariableType(VARIABLE_TYPE_EDEFAULT);
				return;
			case VariablesPackage.VARIABLE_DECLARATION__VARIABLE_MODIFIER:
				setVariableModifier(VARIABLE_MODIFIER_EDEFAULT);
				return;
			case VariablesPackage.VARIABLE_DECLARATION__DECLARES_VARIABLE_TYPE:
				setDeclaresVariableType((ANY)null);
				return;
			case VariablesPackage.VARIABLE_DECLARATION__HAS_VARIABLE_LOCATION:
				setHasVariableLocation((LocationSpecification)null);
				return;
			case VariablesPackage.VARIABLE_DECLARATION__HAS_INITIAL_VARIABLE_VALUE:
				setHasInitialVariableValue((Literal)null);
				return;
			case VariablesPackage.VARIABLE_DECLARATION__IS_PART_OF:
				setIsPartOf((Function)null);
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
			case VariablesPackage.VARIABLE_DECLARATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VariablesPackage.VARIABLE_DECLARATION__VARIABLE_TYPE:
				return variableType != VARIABLE_TYPE_EDEFAULT;
			case VariablesPackage.VARIABLE_DECLARATION__VARIABLE_MODIFIER:
				return variableModifier != VARIABLE_MODIFIER_EDEFAULT;
			case VariablesPackage.VARIABLE_DECLARATION__DECLARES_VARIABLE_TYPE:
				return declaresVariableType != null;
			case VariablesPackage.VARIABLE_DECLARATION__HAS_VARIABLE_LOCATION:
				return hasVariableLocation != null;
			case VariablesPackage.VARIABLE_DECLARATION__HAS_INITIAL_VARIABLE_VALUE:
				return hasInitialVariableValue != null;
			case VariablesPackage.VARIABLE_DECLARATION__IS_PART_OF:
				return getIsPartOf() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", variableType: ");
		result.append(variableType);
		result.append(", variableModifier: ");
		result.append(variableModifier);
		result.append(')');
		return result.toString();
	}

} //VariableDeclarationImpl
