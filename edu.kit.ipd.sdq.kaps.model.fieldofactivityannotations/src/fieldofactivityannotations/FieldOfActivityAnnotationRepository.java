/**
 */
package fieldofactivityannotations;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Of Activity Annotation Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fieldofactivityannotations.FieldOfActivityAnnotationRepository#getCalibrationSpecification <em>Calibration Specification</em>}</li>
 *   <li>{@link fieldofactivityannotations.FieldOfActivityAnnotationRepository#getTestSpecification <em>Test Specification</em>}</li>
 *   <li>{@link fieldofactivityannotations.FieldOfActivityAnnotationRepository#getDevelopmentSpecification <em>Development Specification</em>}</li>
 *   <li>{@link fieldofactivityannotations.FieldOfActivityAnnotationRepository#getStockSpecification <em>Stock Specification</em>}</li>
 *   <li>{@link fieldofactivityannotations.FieldOfActivityAnnotationRepository#getHmiSpecification <em>Hmi Specification</em>}</li>
 *   <li>{@link fieldofactivityannotations.FieldOfActivityAnnotationRepository#getEcadSpecification <em>Ecad Specification</em>}</li>
 *   <li>{@link fieldofactivityannotations.FieldOfActivityAnnotationRepository#getDocumentationSpecification <em>Documentation Specification</em>}</li>
 *   <li>{@link fieldofactivityannotations.FieldOfActivityAnnotationRepository#getComponentSpecification <em>Component Specification</em>}</li>
 *   <li>{@link fieldofactivityannotations.FieldOfActivityAnnotationRepository#getStaffSpecification <em>Staff Specification</em>}</li>
 * </ul>
 *
 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getFieldOfActivityAnnotationRepository()
 * @model
 * @generated
 */
public interface FieldOfActivityAnnotationRepository extends EObject {
	/**
	 * Returns the value of the '<em><b>Calibration Specification</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fieldofactivityannotations.CalibrationSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calibration Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calibration Specification</em>' containment reference.
	 * @see #setCalibrationSpecification(CalibrationSpecification)
	 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getFieldOfActivityAnnotationRepository_CalibrationSpecification()
	 * @see fieldofactivityannotations.CalibrationSpecification#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	CalibrationSpecification getCalibrationSpecification();

	/**
	 * Sets the value of the '{@link fieldofactivityannotations.FieldOfActivityAnnotationRepository#getCalibrationSpecification <em>Calibration Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calibration Specification</em>' containment reference.
	 * @see #getCalibrationSpecification()
	 * @generated
	 */
	void setCalibrationSpecification(CalibrationSpecification value);

	/**
	 * Returns the value of the '<em><b>Test Specification</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fieldofactivityannotations.TestSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Specification</em>' containment reference.
	 * @see #setTestSpecification(TestSpecification)
	 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getFieldOfActivityAnnotationRepository_TestSpecification()
	 * @see fieldofactivityannotations.TestSpecification#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	TestSpecification getTestSpecification();

	/**
	 * Sets the value of the '{@link fieldofactivityannotations.FieldOfActivityAnnotationRepository#getTestSpecification <em>Test Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Specification</em>' containment reference.
	 * @see #getTestSpecification()
	 * @generated
	 */
	void setTestSpecification(TestSpecification value);

	/**
	 * Returns the value of the '<em><b>Development Specification</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fieldofactivityannotations.DevelopmentSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Development Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Development Specification</em>' containment reference.
	 * @see #setDevelopmentSpecification(DevelopmentSpecification)
	 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getFieldOfActivityAnnotationRepository_DevelopmentSpecification()
	 * @see fieldofactivityannotations.DevelopmentSpecification#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	DevelopmentSpecification getDevelopmentSpecification();

	/**
	 * Sets the value of the '{@link fieldofactivityannotations.FieldOfActivityAnnotationRepository#getDevelopmentSpecification <em>Development Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Development Specification</em>' containment reference.
	 * @see #getDevelopmentSpecification()
	 * @generated
	 */
	void setDevelopmentSpecification(DevelopmentSpecification value);

	/**
	 * Returns the value of the '<em><b>Stock Specification</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fieldofactivityannotations.StockSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stock Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stock Specification</em>' containment reference.
	 * @see #setStockSpecification(StockSpecification)
	 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getFieldOfActivityAnnotationRepository_StockSpecification()
	 * @see fieldofactivityannotations.StockSpecification#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	StockSpecification getStockSpecification();

	/**
	 * Sets the value of the '{@link fieldofactivityannotations.FieldOfActivityAnnotationRepository#getStockSpecification <em>Stock Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stock Specification</em>' containment reference.
	 * @see #getStockSpecification()
	 * @generated
	 */
	void setStockSpecification(StockSpecification value);

	/**
	 * Returns the value of the '<em><b>Hmi Specification</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fieldofactivityannotations.HMISpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hmi Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hmi Specification</em>' containment reference.
	 * @see #setHmiSpecification(HMISpecification)
	 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getFieldOfActivityAnnotationRepository_HmiSpecification()
	 * @see fieldofactivityannotations.HMISpecification#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	HMISpecification getHmiSpecification();

	/**
	 * Sets the value of the '{@link fieldofactivityannotations.FieldOfActivityAnnotationRepository#getHmiSpecification <em>Hmi Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hmi Specification</em>' containment reference.
	 * @see #getHmiSpecification()
	 * @generated
	 */
	void setHmiSpecification(HMISpecification value);

	/**
	 * Returns the value of the '<em><b>Ecad Specification</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fieldofactivityannotations.ECADSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ecad Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecad Specification</em>' containment reference.
	 * @see #setEcadSpecification(ECADSpecification)
	 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getFieldOfActivityAnnotationRepository_EcadSpecification()
	 * @see fieldofactivityannotations.ECADSpecification#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	ECADSpecification getEcadSpecification();

	/**
	 * Sets the value of the '{@link fieldofactivityannotations.FieldOfActivityAnnotationRepository#getEcadSpecification <em>Ecad Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ecad Specification</em>' containment reference.
	 * @see #getEcadSpecification()
	 * @generated
	 */
	void setEcadSpecification(ECADSpecification value);

	/**
	 * Returns the value of the '<em><b>Documentation Specification</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fieldofactivityannotations.DocumentationSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation Specification</em>' containment reference.
	 * @see #setDocumentationSpecification(DocumentationSpecification)
	 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getFieldOfActivityAnnotationRepository_DocumentationSpecification()
	 * @see fieldofactivityannotations.DocumentationSpecification#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	DocumentationSpecification getDocumentationSpecification();

	/**
	 * Sets the value of the '{@link fieldofactivityannotations.FieldOfActivityAnnotationRepository#getDocumentationSpecification <em>Documentation Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation Specification</em>' containment reference.
	 * @see #getDocumentationSpecification()
	 * @generated
	 */
	void setDocumentationSpecification(DocumentationSpecification value);

	/**
	 * Returns the value of the '<em><b>Component Specification</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fieldofactivityannotations.ComponentSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Specification</em>' containment reference.
	 * @see #setComponentSpecification(ComponentSpecification)
	 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getFieldOfActivityAnnotationRepository_ComponentSpecification()
	 * @see fieldofactivityannotations.ComponentSpecification#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	ComponentSpecification getComponentSpecification();

	/**
	 * Sets the value of the '{@link fieldofactivityannotations.FieldOfActivityAnnotationRepository#getComponentSpecification <em>Component Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Specification</em>' containment reference.
	 * @see #getComponentSpecification()
	 * @generated
	 */
	void setComponentSpecification(ComponentSpecification value);

	/**
	 * Returns the value of the '<em><b>Staff Specification</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fieldofactivityannotations.StaffSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Staff Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Staff Specification</em>' containment reference.
	 * @see #setStaffSpecification(StaffSpecification)
	 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getFieldOfActivityAnnotationRepository_StaffSpecification()
	 * @see fieldofactivityannotations.StaffSpecification#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	StaffSpecification getStaffSpecification();

	/**
	 * Sets the value of the '{@link fieldofactivityannotations.FieldOfActivityAnnotationRepository#getStaffSpecification <em>Staff Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Staff Specification</em>' containment reference.
	 * @see #getStaffSpecification()
	 * @generated
	 */
	void setStaffSpecification(StaffSpecification value);

} // FieldOfActivityAnnotationRepository
