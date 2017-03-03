/**
 */
package xPPU.ModuleRepository.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import xPPU.BusComponents.BusComponentsFactory;

import xPPU.ComponentRepository.ComponentRepositoryFactory;

import xPPU.ModuleRepository.ModuleRepositoryPackage;
import xPPU.ModuleRepository.MotorModule;

/**
 * This is the item provider adapter for a {@link xPPU.ModuleRepository.MotorModule} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MotorModuleItemProvider extends ModuleItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MotorModuleItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ModuleRepositoryPackage.Literals.MOTOR_MODULE__SIMPLE_MOTOR);
			childrenFeatures.add(ModuleRepositoryPackage.Literals.MOTOR_MODULE__BUS_SLAVE);
			childrenFeatures.add(ModuleRepositoryPackage.Literals.MOTOR_MODULE__BUS_BOX);
			childrenFeatures.add(ModuleRepositoryPackage.Literals.MOTOR_MODULE__BUS_CABLE);
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
	 * This returns MotorModule.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MotorModule"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MotorModule)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_MotorModule_type") :
			getString("_UI_MotorModule_type") + " " + label;
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

		switch (notification.getFeatureID(MotorModule.class)) {
			case ModuleRepositoryPackage.MOTOR_MODULE__SIMPLE_MOTOR:
			case ModuleRepositoryPackage.MOTOR_MODULE__BUS_SLAVE:
			case ModuleRepositoryPackage.MOTOR_MODULE__BUS_BOX:
			case ModuleRepositoryPackage.MOTOR_MODULE__BUS_CABLE:
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
				(ModuleRepositoryPackage.Literals.MOTOR_MODULE__SIMPLE_MOTOR,
				 ComponentRepositoryFactory.eINSTANCE.createSimpleMotor()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MOTOR_MODULE__BUS_SLAVE,
				 BusComponentsFactory.eINSTANCE.createBusSlave()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MOTOR_MODULE__BUS_SLAVE,
				 BusComponentsFactory.eINSTANCE.createProfibusDPSlave()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MOTOR_MODULE__BUS_BOX,
				 BusComponentsFactory.eINSTANCE.createBusBox()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MOTOR_MODULE__BUS_BOX,
				 BusComponentsFactory.eINSTANCE.createProfibusDPBox()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MOTOR_MODULE__BUS_CABLE,
				 BusComponentsFactory.eINSTANCE.createBusCable()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MOTOR_MODULE__BUS_CABLE,
				 BusComponentsFactory.eINSTANCE.createProfibusDPCable()));
	}

}
