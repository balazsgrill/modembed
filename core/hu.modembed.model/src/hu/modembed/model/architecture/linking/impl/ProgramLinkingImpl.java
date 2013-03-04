/**
 */
package hu.modembed.model.architecture.linking.impl;

import hu.modembed.model.architecture.Architecture;

import hu.modembed.model.architecture.linking.LinkingPackage;
import hu.modembed.model.architecture.linking.ProgramLinking;

import hu.modembed.model.emodel.Function;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program Linking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.modembed.model.architecture.linking.impl.ProgramLinkingImpl#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link hu.modembed.model.architecture.linking.impl.ProgramLinkingImpl#getMainFunction <em>Main Function</em>}</li>
 *   <li>{@link hu.modembed.model.architecture.linking.impl.ProgramLinkingImpl#getStartAddress <em>Start Address</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProgramLinkingImpl extends LinkingElementImpl implements ProgramLinking {
	/**
	 * The cached value of the '{@link #getArchitecture() <em>Architecture</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitecture()
	 * @generated
	 * @ordered
	 */
	protected Architecture architecture;

	/**
	 * The cached value of the '{@link #getMainFunction() <em>Main Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainFunction()
	 * @generated
	 * @ordered
	 */
	protected Function mainFunction;

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
	protected ProgramLinkingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LinkingPackage.Literals.PROGRAM_LINKING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Architecture getArchitecture() {
		if (architecture != null && architecture.eIsProxy()) {
			InternalEObject oldArchitecture = (InternalEObject)architecture;
			architecture = (Architecture)eResolveProxy(oldArchitecture);
			if (architecture != oldArchitecture) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LinkingPackage.PROGRAM_LINKING__ARCHITECTURE, oldArchitecture, architecture));
			}
		}
		return architecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Architecture basicGetArchitecture() {
		return architecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchitecture(Architecture newArchitecture) {
		Architecture oldArchitecture = architecture;
		architecture = newArchitecture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinkingPackage.PROGRAM_LINKING__ARCHITECTURE, oldArchitecture, architecture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function getMainFunction() {
		if (mainFunction != null && mainFunction.eIsProxy()) {
			InternalEObject oldMainFunction = (InternalEObject)mainFunction;
			mainFunction = (Function)eResolveProxy(oldMainFunction);
			if (mainFunction != oldMainFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LinkingPackage.PROGRAM_LINKING__MAIN_FUNCTION, oldMainFunction, mainFunction));
			}
		}
		return mainFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function basicGetMainFunction() {
		return mainFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainFunction(Function newMainFunction) {
		Function oldMainFunction = mainFunction;
		mainFunction = newMainFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinkingPackage.PROGRAM_LINKING__MAIN_FUNCTION, oldMainFunction, mainFunction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LinkingPackage.PROGRAM_LINKING__START_ADDRESS, oldStartAddress, startAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LinkingPackage.PROGRAM_LINKING__ARCHITECTURE:
				if (resolve) return getArchitecture();
				return basicGetArchitecture();
			case LinkingPackage.PROGRAM_LINKING__MAIN_FUNCTION:
				if (resolve) return getMainFunction();
				return basicGetMainFunction();
			case LinkingPackage.PROGRAM_LINKING__START_ADDRESS:
				return getStartAddress();
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
			case LinkingPackage.PROGRAM_LINKING__ARCHITECTURE:
				setArchitecture((Architecture)newValue);
				return;
			case LinkingPackage.PROGRAM_LINKING__MAIN_FUNCTION:
				setMainFunction((Function)newValue);
				return;
			case LinkingPackage.PROGRAM_LINKING__START_ADDRESS:
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
			case LinkingPackage.PROGRAM_LINKING__ARCHITECTURE:
				setArchitecture((Architecture)null);
				return;
			case LinkingPackage.PROGRAM_LINKING__MAIN_FUNCTION:
				setMainFunction((Function)null);
				return;
			case LinkingPackage.PROGRAM_LINKING__START_ADDRESS:
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
			case LinkingPackage.PROGRAM_LINKING__ARCHITECTURE:
				return architecture != null;
			case LinkingPackage.PROGRAM_LINKING__MAIN_FUNCTION:
				return mainFunction != null;
			case LinkingPackage.PROGRAM_LINKING__START_ADDRESS:
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

} //ProgramLinkingImpl
