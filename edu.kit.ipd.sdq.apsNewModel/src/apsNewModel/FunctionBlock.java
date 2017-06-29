/**
 */
package apsNewModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apsNewModel.FunctionBlock#getId <em>Id</em>}</li>
 *   <li>{@link apsNewModel.FunctionBlock#getName <em>Name</em>}</li>
 *   <li>{@link apsNewModel.FunctionBlock#getType <em>Type</em>}</li>
 *   <li>{@link apsNewModel.FunctionBlock#getAccessesProperty <em>Accesses Property</em>}</li>
 *   <li>{@link apsNewModel.FunctionBlock#getHasMethod <em>Has Method</em>}</li>
 *   <li>{@link apsNewModel.FunctionBlock#getHasProperty <em>Has Property</em>}</li>
 * </ul>
 *
 * @see apsNewModel.ApsNewModelPackage#getFunctionBlock()
 * @model
 * @generated
 */
public interface FunctionBlock extends EObject {
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
	 * @see apsNewModel.ApsNewModelPackage#getFunctionBlock_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link apsNewModel.FunctionBlock#getId <em>Id</em>}' attribute.
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
	 * @see apsNewModel.ApsNewModelPackage#getFunctionBlock_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link apsNewModel.FunctionBlock#getName <em>Name</em>}' attribute.
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
	 * @see #setType(IECRepository.FunctionBlock)
	 * @see apsNewModel.ApsNewModelPackage#getFunctionBlock_Type()
	 * @model required="true"
	 * @generated
	 */
	IECRepository.FunctionBlock getType();

	/**
	 * Sets the value of the '{@link apsNewModel.FunctionBlock#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(IECRepository.FunctionBlock value);

	/**
	 * Returns the value of the '<em><b>Accesses Property</b></em>' reference list.
	 * The list contents are of type {@link apsNewModel.IECPropertyImplementation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accesses Property</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accesses Property</em>' reference list.
	 * @see apsNewModel.ApsNewModelPackage#getFunctionBlock_AccessesProperty()
	 * @model
	 * @generated
	 */
	EList<IECPropertyImplementation> getAccessesProperty();

	/**
	 * Returns the value of the '<em><b>Has Method</b></em>' containment reference list.
	 * The list contents are of type {@link apsNewModel.IECMethodImplementation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Method</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Method</em>' containment reference list.
	 * @see apsNewModel.ApsNewModelPackage#getFunctionBlock_HasMethod()
	 * @model containment="true"
	 * @generated
	 */
	EList<IECMethodImplementation> getHasMethod();

	/**
	 * Returns the value of the '<em><b>Has Property</b></em>' containment reference list.
	 * The list contents are of type {@link apsNewModel.IECPropertyImplementation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Property</em>' containment reference list.
	 * @see apsNewModel.ApsNewModelPackage#getFunctionBlock_HasProperty()
	 * @model containment="true"
	 * @generated
	 */
	EList<IECPropertyImplementation> getHasProperty();

} // FunctionBlock
