/**
 */
package edu.kit.ipd.sdq.kaps.model.fieldofactivityannotations.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import edu.kit.ipd.sdq.kaps.model.fieldofactivityannotations.FieldofactivityannotationsPackage;
import edu.kit.ipd.sdq.kaps.model.fieldofactivityannotations.TechnologicalCorrespondence;
import edu.kit.ipd.sdq.kaps.model.fieldofactivityannotations.TechnologicalCorrespondenceTypes;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.pcm.repository.RepositoryComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Technological Correspondence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kaps.model.fieldofactivityannotations.impl.TechnologicalCorrespondenceImpl#getTechnologicalCorrespondenceType <em>Technological Correspondence Type</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kaps.model.fieldofactivityannotations.impl.TechnologicalCorrespondenceImpl#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TechnologicalCorrespondenceImpl extends IdentifierImpl implements TechnologicalCorrespondence {
	/**
	 * The default value of the '{@link #getTechnologicalCorrespondenceType() <em>Technological Correspondence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnologicalCorrespondenceType()
	 * @generated
	 * @ordered
	 */
	protected static final TechnologicalCorrespondenceTypes TECHNOLOGICAL_CORRESPONDENCE_TYPE_EDEFAULT = TechnologicalCorrespondenceTypes.SET_OF_CLASSES;

	/**
	 * The cached value of the '{@link #getTechnologicalCorrespondenceType() <em>Technological Correspondence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnologicalCorrespondenceType()
	 * @generated
	 * @ordered
	 */
	protected TechnologicalCorrespondenceTypes technologicalCorrespondenceType = TECHNOLOGICAL_CORRESPONDENCE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected RepositoryComponent component;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TechnologicalCorrespondenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FieldofactivityannotationsPackage.Literals.TECHNOLOGICAL_CORRESPONDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TechnologicalCorrespondenceTypes getTechnologicalCorrespondenceType() {
		return technologicalCorrespondenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTechnologicalCorrespondenceType(TechnologicalCorrespondenceTypes newTechnologicalCorrespondenceType) {
		TechnologicalCorrespondenceTypes oldTechnologicalCorrespondenceType = technologicalCorrespondenceType;
		technologicalCorrespondenceType = newTechnologicalCorrespondenceType == null ? TECHNOLOGICAL_CORRESPONDENCE_TYPE_EDEFAULT : newTechnologicalCorrespondenceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FieldofactivityannotationsPackage.TECHNOLOGICAL_CORRESPONDENCE__TECHNOLOGICAL_CORRESPONDENCE_TYPE, oldTechnologicalCorrespondenceType, technologicalCorrespondenceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryComponent getComponent() {
		if (component != null && ((EObject)component).eIsProxy()) {
			InternalEObject oldComponent = (InternalEObject)component;
			component = (RepositoryComponent)eResolveProxy(oldComponent);
			if (component != oldComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FieldofactivityannotationsPackage.TECHNOLOGICAL_CORRESPONDENCE__COMPONENT, oldComponent, component));
			}
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryComponent basicGetComponent() {
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(RepositoryComponent newComponent) {
		RepositoryComponent oldComponent = component;
		component = newComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FieldofactivityannotationsPackage.TECHNOLOGICAL_CORRESPONDENCE__COMPONENT, oldComponent, component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FieldofactivityannotationsPackage.TECHNOLOGICAL_CORRESPONDENCE__TECHNOLOGICAL_CORRESPONDENCE_TYPE:
				return getTechnologicalCorrespondenceType();
			case FieldofactivityannotationsPackage.TECHNOLOGICAL_CORRESPONDENCE__COMPONENT:
				if (resolve) return getComponent();
				return basicGetComponent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FieldofactivityannotationsPackage.TECHNOLOGICAL_CORRESPONDENCE__TECHNOLOGICAL_CORRESPONDENCE_TYPE:
				setTechnologicalCorrespondenceType((TechnologicalCorrespondenceTypes)newValue);
				return;
			case FieldofactivityannotationsPackage.TECHNOLOGICAL_CORRESPONDENCE__COMPONENT:
				setComponent((RepositoryComponent)newValue);
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
			case FieldofactivityannotationsPackage.TECHNOLOGICAL_CORRESPONDENCE__TECHNOLOGICAL_CORRESPONDENCE_TYPE:
				setTechnologicalCorrespondenceType(TECHNOLOGICAL_CORRESPONDENCE_TYPE_EDEFAULT);
				return;
			case FieldofactivityannotationsPackage.TECHNOLOGICAL_CORRESPONDENCE__COMPONENT:
				setComponent((RepositoryComponent)null);
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
			case FieldofactivityannotationsPackage.TECHNOLOGICAL_CORRESPONDENCE__TECHNOLOGICAL_CORRESPONDENCE_TYPE:
				return technologicalCorrespondenceType != TECHNOLOGICAL_CORRESPONDENCE_TYPE_EDEFAULT;
			case FieldofactivityannotationsPackage.TECHNOLOGICAL_CORRESPONDENCE__COMPONENT:
				return component != null;
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
		result.append(" (technologicalCorrespondenceType: ");
		result.append(technologicalCorrespondenceType);
		result.append(')');
		return result.toString();
	}

} //TechnologicalCorrespondenceImpl
