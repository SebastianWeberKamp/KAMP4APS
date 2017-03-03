/**
 */
package iec611313Specification.common.pous.function_blocks.provider;


import iec611313Specification.common.pous.function_blocks.Function_blocksPackage;

import iec611313Specification.common.provider.IEC611313EditPlugin;

import iec611313Specification.language.il.IlPackage;

import iec611313Specification.language.st.provider.StatementItemProvider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link iec611313Specification.common.pous.function_blocks.FunctionBlockInvocation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionBlockInvocationItemProvider extends StatementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBlockInvocationItemProvider(AdapterFactory adapterFactory) {
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

			addHasInstructionLabelPropertyDescriptor(object);
			addInvokesFunBlockInstancePropertyDescriptor(object);
			addHasFunBlockInvocationParamListPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Has Instruction Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasInstructionLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Instruction_HasInstructionLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Instruction_HasInstructionLabel_feature", "_UI_Instruction_type"),
				 IlPackage.Literals.INSTRUCTION__HAS_INSTRUCTION_LABEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Invokes Fun Block Instance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInvokesFunBlockInstancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FunctionBlockInvocation_InvokesFunBlockInstance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FunctionBlockInvocation_InvokesFunBlockInstance_feature", "_UI_FunctionBlockInvocation_type"),
				 Function_blocksPackage.Literals.FUNCTION_BLOCK_INVOCATION__INVOKES_FUN_BLOCK_INSTANCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Fun Block Invocation Param List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasFunBlockInvocationParamListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FunctionBlockInvocation_HasFunBlockInvocationParamList_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FunctionBlockInvocation_HasFunBlockInvocationParamList_feature", "_UI_FunctionBlockInvocation_type"),
				 Function_blocksPackage.Literals.FUNCTION_BLOCK_INVOCATION__HAS_FUN_BLOCK_INVOCATION_PARAM_LIST,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns FunctionBlockInvocation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FunctionBlockInvocation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_FunctionBlockInvocation_type");
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
