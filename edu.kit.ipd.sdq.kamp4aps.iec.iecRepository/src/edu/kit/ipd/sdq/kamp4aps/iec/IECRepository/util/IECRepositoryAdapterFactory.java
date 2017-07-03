/**
 */
package edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.util;

import edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Function;
import edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.FunctionBlock;
import edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.GlobalVariable;
import edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECInterface;
import edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECMethod;
import edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECMethodImplementation;
import edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECProperty;
import edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECPropertyImplementation;
import edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECRepositoryPackage;
import edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IFunctionblock;
import edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IResource;
import edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Program;
import edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Repository;
import edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.StaticFunctionblock;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECRepositoryPackage
 * @generated
 */
public class IECRepositoryAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IECRepositoryPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECRepositoryAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = IECRepositoryPackage.eINSTANCE;
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
	protected IECRepositorySwitch<Adapter> modelSwitch =
		new IECRepositorySwitch<Adapter>() {
			@Override
			public Adapter caseFunctionBlock(FunctionBlock object) {
				return createFunctionBlockAdapter();
			}
			@Override
			public Adapter caseGlobalVariable(GlobalVariable object) {
				return createGlobalVariableAdapter();
			}
			@Override
			public Adapter caseIECInterface(IECInterface object) {
				return createIECInterfaceAdapter();
			}
			@Override
			public Adapter caseIECMethodImplementation(IECMethodImplementation object) {
				return createIECMethodImplementationAdapter();
			}
			@Override
			public Adapter caseFunction(Function object) {
				return createFunctionAdapter();
			}
			@Override
			public Adapter caseProgram(Program object) {
				return createProgramAdapter();
			}
			@Override
			public Adapter caseRepository(Repository object) {
				return createRepositoryAdapter();
			}
			@Override
			public Adapter caseIECPropertyImplementation(IECPropertyImplementation object) {
				return createIECPropertyImplementationAdapter();
			}
			@Override
			public Adapter caseIECProperty(IECProperty object) {
				return createIECPropertyAdapter();
			}
			@Override
			public Adapter caseIECMethod(IECMethod object) {
				return createIECMethodAdapter();
			}
			@Override
			public Adapter caseIFunctionblock(IFunctionblock object) {
				return createIFunctionblockAdapter();
			}
			@Override
			public Adapter caseStaticFunctionblock(StaticFunctionblock object) {
				return createStaticFunctionblockAdapter();
			}
			@Override
			public Adapter caseIResource(IResource object) {
				return createIResourceAdapter();
			}
			@Override
			public Adapter caseEnum(edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Enum object) {
				return createEnumAdapter();
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
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.FunctionBlock <em>Function Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.FunctionBlock
	 * @generated
	 */
	public Adapter createFunctionBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.GlobalVariable <em>Global Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.GlobalVariable
	 * @generated
	 */
	public Adapter createGlobalVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECInterface <em>IEC Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECInterface
	 * @generated
	 */
	public Adapter createIECInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECMethodImplementation <em>IEC Method Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECMethodImplementation
	 * @generated
	 */
	public Adapter createIECMethodImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Function
	 * @generated
	 */
	public Adapter createFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Program
	 * @generated
	 */
	public Adapter createProgramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Repository
	 * @generated
	 */
	public Adapter createRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECPropertyImplementation <em>IEC Property Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECPropertyImplementation
	 * @generated
	 */
	public Adapter createIECPropertyImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECProperty <em>IEC Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECProperty
	 * @generated
	 */
	public Adapter createIECPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECMethod <em>IEC Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECMethod
	 * @generated
	 */
	public Adapter createIECMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IFunctionblock <em>IFunctionblock</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IFunctionblock
	 * @generated
	 */
	public Adapter createIFunctionblockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.StaticFunctionblock <em>Static Functionblock</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.StaticFunctionblock
	 * @generated
	 */
	public Adapter createStaticFunctionblockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IResource <em>IResource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IResource
	 * @generated
	 */
	public Adapter createIResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Enum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Enum
	 * @generated
	 */
	public Adapter createEnumAdapter() {
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

} //IECRepositoryAdapterFactory
