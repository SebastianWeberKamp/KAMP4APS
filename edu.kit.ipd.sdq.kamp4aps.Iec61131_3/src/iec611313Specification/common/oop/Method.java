/**
 */
package iec611313Specification.common.oop;

import iec611313Specification.common.pous.function_blocks.FunctionBlockBodySpecification;

import iec611313Specification.common.variables.VariableDeclaration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.common.oop.Method#getAccessType <em>Access Type</em>}</li>
 *   <li>{@link iec611313Specification.common.oop.Method#isIsOverridden <em>Is Overridden</em>}</li>
 *   <li>{@link iec611313Specification.common.oop.Method#isIsFinal <em>Is Final</em>}</li>
 *   <li>{@link iec611313Specification.common.oop.Method#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link iec611313Specification.common.oop.Method#getHasBody <em>Has Body</em>}</li>
 *   <li>{@link iec611313Specification.common.oop.Method#getHasMethodSignature <em>Has Method Signature</em>}</li>
 *   <li>{@link iec611313Specification.common.oop.Method#getContainsLocalVarDecl <em>Contains Local Var Decl</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.common.oop.OopPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends EObject {
	/**
	 * Returns the value of the '<em><b>Access Type</b></em>' attribute.
	 * The literals are from the enumeration {@link iec611313Specification.common.oop.AccessType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Type</em>' attribute.
	 * @see iec611313Specification.common.oop.AccessType
	 * @see #setAccessType(AccessType)
	 * @see iec611313Specification.common.oop.OopPackage#getMethod_AccessType()
	 * @model required="true"
	 * @generated
	 */
	AccessType getAccessType();

	/**
	 * Sets the value of the '{@link iec611313Specification.common.oop.Method#getAccessType <em>Access Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Type</em>' attribute.
	 * @see iec611313Specification.common.oop.AccessType
	 * @see #getAccessType()
	 * @generated
	 */
	void setAccessType(AccessType value);

	/**
	 * Returns the value of the '<em><b>Is Overridden</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Overridden</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Overridden</em>' attribute.
	 * @see #setIsOverridden(boolean)
	 * @see iec611313Specification.common.oop.OopPackage#getMethod_IsOverridden()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsOverridden();

	/**
	 * Sets the value of the '{@link iec611313Specification.common.oop.Method#isIsOverridden <em>Is Overridden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Overridden</em>' attribute.
	 * @see #isIsOverridden()
	 * @generated
	 */
	void setIsOverridden(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Final</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Final</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Final</em>' attribute.
	 * @see #setIsFinal(boolean)
	 * @see iec611313Specification.common.oop.OopPackage#getMethod_IsFinal()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsFinal();

	/**
	 * Sets the value of the '{@link iec611313Specification.common.oop.Method#isIsFinal <em>Is Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Final</em>' attribute.
	 * @see #isIsFinal()
	 * @generated
	 */
	void setIsFinal(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see iec611313Specification.common.oop.OopPackage#getMethod_IsAbstract()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link iec611313Specification.common.oop.Method#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Has Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Body</em>' containment reference.
	 * @see #setHasBody(FunctionBlockBodySpecification)
	 * @see iec611313Specification.common.oop.OopPackage#getMethod_HasBody()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FunctionBlockBodySpecification getHasBody();

	/**
	 * Sets the value of the '{@link iec611313Specification.common.oop.Method#getHasBody <em>Has Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Body</em>' containment reference.
	 * @see #getHasBody()
	 * @generated
	 */
	void setHasBody(FunctionBlockBodySpecification value);

	/**
	 * Returns the value of the '<em><b>Has Method Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Method Signature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Method Signature</em>' containment reference.
	 * @see #setHasMethodSignature(MethodSignature)
	 * @see iec611313Specification.common.oop.OopPackage#getMethod_HasMethodSignature()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MethodSignature getHasMethodSignature();

	/**
	 * Sets the value of the '{@link iec611313Specification.common.oop.Method#getHasMethodSignature <em>Has Method Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Method Signature</em>' containment reference.
	 * @see #getHasMethodSignature()
	 * @generated
	 */
	void setHasMethodSignature(MethodSignature value);

	/**
	 * Returns the value of the '<em><b>Contains Local Var Decl</b></em>' containment reference list.
	 * The list contents are of type {@link iec611313Specification.common.variables.VariableDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Local Var Decl</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Local Var Decl</em>' containment reference list.
	 * @see iec611313Specification.common.oop.OopPackage#getMethod_ContainsLocalVarDecl()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariableDeclaration> getContainsLocalVarDecl();

} // Method
