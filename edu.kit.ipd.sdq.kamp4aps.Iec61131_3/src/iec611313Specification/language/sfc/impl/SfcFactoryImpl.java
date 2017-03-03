/**
 */
package iec611313Specification.language.sfc.impl;

import iec611313Specification.language.sfc.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class SfcFactoryImpl extends EFactoryImpl implements SfcFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SfcFactory init() {
		try {
			SfcFactory theSfcFactory = (SfcFactory)EPackage.Registry.INSTANCE.getEFactory(SfcPackage.eNS_URI);
			if (theSfcFactory != null) {
				return theSfcFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SfcFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SfcFactoryImpl() {
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
			case SfcPackage.ACTION: return createAction();
			case SfcPackage.ACTION_ASSOCIATION: return createActionAssociation();
			case SfcPackage.SEQUENTIAL_FUNCTION_CHART: return createSequentialFunctionChart();
			case SfcPackage.SIMPLE_ACTION_QUALIFIER: return createSimpleActionQualifier();
			case SfcPackage.SIMPLE_QUALIFIER: return createSimpleQualifier();
			case SfcPackage.STEP: return createStep();
			case SfcPackage.TIMED_ACTION_QUALIFIER: return createTimedActionQualifier();
			case SfcPackage.TRANSITION: return createTransition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SfcPackage.TIMED_QUALIFIER:
				return createTimedQualifierFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SfcPackage.TIMED_QUALIFIER:
				return convertTimedQualifierToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionAssociation createActionAssociation() {
		ActionAssociationImpl actionAssociation = new ActionAssociationImpl();
		return actionAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequentialFunctionChart createSequentialFunctionChart() {
		SequentialFunctionChartImpl sequentialFunctionChart = new SequentialFunctionChartImpl();
		return sequentialFunctionChart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleActionQualifier createSimpleActionQualifier() {
		SimpleActionQualifierImpl simpleActionQualifier = new SimpleActionQualifierImpl();
		return simpleActionQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQualifier createSimpleQualifier() {
		SimpleQualifierImpl simpleQualifier = new SimpleQualifierImpl();
		return simpleQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step createStep() {
		StepImpl step = new StepImpl();
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedActionQualifier createTimedActionQualifier() {
		TimedActionQualifierImpl timedActionQualifier = new TimedActionQualifierImpl();
		return timedActionQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedQualifier createTimedQualifierFromString(EDataType eDataType, String initialValue) {
		TimedQualifier result = TimedQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimedQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SfcPackage getSfcPackage() {
		return (SfcPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SfcPackage getPackage() {
		return SfcPackage.eINSTANCE;
	}

} //SfcFactoryImpl
