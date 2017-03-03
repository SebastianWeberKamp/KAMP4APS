/**
 */
package iec611313Specification.common.variables;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iec611313Specification.common.variables.LocationSpecification#getLocation <em>Location</em>}</li>
 *   <li>{@link iec611313Specification.common.variables.LocationSpecification#getSize <em>Size</em>}</li>
 *   <li>{@link iec611313Specification.common.variables.LocationSpecification#getAddress <em>Address</em>}</li>
 * </ul>
 *
 * @see iec611313Specification.common.variables.VariablesPackage#getLocationSpecification()
 * @model
 * @generated
 */
public interface LocationSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * The literals are from the enumeration {@link iec611313Specification.common.variables.Location}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see iec611313Specification.common.variables.Location
	 * @see #setLocation(Location)
	 * @see iec611313Specification.common.variables.VariablesPackage#getLocationSpecification_Location()
	 * @model required="true"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link iec611313Specification.common.variables.LocationSpecification#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see iec611313Specification.common.variables.Location
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * The literals are from the enumeration {@link iec611313Specification.common.variables.Size}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see iec611313Specification.common.variables.Size
	 * @see #setSize(Size)
	 * @see iec611313Specification.common.variables.VariablesPackage#getLocationSpecification_Size()
	 * @model required="true"
	 * @generated
	 */
	Size getSize();

	/**
	 * Sets the value of the '{@link iec611313Specification.common.variables.LocationSpecification#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see iec611313Specification.common.variables.Size
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Size value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(Integer)
	 * @see iec611313Specification.common.variables.VariablesPackage#getLocationSpecification_Address()
	 * @model
	 * @generated
	 */
	Integer getAddress();

	/**
	 * Sets the value of the '{@link iec611313Specification.common.variables.LocationSpecification#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(Integer value);

} // LocationSpecification
