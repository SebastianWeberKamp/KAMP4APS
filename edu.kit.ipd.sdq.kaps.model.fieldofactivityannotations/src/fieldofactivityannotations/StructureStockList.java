/**
 */
package fieldofactivityannotations;

import org.eclipse.emf.common.util.EList;

import xPPU.StructureRepository.Structure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure Stock List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fieldofactivityannotations.StructureStockList#getParent <em>Parent</em>}</li>
 *   <li>{@link fieldofactivityannotations.StructureStockList#getStructures <em>Structures</em>}</li>
 * </ul>
 *
 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getStructureStockList()
 * @model
 * @generated
 */
public interface StructureStockList extends StockList {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fieldofactivityannotations.StockSpecification#getStructureStockList <em>Structure Stock List</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(StockSpecification)
	 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getStructureStockList_Parent()
	 * @see fieldofactivityannotations.StockSpecification#getStructureStockList
	 * @model opposite="structureStockList" required="true" transient="false"
	 * @generated
	 */
	StockSpecification getParent();

	/**
	 * Sets the value of the '{@link fieldofactivityannotations.StructureStockList#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(StockSpecification value);

	/**
	 * Returns the value of the '<em><b>Structures</b></em>' reference list.
	 * The list contents are of type {@link xPPU.StructureRepository.Structure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structures</em>' reference list.
	 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getStructureStockList_Structures()
	 * @model
	 * @generated
	 */
	EList<Structure> getStructures();

} // StructureStockList
