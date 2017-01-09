/**
 */
package xPPU.provider;


import edu.kit.ipd.sdq.kaps.model.modificationmarks.provider.KAPSModificationmarksEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import xPPU.Components;
import xPPU.XPPUFactory;
import xPPU.XPPUPackage;

/**
 * This is the item provider adapter for a {@link xPPU.Components} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentsItemProvider 
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
	public ComponentsItemProvider(AdapterFactory adapterFactory) {
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

			addElectronicComponentsPropertyDescriptor(object);
			addPushersPropertyDescriptor(object);
			addCornersPropertyDescriptor(object);
			addDispensersPropertyDescriptor(object);
			addRacksPropertyDescriptor(object);
			addTanksPropertyDescriptor(object);
			addSplitterPropertyDescriptor(object);
			addBottleSeperatorPropertyDescriptor(object);
			addPanelsPropertyDescriptor(object);
			addCablesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Electronic Components feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addElectronicComponentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Components_electronicComponents_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Components_electronicComponents_feature", "_UI_Components_type"),
				 XPPUPackage.Literals.COMPONENTS__ELECTRONIC_COMPONENTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pushers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPushersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Components_pushers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Components_pushers_feature", "_UI_Components_type"),
				 XPPUPackage.Literals.COMPONENTS__PUSHERS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Corners feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCornersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Components_corners_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Components_corners_feature", "_UI_Components_type"),
				 XPPUPackage.Literals.COMPONENTS__CORNERS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dispensers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDispensersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Components_dispensers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Components_dispensers_feature", "_UI_Components_type"),
				 XPPUPackage.Literals.COMPONENTS__DISPENSERS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Racks feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRacksPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Components_racks_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Components_racks_feature", "_UI_Components_type"),
				 XPPUPackage.Literals.COMPONENTS__RACKS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tanks feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTanksPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Components_tanks_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Components_tanks_feature", "_UI_Components_type"),
				 XPPUPackage.Literals.COMPONENTS__TANKS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Splitter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSplitterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Components_splitter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Components_splitter_feature", "_UI_Components_type"),
				 XPPUPackage.Literals.COMPONENTS__SPLITTER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bottle Seperator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBottleSeperatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Components_bottleSeperator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Components_bottleSeperator_feature", "_UI_Components_type"),
				 XPPUPackage.Literals.COMPONENTS__BOTTLE_SEPERATOR,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Panels feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPanelsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Components_panels_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Components_panels_feature", "_UI_Components_type"),
				 XPPUPackage.Literals.COMPONENTS__PANELS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cables feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCablesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Components_cables_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Components_cables_feature", "_UI_Components_type"),
				 XPPUPackage.Literals.COMPONENTS__CABLES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
			childrenFeatures.add(XPPUPackage.Literals.COMPONENTS__INTERFACES);
			childrenFeatures.add(XPPUPackage.Literals.COMPONENTS__MOTORS);
			childrenFeatures.add(XPPUPackage.Literals.COMPONENTS__MECHANICAL_ASSEMBLYS);
			childrenFeatures.add(XPPUPackage.Literals.COMPONENTS__SENSORS);
			childrenFeatures.add(XPPUPackage.Literals.COMPONENTS__PIPES);
			childrenFeatures.add(XPPUPackage.Literals.COMPONENTS__COMPRESSORS);
			childrenFeatures.add(XPPUPackage.Literals.COMPONENTS__BUSCABLES);
			childrenFeatures.add(XPPUPackage.Literals.COMPONENTS__BUSMASTERS);
			childrenFeatures.add(XPPUPackage.Literals.COMPONENTS__BUSSLAVES);
			childrenFeatures.add(XPPUPackage.Literals.COMPONENTS__BUSBOXES);
			childrenFeatures.add(XPPUPackage.Literals.COMPONENTS__CYLINDERS);
			childrenFeatures.add(XPPUPackage.Literals.COMPONENTS__POWERCABLES);
			childrenFeatures.add(XPPUPackage.Literals.COMPONENTS__VALVES);
			childrenFeatures.add(XPPUPackage.Literals.COMPONENTS__MECHANICALPARTS);
			childrenFeatures.add(XPPUPackage.Literals.COMPONENTS__POWERSUPPLYS);
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
	 * This returns Components.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Components"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Components_type");
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

		switch (notification.getFeatureID(Components.class)) {
			case XPPUPackage.COMPONENTS__INTERFACES:
			case XPPUPackage.COMPONENTS__MOTORS:
			case XPPUPackage.COMPONENTS__MECHANICAL_ASSEMBLYS:
			case XPPUPackage.COMPONENTS__SENSORS:
			case XPPUPackage.COMPONENTS__PIPES:
			case XPPUPackage.COMPONENTS__COMPRESSORS:
			case XPPUPackage.COMPONENTS__BUSCABLES:
			case XPPUPackage.COMPONENTS__BUSMASTERS:
			case XPPUPackage.COMPONENTS__BUSSLAVES:
			case XPPUPackage.COMPONENTS__BUSBOXES:
			case XPPUPackage.COMPONENTS__CYLINDERS:
			case XPPUPackage.COMPONENTS__POWERCABLES:
			case XPPUPackage.COMPONENTS__VALVES:
			case XPPUPackage.COMPONENTS__MECHANICALPARTS:
			case XPPUPackage.COMPONENTS__POWERSUPPLYS:
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
				(XPPUPackage.Literals.COMPONENTS__INTERFACES,
				 XPPUFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(XPPUPackage.Literals.COMPONENTS__MOTORS,
				 XPPUFactory.eINSTANCE.createSimpleMotor()));

		newChildDescriptors.add
			(createChildParameter
				(XPPUPackage.Literals.COMPONENTS__MECHANICAL_ASSEMBLYS,
				 XPPUFactory.eINSTANCE.createArm()));

		newChildDescriptors.add
			(createChildParameter
				(XPPUPackage.Literals.COMPONENTS__MECHANICAL_ASSEMBLYS,
				 XPPUFactory.eINSTANCE.createRegularRamp()));

		newChildDescriptors.add
			(createChildParameter
				(XPPUPackage.Literals.COMPONENTS__PIPES,
				 XPPUFactory.eINSTANCE.createPneumaticPipe()));

		newChildDescriptors.add
			(createChildParameter
				(XPPUPackage.Literals.COMPONENTS__COMPRESSORS,
				 XPPUFactory.eINSTANCE.createCompressor()));

		newChildDescriptors.add
			(createChildParameter
				(XPPUPackage.Literals.COMPONENTS__BUSCABLES,
				 XPPUFactory.eINSTANCE.createBusCable()));

		newChildDescriptors.add
			(createChildParameter
				(XPPUPackage.Literals.COMPONENTS__BUSMASTERS,
				 XPPUFactory.eINSTANCE.createBusMaster()));

		newChildDescriptors.add
			(createChildParameter
				(XPPUPackage.Literals.COMPONENTS__BUSSLAVES,
				 XPPUFactory.eINSTANCE.createBusSlave()));

		newChildDescriptors.add
			(createChildParameter
				(XPPUPackage.Literals.COMPONENTS__BUSBOXES,
				 XPPUFactory.eINSTANCE.createBusBox()));

		newChildDescriptors.add
			(createChildParameter
				(XPPUPackage.Literals.COMPONENTS__CYLINDERS,
				 XPPUFactory.eINSTANCE.createMonostableCylinder()));

		newChildDescriptors.add
			(createChildParameter
				(XPPUPackage.Literals.COMPONENTS__CYLINDERS,
				 XPPUFactory.eINSTANCE.createProportionalCylinder()));

		newChildDescriptors.add
			(createChildParameter
				(XPPUPackage.Literals.COMPONENTS__CYLINDERS,
				 XPPUFactory.eINSTANCE.createBistableCylinder()));

		newChildDescriptors.add
			(createChildParameter
				(XPPUPackage.Literals.COMPONENTS__POWERCABLES,
				 XPPUFactory.eINSTANCE.createPowerCable()));

		newChildDescriptors.add
			(createChildParameter
				(XPPUPackage.Literals.COMPONENTS__POWERSUPPLYS,
				 XPPUFactory.eINSTANCE.createPowerSupply()));
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
