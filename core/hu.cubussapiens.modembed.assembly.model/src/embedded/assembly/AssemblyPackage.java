/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package embedded.assembly;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see embedded.assembly.AssemblyFactory
 * @model kind="package"
 * @generated
 */
public interface AssemblyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "assembly";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://hu.gb/embedded/assembly";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "asm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AssemblyPackage eINSTANCE = embedded.assembly.impl.AssemblyPackageImpl.init();

	/**
	 * The meta object id for the '{@link embedded.assembly.impl.InstructionSetImpl <em>Instruction Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see embedded.assembly.impl.InstructionSetImpl
	 * @see embedded.assembly.impl.AssemblyPackageImpl#getInstructionSet()
	 * @generated
	 */
	int INSTRUCTION_SET = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_SET__NAME = 0;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_SET__INSTRUCTIONS = 1;

	/**
	 * The number of structural features of the '<em>Instruction Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_SET_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link embedded.assembly.impl.InstructionImpl <em>Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see embedded.assembly.impl.InstructionImpl
	 * @see embedded.assembly.impl.AssemblyPackageImpl#getInstruction()
	 * @generated
	 */
	int INSTRUCTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__SECTIONS = 1;

	/**
	 * The number of structural features of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link embedded.assembly.impl.SectionImpl <em>Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see embedded.assembly.impl.SectionImpl
	 * @see embedded.assembly.impl.AssemblyPackageImpl#getSection()
	 * @generated
	 */
	int SECTION = 3;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__START = 0;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__LENGTH = 1;

	/**
	 * The number of structural features of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link embedded.assembly.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see embedded.assembly.impl.FieldImpl
	 * @see embedded.assembly.impl.AssemblyPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 2;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__START = SECTION__START;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__LENGTH = SECTION__LENGTH;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__TYPE = SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = SECTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link embedded.assembly.impl.CodeImpl <em>Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see embedded.assembly.impl.CodeImpl
	 * @see embedded.assembly.impl.AssemblyPackageImpl#getCode()
	 * @generated
	 */
	int CODE = 4;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__START = SECTION__START;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__LENGTH = SECTION__LENGTH;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__CODE = SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_FEATURE_COUNT = SECTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link embedded.assembly.FieldType <em>Field Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see embedded.assembly.FieldType
	 * @see embedded.assembly.impl.AssemblyPackageImpl#getFieldType()
	 * @generated
	 */
	int FIELD_TYPE = 5;


	/**
	 * Returns the meta object for class '{@link embedded.assembly.InstructionSet <em>Instruction Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction Set</em>'.
	 * @see embedded.assembly.InstructionSet
	 * @generated
	 */
	EClass getInstructionSet();

	/**
	 * Returns the meta object for the attribute '{@link embedded.assembly.InstructionSet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see embedded.assembly.InstructionSet#getName()
	 * @see #getInstructionSet()
	 * @generated
	 */
	EAttribute getInstructionSet_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link embedded.assembly.InstructionSet#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see embedded.assembly.InstructionSet#getInstructions()
	 * @see #getInstructionSet()
	 * @generated
	 */
	EReference getInstructionSet_Instructions();

	/**
	 * Returns the meta object for class '{@link embedded.assembly.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction</em>'.
	 * @see embedded.assembly.Instruction
	 * @generated
	 */
	EClass getInstruction();

	/**
	 * Returns the meta object for the attribute '{@link embedded.assembly.Instruction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see embedded.assembly.Instruction#getName()
	 * @see #getInstruction()
	 * @generated
	 */
	EAttribute getInstruction_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link embedded.assembly.Instruction#getSections <em>Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sections</em>'.
	 * @see embedded.assembly.Instruction#getSections()
	 * @see #getInstruction()
	 * @generated
	 */
	EReference getInstruction_Sections();

	/**
	 * Returns the meta object for class '{@link embedded.assembly.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see embedded.assembly.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link embedded.assembly.Field#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see embedded.assembly.Field#getType()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Type();

	/**
	 * Returns the meta object for class '{@link embedded.assembly.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section</em>'.
	 * @see embedded.assembly.Section
	 * @generated
	 */
	EClass getSection();

	/**
	 * Returns the meta object for the attribute '{@link embedded.assembly.Section#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see embedded.assembly.Section#getStart()
	 * @see #getSection()
	 * @generated
	 */
	EAttribute getSection_Start();

	/**
	 * Returns the meta object for the attribute '{@link embedded.assembly.Section#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see embedded.assembly.Section#getLength()
	 * @see #getSection()
	 * @generated
	 */
	EAttribute getSection_Length();

	/**
	 * Returns the meta object for class '{@link embedded.assembly.Code <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code</em>'.
	 * @see embedded.assembly.Code
	 * @generated
	 */
	EClass getCode();

	/**
	 * Returns the meta object for the attribute '{@link embedded.assembly.Code#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see embedded.assembly.Code#getCode()
	 * @see #getCode()
	 * @generated
	 */
	EAttribute getCode_Code();

	/**
	 * Returns the meta object for enum '{@link embedded.assembly.FieldType <em>Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Field Type</em>'.
	 * @see embedded.assembly.FieldType
	 * @generated
	 */
	EEnum getFieldType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AssemblyFactory getAssemblyFactory();

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
		 * The meta object literal for the '{@link embedded.assembly.impl.InstructionSetImpl <em>Instruction Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see embedded.assembly.impl.InstructionSetImpl
		 * @see embedded.assembly.impl.AssemblyPackageImpl#getInstructionSet()
		 * @generated
		 */
		EClass INSTRUCTION_SET = eINSTANCE.getInstructionSet();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION_SET__NAME = eINSTANCE.getInstructionSet_Name();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION_SET__INSTRUCTIONS = eINSTANCE.getInstructionSet_Instructions();

		/**
		 * The meta object literal for the '{@link embedded.assembly.impl.InstructionImpl <em>Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see embedded.assembly.impl.InstructionImpl
		 * @see embedded.assembly.impl.AssemblyPackageImpl#getInstruction()
		 * @generated
		 */
		EClass INSTRUCTION = eINSTANCE.getInstruction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION__NAME = eINSTANCE.getInstruction_Name();

		/**
		 * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION__SECTIONS = eINSTANCE.getInstruction_Sections();

		/**
		 * The meta object literal for the '{@link embedded.assembly.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see embedded.assembly.impl.FieldImpl
		 * @see embedded.assembly.impl.AssemblyPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__TYPE = eINSTANCE.getField_Type();

		/**
		 * The meta object literal for the '{@link embedded.assembly.impl.SectionImpl <em>Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see embedded.assembly.impl.SectionImpl
		 * @see embedded.assembly.impl.AssemblyPackageImpl#getSection()
		 * @generated
		 */
		EClass SECTION = eINSTANCE.getSection();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION__START = eINSTANCE.getSection_Start();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION__LENGTH = eINSTANCE.getSection_Length();

		/**
		 * The meta object literal for the '{@link embedded.assembly.impl.CodeImpl <em>Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see embedded.assembly.impl.CodeImpl
		 * @see embedded.assembly.impl.AssemblyPackageImpl#getCode()
		 * @generated
		 */
		EClass CODE = eINSTANCE.getCode();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE__CODE = eINSTANCE.getCode_Code();

		/**
		 * The meta object literal for the '{@link embedded.assembly.FieldType <em>Field Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see embedded.assembly.FieldType
		 * @see embedded.assembly.impl.AssemblyPackageImpl#getFieldType()
		 * @generated
		 */
		EEnum FIELD_TYPE = eINSTANCE.getFieldType();

	}

} //AssemblyPackage
