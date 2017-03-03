/**
 */
package fieldofactivityannotations.impl;

import fieldofactivityannotations.ComponentDocumentationFiles;
import fieldofactivityannotations.DocumentationSpecification;
import fieldofactivityannotations.FieldofactivityannotationsPackage;
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

import xPPU.ComponentRepository.Component;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Documentation Files</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fieldofactivityannotations.impl.ComponentDocumentationFilesImpl#getMainteneance <em>Mainteneance</em>}</li>
 *   <li>{@link fieldofactivityannotations.impl.ComponentDocumentationFilesImpl#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link fieldofactivityannotations.impl.ComponentDocumentationFilesImpl#getTrainingIntern <em>Training Intern</em>}</li>
 *   <li>{@link fieldofactivityannotations.impl.ComponentDocumentationFilesImpl#getTrainingExternal <em>Training External</em>}</li>
 *   <li>{@link fieldofactivityannotations.impl.ComponentDocumentationFilesImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link fieldofactivityannotations.impl.ComponentDocumentationFilesImpl#getDocumentedComponent <em>Documented Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentDocumentationFilesImpl extends MinimalEObjectImpl.Container implements ComponentDocumentationFiles {
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
	 * The cached value of the '{@link #getDocumentedComponent() <em>Documented Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentedComponent()
	 * @generated
	 * @ordered
	 */
	protected Component documentedComponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentDocumentationFilesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FieldofactivityannotationsPackage.Literals.COMPONENT_DOCUMENTATION_FILES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MainteneanceDocumentation> getMainteneance() {
		if (mainteneance == null) {
			mainteneance = new EObjectContainmentWithInverseEList<MainteneanceDocumentation>(MainteneanceDocumentation.class, this, FieldofactivityannotationsPackage.COMPONENT_DOCUMENTATION_FILES__MAINTENEANCE, FieldofactivityannotationsPackage.MAINTENEANCE_DOCUMENTATION__PARENT);
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
			instructions = new EObjectContainmentWithInverseEList<OperatorInstructions>(OperatorInstructions.class, this, FieldofactivityannotationsPackage.COMPONENT_DOCUMENTATION_FILES__INSTRUCTIONS, FieldofactivityannotationsPackage.OPERATOR_INSTRUCTIONS__PARENT);
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
			trainingIntern = new EObjectContainmentWithInverseEList<TrainingDocIntern>(TrainingDocIntern.class, this, FieldofactivityannotationsPackage.COMPONENT_DOCUMENTATION_FILES__TRAINING_INTERN, FieldofactivityannotationsPackage.TRAINING_DOC_INTERN__PARENT);
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
			trainingExternal = new EObjectContainmentWithInverseEList<TrainingDocExternal>(TrainingDocExternal.class, this, FieldofactivityannotationsPackage.COMPONENT_DOCUMENTATION_FILES__TRAINING_EXTERNAL, FieldofactivityannotationsPackage.TRAINING_DOC_EXTERNAL__PARENT);
		}
		return trainingExternal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentationSpecification getParent() {
		if (eContainerFeatureID() != FieldofactivityannotationsPackage.COMPONENT_DOCUMENTATION_FILES__PARENT) return null;
		return (DocumentationSpecification)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(DocumentationSpecification newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, FieldofactivityannotationsPackage.COMPONENT_DOCUMENTATION_FILES__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(DocumentationSpecification newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != FieldofactivityannotationsPackage.COMPONENT_DOCUMENTATION_FILES__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, FieldofactivityannotationsPackage.DOCUMENTATION_SPECIFICATION__COMPONENT_DOCUMENTATION, DocumentationSpecification.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FieldofactivityannotationsPackage.COMPONENT_DOCUMENTATION_FILES__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getDocumentedComponent() {
		if (documentedComponent != null && documentedComponent.eIsProxy()) {
			InternalEObject oldDocumentedComponent = (InternalEObject)documentedComponent;
			documentedComponent = (Component)eResolveProxy(oldDocumentedComponent);
			if (documentedComponent != oldDocumentedComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FieldofactivityannotationsPackage.COMPONENT_DOCUMENTATION_FILES__DOCUMENTED_COMPONENT, oldDocumentedComponent, documentedComponent));
			}
		}
		return documentedComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetDocumentedComponent() {
		return documentedComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentedComponent(Component newDocumentedComponent) {
		Component oldDocumentedComponent = documentedComponent;
		documentedComponent = newDocumentedComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FieldofactivityannotationsPackage.COMPONENT_DOCUMENTATION_FILES__DOCUMENTED_COMPONENT, oldDocumentedComponent, documentedComponent));
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
			case FieldofactivityannotationsPackage.COMPONENT_DOCUMENTATION_FILES__MAINTENEANCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMainteneance()).basicAdd(otherEnd, msgs);
			case FieldofactivityannotationsPackage.COMPONENT_DOCUMENTATION_FILES__INSTRUCTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInstructions()).basicAdd(otherEnd, msgs);
			case FieldofactivityannotationsPackage.COMPONENT_DOCUMENTATION_FILES__TRAINING_INTERN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTrainingIntern()).basicAdd(otherEnd, msgs);
			case FieldofactivityannotationsPackage.COMPONENT_DOCUMENTATION_FILES__TRAINING_EXTERNAL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTrainingExternal()).basicAdd(otherEnd, msgs);
			case FieldofactivityannotationsPackage.COMPONENT_DOCUMENTATION_FILES__PARENT:
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
			case FieldofactivityannotationsPackage.COMPONENT_DOCUMENTATION_FILES__MAINTENEANCE:
				return ((InternalEList<?>)getMainteneance()).basicRemove(otherEnd, msgs);
			case FieldofactivityannotationsPackage.COMPONENT_DOCUMENTATION_FILES__INSTRUCTIONS:
				return ((InternalEList<?>)getInstructions()).basicRemove(otherEnd, msgs);
			case FieldofactivityannotationsPackage.COMPONENT_DOCUMENTATION_FILES__TRAINING_INTERN:
				return ((InternalEList<?>)getTrainingIntern()).basicRemove(otherEnd, msgs);
			case FieldofactivityannotationsPackage.COMPONENT_DOCUMENTATION_FILES__TRAINING_EXTERNAL:
				return ((InternalEList<?>)getTrainingExternal()).basicRemove(otherEnd, msgs);
			case FieldofactivityannotationsPackage.COMPONENT_DOCUMENTATION_FILES__PARENT:
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
			case FieldofactivityannotationsPackage.COMPONENT_DOCUMENTATION_FILES__PARENT:
				return eInternalContainer().eInverseRemove(this, FieldofactivityannotationsPackage.DOCUMENTATION_SPECIFICATION__COMPONENT_DOCUMENTATION, DocumentationSpecification.class, msgs);
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
			case FieldofactivityannotationsPackage.COMPONENT_DOCUMENTATION_FILES__MAINTENEANCE:
				return getMainteneance();
			case FieldofactivityannotationsPackage.COMPONENT_DOCUMENTATION_FILES__INSTRUCTIONS:
				return getInstructions();
			case FieldofactivityannotationsPackage.COMPONENT_DOCUMENTATION_FILES__TRAINING_INTERN:
				return getTrainingIntern();
			case FieldofactivityannotationsPackage.COMPONENT_DOCUMENTATION_FILES__TRAINING_EXTERNAL:
				return getTrainingExternal();
			case FieldofactivityannotationsPackage.COMPONENT_DOCUMENTATION_FILES__PARENT:
				return getParent();
			case FieldofactivityannotationsPackage.COMPONENT_DOCUMENTATION_FILES__DOCUMENTED_COMPONENT:
				if (resolve) return getDocumentedComponent();
				return basicGetDocumentedComponent();
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
			case FieldofactivityannotationsPackage.COMPONENT_DOCUMENTATION_FILES__MAINTENEANCE:
				getMainteneance().clear();
				getMainteneance().addAll((Collection<? extends MainteneanceDocumentation>)newValue);
				return;
			case FieldofactivityannotationsPackage.COMPONENT_DOCUMENTATION_FILES__INSTRUCTIONS:
				getInstructions().clear();
				getInstructions().addAll((Collection<? extends OperatorInstructions>)newValue);
				return;
			case FieldofactivityannotationsPackage.COMPONENT_DOCUMENTATION_FILES__TRAINING_INTERN:
				getTrainingIntern().clear();
				getTrainingIntern().addAll((Collection<? extends TrainingDocIntern>)newValue);
				return;
			case FieldofactivityannotationsPackage.COMPONENT_DOCUMENTATION_FILES__TRAINING_EXTERNAL:
				getTrainingExternal().clear();
				getTrainingExternal().addAll((Collection<? extends TrainingDocExternal>)newValue);
				return;
			case FieldofactivityannotationsPackage.COMPONENT_DOCUMENTATION_FILES__PARENT:
				setParent((DocumentationSpecification)newValue);
				return;
			case FieldofactivityannotationsPackage.COMPONENT_DOCUMENTATION_FILES__DOCUMENTED_COMPONENT:
				setDocumentedComponent((Component)newValue);
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
			case FieldofactivityannotationsPackage.COMPONENT_DOCUMENTATION_FILES__MAINTENEANCE:
				getMainteneance().clear();
				return;
			case FieldofactivityannotationsPackage.COMPONENT_DOCUMENTATION_FILES__INSTRUCTIONS:
				getInstructions().clear();
				return;
			case FieldofactivityannotationsPackage.COMPONENT_DOCUMENTATION_FILES__TRAINING_INTERN:
				getTrainingIntern().clear();
				return;
			case FieldofactivityannotationsPackage.COMPONENT_DOCUMENTATION_FILES__TRAINING_EXTERNAL:
				getTrainingExternal().clear();
				return;
			case FieldofactivityannotationsPackage.COMPONENT_DOCUMENTATION_FILES__PARENT:
				setParent((DocumentationSpecification)null);
				return;
			case FieldofactivityannotationsPackage.COMPONENT_DOCUMENTATION_FILES__DOCUMENTED_COMPONENT:
				setDocumentedComponent((Component)null);
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
			case FieldofactivityannotationsPackage.COMPONENT_DOCUMENTATION_FILES__MAINTENEANCE:
				return mainteneance != null && !mainteneance.isEmpty();
			case FieldofactivityannotationsPackage.COMPONENT_DOCUMENTATION_FILES__INSTRUCTIONS:
				return instructions != null && !instructions.isEmpty();
			case FieldofactivityannotationsPackage.COMPONENT_DOCUMENTATION_FILES__TRAINING_INTERN:
				return trainingIntern != null && !trainingIntern.isEmpty();
			case FieldofactivityannotationsPackage.COMPONENT_DOCUMENTATION_FILES__TRAINING_EXTERNAL:
				return trainingExternal != null && !trainingExternal.isEmpty();
			case FieldofactivityannotationsPackage.COMPONENT_DOCUMENTATION_FILES__PARENT:
				return getParent() != null;
			case FieldofactivityannotationsPackage.COMPONENT_DOCUMENTATION_FILES__DOCUMENTED_COMPONENT:
				return documentedComponent != null;
		}
		return super.eIsSet(featureID);
	}

} //ComponentDocumentationFilesImpl
