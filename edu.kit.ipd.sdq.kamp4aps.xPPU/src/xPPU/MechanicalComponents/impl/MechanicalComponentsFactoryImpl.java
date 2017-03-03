/**
 */
package xPPU.MechanicalComponents.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import xPPU.MechanicalComponents.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MechanicalComponentsFactoryImpl extends EFactoryImpl implements MechanicalComponentsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MechanicalComponentsFactory init() {
		try {
			MechanicalComponentsFactory theMechanicalComponentsFactory = (MechanicalComponentsFactory)EPackage.Registry.INSTANCE.getEFactory(MechanicalComponentsPackage.eNS_URI);
			if (theMechanicalComponentsFactory != null) {
				return theMechanicalComponentsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MechanicalComponentsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MechanicalComponentsFactoryImpl() {
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
			case MechanicalComponentsPackage.HOUSING: return createHousing();
			case MechanicalComponentsPackage.RETURN_SPRING: return createReturnSpring();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Housing createHousing() {
		HousingImpl housing = new HousingImpl();
		return housing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnSpring createReturnSpring() {
		ReturnSpringImpl returnSpring = new ReturnSpringImpl();
		return returnSpring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MechanicalComponentsPackage getMechanicalComponentsPackage() {
		return (MechanicalComponentsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MechanicalComponentsPackage getPackage() {
		return MechanicalComponentsPackage.eINSTANCE;
	}

} //MechanicalComponentsFactoryImpl
