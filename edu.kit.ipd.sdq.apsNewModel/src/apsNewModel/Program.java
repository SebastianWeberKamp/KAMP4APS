/**
 */
package apsNewModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apsNewModel.Program#getCallsFunction <em>Calls Function</em>}</li>
 *   <li>{@link apsNewModel.Program#getCallsFunctionBlock <em>Calls Function Block</em>}</li>
 *   <li>{@link apsNewModel.Program#getName <em>Name</em>}</li>
 *   <li>{@link apsNewModel.Program#getId <em>Id</em>}</li>
 *   <li>{@link apsNewModel.Program#getType <em>Type</em>}</li>
 *   <li>{@link apsNewModel.Program#getImplementsInterface <em>Implements Interface</em>}</li>
 *   <li>{@link apsNewModel.Program#getDeclaresVariable <em>Declares Variable</em>}</li>
 *   <li>{@link apsNewModel.Program#getUsesEnum <em>Uses Enum</em>}</li>
 *   <li>{@link apsNewModel.Program#getAccessesProperty <em>Accesses Property</em>}</li>
 *   <li>{@link apsNewModel.Program#getCallsMethod <em>Calls Method</em>}</li>
 * </ul>
 *
 * @see apsNewModel.ApsNewModelPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject {
	/**
	 * Returns the value of the '<em><b>Calls Function</b></em>' containment reference list.
	 * The list contents are of type {@link apsNewModel.Function}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calls Function</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calls Function</em>' containment reference list.
	 * @see apsNewModel.ApsNewModelPackage#getProgram_CallsFunction()
	 * @model containment="true"
	 * @generated
	 */
	EList<Function> getCallsFunction();

	/**
	 * Returns the value of the '<em><b>Calls Function Block</b></em>' containment reference list.
	 * The list contents are of type {@link apsNewModel.FunctionBlock}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calls Function Block</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calls Function Block</em>' containment reference list.
	 * @see apsNewModel.ApsNewModelPackage#getProgram_CallsFunctionBlock()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionBlock> getCallsFunctionBlock();

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
	 * @see apsNewModel.ApsNewModelPackage#getProgram_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link apsNewModel.Program#getName <em>Name</em>}' attribute.
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
	 * @see apsNewModel.ApsNewModelPackage#getProgram_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link apsNewModel.Program#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(IECRepository.Program)
	 * @see apsNewModel.ApsNewModelPackage#getProgram_Type()
	 * @model required="true"
	 * @generated
	 */
	IECRepository.Program getType();

	/**
	 * Sets the value of the '{@link apsNewModel.Program#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(IECRepository.Program value);

	/**
	 * Returns the value of the '<em><b>Implements Interface</b></em>' containment reference list.
	 * The list contents are of type {@link apsNewModel.IECInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements Interface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements Interface</em>' containment reference list.
	 * @see apsNewModel.ApsNewModelPackage#getProgram_ImplementsInterface()
	 * @model containment="true"
	 * @generated
	 */
	EList<IECInterface> getImplementsInterface();

	/**
	 * Returns the value of the '<em><b>Declares Variable</b></em>' containment reference list.
	 * The list contents are of type {@link apsNewModel.GlobalVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declares Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declares Variable</em>' containment reference list.
	 * @see apsNewModel.ApsNewModelPackage#getProgram_DeclaresVariable()
	 * @model containment="true"
	 * @generated
	 */
	EList<GlobalVariable> getDeclaresVariable();

	/**
	 * Returns the value of the '<em><b>Uses Enum</b></em>' containment reference list.
	 * The list contents are of type {@link apsNewModel.Enum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses Enum</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Enum</em>' containment reference list.
	 * @see apsNewModel.ApsNewModelPackage#getProgram_UsesEnum()
	 * @model containment="true"
	 * @generated
	 */
	EList<apsNewModel.Enum> getUsesEnum();

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
	 * @see apsNewModel.ApsNewModelPackage#getProgram_AccessesProperty()
	 * @model
	 * @generated
	 */
	EList<IECPropertyImplementation> getAccessesProperty();

	/**
	 * Returns the value of the '<em><b>Calls Method</b></em>' reference list.
	 * The list contents are of type {@link apsNewModel.IECMethodImplementation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calls Method</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calls Method</em>' reference list.
	 * @see apsNewModel.ApsNewModelPackage#getProgram_CallsMethod()
	 * @model
	 * @generated
	 */
	EList<IECMethodImplementation> getCallsMethod();

} // Program
