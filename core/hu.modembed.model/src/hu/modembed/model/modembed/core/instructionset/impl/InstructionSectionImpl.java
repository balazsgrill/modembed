/**
 */
package hu.modembed.model.modembed.core.instructionset.impl;

import hu.modembed.model.modembed.core.instructionset.InstructionSection;
import hu.modembed.model.modembed.core.instructionset.InstructionsetPackage;

import hu.modembed.model.modembed.infrastructure.impl.MODembedElementImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instruction Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.core.instructionset.impl.InstructionSectionImpl#getStart <em>Start</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.core.instructionset.impl.InstructionSectionImpl#getSize <em>Size</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.core.instructionset.impl.InstructionSectionImpl#getShift <em>Shift</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class InstructionSectionImpl extends MODembedElementImpl implements InstructionSection {
	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final int START_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected int start = START_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected int size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getShift() <em>Shift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShift()
	 * @generated
	 * @ordered
	 */
	protected static final int SHIFT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getShift() <em>Shift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShift()
	 * @generated
	 * @ordered
	 */
	protected int shift = SHIFT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstructionSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstructionsetPackage.Literals.INSTRUCTION_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(int newStart) {
		int oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstructionsetPackage.INSTRUCTION_SECTION__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(int newSize) {
		int oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstructionsetPackage.INSTRUCTION_SECTION__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getShift() {
		return shift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShift(int newShift) {
		int oldShift = shift;
		shift = newShift;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstructionsetPackage.INSTRUCTION_SECTION__SHIFT, oldShift, shift));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InstructionsetPackage.INSTRUCTION_SECTION__START:
				return getStart();
			case InstructionsetPackage.INSTRUCTION_SECTION__SIZE:
				return getSize();
			case InstructionsetPackage.INSTRUCTION_SECTION__SHIFT:
				return getShift();
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
			case InstructionsetPackage.INSTRUCTION_SECTION__START:
				setStart((Integer)newValue);
				return;
			case InstructionsetPackage.INSTRUCTION_SECTION__SIZE:
				setSize((Integer)newValue);
				return;
			case InstructionsetPackage.INSTRUCTION_SECTION__SHIFT:
				setShift((Integer)newValue);
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
			case InstructionsetPackage.INSTRUCTION_SECTION__START:
				setStart(START_EDEFAULT);
				return;
			case InstructionsetPackage.INSTRUCTION_SECTION__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case InstructionsetPackage.INSTRUCTION_SECTION__SHIFT:
				setShift(SHIFT_EDEFAULT);
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
			case InstructionsetPackage.INSTRUCTION_SECTION__START:
				return start != START_EDEFAULT;
			case InstructionsetPackage.INSTRUCTION_SECTION__SIZE:
				return size != SIZE_EDEFAULT;
			case InstructionsetPackage.INSTRUCTION_SECTION__SHIFT:
				return shift != SHIFT_EDEFAULT;
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
		result.append(" (start: ");
		result.append(start);
		result.append(", size: ");
		result.append(size);
		result.append(", shift: ");
		result.append(shift);
		result.append(')');
		return result.toString();
	}

} //InstructionSectionImpl
