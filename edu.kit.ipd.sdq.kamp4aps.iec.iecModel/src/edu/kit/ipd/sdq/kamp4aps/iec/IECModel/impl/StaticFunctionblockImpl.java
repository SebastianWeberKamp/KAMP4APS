/**
 */
package edu.kit.ipd.sdq.kamp4aps.iec.IECModel.impl;

import edu.kit.ipd.sdq.kamp4aps.iec.IECModel.GlobalVariable;
import edu.kit.ipd.sdq.kamp4aps.iec.IECModel.IECMethodImplementation;
import edu.kit.ipd.sdq.kamp4aps.iec.IECModel.IECModelPackage;
import edu.kit.ipd.sdq.kamp4aps.iec.IECModel.IECPropertyImplementation;
import edu.kit.ipd.sdq.kamp4aps.iec.IECModel.StaticFunctionblock;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Static Functionblock</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.iec.IECModel.impl.StaticFunctionblockImpl#getId <em>Id</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.iec.IECModel.impl.StaticFunctionblockImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.iec.IECModel.impl.StaticFunctionblockImpl#getType <em>Type</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.iec.IECModel.impl.StaticFunctionblockImpl#getAccessesGlobalVariable <em>Accesses Global Variable</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.iec.IECModel.impl.StaticFunctionblockImpl#getHasMethod <em>Has Method</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.iec.IECModel.impl.StaticFunctionblockImpl#getHasProperty <em>Has Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StaticFunctionblockImpl extends MinimalEObjectImpl.Container implements StaticFunctionblock {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

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
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected StaticFunctionblock type;

	/**
	 * The cached value of the '{@link #getAccessesGlobalVariable() <em>Accesses Global Variable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessesGlobalVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<GlobalVariable> accessesGlobalVariable;

	/**
	 * The cached value of the '{@link #getHasMethod() <em>Has Method</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasMethod()
	 * @generated
	 * @ordered
	 */
	protected EList<IECMethodImplementation> hasMethod;

	/**
	 * The cached value of the '{@link #getHasProperty() <em>Has Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<IECPropertyImplementation> hasProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaticFunctionblockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IECModelPackage.Literals.STATIC_FUNCTIONBLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IECModelPackage.STATIC_FUNCTIONBLOCK__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IECModelPackage.STATIC_FUNCTIONBLOCK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticFunctionblock getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (StaticFunctionblock)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IECModelPackage.STATIC_FUNCTIONBLOCK__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticFunctionblock basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(StaticFunctionblock newType) {
		StaticFunctionblock oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IECModelPackage.STATIC_FUNCTIONBLOCK__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalVariable> getAccessesGlobalVariable() {
		if (accessesGlobalVariable == null) {
			accessesGlobalVariable = new EObjectResolvingEList<GlobalVariable>(GlobalVariable.class, this, IECModelPackage.STATIC_FUNCTIONBLOCK__ACCESSES_GLOBAL_VARIABLE);
		}
		return accessesGlobalVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECMethodImplementation> getHasMethod() {
		if (hasMethod == null) {
			hasMethod = new EObjectResolvingEList<IECMethodImplementation>(IECMethodImplementation.class, this, IECModelPackage.STATIC_FUNCTIONBLOCK__HAS_METHOD);
		}
		return hasMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECPropertyImplementation> getHasProperty() {
		if (hasProperty == null) {
			hasProperty = new EObjectResolvingEList<IECPropertyImplementation>(IECPropertyImplementation.class, this, IECModelPackage.STATIC_FUNCTIONBLOCK__HAS_PROPERTY);
		}
		return hasProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IECModelPackage.STATIC_FUNCTIONBLOCK__ID:
				return getId();
			case IECModelPackage.STATIC_FUNCTIONBLOCK__NAME:
				return getName();
			case IECModelPackage.STATIC_FUNCTIONBLOCK__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case IECModelPackage.STATIC_FUNCTIONBLOCK__ACCESSES_GLOBAL_VARIABLE:
				return getAccessesGlobalVariable();
			case IECModelPackage.STATIC_FUNCTIONBLOCK__HAS_METHOD:
				return getHasMethod();
			case IECModelPackage.STATIC_FUNCTIONBLOCK__HAS_PROPERTY:
				return getHasProperty();
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
			case IECModelPackage.STATIC_FUNCTIONBLOCK__ID:
				setId((String)newValue);
				return;
			case IECModelPackage.STATIC_FUNCTIONBLOCK__NAME:
				setName((String)newValue);
				return;
			case IECModelPackage.STATIC_FUNCTIONBLOCK__TYPE:
				setType((StaticFunctionblock)newValue);
				return;
			case IECModelPackage.STATIC_FUNCTIONBLOCK__ACCESSES_GLOBAL_VARIABLE:
				getAccessesGlobalVariable().clear();
				getAccessesGlobalVariable().addAll((Collection<? extends GlobalVariable>)newValue);
				return;
			case IECModelPackage.STATIC_FUNCTIONBLOCK__HAS_METHOD:
				getHasMethod().clear();
				getHasMethod().addAll((Collection<? extends IECMethodImplementation>)newValue);
				return;
			case IECModelPackage.STATIC_FUNCTIONBLOCK__HAS_PROPERTY:
				getHasProperty().clear();
				getHasProperty().addAll((Collection<? extends IECPropertyImplementation>)newValue);
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
			case IECModelPackage.STATIC_FUNCTIONBLOCK__ID:
				setId(ID_EDEFAULT);
				return;
			case IECModelPackage.STATIC_FUNCTIONBLOCK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IECModelPackage.STATIC_FUNCTIONBLOCK__TYPE:
				setType((StaticFunctionblock)null);
				return;
			case IECModelPackage.STATIC_FUNCTIONBLOCK__ACCESSES_GLOBAL_VARIABLE:
				getAccessesGlobalVariable().clear();
				return;
			case IECModelPackage.STATIC_FUNCTIONBLOCK__HAS_METHOD:
				getHasMethod().clear();
				return;
			case IECModelPackage.STATIC_FUNCTIONBLOCK__HAS_PROPERTY:
				getHasProperty().clear();
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
			case IECModelPackage.STATIC_FUNCTIONBLOCK__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case IECModelPackage.STATIC_FUNCTIONBLOCK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IECModelPackage.STATIC_FUNCTIONBLOCK__TYPE:
				return type != null;
			case IECModelPackage.STATIC_FUNCTIONBLOCK__ACCESSES_GLOBAL_VARIABLE:
				return accessesGlobalVariable != null && !accessesGlobalVariable.isEmpty();
			case IECModelPackage.STATIC_FUNCTIONBLOCK__HAS_METHOD:
				return hasMethod != null && !hasMethod.isEmpty();
			case IECModelPackage.STATIC_FUNCTIONBLOCK__HAS_PROPERTY:
				return hasProperty != null && !hasProperty.isEmpty();
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
		result.append(" (Id: ");
		result.append(id);
		result.append(", Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //StaticFunctionblockImpl
