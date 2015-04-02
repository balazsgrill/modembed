/**
 */
package elf;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

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
 * @see elf.ElfFactory
 * @model kind="package"
 * @generated
 */
public interface ElfPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "elf";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://modembed.hu/elf";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "elf";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ElfPackage eINSTANCE = elf.impl.ElfPackageImpl.init();

	/**
	 * The meta object id for the '{@link elf.impl.ELFImpl <em>ELF</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see elf.impl.ELFImpl
	 * @see elf.impl.ElfPackageImpl#getELF()
	 * @generated
	 */
	int ELF = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELF__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Machine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELF__MACHINE = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELF__VERSION = 2;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELF__ENTRY = 3;

	/**
	 * The feature id for the '<em><b>Program Header Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELF__PROGRAM_HEADER_OFFSET = 4;

	/**
	 * The feature id for the '<em><b>Section Header Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELF__SECTION_HEADER_OFFSET = 5;

	/**
	 * The feature id for the '<em><b>Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELF__FLAGS = 6;

	/**
	 * The feature id for the '<em><b>Header Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELF__HEADER_SIZE = 7;

	/**
	 * The feature id for the '<em><b>Program Header Entry Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELF__PROGRAM_HEADER_ENTRY_SIZE = 8;

	/**
	 * The feature id for the '<em><b>Program Header Entry Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELF__PROGRAM_HEADER_ENTRY_NUMBER = 9;

	/**
	 * The number of structural features of the '<em>ELF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELF_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>ELF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Address</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see elf.impl.ElfPackageImpl#getAddress()
	 * @generated
	 */
	int ADDRESS = 1;

	/**
	 * The meta object id for the '<em>Half</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see elf.impl.ElfPackageImpl#getHalf()
	 * @generated
	 */
	int HALF = 2;

	/**
	 * The meta object id for the '<em>Offset</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see elf.impl.ElfPackageImpl#getOffset()
	 * @generated
	 */
	int OFFSET = 3;

	/**
	 * The meta object id for the '<em>Word</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see elf.impl.ElfPackageImpl#getWord()
	 * @generated
	 */
	int WORD = 4;

	/**
	 * The meta object id for the '<em>Signed Word</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see elf.impl.ElfPackageImpl#getSignedWord()
	 * @generated
	 */
	int SIGNED_WORD = 5;


	/**
	 * Returns the meta object for class '{@link elf.ELF <em>ELF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ELF</em>'.
	 * @see elf.ELF
	 * @generated
	 */
	EClass getELF();

	/**
	 * Returns the meta object for the attribute '{@link elf.ELF#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see elf.ELF#getType()
	 * @see #getELF()
	 * @generated
	 */
	EAttribute getELF_Type();

	/**
	 * Returns the meta object for the attribute '{@link elf.ELF#getMachine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Machine</em>'.
	 * @see elf.ELF#getMachine()
	 * @see #getELF()
	 * @generated
	 */
	EAttribute getELF_Machine();

	/**
	 * Returns the meta object for the attribute '{@link elf.ELF#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see elf.ELF#getVersion()
	 * @see #getELF()
	 * @generated
	 */
	EAttribute getELF_Version();

	/**
	 * Returns the meta object for the attribute '{@link elf.ELF#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entry</em>'.
	 * @see elf.ELF#getEntry()
	 * @see #getELF()
	 * @generated
	 */
	EAttribute getELF_Entry();

	/**
	 * Returns the meta object for the attribute '{@link elf.ELF#getProgramHeaderOffset <em>Program Header Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Program Header Offset</em>'.
	 * @see elf.ELF#getProgramHeaderOffset()
	 * @see #getELF()
	 * @generated
	 */
	EAttribute getELF_ProgramHeaderOffset();

	/**
	 * Returns the meta object for the attribute '{@link elf.ELF#getSectionHeaderOffset <em>Section Header Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Section Header Offset</em>'.
	 * @see elf.ELF#getSectionHeaderOffset()
	 * @see #getELF()
	 * @generated
	 */
	EAttribute getELF_SectionHeaderOffset();

	/**
	 * Returns the meta object for the attribute '{@link elf.ELF#getFlags <em>Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flags</em>'.
	 * @see elf.ELF#getFlags()
	 * @see #getELF()
	 * @generated
	 */
	EAttribute getELF_Flags();

	/**
	 * Returns the meta object for the attribute '{@link elf.ELF#getHeaderSize <em>Header Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header Size</em>'.
	 * @see elf.ELF#getHeaderSize()
	 * @see #getELF()
	 * @generated
	 */
	EAttribute getELF_HeaderSize();

	/**
	 * Returns the meta object for the attribute '{@link elf.ELF#getProgramHeaderEntrySize <em>Program Header Entry Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Program Header Entry Size</em>'.
	 * @see elf.ELF#getProgramHeaderEntrySize()
	 * @see #getELF()
	 * @generated
	 */
	EAttribute getELF_ProgramHeaderEntrySize();

	/**
	 * Returns the meta object for the attribute '{@link elf.ELF#getProgramHeaderEntryNumber <em>Program Header Entry Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Program Header Entry Number</em>'.
	 * @see elf.ELF#getProgramHeaderEntryNumber()
	 * @see #getELF()
	 * @generated
	 */
	EAttribute getELF_ProgramHeaderEntryNumber();

	/**
	 * Returns the meta object for data type '<em>Address</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Address</em>'.
	 * @model instanceClass="long"
	 * @generated
	 */
	EDataType getAddress();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Half</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Half</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getHalf();

	/**
	 * Returns the meta object for data type '<em>Offset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Offset</em>'.
	 * @model instanceClass="long"
	 * @generated
	 */
	EDataType getOffset();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Word</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Word</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getWord();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Signed Word</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Signed Word</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getSignedWord();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ElfFactory getElfFactory();

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
		 * The meta object literal for the '{@link elf.impl.ELFImpl <em>ELF</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see elf.impl.ELFImpl
		 * @see elf.impl.ElfPackageImpl#getELF()
		 * @generated
		 */
		EClass ELF = eINSTANCE.getELF();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELF__TYPE = eINSTANCE.getELF_Type();

		/**
		 * The meta object literal for the '<em><b>Machine</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELF__MACHINE = eINSTANCE.getELF_Machine();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELF__VERSION = eINSTANCE.getELF_Version();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELF__ENTRY = eINSTANCE.getELF_Entry();

		/**
		 * The meta object literal for the '<em><b>Program Header Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELF__PROGRAM_HEADER_OFFSET = eINSTANCE.getELF_ProgramHeaderOffset();

		/**
		 * The meta object literal for the '<em><b>Section Header Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELF__SECTION_HEADER_OFFSET = eINSTANCE.getELF_SectionHeaderOffset();

		/**
		 * The meta object literal for the '<em><b>Flags</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELF__FLAGS = eINSTANCE.getELF_Flags();

		/**
		 * The meta object literal for the '<em><b>Header Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELF__HEADER_SIZE = eINSTANCE.getELF_HeaderSize();

		/**
		 * The meta object literal for the '<em><b>Program Header Entry Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELF__PROGRAM_HEADER_ENTRY_SIZE = eINSTANCE.getELF_ProgramHeaderEntrySize();

		/**
		 * The meta object literal for the '<em><b>Program Header Entry Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELF__PROGRAM_HEADER_ENTRY_NUMBER = eINSTANCE.getELF_ProgramHeaderEntryNumber();

		/**
		 * The meta object literal for the '<em>Address</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see elf.impl.ElfPackageImpl#getAddress()
		 * @generated
		 */
		EDataType ADDRESS = eINSTANCE.getAddress();

		/**
		 * The meta object literal for the '<em>Half</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see elf.impl.ElfPackageImpl#getHalf()
		 * @generated
		 */
		EDataType HALF = eINSTANCE.getHalf();

		/**
		 * The meta object literal for the '<em>Offset</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see elf.impl.ElfPackageImpl#getOffset()
		 * @generated
		 */
		EDataType OFFSET = eINSTANCE.getOffset();

		/**
		 * The meta object literal for the '<em>Word</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see elf.impl.ElfPackageImpl#getWord()
		 * @generated
		 */
		EDataType WORD = eINSTANCE.getWord();

		/**
		 * The meta object literal for the '<em>Signed Word</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see elf.impl.ElfPackageImpl#getSignedWord()
		 * @generated
		 */
		EDataType SIGNED_WORD = eINSTANCE.getSignedWord();

	}

} //ElfPackage
