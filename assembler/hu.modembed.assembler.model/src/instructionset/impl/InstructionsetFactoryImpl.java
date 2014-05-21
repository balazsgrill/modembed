/**
 */
package instructionset.impl;

import instructionset.*;

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
public class InstructionsetFactoryImpl extends EFactoryImpl implements InstructionsetFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InstructionsetFactory init() {
		try {
			InstructionsetFactory theInstructionsetFactory = (InstructionsetFactory)EPackage.Registry.INSTANCE.getEFactory(InstructionsetPackage.eNS_URI);
			if (theInstructionsetFactory != null) {
				return theInstructionsetFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InstructionsetFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionsetFactoryImpl() {
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
			case InstructionsetPackage.INSTRUCTION_SET: return createInstructionSet();
			case InstructionsetPackage.INSTRUCTION: return createInstruction();
			case InstructionsetPackage.INSTRUCTION_PARAMETER: return createInstructionParameter();
			case InstructionsetPackage.INSTRUCTION_WORD: return createInstructionWord();
			case InstructionsetPackage.PARAMETER_SECTION: return createParameterSection();
			case InstructionsetPackage.CONSTANT_SECTION: return createConstantSection();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionSet createInstructionSet() {
		InstructionSetImpl instructionSet = new InstructionSetImpl();
		return instructionSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instruction createInstruction() {
		InstructionImpl instruction = new InstructionImpl();
		return instruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionParameter createInstructionParameter() {
		InstructionParameterImpl instructionParameter = new InstructionParameterImpl();
		return instructionParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionWord createInstructionWord() {
		InstructionWordImpl instructionWord = new InstructionWordImpl();
		return instructionWord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterSection createParameterSection() {
		ParameterSectionImpl parameterSection = new ParameterSectionImpl();
		return parameterSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantSection createConstantSection() {
		ConstantSectionImpl constantSection = new ConstantSectionImpl();
		return constantSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionsetPackage getInstructionsetPackage() {
		return (InstructionsetPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InstructionsetPackage getPackage() {
		return InstructionsetPackage.eINSTANCE;
	}

} //InstructionsetFactoryImpl
