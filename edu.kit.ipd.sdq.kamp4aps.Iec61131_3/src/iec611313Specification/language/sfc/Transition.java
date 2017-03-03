/**
 */
package iec611313Specification.language.sfc;

import iec611313Specification.common.Expression;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.language.sfc.Transition#getHasSourceStep <em>Has Source Step</em>}</li>
 *   <li>{@link iec611313Specification.language.sfc.Transition#getHasTargetStep <em>Has Target Step</em>}</li>
 *   <li>{@link iec611313Specification.language.sfc.Transition#getHasTransitionCondition <em>Has Transition Condition</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.language.sfc.SfcPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Source Step</b></em>' reference list.
	 * The list contents are of type {@link iec611313Specification.language.sfc.Step}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Source Step</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Source Step</em>' reference list.
	 * @see iec611313Specification.language.sfc.SfcPackage#getTransition_HasSourceStep()
	 * @model required="true"
	 * @generated
	 */
	EList<Step> getHasSourceStep();

	/**
	 * Returns the value of the '<em><b>Has Target Step</b></em>' reference list.
	 * The list contents are of type {@link iec611313Specification.language.sfc.Step}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Target Step</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Target Step</em>' reference list.
	 * @see iec611313Specification.language.sfc.SfcPackage#getTransition_HasTargetStep()
	 * @model required="true"
	 * @generated
	 */
	EList<Step> getHasTargetStep();

	/**
	 * Returns the value of the '<em><b>Has Transition Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Transition Condition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Transition Condition</em>' reference.
	 * @see #setHasTransitionCondition(Expression)
	 * @see iec611313Specification.language.sfc.SfcPackage#getTransition_HasTransitionCondition()
	 * @model required="true"
	 * @generated
	 */
	Expression getHasTransitionCondition();

	/**
	 * Sets the value of the '{@link iec611313Specification.language.sfc.Transition#getHasTransitionCondition <em>Has Transition Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Transition Condition</em>' reference.
	 * @see #getHasTransitionCondition()
	 * @generated
	 */
	void setHasTransitionCondition(Expression value);

} // Transition
