/**
 */
package fieldofactivityannotations;

import org.eclipse.emf.common.util.EList;

import xPPU.InterfaceRepository.Interface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Stock List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fieldofactivityannotations.InterfaceStockList#getParent <em>Parent</em>}</li>
 *   <li>{@link fieldofactivityannotations.InterfaceStockList#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 *
 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getInterfaceStockList()
 * @model
 * @generated
 */
public interface InterfaceStockList extends StockList {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fieldofactivityannotations.StockSpecification#getInterfaceStockList <em>Interface Stock List</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(StockSpecification)
	 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getInterfaceStockList_Parent()
	 * @see fieldofactivityannotations.StockSpecification#getInterfaceStockList
	 * @model opposite="interfaceStockList" required="true" transient="false"
	 * @generated
	 */
	StockSpecification getParent();

	/**
	 * Sets the value of the '{@link fieldofactivityannotations.InterfaceStockList#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(StockSpecification value);

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' reference list.
	 * The list contents are of type {@link xPPU.InterfaceRepository.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' reference list.
	 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getInterfaceStockList_Interfaces()
	 * @model
	 * @generated
	 */
	EList<Interface> getInterfaces();

} // InterfaceStockList
