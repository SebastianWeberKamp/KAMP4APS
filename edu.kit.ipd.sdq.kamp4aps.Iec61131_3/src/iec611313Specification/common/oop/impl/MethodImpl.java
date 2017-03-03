/**
 */
package iec611313Specification.common.oop.impl;

import iec611313Specification.common.oop.AccessType;
import iec611313Specification.common.oop.Method;
import iec611313Specification.common.oop.MethodSignature;
import iec611313Specification.common.oop.OopPackage;

import iec611313Specification.common.pous.function_blocks.FunctionBlockBodySpecification;

import iec611313Specification.common.variables.VariableDeclaration;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.common.oop.impl.MethodImpl#getAccessType <em>Access Type</em>}</li>
 *   <li>{@link iec611313Specification.common.oop.impl.MethodImpl#isIsOverridden <em>Is Overridden</em>}</li>
 *   <li>{@link iec611313Specification.common.oop.impl.MethodImpl#isIsFinal <em>Is Final</em>}</li>
 *   <li>{@link iec611313Specification.common.oop.impl.MethodImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link iec611313Specification.common.oop.impl.MethodImpl#getHasBody <em>Has Body</em>}</li>
 *   <li>{@link iec611313Specification.common.oop.impl.MethodImpl#getHasMethodSignature <em>Has Method Signature</em>}</li>
 *   <li>{@link iec611313Specification.common.oop.impl.MethodImpl#getContainsLocalVarDecl <em>Contains Local Var Decl</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodImpl extends MinimalEObjectImpl.Container implements Method {
	/**
	 * The default value of the '{@link #getAccessType() <em>Access Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessType()
	 * @generated
	 * @ordered
	 */
	protected static final AccessType ACCESS_TYPE_EDEFAULT = AccessType.DEFAULT;

	/**
	 * The cached value of the '{@link #getAccessType() <em>Access Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessType()
	 * @generated
	 * @ordered
	 */
	protected AccessType accessType = ACCESS_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsOverridden() <em>Is Overridden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOverridden()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_OVERRIDDEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOverridden() <em>Is Overridden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOverridden()
	 * @generated
	 * @ordered
	 */
	protected boolean isOverridden = IS_OVERRIDDEN_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsFinal() <em>Is Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFinal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FINAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsFinal() <em>Is Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFinal()
	 * @generated
	 * @ordered
	 */
	protected boolean isFinal = IS_FINAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasBody() <em>Has Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasBody()
	 * @generated
	 * @ordered
	 */
	protected FunctionBlockBodySpecification hasBody;

	/**
	 * The cached value of the '{@link #getHasMethodSignature() <em>Has Method Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasMethodSignature()
	 * @generated
	 * @ordered
	 */
	protected MethodSignature hasMethodSignature;

	/**
	 * The cached value of the '{@link #getContainsLocalVarDecl() <em>Contains Local Var Decl</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsLocalVarDecl()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableDeclaration> containsLocalVarDecl;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OopPackage.Literals.METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessType getAccessType() {
		return accessType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessType(AccessType newAccessType) {
		AccessType oldAccessType = accessType;
		accessType = newAccessType == null ? ACCESS_TYPE_EDEFAULT : newAccessType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OopPackage.METHOD__ACCESS_TYPE, oldAccessType, accessType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOverridden() {
		return isOverridden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOverridden(boolean newIsOverridden) {
		boolean oldIsOverridden = isOverridden;
		isOverridden = newIsOverridden;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OopPackage.METHOD__IS_OVERRIDDEN, oldIsOverridden, isOverridden));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsFinal() {
		return isFinal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFinal(boolean newIsFinal) {
		boolean oldIsFinal = isFinal;
		isFinal = newIsFinal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OopPackage.METHOD__IS_FINAL, oldIsFinal, isFinal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OopPackage.METHOD__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBlockBodySpecification getHasBody() {
		return hasBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasBody(FunctionBlockBodySpecification newHasBody, NotificationChain msgs) {
		FunctionBlockBodySpecification oldHasBody = hasBody;
		hasBody = newHasBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OopPackage.METHOD__HAS_BODY, oldHasBody, newHasBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasBody(FunctionBlockBodySpecification newHasBody) {
		if (newHasBody != hasBody) {
			NotificationChain msgs = null;
			if (hasBody != null)
				msgs = ((InternalEObject)hasBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OopPackage.METHOD__HAS_BODY, null, msgs);
			if (newHasBody != null)
				msgs = ((InternalEObject)newHasBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OopPackage.METHOD__HAS_BODY, null, msgs);
			msgs = basicSetHasBody(newHasBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OopPackage.METHOD__HAS_BODY, newHasBody, newHasBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodSignature getHasMethodSignature() {
		return hasMethodSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasMethodSignature(MethodSignature newHasMethodSignature, NotificationChain msgs) {
		MethodSignature oldHasMethodSignature = hasMethodSignature;
		hasMethodSignature = newHasMethodSignature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OopPackage.METHOD__HAS_METHOD_SIGNATURE, oldHasMethodSignature, newHasMethodSignature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasMethodSignature(MethodSignature newHasMethodSignature) {
		if (newHasMethodSignature != hasMethodSignature) {
			NotificationChain msgs = null;
			if (hasMethodSignature != null)
				msgs = ((InternalEObject)hasMethodSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OopPackage.METHOD__HAS_METHOD_SIGNATURE, null, msgs);
			if (newHasMethodSignature != null)
				msgs = ((InternalEObject)newHasMethodSignature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OopPackage.METHOD__HAS_METHOD_SIGNATURE, null, msgs);
			msgs = basicSetHasMethodSignature(newHasMethodSignature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OopPackage.METHOD__HAS_METHOD_SIGNATURE, newHasMethodSignature, newHasMethodSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableDeclaration> getContainsLocalVarDecl() {
		if (containsLocalVarDecl == null) {
			containsLocalVarDecl = new EObjectContainmentEList<VariableDeclaration>(VariableDeclaration.class, this, OopPackage.METHOD__CONTAINS_LOCAL_VAR_DECL);
		}
		return containsLocalVarDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OopPackage.METHOD__HAS_BODY:
				return basicSetHasBody(null, msgs);
			case OopPackage.METHOD__HAS_METHOD_SIGNATURE:
				return basicSetHasMethodSignature(null, msgs);
			case OopPackage.METHOD__CONTAINS_LOCAL_VAR_DECL:
				return ((InternalEList<?>)getContainsLocalVarDecl()).basicRemove(otherEnd, msgs);
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
			case OopPackage.METHOD__ACCESS_TYPE:
				return getAccessType();
			case OopPackage.METHOD__IS_OVERRIDDEN:
				return isIsOverridden();
			case OopPackage.METHOD__IS_FINAL:
				return isIsFinal();
			case OopPackage.METHOD__IS_ABSTRACT:
				return isIsAbstract();
			case OopPackage.METHOD__HAS_BODY:
				return getHasBody();
			case OopPackage.METHOD__HAS_METHOD_SIGNATURE:
				return getHasMethodSignature();
			case OopPackage.METHOD__CONTAINS_LOCAL_VAR_DECL:
				return getContainsLocalVarDecl();
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
			case OopPackage.METHOD__ACCESS_TYPE:
				setAccessType((AccessType)newValue);
				return;
			case OopPackage.METHOD__IS_OVERRIDDEN:
				setIsOverridden((Boolean)newValue);
				return;
			case OopPackage.METHOD__IS_FINAL:
				setIsFinal((Boolean)newValue);
				return;
			case OopPackage.METHOD__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case OopPackage.METHOD__HAS_BODY:
				setHasBody((FunctionBlockBodySpecification)newValue);
				return;
			case OopPackage.METHOD__HAS_METHOD_SIGNATURE:
				setHasMethodSignature((MethodSignature)newValue);
				return;
			case OopPackage.METHOD__CONTAINS_LOCAL_VAR_DECL:
				getContainsLocalVarDecl().clear();
				getContainsLocalVarDecl().addAll((Collection<? extends VariableDeclaration>)newValue);
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
			case OopPackage.METHOD__ACCESS_TYPE:
				setAccessType(ACCESS_TYPE_EDEFAULT);
				return;
			case OopPackage.METHOD__IS_OVERRIDDEN:
				setIsOverridden(IS_OVERRIDDEN_EDEFAULT);
				return;
			case OopPackage.METHOD__IS_FINAL:
				setIsFinal(IS_FINAL_EDEFAULT);
				return;
			case OopPackage.METHOD__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case OopPackage.METHOD__HAS_BODY:
				setHasBody((FunctionBlockBodySpecification)null);
				return;
			case OopPackage.METHOD__HAS_METHOD_SIGNATURE:
				setHasMethodSignature((MethodSignature)null);
				return;
			case OopPackage.METHOD__CONTAINS_LOCAL_VAR_DECL:
				getContainsLocalVarDecl().clear();
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
			case OopPackage.METHOD__ACCESS_TYPE:
				return accessType != ACCESS_TYPE_EDEFAULT;
			case OopPackage.METHOD__IS_OVERRIDDEN:
				return isOverridden != IS_OVERRIDDEN_EDEFAULT;
			case OopPackage.METHOD__IS_FINAL:
				return isFinal != IS_FINAL_EDEFAULT;
			case OopPackage.METHOD__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case OopPackage.METHOD__HAS_BODY:
				return hasBody != null;
			case OopPackage.METHOD__HAS_METHOD_SIGNATURE:
				return hasMethodSignature != null;
			case OopPackage.METHOD__CONTAINS_LOCAL_VAR_DECL:
				return containsLocalVarDecl != null && !containsLocalVarDecl.isEmpty();
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
		result.append(" (AccessType: ");
		result.append(accessType);
		result.append(", isOverridden: ");
		result.append(isOverridden);
		result.append(", isFinal: ");
		result.append(isFinal);
		result.append(", isAbstract: ");
		result.append(isAbstract);
		result.append(')');
		return result.toString();
	}

} //MethodImpl
