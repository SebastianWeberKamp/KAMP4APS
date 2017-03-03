/**
 */
package iec611313Specification.common.pous.function_blocks.provider;


import iec611313Specification.common.oop.OopFactory;

import iec611313Specification.common.pous.function_blocks.FunctionBlockType;
import iec611313Specification.common.pous.function_blocks.Function_blocksPackage;

import iec611313Specification.common.provider.IEC611313EditPlugin;

import iec611313Specification.common.types.provider.ANY_DERIVEDItemProvider;

import iec611313Specification.common.variables.VariablesFactory;

import iec611313Specification.dummy.DummyFactory;

import iec611313Specification.language.fbd.FbdFactory;

import iec611313Specification.language.il.IlFactory;

import iec611313Specification.language.ld.LdFactory;

import iec611313Specification.language.sfc.SfcFactory;

import iec611313Specification.language.st.StFactory;

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
 * This is the item provider adapter for a {@link iec611313Specification.common.pous.function_blocks.FunctionBlockType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionBlockTypeItemProvider extends ANY_DERIVEDItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBlockTypeItemProvider(AdapterFactory adapterFactory) {
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

			addHasInterfaceImplementationsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Has Interface Implementations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasInterfaceImplementationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FunctionBlockType_HasInterfaceImplementations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FunctionBlockType_HasInterfaceImplementations_feature", "_UI_FunctionBlockType_type"),
				 Function_blocksPackage.Literals.FUNCTION_BLOCK_TYPE__HAS_INTERFACE_IMPLEMENTATIONS,
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
			childrenFeatures.add(Function_blocksPackage.Literals.FUNCTION_BLOCK_TYPE__HAS_FUN_BLOCK_BODY_SPEC);
			childrenFeatures.add(Function_blocksPackage.Literals.FUNCTION_BLOCK_TYPE__CONTAINS_FUNCTION_BLOCK_VAR_DECL);
			childrenFeatures.add(Function_blocksPackage.Literals.FUNCTION_BLOCK_TYPE__HAS_EXTENSIONS);
			childrenFeatures.add(Function_blocksPackage.Literals.FUNCTION_BLOCK_TYPE__CONTAINS_METHODS);
			childrenFeatures.add(Function_blocksPackage.Literals.FUNCTION_BLOCK_TYPE__CONTAINS_PROPERTIES);
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
	 * This returns FunctionBlockType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FunctionBlockType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((FunctionBlockType)object).getTypeName();
		return label == null || label.length() == 0 ?
			getString("_UI_FunctionBlockType_type") :
			getString("_UI_FunctionBlockType_type") + " " + label;
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

		switch (notification.getFeatureID(FunctionBlockType.class)) {
			case Function_blocksPackage.FUNCTION_BLOCK_TYPE__HAS_FUN_BLOCK_BODY_SPEC:
			case Function_blocksPackage.FUNCTION_BLOCK_TYPE__CONTAINS_FUNCTION_BLOCK_VAR_DECL:
			case Function_blocksPackage.FUNCTION_BLOCK_TYPE__HAS_EXTENSIONS:
			case Function_blocksPackage.FUNCTION_BLOCK_TYPE__CONTAINS_METHODS:
			case Function_blocksPackage.FUNCTION_BLOCK_TYPE__CONTAINS_PROPERTIES:
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
				(Function_blocksPackage.Literals.FUNCTION_BLOCK_TYPE__HAS_FUN_BLOCK_BODY_SPEC,
				 IlFactory.eINSTANCE.createInstructionList()));

		newChildDescriptors.add
			(createChildParameter
				(Function_blocksPackage.Literals.FUNCTION_BLOCK_TYPE__HAS_FUN_BLOCK_BODY_SPEC,
				 StFactory.eINSTANCE.createStatementList()));

		newChildDescriptors.add
			(createChildParameter
				(Function_blocksPackage.Literals.FUNCTION_BLOCK_TYPE__HAS_FUN_BLOCK_BODY_SPEC,
				 FbdFactory.eINSTANCE.createFunctionBlockDiagram()));

		newChildDescriptors.add
			(createChildParameter
				(Function_blocksPackage.Literals.FUNCTION_BLOCK_TYPE__HAS_FUN_BLOCK_BODY_SPEC,
				 LdFactory.eINSTANCE.createLadderDiagram()));

		newChildDescriptors.add
			(createChildParameter
				(Function_blocksPackage.Literals.FUNCTION_BLOCK_TYPE__HAS_FUN_BLOCK_BODY_SPEC,
				 SfcFactory.eINSTANCE.createSequentialFunctionChart()));

		newChildDescriptors.add
			(createChildParameter
				(Function_blocksPackage.Literals.FUNCTION_BLOCK_TYPE__HAS_FUN_BLOCK_BODY_SPEC,
				 DummyFactory.eINSTANCE.createCodeBodyDummy()));

		newChildDescriptors.add
			(createChildParameter
				(Function_blocksPackage.Literals.FUNCTION_BLOCK_TYPE__CONTAINS_FUNCTION_BLOCK_VAR_DECL,
				 VariablesFactory.eINSTANCE.createVariableDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(Function_blocksPackage.Literals.FUNCTION_BLOCK_TYPE__HAS_EXTENSIONS,
				 OopFactory.eINSTANCE.createInheritance()));

		newChildDescriptors.add
			(createChildParameter
				(Function_blocksPackage.Literals.FUNCTION_BLOCK_TYPE__CONTAINS_METHODS,
				 OopFactory.eINSTANCE.createMethod()));

		newChildDescriptors.add
			(createChildParameter
				(Function_blocksPackage.Literals.FUNCTION_BLOCK_TYPE__CONTAINS_PROPERTIES,
				 OopFactory.eINSTANCE.createProperty()));
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
