/**
 */
package xPPU.ComponentRepository.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import xPPU.ComponentRepository.Component;
import xPPU.ComponentRepository.ComponentRepository;
import xPPU.ComponentRepository.ComponentRepositoryPackage;

import xPPU.Identifier.impl.IdentifierImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xPPU.ComponentRepository.impl.ComponentRepositoryImpl#getAllComponentsInPlant <em>All Components In Plant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentRepositoryImpl extends IdentifierImpl implements ComponentRepository {
	/**
	 * The cached value of the '{@link #getAllComponentsInPlant() <em>All Components In Plant</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllComponentsInPlant()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> allComponentsInPlant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentRepositoryPackage.Literals.COMPONENT_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getAllComponentsInPlant() {
		if (allComponentsInPlant == null) {
			allComponentsInPlant = new EObjectResolvingEList<Component>(Component.class, this, ComponentRepositoryPackage.COMPONENT_REPOSITORY__ALL_COMPONENTS_IN_PLANT);
		}
		return allComponentsInPlant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentRepositoryPackage.COMPONENT_REPOSITORY__ALL_COMPONENTS_IN_PLANT:
				return getAllComponentsInPlant();
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
			case ComponentRepositoryPackage.COMPONENT_REPOSITORY__ALL_COMPONENTS_IN_PLANT:
				getAllComponentsInPlant().clear();
				getAllComponentsInPlant().addAll((Collection<? extends Component>)newValue);
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
			case ComponentRepositoryPackage.COMPONENT_REPOSITORY__ALL_COMPONENTS_IN_PLANT:
				getAllComponentsInPlant().clear();
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
			case ComponentRepositoryPackage.COMPONENT_REPOSITORY__ALL_COMPONENTS_IN_PLANT:
				return allComponentsInPlant != null && !allComponentsInPlant.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentRepositoryImpl
