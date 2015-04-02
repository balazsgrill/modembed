/**
 */
package elf.impl;

import elf.ELF;
import elf.ElfPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ELF</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link elf.impl.ELFImpl#getType <em>Type</em>}</li>
 *   <li>{@link elf.impl.ELFImpl#getMachine <em>Machine</em>}</li>
 *   <li>{@link elf.impl.ELFImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link elf.impl.ELFImpl#getEntry <em>Entry</em>}</li>
 *   <li>{@link elf.impl.ELFImpl#getProgramHeaderOffset <em>Program Header Offset</em>}</li>
 *   <li>{@link elf.impl.ELFImpl#getSectionHeaderOffset <em>Section Header Offset</em>}</li>
 *   <li>{@link elf.impl.ELFImpl#getFlags <em>Flags</em>}</li>
 *   <li>{@link elf.impl.ELFImpl#getHeaderSize <em>Header Size</em>}</li>
 *   <li>{@link elf.impl.ELFImpl#getProgramHeaderEntrySize <em>Program Header Entry Size</em>}</li>
 *   <li>{@link elf.impl.ELFImpl#getProgramHeaderEntryNumber <em>Program Header Entry Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ELFImpl extends MinimalEObjectImpl.Container implements ELF {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Object type;

	/**
	 * The cached value of the '{@link #getMachine() <em>Machine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachine()
	 * @generated
	 * @ordered
	 */
	protected Object machine;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected Object version;

	/**
	 * The default value of the '{@link #getEntry() <em>Entry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntry()
	 * @generated
	 * @ordered
	 */
	protected static final long ENTRY_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getEntry() <em>Entry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntry()
	 * @generated
	 * @ordered
	 */
	protected long entry = ENTRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getProgramHeaderOffset() <em>Program Header Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramHeaderOffset()
	 * @generated
	 * @ordered
	 */
	protected static final long PROGRAM_HEADER_OFFSET_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getProgramHeaderOffset() <em>Program Header Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramHeaderOffset()
	 * @generated
	 * @ordered
	 */
	protected long programHeaderOffset = PROGRAM_HEADER_OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getSectionHeaderOffset() <em>Section Header Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectionHeaderOffset()
	 * @generated
	 * @ordered
	 */
	protected static final long SECTION_HEADER_OFFSET_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSectionHeaderOffset() <em>Section Header Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectionHeaderOffset()
	 * @generated
	 * @ordered
	 */
	protected long sectionHeaderOffset = SECTION_HEADER_OFFSET_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFlags() <em>Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlags()
	 * @generated
	 * @ordered
	 */
	protected Object flags;

	/**
	 * The cached value of the '{@link #getHeaderSize() <em>Header Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderSize()
	 * @generated
	 * @ordered
	 */
	protected Object headerSize;

	/**
	 * The cached value of the '{@link #getProgramHeaderEntrySize() <em>Program Header Entry Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramHeaderEntrySize()
	 * @generated
	 * @ordered
	 */
	protected Object programHeaderEntrySize;

	/**
	 * The cached value of the '{@link #getProgramHeaderEntryNumber() <em>Program Header Entry Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramHeaderEntryNumber()
	 * @generated
	 * @ordered
	 */
	protected Object programHeaderEntryNumber;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ELFImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElfPackage.Literals.ELF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Object newType) {
		Object oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElfPackage.ELF__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getMachine() {
		return machine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMachine(Object newMachine) {
		Object oldMachine = machine;
		machine = newMachine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElfPackage.ELF__MACHINE, oldMachine, machine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(Object newVersion) {
		Object oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElfPackage.ELF__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getEntry() {
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntry(long newEntry) {
		long oldEntry = entry;
		entry = newEntry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElfPackage.ELF__ENTRY, oldEntry, entry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getProgramHeaderOffset() {
		return programHeaderOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgramHeaderOffset(long newProgramHeaderOffset) {
		long oldProgramHeaderOffset = programHeaderOffset;
		programHeaderOffset = newProgramHeaderOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElfPackage.ELF__PROGRAM_HEADER_OFFSET, oldProgramHeaderOffset, programHeaderOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getSectionHeaderOffset() {
		return sectionHeaderOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSectionHeaderOffset(long newSectionHeaderOffset) {
		long oldSectionHeaderOffset = sectionHeaderOffset;
		sectionHeaderOffset = newSectionHeaderOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElfPackage.ELF__SECTION_HEADER_OFFSET, oldSectionHeaderOffset, sectionHeaderOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getFlags() {
		return flags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlags(Object newFlags) {
		Object oldFlags = flags;
		flags = newFlags;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElfPackage.ELF__FLAGS, oldFlags, flags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getHeaderSize() {
		return headerSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeaderSize(Object newHeaderSize) {
		Object oldHeaderSize = headerSize;
		headerSize = newHeaderSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElfPackage.ELF__HEADER_SIZE, oldHeaderSize, headerSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getProgramHeaderEntrySize() {
		return programHeaderEntrySize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgramHeaderEntrySize(Object newProgramHeaderEntrySize) {
		Object oldProgramHeaderEntrySize = programHeaderEntrySize;
		programHeaderEntrySize = newProgramHeaderEntrySize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElfPackage.ELF__PROGRAM_HEADER_ENTRY_SIZE, oldProgramHeaderEntrySize, programHeaderEntrySize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getProgramHeaderEntryNumber() {
		return programHeaderEntryNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgramHeaderEntryNumber(Object newProgramHeaderEntryNumber) {
		Object oldProgramHeaderEntryNumber = programHeaderEntryNumber;
		programHeaderEntryNumber = newProgramHeaderEntryNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElfPackage.ELF__PROGRAM_HEADER_ENTRY_NUMBER, oldProgramHeaderEntryNumber, programHeaderEntryNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ElfPackage.ELF__TYPE:
				return getType();
			case ElfPackage.ELF__MACHINE:
				return getMachine();
			case ElfPackage.ELF__VERSION:
				return getVersion();
			case ElfPackage.ELF__ENTRY:
				return getEntry();
			case ElfPackage.ELF__PROGRAM_HEADER_OFFSET:
				return getProgramHeaderOffset();
			case ElfPackage.ELF__SECTION_HEADER_OFFSET:
				return getSectionHeaderOffset();
			case ElfPackage.ELF__FLAGS:
				return getFlags();
			case ElfPackage.ELF__HEADER_SIZE:
				return getHeaderSize();
			case ElfPackage.ELF__PROGRAM_HEADER_ENTRY_SIZE:
				return getProgramHeaderEntrySize();
			case ElfPackage.ELF__PROGRAM_HEADER_ENTRY_NUMBER:
				return getProgramHeaderEntryNumber();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ElfPackage.ELF__TYPE:
				setType(newValue);
				return;
			case ElfPackage.ELF__MACHINE:
				setMachine(newValue);
				return;
			case ElfPackage.ELF__VERSION:
				setVersion(newValue);
				return;
			case ElfPackage.ELF__ENTRY:
				setEntry((Long)newValue);
				return;
			case ElfPackage.ELF__PROGRAM_HEADER_OFFSET:
				setProgramHeaderOffset((Long)newValue);
				return;
			case ElfPackage.ELF__SECTION_HEADER_OFFSET:
				setSectionHeaderOffset((Long)newValue);
				return;
			case ElfPackage.ELF__FLAGS:
				setFlags(newValue);
				return;
			case ElfPackage.ELF__HEADER_SIZE:
				setHeaderSize(newValue);
				return;
			case ElfPackage.ELF__PROGRAM_HEADER_ENTRY_SIZE:
				setProgramHeaderEntrySize(newValue);
				return;
			case ElfPackage.ELF__PROGRAM_HEADER_ENTRY_NUMBER:
				setProgramHeaderEntryNumber(newValue);
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
			case ElfPackage.ELF__TYPE:
				setType((Object)null);
				return;
			case ElfPackage.ELF__MACHINE:
				setMachine((Object)null);
				return;
			case ElfPackage.ELF__VERSION:
				setVersion((Object)null);
				return;
			case ElfPackage.ELF__ENTRY:
				setEntry(ENTRY_EDEFAULT);
				return;
			case ElfPackage.ELF__PROGRAM_HEADER_OFFSET:
				setProgramHeaderOffset(PROGRAM_HEADER_OFFSET_EDEFAULT);
				return;
			case ElfPackage.ELF__SECTION_HEADER_OFFSET:
				setSectionHeaderOffset(SECTION_HEADER_OFFSET_EDEFAULT);
				return;
			case ElfPackage.ELF__FLAGS:
				setFlags((Object)null);
				return;
			case ElfPackage.ELF__HEADER_SIZE:
				setHeaderSize((Object)null);
				return;
			case ElfPackage.ELF__PROGRAM_HEADER_ENTRY_SIZE:
				setProgramHeaderEntrySize((Object)null);
				return;
			case ElfPackage.ELF__PROGRAM_HEADER_ENTRY_NUMBER:
				setProgramHeaderEntryNumber((Object)null);
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
			case ElfPackage.ELF__TYPE:
				return type != null;
			case ElfPackage.ELF__MACHINE:
				return machine != null;
			case ElfPackage.ELF__VERSION:
				return version != null;
			case ElfPackage.ELF__ENTRY:
				return entry != ENTRY_EDEFAULT;
			case ElfPackage.ELF__PROGRAM_HEADER_OFFSET:
				return programHeaderOffset != PROGRAM_HEADER_OFFSET_EDEFAULT;
			case ElfPackage.ELF__SECTION_HEADER_OFFSET:
				return sectionHeaderOffset != SECTION_HEADER_OFFSET_EDEFAULT;
			case ElfPackage.ELF__FLAGS:
				return flags != null;
			case ElfPackage.ELF__HEADER_SIZE:
				return headerSize != null;
			case ElfPackage.ELF__PROGRAM_HEADER_ENTRY_SIZE:
				return programHeaderEntrySize != null;
			case ElfPackage.ELF__PROGRAM_HEADER_ENTRY_NUMBER:
				return programHeaderEntryNumber != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(", machine: ");
		result.append(machine);
		result.append(", version: ");
		result.append(version);
		result.append(", entry: ");
		result.append(entry);
		result.append(", programHeaderOffset: ");
		result.append(programHeaderOffset);
		result.append(", sectionHeaderOffset: ");
		result.append(sectionHeaderOffset);
		result.append(", flags: ");
		result.append(flags);
		result.append(", headerSize: ");
		result.append(headerSize);
		result.append(", programHeaderEntrySize: ");
		result.append(programHeaderEntrySize);
		result.append(", programHeaderEntryNumber: ");
		result.append(programHeaderEntryNumber);
		result.append(')');
		return result.toString();
	}

} //ELFImpl
