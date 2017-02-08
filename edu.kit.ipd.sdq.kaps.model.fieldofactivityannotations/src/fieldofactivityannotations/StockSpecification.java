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
 *   <li>{@link fieldofactivityannotations.StockSpecification#getStockList <em>Stock List</em>}</li>
 * </ul>
 *
 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getStockSpecification()
 * @model
 * @generated
 */
public interface StockSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fieldofactivityannotations.FieldOfActivityAnnotationRepository#getPurchaseSpecification <em>Purchase Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(FieldOfActivityAnnotationRepository)
	 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getStockSpecification_Parent()
	 * @see fieldofactivityannotations.FieldOfActivityAnnotationRepository#getPurchaseSpecification
	 * @model opposite="purchaseSpecification" required="true" transient="false"
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
	 * Returns the value of the '<em><b>Stock List</b></em>' containment reference list.
	 * The list contents are of type {@link fieldofactivityannotations.StockList}.
	 * It is bidirectional and its opposite is '{@link fieldofactivityannotations.StockList#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stock List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stock List</em>' containment reference list.
	 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getStockSpecification_StockList()
	 * @see fieldofactivityannotations.StockList#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<StockList> getStockList();

} // StockSpecification
