/**
 */
package apsNewModel.impl;

import apsNewModel.ApsNewModelFactory;
import apsNewModel.ApsNewModelPackage;
import apsNewModel.Function;
import apsNewModel.FunctionBlock;
import apsNewModel.GlobalVariable;
import apsNewModel.IECInterface;
import apsNewModel.IECMethodImplementation;
import apsNewModel.IECPropertyImplementation;
import apsNewModel.Program;
import apsNewModel.SPSSystem;
import apsNewModel.StaticFunctionblock;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApsNewModelFactoryImpl extends EFactoryImpl implements ApsNewModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApsNewModelFactory init() {
		try {
			ApsNewModelFactory theApsNewModelFactory = (ApsNewModelFactory)EPackage.Registry.INSTANCE.getEFactory(ApsNewModelPackage.eNS_URI);
			if (theApsNewModelFactory != null) {
				return theApsNewModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApsNewModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApsNewModelFactoryImpl() {
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
			case ApsNewModelPackage.FUNCTION_BLOCK: return createFunctionBlock();
			case ApsNewModelPackage.FUNCTION: return createFunction();
			case ApsNewModelPackage.PROGRAM: return createProgram();
			case ApsNewModelPackage.SPS_SYSTEM: return createSPSSystem();
			case ApsNewModelPackage.IEC_INTERFACE: return createIECInterface();
			case ApsNewModelPackage.GLOBAL_VARIABLE: return createGlobalVariable();
			case ApsNewModelPackage.STATIC_FUNCTIONBLOCK: return createStaticFunctionblock();
			case ApsNewModelPackage.IEC_METHOD_IMPLEMENTATION: return createIECMethodImplementation();
			case ApsNewModelPackage.IEC_PROPERTY_IMPLEMENTATION: return createIECPropertyImplementation();
			case ApsNewModelPackage.ENUM: return createEnum();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBlock createFunctionBlock() {
		FunctionBlockImpl functionBlock = new FunctionBlockImpl();
		return functionBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Program createProgram() {
		ProgramImpl program = new ProgramImpl();
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPSSystem createSPSSystem() {
		SPSSystemImpl spsSystem = new SPSSystemImpl();
		return spsSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECInterface createIECInterface() {
		IECInterfaceImpl iecInterface = new IECInterfaceImpl();
		return iecInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVariable createGlobalVariable() {
		GlobalVariableImpl globalVariable = new GlobalVariableImpl();
		return globalVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticFunctionblock createStaticFunctionblock() {
		StaticFunctionblockImpl staticFunctionblock = new StaticFunctionblockImpl();
		return staticFunctionblock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECMethodImplementation createIECMethodImplementation() {
		IECMethodImplementationImpl iecMethodImplementation = new IECMethodImplementationImpl();
		return iecMethodImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECPropertyImplementation createIECPropertyImplementation() {
		IECPropertyImplementationImpl iecPropertyImplementation = new IECPropertyImplementationImpl();
		return iecPropertyImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public apsNewModel.Enum createEnum() {
		EnumImpl enum_ = new EnumImpl();
		return enum_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApsNewModelPackage getApsNewModelPackage() {
		return (ApsNewModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApsNewModelPackage getPackage() {
		return ApsNewModelPackage.eINSTANCE;
	}

} //ApsNewModelFactoryImpl
