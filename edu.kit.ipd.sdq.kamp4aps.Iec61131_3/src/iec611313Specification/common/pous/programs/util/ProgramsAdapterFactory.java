/**
 */
package iec611313Specification.common.pous.programs.util;

import iec611313Specification.common.pous.programs.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see iec611313Specification.common.pous.programs.ProgramsPackage
 * @generated
 */
public class ProgramsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProgramsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ProgramsPackage.eINSTANCE;
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
	protected ProgramsSwitch<Adapter> modelSwitch =
		new ProgramsSwitch<Adapter>() {
			@Override
			public Adapter caseFunctionBlockInstanceTaskAssignment(FunctionBlockInstanceTaskAssignment object) {
				return createFunctionBlockInstanceTaskAssignmentAdapter();
			}
			@Override
			public Adapter caseProgramConfigElement(ProgramConfigElement object) {
				return createProgramConfigElementAdapter();
			}
			@Override
			public Adapter caseProgramConfiguration(ProgramConfiguration object) {
				return createProgramConfigurationAdapter();
			}
			@Override
			public Adapter caseProgramType(ProgramType object) {
				return createProgramTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link iec611313Specification.common.pous.programs.FunctionBlockInstanceTaskAssignment <em>Function Block Instance Task Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.common.pous.programs.FunctionBlockInstanceTaskAssignment
	 * @generated
	 */
	public Adapter createFunctionBlockInstanceTaskAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.common.pous.programs.ProgramConfigElement <em>Program Config Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.common.pous.programs.ProgramConfigElement
	 * @generated
	 */
	public Adapter createProgramConfigElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.common.pous.programs.ProgramConfiguration <em>Program Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.common.pous.programs.ProgramConfiguration
	 * @generated
	 */
	public Adapter createProgramConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iec611313Specification.common.pous.programs.ProgramType <em>Program Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iec611313Specification.common.pous.programs.ProgramType
	 * @generated
	 */
	public Adapter createProgramTypeAdapter() {
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

} //ProgramsAdapterFactory
