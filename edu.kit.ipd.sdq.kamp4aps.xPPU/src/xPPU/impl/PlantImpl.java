/**
 */
package xPPU.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import xPPU.ComponentRepository.ComponentRepository;
import xPPU.Identifier.impl.IdentifierImpl;
import xPPU.InterfaceRepository.InterfaceRepository;
import xPPU.Plant;

import xPPU.StructureRepository.Structure;
import xPPU.StructureRepository.StructureRepositoryPackage;

import xPPU.XPPUPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xPPU.impl.PlantImpl#getPlantName <em>Plant Name</em>}</li>
 *   <li>{@link xPPU.impl.PlantImpl#getStructures <em>Structures</em>}</li>
 *   <li>{@link xPPU.impl.PlantImpl#getInterfaceRepository <em>Interface Repository</em>}</li>
 *   <li>{@link xPPU.impl.PlantImpl#getComponentRepository <em>Component Repository</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlantImpl extends IdentifierImpl implements Plant {
	/**
	 * The default value of the '{@link #getPlantName() <em>Plant Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlantName()
	 * @generated
	 * @ordered
	 */
	protected static final String PLANT_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPlantName() <em>Plant Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlantName()
	 * @generated
	 * @ordered
	 */
	protected String plantName = PLANT_NAME_EDEFAULT;
	/**
	 * The cached value of the '{@link #getStructures() <em>Structures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructures()
	 * @generated
	 * @ordered
	 */
	protected EList<Structure> structures;

	/**
	 * The cached value of the '{@link #getInterfaceRepository() <em>Interface Repository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceRepository()
	 * @generated
	 * @ordered
	 */
	protected InterfaceRepository interfaceRepository;

	/**
	 * The cached value of the '{@link #getComponentRepository() <em>Component Repository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentRepository()
	 * @generated
	 * @ordered
	 */
	protected ComponentRepository componentRepository;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XPPUPackage.Literals.PLANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlantName() {
		return plantName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlantName(String newPlantName) {
		String oldPlantName = plantName;
		plantName = newPlantName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XPPUPackage.PLANT__PLANT_NAME, oldPlantName, plantName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Structure> getStructures() {
		if (structures == null) {
			structures = new EObjectContainmentWithInverseEList<Structure>(Structure.class, this, XPPUPackage.PLANT__STRUCTURES, StructureRepositoryPackage.STRUCTURE__PARENT_PLANT);
		}
		return structures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceRepository getInterfaceRepository() {
		return interfaceRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterfaceRepository(InterfaceRepository newInterfaceRepository, NotificationChain msgs) {
		InterfaceRepository oldInterfaceRepository = interfaceRepository;
		interfaceRepository = newInterfaceRepository;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPPUPackage.PLANT__INTERFACE_REPOSITORY, oldInterfaceRepository, newInterfaceRepository);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaceRepository(InterfaceRepository newInterfaceRepository) {
		if (newInterfaceRepository != interfaceRepository) {
			NotificationChain msgs = null;
			if (interfaceRepository != null)
				msgs = ((InternalEObject)interfaceRepository).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPPUPackage.PLANT__INTERFACE_REPOSITORY, null, msgs);
			if (newInterfaceRepository != null)
				msgs = ((InternalEObject)newInterfaceRepository).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPPUPackage.PLANT__INTERFACE_REPOSITORY, null, msgs);
			msgs = basicSetInterfaceRepository(newInterfaceRepository, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XPPUPackage.PLANT__INTERFACE_REPOSITORY, newInterfaceRepository, newInterfaceRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentRepository getComponentRepository() {
		return componentRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentRepository(ComponentRepository newComponentRepository, NotificationChain msgs) {
		ComponentRepository oldComponentRepository = componentRepository;
		componentRepository = newComponentRepository;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPPUPackage.PLANT__COMPONENT_REPOSITORY, oldComponentRepository, newComponentRepository);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentRepository(ComponentRepository newComponentRepository) {
		if (newComponentRepository != componentRepository) {
			NotificationChain msgs = null;
			if (componentRepository != null)
				msgs = ((InternalEObject)componentRepository).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPPUPackage.PLANT__COMPONENT_REPOSITORY, null, msgs);
			if (newComponentRepository != null)
				msgs = ((InternalEObject)newComponentRepository).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPPUPackage.PLANT__COMPONENT_REPOSITORY, null, msgs);
			msgs = basicSetComponentRepository(newComponentRepository, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XPPUPackage.PLANT__COMPONENT_REPOSITORY, newComponentRepository, newComponentRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XPPUPackage.PLANT__STRUCTURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStructures()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XPPUPackage.PLANT__STRUCTURES:
				return ((InternalEList<?>)getStructures()).basicRemove(otherEnd, msgs);
			case XPPUPackage.PLANT__INTERFACE_REPOSITORY:
				return basicSetInterfaceRepository(null, msgs);
			case XPPUPackage.PLANT__COMPONENT_REPOSITORY:
				return basicSetComponentRepository(null, msgs);
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
			case XPPUPackage.PLANT__PLANT_NAME:
				return getPlantName();
			case XPPUPackage.PLANT__STRUCTURES:
				return getStructures();
			case XPPUPackage.PLANT__INTERFACE_REPOSITORY:
				return getInterfaceRepository();
			case XPPUPackage.PLANT__COMPONENT_REPOSITORY:
				return getComponentRepository();
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
			case XPPUPackage.PLANT__PLANT_NAME:
				setPlantName((String)newValue);
				return;
			case XPPUPackage.PLANT__STRUCTURES:
				getStructures().clear();
				getStructures().addAll((Collection<? extends Structure>)newValue);
				return;
			case XPPUPackage.PLANT__INTERFACE_REPOSITORY:
				setInterfaceRepository((InterfaceRepository)newValue);
				return;
			case XPPUPackage.PLANT__COMPONENT_REPOSITORY:
				setComponentRepository((ComponentRepository)newValue);
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
			case XPPUPackage.PLANT__PLANT_NAME:
				setPlantName(PLANT_NAME_EDEFAULT);
				return;
			case XPPUPackage.PLANT__STRUCTURES:
				getStructures().clear();
				return;
			case XPPUPackage.PLANT__INTERFACE_REPOSITORY:
				setInterfaceRepository((InterfaceRepository)null);
				return;
			case XPPUPackage.PLANT__COMPONENT_REPOSITORY:
				setComponentRepository((ComponentRepository)null);
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
			case XPPUPackage.PLANT__PLANT_NAME:
				return PLANT_NAME_EDEFAULT == null ? plantName != null : !PLANT_NAME_EDEFAULT.equals(plantName);
			case XPPUPackage.PLANT__STRUCTURES:
				return structures != null && !structures.isEmpty();
			case XPPUPackage.PLANT__INTERFACE_REPOSITORY:
				return interfaceRepository != null;
			case XPPUPackage.PLANT__COMPONENT_REPOSITORY:
				return componentRepository != null;
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
		result.append(" (PlantName: ");
		result.append(plantName);
		result.append(')');
		return result.toString();
	}

} //PlantImpl