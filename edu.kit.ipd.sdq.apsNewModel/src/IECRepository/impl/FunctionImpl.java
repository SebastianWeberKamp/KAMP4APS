/**
 */
package IECRepository.impl;

import IECRepository.Function;
import IECRepository.IECRepositoryPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link IECRepository.impl.FunctionImpl#getId <em>Id</em>}</li>
 *   <li>{@link IECRepository.impl.FunctionImpl#getName <em>Name</em>}</li>
 *   <li>{@link IECRepository.impl.FunctionImpl#getCallsFunction <em>Calls Function</em>}</li>
 *   <li>{@link IECRepository.impl.FunctionImpl#getUsesEnum <em>Uses Enum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionImpl extends MinimalEObjectImpl.Container implements Function {
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
	 * The cached value of the '{@link #getCallsFunction() <em>Calls Function</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallsFunction()
	 * @generated
	 * @ordered
	 */
	protected EList<Function> callsFunction;

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
		return IECRepositoryPackage.Literals.FUNCTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IECRepositoryPackage.FUNCTION__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IECRepositoryPackage.FUNCTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Function> getCallsFunction() {
		if (callsFunction == null) {
			callsFunction = new EObjectResolvingEList<Function>(Function.class, this, IECRepositoryPackage.FUNCTION__CALLS_FUNCTION);
		}
		return callsFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECRepository.Enum> getUsesEnum() {
		if (usesEnum == null) {
			usesEnum = new EObjectResolvingEList<IECRepository.Enum>(IECRepository.Enum.class, this, IECRepositoryPackage.FUNCTION__USES_ENUM);
		}
		return usesEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IECRepositoryPackage.FUNCTION__ID:
				return getId();
			case IECRepositoryPackage.FUNCTION__NAME:
				return getName();
			case IECRepositoryPackage.FUNCTION__CALLS_FUNCTION:
				return getCallsFunction();
			case IECRepositoryPackage.FUNCTION__USES_ENUM:
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
			case IECRepositoryPackage.FUNCTION__ID:
				setId((String)newValue);
				return;
			case IECRepositoryPackage.FUNCTION__NAME:
				setName((String)newValue);
				return;
			case IECRepositoryPackage.FUNCTION__CALLS_FUNCTION:
				getCallsFunction().clear();
				getCallsFunction().addAll((Collection<? extends Function>)newValue);
				return;
			case IECRepositoryPackage.FUNCTION__USES_ENUM:
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
			case IECRepositoryPackage.FUNCTION__ID:
				setId(ID_EDEFAULT);
				return;
			case IECRepositoryPackage.FUNCTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IECRepositoryPackage.FUNCTION__CALLS_FUNCTION:
				getCallsFunction().clear();
				return;
			case IECRepositoryPackage.FUNCTION__USES_ENUM:
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
			case IECRepositoryPackage.FUNCTION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case IECRepositoryPackage.FUNCTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IECRepositoryPackage.FUNCTION__CALLS_FUNCTION:
				return callsFunction != null && !callsFunction.isEmpty();
			case IECRepositoryPackage.FUNCTION__USES_ENUM:
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

} //FunctionImpl
