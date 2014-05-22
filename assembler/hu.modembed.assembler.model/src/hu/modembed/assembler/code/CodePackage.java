/**
 */
package hu.modembed.assembler.code;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hu.modembed.assembler.code.CodeFactory
 * @model kind="package"
 * @generated
 */
public interface CodePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "code";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://modembed.hu/assembler/code";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "code";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CodePackage eINSTANCE = hu.modembed.assembler.code.impl.CodePackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.modembed.assembler.code.impl.AssemblerObjectImpl <em>Assembler Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.assembler.code.impl.AssemblerObjectImpl
	 * @see hu.modembed.assembler.code.impl.CodePackageImpl#getAssemblerObject()
	 * @generated
	 */
	int ASSEMBLER_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Instructionset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLER_OBJECT__INSTRUCTIONSET = 0;

	/**
	 * The feature id for the '<em><b>Start Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLER_OBJECT__START_ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLER_OBJECT__INSTRUCTIONS = 2;

	/**
	 * The number of structural features of the '<em>Assembler Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLER_OBJECT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Assembler Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLER_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.modembed.assembler.code.impl.InstructionCallImpl <em>Instruction Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.assembler.code.impl.InstructionCallImpl
	 * @see hu.modembed.assembler.code.impl.CodePackageImpl#getInstructionCall()
	 * @generated
	 */
	int INSTRUCTION_CALL = 1;

	/**
	 * The feature id for the '<em><b>Instruction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_CALL__INSTRUCTION = 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_CALL__ARGUMENTS = 1;

	/**
	 * The number of structural features of the '<em>Instruction Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_CALL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Instruction Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_CALL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.modembed.assembler.code.impl.InstructionCallArgumentImpl <em>Instruction Call Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.assembler.code.impl.InstructionCallArgumentImpl
	 * @see hu.modembed.assembler.code.impl.CodePackageImpl#getInstructionCallArgument()
	 * @generated
	 */
	int INSTRUCTION_CALL_ARGUMENT = 2;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_CALL_ARGUMENT__DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_CALL_ARGUMENT__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_CALL_ARGUMENT__LABEL = 2;

	/**
	 * The number of structural features of the '<em>Instruction Call Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_CALL_ARGUMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Instruction Call Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_CALL_ARGUMENT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link hu.modembed.assembler.code.AssemblerObject <em>Assembler Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembler Object</em>'.
	 * @see hu.modembed.assembler.code.AssemblerObject
	 * @generated
	 */
	EClass getAssemblerObject();

	/**
	 * Returns the meta object for the reference '{@link hu.modembed.assembler.code.AssemblerObject#getInstructionset <em>Instructionset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instructionset</em>'.
	 * @see hu.modembed.assembler.code.AssemblerObject#getInstructionset()
	 * @see #getAssemblerObject()
	 * @generated
	 */
	EReference getAssemblerObject_Instructionset();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.assembler.code.AssemblerObject#getStartAddress <em>Start Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Address</em>'.
	 * @see hu.modembed.assembler.code.AssemblerObject#getStartAddress()
	 * @see #getAssemblerObject()
	 * @generated
	 */
	EAttribute getAssemblerObject_StartAddress();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.assembler.code.AssemblerObject#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see hu.modembed.assembler.code.AssemblerObject#getInstructions()
	 * @see #getAssemblerObject()
	 * @generated
	 */
	EReference getAssemblerObject_Instructions();

	/**
	 * Returns the meta object for class '{@link hu.modembed.assembler.code.InstructionCall <em>Instruction Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction Call</em>'.
	 * @see hu.modembed.assembler.code.InstructionCall
	 * @generated
	 */
	EClass getInstructionCall();

	/**
	 * Returns the meta object for the reference '{@link hu.modembed.assembler.code.InstructionCall#getInstruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instruction</em>'.
	 * @see hu.modembed.assembler.code.InstructionCall#getInstruction()
	 * @see #getInstructionCall()
	 * @generated
	 */
	EReference getInstructionCall_Instruction();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.assembler.code.InstructionCall#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see hu.modembed.assembler.code.InstructionCall#getArguments()
	 * @see #getInstructionCall()
	 * @generated
	 */
	EReference getInstructionCall_Arguments();

	/**
	 * Returns the meta object for class '{@link hu.modembed.assembler.code.InstructionCallArgument <em>Instruction Call Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction Call Argument</em>'.
	 * @see hu.modembed.assembler.code.InstructionCallArgument
	 * @generated
	 */
	EClass getInstructionCallArgument();

	/**
	 * Returns the meta object for the reference '{@link hu.modembed.assembler.code.InstructionCallArgument#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition</em>'.
	 * @see hu.modembed.assembler.code.InstructionCallArgument#getDefinition()
	 * @see #getInstructionCallArgument()
	 * @generated
	 */
	EReference getInstructionCallArgument_Definition();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.assembler.code.InstructionCallArgument#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hu.modembed.assembler.code.InstructionCallArgument#getValue()
	 * @see #getInstructionCallArgument()
	 * @generated
	 */
	EAttribute getInstructionCallArgument_Value();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.assembler.code.InstructionCallArgument#isLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see hu.modembed.assembler.code.InstructionCallArgument#isLabel()
	 * @see #getInstructionCallArgument()
	 * @generated
	 */
	EAttribute getInstructionCallArgument_Label();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CodeFactory getCodeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hu.modembed.assembler.code.impl.AssemblerObjectImpl <em>Assembler Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.assembler.code.impl.AssemblerObjectImpl
		 * @see hu.modembed.assembler.code.impl.CodePackageImpl#getAssemblerObject()
		 * @generated
		 */
		EClass ASSEMBLER_OBJECT = eINSTANCE.getAssemblerObject();

		/**
		 * The meta object literal for the '<em><b>Instructionset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLER_OBJECT__INSTRUCTIONSET = eINSTANCE.getAssemblerObject_Instructionset();

		/**
		 * The meta object literal for the '<em><b>Start Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSEMBLER_OBJECT__START_ADDRESS = eINSTANCE.getAssemblerObject_StartAddress();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLER_OBJECT__INSTRUCTIONS = eINSTANCE.getAssemblerObject_Instructions();

		/**
		 * The meta object literal for the '{@link hu.modembed.assembler.code.impl.InstructionCallImpl <em>Instruction Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.assembler.code.impl.InstructionCallImpl
		 * @see hu.modembed.assembler.code.impl.CodePackageImpl#getInstructionCall()
		 * @generated
		 */
		EClass INSTRUCTION_CALL = eINSTANCE.getInstructionCall();

		/**
		 * The meta object literal for the '<em><b>Instruction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION_CALL__INSTRUCTION = eINSTANCE.getInstructionCall_Instruction();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION_CALL__ARGUMENTS = eINSTANCE.getInstructionCall_Arguments();

		/**
		 * The meta object literal for the '{@link hu.modembed.assembler.code.impl.InstructionCallArgumentImpl <em>Instruction Call Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.assembler.code.impl.InstructionCallArgumentImpl
		 * @see hu.modembed.assembler.code.impl.CodePackageImpl#getInstructionCallArgument()
		 * @generated
		 */
		EClass INSTRUCTION_CALL_ARGUMENT = eINSTANCE.getInstructionCallArgument();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION_CALL_ARGUMENT__DEFINITION = eINSTANCE.getInstructionCallArgument_Definition();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION_CALL_ARGUMENT__VALUE = eINSTANCE.getInstructionCallArgument_Value();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION_CALL_ARGUMENT__LABEL = eINSTANCE.getInstructionCallArgument_Label();

	}

} //CodePackage
