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

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import xPPU.Structure;
import xPPU.XPPUFactory;
import xPPU.XPPUPackage;

/**
 * This is the item provider adapter for a {@link xPPU.Structure} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StructureItemProvider 
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
	public StructureItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(XPPUPackage.Literals.STRUCTURE__MODULES);
			childrenFeatures.add(XPPUPackage.Literals.STRUCTURE__COMPONENTS);
			childrenFeatures.add(XPPUPackage.Literals.STRUCTURE__CRANES);
			childrenFeatures.add(XPPUPackage.Literals.STRUCTURE__CONVEYOR);
			childrenFeatures.add(XPPUPackage.Literals.STRUCTURE__CONTROLCABINETS);
			childrenFeatures.add(XPPUPackage.Literals.STRUCTURE__POWERNETWORKS);
			childrenFeatures.add(XPPUPackage.Literals.STRUCTURE__COMMUNICATIONNETWORKS);
			childrenFeatures.add(XPPUPackage.Literals.STRUCTURE__PNEUMATICNETWORKS);
			childrenFeatures.add(XPPUPackage.Literals.STRUCTURE__POWERWIRING);
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
	 * This returns Structure.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Structure"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Structure_type");
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

		switch (notification.getFeatureID(Structure.class)) {
			case XPPUPackage.STRUCTURE__MODULES:
			case XPPUPackage.STRUCTURE__COMPONENTS:
			case XPPUPackage.STRUCTURE__CRANES:
			case XPPUPackage.STRUCTURE__CONVEYOR:
			case XPPUPackage.STRUCTURE__CONTROLCABINETS:
			case XPPUPackage.STRUCTURE__POWERNETWORKS:
			case XPPUPackage.STRUCTURE__COMMUNICATIONNETWORKS:
			case XPPUPackage.STRUCTURE__PNEUMATICNETWORKS:
			case XPPUPackage.STRUCTURE__POWERWIRING:
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
				(XPPUPackage.Literals.STRUCTURE__MODULES,
				 XPPUFactory.eINSTANCE.createModules()));

		newChildDescriptors.add
			(createChildParameter
				(XPPUPackage.Literals.STRUCTURE__COMPONENTS,
				 XPPUFactory.eINSTANCE.createComponents()));

		newChildDescriptors.add
			(createChildParameter
				(XPPUPackage.Literals.STRUCTURE__CRANES,
				 XPPUFactory.eINSTANCE.createCrane()));

		newChildDescriptors.add
			(createChildParameter
				(XPPUPackage.Literals.STRUCTURE__CONVEYOR,
				 XPPUFactory.eINSTANCE.createConveyor()));

		newChildDescriptors.add
			(createChildParameter
				(XPPUPackage.Literals.STRUCTURE__CONTROLCABINETS,
				 XPPUFactory.eINSTANCE.createControlCabinet()));

		newChildDescriptors.add
			(createChildParameter
				(XPPUPackage.Literals.STRUCTURE__POWERNETWORKS,
				 XPPUFactory.eINSTANCE.createPowerNetwork()));

		newChildDescriptors.add
			(createChildParameter
				(XPPUPackage.Literals.STRUCTURE__COMMUNICATIONNETWORKS,
				 XPPUFactory.eINSTANCE.createCommunicationNetwork()));

		newChildDescriptors.add
			(createChildParameter
				(XPPUPackage.Literals.STRUCTURE__PNEUMATICNETWORKS,
				 XPPUFactory.eINSTANCE.createPneumaticNetwork()));

		newChildDescriptors.add
			(createChildParameter
				(XPPUPackage.Literals.STRUCTURE__POWERWIRING,
				 XPPUFactory.eINSTANCE.createPowerWiring()));
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
