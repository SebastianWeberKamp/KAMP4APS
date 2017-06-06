/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.util;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractChangePropagationStep;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModificationRepository;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractSeedModifications;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.*;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import xPPU.ComponentRepository.Component;
import xPPU.InterfaceRepository.Interface;
import xPPU.ModuleRepository.Module;
import xPPU.StructureRepository.Structure;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.modificationmarksPackage
 * @generated
 */
public class modificationmarksAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static modificationmarksPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public modificationmarksAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = modificationmarksPackage.eINSTANCE;
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
	protected modificationmarksSwitch<Adapter> modelSwitch =
		new modificationmarksSwitch<Adapter>() {
			@Override
			public <T extends KAPSSeedModifications> Adapter caseAbstractKAPSModificationRepository(AbstractKAPSModificationRepository<T> object) {
				return createAbstractKAPSModificationRepositoryAdapter();
			}
			@Override
			public Adapter caseKAPSModificationRepository(KAPSModificationRepository object) {
				return createKAPSModificationRepositoryAdapter();
			}
			@Override
			public Adapter caseKAPSSeedModifications(KAPSSeedModifications object) {
				return createKAPSSeedModificationsAdapter();
			}
			@Override
			public Adapter caseChangePropagationDueToHardwareChange(ChangePropagationDueToHardwareChange object) {
				return createChangePropagationDueToHardwareChangeAdapter();
			}
			@Override
			public <T extends Component> Adapter caseModifyComponent(ModifyComponent<T> object) {
				return createModifyComponentAdapter();
			}
			@Override
			public <T extends Module> Adapter caseModifyModule(ModifyModule<T> object) {
				return createModifyModuleAdapter();
			}
			@Override
			public <T extends Structure> Adapter caseModifyStructure(ModifyStructure<T> object) {
				return createModifyStructureAdapter();
			}
			@Override
			public <T extends Interface> Adapter caseModifyInterface(ModifyInterface<T> object) {
				return createModifyInterfaceAdapter();
			}
			@Override
			public Adapter caseModifyPowerSupply(ModifyPowerSupply object) {
				return createModifyPowerSupplyAdapter();
			}
			@Override
			public Adapter caseModifySignalinterface(ModifySignalinterface object) {
				return createModifySignalinterfaceAdapter();
			}
			@Override
			public Adapter caseModifyPhysicalConnection(ModifyPhysicalConnection object) {
				return createModifyPhysicalConnectionAdapter();
			}
			@Override
			public Adapter caseModifyMicroSwitchModule(ModifyMicroSwitchModule object) {
				return createModifyMicroSwitchModuleAdapter();
			}
			@Override
			public Adapter caseModifyBusBox(ModifyBusBox object) {
				return createModifyBusBoxAdapter();
			}
			@Override
			public Adapter caseModifyBusMaster(ModifyBusMaster object) {
				return createModifyBusMasterAdapter();
			}
			@Override
			public Adapter caseModifyBusSlave(ModifyBusSlave object) {
				return createModifyBusSlaveAdapter();
			}
			@Override
			public Adapter caseModifyBusCable(ModifyBusCable object) {
				return createModifyBusCableAdapter();
			}
			@Override
			public Adapter caseModifySensor(ModifySensor object) {
				return createModifySensorAdapter();
			}
			@Override
			public <S extends AbstractSeedModifications, T extends AbstractChangePropagationStep> Adapter caseAbstractModificationRepository(AbstractModificationRepository<S, T> object) {
				return createAbstractModificationRepositoryAdapter();
			}
			@Override
			public Adapter caseAbstractSeedModifications(AbstractSeedModifications object) {
				return createAbstractSeedModificationsAdapter();
			}
			@Override
			public Adapter caseAbstractChangePropagationStep(AbstractChangePropagationStep object) {
				return createAbstractChangePropagationStepAdapter();
			}
			@Override
			public Adapter caseChangePropagationStep(ChangePropagationStep object) {
				return createChangePropagationStepAdapter();
			}
			@Override
			public <S, T> Adapter caseAbstractModification(AbstractModification<S, T> object) {
				return createAbstractModificationAdapter();
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
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.AbstractKAPSModificationRepository <em>Abstract KAPS Modification Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.AbstractKAPSModificationRepository
	 * @generated
	 */
	public Adapter createAbstractKAPSModificationRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.KAPSModificationRepository <em>KAPS Modification Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.KAPSModificationRepository
	 * @generated
	 */
	public Adapter createKAPSModificationRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.KAPSSeedModifications <em>KAPS Seed Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.KAPSSeedModifications
	 * @generated
	 */
	public Adapter createKAPSSeedModificationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifySensor <em>Modify Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifySensor
	 * @generated
	 */
	public Adapter createModifySensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ChangePropagationDueToHardwareChange <em>Change Propagation Due To Hardware Change</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ChangePropagationDueToHardwareChange
	 * @generated
	 */
	public Adapter createChangePropagationDueToHardwareChangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyComponent <em>Modify Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyComponent
	 * @generated
	 */
	public Adapter createModifyComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyModule <em>Modify Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyModule
	 * @generated
	 */
	public Adapter createModifyModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyStructure <em>Modify Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyStructure
	 * @generated
	 */
	public Adapter createModifyStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyInterface <em>Modify Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyInterface
	 * @generated
	 */
	public Adapter createModifyInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep <em>Change Propagation Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep
	 * @generated
	 */
	public Adapter createChangePropagationStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification <em>Abstract Modification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification
	 * @generated
	 */
	public Adapter createAbstractModificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyBusBox <em>Modify Bus Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyBusBox
	 * @generated
	 */
	public Adapter createModifyBusBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyPowerSupply <em>Modify Power Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyPowerSupply
	 * @generated
	 */
	public Adapter createModifyPowerSupplyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifySignalinterface <em>Modify Signalinterface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifySignalinterface
	 * @generated
	 */
	public Adapter createModifySignalinterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyPhysicalConnection <em>Modify Physical Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyPhysicalConnection
	 * @generated
	 */
	public Adapter createModifyPhysicalConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyMicroSwitchModule <em>Modify Micro Switch Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyMicroSwitchModule
	 * @generated
	 */
	public Adapter createModifyMicroSwitchModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyBusMaster <em>Modify Bus Master</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyBusMaster
	 * @generated
	 */
	public Adapter createModifyBusMasterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyBusSlave <em>Modify Bus Slave</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyBusSlave
	 * @generated
	 */
	public Adapter createModifyBusSlaveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyBusCable <em>Modify Bus Cable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyBusCable
	 * @generated
	 */
	public Adapter createModifyBusCableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractChangePropagationStep <em>Abstract Change Propagation Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractChangePropagationStep
	 * @generated
	 */
	public Adapter createAbstractChangePropagationStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModificationRepository <em>Abstract Modification Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModificationRepository
	 * @generated
	 */
	public Adapter createAbstractModificationRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractSeedModifications <em>Abstract Seed Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractSeedModifications
	 * @generated
	 */
	public Adapter createAbstractSeedModificationsAdapter() {
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

} //modificationmarksAdapterFactory
