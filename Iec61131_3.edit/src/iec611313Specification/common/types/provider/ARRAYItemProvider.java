/**
 */
package iec611313Specification.common.types.provider;


import iec611313Specification.common.CommonFactory;

import iec611313Specification.common.pous.function_blocks.Function_blocksFactory;

import iec611313Specification.common.types.ARRAY;
import iec611313Specification.common.types.TypesFactory;
import iec611313Specification.common.types.TypesPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link iec611313Specification.common.types.ARRAY} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ARRAYItemProvider extends ANY_DERIVEDItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARRAYItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(TypesPackage.Literals.ARRAY__HAS_ARRAY_DIMENSION);
			childrenFeatures.add(TypesPackage.Literals.ARRAY__HAS_INITIAL_ARRAY_VALUE);
			childrenFeatures.add(TypesPackage.Literals.ARRAY__HAS_ARRAY_BASE_TYPE);
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
	 * This returns ARRAY.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ARRAY"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ARRAY)object).getTypeName();
		return label == null || label.length() == 0 ?
			getString("_UI_ARRAY_type") :
			getString("_UI_ARRAY_type") + " " + label;
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

		switch (notification.getFeatureID(ARRAY.class)) {
			case TypesPackage.ARRAY__HAS_ARRAY_DIMENSION:
			case TypesPackage.ARRAY__HAS_INITIAL_ARRAY_VALUE:
			case TypesPackage.ARRAY__HAS_ARRAY_BASE_TYPE:
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
				(TypesPackage.Literals.ARRAY__HAS_ARRAY_DIMENSION,
				 CommonFactory.eINSTANCE.createRange()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.ARRAY__HAS_INITIAL_ARRAY_VALUE,
				 CommonFactory.eINSTANCE.createLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.ARRAY__HAS_ARRAY_BASE_TYPE,
				 TypesFactory.eINSTANCE.createTIME()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.ARRAY__HAS_ARRAY_BASE_TYPE,
				 TypesFactory.eINSTANCE.createREAL()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.ARRAY__HAS_ARRAY_BASE_TYPE,
				 TypesFactory.eINSTANCE.createLREAL()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.ARRAY__HAS_ARRAY_BASE_TYPE,
				 TypesFactory.eINSTANCE.createSINT()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.ARRAY__HAS_ARRAY_BASE_TYPE,
				 TypesFactory.eINSTANCE.createINT()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.ARRAY__HAS_ARRAY_BASE_TYPE,
				 TypesFactory.eINSTANCE.createDINT()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.ARRAY__HAS_ARRAY_BASE_TYPE,
				 TypesFactory.eINSTANCE.createLINT()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.ARRAY__HAS_ARRAY_BASE_TYPE,
				 TypesFactory.eINSTANCE.createUSINT()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.ARRAY__HAS_ARRAY_BASE_TYPE,
				 TypesFactory.eINSTANCE.createUINT()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.ARRAY__HAS_ARRAY_BASE_TYPE,
				 TypesFactory.eINSTANCE.createUDINT()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.ARRAY__HAS_ARRAY_BASE_TYPE,
				 TypesFactory.eINSTANCE.createULINT()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.ARRAY__HAS_ARRAY_BASE_TYPE,
				 TypesFactory.eINSTANCE.createDATE()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.ARRAY__HAS_ARRAY_BASE_TYPE,
				 TypesFactory.eINSTANCE.createDATE_AND_TIME()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.ARRAY__HAS_ARRAY_BASE_TYPE,
				 TypesFactory.eINSTANCE.createTIME_OF_DAY()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.ARRAY__HAS_ARRAY_BASE_TYPE,
				 TypesFactory.eINSTANCE.createBOOL()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.ARRAY__HAS_ARRAY_BASE_TYPE,
				 TypesFactory.eINSTANCE.createBYTE()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.ARRAY__HAS_ARRAY_BASE_TYPE,
				 TypesFactory.eINSTANCE.createWORD()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.ARRAY__HAS_ARRAY_BASE_TYPE,
				 TypesFactory.eINSTANCE.createDWORD()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.ARRAY__HAS_ARRAY_BASE_TYPE,
				 TypesFactory.eINSTANCE.createLWORD()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.ARRAY__HAS_ARRAY_BASE_TYPE,
				 TypesFactory.eINSTANCE.createSTRING()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.ARRAY__HAS_ARRAY_BASE_TYPE,
				 TypesFactory.eINSTANCE.createWSTRING()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.ARRAY__HAS_ARRAY_BASE_TYPE,
				 TypesFactory.eINSTANCE.createENUMERATION()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.ARRAY__HAS_ARRAY_BASE_TYPE,
				 TypesFactory.eINSTANCE.createDERIVED()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.ARRAY__HAS_ARRAY_BASE_TYPE,
				 TypesFactory.eINSTANCE.createARRAY()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.ARRAY__HAS_ARRAY_BASE_TYPE,
				 TypesFactory.eINSTANCE.createSTRUCTURE()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.ARRAY__HAS_ARRAY_BASE_TYPE,
				 TypesFactory.eINSTANCE.createPOINTER()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.ARRAY__HAS_ARRAY_BASE_TYPE,
				 Function_blocksFactory.eINSTANCE.createFunctionBlockType()));
	}

}
