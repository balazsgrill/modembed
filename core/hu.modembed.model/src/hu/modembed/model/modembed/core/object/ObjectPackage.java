/**
 */
package hu.modembed.model.modembed.core.object;

import hu.modembed.model.modembed.infrastructure.InfrastructurePackage;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hu.modembed.model.modembed.core.object.ObjectFactory
 * @model kind="package"
 * @generated
 */
public interface ObjectPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "object";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://modembed.hu/core/object";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "object";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ObjectPackage eINSTANCE = hu.modembed.model.modembed.core.object.impl.ObjectPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.modembed.model.modembed.core.object.impl.AssemblerObjectImpl <em>Assembler Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.modembed.core.object.impl.AssemblerObjectImpl
	 * @see hu.modembed.model.modembed.core.object.impl.ObjectPackageImpl#getAssemblerObject()
	 * @generated
	 */
	int ASSEMBLER_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLER_OBJECT__DESCRIPTION = InfrastructurePackage.ROOT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLER_OBJECT__ORIGINS = InfrastructurePackage.ROOT_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLER_OBJECT__NAME = InfrastructurePackage.ROOT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLER_OBJECT__INSTRUCTIONS = InfrastructurePackage.ROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLER_OBJECT__START_ADDRESS = InfrastructurePackage.ROOT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assembler Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLER_OBJECT_FEATURE_COUNT = InfrastructurePackage.ROOT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hu.modembed.model.modembed.core.object.impl.InstructionCallImpl <em>Instruction Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.modembed.core.object.impl.InstructionCallImpl
	 * @see hu.modembed.model.modembed.core.object.impl.ObjectPackageImpl#getInstructionCall()
	 * @generated
	 */
	int INSTRUCTION_CALL = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_CALL__DESCRIPTION = InfrastructurePackage.MO_DEMBED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_CALL__ORIGINS = InfrastructurePackage.MO_DEMBED_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_CALL__PARAMETERS = InfrastructurePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instruction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_CALL__INSTRUCTION = InfrastructurePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Instruction Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_CALL_FEATURE_COUNT = InfrastructurePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hu.modembed.model.modembed.core.object.impl.InstructionCallParameterImpl <em>Instruction Call Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.modembed.core.object.impl.InstructionCallParameterImpl
	 * @see hu.modembed.model.modembed.core.object.impl.ObjectPackageImpl#getInstructionCallParameter()
	 * @generated
	 */
	int INSTRUCTION_CALL_PARAMETER = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_CALL_PARAMETER__DESCRIPTION = InfrastructurePackage.MO_DEMBED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_CALL_PARAMETER__ORIGINS = InfrastructurePackage.MO_DEMBED_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_CALL_PARAMETER__VALUE = InfrastructurePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_CALL_PARAMETER__DEFINITION = InfrastructurePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Instruction Call Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_CALL_PARAMETER_FEATURE_COUNT = InfrastructurePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link hu.modembed.model.modembed.core.object.AssemblerObject <em>Assembler Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembler Object</em>'.
	 * @see hu.modembed.model.modembed.core.object.AssemblerObject
	 * @generated
	 */
	EClass getAssemblerObject();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.model.modembed.core.object.AssemblerObject#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see hu.modembed.model.modembed.core.object.AssemblerObject#getInstructions()
	 * @see #getAssemblerObject()
	 * @generated
	 */
	EReference getAssemblerObject_Instructions();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.modembed.core.object.AssemblerObject#getStartAddress <em>Start Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Address</em>'.
	 * @see hu.modembed.model.modembed.core.object.AssemblerObject#getStartAddress()
	 * @see #getAssemblerObject()
	 * @generated
	 */
	EAttribute getAssemblerObject_StartAddress();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.modembed.core.object.InstructionCall <em>Instruction Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction Call</em>'.
	 * @see hu.modembed.model.modembed.core.object.InstructionCall
	 * @generated
	 */
	EClass getInstructionCall();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.model.modembed.core.object.InstructionCall#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see hu.modembed.model.modembed.core.object.InstructionCall#getParameters()
	 * @see #getInstructionCall()
	 * @generated
	 */
	EReference getInstructionCall_Parameters();

	/**
	 * Returns the meta object for the reference '{@link hu.modembed.model.modembed.core.object.InstructionCall#getInstruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instruction</em>'.
	 * @see hu.modembed.model.modembed.core.object.InstructionCall#getInstruction()
	 * @see #getInstructionCall()
	 * @generated
	 */
	EReference getInstructionCall_Instruction();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.modembed.core.object.InstructionCallParameter <em>Instruction Call Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction Call Parameter</em>'.
	 * @see hu.modembed.model.modembed.core.object.InstructionCallParameter
	 * @generated
	 */
	EClass getInstructionCallParameter();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.modembed.core.object.InstructionCallParameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hu.modembed.model.modembed.core.object.InstructionCallParameter#getValue()
	 * @see #getInstructionCallParameter()
	 * @generated
	 */
	EAttribute getInstructionCallParameter_Value();

	/**
	 * Returns the meta object for the reference '{@link hu.modembed.model.modembed.core.object.InstructionCallParameter#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition</em>'.
	 * @see hu.modembed.model.modembed.core.object.InstructionCallParameter#getDefinition()
	 * @see #getInstructionCallParameter()
	 * @generated
	 */
	EReference getInstructionCallParameter_Definition();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ObjectFactory getObjectFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hu.modembed.model.modembed.core.object.impl.AssemblerObjectImpl <em>Assembler Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.modembed.core.object.impl.AssemblerObjectImpl
		 * @see hu.modembed.model.modembed.core.object.impl.ObjectPackageImpl#getAssemblerObject()
		 * @generated
		 */
		EClass ASSEMBLER_OBJECT = eINSTANCE.getAssemblerObject();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLER_OBJECT__INSTRUCTIONS = eINSTANCE.getAssemblerObject_Instructions();

		/**
		 * The meta object literal for the '<em><b>Start Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSEMBLER_OBJECT__START_ADDRESS = eINSTANCE.getAssemblerObject_StartAddress();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.modembed.core.object.impl.InstructionCallImpl <em>Instruction Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.modembed.core.object.impl.InstructionCallImpl
		 * @see hu.modembed.model.modembed.core.object.impl.ObjectPackageImpl#getInstructionCall()
		 * @generated
		 */
		EClass INSTRUCTION_CALL = eINSTANCE.getInstructionCall();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION_CALL__PARAMETERS = eINSTANCE.getInstructionCall_Parameters();

		/**
		 * The meta object literal for the '<em><b>Instruction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION_CALL__INSTRUCTION = eINSTANCE.getInstructionCall_Instruction();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.modembed.core.object.impl.InstructionCallParameterImpl <em>Instruction Call Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.modembed.core.object.impl.InstructionCallParameterImpl
		 * @see hu.modembed.model.modembed.core.object.impl.ObjectPackageImpl#getInstructionCallParameter()
		 * @generated
		 */
		EClass INSTRUCTION_CALL_PARAMETER = eINSTANCE.getInstructionCallParameter();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION_CALL_PARAMETER__VALUE = eINSTANCE.getInstructionCallParameter_Value();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION_CALL_PARAMETER__DEFINITION = eINSTANCE.getInstructionCallParameter_Definition();

	}

} //ObjectPackage
