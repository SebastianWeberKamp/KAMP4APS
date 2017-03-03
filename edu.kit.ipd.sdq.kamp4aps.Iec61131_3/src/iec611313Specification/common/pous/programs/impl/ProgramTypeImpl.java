/**
 */
package iec611313Specification.common.pous.programs.impl;

import iec611313Specification.common.pous.function_blocks.FunctionBlockBodySpecification;

import iec611313Specification.common.pous.programs.ProgramType;
import iec611313Specification.common.pous.programs.ProgramsPackage;

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
 * An implementation of the model object '<em><b>Program Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.common.pous.programs.impl.ProgramTypeImpl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link iec611313Specification.common.pous.programs.impl.ProgramTypeImpl#getHasProgramBodySpec <em>Has Program Body Spec</em>}</li>
 *   <li>{@link iec611313Specification.common.pous.programs.impl.ProgramTypeImpl#getContainsProgramVarDecl <em>Contains Program Var Decl</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramTypeImpl extends MinimalEObjectImpl.Container implements ProgramType {
	/**
	 * The default value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected String typeName = TYPE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasProgramBodySpec() <em>Has Program Body Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasProgramBodySpec()
	 * @generated
	 * @ordered
	 */
	protected FunctionBlockBodySpecification hasProgramBodySpec;

	/**
	 * The cached value of the '{@link #getContainsProgramVarDecl() <em>Contains Program Var Decl</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsProgramVarDecl()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableDeclaration> containsProgramVarDecl;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProgramsPackage.Literals.PROGRAM_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeName() {
		return typeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeName(String newTypeName) {
		String oldTypeName = typeName;
		typeName = newTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgramsPackage.PROGRAM_TYPE__TYPE_NAME, oldTypeName, typeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBlockBodySpecification getHasProgramBodySpec() {
		return hasProgramBodySpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasProgramBodySpec(FunctionBlockBodySpecification newHasProgramBodySpec, NotificationChain msgs) {
		FunctionBlockBodySpecification oldHasProgramBodySpec = hasProgramBodySpec;
		hasProgramBodySpec = newHasProgramBodySpec;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProgramsPackage.PROGRAM_TYPE__HAS_PROGRAM_BODY_SPEC, oldHasProgramBodySpec, newHasProgramBodySpec);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasProgramBodySpec(FunctionBlockBodySpecification newHasProgramBodySpec) {
		if (newHasProgramBodySpec != hasProgramBodySpec) {
			NotificationChain msgs = null;
			if (hasProgramBodySpec != null)
				msgs = ((InternalEObject)hasProgramBodySpec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProgramsPackage.PROGRAM_TYPE__HAS_PROGRAM_BODY_SPEC, null, msgs);
			if (newHasProgramBodySpec != null)
				msgs = ((InternalEObject)newHasProgramBodySpec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProgramsPackage.PROGRAM_TYPE__HAS_PROGRAM_BODY_SPEC, null, msgs);
			msgs = basicSetHasProgramBodySpec(newHasProgramBodySpec, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgramsPackage.PROGRAM_TYPE__HAS_PROGRAM_BODY_SPEC, newHasProgramBodySpec, newHasProgramBodySpec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableDeclaration> getContainsProgramVarDecl() {
		if (containsProgramVarDecl == null) {
			containsProgramVarDecl = new EObjectContainmentEList<VariableDeclaration>(VariableDeclaration.class, this, ProgramsPackage.PROGRAM_TYPE__CONTAINS_PROGRAM_VAR_DECL);
		}
		return containsProgramVarDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProgramsPackage.PROGRAM_TYPE__HAS_PROGRAM_BODY_SPEC:
				return basicSetHasProgramBodySpec(null, msgs);
			case ProgramsPackage.PROGRAM_TYPE__CONTAINS_PROGRAM_VAR_DECL:
				return ((InternalEList<?>)getContainsProgramVarDecl()).basicRemove(otherEnd, msgs);
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
			case ProgramsPackage.PROGRAM_TYPE__TYPE_NAME:
				return getTypeName();
			case ProgramsPackage.PROGRAM_TYPE__HAS_PROGRAM_BODY_SPEC:
				return getHasProgramBodySpec();
			case ProgramsPackage.PROGRAM_TYPE__CONTAINS_PROGRAM_VAR_DECL:
				return getContainsProgramVarDecl();
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
			case ProgramsPackage.PROGRAM_TYPE__TYPE_NAME:
				setTypeName((String)newValue);
				return;
			case ProgramsPackage.PROGRAM_TYPE__HAS_PROGRAM_BODY_SPEC:
				setHasProgramBodySpec((FunctionBlockBodySpecification)newValue);
				return;
			case ProgramsPackage.PROGRAM_TYPE__CONTAINS_PROGRAM_VAR_DECL:
				getContainsProgramVarDecl().clear();
				getContainsProgramVarDecl().addAll((Collection<? extends VariableDeclaration>)newValue);
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
			case ProgramsPackage.PROGRAM_TYPE__TYPE_NAME:
				setTypeName(TYPE_NAME_EDEFAULT);
				return;
			case ProgramsPackage.PROGRAM_TYPE__HAS_PROGRAM_BODY_SPEC:
				setHasProgramBodySpec((FunctionBlockBodySpecification)null);
				return;
			case ProgramsPackage.PROGRAM_TYPE__CONTAINS_PROGRAM_VAR_DECL:
				getContainsProgramVarDecl().clear();
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
			case ProgramsPackage.PROGRAM_TYPE__TYPE_NAME:
				return TYPE_NAME_EDEFAULT == null ? typeName != null : !TYPE_NAME_EDEFAULT.equals(typeName);
			case ProgramsPackage.PROGRAM_TYPE__HAS_PROGRAM_BODY_SPEC:
				return hasProgramBodySpec != null;
			case ProgramsPackage.PROGRAM_TYPE__CONTAINS_PROGRAM_VAR_DECL:
				return containsProgramVarDecl != null && !containsProgramVarDecl.isEmpty();
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
		result.append(" (typeName: ");
		result.append(typeName);
		result.append(')');
		return result.toString();
	}

} //ProgramTypeImpl
