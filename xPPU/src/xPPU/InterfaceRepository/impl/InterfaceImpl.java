/**
 */
package xPPU.InterfaceRepository.impl;

import org.eclipse.emf.ecore.EClass;

import xPPU.Identifier.impl.IdentifierImpl;

import xPPU.InterfaceRepository.Interface;
import xPPU.InterfaceRepository.InterfaceRepositoryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class InterfaceImpl extends IdentifierImpl implements Interface {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InterfaceRepositoryPackage.Literals.INTERFACE;
	}

} //InterfaceImpl
