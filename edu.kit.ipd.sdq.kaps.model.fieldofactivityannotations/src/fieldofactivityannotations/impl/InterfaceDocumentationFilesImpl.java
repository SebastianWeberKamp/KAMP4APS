/**
 */
package fieldofactivityannotations.impl;

import fieldofactivityannotations.DocumentationSpecification;
import fieldofactivityannotations.FieldofactivityannotationsPackage;
import fieldofactivityannotations.InterfaceDocumentationFiles;
import fieldofactivityannotations.MainteneanceDocumentation;
import fieldofactivityannotations.OperatorInstructions;
import fieldofactivityannotations.TrainingDocExternal;
import fieldofactivityannotations.TrainingDocIntern;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import xPPU.InterfaceRepository.Interface;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Documentation Files</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fieldofactivityannotations.impl.InterfaceDocumentationFilesImpl#getMainteneance <em>Mainteneance</em>}</li>
 *   <li>{@link fieldofactivityannotations.impl.InterfaceDocumentationFilesImpl#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link fieldofactivityannotations.impl.InterfaceDocumentationFilesImpl#getTrainingIntern <em>Training Intern</em>}</li>
 *   <li>{@link fieldofactivityannotations.impl.InterfaceDocumentationFilesImpl#getTrainingExternal <em>Training External</em>}</li>
 *   <li>{@link fieldofactivityannotations.impl.InterfaceDocumentationFilesImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link fieldofactivityannotations.impl.InterfaceDocumentationFilesImpl#getDocumentedInterface <em>Documented Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceDocumentationFilesImpl extends MinimalEObjectImpl.Container implements InterfaceDocumentationFiles {
	/**
	 * The cached value of the '{@link #getMainteneance() <em>Mainteneance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainteneance()
	 * @generated
	 * @ordered
	 */
	protected EList<MainteneanceDocumentation> mainteneance;

	/**
	 * The cached value of the '{@link #getInstructions() <em>Instructions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructions()
	 * @generated
	 * @ordered
	 */
	protected EList<OperatorInstructions> instructions;

	/**
	 * The cached value of the '{@link #getTrainingIntern() <em>Training Intern</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainingIntern()
	 * @generated
	 * @ordered
	 */
	protected EList<TrainingDocIntern> trainingIntern;

	/**
	 * The cached value of the '{@link #getTrainingExternal() <em>Training External</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainingExternal()
	 * @generated
	 * @ordered
	 */
	protected EList<TrainingDocExternal> trainingExternal;

	/**
	 * The cached value of the '{@link #getDocumentedInterface() <em>Documented Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentedInterface()
	 * @generated
	 * @ordered
	 */
	protected Interface documentedInterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceDocumentationFilesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FieldofactivityannotationsPackage.Literals.INTERFACE_DOCUMENTATION_FILES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MainteneanceDocumentation> getMainteneance() {
		if (mainteneance == null) {
			mainteneance = new EObjectContainmentWithInverseEList<MainteneanceDocumentation>(MainteneanceDocumentation.class, this, FieldofactivityannotationsPackage.INTERFACE_DOCUMENTATION_FILES__MAINTENEANCE, FieldofactivityannotationsPackage.MAINTENEANCE_DOCUMENTATION__PARENT);
		}
		return mainteneance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperatorInstructions> getInstructions() {
		if (instructions == null) {
			instructions = new EObjectContainmentWithInverseEList<OperatorInstructions>(OperatorInstructions.class, this, FieldofactivityannotationsPackage.INTERFACE_DOCUMENTATION_FILES__INSTRUCTIONS, FieldofactivityannotationsPackage.OPERATOR_INSTRUCTIONS__PARENT);
		}
		return instructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrainingDocIntern> getTrainingIntern() {
		if (trainingIntern == null) {
			trainingIntern = new EObjectContainmentWithInverseEList<TrainingDocIntern>(TrainingDocIntern.class, this, FieldofactivityannotationsPackage.INTERFACE_DOCUMENTATION_FILES__TRAINING_INTERN, FieldofactivityannotationsPackage.TRAINING_DOC_INTERN__PARENT);
		}
		return trainingIntern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrainingDocExternal> getTrainingExternal() {
		if (trainingExternal == null) {
			trainingExternal = new EObjectContainmentWithInverseEList<TrainingDocExternal>(TrainingDocExternal.class, this, FieldofactivityannotationsPackage.INTERFACE_DOCUMENTATION_FILES__TRAINING_EXTERNAL, FieldofactivityannotationsPackage.TRAINING_DOC_EXTERNAL__PARENT);
		}
		return trainingExternal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentationSpecification getParent() {
		if (eContainerFeatureID() != FieldofactivityannotationsPackage.INTERFACE_DOCUMENTATION_FILES__PARENT) return null;
		return (DocumentationSpecification)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(DocumentationSpecification newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, FieldofactivityannotationsPackage.INTERFACE_DOCUMENTATION_FILES__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(DocumentationSpecification newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != FieldofactivityannotationsPackage.INTERFACE_DOCUMENTATION_FILES__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, FieldofactivityannotationsPackage.DOCUMENTATION_SPECIFICATION__INTERFACE_DOCUMENTATION, DocumentationSpecification.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FieldofactivityannotationsPackage.INTERFACE_DOCUMENTATION_FILES__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getDocumentedInterface() {
		if (documentedInterface != null && documentedInterface.eIsProxy()) {
			InternalEObject oldDocumentedInterface = (InternalEObject)documentedInterface;
			documentedInterface = (Interface)eResolveProxy(oldDocumentedInterface);
			if (documentedInterface != oldDocumentedInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FieldofactivityannotationsPackage.INTERFACE_DOCUMENTATION_FILES__DOCUMENTED_INTERFACE, oldDocumentedInterface, documentedInterface));
			}
		}
		return documentedInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface basicGetDocumentedInterface() {
		return documentedInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentedInterface(Interface newDocumentedInterface) {
		Interface oldDocumentedInterface = documentedInterface;
		documentedInterface = newDocumentedInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FieldofactivityannotationsPackage.INTERFACE_DOCUMENTATION_FILES__DOCUMENTED_INTERFACE, oldDocumentedInterface, documentedInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FieldofactivityannotationsPackage.INTERFACE_DOCUMENTATION_FILES__MAINTENEANCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMainteneance()).basicAdd(otherEnd, msgs);
			case FieldofactivityannotationsPackage.INTERFACE_DOCUMENTATION_FILES__INSTRUCTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInstructions()).basicAdd(otherEnd, msgs);
			case FieldofactivityannotationsPackage.INTERFACE_DOCUMENTATION_FILES__TRAINING_INTERN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTrainingIntern()).basicAdd(otherEnd, msgs);
			case FieldofactivityannotationsPackage.INTERFACE_DOCUMENTATION_FILES__TRAINING_EXTERNAL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTrainingExternal()).basicAdd(otherEnd, msgs);
			case FieldofactivityannotationsPackage.INTERFACE_DOCUMENTATION_FILES__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((DocumentationSpecification)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FieldofactivityannotationsPackage.INTERFACE_DOCUMENTATION_FILES__MAINTENEANCE:
				return ((InternalEList<?>)getMainteneance()).basicRemove(otherEnd, msgs);
			case FieldofactivityannotationsPackage.INTERFACE_DOCUMENTATION_FILES__INSTRUCTIONS:
				return ((InternalEList<?>)getInstructions()).basicRemove(otherEnd, msgs);
			case FieldofactivityannotationsPackage.INTERFACE_DOCUMENTATION_FILES__TRAINING_INTERN:
				return ((InternalEList<?>)getTrainingIntern()).basicRemove(otherEnd, msgs);
			case FieldofactivityannotationsPackage.INTERFACE_DOCUMENTATION_FILES__TRAINING_EXTERNAL:
				return ((InternalEList<?>)getTrainingExternal()).basicRemove(otherEnd, msgs);
			case FieldofactivityannotationsPackage.INTERFACE_DOCUMENTATION_FILES__PARENT:
				return basicSetParent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case FieldofactivityannotationsPackage.INTERFACE_DOCUMENTATION_FILES__PARENT:
				return eInternalContainer().eInverseRemove(this, FieldofactivityannotationsPackage.DOCUMENTATION_SPECIFICATION__INTERFACE_DOCUMENTATION, DocumentationSpecification.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FieldofactivityannotationsPackage.INTERFACE_DOCUMENTATION_FILES__MAINTENEANCE:
				return getMainteneance();
			case FieldofactivityannotationsPackage.INTERFACE_DOCUMENTATION_FILES__INSTRUCTIONS:
				return getInstructions();
			case FieldofactivityannotationsPackage.INTERFACE_DOCUMENTATION_FILES__TRAINING_INTERN:
				return getTrainingIntern();
			case FieldofactivityannotationsPackage.INTERFACE_DOCUMENTATION_FILES__TRAINING_EXTERNAL:
				return getTrainingExternal();
			case FieldofactivityannotationsPackage.INTERFACE_DOCUMENTATION_FILES__PARENT:
				return getParent();
			case FieldofactivityannotationsPackage.INTERFACE_DOCUMENTATION_FILES__DOCUMENTED_INTERFACE:
				if (resolve) return getDocumentedInterface();
				return basicGetDocumentedInterface();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FieldofactivityannotationsPackage.INTERFACE_DOCUMENTATION_FILES__MAINTENEANCE:
				getMainteneance().clear();
				getMainteneance().addAll((Collection<? extends MainteneanceDocumentation>)newValue);
				return;
			case FieldofactivityannotationsPackage.INTERFACE_DOCUMENTATION_FILES__INSTRUCTIONS:
				getInstructions().clear();
				getInstructions().addAll((Collection<? extends OperatorInstructions>)newValue);
				return;
			case FieldofactivityannotationsPackage.INTERFACE_DOCUMENTATION_FILES__TRAINING_INTERN:
				getTrainingIntern().clear();
				getTrainingIntern().addAll((Collection<? extends TrainingDocIntern>)newValue);
				return;
			case FieldofactivityannotationsPackage.INTERFACE_DOCUMENTATION_FILES__TRAINING_EXTERNAL:
				getTrainingExternal().clear();
				getTrainingExternal().addAll((Collection<? extends TrainingDocExternal>)newValue);
				return;
			case FieldofactivityannotationsPackage.INTERFACE_DOCUMENTATION_FILES__PARENT:
				setParent((DocumentationSpecification)newValue);
				return;
			case FieldofactivityannotationsPackage.INTERFACE_DOCUMENTATION_FILES__DOCUMENTED_INTERFACE:
				setDocumentedInterface((Interface)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FieldofactivityannotationsPackage.INTERFACE_DOCUMENTATION_FILES__MAINTENEANCE:
				getMainteneance().clear();
				return;
			case FieldofactivityannotationsPackage.INTERFACE_DOCUMENTATION_FILES__INSTRUCTIONS:
				getInstructions().clear();
				return;
			case FieldofactivityannotationsPackage.INTERFACE_DOCUMENTATION_FILES__TRAINING_INTERN:
				getTrainingIntern().clear();
				return;
			case FieldofactivityannotationsPackage.INTERFACE_DOCUMENTATION_FILES__TRAINING_EXTERNAL:
				getTrainingExternal().clear();
				return;
			case FieldofactivityannotationsPackage.INTERFACE_DOCUMENTATION_FILES__PARENT:
				setParent((DocumentationSpecification)null);
				return;
			case FieldofactivityannotationsPackage.INTERFACE_DOCUMENTATION_FILES__DOCUMENTED_INTERFACE:
				setDocumentedInterface((Interface)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FieldofactivityannotationsPackage.INTERFACE_DOCUMENTATION_FILES__MAINTENEANCE:
				return mainteneance != null && !mainteneance.isEmpty();
			case FieldofactivityannotationsPackage.INTERFACE_DOCUMENTATION_FILES__INSTRUCTIONS:
				return instructions != null && !instructions.isEmpty();
			case FieldofactivityannotationsPackage.INTERFACE_DOCUMENTATION_FILES__TRAINING_INTERN:
				return trainingIntern != null && !trainingIntern.isEmpty();
			case FieldofactivityannotationsPackage.INTERFACE_DOCUMENTATION_FILES__TRAINING_EXTERNAL:
				return trainingExternal != null && !trainingExternal.isEmpty();
			case FieldofactivityannotationsPackage.INTERFACE_DOCUMENTATION_FILES__PARENT:
				return getParent() != null;
			case FieldofactivityannotationsPackage.INTERFACE_DOCUMENTATION_FILES__DOCUMENTED_INTERFACE:
				return documentedInterface != null;
		}
		return super.eIsSet(featureID);
	}

} //InterfaceDocumentationFilesImpl
