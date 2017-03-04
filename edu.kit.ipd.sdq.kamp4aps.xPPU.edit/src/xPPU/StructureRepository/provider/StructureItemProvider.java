/**
 */
package xPPU.StructureRepository.provider;


import edu.kit.ipd.sdq.kamp4aps.xPPU.provider.XPPUEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import xPPU.BusComponents.BusComponentsFactory;

import xPPU.ComponentRepository.ComponentRepositoryFactory;

import xPPU.ElectronicComponents.ElectronicComponentsFactory;

import xPPU.Identifier.provider.IdentifierItemProvider;

import xPPU.MechanicalComponents.MechanicalComponentsFactory;

import xPPU.ModuleRepository.ModuleRepositoryFactory;

import xPPU.StructureRepository.Structure;
import xPPU.StructureRepository.StructureRepositoryPackage;

/**
 * This is the item provider adapter for a {@link xPPU.StructureRepository.Structure} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StructureItemProvider extends IdentifierItemProvider {
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
			childrenFeatures.add(StructureRepositoryPackage.Literals.STRUCTURE__MODULES);
			childrenFeatures.add(StructureRepositoryPackage.Literals.STRUCTURE__COMPONENTS);
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
		String label = ((Structure)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_Structure_type") :
			getString("_UI_Structure_type") + " " + label;
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
			case StructureRepositoryPackage.STRUCTURE__MODULES:
			case StructureRepositoryPackage.STRUCTURE__COMPONENTS:
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
				(StructureRepositoryPackage.Literals.STRUCTURE__MODULES,
				 ModuleRepositoryFactory.eINSTANCE.createModule()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__MODULES,
				 ModuleRepositoryFactory.eINSTANCE.createRampModule()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__MODULES,
				 ModuleRepositoryFactory.eINSTANCE.createPusherModule()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__MODULES,
				 ModuleRepositoryFactory.eINSTANCE.createMotorModule()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__MODULES,
				 ModuleRepositoryFactory.eINSTANCE.createSensorModule()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__MODULES,
				 ModuleRepositoryFactory.eINSTANCE.createOpticalSensorModule()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__MODULES,
				 ModuleRepositoryFactory.eINSTANCE.createInductiveSensorModule()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__MODULES,
				 ModuleRepositoryFactory.eINSTANCE.createPresenceSensorModule()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__MODULES,
				 ModuleRepositoryFactory.eINSTANCE.createPressureSensorModule()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createSimpleMotor()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createRegularRamp()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createSensor()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createOpticalSensor()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createInductiveSensor()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createPresenceSensor()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createPneumaticPipe()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createCompressor()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createPowerCable()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createProportionalCylinder()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createBistableCylinder()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createRack()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createCorner()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createRegularValve()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createTank()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createDispenser()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createBottleSeperator()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createPowerSupply()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createVacuumGripper()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createConveyorBelt()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createFrame()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createRubberBand()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createPusher()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createTurningTable()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createController()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createLogicalWiring()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createArm()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createTable()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createGripperPart()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createMicroswitchModule()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createVacuumSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createReedSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createPowerSplitter()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createWaterSplitter()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createPneumaticSplitter()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createCylinderPart()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createMonostableCylinder()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__COMPONENTS,
				 BusComponentsFactory.eINSTANCE.createBusBox()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__COMPONENTS,
				 BusComponentsFactory.eINSTANCE.createBusMaster()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__COMPONENTS,
				 BusComponentsFactory.eINSTANCE.createBusSlave()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__COMPONENTS,
				 BusComponentsFactory.eINSTANCE.createBusCable()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__COMPONENTS,
				 BusComponentsFactory.eINSTANCE.createProfibusDPBox()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__COMPONENTS,
				 BusComponentsFactory.eINSTANCE.createProfibusDPMaster()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__COMPONENTS,
				 BusComponentsFactory.eINSTANCE.createProfibusDPSlave()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__COMPONENTS,
				 BusComponentsFactory.eINSTANCE.createProfibusDPCable()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__COMPONENTS,
				 BusComponentsFactory.eINSTANCE.createEtherCATBox()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__COMPONENTS,
				 BusComponentsFactory.eINSTANCE.createEtherCATMaster()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__COMPONENTS,
				 BusComponentsFactory.eINSTANCE.createEtherCATSlave()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__COMPONENTS,
				 BusComponentsFactory.eINSTANCE.createEtherCATCable()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__COMPONENTS,
				 ElectronicComponentsFactory.eINSTANCE.createSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__COMPONENTS,
				 ElectronicComponentsFactory.eINSTANCE.createLED()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__COMPONENTS,
				 ElectronicComponentsFactory.eINSTANCE.createButton()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__COMPONENTS,
				 MechanicalComponentsFactory.eINSTANCE.createHousing()));

		newChildDescriptors.add
			(createChildParameter
				(StructureRepositoryPackage.Literals.STRUCTURE__COMPONENTS,
				 MechanicalComponentsFactory.eINSTANCE.createReturnSpring()));
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
