/**
 */
package hu.modembed.model.modembed.core.object.impl;

import hu.modembed.model.modembed.core.object.AssemblerObject;
import hu.modembed.model.modembed.core.object.InstructionCall;
import hu.modembed.model.modembed.core.object.ObjectPackage;

import hu.modembed.model.modembed.infrastructure.impl.RootElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assembler Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.core.object.impl.AssemblerObjectImpl#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.core.object.impl.AssemblerObjectImpl#getStartAddress <em>Start Address</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssemblerObjectImpl extends RootElementImpl implements AssemblerObject {
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
		return ObjectPackage.Literals.ASSEMBLER_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InstructionCall> getInstructions() {
		if (instructions == null) {
			instructions = new EObjectContainmentEList<InstructionCall>(InstructionCall.class, this, ObjectPackage.ASSEMBLER_OBJECT__INSTRUCTIONS);
		}
		return instructions;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectPackage.ASSEMBLER_OBJECT__START_ADDRESS, oldStartAddress, startAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ObjectPackage.ASSEMBLER_OBJECT__INSTRUCTIONS:
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
			case ObjectPackage.ASSEMBLER_OBJECT__INSTRUCTIONS:
				return getInstructions();
			case ObjectPackage.ASSEMBLER_OBJECT__START_ADDRESS:
				return getStartAddress();
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
			case ObjectPackage.ASSEMBLER_OBJECT__INSTRUCTIONS:
				getInstructions().clear();
				getInstructions().addAll((Collection<? extends InstructionCall>)newValue);
				return;
			case ObjectPackage.ASSEMBLER_OBJECT__START_ADDRESS:
				setStartAddress((Long)newValue);
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
			case ObjectPackage.ASSEMBLER_OBJECT__INSTRUCTIONS:
				getInstructions().clear();
				return;
			case ObjectPackage.ASSEMBLER_OBJECT__START_ADDRESS:
				setStartAddress(START_ADDRESS_EDEFAULT);
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
			case ObjectPackage.ASSEMBLER_OBJECT__INSTRUCTIONS:
				return instructions != null && !instructions.isEmpty();
			case ObjectPackage.ASSEMBLER_OBJECT__START_ADDRESS:
				return startAddress != START_ADDRESS_EDEFAULT;
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
