/**
 */
package iec611313Specification.language.il.provider;


import iec611313Specification.common.pous.function_blocks.Function_blocksFactory;

import iec611313Specification.common.pous.functions.FunctionsFactory;

import iec611313Specification.common.pous.functions.provider.FunctionBodySpecificationItemProvider;

import iec611313Specification.common.provider.IEC611313EditPlugin;

import iec611313Specification.language.il.IlFactory;
import iec611313Specification.language.il.IlPackage;
import iec611313Specification.language.il.InstructionList;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link iec611313Specification.language.il.InstructionList} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InstructionListItemProvider extends FunctionBodySpecificationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionListItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(IlPackage.Literals.INSTRUCTION_LIST__CONTAINS_INSTRUCTION);
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
	 * This returns InstructionList.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/InstructionList"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_InstructionList_type");
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

		switch (notification.getFeatureID(InstructionList.class)) {
			case IlPackage.INSTRUCTION_LIST__CONTAINS_INSTRUCTION:
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
				(IlPackage.Literals.INSTRUCTION_LIST__CONTAINS_INSTRUCTION,
				 IlFactory.eINSTANCE.createComplexInstruction()));

		newChildDescriptors.add
			(createChildParameter
				(IlPackage.Literals.INSTRUCTION_LIST__CONTAINS_INSTRUCTION,
				 IlFactory.eINSTANCE.createJumpInstruction()));

		newChildDescriptors.add
			(createChildParameter
				(IlPackage.Literals.INSTRUCTION_LIST__CONTAINS_INSTRUCTION,
				 IlFactory.eINSTANCE.createReturnInstruction()));

		newChildDescriptors.add
			(createChildParameter
				(IlPackage.Literals.INSTRUCTION_LIST__CONTAINS_INSTRUCTION,
				 IlFactory.eINSTANCE.createSimpleInstruction()));

		newChildDescriptors.add
			(createChildParameter
				(IlPackage.Literals.INSTRUCTION_LIST__CONTAINS_INSTRUCTION,
				 Function_blocksFactory.eINSTANCE.createFunctionBlockInvocation()));

		newChildDescriptors.add
			(createChildParameter
				(IlPackage.Literals.INSTRUCTION_LIST__CONTAINS_INSTRUCTION,
				 FunctionsFactory.eINSTANCE.createFunctionCall()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return IEC611313EditPlugin.INSTANCE;
	}

}
