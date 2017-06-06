/**
 */
package xPPU.ModuleRepository.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import xPPU.Identifier.Identifier;

import xPPU.ModuleRepository.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see xPPU.ModuleRepository.ModuleRepositoryPackage
 * @generated
 */
public class ModuleRepositoryAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModuleRepositoryPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleRepositoryAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModuleRepositoryPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleRepositorySwitch<Adapter> modelSwitch =
		new ModuleRepositorySwitch<Adapter>() {
			@Override
			public Adapter caseModule(Module object) {
				return createModuleAdapter();
			}
			@Override
			public Adapter caseRampModule(RampModule object) {
				return createRampModuleAdapter();
			}
			@Override
			public Adapter casePusherModule(PusherModule object) {
				return createPusherModuleAdapter();
			}
			@Override
			public Adapter caseMotorModule(MotorModule object) {
				return createMotorModuleAdapter();
			}
			@Override
			public Adapter caseSensorModule(SensorModule object) {
				return createSensorModuleAdapter();
			}
			@Override
			public Adapter caseOpticalSensorModule(OpticalSensorModule object) {
				return createOpticalSensorModuleAdapter();
			}
			@Override
			public Adapter caseInductiveSensorModule(InductiveSensorModule object) {
				return createInductiveSensorModuleAdapter();
			}
			@Override
			public Adapter casePresenceSensorModule(PresenceSensorModule object) {
				return createPresenceSensorModuleAdapter();
			}
			@Override
			public Adapter casePressureSensorModule(PressureSensorModule object) {
				return createPressureSensorModuleAdapter();
			}
			@Override
			public Adapter caseIdentifier(Identifier object) {
				return createIdentifierAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ModuleRepository.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ModuleRepository.Module
	 * @generated
	 */
	public Adapter createModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ModuleRepository.RampModule <em>Ramp Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ModuleRepository.RampModule
	 * @generated
	 */
	public Adapter createRampModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ModuleRepository.PusherModule <em>Pusher Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ModuleRepository.PusherModule
	 * @generated
	 */
	public Adapter createPusherModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ModuleRepository.MotorModule <em>Motor Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ModuleRepository.MotorModule
	 * @generated
	 */
	public Adapter createMotorModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ModuleRepository.SensorModule <em>Sensor Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ModuleRepository.SensorModule
	 * @generated
	 */
	public Adapter createSensorModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ModuleRepository.OpticalSensorModule <em>Optical Sensor Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ModuleRepository.OpticalSensorModule
	 * @generated
	 */
	public Adapter createOpticalSensorModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ModuleRepository.InductiveSensorModule <em>Inductive Sensor Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ModuleRepository.InductiveSensorModule
	 * @generated
	 */
	public Adapter createInductiveSensorModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ModuleRepository.PresenceSensorModule <em>Presence Sensor Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ModuleRepository.PresenceSensorModule
	 * @generated
	 */
	public Adapter createPresenceSensorModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.ModuleRepository.PressureSensorModule <em>Pressure Sensor Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.ModuleRepository.PressureSensorModule
	 * @generated
	 */
	public Adapter createPressureSensorModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.Identifier.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.Identifier.Identifier
	 * @generated
	 */
	public Adapter createIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ModuleRepositoryAdapterFactory