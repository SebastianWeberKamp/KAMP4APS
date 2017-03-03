/**
 */
package xPPU.ComponentRepository.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import xPPU.ComponentRepository.Component;
import xPPU.ComponentRepository.ComponentRepositoryFactory;
import xPPU.ComponentRepository.ComponentRepositoryPackage;

import xPPU.Identifier.provider.IdentifierItemProvider;
import xPPU.InterfaceRepository.InterfaceRepositoryFactory;

import xPPU.provider.XPPUEditPlugin;

/**
 * This is the item provider adapter for a {@link xPPU.ComponentRepository.Component} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentItemProvider 
	extends IdentifierItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ComponentRepositoryPackage.Literals.COMPONENT__INTERFACES);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Component)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_Component_type") :
			getString("_UI_Component_type") + " " + label;
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

		switch (notification.getFeatureID(Component.class)) {
			case ComponentRepositoryPackage.COMPONENT__INTERFACES:
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
				(ComponentRepositoryPackage.Literals.COMPONENT__INTERFACES,
				 ComponentRepositoryFactory.eINSTANCE.createPowerSupply()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentRepositoryPackage.Literals.COMPONENT__INTERFACES,
				 InterfaceRepositoryFactory.eINSTANCE.createScrewing()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentRepositoryPackage.Literals.COMPONENT__INTERFACES,
				 InterfaceRepositoryFactory.eINSTANCE.createScrewingSplitter()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentRepositoryPackage.Literals.COMPONENT__INTERFACES,
				 InterfaceRepositoryFactory.eINSTANCE.createScrewingMotor()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentRepositoryPackage.Literals.COMPONENT__INTERFACES,
				 InterfaceRepositoryFactory.eINSTANCE.createScrewingRack()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentRepositoryPackage.Literals.COMPONENT__INTERFACES,
				 InterfaceRepositoryFactory.eINSTANCE.createScrewingCylinder()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentRepositoryPackage.Literals.COMPONENT__INTERFACES,
				 InterfaceRepositoryFactory.eINSTANCE.createScrewingFixture()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentRepositoryPackage.Literals.COMPONENT__INTERFACES,
				 InterfaceRepositoryFactory.eINSTANCE.createScrewingPotentiometer()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentRepositoryPackage.Literals.COMPONENT__INTERFACES,
				 InterfaceRepositoryFactory.eINSTANCE.createSuspension()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentRepositoryPackage.Literals.COMPONENT__INTERFACES,
				 InterfaceRepositoryFactory.eINSTANCE.createSuspensionRack()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentRepositoryPackage.Literals.COMPONENT__INTERFACES,
				 InterfaceRepositoryFactory.eINSTANCE.createSuspensionArm()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentRepositoryPackage.Literals.COMPONENT__INTERFACES,
				 InterfaceRepositoryFactory.eINSTANCE.createGearing()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentRepositoryPackage.Literals.COMPONENT__INTERFACES,
				 InterfaceRepositoryFactory.eINSTANCE.createClamping()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentRepositoryPackage.Literals.COMPONENT__INTERFACES,
				 InterfaceRepositoryFactory.eINSTANCE.createPneumaticSupply()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentRepositoryPackage.Literals.COMPONENT__INTERFACES,
				 InterfaceRepositoryFactory.eINSTANCE.createSignalInterface()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentRepositoryPackage.Literals.COMPONENT__INTERFACES,
				 InterfaceRepositoryFactory.eINSTANCE.createWaterSupply()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentRepositoryPackage.Literals.COMPONENT__INTERFACES,
				 InterfaceRepositoryFactory.eINSTANCE.createPhysicalConnection()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentRepositoryPackage.Literals.COMPONENT__INTERFACES,
				 InterfaceRepositoryFactory.eINSTANCE.createTransportConnection()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return XPPUEditPlugin.INSTANCE;
	}

}
