/**
 */
package xPPU.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import xPPU.BottleSeperator;
import xPPU.BusBox;
import xPPU.BusCable;
import xPPU.BusMaster;
import xPPU.BusSlave;
import xPPU.Cable;
import xPPU.Components;
import xPPU.Compressor;
import xPPU.Corner;
import xPPU.Cylinder;
import xPPU.Dispenser;
import xPPU.ElectronicPart;
import xPPU.Interface;
import xPPU.MechanicalAssembly;
import xPPU.MechanicalPart;
import xPPU.Motor;
import xPPU.Panel;
import xPPU.Pipe;
import xPPU.PowerCable;
import xPPU.PowerSupply;
import xPPU.Pusher;
import xPPU.Rack;
import xPPU.Sensor;
import xPPU.Splitter;
import xPPU.Structure;
import xPPU.Tank;
import xPPU.Valve;
import xPPU.XPPUPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Components</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xPPU.impl.ComponentsImpl#getParentStructure <em>Parent Structure</em>}</li>
 *   <li>{@link xPPU.impl.ComponentsImpl#getElectronicComponents <em>Electronic Components</em>}</li>
 *   <li>{@link xPPU.impl.ComponentsImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link xPPU.impl.ComponentsImpl#getMotors <em>Motors</em>}</li>
 *   <li>{@link xPPU.impl.ComponentsImpl#getMechanicalAssemblys <em>Mechanical Assemblys</em>}</li>
 *   <li>{@link xPPU.impl.ComponentsImpl#getSensors <em>Sensors</em>}</li>
 *   <li>{@link xPPU.impl.ComponentsImpl#getPipes <em>Pipes</em>}</li>
 *   <li>{@link xPPU.impl.ComponentsImpl#getCompressors <em>Compressors</em>}</li>
 *   <li>{@link xPPU.impl.ComponentsImpl#getBuscables <em>Buscables</em>}</li>
 *   <li>{@link xPPU.impl.ComponentsImpl#getBusmasters <em>Busmasters</em>}</li>
 *   <li>{@link xPPU.impl.ComponentsImpl#getBusslaves <em>Busslaves</em>}</li>
 *   <li>{@link xPPU.impl.ComponentsImpl#getBusboxes <em>Busboxes</em>}</li>
 *   <li>{@link xPPU.impl.ComponentsImpl#getCylinders <em>Cylinders</em>}</li>
 *   <li>{@link xPPU.impl.ComponentsImpl#getPowercables <em>Powercables</em>}</li>
 *   <li>{@link xPPU.impl.ComponentsImpl#getValves <em>Valves</em>}</li>
 *   <li>{@link xPPU.impl.ComponentsImpl#getMechanicalparts <em>Mechanicalparts</em>}</li>
 *   <li>{@link xPPU.impl.ComponentsImpl#getPowersupplys <em>Powersupplys</em>}</li>
 *   <li>{@link xPPU.impl.ComponentsImpl#getPushers <em>Pushers</em>}</li>
 *   <li>{@link xPPU.impl.ComponentsImpl#getCorners <em>Corners</em>}</li>
 *   <li>{@link xPPU.impl.ComponentsImpl#getDispensers <em>Dispensers</em>}</li>
 *   <li>{@link xPPU.impl.ComponentsImpl#getRacks <em>Racks</em>}</li>
 *   <li>{@link xPPU.impl.ComponentsImpl#getTanks <em>Tanks</em>}</li>
 *   <li>{@link xPPU.impl.ComponentsImpl#getSplitter <em>Splitter</em>}</li>
 *   <li>{@link xPPU.impl.ComponentsImpl#getBottleSeperator <em>Bottle Seperator</em>}</li>
 *   <li>{@link xPPU.impl.ComponentsImpl#getPanels <em>Panels</em>}</li>
 *   <li>{@link xPPU.impl.ComponentsImpl#getCables <em>Cables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentsImpl extends EObjectImpl implements Components {
	/**
	 * The cached value of the '{@link #getElectronicComponents() <em>Electronic Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectronicComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<ElectronicPart> electronicComponents;

	/**
	 * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> interfaces;

	/**
	 * The cached value of the '{@link #getMotors() <em>Motors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotors()
	 * @generated
	 * @ordered
	 */
	protected EList<Motor> motors;

	/**
	 * The cached value of the '{@link #getMechanicalAssemblys() <em>Mechanical Assemblys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMechanicalAssemblys()
	 * @generated
	 * @ordered
	 */
	protected EList<MechanicalAssembly> mechanicalAssemblys;

	/**
	 * The cached value of the '{@link #getSensors() <em>Sensors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensors()
	 * @generated
	 * @ordered
	 */
	protected EList<Sensor> sensors;

	/**
	 * The cached value of the '{@link #getPipes() <em>Pipes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPipes()
	 * @generated
	 * @ordered
	 */
	protected EList<Pipe> pipes;

	/**
	 * The cached value of the '{@link #getCompressors() <em>Compressors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressors()
	 * @generated
	 * @ordered
	 */
	protected EList<Compressor> compressors;

	/**
	 * The cached value of the '{@link #getBuscables() <em>Buscables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuscables()
	 * @generated
	 * @ordered
	 */
	protected EList<BusCable> buscables;

	/**
	 * The cached value of the '{@link #getBusmasters() <em>Busmasters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusmasters()
	 * @generated
	 * @ordered
	 */
	protected EList<BusMaster> busmasters;

	/**
	 * The cached value of the '{@link #getBusslaves() <em>Busslaves</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusslaves()
	 * @generated
	 * @ordered
	 */
	protected EList<BusSlave> busslaves;

	/**
	 * The cached value of the '{@link #getBusboxes() <em>Busboxes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusboxes()
	 * @generated
	 * @ordered
	 */
	protected EList<BusBox> busboxes;

	/**
	 * The cached value of the '{@link #getCylinders() <em>Cylinders</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCylinders()
	 * @generated
	 * @ordered
	 */
	protected EList<Cylinder> cylinders;

	/**
	 * The cached value of the '{@link #getPowercables() <em>Powercables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowercables()
	 * @generated
	 * @ordered
	 */
	protected EList<PowerCable> powercables;

	/**
	 * The cached value of the '{@link #getValves() <em>Valves</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValves()
	 * @generated
	 * @ordered
	 */
	protected EList<Valve> valves;

	/**
	 * The cached value of the '{@link #getMechanicalparts() <em>Mechanicalparts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMechanicalparts()
	 * @generated
	 * @ordered
	 */
	protected EList<MechanicalPart> mechanicalparts;

	/**
	 * The cached value of the '{@link #getPowersupplys() <em>Powersupplys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowersupplys()
	 * @generated
	 * @ordered
	 */
	protected EList<PowerSupply> powersupplys;

	/**
	 * The cached value of the '{@link #getPushers() <em>Pushers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPushers()
	 * @generated
	 * @ordered
	 */
	protected EList<Pusher> pushers;

	/**
	 * The cached value of the '{@link #getCorners() <em>Corners</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorners()
	 * @generated
	 * @ordered
	 */
	protected EList<Corner> corners;

	/**
	 * The cached value of the '{@link #getDispensers() <em>Dispensers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispensers()
	 * @generated
	 * @ordered
	 */
	protected EList<Dispenser> dispensers;

	/**
	 * The cached value of the '{@link #getRacks() <em>Racks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRacks()
	 * @generated
	 * @ordered
	 */
	protected EList<Rack> racks;

	/**
	 * The cached value of the '{@link #getTanks() <em>Tanks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTanks()
	 * @generated
	 * @ordered
	 */
	protected EList<Tank> tanks;

	/**
	 * The cached value of the '{@link #getSplitter() <em>Splitter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSplitter()
	 * @generated
	 * @ordered
	 */
	protected EList<Splitter> splitter;

	/**
	 * The cached value of the '{@link #getBottleSeperator() <em>Bottle Seperator</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottleSeperator()
	 * @generated
	 * @ordered
	 */
	protected EList<BottleSeperator> bottleSeperator;

	/**
	 * The cached value of the '{@link #getPanels() <em>Panels</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanels()
	 * @generated
	 * @ordered
	 */
	protected EList<Panel> panels;

	/**
	 * The cached value of the '{@link #getCables() <em>Cables</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCables()
	 * @generated
	 * @ordered
	 */
	protected EList<Cable> cables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XPPUPackage.Literals.COMPONENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Structure getParentStructure() {
		if (eContainerFeatureID() != XPPUPackage.COMPONENTS__PARENT_STRUCTURE) return null;
		return (Structure)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentStructure(Structure newParentStructure, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentStructure, XPPUPackage.COMPONENTS__PARENT_STRUCTURE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentStructure(Structure newParentStructure) {
		if (newParentStructure != eInternalContainer() || (eContainerFeatureID() != XPPUPackage.COMPONENTS__PARENT_STRUCTURE && newParentStructure != null)) {
			if (EcoreUtil.isAncestor(this, newParentStructure))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentStructure != null)
				msgs = ((InternalEObject)newParentStructure).eInverseAdd(this, XPPUPackage.STRUCTURE__COMPONENTS, Structure.class, msgs);
			msgs = basicSetParentStructure(newParentStructure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XPPUPackage.COMPONENTS__PARENT_STRUCTURE, newParentStructure, newParentStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElectronicPart> getElectronicComponents() {
		if (electronicComponents == null) {
			electronicComponents = new EObjectWithInverseResolvingEList<ElectronicPart>(ElectronicPart.class, this, XPPUPackage.COMPONENTS__ELECTRONIC_COMPONENTS, XPPUPackage.ELECTRONIC_PART__COMPONENT_REPOSITORY);
		}
		return electronicComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getInterfaces() {
		if (interfaces == null) {
			interfaces = new EObjectContainmentWithInverseEList<Interface>(Interface.class, this, XPPUPackage.COMPONENTS__INTERFACES, XPPUPackage.INTERFACE__COMPONENT_REPOSITORY);
		}
		return interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Motor> getMotors() {
		if (motors == null) {
			motors = new EObjectContainmentWithInverseEList<Motor>(Motor.class, this, XPPUPackage.COMPONENTS__MOTORS, XPPUPackage.MOTOR__COMPONENT_REPOSITORY);
		}
		return motors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MechanicalAssembly> getMechanicalAssemblys() {
		if (mechanicalAssemblys == null) {
			mechanicalAssemblys = new EObjectContainmentWithInverseEList<MechanicalAssembly>(MechanicalAssembly.class, this, XPPUPackage.COMPONENTS__MECHANICAL_ASSEMBLYS, XPPUPackage.MECHANICAL_ASSEMBLY__COMPONENT_REPOSITORY);
		}
		return mechanicalAssemblys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sensor> getSensors() {
		if (sensors == null) {
			sensors = new EObjectContainmentWithInverseEList<Sensor>(Sensor.class, this, XPPUPackage.COMPONENTS__SENSORS, XPPUPackage.SENSOR__COMPONENT_REPOSITORY);
		}
		return sensors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pipe> getPipes() {
		if (pipes == null) {
			pipes = new EObjectContainmentWithInverseEList<Pipe>(Pipe.class, this, XPPUPackage.COMPONENTS__PIPES, XPPUPackage.PIPE__COMPONENT_REPOSITORY);
		}
		return pipes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Compressor> getCompressors() {
		if (compressors == null) {
			compressors = new EObjectContainmentWithInverseEList<Compressor>(Compressor.class, this, XPPUPackage.COMPONENTS__COMPRESSORS, XPPUPackage.COMPRESSOR__COMPONENT_REPOSITORY);
		}
		return compressors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusCable> getBuscables() {
		if (buscables == null) {
			buscables = new EObjectContainmentEList<BusCable>(BusCable.class, this, XPPUPackage.COMPONENTS__BUSCABLES);
		}
		return buscables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusMaster> getBusmasters() {
		if (busmasters == null) {
			busmasters = new EObjectContainmentWithInverseEList<BusMaster>(BusMaster.class, this, XPPUPackage.COMPONENTS__BUSMASTERS, XPPUPackage.BUS_MASTER__COMPONENT_REPOSTITORY);
		}
		return busmasters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusSlave> getBusslaves() {
		if (busslaves == null) {
			busslaves = new EObjectContainmentWithInverseEList<BusSlave>(BusSlave.class, this, XPPUPackage.COMPONENTS__BUSSLAVES, XPPUPackage.BUS_SLAVE__COMPONENT_REPOSITORY);
		}
		return busslaves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusBox> getBusboxes() {
		if (busboxes == null) {
			busboxes = new EObjectContainmentEList<BusBox>(BusBox.class, this, XPPUPackage.COMPONENTS__BUSBOXES);
		}
		return busboxes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cylinder> getCylinders() {
		if (cylinders == null) {
			cylinders = new EObjectContainmentWithInverseEList<Cylinder>(Cylinder.class, this, XPPUPackage.COMPONENTS__CYLINDERS, XPPUPackage.CYLINDER__COMPONENT_REPOSITORY);
		}
		return cylinders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PowerCable> getPowercables() {
		if (powercables == null) {
			powercables = new EObjectContainmentEList<PowerCable>(PowerCable.class, this, XPPUPackage.COMPONENTS__POWERCABLES);
		}
		return powercables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Valve> getValves() {
		if (valves == null) {
			valves = new EObjectContainmentWithInverseEList<Valve>(Valve.class, this, XPPUPackage.COMPONENTS__VALVES, XPPUPackage.VALVE__COMPONENT_REPOSITORY);
		}
		return valves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MechanicalPart> getMechanicalparts() {
		if (mechanicalparts == null) {
			mechanicalparts = new EObjectContainmentWithInverseEList<MechanicalPart>(MechanicalPart.class, this, XPPUPackage.COMPONENTS__MECHANICALPARTS, XPPUPackage.MECHANICAL_PART__COMPONENT_REPOSITORY);
		}
		return mechanicalparts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PowerSupply> getPowersupplys() {
		if (powersupplys == null) {
			powersupplys = new EObjectContainmentWithInverseEList<PowerSupply>(PowerSupply.class, this, XPPUPackage.COMPONENTS__POWERSUPPLYS, XPPUPackage.POWER_SUPPLY__COMPONENT_REPOSITORY);
		}
		return powersupplys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pusher> getPushers() {
		if (pushers == null) {
			pushers = new EObjectWithInverseResolvingEList<Pusher>(Pusher.class, this, XPPUPackage.COMPONENTS__PUSHERS, XPPUPackage.PUSHER__COMPONENTS_REPOSITORY);
		}
		return pushers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Corner> getCorners() {
		if (corners == null) {
			corners = new EObjectWithInverseResolvingEList<Corner>(Corner.class, this, XPPUPackage.COMPONENTS__CORNERS, XPPUPackage.CORNER__COMPONENT_REPOSITORY);
		}
		return corners;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dispenser> getDispensers() {
		if (dispensers == null) {
			dispensers = new EObjectWithInverseResolvingEList<Dispenser>(Dispenser.class, this, XPPUPackage.COMPONENTS__DISPENSERS, XPPUPackage.DISPENSER__COMPONENT_REPOSITORY);
		}
		return dispensers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rack> getRacks() {
		if (racks == null) {
			racks = new EObjectWithInverseResolvingEList<Rack>(Rack.class, this, XPPUPackage.COMPONENTS__RACKS, XPPUPackage.RACK__COMPONENT_REPOSITORY);
		}
		return racks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tank> getTanks() {
		if (tanks == null) {
			tanks = new EObjectWithInverseResolvingEList<Tank>(Tank.class, this, XPPUPackage.COMPONENTS__TANKS, XPPUPackage.TANK__COMPONENT_REPOSITORY);
		}
		return tanks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Splitter> getSplitter() {
		if (splitter == null) {
			splitter = new EObjectWithInverseResolvingEList<Splitter>(Splitter.class, this, XPPUPackage.COMPONENTS__SPLITTER, XPPUPackage.SPLITTER__COMPONENT_REPOSITORY);
		}
		return splitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BottleSeperator> getBottleSeperator() {
		if (bottleSeperator == null) {
			bottleSeperator = new EObjectWithInverseResolvingEList<BottleSeperator>(BottleSeperator.class, this, XPPUPackage.COMPONENTS__BOTTLE_SEPERATOR, XPPUPackage.BOTTLE_SEPERATOR__COMPONENT_REPOSITORY);
		}
		return bottleSeperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Panel> getPanels() {
		if (panels == null) {
			panels = new EObjectWithInverseResolvingEList<Panel>(Panel.class, this, XPPUPackage.COMPONENTS__PANELS, XPPUPackage.PANEL__COMPONENT_REPOSITORY);
		}
		return panels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cable> getCables() {
		if (cables == null) {
			cables = new EObjectWithInverseResolvingEList<Cable>(Cable.class, this, XPPUPackage.COMPONENTS__CABLES, XPPUPackage.CABLE__COMPONENT_REPOSITORY);
		}
		return cables;
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
			case XPPUPackage.COMPONENTS__PARENT_STRUCTURE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentStructure((Structure)otherEnd, msgs);
			case XPPUPackage.COMPONENTS__ELECTRONIC_COMPONENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElectronicComponents()).basicAdd(otherEnd, msgs);
			case XPPUPackage.COMPONENTS__INTERFACES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInterfaces()).basicAdd(otherEnd, msgs);
			case XPPUPackage.COMPONENTS__MOTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMotors()).basicAdd(otherEnd, msgs);
			case XPPUPackage.COMPONENTS__MECHANICAL_ASSEMBLYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMechanicalAssemblys()).basicAdd(otherEnd, msgs);
			case XPPUPackage.COMPONENTS__SENSORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSensors()).basicAdd(otherEnd, msgs);
			case XPPUPackage.COMPONENTS__PIPES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPipes()).basicAdd(otherEnd, msgs);
			case XPPUPackage.COMPONENTS__COMPRESSORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCompressors()).basicAdd(otherEnd, msgs);
			case XPPUPackage.COMPONENTS__BUSMASTERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBusmasters()).basicAdd(otherEnd, msgs);
			case XPPUPackage.COMPONENTS__BUSSLAVES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBusslaves()).basicAdd(otherEnd, msgs);
			case XPPUPackage.COMPONENTS__CYLINDERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCylinders()).basicAdd(otherEnd, msgs);
			case XPPUPackage.COMPONENTS__VALVES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getValves()).basicAdd(otherEnd, msgs);
			case XPPUPackage.COMPONENTS__MECHANICALPARTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMechanicalparts()).basicAdd(otherEnd, msgs);
			case XPPUPackage.COMPONENTS__POWERSUPPLYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPowersupplys()).basicAdd(otherEnd, msgs);
			case XPPUPackage.COMPONENTS__PUSHERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPushers()).basicAdd(otherEnd, msgs);
			case XPPUPackage.COMPONENTS__CORNERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCorners()).basicAdd(otherEnd, msgs);
			case XPPUPackage.COMPONENTS__DISPENSERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDispensers()).basicAdd(otherEnd, msgs);
			case XPPUPackage.COMPONENTS__RACKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRacks()).basicAdd(otherEnd, msgs);
			case XPPUPackage.COMPONENTS__TANKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTanks()).basicAdd(otherEnd, msgs);
			case XPPUPackage.COMPONENTS__SPLITTER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSplitter()).basicAdd(otherEnd, msgs);
			case XPPUPackage.COMPONENTS__BOTTLE_SEPERATOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBottleSeperator()).basicAdd(otherEnd, msgs);
			case XPPUPackage.COMPONENTS__PANELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPanels()).basicAdd(otherEnd, msgs);
			case XPPUPackage.COMPONENTS__CABLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCables()).basicAdd(otherEnd, msgs);
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
			case XPPUPackage.COMPONENTS__PARENT_STRUCTURE:
				return basicSetParentStructure(null, msgs);
			case XPPUPackage.COMPONENTS__ELECTRONIC_COMPONENTS:
				return ((InternalEList<?>)getElectronicComponents()).basicRemove(otherEnd, msgs);
			case XPPUPackage.COMPONENTS__INTERFACES:
				return ((InternalEList<?>)getInterfaces()).basicRemove(otherEnd, msgs);
			case XPPUPackage.COMPONENTS__MOTORS:
				return ((InternalEList<?>)getMotors()).basicRemove(otherEnd, msgs);
			case XPPUPackage.COMPONENTS__MECHANICAL_ASSEMBLYS:
				return ((InternalEList<?>)getMechanicalAssemblys()).basicRemove(otherEnd, msgs);
			case XPPUPackage.COMPONENTS__SENSORS:
				return ((InternalEList<?>)getSensors()).basicRemove(otherEnd, msgs);
			case XPPUPackage.COMPONENTS__PIPES:
				return ((InternalEList<?>)getPipes()).basicRemove(otherEnd, msgs);
			case XPPUPackage.COMPONENTS__COMPRESSORS:
				return ((InternalEList<?>)getCompressors()).basicRemove(otherEnd, msgs);
			case XPPUPackage.COMPONENTS__BUSCABLES:
				return ((InternalEList<?>)getBuscables()).basicRemove(otherEnd, msgs);
			case XPPUPackage.COMPONENTS__BUSMASTERS:
				return ((InternalEList<?>)getBusmasters()).basicRemove(otherEnd, msgs);
			case XPPUPackage.COMPONENTS__BUSSLAVES:
				return ((InternalEList<?>)getBusslaves()).basicRemove(otherEnd, msgs);
			case XPPUPackage.COMPONENTS__BUSBOXES:
				return ((InternalEList<?>)getBusboxes()).basicRemove(otherEnd, msgs);
			case XPPUPackage.COMPONENTS__CYLINDERS:
				return ((InternalEList<?>)getCylinders()).basicRemove(otherEnd, msgs);
			case XPPUPackage.COMPONENTS__POWERCABLES:
				return ((InternalEList<?>)getPowercables()).basicRemove(otherEnd, msgs);
			case XPPUPackage.COMPONENTS__VALVES:
				return ((InternalEList<?>)getValves()).basicRemove(otherEnd, msgs);
			case XPPUPackage.COMPONENTS__MECHANICALPARTS:
				return ((InternalEList<?>)getMechanicalparts()).basicRemove(otherEnd, msgs);
			case XPPUPackage.COMPONENTS__POWERSUPPLYS:
				return ((InternalEList<?>)getPowersupplys()).basicRemove(otherEnd, msgs);
			case XPPUPackage.COMPONENTS__PUSHERS:
				return ((InternalEList<?>)getPushers()).basicRemove(otherEnd, msgs);
			case XPPUPackage.COMPONENTS__CORNERS:
				return ((InternalEList<?>)getCorners()).basicRemove(otherEnd, msgs);
			case XPPUPackage.COMPONENTS__DISPENSERS:
				return ((InternalEList<?>)getDispensers()).basicRemove(otherEnd, msgs);
			case XPPUPackage.COMPONENTS__RACKS:
				return ((InternalEList<?>)getRacks()).basicRemove(otherEnd, msgs);
			case XPPUPackage.COMPONENTS__TANKS:
				return ((InternalEList<?>)getTanks()).basicRemove(otherEnd, msgs);
			case XPPUPackage.COMPONENTS__SPLITTER:
				return ((InternalEList<?>)getSplitter()).basicRemove(otherEnd, msgs);
			case XPPUPackage.COMPONENTS__BOTTLE_SEPERATOR:
				return ((InternalEList<?>)getBottleSeperator()).basicRemove(otherEnd, msgs);
			case XPPUPackage.COMPONENTS__PANELS:
				return ((InternalEList<?>)getPanels()).basicRemove(otherEnd, msgs);
			case XPPUPackage.COMPONENTS__CABLES:
				return ((InternalEList<?>)getCables()).basicRemove(otherEnd, msgs);
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
			case XPPUPackage.COMPONENTS__PARENT_STRUCTURE:
				return eInternalContainer().eInverseRemove(this, XPPUPackage.STRUCTURE__COMPONENTS, Structure.class, msgs);
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
			case XPPUPackage.COMPONENTS__PARENT_STRUCTURE:
				return getParentStructure();
			case XPPUPackage.COMPONENTS__ELECTRONIC_COMPONENTS:
				return getElectronicComponents();
			case XPPUPackage.COMPONENTS__INTERFACES:
				return getInterfaces();
			case XPPUPackage.COMPONENTS__MOTORS:
				return getMotors();
			case XPPUPackage.COMPONENTS__MECHANICAL_ASSEMBLYS:
				return getMechanicalAssemblys();
			case XPPUPackage.COMPONENTS__SENSORS:
				return getSensors();
			case XPPUPackage.COMPONENTS__PIPES:
				return getPipes();
			case XPPUPackage.COMPONENTS__COMPRESSORS:
				return getCompressors();
			case XPPUPackage.COMPONENTS__BUSCABLES:
				return getBuscables();
			case XPPUPackage.COMPONENTS__BUSMASTERS:
				return getBusmasters();
			case XPPUPackage.COMPONENTS__BUSSLAVES:
				return getBusslaves();
			case XPPUPackage.COMPONENTS__BUSBOXES:
				return getBusboxes();
			case XPPUPackage.COMPONENTS__CYLINDERS:
				return getCylinders();
			case XPPUPackage.COMPONENTS__POWERCABLES:
				return getPowercables();
			case XPPUPackage.COMPONENTS__VALVES:
				return getValves();
			case XPPUPackage.COMPONENTS__MECHANICALPARTS:
				return getMechanicalparts();
			case XPPUPackage.COMPONENTS__POWERSUPPLYS:
				return getPowersupplys();
			case XPPUPackage.COMPONENTS__PUSHERS:
				return getPushers();
			case XPPUPackage.COMPONENTS__CORNERS:
				return getCorners();
			case XPPUPackage.COMPONENTS__DISPENSERS:
				return getDispensers();
			case XPPUPackage.COMPONENTS__RACKS:
				return getRacks();
			case XPPUPackage.COMPONENTS__TANKS:
				return getTanks();
			case XPPUPackage.COMPONENTS__SPLITTER:
				return getSplitter();
			case XPPUPackage.COMPONENTS__BOTTLE_SEPERATOR:
				return getBottleSeperator();
			case XPPUPackage.COMPONENTS__PANELS:
				return getPanels();
			case XPPUPackage.COMPONENTS__CABLES:
				return getCables();
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
			case XPPUPackage.COMPONENTS__PARENT_STRUCTURE:
				setParentStructure((Structure)newValue);
				return;
			case XPPUPackage.COMPONENTS__ELECTRONIC_COMPONENTS:
				getElectronicComponents().clear();
				getElectronicComponents().addAll((Collection<? extends ElectronicPart>)newValue);
				return;
			case XPPUPackage.COMPONENTS__INTERFACES:
				getInterfaces().clear();
				getInterfaces().addAll((Collection<? extends Interface>)newValue);
				return;
			case XPPUPackage.COMPONENTS__MOTORS:
				getMotors().clear();
				getMotors().addAll((Collection<? extends Motor>)newValue);
				return;
			case XPPUPackage.COMPONENTS__MECHANICAL_ASSEMBLYS:
				getMechanicalAssemblys().clear();
				getMechanicalAssemblys().addAll((Collection<? extends MechanicalAssembly>)newValue);
				return;
			case XPPUPackage.COMPONENTS__SENSORS:
				getSensors().clear();
				getSensors().addAll((Collection<? extends Sensor>)newValue);
				return;
			case XPPUPackage.COMPONENTS__PIPES:
				getPipes().clear();
				getPipes().addAll((Collection<? extends Pipe>)newValue);
				return;
			case XPPUPackage.COMPONENTS__COMPRESSORS:
				getCompressors().clear();
				getCompressors().addAll((Collection<? extends Compressor>)newValue);
				return;
			case XPPUPackage.COMPONENTS__BUSCABLES:
				getBuscables().clear();
				getBuscables().addAll((Collection<? extends BusCable>)newValue);
				return;
			case XPPUPackage.COMPONENTS__BUSMASTERS:
				getBusmasters().clear();
				getBusmasters().addAll((Collection<? extends BusMaster>)newValue);
				return;
			case XPPUPackage.COMPONENTS__BUSSLAVES:
				getBusslaves().clear();
				getBusslaves().addAll((Collection<? extends BusSlave>)newValue);
				return;
			case XPPUPackage.COMPONENTS__BUSBOXES:
				getBusboxes().clear();
				getBusboxes().addAll((Collection<? extends BusBox>)newValue);
				return;
			case XPPUPackage.COMPONENTS__CYLINDERS:
				getCylinders().clear();
				getCylinders().addAll((Collection<? extends Cylinder>)newValue);
				return;
			case XPPUPackage.COMPONENTS__POWERCABLES:
				getPowercables().clear();
				getPowercables().addAll((Collection<? extends PowerCable>)newValue);
				return;
			case XPPUPackage.COMPONENTS__VALVES:
				getValves().clear();
				getValves().addAll((Collection<? extends Valve>)newValue);
				return;
			case XPPUPackage.COMPONENTS__MECHANICALPARTS:
				getMechanicalparts().clear();
				getMechanicalparts().addAll((Collection<? extends MechanicalPart>)newValue);
				return;
			case XPPUPackage.COMPONENTS__POWERSUPPLYS:
				getPowersupplys().clear();
				getPowersupplys().addAll((Collection<? extends PowerSupply>)newValue);
				return;
			case XPPUPackage.COMPONENTS__PUSHERS:
				getPushers().clear();
				getPushers().addAll((Collection<? extends Pusher>)newValue);
				return;
			case XPPUPackage.COMPONENTS__CORNERS:
				getCorners().clear();
				getCorners().addAll((Collection<? extends Corner>)newValue);
				return;
			case XPPUPackage.COMPONENTS__DISPENSERS:
				getDispensers().clear();
				getDispensers().addAll((Collection<? extends Dispenser>)newValue);
				return;
			case XPPUPackage.COMPONENTS__RACKS:
				getRacks().clear();
				getRacks().addAll((Collection<? extends Rack>)newValue);
				return;
			case XPPUPackage.COMPONENTS__TANKS:
				getTanks().clear();
				getTanks().addAll((Collection<? extends Tank>)newValue);
				return;
			case XPPUPackage.COMPONENTS__SPLITTER:
				getSplitter().clear();
				getSplitter().addAll((Collection<? extends Splitter>)newValue);
				return;
			case XPPUPackage.COMPONENTS__BOTTLE_SEPERATOR:
				getBottleSeperator().clear();
				getBottleSeperator().addAll((Collection<? extends BottleSeperator>)newValue);
				return;
			case XPPUPackage.COMPONENTS__PANELS:
				getPanels().clear();
				getPanels().addAll((Collection<? extends Panel>)newValue);
				return;
			case XPPUPackage.COMPONENTS__CABLES:
				getCables().clear();
				getCables().addAll((Collection<? extends Cable>)newValue);
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
			case XPPUPackage.COMPONENTS__PARENT_STRUCTURE:
				setParentStructure((Structure)null);
				return;
			case XPPUPackage.COMPONENTS__ELECTRONIC_COMPONENTS:
				getElectronicComponents().clear();
				return;
			case XPPUPackage.COMPONENTS__INTERFACES:
				getInterfaces().clear();
				return;
			case XPPUPackage.COMPONENTS__MOTORS:
				getMotors().clear();
				return;
			case XPPUPackage.COMPONENTS__MECHANICAL_ASSEMBLYS:
				getMechanicalAssemblys().clear();
				return;
			case XPPUPackage.COMPONENTS__SENSORS:
				getSensors().clear();
				return;
			case XPPUPackage.COMPONENTS__PIPES:
				getPipes().clear();
				return;
			case XPPUPackage.COMPONENTS__COMPRESSORS:
				getCompressors().clear();
				return;
			case XPPUPackage.COMPONENTS__BUSCABLES:
				getBuscables().clear();
				return;
			case XPPUPackage.COMPONENTS__BUSMASTERS:
				getBusmasters().clear();
				return;
			case XPPUPackage.COMPONENTS__BUSSLAVES:
				getBusslaves().clear();
				return;
			case XPPUPackage.COMPONENTS__BUSBOXES:
				getBusboxes().clear();
				return;
			case XPPUPackage.COMPONENTS__CYLINDERS:
				getCylinders().clear();
				return;
			case XPPUPackage.COMPONENTS__POWERCABLES:
				getPowercables().clear();
				return;
			case XPPUPackage.COMPONENTS__VALVES:
				getValves().clear();
				return;
			case XPPUPackage.COMPONENTS__MECHANICALPARTS:
				getMechanicalparts().clear();
				return;
			case XPPUPackage.COMPONENTS__POWERSUPPLYS:
				getPowersupplys().clear();
				return;
			case XPPUPackage.COMPONENTS__PUSHERS:
				getPushers().clear();
				return;
			case XPPUPackage.COMPONENTS__CORNERS:
				getCorners().clear();
				return;
			case XPPUPackage.COMPONENTS__DISPENSERS:
				getDispensers().clear();
				return;
			case XPPUPackage.COMPONENTS__RACKS:
				getRacks().clear();
				return;
			case XPPUPackage.COMPONENTS__TANKS:
				getTanks().clear();
				return;
			case XPPUPackage.COMPONENTS__SPLITTER:
				getSplitter().clear();
				return;
			case XPPUPackage.COMPONENTS__BOTTLE_SEPERATOR:
				getBottleSeperator().clear();
				return;
			case XPPUPackage.COMPONENTS__PANELS:
				getPanels().clear();
				return;
			case XPPUPackage.COMPONENTS__CABLES:
				getCables().clear();
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
			case XPPUPackage.COMPONENTS__PARENT_STRUCTURE:
				return getParentStructure() != null;
			case XPPUPackage.COMPONENTS__ELECTRONIC_COMPONENTS:
				return electronicComponents != null && !electronicComponents.isEmpty();
			case XPPUPackage.COMPONENTS__INTERFACES:
				return interfaces != null && !interfaces.isEmpty();
			case XPPUPackage.COMPONENTS__MOTORS:
				return motors != null && !motors.isEmpty();
			case XPPUPackage.COMPONENTS__MECHANICAL_ASSEMBLYS:
				return mechanicalAssemblys != null && !mechanicalAssemblys.isEmpty();
			case XPPUPackage.COMPONENTS__SENSORS:
				return sensors != null && !sensors.isEmpty();
			case XPPUPackage.COMPONENTS__PIPES:
				return pipes != null && !pipes.isEmpty();
			case XPPUPackage.COMPONENTS__COMPRESSORS:
				return compressors != null && !compressors.isEmpty();
			case XPPUPackage.COMPONENTS__BUSCABLES:
				return buscables != null && !buscables.isEmpty();
			case XPPUPackage.COMPONENTS__BUSMASTERS:
				return busmasters != null && !busmasters.isEmpty();
			case XPPUPackage.COMPONENTS__BUSSLAVES:
				return busslaves != null && !busslaves.isEmpty();
			case XPPUPackage.COMPONENTS__BUSBOXES:
				return busboxes != null && !busboxes.isEmpty();
			case XPPUPackage.COMPONENTS__CYLINDERS:
				return cylinders != null && !cylinders.isEmpty();
			case XPPUPackage.COMPONENTS__POWERCABLES:
				return powercables != null && !powercables.isEmpty();
			case XPPUPackage.COMPONENTS__VALVES:
				return valves != null && !valves.isEmpty();
			case XPPUPackage.COMPONENTS__MECHANICALPARTS:
				return mechanicalparts != null && !mechanicalparts.isEmpty();
			case XPPUPackage.COMPONENTS__POWERSUPPLYS:
				return powersupplys != null && !powersupplys.isEmpty();
			case XPPUPackage.COMPONENTS__PUSHERS:
				return pushers != null && !pushers.isEmpty();
			case XPPUPackage.COMPONENTS__CORNERS:
				return corners != null && !corners.isEmpty();
			case XPPUPackage.COMPONENTS__DISPENSERS:
				return dispensers != null && !dispensers.isEmpty();
			case XPPUPackage.COMPONENTS__RACKS:
				return racks != null && !racks.isEmpty();
			case XPPUPackage.COMPONENTS__TANKS:
				return tanks != null && !tanks.isEmpty();
			case XPPUPackage.COMPONENTS__SPLITTER:
				return splitter != null && !splitter.isEmpty();
			case XPPUPackage.COMPONENTS__BOTTLE_SEPERATOR:
				return bottleSeperator != null && !bottleSeperator.isEmpty();
			case XPPUPackage.COMPONENTS__PANELS:
				return panels != null && !panels.isEmpty();
			case XPPUPackage.COMPONENTS__CABLES:
				return cables != null && !cables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentsImpl
