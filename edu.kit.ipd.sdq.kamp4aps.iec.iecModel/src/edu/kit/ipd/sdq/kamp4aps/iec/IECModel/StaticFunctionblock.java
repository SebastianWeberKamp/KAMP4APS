/**
 */
package edu.kit.ipd.sdq.kamp4aps.iec.IECModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static Functionblock</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.iec.IECModel.StaticFunctionblock#getId <em>Id</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.iec.IECModel.StaticFunctionblock#getName <em>Name</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.iec.IECModel.StaticFunctionblock#getType <em>Type</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.iec.IECModel.StaticFunctionblock#getAccessesGlobalVariable <em>Accesses Global Variable</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.iec.IECModel.StaticFunctionblock#getHasMethod <em>Has Method</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.iec.IECModel.StaticFunctionblock#getHasProperty <em>Has Property</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECModel.IECModelPackage#getStaticFunctionblock()
 * @model
 * @generated
 */
public interface StaticFunctionblock extends IFunctionBlock {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECModel.IECModelPackage#getStaticFunctionblock_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECModel.StaticFunctionblock#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECModel.IECModelPackage#getStaticFunctionblock_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECModel.StaticFunctionblock#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(StaticFunctionblock)
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECModel.IECModelPackage#getStaticFunctionblock_Type()
	 * @model required="true"
	 * @generated
	 */
	StaticFunctionblock getType();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECModel.StaticFunctionblock#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(StaticFunctionblock value);

	/**
	 * Returns the value of the '<em><b>Accesses Global Variable</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.iec.IECModel.GlobalVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accesses Global Variable</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accesses Global Variable</em>' reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECModel.IECModelPackage#getStaticFunctionblock_AccessesGlobalVariable()
	 * @model
	 * @generated
	 */
	EList<GlobalVariable> getAccessesGlobalVariable();

	/**
	 * Returns the value of the '<em><b>Has Method</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.iec.IECModel.IECMethodImplementation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Method</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Method</em>' reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECModel.IECModelPackage#getStaticFunctionblock_HasMethod()
	 * @model
	 * @generated
	 */
	EList<IECMethodImplementation> getHasMethod();

	/**
	 * Returns the value of the '<em><b>Has Property</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.iec.IECModel.IECPropertyImplementation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Property</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Property</em>' reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECModel.IECModelPackage#getStaticFunctionblock_HasProperty()
	 * @model
	 * @generated
	 */
	EList<IECPropertyImplementation> getHasProperty();

} // StaticFunctionblock
