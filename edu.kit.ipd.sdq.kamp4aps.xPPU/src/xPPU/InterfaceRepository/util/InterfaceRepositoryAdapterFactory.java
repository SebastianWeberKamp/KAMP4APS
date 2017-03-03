/**
 */
package xPPU.InterfaceRepository.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import xPPU.Identifier.Identifier;
import xPPU.InterfaceRepository.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see xPPU.InterfaceRepository.InterfaceRepositoryPackage
 * @generated
 */
public class InterfaceRepositoryAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InterfaceRepositoryPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceRepositoryAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = InterfaceRepositoryPackage.eINSTANCE;
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
	protected InterfaceRepositorySwitch<Adapter> modelSwitch =
		new InterfaceRepositorySwitch<Adapter>() {
			@Override
			public Adapter caseInterfaceRepository(InterfaceRepository object) {
				return createInterfaceRepositoryAdapter();
			}
			@Override
			public Adapter caseInterface(Interface object) {
				return createInterfaceAdapter();
			}
			@Override
			public Adapter caseScrewing(Screwing object) {
				return createScrewingAdapter();
			}
			@Override
			public Adapter caseScrewingSplitter(ScrewingSplitter object) {
				return createScrewingSplitterAdapter();
			}
			@Override
			public Adapter caseScrewingMotor(ScrewingMotor object) {
				return createScrewingMotorAdapter();
			}
			@Override
			public Adapter caseScrewingRack(ScrewingRack object) {
				return createScrewingRackAdapter();
			}
			@Override
			public Adapter caseScrewingCylinder(ScrewingCylinder object) {
				return createScrewingCylinderAdapter();
			}
			@Override
			public Adapter caseScrewingFixture(ScrewingFixture object) {
				return createScrewingFixtureAdapter();
			}
			@Override
			public Adapter caseScrewingPotentiometer(ScrewingPotentiometer object) {
				return createScrewingPotentiometerAdapter();
			}
			@Override
			public Adapter caseSuspension(Suspension object) {
				return createSuspensionAdapter();
			}
			@Override
			public Adapter caseSuspensionRack(SuspensionRack object) {
				return createSuspensionRackAdapter();
			}
			@Override
			public Adapter caseSuspensionArm(SuspensionArm object) {
				return createSuspensionArmAdapter();
			}
			@Override
			public Adapter caseGearing(Gearing object) {
				return createGearingAdapter();
			}
			@Override
			public Adapter caseClamping(Clamping object) {
				return createClampingAdapter();
			}
			@Override
			public Adapter casePneumaticSupply(PneumaticSupply object) {
				return createPneumaticSupplyAdapter();
			}
			@Override
			public Adapter caseSignalInterface(SignalInterface object) {
				return createSignalInterfaceAdapter();
			}
			@Override
			public Adapter caseWaterSupply(WaterSupply object) {
				return createWaterSupplyAdapter();
			}
			@Override
			public Adapter casePhysicalConnection(PhysicalConnection object) {
				return createPhysicalConnectionAdapter();
			}
			@Override
			public Adapter caseTransportConnection(TransportConnection object) {
				return createTransportConnectionAdapter();
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
	 * Creates a new adapter for an object of class '{@link xPPU.InterfaceRepository.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.InterfaceRepository.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.InterfaceRepository.Screwing <em>Screwing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.InterfaceRepository.Screwing
	 * @generated
	 */
	public Adapter createScrewingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.InterfaceRepository.ScrewingSplitter <em>Screwing Splitter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.InterfaceRepository.ScrewingSplitter
	 * @generated
	 */
	public Adapter createScrewingSplitterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.InterfaceRepository.ScrewingMotor <em>Screwing Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.InterfaceRepository.ScrewingMotor
	 * @generated
	 */
	public Adapter createScrewingMotorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.InterfaceRepository.ScrewingRack <em>Screwing Rack</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.InterfaceRepository.ScrewingRack
	 * @generated
	 */
	public Adapter createScrewingRackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.InterfaceRepository.ScrewingCylinder <em>Screwing Cylinder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.InterfaceRepository.ScrewingCylinder
	 * @generated
	 */
	public Adapter createScrewingCylinderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.InterfaceRepository.ScrewingFixture <em>Screwing Fixture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.InterfaceRepository.ScrewingFixture
	 * @generated
	 */
	public Adapter createScrewingFixtureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.InterfaceRepository.ScrewingPotentiometer <em>Screwing Potentiometer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.InterfaceRepository.ScrewingPotentiometer
	 * @generated
	 */
	public Adapter createScrewingPotentiometerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.InterfaceRepository.Suspension <em>Suspension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.InterfaceRepository.Suspension
	 * @generated
	 */
	public Adapter createSuspensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.InterfaceRepository.SuspensionRack <em>Suspension Rack</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.InterfaceRepository.SuspensionRack
	 * @generated
	 */
	public Adapter createSuspensionRackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.InterfaceRepository.SuspensionArm <em>Suspension Arm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.InterfaceRepository.SuspensionArm
	 * @generated
	 */
	public Adapter createSuspensionArmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.InterfaceRepository.Gearing <em>Gearing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.InterfaceRepository.Gearing
	 * @generated
	 */
	public Adapter createGearingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.InterfaceRepository.Clamping <em>Clamping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.InterfaceRepository.Clamping
	 * @generated
	 */
	public Adapter createClampingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.InterfaceRepository.PneumaticSupply <em>Pneumatic Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.InterfaceRepository.PneumaticSupply
	 * @generated
	 */
	public Adapter createPneumaticSupplyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.InterfaceRepository.SignalInterface <em>Signal Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.InterfaceRepository.SignalInterface
	 * @generated
	 */
	public Adapter createSignalInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.InterfaceRepository.WaterSupply <em>Water Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.InterfaceRepository.WaterSupply
	 * @generated
	 */
	public Adapter createWaterSupplyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.InterfaceRepository.PhysicalConnection <em>Physical Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.InterfaceRepository.PhysicalConnection
	 * @generated
	 */
	public Adapter createPhysicalConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.InterfaceRepository.TransportConnection <em>Transport Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.InterfaceRepository.TransportConnection
	 * @generated
	 */
	public Adapter createTransportConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xPPU.InterfaceRepository.InterfaceRepository <em>Interface Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xPPU.InterfaceRepository.InterfaceRepository
	 * @generated
	 */
	public Adapter createInterfaceRepositoryAdapter() {
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

} //InterfaceRepositoryAdapterFactory
