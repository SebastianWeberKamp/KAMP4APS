/**
 */
package xPPU.InterfaceRepository.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import xPPU.InterfaceRepository.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InterfaceRepositoryFactoryImpl extends EFactoryImpl implements InterfaceRepositoryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InterfaceRepositoryFactory init() {
		try {
			InterfaceRepositoryFactory theInterfaceRepositoryFactory = (InterfaceRepositoryFactory)EPackage.Registry.INSTANCE.getEFactory(InterfaceRepositoryPackage.eNS_URI);
			if (theInterfaceRepositoryFactory != null) {
				return theInterfaceRepositoryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InterfaceRepositoryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceRepositoryFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case InterfaceRepositoryPackage.SCREWING: return createScrewing();
			case InterfaceRepositoryPackage.SCREWING_SPLITTER: return createScrewingSplitter();
			case InterfaceRepositoryPackage.SCREWING_MOTOR: return createScrewingMotor();
			case InterfaceRepositoryPackage.SCREWING_RACK: return createScrewingRack();
			case InterfaceRepositoryPackage.SCREWING_CYLINDER: return createScrewingCylinder();
			case InterfaceRepositoryPackage.SCREWING_FIXTURE: return createScrewingFixture();
			case InterfaceRepositoryPackage.SCREWING_POTENTIOMETER: return createScrewingPotentiometer();
			case InterfaceRepositoryPackage.SUSPENSION: return createSuspension();
			case InterfaceRepositoryPackage.SUSPENSION_RACK: return createSuspensionRack();
			case InterfaceRepositoryPackage.SUSPENSION_ARM: return createSuspensionArm();
			case InterfaceRepositoryPackage.GEARING: return createGearing();
			case InterfaceRepositoryPackage.CLAMPING: return createClamping();
			case InterfaceRepositoryPackage.PNEUMATIC_SUPPLY: return createPneumaticSupply();
			case InterfaceRepositoryPackage.SIGNAL_INTERFACE: return createSignalInterface();
			case InterfaceRepositoryPackage.WATER_SUPPLY: return createWaterSupply();
			case InterfaceRepositoryPackage.PHYSICAL_CONNECTION: return createPhysicalConnection();
			case InterfaceRepositoryPackage.TRANSPORT_CONNECTION: return createTransportConnection();
			case InterfaceRepositoryPackage.INTERFACE_REPOSITORY: return createInterfaceRepository();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Screwing createScrewing() {
		ScrewingImpl screwing = new ScrewingImpl();
		return screwing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScrewingSplitter createScrewingSplitter() {
		ScrewingSplitterImpl screwingSplitter = new ScrewingSplitterImpl();
		return screwingSplitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScrewingMotor createScrewingMotor() {
		ScrewingMotorImpl screwingMotor = new ScrewingMotorImpl();
		return screwingMotor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScrewingRack createScrewingRack() {
		ScrewingRackImpl screwingRack = new ScrewingRackImpl();
		return screwingRack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScrewingCylinder createScrewingCylinder() {
		ScrewingCylinderImpl screwingCylinder = new ScrewingCylinderImpl();
		return screwingCylinder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScrewingFixture createScrewingFixture() {
		ScrewingFixtureImpl screwingFixture = new ScrewingFixtureImpl();
		return screwingFixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScrewingPotentiometer createScrewingPotentiometer() {
		ScrewingPotentiometerImpl screwingPotentiometer = new ScrewingPotentiometerImpl();
		return screwingPotentiometer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Suspension createSuspension() {
		SuspensionImpl suspension = new SuspensionImpl();
		return suspension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuspensionRack createSuspensionRack() {
		SuspensionRackImpl suspensionRack = new SuspensionRackImpl();
		return suspensionRack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuspensionArm createSuspensionArm() {
		SuspensionArmImpl suspensionArm = new SuspensionArmImpl();
		return suspensionArm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gearing createGearing() {
		GearingImpl gearing = new GearingImpl();
		return gearing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clamping createClamping() {
		ClampingImpl clamping = new ClampingImpl();
		return clamping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PneumaticSupply createPneumaticSupply() {
		PneumaticSupplyImpl pneumaticSupply = new PneumaticSupplyImpl();
		return pneumaticSupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalInterface createSignalInterface() {
		SignalInterfaceImpl signalInterface = new SignalInterfaceImpl();
		return signalInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaterSupply createWaterSupply() {
		WaterSupplyImpl waterSupply = new WaterSupplyImpl();
		return waterSupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalConnection createPhysicalConnection() {
		PhysicalConnectionImpl physicalConnection = new PhysicalConnectionImpl();
		return physicalConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportConnection createTransportConnection() {
		TransportConnectionImpl transportConnection = new TransportConnectionImpl();
		return transportConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceRepository createInterfaceRepository() {
		InterfaceRepositoryImpl interfaceRepository = new InterfaceRepositoryImpl();
		return interfaceRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceRepositoryPackage getInterfaceRepositoryPackage() {
		return (InterfaceRepositoryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InterfaceRepositoryPackage getPackage() {
		return InterfaceRepositoryPackage.eINSTANCE;
	}

} //InterfaceRepositoryFactoryImpl
