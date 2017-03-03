/**
 */
package iec611313Specification.language.sfc;

import iec611313Specification.common.variables.VariableAccess;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.language.sfc.ActionAssociation#getHasAction <em>Has Action</em>}</li>
 *   <li>{@link iec611313Specification.language.sfc.ActionAssociation#getHasIndicatorVariable <em>Has Indicator Variable</em>}</li>
 *   <li>{@link iec611313Specification.language.sfc.ActionAssociation#getHasActionQualifier <em>Has Action Qualifier</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.language.sfc.SfcPackage#getActionAssociation()
 * @model
 * @generated
 */
public interface ActionAssociation extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Action</em>' reference.
	 * @see #setHasAction(Action)
	 * @see iec611313Specification.language.sfc.SfcPackage#getActionAssociation_HasAction()
	 * @model required="true"
	 * @generated
	 */
	Action getHasAction();

	/**
	 * Sets the value of the '{@link iec611313Specification.language.sfc.ActionAssociation#getHasAction <em>Has Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Action</em>' reference.
	 * @see #getHasAction()
	 * @generated
	 */
	void setHasAction(Action value);

	/**
	 * Returns the value of the '<em><b>Has Indicator Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Indicator Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Indicator Variable</em>' reference.
	 * @see #setHasIndicatorVariable(VariableAccess)
	 * @see iec611313Specification.language.sfc.SfcPackage#getActionAssociation_HasIndicatorVariable()
	 * @model
	 * @generated
	 */
	VariableAccess getHasIndicatorVariable();

	/**
	 * Sets the value of the '{@link iec611313Specification.language.sfc.ActionAssociation#getHasIndicatorVariable <em>Has Indicator Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Indicator Variable</em>' reference.
	 * @see #getHasIndicatorVariable()
	 * @generated
	 */
	void setHasIndicatorVariable(VariableAccess value);

	/**
	 * Returns the value of the '<em><b>Has Action Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Action Qualifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Action Qualifier</em>' reference.
	 * @see #setHasActionQualifier(ActionQualifier)
	 * @see iec611313Specification.language.sfc.SfcPackage#getActionAssociation_HasActionQualifier()
	 * @model required="true"
	 * @generated
	 */
	ActionQualifier getHasActionQualifier();

	/**
	 * Sets the value of the '{@link iec611313Specification.language.sfc.ActionAssociation#getHasActionQualifier <em>Has Action Qualifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Action Qualifier</em>' reference.
	 * @see #getHasActionQualifier()
	 * @generated
	 */
	void setHasActionQualifier(ActionQualifier value);

} // ActionAssociation
