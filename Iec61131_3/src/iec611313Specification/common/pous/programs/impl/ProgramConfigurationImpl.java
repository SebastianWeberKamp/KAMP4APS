/**
 */
package iec611313Specification.common.pous.programs.impl;

import iec611313Specification.common.pous.programs.ProgramConfigElement;
import iec611313Specification.common.pous.programs.ProgramConfiguration;
import iec611313Specification.common.pous.programs.ProgramType;
import iec611313Specification.common.pous.programs.ProgramsPackage;

import iec611313Specification.configuration.Task;

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
 * An implementation of the model object '<em><b>Program Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.common.pous.programs.impl.ProgramConfigurationImpl#getName <em>Name</em>}</li>
 *   <li>{@link iec611313Specification.common.pous.programs.impl.ProgramConfigurationImpl#isRetentive <em>Retentive</em>}</li>
 *   <li>{@link iec611313Specification.common.pous.programs.impl.ProgramConfigurationImpl#getHasProgramType <em>Has Program Type</em>}</li>
 *   <li>{@link iec611313Specification.common.pous.programs.impl.ProgramConfigurationImpl#getContainsProgConfigElement <em>Contains Prog Config Element</em>}</li>
 *   <li>{@link iec611313Specification.common.pous.programs.impl.ProgramConfigurationImpl#getIsAssignedTo <em>Is Assigned To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramConfigurationImpl extends MinimalEObjectImpl.Container implements ProgramConfiguration {
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
	 * The default value of the '{@link #isRetentive() <em>Retentive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRetentive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RETENTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRetentive() <em>Retentive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRetentive()
	 * @generated
	 * @ordered
	 */
	protected boolean retentive = RETENTIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasProgramType() <em>Has Program Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasProgramType()
	 * @generated
	 * @ordered
	 */
	protected ProgramType hasProgramType;

	/**
	 * The cached value of the '{@link #getContainsProgConfigElement() <em>Contains Prog Config Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsProgConfigElement()
	 * @generated
	 * @ordered
	 */
	protected EList<ProgramConfigElement> containsProgConfigElement;

	/**
	 * The cached value of the '{@link #getIsAssignedTo() <em>Is Assigned To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAssignedTo()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> isAssignedTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProgramsPackage.Literals.PROGRAM_CONFIGURATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProgramsPackage.PROGRAM_CONFIGURATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRetentive() {
		return retentive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetentive(boolean newRetentive) {
		boolean oldRetentive = retentive;
		retentive = newRetentive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgramsPackage.PROGRAM_CONFIGURATION__RETENTIVE, oldRetentive, retentive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramType getHasProgramType() {
		return hasProgramType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasProgramType(ProgramType newHasProgramType, NotificationChain msgs) {
		ProgramType oldHasProgramType = hasProgramType;
		hasProgramType = newHasProgramType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProgramsPackage.PROGRAM_CONFIGURATION__HAS_PROGRAM_TYPE, oldHasProgramType, newHasProgramType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasProgramType(ProgramType newHasProgramType) {
		if (newHasProgramType != hasProgramType) {
			NotificationChain msgs = null;
			if (hasProgramType != null)
				msgs = ((InternalEObject)hasProgramType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProgramsPackage.PROGRAM_CONFIGURATION__HAS_PROGRAM_TYPE, null, msgs);
			if (newHasProgramType != null)
				msgs = ((InternalEObject)newHasProgramType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProgramsPackage.PROGRAM_CONFIGURATION__HAS_PROGRAM_TYPE, null, msgs);
			msgs = basicSetHasProgramType(newHasProgramType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgramsPackage.PROGRAM_CONFIGURATION__HAS_PROGRAM_TYPE, newHasProgramType, newHasProgramType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProgramConfigElement> getContainsProgConfigElement() {
		if (containsProgConfigElement == null) {
			containsProgConfigElement = new EObjectContainmentEList<ProgramConfigElement>(ProgramConfigElement.class, this, ProgramsPackage.PROGRAM_CONFIGURATION__CONTAINS_PROG_CONFIG_ELEMENT);
		}
		return containsProgConfigElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getIsAssignedTo() {
		if (isAssignedTo == null) {
			isAssignedTo = new EObjectResolvingEList<Task>(Task.class, this, ProgramsPackage.PROGRAM_CONFIGURATION__IS_ASSIGNED_TO);
		}
		return isAssignedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProgramsPackage.PROGRAM_CONFIGURATION__HAS_PROGRAM_TYPE:
				return basicSetHasProgramType(null, msgs);
			case ProgramsPackage.PROGRAM_CONFIGURATION__CONTAINS_PROG_CONFIG_ELEMENT:
				return ((InternalEList<?>)getContainsProgConfigElement()).basicRemove(otherEnd, msgs);
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
			case ProgramsPackage.PROGRAM_CONFIGURATION__NAME:
				return getName();
			case ProgramsPackage.PROGRAM_CONFIGURATION__RETENTIVE:
				return isRetentive();
			case ProgramsPackage.PROGRAM_CONFIGURATION__HAS_PROGRAM_TYPE:
				return getHasProgramType();
			case ProgramsPackage.PROGRAM_CONFIGURATION__CONTAINS_PROG_CONFIG_ELEMENT:
				return getContainsProgConfigElement();
			case ProgramsPackage.PROGRAM_CONFIGURATION__IS_ASSIGNED_TO:
				return getIsAssignedTo();
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
			case ProgramsPackage.PROGRAM_CONFIGURATION__NAME:
				setName((String)newValue);
				return;
			case ProgramsPackage.PROGRAM_CONFIGURATION__RETENTIVE:
				setRetentive((Boolean)newValue);
				return;
			case ProgramsPackage.PROGRAM_CONFIGURATION__HAS_PROGRAM_TYPE:
				setHasProgramType((ProgramType)newValue);
				return;
			case ProgramsPackage.PROGRAM_CONFIGURATION__CONTAINS_PROG_CONFIG_ELEMENT:
				getContainsProgConfigElement().clear();
				getContainsProgConfigElement().addAll((Collection<? extends ProgramConfigElement>)newValue);
				return;
			case ProgramsPackage.PROGRAM_CONFIGURATION__IS_ASSIGNED_TO:
				getIsAssignedTo().clear();
				getIsAssignedTo().addAll((Collection<? extends Task>)newValue);
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
			case ProgramsPackage.PROGRAM_CONFIGURATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProgramsPackage.PROGRAM_CONFIGURATION__RETENTIVE:
				setRetentive(RETENTIVE_EDEFAULT);
				return;
			case ProgramsPackage.PROGRAM_CONFIGURATION__HAS_PROGRAM_TYPE:
				setHasProgramType((ProgramType)null);
				return;
			case ProgramsPackage.PROGRAM_CONFIGURATION__CONTAINS_PROG_CONFIG_ELEMENT:
				getContainsProgConfigElement().clear();
				return;
			case ProgramsPackage.PROGRAM_CONFIGURATION__IS_ASSIGNED_TO:
				getIsAssignedTo().clear();
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
			case ProgramsPackage.PROGRAM_CONFIGURATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProgramsPackage.PROGRAM_CONFIGURATION__RETENTIVE:
				return retentive != RETENTIVE_EDEFAULT;
			case ProgramsPackage.PROGRAM_CONFIGURATION__HAS_PROGRAM_TYPE:
				return hasProgramType != null;
			case ProgramsPackage.PROGRAM_CONFIGURATION__CONTAINS_PROG_CONFIG_ELEMENT:
				return containsProgConfigElement != null && !containsProgConfigElement.isEmpty();
			case ProgramsPackage.PROGRAM_CONFIGURATION__IS_ASSIGNED_TO:
				return isAssignedTo != null && !isAssignedTo.isEmpty();
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
		result.append(", retentive: ");
		result.append(retentive);
		result.append(')');
		return result.toString();
	}

} //ProgramConfigurationImpl
