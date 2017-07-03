/**
 */
package edu.kit.ipd.sdq.kamp4aps.iec.IECModel.util;

import edu.kit.ipd.sdq.kamp4aps.iec.IECModel.Function;
import edu.kit.ipd.sdq.kamp4aps.iec.IECModel.FunctionBlock;
import edu.kit.ipd.sdq.kamp4aps.iec.IECModel.GlobalVariable;
import edu.kit.ipd.sdq.kamp4aps.iec.IECModel.IECInterface;
import edu.kit.ipd.sdq.kamp4aps.iec.IECModel.IECMethodImplementation;
import edu.kit.ipd.sdq.kamp4aps.iec.IECModel.IECModelPackage;
import edu.kit.ipd.sdq.kamp4aps.iec.IECModel.IECPropertyImplementation;
import edu.kit.ipd.sdq.kamp4aps.iec.IECModel.IFunctionBlock;
import edu.kit.ipd.sdq.kamp4aps.iec.IECModel.Program;
import edu.kit.ipd.sdq.kamp4aps.iec.IECModel.SPSSystem;
import edu.kit.ipd.sdq.kamp4aps.iec.IECModel.StaticFunctionblock;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECModel.IECModelPackage
 * @generated
 */
public class IECModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IECModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = IECModelPackage.eINSTANCE;
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
	protected IECModelSwitch<Adapter> modelSwitch =
		new IECModelSwitch<Adapter>() {
			@Override
			public Adapter caseFunctionBlock(FunctionBlock object) {
				return createFunctionBlockAdapter();
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
			public Adapter caseSPSSystem(SPSSystem object) {
				return createSPSSystemAdapter();
			}
			@Override
			public Adapter caseIECInterface(IECInterface object) {
				return createIECInterfaceAdapter();
			}
			@Override
			public Adapter caseGlobalVariable(GlobalVariable object) {
				return createGlobalVariableAdapter();
			}
			@Override
			public Adapter caseStaticFunctionblock(StaticFunctionblock object) {
				return createStaticFunctionblockAdapter();
			}
			@Override
			public Adapter caseIFunctionBlock(IFunctionBlock object) {
				return createIFunctionBlockAdapter();
			}
			@Override
			public Adapter caseIECMethodImplementation(IECMethodImplementation object) {
				return createIECMethodImplementationAdapter();
			}
			@Override
			public Adapter caseIECPropertyImplementation(IECPropertyImplementation object) {
				return createIECPropertyImplementationAdapter();
			}
			@Override
			public Adapter caseEnum(edu.kit.ipd.sdq.kamp4aps.iec.IECModel.Enum object) {
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
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECModel.FunctionBlock <em>Function Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECModel.FunctionBlock
	 * @generated
	 */
	public Adapter createFunctionBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECModel.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECModel.Function
	 * @generated
	 */
	public Adapter createFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECModel.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECModel.Program
	 * @generated
	 */
	public Adapter createProgramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECModel.SPSSystem <em>SPS System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECModel.SPSSystem
	 * @generated
	 */
	public Adapter createSPSSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECModel.IECInterface <em>IEC Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECModel.IECInterface
	 * @generated
	 */
	public Adapter createIECInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECModel.GlobalVariable <em>Global Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECModel.GlobalVariable
	 * @generated
	 */
	public Adapter createGlobalVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECModel.StaticFunctionblock <em>Static Functionblock</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECModel.StaticFunctionblock
	 * @generated
	 */
	public Adapter createStaticFunctionblockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECModel.IFunctionBlock <em>IFunction Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECModel.IFunctionBlock
	 * @generated
	 */
	public Adapter createIFunctionBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECModel.IECMethodImplementation <em>IEC Method Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECModel.IECMethodImplementation
	 * @generated
	 */
	public Adapter createIECMethodImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECModel.IECPropertyImplementation <em>IEC Property Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECModel.IECPropertyImplementation
	 * @generated
	 */
	public Adapter createIECPropertyImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECModel.Enum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECModel.Enum
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

} //IECModelAdapterFactory
