/**
 */
package xPPU.ComponentRepository.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>ComponentRepository</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentRepositoryTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new ComponentRepositoryTests("ComponentRepository Tests");
		suite.addTestSuite(SimpleMotorTest.class);
		suite.addTestSuite(RegularRampTest.class);
		suite.addTestSuite(SensorTest.class);
		suite.addTestSuite(OpticalSensorTest.class);
		suite.addTestSuite(InductiveSensorTest.class);
		suite.addTestSuite(PresenceSensorTest.class);
		suite.addTestSuite(PneumaticPipeTest.class);
		suite.addTestSuite(CompressorTest.class);
		suite.addTestSuite(PowerCableTest.class);
		suite.addTestSuite(ProportionalCylinderTest.class);
		suite.addTestSuite(BistableCylinderTest.class);
		suite.addTestSuite(RackTest.class);
		suite.addTestSuite(CornerTest.class);
		suite.addTestSuite(RegularValveTest.class);
		suite.addTestSuite(TankTest.class);
		suite.addTestSuite(DispenserTest.class);
		suite.addTestSuite(BottleSeperatorTest.class);
		suite.addTestSuite(PowerSupplyTest.class);
		suite.addTestSuite(VacuumGripperTest.class);
		suite.addTestSuite(ConveyorBeltTest.class);
		suite.addTestSuite(FrameTest.class);
		suite.addTestSuite(RubberBandTest.class);
		suite.addTestSuite(PusherTest.class);
		suite.addTestSuite(TurningTableTest.class);
		suite.addTestSuite(ControllerTest.class);
		suite.addTestSuite(LogicalWiringTest.class);
		suite.addTestSuite(ArmTest.class);
		suite.addTestSuite(TableTest.class);
		suite.addTestSuite(GripperPartTest.class);
		suite.addTestSuite(MicroswitchModuleTest.class);
		suite.addTestSuite(VacuumSwitchTest.class);
		suite.addTestSuite(ReedSwitchTest.class);
		suite.addTestSuite(PowerSplitterTest.class);
		suite.addTestSuite(WaterSplitterTest.class);
		suite.addTestSuite(PneumaticSplitterTest.class);
		suite.addTestSuite(CylinderPartTest.class);
		suite.addTestSuite(MonostableCylinderTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentRepositoryTests(String name) {
		super(name);
	}

} //ComponentRepositoryTests
