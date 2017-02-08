/**
 */
package fieldofactivityannotations;

import xPPU.Plant;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fieldofactivityannotations.SystemTest#getParent <em>Parent</em>}</li>
 *   <li>{@link fieldofactivityannotations.SystemTest#getSystemUnderTest <em>System Under Test</em>}</li>
 * </ul>
 *
 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getSystemTest()
 * @model
 * @generated
 */
public interface SystemTest extends TestCase {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fieldofactivityannotations.TestSpecification#getSystemTests <em>System Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TestSpecification)
	 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getSystemTest_Parent()
	 * @see fieldofactivityannotations.TestSpecification#getSystemTests
	 * @model opposite="systemTests" required="true" transient="false"
	 * @generated
	 */
	TestSpecification getParent();

	/**
	 * Sets the value of the '{@link fieldofactivityannotations.SystemTest#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TestSpecification value);

	/**
	 * Returns the value of the '<em><b>System Under Test</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Under Test</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Under Test</em>' reference.
	 * @see #setSystemUnderTest(Plant)
	 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getSystemTest_SystemUnderTest()
	 * @model
	 * @generated
	 */
	Plant getSystemUnderTest();

	/**
	 * Sets the value of the '{@link fieldofactivityannotations.SystemTest#getSystemUnderTest <em>System Under Test</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Under Test</em>' reference.
	 * @see #getSystemUnderTest()
	 * @generated
	 */
	void setSystemUnderTest(Plant value);

} // SystemTest
