/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package picproject.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pic.PicCPUType;

import picproject.PICSettings;
import picproject.PicprojectPackage;

import project.impl.SettingsExtensionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PIC Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link picproject.impl.PICSettingsImpl#getCpu <em>Cpu</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PICSettingsImpl extends SettingsExtensionImpl implements PICSettings {
	/**
	 * The cached value of the '{@link #getCpu() <em>Cpu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpu()
	 * @generated
	 * @ordered
	 */
	protected PicCPUType cpu;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PICSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PicprojectPackage.Literals.PIC_SETTINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PicCPUType getCpu() {
		if (cpu != null && cpu.eIsProxy()) {
			InternalEObject oldCpu = (InternalEObject)cpu;
			cpu = (PicCPUType)eResolveProxy(oldCpu);
			if (cpu != oldCpu) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PicprojectPackage.PIC_SETTINGS__CPU, oldCpu, cpu));
			}
		}
		return cpu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PicCPUType basicGetCpu() {
		return cpu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpu(PicCPUType newCpu) {
		PicCPUType oldCpu = cpu;
		cpu = newCpu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PicprojectPackage.PIC_SETTINGS__CPU, oldCpu, cpu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PicprojectPackage.PIC_SETTINGS__CPU:
				if (resolve) return getCpu();
				return basicGetCpu();
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
			case PicprojectPackage.PIC_SETTINGS__CPU:
				setCpu((PicCPUType)newValue);
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
			case PicprojectPackage.PIC_SETTINGS__CPU:
				setCpu((PicCPUType)null);
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
			case PicprojectPackage.PIC_SETTINGS__CPU:
				return cpu != null;
		}
		return super.eIsSet(featureID);
	}

} //PICSettingsImpl
