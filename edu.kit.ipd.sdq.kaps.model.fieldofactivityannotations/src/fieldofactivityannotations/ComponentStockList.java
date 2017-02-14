/**
 */
package fieldofactivityannotations;

import org.eclipse.emf.common.util.EList;

import xPPU.ComponentRepository.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Stock List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fieldofactivityannotations.ComponentStockList#getParent <em>Parent</em>}</li>
 *   <li>{@link fieldofactivityannotations.ComponentStockList#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getComponentStockList()
 * @model
 * @generated
 */
public interface ComponentStockList extends StockList {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fieldofactivityannotations.StockSpecification#getComponentStockList <em>Component Stock List</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(StockSpecification)
	 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getComponentStockList_Parent()
	 * @see fieldofactivityannotations.StockSpecification#getComponentStockList
	 * @model opposite="componentStockList" required="true" transient="false"
	 * @generated
	 */
	StockSpecification getParent();

	/**
	 * Sets the value of the '{@link fieldofactivityannotations.ComponentStockList#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(StockSpecification value);

	/**
	 * Returns the value of the '<em><b>Components</b></em>' reference list.
	 * The list contents are of type {@link xPPU.ComponentRepository.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' reference list.
	 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getComponentStockList_Components()
	 * @model
	 * @generated
	 */
	EList<Component> getComponents();

} // ComponentStockList
