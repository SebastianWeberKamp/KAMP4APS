/**
 */
package iec611313Specification.language.st.provider;


import iec611313Specification.common.CommonFactory;

import iec611313Specification.common.pous.function_blocks.Function_blocksFactory;

import iec611313Specification.common.pous.functions.FunctionsFactory;

import iec611313Specification.common.pous.functions.provider.FunctionBodySpecificationItemProvider;

import iec611313Specification.common.provider.IEC611313EditPlugin;

import iec611313Specification.common.variables.VariablesFactory;

import iec611313Specification.language.st.StFactory;
import iec611313Specification.language.st.StPackage;
import iec611313Specification.language.st.StatementList;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link iec611313Specification.language.st.StatementList} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StatementListItemProvider extends FunctionBodySpecificationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementListItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(StPackage.Literals.STATEMENT_LIST__CONTAINS_STATEMENT);
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
	 * This returns StatementList.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/StatementList"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_StatementList_type");
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

		switch (notification.getFeatureID(StatementList.class)) {
			case StPackage.STATEMENT_LIST__CONTAINS_STATEMENT:
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
				(StPackage.Literals.STATEMENT_LIST__CONTAINS_STATEMENT,
				 StFactory.eINSTANCE.createCase()));

		newChildDescriptors.add
			(createChildParameter
				(StPackage.Literals.STATEMENT_LIST__CONTAINS_STATEMENT,
				 StFactory.eINSTANCE.createExit()));

		newChildDescriptors.add
			(createChildParameter
				(StPackage.Literals.STATEMENT_LIST__CONTAINS_STATEMENT,
				 StFactory.eINSTANCE.createFor()));

		newChildDescriptors.add
			(createChildParameter
				(StPackage.Literals.STATEMENT_LIST__CONTAINS_STATEMENT,
				 StFactory.eINSTANCE.createIf()));

		newChildDescriptors.add
			(createChildParameter
				(StPackage.Literals.STATEMENT_LIST__CONTAINS_STATEMENT,
				 StFactory.eINSTANCE.createNilValue()));

		newChildDescriptors.add
			(createChildParameter
				(StPackage.Literals.STATEMENT_LIST__CONTAINS_STATEMENT,
				 StFactory.eINSTANCE.createRepeat()));

		newChildDescriptors.add
			(createChildParameter
				(StPackage.Literals.STATEMENT_LIST__CONTAINS_STATEMENT,
				 StFactory.eINSTANCE.createReturn()));

		newChildDescriptors.add
			(createChildParameter
				(StPackage.Literals.STATEMENT_LIST__CONTAINS_STATEMENT,
				 StFactory.eINSTANCE.createWhile()));

		newChildDescriptors.add
			(createChildParameter
				(StPackage.Literals.STATEMENT_LIST__CONTAINS_STATEMENT,
				 CommonFactory.eINSTANCE.createAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(StPackage.Literals.STATEMENT_LIST__CONTAINS_STATEMENT,
				 CommonFactory.eINSTANCE.createLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StPackage.Literals.STATEMENT_LIST__CONTAINS_STATEMENT,
				 Function_blocksFactory.eINSTANCE.createFunctionBlockInvocation()));

		newChildDescriptors.add
			(createChildParameter
				(StPackage.Literals.STATEMENT_LIST__CONTAINS_STATEMENT,
				 FunctionsFactory.eINSTANCE.createFunctionCall()));

		newChildDescriptors.add
			(createChildParameter
				(StPackage.Literals.STATEMENT_LIST__CONTAINS_STATEMENT,
				 VariablesFactory.eINSTANCE.createVariableAccess()));
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
