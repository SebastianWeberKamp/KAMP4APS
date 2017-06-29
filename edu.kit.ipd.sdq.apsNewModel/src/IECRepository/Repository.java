/**
 */
package IECRepository;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link IECRepository.Repository#getContainsProgram <em>Contains Program</em>}</li>
 *   <li>{@link IECRepository.Repository#getContainsInterface <em>Contains Interface</em>}</li>
 *   <li>{@link IECRepository.Repository#getContainsFunctionBlock <em>Contains Function Block</em>}</li>
 *   <li>{@link IECRepository.Repository#getContainsFunction <em>Contains Function</em>}</li>
 *   <li>{@link IECRepository.Repository#getContainsVariable <em>Contains Variable</em>}</li>
 *   <li>{@link IECRepository.Repository#getName <em>Name</em>}</li>
 *   <li>{@link IECRepository.Repository#getId <em>Id</em>}</li>
 *   <li>{@link IECRepository.Repository#getContainsStaticFunctionblock <em>Contains Static Functionblock</em>}</li>
 *   <li>{@link IECRepository.Repository#getContainsEnum <em>Contains Enum</em>}</li>
 * </ul>
 *
 * @see IECRepository.IECRepositoryPackage#getRepository()
 * @model
 * @generated
 */
public interface Repository extends EObject {
	/**
	 * Returns the value of the '<em><b>Contains Program</b></em>' containment reference list.
	 * The list contents are of type {@link IECRepository.Program}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Program</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Program</em>' containment reference list.
	 * @see IECRepository.IECRepositoryPackage#getRepository_ContainsProgram()
	 * @model containment="true"
	 * @generated
	 */
	EList<Program> getContainsProgram();

	/**
	 * Returns the value of the '<em><b>Contains Interface</b></em>' containment reference list.
	 * The list contents are of type {@link IECRepository.IECInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Interface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Interface</em>' containment reference list.
	 * @see IECRepository.IECRepositoryPackage#getRepository_ContainsInterface()
	 * @model containment="true"
	 * @generated
	 */
	EList<IECInterface> getContainsInterface();

	/**
	 * Returns the value of the '<em><b>Contains Function Block</b></em>' containment reference list.
	 * The list contents are of type {@link IECRepository.FunctionBlock}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Function Block</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Function Block</em>' containment reference list.
	 * @see IECRepository.IECRepositoryPackage#getRepository_ContainsFunctionBlock()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionBlock> getContainsFunctionBlock();

	/**
	 * Returns the value of the '<em><b>Contains Function</b></em>' containment reference list.
	 * The list contents are of type {@link IECRepository.Function}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Function</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Function</em>' containment reference list.
	 * @see IECRepository.IECRepositoryPackage#getRepository_ContainsFunction()
	 * @model containment="true"
	 * @generated
	 */
	EList<Function> getContainsFunction();

	/**
	 * Returns the value of the '<em><b>Contains Variable</b></em>' containment reference list.
	 * The list contents are of type {@link IECRepository.GlobalVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Variable</em>' containment reference list.
	 * @see IECRepository.IECRepositoryPackage#getRepository_ContainsVariable()
	 * @model containment="true"
	 * @generated
	 */
	EList<GlobalVariable> getContainsVariable();

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
	 * @see IECRepository.IECRepositoryPackage#getRepository_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link IECRepository.Repository#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see IECRepository.IECRepositoryPackage#getRepository_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link IECRepository.Repository#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Contains Static Functionblock</b></em>' containment reference list.
	 * The list contents are of type {@link IECRepository.StaticFunctionblock}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Static Functionblock</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Static Functionblock</em>' containment reference list.
	 * @see IECRepository.IECRepositoryPackage#getRepository_ContainsStaticFunctionblock()
	 * @model containment="true"
	 * @generated
	 */
	EList<StaticFunctionblock> getContainsStaticFunctionblock();

	/**
	 * Returns the value of the '<em><b>Contains Enum</b></em>' containment reference list.
	 * The list contents are of type {@link IECRepository.Enum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Enum</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Enum</em>' containment reference list.
	 * @see IECRepository.IECRepositoryPackage#getRepository_ContainsEnum()
	 * @model containment="true"
	 * @generated
	 */
	EList<IECRepository.Enum> getContainsEnum();

} // Repository
