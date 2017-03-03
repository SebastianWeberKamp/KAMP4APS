/**
 */
package iec611313Specification.common.oop.provider;


import iec611313Specification.common.oop.OopPackage;
import iec611313Specification.common.oop.PropertySignature;

import iec611313Specification.common.pous.function_blocks.Function_blocksFactory;

import iec611313Specification.common.provider.IEC611313EditPlugin;

import iec611313Specification.common.types.TypesFactory;

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
 * This is the item provider adapter for a {@link iec611313Specification.common.oop.PropertySignature} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertySignatureItemProvider 
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
	public PropertySignatureItemProvider(AdapterFactory adapterFactory) {
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

			addHasSetterPropertyDescriptor(object);
			addHasGetterPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Has Setter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasSetterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PropertySignature_HasSetter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PropertySignature_HasSetter_feature", "_UI_PropertySignature_type"),
				 OopPackage.Literals.PROPERTY_SIGNATURE__HAS_SETTER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Getter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasGetterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PropertySignature_HasGetter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PropertySignature_HasGetter_feature", "_UI_PropertySignature_type"),
				 OopPackage.Literals.PROPERTY_SIGNATURE__HAS_GETTER,
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
			childrenFeatures.add(OopPackage.Literals.PROPERTY_SIGNATURE__HAS_RETURN_TYPE);
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
	 * This returns PropertySignature.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PropertySignature"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		PropertySignature propertySignature = (PropertySignature)object;
		return getString("_UI_PropertySignature_type") + " " + propertySignature.isHasSetter();
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

		switch (notification.getFeatureID(PropertySignature.class)) {
			case OopPackage.PROPERTY_SIGNATURE__HAS_SETTER:
			case OopPackage.PROPERTY_SIGNATURE__HAS_GETTER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case OopPackage.PROPERTY_SIGNATURE__HAS_RETURN_TYPE:
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
				(OopPackage.Literals.PROPERTY_SIGNATURE__HAS_RETURN_TYPE,
				 Function_blocksFactory.eINSTANCE.createFunctionBlockType()));

		newChildDescriptors.add
			(createChildParameter
				(OopPackage.Literals.PROPERTY_SIGNATURE__HAS_RETURN_TYPE,
				 TypesFactory.eINSTANCE.createTIME()));

		newChildDescriptors.add
			(createChildParameter
				(OopPackage.Literals.PROPERTY_SIGNATURE__HAS_RETURN_TYPE,
				 TypesFactory.eINSTANCE.createREAL()));

		newChildDescriptors.add
			(createChildParameter
				(OopPackage.Literals.PROPERTY_SIGNATURE__HAS_RETURN_TYPE,
				 TypesFactory.eINSTANCE.createLREAL()));

		newChildDescriptors.add
			(createChildParameter
				(OopPackage.Literals.PROPERTY_SIGNATURE__HAS_RETURN_TYPE,
				 TypesFactory.eINSTANCE.createSINT()));

		newChildDescriptors.add
			(createChildParameter
				(OopPackage.Literals.PROPERTY_SIGNATURE__HAS_RETURN_TYPE,
				 TypesFactory.eINSTANCE.createINT()));

		newChildDescriptors.add
			(createChildParameter
				(OopPackage.Literals.PROPERTY_SIGNATURE__HAS_RETURN_TYPE,
				 TypesFactory.eINSTANCE.createDINT()));

		newChildDescriptors.add
			(createChildParameter
				(OopPackage.Literals.PROPERTY_SIGNATURE__HAS_RETURN_TYPE,
				 TypesFactory.eINSTANCE.createLINT()));

		newChildDescriptors.add
			(createChildParameter
				(OopPackage.Literals.PROPERTY_SIGNATURE__HAS_RETURN_TYPE,
				 TypesFactory.eINSTANCE.createUSINT()));

		newChildDescriptors.add
			(createChildParameter
				(OopPackage.Literals.PROPERTY_SIGNATURE__HAS_RETURN_TYPE,
				 TypesFactory.eINSTANCE.createUINT()));

		newChildDescriptors.add
			(createChildParameter
				(OopPackage.Literals.PROPERTY_SIGNATURE__HAS_RETURN_TYPE,
				 TypesFactory.eINSTANCE.createUDINT()));

		newChildDescriptors.add
			(createChildParameter
				(OopPackage.Literals.PROPERTY_SIGNATURE__HAS_RETURN_TYPE,
				 TypesFactory.eINSTANCE.createULINT()));

		newChildDescriptors.add
			(createChildParameter
				(OopPackage.Literals.PROPERTY_SIGNATURE__HAS_RETURN_TYPE,
				 TypesFactory.eINSTANCE.createDATE()));

		newChildDescriptors.add
			(createChildParameter
				(OopPackage.Literals.PROPERTY_SIGNATURE__HAS_RETURN_TYPE,
				 TypesFactory.eINSTANCE.createDATE_AND_TIME()));

		newChildDescriptors.add
			(createChildParameter
				(OopPackage.Literals.PROPERTY_SIGNATURE__HAS_RETURN_TYPE,
				 TypesFactory.eINSTANCE.createTIME_OF_DAY()));

		newChildDescriptors.add
			(createChildParameter
				(OopPackage.Literals.PROPERTY_SIGNATURE__HAS_RETURN_TYPE,
				 TypesFactory.eINSTANCE.createBOOL()));

		newChildDescriptors.add
			(createChildParameter
				(OopPackage.Literals.PROPERTY_SIGNATURE__HAS_RETURN_TYPE,
				 TypesFactory.eINSTANCE.createBYTE()));

		newChildDescriptors.add
			(createChildParameter
				(OopPackage.Literals.PROPERTY_SIGNATURE__HAS_RETURN_TYPE,
				 TypesFactory.eINSTANCE.createWORD()));

		newChildDescriptors.add
			(createChildParameter
				(OopPackage.Literals.PROPERTY_SIGNATURE__HAS_RETURN_TYPE,
				 TypesFactory.eINSTANCE.createDWORD()));

		newChildDescriptors.add
			(createChildParameter
				(OopPackage.Literals.PROPERTY_SIGNATURE__HAS_RETURN_TYPE,
				 TypesFactory.eINSTANCE.createLWORD()));

		newChildDescriptors.add
			(createChildParameter
				(OopPackage.Literals.PROPERTY_SIGNATURE__HAS_RETURN_TYPE,
				 TypesFactory.eINSTANCE.createSTRING()));

		newChildDescriptors.add
			(createChildParameter
				(OopPackage.Literals.PROPERTY_SIGNATURE__HAS_RETURN_TYPE,
				 TypesFactory.eINSTANCE.createWSTRING()));

		newChildDescriptors.add
			(createChildParameter
				(OopPackage.Literals.PROPERTY_SIGNATURE__HAS_RETURN_TYPE,
				 TypesFactory.eINSTANCE.createENUMERATION()));

		newChildDescriptors.add
			(createChildParameter
				(OopPackage.Literals.PROPERTY_SIGNATURE__HAS_RETURN_TYPE,
				 TypesFactory.eINSTANCE.createDERIVED()));

		newChildDescriptors.add
			(createChildParameter
				(OopPackage.Literals.PROPERTY_SIGNATURE__HAS_RETURN_TYPE,
				 TypesFactory.eINSTANCE.createARRAY()));

		newChildDescriptors.add
			(createChildParameter
				(OopPackage.Literals.PROPERTY_SIGNATURE__HAS_RETURN_TYPE,
				 TypesFactory.eINSTANCE.createSTRUCTURE()));

		newChildDescriptors.add
			(createChildParameter
				(OopPackage.Literals.PROPERTY_SIGNATURE__HAS_RETURN_TYPE,
				 TypesFactory.eINSTANCE.createPOINTER()));
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
