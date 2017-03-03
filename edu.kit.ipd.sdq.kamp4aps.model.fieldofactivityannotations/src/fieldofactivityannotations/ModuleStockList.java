/**
 */
package fieldofactivityannotations;

import org.eclipse.emf.common.util.EList;

import xPPU.ModuleRepository.Module;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Stock List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fieldofactivityannotations.ModuleStockList#getParent <em>Parent</em>}</li>
 *   <li>{@link fieldofactivityannotations.ModuleStockList#getModules <em>Modules</em>}</li>
 * </ul>
 *
 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getModuleStockList()
 * @model
 * @generated
 */
public interface ModuleStockList extends StockList {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fieldofactivityannotations.StockSpecification#getModuleStockList <em>Module Stock List</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(StockSpecification)
	 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getModuleStockList_Parent()
	 * @see fieldofactivityannotations.StockSpecification#getModuleStockList
	 * @model opposite="moduleStockList" required="true" transient="false"
	 * @generated
	 */
	StockSpecification getParent();

	/**
	 * Sets the value of the '{@link fieldofactivityannotations.ModuleStockList#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(StockSpecification value);

	/**
	 * Returns the value of the '<em><b>Modules</b></em>' reference list.
	 * The list contents are of type {@link xPPU.ModuleRepository.Module}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' reference list.
	 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getModuleStockList_Modules()
	 * @model
	 * @generated
	 */
	EList<Module> getModules();

} // ModuleStockList
