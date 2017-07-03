package edu.kit.ipd.sdq.kamp4aps.core;

import edu.kit.ipd.sdq.kamp.workplan.AbstractActivityElementType;
import fieldofactivityannotations.CalibrationConfiguration;
import fieldofactivityannotations.ComponentStockList;
import fieldofactivityannotations.Documentation;
import fieldofactivityannotations.Drawing;
import fieldofactivityannotations.HMIConfiguration;
import fieldofactivityannotations.InterfaceStockList;
import fieldofactivityannotations.MainteneanceDocumentation;
import fieldofactivityannotations.ModuleStockList;
import fieldofactivityannotations.OperatorInstructions;
import fieldofactivityannotations.StructureStockList;
import fieldofactivityannotations.TestCase;
import fieldofactivityannotations.TrainingDocExternal;
import fieldofactivityannotations.TrainingDocIntern;
import edu.kit.ipd.sdq.kamp4aps.iec.IECModel.Program;
import xPPU.ComponentRepository.Component;
import xPPU.InterfaceRepository.Interface;
import xPPU.ModuleRepository.Module;
import xPPU.StructureRepository.Structure;

public enum ActivityElementType implements AbstractActivityElementType {
	//aPS related
	COMPONENT(Component.class),
	MODULE(Module.class),
	STRUCTURE(Structure.class),
	INTERFACE(Interface.class),
	
	// annotation-related
	TESTCASE(TestCase.class),
//	DOCUMENTATION(Documentation.class),
	MAINTENEANCE_DOCUMENTATION(MainteneanceDocumentation.class),
	OPERATOR_INSTRUCTIONS(OperatorInstructions.class),
	TRAINING_DOCUMENTATION_INTERNAL(TrainingDocIntern.class),
	TRAINING_DOCUMENTATION_EXTERNAL(TrainingDocExternal.class),
	DRAWING(Drawing.class),
	HMI_CONFIG(HMIConfiguration.class),
	CALIBRATION_CONFIG(CalibrationConfiguration.class),
	
	COMPONENT_STOCKLIST(ComponentStockList.class),
	MODULE_STOCKLIST(ModuleStockList.class),
	INTERFACE_STOCKLIST(InterfaceStockList.class),
	STRUCTURE_STOCKLIST(StructureStockList.class),

	PROGRAM_TYPE(Program.class);
	
	private final Class<?> clazz;
	private final String name;
	
	private ActivityElementType(Class<?> clazz) {
		this.clazz = clazz;
		this.name = clazz.getSimpleName();
	}

	@Override
	public Class<?> getElementClass() {
		return clazz;
	}
	
	@Override
	public String getName() {
		return name;
	}

	public static ActivityElementType[] topLevelAPSActivityElementTypes() {	
		return new ActivityElementType[]{COMPONENT, MODULE, INTERFACE, STRUCTURE};
	}

}
