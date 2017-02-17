/**
 */
package fieldofactivityannotations.provider;


import fieldofactivityannotations.FieldOfActivityAnnotationRepository;
import fieldofactivityannotations.FieldofactivityannotationsFactory;
import fieldofactivityannotations.FieldofactivityannotationsPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fieldofactivityannotations.FieldOfActivityAnnotationRepository} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FieldOfActivityAnnotationRepositoryItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldOfActivityAnnotationRepositoryItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(FieldofactivityannotationsPackage.Literals.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__CALIBRATION_SPECIFICATION);
			childrenFeatures.add(FieldofactivityannotationsPackage.Literals.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__TEST_SPECIFICATION);
			childrenFeatures.add(FieldofactivityannotationsPackage.Literals.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__DEVELOPMENT_SPECIFICATION);
			childrenFeatures.add(FieldofactivityannotationsPackage.Literals.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__STOCK_SPECIFICATION);
			childrenFeatures.add(FieldofactivityannotationsPackage.Literals.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__HMI_SPECIFICATION);
			childrenFeatures.add(FieldofactivityannotationsPackage.Literals.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__ECAD_SPECIFICATION);
			childrenFeatures.add(FieldofactivityannotationsPackage.Literals.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__DOCUMENTATION_SPECIFICATION);
			childrenFeatures.add(FieldofactivityannotationsPackage.Literals.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__COMPONENT_SPECIFICATION);
			childrenFeatures.add(FieldofactivityannotationsPackage.Literals.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__STAFF_SPECIFICATION);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns FieldOfActivityAnnotationRepository.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FieldOfActivityAnnotationRepository"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_FieldOfActivityAnnotationRepository_type");
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(FieldOfActivityAnnotationRepository.class)) {
			case FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__CALIBRATION_SPECIFICATION:
			case FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__TEST_SPECIFICATION:
			case FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__DEVELOPMENT_SPECIFICATION:
			case FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__STOCK_SPECIFICATION:
			case FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__HMI_SPECIFICATION:
			case FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__ECAD_SPECIFICATION:
			case FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__DOCUMENTATION_SPECIFICATION:
			case FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__COMPONENT_SPECIFICATION:
			case FieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__STAFF_SPECIFICATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(FieldofactivityannotationsPackage.Literals.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__CALIBRATION_SPECIFICATION,
				 FieldofactivityannotationsFactory.eINSTANCE.createCalibrationSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(FieldofactivityannotationsPackage.Literals.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__TEST_SPECIFICATION,
				 FieldofactivityannotationsFactory.eINSTANCE.createTestSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(FieldofactivityannotationsPackage.Literals.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__DEVELOPMENT_SPECIFICATION,
				 FieldofactivityannotationsFactory.eINSTANCE.createDevelopmentSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(FieldofactivityannotationsPackage.Literals.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__STOCK_SPECIFICATION,
				 FieldofactivityannotationsFactory.eINSTANCE.createStockSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(FieldofactivityannotationsPackage.Literals.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__HMI_SPECIFICATION,
				 FieldofactivityannotationsFactory.eINSTANCE.createHMISpecification()));

		newChildDescriptors.add
			(createChildParameter
				(FieldofactivityannotationsPackage.Literals.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__ECAD_SPECIFICATION,
				 FieldofactivityannotationsFactory.eINSTANCE.createECADSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(FieldofactivityannotationsPackage.Literals.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__DOCUMENTATION_SPECIFICATION,
				 FieldofactivityannotationsFactory.eINSTANCE.createDocumentationSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(FieldofactivityannotationsPackage.Literals.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__COMPONENT_SPECIFICATION,
				 FieldofactivityannotationsFactory.eINSTANCE.createComponentSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(FieldofactivityannotationsPackage.Literals.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__STAFF_SPECIFICATION,
				 FieldofactivityannotationsFactory.eINSTANCE.createStaffSpecification()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return FieldofactivityannotationsEditPlugin.INSTANCE;
	}

}
