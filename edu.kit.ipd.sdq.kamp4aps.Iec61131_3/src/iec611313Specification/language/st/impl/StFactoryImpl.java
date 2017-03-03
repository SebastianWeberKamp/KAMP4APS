/**
 */
package iec611313Specification.language.st.impl;

import iec611313Specification.language.st.*;

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
public class StFactoryImpl extends EFactoryImpl implements StFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StFactory init() {
		try {
			StFactory theStFactory = (StFactory)EPackage.Registry.INSTANCE.getEFactory(StPackage.eNS_URI);
			if (theStFactory != null) {
				return theStFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StFactoryImpl() {
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
			case StPackage.CASE: return createCase();
			case StPackage.CASE_ELEMENT: return createCaseElement();
			case StPackage.EXIT: return createExit();
			case StPackage.FOR: return createFor();
			case StPackage.IF: return createIf();
			case StPackage.NIL_VALUE: return createNilValue();
			case StPackage.REPEAT: return createRepeat();
			case StPackage.RETURN: return createReturn();
			case StPackage.STATEMENT_LIST: return createStatementList();
			case StPackage.WHILE: return createWhile();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Case createCase() {
		CaseImpl case_ = new CaseImpl();
		return case_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaseElement createCaseElement() {
		CaseElementImpl caseElement = new CaseElementImpl();
		return caseElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exit createExit() {
		ExitImpl exit = new ExitImpl();
		return exit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public For createFor() {
		ForImpl for_ = new ForImpl();
		return for_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public If createIf() {
		IfImpl if_ = new IfImpl();
		return if_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NilValue createNilValue() {
		NilValueImpl nilValue = new NilValueImpl();
		return nilValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repeat createRepeat() {
		RepeatImpl repeat = new RepeatImpl();
		return repeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Return createReturn() {
		ReturnImpl return_ = new ReturnImpl();
		return return_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementList createStatementList() {
		StatementListImpl statementList = new StatementListImpl();
		return statementList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public While createWhile() {
		WhileImpl while_ = new WhileImpl();
		return while_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StPackage getStPackage() {
		return (StPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StPackage getPackage() {
		return StPackage.eINSTANCE;
	}

} //StFactoryImpl
