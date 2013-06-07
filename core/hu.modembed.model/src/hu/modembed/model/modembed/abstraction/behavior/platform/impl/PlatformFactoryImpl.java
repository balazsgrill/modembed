/**
 */
package hu.modembed.model.modembed.abstraction.behavior.platform.impl;

import hu.modembed.model.modembed.abstraction.behavior.platform.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlatformFactoryImpl extends EFactoryImpl implements PlatformFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PlatformFactory init() {
		try {
			PlatformFactory thePlatformFactory = (PlatformFactory)EPackage.Registry.INSTANCE.getEFactory("http://modembed.hu/abstraction/behavior/platform"); 
			if (thePlatformFactory != null) {
				return thePlatformFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PlatformFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PlatformPackage.OPERATION_DEFINITION: return createOperationDefinition();
			case PlatformPackage.OPERATION_ARGUMENT: return createOperationArgument();
			case PlatformPackage.INSTRUCTION_CALL_OPERATION_STEP: return createInstructionCallOperationStep();
			case PlatformPackage.INSTRUCTION_PARAMETER_CONSTANT_VALUE: return createInstructionParameterConstantValue();
			case PlatformPackage.INSTRUCTION_PARAMETER_MAPPING: return createInstructionParameterMapping();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationDefinition createOperationDefinition() {
		OperationDefinitionImpl operationDefinition = new OperationDefinitionImpl();
		return operationDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationArgument createOperationArgument() {
		OperationArgumentImpl operationArgument = new OperationArgumentImpl();
		return operationArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionCallOperationStep createInstructionCallOperationStep() {
		InstructionCallOperationStepImpl instructionCallOperationStep = new InstructionCallOperationStepImpl();
		return instructionCallOperationStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionParameterConstantValue createInstructionParameterConstantValue() {
		InstructionParameterConstantValueImpl instructionParameterConstantValue = new InstructionParameterConstantValueImpl();
		return instructionParameterConstantValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionParameterMapping createInstructionParameterMapping() {
		InstructionParameterMappingImpl instructionParameterMapping = new InstructionParameterMappingImpl();
		return instructionParameterMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformPackage getPlatformPackage() {
		return (PlatformPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PlatformPackage getPackage() {
		return PlatformPackage.eINSTANCE;
	}

} //PlatformFactoryImpl
