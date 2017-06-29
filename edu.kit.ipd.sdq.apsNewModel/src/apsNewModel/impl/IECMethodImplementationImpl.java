/**
 */
package apsNewModel.impl;

import apsNewModel.ApsNewModelPackage;
import apsNewModel.GlobalVariable;
import apsNewModel.IECMethodImplementation;
import apsNewModel.IECPropertyImplementation;

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
 * An implementation of the model object '<em><b>IEC Method Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link apsNewModel.impl.IECMethodImplementationImpl#getId <em>Id</em>}</li>
 *   <li>{@link apsNewModel.impl.IECMethodImplementationImpl#getName <em>Name</em>}</li>
 *   <li>{@link apsNewModel.impl.IECMethodImplementationImpl#getType <em>Type</em>}</li>
 *   <li>{@link apsNewModel.impl.IECMethodImplementationImpl#getAccessesGlobalVariable <em>Accesses Global Variable</em>}</li>
 *   <li>{@link apsNewModel.impl.IECMethodImplementationImpl#getAccessesProperty <em>Accesses Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IECMethodImplementationImpl extends MinimalEObjectImpl.Container implements IECMethodImplementation {
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
	protected IECRepository.IECMethodImplementation type;

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
	 * The cached value of the '{@link #getAccessesProperty() <em>Accesses Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessesProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<IECPropertyImplementation> accessesProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IECMethodImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApsNewModelPackage.Literals.IEC_METHOD_IMPLEMENTATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApsNewModelPackage.IEC_METHOD_IMPLEMENTATION__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApsNewModelPackage.IEC_METHOD_IMPLEMENTATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECRepository.IECMethodImplementation getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (IECRepository.IECMethodImplementation)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApsNewModelPackage.IEC_METHOD_IMPLEMENTATION__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECRepository.IECMethodImplementation basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(IECRepository.IECMethodImplementation newType) {
		IECRepository.IECMethodImplementation oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApsNewModelPackage.IEC_METHOD_IMPLEMENTATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalVariable> getAccessesGlobalVariable() {
		if (accessesGlobalVariable == null) {
			accessesGlobalVariable = new EObjectResolvingEList<GlobalVariable>(GlobalVariable.class, this, ApsNewModelPackage.IEC_METHOD_IMPLEMENTATION__ACCESSES_GLOBAL_VARIABLE);
		}
		return accessesGlobalVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECPropertyImplementation> getAccessesProperty() {
		if (accessesProperty == null) {
			accessesProperty = new EObjectResolvingEList<IECPropertyImplementation>(IECPropertyImplementation.class, this, ApsNewModelPackage.IEC_METHOD_IMPLEMENTATION__ACCESSES_PROPERTY);
		}
		return accessesProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApsNewModelPackage.IEC_METHOD_IMPLEMENTATION__ID:
				return getId();
			case ApsNewModelPackage.IEC_METHOD_IMPLEMENTATION__NAME:
				return getName();
			case ApsNewModelPackage.IEC_METHOD_IMPLEMENTATION__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ApsNewModelPackage.IEC_METHOD_IMPLEMENTATION__ACCESSES_GLOBAL_VARIABLE:
				return getAccessesGlobalVariable();
			case ApsNewModelPackage.IEC_METHOD_IMPLEMENTATION__ACCESSES_PROPERTY:
				return getAccessesProperty();
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
			case ApsNewModelPackage.IEC_METHOD_IMPLEMENTATION__ID:
				setId((String)newValue);
				return;
			case ApsNewModelPackage.IEC_METHOD_IMPLEMENTATION__NAME:
				setName((String)newValue);
				return;
			case ApsNewModelPackage.IEC_METHOD_IMPLEMENTATION__TYPE:
				setType((IECRepository.IECMethodImplementation)newValue);
				return;
			case ApsNewModelPackage.IEC_METHOD_IMPLEMENTATION__ACCESSES_GLOBAL_VARIABLE:
				getAccessesGlobalVariable().clear();
				getAccessesGlobalVariable().addAll((Collection<? extends GlobalVariable>)newValue);
				return;
			case ApsNewModelPackage.IEC_METHOD_IMPLEMENTATION__ACCESSES_PROPERTY:
				getAccessesProperty().clear();
				getAccessesProperty().addAll((Collection<? extends IECPropertyImplementation>)newValue);
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
			case ApsNewModelPackage.IEC_METHOD_IMPLEMENTATION__ID:
				setId(ID_EDEFAULT);
				return;
			case ApsNewModelPackage.IEC_METHOD_IMPLEMENTATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ApsNewModelPackage.IEC_METHOD_IMPLEMENTATION__TYPE:
				setType((IECRepository.IECMethodImplementation)null);
				return;
			case ApsNewModelPackage.IEC_METHOD_IMPLEMENTATION__ACCESSES_GLOBAL_VARIABLE:
				getAccessesGlobalVariable().clear();
				return;
			case ApsNewModelPackage.IEC_METHOD_IMPLEMENTATION__ACCESSES_PROPERTY:
				getAccessesProperty().clear();
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
			case ApsNewModelPackage.IEC_METHOD_IMPLEMENTATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ApsNewModelPackage.IEC_METHOD_IMPLEMENTATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ApsNewModelPackage.IEC_METHOD_IMPLEMENTATION__TYPE:
				return type != null;
			case ApsNewModelPackage.IEC_METHOD_IMPLEMENTATION__ACCESSES_GLOBAL_VARIABLE:
				return accessesGlobalVariable != null && !accessesGlobalVariable.isEmpty();
			case ApsNewModelPackage.IEC_METHOD_IMPLEMENTATION__ACCESSES_PROPERTY:
				return accessesProperty != null && !accessesProperty.isEmpty();
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

} //IECMethodImplementationImpl
