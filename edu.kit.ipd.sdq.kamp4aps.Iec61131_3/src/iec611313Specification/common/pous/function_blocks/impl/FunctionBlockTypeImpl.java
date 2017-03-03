/**
 */
package iec611313Specification.common.pous.function_blocks.impl;

import iec611313Specification.common.oop.Inheritance;
import iec611313Specification.common.oop.Interface;
import iec611313Specification.common.oop.Method;
import iec611313Specification.common.oop.Property;

import iec611313Specification.common.pous.function_blocks.FunctionBlockBodySpecification;
import iec611313Specification.common.pous.function_blocks.FunctionBlockType;
import iec611313Specification.common.pous.function_blocks.Function_blocksPackage;

import iec611313Specification.common.types.impl.ANY_DERIVEDImpl;

import iec611313Specification.common.variables.VariableDeclaration;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Block Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.common.pous.function_blocks.impl.FunctionBlockTypeImpl#getHasFunBlockBodySpec <em>Has Fun Block Body Spec</em>}</li>
 *   <li>{@link iec611313Specification.common.pous.function_blocks.impl.FunctionBlockTypeImpl#getContainsFunctionBlockVarDecl <em>Contains Function Block Var Decl</em>}</li>
 *   <li>{@link iec611313Specification.common.pous.function_blocks.impl.FunctionBlockTypeImpl#getHasInterfaceImplementations <em>Has Interface Implementations</em>}</li>
 *   <li>{@link iec611313Specification.common.pous.function_blocks.impl.FunctionBlockTypeImpl#getHasExtensions <em>Has Extensions</em>}</li>
 *   <li>{@link iec611313Specification.common.pous.function_blocks.impl.FunctionBlockTypeImpl#getContainsMethods <em>Contains Methods</em>}</li>
 *   <li>{@link iec611313Specification.common.pous.function_blocks.impl.FunctionBlockTypeImpl#getContainsProperties <em>Contains Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionBlockTypeImpl extends ANY_DERIVEDImpl implements FunctionBlockType {
	/**
	 * The cached value of the '{@link #getHasFunBlockBodySpec() <em>Has Fun Block Body Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasFunBlockBodySpec()
	 * @generated
	 * @ordered
	 */
	protected FunctionBlockBodySpecification hasFunBlockBodySpec;

	/**
	 * The cached value of the '{@link #getContainsFunctionBlockVarDecl() <em>Contains Function Block Var Decl</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsFunctionBlockVarDecl()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableDeclaration> containsFunctionBlockVarDecl;

	/**
	 * The cached value of the '{@link #getHasInterfaceImplementations() <em>Has Interface Implementations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasInterfaceImplementations()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> hasInterfaceImplementations;

	/**
	 * The cached value of the '{@link #getHasExtensions() <em>Has Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasExtensions()
	 * @generated
	 * @ordered
	 */
	protected Inheritance hasExtensions;

	/**
	 * The cached value of the '{@link #getContainsMethods() <em>Contains Methods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<Method> containsMethods;

	/**
	 * The cached value of the '{@link #getContainsProperties() <em>Contains Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> containsProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionBlockTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Function_blocksPackage.Literals.FUNCTION_BLOCK_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBlockBodySpecification getHasFunBlockBodySpec() {
		return hasFunBlockBodySpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasFunBlockBodySpec(FunctionBlockBodySpecification newHasFunBlockBodySpec, NotificationChain msgs) {
		FunctionBlockBodySpecification oldHasFunBlockBodySpec = hasFunBlockBodySpec;
		hasFunBlockBodySpec = newHasFunBlockBodySpec;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Function_blocksPackage.FUNCTION_BLOCK_TYPE__HAS_FUN_BLOCK_BODY_SPEC, oldHasFunBlockBodySpec, newHasFunBlockBodySpec);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasFunBlockBodySpec(FunctionBlockBodySpecification newHasFunBlockBodySpec) {
		if (newHasFunBlockBodySpec != hasFunBlockBodySpec) {
			NotificationChain msgs = null;
			if (hasFunBlockBodySpec != null)
				msgs = ((InternalEObject)hasFunBlockBodySpec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Function_blocksPackage.FUNCTION_BLOCK_TYPE__HAS_FUN_BLOCK_BODY_SPEC, null, msgs);
			if (newHasFunBlockBodySpec != null)
				msgs = ((InternalEObject)newHasFunBlockBodySpec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Function_blocksPackage.FUNCTION_BLOCK_TYPE__HAS_FUN_BLOCK_BODY_SPEC, null, msgs);
			msgs = basicSetHasFunBlockBodySpec(newHasFunBlockBodySpec, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Function_blocksPackage.FUNCTION_BLOCK_TYPE__HAS_FUN_BLOCK_BODY_SPEC, newHasFunBlockBodySpec, newHasFunBlockBodySpec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableDeclaration> getContainsFunctionBlockVarDecl() {
		if (containsFunctionBlockVarDecl == null) {
			containsFunctionBlockVarDecl = new EObjectContainmentEList<VariableDeclaration>(VariableDeclaration.class, this, Function_blocksPackage.FUNCTION_BLOCK_TYPE__CONTAINS_FUNCTION_BLOCK_VAR_DECL);
		}
		return containsFunctionBlockVarDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getHasInterfaceImplementations() {
		if (hasInterfaceImplementations == null) {
			hasInterfaceImplementations = new EObjectResolvingEList<Interface>(Interface.class, this, Function_blocksPackage.FUNCTION_BLOCK_TYPE__HAS_INTERFACE_IMPLEMENTATIONS);
		}
		return hasInterfaceImplementations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inheritance getHasExtensions() {
		return hasExtensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasExtensions(Inheritance newHasExtensions, NotificationChain msgs) {
		Inheritance oldHasExtensions = hasExtensions;
		hasExtensions = newHasExtensions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Function_blocksPackage.FUNCTION_BLOCK_TYPE__HAS_EXTENSIONS, oldHasExtensions, newHasExtensions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasExtensions(Inheritance newHasExtensions) {
		if (newHasExtensions != hasExtensions) {
			NotificationChain msgs = null;
			if (hasExtensions != null)
				msgs = ((InternalEObject)hasExtensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Function_blocksPackage.FUNCTION_BLOCK_TYPE__HAS_EXTENSIONS, null, msgs);
			if (newHasExtensions != null)
				msgs = ((InternalEObject)newHasExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Function_blocksPackage.FUNCTION_BLOCK_TYPE__HAS_EXTENSIONS, null, msgs);
			msgs = basicSetHasExtensions(newHasExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Function_blocksPackage.FUNCTION_BLOCK_TYPE__HAS_EXTENSIONS, newHasExtensions, newHasExtensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Method> getContainsMethods() {
		if (containsMethods == null) {
			containsMethods = new EObjectContainmentEList<Method>(Method.class, this, Function_blocksPackage.FUNCTION_BLOCK_TYPE__CONTAINS_METHODS);
		}
		return containsMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getContainsProperties() {
		if (containsProperties == null) {
			containsProperties = new EObjectContainmentEList<Property>(Property.class, this, Function_blocksPackage.FUNCTION_BLOCK_TYPE__CONTAINS_PROPERTIES);
		}
		return containsProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Function_blocksPackage.FUNCTION_BLOCK_TYPE__HAS_FUN_BLOCK_BODY_SPEC:
				return basicSetHasFunBlockBodySpec(null, msgs);
			case Function_blocksPackage.FUNCTION_BLOCK_TYPE__CONTAINS_FUNCTION_BLOCK_VAR_DECL:
				return ((InternalEList<?>)getContainsFunctionBlockVarDecl()).basicRemove(otherEnd, msgs);
			case Function_blocksPackage.FUNCTION_BLOCK_TYPE__HAS_EXTENSIONS:
				return basicSetHasExtensions(null, msgs);
			case Function_blocksPackage.FUNCTION_BLOCK_TYPE__CONTAINS_METHODS:
				return ((InternalEList<?>)getContainsMethods()).basicRemove(otherEnd, msgs);
			case Function_blocksPackage.FUNCTION_BLOCK_TYPE__CONTAINS_PROPERTIES:
				return ((InternalEList<?>)getContainsProperties()).basicRemove(otherEnd, msgs);
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
			case Function_blocksPackage.FUNCTION_BLOCK_TYPE__HAS_FUN_BLOCK_BODY_SPEC:
				return getHasFunBlockBodySpec();
			case Function_blocksPackage.FUNCTION_BLOCK_TYPE__CONTAINS_FUNCTION_BLOCK_VAR_DECL:
				return getContainsFunctionBlockVarDecl();
			case Function_blocksPackage.FUNCTION_BLOCK_TYPE__HAS_INTERFACE_IMPLEMENTATIONS:
				return getHasInterfaceImplementations();
			case Function_blocksPackage.FUNCTION_BLOCK_TYPE__HAS_EXTENSIONS:
				return getHasExtensions();
			case Function_blocksPackage.FUNCTION_BLOCK_TYPE__CONTAINS_METHODS:
				return getContainsMethods();
			case Function_blocksPackage.FUNCTION_BLOCK_TYPE__CONTAINS_PROPERTIES:
				return getContainsProperties();
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
			case Function_blocksPackage.FUNCTION_BLOCK_TYPE__HAS_FUN_BLOCK_BODY_SPEC:
				setHasFunBlockBodySpec((FunctionBlockBodySpecification)newValue);
				return;
			case Function_blocksPackage.FUNCTION_BLOCK_TYPE__CONTAINS_FUNCTION_BLOCK_VAR_DECL:
				getContainsFunctionBlockVarDecl().clear();
				getContainsFunctionBlockVarDecl().addAll((Collection<? extends VariableDeclaration>)newValue);
				return;
			case Function_blocksPackage.FUNCTION_BLOCK_TYPE__HAS_INTERFACE_IMPLEMENTATIONS:
				getHasInterfaceImplementations().clear();
				getHasInterfaceImplementations().addAll((Collection<? extends Interface>)newValue);
				return;
			case Function_blocksPackage.FUNCTION_BLOCK_TYPE__HAS_EXTENSIONS:
				setHasExtensions((Inheritance)newValue);
				return;
			case Function_blocksPackage.FUNCTION_BLOCK_TYPE__CONTAINS_METHODS:
				getContainsMethods().clear();
				getContainsMethods().addAll((Collection<? extends Method>)newValue);
				return;
			case Function_blocksPackage.FUNCTION_BLOCK_TYPE__CONTAINS_PROPERTIES:
				getContainsProperties().clear();
				getContainsProperties().addAll((Collection<? extends Property>)newValue);
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
			case Function_blocksPackage.FUNCTION_BLOCK_TYPE__HAS_FUN_BLOCK_BODY_SPEC:
				setHasFunBlockBodySpec((FunctionBlockBodySpecification)null);
				return;
			case Function_blocksPackage.FUNCTION_BLOCK_TYPE__CONTAINS_FUNCTION_BLOCK_VAR_DECL:
				getContainsFunctionBlockVarDecl().clear();
				return;
			case Function_blocksPackage.FUNCTION_BLOCK_TYPE__HAS_INTERFACE_IMPLEMENTATIONS:
				getHasInterfaceImplementations().clear();
				return;
			case Function_blocksPackage.FUNCTION_BLOCK_TYPE__HAS_EXTENSIONS:
				setHasExtensions((Inheritance)null);
				return;
			case Function_blocksPackage.FUNCTION_BLOCK_TYPE__CONTAINS_METHODS:
				getContainsMethods().clear();
				return;
			case Function_blocksPackage.FUNCTION_BLOCK_TYPE__CONTAINS_PROPERTIES:
				getContainsProperties().clear();
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
			case Function_blocksPackage.FUNCTION_BLOCK_TYPE__HAS_FUN_BLOCK_BODY_SPEC:
				return hasFunBlockBodySpec != null;
			case Function_blocksPackage.FUNCTION_BLOCK_TYPE__CONTAINS_FUNCTION_BLOCK_VAR_DECL:
				return containsFunctionBlockVarDecl != null && !containsFunctionBlockVarDecl.isEmpty();
			case Function_blocksPackage.FUNCTION_BLOCK_TYPE__HAS_INTERFACE_IMPLEMENTATIONS:
				return hasInterfaceImplementations != null && !hasInterfaceImplementations.isEmpty();
			case Function_blocksPackage.FUNCTION_BLOCK_TYPE__HAS_EXTENSIONS:
				return hasExtensions != null;
			case Function_blocksPackage.FUNCTION_BLOCK_TYPE__CONTAINS_METHODS:
				return containsMethods != null && !containsMethods.isEmpty();
			case Function_blocksPackage.FUNCTION_BLOCK_TYPE__CONTAINS_PROPERTIES:
				return containsProperties != null && !containsProperties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FunctionBlockTypeImpl
