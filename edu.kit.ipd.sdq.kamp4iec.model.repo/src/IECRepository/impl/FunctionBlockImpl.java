/**
 */
package IECRepository.impl;

import IECRepository.Function;
import IECRepository.FunctionBlock;
import IECRepository.GlobalVariable;
import IECRepository.IECInterface;
import IECRepository.IECMethodImplementation;
import IECRepository.IECPropertyImplementation;
import IECRepository.IECRepositoryPackage;
import IECRepository.IFunctionblock;

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
 * An implementation of the model object '<em><b>Function Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link IECRepository.impl.FunctionBlockImpl#getId <em>Id</em>}</li>
 *   <li>{@link IECRepository.impl.FunctionBlockImpl#getName <em>Name</em>}</li>
 *   <li>{@link IECRepository.impl.FunctionBlockImpl#getHasIecMethod <em>Has Iec Method</em>}</li>
 *   <li>{@link IECRepository.impl.FunctionBlockImpl#getHasIecProperty <em>Has Iec Property</em>}</li>
 *   <li>{@link IECRepository.impl.FunctionBlockImpl#getAccessesVariable <em>Accesses Variable</em>}</li>
 *   <li>{@link IECRepository.impl.FunctionBlockImpl#getUsesFunctionBlock <em>Uses Function Block</em>}</li>
 *   <li>{@link IECRepository.impl.FunctionBlockImpl#getCallsFunction <em>Calls Function</em>}</li>
 *   <li>{@link IECRepository.impl.FunctionBlockImpl#getImplements <em>Implements</em>}</li>
 *   <li>{@link IECRepository.impl.FunctionBlockImpl#getUsesEnum <em>Uses Enum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionBlockImpl extends MinimalEObjectImpl.Container implements FunctionBlock {
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
	 * The cached value of the '{@link #getHasIecMethod() <em>Has Iec Method</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasIecMethod()
	 * @generated
	 * @ordered
	 */
	protected EList<IECMethodImplementation> hasIecMethod;

	/**
	 * The cached value of the '{@link #getHasIecProperty() <em>Has Iec Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasIecProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<IECPropertyImplementation> hasIecProperty;

	/**
	 * The cached value of the '{@link #getAccessesVariable() <em>Accesses Variable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessesVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<GlobalVariable> accessesVariable;

	/**
	 * The cached value of the '{@link #getUsesFunctionBlock() <em>Uses Function Block</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesFunctionBlock()
	 * @generated
	 * @ordered
	 */
	protected EList<IFunctionblock> usesFunctionBlock;

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
	 * The cached value of the '{@link #getImplements() <em>Implements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplements()
	 * @generated
	 * @ordered
	 */
	protected EList<IECInterface> implements_;

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
	protected FunctionBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IECRepositoryPackage.Literals.FUNCTION_BLOCK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IECRepositoryPackage.FUNCTION_BLOCK__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IECRepositoryPackage.FUNCTION_BLOCK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECMethodImplementation> getHasIecMethod() {
		if (hasIecMethod == null) {
			hasIecMethod = new EObjectContainmentEList<IECMethodImplementation>(IECMethodImplementation.class, this, IECRepositoryPackage.FUNCTION_BLOCK__HAS_IEC_METHOD);
		}
		return hasIecMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECPropertyImplementation> getHasIecProperty() {
		if (hasIecProperty == null) {
			hasIecProperty = new EObjectContainmentEList<IECPropertyImplementation>(IECPropertyImplementation.class, this, IECRepositoryPackage.FUNCTION_BLOCK__HAS_IEC_PROPERTY);
		}
		return hasIecProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalVariable> getAccessesVariable() {
		if (accessesVariable == null) {
			accessesVariable = new EObjectResolvingEList<GlobalVariable>(GlobalVariable.class, this, IECRepositoryPackage.FUNCTION_BLOCK__ACCESSES_VARIABLE);
		}
		return accessesVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IFunctionblock> getUsesFunctionBlock() {
		if (usesFunctionBlock == null) {
			usesFunctionBlock = new EObjectResolvingEList<IFunctionblock>(IFunctionblock.class, this, IECRepositoryPackage.FUNCTION_BLOCK__USES_FUNCTION_BLOCK);
		}
		return usesFunctionBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Function> getCallsFunction() {
		if (callsFunction == null) {
			callsFunction = new EObjectResolvingEList<Function>(Function.class, this, IECRepositoryPackage.FUNCTION_BLOCK__CALLS_FUNCTION);
		}
		return callsFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECInterface> getImplements() {
		if (implements_ == null) {
			implements_ = new EObjectResolvingEList<IECInterface>(IECInterface.class, this, IECRepositoryPackage.FUNCTION_BLOCK__IMPLEMENTS);
		}
		return implements_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECRepository.Enum> getUsesEnum() {
		if (usesEnum == null) {
			usesEnum = new EObjectResolvingEList<IECRepository.Enum>(IECRepository.Enum.class, this, IECRepositoryPackage.FUNCTION_BLOCK__USES_ENUM);
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
			case IECRepositoryPackage.FUNCTION_BLOCK__HAS_IEC_METHOD:
				return ((InternalEList<?>)getHasIecMethod()).basicRemove(otherEnd, msgs);
			case IECRepositoryPackage.FUNCTION_BLOCK__HAS_IEC_PROPERTY:
				return ((InternalEList<?>)getHasIecProperty()).basicRemove(otherEnd, msgs);
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
			case IECRepositoryPackage.FUNCTION_BLOCK__ID:
				return getId();
			case IECRepositoryPackage.FUNCTION_BLOCK__NAME:
				return getName();
			case IECRepositoryPackage.FUNCTION_BLOCK__HAS_IEC_METHOD:
				return getHasIecMethod();
			case IECRepositoryPackage.FUNCTION_BLOCK__HAS_IEC_PROPERTY:
				return getHasIecProperty();
			case IECRepositoryPackage.FUNCTION_BLOCK__ACCESSES_VARIABLE:
				return getAccessesVariable();
			case IECRepositoryPackage.FUNCTION_BLOCK__USES_FUNCTION_BLOCK:
				return getUsesFunctionBlock();
			case IECRepositoryPackage.FUNCTION_BLOCK__CALLS_FUNCTION:
				return getCallsFunction();
			case IECRepositoryPackage.FUNCTION_BLOCK__IMPLEMENTS:
				return getImplements();
			case IECRepositoryPackage.FUNCTION_BLOCK__USES_ENUM:
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
			case IECRepositoryPackage.FUNCTION_BLOCK__ID:
				setId((String)newValue);
				return;
			case IECRepositoryPackage.FUNCTION_BLOCK__NAME:
				setName((String)newValue);
				return;
			case IECRepositoryPackage.FUNCTION_BLOCK__HAS_IEC_METHOD:
				getHasIecMethod().clear();
				getHasIecMethod().addAll((Collection<? extends IECMethodImplementation>)newValue);
				return;
			case IECRepositoryPackage.FUNCTION_BLOCK__HAS_IEC_PROPERTY:
				getHasIecProperty().clear();
				getHasIecProperty().addAll((Collection<? extends IECPropertyImplementation>)newValue);
				return;
			case IECRepositoryPackage.FUNCTION_BLOCK__ACCESSES_VARIABLE:
				getAccessesVariable().clear();
				getAccessesVariable().addAll((Collection<? extends GlobalVariable>)newValue);
				return;
			case IECRepositoryPackage.FUNCTION_BLOCK__USES_FUNCTION_BLOCK:
				getUsesFunctionBlock().clear();
				getUsesFunctionBlock().addAll((Collection<? extends IFunctionblock>)newValue);
				return;
			case IECRepositoryPackage.FUNCTION_BLOCK__CALLS_FUNCTION:
				getCallsFunction().clear();
				getCallsFunction().addAll((Collection<? extends Function>)newValue);
				return;
			case IECRepositoryPackage.FUNCTION_BLOCK__IMPLEMENTS:
				getImplements().clear();
				getImplements().addAll((Collection<? extends IECInterface>)newValue);
				return;
			case IECRepositoryPackage.FUNCTION_BLOCK__USES_ENUM:
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
			case IECRepositoryPackage.FUNCTION_BLOCK__ID:
				setId(ID_EDEFAULT);
				return;
			case IECRepositoryPackage.FUNCTION_BLOCK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IECRepositoryPackage.FUNCTION_BLOCK__HAS_IEC_METHOD:
				getHasIecMethod().clear();
				return;
			case IECRepositoryPackage.FUNCTION_BLOCK__HAS_IEC_PROPERTY:
				getHasIecProperty().clear();
				return;
			case IECRepositoryPackage.FUNCTION_BLOCK__ACCESSES_VARIABLE:
				getAccessesVariable().clear();
				return;
			case IECRepositoryPackage.FUNCTION_BLOCK__USES_FUNCTION_BLOCK:
				getUsesFunctionBlock().clear();
				return;
			case IECRepositoryPackage.FUNCTION_BLOCK__CALLS_FUNCTION:
				getCallsFunction().clear();
				return;
			case IECRepositoryPackage.FUNCTION_BLOCK__IMPLEMENTS:
				getImplements().clear();
				return;
			case IECRepositoryPackage.FUNCTION_BLOCK__USES_ENUM:
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
			case IECRepositoryPackage.FUNCTION_BLOCK__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case IECRepositoryPackage.FUNCTION_BLOCK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IECRepositoryPackage.FUNCTION_BLOCK__HAS_IEC_METHOD:
				return hasIecMethod != null && !hasIecMethod.isEmpty();
			case IECRepositoryPackage.FUNCTION_BLOCK__HAS_IEC_PROPERTY:
				return hasIecProperty != null && !hasIecProperty.isEmpty();
			case IECRepositoryPackage.FUNCTION_BLOCK__ACCESSES_VARIABLE:
				return accessesVariable != null && !accessesVariable.isEmpty();
			case IECRepositoryPackage.FUNCTION_BLOCK__USES_FUNCTION_BLOCK:
				return usesFunctionBlock != null && !usesFunctionBlock.isEmpty();
			case IECRepositoryPackage.FUNCTION_BLOCK__CALLS_FUNCTION:
				return callsFunction != null && !callsFunction.isEmpty();
			case IECRepositoryPackage.FUNCTION_BLOCK__IMPLEMENTS:
				return implements_ != null && !implements_.isEmpty();
			case IECRepositoryPackage.FUNCTION_BLOCK__USES_ENUM:
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

} //FunctionBlockImpl
