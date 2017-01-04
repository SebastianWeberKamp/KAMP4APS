/**
 */
package xPPU;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Water Splitter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPPU.WaterSplitter#getWatersupply <em>Watersupply</em>}</li>
 * </ul>
 *
 * @see xPPU.XPPUPackage#getWaterSplitter()
 * @model
 * @generated
 */
public interface WaterSplitter extends Splitter {
	/**
	 * Returns the value of the '<em><b>Watersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Watersupply</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Watersupply</em>' reference.
	 * @see #setWatersupply(WaterSupply)
	 * @see xPPU.XPPUPackage#getWaterSplitter_Watersupply()
	 * @model required="true"
	 * @generated
	 */
	WaterSupply getWatersupply();

	/**
	 * Sets the value of the '{@link xPPU.WaterSplitter#getWatersupply <em>Watersupply</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Watersupply</em>' reference.
	 * @see #getWatersupply()
	 * @generated
	 */
	void setWatersupply(WaterSupply value);

} // WaterSplitter
