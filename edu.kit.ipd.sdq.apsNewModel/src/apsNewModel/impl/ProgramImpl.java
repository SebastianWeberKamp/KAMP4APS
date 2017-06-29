/**
 */
package apsNewModel.impl;

import apsNewModel.ApsNewModelPackage;
import apsNewModel.Function;
import apsNewModel.FunctionBlock;
import apsNewModel.GlobalVariable;
import apsNewModel.IECInterface;
import apsNewModel.IECMethodImplementation;
import apsNewModel.IECPropertyImplementation;
import apsNewModel.Program;

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
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link apsNewModel.impl.ProgramImpl#getCallsFunction <em>Calls Function</em>}</li>
 *   <li>{@link apsNewModel.impl.ProgramImpl#getCallsFunctionBlock <em>Calls Function Block</em>}</li>
 *   <li>{@link apsNewModel.impl.ProgramImpl#getName <em>Name</em>}</li>
 *   <li>{@link apsNewModel.impl.ProgramImpl#getId <em>Id</em>}</li>
 *   <li>{@link apsNewModel.impl.ProgramImpl#getType <em>Type</em>}</li>
 *   <li>{@link apsNewModel.impl.ProgramImpl#getImplementsInterface <em>Implements Interface</em>}</li>
 *   <li>{@link apsNewModel.impl.ProgramImpl#getDeclaresVariable <em>Declares Variable</em>}</li>
 *   <li>{@link apsNewModel.impl.ProgramImpl#getUsesEnum <em>Uses Enum</em>}</li>
 *   <li>{@link apsNewModel.impl.ProgramImpl#getAccessesProperty <em>Accesses Property</em>}</li>
 *   <li>{@link apsNewModel.impl.ProgramImpl#getCallsMethod <em>Calls Method</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramImpl extends MinimalEObjectImpl.Container implements Program {
	/**
	 * The cached value of the '{@link #getCallsFunction() <em>Calls Function</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallsFunction()
	 * @generated
	 * @ordered
	 */
	protected EList<Function> callsFunction;

	/**
	 * The cached value of the '{@link #getCallsFunctionBlock() <em>Calls Function Block</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallsFunctionBlock()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionBlock> callsFunctionBlock;

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
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected IECRepository.Program type;

	/**
	 * The cached value of the '{@link #getImplementsInterface() <em>Implements Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementsInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<IECInterface> implementsInterface;

	/**
	 * The cached value of the '{@link #getDeclaresVariable() <em>Declares Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaresVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<GlobalVariable> declaresVariable;

	/**
	 * The cached value of the '{@link #getUsesEnum() <em>Uses Enum</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesEnum()
	 * @generated
	 * @ordered
	 */
	protected EList<apsNewModel.Enum> usesEnum;

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
	 * The cached value of the '{@link #getCallsMethod() <em>Calls Method</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallsMethod()
	 * @generated
	 * @ordered
	 */
	protected EList<IECMethodImplementation> callsMethod;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApsNewModelPackage.Literals.PROGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Function> getCallsFunction() {
		if (callsFunction == null) {
			callsFunction = new EObjectContainmentEList<Function>(Function.class, this, ApsNewModelPackage.PROGRAM__CALLS_FUNCTION);
		}
		return callsFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionBlock> getCallsFunctionBlock() {
		if (callsFunctionBlock == null) {
			callsFunctionBlock = new EObjectContainmentEList<FunctionBlock>(FunctionBlock.class, this, ApsNewModelPackage.PROGRAM__CALLS_FUNCTION_BLOCK);
		}
		return callsFunctionBlock;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApsNewModelPackage.PROGRAM__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApsNewModelPackage.PROGRAM__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECRepository.Program getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (IECRepository.Program)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApsNewModelPackage.PROGRAM__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECRepository.Program basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(IECRepository.Program newType) {
		IECRepository.Program oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApsNewModelPackage.PROGRAM__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECInterface> getImplementsInterface() {
		if (implementsInterface == null) {
			implementsInterface = new EObjectContainmentEList<IECInterface>(IECInterface.class, this, ApsNewModelPackage.PROGRAM__IMPLEMENTS_INTERFACE);
		}
		return implementsInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalVariable> getDeclaresVariable() {
		if (declaresVariable == null) {
			declaresVariable = new EObjectContainmentEList<GlobalVariable>(GlobalVariable.class, this, ApsNewModelPackage.PROGRAM__DECLARES_VARIABLE);
		}
		return declaresVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<apsNewModel.Enum> getUsesEnum() {
		if (usesEnum == null) {
			usesEnum = new EObjectContainmentEList<apsNewModel.Enum>(apsNewModel.Enum.class, this, ApsNewModelPackage.PROGRAM__USES_ENUM);
		}
		return usesEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECPropertyImplementation> getAccessesProperty() {
		if (accessesProperty == null) {
			accessesProperty = new EObjectResolvingEList<IECPropertyImplementation>(IECPropertyImplementation.class, this, ApsNewModelPackage.PROGRAM__ACCESSES_PROPERTY);
		}
		return accessesProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECMethodImplementation> getCallsMethod() {
		if (callsMethod == null) {
			callsMethod = new EObjectResolvingEList<IECMethodImplementation>(IECMethodImplementation.class, this, ApsNewModelPackage.PROGRAM__CALLS_METHOD);
		}
		return callsMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApsNewModelPackage.PROGRAM__CALLS_FUNCTION:
				return ((InternalEList<?>)getCallsFunction()).basicRemove(otherEnd, msgs);
			case ApsNewModelPackage.PROGRAM__CALLS_FUNCTION_BLOCK:
				return ((InternalEList<?>)getCallsFunctionBlock()).basicRemove(otherEnd, msgs);
			case ApsNewModelPackage.PROGRAM__IMPLEMENTS_INTERFACE:
				return ((InternalEList<?>)getImplementsInterface()).basicRemove(otherEnd, msgs);
			case ApsNewModelPackage.PROGRAM__DECLARES_VARIABLE:
				return ((InternalEList<?>)getDeclaresVariable()).basicRemove(otherEnd, msgs);
			case ApsNewModelPackage.PROGRAM__USES_ENUM:
				return ((InternalEList<?>)getUsesEnum()).basicRemove(otherEnd, msgs);
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
			case ApsNewModelPackage.PROGRAM__CALLS_FUNCTION:
				return getCallsFunction();
			case ApsNewModelPackage.PROGRAM__CALLS_FUNCTION_BLOCK:
				return getCallsFunctionBlock();
			case ApsNewModelPackage.PROGRAM__NAME:
				return getName();
			case ApsNewModelPackage.PROGRAM__ID:
				return getId();
			case ApsNewModelPackage.PROGRAM__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ApsNewModelPackage.PROGRAM__IMPLEMENTS_INTERFACE:
				return getImplementsInterface();
			case ApsNewModelPackage.PROGRAM__DECLARES_VARIABLE:
				return getDeclaresVariable();
			case ApsNewModelPackage.PROGRAM__USES_ENUM:
				return getUsesEnum();
			case ApsNewModelPackage.PROGRAM__ACCESSES_PROPERTY:
				return getAccessesProperty();
			case ApsNewModelPackage.PROGRAM__CALLS_METHOD:
				return getCallsMethod();
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
			case ApsNewModelPackage.PROGRAM__CALLS_FUNCTION:
				getCallsFunction().clear();
				getCallsFunction().addAll((Collection<? extends Function>)newValue);
				return;
			case ApsNewModelPackage.PROGRAM__CALLS_FUNCTION_BLOCK:
				getCallsFunctionBlock().clear();
				getCallsFunctionBlock().addAll((Collection<? extends FunctionBlock>)newValue);
				return;
			case ApsNewModelPackage.PROGRAM__NAME:
				setName((String)newValue);
				return;
			case ApsNewModelPackage.PROGRAM__ID:
				setId((String)newValue);
				return;
			case ApsNewModelPackage.PROGRAM__TYPE:
				setType((IECRepository.Program)newValue);
				return;
			case ApsNewModelPackage.PROGRAM__IMPLEMENTS_INTERFACE:
				getImplementsInterface().clear();
				getImplementsInterface().addAll((Collection<? extends IECInterface>)newValue);
				return;
			case ApsNewModelPackage.PROGRAM__DECLARES_VARIABLE:
				getDeclaresVariable().clear();
				getDeclaresVariable().addAll((Collection<? extends GlobalVariable>)newValue);
				return;
			case ApsNewModelPackage.PROGRAM__USES_ENUM:
				getUsesEnum().clear();
				getUsesEnum().addAll((Collection<? extends apsNewModel.Enum>)newValue);
				return;
			case ApsNewModelPackage.PROGRAM__ACCESSES_PROPERTY:
				getAccessesProperty().clear();
				getAccessesProperty().addAll((Collection<? extends IECPropertyImplementation>)newValue);
				return;
			case ApsNewModelPackage.PROGRAM__CALLS_METHOD:
				getCallsMethod().clear();
				getCallsMethod().addAll((Collection<? extends IECMethodImplementation>)newValue);
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
			case ApsNewModelPackage.PROGRAM__CALLS_FUNCTION:
				getCallsFunction().clear();
				return;
			case ApsNewModelPackage.PROGRAM__CALLS_FUNCTION_BLOCK:
				getCallsFunctionBlock().clear();
				return;
			case ApsNewModelPackage.PROGRAM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ApsNewModelPackage.PROGRAM__ID:
				setId(ID_EDEFAULT);
				return;
			case ApsNewModelPackage.PROGRAM__TYPE:
				setType((IECRepository.Program)null);
				return;
			case ApsNewModelPackage.PROGRAM__IMPLEMENTS_INTERFACE:
				getImplementsInterface().clear();
				return;
			case ApsNewModelPackage.PROGRAM__DECLARES_VARIABLE:
				getDeclaresVariable().clear();
				return;
			case ApsNewModelPackage.PROGRAM__USES_ENUM:
				getUsesEnum().clear();
				return;
			case ApsNewModelPackage.PROGRAM__ACCESSES_PROPERTY:
				getAccessesProperty().clear();
				return;
			case ApsNewModelPackage.PROGRAM__CALLS_METHOD:
				getCallsMethod().clear();
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
			case ApsNewModelPackage.PROGRAM__CALLS_FUNCTION:
				return callsFunction != null && !callsFunction.isEmpty();
			case ApsNewModelPackage.PROGRAM__CALLS_FUNCTION_BLOCK:
				return callsFunctionBlock != null && !callsFunctionBlock.isEmpty();
			case ApsNewModelPackage.PROGRAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ApsNewModelPackage.PROGRAM__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ApsNewModelPackage.PROGRAM__TYPE:
				return type != null;
			case ApsNewModelPackage.PROGRAM__IMPLEMENTS_INTERFACE:
				return implementsInterface != null && !implementsInterface.isEmpty();
			case ApsNewModelPackage.PROGRAM__DECLARES_VARIABLE:
				return declaresVariable != null && !declaresVariable.isEmpty();
			case ApsNewModelPackage.PROGRAM__USES_ENUM:
				return usesEnum != null && !usesEnum.isEmpty();
			case ApsNewModelPackage.PROGRAM__ACCESSES_PROPERTY:
				return accessesProperty != null && !accessesProperty.isEmpty();
			case ApsNewModelPackage.PROGRAM__CALLS_METHOD:
				return callsMethod != null && !callsMethod.isEmpty();
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
		result.append(" (Name: ");
		result.append(name);
		result.append(", Id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ProgramImpl
