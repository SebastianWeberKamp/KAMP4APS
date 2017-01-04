/**
 * Copyright 2005-2009 by SDQ, IPD, University of Karlsruhe, Germany
 */
package org.palladiosimulator.pcm.seff.impl;

import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.RepositoryPackage;
import org.palladiosimulator.pcm.repository.Signature;
import org.palladiosimulator.pcm.seff.SeffPackage;
import org.palladiosimulator.pcm.seff.ServiceEffectSpecification;
import org.palladiosimulator.pcm.seff.util.SeffValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Service Effect Specification</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.seff.impl.ServiceEffectSpecificationImpl#getSeffTypeID <em>Seff Type ID</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.seff.impl.ServiceEffectSpecificationImpl#getDescribedService__SEFF <em>Described Service SEFF</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.seff.impl.ServiceEffectSpecificationImpl#getBasicComponent_ServiceEffectSpecification <em>Basic Component Service Effect Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ServiceEffectSpecificationImpl extends CDOObjectImpl implements ServiceEffectSpecification {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2005-2015 by palladiosimulator.org";

	/**
	 * The default value of the '{@link #getSeffTypeID() <em>Seff Type ID</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getSeffTypeID()
	 * @generated
	 * @ordered
	 */
	protected static final String SEFF_TYPE_ID_EDEFAULT = "1";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceEffectSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SeffPackage.Literals.SERVICE_EFFECT_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSeffTypeID() {
		return (String) eDynamicGet(SeffPackage.SERVICE_EFFECT_SPECIFICATION__SEFF_TYPE_ID,
				SeffPackage.Literals.SERVICE_EFFECT_SPECIFICATION__SEFF_TYPE_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeffTypeID(String newSeffTypeID) {
		eDynamicSet(SeffPackage.SERVICE_EFFECT_SPECIFICATION__SEFF_TYPE_ID,
				SeffPackage.Literals.SERVICE_EFFECT_SPECIFICATION__SEFF_TYPE_ID, newSeffTypeID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signature getDescribedService__SEFF() {
		return (Signature) eDynamicGet(SeffPackage.SERVICE_EFFECT_SPECIFICATION__DESCRIBED_SERVICE_SEFF,
				SeffPackage.Literals.SERVICE_EFFECT_SPECIFICATION__DESCRIBED_SERVICE_SEFF, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Signature basicGetDescribedService__SEFF() {
		return (Signature) eDynamicGet(SeffPackage.SERVICE_EFFECT_SPECIFICATION__DESCRIBED_SERVICE_SEFF,
				SeffPackage.Literals.SERVICE_EFFECT_SPECIFICATION__DESCRIBED_SERVICE_SEFF, false, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescribedService__SEFF(Signature newDescribedService__SEFF) {
		eDynamicSet(SeffPackage.SERVICE_EFFECT_SPECIFICATION__DESCRIBED_SERVICE_SEFF,
				SeffPackage.Literals.SERVICE_EFFECT_SPECIFICATION__DESCRIBED_SERVICE_SEFF, newDescribedService__SEFF);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasicComponent getBasicComponent_ServiceEffectSpecification() {
		return (BasicComponent) eDynamicGet(
				SeffPackage.SERVICE_EFFECT_SPECIFICATION__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION,
				SeffPackage.Literals.SERVICE_EFFECT_SPECIFICATION__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION, true,
				true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasicComponent_ServiceEffectSpecification(
			BasicComponent newBasicComponent_ServiceEffectSpecification, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newBasicComponent_ServiceEffectSpecification,
				SeffPackage.SERVICE_EFFECT_SPECIFICATION__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBasicComponent_ServiceEffectSpecification(
			BasicComponent newBasicComponent_ServiceEffectSpecification) {
		eDynamicSet(SeffPackage.SERVICE_EFFECT_SPECIFICATION__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION,
				SeffPackage.Literals.SERVICE_EFFECT_SPECIFICATION__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION,
				newBasicComponent_ServiceEffectSpecification);
	}

	/**
	 * The cached OCL expression body for the '{@link #ReferencedSignatureMustBelongToInterfaceReferencedByProvidedRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Referenced Signature Must Belong To Interface Referenced By Provided Role</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #ReferencedSignatureMustBelongToInterfaceReferencedByProvidedRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCED_SIGNATURE_MUST_BELONG_TO_INTERFACE_REFERENCED_BY_PROVIDED_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "if self.describedService__SEFF.oclIsKindOf(pcm::repository::OperationSignature) then\n"
			+ "	self.basicComponent_ServiceEffectSpecification.providedRoles_InterfaceProvidingEntity->exists(p | p.oclIsKindOf(pcm::repository::OperationProvidedRole) and (p.oclAsType(pcm::repository::OperationProvidedRole).providedInterface__OperationProvidedRole = self.describedService__SEFF.oclAsType(pcm::repository::OperationSignature).interface__OperationSignature))\n"
			+ "else\n" + "	if self.describedService__SEFF.oclIsKindOf(pcm::repository::EventType) then\n"
			+ "		self.basicComponent_ServiceEffectSpecification.providedRoles_InterfaceProvidingEntity->exists(p | p.oclIsKindOf(pcm::repository::SinkRole) and (p.oclAsType(pcm::repository::SinkRole).eventGroup__SinkRole = self.describedService__SEFF.oclAsType(pcm::repository::EventType).eventGroup__EventType))\n"
			+ "	else\n" + "		true\n" + "	endif\n" + "endif";

	/**
	 * The cached OCL invariant for the '{@link #ReferencedSignatureMustBelongToInterfaceReferencedByProvidedRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Referenced Signature Must Belong To Interface Referenced By Provided Role</em>}' invariant operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #ReferencedSignatureMustBelongToInterfaceReferencedByProvidedRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint REFERENCED_SIGNATURE_MUST_BELONG_TO_INTERFACE_REFERENCED_BY_PROVIDED_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean ReferencedSignatureMustBelongToInterfaceReferencedByProvidedRole(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (REFERENCED_SIGNATURE_MUST_BELONG_TO_INTERFACE_REFERENCED_BY_PROVIDED_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SeffPackage.Literals.SERVICE_EFFECT_SPECIFICATION);
			try {
				REFERENCED_SIGNATURE_MUST_BELONG_TO_INTERFACE_REFERENCED_BY_PROVIDED_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper
						.createInvariant(
								REFERENCED_SIGNATURE_MUST_BELONG_TO_INTERFACE_REFERENCED_BY_PROVIDED_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV
				.createQuery(
						REFERENCED_SIGNATURE_MUST_BELONG_TO_INTERFACE_REFERENCED_BY_PROVIDED_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV)
				.check(this)) {
			if (diagnostics != null) {
				diagnostics
						.add(new BasicDiagnostic(Diagnostic.ERROR, SeffValidator.DIAGNOSTIC_SOURCE,
								SeffValidator.SERVICE_EFFECT_SPECIFICATION__REFERENCED_SIGNATURE_MUST_BELONG_TO_INTERFACE_REFERENCED_BY_PROVIDED_ROLE,
								EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic",
										new Object[] {
												"ReferencedSignatureMustBelongToInterfaceReferencedByProvidedRole",
												EObjectValidator.getObjectLabel(this, context) }),
						new Object[] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SeffPackage.SERVICE_EFFECT_SPECIFICATION__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetBasicComponent_ServiceEffectSpecification((BasicComponent) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SeffPackage.SERVICE_EFFECT_SPECIFICATION__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION:
			return basicSetBasicComponent_ServiceEffectSpecification(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case SeffPackage.SERVICE_EFFECT_SPECIFICATION__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION:
			return eInternalContainer().eInverseRemove(this,
					RepositoryPackage.BASIC_COMPONENT__SERVICE_EFFECT_SPECIFICATIONS_BASIC_COMPONENT,
					BasicComponent.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SeffPackage.SERVICE_EFFECT_SPECIFICATION__SEFF_TYPE_ID:
			return getSeffTypeID();
		case SeffPackage.SERVICE_EFFECT_SPECIFICATION__DESCRIBED_SERVICE_SEFF:
			if (resolve)
				return getDescribedService__SEFF();
			return basicGetDescribedService__SEFF();
		case SeffPackage.SERVICE_EFFECT_SPECIFICATION__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION:
			return getBasicComponent_ServiceEffectSpecification();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SeffPackage.SERVICE_EFFECT_SPECIFICATION__SEFF_TYPE_ID:
			setSeffTypeID((String) newValue);
			return;
		case SeffPackage.SERVICE_EFFECT_SPECIFICATION__DESCRIBED_SERVICE_SEFF:
			setDescribedService__SEFF((Signature) newValue);
			return;
		case SeffPackage.SERVICE_EFFECT_SPECIFICATION__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION:
			setBasicComponent_ServiceEffectSpecification((BasicComponent) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SeffPackage.SERVICE_EFFECT_SPECIFICATION__SEFF_TYPE_ID:
			setSeffTypeID(SEFF_TYPE_ID_EDEFAULT);
			return;
		case SeffPackage.SERVICE_EFFECT_SPECIFICATION__DESCRIBED_SERVICE_SEFF:
			setDescribedService__SEFF((Signature) null);
			return;
		case SeffPackage.SERVICE_EFFECT_SPECIFICATION__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION:
			setBasicComponent_ServiceEffectSpecification((BasicComponent) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SeffPackage.SERVICE_EFFECT_SPECIFICATION__SEFF_TYPE_ID:
			return SEFF_TYPE_ID_EDEFAULT == null ? getSeffTypeID() != null
					: !SEFF_TYPE_ID_EDEFAULT.equals(getSeffTypeID());
		case SeffPackage.SERVICE_EFFECT_SPECIFICATION__DESCRIBED_SERVICE_SEFF:
			return basicGetDescribedService__SEFF() != null;
		case SeffPackage.SERVICE_EFFECT_SPECIFICATION__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION:
			return getBasicComponent_ServiceEffectSpecification() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * The cached environment for evaluating OCL expressions.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final OCL EOCL_ENV = OCL.newInstance();

} // ServiceEffectSpecificationImpl
