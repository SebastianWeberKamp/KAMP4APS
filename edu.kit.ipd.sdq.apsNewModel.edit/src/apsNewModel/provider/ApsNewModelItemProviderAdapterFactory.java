/**
 */
package apsNewModel.provider;

import apsNewModel.util.ApsNewModelAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ApsNewModelItemProviderAdapterFactory extends ApsNewModelAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApsNewModelItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link apsNewModel.FunctionBlock} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionBlockItemProvider functionBlockItemProvider;

	/**
	 * This creates an adapter for a {@link apsNewModel.FunctionBlock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFunctionBlockAdapter() {
		if (functionBlockItemProvider == null) {
			functionBlockItemProvider = new FunctionBlockItemProvider(this);
		}

		return functionBlockItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link apsNewModel.Function} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionItemProvider functionItemProvider;

	/**
	 * This creates an adapter for a {@link apsNewModel.Function}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFunctionAdapter() {
		if (functionItemProvider == null) {
			functionItemProvider = new FunctionItemProvider(this);
		}

		return functionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link apsNewModel.Program} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramItemProvider programItemProvider;

	/**
	 * This creates an adapter for a {@link apsNewModel.Program}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProgramAdapter() {
		if (programItemProvider == null) {
			programItemProvider = new ProgramItemProvider(this);
		}

		return programItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link apsNewModel.SPSSystem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SPSSystemItemProvider spsSystemItemProvider;

	/**
	 * This creates an adapter for a {@link apsNewModel.SPSSystem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSPSSystemAdapter() {
		if (spsSystemItemProvider == null) {
			spsSystemItemProvider = new SPSSystemItemProvider(this);
		}

		return spsSystemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link apsNewModel.IECInterface} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IECInterfaceItemProvider iecInterfaceItemProvider;

	/**
	 * This creates an adapter for a {@link apsNewModel.IECInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIECInterfaceAdapter() {
		if (iecInterfaceItemProvider == null) {
			iecInterfaceItemProvider = new IECInterfaceItemProvider(this);
		}

		return iecInterfaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link apsNewModel.GlobalVariable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlobalVariableItemProvider globalVariableItemProvider;

	/**
	 * This creates an adapter for a {@link apsNewModel.GlobalVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGlobalVariableAdapter() {
		if (globalVariableItemProvider == null) {
			globalVariableItemProvider = new GlobalVariableItemProvider(this);
		}

		return globalVariableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link apsNewModel.StaticFunctionblock} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaticFunctionblockItemProvider staticFunctionblockItemProvider;

	/**
	 * This creates an adapter for a {@link apsNewModel.StaticFunctionblock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStaticFunctionblockAdapter() {
		if (staticFunctionblockItemProvider == null) {
			staticFunctionblockItemProvider = new StaticFunctionblockItemProvider(this);
		}

		return staticFunctionblockItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link apsNewModel.IECMethodImplementation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IECMethodImplementationItemProvider iecMethodImplementationItemProvider;

	/**
	 * This creates an adapter for a {@link apsNewModel.IECMethodImplementation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIECMethodImplementationAdapter() {
		if (iecMethodImplementationItemProvider == null) {
			iecMethodImplementationItemProvider = new IECMethodImplementationItemProvider(this);
		}

		return iecMethodImplementationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link apsNewModel.IECPropertyImplementation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IECPropertyImplementationItemProvider iecPropertyImplementationItemProvider;

	/**
	 * This creates an adapter for a {@link apsNewModel.IECPropertyImplementation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIECPropertyImplementationAdapter() {
		if (iecPropertyImplementationItemProvider == null) {
			iecPropertyImplementationItemProvider = new IECPropertyImplementationItemProvider(this);
		}

		return iecPropertyImplementationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link apsNewModel.Enum} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumItemProvider enumItemProvider;

	/**
	 * This creates an adapter for a {@link apsNewModel.Enum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnumAdapter() {
		if (enumItemProvider == null) {
			enumItemProvider = new EnumItemProvider(this);
		}

		return enumItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (functionBlockItemProvider != null) functionBlockItemProvider.dispose();
		if (functionItemProvider != null) functionItemProvider.dispose();
		if (programItemProvider != null) programItemProvider.dispose();
		if (spsSystemItemProvider != null) spsSystemItemProvider.dispose();
		if (iecInterfaceItemProvider != null) iecInterfaceItemProvider.dispose();
		if (globalVariableItemProvider != null) globalVariableItemProvider.dispose();
		if (staticFunctionblockItemProvider != null) staticFunctionblockItemProvider.dispose();
		if (iecMethodImplementationItemProvider != null) iecMethodImplementationItemProvider.dispose();
		if (iecPropertyImplementationItemProvider != null) iecPropertyImplementationItemProvider.dispose();
		if (enumItemProvider != null) enumItemProvider.dispose();
	}

}
