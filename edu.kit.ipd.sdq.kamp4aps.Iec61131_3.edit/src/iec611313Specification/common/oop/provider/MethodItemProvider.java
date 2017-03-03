/**
 */
package iec611313Specification.common.oop.provider;


import iec611313Specification.common.oop.AccessType;
import iec611313Specification.common.oop.Method;
import iec611313Specification.common.oop.OopFactory;
import iec611313Specification.common.oop.OopPackage;

import iec611313Specification.common.provider.IEC611313EditPlugin;

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
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link iec611313Specification.common.oop.Method} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MethodItemProvider 
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
	public MethodItemProvider(AdapterFactory adapterFactory) {
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

			addAccessTypePropertyDescriptor(object);
			addIsOverriddenPropertyDescriptor(object);
			addIsFinalPropertyDescriptor(object);
			addIsAbstractPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Access Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAccessTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Method_AccessType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Method_AccessType_feature", "_UI_Method_type"),
				 OopPackage.Literals.METHOD__ACCESS_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Overridden feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsOverriddenPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Method_isOverridden_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Method_isOverridden_feature", "_UI_Method_type"),
				 OopPackage.Literals.METHOD__IS_OVERRIDDEN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Final feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsFinalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Method_isFinal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Method_isFinal_feature", "_UI_Method_type"),
				 OopPackage.Literals.METHOD__IS_FINAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Abstract feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsAbstractPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Method_isAbstract_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Method_isAbstract_feature", "_UI_Method_type"),
				 OopPackage.Literals.METHOD__IS_ABSTRACT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(OopPackage.Literals.METHOD__HAS_BODY);
			childrenFeatures.add(OopPackage.Literals.METHOD__HAS_METHOD_SIGNATURE);
			childrenFeatures.add(OopPackage.Literals.METHOD__CONTAINS_LOCAL_VAR_DECL);
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
	 * This returns Method.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Method"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		AccessType labelValue = ((Method)object).getAccessType();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_Method_type") :
			getString("_UI_Method_type") + " " + label;
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

		switch (notification.getFeatureID(Method.class)) {
			case OopPackage.METHOD__ACCESS_TYPE:
			case OopPackage.METHOD__IS_OVERRIDDEN:
			case OopPackage.METHOD__IS_FINAL:
			case OopPackage.METHOD__IS_ABSTRACT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case OopPackage.METHOD__HAS_BODY:
			case OopPackage.METHOD__HAS_METHOD_SIGNATURE:
			case OopPackage.METHOD__CONTAINS_LOCAL_VAR_DECL:
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
				(OopPackage.Literals.METHOD__HAS_BODY,
				 IlFactory.eINSTANCE.createInstructionList()));

		newChildDescriptors.add
			(createChildParameter
				(OopPackage.Literals.METHOD__HAS_BODY,
				 StFactory.eINSTANCE.createStatementList()));

		newChildDescriptors.add
			(createChildParameter
				(OopPackage.Literals.METHOD__HAS_BODY,
				 FbdFactory.eINSTANCE.createFunctionBlockDiagram()));

		newChildDescriptors.add
			(createChildParameter
				(OopPackage.Literals.METHOD__HAS_BODY,
				 LdFactory.eINSTANCE.createLadderDiagram()));

		newChildDescriptors.add
			(createChildParameter
				(OopPackage.Literals.METHOD__HAS_BODY,
				 SfcFactory.eINSTANCE.createSequentialFunctionChart()));

		newChildDescriptors.add
			(createChildParameter
				(OopPackage.Literals.METHOD__HAS_BODY,
				 DummyFactory.eINSTANCE.createCodeBodyDummy()));

		newChildDescriptors.add
			(createChildParameter
				(OopPackage.Literals.METHOD__HAS_METHOD_SIGNATURE,
				 OopFactory.eINSTANCE.createMethodSignature()));

		newChildDescriptors.add
			(createChildParameter
				(OopPackage.Literals.METHOD__CONTAINS_LOCAL_VAR_DECL,
				 VariablesFactory.eINSTANCE.createVariableDeclaration()));
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
