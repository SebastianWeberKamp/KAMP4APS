/**
 */
package xPPU.ComponentRepository;

import xPPU.StructureRepository.Conveyor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conveyor Belt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xPPU.ComponentRepository.ConveyorBelt#getMountedTo <em>Mounted To</em>}</li>
 *   <li>{@link xPPU.ComponentRepository.ConveyorBelt#getFrame <em>Frame</em>}</li>
 *   <li>{@link xPPU.ComponentRepository.ConveyorBelt#getRubberBand <em>Rubber Band</em>}</li>
 * </ul>
 *
 * @see xPPU.ComponentRepository.ComponentRepositoryPackage#getConveyorBelt()
 * @model
 * @generated
 */
public interface ConveyorBelt extends Component {
	/**
	 * Returns the value of the '<em><b>Mounted To</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link xPPU.StructureRepository.Conveyor#getBelts <em>Belts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mounted To</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mounted To</em>' container reference.
	 * @see #setMountedTo(Conveyor)
	 * @see xPPU.ComponentRepository.ComponentRepositoryPackage#getConveyorBelt_MountedTo()
	 * @see xPPU.StructureRepository.Conveyor#getBelts
	 * @model opposite="belts" required="true" transient="false"
	 * @generated
	 */
	Conveyor getMountedTo();

	/**
	 * Sets the value of the '{@link xPPU.ComponentRepository.ConveyorBelt#getMountedTo <em>Mounted To</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mounted To</em>' container reference.
	 * @see #getMountedTo()
	 * @generated
	 */
	void setMountedTo(Conveyor value);

	/**
	 * Returns the value of the '<em><b>Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frame</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame</em>' containment reference.
	 * @see #setFrame(Frame)
	 * @see xPPU.ComponentRepository.ComponentRepositoryPackage#getConveyorBelt_Frame()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Frame getFrame();

	/**
	 * Sets the value of the '{@link xPPU.ComponentRepository.ConveyorBelt#getFrame <em>Frame</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame</em>' containment reference.
	 * @see #getFrame()
	 * @generated
	 */
	void setFrame(Frame value);

	/**
	 * Returns the value of the '<em><b>Rubber Band</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rubber Band</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rubber Band</em>' containment reference.
	 * @see #setRubberBand(RubberBand)
	 * @see xPPU.ComponentRepository.ComponentRepositoryPackage#getConveyorBelt_RubberBand()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RubberBand getRubberBand();

	/**
	 * Sets the value of the '{@link xPPU.ComponentRepository.ConveyorBelt#getRubberBand <em>Rubber Band</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rubber Band</em>' containment reference.
	 * @see #getRubberBand()
	 * @generated
	 */
	void setRubberBand(RubberBand value);

} // ConveyorBelt
