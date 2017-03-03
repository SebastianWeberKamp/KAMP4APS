/**
 */
package iec611313Specification.language.ld.impl;

import iec611313Specification.language.ld.*;

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
public class LdFactoryImpl extends EFactoryImpl implements LdFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LdFactory init() {
		try {
			LdFactory theLdFactory = (LdFactory)EPackage.Registry.INSTANCE.getEFactory(LdPackage.eNS_URI);
			if (theLdFactory != null) {
				return theLdFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LdFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LdFactoryImpl() {
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
			case LdPackage.COIL: return createCoil();
			case LdPackage.CONTACT: return createContact();
			case LdPackage.LADDER_DIAGRAM: return createLadderDiagram();
			case LdPackage.LADDER_NETWORK: return createLadderNetwork();
			case LdPackage.POWER_FLOW_LINE: return createPowerFlowLine();
			case LdPackage.POWER_RAIL: return createPowerRail();
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
			case LdPackage.CONTACT_TYPE:
				return createContactTypeFromString(eDataType, initialValue);
			case LdPackage.COIL_TYPE:
				return createCoilTypeFromString(eDataType, initialValue);
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
			case LdPackage.CONTACT_TYPE:
				return convertContactTypeToString(eDataType, instanceValue);
			case LdPackage.COIL_TYPE:
				return convertCoilTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coil createCoil() {
		CoilImpl coil = new CoilImpl();
		return coil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contact createContact() {
		ContactImpl contact = new ContactImpl();
		return contact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LadderDiagram createLadderDiagram() {
		LadderDiagramImpl ladderDiagram = new LadderDiagramImpl();
		return ladderDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LadderNetwork createLadderNetwork() {
		LadderNetworkImpl ladderNetwork = new LadderNetworkImpl();
		return ladderNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerFlowLine createPowerFlowLine() {
		PowerFlowLineImpl powerFlowLine = new PowerFlowLineImpl();
		return powerFlowLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerRail createPowerRail() {
		PowerRailImpl powerRail = new PowerRailImpl();
		return powerRail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactType createContactTypeFromString(EDataType eDataType, String initialValue) {
		ContactType result = ContactType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContactTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoilType createCoilTypeFromString(EDataType eDataType, String initialValue) {
		CoilType result = CoilType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCoilTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LdPackage getLdPackage() {
		return (LdPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LdPackage getPackage() {
		return LdPackage.eINSTANCE;
	}

} //LdFactoryImpl
