/**
 */
package IECRepository;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IEC Property Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link IECRepository.IECPropertyImplementation#getId <em>Id</em>}</li>
 *   <li>{@link IECRepository.IECPropertyImplementation#getName <em>Name</em>}</li>
 *   <li>{@link IECRepository.IECPropertyImplementation#getImplements <em>Implements</em>}</li>
 *   <li>{@link IECRepository.IECPropertyImplementation#getAccessesVariable <em>Accesses Variable</em>}</li>
 *   <li>{@link IECRepository.IECPropertyImplementation#getUsesEnum <em>Uses Enum</em>}</li>
 * </ul>
 *
 * @see IECRepository.IECRepositoryPackage#getIECPropertyImplementation()
 * @model
 * @generated
 */
public interface IECPropertyImplementation extends IResource {
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
	 * @see IECRepository.IECRepositoryPackage#getIECPropertyImplementation_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link IECRepository.IECPropertyImplementation#getId <em>Id</em>}' attribute.
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
	 * @see IECRepository.IECRepositoryPackage#getIECPropertyImplementation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link IECRepository.IECPropertyImplementation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Implements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements</em>' reference.
	 * @see #setImplements(IECProperty)
	 * @see IECRepository.IECRepositoryPackage#getIECPropertyImplementation_Implements()
	 * @model
	 * @generated
	 */
	IECProperty getImplements();

	/**
	 * Sets the value of the '{@link IECRepository.IECPropertyImplementation#getImplements <em>Implements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implements</em>' reference.
	 * @see #getImplements()
	 * @generated
	 */
	void setImplements(IECProperty value);

	/**
	 * Returns the value of the '<em><b>Accesses Variable</b></em>' reference list.
	 * The list contents are of type {@link IECRepository.GlobalVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accesses Variable</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accesses Variable</em>' reference list.
	 * @see IECRepository.IECRepositoryPackage#getIECPropertyImplementation_AccessesVariable()
	 * @model
	 * @generated
	 */
	EList<GlobalVariable> getAccessesVariable();

	/**
	 * Returns the value of the '<em><b>Uses Enum</b></em>' reference list.
	 * The list contents are of type {@link IECRepository.Enum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses Enum</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Enum</em>' reference list.
	 * @see IECRepository.IECRepositoryPackage#getIECPropertyImplementation_UsesEnum()
	 * @model
	 * @generated
	 */
	EList<IECRepository.Enum> getUsesEnum();

} // IECPropertyImplementation
