/**
 */
package iec611313Specification.common.pous.functions.impl;

import iec611313Specification.common.pous.functions.Function;
import iec611313Specification.common.pous.functions.FunctionBodySpecification;
import iec611313Specification.common.pous.functions.FunctionsPackage;

import iec611313Specification.common.types.ANY;

import iec611313Specification.common.variables.VariableDeclaration;
import iec611313Specification.common.variables.VariablesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.common.pous.functions.impl.FunctionImpl#getHasFunctionBodySpec <em>Has Function Body Spec</em>}</li>
 *   <li>{@link iec611313Specification.common.pous.functions.impl.FunctionImpl#getContainsFunctionVarDecl <em>Contains Function Var Decl</em>}</li>
 *   <li>{@link iec611313Specification.common.pous.functions.impl.FunctionImpl#getHasFunctionReturnType <em>Has Function Return Type</em>}</li>
 *   <li>{@link iec611313Specification.common.pous.functions.impl.FunctionImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionImpl extends MinimalEObjectImpl.Container implements Function {
	/**
	 * The cached value of the '{@link #getHasFunctionBodySpec() <em>Has Function Body Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasFunctionBodySpec()
	 * @generated
	 * @ordered
	 */
	protected FunctionBodySpecification hasFunctionBodySpec;

	/**
	 * The cached value of the '{@link #getContainsFunctionVarDecl() <em>Contains Function Var Decl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsFunctionVarDecl()
	 * @generated
	 * @ordered
	 */
	protected VariableDeclaration containsFunctionVarDecl;

	/**
	 * The cached value of the '{@link #getHasFunctionReturnType() <em>Has Function Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasFunctionReturnType()
	 * @generated
	 * @ordered
	 */
	protected ANY hasFunctionReturnType;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionsPackage.Literals.FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBodySpecification getHasFunctionBodySpec() {
		return hasFunctionBodySpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasFunctionBodySpec(FunctionBodySpecification newHasFunctionBodySpec, NotificationChain msgs) {
		FunctionBodySpecification oldHasFunctionBodySpec = hasFunctionBodySpec;
		hasFunctionBodySpec = newHasFunctionBodySpec;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunctionsPackage.FUNCTION__HAS_FUNCTION_BODY_SPEC, oldHasFunctionBodySpec, newHasFunctionBodySpec);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasFunctionBodySpec(FunctionBodySpecification newHasFunctionBodySpec) {
		if (newHasFunctionBodySpec != hasFunctionBodySpec) {
			NotificationChain msgs = null;
			if (hasFunctionBodySpec != null)
				msgs = ((InternalEObject)hasFunctionBodySpec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FunctionsPackage.FUNCTION__HAS_FUNCTION_BODY_SPEC, null, msgs);
			if (newHasFunctionBodySpec != null)
				msgs = ((InternalEObject)newHasFunctionBodySpec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FunctionsPackage.FUNCTION__HAS_FUNCTION_BODY_SPEC, null, msgs);
			msgs = basicSetHasFunctionBodySpec(newHasFunctionBodySpec, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.FUNCTION__HAS_FUNCTION_BODY_SPEC, newHasFunctionBodySpec, newHasFunctionBodySpec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclaration getContainsFunctionVarDecl() {
		return containsFunctionVarDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainsFunctionVarDecl(VariableDeclaration newContainsFunctionVarDecl, NotificationChain msgs) {
		VariableDeclaration oldContainsFunctionVarDecl = containsFunctionVarDecl;
		containsFunctionVarDecl = newContainsFunctionVarDecl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunctionsPackage.FUNCTION__CONTAINS_FUNCTION_VAR_DECL, oldContainsFunctionVarDecl, newContainsFunctionVarDecl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainsFunctionVarDecl(VariableDeclaration newContainsFunctionVarDecl) {
		if (newContainsFunctionVarDecl != containsFunctionVarDecl) {
			NotificationChain msgs = null;
			if (containsFunctionVarDecl != null)
				msgs = ((InternalEObject)containsFunctionVarDecl).eInverseRemove(this, VariablesPackage.VARIABLE_DECLARATION__IS_PART_OF, VariableDeclaration.class, msgs);
			if (newContainsFunctionVarDecl != null)
				msgs = ((InternalEObject)newContainsFunctionVarDecl).eInverseAdd(this, VariablesPackage.VARIABLE_DECLARATION__IS_PART_OF, VariableDeclaration.class, msgs);
			msgs = basicSetContainsFunctionVarDecl(newContainsFunctionVarDecl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.FUNCTION__CONTAINS_FUNCTION_VAR_DECL, newContainsFunctionVarDecl, newContainsFunctionVarDecl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ANY getHasFunctionReturnType() {
		return hasFunctionReturnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasFunctionReturnType(ANY newHasFunctionReturnType, NotificationChain msgs) {
		ANY oldHasFunctionReturnType = hasFunctionReturnType;
		hasFunctionReturnType = newHasFunctionReturnType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunctionsPackage.FUNCTION__HAS_FUNCTION_RETURN_TYPE, oldHasFunctionReturnType, newHasFunctionReturnType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasFunctionReturnType(ANY newHasFunctionReturnType) {
		if (newHasFunctionReturnType != hasFunctionReturnType) {
			NotificationChain msgs = null;
			if (hasFunctionReturnType != null)
				msgs = ((InternalEObject)hasFunctionReturnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FunctionsPackage.FUNCTION__HAS_FUNCTION_RETURN_TYPE, null, msgs);
			if (newHasFunctionReturnType != null)
				msgs = ((InternalEObject)newHasFunctionReturnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FunctionsPackage.FUNCTION__HAS_FUNCTION_RETURN_TYPE, null, msgs);
			msgs = basicSetHasFunctionReturnType(newHasFunctionReturnType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.FUNCTION__HAS_FUNCTION_RETURN_TYPE, newHasFunctionReturnType, newHasFunctionReturnType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.FUNCTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FunctionsPackage.FUNCTION__CONTAINS_FUNCTION_VAR_DECL:
				if (containsFunctionVarDecl != null)
					msgs = ((InternalEObject)containsFunctionVarDecl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FunctionsPackage.FUNCTION__CONTAINS_FUNCTION_VAR_DECL, null, msgs);
				return basicSetContainsFunctionVarDecl((VariableDeclaration)otherEnd, msgs);
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
			case FunctionsPackage.FUNCTION__HAS_FUNCTION_BODY_SPEC:
				return basicSetHasFunctionBodySpec(null, msgs);
			case FunctionsPackage.FUNCTION__CONTAINS_FUNCTION_VAR_DECL:
				return basicSetContainsFunctionVarDecl(null, msgs);
			case FunctionsPackage.FUNCTION__HAS_FUNCTION_RETURN_TYPE:
				return basicSetHasFunctionReturnType(null, msgs);
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
			case FunctionsPackage.FUNCTION__HAS_FUNCTION_BODY_SPEC:
				return getHasFunctionBodySpec();
			case FunctionsPackage.FUNCTION__CONTAINS_FUNCTION_VAR_DECL:
				return getContainsFunctionVarDecl();
			case FunctionsPackage.FUNCTION__HAS_FUNCTION_RETURN_TYPE:
				return getHasFunctionReturnType();
			case FunctionsPackage.FUNCTION__NAME:
				return getName();
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
			case FunctionsPackage.FUNCTION__HAS_FUNCTION_BODY_SPEC:
				setHasFunctionBodySpec((FunctionBodySpecification)newValue);
				return;
			case FunctionsPackage.FUNCTION__CONTAINS_FUNCTION_VAR_DECL:
				setContainsFunctionVarDecl((VariableDeclaration)newValue);
				return;
			case FunctionsPackage.FUNCTION__HAS_FUNCTION_RETURN_TYPE:
				setHasFunctionReturnType((ANY)newValue);
				return;
			case FunctionsPackage.FUNCTION__NAME:
				setName((String)newValue);
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
			case FunctionsPackage.FUNCTION__HAS_FUNCTION_BODY_SPEC:
				setHasFunctionBodySpec((FunctionBodySpecification)null);
				return;
			case FunctionsPackage.FUNCTION__CONTAINS_FUNCTION_VAR_DECL:
				setContainsFunctionVarDecl((VariableDeclaration)null);
				return;
			case FunctionsPackage.FUNCTION__HAS_FUNCTION_RETURN_TYPE:
				setHasFunctionReturnType((ANY)null);
				return;
			case FunctionsPackage.FUNCTION__NAME:
				setName(NAME_EDEFAULT);
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
			case FunctionsPackage.FUNCTION__HAS_FUNCTION_BODY_SPEC:
				return hasFunctionBodySpec != null;
			case FunctionsPackage.FUNCTION__CONTAINS_FUNCTION_VAR_DECL:
				return containsFunctionVarDecl != null;
			case FunctionsPackage.FUNCTION__HAS_FUNCTION_RETURN_TYPE:
				return hasFunctionReturnType != null;
			case FunctionsPackage.FUNCTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(')');
		return result.toString();
	}

} //FunctionImpl
