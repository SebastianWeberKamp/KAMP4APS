/**
 */
package iec611313Specification.language.ld;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Power Flow Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.language.ld.PowerFlowLine#getHasPowerSource <em>Has Power Source</em>}</li>
 *   <li>{@link iec611313Specification.language.ld.PowerFlowLine#getHasPowerSink <em>Has Power Sink</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.language.ld.LdPackage#getPowerFlowLine()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='hasValidPowerSink'"
 * @generated
 */
public interface PowerFlowLine extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Power Source</b></em>' reference list.
	 * The list contents are of type {@link iec611313Specification.language.ld.LDElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Power Source</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Power Source</em>' reference list.
	 * @see iec611313Specification.language.ld.LdPackage#getPowerFlowLine_HasPowerSource()
	 * @model required="true"
	 * @generated
	 */
	EList<LDElement> getHasPowerSource();

	/**
	 * Returns the value of the '<em><b>Has Power Sink</b></em>' reference list.
	 * The list contents are of type {@link iec611313Specification.language.ld.LDElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Power Sink</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Power Sink</em>' reference list.
	 * @see iec611313Specification.language.ld.LdPackage#getPowerFlowLine_HasPowerSink()
	 * @model required="true"
	 * @generated
	 */
	EList<LDElement> getHasPowerSink();

} // PowerFlowLine
