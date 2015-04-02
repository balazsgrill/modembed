/**
 */
package elf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ELF</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link elf.ELF#getType <em>Type</em>}</li>
 *   <li>{@link elf.ELF#getMachine <em>Machine</em>}</li>
 *   <li>{@link elf.ELF#getVersion <em>Version</em>}</li>
 *   <li>{@link elf.ELF#getEntry <em>Entry</em>}</li>
 *   <li>{@link elf.ELF#getProgramHeaderOffset <em>Program Header Offset</em>}</li>
 *   <li>{@link elf.ELF#getSectionHeaderOffset <em>Section Header Offset</em>}</li>
 *   <li>{@link elf.ELF#getFlags <em>Flags</em>}</li>
 *   <li>{@link elf.ELF#getHeaderSize <em>Header Size</em>}</li>
 *   <li>{@link elf.ELF#getProgramHeaderEntrySize <em>Program Header Entry Size</em>}</li>
 *   <li>{@link elf.ELF#getProgramHeaderEntryNumber <em>Program Header Entry Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see elf.ElfPackage#getELF()
 * @model
 * @generated
 */
public interface ELF extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(Object)
	 * @see elf.ElfPackage#getELF_Type()
	 * @model default="0" dataType="elf.Half"
	 * @generated
	 */
	Object getType();

	/**
	 * Sets the value of the '{@link elf.ELF#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(Object value);

	/**
	 * Returns the value of the '<em><b>Machine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Machine</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine</em>' attribute.
	 * @see #setMachine(Object)
	 * @see elf.ElfPackage#getELF_Machine()
	 * @model dataType="elf.Half"
	 * @generated
	 */
	Object getMachine();

	/**
	 * Sets the value of the '{@link elf.ELF#getMachine <em>Machine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Machine</em>' attribute.
	 * @see #getMachine()
	 * @generated
	 */
	void setMachine(Object value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(Object)
	 * @see elf.ElfPackage#getELF_Version()
	 * @model dataType="elf.Word"
	 * @generated
	 */
	Object getVersion();

	/**
	 * Sets the value of the '{@link elf.ELF#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(Object value);

	/**
	 * Returns the value of the '<em><b>Entry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry</em>' attribute.
	 * @see #setEntry(long)
	 * @see elf.ElfPackage#getELF_Entry()
	 * @model dataType="elf.Address"
	 * @generated
	 */
	long getEntry();

	/**
	 * Sets the value of the '{@link elf.ELF#getEntry <em>Entry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry</em>' attribute.
	 * @see #getEntry()
	 * @generated
	 */
	void setEntry(long value);

	/**
	 * Returns the value of the '<em><b>Program Header Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Program Header Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program Header Offset</em>' attribute.
	 * @see #setProgramHeaderOffset(long)
	 * @see elf.ElfPackage#getELF_ProgramHeaderOffset()
	 * @model dataType="elf.Offset"
	 * @generated
	 */
	long getProgramHeaderOffset();

	/**
	 * Sets the value of the '{@link elf.ELF#getProgramHeaderOffset <em>Program Header Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program Header Offset</em>' attribute.
	 * @see #getProgramHeaderOffset()
	 * @generated
	 */
	void setProgramHeaderOffset(long value);

	/**
	 * Returns the value of the '<em><b>Section Header Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Section Header Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section Header Offset</em>' attribute.
	 * @see #setSectionHeaderOffset(long)
	 * @see elf.ElfPackage#getELF_SectionHeaderOffset()
	 * @model dataType="elf.Offset"
	 * @generated
	 */
	long getSectionHeaderOffset();

	/**
	 * Sets the value of the '{@link elf.ELF#getSectionHeaderOffset <em>Section Header Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Section Header Offset</em>' attribute.
	 * @see #getSectionHeaderOffset()
	 * @generated
	 */
	void setSectionHeaderOffset(long value);

	/**
	 * Returns the value of the '<em><b>Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flags</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flags</em>' attribute.
	 * @see #setFlags(Object)
	 * @see elf.ElfPackage#getELF_Flags()
	 * @model dataType="elf.Word"
	 * @generated
	 */
	Object getFlags();

	/**
	 * Sets the value of the '{@link elf.ELF#getFlags <em>Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flags</em>' attribute.
	 * @see #getFlags()
	 * @generated
	 */
	void setFlags(Object value);

	/**
	 * Returns the value of the '<em><b>Header Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header Size</em>' attribute.
	 * @see #setHeaderSize(Object)
	 * @see elf.ElfPackage#getELF_HeaderSize()
	 * @model dataType="elf.Half"
	 * @generated
	 */
	Object getHeaderSize();

	/**
	 * Sets the value of the '{@link elf.ELF#getHeaderSize <em>Header Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Size</em>' attribute.
	 * @see #getHeaderSize()
	 * @generated
	 */
	void setHeaderSize(Object value);

	/**
	 * Returns the value of the '<em><b>Program Header Entry Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Program Header Entry Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program Header Entry Size</em>' attribute.
	 * @see #setProgramHeaderEntrySize(Object)
	 * @see elf.ElfPackage#getELF_ProgramHeaderEntrySize()
	 * @model dataType="elf.Half"
	 * @generated
	 */
	Object getProgramHeaderEntrySize();

	/**
	 * Sets the value of the '{@link elf.ELF#getProgramHeaderEntrySize <em>Program Header Entry Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program Header Entry Size</em>' attribute.
	 * @see #getProgramHeaderEntrySize()
	 * @generated
	 */
	void setProgramHeaderEntrySize(Object value);

	/**
	 * Returns the value of the '<em><b>Program Header Entry Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Program Header Entry Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program Header Entry Number</em>' attribute.
	 * @see #setProgramHeaderEntryNumber(Object)
	 * @see elf.ElfPackage#getELF_ProgramHeaderEntryNumber()
	 * @model dataType="elf.Half"
	 * @generated
	 */
	Object getProgramHeaderEntryNumber();

	/**
	 * Sets the value of the '{@link elf.ELF#getProgramHeaderEntryNumber <em>Program Header Entry Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program Header Entry Number</em>' attribute.
	 * @see #getProgramHeaderEntryNumber()
	 * @generated
	 */
	void setProgramHeaderEntryNumber(Object value);

} // ELF
