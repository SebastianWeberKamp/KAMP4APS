/**
 */
package edu.kit.ipd.sdq.kamp4aps.iec.IECRepository;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.FunctionBlock#getId <em>Id</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.FunctionBlock#getName <em>Name</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.FunctionBlock#getHasIecMethod <em>Has Iec Method</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.FunctionBlock#getHasIecProperty <em>Has Iec Property</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.FunctionBlock#getAccessesVariable <em>Accesses Variable</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.FunctionBlock#getUsesFunctionBlock <em>Uses Function Block</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.FunctionBlock#getCallsFunction <em>Calls Function</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.FunctionBlock#getImplements <em>Implements</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.FunctionBlock#getUsesEnum <em>Uses Enum</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECRepositoryPackage#getFunctionBlock()
 * @model
 * @generated
 */
public interface FunctionBlock extends IFunctionblock {
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
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECRepositoryPackage#getFunctionBlock_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.FunctionBlock#getId <em>Id</em>}' attribute.
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
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECRepositoryPackage#getFunctionBlock_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.FunctionBlock#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Has Iec Method</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECMethodImplementation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Iec Method</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Iec Method</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECRepositoryPackage#getFunctionBlock_HasIecMethod()
	 * @model containment="true"
	 * @generated
	 */
	EList<IECMethodImplementation> getHasIecMethod();

	/**
	 * Returns the value of the '<em><b>Has Iec Property</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECPropertyImplementation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Iec Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Iec Property</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECRepositoryPackage#getFunctionBlock_HasIecProperty()
	 * @model containment="true"
	 * @generated
	 */
	EList<IECPropertyImplementation> getHasIecProperty();

	/**
	 * Returns the value of the '<em><b>Accesses Variable</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.GlobalVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accesses Variable</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accesses Variable</em>' reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECRepositoryPackage#getFunctionBlock_AccessesVariable()
	 * @model
	 * @generated
	 */
	EList<GlobalVariable> getAccessesVariable();

	/**
	 * Returns the value of the '<em><b>Uses Function Block</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IFunctionblock}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses Function Block</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Function Block</em>' reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECRepositoryPackage#getFunctionBlock_UsesFunctionBlock()
	 * @model
	 * @generated
	 */
	EList<IFunctionblock> getUsesFunctionBlock();

	/**
	 * Returns the value of the '<em><b>Calls Function</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Function}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calls Function</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calls Function</em>' reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECRepositoryPackage#getFunctionBlock_CallsFunction()
	 * @model
	 * @generated
	 */
	EList<Function> getCallsFunction();

	/**
	 * Returns the value of the '<em><b>Implements</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements</em>' reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECRepositoryPackage#getFunctionBlock_Implements()
	 * @model
	 * @generated
	 */
	EList<IECInterface> getImplements();

	/**
	 * Returns the value of the '<em><b>Uses Enum</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Enum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses Enum</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Enum</em>' reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.IECRepositoryPackage#getFunctionBlock_UsesEnum()
	 * @model
	 * @generated
	 */
	EList<edu.kit.ipd.sdq.kamp4aps.iec.IECRepository.Enum> getUsesEnum();

} // FunctionBlock
