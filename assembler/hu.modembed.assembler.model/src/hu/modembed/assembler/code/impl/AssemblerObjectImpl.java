/**
 */
package hu.modembed.assembler.code.impl;

import hu.modembed.assembler.code.AssemblerObject;
import hu.modembed.assembler.code.CodePackage;
import hu.modembed.assembler.code.InstructionCall;

import hu.modembed.assembler.instructionset.InstructionSet;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assembler Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.modembed.assembler.code.impl.AssemblerObjectImpl#getInstructionset <em>Instructionset</em>}</li>
 *   <li>{@link hu.modembed.assembler.code.impl.AssemblerObjectImpl#getStartAddress <em>Start Address</em>}</li>
 *   <li>{@link hu.modembed.assembler.code.impl.AssemblerObjectImpl#getInstructions <em>Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssemblerObjectImpl extends MinimalEObjectImpl.Container implements AssemblerObject {
	/**
	 * The cached value of the '{@link #getInstructionset() <em>Instructionset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructionset()
	 * @generated
	 * @ordered
	 */
	protected InstructionSet instructionset;

	/**
	 * The default value of the '{@link #getStartAddress() <em>Start Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartAddress()
	 * @generated
	 * @ordered
	 */
	protected static final long START_ADDRESS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getStartAddress() <em>Start Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartAddress()
	 * @generated
	 * @ordered
	 */
	protected long startAddress = START_ADDRESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInstructions() <em>Instructions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructions()
	 * @generated
	 * @ordered
	 */
	protected EList<InstructionCall> instructions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblerObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodePackage.Literals.ASSEMBLER_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionSet getInstructionset() {
		if (instructionset != null && instructionset.eIsProxy()) {
			InternalEObject oldInstructionset = (InternalEObject)instructionset;
			instructionset = (InstructionSet)eResolveProxy(oldInstructionset);
			if (instructionset != oldInstructionset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackage.ASSEMBLER_OBJECT__INSTRUCTIONSET, oldInstructionset, instructionset));
			}
		}
		return instructionset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionSet basicGetInstructionset() {
		return instructionset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstructionset(InstructionSet newInstructionset) {
		InstructionSet oldInstructionset = instructionset;
		instructionset = newInstructionset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.ASSEMBLER_OBJECT__INSTRUCTIONSET, oldInstructionset, instructionset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getStartAddress() {
		return startAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartAddress(long newStartAddress) {
		long oldStartAddress = startAddress;
		startAddress = newStartAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.ASSEMBLER_OBJECT__START_ADDRESS, oldStartAddress, startAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InstructionCall> getInstructions() {
		if (instructions == null) {
			instructions = new EObjectContainmentEList<InstructionCall>(InstructionCall.class, this, CodePackage.ASSEMBLER_OBJECT__INSTRUCTIONS);
		}
		return instructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CodePackage.ASSEMBLER_OBJECT__INSTRUCTIONS:
				return ((InternalEList<?>)getInstructions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodePackage.ASSEMBLER_OBJECT__INSTRUCTIONSET:
				if (resolve) return getInstructionset();
				return basicGetInstructionset();
			case CodePackage.ASSEMBLER_OBJECT__START_ADDRESS:
				return getStartAddress();
			case CodePackage.ASSEMBLER_OBJECT__INSTRUCTIONS:
				return getInstructions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CodePackage.ASSEMBLER_OBJECT__INSTRUCTIONSET:
				setInstructionset((InstructionSet)newValue);
				return;
			case CodePackage.ASSEMBLER_OBJECT__START_ADDRESS:
				setStartAddress((Long)newValue);
				return;
			case CodePackage.ASSEMBLER_OBJECT__INSTRUCTIONS:
				getInstructions().clear();
				getInstructions().addAll((Collection<? extends InstructionCall>)newValue);
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
			case CodePackage.ASSEMBLER_OBJECT__INSTRUCTIONSET:
				setInstructionset((InstructionSet)null);
				return;
			case CodePackage.ASSEMBLER_OBJECT__START_ADDRESS:
				setStartAddress(START_ADDRESS_EDEFAULT);
				return;
			case CodePackage.ASSEMBLER_OBJECT__INSTRUCTIONS:
				getInstructions().clear();
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
			case CodePackage.ASSEMBLER_OBJECT__INSTRUCTIONSET:
				return instructionset != null;
			case CodePackage.ASSEMBLER_OBJECT__START_ADDRESS:
				return startAddress != START_ADDRESS_EDEFAULT;
			case CodePackage.ASSEMBLER_OBJECT__INSTRUCTIONS:
				return instructions != null && !instructions.isEmpty();
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
		result.append(" (startAddress: ");
		result.append(startAddress);
		result.append(')');
		return result.toString();
	}

} //AssemblerObjectImpl
