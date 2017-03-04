/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.provider;


import edu.kit.ipd.sdq.amp.model.modificationmarks.provider.ChangePropagationStepItemProvider;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ChangePropagationDueToHardwareChange;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.modificationmarksFactory;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.modificationmarksPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ChangePropagationDueToHardwareChange} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ChangePropagationDueToHardwareChangeItemProvider extends ChangePropagationStepItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangePropagationDueToHardwareChangeItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(modificationmarksPackage.Literals.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__SENSOR_MODIFICATIONS);
			childrenFeatures.add(modificationmarksPackage.Literals.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__SIGNALINTERFACE_MODIFICATIONS);
			childrenFeatures.add(modificationmarksPackage.Literals.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__PHYSICAL_CONNECTION_MODIFICATIONS);
			childrenFeatures.add(modificationmarksPackage.Literals.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__MICRO_SWITCH_MODULE_MODIFICATIONS);
			childrenFeatures.add(modificationmarksPackage.Literals.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_BOX_MODIFICATIONS);
			childrenFeatures.add(modificationmarksPackage.Literals.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_MASTER_MODIFICATIONS);
			childrenFeatures.add(modificationmarksPackage.Literals.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_SLAVE_MODIFICATIONS);
			childrenFeatures.add(modificationmarksPackage.Literals.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_CABLE_MODIFICATIONS);
			childrenFeatures.add(modificationmarksPackage.Literals.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__INTERFACE_MODIFICATIONS);
			childrenFeatures.add(modificationmarksPackage.Literals.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__COMPONENT_MODIFICATIONS);
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
	 * This returns ChangePropagationDueToHardwareChange.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ChangePropagationDueToHardwareChange"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ChangePropagationDueToHardwareChange_type");
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

		switch (notification.getFeatureID(ChangePropagationDueToHardwareChange.class)) {
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__SENSOR_MODIFICATIONS:
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__SIGNALINTERFACE_MODIFICATIONS:
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__PHYSICAL_CONNECTION_MODIFICATIONS:
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__MICRO_SWITCH_MODULE_MODIFICATIONS:
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_BOX_MODIFICATIONS:
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_MASTER_MODIFICATIONS:
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_SLAVE_MODIFICATIONS:
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_CABLE_MODIFICATIONS:
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__INTERFACE_MODIFICATIONS:
			case modificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__COMPONENT_MODIFICATIONS:
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
				(modificationmarksPackage.Literals.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__SENSOR_MODIFICATIONS,
				 modificationmarksFactory.eINSTANCE.createModifySensor()));

		newChildDescriptors.add
			(createChildParameter
				(modificationmarksPackage.Literals.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__SIGNALINTERFACE_MODIFICATIONS,
				 modificationmarksFactory.eINSTANCE.createModifySignalinterface()));

		newChildDescriptors.add
			(createChildParameter
				(modificationmarksPackage.Literals.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__PHYSICAL_CONNECTION_MODIFICATIONS,
				 modificationmarksFactory.eINSTANCE.createModifyPhysicalConnection()));

		newChildDescriptors.add
			(createChildParameter
				(modificationmarksPackage.Literals.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__MICRO_SWITCH_MODULE_MODIFICATIONS,
				 modificationmarksFactory.eINSTANCE.createModifyMicroSwitchModule()));

		newChildDescriptors.add
			(createChildParameter
				(modificationmarksPackage.Literals.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_BOX_MODIFICATIONS,
				 modificationmarksFactory.eINSTANCE.createModifyBusBox()));

		newChildDescriptors.add
			(createChildParameter
				(modificationmarksPackage.Literals.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_MASTER_MODIFICATIONS,
				 modificationmarksFactory.eINSTANCE.createModifyBusMaster()));

		newChildDescriptors.add
			(createChildParameter
				(modificationmarksPackage.Literals.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_SLAVE_MODIFICATIONS,
				 modificationmarksFactory.eINSTANCE.createModifyBusSlave()));

		newChildDescriptors.add
			(createChildParameter
				(modificationmarksPackage.Literals.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_CABLE_MODIFICATIONS,
				 modificationmarksFactory.eINSTANCE.createModifyBusCable()));

		newChildDescriptors.add
			(createChildParameter
				(modificationmarksPackage.Literals.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__INTERFACE_MODIFICATIONS,
				 modificationmarksFactory.eINSTANCE.createModifyInterface()));

		newChildDescriptors.add
			(createChildParameter
				(modificationmarksPackage.Literals.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__INTERFACE_MODIFICATIONS,
				 modificationmarksFactory.eINSTANCE.createModifyPowerSupply()));

		newChildDescriptors.add
			(createChildParameter
				(modificationmarksPackage.Literals.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__INTERFACE_MODIFICATIONS,
				 modificationmarksFactory.eINSTANCE.createModifySignalinterface()));

		newChildDescriptors.add
			(createChildParameter
				(modificationmarksPackage.Literals.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__INTERFACE_MODIFICATIONS,
				 modificationmarksFactory.eINSTANCE.createModifyPhysicalConnection()));

		newChildDescriptors.add
			(createChildParameter
				(modificationmarksPackage.Literals.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__COMPONENT_MODIFICATIONS,
				 modificationmarksFactory.eINSTANCE.createModifyComponent()));

		newChildDescriptors.add
			(createChildParameter
				(modificationmarksPackage.Literals.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__COMPONENT_MODIFICATIONS,
				 modificationmarksFactory.eINSTANCE.createModifyPowerSupply()));

		newChildDescriptors.add
			(createChildParameter
				(modificationmarksPackage.Literals.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__COMPONENT_MODIFICATIONS,
				 modificationmarksFactory.eINSTANCE.createModifyMicroSwitchModule()));

		newChildDescriptors.add
			(createChildParameter
				(modificationmarksPackage.Literals.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__COMPONENT_MODIFICATIONS,
				 modificationmarksFactory.eINSTANCE.createModifyBusBox()));

		newChildDescriptors.add
			(createChildParameter
				(modificationmarksPackage.Literals.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__COMPONENT_MODIFICATIONS,
				 modificationmarksFactory.eINSTANCE.createModifyBusMaster()));

		newChildDescriptors.add
			(createChildParameter
				(modificationmarksPackage.Literals.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__COMPONENT_MODIFICATIONS,
				 modificationmarksFactory.eINSTANCE.createModifyBusSlave()));

		newChildDescriptors.add
			(createChildParameter
				(modificationmarksPackage.Literals.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__COMPONENT_MODIFICATIONS,
				 modificationmarksFactory.eINSTANCE.createModifyBusCable()));

		newChildDescriptors.add
			(createChildParameter
				(modificationmarksPackage.Literals.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__COMPONENT_MODIFICATIONS,
				 modificationmarksFactory.eINSTANCE.createModifySensor()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == modificationmarksPackage.Literals.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__SENSOR_MODIFICATIONS ||
			childFeature == modificationmarksPackage.Literals.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__COMPONENT_MODIFICATIONS ||
			childFeature == modificationmarksPackage.Literals.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__SIGNALINTERFACE_MODIFICATIONS ||
			childFeature == modificationmarksPackage.Literals.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__INTERFACE_MODIFICATIONS ||
			childFeature == modificationmarksPackage.Literals.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__PHYSICAL_CONNECTION_MODIFICATIONS ||
			childFeature == modificationmarksPackage.Literals.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__MICRO_SWITCH_MODULE_MODIFICATIONS ||
			childFeature == modificationmarksPackage.Literals.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_BOX_MODIFICATIONS ||
			childFeature == modificationmarksPackage.Literals.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_MASTER_MODIFICATIONS ||
			childFeature == modificationmarksPackage.Literals.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_SLAVE_MODIFICATIONS ||
			childFeature == modificationmarksPackage.Literals.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_CABLE_MODIFICATIONS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return KAPSModificationmarksEditPlugin.INSTANCE;
	}

}
