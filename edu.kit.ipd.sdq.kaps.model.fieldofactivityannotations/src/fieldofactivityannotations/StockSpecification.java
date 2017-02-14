/**
 */
package fieldofactivityannotations;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stock Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fieldofactivityannotations.StockSpecification#getParent <em>Parent</em>}</li>
 *   <li>{@link fieldofactivityannotations.StockSpecification#getComponentStockList <em>Component Stock List</em>}</li>
 *   <li>{@link fieldofactivityannotations.StockSpecification#getInterfaceStockList <em>Interface Stock List</em>}</li>
 *   <li>{@link fieldofactivityannotations.StockSpecification#getModuleStockList <em>Module Stock List</em>}</li>
 *   <li>{@link fieldofactivityannotations.StockSpecification#getStructureStockList <em>Structure Stock List</em>}</li>
 * </ul>
 *
 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getStockSpecification()
 * @model
 * @generated
 */
public interface StockSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fieldofactivityannotations.FieldOfActivityAnnotationRepository#getStockSpecification <em>Stock Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(FieldOfActivityAnnotationRepository)
	 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getStockSpecification_Parent()
	 * @see fieldofactivityannotations.FieldOfActivityAnnotationRepository#getStockSpecification
	 * @model opposite="stockSpecification" required="true" transient="false"
	 * @generated
	 */
	FieldOfActivityAnnotationRepository getParent();

	/**
	 * Sets the value of the '{@link fieldofactivityannotations.StockSpecification#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(FieldOfActivityAnnotationRepository value);

	/**
	 * Returns the value of the '<em><b>Component Stock List</b></em>' containment reference list.
	 * The list contents are of type {@link fieldofactivityannotations.ComponentStockList}.
	 * It is bidirectional and its opposite is '{@link fieldofactivityannotations.ComponentStockList#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Stock List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Stock List</em>' containment reference list.
	 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getStockSpecification_ComponentStockList()
	 * @see fieldofactivityannotations.ComponentStockList#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ComponentStockList> getComponentStockList();

	/**
	 * Returns the value of the '<em><b>Interface Stock List</b></em>' containment reference list.
	 * The list contents are of type {@link fieldofactivityannotations.InterfaceStockList}.
	 * It is bidirectional and its opposite is '{@link fieldofactivityannotations.InterfaceStockList#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Stock List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Stock List</em>' containment reference list.
	 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getStockSpecification_InterfaceStockList()
	 * @see fieldofactivityannotations.InterfaceStockList#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<InterfaceStockList> getInterfaceStockList();

	/**
	 * Returns the value of the '<em><b>Module Stock List</b></em>' containment reference list.
	 * The list contents are of type {@link fieldofactivityannotations.ModuleStockList}.
	 * It is bidirectional and its opposite is '{@link fieldofactivityannotations.ModuleStockList#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module Stock List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Stock List</em>' containment reference list.
	 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getStockSpecification_ModuleStockList()
	 * @see fieldofactivityannotations.ModuleStockList#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ModuleStockList> getModuleStockList();

	/**
	 * Returns the value of the '<em><b>Structure Stock List</b></em>' containment reference list.
	 * The list contents are of type {@link fieldofactivityannotations.StructureStockList}.
	 * It is bidirectional and its opposite is '{@link fieldofactivityannotations.StructureStockList#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structure Stock List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure Stock List</em>' containment reference list.
	 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getStockSpecification_StructureStockList()
	 * @see fieldofactivityannotations.StructureStockList#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<StructureStockList> getStructureStockList();

} // StockSpecification
