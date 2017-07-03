/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl;

import IECRepository.IECMethod;
import IECRepository.IECProperty;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECInterface;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IEC Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECInterfaceImpl#getId <em>Id</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECInterfaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECInterfaceImpl#getDefinesIecMethod <em>Defines Iec Method</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECInterfaceImpl#getDefinesIecProperty <em>Defines Iec Property</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECInterfaceImpl#getUsesEnum <em>Uses Enum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IECInterfaceImpl extends MinimalEObjectImpl.Container implements IECInterface {
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
	 * The cached value of the '{@link #getDefinesIecMethod() <em>Defines Iec Method</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinesIecMethod()
	 * @generated
	 * @ordered
	 */
	protected EList<IECMethod> definesIecMethod;

	/**
	 * The cached value of the '{@link #getDefinesIecProperty() <em>Defines Iec Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinesIecProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<IECProperty> definesIecProperty;

	/**
	 * The cached value of the '{@link #getUsesEnum() <em>Uses Enum</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesEnum()
	 * @generated
	 * @ordered
	 */
	protected EList<IECRepository.Enum> usesEnum;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IECInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IECRepositoryPackage.Literals.IEC_INTERFACE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IECRepositoryPackage.IEC_INTERFACE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IECRepositoryPackage.IEC_INTERFACE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECMethod> getDefinesIecMethod() {
		if (definesIecMethod == null) {
			definesIecMethod = new EObjectContainmentEList<IECMethod>(IECMethod.class, this, IECRepositoryPackage.IEC_INTERFACE__DEFINES_IEC_METHOD);
		}
		return definesIecMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECProperty> getDefinesIecProperty() {
		if (definesIecProperty == null) {
			definesIecProperty = new EObjectContainmentEList<IECProperty>(IECProperty.class, this, IECRepositoryPackage.IEC_INTERFACE__DEFINES_IEC_PROPERTY);
		}
		return definesIecProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECRepository.Enum> getUsesEnum() {
		if (usesEnum == null) {
			usesEnum = new EObjectResolvingEList<IECRepository.Enum>(IECRepository.Enum.class, this, IECRepositoryPackage.IEC_INTERFACE__USES_ENUM);
		}
		return usesEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IECRepositoryPackage.IEC_INTERFACE__DEFINES_IEC_METHOD:
				return ((InternalEList<?>)getDefinesIecMethod()).basicRemove(otherEnd, msgs);
			case IECRepositoryPackage.IEC_INTERFACE__DEFINES_IEC_PROPERTY:
				return ((InternalEList<?>)getDefinesIecProperty()).basicRemove(otherEnd, msgs);
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
			case IECRepositoryPackage.IEC_INTERFACE__ID:
				return getId();
			case IECRepositoryPackage.IEC_INTERFACE__NAME:
				return getName();
			case IECRepositoryPackage.IEC_INTERFACE__DEFINES_IEC_METHOD:
				return getDefinesIecMethod();
			case IECRepositoryPackage.IEC_INTERFACE__DEFINES_IEC_PROPERTY:
				return getDefinesIecProperty();
			case IECRepositoryPackage.IEC_INTERFACE__USES_ENUM:
				return getUsesEnum();
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
			case IECRepositoryPackage.IEC_INTERFACE__ID:
				setId((String)newValue);
				return;
			case IECRepositoryPackage.IEC_INTERFACE__NAME:
				setName((String)newValue);
				return;
			case IECRepositoryPackage.IEC_INTERFACE__DEFINES_IEC_METHOD:
				getDefinesIecMethod().clear();
				getDefinesIecMethod().addAll((Collection<? extends IECMethod>)newValue);
				return;
			case IECRepositoryPackage.IEC_INTERFACE__DEFINES_IEC_PROPERTY:
				getDefinesIecProperty().clear();
				getDefinesIecProperty().addAll((Collection<? extends IECProperty>)newValue);
				return;
			case IECRepositoryPackage.IEC_INTERFACE__USES_ENUM:
				getUsesEnum().clear();
				getUsesEnum().addAll((Collection<? extends IECRepository.Enum>)newValue);
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
			case IECRepositoryPackage.IEC_INTERFACE__ID:
				setId(ID_EDEFAULT);
				return;
			case IECRepositoryPackage.IEC_INTERFACE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IECRepositoryPackage.IEC_INTERFACE__DEFINES_IEC_METHOD:
				getDefinesIecMethod().clear();
				return;
			case IECRepositoryPackage.IEC_INTERFACE__DEFINES_IEC_PROPERTY:
				getDefinesIecProperty().clear();
				return;
			case IECRepositoryPackage.IEC_INTERFACE__USES_ENUM:
				getUsesEnum().clear();
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
			case IECRepositoryPackage.IEC_INTERFACE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case IECRepositoryPackage.IEC_INTERFACE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IECRepositoryPackage.IEC_INTERFACE__DEFINES_IEC_METHOD:
				return definesIecMethod != null && !definesIecMethod.isEmpty();
			case IECRepositoryPackage.IEC_INTERFACE__DEFINES_IEC_PROPERTY:
				return definesIecProperty != null && !definesIecProperty.isEmpty();
			case IECRepositoryPackage.IEC_INTERFACE__USES_ENUM:
				return usesEnum != null && !usesEnum.isEmpty();
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

} //IECInterfaceImpl
