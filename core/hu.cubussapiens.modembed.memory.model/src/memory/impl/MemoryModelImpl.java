/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package memory.impl;

import memory.MemoryModel;
import memory.MemoryPackage;
import memory.ProgModel;
import memory.RAMModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link memory.impl.MemoryModelImpl#getRam <em>Ram</em>}</li>
 *   <li>{@link memory.impl.MemoryModelImpl#getProg <em>Prog</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MemoryModelImpl extends EObjectImpl implements MemoryModel {
	/**
	 * The cached value of the '{@link #getRam() <em>Ram</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRam()
	 * @generated
	 * @ordered
	 */
	protected RAMModel ram;

	/**
	 * The cached value of the '{@link #getProg() <em>Prog</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProg()
	 * @generated
	 * @ordered
	 */
	protected ProgModel prog;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemoryModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MemoryPackage.Literals.MEMORY_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RAMModel getRam() {
		return ram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRam(RAMModel newRam, NotificationChain msgs) {
		RAMModel oldRam = ram;
		ram = newRam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MemoryPackage.MEMORY_MODEL__RAM, oldRam, newRam);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRam(RAMModel newRam) {
		if (newRam != ram) {
			NotificationChain msgs = null;
			if (ram != null)
				msgs = ((InternalEObject)ram).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MemoryPackage.MEMORY_MODEL__RAM, null, msgs);
			if (newRam != null)
				msgs = ((InternalEObject)newRam).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MemoryPackage.MEMORY_MODEL__RAM, null, msgs);
			msgs = basicSetRam(newRam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MemoryPackage.MEMORY_MODEL__RAM, newRam, newRam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgModel getProg() {
		if (prog != null && prog.eIsProxy()) {
			InternalEObject oldProg = (InternalEObject)prog;
			prog = (ProgModel)eResolveProxy(oldProg);
			if (prog != oldProg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MemoryPackage.MEMORY_MODEL__PROG, oldProg, prog));
			}
		}
		return prog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgModel basicGetProg() {
		return prog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProg(ProgModel newProg) {
		ProgModel oldProg = prog;
		prog = newProg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MemoryPackage.MEMORY_MODEL__PROG, oldProg, prog));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MemoryPackage.MEMORY_MODEL__RAM:
				return basicSetRam(null, msgs);
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
			case MemoryPackage.MEMORY_MODEL__RAM:
				return getRam();
			case MemoryPackage.MEMORY_MODEL__PROG:
				if (resolve) return getProg();
				return basicGetProg();
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
			case MemoryPackage.MEMORY_MODEL__RAM:
				setRam((RAMModel)newValue);
				return;
			case MemoryPackage.MEMORY_MODEL__PROG:
				setProg((ProgModel)newValue);
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
			case MemoryPackage.MEMORY_MODEL__RAM:
				setRam((RAMModel)null);
				return;
			case MemoryPackage.MEMORY_MODEL__PROG:
				setProg((ProgModel)null);
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
			case MemoryPackage.MEMORY_MODEL__RAM:
				return ram != null;
			case MemoryPackage.MEMORY_MODEL__PROG:
				return prog != null;
		}
		return super.eIsSet(featureID);
	}

} //MemoryModelImpl
